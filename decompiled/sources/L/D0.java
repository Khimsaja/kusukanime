package L;

import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import y0.AbstractC2359f;
import y0.InterfaceC2365l;
import y0.InterfaceC2375w;

/* loaded from: classes.dex */
public final class D0 extends a0.p implements InterfaceC2365l, InterfaceC2375w {
    @Override // y0.InterfaceC2375w
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        float f5 = ((T0.e) AbstractC2359f.i(this, AbstractC0388k0.a)).f8839k;
        float f7 = 0;
        if (f5 < f7) {
            f5 = f7;
        }
        w0.S sB = interfaceC2172G.b(j7);
        boolean z7 = this.f10414w && !Float.isNaN(f5) && Float.compare(f5, f7) > 0;
        int iO = Float.isNaN(f5) ? 0 : interfaceC2175J.O(f5);
        int iMax = z7 ? Math.max(sB.f16840k, iO) : sB.f16840k;
        int iMax2 = z7 ? Math.max(sB.f16841l, iO) : sB.f16841l;
        return interfaceC2175J.T(iMax, iMax2, P3.z.f7780k, new E.c(iMax, sB, iMax2));
    }
}
