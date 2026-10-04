package com.kusukanime.data;

import G3.k;
import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/kusukanime/data/SearchItem;", "", "slug", "", LinkHeader.Parameters.Title, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSlug", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@k(generateAdapter = true)
/* loaded from: classes.dex */
public final /* data */ class SearchItem {
    public static final int $stable = 0;
    private final String slug;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SearchItem copy$default(SearchItem searchItem, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = searchItem.slug;
        }
        if ((i7 & 2) != 0) {
            str2 = searchItem.title;
        }
        return searchItem.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final SearchItem copy(String slug, String title) {
        l.f("slug", slug);
        l.f(LinkHeader.Parameters.Title, title);
        return new SearchItem(slug, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchItem)) {
            return false;
        }
        SearchItem searchItem = (SearchItem) other;
        return l.a(this.slug, searchItem.slug) && l.a(this.title, searchItem.title);
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + (this.slug.hashCode() * 31);
    }

    public String toString() {
        return "SearchItem(slug=" + this.slug + ", title=" + this.title + ")";
    }

    public SearchItem(String str, String str2) {
        l.f("slug", str);
        l.f(LinkHeader.Parameters.Title, str2);
        this.slug = str;
        this.title = str2;
    }

    public /* synthetic */ SearchItem(String str, String str2, int i7, f fVar) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2);
    }
}
