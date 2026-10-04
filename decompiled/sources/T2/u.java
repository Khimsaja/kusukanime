package T2;

import D.L0;
import P3.F;
import f1.AbstractC0870c;
import f6.AbstractC0905c;
import j0.C1296b;
import l4.AbstractC1420H;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import w0.InterfaceC2192j;
import w0.S;
import w0.W;
import w0.X;
import y0.C2351F;
import y0.InterfaceC2368o;
import y0.InterfaceC2375w;
import y0.N;

/* loaded from: classes.dex */
public final class u extends a0.p implements InterfaceC2368o, InterfaceC2375w {

    /* renamed from: A, reason: collision with root package name */
    public float f9032A;

    /* renamed from: x, reason: collision with root package name */
    public o f9033x;

    /* renamed from: y, reason: collision with root package name */
    public a0.d f9034y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC2192j f9035z;

    public final long G0(long j7) {
        if (g0.f.e(j7)) {
            return 0L;
        }
        long jH = this.f9033x.h();
        if (jH != 9205357640488583168L) {
            float fD = g0.f.d(jH);
            if (Float.isInfinite(fD) || Float.isNaN(fD)) {
                fD = g0.f.d(j7);
            }
            float fB = g0.f.b(jH);
            if (Float.isInfinite(fB) || Float.isNaN(fB)) {
                fB = g0.f.b(j7);
            }
            long jF = AbstractC0870c.F(fD, fB);
            long jA = this.f9035z.a(jF, j7);
            long j8 = W.a;
            if (jA == j8) {
                AbstractC0905c.C("ScaleFactor is unspecified");
                throw null;
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
            if (!Float.isInfinite(fIntBitsToFloat) && !Float.isNaN(fIntBitsToFloat)) {
                if (jA == j8) {
                    AbstractC0905c.C("ScaleFactor is unspecified");
                    throw null;
                }
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & jA));
                if (!Float.isInfinite(fIntBitsToFloat2) && !Float.isNaN(fIntBitsToFloat2)) {
                    return X.h(jF, jA);
                }
            }
        }
        return j7;
    }

    public final long H0(long j7) {
        float fJ;
        int i7;
        float fJ2;
        boolean zF = T0.a.f(j7);
        boolean zE = T0.a.e(j7);
        if (!zF || !zE) {
            boolean z7 = T0.a.d(j7) && T0.a.c(j7);
            long jH = this.f9033x.h();
            if (jH != 9205357640488583168L) {
                if (z7 && (zF || zE)) {
                    fJ = T0.a.h(j7);
                    i7 = T0.a.g(j7);
                } else {
                    float fD = g0.f.d(jH);
                    float fB = g0.f.b(jH);
                    if (Float.isInfinite(fD) || Float.isNaN(fD)) {
                        fJ = T0.a.j(j7);
                    } else {
                        e3.f fVar = z.f9047b;
                        fJ = e3.c.j(fD, T0.a.j(j7), T0.a.h(j7));
                    }
                    if (!Float.isInfinite(fB) && !Float.isNaN(fB)) {
                        e3.f fVar2 = z.f9047b;
                        fJ2 = e3.c.j(fB, T0.a.i(j7), T0.a.g(j7));
                        long jG0 = G0(AbstractC0870c.F(fJ, fJ2));
                        return T0.a.a(j7, q0.c.v(F.W(g0.f.d(jG0)), j7), 0, q0.c.u(F.W(g0.f.b(jG0)), j7), 0, 10);
                    }
                    i7 = T0.a.i(j7);
                }
                fJ2 = i7;
                long jG02 = G0(AbstractC0870c.F(fJ, fJ2));
                return T0.a.a(j7, q0.c.v(F.W(g0.f.d(jG02)), j7), 0, q0.c.u(F.W(g0.f.b(jG02)), j7), 0, 10);
            }
            if (z7) {
                return T0.a.a(j7, T0.a.h(j7), 0, T0.a.g(j7), 0, 10);
            }
        }
        return j7;
    }

    @Override // y0.InterfaceC2375w
    public final int b(N n7, InterfaceC2172G interfaceC2172G, int i7) {
        if (this.f9033x.h() == 9205357640488583168L) {
            return interfaceC2172G.W(i7);
        }
        int iW = interfaceC2172G.W(T0.a.g(H0(q0.c.b(0, i7, 7))));
        return Math.max(F.W(g0.f.d(G0(AbstractC0870c.F(iW, i7)))), iW);
    }

    @Override // y0.InterfaceC2375w
    public final int c(N n7, InterfaceC2172G interfaceC2172G, int i7) {
        if (this.f9033x.h() == 9205357640488583168L) {
            return interfaceC2172G.c(i7);
        }
        int iC = interfaceC2172G.c(T0.a.h(H0(q0.c.b(i7, 0, 13))));
        return Math.max(F.W(g0.f.b(G0(AbstractC0870c.F(i7, iC)))), iC);
    }

    @Override // y0.InterfaceC2375w
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        S sB = interfaceC2172G.b(H0(j7));
        return interfaceC2175J.T(sB.f16840k, sB.f16841l, P3.z.f7780k, new L0(sB, 3));
    }

    @Override // y0.InterfaceC2368o
    public final void f(C2351F c2351f) {
        C1296b c1296b = c2351f.f17696k;
        long jG0 = G0(c1296b.d());
        a0.d dVar = this.f9034y;
        e3.f fVar = z.f9047b;
        long jA = AbstractC1420H.a(F.W(g0.f.d(jG0)), F.W(g0.f.b(jG0)));
        long jD = c1296b.d();
        long jA2 = dVar.a(jA, AbstractC1420H.a(F.W(g0.f.d(jD)), F.W(g0.f.b(jD))), c2351f.getLayoutDirection());
        float f5 = (int) (jA2 >> 32);
        float f7 = (int) (jA2 & 4294967295L);
        ((X4.y) c1296b.f12205l.f416l).G(f5, f7);
        this.f9033x.g(c2351f, jG0, this.f9032A, null);
        ((X4.y) c1296b.f12205l.f416l).G(-f5, -f7);
        c2351f.b();
    }

    @Override // y0.InterfaceC2375w
    public final int g(N n7, InterfaceC2172G interfaceC2172G, int i7) {
        if (this.f9033x.h() == 9205357640488583168L) {
            return interfaceC2172G.b0(i7);
        }
        int iB0 = interfaceC2172G.b0(T0.a.h(H0(q0.c.b(i7, 0, 13))));
        return Math.max(F.W(g0.f.b(G0(AbstractC0870c.F(i7, iB0)))), iB0);
    }

    @Override // y0.InterfaceC2375w
    public final int i(N n7, InterfaceC2172G interfaceC2172G, int i7) {
        if (this.f9033x.h() == 9205357640488583168L) {
            return interfaceC2172G.Y(i7);
        }
        int iY = interfaceC2172G.Y(T0.a.g(H0(q0.c.b(0, i7, 7))));
        return Math.max(F.W(g0.f.d(G0(AbstractC0870c.F(iY, i7)))), iY);
    }

    @Override // a0.p
    public final boolean v0() {
        return false;
    }
}
