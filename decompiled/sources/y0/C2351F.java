package y0;

import g0.AbstractC0932a;
import h0.AbstractC0993p;
import h0.C0985h;
import h0.C0987j;
import h0.C0990m;
import h0.InterfaceC0967L;
import h0.InterfaceC0995r;
import j0.AbstractC1299e;
import j0.C1295a;
import j0.C1296b;
import j0.InterfaceC1298d;
import k0.C1375b;
import l4.AbstractC1420H;
import z0.C2471u;

/* renamed from: y0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2351F implements InterfaceC1298d {

    /* renamed from: k, reason: collision with root package name */
    public final C1296b f17696k = new C1296b();

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC2368o f17697l;

    @Override // j0.InterfaceC1298d
    public final B2.l D() {
        return this.f17696k.f12205l;
    }

    @Override // j0.InterfaceC1298d
    public final void G(long j7, float f5, float f7, long j8, long j9, AbstractC1299e abstractC1299e) {
        this.f17696k.G(j7, f5, f7, j8, j9, abstractC1299e);
    }

    @Override // T0.b
    public final int H(long j7) {
        return this.f17696k.H(j7);
    }

    @Override // T0.b
    public final float I(long j7) {
        return this.f17696k.I(j7);
    }

    @Override // j0.InterfaceC1298d
    public final void J(C0987j c0987j, long j7, AbstractC1299e abstractC1299e) {
        this.f17696k.J(c0987j, j7, abstractC1299e);
    }

    @Override // j0.InterfaceC1298d
    public final void N(InterfaceC0967L interfaceC0967L, AbstractC0993p abstractC0993p, float f5, AbstractC1299e abstractC1299e, int i7) {
        this.f17696k.N(interfaceC0967L, abstractC0993p, f5, abstractC1299e, i7);
    }

    @Override // T0.b
    public final int O(float f5) {
        return this.f17696k.O(f5);
    }

    @Override // j0.InterfaceC1298d
    public final void U(long j7, long j8, long j9, float f5, int i7) {
        this.f17696k.U(j7, j8, j9, f5, i7);
    }

    @Override // j0.InterfaceC1298d
    public final long V() {
        return this.f17696k.V();
    }

    @Override // T0.b
    public final float a() {
        return this.f17696k.a();
    }

    @Override // T0.b
    public final long a0(long j7) {
        return this.f17696k.a0(j7);
    }

    public final void b() {
        C1296b c1296b = this.f17696k;
        InterfaceC0995r interfaceC0995rT = c1296b.f12205l.t();
        InterfaceC2366m interfaceC2366m = this.f17697l;
        kotlin.jvm.internal.l.c(interfaceC2366m);
        a0.p pVar = (a0.p) interfaceC2366m;
        a0.p pVarF = pVar.f10402k.f10407p;
        if (pVarF == null || (pVarF.f10405n & 4) == 0) {
            pVarF = null;
        } else {
            while (pVarF != null) {
                int i7 = pVarF.f10404m;
                if ((i7 & 2) != 0) {
                    break;
                } else if ((i7 & 4) != 0) {
                    break;
                } else {
                    pVarF = pVarF.f10407p;
                }
            }
            pVarF = null;
        }
        if (pVarF == null) {
            Y yT = AbstractC2359f.t(interfaceC2366m, 4);
            if (yT.P0() == pVar.f10402k) {
                yT = yT.f17826w;
                kotlin.jvm.internal.l.c(yT);
            }
            yT.b1(interfaceC0995rT, (C1375b) c1296b.f12205l.f417m);
            return;
        }
        Q.d dVar = null;
        while (pVarF != null) {
            if (pVarF instanceof InterfaceC2368o) {
                InterfaceC2368o interfaceC2368o = (InterfaceC2368o) pVarF;
                C1375b c1375b = (C1375b) c1296b.f12205l.f417m;
                Y yT2 = AbstractC2359f.t(interfaceC2368o, 4);
                long jO = AbstractC1420H.O(yT2.f16842m);
                C2349D c2349d = yT2.f17825v;
                c2349d.getClass();
                ((C2471u) AbstractC2352G.a(c2349d)).getSharedDrawScope().c(interfaceC0995rT, jO, yT2, interfaceC2368o, c1375b);
            } else if ((pVarF.f10404m & 4) != 0 && (pVarF instanceof AbstractC2367n)) {
                int i8 = 0;
                for (a0.p pVar2 = ((AbstractC2367n) pVarF).f17880y; pVar2 != null; pVar2 = pVar2.f10407p) {
                    if ((pVar2.f10404m & 4) != 0) {
                        i8++;
                        if (i8 == 1) {
                            pVarF = pVar2;
                        } else {
                            if (dVar == null) {
                                dVar = new Q.d(new a0.p[16]);
                            }
                            if (pVarF != null) {
                                dVar.b(pVarF);
                                pVarF = null;
                            }
                            dVar.b(pVar2);
                        }
                    }
                }
                if (i8 == 1) {
                }
            }
            pVarF = AbstractC2359f.f(dVar);
        }
    }

    public final void c(InterfaceC0995r interfaceC0995r, long j7, Y y7, InterfaceC2368o interfaceC2368o, C1375b c1375b) {
        InterfaceC2368o interfaceC2368o2 = this.f17697l;
        this.f17697l = interfaceC2368o;
        T0.k kVar = y7.f17825v.f17656C;
        C1296b c1296b = this.f17696k;
        B2.l lVar = c1296b.f12205l;
        C1295a c1295a = ((C1296b) lVar.f418n).f12204k;
        T0.b bVar = c1295a.a;
        T0.k kVar2 = c1295a.f12201b;
        InterfaceC0995r interfaceC0995rT = lVar.t();
        B2.l lVar2 = c1296b.f12205l;
        long jA = lVar2.A();
        C1375b c1375b2 = (C1375b) lVar2.f417m;
        lVar2.N(y7);
        lVar2.O(kVar);
        lVar2.M(interfaceC0995r);
        lVar2.P(j7);
        lVar2.f417m = c1375b;
        interfaceC0995r.l();
        try {
            interfaceC2368o.f(this);
            interfaceC0995r.i();
            lVar2.N(bVar);
            lVar2.O(kVar2);
            lVar2.M(interfaceC0995rT);
            lVar2.P(jA);
            lVar2.f417m = c1375b2;
            this.f17697l = interfaceC2368o2;
        } catch (Throwable th) {
            interfaceC0995r.i();
            lVar2.N(bVar);
            lVar2.O(kVar2);
            lVar2.M(interfaceC0995rT);
            lVar2.P(jA);
            lVar2.f417m = c1375b2;
            throw th;
        }
    }

    @Override // j0.InterfaceC1298d
    public final long d() {
        return this.f17696k.d();
    }

    @Override // T0.b
    public final float d0(long j7) {
        return this.f17696k.d0(j7);
    }

    public final void e(AbstractC0993p abstractC0993p, long j7, long j8, float f5, AbstractC1299e abstractC1299e) {
        C1296b c1296b = this.f17696k;
        c1296b.f12204k.f12202c.d(g0.c.d(j7), g0.c.e(j7), g0.f.d(j8) + g0.c.d(j7), g0.f.b(j8) + g0.c.e(j7), c1296b.c(abstractC0993p, abstractC1299e, f5, null, 3, 1));
    }

    public final void f(AbstractC0993p abstractC0993p, long j7, long j8, long j9, float f5, AbstractC1299e abstractC1299e) {
        C1296b c1296b = this.f17696k;
        c1296b.f12204k.f12202c.j(g0.c.d(j7), g0.c.e(j7), g0.f.d(j8) + g0.c.d(j7), g0.f.b(j8) + g0.c.e(j7), AbstractC0932a.b(j9), AbstractC0932a.c(j9), c1296b.c(abstractC0993p, abstractC1299e, f5, null, 3, 1));
    }

    @Override // j0.InterfaceC1298d
    public final void g0(long j7, long j8, long j9, float f5, int i7) {
        this.f17696k.g0(j7, j8, j9, f5, i7);
    }

    @Override // j0.InterfaceC1298d
    public final T0.k getLayoutDirection() {
        return this.f17696k.f12204k.f12201b;
    }

    @Override // T0.b
    public final long k0(float f5) {
        return this.f17696k.k0(f5);
    }

    @Override // T0.b
    public final float n() {
        return this.f17696k.n();
    }

    @Override // j0.InterfaceC1298d
    public final void q(float f5, long j7, long j8) {
        this.f17696k.q(f5, j7, j8);
    }

    @Override // T0.b
    public final float q0(int i7) {
        return this.f17696k.q0(i7);
    }

    @Override // T0.b
    public final float r0(float f5) {
        return f5 / this.f17696k.a();
    }

    @Override // j0.InterfaceC1298d
    public final void t(long j7, long j8, long j9, long j10) {
        this.f17696k.t(j7, j8, j9, j10);
    }

    @Override // j0.InterfaceC1298d
    public final void t0(C0985h c0985h, long j7, long j8, long j9, float f5, C0990m c0990m, int i7) {
        this.f17696k.t0(c0985h, j7, j8, j9, f5, c0990m, i7);
    }

    @Override // T0.b
    public final long v(float f5) {
        return this.f17696k.v(f5);
    }

    @Override // T0.b
    public final long w(long j7) {
        return this.f17696k.w(j7);
    }

    @Override // T0.b
    public final float x(float f5) {
        return this.f17696k.a() * f5;
    }
}
