package y0;

import f6.AbstractC0905c;
import p.AbstractC1755i;
import w0.AbstractC2182Q;
import z0.C2471u;

/* loaded from: classes.dex */
public final class Q {
    public final C2349D a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17785c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17786d;

    /* renamed from: i, reason: collision with root package name */
    public T0.a f17791i;

    /* renamed from: b, reason: collision with root package name */
    public final n5.P f17784b = new n5.P(10);

    /* renamed from: e, reason: collision with root package name */
    public final n5.P f17787e = new n5.P(13);

    /* renamed from: f, reason: collision with root package name */
    public final Q.d f17788f = new Q.d(new C2349D[16]);

    /* renamed from: g, reason: collision with root package name */
    public final long f17789g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final Q.d f17790h = new Q.d(new P[16]);

    public Q(C2349D c2349d) {
        this.a = c2349d;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(y0.C2349D r5, T0.a r6) {
        /*
            y0.D r0 = r5.f17673m
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            y0.K r2 = r5.f17661H
            if (r6 == 0) goto L1a
            if (r0 == 0) goto L18
            y0.I r0 = r2.f17762s
            kotlin.jvm.internal.l.c(r0)
            long r2 = r6.a
            boolean r6 = r0.y0(r2)
            goto L2f
        L18:
            r6 = r1
            goto L2f
        L1a:
            y0.I r6 = r2.f17762s
            if (r6 == 0) goto L21
            T0.a r2 = r6.f17716w
            goto L22
        L21:
            r2 = 0
        L22:
            if (r2 == 0) goto L18
            if (r0 == 0) goto L18
            kotlin.jvm.internal.l.c(r6)
            long r2 = r2.a
            boolean r6 = r6.y0(r2)
        L2f:
            y0.D r0 = r5.s()
            if (r6 == 0) goto L55
            if (r0 == 0) goto L55
            y0.D r2 = r0.f17673m
            r3 = 3
            if (r2 != 0) goto L40
            y0.C2349D.T(r0, r1, r3)
            return r6
        L40:
            int r2 = r5.q()
            r4 = 1
            if (r2 != r4) goto L4b
            y0.C2349D.R(r0, r1, r3)
            return r6
        L4b:
            int r5 = r5.q()
            r2 = 2
            if (r5 != r2) goto L55
            r0.Q(r1)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.Q.b(y0.D, T0.a):boolean");
    }

    public static boolean c(C2349D c2349d, T0.a aVar) {
        boolean zL = aVar != null ? c2349d.L(aVar) : C2349D.M(c2349d);
        C2349D c2349dS = c2349d.s();
        if (zL && c2349dS != null) {
            int i7 = c2349d.f17661H.f17761r.f17739u;
            if (i7 == 1) {
                C2349D.T(c2349dS, false, 3);
                return zL;
            }
            if (i7 == 2) {
                c2349dS.S(false);
            }
        }
        return zL;
    }

    public static boolean h(C2349D c2349d) {
        J j7 = c2349d.f17661H.f17761r;
        return j7.f17739u == 1 || j7.f17723D.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r7) {
        /*
            r6 = this;
            n5.P r0 = r6.f17787e
            r1 = 1
            if (r7 == 0) goto L13
            java.lang.Object r7 = r0.f13378l
            Q.d r7 = (Q.d) r7
            r7.g()
            y0.D r2 = r6.a
            r7.b(r2)
            r2.f17667P = r1
        L13:
            y0.c0 r7 = y0.c0.f17836l
            java.lang.Object r2 = r0.f13378l
            Q.d r2 = (Q.d) r2
            r2.p(r7)
            int r7 = r2.f7829m
            java.lang.Object r3 = r0.f13379m
            y0.D[] r3 = (y0.C2349D[]) r3
            if (r3 == 0) goto L27
            int r4 = r3.length
            if (r4 >= r7) goto L2f
        L27:
            r3 = 16
            int r3 = java.lang.Math.max(r3, r7)
            y0.D[] r3 = new y0.C2349D[r3]
        L2f:
            r4 = 0
            r0.f13379m = r4
            r4 = 0
        L33:
            if (r4 >= r7) goto L3e
            java.lang.Object[] r5 = r2.f7827k
            r5 = r5[r4]
            r3[r4] = r5
            int r4 = r4 + 1
            goto L33
        L3e:
            r2.g()
            int r7 = r7 - r1
        L42:
            r1 = -1
            if (r1 >= r7) goto L54
            r1 = r3[r7]
            kotlin.jvm.internal.l.c(r1)
            boolean r2 = r1.f17667P
            if (r2 == 0) goto L51
            n5.P.i(r1)
        L51:
            int r7 = r7 + (-1)
            goto L42
        L54:
            r0.f13379m = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.Q.a(boolean):void");
    }

    public final void d() {
        Q.d dVar = this.f17790h;
        if (dVar.l()) {
            int i7 = dVar.f7829m;
            if (i7 > 0) {
                Object[] objArr = dVar.f7827k;
                int i8 = 0;
                do {
                    P p7 = (P) objArr[i8];
                    if (p7.a.E()) {
                        boolean z7 = p7.f17782b;
                        boolean z8 = p7.f17783c;
                        C2349D c2349d = p7.a;
                        if (z7) {
                            C2349D.R(c2349d, z8, 2);
                        } else {
                            C2349D.T(c2349d, z8, 2);
                        }
                    }
                    i8++;
                } while (i8 < i7);
            }
            dVar.g();
        }
    }

    public final void e(C2349D c2349d) {
        Q.d dVarV = c2349d.v();
        int i7 = dVarV.f7829m;
        if (i7 > 0) {
            Object[] objArr = dVarV.f7827k;
            int i8 = 0;
            do {
                C2349D c2349d2 = (C2349D) objArr[i8];
                if (kotlin.jvm.internal.l.a(c2349d2.G(), Boolean.TRUE) && !c2349d2.f17668Q) {
                    if (this.f17784b.h(c2349d2, true)) {
                        c2349d2.H();
                    }
                    e(c2349d2);
                }
                i8++;
            } while (i8 < i7);
        }
    }

    public final void f(C2349D c2349d, boolean z7) {
        n5.P p7 = this.f17784b;
        if (((p0) ((n5.P) (z7 ? p7.f13378l : p7.f13379m)).f13379m).isEmpty()) {
            return;
        }
        if (!this.f17785c) {
            AbstractC0905c.C("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
            throw null;
        }
        if (z7 ? c2349d.f17661H.f17750g : c2349d.f17661H.f17747d) {
            AbstractC0905c.B("node not yet measured");
            throw null;
        }
        g(c2349d, z7);
    }

    public final void g(C2349D c2349d, boolean z7) {
        I i7;
        C2350E c2350e;
        Q.d dVarV = c2349d.v();
        int i8 = dVarV.f7829m;
        n5.P p7 = this.f17784b;
        if (i8 > 0) {
            Object[] objArr = dVarV.f7827k;
            int i9 = 0;
            do {
                C2349D c2349d2 = (C2349D) objArr[i9];
                if ((!z7 && h(c2349d2)) || (z7 && (c2349d2.q() == 1 || ((i7 = c2349d2.f17661H.f17762s) != null && (c2350e = i7.f17701A) != null && c2350e.e())))) {
                    boolean zR = AbstractC2359f.r(c2349d2);
                    K k7 = c2349d2.f17661H;
                    if (zR && !z7) {
                        if (k7.f17750g && p7.h(c2349d2, true)) {
                            l(c2349d2, true, false);
                        } else {
                            f(c2349d2, true);
                        }
                    }
                    if ((z7 ? k7.f17750g : k7.f17747d) && p7.h(c2349d2, z7)) {
                        l(c2349d2, z7, false);
                    }
                    if (!(z7 ? k7.f17750g : k7.f17747d)) {
                        g(c2349d2, z7);
                    }
                }
                i9++;
            } while (i9 < i8);
        }
        K k8 = c2349d.f17661H;
        if ((z7 ? k8.f17750g : k8.f17747d) && p7.h(c2349d, z7)) {
            l(c2349d, z7, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0117 A[EDGE_INSN: B:100:0x0117->B:83:0x0117 BREAK  A[LOOP:1: B:38:0x0084->B:82:0x0114], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0114 A[LOOP:1: B:38:0x0084->B:82:0x0114, LOOP_END] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(z0.C2467s r18) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.Q.i(z0.s):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0121 A[LOOP:0: B:38:0x009a->B:80:0x0121, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0124 A[EDGE_INSN: B:93:0x0124->B:81:0x0124 BREAK  A[LOOP:0: B:38:0x009a->B:80:0x0121], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, y0.D] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(y0.C2349D r17, long r18) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.Q.j(y0.D, long):void");
    }

    public final void k() {
        n5.P p7 = this.f17784b;
        if (p7.m()) {
            C2349D c2349d = this.a;
            if (!c2349d.E()) {
                AbstractC0905c.B("performMeasureAndLayout called with unattached root");
                throw null;
            }
            if (!c2349d.F()) {
                AbstractC0905c.B("performMeasureAndLayout called with unplaced root");
                throw null;
            }
            if (this.f17785c) {
                AbstractC0905c.B("performMeasureAndLayout called during measure layout");
                throw null;
            }
            if (this.f17791i != null) {
                this.f17785c = true;
                this.f17786d = false;
                try {
                    if (!((p0) ((n5.P) p7.f13378l).f13379m).isEmpty()) {
                        if (c2349d.f17673m != null) {
                            n(c2349d, true);
                        } else {
                            m(c2349d);
                        }
                    }
                    n(c2349d, false);
                    this.f17785c = false;
                    this.f17786d = false;
                } catch (Throwable th) {
                    this.f17785c = false;
                    this.f17786d = false;
                    throw th;
                }
            }
        }
    }

    public final boolean l(C2349D c2349d, boolean z7, boolean z8) {
        T0.a aVar;
        boolean zB;
        AbstractC2182Q placementScope;
        C2372t c2372t;
        C2349D c2349dS;
        I i7;
        C2350E c2350e;
        I i8;
        C2350E c2350e2;
        if (!c2349d.f17668Q) {
            boolean zF = c2349d.F();
            K k7 = c2349d.f17661H;
            if (zF || k7.f17761r.f17722C || ((k7.f17747d && h(c2349d)) || kotlin.jvm.internal.l.a(c2349d.G(), Boolean.TRUE) || ((k7.f17750g && (c2349d.q() == 1 || ((i8 = k7.f17762s) != null && (c2350e2 = i8.f17701A) != null && c2350e2.e()))) || k7.f17761r.f17723D.e() || ((i7 = k7.f17762s) != null && (c2350e = i7.f17701A) != null && c2350e.e())))) {
                C2349D c2349d2 = this.a;
                if (c2349d == c2349d2) {
                    aVar = this.f17791i;
                    kotlin.jvm.internal.l.c(aVar);
                } else {
                    aVar = null;
                }
                if (z7) {
                    zB = k7.f17750g ? b(c2349d, aVar) : false;
                    if (z8 && ((zB || k7.f17751h) && kotlin.jvm.internal.l.a(c2349d.G(), Boolean.TRUE))) {
                        c2349d.H();
                    }
                } else {
                    boolean zC = k7.f17747d ? c(c2349d, aVar) : false;
                    if (z8 && k7.f17748e && (c2349d == c2349d2 || ((c2349dS = c2349d.s()) != null && c2349dS.F() && k7.f17761r.f17722C))) {
                        if (c2349d == c2349d2) {
                            if (c2349d.f17669R == 3) {
                                c2349d.g();
                            }
                            C2349D c2349dS2 = c2349d.s();
                            if (c2349dS2 == null || (c2372t = (C2372t) c2349dS2.f17660G.f7173c) == null || (placementScope = c2372t.f17773s) == null) {
                                placementScope = ((C2471u) AbstractC2352G.a(c2349d)).getPlacementScope();
                            }
                            AbstractC2182Q.f(placementScope, k7.f17761r, 0, 0);
                        } else {
                            c2349d.P();
                        }
                        ((Q.d) this.f17787e.f13378l).b(c2349d);
                        c2349d.f17667P = true;
                    }
                    zB = zC;
                }
                d();
                return zB;
            }
        }
        return false;
    }

    public final void m(C2349D c2349d) {
        Q.d dVarV = c2349d.v();
        int i7 = dVarV.f7829m;
        if (i7 > 0) {
            Object[] objArr = dVarV.f7827k;
            int i8 = 0;
            do {
                C2349D c2349d2 = (C2349D) objArr[i8];
                if (h(c2349d2)) {
                    if (AbstractC2359f.r(c2349d2)) {
                        n(c2349d2, true);
                    } else {
                        m(c2349d2);
                    }
                }
                i8++;
            } while (i8 < i7);
        }
    }

    public final void n(C2349D c2349d, boolean z7) {
        T0.a aVar;
        if (c2349d.f17668Q) {
            return;
        }
        if (c2349d == this.a) {
            aVar = this.f17791i;
            kotlin.jvm.internal.l.c(aVar);
        } else {
            aVar = null;
        }
        if (z7) {
            b(c2349d, aVar);
        } else {
            c(c2349d, aVar);
        }
    }

    public final boolean o(C2349D c2349d, boolean z7) {
        int iB = AbstractC1755i.b(c2349d.f17661H.f17746c);
        if (iB != 0 && iB != 1) {
            if (iB == 2 || iB == 3) {
                this.f17790h.b(new P(c2349d, false, z7));
            } else {
                if (iB != 4) {
                    throw new D6.r();
                }
                K k7 = c2349d.f17661H;
                if (!k7.f17747d || z7) {
                    k7.f17747d = true;
                    if (c2349d.f17668Q || (!c2349d.F() && (!k7.f17747d || !h(c2349d)))) {
                        return false;
                    }
                    C2349D c2349dS = c2349d.s();
                    if (c2349dS == null || !c2349dS.f17661H.f17747d) {
                        this.f17784b.g(c2349d, false);
                    }
                    if (!this.f17786d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p(long j7) {
        T0.a aVar = this.f17791i;
        if (aVar == null ? false : T0.a.b(aVar.a, j7)) {
            return;
        }
        if (this.f17785c) {
            AbstractC0905c.B("updateRootConstraints called while measuring");
            throw null;
        }
        this.f17791i = new T0.a(j7);
        C2349D c2349d = this.a;
        C2349D c2349d2 = c2349d.f17673m;
        K k7 = c2349d.f17661H;
        if (c2349d2 != null) {
            k7.f17750g = true;
        }
        k7.f17747d = true;
        this.f17784b.g(c2349d, c2349d2 != null);
    }
}
