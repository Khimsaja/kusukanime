package com.kusukanime.data;

import G3.k;
import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/kusukanime/data/EpisodeRef;", "", "n", "", "slug", "", "url", LinkHeader.Parameters.Title, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getN", "()I", "getSlug", "()Ljava/lang/String;", "getUrl", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@k(generateAdapter = true)
/* loaded from: classes.dex */
public final /* data */ class EpisodeRef {
    public static final int $stable = 0;
    private final int n;
    private final String slug;
    private final String title;
    private final String url;

    public EpisodeRef(int i7, String str, String str2, String str3) {
        l.f("slug", str);
        l.f("url", str2);
        l.f(LinkHeader.Parameters.Title, str3);
        this.n = i7;
        this.slug = str;
        this.url = str2;
        this.title = str3;
    }

    public static /* synthetic */ EpisodeRef copy$default(EpisodeRef episodeRef, int i7, String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = episodeRef.n;
        }
        if ((i8 & 2) != 0) {
            str = episodeRef.slug;
        }
        if ((i8 & 4) != 0) {
            str2 = episodeRef.url;
        }
        if ((i8 & 8) != 0) {
            str3 = episodeRef.title;
        }
        return episodeRef.copy(i7, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getN() {
        return this.n;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final EpisodeRef copy(int n7, String slug, String url, String title) {
        l.f("slug", slug);
        l.f("url", url);
        l.f(LinkHeader.Parameters.Title, title);
        return new EpisodeRef(n7, slug, url, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EpisodeRef)) {
            return false;
        }
        EpisodeRef episodeRef = (EpisodeRef) other;
        return this.n == episodeRef.n && l.a(this.slug, episodeRef.slug) && l.a(this.url, episodeRef.url) && l.a(this.title, episodeRef.title);
    }

    public final int getN() {
        return this.n;
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
        return this.title.hashCode() + A6.b.b(this.url, A6.b.b(this.slug, Integer.hashCode(this.n) * 31, 31), 31);
    }

    public String toString() {
        return "EpisodeRef(n=" + this.n + ", slug=" + this.slug + ", url=" + this.url + ", title=" + this.title + ")";
    }
}
