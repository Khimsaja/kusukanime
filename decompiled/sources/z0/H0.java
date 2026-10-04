package z0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import h0.AbstractC0966K;
import h0.AbstractC0968M;
import h0.AbstractC0982e;
import h0.C0962G;
import h0.C0970O;
import h0.C0976V;
import h0.C0996s;
import h0.InterfaceC0995r;
import k0.C1375b;
import r0.C1861b;

/* loaded from: classes.dex */
public final class H0 implements y0.d0 {

    /* renamed from: k, reason: collision with root package name */
    public final C2471u f18623k;

    /* renamed from: l, reason: collision with root package name */
    public D.S f18624l;

    /* renamed from: m, reason: collision with root package name */
    public C1861b f18625m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18626n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18628p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f18629q;

    /* renamed from: r, reason: collision with root package name */
    public H1.e0 f18630r;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC2459n0 f18634v;

    /* renamed from: w, reason: collision with root package name */
    public int f18635w;

    /* renamed from: o, reason: collision with root package name */
    public final A0 f18627o = new A0();

    /* renamed from: s, reason: collision with root package name */
    public final M2.a f18631s = new M2.a(C2449i0.f18769n);

    /* renamed from: t, reason: collision with root package name */
    public final C0996s f18632t = new C0996s();

    /* renamed from: u, reason: collision with root package name */
    public long f18633u = C0976V.f11815b;

    public H0(C2471u c2471u, D.S s7, C1861b c1861b) {
        this.f18623k = c2471u;
        this.f18624l = s7;
        this.f18625m = c1861b;
        InterfaceC2459n0 f02 = Build.VERSION.SDK_INT >= 29 ? new F0() : new E0(c2471u);
        f02.I();
        f02.w(false);
        this.f18634v = f02;
    }

    @Override // y0.d0
    public final void a(D.S s7, C1861b c1861b) {
        m(false);
        this.f18628p = false;
        this.f18629q = false;
        this.f18633u = C0976V.f11815b;
        this.f18624l = s7;
        this.f18625m = c1861b;
    }

    @Override // y0.d0
    public final long b(long j7, boolean z7) {
        InterfaceC2459n0 interfaceC2459n0 = this.f18634v;
        M2.a aVar = this.f18631s;
        if (!z7) {
            return C0962G.b(j7, aVar.b(interfaceC2459n0));
        }
        float[] fArrA = aVar.a(interfaceC2459n0);
        if (fArrA != null) {
            return C0962G.b(j7, fArrA);
        }
        return 9187343241974906880L;
    }

    @Override // y0.d0
    public final void c(long j7) {
        int i7 = (int) (j7 >> 32);
        int i8 = (int) (j7 & 4294967295L);
        float fB = C0976V.b(this.f18633u) * i7;
        InterfaceC2459n0 interfaceC2459n0 = this.f18634v;
        interfaceC2459n0.v(fB);
        interfaceC2459n0.A(C0976V.c(this.f18633u) * i8);
        if (interfaceC2459n0.x(interfaceC2459n0.u(), interfaceC2459n0.t(), interfaceC2459n0.u() + i7, interfaceC2459n0.t() + i8)) {
            interfaceC2459n0.G(this.f18627o.b());
            if (!this.f18626n && !this.f18628p) {
                this.f18623k.invalidate();
                m(true);
            }
            this.f18631s.c();
        }
    }

    @Override // y0.d0
    public final void d(float[] fArr) {
        C0962G.g(fArr, this.f18631s.b(this.f18634v));
    }

    @Override // y0.d0
    public final void e(InterfaceC0995r interfaceC0995r, C1375b c1375b) {
        Canvas canvasA = AbstractC0982e.a(interfaceC0995r);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        InterfaceC2459n0 interfaceC2459n0 = this.f18634v;
        if (zIsHardwareAccelerated) {
            j();
            boolean z7 = interfaceC2459n0.L() > 0.0f;
            this.f18629q = z7;
            if (z7) {
                interfaceC0995r.p();
            }
            interfaceC2459n0.s(canvasA);
            if (this.f18629q) {
                interfaceC0995r.m();
                return;
            }
            return;
        }
        float fU = interfaceC2459n0.u();
        float fT = interfaceC2459n0.t();
        float fC = interfaceC2459n0.C();
        float fP = interfaceC2459n0.p();
        if (interfaceC2459n0.a() < 1.0f) {
            H1.e0 e0VarG = this.f18630r;
            if (e0VarG == null) {
                e0VarG = AbstractC0968M.g();
                this.f18630r = e0VarG;
            }
            e0VarG.d(interfaceC2459n0.a());
            canvasA.saveLayer(fU, fT, fC, fP, (Paint) e0VarG.f3452b);
        } else {
            interfaceC0995r.l();
        }
        interfaceC0995r.f(fU, fT);
        interfaceC0995r.o(this.f18631s.b(interfaceC2459n0));
        if (interfaceC2459n0.D() || interfaceC2459n0.q()) {
            this.f18627o.a(interfaceC0995r);
        }
        D.S s7 = this.f18624l;
        if (s7 != null) {
            s7.invoke(interfaceC0995r, null);
        }
        interfaceC0995r.i();
        m(false);
    }

    @Override // y0.d0
    public final void f(float[] fArr) {
        float[] fArrA = this.f18631s.a(this.f18634v);
        if (fArrA != null) {
            C0962G.g(fArr, fArrA);
        }
    }

    @Override // y0.d0
    public final void g(g0.b bVar, boolean z7) {
        InterfaceC2459n0 interfaceC2459n0 = this.f18634v;
        M2.a aVar = this.f18631s;
        if (!z7) {
            C0962G.c(aVar.b(interfaceC2459n0), bVar);
            return;
        }
        float[] fArrA = aVar.a(interfaceC2459n0);
        if (fArrA != null) {
            C0962G.c(fArrA, bVar);
            return;
        }
        bVar.a = 0.0f;
        bVar.f11655b = 0.0f;
        bVar.f11656c = 0.0f;
        bVar.f11657d = 0.0f;
    }

    @Override // y0.d0
    public final void h() {
        InterfaceC2459n0 interfaceC2459n0 = this.f18634v;
        if (interfaceC2459n0.n()) {
            interfaceC2459n0.h();
        }
        this.f18624l = null;
        this.f18625m = null;
        this.f18628p = true;
        m(false);
        C2471u c2471u = this.f18623k;
        c2471u.J = true;
        c2471u.z(this);
    }

    @Override // y0.d0
    public final void i(long j7) {
        InterfaceC2459n0 interfaceC2459n0 = this.f18634v;
        int iU = interfaceC2459n0.u();
        int iT = interfaceC2459n0.t();
        int i7 = (int) (j7 >> 32);
        int i8 = (int) (j7 & 4294967295L);
        if (iU == i7 && iT == i8) {
            return;
        }
        if (iU != i7) {
            interfaceC2459n0.o(i7 - iU);
        }
        if (iT != i8) {
            interfaceC2459n0.E(i8 - iT);
        }
        int i9 = Build.VERSION.SDK_INT;
        C2471u c2471u = this.f18623k;
        if (i9 >= 26) {
            p1.a.a(c2471u);
        } else {
            c2471u.invalidate();
        }
        this.f18631s.c();
    }

    @Override // y0.d0
    public final void invalidate() {
        if (this.f18626n || this.f18628p) {
            return;
        }
        this.f18623k.invalidate();
        m(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    @Override // y0.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            r5 = this;
            boolean r0 = r5.f18626n
            z0.n0 r1 = r5.f18634v
            if (r0 != 0) goto Le
            boolean r0 = r1.n()
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            boolean r0 = r1.D()
            if (r0 == 0) goto L20
            z0.A0 r0 = r5.f18627o
            boolean r2 = r0.f18554g
            if (r2 == 0) goto L20
            r0.d()
            h0.L r0 = r0.f18552e
            goto L21
        L20:
            r0 = 0
        L21:
            D.S r2 = r5.f18624l
            if (r2 == 0) goto L31
            o.t r3 = new o.t
            r4 = 21
            r3.<init>(r4, r2)
            h0.s r2 = r5.f18632t
            r1.J(r2, r0, r3)
        L31:
            r0 = 0
            r5.m(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.H0.j():void");
    }

    @Override // y0.d0
    public final boolean k(long j7) {
        AbstractC0966K abstractC0966K;
        float fD = g0.c.d(j7);
        float fE = g0.c.e(j7);
        InterfaceC2459n0 interfaceC2459n0 = this.f18634v;
        if (interfaceC2459n0.q()) {
            if (0.0f > fD || fD >= interfaceC2459n0.l() || 0.0f > fE || fE >= interfaceC2459n0.e()) {
                return false;
            }
        } else if (interfaceC2459n0.D()) {
            A0 a02 = this.f18627o;
            if (a02.f18560m && (abstractC0966K = a02.f18550c) != null) {
                return O.v(abstractC0966K, g0.c.d(j7), g0.c.e(j7));
            }
            return true;
        }
        return true;
    }

    @Override // y0.d0
    public final void l(C0970O c0970o) {
        C1861b c1861b;
        int i7 = c0970o.f11785k | this.f18635w;
        int i8 = i7 & 4096;
        if (i8 != 0) {
            this.f18633u = c0970o.f11793s;
        }
        InterfaceC2459n0 interfaceC2459n0 = this.f18634v;
        boolean zD = interfaceC2459n0.D();
        A0 a02 = this.f18627o;
        boolean z7 = false;
        boolean z8 = zD && a02.f18554g;
        if ((i7 & 1) != 0) {
            interfaceC2459n0.g(c0970o.f11786l);
        }
        if ((i7 & 2) != 0) {
            interfaceC2459n0.k(c0970o.f11787m);
        }
        if ((i7 & 4) != 0) {
            interfaceC2459n0.c(c0970o.f11788n);
        }
        if ((i7 & 8) != 0) {
            interfaceC2459n0.i();
        }
        if ((i7 & 16) != 0) {
            interfaceC2459n0.d();
        }
        if ((i7 & 32) != 0) {
            interfaceC2459n0.B(c0970o.f11789o);
        }
        if ((i7 & 64) != 0) {
            interfaceC2459n0.z(AbstractC0968M.w(c0970o.f11790p));
        }
        if ((i7 & 128) != 0) {
            interfaceC2459n0.H(AbstractC0968M.w(c0970o.f11791q));
        }
        if ((i7 & 1024) != 0) {
            interfaceC2459n0.j();
        }
        if ((i7 & 256) != 0) {
            interfaceC2459n0.b();
        }
        if ((i7 & 512) != 0) {
            interfaceC2459n0.f();
        }
        if ((i7 & 2048) != 0) {
            interfaceC2459n0.m(c0970o.f11792r);
        }
        if (i8 != 0) {
            interfaceC2459n0.v(C0976V.b(this.f18633u) * interfaceC2459n0.l());
            interfaceC2459n0.A(C0976V.c(this.f18633u) * interfaceC2459n0.e());
        }
        boolean z9 = c0970o.f11795u;
        R1.i iVar = AbstractC0968M.a;
        boolean z10 = z9 && c0970o.f11794t != iVar;
        if ((i7 & 24576) != 0) {
            interfaceC2459n0.F(z10);
            interfaceC2459n0.w(c0970o.f11795u && c0970o.f11794t == iVar);
        }
        if ((131072 & i7) != 0) {
            interfaceC2459n0.r();
        }
        if ((32768 & i7) != 0) {
            interfaceC2459n0.y();
        }
        boolean zC = this.f18627o.c(c0970o.f11799y, c0970o.f11788n, z10, c0970o.f11789o, c0970o.f11796v);
        if (a02.f18553f) {
            interfaceC2459n0.G(a02.b());
        }
        if (z10 && a02.f18554g) {
            z7 = true;
        }
        C2471u c2471u = this.f18623k;
        if (z8 != z7 || (z7 && zC)) {
            if (!this.f18626n && !this.f18628p) {
                c2471u.invalidate();
                m(true);
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            p1.a.a(c2471u);
        } else {
            c2471u.invalidate();
        }
        if (!this.f18629q && interfaceC2459n0.L() > 0.0f && (c1861b = this.f18625m) != null) {
            c1861b.invoke();
        }
        if ((i7 & 7963) != 0) {
            this.f18631s.c();
        }
        this.f18635w = c0970o.f11785k;
    }

    public final void m(boolean z7) {
        if (z7 != this.f18626n) {
            this.f18626n = z7;
            this.f18623k.r(this, z7);
        }
    }
}
