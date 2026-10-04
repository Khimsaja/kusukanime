package io.github.jan.supabase.postgrest.query;

import O3.C;
import P3.q;
import P3.r;
import S3.c;
import a6.C0673c;
import a6.d;
import e4.k;
import io.github.jan.supabase.postgrest.Postgrest;
import io.github.jan.supabase.postgrest.UtilsKt;
import io.github.jan.supabase.postgrest.executor.RestRequestExecutor;
import io.github.jan.supabase.postgrest.query.request.InsertRequestBuilder;
import io.github.jan.supabase.postgrest.query.request.SelectRequestBuilder;
import io.github.jan.supabase.postgrest.query.request.UpsertRequestBuilder;
import io.github.jan.supabase.postgrest.request.DeleteRequest;
import io.github.jan.supabase.postgrest.request.InsertRequest;
import io.github.jan.supabase.postgrest.request.SelectRequest;
import io.github.jan.supabase.postgrest.request.UpdateRequest;
import io.github.jan.supabase.postgrest.result.PostgrestResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import l4.C1447z;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0001/B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ:\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0086H¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0017H\u0086H¢\u0006\u0002\u0010\u001eJC\u0010\u001a\u001a\u00020\u000f\"\n\b\u0000\u0010\u001f\u0018\u0001*\u00020\u00012\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001f0!2\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0017H\u0086H¢\u0006\u0002\u0010\"J=\u0010\u001a\u001a\u00020\u000f\"\n\b\u0000\u0010\u001f\u0018\u0001*\u00020\u00012\u0006\u0010#\u001a\u0002H\u001f2\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0017H\u0086H¢\u0006\u0002\u0010$J1\u0010%\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0017H\u0086H¢\u0006\u0002\u0010\u001eJC\u0010%\u001a\u00020\u000f\"\n\b\u0000\u0010\u001f\u0018\u0001*\u00020\u00012\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001f0!2\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0017H\u0086H¢\u0006\u0002\u0010\"J=\u0010%\u001a\u00020\u000f\"\n\b\u0000\u0010\u001f\u0018\u0001*\u00020\u00012\u0006\u0010#\u001a\u0002H\u001f2\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0017H\u0086H¢\u0006\u0002\u0010$JD\u0010'\u001a\u00020\u000f2\u0019\b\u0006\u0010'\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u00172\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0017H\u0086H¢\u0006\u0002\u0010*J1\u0010'\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020+2\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0017H\u0086H¢\u0006\u0002\u0010,J=\u0010'\u001a\u00020\u000f\"\n\b\u0000\u0010\u001f\u0018\u0001*\u00020\u00012\u0006\u0010#\u001a\u0002H\u001f2\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0017H\u0086H¢\u0006\u0002\u0010$J)\u0010-\u001a\u00020\u000f2\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0017H\u0086H¢\u0006\u0002\u0010.R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u00060"}, d2 = {"Lio/github/jan/supabase/postgrest/query/PostgrestQueryBuilder;", "", "postgrest", "Lio/github/jan/supabase/postgrest/Postgrest;", "table", "", "schema", "<init>", "(Lio/github/jan/supabase/postgrest/Postgrest;Ljava/lang/String;Ljava/lang/String;)V", "getPostgrest", "()Lio/github/jan/supabase/postgrest/Postgrest;", "getTable", "()Ljava/lang/String;", "getSchema", "select", "Lio/github/jan/supabase/postgrest/result/PostgrestResult;", "columns", "Lio/github/jan/supabase/postgrest/query/Columns;", "request", "Lkotlin/Function1;", "Lio/github/jan/supabase/postgrest/query/request/SelectRequestBuilder;", "", "Lio/github/jan/supabase/auth/PostgrestFilterDSL;", "Lkotlin/ExtensionFunctionType;", "select-Ao2T0zE", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsert", "body", "Lkotlinx/serialization/json/JsonArray;", "Lio/github/jan/supabase/postgrest/query/request/UpsertRequestBuilder;", "(Lkotlinx/serialization/json/JsonArray;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "values", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "Lio/github/jan/supabase/postgrest/query/request/InsertRequestBuilder;", "update", "Lio/github/jan/supabase/postgrest/query/PostgrestUpdate;", "Lio/github/jan/supabase/postgrest/query/PostgrestRequestBuilder;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonElement;", "(Lkotlinx/serialization/json/JsonElement;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PostgrestQueryBuilder {
    public static final String HEADER_PREFER = "Prefer";
    private final Postgrest postgrest;
    private final String schema;
    private final String table;

    public PostgrestQueryBuilder(Postgrest postgrest, String str, String str2) {
        l.f("postgrest", postgrest);
        l.f("table", str);
        l.f("schema", str2);
        this.postgrest = postgrest;
        this.table = str;
        this.schema = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object delete$$forInline(k kVar, c<? super PostgrestResult> cVar) {
        PostgrestRequestBuilder postgrestRequestBuilder = new PostgrestRequestBuilder(((Postgrest.Config) getPostgrest().getConfig()).getPropertyConversionMethod());
        kVar.invoke(postgrestRequestBuilder);
        return RestRequestExecutor.INSTANCE.execute(getPostgrest(), getTable(), new DeleteRequest(postgrestRequestBuilder.getReturning(), postgrestRequestBuilder.getCount(), UtilsKt.mapToFirstValue(postgrestRequestBuilder.getParams()), getSchema(), postgrestRequestBuilder.getHeaders().build()), cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object delete$default(PostgrestQueryBuilder postgrestQueryBuilder, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            kVar = new k() { // from class: io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder.delete.2
                public final void invoke(PostgrestRequestBuilder postgrestRequestBuilder) {
                    l.f("<this>", postgrestRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PostgrestRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        PostgrestRequestBuilder postgrestRequestBuilder = new PostgrestRequestBuilder(((Postgrest.Config) postgrestQueryBuilder.getPostgrest().getConfig()).getPropertyConversionMethod());
        kVar.invoke(postgrestRequestBuilder);
        return RestRequestExecutor.INSTANCE.execute(postgrestQueryBuilder.getPostgrest(), postgrestQueryBuilder.getTable(), new DeleteRequest(postgrestRequestBuilder.getReturning(), postgrestRequestBuilder.getCount(), UtilsKt.mapToFirstValue(postgrestRequestBuilder.getParams()), postgrestQueryBuilder.getSchema(), postgrestRequestBuilder.getHeaders().build()), cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object insert$$forInline(a aVar, k kVar, c<? super PostgrestResult> cVar) {
        InsertRequestBuilder insertRequestBuilder = new InsertRequestBuilder(((Postgrest.Config) getPostgrest().getConfig()).getPropertyConversionMethod());
        kVar.invoke(insertRequestBuilder);
        ArrayList arrayList = new ArrayList(r.p(aVar, 10));
        Iterator it = aVar.f12721k.iterator();
        while (it.hasNext()) {
            arrayList.add(a6.l.e((b) it.next()).f12722k.keySet());
        }
        List listN0 = q.n0(r.t(arrayList));
        if (!listN0.isEmpty()) {
            insertRequestBuilder.getParams().put("columns", r.H(q.y0(listN0, ",", null, null, null, 62)));
        }
        boolean z7 = false;
        boolean z8 = false;
        return RestRequestExecutor.INSTANCE.execute(getPostgrest(), getTable(), new InsertRequest(z7, insertRequestBuilder.getReturning(), insertRequestBuilder.getCount(), z8, insertRequestBuilder.getDefaultToNull(), aVar, UtilsKt.mapToFirstValue(insertRequestBuilder.getParams()), getSchema(), insertRequestBuilder.getHeaders().build(), 9, null), cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object insert$default(PostgrestQueryBuilder postgrestQueryBuilder, a aVar, k kVar, c cVar, int i7, Object obj) {
        k kVar2 = (i7 & 2) != 0 ? new k() { // from class: io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder.insert.2
            public final void invoke(InsertRequestBuilder insertRequestBuilder) {
                l.f("<this>", insertRequestBuilder);
            }

            @Override // e4.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke((InsertRequestBuilder) obj2);
                return C.a;
            }
        } : kVar;
        InsertRequestBuilder insertRequestBuilder = new InsertRequestBuilder(((Postgrest.Config) postgrestQueryBuilder.getPostgrest().getConfig()).getPropertyConversionMethod());
        kVar2.invoke(insertRequestBuilder);
        ArrayList arrayList = new ArrayList(r.p(aVar, 10));
        Iterator it = aVar.f12721k.iterator();
        while (it.hasNext()) {
            arrayList.add(a6.l.e((b) it.next()).f12722k.keySet());
        }
        List listN0 = q.n0(r.t(arrayList));
        if (!listN0.isEmpty()) {
            insertRequestBuilder.getParams().put("columns", r.H(q.y0(listN0, ",", null, null, null, 62)));
        }
        return RestRequestExecutor.INSTANCE.execute(postgrestQueryBuilder.getPostgrest(), postgrestQueryBuilder.getTable(), new InsertRequest(false, insertRequestBuilder.getReturning(), insertRequestBuilder.getCount(), false, insertRequestBuilder.getDefaultToNull(), aVar, UtilsKt.mapToFirstValue(insertRequestBuilder.getParams()), postgrestQueryBuilder.getSchema(), insertRequestBuilder.getHeaders().build(), 9, null), cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: select-Ao2T0zE$$forInline, reason: not valid java name */
    private final Object m25selectAo2T0zE$$forInline(String str, k kVar, c<? super PostgrestResult> cVar) {
        SelectRequestBuilder selectRequestBuilder = new SelectRequestBuilder(((Postgrest.Config) getPostgrest().getConfig()).getPropertyConversionMethod());
        kVar.invoke(selectRequestBuilder);
        selectRequestBuilder.getParams().put("select", r.H(str));
        return RestRequestExecutor.INSTANCE.execute(getPostgrest(), getTable(), new SelectRequest(selectRequestBuilder.getHead(), selectRequestBuilder.getCount(), UtilsKt.mapToFirstValue(selectRequestBuilder.getParams()), getSchema(), selectRequestBuilder.getHeaders().build()), cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: select-Ao2T0zE$default, reason: not valid java name */
    public static /* synthetic */ Object m26selectAo2T0zE$default(PostgrestQueryBuilder postgrestQueryBuilder, String str, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = Columns.INSTANCE.m20getALLU9NzzuM();
        }
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder$select$2
                public final void invoke(SelectRequestBuilder selectRequestBuilder) {
                    l.f("<this>", selectRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((SelectRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        SelectRequestBuilder selectRequestBuilder = new SelectRequestBuilder(((Postgrest.Config) postgrestQueryBuilder.getPostgrest().getConfig()).getPropertyConversionMethod());
        kVar.invoke(selectRequestBuilder);
        selectRequestBuilder.getParams().put("select", r.H(str));
        return RestRequestExecutor.INSTANCE.execute(postgrestQueryBuilder.getPostgrest(), postgrestQueryBuilder.getTable(), new SelectRequest(selectRequestBuilder.getHead(), selectRequestBuilder.getCount(), UtilsKt.mapToFirstValue(selectRequestBuilder.getParams()), postgrestQueryBuilder.getSchema(), selectRequestBuilder.getHeaders().build()), cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object update$$forInline(k kVar, k kVar2, c<? super PostgrestResult> cVar) {
        PostgrestRequestBuilder postgrestRequestBuilder = new PostgrestRequestBuilder(((Postgrest.Config) getPostgrest().getConfig()).getPropertyConversionMethod());
        kVar2.invoke(postgrestRequestBuilder);
        PostgrestUpdate postgrestUpdate = new PostgrestUpdate(((Postgrest.Config) getPostgrest().getConfig()).getPropertyConversionMethod(), getPostgrest().getSerializer());
        kVar.invoke(postgrestUpdate);
        return RestRequestExecutor.INSTANCE.execute(getPostgrest(), getTable(), new UpdateRequest(postgrestRequestBuilder.getReturning(), postgrestRequestBuilder.getCount(), UtilsKt.mapToFirstValue(postgrestRequestBuilder.getParams()), postgrestUpdate.toJson(), getSchema(), postgrestRequestBuilder.getHeaders().build()), cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object update$default(PostgrestQueryBuilder postgrestQueryBuilder, k kVar, k kVar2, c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            kVar = new k() { // from class: io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder.update.2
                public final void invoke(PostgrestUpdate postgrestUpdate) {
                    l.f("<this>", postgrestUpdate);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PostgrestUpdate) obj2);
                    return C.a;
                }
            };
        }
        if ((i7 & 2) != 0) {
            kVar2 = new k() { // from class: io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder.update.3
                public final void invoke(PostgrestRequestBuilder postgrestRequestBuilder) {
                    l.f("<this>", postgrestRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PostgrestRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        PostgrestRequestBuilder postgrestRequestBuilder = new PostgrestRequestBuilder(((Postgrest.Config) postgrestQueryBuilder.getPostgrest().getConfig()).getPropertyConversionMethod());
        kVar2.invoke(postgrestRequestBuilder);
        PostgrestUpdate postgrestUpdate = new PostgrestUpdate(((Postgrest.Config) postgrestQueryBuilder.getPostgrest().getConfig()).getPropertyConversionMethod(), postgrestQueryBuilder.getPostgrest().getSerializer());
        kVar.invoke(postgrestUpdate);
        return RestRequestExecutor.INSTANCE.execute(postgrestQueryBuilder.getPostgrest(), postgrestQueryBuilder.getTable(), new UpdateRequest(postgrestRequestBuilder.getReturning(), postgrestRequestBuilder.getCount(), UtilsKt.mapToFirstValue(postgrestRequestBuilder.getParams()), postgrestUpdate.toJson(), postgrestQueryBuilder.getSchema(), postgrestRequestBuilder.getHeaders().build()), cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object upsert$$forInline(a aVar, k kVar, c<? super PostgrestResult> cVar) {
        UpsertRequestBuilder upsertRequestBuilder = new UpsertRequestBuilder(((Postgrest.Config) getPostgrest().getConfig()).getPropertyConversionMethod());
        kVar.invoke(upsertRequestBuilder);
        ArrayList arrayList = new ArrayList(r.p(aVar, 10));
        Iterator it = aVar.f12721k.iterator();
        while (it.hasNext()) {
            arrayList.add(a6.l.e((b) it.next()).f12722k.keySet());
        }
        List listN0 = q.n0(r.t(arrayList));
        if (!listN0.isEmpty()) {
            upsertRequestBuilder.getParams().put("columns", r.H(q.y0(listN0, ",", null, null, null, 62)));
        }
        String onConflict = upsertRequestBuilder.getOnConflict();
        if (onConflict != null) {
            upsertRequestBuilder.getParams().put("on_conflict", r.H(onConflict));
        }
        Returning returning = upsertRequestBuilder.getReturning();
        Count count = upsertRequestBuilder.getCount();
        Map mapMapToFirstValue = UtilsKt.mapToFirstValue(upsertRequestBuilder.getParams());
        return RestRequestExecutor.INSTANCE.execute(getPostgrest(), getTable(), new InsertRequest(true, returning, count, upsertRequestBuilder.getIgnoreDuplicates(), upsertRequestBuilder.getDefaultToNull(), aVar, mapMapToFirstValue, getSchema(), upsertRequestBuilder.getHeaders().build()), cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object upsert$default(PostgrestQueryBuilder postgrestQueryBuilder, a aVar, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder.upsert.2
                public final void invoke(UpsertRequestBuilder upsertRequestBuilder) {
                    l.f("<this>", upsertRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((UpsertRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        UpsertRequestBuilder upsertRequestBuilder = new UpsertRequestBuilder(((Postgrest.Config) postgrestQueryBuilder.getPostgrest().getConfig()).getPropertyConversionMethod());
        kVar.invoke(upsertRequestBuilder);
        ArrayList arrayList = new ArrayList(r.p(aVar, 10));
        Iterator it = aVar.f12721k.iterator();
        while (it.hasNext()) {
            arrayList.add(a6.l.e((b) it.next()).f12722k.keySet());
        }
        List listN0 = q.n0(r.t(arrayList));
        if (!listN0.isEmpty()) {
            upsertRequestBuilder.getParams().put("columns", r.H(q.y0(listN0, ",", null, null, null, 62)));
        }
        String onConflict = upsertRequestBuilder.getOnConflict();
        if (onConflict != null) {
            upsertRequestBuilder.getParams().put("on_conflict", r.H(onConflict));
        }
        Returning returning = upsertRequestBuilder.getReturning();
        Count count = upsertRequestBuilder.getCount();
        Map mapMapToFirstValue = UtilsKt.mapToFirstValue(upsertRequestBuilder.getParams());
        return RestRequestExecutor.INSTANCE.execute(postgrestQueryBuilder.getPostgrest(), postgrestQueryBuilder.getTable(), new InsertRequest(true, returning, count, upsertRequestBuilder.getIgnoreDuplicates(), upsertRequestBuilder.getDefaultToNull(), aVar, mapMapToFirstValue, postgrestQueryBuilder.getSchema(), upsertRequestBuilder.getHeaders().build()), cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object delete(k kVar, c<? super PostgrestResult> cVar) {
        PostgrestRequestBuilder postgrestRequestBuilder = new PostgrestRequestBuilder(((Postgrest.Config) getPostgrest().getConfig()).getPropertyConversionMethod());
        kVar.invoke(postgrestRequestBuilder);
        return RestRequestExecutor.INSTANCE.execute(getPostgrest(), getTable(), new DeleteRequest(postgrestRequestBuilder.getReturning(), postgrestRequestBuilder.getCount(), UtilsKt.mapToFirstValue(postgrestRequestBuilder.getParams()), getSchema(), postgrestRequestBuilder.getHeaders().build()), cVar);
    }

    public final Postgrest getPostgrest() {
        return this.postgrest;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getTable() {
        return this.table;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object insert(a aVar, k kVar, c<? super PostgrestResult> cVar) {
        InsertRequestBuilder insertRequestBuilder = new InsertRequestBuilder(((Postgrest.Config) getPostgrest().getConfig()).getPropertyConversionMethod());
        kVar.invoke(insertRequestBuilder);
        ArrayList arrayList = new ArrayList(r.p(aVar, 10));
        Iterator it = aVar.f12721k.iterator();
        while (it.hasNext()) {
            arrayList.add(a6.l.e((b) it.next()).f12722k.keySet());
        }
        List listN0 = q.n0(r.t(arrayList));
        if (!listN0.isEmpty()) {
            insertRequestBuilder.getParams().put("columns", r.H(q.y0(listN0, ",", null, null, null, 62)));
        }
        boolean z7 = false;
        boolean z8 = false;
        return RestRequestExecutor.INSTANCE.execute(getPostgrest(), getTable(), new InsertRequest(z7, insertRequestBuilder.getReturning(), insertRequestBuilder.getCount(), z8, insertRequestBuilder.getDefaultToNull(), aVar, UtilsKt.mapToFirstValue(insertRequestBuilder.getParams()), getSchema(), insertRequestBuilder.getHeaders().build(), 9, null), cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: select-Ao2T0zE, reason: not valid java name */
    public final Object m27selectAo2T0zE(String str, k kVar, c<? super PostgrestResult> cVar) {
        SelectRequestBuilder selectRequestBuilder = new SelectRequestBuilder(((Postgrest.Config) getPostgrest().getConfig()).getPropertyConversionMethod());
        kVar.invoke(selectRequestBuilder);
        selectRequestBuilder.getParams().put("select", r.H(str));
        return RestRequestExecutor.INSTANCE.execute(getPostgrest(), getTable(), new SelectRequest(selectRequestBuilder.getHead(), selectRequestBuilder.getCount(), UtilsKt.mapToFirstValue(selectRequestBuilder.getParams()), getSchema(), selectRequestBuilder.getHeaders().build()), cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object update(k kVar, k kVar2, c<? super PostgrestResult> cVar) {
        PostgrestRequestBuilder postgrestRequestBuilder = new PostgrestRequestBuilder(((Postgrest.Config) getPostgrest().getConfig()).getPropertyConversionMethod());
        kVar2.invoke(postgrestRequestBuilder);
        PostgrestUpdate postgrestUpdate = new PostgrestUpdate(((Postgrest.Config) getPostgrest().getConfig()).getPropertyConversionMethod(), getPostgrest().getSerializer());
        kVar.invoke(postgrestUpdate);
        return RestRequestExecutor.INSTANCE.execute(getPostgrest(), getTable(), new UpdateRequest(postgrestRequestBuilder.getReturning(), postgrestRequestBuilder.getCount(), UtilsKt.mapToFirstValue(postgrestRequestBuilder.getParams()), postgrestUpdate.toJson(), getSchema(), postgrestRequestBuilder.getHeaders().build()), cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object upsert(a aVar, k kVar, c<? super PostgrestResult> cVar) {
        UpsertRequestBuilder upsertRequestBuilder = new UpsertRequestBuilder(((Postgrest.Config) getPostgrest().getConfig()).getPropertyConversionMethod());
        kVar.invoke(upsertRequestBuilder);
        ArrayList arrayList = new ArrayList(r.p(aVar, 10));
        Iterator it = aVar.f12721k.iterator();
        while (it.hasNext()) {
            arrayList.add(a6.l.e((b) it.next()).f12722k.keySet());
        }
        List listN0 = q.n0(r.t(arrayList));
        if (!listN0.isEmpty()) {
            upsertRequestBuilder.getParams().put("columns", r.H(q.y0(listN0, ",", null, null, null, 62)));
        }
        String onConflict = upsertRequestBuilder.getOnConflict();
        if (onConflict != null) {
            upsertRequestBuilder.getParams().put("on_conflict", r.H(onConflict));
        }
        Returning returning = upsertRequestBuilder.getReturning();
        Count count = upsertRequestBuilder.getCount();
        Map mapMapToFirstValue = UtilsKt.mapToFirstValue(upsertRequestBuilder.getParams());
        return RestRequestExecutor.INSTANCE.execute(getPostgrest(), getTable(), new InsertRequest(true, returning, count, upsertRequestBuilder.getIgnoreDuplicates(), upsertRequestBuilder.getDefaultToNull(), aVar, mapMapToFirstValue, getSchema(), upsertRequestBuilder.getHeaders().build()), cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ PostgrestQueryBuilder(Postgrest postgrest, String str, String str2, int i7, f fVar) {
        this(postgrest, str, (i7 & 4) != 0 ? ((Postgrest.Config) postgrest.getConfig()).getDefaultSchema() : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object update$$forInline(b bVar, k kVar, c<? super PostgrestResult> cVar) {
        PostgrestRequestBuilder postgrestRequestBuilder = new PostgrestRequestBuilder(((Postgrest.Config) getPostgrest().getConfig()).getPropertyConversionMethod());
        kVar.invoke(postgrestRequestBuilder);
        return RestRequestExecutor.INSTANCE.execute(getPostgrest(), getTable(), new UpdateRequest(postgrestRequestBuilder.getReturning(), postgrestRequestBuilder.getCount(), UtilsKt.mapToFirstValue(postgrestRequestBuilder.getParams()), bVar, getSchema(), postgrestRequestBuilder.getHeaders().build()), cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object update(b bVar, k kVar, c<? super PostgrestResult> cVar) {
        PostgrestRequestBuilder postgrestRequestBuilder = new PostgrestRequestBuilder(((Postgrest.Config) getPostgrest().getConfig()).getPropertyConversionMethod());
        kVar.invoke(postgrestRequestBuilder);
        return RestRequestExecutor.INSTANCE.execute(getPostgrest(), getTable(), new UpdateRequest(postgrestRequestBuilder.getReturning(), postgrestRequestBuilder.getCount(), UtilsKt.mapToFirstValue(postgrestRequestBuilder.getParams()), bVar, getSchema(), postgrestRequestBuilder.getHeaders().build()), cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object update$default(PostgrestQueryBuilder postgrestQueryBuilder, b bVar, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder.update.5
                public final void invoke(PostgrestRequestBuilder postgrestRequestBuilder) {
                    l.f("<this>", postgrestRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PostgrestRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        PostgrestRequestBuilder postgrestRequestBuilder = new PostgrestRequestBuilder(((Postgrest.Config) postgrestQueryBuilder.getPostgrest().getConfig()).getPropertyConversionMethod());
        kVar.invoke(postgrestRequestBuilder);
        return RestRequestExecutor.INSTANCE.execute(postgrestQueryBuilder.getPostgrest(), postgrestQueryBuilder.getTable(), new UpdateRequest(postgrestRequestBuilder.getReturning(), postgrestRequestBuilder.getCount(), UtilsKt.mapToFirstValue(postgrestRequestBuilder.getParams()), bVar, postgrestQueryBuilder.getSchema(), postgrestRequestBuilder.getHeaders().build()), cVar);
    }

    public final <T> Object insert(List<? extends T> list, k kVar, c<? super PostgrestResult> cVar) {
        getPostgrest().getSerializer();
        C0673c c0673c = d.f10459d;
        C1447z c1447z = C1447z.f12758c;
        l.k();
        throw null;
    }

    public static Object insert$default(PostgrestQueryBuilder postgrestQueryBuilder, List list, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            AnonymousClass4 anonymousClass4 = new k() { // from class: io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder.insert.4
                public final void invoke(InsertRequestBuilder insertRequestBuilder) {
                    l.f("<this>", insertRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((InsertRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        postgrestQueryBuilder.getPostgrest().getSerializer();
        C0673c c0673c = d.f10459d;
        C1447z c1447z = C1447z.f12758c;
        l.k();
        throw null;
    }

    public final <T> Object update(T t7, k kVar, c<? super PostgrestResult> cVar) {
        getPostgrest().getSerializer();
        C0673c c0673c = d.f10459d;
        l.k();
        throw null;
    }

    public final <T> Object upsert(List<? extends T> list, k kVar, c<? super PostgrestResult> cVar) {
        getPostgrest().getSerializer();
        C0673c c0673c = d.f10459d;
        C1447z c1447z = C1447z.f12758c;
        l.k();
        throw null;
    }

    public static Object upsert$default(PostgrestQueryBuilder postgrestQueryBuilder, List list, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            C11365 c11365 = new k() { // from class: io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder.upsert.5
                public final void invoke(UpsertRequestBuilder upsertRequestBuilder) {
                    l.f("<this>", upsertRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((UpsertRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        postgrestQueryBuilder.getPostgrest().getSerializer();
        C0673c c0673c = d.f10459d;
        C1447z c1447z = C1447z.f12758c;
        l.k();
        throw null;
    }

    public final <T> Object insert(T t7, k kVar, c<? super PostgrestResult> cVar) {
        r.H(t7);
        getPostgrest().getSerializer();
        C0673c c0673c = d.f10459d;
        C1447z c1447z = C1447z.f12758c;
        l.k();
        throw null;
    }

    public static Object update$default(PostgrestQueryBuilder postgrestQueryBuilder, Object obj, k kVar, c cVar, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            AnonymousClass7 anonymousClass7 = new k() { // from class: io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder.update.7
                public final void invoke(PostgrestRequestBuilder postgrestRequestBuilder) {
                    l.f("<this>", postgrestRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((PostgrestRequestBuilder) obj3);
                    return C.a;
                }
            };
        }
        postgrestQueryBuilder.getPostgrest().getSerializer();
        C0673c c0673c = d.f10459d;
        l.k();
        throw null;
    }

    public static Object insert$default(PostgrestQueryBuilder postgrestQueryBuilder, Object obj, k kVar, c cVar, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            AnonymousClass6 anonymousClass6 = new k() { // from class: io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder.insert.6
                public final void invoke(InsertRequestBuilder insertRequestBuilder) {
                    l.f("<this>", insertRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((InsertRequestBuilder) obj3);
                    return C.a;
                }
            };
        }
        r.H(obj);
        postgrestQueryBuilder.getPostgrest().getSerializer();
        C0673c c0673c = d.f10459d;
        C1447z c1447z = C1447z.f12758c;
        l.k();
        throw null;
    }

    public final <T> Object upsert(T t7, k kVar, c<? super PostgrestResult> cVar) {
        r.H(t7);
        getPostgrest().getSerializer();
        C0673c c0673c = d.f10459d;
        C1447z c1447z = C1447z.f12758c;
        l.k();
        throw null;
    }

    public static Object upsert$default(PostgrestQueryBuilder postgrestQueryBuilder, Object obj, k kVar, c cVar, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            C11377 c11377 = new k() { // from class: io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder.upsert.7
                public final void invoke(UpsertRequestBuilder upsertRequestBuilder) {
                    l.f("<this>", upsertRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((UpsertRequestBuilder) obj3);
                    return C.a;
                }
            };
        }
        r.H(obj);
        postgrestQueryBuilder.getPostgrest().getSerializer();
        C0673c c0673c = d.f10459d;
        C1447z c1447z = C1447z.f12758c;
        l.k();
        throw null;
    }
}
