package com.kusukanime.data

import okhttp3.MultipartBody
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Path
import retrofit2.http.Query

/** Recovered REST contract of api.kusukanime.id (see docs/API.md). */
interface KusuApi {
    @GET("api/list-anime")
    suspend fun listAnime(@Query("page") page: Int = 1): ApiEnvelope<List<AnimeItem>>

    @GET("api/anime/{slug}")
    suspend fun animeDetail(@Path("slug") slug: String): ApiEnvelope<AnimeDetail>

    @GET("api/episode-detail")
    suspend fun episodeDetail(@Query("episode") episode: String): ApiEnvelope<EpisodeStreamDetail>

    @GET("api/genres")
    suspend fun genres(): ApiEnvelope<List<GenreItem>>

    @GET("api/genre-detail")
    suspend fun genreDetail(@Query("genre") genre: String, @Query("page") page: Int = 1): ApiEnvelope<List<AnimeItem>>

    @GET("api/schedule")
    suspend fun schedule(): ApiEnvelope<List<ScheduleDay>>

    @GET("api/az-index")
    suspend fun azIndex(): ApiEnvelope<List<AzItem>>

    @GET("api/search")
    suspend fun search(@Query("q") q: String, @Query("limit") limit: Int = 20): ApiEnvelope<List<SearchItem>>

    @GET("api/search/suggest")
    suspend fun searchSuggest(@Query("q") q: String, @Query("limit") limit: Int = 12): ApiEnvelope<List<SearchSuggestion>>

    @GET("api/feed")
    suspend fun feed(@Query("since") since: Double = 0.0, @Query("limit") limit: Int = 30): ApiEnvelope<List<FeedItem>>

    @GET("api/feed/count")
    suspend fun feedCount(@Query("since") since: Double = 0.0): ApiEnvelope<FeedCount>

    @GET("api/ota-check")
    suspend fun otaCheck(@Query("version_code") versionCode: Int): ApiEnvelope<OtaCheck>

    @Multipart
    @POST("api/avatar")
    suspend fun uploadAvatar(@Header("Authorization") auth: String, @Part file: MultipartBody.Part): ApiEnvelope<AvatarResult>
}

@kotlinx.serialization.Serializable
data class AvatarResult(val url: String? = null)
