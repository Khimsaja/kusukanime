package n0;

import O.C0486d;
import O.C0487d0;
import O.C0493g0;
import O.T;
import b1.AbstractC0703b;
import h0.C0990m;
import j0.C1296b;
import m0.AbstractC1507b;
import y0.C2351F;

/* renamed from: n0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1532C extends AbstractC1507b {

    /* renamed from: o, reason: collision with root package name */
    public final C0493g0 f13116o;

    /* renamed from: p, reason: collision with root package name */
    public final C0493g0 f13117p;

    /* renamed from: q, reason: collision with root package name */
    public final C1558y f13118q;

    /* renamed from: r, reason: collision with root package name */
    public final C0487d0 f13119r;

    /* renamed from: s, reason: collision with root package name */
    public float f13120s;

    /* renamed from: t, reason: collision with root package name */
    public C0990m f13121t;

    /* renamed from: u, reason: collision with root package name */
    public int f13122u;

    public C1532C(C1535b c1535b) {
        g0.f fVar = new g0.f(0L);
        T t7 = T.f7049p;
        this.f13116o = C0486d.K(fVar, t7);
        this.f13117p = C0486d.K(Boolean.FALSE, t7);
        C1558y c1558y = new C1558y(c1535b);
        c1558y.f13216f = new B.e(25, this);
        this.f13118q = c1558y;
        this.f13119r = C0486d.J(0);
        this.f13120s = 1.0f;
        this.f13122u = -1;
    }

    @Override // m0.AbstractC1507b
    public final void c(float f5) {
        this.f13120s = f5;
    }

    @Override // m0.AbstractC1507b
    public final void d(C0990m c0990m) {
        this.f13121t = c0990m;
    }

    @Override // m0.AbstractC1507b
    public final long h() {
        return ((g0.f) this.f13116o.getValue()).a;
    }

    @Override // m0.AbstractC1507b
    public final void i(C2351F c2351f) {
        C0990m c0990m = this.f13121t;
        C1558y c1558y = this.f13118q;
        if (c0990m == null) {
            c0990m = (C0990m) c1558y.f13217g.getValue();
        }
        if (((Boolean) this.f13117p.getValue()).booleanValue() && c2351f.getLayoutDirection() == T0.k.f8845l) {
            C1296b c1296b = c2351f.f17696k;
            long jV = c1296b.V();
            B2.l lVar = c1296b.f12205l;
            long jA = lVar.A();
            lVar.t().l();
            try {
                ((X4.y) lVar.f416l).E(-1.0f, 1.0f, jV);
                c1558y.e(c2351f, this.f13120s, c0990m);
            } finally {
                AbstractC0703b.y(lVar, jA);
            }
        } else {
            c1558y.e(c2351f, this.f13120s, c0990m);
        }
        this.f13122u = this.f13119r.f();
    }
}
