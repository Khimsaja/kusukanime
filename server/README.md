# Kusukanime API (revival backend)

Implements the recovered v0.0.27 wire contract (`../docs/API.md`) so the
current app build works unchanged. Catalog metadata comes from the AniList
public API (titles, covers, synopses, genres, airing schedule); episode
playback entries, when a title has them, are the official streaming pages
AniList lists (returned as embeds). Responses are cached in memory to stay
well inside AniList's rate limits.

## Run

```bash
bun run server.ts        # PORT=13010 HOST=127.0.0.1 by default
```

No dependencies. In production it runs as the `kusukanime-api` systemd
service behind nginx at https://api.kusukanime.id.

## Endpoints

All recovered endpoints are implemented: `list-anime`, `anime/{slug}`,
`episode-detail`, `genres`, `genre-detail`, `schedule`, `az-index`,
`search`, `search/suggest`, `feed`, `feed/count`, `ota-check`.
`POST api/avatar` returns 401 until the Supabase social layer is wired.
Slugs encode the AniList id (`<title-slug>-<id>`); episode slugs are
`al<mediaId>-ep<n>`.
