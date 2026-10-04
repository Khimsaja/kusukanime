package com.kusukanime.data;

import G3.k;
import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import v.c0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015J\\\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\nHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000e¨\u0006'"}, d2 = {"Lcom/kusukanime/data/AnimeItem;", "", "slug", "", "url", LinkHeader.Parameters.Title, "cover", "meta", "anime_slug", "episode_n", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getSlug", "()Ljava/lang/String;", "getUrl", "getTitle", "getCover", "getMeta", "getAnime_slug", "getEpisode_n", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "detailSlug", "getDetailSlug", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kusukanime/data/AnimeItem;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@k(generateAdapter = true)
/* loaded from: classes.dex */
public final /* data */ class AnimeItem {
    public static final int $stable = 0;
    private final String anime_slug;
    private final String cover;
    private final transient String detailSlug;
    private final Integer episode_n;
    private final String meta;
    private final String slug;
    private final String title;
    private final String url;

    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnimeItem(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.Integer r8) {
        /*
            r1 = this;
            java.lang.String r0 = "slug"
            kotlin.jvm.internal.l.f(r0, r2)
            java.lang.String r0 = "url"
            kotlin.jvm.internal.l.f(r0, r3)
            java.lang.String r0 = "title"
            kotlin.jvm.internal.l.f(r0, r4)
            r1.<init>()
            r1.slug = r2
            r1.url = r3
            r1.title = r4
            r1.cover = r5
            r1.meta = r6
            r1.anime_slug = r7
            r1.episode_n = r8
            if (r7 == 0) goto L2c
            boolean r3 = z5.AbstractC2510o.g0(r7)
            if (r3 != 0) goto L29
            goto L2a
        L29:
            r7 = 0
        L2a:
            if (r7 != 0) goto L4f
        L2c:
            z5.n[] r3 = z5.EnumC2509n.f19062k
            r3 = 2
            r4 = r3 & r3
            if (r4 == 0) goto L35
            r3 = r3 | 64
        L35:
            java.lang.String r4 = "-(?:episode|chapter)-\\d+(?:-\\d+)?$"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r4, r3)
            java.lang.String r4 = "compile(...)"
            kotlin.jvm.internal.l.e(r4, r3)
            java.util.regex.Matcher r2 = r3.matcher(r2)
            java.lang.String r3 = ""
            java.lang.String r7 = r2.replaceAll(r3)
            java.lang.String r2 = "replaceAll(...)"
            kotlin.jvm.internal.l.e(r2, r7)
        L4f:
            r1.detailSlug = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kusukanime.data.AnimeItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void");
    }

    public static /* synthetic */ AnimeItem copy$default(AnimeItem animeItem, String str, String str2, String str3, String str4, String str5, String str6, Integer num, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = animeItem.slug;
        }
        if ((i7 & 2) != 0) {
            str2 = animeItem.url;
        }
        if ((i7 & 4) != 0) {
            str3 = animeItem.title;
        }
        if ((i7 & 8) != 0) {
            str4 = animeItem.cover;
        }
        if ((i7 & 16) != 0) {
            str5 = animeItem.meta;
        }
        if ((i7 & 32) != 0) {
            str6 = animeItem.anime_slug;
        }
        if ((i7 & 64) != 0) {
            num = animeItem.episode_n;
        }
        String str7 = str6;
        Integer num2 = num;
        String str8 = str5;
        String str9 = str3;
        return animeItem.copy(str, str2, str9, str4, str8, str7, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCover() {
        return this.cover;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMeta() {
        return this.meta;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAnime_slug() {
        return this.anime_slug;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getEpisode_n() {
        return this.episode_n;
    }

    public final AnimeItem copy(String slug, String url, String title, String cover, String meta, String anime_slug, Integer episode_n) {
        l.f("slug", slug);
        l.f("url", url);
        l.f(LinkHeader.Parameters.Title, title);
        return new AnimeItem(slug, url, title, cover, meta, anime_slug, episode_n);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimeItem)) {
            return false;
        }
        AnimeItem animeItem = (AnimeItem) other;
        return l.a(this.slug, animeItem.slug) && l.a(this.url, animeItem.url) && l.a(this.title, animeItem.title) && l.a(this.cover, animeItem.cover) && l.a(this.meta, animeItem.meta) && l.a(this.anime_slug, animeItem.anime_slug) && l.a(this.episode_n, animeItem.episode_n);
    }

    public final String getAnime_slug() {
        return this.anime_slug;
    }

    public final String getCover() {
        return this.cover;
    }

    public final String getDetailSlug() {
        return this.detailSlug;
    }

    public final Integer getEpisode_n() {
        return this.episode_n;
    }

    public final String getMeta() {
        return this.meta;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iB = A6.b.b(this.title, A6.b.b(this.url, this.slug.hashCode() * 31, 31), 31);
        String str = this.cover;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.meta;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.anime_slug;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.episode_n;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.slug;
        String str2 = this.url;
        String str3 = this.title;
        String str4 = this.cover;
        String str5 = this.meta;
        String str6 = this.anime_slug;
        Integer num = this.episode_n;
        StringBuilder sbC = c0.c("AnimeItem(slug=", str, ", url=", str2, ", title=");
        sbC.append(str3);
        sbC.append(", cover=");
        sbC.append(str4);
        sbC.append(", meta=");
        sbC.append(str5);
        sbC.append(", anime_slug=");
        sbC.append(str6);
        sbC.append(", episode_n=");
        sbC.append(num);
        sbC.append(")");
        return sbC.toString();
    }

    public /* synthetic */ AnimeItem(String str, String str2, String str3, String str4, String str5, String str6, Integer num, int i7, f fVar) {
        this(str, str2, str3, str4, str5, (i7 & 32) != 0 ? null : str6, (i7 & 64) != 0 ? null : num);
    }
}
