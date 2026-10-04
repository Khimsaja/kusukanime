package com.kusukanime.data;

import G3.k;
import b1.AbstractC0703b;
import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import v.c0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/kusukanime/data/AzItem;", "", "slug", "", LinkHeader.Parameters.Title, "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSlug", "()Ljava/lang/String;", "getTitle", "getUrl", "detailSlug", "getDetailSlug", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@k(generateAdapter = true)
/* loaded from: classes.dex */
public final /* data */ class AzItem {
    public static final int $stable = 0;
    private final transient String detailSlug;
    private final String slug;
    private final String title;
    private final String url;

    public AzItem() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AzItem copy$default(AzItem azItem, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = azItem.slug;
        }
        if ((i7 & 2) != 0) {
            str2 = azItem.title;
        }
        if ((i7 & 4) != 0) {
            str3 = azItem.url;
        }
        return azItem.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final AzItem copy(String slug, String title, String url) {
        l.f("slug", slug);
        l.f(LinkHeader.Parameters.Title, title);
        l.f("url", url);
        return new AzItem(slug, title, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AzItem)) {
            return false;
        }
        AzItem azItem = (AzItem) other;
        return l.a(this.slug, azItem.slug) && l.a(this.title, azItem.title) && l.a(this.url, azItem.url);
    }

    public final String getDetailSlug() {
        return this.detailSlug;
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
        return this.url.hashCode() + A6.b.b(this.title, this.slug.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.slug;
        String str2 = this.title;
        return AbstractC0703b.m(c0.c("AzItem(slug=", str, ", title=", str2, ", url="), this.url, ")");
    }

    public AzItem(String str, String str2, String str3) {
        l.f("slug", str);
        l.f(LinkHeader.Parameters.Title, str2);
        l.f("url", str3);
        this.slug = str;
        this.title = str2;
        this.url = str3;
        this.detailSlug = str;
    }

    public /* synthetic */ AzItem(String str, String str2, String str3, int i7, f fVar) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3);
    }
}
