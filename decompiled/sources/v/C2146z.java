package v;

import D.L0;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import y0.InterfaceC2375w;

/* renamed from: v.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2146z extends a0.p implements InterfaceC2375w {

    /* renamed from: x, reason: collision with root package name */
    public int f16517x;

    /* renamed from: y, reason: collision with root package name */
    public float f16518y;

    @Override // y0.InterfaceC2375w
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        int iJ;
        int iH;
        int iG;
        int iK;
        if (!T0.a.d(j7) || this.f16517x == 1) {
            iJ = T0.a.j(j7);
            iH = T0.a.h(j7);
        } else {
            iJ = e3.c.k(Math.round(T0.a.h(j7) * this.f16518y), T0.a.j(j7), T0.a.h(j7));
            iH = iJ;
        }
        if (!T0.a.c(j7) || this.f16517x == 2) {
            int i7 = T0.a.i(j7);
            iG = T0.a.g(j7);
            iK = i7;
        } else {
            iK = e3.c.k(Math.round(T0.a.g(j7) * this.f16518y), T0.a.i(j7), T0.a.g(j7));
            iG = iK;
        }
        w0.S sB = interfaceC2172G.b(q0.c.a(iJ, iH, iK, iG));
        return interfaceC2175J.T(sB.f16840k, sB.f16841l, P3.z.f7780k, new L0(sB, 10));
    }
}
