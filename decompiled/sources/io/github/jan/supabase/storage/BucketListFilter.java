package io.github.jan.supabase.storage;

import O3.C;
import a6.v;
import io.github.jan.supabase.annotations.SupabaseInternal;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fJ\b\u0010\u0018\u001a\u00020\u0019H\u0007R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/storage/BucketListFilter;", "", "<init>", "()V", "limit", "", "getLimit", "()Ljava/lang/Integer;", "setLimit", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "offset", "getOffset", "setOffset", "search", "", "getSearch", "()Ljava/lang/String;", "setSearch", "(Ljava/lang/String;)V", "column", "order", "sortBy", "", "build", "Lkotlinx/serialization/json/JsonObject;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BucketListFilter {
    private String column;
    private Integer limit;
    private Integer offset;
    private String order;
    private String search;

    private static final C build$lambda$0$3$0(BucketListFilter bucketListFilter, v vVar) {
        l.f("$this$putJsonObject", vVar);
        n6.d.V("column", bucketListFilter.column, vVar);
        n6.d.V("order", bucketListFilter.order, vVar);
        return C.a;
    }

    @SupabaseInternal
    public final kotlinx.serialization.json.c build() {
        v vVar = new v();
        Integer num = this.limit;
        if (num != null) {
            vVar.b("limit", a6.l.a(Integer.valueOf(num.intValue())));
        }
        Integer num2 = this.offset;
        if (num2 != null) {
            vVar.b("offset", a6.l.a(Integer.valueOf(num2.intValue())));
        }
        String str = this.search;
        if (str != null) {
            n6.d.V("search", str, vVar);
        }
        if (this.column != null) {
            v vVar2 = new v();
            build$lambda$0$3$0(this, vVar2);
            vVar.b("sortBy", vVar2.a());
        }
        return vVar.a();
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final String getSearch() {
        return this.search;
    }

    public final void setLimit(Integer num) {
        this.limit = num;
    }

    public final void setOffset(Integer num) {
        this.offset = num;
    }

    public final void setSearch(String str) {
        this.search = str;
    }

    public final void sortBy(String column, String order) {
        l.f("column", column);
        l.f("order", order);
        this.column = column;
        this.order = order;
    }
}
