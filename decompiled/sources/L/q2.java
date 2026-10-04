package L;

import O.C0486d;
import O.C0507n0;
import O.C0510p;
import O.C0525y;
import androidx.compose.foundation.BorderModifierNodeElement;
import e4.InterfaceC0821a;
import h0.AbstractC0968M;
import h0.C0998u;
import h0.InterfaceC0973S;
import q.C1837t;

/* loaded from: classes.dex */
public abstract class q2 {
    public static final C0525y a = new C0525y(O.f5280w);

    public static final void a(a0.q qVar, InterfaceC0973S interfaceC0973S, long j7, long j8, float f5, float f7, W.a aVar, C0510p c0510p, int i7, int i8) {
        if ((i8 & 1) != 0) {
            qVar = a0.n.a;
        }
        a0.q qVar2 = qVar;
        if ((i8 & 2) != 0) {
            interfaceC0973S = AbstractC0968M.a;
        }
        InterfaceC0973S interfaceC0973S2 = interfaceC0973S;
        long jB = (i8 & 8) != 0 ? P.b(j7, c0510p) : j8;
        float f8 = (i8 & 16) != 0 ? 0 : f5;
        float f9 = (i8 & 32) != 0 ? 0 : f7;
        C0525y c0525y = a;
        float f10 = ((T0.e) c0510p.k(c0525y)).f8839k + f8;
        C0486d.b(new C0507n0[]{X.a.a(new C0998u(jB)), c0525y.a(new T0.e(f10))}, W.f.b(-70914509, new C0402n2(qVar2, interfaceC0973S2, j7, f10, null, f9, aVar), c0510p), c0510p, 56);
    }

    public static final void b(InterfaceC0821a interfaceC0821a, a0.q qVar, boolean z7, InterfaceC0973S interfaceC0973S, long j7, long j8, float f5, C1837t c1837t, u.k kVar, W.a aVar, C0510p c0510p, int i7, int i8) {
        a0.q qVar2 = (i8 & 2) != 0 ? a0.n.a : qVar;
        boolean z8 = (i8 & 4) != 0 ? true : z7;
        long jB = (i8 & 32) != 0 ? P.b(j7, c0510p) : j8;
        float f7 = 0;
        float f8 = (i8 & 128) != 0 ? 0 : f5;
        C1837t c1837t2 = (i8 & 256) != 0 ? null : c1837t;
        u.k kVar2 = (i8 & 512) != 0 ? null : kVar;
        C0525y c0525y = a;
        float f9 = f7 + ((T0.e) c0510p.k(c0525y)).f8839k;
        C0486d.b(new C0507n0[]{X.a.a(new C0998u(jB)), c0525y.a(new T0.e(f9))}, W.f.b(1279702876, new o2(qVar2, interfaceC0973S, j7, f9, c1837t2, kVar2, z8, interfaceC0821a, f8, aVar), c0510p), c0510p, 56);
    }

    public static final a0.q c(a0.q qVar, InterfaceC0973S interfaceC0973S, long j7, C1837t c1837t, float f5) {
        InterfaceC0973S interfaceC0973S2;
        a0.q qVarB;
        a0.q borderModifierNodeElement = a0.n.a;
        if (f5 > 0.0f) {
            interfaceC0973S2 = interfaceC0973S;
            qVarB = androidx.compose.ui.graphics.a.b(borderModifierNodeElement, 0.0f, f5, interfaceC0973S2, false, 124895);
        } else {
            interfaceC0973S2 = interfaceC0973S;
            qVarB = borderModifierNodeElement;
        }
        a0.q qVarK = qVar.k(qVarB);
        if (c1837t != null) {
            borderModifierNodeElement = new BorderModifierNodeElement(c1837t.a, c1837t.f14628b, interfaceC0973S2);
        }
        return q0.c.o(androidx.compose.foundation.a.b(qVarK.k(borderModifierNodeElement), j7, interfaceC0973S2), interfaceC0973S2);
    }

    public static final long d(long j7, float f5, C0510p c0510p) {
        N n7 = (N) c0510p.k(P.a);
        boolean zBooleanValue = ((Boolean) c0510p.k(P.f5292b)).booleanValue();
        if (!C0998u.c(j7, n7.f5257p) || !zBooleanValue) {
            return j7;
        }
        boolean zA = T0.e.a(f5, 0);
        long j8 = n7.f5257p;
        return zA ? j8 : AbstractC0968M.l(C0998u.b(((((float) Math.log(f5 + 1)) * 4.5f) + 2.0f) / 100.0f, n7.f5261t), j8);
    }
}
