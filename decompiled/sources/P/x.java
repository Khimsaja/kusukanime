package P;

import O.C0486d;
import O.C0509o0;
import O.C0517t;
import O.D0;
import O.x0;

/* loaded from: classes.dex */
public final class x extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final x f7689c = new x(1, 0, 2);

    @Override // P.C
    public final void a(B1.s sVar, B2.l lVar, D0 d02, C0517t c0517t) {
        int iD = sVar.d(0);
        int iO = d02.o();
        int i7 = d02.f6987v;
        int iE = d02.E(d02.f6967b, d02.p(i7));
        int iF = d02.f(d02.f6967b, d02.p(i7 + 1));
        for (int iMax = Math.max(iE, iF - iD); iMax < iF; iMax++) {
            Object obj = d02.f6968c[d02.g(iMax)];
            if (obj instanceof x0) {
                c0517t.h(((x0) obj).a, iO - iMax, -1, -1);
            } else if (obj instanceof C0509o0) {
                ((C0509o0) obj).d();
            }
        }
        C0486d.P(iD > 0);
        int i8 = d02.f6987v;
        int iE2 = d02.E(d02.f6967b, d02.p(i8));
        int iF2 = d02.f(d02.f6967b, d02.p(i8 + 1)) - iD;
        C0486d.P(iF2 >= iE2);
        d02.C(iF2, iD, i8);
        int i9 = d02.f6974i;
        if (i9 >= iE2) {
            d02.f6974i = i9 - iD;
        }
    }

    @Override // P.C
    public final String b(int i7) {
        return i7 == 0 ? "count" : super.b(i7);
    }
}
