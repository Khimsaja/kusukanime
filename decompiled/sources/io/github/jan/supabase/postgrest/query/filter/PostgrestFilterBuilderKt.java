package io.github.jan.supabase.postgrest.query.filter;

import A6.b;
import P3.E;
import P3.q;
import e4.k;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0081\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"formatJoiningFilter", "", "Lio/github/jan/supabase/postgrest/query/filter/PostgrestFilterBuilder;", "filter", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "postgrest-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PostgrestFilterBuilderKt {
    public static final String formatJoiningFilter(PostgrestFilterBuilder postgrestFilterBuilder, k kVar) {
        l.f("<this>", postgrestFilterBuilder);
        l.f("filter", kVar);
        PostgrestFilterBuilder postgrestFilterBuilder2 = new PostgrestFilterBuilder(postgrestFilterBuilder.getPropertyConversionMethod(), null, true, 2, null);
        kVar.invoke(postgrestFilterBuilder2);
        return b.d(')', "(", q.y0(E.q0(postgrestFilterBuilder2.getParams()), ",", null, null, PostgrestFilterBuilderKt$formatJoiningFilter$formattedFilter$1.INSTANCE, 30));
    }
}
