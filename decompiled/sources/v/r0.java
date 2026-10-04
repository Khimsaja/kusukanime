package v;

import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import y0.InterfaceC2375w;

/* loaded from: classes.dex */
public final class r0 extends a0.p implements InterfaceC2375w {

    /* renamed from: x, reason: collision with root package name */
    public int f16506x;

    /* renamed from: y, reason: collision with root package name */
    public kotlin.jvm.internal.m f16507y;

    @Override // y0.InterfaceC2375w
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        w0.S sB = interfaceC2172G.b(q0.c.a(this.f16506x != 1 ? 0 : T0.a.j(j7), T0.a.h(j7), this.f16506x == 2 ? T0.a.i(j7) : 0, T0.a.g(j7)));
        int iK = e3.c.k(sB.f16840k, T0.a.j(j7), T0.a.h(j7));
        int iK2 = e3.c.k(sB.f16841l, T0.a.i(j7), T0.a.g(j7));
        return interfaceC2175J.T(iK, iK2, P3.z.f7780k, new q0(this, iK, sB, iK2, interfaceC2175J));
    }
}
