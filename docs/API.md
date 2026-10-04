# Kusukanime API contract (recovered from v0.0.27)

Base URL: `https://api.kusukanime.id/` — every response is an envelope:

```json
{ "success": true, "data": { }, "page": 1 }
```

`page` is present on paged list endpoints. Field names below are the wire
(snake_case) names from the app's serializers.

## Endpoints

### `GET api/list-anime?page=1`
`data: AnimeItem[]`
- `AnimeItem`: `slug`, `anime_slug`, `title`, `cover`, `url`, `meta`, `episode_n` (nullable)

### `GET api/anime/{slug}`
`data: AnimeDetail`
- `title`, `cover`, `sinopsis`, `alt_titles[]`, `genres[]`, `info` (map of label → value, e.g. studio/status/year), `episode` (latest episode label), `episodes[]`, `streams[]`, `redirected_from`
- `EpisodeRef`: `n`, `slug`, `title`, `url`
- `StreamItem`: `url`, `server`, `resolution`, `headers` (map), `is_embed`, `is_raw`
- The client follows server redirects: when the episode slug is an alias, the payload carries a redirect to the canonical slug's streams.

### `GET api/episode-detail?episode={slug}`
`data: EpisodeStreamDetail`
- `title`, `episode`, `streams[]` (flat), `qualities[]` (StreamItem per resolution), `servers[]`
- `ServerGroup`: `server`, `direct` (bool), `qualities[]` (StreamItem)

### `GET api/genres` → `GenreItem[]` — `name`, `slug`, `count`
### `GET api/genre-detail?genre={slug}&page=1` → `AnimeItem[]`
### `GET api/schedule` → `ScheduleDay[]` — `day`, `items[]`
- `ScheduleItem`: `slug`, `title`, `cover`, `meta`
### `GET api/az-index` → `AzItem[]` (A–Z grouped index entries)
### `GET api/search?q={query}&limit=20` → `SearchItem[]` — `slug`, `title`
### `GET api/search/suggest?q={query}&limit=12` → `SearchSuggestion[]`
### `GET api/feed?since={epoch}&limit=30` → `FeedItem[]`
- `anime_slug`, `anime_title`, `episode_slug`, `episode_n`, `title`, `cover`, `url`, `first_seen` (epoch seconds, double)
### `GET api/feed/count?since={epoch}` → `FeedCount`
### `GET api/ota-check?version_code={n}` → `OtaCheck`
- `OtaCheck`: `update` (bool), `force` (bool), `latest`
- `OtaInfo`: `id`, `version_code`, `version_name`, `changelog`, `download_url`, `force_update`, `created_at`
### `POST api/avatar` — multipart file + `Authorization` header → `AvatarResult`

## Supabase (social layer)

Tables (from row models): `profiles` (username, avatar, EXP), `bookmarks`,
`history`, `comments`, `likes`, episode vote stats. All access from the client
uses the anon key + the user's JWT after login; RLS must enforce per-user
ownership. EXP is granted through the API/`ExpResult` flow, not client-side
increments.
