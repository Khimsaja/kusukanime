package l5;

import P3.F;
import R4.U;
import R4.Y;
import R4.Z;
import f1.AbstractC0870c;
import j5.C1354i;
import j5.C1356k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m5.C1523l;
import n5.b0;
import u4.N;
import v4.C2158f;
import v4.C2159g;
import x4.AbstractC2276c;

/* renamed from: l5.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1468u extends AbstractC2276c {

    /* renamed from: u, reason: collision with root package name */
    public final C1356k f12841u;

    /* renamed from: v, reason: collision with root package name */
    public final Z f12842v;

    /* renamed from: w, reason: collision with root package name */
    public final C1448a f12843w;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1468u(C1356k c1356k, Z z7, int i7) {
        b0 b0Var;
        kotlin.jvm.internal.l.f("c", c1356k);
        C1354i c1354i = c1356k.a;
        C1523l c1523l = c1354i.a;
        C2158f c2158f = C2159g.a;
        W4.e eVarU = AbstractC0870c.U(c1356k.f12439b, z7.f8354o);
        Y y7 = z7.f8356q;
        kotlin.jvm.internal.l.e("getVariance(...)", y7);
        int iOrdinal = y7.ordinal();
        if (iOrdinal == 0) {
            b0Var = b0.f13391n;
        } else if (iOrdinal == 1) {
            b0Var = b0.f13392o;
        } else {
            if (iOrdinal != 2) {
                throw new D6.r();
            }
            b0Var = b0.f13390m;
        }
        b0 b0Var2 = b0Var;
        super(c1523l, c1356k.f12440c, c2158f, eVarU, b0Var2, z7.f8355p, i7, N.f16297m);
        this.f12841u = c1356k;
        this.f12842v = z7;
        this.f12843w = new C1448a(c1354i.a, new H4.u(13, this));
    }

    @Override // x4.AbstractC2282i
    public final List O0() {
        C1356k c1356k = this.f12841u;
        List listK0 = F.k0(this.f12842v, c1356k.f12441d);
        if (listK0.isEmpty()) {
            return P3.r.H(d5.e.e(this).o());
        }
        ArrayList arrayList = new ArrayList(P3.r.p(listK0, 10));
        Iterator it = listK0.iterator();
        while (it.hasNext()) {
            arrayList.add(c1356k.f12445h.g((U) it.next()));
        }
        return arrayList;
    }

    @Override // Q4.c, v4.InterfaceC2153a
    public final v4.h getAnnotations() {
        return this.f12843w;
    }
}
