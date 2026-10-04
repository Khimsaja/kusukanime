package com.kusukanime.data;

import G3.k;
import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import p.AbstractC1755i;
import v.c0;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J[\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0007HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lcom/kusukanime/data/FeedItem;", "", "episode_slug", "", "anime_slug", "anime_title", "episode_n", "", LinkHeader.Parameters.Title, "cover", "url", "first_seen", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "getEpisode_slug", "()Ljava/lang/String;", "getAnime_slug", "getAnime_title", "getEpisode_n", "()I", "getTitle", "getCover", "getUrl", "getFirst_seen", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@k(generateAdapter = true)
/* loaded from: classes.dex */
public final /* data */ class FeedItem {
    public static final int $stable = 0;
    private final String anime_slug;
    private final String anime_title;
    private final String cover;
    private final int episode_n;
    private final String episode_slug;
    private final double first_seen;
    private final String title;
    private final String url;

    public FeedItem() {
        this(null, null, null, 0, null, null, null, 0.0d, 255, null);
    }

    public static /* synthetic */ FeedItem copy$default(FeedItem feedItem, String str, String str2, String str3, int i7, String str4, String str5, String str6, double d4, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = feedItem.episode_slug;
        }
        if ((i8 & 2) != 0) {
            str2 = feedItem.anime_slug;
        }
        if ((i8 & 4) != 0) {
            str3 = feedItem.anime_title;
        }
        if ((i8 & 8) != 0) {
            i7 = feedItem.episode_n;
        }
        if ((i8 & 16) != 0) {
            str4 = feedItem.title;
        }
        if ((i8 & 32) != 0) {
            str5 = feedItem.cover;
        }
        if ((i8 & 64) != 0) {
            str6 = feedItem.url;
        }
        if ((i8 & 128) != 0) {
            d4 = feedItem.first_seen;
        }
        double d6 = d4;
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str3;
        return feedItem.copy(str, str2, str10, i7, str9, str7, str8, d6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEpisode_slug() {
        return this.episode_slug;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAnime_slug() {
        return this.anime_slug;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAnime_title() {
        return this.anime_title;
    }

    /* renamed from: component4, reason: from getter */
    public final int getEpisode_n() {
        return this.episode_n;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCover() {
        return this.cover;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component8, reason: from getter */
    public final double getFirst_seen() {
        return this.first_seen;
    }

    public final FeedItem copy(String episode_slug, String anime_slug, String anime_title, int episode_n, String title, String cover, String url, double first_seen) {
        l.f("episode_slug", episode_slug);
        l.f("anime_slug", anime_slug);
        l.f("anime_title", anime_title);
        l.f(LinkHeader.Parameters.Title, title);
        l.f("url", url);
        return new FeedItem(episode_slug, anime_slug, anime_title, episode_n, title, cover, url, first_seen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedItem)) {
            return false;
        }
        FeedItem feedItem = (FeedItem) other;
        return l.a(this.episode_slug, feedItem.episode_slug) && l.a(this.anime_slug, feedItem.anime_slug) && l.a(this.anime_title, feedItem.anime_title) && this.episode_n == feedItem.episode_n && l.a(this.title, feedItem.title) && l.a(this.cover, feedItem.cover) && l.a(this.url, feedItem.url) && Double.compare(this.first_seen, feedItem.first_seen) == 0;
    }

    public final String getAnime_slug() {
        return this.anime_slug;
    }

    public final String getAnime_title() {
        return this.anime_title;
    }

    public final String getCover() {
        return this.cover;
    }

    public final int getEpisode_n() {
        return this.episode_n;
    }

    public final String getEpisode_slug() {
        return this.episode_slug;
    }

    public final double getFirst_seen() {
        return this.first_seen;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iB = A6.b.b(this.title, AbstractC1755i.a(this.episode_n, A6.b.b(this.anime_title, A6.b.b(this.anime_slug, this.episode_slug.hashCode() * 31, 31), 31), 31), 31);
        String str = this.cover;
        return Double.hashCode(this.first_seen) + A6.b.b(this.url, (iB + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public String toString() {
        String str = this.episode_slug;
        String str2 = this.anime_slug;
        String str3 = this.anime_title;
        int i7 = this.episode_n;
        String str4 = this.title;
        String str5 = this.cover;
        String str6 = this.url;
        double d4 = this.first_seen;
        StringBuilder sbC = c0.c("FeedItem(episode_slug=", str, ", anime_slug=", str2, ", anime_title=");
        sbC.append(str3);
        sbC.append(", episode_n=");
        sbC.append(i7);
        sbC.append(", title=");
        sbC.append(str4);
        sbC.append(", cover=");
        sbC.append(str5);
        sbC.append(", url=");
        sbC.append(str6);
        sbC.append(", first_seen=");
        sbC.append(d4);
        sbC.append(")");
        return sbC.toString();
    }

    public FeedItem(String str, String str2, String str3, int i7, String str4, String str5, String str6, double d4) {
        l.f("episode_slug", str);
        l.f("anime_slug", str2);
        l.f("anime_title", str3);
        l.f(LinkHeader.Parameters.Title, str4);
        l.f("url", str6);
        this.episode_slug = str;
        this.anime_slug = str2;
        this.anime_title = str3;
        this.episode_n = i7;
        this.title = str4;
        this.cover = str5;
        this.url = str6;
        this.first_seen = d4;
    }

    public /* synthetic */ FeedItem(String str, String str2, String str3, int i7, String str4, String str5, String str6, double d4, int i8, f fVar) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) != 0 ? "" : str3, (i8 & 8) != 0 ? 0 : i7, (i8 & 16) != 0 ? "" : str4, (i8 & 32) != 0 ? null : str5, (i8 & 64) != 0 ? "" : str6, (i8 & 128) != 0 ? 0.0d : d4);
    }
}
