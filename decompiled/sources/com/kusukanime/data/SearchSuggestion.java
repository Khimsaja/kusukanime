package com.kusukanime.data;

import G3.k;
import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import v.c0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J[\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/kusukanime/data/SearchSuggestion;", "", "slug", "", LinkHeader.Parameters.Title, "cover", "year", LinkHeader.Parameters.Type, "status", "score", "cover_pending", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getSlug", "()Ljava/lang/String;", "getTitle", "getCover", "getYear", "getType", "getStatus", "getScore", "getCover_pending", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@k(generateAdapter = true)
/* loaded from: classes.dex */
public final /* data */ class SearchSuggestion {
    public static final int $stable = 0;
    private final String cover;
    private final boolean cover_pending;
    private final String score;
    private final String slug;
    private final String status;
    private final String title;
    private final String type;
    private final String year;

    public SearchSuggestion() {
        this(null, null, null, null, null, null, null, false, 255, null);
    }

    public static /* synthetic */ SearchSuggestion copy$default(SearchSuggestion searchSuggestion, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = searchSuggestion.slug;
        }
        if ((i7 & 2) != 0) {
            str2 = searchSuggestion.title;
        }
        if ((i7 & 4) != 0) {
            str3 = searchSuggestion.cover;
        }
        if ((i7 & 8) != 0) {
            str4 = searchSuggestion.year;
        }
        if ((i7 & 16) != 0) {
            str5 = searchSuggestion.type;
        }
        if ((i7 & 32) != 0) {
            str6 = searchSuggestion.status;
        }
        if ((i7 & 64) != 0) {
            str7 = searchSuggestion.score;
        }
        if ((i7 & 128) != 0) {
            z7 = searchSuggestion.cover_pending;
        }
        String str8 = str7;
        boolean z8 = z7;
        String str9 = str5;
        String str10 = str6;
        return searchSuggestion.copy(str, str2, str3, str4, str9, str10, str8, z8);
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
    public final String getCover() {
        return this.cover;
    }

    /* renamed from: component4, reason: from getter */
    public final String getYear() {
        return this.year;
    }

    /* renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component7, reason: from getter */
    public final String getScore() {
        return this.score;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getCover_pending() {
        return this.cover_pending;
    }

    public final SearchSuggestion copy(String slug, String title, String cover, String year, String type, String status, String score, boolean cover_pending) {
        l.f("slug", slug);
        l.f(LinkHeader.Parameters.Title, title);
        l.f("year", year);
        l.f(LinkHeader.Parameters.Type, type);
        l.f("status", status);
        l.f("score", score);
        return new SearchSuggestion(slug, title, cover, year, type, status, score, cover_pending);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchSuggestion)) {
            return false;
        }
        SearchSuggestion searchSuggestion = (SearchSuggestion) other;
        return l.a(this.slug, searchSuggestion.slug) && l.a(this.title, searchSuggestion.title) && l.a(this.cover, searchSuggestion.cover) && l.a(this.year, searchSuggestion.year) && l.a(this.type, searchSuggestion.type) && l.a(this.status, searchSuggestion.status) && l.a(this.score, searchSuggestion.score) && this.cover_pending == searchSuggestion.cover_pending;
    }

    public final String getCover() {
        return this.cover;
    }

    public final boolean getCover_pending() {
        return this.cover_pending;
    }

    public final String getScore() {
        return this.score;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final String getYear() {
        return this.year;
    }

    public int hashCode() {
        int iB = A6.b.b(this.title, this.slug.hashCode() * 31, 31);
        String str = this.cover;
        return Boolean.hashCode(this.cover_pending) + A6.b.b(this.score, A6.b.b(this.status, A6.b.b(this.type, A6.b.b(this.year, (iB + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31);
    }

    public String toString() {
        String str = this.slug;
        String str2 = this.title;
        String str3 = this.cover;
        String str4 = this.year;
        String str5 = this.type;
        String str6 = this.status;
        String str7 = this.score;
        boolean z7 = this.cover_pending;
        StringBuilder sbC = c0.c("SearchSuggestion(slug=", str, ", title=", str2, ", cover=");
        sbC.append(str3);
        sbC.append(", year=");
        sbC.append(str4);
        sbC.append(", type=");
        sbC.append(str5);
        sbC.append(", status=");
        sbC.append(str6);
        sbC.append(", score=");
        sbC.append(str7);
        sbC.append(", cover_pending=");
        sbC.append(z7);
        sbC.append(")");
        return sbC.toString();
    }

    public SearchSuggestion(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z7) {
        l.f("slug", str);
        l.f(LinkHeader.Parameters.Title, str2);
        l.f("year", str4);
        l.f(LinkHeader.Parameters.Type, str5);
        l.f("status", str6);
        l.f("score", str7);
        this.slug = str;
        this.title = str2;
        this.cover = str3;
        this.year = str4;
        this.type = str5;
        this.status = str6;
        this.score = str7;
        this.cover_pending = z7;
    }

    public /* synthetic */ SearchSuggestion(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z7, int i7, f fVar) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? "" : str4, (i7 & 16) != 0 ? "" : str5, (i7 & 32) != 0 ? "" : str6, (i7 & 64) != 0 ? "" : str7, (i7 & 128) != 0 ? false : z7);
    }
}
