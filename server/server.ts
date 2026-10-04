/**
 * Kusukanime API — revival backend.
 *
 * Implements the recovered v0.0.27 wire contract (see docs/API.md) so the
 * existing app build works without changes. Catalog metadata comes from the
 * AniList public API (titles, covers, synopses, airing schedule); episode
 * playback entries, when available, are the official streaming pages AniList
 * lists for a title (returned as embeds).
 *
 * Runtime: Bun, zero dependencies. `bun run server.ts`
 * Env: PORT (default 13010), HOST (default 127.0.0.1)
 */

const PORT = Number(process.env.PORT ?? 13010);
const HOST = process.env.HOST ?? "127.0.0.1";
const ANILIST = "https://graphql.anilist.co";

// ---------------------------------------------------------------------------
// AniList client with a small in-memory cache (AniList is rate limited).
// ---------------------------------------------------------------------------

type CacheEntry = { at: number; data: unknown };
const cache = new Map<string, CacheEntry>();
const TTL = {
  list: 5 * 60_000,
  detail: 30 * 60_000,
  feed: 3 * 60_000,
  schedule: 10 * 60_000,
  genres: 24 * 60 * 60_000,
  search: 10 * 60_000,
};

async function anilist<T>(query: string, variables: Record<string, unknown>, ttl: number): Promise<T> {
  const key = query + "|" + JSON.stringify(variables);
  const hit = cache.get(key);
  if (hit && Date.now() - hit.at < ttl) return hit.data as T;

  let lastError: unknown = null;
  for (let attempt = 0; attempt < 2; attempt++) {
    try {
      const res = await fetch(ANILIST, {
        method: "POST",
        headers: {
          "content-type": "application/json",
          accept: "application/json",
          "user-agent": "KusukanimeAPI/0.1 (revival backend)",
        },
        body: JSON.stringify({ query, variables }),
      });
      if (res.status === 429) {
        await new Promise((r) => setTimeout(r, 1200));
        continue;
      }
      if (!res.ok) throw new Error(`AniList HTTP ${res.status}`);
      const json = (await res.json()) as { data?: T; errors?: unknown };
      if (!json.data) throw new Error("AniList returned no data");
      cache.set(key, { at: Date.now(), data: json.data });
      return json.data;
    } catch (err) {
      lastError = err;
    }
  }
  throw lastError instanceof Error ? lastError : new Error("AniList request failed");
}

// ---------------------------------------------------------------------------
// Mapping helpers (AniList media -> recovered wire shapes)
// ---------------------------------------------------------------------------

type AniMedia = {
  id: number;
  title?: { romaji?: string | null; english?: string | null; native?: string | null };
  coverImage?: { extraLarge?: string | null; large?: string | null } | null;
  description?: string | null;
  genres?: (string | null)[] | null;
  synonyms?: (string | null)[] | null;
  seasonYear?: number | null;
  format?: string | null;
  status?: string | null;
  episodes?: number | null;
  averageScore?: number | null;
  duration?: number | null;
  studios?: { edges?: { node?: { name?: string | null }; isMain?: boolean }[] | null } | null;
  nextAiringEpisode?: { episode?: number | null } | null;
  streamingEpisodes?: { title?: string | null; url?: string | null; site?: string | null }[] | null;
};

const MEDIA_FIELDS = `
  id
  title { romaji english native }
  coverImage { extraLarge large }
  description
  genres
  synonyms
  seasonYear
  format
  status
  episodes
  averageScore
  duration
  studios(isMain: true) { edges { node { name } isMain } }
  nextAiringEpisode { episode }
`;

function slugify(title: string): string {
  return title
    .toLowerCase()
    .replace(/[^a-z0-9]+/g, "-")
    .replace(/^-+|-+$/g, "")
    .slice(0, 80);
}

function mediaTitle(m: AniMedia): string {
  return m.title?.romaji || m.title?.english || m.title?.native || "Tanpa Judul";
}

/** Slug carries the AniList id at the end so detail lookups stay exact. */
function mediaSlug(m: AniMedia): string {
  return `${slugify(mediaTitle(m))}-${m.id}`;
}

function parseMediaId(slug: string): number | null {
  const match = slug.match(/-(\d+)$/);
  return match ? Number(match[1]) : null;
}

function episodeSlug(mediaId: number, n: number): string {
  return `al${mediaId}-ep${n}`;
}

function parseEpisodeSlug(raw: string): { mediaId: number; n: number } | null {
  const match = raw.match(/^al(\d+)-ep(\d+)$/);
  if (match) return { mediaId: Number(match[1]), n: Number(match[2]) };
  const legacy = raw.match(/-(\d+)$/);
  if (legacy) return { mediaId: Number(legacy[1]), n: 1 };
  return null;
}

function cleanDescription(desc?: string | null): string | undefined {
  if (!desc) return undefined;
  return desc
    .replace(/<br\s*\/?>/gi, "\n")
    .replace(/<[^>]+>/g, "")
    .replace(/\n{3,}/g, "\n\n")
    .trim();
}

function latestEpisodeN(m: AniMedia): number | null {
  if (typeof m.episodes === "number" && m.episodes > 0) return m.episodes;
  const next = m.nextAiringEpisode?.episode;
  if (typeof next === "number" && next > 1) return next - 1;
  return null;
}

function toAnimeItem(m: AniMedia) {
  const parts: string[] = [];
  if (m.seasonYear) parts.push(String(m.seasonYear));
  if (m.format) parts.push(m.format.replace(/_/g, " "));
  return {
    slug: mediaSlug(m),
    anime_slug: mediaSlug(m),
    title: mediaTitle(m),
    cover: m.coverImage?.extraLarge ?? m.coverImage?.large ?? null,
    url: null,
    meta: parts.length ? parts.join(" • ") : null,
    episode_n: latestEpisodeN(m),
  };
}

function statusLabel(status?: string | null): string | undefined {
  switch (status) {
    case "FINISHED": return "Tamat";
    case "RELEASING": return "Sedang Tayang";
    case "NOT_YET_RELEASED": return "Belum Tayang";
    case "CANCELLED": return "Dibatalkan";
    default: return undefined;
  }
}

// ---------------------------------------------------------------------------
// Endpoint implementations
// ---------------------------------------------------------------------------

const PAGE_QUERY = `
  query ($page: Int, $perPage: Int, $sort: [MediaSort], $search: String, $genre: String) {
    Page(page: $page, perPage: $perPage) {
      pageInfo { currentPage hasNextPage }
      media(type: ANIME, sort: $sort, search: $search, genre: $genre, isAdult: false) {
        ${MEDIA_FIELDS}
      }
    }
  }
`;

type PageData = { Page: { pageInfo: { currentPage: number }; media: AniMedia[] } };

async function listAnime(page: number) {
  const data = await anilist<PageData>(
    PAGE_QUERY,
    { page, perPage: 24, sort: ["UPDATED_AT_DESC"] },
    TTL.list,
  );
  return { items: data.Page.media.map(toAnimeItem), page: data.Page.pageInfo.currentPage };
}

async function searchAnime(q: string, limit: number) {
  const data = await anilist<PageData>(
    PAGE_QUERY,
    { page: 1, perPage: Math.min(limit, 30), search: q, sort: ["SEARCH_MATCH"] },
    TTL.search,
  );
  return data.Page.media.map((m) => ({
    slug: mediaSlug(m),
    title: mediaTitle(m),
    cover: m.coverImage?.extraLarge ?? m.coverImage?.large ?? null,
    meta: m.seasonYear ? String(m.seasonYear) : null,
  }));
}

const DETAIL_QUERY = `
  query ($id: Int) {
    Media(id: $id, type: ANIME) {
      ${MEDIA_FIELDS}
      streamingEpisodes { title url site }
    }
  }
`;

type DetailData = { Media: AniMedia | null };

async function animeDetail(slug: string) {
  const id = parseMediaId(slug);
  if (id == null) {
    // Fallback: treat the slug as a title search.
    const results = await searchAnime(slug.replace(/-/g, " "), 1);
    if (!results.length) return null;
    return animeDetail(results[0].slug);
  }
  const data = await anilist<DetailData>(DETAIL_QUERY, { id }, TTL.detail);
  const m = data.Media;
  if (!m) return null;

  const episodes: { n: number; slug: string; title: string; url: string | null }[] = [];
  const streamEps = (m.streamingEpisodes ?? []).filter((e) => e?.url);
  if (streamEps.length) {
    streamEps.forEach((ep, i) => {
      episodes.push({
        n: i + 1,
        slug: episodeSlug(m.id, i + 1),
        title: ep.title || `Episode ${i + 1}`,
        url: ep.url ?? null,
      });
    });
  } else {
    const count = latestEpisodeN(m) ?? 0;
    for (let n = 1; n <= count; n++) {
      episodes.push({ n, slug: episodeSlug(m.id, n), title: `Episode ${n}`, url: null });
    }
  }

  const studio = m.studios?.edges?.find((e) => e.isMain)?.node?.name ?? m.studios?.edges?.[0]?.node?.name;
  const info: Record<string, string> = {};
  if (studio) info["Studio"] = studio;
  const st = statusLabel(m.status);
  if (st) info["Status"] = st;
  if (m.seasonYear) info["Tahun"] = String(m.seasonYear);
  if (typeof m.averageScore === "number") info["Skor"] = (m.averageScore / 10).toFixed(1);
  if (m.format) info["Format"] = m.format.replace(/_/g, " ");
  if (m.duration) info["Durasi"] = `${m.duration} mnt/ep`;

  const altTitles = [m.title?.english, m.title?.native, ...(m.synonyms ?? [])]
    .filter((t): t is string => !!t && t !== mediaTitle(m));

  return {
    title: mediaTitle(m),
    cover: m.coverImage?.extraLarge ?? m.coverImage?.large ?? null,
    sinopsis: cleanDescription(m.description) ?? null,
    alt_titles: [...new Set(altTitles)],
    genres: (m.genres ?? []).filter((g): g is string => !!g),
    info,
    episode: latestEpisodeN(m)?.toString() ?? null,
    episodes,
    streams: [],
    redirected_from: null,
  };
}

async function episodeDetail(rawEpisode: string) {
  const parsed = parseEpisodeSlug(rawEpisode);
  if (!parsed) return { title: "", episode: rawEpisode, streams: [], qualities: [], servers: [] };
  const data = await anilist<DetailData>(DETAIL_QUERY, { id: parsed.mediaId }, TTL.detail);
  const m = data.Media;
  const title = m ? mediaTitle(m) : "";
  const streamEps = (m?.streamingEpisodes ?? []).filter((e) => e?.url);
  const ep = streamEps[parsed.n - 1];
  if (!m || !ep) {
    return {
      title,
      episode: `Episode ${parsed.n}`,
      streams: [],
      qualities: [],
      servers: [],
    };
  }
  const item = {
    url: ep.url ? ep.url.replace(/^http:\/\//, "https://") : null,
    server: ep.site ?? "Official",
    resolution: null,
    headers: {},
    is_embed: true,
    is_raw: false,
  };
  return {
    title,
    episode: ep.title || `Episode ${parsed.n}`,
    streams: [item],
    qualities: [item],
    servers: [{ server: item.server, direct: false, qualities: [item] }],
  };
}

const GENRES_QUERY = `query { GenreCollection }`;

let genreNames: string[] = [];

async function genres() {
  const data = await anilist<{ GenreCollection: string[] }>(GENRES_QUERY, {}, TTL.genres);
  genreNames = data.GenreCollection;
  return data.GenreCollection.map((name) => ({
    name,
    slug: slugify(name),
    count: 0,
  }));
}

async function genreDetail(genreSlug: string, page: number) {
  if (!genreNames.length) await genres();
  const name = genreNames.find((g) => slugify(g) === genreSlug) ?? genreSlug;
  const data = await anilist<PageData>(
    PAGE_QUERY,
    { page, perPage: 24, genre: name, sort: ["POPULARITY_DESC"] },
    TTL.list,
  );
  return { items: data.Page.media.map(toAnimeItem), page: data.Page.pageInfo.currentPage };
}

const SCHEDULE_QUERY = `
  query ($from: Int, $to: Int, $page: Int) {
    Page(page: $page, perPage: 50) {
      pageInfo { hasNextPage }
      airingSchedules(airingAt_greater: $from, airingAt_lesser: $to, sort: TIME) {
        airingAt
        episode
        media { ${MEDIA_FIELDS} }
      }
    }
  }
`;

type ScheduleData = {
  Page: {
    pageInfo: { hasNextPage: boolean };
    airingSchedules: { airingAt: number; episode: number; media: AniMedia }[];
  };
};

const DAY_NAMES = ["Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"];
const DAY_ORDER = ["Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"];

async function schedule() {
  // Current week in Asia/Jakarta.
  const now = new Date();
  const jakartaNow = new Date(now.toLocaleString("en-US", { timeZone: "Asia/Jakarta" }));
  const dayIdx = (jakartaNow.getDay() + 6) % 7; // Monday = 0
  const monday = new Date(jakartaNow);
  monday.setDate(jakartaNow.getDate() - dayIdx);
  monday.setHours(0, 0, 0, 0);
  // Convert the Jakarta wall-clock Monday back to a real epoch (WIB = UTC+7).
  const fromEpoch = Math.floor(monday.getTime() / 1000) - 7 * 3600 + (now.getTimezoneOffset() * 60);
  const toEpoch = fromEpoch + 7 * 24 * 3600;

  const entries: { airingAt: number; episode: number; media: AniMedia }[] = [];
  let page = 1;
  for (; page <= 6; page++) {
    const data = await anilist<ScheduleData>(
      SCHEDULE_QUERY,
      { from: fromEpoch, to: toEpoch, page },
      TTL.schedule,
    );
    entries.push(...data.Page.airingSchedules);
    if (!data.Page.pageInfo.hasNextPage) break;
  }

  const byDay = new Map<string, { slug: string; title: string; cover: string | null; meta: string | null }[]>();
  for (const e of entries) {
    const d = new Date(e.airingAt * 1000);
    const parts = new Intl.DateTimeFormat("id-ID", {
      timeZone: "Asia/Jakarta",
      weekday: "long",
      hour: "2-digit",
      minute: "2-digit",
      hour12: false,
    }).formatToParts(d);
    const weekday = parts.find((p) => p.type === "weekday")?.value ?? "";
    const hour = parts.find((p) => p.type === "hour")?.value ?? "";
    const minute = parts.find((p) => p.type === "minute")?.value ?? "";
    const dayName = DAY_NAMES.find((n) => weekday.toLowerCase().startsWith(n.toLowerCase().slice(0, 3))) ?? weekday;
    const list = byDay.get(dayName) ?? [];
    list.push({
      slug: mediaSlug(e.media),
      title: mediaTitle(e.media),
      cover: e.media.coverImage?.extraLarge ?? e.media.coverImage?.large ?? null,
      meta: `Ep ${e.episode} • ${hour}.${minute} WIB`,
    });
    byDay.set(dayName, list);
  }

  return DAY_ORDER.filter((d) => byDay.has(d)).map((day) => ({ day, items: byDay.get(day)! }));
}

async function azIndex() {
  const data = await anilist<PageData>(
    PAGE_QUERY,
    { page: 1, perPage: 50, sort: ["TITLE_ROMAJI"] },
    TTL.detail,
  );
  return data.Page.media.map((m) => ({
    slug: mediaSlug(m),
    title: mediaTitle(m),
    cover: m.coverImage?.extraLarge ?? m.coverImage?.large ?? null,
    meta: m.seasonYear ? String(m.seasonYear) : null,
  }));
}

const FEED_QUERY = `
  query ($since: Int, $limit: Int, $nowTs: Int) {
    Page(page: 1, perPage: $limit) {
      pageInfo { total }
      airingSchedules(airingAt_greater: $since, airingAt_lesser: $nowTs, sort: TIME_DESC) {
        airingAt
        episode
        media { ${MEDIA_FIELDS} }
      }
    }
  }
`;

type FeedData = ScheduleData;

async function feed(since: number, limit: number) {
  const data = await anilist<FeedData & { Page: { pageInfo: { total: number } } }>(
    FEED_QUERY,
    { since: Math.floor(since), limit: Math.min(limit, 50), nowTs: Math.floor(Date.now() / 1000) },
    TTL.feed,
  );
  return data.Page.airingSchedules.map((e) => ({
    anime_slug: mediaSlug(e.media),
    anime_title: mediaTitle(e.media),
    episode_slug: episodeSlug(e.media.id, e.episode),
    episode_n: e.episode,
    title: `${mediaTitle(e.media)} Episode ${e.episode}`,
    cover: e.media.coverImage?.extraLarge ?? e.media.coverImage?.large ?? null,
    url: null,
    first_seen: e.airingAt,
  }));
}

async function feedCount(since: number) {
  const items = await feed(since, 50);
  return { count: items.length };
}

// ---------------------------------------------------------------------------
// HTTP plumbing (recovered envelope: { success, data, page? })
// ---------------------------------------------------------------------------

function envelope(data: unknown, page?: number) {
  const body: Record<string, unknown> = { success: true, data };
  if (page !== undefined) body.page = page;
  return Response.json(body);
}

function fail(message: string, status = 200) {
  return Response.json({ success: false, data: null, error: message }, { status });
}

const server = Bun.serve({
  hostname: HOST,
  port: PORT,
  async fetch(req) {
    const url = new URL(req.url);
    const path = url.pathname.replace(/\/+$/, "") || "/";

    try {
      if (path === "/" || path === "/health") {
        return Response.json({ success: true, data: { service: "kusukanime-api", ok: true } });
      }

      if (path === "/api/list-anime") {
        const page = Number(url.searchParams.get("page") ?? 1) || 1;
        const { items, page: p } = await listAnime(page);
        return envelope(items, p);
      }

      const detailMatch = path.match(/^\/api\/anime\/(.+)$/);
      if (detailMatch) {
        const detail = await animeDetail(decodeURIComponent(detailMatch[1]));
        if (!detail) return fail("anime not found", 404);
        return envelope(detail);
      }

      if (path === "/api/episode-detail") {
        const ep = url.searchParams.get("episode") ?? "";
        return envelope(await episodeDetail(ep));
      }

      if (path === "/api/genres") return envelope(await genres());

      if (path === "/api/genre-detail") {
        const genre = url.searchParams.get("genre") ?? "";
        const page = Number(url.searchParams.get("page") ?? 1) || 1;
        const { items, page: p } = await genreDetail(genre, page);
        return envelope(items, p);
      }

      if (path === "/api/schedule") return envelope(await schedule());

      if (path === "/api/az-index") return envelope(await azIndex());

      if (path === "/api/search") {
        const q = url.searchParams.get("q") ?? "";
        const limit = Number(url.searchParams.get("limit") ?? 20) || 20;
        if (!q) return envelope([]);
        return envelope(await searchAnime(q, limit));
      }

      if (path === "/api/search/suggest") {
        const q = url.searchParams.get("q") ?? "";
        const limit = Number(url.searchParams.get("limit") ?? 12) || 12;
        if (!q) return envelope([]);
        const results = await searchAnime(q, limit);
        return envelope(results.map((r) => ({ slug: r.slug, title: r.title })));
      }

      if (path === "/api/feed") {
        const since = Number(url.searchParams.get("since") ?? 0) || 0;
        const limit = Number(url.searchParams.get("limit") ?? 30) || 30;
        return envelope(await feed(since, limit));
      }

      if (path === "/api/feed/count") {
        const since = Number(url.searchParams.get("since") ?? 0) || 0;
        return envelope(await feedCount(since));
      }

      if (path === "/api/ota-check") {
        // No published packages yet; the client treats update=false as current.
        return envelope({ update: false, force: false, latest: null });
      }

      if (path === "/api/avatar") {
        return fail("avatar upload needs the Supabase session (not wired yet)", 401);
      }

      return fail("not found", 404);
    } catch (err) {
      const message = err instanceof Error ? err.message : "internal error";
      return fail(message, 502);
    }
  },
});

console.log(`kusukanime-api listening on http://${HOST}:${server.port}`);
