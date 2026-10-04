package com.kusukanime.data;

import G3.k;
import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import v.c0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/kusukanime/data/ScheduleItem;", "", "slug", "", LinkHeader.Parameters.Title, "cover", "meta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSlug", "()Ljava/lang/String;", "getTitle", "getCover", "getMeta", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@k(generateAdapter = true)
/* loaded from: classes.dex */
public final /* data */ class ScheduleItem {
    public static final int $stable = 0;
    private final String cover;
    private final String meta;
    private final String slug;
    private final String title;

    public ScheduleItem(String str, String str2, String str3, String str4) {
        l.f("slug", str);
        l.f(LinkHeader.Parameters.Title, str2);
        this.slug = str;
        this.title = str2;
        this.cover = str3;
        this.meta = str4;
    }

    public static /* synthetic */ ScheduleItem copy$default(ScheduleItem scheduleItem, String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = scheduleItem.slug;
        }
        if ((i7 & 2) != 0) {
            str2 = scheduleItem.title;
        }
        if ((i7 & 4) != 0) {
            str3 = scheduleItem.cover;
        }
        if ((i7 & 8) != 0) {
            str4 = scheduleItem.meta;
        }
        return scheduleItem.copy(str, str2, str3, str4);
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
    public final String getMeta() {
        return this.meta;
    }

    public final ScheduleItem copy(String slug, String title, String cover, String meta) {
        l.f("slug", slug);
        l.f(LinkHeader.Parameters.Title, title);
        return new ScheduleItem(slug, title, cover, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleItem)) {
            return false;
        }
        ScheduleItem scheduleItem = (ScheduleItem) other;
        return l.a(this.slug, scheduleItem.slug) && l.a(this.title, scheduleItem.title) && l.a(this.cover, scheduleItem.cover) && l.a(this.meta, scheduleItem.meta);
    }

    public final String getCover() {
        return this.cover;
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

    public int hashCode() {
        int iB = A6.b.b(this.title, this.slug.hashCode() * 31, 31);
        String str = this.cover;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.meta;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.slug;
        String str2 = this.title;
        String str3 = this.cover;
        String str4 = this.meta;
        StringBuilder sbC = c0.c("ScheduleItem(slug=", str, ", title=", str2, ", cover=");
        sbC.append(str3);
        sbC.append(", meta=");
        sbC.append(str4);
        sbC.append(")");
        return sbC.toString();
    }
}
