package v;

import O.C0486d;
import O.C0493g0;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import w0.InterfaceC2201t;
import x0.C2248h;
import x0.InterfaceC2243c;
import x0.InterfaceC2246f;
import x0.InterfaceC2247g;

/* loaded from: classes.dex */
public final class Q implements InterfaceC2201t, InterfaceC2243c, InterfaceC2246f {
    public final m0 a;

    /* renamed from: b, reason: collision with root package name */
    public final C0493g0 f16407b;

    /* renamed from: c, reason: collision with root package name */
    public final C0493g0 f16408c;

    public Q(m0 m0Var) {
        this.a = m0Var;
        O.T t7 = O.T.f7049p;
        this.f16407b = C0486d.K(m0Var, t7);
        this.f16408c = C0486d.K(m0Var, t7);
    }

    @Override // w0.InterfaceC2201t
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        C0493g0 c0493g0 = this.f16407b;
        int iA = ((m0) c0493g0.getValue()).a(interfaceC2175J, interfaceC2175J.getLayoutDirection());
        int iC = ((m0) c0493g0.getValue()).c(interfaceC2175J);
        int iB = ((m0) c0493g0.getValue()).b(interfaceC2175J, interfaceC2175J.getLayoutDirection()) + iA;
        int iD = ((m0) c0493g0.getValue()).d(interfaceC2175J) + iC;
        w0.S sB = interfaceC2172G.b(q0.c.H(-iB, -iD, j7));
        return interfaceC2175J.T(q0.c.v(sB.f16840k + iB, j7), q0.c.u(sB.f16841l + iD, j7), P3.z.f7780k, new E.c(sB, iA, iC, 2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Q) {
            return kotlin.jvm.internal.l.a(((Q) obj).a, this.a);
        }
        return false;
    }

    @Override // x0.InterfaceC2246f
    public final C2248h getKey() {
        return p0.a;
    }

    @Override // x0.InterfaceC2246f
    public final Object getValue() {
        return (m0) this.f16408c.getValue();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // x0.InterfaceC2243c
    public final void j(InterfaceC2247g interfaceC2247g) {
        m0 m0Var = (m0) interfaceC2247g.h(p0.a);
        m0 m0Var2 = this.a;
        this.f16407b.setValue(new C2145y(m0Var2, m0Var));
        this.f16408c.setValue(new j0(m0Var, m0Var2));
    }
}
