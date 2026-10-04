package e0;

import D.L0;
import P3.z;
import X4.y;
import a0.i;
import a0.p;
import f1.AbstractC0870c;
import h0.C0990m;
import j0.C1296b;
import l4.AbstractC1420H;
import n0.C1532C;
import w0.C2178M;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import w0.S;
import w0.X;
import y0.C2351F;
import y0.InterfaceC2368o;
import y0.InterfaceC2375w;
import y0.N;

/* renamed from: e0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0816h extends p implements InterfaceC2375w, InterfaceC2368o {

    /* renamed from: A, reason: collision with root package name */
    public C2178M f11341A;

    /* renamed from: B, reason: collision with root package name */
    public float f11342B;

    /* renamed from: C, reason: collision with root package name */
    public C0990m f11343C;

    /* renamed from: x, reason: collision with root package name */
    public C1532C f11344x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11345y;

    /* renamed from: z, reason: collision with root package name */
    public i f11346z;

    public static boolean H0(long j7) {
        if (g0.f.a(j7, 9205357640488583168L)) {
            return false;
        }
        float fB = g0.f.b(j7);
        return (Float.isInfinite(fB) || Float.isNaN(fB)) ? false : true;
    }

    public static boolean I0(long j7) {
        if (g0.f.a(j7, 9205357640488583168L)) {
            return false;
        }
        float fD = g0.f.d(j7);
        return (Float.isInfinite(fD) || Float.isNaN(fD)) ? false : true;
    }

    public final boolean G0() {
        return this.f11345y && this.f11344x.h() != 9205357640488583168L;
    }

    public final long J0(long j7) {
        boolean z7 = false;
        boolean z8 = T0.a.d(j7) && T0.a.c(j7);
        if (T0.a.f(j7) && T0.a.e(j7)) {
            z7 = true;
        }
        if ((!G0() && z8) || z7) {
            return T0.a.a(j7, T0.a.h(j7), 0, T0.a.g(j7), 0, 10);
        }
        long jH = this.f11344x.h();
        long jF = AbstractC0870c.F(q0.c.v(I0(jH) ? Math.round(g0.f.d(jH)) : T0.a.j(j7), j7), q0.c.u(H0(jH) ? Math.round(g0.f.b(jH)) : T0.a.i(j7), j7));
        if (G0()) {
            long jF2 = AbstractC0870c.F(!I0(this.f11344x.h()) ? g0.f.d(jF) : g0.f.d(this.f11344x.h()), !H0(this.f11344x.h()) ? g0.f.b(jF) : g0.f.b(this.f11344x.h()));
            jF = (g0.f.d(jF) == 0.0f || g0.f.b(jF) == 0.0f) ? 0L : X.h(jF2, this.f11341A.a(jF2, jF));
        }
        return T0.a.a(j7, q0.c.v(Math.round(g0.f.d(jF)), j7), 0, q0.c.u(Math.round(g0.f.b(jF)), j7), 0, 10);
    }

    @Override // y0.InterfaceC2375w
    public final int b(N n7, InterfaceC2172G interfaceC2172G, int i7) {
        if (!G0()) {
            return interfaceC2172G.W(i7);
        }
        long jJ0 = J0(q0.c.b(0, i7, 7));
        return Math.max(T0.a.j(jJ0), interfaceC2172G.W(i7));
    }

    @Override // y0.InterfaceC2375w
    public final int c(N n7, InterfaceC2172G interfaceC2172G, int i7) {
        if (!G0()) {
            return interfaceC2172G.c(i7);
        }
        long jJ0 = J0(q0.c.b(i7, 0, 13));
        return Math.max(T0.a.i(jJ0), interfaceC2172G.c(i7));
    }

    @Override // y0.InterfaceC2375w
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        S sB = interfaceC2172G.b(J0(j7));
        return interfaceC2175J.T(sB.f16840k, sB.f16841l, z.f7780k, new L0(sB, 5));
    }

    @Override // y0.InterfaceC2368o
    public final void f(C2351F c2351f) {
        long jH = this.f11344x.h();
        boolean zI0 = I0(jH);
        C1296b c1296b = c2351f.f17696k;
        long jF = AbstractC0870c.F(zI0 ? g0.f.d(jH) : g0.f.d(c1296b.d()), H0(jH) ? g0.f.b(jH) : g0.f.b(c1296b.d()));
        long jH2 = (g0.f.d(c1296b.d()) == 0.0f || g0.f.b(c1296b.d()) == 0.0f) ? 0L : X.h(jF, this.f11341A.a(jF, c1296b.d()));
        long jA = this.f11346z.a(AbstractC1420H.a(Math.round(g0.f.d(jH2)), Math.round(g0.f.b(jH2))), AbstractC1420H.a(Math.round(g0.f.d(c1296b.d())), Math.round(g0.f.b(c1296b.d()))), c2351f.getLayoutDirection());
        float f5 = (int) (jA >> 32);
        float f7 = (int) (jA & 4294967295L);
        ((y) c1296b.f12205l.f416l).G(f5, f7);
        try {
            this.f11344x.g(c2351f, jH2, this.f11342B, this.f11343C);
            ((y) c1296b.f12205l.f416l).G(-f5, -f7);
            c2351f.b();
        } catch (Throwable th) {
            ((y) c1296b.f12205l.f416l).G(-f5, -f7);
            throw th;
        }
    }

    @Override // y0.InterfaceC2375w
    public final int g(N n7, InterfaceC2172G interfaceC2172G, int i7) {
        if (!G0()) {
            return interfaceC2172G.b0(i7);
        }
        long jJ0 = J0(q0.c.b(i7, 0, 13));
        return Math.max(T0.a.i(jJ0), interfaceC2172G.b0(i7));
    }

    @Override // y0.InterfaceC2375w
    public final int i(N n7, InterfaceC2172G interfaceC2172G, int i7) {
        if (!G0()) {
            return interfaceC2172G.Y(i7);
        }
        long jJ0 = J0(q0.c.b(0, i7, 7));
        return Math.max(T0.a.j(jJ0), interfaceC2172G.Y(i7));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f11344x + ", sizeToIntrinsics=" + this.f11345y + ", alignment=" + this.f11346z + ", alpha=" + this.f11342B + ", colorFilter=" + this.f11343C + ')';
    }

    @Override // a0.p
    public final boolean v0() {
        return false;
    }
}
