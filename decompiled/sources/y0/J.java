package y0;

import O.C0517t;
import f6.AbstractC0905c;
import java.util.List;
import l4.AbstractC1420H;
import o.C1622t;
import p.AbstractC1755i;
import r0.C1861b;
import w0.AbstractC2182Q;
import w0.C2196n;
import w0.InterfaceC2172G;
import z0.C2471u;

/* loaded from: classes.dex */
public final class J extends w0.S implements InterfaceC2172G, InterfaceC2354a, T {

    /* renamed from: A, reason: collision with root package name */
    public Object f17720A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f17721B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f17722C;

    /* renamed from: G, reason: collision with root package name */
    public boolean f17726G;
    public float I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public e4.k f17728K;

    /* renamed from: M, reason: collision with root package name */
    public float f17730M;

    /* renamed from: N, reason: collision with root package name */
    public final A.m f17731N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f17732O;

    /* renamed from: P, reason: collision with root package name */
    public final /* synthetic */ K f17733P;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17734p;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17737s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f17738t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f17740v;

    /* renamed from: x, reason: collision with root package name */
    public e4.k f17742x;

    /* renamed from: y, reason: collision with root package name */
    public float f17743y;

    /* renamed from: q, reason: collision with root package name */
    public int f17735q = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public int f17736r = Integer.MAX_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public int f17739u = 3;

    /* renamed from: w, reason: collision with root package name */
    public long f17741w = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f17744z = true;

    /* renamed from: D, reason: collision with root package name */
    public final C2350E f17723D = new C2350E(this, 0);

    /* renamed from: E, reason: collision with root package name */
    public final Q.d f17724E = new Q.d(new J[16]);

    /* renamed from: F, reason: collision with root package name */
    public boolean f17725F = true;

    /* renamed from: H, reason: collision with root package name */
    public final C1861b f17727H = new C1861b(7, this);

    /* renamed from: L, reason: collision with root package name */
    public long f17729L = 0;

    public J(K k7) {
        this.f17733P = k7;
        this.f17731N = new A.m(14, k7, this);
    }

    @Override // y0.InterfaceC2354a
    public final void E(C1622t c1622t) {
        Q.d dVarV = this.f17733P.a.v();
        int i7 = dVarV.f7829m;
        if (i7 > 0) {
            Object[] objArr = dVarV.f7827k;
            int i8 = 0;
            do {
                c1622t.invoke(((C2349D) objArr[i8]).f17661H.f17761r);
                i8++;
            } while (i8 < i7);
        }
    }

    @Override // y0.T
    public final void M(boolean z7) {
        K k7 = this.f17733P;
        boolean z8 = k7.a().f17770p;
        if (z7 != z8) {
            k7.a().f17770p = z8;
            this.f17732O = true;
        }
    }

    @Override // w0.InterfaceC2172G
    public final int W(int i7) {
        w0();
        return this.f17733P.a().W(i7);
    }

    @Override // y0.InterfaceC2354a
    public final void X() {
        C2349D.T(this.f17733P.a, false, 7);
    }

    @Override // w0.InterfaceC2172G
    public final int Y(int i7) {
        w0();
        return this.f17733P.a().Y(i7);
    }

    @Override // w0.InterfaceC2172G
    public final w0.S b(long j7) {
        int i7;
        K k7 = this.f17733P;
        C2349D c2349d = k7.a;
        if (c2349d.f17669R == 3) {
            c2349d.f();
        }
        C2349D c2349d2 = k7.a;
        if (AbstractC2359f.r(c2349d2)) {
            I i8 = k7.f17762s;
            kotlin.jvm.internal.l.c(i8);
            i8.f17712s = 3;
            i8.b(j7);
        }
        C2349D c2349dS = c2349d2.s();
        if (c2349dS == null) {
            this.f17739u = 3;
        } else {
            if (this.f17739u != 3 && !c2349d2.f17659F) {
                AbstractC0905c.C("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            K k8 = c2349dS.f17661H;
            int iB = AbstractC1755i.b(k8.f17746c);
            if (iB != 0) {
                i7 = 2;
                if (iB != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(v.c0.f(k8.f17746c)));
                }
            } else {
                i7 = 1;
            }
            this.f17739u = i7;
        }
        z0(j7);
        return this;
    }

    @Override // w0.InterfaceC2172G
    public final int b0(int i7) {
        w0();
        return this.f17733P.a().b0(i7);
    }

    @Override // w0.InterfaceC2172G
    public final int c(int i7) {
        w0();
        return this.f17733P.a().c(i7);
    }

    @Override // w0.S
    public final int c0(C2196n c2196n) {
        K k7 = this.f17733P;
        C2349D c2349dS = k7.a.s();
        int i7 = c2349dS != null ? c2349dS.f17661H.f17746c : 0;
        C2350E c2350e = this.f17723D;
        if (i7 == 1) {
            c2350e.f17688c = true;
        } else {
            C2349D c2349dS2 = k7.a.s();
            if ((c2349dS2 != null ? c2349dS2.f17661H.f17746c : 0) == 3) {
                c2350e.f17689d = true;
            }
        }
        this.f17740v = true;
        int iC0 = k7.a().c0(c2196n);
        this.f17740v = false;
        return iC0;
    }

    @Override // w0.S
    public final int f0() {
        return this.f17733P.a().f0();
    }

    @Override // w0.S, w0.InterfaceC2172G
    public final Object h() {
        return this.f17720A;
    }

    @Override // w0.S
    public final int h0() {
        return this.f17733P.a().h0();
    }

    @Override // y0.InterfaceC2354a
    public final C2372t j() {
        return (C2372t) this.f17733P.a.f17660G.f7173c;
    }

    @Override // w0.S
    public final void j0(long j7, float f5, e4.k kVar) {
        AbstractC2182Q placementScope;
        this.f17722C = true;
        boolean zA = T0.h.a(j7, this.f17741w);
        K k7 = this.f17733P;
        if (!zA || this.f17732O) {
            if (k7.f17756m || k7.f17755l || this.f17732O) {
                k7.f17748e = true;
                this.f17732O = false;
            }
            v0();
        }
        if (AbstractC2359f.r(k7.a)) {
            Y y7 = k7.a().f17827x;
            C2349D c2349d = k7.a;
            if (y7 == null || (placementScope = y7.f17773s) == null) {
                placementScope = ((C2471u) AbstractC2352G.a(c2349d)).getPlacementScope();
            }
            I i7 = k7.f17762s;
            kotlin.jvm.internal.l.c(i7);
            C2349D c2349dS = c2349d.s();
            if (c2349dS != null) {
                c2349dS.f17661H.f17753j = 0;
            }
            i7.f17711r = Integer.MAX_VALUE;
            AbstractC2182Q.d(placementScope, i7, (int) (j7 >> 32), (int) (4294967295L & j7));
        }
        I i8 = k7.f17762s;
        if (i8 == null || i8.f17714u) {
            y0(j7, f5, kVar);
        } else {
            AbstractC0905c.C("Error: Placement happened before lookahead.");
            throw null;
        }
    }

    @Override // y0.InterfaceC2354a
    public final InterfaceC2354a l() {
        K k7;
        C2349D c2349dS = this.f17733P.a.s();
        if (c2349dS == null || (k7 = c2349dS.f17661H) == null) {
            return null;
        }
        return k7.f17761r;
    }

    @Override // y0.InterfaceC2354a
    public final C2350E m() {
        return this.f17723D;
    }

    public final List n0() {
        K k7 = this.f17733P;
        k7.a.a0();
        boolean z7 = this.f17725F;
        Q.d dVar = this.f17724E;
        if (!z7) {
            return dVar.f();
        }
        C2349D c2349d = k7.a;
        Q.d dVarV = c2349d.v();
        int i7 = dVarV.f7829m;
        if (i7 > 0) {
            Object[] objArr = dVarV.f7827k;
            int i8 = 0;
            do {
                C2349D c2349d2 = (C2349D) objArr[i8];
                if (dVar.f7829m <= i8) {
                    dVar.b(c2349d2.f17661H.f17761r);
                } else {
                    J j7 = c2349d2.f17661H.f17761r;
                    Object[] objArr2 = dVar.f7827k;
                    Object obj = objArr2[i8];
                    objArr2[i8] = j7;
                }
                i8++;
            } while (i8 < i7);
        }
        dVar.o(((Q.a) c2349d.n()).f7821k.f7829m, dVar.f7829m);
        this.f17725F = false;
        return dVar.f();
    }

    @Override // y0.InterfaceC2354a
    public final void p() {
        Q.d dVarV;
        int i7;
        this.f17726G = true;
        C2350E c2350e = this.f17723D;
        c2350e.h();
        K k7 = this.f17733P;
        boolean z7 = k7.f17748e;
        C2349D c2349d = k7.a;
        if (z7 && (i7 = (dVarV = c2349d.v()).f7829m) > 0) {
            Object[] objArr = dVarV.f7827k;
            int i8 = 0;
            do {
                C2349D c2349d2 = (C2349D) objArr[i8];
                K k8 = c2349d2.f17661H;
                if (k8.f17747d && k8.f17761r.f17739u == 1 && C2349D.M(c2349d2)) {
                    C2349D.T(c2349d, false, 7);
                }
                i8++;
            } while (i8 < i7);
        }
        if (k7.f17749f || (!this.f17740v && !j().f17772r && k7.f17748e)) {
            k7.f17748e = false;
            int i9 = k7.f17746c;
            k7.f17746c = 3;
            k7.e(false);
            g0 snapshotObserver = ((C2471u) AbstractC2352G.a(c2349d)).getSnapshotObserver();
            snapshotObserver.a(c2349d, snapshotObserver.f17856e, this.f17727H);
            k7.f17746c = i9;
            if (j().f17772r && k7.f17755l) {
                requestLayout();
            }
            k7.f17749f = false;
        }
        if (c2350e.f17689d) {
            c2350e.f17690e = true;
        }
        if (c2350e.f17687b && c2350e.e()) {
            c2350e.g();
        }
        this.f17726G = false;
    }

    public final void p0() {
        boolean z7 = this.f17721B;
        this.f17721B = true;
        C2349D c2349d = this.f17733P.a;
        if (!z7) {
            K k7 = c2349d.f17661H;
            if (k7.f17747d) {
                C2349D.T(c2349d, true, 6);
            } else if (k7.f17750g) {
                C2349D.R(c2349d, true, 6);
            }
        }
        C0517t c0517t = c2349d.f17660G;
        Y y7 = ((C2372t) c0517t.f7173c).f17826w;
        for (Y y8 = (Y) c0517t.f7174d; !kotlin.jvm.internal.l.a(y8, y7) && y8 != null; y8 = y8.f17826w) {
            if (y8.f17823M) {
                y8.V0();
            }
        }
        Q.d dVarV = c2349d.v();
        int i7 = dVarV.f7829m;
        if (i7 > 0) {
            Object[] objArr = dVarV.f7827k;
            int i8 = 0;
            do {
                C2349D c2349d2 = (C2349D) objArr[i8];
                if (c2349d2.t() != Integer.MAX_VALUE) {
                    c2349d2.f17661H.f17761r.p0();
                    C2349D.U(c2349d2);
                }
                i8++;
            } while (i8 < i7);
        }
    }

    @Override // y0.InterfaceC2354a
    public final boolean r() {
        return this.f17721B;
    }

    @Override // y0.InterfaceC2354a
    public final void requestLayout() {
        this.f17733P.a.S(false);
    }

    public final void u0() {
        if (this.f17721B) {
            int i7 = 0;
            this.f17721B = false;
            K k7 = this.f17733P;
            C0517t c0517t = k7.a.f17660G;
            Y y7 = ((C2372t) c0517t.f7173c).f17826w;
            for (Y y8 = (Y) c0517t.f7174d; !kotlin.jvm.internal.l.a(y8, y7) && y8 != null; y8 = y8.f17826w) {
                if (y8.f17824N != null) {
                    y8.k1(false, null);
                    y8.f17825v.S(false);
                }
            }
            Q.d dVarV = k7.a.v();
            int i8 = dVarV.f7829m;
            if (i8 > 0) {
                Object[] objArr = dVarV.f7827k;
                do {
                    ((C2349D) objArr[i7]).f17661H.f17761r.u0();
                    i7++;
                } while (i7 < i8);
            }
        }
    }

    public final void v0() {
        Q.d dVarV;
        int i7;
        K k7 = this.f17733P;
        if (k7.f17757n <= 0 || (i7 = (dVarV = k7.a.v()).f7829m) <= 0) {
            return;
        }
        Object[] objArr = dVarV.f7827k;
        int i8 = 0;
        do {
            C2349D c2349d = (C2349D) objArr[i8];
            K k8 = c2349d.f17661H;
            if ((k8.f17755l || k8.f17756m) && !k8.f17748e) {
                c2349d.S(false);
            }
            k8.f17761r.v0();
            i8++;
        } while (i8 < i7);
    }

    public final void w0() {
        int i7;
        K k7 = this.f17733P;
        C2349D.T(k7.a, false, 7);
        C2349D c2349d = k7.a;
        C2349D c2349dS = c2349d.s();
        if (c2349dS == null || c2349d.f17669R != 3) {
            return;
        }
        int iB = AbstractC1755i.b(c2349dS.f17661H.f17746c);
        if (iB != 0) {
            i7 = 2;
            if (iB != 2) {
                i7 = c2349dS.f17669R;
            }
        } else {
            i7 = 1;
        }
        c2349d.f17669R = i7;
    }

    public final void x0() {
        this.J = true;
        K k7 = this.f17733P;
        C2349D c2349dS = k7.a.s();
        float f5 = j().f17820H;
        C0517t c0517t = k7.a.f17660G;
        Y y7 = (Y) c0517t.f7174d;
        while (y7 != ((C2372t) c0517t.f7173c)) {
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator", y7);
            C2377y c2377y = (C2377y) y7;
            f5 += c2377y.f17820H;
            y7 = c2377y.f17826w;
        }
        if (f5 != this.I) {
            this.I = f5;
            if (c2349dS != null) {
                c2349dS.K();
            }
            if (c2349dS != null) {
                c2349dS.y();
            }
        }
        if (!this.f17721B) {
            if (c2349dS != null) {
                c2349dS.y();
            }
            p0();
            if (this.f17734p && c2349dS != null) {
                c2349dS.S(false);
            }
        }
        if (c2349dS == null) {
            this.f17736r = 0;
        } else if (!this.f17734p) {
            K k8 = c2349dS.f17661H;
            if (k8.f17746c == 3) {
                if (this.f17736r != Integer.MAX_VALUE) {
                    AbstractC0905c.C("Place was called on a node which was placed already");
                    throw null;
                }
                int i7 = k8.f17754k;
                this.f17736r = i7;
                k8.f17754k = i7 + 1;
            }
        }
        p();
    }

    public final void y0(long j7, float f5, e4.k kVar) {
        K k7 = this.f17733P;
        C2349D c2349d = k7.a;
        if (c2349d.f17668Q) {
            AbstractC0905c.B("place is called on a deactivated node");
            throw null;
        }
        k7.f17746c = 3;
        this.f17741w = j7;
        this.f17743y = f5;
        this.f17742x = kVar;
        this.f17738t = true;
        this.J = false;
        e0 e0VarA = AbstractC2352G.a(c2349d);
        if (k7.f17748e || !this.f17721B) {
            this.f17723D.f17692g = false;
            k7.d(false);
            this.f17728K = kVar;
            this.f17729L = j7;
            this.f17730M = f5;
            g0 snapshotObserver = ((C2471u) e0VarA).getSnapshotObserver();
            snapshotObserver.a(k7.a, snapshotObserver.f17857f, this.f17731N);
        } else {
            Y yA = k7.a();
            yA.c1(T0.h.c(j7, yA.f16844o), f5, kVar);
            x0();
        }
        k7.f17746c = 5;
    }

    public final boolean z0(long j7) {
        K k7 = this.f17733P;
        C2349D c2349d = k7.a;
        if (c2349d.f17668Q) {
            AbstractC0905c.B("measure is called on a deactivated node");
            throw null;
        }
        e0 e0VarA = AbstractC2352G.a(c2349d);
        C2349D c2349d2 = k7.a;
        C2349D c2349dS = c2349d2.s();
        boolean z7 = true;
        c2349d2.f17659F = c2349d2.f17659F || (c2349dS != null && c2349dS.f17659F);
        if (!c2349d2.f17661H.f17747d && T0.a.b(this.f16843n, j7)) {
            ((C2471u) e0VarA).f18868R.f(c2349d2, false);
            c2349d2.V();
            return false;
        }
        this.f17723D.f17691f = false;
        Q.d dVarV = c2349d2.v();
        int i7 = dVarV.f7829m;
        if (i7 > 0) {
            Object[] objArr = dVarV.f7827k;
            int i8 = 0;
            do {
                ((C2349D) objArr[i8]).f17661H.f17761r.f17723D.f17688c = false;
                i8++;
            } while (i8 < i7);
        }
        this.f17737s = true;
        long j8 = k7.a().f16842m;
        m0(j7);
        if (k7.f17746c != 5) {
            AbstractC0905c.C("layout state is not idle before measure starts");
            throw null;
        }
        k7.f17746c = 1;
        k7.f17747d = false;
        k7.f17763t = j7;
        g0 snapshotObserver = ((C2471u) AbstractC2352G.a(c2349d2)).getSnapshotObserver();
        snapshotObserver.a(c2349d2, snapshotObserver.f17854c, k7.f17764u);
        if (k7.f17746c == 1) {
            k7.f17748e = true;
            k7.f17749f = true;
            k7.f17746c = 5;
        }
        if (T0.j.a(k7.a().f16842m, j8) && k7.a().f16840k == this.f16840k && k7.a().f16841l == this.f16841l) {
            z7 = false;
        }
        l0(AbstractC1420H.a(k7.a().f16840k, k7.a().f16841l));
        return z7;
    }
}
