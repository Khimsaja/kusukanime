package T2;

import D.L0;
import K5.N;
import K5.Y;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import w0.InterfaceC2201t;
import w0.S;

/* loaded from: classes.dex */
public final class t implements e3.i, InterfaceC2201t {
    public final Y a = N.b(new T0.a(z.a));

    @Override // w0.InterfaceC2201t
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        T0.a aVar = new T0.a(j7);
        Y y7 = this.a;
        y7.getClass();
        y7.i(null, aVar);
        S sB = interfaceC2172G.b(j7);
        return interfaceC2175J.T(sB.f16840k, sB.f16841l, P3.z.f7780k, new L0(sB, 2));
    }

    @Override // e3.i
    public final Object h(S2.j jVar) {
        return N.h(new n(this.a, 1), jVar);
    }
}
