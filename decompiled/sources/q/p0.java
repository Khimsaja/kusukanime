package q;

import D.v0;
import O.C0487d0;
import f.AbstractC0847h;
import s.EnumC1903a0;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import y0.InterfaceC2375w;

/* loaded from: classes.dex */
public final class p0 extends a0.p implements InterfaceC2375w {

    /* renamed from: x, reason: collision with root package name */
    public o0 f14608x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14609y;

    @Override // y0.InterfaceC2375w
    public final int b(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return this.f14609y ? interfaceC2172G.W(Integer.MAX_VALUE) : interfaceC2172G.W(i7);
    }

    @Override // y0.InterfaceC2375w
    public final int c(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return this.f14609y ? interfaceC2172G.c(i7) : interfaceC2172G.c(Integer.MAX_VALUE);
    }

    @Override // y0.InterfaceC2375w
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        AbstractC0847h.i(j7, this.f14609y ? EnumC1903a0.f15259k : EnumC1903a0.f15260l);
        w0.S sB = interfaceC2172G.b(T0.a.a(j7, 0, this.f14609y ? T0.a.h(j7) : Integer.MAX_VALUE, 0, this.f14609y ? Integer.MAX_VALUE : T0.a.g(j7), 5));
        int i7 = sB.f16840k;
        int iH = T0.a.h(j7);
        if (i7 > iH) {
            i7 = iH;
        }
        int i8 = sB.f16841l;
        int iG = T0.a.g(j7);
        if (i8 > iG) {
            i8 = iG;
        }
        int i9 = sB.f16841l - i8;
        int i10 = sB.f16840k - i7;
        if (!this.f14609y) {
            i9 = i10;
        }
        o0 o0Var = this.f14608x;
        C0487d0 c0487d0 = o0Var.f14600d;
        C0487d0 c0487d02 = o0Var.a;
        c0487d0.g(i9);
        Y.h hVarC = Y.s.c();
        e4.k kVarF = hVarC != null ? hVarC.f() : null;
        Y.h hVarD = Y.s.d(hVarC);
        try {
            if (c0487d02.f() > i9) {
                c0487d02.g(i9);
            }
            Y.s.f(hVarC, hVarD, kVarF);
            this.f14608x.f14598b.g(this.f14609y ? i8 : i7);
            return interfaceC2175J.T(i7, i8, P3.z.f7780k, new v0(i9, 2, this, sB));
        } catch (Throwable th) {
            Y.s.f(hVarC, hVarD, kVarF);
            throw th;
        }
    }

    @Override // y0.InterfaceC2375w
    public final int g(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return this.f14609y ? interfaceC2172G.b0(i7) : interfaceC2172G.b0(Integer.MAX_VALUE);
    }

    @Override // y0.InterfaceC2375w
    public final int i(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return this.f14609y ? interfaceC2172G.Y(Integer.MAX_VALUE) : interfaceC2172G.Y(i7);
    }
}
