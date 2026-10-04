package M4;

import D6.r;
import java.util.List;
import kotlin.jvm.internal.l;
import n5.AbstractC1586x;
import n5.G;
import n5.P;
import n5.Q;
import n5.Y;
import n5.b0;

/* loaded from: classes.dex */
public final class e {
    public static Q a(u4.Q q6, a aVar, P p7, AbstractC1586x abstractC1586x) {
        l.f("typeAttr", aVar);
        l.f("typeParameterUpperBoundEraser", p7);
        if (!aVar.f6549c) {
            aVar = a.a(aVar, b.f6553k, false, null, null, 61);
        }
        int iOrdinal = aVar.f6548b.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return new G(abstractC1586x, b0.f13390m);
            }
            throw new r();
        }
        if (!q6.R().f13395l) {
            return new G(d5.e.e(q6).n(), b0.f13390m);
        }
        List parameters = abstractC1586x.t0().getParameters();
        l.e("getParameters(...)", parameters);
        return !parameters.isEmpty() ? new G(abstractC1586x, b0.f13392o) : Y.k(q6, aVar);
    }
}
