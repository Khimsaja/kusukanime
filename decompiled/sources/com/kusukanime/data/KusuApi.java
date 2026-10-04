package com.kusukanime.data;

import F6.f;
import F6.i;
import F6.l;
import F6.o;
import F6.q;
import F6.s;
import F6.t;
import S3.c;
import f6.C0926x;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0010\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u0003H§@¢\u0006\u0002\u0010\u0013J.\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0015\u001a\u00020\f2\b\b\u0003\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\u0016J\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u0003H§@¢\u0006\u0002\u0010\u0013J\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00040\u0003H§@¢\u0006\u0002\u0010\u0013J.\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00040\u00032\b\b\u0001\u0010\u001d\u001a\u00020\f2\b\b\u0003\u0010\u001e\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\u0016J.\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00040\u00032\b\b\u0001\u0010\u001d\u001a\u00020\f2\b\b\u0003\u0010\u001e\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\u0016J.\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00040\u00032\b\b\u0003\u0010#\u001a\u00020$2\b\b\u0003\u0010\u001e\u001a\u00020\u0007H§@¢\u0006\u0002\u0010%J\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00032\b\b\u0003\u0010#\u001a\u00020$H§@¢\u0006\u0002\u0010(J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00032\b\b\u0001\u0010+\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ(\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00032\b\b\u0001\u0010.\u001a\u00020\f2\b\b\u0001\u0010/\u001a\u000200H§@¢\u0006\u0002\u00101¨\u00062À\u0006\u0003"}, d2 = {"Lcom/kusukanime/data/KusuApi;", "", "listAnime", "Lcom/kusukanime/data/ApiEnvelope;", "", "Lcom/kusukanime/data/AnimeItem;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animeDetail", "Lcom/kusukanime/data/AnimeDetail;", "slug", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "episodeDetail", "Lcom/kusukanime/data/EpisodeStreamDetail;", "episode", "genres", "Lcom/kusukanime/data/GenreItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "genreDetail", "genre", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "schedule", "Lcom/kusukanime/data/ScheduleDay;", "azIndex", "Lcom/kusukanime/data/AzItem;", "search", "Lcom/kusukanime/data/SearchItem;", "q", "limit", "searchSuggest", "Lcom/kusukanime/data/SearchSuggestion;", "feed", "Lcom/kusukanime/data/FeedItem;", "since", "", "(DILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feedCount", "Lcom/kusukanime/data/FeedCount;", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "otaCheck", "Lcom/kusukanime/data/OtaCheck;", "versionCode", "uploadAvatar", "Lcom/kusukanime/data/AvatarResult;", "auth", "file", "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface KusuApi {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object feed$default(KusuApi kusuApi, double d4, int i7, c cVar, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: feed");
        }
        if ((i8 & 1) != 0) {
            d4 = 0.0d;
        }
        if ((i8 & 2) != 0) {
            i7 = 30;
        }
        return kusuApi.feed(d4, i7, cVar);
    }

    static /* synthetic */ Object feedCount$default(KusuApi kusuApi, double d4, c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: feedCount");
        }
        if ((i7 & 1) != 0) {
            d4 = 0.0d;
        }
        return kusuApi.feedCount(d4, cVar);
    }

    static /* synthetic */ Object genreDetail$default(KusuApi kusuApi, String str, int i7, c cVar, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: genreDetail");
        }
        if ((i8 & 2) != 0) {
            i7 = 1;
        }
        return kusuApi.genreDetail(str, i7, cVar);
    }

    static /* synthetic */ Object listAnime$default(KusuApi kusuApi, int i7, c cVar, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listAnime");
        }
        if ((i8 & 1) != 0) {
            i7 = 1;
        }
        return kusuApi.listAnime(i7, cVar);
    }

    static /* synthetic */ Object search$default(KusuApi kusuApi, String str, int i7, c cVar, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: search");
        }
        if ((i8 & 2) != 0) {
            i7 = 20;
        }
        return kusuApi.search(str, i7, cVar);
    }

    static /* synthetic */ Object searchSuggest$default(KusuApi kusuApi, String str, int i7, c cVar, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchSuggest");
        }
        if ((i8 & 2) != 0) {
            i7 = 12;
        }
        return kusuApi.searchSuggest(str, i7, cVar);
    }

    @f("api/anime/{slug}")
    Object animeDetail(@s("slug") String str, c<? super ApiEnvelope<AnimeDetail>> cVar);

    @f("api/az-index")
    Object azIndex(c<? super ApiEnvelope<List<AzItem>>> cVar);

    @f("api/episode-detail")
    Object episodeDetail(@t("episode") String str, c<? super ApiEnvelope<EpisodeStreamDetail>> cVar);

    @f("api/feed")
    Object feed(@t("since") double d4, @t("limit") int i7, c<? super ApiEnvelope<List<FeedItem>>> cVar);

    @f("api/feed/count")
    Object feedCount(@t("since") double d4, c<? super ApiEnvelope<FeedCount>> cVar);

    @f("api/genre-detail")
    Object genreDetail(@t("genre") String str, @t("page") int i7, c<? super ApiEnvelope<List<AnimeItem>>> cVar);

    @f("api/genres")
    Object genres(c<? super ApiEnvelope<List<GenreItem>>> cVar);

    @f("api/list-anime")
    Object listAnime(@t("page") int i7, c<? super ApiEnvelope<List<AnimeItem>>> cVar);

    @f("api/ota-check")
    Object otaCheck(@t("version_code") int i7, c<? super ApiEnvelope<OtaCheck>> cVar);

    @f("api/schedule")
    Object schedule(c<? super ApiEnvelope<List<ScheduleDay>>> cVar);

    @f("api/search")
    Object search(@t("q") String str, @t("limit") int i7, c<? super ApiEnvelope<List<SearchItem>>> cVar);

    @f("api/search/suggest")
    Object searchSuggest(@t("q") String str, @t("limit") int i7, c<? super ApiEnvelope<List<SearchSuggestion>>> cVar);

    @l
    @o("api/avatar")
    Object uploadAvatar(@i("Authorization") String str, @q C0926x c0926x, c<? super ApiEnvelope<AvatarResult>> cVar);
}
