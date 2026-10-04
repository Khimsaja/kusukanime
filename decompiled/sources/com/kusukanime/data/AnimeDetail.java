package com.kusukanime.data;

import G3.k;
import P3.y;
import P3.z;
import io.ktor.http.LinkHeader;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import v.c0;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\u0099\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\u0013\u00102\u001a\u00020!2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b \u0010\"R\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0014R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001a¨\u00067"}, d2 = {"Lcom/kusukanime/data/AnimeDetail;", "", LinkHeader.Parameters.Title, "", "cover", "sinopsis", "info", "", "genres", "", "episodes", "Lcom/kusukanime/data/EpisodeRef;", "episode", "streams", "Lcom/kusukanime/data/StreamItem;", "redirected_from", "alt_titles", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getCover", "getSinopsis", "getInfo", "()Ljava/util/Map;", "getGenres", "()Ljava/util/List;", "getEpisodes", "getEpisode", "getStreams", "getRedirected_from", "getAlt_titles", "isEpisodeRedirect", "", "()Z", "redirectSlug", "getRedirectSlug", "redirectStreams", "getRedirectStreams", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@k(generateAdapter = true)
/* loaded from: classes.dex */
public final /* data */ class AnimeDetail {
    public static final int $stable = 8;
    private final List<String> alt_titles;
    private final String cover;
    private final String episode;
    private final List<EpisodeRef> episodes;
    private final List<String> genres;
    private final Map<String, String> info;
    private final transient boolean isEpisodeRedirect;
    private final transient String redirectSlug;
    private final transient List<StreamItem> redirectStreams;
    private final String redirected_from;
    private final String sinopsis;
    private final List<StreamItem> streams;
    private final String title;

    public AnimeDetail(String str, String str2, String str3, Map<String, String> map, List<String> list, List<EpisodeRef> list2, String str4, List<StreamItem> list3, String str5, List<String> list4) {
        l.f(LinkHeader.Parameters.Title, str);
        l.f("info", map);
        l.f("genres", list);
        l.f("episodes", list2);
        l.f("streams", list3);
        l.f("alt_titles", list4);
        this.title = str;
        this.cover = str2;
        this.sinopsis = str3;
        this.info = map;
        this.genres = list;
        this.episodes = list2;
        this.episode = str4;
        this.streams = list3;
        this.redirected_from = str5;
        this.alt_titles = list4;
        this.isEpisodeRedirect = l.a(str5, "anime");
        this.redirectSlug = str4 == null ? "" : str4;
        this.redirectStreams = list3;
    }

    public static /* synthetic */ AnimeDetail copy$default(AnimeDetail animeDetail, String str, String str2, String str3, Map map, List list, List list2, String str4, List list3, String str5, List list4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = animeDetail.title;
        }
        if ((i7 & 2) != 0) {
            str2 = animeDetail.cover;
        }
        if ((i7 & 4) != 0) {
            str3 = animeDetail.sinopsis;
        }
        if ((i7 & 8) != 0) {
            map = animeDetail.info;
        }
        if ((i7 & 16) != 0) {
            list = animeDetail.genres;
        }
        if ((i7 & 32) != 0) {
            list2 = animeDetail.episodes;
        }
        if ((i7 & 64) != 0) {
            str4 = animeDetail.episode;
        }
        if ((i7 & 128) != 0) {
            list3 = animeDetail.streams;
        }
        if ((i7 & 256) != 0) {
            str5 = animeDetail.redirected_from;
        }
        if ((i7 & 512) != 0) {
            list4 = animeDetail.alt_titles;
        }
        String str6 = str5;
        List list5 = list4;
        String str7 = str4;
        List list6 = list3;
        List list7 = list;
        List list8 = list2;
        return animeDetail.copy(str, str2, str3, map, list7, list8, str7, list6, str6, list5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<String> component10() {
        return this.alt_titles;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCover() {
        return this.cover;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSinopsis() {
        return this.sinopsis;
    }

    public final Map<String, String> component4() {
        return this.info;
    }

    public final List<String> component5() {
        return this.genres;
    }

    public final List<EpisodeRef> component6() {
        return this.episodes;
    }

    /* renamed from: component7, reason: from getter */
    public final String getEpisode() {
        return this.episode;
    }

    public final List<StreamItem> component8() {
        return this.streams;
    }

    /* renamed from: component9, reason: from getter */
    public final String getRedirected_from() {
        return this.redirected_from;
    }

    public final AnimeDetail copy(String title, String cover, String sinopsis, Map<String, String> info, List<String> genres, List<EpisodeRef> episodes, String episode, List<StreamItem> streams, String redirected_from, List<String> alt_titles) {
        l.f(LinkHeader.Parameters.Title, title);
        l.f("info", info);
        l.f("genres", genres);
        l.f("episodes", episodes);
        l.f("streams", streams);
        l.f("alt_titles", alt_titles);
        return new AnimeDetail(title, cover, sinopsis, info, genres, episodes, episode, streams, redirected_from, alt_titles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimeDetail)) {
            return false;
        }
        AnimeDetail animeDetail = (AnimeDetail) other;
        return l.a(this.title, animeDetail.title) && l.a(this.cover, animeDetail.cover) && l.a(this.sinopsis, animeDetail.sinopsis) && l.a(this.info, animeDetail.info) && l.a(this.genres, animeDetail.genres) && l.a(this.episodes, animeDetail.episodes) && l.a(this.episode, animeDetail.episode) && l.a(this.streams, animeDetail.streams) && l.a(this.redirected_from, animeDetail.redirected_from) && l.a(this.alt_titles, animeDetail.alt_titles);
    }

    public final List<String> getAlt_titles() {
        return this.alt_titles;
    }

    public final String getCover() {
        return this.cover;
    }

    public final String getEpisode() {
        return this.episode;
    }

    public final List<EpisodeRef> getEpisodes() {
        return this.episodes;
    }

    public final List<String> getGenres() {
        return this.genres;
    }

    public final Map<String, String> getInfo() {
        return this.info;
    }

    public final String getRedirectSlug() {
        return this.redirectSlug;
    }

    public final List<StreamItem> getRedirectStreams() {
        return this.redirectStreams;
    }

    public final String getRedirected_from() {
        return this.redirected_from;
    }

    public final String getSinopsis() {
        return this.sinopsis;
    }

    public final List<StreamItem> getStreams() {
        return this.streams;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.cover;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sinopsis;
        int iHashCode3 = (this.episodes.hashCode() + ((this.genres.hashCode() + ((this.info.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str3 = this.episode;
        int iHashCode4 = (this.streams.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.redirected_from;
        return this.alt_titles.hashCode() + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    /* renamed from: isEpisodeRedirect, reason: from getter */
    public final boolean getIsEpisodeRedirect() {
        return this.isEpisodeRedirect;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.cover;
        String str3 = this.sinopsis;
        Map<String, String> map = this.info;
        List<String> list = this.genres;
        List<EpisodeRef> list2 = this.episodes;
        String str4 = this.episode;
        List<StreamItem> list3 = this.streams;
        String str5 = this.redirected_from;
        List<String> list4 = this.alt_titles;
        StringBuilder sbC = c0.c("AnimeDetail(title=", str, ", cover=", str2, ", sinopsis=");
        sbC.append(str3);
        sbC.append(", info=");
        sbC.append(map);
        sbC.append(", genres=");
        sbC.append(list);
        sbC.append(", episodes=");
        sbC.append(list2);
        sbC.append(", episode=");
        sbC.append(str4);
        sbC.append(", streams=");
        sbC.append(list3);
        sbC.append(", redirected_from=");
        sbC.append(str5);
        sbC.append(", alt_titles=");
        sbC.append(list4);
        sbC.append(")");
        return sbC.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AnimeDetail(String str, String str2, String str3, Map map, List list, List list2, String str4, List list3, String str5, List list4, int i7, f fVar) {
        str2 = (i7 & 2) != 0 ? null : str2;
        str3 = (i7 & 4) != 0 ? null : str3;
        map = (i7 & 8) != 0 ? z.f7780k : map;
        int i8 = i7 & 16;
        y yVar = y.f7779k;
        this(str, str2, str3, map, i8 != 0 ? yVar : list, (i7 & 32) != 0 ? yVar : list2, (i7 & 64) != 0 ? null : str4, (i7 & 128) != 0 ? yVar : list3, (i7 & 256) != 0 ? null : str5, (i7 & 512) != 0 ? yVar : list4);
    }
}
