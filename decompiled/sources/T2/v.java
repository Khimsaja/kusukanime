package T2;

import O.C0485c0;
import O.C0486d;
import O.C0487d0;
import O.C0493g0;
import O.T;
import android.os.SystemClock;
import f1.AbstractC0870c;
import h0.C0990m;
import j0.C1296b;
import m0.AbstractC1507b;
import w0.InterfaceC2192j;
import w0.X;
import y0.C2351F;

/* loaded from: classes.dex */
public final class v extends AbstractC1507b {

    /* renamed from: o, reason: collision with root package name */
    public AbstractC1507b f9036o;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC1507b f9037p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC2192j f9038q;

    /* renamed from: r, reason: collision with root package name */
    public final int f9039r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f9040s;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9043v;

    /* renamed from: t, reason: collision with root package name */
    public final C0487d0 f9041t = C0486d.J(0);

    /* renamed from: u, reason: collision with root package name */
    public long f9042u = -1;

    /* renamed from: w, reason: collision with root package name */
    public final C0485c0 f9044w = C0486d.I(1.0f);

    /* renamed from: x, reason: collision with root package name */
    public final C0493g0 f9045x = C0486d.K(null, T.f7049p);

    public v(AbstractC1507b abstractC1507b, AbstractC1507b abstractC1507b2, InterfaceC2192j interfaceC2192j, int i7, boolean z7) {
        this.f9036o = abstractC1507b;
        this.f9037p = abstractC1507b2;
        this.f9038q = interfaceC2192j;
        this.f9039r = i7;
        this.f9040s = z7;
    }

    @Override // m0.AbstractC1507b
    public final void c(float f5) {
        this.f9044w.g(f5);
    }

    @Override // m0.AbstractC1507b
    public final void d(C0990m c0990m) {
        this.f9045x.setValue(c0990m);
    }

    @Override // m0.AbstractC1507b
    public final long h() {
        AbstractC1507b abstractC1507b = this.f9036o;
        long jH = abstractC1507b != null ? abstractC1507b.h() : 0L;
        AbstractC1507b abstractC1507b2 = this.f9037p;
        long jH2 = abstractC1507b2 != null ? abstractC1507b2.h() : 0L;
        boolean z7 = jH != 9205357640488583168L;
        boolean z8 = jH2 != 9205357640488583168L;
        if (z7 && z8) {
            return AbstractC0870c.F(Math.max(g0.f.d(jH), g0.f.d(jH2)), Math.max(g0.f.b(jH), g0.f.b(jH2)));
        }
        return 9205357640488583168L;
    }

    @Override // m0.AbstractC1507b
    public final void i(C2351F c2351f) {
        boolean z7 = this.f9043v;
        C0485c0 c0485c0 = this.f9044w;
        AbstractC1507b abstractC1507b = this.f9037p;
        if (z7) {
            j(c2351f, abstractC1507b, c0485c0.f());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f9042u == -1) {
            this.f9042u = jUptimeMillis;
        }
        float f5 = (jUptimeMillis - this.f9042u) / this.f9039r;
        float f7 = c0485c0.f() * e3.c.j(f5, 0.0f, 1.0f);
        float f8 = this.f9040s ? c0485c0.f() - f7 : c0485c0.f();
        this.f9043v = f5 >= 1.0f;
        j(c2351f, this.f9036o, f8);
        j(c2351f, abstractC1507b, f7);
        if (this.f9043v) {
            this.f9036o = null;
        } else {
            C0487d0 c0487d0 = this.f9041t;
            c0487d0.g(c0487d0.f() + 1);
        }
    }

    public final void j(C2351F c2351f, AbstractC1507b abstractC1507b, float f5) {
        if (abstractC1507b == null || f5 <= 0.0f) {
            return;
        }
        C1296b c1296b = c2351f.f17696k;
        long jD = c1296b.d();
        long jH = abstractC1507b.h();
        long jH2 = (jH == 9205357640488583168L || g0.f.e(jH) || jD == 9205357640488583168L || g0.f.e(jD)) ? jD : X.h(jH, this.f9038q.a(jH, jD));
        C0493g0 c0493g0 = this.f9045x;
        if (jD == 9205357640488583168L || g0.f.e(jD)) {
            abstractC1507b.g(c2351f, jH2, f5, (C0990m) c0493g0.getValue());
            return;
        }
        long j7 = jH2;
        float f7 = 2;
        float fD = (g0.f.d(jD) - g0.f.d(j7)) / f7;
        float fB = (g0.f.b(jD) - g0.f.b(j7)) / f7;
        ((X4.y) c1296b.f12205l.f416l).y(fD, fB, fD, fB);
        abstractC1507b.g(c2351f, j7, f5, (C0990m) c0493g0.getValue());
        float f8 = -fD;
        float f9 = -fB;
        ((X4.y) c1296b.f12205l.f416l).y(f8, f9, f8, f9);
    }
}
