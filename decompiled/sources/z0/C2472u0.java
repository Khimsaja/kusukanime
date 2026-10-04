package z0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import e5.AbstractC0832b;
import f1.AbstractC0870c;
import g0.AbstractC0932a;
import h0.AbstractC0966K;
import h0.AbstractC0968M;
import h0.AbstractC0982e;
import h0.C0962G;
import h0.C0963H;
import h0.C0964I;
import h0.C0965J;
import h0.C0970O;
import h0.C0976V;
import h0.C0987j;
import h0.C0998u;
import h0.InterfaceC0958C;
import h0.InterfaceC0967L;
import h0.InterfaceC0995r;
import j0.C1296b;
import k0.C1375b;
import k0.InterfaceC1377d;
import l4.AbstractC1420H;
import m.AbstractC1476F;
import m.C1472B;
import o.C1622t;
import r0.C1861b;

/* renamed from: z0.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2472u0 implements y0.d0 {

    /* renamed from: A, reason: collision with root package name */
    public C0987j f18915A;

    /* renamed from: B, reason: collision with root package name */
    public H1.e0 f18916B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f18917C;

    /* renamed from: k, reason: collision with root package name */
    public C1375b f18919k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0958C f18920l;

    /* renamed from: m, reason: collision with root package name */
    public final C2471u f18921m;

    /* renamed from: n, reason: collision with root package name */
    public D.S f18922n;

    /* renamed from: o, reason: collision with root package name */
    public C1861b f18923o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f18925q;

    /* renamed from: s, reason: collision with root package name */
    public float[] f18927s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f18928t;

    /* renamed from: x, reason: collision with root package name */
    public int f18932x;

    /* renamed from: z, reason: collision with root package name */
    public AbstractC0966K f18934z;

    /* renamed from: p, reason: collision with root package name */
    public long f18924p = AbstractC1420H.a(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* renamed from: r, reason: collision with root package name */
    public final float[] f18926r = C0962G.a();

    /* renamed from: u, reason: collision with root package name */
    public T0.b f18929u = z1.c.a();

    /* renamed from: v, reason: collision with root package name */
    public T0.k f18930v = T0.k.f8844k;

    /* renamed from: w, reason: collision with root package name */
    public final C1296b f18931w = new C1296b();

    /* renamed from: y, reason: collision with root package name */
    public long f18933y = C0976V.f11815b;

    /* renamed from: D, reason: collision with root package name */
    public final C1622t f18918D = new C1622t(19, this);

    public C2472u0(C1375b c1375b, InterfaceC0958C interfaceC0958C, C2471u c2471u, D.S s7, C1861b c1861b) {
        this.f18919k = c1375b;
        this.f18920l = interfaceC0958C;
        this.f18921m = c2471u;
        this.f18922n = s7;
        this.f18923o = c1861b;
    }

    @Override // y0.d0
    public final void a(D.S s7, C1861b c1861b) {
        InterfaceC0958C interfaceC0958C = this.f18920l;
        if (interfaceC0958C == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f18919k.f12580r) {
            throw new IllegalArgumentException("layer should have been released before reuse");
        }
        this.f18919k = interfaceC0958C.b();
        this.f18925q = false;
        this.f18922n = s7;
        this.f18923o = c1861b;
        this.f18933y = C0976V.f11815b;
        this.f18917C = false;
        this.f18924p = AbstractC1420H.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f18934z = null;
        this.f18932x = 0;
    }

    @Override // y0.d0
    public final long b(long j7, boolean z7) {
        if (!z7) {
            return C0962G.b(j7, n());
        }
        float[] fArrM = m();
        if (fArrM != null) {
            return C0962G.b(j7, fArrM);
        }
        return 9187343241974906880L;
    }

    @Override // y0.d0
    public final void c(long j7) {
        if (T0.j.a(j7, this.f18924p)) {
            return;
        }
        this.f18924p = j7;
        if (this.f18928t || this.f18925q) {
            return;
        }
        C2471u c2471u = this.f18921m;
        c2471u.invalidate();
        if (true != this.f18928t) {
            this.f18928t = true;
            c2471u.r(this, true);
        }
    }

    @Override // y0.d0
    public final void d(float[] fArr) {
        C0962G.g(fArr, n());
    }

    @Override // y0.d0
    public final void e(InterfaceC0995r interfaceC0995r, C1375b c1375b) {
        boolean z7;
        float f5;
        Canvas canvasA = AbstractC0982e.a(interfaceC0995r);
        if (!canvasA.isHardwareAccelerated()) {
            C1375b c1375b2 = this.f18919k;
            long j7 = c1375b2.f12581s;
            float f7 = (int) (j7 >> 32);
            float f8 = (int) (j7 & 4294967295L);
            long j8 = this.f18924p;
            float f9 = f7 + ((int) (j8 >> 32));
            float f10 = f8 + ((int) (j8 & 4294967295L));
            if (c1375b2.a.a() < 1.0f) {
                H1.e0 e0VarG = this.f18916B;
                if (e0VarG == null) {
                    e0VarG = AbstractC0968M.g();
                    this.f18916B = e0VarG;
                }
                e0VarG.d(this.f18919k.a.a());
                canvasA.saveLayer(f7, f8, f9, f10, (Paint) e0VarG.f3452b);
            } else {
                interfaceC0995r.l();
            }
            interfaceC0995r.f(f7, f8);
            interfaceC0995r.o(n());
            C1375b c1375b3 = this.f18919k;
            boolean z8 = c1375b3.f12584v;
            if (z8 && z8) {
                AbstractC0966K abstractC0966KC = c1375b3.c();
                if (abstractC0966KC instanceof C0964I) {
                    InterfaceC0995r.r(interfaceC0995r, ((C0964I) abstractC0966KC).a);
                } else if (abstractC0966KC instanceof C0965J) {
                    C0987j c0987jH = this.f18915A;
                    if (c0987jH == null) {
                        c0987jH = AbstractC0968M.h();
                        this.f18915A = c0987jH;
                    }
                    c0987jH.e();
                    InterfaceC0967L.a(c0987jH, ((C0965J) abstractC0966KC).a);
                    interfaceC0995r.s(c0987jH);
                } else if (abstractC0966KC instanceof C0963H) {
                    interfaceC0995r.s(((C0963H) abstractC0966KC).a);
                }
            }
            D.S s7 = this.f18922n;
            if (s7 != null) {
                s7.invoke(interfaceC0995r, null);
            }
            interfaceC0995r.i();
            return;
        }
        j();
        this.f18917C = this.f18919k.a.G() > 0.0f;
        C1296b c1296b = this.f18931w;
        B2.l lVar = c1296b.f12205l;
        lVar.M(interfaceC0995r);
        lVar.f417m = c1375b;
        C1375b c1375b4 = this.f18919k;
        InterfaceC0995r interfaceC0995rT = c1296b.D().t();
        C1375b c1375b5 = (C1375b) c1296b.D().f417m;
        if (c1375b4.f12580r) {
            return;
        }
        c1375b4.a();
        InterfaceC1377d interfaceC1377d = c1375b4.a;
        if (!interfaceC1377d.n()) {
            try {
                c1375b4.e();
            } catch (Throwable unused) {
            }
        }
        boolean z9 = interfaceC1377d.G() > 0.0f;
        if (z9) {
            interfaceC0995rT.p();
        }
        Canvas canvasA2 = AbstractC0982e.a(interfaceC0995rT);
        boolean zIsHardwareAccelerated = canvasA2.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            canvasA2.save();
            long j9 = c1375b4.f12581s;
            float f11 = (int) (j9 >> 32);
            float f12 = (int) (j9 & 4294967295L);
            long j10 = c1375b4.f12582t;
            float f13 = ((int) (j10 >> 32)) + f11;
            float f14 = f12 + ((int) (j10 & 4294967295L));
            float fA = interfaceC1377d.a();
            int iJ = interfaceC1377d.J();
            if (fA < 1.0f || iJ != 3 || interfaceC1377d.y() == 1) {
                H1.e0 e0VarG2 = c1375b4.f12577o;
                if (e0VarG2 == null) {
                    e0VarG2 = AbstractC0968M.g();
                    c1375b4.f12577o = e0VarG2;
                }
                e0VarG2.d(fA);
                e0VarG2.e(iJ);
                e0VarG2.g(null);
                f5 = f11;
                canvasA2.saveLayer(f5, f12, f13, f14, (Paint) e0VarG2.f3452b);
            } else {
                canvasA2.save();
                f5 = f11;
            }
            canvasA2.translate(f5, f12);
            canvasA2.concat(interfaceC1377d.C());
        }
        boolean z10 = !zIsHardwareAccelerated && c1375b4.f12584v;
        if (z10) {
            interfaceC0995rT.l();
            AbstractC0966K abstractC0966KC2 = c1375b4.c();
            if (abstractC0966KC2 instanceof C0964I) {
                InterfaceC0995r.r(interfaceC0995rT, abstractC0966KC2.a());
            } else if (abstractC0966KC2 instanceof C0965J) {
                C0987j c0987jH2 = c1375b4.f12575m;
                if (c0987jH2 != null) {
                    c0987jH2.a.rewind();
                } else {
                    c0987jH2 = AbstractC0968M.h();
                    c1375b4.f12575m = c0987jH2;
                }
                InterfaceC0967L.a(c0987jH2, ((C0965J) abstractC0966KC2).a);
                interfaceC0995rT.s(c0987jH2);
            } else if (abstractC0966KC2 instanceof C0963H) {
                interfaceC0995rT.s(((C0963H) abstractC0966KC2).a);
            }
        }
        if (c1375b5 != null) {
            F1.m mVar = c1375b5.f12579q;
            if (!mVar.a) {
                throw new IllegalArgumentException("Only add dependencies during a tracking");
            }
            C1472B c1472b = (C1472B) mVar.f2207d;
            if (c1472b != null) {
                c1472b.a(c1375b4);
            } else if (((C1375b) mVar.f2205b) != null) {
                int i7 = AbstractC1476F.a;
                C1472B c1472b2 = new C1472B();
                C1375b c1375b6 = (C1375b) mVar.f2205b;
                kotlin.jvm.internal.l.c(c1375b6);
                c1472b2.a(c1375b6);
                c1472b2.a(c1375b4);
                mVar.f2207d = c1472b2;
                mVar.f2205b = null;
            } else {
                mVar.f2205b = c1375b4;
            }
            C1472B c1472b3 = (C1472B) mVar.f2208e;
            if (c1472b3 != null) {
                z7 = !c1472b3.j(c1375b4);
            } else if (((C1375b) mVar.f2206c) != c1375b4) {
                z7 = true;
            } else {
                mVar.f2206c = null;
                z7 = false;
            }
            if (z7) {
                c1375b4.f12578p++;
            }
        }
        interfaceC1377d.r(interfaceC0995rT);
        if (z10) {
            interfaceC0995rT.i();
        }
        if (z9) {
            interfaceC0995rT.m();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasA2.restore();
    }

    @Override // y0.d0
    public final void f(float[] fArr) {
        float[] fArrM = m();
        if (fArrM != null) {
            C0962G.g(fArr, fArrM);
        }
    }

    @Override // y0.d0
    public final void g(g0.b bVar, boolean z7) {
        if (!z7) {
            C0962G.c(n(), bVar);
            return;
        }
        float[] fArrM = m();
        if (fArrM != null) {
            C0962G.c(fArrM, bVar);
            return;
        }
        bVar.a = 0.0f;
        bVar.f11655b = 0.0f;
        bVar.f11656c = 0.0f;
        bVar.f11657d = 0.0f;
    }

    @Override // y0.d0
    public final void h() {
        this.f18922n = null;
        this.f18923o = null;
        this.f18925q = true;
        boolean z7 = this.f18928t;
        C2471u c2471u = this.f18921m;
        if (z7) {
            this.f18928t = false;
            c2471u.r(this, false);
        }
        InterfaceC0958C interfaceC0958C = this.f18920l;
        if (interfaceC0958C != null) {
            interfaceC0958C.a(this.f18919k);
            c2471u.z(this);
        }
    }

    @Override // y0.d0
    public final void i(long j7) {
        C1375b c1375b = this.f18919k;
        if (!T0.h.a(c1375b.f12581s, j7)) {
            c1375b.f12581s = j7;
            long j8 = c1375b.f12582t;
            c1375b.a.E((int) (j7 >> 32), (int) (j7 & 4294967295L), j8);
        }
        int i7 = Build.VERSION.SDK_INT;
        C2471u c2471u = this.f18921m;
        if (i7 >= 26) {
            p1.a.a(c2471u);
        } else {
            c2471u.invalidate();
        }
    }

    @Override // y0.d0
    public final void invalidate() {
        if (this.f18928t || this.f18925q) {
            return;
        }
        C2471u c2471u = this.f18921m;
        c2471u.invalidate();
        if (true != this.f18928t) {
            this.f18928t = true;
            c2471u.r(this, true);
        }
    }

    @Override // y0.d0
    public final void j() {
        if (this.f18928t) {
            if (!C0976V.a(this.f18933y, C0976V.f11815b) && !T0.j.a(this.f18919k.f12582t, this.f18924p)) {
                C1375b c1375b = this.f18919k;
                long jE = AbstractC0832b.e(C0976V.b(this.f18933y) * ((int) (this.f18924p >> 32)), C0976V.c(this.f18933y) * ((int) (this.f18924p & 4294967295L)));
                if (!g0.c.b(c1375b.f12583u, jE)) {
                    c1375b.f12583u = jE;
                    c1375b.a.K(jE);
                }
            }
            C1375b c1375b2 = this.f18919k;
            T0.b bVar = this.f18929u;
            T0.k kVar = this.f18930v;
            long j7 = this.f18924p;
            if (!T0.j.a(c1375b2.f12582t, j7)) {
                c1375b2.f12582t = j7;
                long j8 = c1375b2.f12581s;
                c1375b2.a.E((int) (j8 >> 32), (int) (4294967295L & j8), j7);
                if (c1375b2.f12571i == 9205357640488583168L) {
                    c1375b2.f12569g = true;
                    c1375b2.a();
                }
            }
            c1375b2.f12564b = bVar;
            c1375b2.f12565c = kVar;
            c1375b2.f12566d = this.f18918D;
            c1375b2.e();
            if (this.f18928t) {
                this.f18928t = false;
                this.f18921m.r(this, false);
            }
        }
    }

    @Override // y0.d0
    public final boolean k(long j7) {
        float fD = g0.c.d(j7);
        float fE = g0.c.e(j7);
        C1375b c1375b = this.f18919k;
        if (c1375b.f12584v) {
            return O.v(c1375b.c(), fD, fE);
        }
        return true;
    }

    @Override // y0.d0
    public final void l(C0970O c0970o) {
        C1861b c1861b;
        C1861b c1861b2;
        int i7 = c0970o.f11785k | this.f18932x;
        this.f18930v = c0970o.f11798x;
        this.f18929u = c0970o.f11797w;
        int i8 = i7 & 4096;
        if (i8 != 0) {
            this.f18933y = c0970o.f11793s;
        }
        if ((i7 & 1) != 0) {
            C1375b c1375b = this.f18919k;
            float f5 = c0970o.f11786l;
            InterfaceC1377d interfaceC1377d = c1375b.a;
            if (interfaceC1377d.o() != f5) {
                interfaceC1377d.g(f5);
            }
        }
        if ((i7 & 2) != 0) {
            C1375b c1375b2 = this.f18919k;
            float f7 = c0970o.f11787m;
            InterfaceC1377d interfaceC1377d2 = c1375b2.a;
            if (interfaceC1377d2.H() != f7) {
                interfaceC1377d2.k(f7);
            }
        }
        if ((i7 & 4) != 0) {
            C1375b c1375b3 = this.f18919k;
            float f8 = c0970o.f11788n;
            InterfaceC1377d interfaceC1377d3 = c1375b3.a;
            if (interfaceC1377d3.a() != f8) {
                interfaceC1377d3.c(f8);
            }
        }
        if ((i7 & 8) != 0) {
            InterfaceC1377d interfaceC1377d4 = this.f18919k.a;
            if (interfaceC1377d4.w() != 0.0f) {
                interfaceC1377d4.i();
            }
        }
        if ((i7 & 16) != 0) {
            InterfaceC1377d interfaceC1377d5 = this.f18919k.a;
            if (interfaceC1377d5.q() != 0.0f) {
                interfaceC1377d5.d();
            }
        }
        boolean z7 = true;
        if ((i7 & 32) != 0) {
            C1375b c1375b4 = this.f18919k;
            float f9 = c0970o.f11789o;
            InterfaceC1377d interfaceC1377d6 = c1375b4.a;
            if (interfaceC1377d6.G() != f9) {
                interfaceC1377d6.p(f9);
                c1375b4.f12569g = true;
                c1375b4.a();
            }
            if (c0970o.f11789o > 0.0f && !this.f18917C && (c1861b2 = this.f18923o) != null) {
                c1861b2.invoke();
            }
        }
        if ((i7 & 64) != 0) {
            C1375b c1375b5 = this.f18919k;
            long j7 = c0970o.f11790p;
            InterfaceC1377d interfaceC1377d7 = c1375b5.a;
            if (!C0998u.c(j7, interfaceC1377d7.L())) {
                interfaceC1377d7.t(j7);
            }
        }
        if ((i7 & 128) != 0) {
            C1375b c1375b6 = this.f18919k;
            long j8 = c0970o.f11791q;
            InterfaceC1377d interfaceC1377d8 = c1375b6.a;
            if (!C0998u.c(j8, interfaceC1377d8.s())) {
                interfaceC1377d8.B(j8);
            }
        }
        if ((i7 & 1024) != 0) {
            InterfaceC1377d interfaceC1377d9 = this.f18919k.a;
            if (interfaceC1377d9.I() != 0.0f) {
                interfaceC1377d9.j();
            }
        }
        if ((i7 & 256) != 0) {
            InterfaceC1377d interfaceC1377d10 = this.f18919k.a;
            if (interfaceC1377d10.z() != 0.0f) {
                interfaceC1377d10.b();
            }
        }
        if ((i7 & 512) != 0) {
            InterfaceC1377d interfaceC1377d11 = this.f18919k.a;
            if (interfaceC1377d11.F() != 0.0f) {
                interfaceC1377d11.f();
            }
        }
        if ((i7 & 2048) != 0) {
            C1375b c1375b7 = this.f18919k;
            float f10 = c0970o.f11792r;
            InterfaceC1377d interfaceC1377d12 = c1375b7.a;
            if (interfaceC1377d12.v() != f10) {
                interfaceC1377d12.m(f10);
            }
        }
        if (i8 != 0) {
            if (C0976V.a(this.f18933y, C0976V.f11815b)) {
                C1375b c1375b8 = this.f18919k;
                if (!g0.c.b(c1375b8.f12583u, 9205357640488583168L)) {
                    c1375b8.f12583u = 9205357640488583168L;
                    c1375b8.a.K(9205357640488583168L);
                }
            } else {
                C1375b c1375b9 = this.f18919k;
                long jE = AbstractC0832b.e(C0976V.b(this.f18933y) * ((int) (this.f18924p >> 32)), C0976V.c(this.f18933y) * ((int) (this.f18924p & 4294967295L)));
                if (!g0.c.b(c1375b9.f12583u, jE)) {
                    c1375b9.f12583u = jE;
                    c1375b9.a.K(jE);
                }
            }
        }
        if ((i7 & 16384) != 0) {
            C1375b c1375b10 = this.f18919k;
            boolean z8 = c0970o.f11795u;
            if (c1375b10.f12584v != z8) {
                c1375b10.f12584v = z8;
                c1375b10.f12569g = true;
                c1375b10.a();
            }
        }
        if ((131072 & i7) != 0) {
            InterfaceC1377d interfaceC1377d13 = this.f18919k.a;
        }
        if ((32768 & i7) != 0) {
            InterfaceC1377d interfaceC1377d14 = this.f18919k.a;
            if (interfaceC1377d14.y() != 0) {
                interfaceC1377d14.A(0);
            }
        }
        if (kotlin.jvm.internal.l.a(this.f18934z, c0970o.f11799y)) {
            z7 = false;
        } else {
            AbstractC0966K abstractC0966K = c0970o.f11799y;
            this.f18934z = abstractC0966K;
            if (abstractC0966K != null) {
                C1375b c1375b11 = this.f18919k;
                if (abstractC0966K instanceof C0964I) {
                    g0.d dVar = ((C0964I) abstractC0966K).a;
                    c1375b11.f(0.0f, AbstractC0832b.e(dVar.a, dVar.f11659b), AbstractC0870c.F(dVar.c(), dVar.b()));
                } else if (abstractC0966K instanceof C0963H) {
                    c1375b11.f12573k = null;
                    c1375b11.f12571i = 9205357640488583168L;
                    c1375b11.f12570h = 0L;
                    c1375b11.f12572j = 0.0f;
                    c1375b11.f12569g = true;
                    c1375b11.f12576n = false;
                    c1375b11.f12574l = ((C0963H) abstractC0966K).a;
                    c1375b11.a();
                } else if (abstractC0966K instanceof C0965J) {
                    C0965J c0965j = (C0965J) abstractC0966K;
                    C0987j c0987j = c0965j.f11781b;
                    if (c0987j != null) {
                        c1375b11.f12573k = null;
                        c1375b11.f12571i = 9205357640488583168L;
                        c1375b11.f12570h = 0L;
                        c1375b11.f12572j = 0.0f;
                        c1375b11.f12569g = true;
                        c1375b11.f12576n = false;
                        c1375b11.f12574l = c0987j;
                        c1375b11.a();
                    } else {
                        g0.e eVar = c0965j.a;
                        c1375b11.f(AbstractC0932a.b(eVar.f11668h), AbstractC0832b.e(eVar.a, eVar.f11662b), AbstractC0870c.F(eVar.b(), eVar.a()));
                    }
                }
                if ((abstractC0966K instanceof C0963H) && Build.VERSION.SDK_INT < 33 && (c1861b = this.f18923o) != null) {
                    c1861b.invoke();
                }
            }
        }
        this.f18932x = c0970o.f11785k;
        if (i7 != 0 || z7) {
            int i9 = Build.VERSION.SDK_INT;
            C2471u c2471u = this.f18921m;
            if (i9 >= 26) {
                p1.a.a(c2471u);
            } else {
                c2471u.invalidate();
            }
        }
    }

    public final float[] m() {
        float[] fArrN = n();
        float[] fArrA = this.f18927s;
        if (fArrA == null) {
            fArrA = C0962G.a();
            this.f18927s = fArrA;
        }
        if (O.t(fArrN, fArrA)) {
            return fArrA;
        }
        return null;
    }

    public final float[] n() {
        C1375b c1375b = this.f18919k;
        long jQ = AbstractC0832b.y(c1375b.f12583u) ? AbstractC0870c.Q(AbstractC1420H.O(this.f18924p)) : c1375b.f12583u;
        float[] fArr = this.f18926r;
        C0962G.d(fArr);
        float[] fArrA = C0962G.a();
        C0962G.h(fArrA, -g0.c.d(jQ), -g0.c.e(jQ));
        C0962G.g(fArr, fArrA);
        float[] fArrA2 = C0962G.a();
        InterfaceC1377d interfaceC1377d = c1375b.a;
        C0962G.h(fArrA2, interfaceC1377d.w(), interfaceC1377d.q());
        double dZ = (interfaceC1377d.z() * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(dZ);
        float fSin = (float) Math.sin(dZ);
        float f5 = fArrA2[1];
        float f7 = fArrA2[2];
        float f8 = fArrA2[5];
        float f9 = fArrA2[6];
        float f10 = fArrA2[9];
        float f11 = fArrA2[10];
        float f12 = fArrA2[13];
        float f13 = fArrA2[14];
        fArrA2[1] = (f5 * fCos) - (f7 * fSin);
        fArrA2[2] = (f7 * fCos) + (f5 * fSin);
        fArrA2[5] = (f8 * fCos) - (f9 * fSin);
        fArrA2[6] = (f9 * fCos) + (f8 * fSin);
        fArrA2[9] = (f10 * fCos) - (f11 * fSin);
        fArrA2[10] = (f11 * fCos) + (f10 * fSin);
        fArrA2[13] = (f12 * fCos) - (f13 * fSin);
        fArrA2[14] = (f13 * fCos) + (f12 * fSin);
        double dF = (interfaceC1377d.F() * 3.141592653589793d) / 180.0d;
        float fCos2 = (float) Math.cos(dF);
        float fSin2 = (float) Math.sin(dF);
        float f14 = fArrA2[0];
        float f15 = fArrA2[2];
        float f16 = fArrA2[4];
        float f17 = fArrA2[6];
        float f18 = fArrA2[8];
        float f19 = fArrA2[10];
        float f20 = fArrA2[12];
        float f21 = fArrA2[14];
        fArrA2[0] = (f15 * fSin2) + (f14 * fCos2);
        fArrA2[2] = (f15 * fCos2) + ((-f14) * fSin2);
        fArrA2[4] = (f17 * fSin2) + (f16 * fCos2);
        fArrA2[6] = (f17 * fCos2) + ((-f16) * fSin2);
        fArrA2[8] = (f19 * fSin2) + (f18 * fCos2);
        fArrA2[10] = (f19 * fCos2) + ((-f18) * fSin2);
        fArrA2[12] = (f21 * fSin2) + (f20 * fCos2);
        fArrA2[14] = (f21 * fCos2) + ((-f20) * fSin2);
        C0962G.e(fArrA2, interfaceC1377d.I());
        C0962G.f(fArrA2, interfaceC1377d.o(), interfaceC1377d.H());
        C0962G.g(fArr, fArrA2);
        float[] fArrA3 = C0962G.a();
        C0962G.h(fArrA3, g0.c.d(jQ), g0.c.e(jQ));
        C0962G.g(fArr, fArrA3);
        return fArr;
    }
}
