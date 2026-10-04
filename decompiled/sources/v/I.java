package v;

import b1.AbstractC0703b;
import m.C1487h;
import p.AbstractC1755i;
import w0.InterfaceC2172G;

/* loaded from: classes.dex */
public final class I {
    public InterfaceC2172G a;

    /* renamed from: b, reason: collision with root package name */
    public w0.S f16372b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC2172G f16373c;

    /* renamed from: d, reason: collision with root package name */
    public w0.S f16374d;

    /* renamed from: e, reason: collision with root package name */
    public C1487h f16375e;

    /* renamed from: f, reason: collision with root package name */
    public C1487h f16376f;

    public final C1487h a(int i7, int i8, boolean z7) {
        int iB = AbstractC1755i.b(2);
        if (iB == 0 || iB == 1) {
            return null;
        }
        if (iB == 2) {
            if (z7) {
                return this.f16375e;
            }
            return null;
        }
        if (iB != 3) {
            throw new D6.r();
        }
        if (z7) {
            return this.f16375e;
        }
        if (i7 + 1 < 0 || i8 < 0) {
            return null;
        }
        return this.f16376f;
    }

    public final void b(InterfaceC2172G interfaceC2172G, InterfaceC2172G interfaceC2172G2, long j7) {
        long jC = AbstractC2123b.c(1, j7);
        if (interfaceC2172G != null) {
            int iW = interfaceC2172G.W(T0.a.g(jC));
            this.f16375e = new C1487h(C1487h.a(iW, interfaceC2172G.b0(iW)));
            this.a = interfaceC2172G;
            this.f16372b = null;
        }
        if (interfaceC2172G2 != null) {
            int iW2 = interfaceC2172G2.W(T0.a.g(jC));
            this.f16376f = new C1487h(C1487h.a(iW2, interfaceC2172G2.b0(iW2)));
            this.f16373c = interfaceC2172G2;
            this.f16374d = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        ((I) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC1755i.a(0, AbstractC1755i.b(2) * 31, 31);
    }

    public final String toString() {
        return AbstractC0703b.j("FlowLayoutOverflowState(type=", "Clip", ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)");
    }
}
