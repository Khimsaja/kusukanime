# Kusukanime

Anime streaming app for Android (Kotlin + Jetpack Compose). Home feed, schedule,
A–Z index, genre browsing, search with suggestions, episode streaming with
multi-server/multi-quality sources, bookmarks & history, comments, likes,
episode votes, profiles with EXP levels — backed by a custom REST API
(`api.kusukanime.id`) and Supabase for auth/social data.

> This repo was rebuilt from the last shipped build (v0.0.27) to revive the
> project. `decompiled/` holds the recovered code from that build for
> reference; the component-by-component breakdown lives in
> [`docs/COMPONENTS.md`](docs/COMPONENTS.md) and the API contract in
> [`docs/API.md`](docs/API.md). New development happens in `app/`.

## Stack

- Kotlin, Jetpack Compose (single activity), Material 3
- Retrofit/OkHttp + kotlinx.serialization (`KusuApi`)
- Supabase (auth, profiles, bookmarks, history, comments, votes) — client uses
  the public anon key; access control lives in RLS policies
- Media3/ExoPlayer playback with per-server custom headers, Coil images

## Notes from the v0.0.27 audit

- The shipped APK was debug-signed; new builds use a proper release keystore.
- The old data layer is preserved as reference in `decompiled/`. UI
  composables in the old build were R8-renamed, so the new UI is written fresh
  (white/light-blue glassmorphism, Anime-XD-style floating glass nav) on top of
  the same API contract.
