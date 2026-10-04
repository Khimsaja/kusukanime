package com.kusukanime.data

/**
 * Offline/demo catalog used when api.kusukanime.id can't be reached, so the
 * UI stays reviewable. Posters are rendered as gradient art in the UI layer.
 */
object DemoData {
    val latest = listOf(
        AnimeItem(slug = "frieren-beyond-journeys-end", animeSlug = "frieren-beyond-journeys-end", title = "Frieren: Beyond Journey's End", meta = "2023 • Fantasy", episodeN = 28),
        AnimeItem(slug = "solo-leveling-s2", animeSlug = "solo-leveling-s2", title = "Solo Leveling Season 2", meta = "2025 • Action", episodeN = 13),
        AnimeItem(slug = "kaiju-no-8", animeSlug = "kaiju-no-8", title = "Kaiju No. 8", meta = "2024 • Sci-Fi", episodeN = 12),
        AnimeItem(slug = "dandadan", animeSlug = "dandadan", title = "Dandadan", meta = "2024 • Supernatural", episodeN = 12),
        AnimeItem(slug = "re-zero-s3", animeSlug = "re-zero-s3", title = "Re:Zero Season 3", meta = "2024 • Isekai", episodeN = 16),
        AnimeItem(slug = "blue-lock-s2", animeSlug = "blue-lock-s2", title = "Blue Lock Season 2", meta = "2024 • Sports", episodeN = 14),
    )

    val feed = listOf(
        FeedItem(animeSlug = "solo-leveling-s2", animeTitle = "Solo Leveling Season 2", episodeSlug = "solo-leveling-s2-ep-13", episodeN = 13, title = "Solo Leveling Season 2 Episode 13"),
        FeedItem(animeSlug = "dandadan", animeTitle = "Dandadan", episodeSlug = "dandadan-ep-12", episodeN = 12, title = "Dandadan Episode 12"),
        FeedItem(animeSlug = "frieren-beyond-journeys-end", animeTitle = "Frieren: Beyond Journey's End", episodeSlug = "frieren-ep-28", episodeN = 28, title = "Frieren Episode 28"),
        FeedItem(animeSlug = "kaiju-no-8", animeTitle = "Kaiju No. 8", episodeSlug = "kaiju-no-8-ep-12", episodeN = 12, title = "Kaiju No. 8 Episode 12"),
        FeedItem(animeSlug = "blue-lock-s2", animeTitle = "Blue Lock Season 2", episodeSlug = "blue-lock-s2-ep-14", episodeN = 14, title = "Blue Lock Season 2 Episode 14"),
    )

    fun detail(slug: String): AnimeDetail {
        val title = latest.firstOrNull { it.slug == slug }?.title ?: "Frieren: Beyond Journey's End"
        return AnimeDetail(
            title = title,
            sinopsis = "Demo sinopsis — backend api.kusukanime.id sedang tidak terjangkau, jadi layar ini dirender dari data contoh. Hidupkan lagi API-nya dan seluruh konten asli otomatis tampil di sini.",
            genres = listOf("Fantasy", "Adventure", "Drama"),
            info = mapOf("Status" to "Completed", "Studio" to "Madhouse", "Tahun" to "2023", "Skor" to "9.3"),
            episode = "28",
            episodes = (1..28).map { EpisodeRef(n = it, slug = "demo-ep-$it", title = "Episode $it") },
        )
    }

    val schedule = listOf(
        ScheduleDay("Senin", listOf(
            ScheduleItem(slug = "dandadan", title = "Dandadan", meta = "23:30"),
            ScheduleItem(slug = "kaiju-no-8", title = "Kaiju No. 8", meta = "22:00"),
        )),
        ScheduleDay("Selasa", listOf(
            ScheduleItem(slug = "re-zero-s3", title = "Re:Zero Season 3", meta = "21:30"),
        )),
        ScheduleDay("Rabu", listOf(
            ScheduleItem(slug = "frieren-beyond-journeys-end", title = "Frieren", meta = "23:00"),
            ScheduleItem(slug = "solo-leveling-s2", title = "Solo Leveling S2", meta = "23:59"),
        )),
    )
}
