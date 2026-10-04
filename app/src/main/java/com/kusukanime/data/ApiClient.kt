package com.kusukanime.data

import com.kusukanime.BuildConfig
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Single entry point to the catalog API. Mirrors the old ApiClient:
 * default base URL is api.kusukanime.id and it can be re-pointed at runtime.
 */
object ApiClient {
    @Volatile
    var baseUrl: String = BuildConfig.API_BASE_URL

    private val json = Json {
        ignoreUnknownKeys = true
        coerceInputValues = true
    }

    @Volatile
    private var api: KusuApi? = null

    fun get(): KusuApi = api ?: synchronized(this) {
        api ?: build().also { api = it }
    }

    fun reset() {
        synchronized(this) { api = null }
    }

    private fun build(): KusuApi {
        val client = OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .build()
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(client)
            .addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
            .build()
            .create(KusuApi::class.java)
    }
}

class AnimeRepository(private val api: KusuApi = ApiClient.get()) {

    suspend fun latestAnime(page: Int = 1): List<AnimeItem> =
        api.listAnime(page).data.orEmpty()

    suspend fun feed(limit: Int = 30): List<FeedItem> =
        api.feed(limit = limit).data.orEmpty()

    suspend fun detail(slug: String): AnimeDetail =
        api.animeDetail(slug).data ?: AnimeDetail(title = slug)

    suspend fun episode(episodeSlug: String): EpisodeStreamDetail =
        api.episodeDetail(episodeSlug).data ?: EpisodeStreamDetail()

    suspend fun genres(): List<GenreItem> = api.genres().data.orEmpty()

    suspend fun genreDetail(slug: String, page: Int = 1): List<AnimeItem> =
        api.genreDetail(slug, page).data.orEmpty()

    suspend fun schedule(): List<ScheduleDay> = api.schedule().data.orEmpty()

    suspend fun azIndex(): List<AzItem> = api.azIndex().data.orEmpty()

    suspend fun search(q: String, limit: Int = 20): List<SearchItem> =
        api.search(q, limit).data.orEmpty()

    suspend fun suggest(q: String, limit: Int = 12): List<SearchSuggestion> =
        api.searchSuggest(q, limit).data.orEmpty()

    suspend fun otaCheck(versionCode: Int): OtaCheck? =
        runCatching { api.otaCheck(versionCode).data }.getOrNull()
}
