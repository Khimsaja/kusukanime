# Kusukanime — Component Inventory (recovered from v0.0.27 APK)

Dissection of `kusukanime-0.0.27.apk` (com.kusukanime, versionCode 30, minSdk 24,
targetSdk 35) on 2026-10-04. The app is a single-activity Jetpack Compose app.
Kotlin metadata survived in `com.kusukanime.data` (kept unobfuscated for
serialization); the UI composables were R8-renamed (packages `o3`, `D3`, …), so UI
structure below is reconstructed from the data layer, manifest, and string table.

## App shell

- `KusuApp` — Application class; initializes Supabase (`SbClient`), Coil image
  loader (`ImgLoader`), crash/diagnostic log (`CrashLog`), OTA check.
- `MainActivity` — single `ComponentActivity`. Handles the
  `kusukanime://login-callback` OAuth deep link (tokens are masked before being
  written to diagnostics — good hygiene), reads `dark` pref from
  `kusu_settings` SharedPreferences (default dark = true).
- Deep links: `kusukanime://anime` (content), `kusukanime://login-callback`
  (Supabase OAuth).
- Exported surface: only `MainActivity`. `FileProvider`
  (`com.kusukanime.provider`) not exported.

## Navigation / features (from string table + data layer)

- **Beranda (Home)** — feed of latest episodes (`FeedItem`, "Lanjutkan" =
  continue watching), paged anime list (`list-anime`).
- **Detail anime** — `AnimeDetail`: cover, synopsis, genres, info map,
  episode list (`EpisodeRef`), direct `streams`, redirect resolution
  (`isEpisodeRedirect` / `redirectSlug` for slug aliases).
- **Player** — `EpisodeStreamDetail`: `servers` (`ServerGroup`: server name,
  `direct` flag, `qualities`), `StreamItem` (url, server, resolution, custom
  `headers`, `is_embed` vs `is_raw`). Media3/ExoPlayer playback, `VideoCache`
  for stream caching, `PlaybackPrefs`.
- **Jadwal (Schedule)** — `ScheduleDay`/`ScheduleItem` per weekday.
- **A–Z index** — `AzItem` list.
- **Genre** — `GenreItem` (name, slug, count) + paged `genre-detail`.
- **Search** — `search` (paged results) + `search/suggest`, `SearchHistory`.
- **Bookmark, Riwayat (History)** — Supabase rows (`BookmarkRow`, `HistoryRow`).
- **Social** — comments (`CommentRow`, `UserRepo.addComment`), likes
  (`LikeRow`), episode votes (`EpisodeVoteStats`, `voteEpisode`), profiles
  (`ProfileRow`, username rules via `UsernameException`), EXP/levels
  (`ExpResult`), avatar upload (multipart `api/avatar`).
- **Auth** — Supabase Auth (email + Google via `GoogleAuth`), `SessionGate`
  (ensures a session, anonymous fallback), `SessionImport` (imports session
  from deep link with fallback), profile creation gated by username.
- **OTA self-update** — `api/ota-check?version_code=` → `OtaCheck`
  (`update`, `force`, `latest: OtaInfo{version_code, version_name, changelog,
  download_url, force_update}`); installs via FileProvider +
  `REQUEST_INSTALL_PACKAGES`.
- **Settings** — `SocialPrefs`, `PlaybackPrefs`, dark mode, base-URL override
  (`ApiClient.setBaseUrl` exists — the API host is runtime-switchable).

## Data layer — REST API (`KusuApi`, Retrofit + OkHttp + kotlinx.serialization)

Base URL: `https://api.kusukanime.id/` (default; runtime-switchable).
Timeouts: 15 s connect, 25 s read. All responses wrapped in
`ApiEnvelope<T> { success, data, page }`.

| Endpoint | Returns |
|---|---|
| `GET api/list-anime?page=1` | `List<AnimeItem>` |
| `GET api/anime/{slug}` | `AnimeDetail` |
| `GET api/episode-detail?episode=` | `EpisodeStreamDetail` |
| `GET api/genres` | `List<GenreItem>` |
| `GET api/genre-detail?genre=&page=1` | `List<AnimeItem>` |
| `GET api/schedule` | `List<ScheduleDay>` |
| `GET api/az-index` | `List<AzItem>` |
| `GET api/search?q=&limit=20` | `List<SearchItem>` |
| `GET api/search/suggest?q=&limit=12` | `List<SearchSuggestion>` |
| `GET api/feed?since=&limit=30` | `List<FeedItem>` |
| `GET api/feed/count?since=` | `FeedCount` |
| `GET api/ota-check?version_code=` | `OtaCheck` |
| `POST api/avatar` (multipart, `Authorization` header) | `AvatarResult` |

DTO fields are listed in `API.md`. Models use snake_case `@SerialName`s and the
client is built with `ignoreUnknownKeys = true`.

## Data layer — Supabase (`SbClient`, supabase-kt)

Project `auteuspvcgrrbygtuvro.supabase.co`; only the **anon** key is embedded
(public client key — access control must live in RLS policies).
Tables/models: `profiles` (`ProfileRow`), `bookmarks`, `history`, `comments`,
`likes`, `episode votes` (stats in `EpisodeVoteStats`), EXP ledger (`ExpResult`).
Auth session persistence via multiplatform-settings; GoTrue session import from
the OAuth deep link. Avatar images in Supabase Storage + own API endpoint.

## Build / release state (from the APK audit)

- Signed with the **Android Debug** certificate; no R8 obfuscation on the data
  package (UI packages renamed). `allowBackup=false`, no cleartext traffic
  (targetSdk 35 default), `extractNativeLibs=false`.
- Permissions: INTERNET, ACCESS_NETWORK_STATE, REQUEST_INSTALL_PACKAGES,
  FOREGROUND_SERVICE (no `<service>` declared — likely leftover).
- Stack: Kotlin 2.2, Compose, Retrofit/OkHttp, Coil, Media3, supabase-kt,
  DataStore, russhwolf multiplatform-settings.

## Status at dissection time

- Supabase project responds (REST root 401 without key = alive).
- `api.kusukanime.id` unreachable from the analysis sandbox (connect timeout).
