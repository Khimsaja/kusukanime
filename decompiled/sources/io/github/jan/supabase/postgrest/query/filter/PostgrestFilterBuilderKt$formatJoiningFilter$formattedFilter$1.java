package io.github.jan.supabase.postgrest.query.filter;

import O3.l;
import P3.q;
import b1.AbstractC0703b;
import e4.k;
import kotlin.Metadata;
import z5.AbstractC2517v;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
/* loaded from: classes.dex */
public final class PostgrestFilterBuilderKt$formatJoiningFilter$formattedFilter$1 implements k {
    public static final PostgrestFilterBuilderKt$formatJoiningFilter$formattedFilter$1 INSTANCE = new PostgrestFilterBuilderKt$formatJoiningFilter$formattedFilter$1();

    @Override // e4.k
    public final CharSequence invoke(final l lVar) {
        kotlin.jvm.internal.l.f("it", lVar);
        return q.y0((Iterable) lVar.f7529l, ",", null, null, new k() { // from class: io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilderKt$formatJoiningFilter$formattedFilter$1.1
            @Override // e4.k
            public final CharSequence invoke(String str) {
                kotlin.jvm.internal.l.f("filter", str);
                boolean z7 = false;
                if (AbstractC2517v.T(str, "(", false) && AbstractC2517v.L(str, ")", false)) {
                    z7 = true;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((String) lVar.f7528k);
                return AbstractC0703b.m(sb, z7 ? "" : ".", str);
            }
        }, 30);
    }
}
