package com.kusukanime.data;

import G3.k;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import v.c0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/kusukanime/data/FeedCount;", "", "count", "", "<init>", "(I)V", "getCount", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@k(generateAdapter = true)
/* loaded from: classes.dex */
public final /* data */ class FeedCount {
    public static final int $stable = 0;
    private final int count;

    public FeedCount() {
        this(0, 1, null);
    }

    public static /* synthetic */ FeedCount copy$default(FeedCount feedCount, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = feedCount.count;
        }
        return feedCount.copy(i7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final FeedCount copy(int count) {
        return new FeedCount(count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FeedCount) && this.count == ((FeedCount) other).count;
    }

    public final int getCount() {
        return this.count;
    }

    public int hashCode() {
        return Integer.hashCode(this.count);
    }

    public String toString() {
        return c0.a(this.count, "FeedCount(count=", ")");
    }

    public FeedCount(int i7) {
        this.count = i7;
    }

    public /* synthetic */ FeedCount(int i7, int i8, f fVar) {
        this((i8 & 1) != 0 ? 0 : i7);
    }
}
