package L;

import H.C0184a;
import O.C0486d;
import O.C0502l;
import O.C0507n0;
import O.C0509o0;
import O.C0510p;
import h0.C0998u;
import o3.AbstractC1634a;

/* renamed from: L.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0430x0 {
    static {
        new O.S(O.f5275r);
    }

    public static final void a(N n7, C0370f2 c0370f2, M2 m22, C0510p c0510p, int i7) {
        int i8;
        W.a aVar = AbstractC1634a.f13597b;
        c0510p.T(-2127166334);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.f(n7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.f(c0370f2) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p.f(m22) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0510p.h(aVar) ? 2048 : 1024;
        }
        if ((i8 & 1171) == 1170 && c0510p.y()) {
            c0510p.M();
        } else {
            c0510p.O();
            if ((i7 & 1) != 0 && !c0510p.x()) {
                c0510p.M();
            }
            c0510p.q();
            q.M mA = S1.a(false, 0.0f, c0510p, 0, 7);
            long j7 = n7.a;
            boolean zE = c0510p.e(j7);
            Object objH = c0510p.H();
            if (zE || objH == C0502l.a) {
                objH = new H.a0(j7, C0998u.b(0.4f, j7));
                c0510p.b0(objH);
            }
            C0486d.b(new C0507n0[]{P.a.a(n7), androidx.compose.foundation.d.a.a(mA), K.z.a.a(Q.a), AbstractC0374g2.a.a(c0370f2), H.b0.a.a((H.a0) objH), N2.a.a(m22)}, W.f.b(-1066563262, new D.S(5, m22), c0510p), c0510p, 56);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0184a(n7, c0370f2, m22, i7, 1);
        }
    }
}
