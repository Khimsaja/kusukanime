package D3;

import H0.I;
import L.AbstractC0430x0;
import L.C0370f2;
import L.M2;
import M0.z;
import O.C0509o0;
import O.C0510p;

/* loaded from: classes.dex */
public abstract class v {
    public static final M2 a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0370f2 f1506b;

    static {
        M0.u uVar = M0.u.f6415o;
        z zVarB = z1.c.b(uVar);
        M0.u uVar2 = M0.u.f6416p;
        z zVarB2 = z1.c.b(uVar2);
        M0.u uVar3 = M0.u.f6417q;
        z zVarB3 = z1.c.b(uVar3);
        M0.u uVar4 = M0.u.f6418r;
        M0.m mVar = new M0.m(P3.m.P(new z[]{zVarB, zVarB2, zVarB3, z1.c.b(uVar4)}));
        a = new M2(new I(0L, n6.d.F(34), uVar4, mVar, n6.d.E(-0.5d), 0, n6.d.F(40), 16645977), new I(0L, n6.d.F(26), uVar4, mVar, n6.d.E(-0.3d), 0, n6.d.F(32), 16645977), new I(0L, n6.d.F(22), uVar3, mVar, n6.d.E(-0.2d), 0, n6.d.F(28), 16645977), new I(0L, n6.d.F(19), uVar3, mVar, 0L, 0, n6.d.F(24), 16646105), new I(0L, n6.d.F(16), uVar3, mVar, 0L, 0, n6.d.F(22), 16646105), new I(0L, n6.d.F(14), uVar3, mVar, 0L, 0, n6.d.F(19), 16646105), new I(0L, n6.d.F(15), uVar, mVar, 0L, 0, n6.d.F(22), 16646105), new I(0L, n6.d.E(13.5d), uVar, mVar, 0L, 0, n6.d.F(19), 16646105), new I(0L, n6.d.F(12), uVar, mVar, 0L, 0, n6.d.F(16), 16646105), new I(0L, n6.d.E(13.5d), uVar3, mVar, 0L, 0, n6.d.F(18), 16646105), new I(0L, n6.d.E(11.5d), uVar2, mVar, 0L, 0, n6.d.F(15), 16646105), new I(0L, n6.d.E(10.5d), uVar2, mVar, n6.d.E(0.3d), 0, n6.d.F(14), 16645977), 11);
        f1506b = new C0370f2(C.e.b(8), C.e.b(12), C.e.b(16), C.e.b(20), C.e.b(28));
    }

    public static final void a(boolean z7, C0510p c0510p, int i7) {
        c0510p.T(1457502912);
        if ((((c0510p.g(z7) ? 4 : 2) | i7) & 19) == 18 && c0510p.y()) {
            c0510p.M();
        } else {
            AbstractC0430x0.a(z7 ? a.f1425c : a.f1426d, f1506b, a, c0510p, 3504);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new u(z7, i7);
        }
    }
}
