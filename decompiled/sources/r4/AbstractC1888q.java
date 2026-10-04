package r4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m5.C1513b;
import m5.C1523l;
import n5.C1572i;
import n5.b0;
import u4.AbstractC2108n;
import u4.EnumC2100f;
import u4.EnumC2117x;
import u4.InterfaceC2112s;
import x4.C2256B;
import x4.C2270P;
import x4.C2283j;

/* renamed from: r4.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1888q {
    public static final C2256B a;

    static {
        p5.l lVar = p5.l.a;
        t4.n nVar = new t4.n(p5.l.f14455b, AbstractC1887p.f15023f, 1);
        EnumC2100f enumC2100f = EnumC2100f.f16311k;
        W4.e eVarG = AbstractC1887p.f15024g.a.g();
        C1513b c1513b = C1523l.f12991e;
        C2256B c2256b = new C2256B(nVar, eVarG, c1513b);
        c2256b.f17348r = EnumC2117x.f16345o;
        H4.o oVar = AbstractC2108n.f16322e;
        if (oVar == null) {
            C2256B.S(9);
            throw null;
        }
        c2256b.f17349s = oVar;
        List listH = P3.r.H(C2270P.Q0(c2256b, b0.f13391n, W4.e.e("T"), 0, c1513b));
        if (c2256b.f17351u != null) {
            throw new IllegalStateException("Type parameters are already set for " + c2256b.getName());
        }
        ArrayList arrayList = new ArrayList(listH);
        c2256b.f17351u = arrayList;
        c2256b.f17350t = new C1572i(c2256b, arrayList, c2256b.f17352v, c2256b.f17353w);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            C2256B.S(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C2283j) ((InterfaceC2112s) it.next())).f17494q = c2256b.g();
        }
        a = c2256b;
    }
}
