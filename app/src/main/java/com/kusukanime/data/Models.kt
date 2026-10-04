package com.kusukanime.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** Wire envelope used by every api.kusukanime.id endpoint. */
@Serializable
data class ApiEnvelope<T>(
    val success: Boolean = false,
    val data: T? = null,
    val page: Int? = null,
)

@Serializable
data class AnimeItem(
    val slug: String = "",
    @SerialName("anime_slug") val animeSlug: String? = null,
    val title: String = "",
    val cover: String? = null,
    val url: String? = null,
    val meta: String? = null,
    @SerialName("episode_n") val episodeN: Int? = null,
) {
    val stableSlug: String get() = animeSlug?.takeIf { it.isNotBlank() } ?: slug
}

@Serializable
data class EpisodeRef(
    val n: Int = 0,
    val slug: String = "",
    val title: String = "",
    val url: String? = null,
)

@Serializable
data class StreamItem(
    val url: String? = null,
    val server: String? = null,
    val resolution: String? = null,
    val headers: Map<String, String> = emptyMap(),
    @SerialName("is_embed") val isEmbed: Boolean = false,
    @SerialName("is_raw") val isRaw: Boolean = false,
)

@Serializable
data class AnimeDetail(
    val title: String = "",
    val cover: String? = null,
    val sinopsis: String? = null,
    @SerialName("alt_titles") val altTitles: List<String> = emptyList(),
    val genres: List<String> = emptyList(),
    val info: Map<String, String> = emptyMap(),
    val episode: String? = null,
    val episodes: List<EpisodeRef> = emptyList(),
    val streams: List<StreamItem> = emptyList(),
    @SerialName("redirected_from") val redirectedFrom: String? = null,
)

@Serializable
data class ServerGroup(
    val server: String = "",
    val direct: Boolean = false,
    val qualities: List<StreamItem> = emptyList(),
)

@Serializable
data class EpisodeStreamDetail(
    val title: String = "",
    val episode: String = "",
    val streams: List<StreamItem> = emptyList(),
    val qualities: List<StreamItem> = emptyList(),
    val servers: List<ServerGroup> = emptyList(),
)

@Serializable
data class GenreItem(
    val name: String = "",
    val slug: String = "",
    val count: Int = 0,
)

@Serializable
data class ScheduleItem(
    val slug: String = "",
    val title: String = "",
    val cover: String? = null,
    val meta: String? = null,
)

@Serializable
data class ScheduleDay(
    val day: String = "",
    val items: List<ScheduleItem> = emptyList(),
)

@Serializable
data class AzItem(
    val slug: String = "",
    val title: String = "",
    val cover: String? = null,
    val meta: String? = null,
)

@Serializable
data class SearchItem(
    val slug: String = "",
    val title: String = "",
    val cover: String? = null,
    val meta: String? = null,
)

@Serializable
data class SearchSuggestion(
    val slug: String = "",
    val title: String = "",
)

@Serializable
data class FeedItem(
    @SerialName("anime_slug") val animeSlug: String = "",
    @SerialName("anime_title") val animeTitle: String = "",
    @SerialName("episode_slug") val episodeSlug: String = "",
    @SerialName("episode_n") val episodeN: Int = 0,
    val title: String = "",
    val cover: String? = null,
    val url: String? = null,
    @SerialName("first_seen") val firstSeen: Double = 0.0,
)

@Serializable
data class FeedCount(val count: Int = 0)

@Serializable
data class OtaInfo(
    val id: Long = 0,
    @SerialName("version_code") val versionCode: Int = 0,
    @SerialName("version_name") val versionName: String = "",
    val changelog: String? = null,
    @SerialName("download_url") val downloadUrl: String? = null,
    @SerialName("force_update") val forceUpdate: Boolean = false,
    @SerialName("created_at") val createdAt: String? = null,
)

@Serializable
data class OtaCheck(
    val update: Boolean = false,
    val force: Boolean = false,
    val latest: OtaInfo? = null,
)
