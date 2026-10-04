package com.kusukanime.data;

import G3.k;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\u0013\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J4\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/kusukanime/data/ApiEnvelope;", "T", "", "success", "", "data", "page", "", "<init>", "(ZLjava/lang/Object;Ljava/lang/Integer;)V", "getSuccess", "()Z", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(ZLjava/lang/Object;Ljava/lang/Integer;)Lcom/kusukanime/data/ApiEnvelope;", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@k(generateAdapter = true)
/* loaded from: classes.dex */
public final /* data */ class ApiEnvelope<T> {
    public static final int $stable = 0;
    private final T data;
    private final Integer page;
    private final boolean success;

    public ApiEnvelope(boolean z7, T t7, Integer num) {
        this.success = z7;
        this.data = t7;
        this.page = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiEnvelope copy$default(ApiEnvelope apiEnvelope, boolean z7, Object obj, Integer num, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            z7 = apiEnvelope.success;
        }
        if ((i7 & 2) != 0) {
            obj = apiEnvelope.data;
        }
        if ((i7 & 4) != 0) {
            num = apiEnvelope.page;
        }
        return apiEnvelope.copy(z7, obj, num);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public final T component2() {
        return this.data;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getPage() {
        return this.page;
    }

    public final ApiEnvelope<T> copy(boolean success, T data, Integer page) {
        return new ApiEnvelope<>(success, data, page);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiEnvelope)) {
            return false;
        }
        ApiEnvelope apiEnvelope = (ApiEnvelope) other;
        return this.success == apiEnvelope.success && l.a(this.data, apiEnvelope.data) && l.a(this.page, apiEnvelope.page);
    }

    public final T getData() {
        return this.data;
    }

    public final Integer getPage() {
        return this.page;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        T t7 = this.data;
        int iHashCode2 = (iHashCode + (t7 == null ? 0 : t7.hashCode())) * 31;
        Integer num = this.page;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ApiEnvelope(success=" + this.success + ", data=" + this.data + ", page=" + this.page + ")";
    }

    public /* synthetic */ ApiEnvelope(boolean z7, Object obj, Integer num, int i7, f fVar) {
        this(z7, obj, (i7 & 4) != 0 ? null : num);
    }
}
