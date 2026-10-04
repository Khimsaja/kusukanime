package com.kusukanime.data;

import G3.k;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import v.c0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/kusukanime/data/GenreItem;", "", "slug", "", ContentDisposition.Parameters.Name, "count", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getSlug", "()Ljava/lang/String;", "getName", "getCount", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@k(generateAdapter = true)
/* loaded from: classes.dex */
public final /* data */ class GenreItem {
    public static final int $stable = 0;
    private final int count;
    private final String name;
    private final String slug;

    public GenreItem(String str, String str2, int i7) {
        l.f("slug", str);
        l.f(ContentDisposition.Parameters.Name, str2);
        this.slug = str;
        this.name = str2;
        this.count = i7;
    }

    public static /* synthetic */ GenreItem copy$default(GenreItem genreItem, String str, String str2, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = genreItem.slug;
        }
        if ((i8 & 2) != 0) {
            str2 = genreItem.name;
        }
        if ((i8 & 4) != 0) {
            i7 = genreItem.count;
        }
        return genreItem.copy(str, str2, i7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final GenreItem copy(String slug, String name, int count) {
        l.f("slug", slug);
        l.f(ContentDisposition.Parameters.Name, name);
        return new GenreItem(slug, name, count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenreItem)) {
            return false;
        }
        GenreItem genreItem = (GenreItem) other;
        return l.a(this.slug, genreItem.slug) && l.a(this.name, genreItem.name) && this.count == genreItem.count;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        return Integer.hashCode(this.count) + A6.b.b(this.name, this.slug.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.slug;
        String str2 = this.name;
        int i7 = this.count;
        StringBuilder sbC = c0.c("GenreItem(slug=", str, ", name=", str2, ", count=");
        sbC.append(i7);
        sbC.append(")");
        return sbC.toString();
    }

    public /* synthetic */ GenreItem(String str, String str2, int i7, int i8, f fVar) {
        this(str, str2, (i8 & 4) != 0 ? 0 : i7);
    }
}
