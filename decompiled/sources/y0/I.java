package y0;

import f6.AbstractC0905c;
import l4.AbstractC1420H;
import o.C1622t;
import p.AbstractC1755i;
import w0.C2196n;
import w0.InterfaceC2172G;
import z0.C2471u;

/* loaded from: classes.dex */
public final class I extends w0.S implements InterfaceC2172G, InterfaceC2354a, T {

    /* renamed from: D, reason: collision with root package name */
    public boolean f17704D;

    /* renamed from: F, reason: collision with root package name */
    public Object f17706F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f17707G;

    /* renamed from: H, reason: collision with root package name */
    public final /* synthetic */ K f17708H;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17709p;

    /* renamed from: t, reason: collision with root package name */
    public boolean f17713t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f17714u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f17715v;

    /* renamed from: w, reason: collision with root package name */
    public T0.a f17716w;

    /* renamed from: y, reason: collision with root package name */
    public e4.k f17718y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f17719z;

    /* renamed from: q, reason: collision with root package name */
    public int f17710q = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public int f17711r = Integer.MAX_VALUE;

    /* renamed from: s, reason: collision with root package name */
    public int f17712s = 3;

    /* renamed from: x, reason: collision with root package name */
    public long f17717x = 0;

    /* renamed from: A, reason: collision with root package name */
    public final C2350E f17701A = new C2350E(this, 1);

    /* renamed from: B, reason: collision with root package name */
    public final Q.d f17702B = new Q.d(new I[16]);

    /* renamed from: C, reason: collision with root package name */
    public boolean f17703C = true;

    /* renamed from: E, reason: collision with root package name */
    public boolean f17705E = true;

    public I(K k7) {
        this.f17708H = k7;
        this.f17706F = k7.f17761r.f17720A;
    }

    @Override // y0.InterfaceC2354a
    public final void E(C1622t c1622t) {
        Q.d dVarV = this.f17708H.a.v();
        int i7 = dVarV.f7829m;
        if (i7 > 0) {
            Object[] objArr = dVarV.f7827k;
            int i8 = 0;
            do {
                I i9 = ((C2349D) objArr[i8]).f17661H.f17762s;
                kotlin.jvm.internal.l.c(i9);
                c1622t.invoke(i9);
                i8++;
            } while (i8 < i7);
        }
    }

    @Override // y0.T
    public final void M(boolean z7) {
        O oN0;
        K k7 = this.f17708H;
        O oN02 = k7.a().N0();
        if (Boolean.valueOf(z7).equals(oN02 != null ? Boolean.valueOf(oN02.f17770p) : null) || (oN0 = k7.a().N0()) == null) {
            return;
        }
        oN0.f17770p = z7;
    }

    @Override // w0.InterfaceC2172G
    public final int W(int i7) {
        v0();
        O oN0 = this.f17708H.a().N0();
        kotlin.jvm.internal.l.c(oN0);
        return oN0.W(i7);
    }

    @Override // y0.InterfaceC2354a
    public final void X() {
        C2349D.R(this.f17708H.a, false, 7);
    }

    @Override // w0.InterfaceC2172G
    public final int Y(int i7) {
        v0();
        O oN0 = this.f17708H.a().N0();
        kotlin.jvm.internal.l.c(oN0);
        return oN0.Y(i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    @Override // w0.InterfaceC2172G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final w0.S b(long r7) {
        /*
            r6 = this;
            y0.K r0 = r6.f17708H
            y0.D r1 = r0.a
            y0.D r1 = r1.s()
            r2 = 0
            if (r1 == 0) goto L10
            y0.K r1 = r1.f17661H
            int r1 = r1.f17746c
            goto L11
        L10:
            r1 = r2
        L11:
            r3 = 2
            y0.D r4 = r0.a
            if (r1 == r3) goto L25
            y0.D r1 = r4.s()
            if (r1 == 0) goto L21
            y0.K r1 = r1.f17661H
            int r1 = r1.f17746c
            goto L22
        L21:
            r1 = r2
        L22:
            r5 = 4
            if (r1 != r5) goto L27
        L25:
            r0.f17745b = r2
        L27:
            y0.D r0 = r4.s()
            r1 = 3
            if (r0 == 0) goto L66
            int r2 = r6.f17712s
            if (r2 == r1) goto L3e
            boolean r2 = r4.f17659F
            if (r2 == 0) goto L37
            goto L3e
        L37:
            java.lang.String r7 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            f6.AbstractC0905c.C(r7)
            r7 = 0
            throw r7
        L3e:
            y0.K r0 = r0.f17661H
            int r2 = r0.f17746c
            int r2 = p.AbstractC1755i.b(r2)
            r5 = 1
            if (r2 == 0) goto L62
            if (r2 == r5) goto L62
            if (r2 == r3) goto L63
            if (r2 != r1) goto L50
            goto L63
        L50:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            int r8 = r0.f17746c
            java.lang.String r8 = v.c0.f(r8)
            java.lang.String r0 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            java.lang.String r8 = r0.concat(r8)
            r7.<init>(r8)
            throw r7
        L62:
            r3 = r5
        L63:
            r6.f17712s = r3
            goto L68
        L66:
            r6.f17712s = r1
        L68:
            int r0 = r4.f17669R
            if (r0 != r1) goto L6f
            r4.f()
        L6f:
            r6.y0(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.I.b(long):w0.S");
    }

    @Override // w0.InterfaceC2172G
    public final int b0(int i7) {
        v0();
        O oN0 = this.f17708H.a().N0();
        kotlin.jvm.internal.l.c(oN0);
        return oN0.b0(i7);
    }

    @Override // w0.InterfaceC2172G
    public final int c(int i7) {
        v0();
        O oN0 = this.f17708H.a().N0();
        kotlin.jvm.internal.l.c(oN0);
        return oN0.c(i7);
    }

    @Override // w0.S
    public final int c0(C2196n c2196n) {
        K k7 = this.f17708H;
        C2349D c2349dS = k7.a.s();
        int i7 = c2349dS != null ? c2349dS.f17661H.f17746c : 0;
        C2350E c2350e = this.f17701A;
        if (i7 == 2) {
            c2350e.f17688c = true;
        } else {
            C2349D c2349dS2 = k7.a.s();
            if ((c2349dS2 != null ? c2349dS2.f17661H.f17746c : 0) == 4) {
                c2350e.f17689d = true;
            }
        }
        this.f17713t = true;
        O oN0 = k7.a().N0();
        kotlin.jvm.internal.l.c(oN0);
        int iC0 = oN0.c0(c2196n);
        this.f17713t = false;
        return iC0;
    }

    @Override // w0.S
    public final int f0() {
        O oN0 = this.f17708H.a().N0();
        kotlin.jvm.internal.l.c(oN0);
        return oN0.f0();
    }

    @Override // w0.S, w0.InterfaceC2172G
    public final Object h() {
        return this.f17706F;
    }

    @Override // w0.S
    public final int h0() {
        O oN0 = this.f17708H.a().N0();
        kotlin.jvm.internal.l.c(oN0);
        return oN0.h0();
    }

    @Override // y0.InterfaceC2354a
    public final C2372t j() {
        return (C2372t) this.f17708H.a.f17660G.f7173c;
    }

    @Override // w0.S
    public final void j0(long j7, float f5, e4.k kVar) {
        x0(j7, kVar);
    }

    @Override // y0.InterfaceC2354a
    public final InterfaceC2354a l() {
        K k7;
        C2349D c2349dS = this.f17708H.a.s();
        if (c2349dS == null || (k7 = c2349dS.f17661H) == null) {
            return null;
        }
        return k7.f17762s;
    }

    @Override // y0.InterfaceC2354a
    public final C2350E m() {
        return this.f17701A;
    }

    public final void n0() {
        boolean z7 = this.f17719z;
        this.f17719z = true;
        K k7 = this.f17708H;
        if (!z7 && k7.f17750g) {
            C2349D.R(k7.a, true, 6);
        }
        Q.d dVarV = k7.a.v();
        int i7 = dVarV.f7829m;
        if (i7 > 0) {
            Object[] objArr = dVarV.f7827k;
            int i8 = 0;
            do {
                C2349D c2349d = (C2349D) objArr[i8];
                I i9 = c2349d.f17661H.f17762s;
                if (i9 == null) {
                    throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                }
                if (i9.f17711r != Integer.MAX_VALUE) {
                    i9.n0();
                    C2349D.U(c2349d);
                }
                i8++;
            } while (i8 < i7);
        }
    }

    @Override // y0.InterfaceC2354a
    public final void p() {
        Q.d dVarV;
        int i7;
        this.f17704D = true;
        C2350E c2350e = this.f17701A;
        c2350e.h();
        K k7 = this.f17708H;
        boolean z7 = k7.f17751h;
        C2349D c2349d = k7.a;
        if (z7 && (i7 = (dVarV = c2349d.v()).f7829m) > 0) {
            Object[] objArr = dVarV.f7827k;
            int i8 = 0;
            do {
                C2349D c2349d2 = (C2349D) objArr[i8];
                if (c2349d2.f17661H.f17750g && c2349d2.q() == 1) {
                    K k8 = c2349d2.f17661H;
                    I i9 = k8.f17762s;
                    kotlin.jvm.internal.l.c(i9);
                    I i10 = k8.f17762s;
                    T0.a aVar = i10 != null ? i10.f17716w : null;
                    kotlin.jvm.internal.l.c(aVar);
                    if (i9.y0(aVar.a)) {
                        C2349D.R(c2349d, false, 7);
                    }
                }
                i8++;
            } while (i8 < i7);
        }
        C2371s c2371s = j().f17895U;
        kotlin.jvm.internal.l.c(c2371s);
        if (k7.f17752i || (!this.f17713t && !c2371s.f17772r && k7.f17751h)) {
            k7.f17751h = false;
            int i11 = k7.f17746c;
            k7.f17746c = 4;
            e0 e0VarA = AbstractC2352G.a(c2349d);
            k7.g(false);
            g0 snapshotObserver = ((C2471u) e0VarA).getSnapshotObserver();
            A.j jVar = new A.j(this, c2371s, k7, 7);
            snapshotObserver.getClass();
            if (c2349d.f17673m != null) {
                snapshotObserver.a(c2349d, snapshotObserver.f17859h, jVar);
            } else {
                snapshotObserver.a(c2349d, snapshotObserver.f17856e, jVar);
            }
            k7.f17746c = i11;
            if (k7.f17758o && c2371s.f17772r) {
                requestLayout();
            }
            k7.f17752i = false;
        }
        if (c2350e.f17689d) {
            c2350e.f17690e = true;
        }
        if (c2350e.f17687b && c2350e.e()) {
            c2350e.g();
        }
        this.f17704D = false;
    }

    public final void p0() {
        if (this.f17719z) {
            int i7 = 0;
            this.f17719z = false;
            Q.d dVarV = this.f17708H.a.v();
            int i8 = dVarV.f7829m;
            if (i8 > 0) {
                Object[] objArr = dVarV.f7827k;
                do {
                    I i9 = ((C2349D) objArr[i7]).f17661H.f17762s;
                    kotlin.jvm.internal.l.c(i9);
                    i9.p0();
                    i7++;
                } while (i7 < i8);
            }
        }
    }

    @Override // y0.InterfaceC2354a
    public final boolean r() {
        return this.f17719z;
    }

    @Override // y0.InterfaceC2354a
    public final void requestLayout() {
        this.f17708H.a.Q(false);
    }

    public final void u0() {
        Q.d dVarV;
        int i7;
        K k7 = this.f17708H;
        if (k7.f17760q <= 0 || (i7 = (dVarV = k7.a.v()).f7829m) <= 0) {
            return;
        }
        Object[] objArr = dVarV.f7827k;
        int i8 = 0;
        do {
            C2349D c2349d = (C2349D) objArr[i8];
            K k8 = c2349d.f17661H;
            if ((k8.f17758o || k8.f17759p) && !k8.f17751h) {
                c2349d.Q(false);
            }
            I i9 = k8.f17762s;
            if (i9 != null) {
                i9.u0();
            }
            i8++;
        } while (i8 < i7);
    }

    public final void v0() {
        int i7;
        K k7 = this.f17708H;
        C2349D.R(k7.a, false, 7);
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

    public final void w0() {
        K k7;
        int i7;
        this.f17707G = true;
        C2349D c2349dS = this.f17708H.a.s();
        if (!this.f17719z) {
            n0();
            if (this.f17709p && c2349dS != null) {
                c2349dS.Q(false);
            }
        }
        if (c2349dS == null) {
            this.f17711r = 0;
        } else if (!this.f17709p && ((i7 = (k7 = c2349dS.f17661H).f17746c) == 3 || i7 == 4)) {
            if (this.f17711r != Integer.MAX_VALUE) {
                AbstractC0905c.C("Place was called on a node which was placed already");
                throw null;
            }
            int i8 = k7.f17753j;
            this.f17711r = i8;
            k7.f17753j = i8 + 1;
        }
        p();
    }

    public final void x0(long j7, e4.k kVar) {
        K k7 = this.f17708H;
        if (k7.a.f17668Q) {
            AbstractC0905c.B("place is called on a deactivated node");
            throw null;
        }
        k7.f17746c = 4;
        this.f17714u = true;
        this.f17707G = false;
        if (!T0.h.a(j7, this.f17717x)) {
            if (k7.f17759p || k7.f17758o) {
                k7.f17751h = true;
            }
            u0();
        }
        C2349D c2349d = k7.a;
        e0 e0VarA = AbstractC2352G.a(c2349d);
        if (k7.f17751h || !this.f17719z) {
            k7.f(false);
            this.f17701A.f17692g = false;
            g0 snapshotObserver = ((C2471u) e0VarA).getSnapshotObserver();
            C2353H c2353h = new C2353H(k7, e0VarA, j7);
            snapshotObserver.getClass();
            if (c2349d.f17673m != null) {
                snapshotObserver.a(c2349d, snapshotObserver.f17858g, c2353h);
            } else {
                snapshotObserver.a(c2349d, snapshotObserver.f17857f, c2353h);
            }
        } else {
            O oN0 = k7.a().N0();
            kotlin.jvm.internal.l.c(oN0);
            oN0.F0(T0.h.c(j7, oN0.f16844o));
            w0();
        }
        this.f17717x = j7;
        this.f17718y = kVar;
        k7.f17746c = 5;
    }

    public final boolean y0(long j7) {
        K k7 = this.f17708H;
        C2349D c2349d = k7.a;
        if (c2349d.f17668Q) {
            AbstractC0905c.B("measure is called on a deactivated node");
            throw null;
        }
        C2349D c2349dS = c2349d.s();
        C2349D c2349d2 = k7.a;
        c2349d2.f17659F = c2349d2.f17659F || (c2349dS != null && c2349dS.f17659F);
        if (!c2349d2.f17661H.f17750g) {
            T0.a aVar = this.f17716w;
            if (aVar == null ? false : T0.a.b(aVar.a, j7)) {
                C2471u c2471u = c2349d2.f17679s;
                if (c2471u != null) {
                    c2471u.f18868R.f(c2349d2, true);
                }
                c2349d2.V();
                return false;
            }
        }
        this.f17716w = new T0.a(j7);
        m0(j7);
        this.f17701A.f17691f = false;
        Q.d dVarV = c2349d2.v();
        int i7 = dVarV.f7829m;
        if (i7 > 0) {
            Object[] objArr = dVarV.f7827k;
            int i8 = 0;
            do {
                I i9 = ((C2349D) objArr[i8]).f17661H.f17762s;
                kotlin.jvm.internal.l.c(i9);
                i9.f17701A.f17688c = false;
                i8++;
            } while (i8 < i7);
        }
        long jA = this.f17715v ? this.f16842m : AbstractC1420H.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f17715v = true;
        O oN0 = k7.a().N0();
        if (!(oN0 != null)) {
            AbstractC0905c.C("Lookahead result from lookaheadRemeasure cannot be null");
            throw null;
        }
        k7.f17746c = 2;
        k7.f17750g = false;
        g0 snapshotObserver = ((C2471u) AbstractC2352G.a(c2349d2)).getSnapshotObserver();
        P0.d dVar = new P0.d(1, j7, k7);
        snapshotObserver.getClass();
        if (c2349d2.f17673m != null) {
            snapshotObserver.a(c2349d2, snapshotObserver.f17853b, dVar);
        } else {
            snapshotObserver.a(c2349d2, snapshotObserver.f17854c, dVar);
        }
        k7.f17751h = true;
        k7.f17752i = true;
        if (AbstractC2359f.r(c2349d2)) {
            k7.f17748e = true;
            k7.f17749f = true;
        } else {
            k7.f17747d = true;
        }
        k7.f17746c = 5;
        l0(AbstractC1420H.a(oN0.f16840k, oN0.f16841l));
        return (((int) (jA >> 32)) == oN0.f16840k && ((int) (4294967295L & jA)) == oN0.f16841l) ? false : true;
    }
}
