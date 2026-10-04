package io.github.jan.supabase.postgrest.query.filter;

import A6.b;
import P3.E;
import P3.q;
import P3.r;
import P3.y;
import e4.k;
import io.github.jan.supabase.auth.PostgrestFilterDSL;
import io.github.jan.supabase.postgrest.PropertyConversionMethod;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import l4.InterfaceC1442u;

@PostgrestFilterDSL
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eJ \u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0001J\u0016\u0010!\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0001J\u0016\u0010\"\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0001J\u0016\u0010#\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0001J\u0016\u0010$\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0001J\u0016\u0010%\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0001J\u0016\u0010&\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006J\u001c\u0010(\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007J\u001c\u0010*\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007J\u001c\u0010+\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007J\u001c\u0010,\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007J\u0016\u0010-\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006J\u0016\u0010.\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006J\u0016\u0010/\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006J\u001d\u00100\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u00101J\u001c\u00102\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007J\"\u00104\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000106J\"\u00107\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000106J\"\u00108\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000106J\"\u00109\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000106J\"\u0010:\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000106J\"\u0010;\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000106J\"\u0010<\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000106J\"\u0010=\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000106J\"\u0010>\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000106J@\u0010?\u001a\u00020\u00182\b\b\u0002\u0010@\u001a\u00020\t2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00062\u001c\u0010\u001f\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00180B¢\u0006\u0002\bC¢\u0006\u0002\bDH\u0087\bø\u0001\u0000J@\u0010E\u001a\u00020\u00182\b\b\u0002\u0010@\u001a\u00020\t2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00062\u001c\u0010\u001f\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00180B¢\u0006\u0002\bC¢\u0006\u0002\bDH\u0087\bø\u0001\u0000J*\u0010F\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u00062\u0006\u0010H\u001a\u00020I2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0006J\u001c\u0010K\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007J\u001c\u0010L\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007J\u001c\u0010M\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007J\u001c\u0010N\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007J\u001c\u0010O\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007J\u001c\u0010P\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007J2\u0010 \u001a\u00020\u0018\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010R*\u000e\u0012\u0004\u0012\u0002HQ\u0012\u0004\u0012\u0002HR0S2\u0006\u0010\u001c\u001a\u0002HRH\u0086\u0004¢\u0006\u0002\u0010TJ2\u0010!\u001a\u00020\u0018\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010R*\u000e\u0012\u0004\u0012\u0002HQ\u0012\u0004\u0012\u0002HR0S2\u0006\u0010\u001c\u001a\u0002HRH\u0086\u0004¢\u0006\u0002\u0010TJ2\u0010\"\u001a\u00020\u0018\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010R*\u000e\u0012\u0004\u0012\u0002HQ\u0012\u0004\u0012\u0002HR0S2\u0006\u0010\u001c\u001a\u0002HRH\u0086\u0004¢\u0006\u0002\u0010TJ2\u0010#\u001a\u00020\u0018\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010R*\u000e\u0012\u0004\u0012\u0002HQ\u0012\u0004\u0012\u0002HR0S2\u0006\u0010\u001c\u001a\u0002HRH\u0086\u0004¢\u0006\u0002\u0010TJ2\u0010%\u001a\u00020\u0018\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010R*\u000e\u0012\u0004\u0012\u0002HQ\u0012\u0004\u0012\u0002HR0S2\u0006\u0010\u001c\u001a\u0002HRH\u0086\u0004¢\u0006\u0002\u0010TJ2\u0010$\u001a\u00020\u0018\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010R*\u000e\u0012\u0004\u0012\u0002HQ\u0012\u0004\u0012\u0002HR0S2\u0006\u0010\u001c\u001a\u0002HRH\u0086\u0004¢\u0006\u0002\u0010TJ-\u0010&\u001a\u00020\u0018\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010R*\u000e\u0012\u0004\u0012\u0002HQ\u0012\u0004\u0012\u0002HR0S2\u0006\u0010'\u001a\u00020\u0006H\u0086\u0004J-\u0010.\u001a\u00020\u0018\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010R*\u000e\u0012\u0004\u0012\u0002HQ\u0012\u0004\u0012\u0002HR0S2\u0006\u0010'\u001a\u00020\u0006H\u0086\u0004J-\u0010-\u001a\u00020\u0018\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010R*\u000e\u0012\u0004\u0012\u0002HQ\u0012\u0004\u0012\u0002HR0S2\u0006\u0010'\u001a\u00020\u0006H\u0086\u0004J-\u0010/\u001a\u00020\u0018\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010R*\u000e\u0012\u0004\u0012\u0002HQ\u0012\u0004\u0012\u0002HR0S2\u0006\u0010'\u001a\u00020\u0006H\u0086\u0004J4\u0010U\u001a\u00020\u0018\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010R*\u000e\u0012\u0004\u0012\u0002HQ\u0012\u0004\u0012\u0002HR0S2\b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u0086\u0004¢\u0006\u0002\u0010VJ3\u00102\u001a\u00020\u0018\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010R*\u000e\u0012\u0004\u0012\u0002HQ\u0012\u0004\u0012\u0002HR0S2\f\u0010W\u001a\b\u0012\u0004\u0012\u0002HR0\u0007H\u0086\u0004J9\u0010<\u001a\u00020\u0018\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010R*\u000e\u0012\u0004\u0012\u0002HQ\u0012\u0004\u0012\u0002HR0S2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000106H\u0086\u0004J9\u0010:\u001a\u00020\u0018\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010R*\u000e\u0012\u0004\u0012\u0002HQ\u0012\u0004\u0012\u0002HR0S2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000106H\u0086\u0004J9\u0010=\u001a\u00020\u0018\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010R*\u000e\u0012\u0004\u0012\u0002HQ\u0012\u0004\u0012\u0002HR0S2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000106H\u0086\u0004J9\u0010;\u001a\u00020\u0018\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010R*\u000e\u0012\u0004\u0012\u0002HQ\u0012\u0004\u0012\u0002HR0S2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000106H\u0086\u0004J9\u0010>\u001a\u00020\u0018\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010R*\u000e\u0012\u0004\u0012\u0002HQ\u0012\u0004\u0012\u0002HR0S2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000106H\u0086\u0004J3\u0010P\u001a\u00020\u0018\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010R*\u000e\u0012\u0004\u0012\u0002HQ\u0012\u0004\u0012\u0002HR0S2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0086\u0004J3\u0010K\u001a\u00020\u0018\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010R*\u000e\u0012\u0004\u0012\u0002HQ\u0012\u0004\u0012\u0002HR0S2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0086\u0004J3\u0010L\u001a\u00020\u0018\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010R*\u000e\u0012\u0004\u0012\u0002HQ\u0012\u0004\u0012\u0002HR0S2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0086\u0004R\u001c\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR.\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u00058\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R#\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006X"}, d2 = {"Lio/github/jan/supabase/postgrest/query/filter/PostgrestFilterBuilder;", "", "propertyConversionMethod", "Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "_params", "", "", "", "isInLogicalExpression", "", "<init>", "(Lio/github/jan/supabase/postgrest/PropertyConversionMethod;Ljava/util/Map;Z)V", "getPropertyConversionMethod$annotations", "()V", "getPropertyConversionMethod", "()Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "get_params$annotations", "get_params", "()Ljava/util/Map;", "()Z", "params", "", "getParams", "filterNot", "", "column", "operator", "Lio/github/jan/supabase/postgrest/query/filter/FilterOperator;", "value", "operation", "Lio/github/jan/supabase/postgrest/query/filter/FilterOperation;", "filter", "eq", "neq", "gt", "gte", "lte", "lt", "like", "pattern", "likeAll", "patterns", "likeAny", "ilikeAll", "ilikeAny", "ilike", "match", "imatch", "exact", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "isIn", "values", "sl", "range", "Lkotlin/Pair;", "sr", "nxl", "nxr", "rangeLte", "rangeGte", "rangeLt", "rangeGt", "adjacent", "or", "negate", "referencedTable", "Lkotlin/Function1;", "Lio/github/jan/supabase/auth/PostgrestFilterDSL;", "Lkotlin/ExtensionFunctionType;", "and", "textSearch", "query", "textSearchType", "Lio/github/jan/supabase/postgrest/query/filter/TextSearchType;", "config", "contains", "contained", "cs", "cd", "ov", "overlaps", "T", "V", "Lkotlin/reflect/KProperty1;", "(Lkotlin/reflect/KProperty1;Ljava/lang/Object;)V", "isExact", "(Lkotlin/reflect/KProperty1;Ljava/lang/Boolean;)V", "list", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PostgrestFilterBuilder {
    private final Map<String, List<String>> _params;
    private final boolean isInLogicalExpression;
    private final PropertyConversionMethod propertyConversionMethod;

    public PostgrestFilterBuilder(PropertyConversionMethod propertyConversionMethod, Map<String, List<String>> map, boolean z7) {
        l.f("propertyConversionMethod", propertyConversionMethod);
        l.f("_params", map);
        this.propertyConversionMethod = propertyConversionMethod;
        this._params = map;
        this.isInLogicalExpression = z7;
    }

    public static /* synthetic */ void and$default(PostgrestFilterBuilder postgrestFilterBuilder, boolean z7, String str, k kVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        l.f("filter", kVar);
        StringBuilder sb = new StringBuilder();
        if (z7) {
            sb.append("not.");
        }
        if (str != null) {
            sb.append(str.concat("."));
        }
        String string = sb.toString();
        PostgrestFilterBuilder postgrestFilterBuilder2 = new PostgrestFilterBuilder(postgrestFilterBuilder.getPropertyConversionMethod(), null, true, 2, null);
        kVar.invoke(postgrestFilterBuilder2);
        String strD = b.d(')', "(", q.y0(E.q0(postgrestFilterBuilder2.getParams()), ",", null, null, PostgrestFilterBuilderKt$formatJoiningFilter$formattedFilter$1.INSTANCE, 30));
        if (l.a(strD, "()")) {
            return;
        }
        Map<String, List<String>> map = postgrestFilterBuilder.get_params();
        String strH = b.h(string, "and");
        List listH = r.H(strD);
        boolean isInLogicalExpression = postgrestFilterBuilder.getIsInLogicalExpression();
        List<String> list = y.f7779k;
        if (isInLogicalExpression) {
            List<String> list2 = postgrestFilterBuilder.get_params().get(string + "and");
            if (list2 != null) {
                list = list2;
            }
        }
        map.put(strH, q.G0(listH, list));
    }

    public static /* synthetic */ void getPropertyConversionMethod$annotations() {
    }

    public static /* synthetic */ void get_params$annotations() {
    }

    public static /* synthetic */ void or$default(PostgrestFilterBuilder postgrestFilterBuilder, boolean z7, String str, k kVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        l.f("filter", kVar);
        StringBuilder sb = new StringBuilder();
        if (z7) {
            sb.append("not.");
        }
        if (str != null) {
            sb.append(str.concat("."));
        }
        String string = sb.toString();
        PostgrestFilterBuilder postgrestFilterBuilder2 = new PostgrestFilterBuilder(postgrestFilterBuilder.getPropertyConversionMethod(), null, true, 2, null);
        kVar.invoke(postgrestFilterBuilder2);
        String strD = b.d(')', "(", q.y0(E.q0(postgrestFilterBuilder2.getParams()), ",", null, null, PostgrestFilterBuilderKt$formatJoiningFilter$formattedFilter$1.INSTANCE, 30));
        if (l.a(strD, "()")) {
            return;
        }
        Map<String, List<String>> map = postgrestFilterBuilder.get_params();
        String strH = b.h(string, "or");
        List listH = r.H(strD);
        boolean isInLogicalExpression = postgrestFilterBuilder.getIsInLogicalExpression();
        List<String> list = y.f7779k;
        if (isInLogicalExpression) {
            List<String> list2 = postgrestFilterBuilder.get_params().get(string + "or");
            if (list2 != null) {
                list = list2;
            }
        }
        map.put(strH, q.G0(listH, list));
    }

    public static /* synthetic */ PostgrestFilterBuilder textSearch$default(PostgrestFilterBuilder postgrestFilterBuilder, String str, String str2, TextSearchType textSearchType, String str3, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        return postgrestFilterBuilder.textSearch(str, str2, textSearchType, str3);
    }

    public final void adjacent(String str, O3.l lVar) {
        l.f("column", str);
        l.f("range", lVar);
        FilterOperator filterOperator = FilterOperator.ADJ;
        StringBuilder sb = new StringBuilder("(");
        sb.append(lVar.f7528k);
        sb.append(',');
        filter(str, filterOperator, b.i(sb, lVar.f7529l, ')'));
    }

    @PostgrestFilterDSL
    public final void and(boolean z7, String str, k kVar) {
        l.f("filter", kVar);
        StringBuilder sb = new StringBuilder();
        if (z7) {
            sb.append("not.");
        }
        if (str != null) {
            sb.append(str.concat("."));
        }
        String string = sb.toString();
        PostgrestFilterBuilder postgrestFilterBuilder = new PostgrestFilterBuilder(getPropertyConversionMethod(), null, true, 2, null);
        kVar.invoke(postgrestFilterBuilder);
        String strD = b.d(')', "(", q.y0(E.q0(postgrestFilterBuilder.getParams()), ",", null, null, PostgrestFilterBuilderKt$formatJoiningFilter$formattedFilter$1.INSTANCE, 30));
        if (l.a(strD, "()")) {
            return;
        }
        Map<String, List<String>> map = get_params();
        String strH = b.h(string, "and");
        List listH = r.H(strD);
        boolean isInLogicalExpression = getIsInLogicalExpression();
        List<String> list = y.f7779k;
        if (isInLogicalExpression) {
            List<String> list2 = get_params().get(string + "and");
            if (list2 != null) {
                list = list2;
            }
        }
        map.put(strH, q.G0(listH, list));
    }

    public final void cd(String column, List<? extends Object> values) {
        l.f("column", column);
        l.f("values", values);
        contained(column, values);
    }

    public final void contained(String column, List<? extends Object> values) {
        l.f("column", column);
        l.f("values", values);
        filter(column, FilterOperator.CD, b.j(new StringBuilder("{"), q.y0(values, ",", null, null, null, 62), '}'));
    }

    public final void contains(String column, List<? extends Object> values) {
        l.f("column", column);
        l.f("values", values);
        filter(column, FilterOperator.CS, b.j(new StringBuilder("{"), q.y0(values, ",", null, null, null, 62), '}'));
    }

    public final void cs(String column, List<? extends Object> values) {
        l.f("column", column);
        l.f("values", values);
        contains(column, values);
    }

    public final void eq(String column, Object value) {
        l.f("column", column);
        l.f("value", value);
        filter(column, FilterOperator.EQ, value);
    }

    public final void exact(String column, Boolean value) {
        l.f("column", column);
        filter(column, FilterOperator.IS, value);
    }

    public final void filter(String column, FilterOperator operator, Object value) {
        l.f("column", column);
        l.f("operator", operator);
        List<String> list = getParams().get(column);
        if (list == null) {
            list = y.f7779k;
        }
        this._params.put(column, q.G0(list, r.H(operator.getIdentifier() + '.' + value)));
    }

    public final void filterNot(String column, FilterOperator operator, Object value) {
        l.f("column", column);
        l.f("operator", operator);
        List<String> list = getParams().get(column);
        if (list == null) {
            list = y.f7779k;
        }
        this._params.put(column, q.G0(list, r.H("not." + operator.getIdentifier() + '.' + value)));
    }

    public final Map<String, List<String>> getParams() {
        return E.s0(this._params);
    }

    public final PropertyConversionMethod getPropertyConversionMethod() {
        return this.propertyConversionMethod;
    }

    public final Map<String, List<String>> get_params() {
        return this._params;
    }

    public final void gt(String column, Object value) {
        l.f("column", column);
        l.f("value", value);
        filter(column, FilterOperator.GT, value);
    }

    public final void gte(String column, Object value) {
        l.f("column", column);
        l.f("value", value);
        filter(column, FilterOperator.GTE, value);
    }

    public final void ilike(String column, String pattern) {
        l.f("column", column);
        l.f("pattern", pattern);
        filter(column, FilterOperator.ILIKE, pattern);
    }

    public final void ilikeAll(String column, List<String> patterns) {
        l.f("column", column);
        l.f("patterns", patterns);
        List<String> list = getParams().get(column);
        if (list == null) {
            list = y.f7779k;
        }
        this._params.put(column, q.G0(list, r.H("ilike(all).{" + q.y0(patterns, ",", null, null, null, 62) + '}')));
    }

    public final void ilikeAny(String column, List<String> patterns) {
        l.f("column", column);
        l.f("patterns", patterns);
        List<String> list = getParams().get(column);
        if (list == null) {
            list = y.f7779k;
        }
        this._params.put(column, q.G0(list, r.H("ilike(any).{" + q.y0(patterns, ",", null, null, null, 62) + '}')));
    }

    public final void imatch(String column, String pattern) {
        l.f("column", column);
        l.f("pattern", pattern);
        filter(column, FilterOperator.IMATCH, pattern);
    }

    public final <T, V> void isExact(InterfaceC1442u interfaceC1442u, Boolean bool) {
        l.f("<this>", interfaceC1442u);
        filter(new FilterOperation(this.propertyConversionMethod.invoke(interfaceC1442u), FilterOperator.IS, String.valueOf(bool)));
    }

    public final void isIn(String column, List<? extends Object> values) {
        l.f("column", column);
        l.f("values", values);
        filter(column, FilterOperator.IN, b.j(new StringBuilder("("), q.y0(values, ",", null, null, null, 62), ')'));
    }

    /* renamed from: isInLogicalExpression, reason: from getter */
    public final boolean getIsInLogicalExpression() {
        return this.isInLogicalExpression;
    }

    public final void like(String column, String pattern) {
        l.f("column", column);
        l.f("pattern", pattern);
        filter(column, FilterOperator.LIKE, pattern);
    }

    public final void likeAll(String column, List<String> patterns) {
        l.f("column", column);
        l.f("patterns", patterns);
        List<String> list = getParams().get(column);
        if (list == null) {
            list = y.f7779k;
        }
        this._params.put(column, q.G0(list, r.H("like(all).{" + q.y0(patterns, ",", null, null, null, 62) + '}')));
    }

    public final void likeAny(String column, List<String> patterns) {
        l.f("column", column);
        l.f("patterns", patterns);
        List<String> list = getParams().get(column);
        if (list == null) {
            list = y.f7779k;
        }
        this._params.put(column, q.G0(list, r.H("like(any).{" + q.y0(patterns, ",", null, null, null, 62) + '}')));
    }

    public final void lt(String column, Object value) {
        l.f("column", column);
        l.f("value", value);
        filter(column, FilterOperator.LT, value);
    }

    public final void lte(String column, Object value) {
        l.f("column", column);
        l.f("value", value);
        filter(column, FilterOperator.LTE, value);
    }

    public final void match(String column, String pattern) {
        l.f("column", column);
        l.f("pattern", pattern);
        filter(column, FilterOperator.MATCH, pattern);
    }

    public final void neq(String column, Object value) {
        l.f("column", column);
        l.f("value", value);
        filter(column, FilterOperator.NEQ, value);
    }

    public final void nxl(String str, O3.l lVar) {
        l.f("column", str);
        l.f("range", lVar);
        FilterOperator filterOperator = FilterOperator.NXL;
        StringBuilder sb = new StringBuilder("(");
        sb.append(lVar.f7528k);
        sb.append(',');
        filter(str, filterOperator, b.i(sb, lVar.f7529l, ')'));
    }

    public final void nxr(String str, O3.l lVar) {
        l.f("column", str);
        l.f("range", lVar);
        FilterOperator filterOperator = FilterOperator.NXR;
        StringBuilder sb = new StringBuilder("(");
        sb.append(lVar.f7528k);
        sb.append(',');
        filter(str, filterOperator, b.i(sb, lVar.f7529l, ')'));
    }

    @PostgrestFilterDSL
    public final void or(boolean z7, String str, k kVar) {
        l.f("filter", kVar);
        StringBuilder sb = new StringBuilder();
        if (z7) {
            sb.append("not.");
        }
        if (str != null) {
            sb.append(str.concat("."));
        }
        String string = sb.toString();
        PostgrestFilterBuilder postgrestFilterBuilder = new PostgrestFilterBuilder(getPropertyConversionMethod(), null, true, 2, null);
        kVar.invoke(postgrestFilterBuilder);
        String strD = b.d(')', "(", q.y0(E.q0(postgrestFilterBuilder.getParams()), ",", null, null, PostgrestFilterBuilderKt$formatJoiningFilter$formattedFilter$1.INSTANCE, 30));
        if (l.a(strD, "()")) {
            return;
        }
        Map<String, List<String>> map = get_params();
        String strH = b.h(string, "or");
        List listH = r.H(strD);
        boolean isInLogicalExpression = getIsInLogicalExpression();
        List<String> list = y.f7779k;
        if (isInLogicalExpression) {
            List<String> list2 = get_params().get(string + "or");
            if (list2 != null) {
                list = list2;
            }
        }
        map.put(strH, q.G0(listH, list));
    }

    public final void ov(String column, List<? extends Object> values) {
        l.f("column", column);
        l.f("values", values);
        overlaps(column, values);
    }

    public final void overlaps(String column, List<? extends Object> values) {
        l.f("column", column);
        l.f("values", values);
        filter(column, FilterOperator.OV, b.j(new StringBuilder("{"), q.y0(values, ",", null, null, null, 62), '}'));
    }

    public final void rangeGt(String str, O3.l lVar) {
        l.f("column", str);
        l.f("range", lVar);
        sr(str, lVar);
    }

    public final void rangeGte(String str, O3.l lVar) {
        l.f("column", str);
        l.f("range", lVar);
        nxl(str, lVar);
    }

    public final void rangeLt(String str, O3.l lVar) {
        l.f("column", str);
        l.f("range", lVar);
        sl(str, lVar);
    }

    public final void rangeLte(String str, O3.l lVar) {
        l.f("column", str);
        l.f("range", lVar);
        nxr(str, lVar);
    }

    public final void sl(String str, O3.l lVar) {
        l.f("column", str);
        l.f("range", lVar);
        FilterOperator filterOperator = FilterOperator.SL;
        StringBuilder sb = new StringBuilder("(");
        sb.append(lVar.f7528k);
        sb.append(',');
        filter(str, filterOperator, b.i(sb, lVar.f7529l, ')'));
    }

    public final void sr(String str, O3.l lVar) {
        l.f("column", str);
        l.f("range", lVar);
        FilterOperator filterOperator = FilterOperator.SR;
        StringBuilder sb = new StringBuilder("(");
        sb.append(lVar.f7528k);
        sb.append(',');
        filter(str, filterOperator, b.i(sb, lVar.f7529l, ')'));
    }

    public final PostgrestFilterBuilder textSearch(String column, String query, TextSearchType textSearchType, String config) {
        l.f("column", column);
        l.f("query", query);
        l.f("textSearchType", textSearchType);
        String strD = config == null ? "" : b.d(')', "(", config);
        this._params.put(column, r.H(textSearchType.getIdentifier() + "fts" + strD + '.' + query));
        return this;
    }

    public final <T, V> void eq(InterfaceC1442u interfaceC1442u, V v5) {
        l.f("<this>", interfaceC1442u);
        filter(new FilterOperation(this.propertyConversionMethod.invoke(interfaceC1442u), FilterOperator.EQ, String.valueOf(v5)));
    }

    public final <T, V> void gt(InterfaceC1442u interfaceC1442u, V v5) {
        l.f("<this>", interfaceC1442u);
        filter(new FilterOperation(this.propertyConversionMethod.invoke(interfaceC1442u), FilterOperator.GT, String.valueOf(v5)));
    }

    public final <T, V> void gte(InterfaceC1442u interfaceC1442u, V v5) {
        l.f("<this>", interfaceC1442u);
        filter(new FilterOperation(this.propertyConversionMethod.invoke(interfaceC1442u), FilterOperator.GTE, String.valueOf(v5)));
    }

    public final <T, V> void ilike(InterfaceC1442u interfaceC1442u, String str) {
        l.f("<this>", interfaceC1442u);
        l.f("pattern", str);
        filter(new FilterOperation(this.propertyConversionMethod.invoke(interfaceC1442u), FilterOperator.ILIKE, str));
    }

    public final <T, V> void imatch(InterfaceC1442u interfaceC1442u, String str) {
        l.f("<this>", interfaceC1442u);
        l.f("pattern", str);
        filter(new FilterOperation(this.propertyConversionMethod.invoke(interfaceC1442u), FilterOperator.IMATCH, str));
    }

    public final <T, V> void like(InterfaceC1442u interfaceC1442u, String str) {
        l.f("<this>", interfaceC1442u);
        l.f("pattern", str);
        filter(new FilterOperation(this.propertyConversionMethod.invoke(interfaceC1442u), FilterOperator.LIKE, str));
    }

    public final <T, V> void lt(InterfaceC1442u interfaceC1442u, V v5) {
        l.f("<this>", interfaceC1442u);
        filter(new FilterOperation(this.propertyConversionMethod.invoke(interfaceC1442u), FilterOperator.LT, String.valueOf(v5)));
    }

    public final <T, V> void lte(InterfaceC1442u interfaceC1442u, V v5) {
        l.f("<this>", interfaceC1442u);
        filter(new FilterOperation(this.propertyConversionMethod.invoke(interfaceC1442u), FilterOperator.LTE, String.valueOf(v5)));
    }

    public final <T, V> void match(InterfaceC1442u interfaceC1442u, String str) {
        l.f("<this>", interfaceC1442u);
        l.f("pattern", str);
        filter(new FilterOperation(this.propertyConversionMethod.invoke(interfaceC1442u), FilterOperator.MATCH, str));
    }

    public final <T, V> void neq(InterfaceC1442u interfaceC1442u, V v5) {
        l.f("<this>", interfaceC1442u);
        filter(new FilterOperation(this.propertyConversionMethod.invoke(interfaceC1442u), FilterOperator.NEQ, String.valueOf(v5)));
    }

    public final <T, V> void rangeGt(InterfaceC1442u interfaceC1442u, O3.l lVar) {
        l.f("<this>", interfaceC1442u);
        l.f("range", lVar);
        rangeGt(this.propertyConversionMethod.invoke(interfaceC1442u), lVar);
    }

    public final <T, V> void rangeGte(InterfaceC1442u interfaceC1442u, O3.l lVar) {
        l.f("<this>", interfaceC1442u);
        l.f("range", lVar);
        rangeGte(this.propertyConversionMethod.invoke(interfaceC1442u), lVar);
    }

    public final <T, V> void rangeLt(InterfaceC1442u interfaceC1442u, O3.l lVar) {
        l.f("<this>", interfaceC1442u);
        l.f("range", lVar);
        rangeLt(this.propertyConversionMethod.invoke(interfaceC1442u), lVar);
    }

    public final <T, V> void rangeLte(InterfaceC1442u interfaceC1442u, O3.l lVar) {
        l.f("<this>", interfaceC1442u);
        l.f("range", lVar);
        rangeLte(this.propertyConversionMethod.invoke(interfaceC1442u), lVar);
    }

    public final void filter(FilterOperation operation) {
        l.f("operation", operation);
        filter(operation.getColumn(), operation.getOperator(), operation.getValue());
    }

    public final void filterNot(FilterOperation operation) {
        l.f("operation", operation);
        filterNot(operation.getColumn(), operation.getOperator(), operation.getValue());
    }

    public /* synthetic */ PostgrestFilterBuilder(PropertyConversionMethod propertyConversionMethod, Map map, boolean z7, int i7, f fVar) {
        this(propertyConversionMethod, (i7 & 2) != 0 ? new LinkedHashMap() : map, (i7 & 4) != 0 ? false : z7);
    }

    public final <T, V> void adjacent(InterfaceC1442u interfaceC1442u, O3.l lVar) {
        l.f("<this>", interfaceC1442u);
        l.f("range", lVar);
        adjacent(this.propertyConversionMethod.invoke(interfaceC1442u), lVar);
    }

    public final <T, V> void contained(InterfaceC1442u interfaceC1442u, List<? extends Object> list) {
        l.f("<this>", interfaceC1442u);
        l.f("values", list);
        contained(this.propertyConversionMethod.invoke(interfaceC1442u), list);
    }

    public final <T, V> void contains(InterfaceC1442u interfaceC1442u, List<? extends Object> list) {
        l.f("<this>", interfaceC1442u);
        l.f("values", list);
        contains(this.propertyConversionMethod.invoke(interfaceC1442u), list);
    }

    public final <T, V> void isIn(InterfaceC1442u interfaceC1442u, List<? extends V> list) {
        l.f("<this>", interfaceC1442u);
        l.f("list", list);
        filter(new FilterOperation(this.propertyConversionMethod.invoke(interfaceC1442u), FilterOperator.IN, b.j(new StringBuilder("("), q.y0(list, ",", null, null, null, 62), ')')));
    }

    public final <T, V> void overlaps(InterfaceC1442u interfaceC1442u, List<? extends Object> list) {
        l.f("<this>", interfaceC1442u);
        l.f("values", list);
        overlaps(this.propertyConversionMethod.invoke(interfaceC1442u), list);
    }
}
