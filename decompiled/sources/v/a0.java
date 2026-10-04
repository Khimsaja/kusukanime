package v;

import D.C0056i;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import y0.InterfaceC2375w;

/* loaded from: classes.dex */
public final class a0 extends a0.p implements InterfaceC2375w {

    /* renamed from: x, reason: collision with root package name */
    public Y f16429x;

    @Override // y0.InterfaceC2375w
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        float f5 = 0;
        if (Float.compare(this.f16429x.b(interfaceC2175J.getLayoutDirection()), f5) < 0 || Float.compare(this.f16429x.c(), f5) < 0 || Float.compare(this.f16429x.d(interfaceC2175J.getLayoutDirection()), f5) < 0 || Float.compare(this.f16429x.a(), f5) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int iO = interfaceC2175J.O(this.f16429x.d(interfaceC2175J.getLayoutDirection())) + interfaceC2175J.O(this.f16429x.b(interfaceC2175J.getLayoutDirection()));
        int iO2 = interfaceC2175J.O(this.f16429x.a()) + interfaceC2175J.O(this.f16429x.c());
        w0.S sB = interfaceC2172G.b(q0.c.H(-iO, -iO2, j7));
        return interfaceC2175J.T(q0.c.v(sB.f16840k + iO, j7), q0.c.u(sB.f16841l + iO2, j7), P3.z.f7780k, new C0056i(sB, interfaceC2175J, this, 18));
    }
}
