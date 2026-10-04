package v;

import D.L0;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import y0.InterfaceC2375w;

/* loaded from: classes.dex */
public final class k0 extends a0.p implements InterfaceC2375w {

    /* renamed from: x, reason: collision with root package name */
    public float f16456x;

    /* renamed from: y, reason: collision with root package name */
    public float f16457y;

    @Override // y0.InterfaceC2375w
    public final int b(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        int iW = interfaceC2172G.W(i7);
        int iO = !T0.e.a(this.f16456x, Float.NaN) ? n7.O(this.f16456x) : 0;
        return iW < iO ? iO : iW;
    }

    @Override // y0.InterfaceC2375w
    public final int c(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        int iC = interfaceC2172G.c(i7);
        int iO = !T0.e.a(this.f16457y, Float.NaN) ? n7.O(this.f16457y) : 0;
        return iC < iO ? iO : iC;
    }

    @Override // y0.InterfaceC2375w
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        int iJ;
        int i7 = 0;
        if (T0.e.a(this.f16456x, Float.NaN) || T0.a.j(j7) != 0) {
            iJ = T0.a.j(j7);
        } else {
            iJ = interfaceC2175J.O(this.f16456x);
            int iH = T0.a.h(j7);
            if (iJ > iH) {
                iJ = iH;
            }
            if (iJ < 0) {
                iJ = 0;
            }
        }
        int iH2 = T0.a.h(j7);
        if (T0.e.a(this.f16457y, Float.NaN) || T0.a.i(j7) != 0) {
            i7 = T0.a.i(j7);
        } else {
            int iO = interfaceC2175J.O(this.f16457y);
            int iG = T0.a.g(j7);
            if (iO > iG) {
                iO = iG;
            }
            if (iO >= 0) {
                i7 = iO;
            }
        }
        w0.S sB = interfaceC2172G.b(q0.c.a(iJ, iH2, i7, T0.a.g(j7)));
        return interfaceC2175J.T(sB.f16840k, sB.f16841l, P3.z.f7780k, new L0(sB, 13));
    }

    @Override // y0.InterfaceC2375w
    public final int g(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        int iB0 = interfaceC2172G.b0(i7);
        int iO = !T0.e.a(this.f16457y, Float.NaN) ? n7.O(this.f16457y) : 0;
        return iB0 < iO ? iO : iB0;
    }

    @Override // y0.InterfaceC2375w
    public final int i(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        int iY = interfaceC2172G.Y(i7);
        int iO = !T0.e.a(this.f16456x, Float.NaN) ? n7.O(this.f16456x) : 0;
        return iY < iO ? iO : iY;
    }
}
