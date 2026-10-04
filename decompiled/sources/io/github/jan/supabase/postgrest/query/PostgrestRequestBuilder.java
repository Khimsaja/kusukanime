package io.github.jan.supabase.postgrest.query;

import P3.q;
import P3.r;
import Q3.c;
import e4.k;
import io.github.jan.supabase.annotations.SupabaseExperimental;
import io.github.jan.supabase.auth.PostgrestFilterDSL;
import io.github.jan.supabase.postgrest.PropertyConversionMethod;
import io.github.jan.supabase.postgrest.query.Returning;
import io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder;
import io.ktor.http.ContentType;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k4.j;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import v.c0;

@PostgrestFilterDSL
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\u000bJ\u0017\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\b\u0010%\u001a\u00020\u001fH\u0007J,\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u00152\u0006\u0010&\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0015J\u001a\u0010,\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020-2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0015J\"\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020-2\u0006\u00100\u001a\u00020-2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0015J\u001a\u0010.\u001a\u00020\u001f2\u0006\u0010.\u001a\u0002012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0015J\u0006\u00102\u001a\u00020\u001fJ\u0006\u00103\u001a\u00020\u001fJB\u00104\u001a\u00020\u001f2\b\b\u0002\u00105\u001a\u00020*2\b\b\u0002\u00106\u001a\u00020*2\b\b\u0002\u00107\u001a\u00020*2\b\b\u0002\u00108\u001a\u00020*2\b\b\u0002\u00109\u001a\u00020*2\b\b\u0002\u0010:\u001a\u00020\u0015J*\u0010;\u001a\u00020\u001f2\u001c\u0010<\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u001f0=¢\u0006\u0002\b?¢\u0006\u0002\b@H\u0086\bø\u0001\u0000R\u001c\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R.\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00160\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0007\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0007\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006A"}, d2 = {"Lio/github/jan/supabase/postgrest/query/PostgrestRequestBuilder;", "", "propertyConversionMethod", "Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "<init>", "(Lio/github/jan/supabase/postgrest/PropertyConversionMethod;)V", "getPropertyConversionMethod$annotations", "()V", "getPropertyConversionMethod", "()Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "value", "Lio/github/jan/supabase/postgrest/query/Count;", "count", "getCount", "()Lio/github/jan/supabase/postgrest/query/Count;", "Lio/github/jan/supabase/postgrest/query/Returning;", "returning", "getReturning", "()Lio/github/jan/supabase/postgrest/query/Returning;", "params", "", "", "", "getParams$annotations", "getParams", "()Ljava/util/Map;", "headers", "Lio/ktor/http/HeadersBuilder;", "getHeaders$annotations", "getHeaders", "()Lio/ktor/http/HeadersBuilder;", "", "select", "columns", "Lio/github/jan/supabase/postgrest/query/Columns;", "select-fYsiLaM", "(Ljava/lang/String;)V", "single", "order", "column", "Lio/github/jan/supabase/postgrest/query/Order;", "nullsFirst", "", "referencedTable", "limit", "", "range", "from", "to", "Lkotlin/ranges/LongRange;", "geojson", "csv", "explain", "analyze", "verbose", "settings", "buffers", "wal", "format", "filter", "block", "Lkotlin/Function1;", "Lio/github/jan/supabase/postgrest/query/filter/PostgrestFilterBuilder;", "Lio/github/jan/supabase/auth/PostgrestFilterDSL;", "Lkotlin/ExtensionFunctionType;", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class PostgrestRequestBuilder {
    private Count count;
    private final HeadersBuilder headers;
    private final Map<String, List<String>> params;
    private final PropertyConversionMethod propertyConversionMethod;
    private Returning returning;

    public PostgrestRequestBuilder(PropertyConversionMethod propertyConversionMethod) {
        l.f("propertyConversionMethod", propertyConversionMethod);
        this.propertyConversionMethod = propertyConversionMethod;
        this.returning = Returning.Minimal.INSTANCE;
        this.params = new LinkedHashMap();
        this.headers = new HeadersBuilder(0, 1, null);
    }

    public static /* synthetic */ void explain$default(PostgrestRequestBuilder postgrestRequestBuilder, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, String str, int i7, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: explain");
        }
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        if ((i7 & 2) != 0) {
            z8 = false;
        }
        if ((i7 & 4) != 0) {
            z9 = false;
        }
        if ((i7 & 8) != 0) {
            z10 = false;
        }
        if ((i7 & 16) != 0) {
            z11 = false;
        }
        if ((i7 & 32) != 0) {
            str = ContentType.Text.TYPE;
        }
        postgrestRequestBuilder.explain(z7, z8, z9, z10, z11, str);
    }

    @SupabaseExperimental
    public static /* synthetic */ void getHeaders$annotations() {
    }

    @SupabaseExperimental
    public static /* synthetic */ void getParams$annotations() {
    }

    public static /* synthetic */ void getPropertyConversionMethod$annotations() {
    }

    public static /* synthetic */ void limit$default(PostgrestRequestBuilder postgrestRequestBuilder, long j7, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limit");
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        postgrestRequestBuilder.limit(j7, str);
    }

    public static /* synthetic */ void order$default(PostgrestRequestBuilder postgrestRequestBuilder, String str, Order order, boolean z7, String str2, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: order");
        }
        if ((i7 & 4) != 0) {
            z7 = false;
        }
        if ((i7 & 8) != 0) {
            str2 = null;
        }
        postgrestRequestBuilder.order(str, order, z7, str2);
    }

    public static /* synthetic */ void range$default(PostgrestRequestBuilder postgrestRequestBuilder, long j7, long j8, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: range");
        }
        if ((i7 & 4) != 0) {
            str = null;
        }
        postgrestRequestBuilder.range(j7, j8, str);
    }

    /* renamed from: select-fYsiLaM$default, reason: not valid java name */
    public static /* synthetic */ void m28selectfYsiLaM$default(PostgrestRequestBuilder postgrestRequestBuilder, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: select-fYsiLaM");
        }
        if ((i7 & 1) != 0) {
            str = Columns.INSTANCE.m20getALLU9NzzuM();
        }
        postgrestRequestBuilder.m29selectfYsiLaM(str);
    }

    public final void count(Count count) {
        l.f("count", count);
        this.count = count;
    }

    public final void csv() {
        this.headers.set(HttpHeaders.INSTANCE.getAccept(), "text/csv");
    }

    public final void explain(boolean analyze, boolean verbose, boolean settings, boolean buffers, boolean wal, String format) throws IOException {
        l.f("format", format);
        c cVarS = r.s();
        if (analyze) {
            cVarS.add("analyze");
        }
        if (verbose) {
            cVarS.add("verbose");
        }
        if (settings) {
            cVarS.add("settings");
        }
        if (buffers) {
            cVarS.add("buffers");
        }
        if (wal) {
            cVarS.add("wal");
        }
        String strY0 = q.y0(r.h(cVarS), "|", null, null, null, 62);
        String str = this.headers.get("Accept");
        if (str == null) {
            str = "application/json";
        }
        HeadersBuilder headersBuilder = this.headers;
        String accept = HttpHeaders.INSTANCE.getAccept();
        StringBuilder sbC = c0.c("application/vnd.pgrst.plan+", format, "; for=\"", str, "\"; options=");
        sbC.append(strY0);
        sbC.append(';');
        headersBuilder.set(accept, sbC.toString());
    }

    public final void filter(k kVar) {
        l.f("block", kVar);
        kVar.invoke(new PostgrestFilterBuilder(getPropertyConversionMethod(), getParams(), false, 4, null));
    }

    public final void geojson() {
        this.headers.set(HttpHeaders.INSTANCE.getAccept(), "application/geo+json");
    }

    public final Count getCount() {
        return this.count;
    }

    public final HeadersBuilder getHeaders() {
        return this.headers;
    }

    public final Map<String, List<String>> getParams() {
        return this.params;
    }

    public final PropertyConversionMethod getPropertyConversionMethod() {
        return this.propertyConversionMethod;
    }

    public final Returning getReturning() {
        return this.returning;
    }

    public final void limit(long count, String referencedTable) {
        this.params.put(referencedTable == null ? "limit" : referencedTable.concat(".limit"), r.H(String.valueOf(count)));
    }

    public final void order(String column, Order order, boolean nullsFirst, String referencedTable) {
        l.f("column", column);
        l.f("order", order);
        String strConcat = referencedTable != null ? referencedTable.concat(".order") : "order";
        List<String> list = this.params.get(strConcat);
        String str = list != null ? (String) q.t0(list) : null;
        String strConcat2 = str == null ? "" : str.concat(",");
        StringBuilder sb = new StringBuilder();
        sb.append(strConcat2);
        sb.append(column);
        sb.append('.');
        sb.append(order.getValue());
        sb.append('.');
        sb.append(nullsFirst ? "nullsfirst" : "nullslast");
        this.params.put(strConcat, r.H(sb.toString()));
    }

    public final void range(long from, long to, String referencedTable) {
        String strConcat = referencedTable == null ? "offset" : referencedTable.concat(".offset");
        String strConcat2 = referencedTable == null ? "limit" : referencedTable.concat(".limit");
        this.params.put(strConcat, r.H(String.valueOf(from)));
        this.params.put(strConcat2, r.H(String.valueOf((to - from) + 1)));
    }

    /* renamed from: select-fYsiLaM, reason: not valid java name */
    public final void m29selectfYsiLaM(String columns) {
        l.f("$v$c$io-github-jan-supabase-postgrest-query-Columns$-columns$0", columns);
        this.returning = new Returning.Representation(columns, null);
    }

    public final void single() {
        this.headers.set(HttpHeaders.INSTANCE.getAccept(), "application/vnd.pgrst.object+json");
    }

    public static /* synthetic */ void range$default(PostgrestRequestBuilder postgrestRequestBuilder, j jVar, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: range");
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        postgrestRequestBuilder.range(jVar, str);
    }

    public final void range(j jVar, String str) {
        l.f("range", jVar);
        range(jVar.f12680k, jVar.f12681l, str);
    }
}
