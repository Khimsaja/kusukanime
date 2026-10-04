package y0;

import O.C0517t;
import android.os.Build;
import android.view.View;
import e5.AbstractC0832b;
import f1.AbstractC0870c;
import f6.AbstractC0905c;
import h0.AbstractC0959D;
import h0.AbstractC0968M;
import h0.C0962G;
import h0.C0970O;
import h0.C0976V;
import h0.InterfaceC0995r;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedHashMap;
import k0.C1375b;
import l4.AbstractC1420H;
import r0.C1861b;
import w0.C2171F;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import z0.C2466r0;
import z0.C2471u;
import z0.C2472u0;
import z0.H0;
import z0.U0;
import z0.V0;

/* loaded from: classes.dex */
public abstract class Y extends N implements InterfaceC2172G, w0.r, f0 {

    /* renamed from: O, reason: collision with root package name */
    public static final C0970O f17808O;

    /* renamed from: P, reason: collision with root package name */
    public static final C2373u f17809P;

    /* renamed from: Q, reason: collision with root package name */
    public static final float[] f17810Q;

    /* renamed from: R, reason: collision with root package name */
    public static final C2357d f17811R;

    /* renamed from: S, reason: collision with root package name */
    public static final C2357d f17812S;

    /* renamed from: A, reason: collision with root package name */
    public e4.k f17813A;

    /* renamed from: B, reason: collision with root package name */
    public T0.b f17814B;

    /* renamed from: C, reason: collision with root package name */
    public T0.k f17815C;

    /* renamed from: E, reason: collision with root package name */
    public InterfaceC2174I f17817E;

    /* renamed from: F, reason: collision with root package name */
    public LinkedHashMap f17818F;

    /* renamed from: H, reason: collision with root package name */
    public float f17820H;
    public g0.b I;
    public C2373u J;

    /* renamed from: M, reason: collision with root package name */
    public boolean f17823M;

    /* renamed from: N, reason: collision with root package name */
    public d0 f17824N;

    /* renamed from: v, reason: collision with root package name */
    public final C2349D f17825v;

    /* renamed from: w, reason: collision with root package name */
    public Y f17826w;

    /* renamed from: x, reason: collision with root package name */
    public Y f17827x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f17828y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f17829z;

    /* renamed from: D, reason: collision with root package name */
    public float f17816D = 0.8f;

    /* renamed from: G, reason: collision with root package name */
    public long f17819G = 0;

    /* renamed from: K, reason: collision with root package name */
    public final D.S f17821K = new D.S(24, this);

    /* renamed from: L, reason: collision with root package name */
    public final C1861b f17822L = new C1861b(9, this);

    static {
        C0970O c0970o = new C0970O();
        c0970o.f11786l = 1.0f;
        c0970o.f11787m = 1.0f;
        c0970o.f11788n = 1.0f;
        long j7 = AbstractC0959D.a;
        c0970o.f11790p = j7;
        c0970o.f11791q = j7;
        c0970o.f11792r = 8.0f;
        c0970o.f11793s = C0976V.f11815b;
        c0970o.f11794t = AbstractC0968M.a;
        c0970o.f11796v = 9205357640488583168L;
        c0970o.f11797w = z1.c.a();
        c0970o.f11798x = T0.k.f8844k;
        f17808O = c0970o;
        f17809P = new C2373u();
        f17810Q = C0962G.a();
        f17811R = new C2357d(1);
        f17812S = new C2357d(2);
    }

    public Y(C2349D c2349d) {
        this.f17825v = c2349d;
        this.f17814B = c2349d.f17655B;
        this.f17815C = c2349d.f17656C;
    }

    public static Y g1(w0.r rVar) {
        Y y7;
        C2171F c2171f = rVar instanceof C2171F ? (C2171F) rVar : null;
        if (c2171f != null && (y7 = c2171f.f16834k.f17777v) != null) {
            return y7;
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator", rVar);
        return (Y) rVar;
    }

    @Override // y0.N
    public final long A0() {
        return this.f17819G;
    }

    @Override // w0.r
    public final boolean B() {
        return P0().f10414w;
    }

    @Override // w0.r
    public final void C(float[] fArr) {
        e0 e0VarA = AbstractC2352G.a(this.f17825v);
        j1(g1(w0.X.f(this)), fArr);
        C2471u c2471u = (C2471u) e0VarA;
        c2471u.y();
        C0962G.g(fArr, c2471u.f18873W);
        float fD = g0.c.d(c2471u.f18877d0);
        float fE = g0.c.e(c2471u.f18877d0);
        float[] fArr2 = c2471u.f18872V;
        C0962G.d(fArr2);
        C0962G.h(fArr2, fD, fE);
        z0.O.z(fArr, fArr2);
    }

    @Override // y0.N
    public final void C0() {
        j0(this.f17819G, this.f17820H, this.f17813A);
    }

    public final void D0(Y y7, g0.b bVar, boolean z7) {
        if (y7 == this) {
            return;
        }
        Y y8 = this.f17827x;
        if (y8 != null) {
            y8.D0(y7, bVar, z7);
        }
        long j7 = this.f17819G;
        float f5 = (int) (j7 >> 32);
        bVar.a -= f5;
        bVar.f11656c -= f5;
        float f7 = (int) (j7 & 4294967295L);
        bVar.f11655b -= f7;
        bVar.f11657d -= f7;
        d0 d0Var = this.f17824N;
        if (d0Var != null) {
            d0Var.g(bVar, true);
            if (this.f17829z && z7) {
                long j8 = this.f16842m;
                bVar.a(0.0f, 0.0f, (int) (j8 >> 32), (int) (j8 & 4294967295L));
            }
        }
    }

    public final long E0(Y y7, long j7) {
        if (y7 == this) {
            return j7;
        }
        Y y8 = this.f17827x;
        return (y8 == null || kotlin.jvm.internal.l.a(y7, y8)) ? M0(j7) : M0(y8.E0(y7, j7));
    }

    public final long F0(long j7) {
        return AbstractC0870c.F(Math.max(0.0f, (g0.f.d(j7) - h0()) / 2.0f), Math.max(0.0f, (g0.f.b(j7) - f0()) / 2.0f));
    }

    public final float G0(long j7, long j8) {
        if (h0() >= g0.f.d(j8) && f0() >= g0.f.b(j8)) {
            return Float.POSITIVE_INFINITY;
        }
        long jF0 = F0(j8);
        float fD = g0.f.d(jF0);
        float fB = g0.f.b(jF0);
        float fD2 = g0.c.d(j7);
        float fMax = Math.max(0.0f, fD2 < 0.0f ? -fD2 : fD2 - h0());
        float fE = g0.c.e(j7);
        long jE = AbstractC0832b.e(fMax, Math.max(0.0f, fE < 0.0f ? -fE : fE - f0()));
        if ((fD <= 0.0f && fB <= 0.0f) || g0.c.d(jE) > fD || g0.c.e(jE) > fB) {
            return Float.POSITIVE_INFINITY;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE & 4294967295L));
        return (fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat);
    }

    public final void H0(InterfaceC0995r interfaceC0995r, C1375b c1375b) {
        d0 d0Var = this.f17824N;
        if (d0Var != null) {
            d0Var.e(interfaceC0995r, c1375b);
            return;
        }
        long j7 = this.f17819G;
        float f5 = (int) (j7 >> 32);
        float f7 = (int) (j7 & 4294967295L);
        interfaceC0995r.f(f5, f7);
        J0(interfaceC0995r, c1375b);
        interfaceC0995r.f(-f5, -f7);
    }

    public final void I0(InterfaceC0995r interfaceC0995r, H1.e0 e0Var) {
        long j7 = this.f16842m;
        interfaceC0995r.getClass();
        interfaceC0995r.d(0.5f, 0.5f, ((int) (j7 >> 32)) - 0.5f, ((int) (j7 & 4294967295L)) - 0.5f, e0Var);
    }

    public final void J0(InterfaceC0995r interfaceC0995r, C1375b c1375b) {
        InterfaceC0995r interfaceC0995r2;
        C1375b c1375b2;
        a0.p pVarQ0 = Q0(4);
        if (pVarQ0 == null) {
            b1(interfaceC0995r, c1375b);
            return;
        }
        C2349D c2349d = this.f17825v;
        c2349d.getClass();
        C2351F sharedDrawScope = ((C2471u) AbstractC2352G.a(c2349d)).getSharedDrawScope();
        long jO = AbstractC1420H.O(this.f16842m);
        sharedDrawScope.getClass();
        Q.d dVar = null;
        while (pVarQ0 != null) {
            if (pVarQ0 instanceof InterfaceC2368o) {
                interfaceC0995r2 = interfaceC0995r;
                c1375b2 = c1375b;
                sharedDrawScope.c(interfaceC0995r2, jO, this, (InterfaceC2368o) pVarQ0, c1375b2);
            } else {
                interfaceC0995r2 = interfaceC0995r;
                c1375b2 = c1375b;
                if ((pVarQ0.f10404m & 4) != 0 && (pVarQ0 instanceof AbstractC2367n)) {
                    int i7 = 0;
                    for (a0.p pVar = ((AbstractC2367n) pVarQ0).f17880y; pVar != null; pVar = pVar.f10407p) {
                        if ((pVar.f10404m & 4) != 0) {
                            i7++;
                            if (i7 == 1) {
                                pVarQ0 = pVar;
                            } else {
                                if (dVar == null) {
                                    dVar = new Q.d(new a0.p[16]);
                                }
                                if (pVarQ0 != null) {
                                    dVar.b(pVarQ0);
                                    pVarQ0 = null;
                                }
                                dVar.b(pVar);
                            }
                        }
                    }
                    if (i7 == 1) {
                    }
                }
                interfaceC0995r = interfaceC0995r2;
                c1375b = c1375b2;
            }
            pVarQ0 = AbstractC2359f.f(dVar);
            interfaceC0995r = interfaceC0995r2;
            c1375b = c1375b2;
        }
    }

    @Override // w0.r
    public final g0.d K(w0.r rVar, boolean z7) {
        if (!P0().f10414w) {
            AbstractC0905c.C("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        if (!rVar.B()) {
            AbstractC0905c.C("LayoutCoordinates " + rVar + " is not attached!");
            throw null;
        }
        Y yG1 = g1(rVar);
        yG1.Y0();
        Y yL0 = L0(yG1);
        g0.b bVar = this.I;
        if (bVar == null) {
            bVar = new g0.b();
            bVar.a = 0.0f;
            bVar.f11655b = 0.0f;
            bVar.f11656c = 0.0f;
            bVar.f11657d = 0.0f;
            this.I = bVar;
        }
        bVar.a = 0.0f;
        bVar.f11655b = 0.0f;
        bVar.f11656c = (int) (rVar.Q() >> 32);
        bVar.f11657d = (int) (rVar.Q() & 4294967295L);
        while (yG1 != yL0) {
            yG1.d1(bVar, z7, false);
            if (bVar.b()) {
                return g0.d.f11658e;
            }
            yG1 = yG1.f17827x;
            kotlin.jvm.internal.l.c(yG1);
        }
        D0(yL0, bVar, z7);
        return new g0.d(bVar.a, bVar.f11655b, bVar.f11656c, bVar.f11657d);
    }

    public abstract void K0();

    public final Y L0(Y y7) {
        C2349D c2349dS = y7.f17825v;
        C2349D c2349d = this.f17825v;
        if (c2349dS == c2349d) {
            a0.p pVarP0 = y7.P0();
            a0.p pVar = P0().f10402k;
            if (!pVar.f10414w) {
                AbstractC0905c.C("visitLocalAncestors called on an unattached node");
                throw null;
            }
            for (a0.p pVar2 = pVar.f10406o; pVar2 != null; pVar2 = pVar2.f10406o) {
                if ((pVar2.f10404m & 2) != 0 && pVar2 == pVarP0) {
                    return y7;
                }
            }
            return this;
        }
        while (c2349dS.f17681u > c2349d.f17681u) {
            c2349dS = c2349dS.s();
            kotlin.jvm.internal.l.c(c2349dS);
        }
        C2349D c2349dS2 = c2349d;
        while (c2349dS2.f17681u > c2349dS.f17681u) {
            c2349dS2 = c2349dS2.s();
            kotlin.jvm.internal.l.c(c2349dS2);
        }
        while (c2349dS != c2349dS2) {
            c2349dS = c2349dS.s();
            c2349dS2 = c2349dS2.s();
            if (c2349dS == null || c2349dS2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (c2349dS2 != c2349d) {
            if (c2349dS != y7.f17825v) {
                return (C2372t) c2349dS.f17660G.f7173c;
            }
            return y7;
        }
        return this;
    }

    public final long M0(long j7) {
        long j8 = this.f17819G;
        long jE = AbstractC0832b.e(g0.c.d(j7) - ((int) (j8 >> 32)), g0.c.e(j7) - ((int) (j8 & 4294967295L)));
        d0 d0Var = this.f17824N;
        return d0Var != null ? d0Var.b(jE, true) : jE;
    }

    public abstract O N0();

    public final long O0() {
        return this.f17814B.a0(this.f17825v.f17657D.g());
    }

    public abstract a0.p P0();

    @Override // w0.r
    public final long Q() {
        return this.f16842m;
    }

    public final a0.p Q0(int i7) {
        boolean zH = Z.h(i7);
        a0.p pVarP0 = P0();
        if (!zH && (pVarP0 = pVarP0.f10406o) == null) {
            return null;
        }
        for (a0.p pVarR0 = R0(zH); pVarR0 != null && (pVarR0.f10405n & i7) != 0; pVarR0 = pVarR0.f10407p) {
            if ((pVarR0.f10404m & i7) != 0) {
                return pVarR0;
            }
            if (pVarR0 == pVarP0) {
                return null;
            }
        }
        return null;
    }

    public final a0.p R0(boolean z7) {
        a0.p pVarP0;
        C0517t c0517t = this.f17825v.f17660G;
        if (((Y) c0517t.f7174d) == this) {
            return (a0.p) c0517t.f7176f;
        }
        if (!z7) {
            Y y7 = this.f17827x;
            if (y7 != null) {
                return y7.P0();
            }
            return null;
        }
        Y y8 = this.f17827x;
        if (y8 == null || (pVarP0 = y8.P0()) == null) {
            return null;
        }
        return pVarP0.f10407p;
    }

    @Override // w0.r
    public final long S(long j7) {
        if (!P0().f10414w) {
            AbstractC0905c.C("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        Y0();
        for (Y y7 = this; y7 != null; y7 = y7.f17827x) {
            j7 = y7.h1(j7);
        }
        return j7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final void S0(a0.p pVar, C2357d c2357d, long j7, r rVar, boolean z7, boolean z8) {
        if (pVar == null) {
            U0(c2357d, j7, rVar, z7, z8);
            return;
        }
        rVar.h(pVar, -1.0f, z8, new W(this, pVar, c2357d, j7, rVar, z7, z8));
        Y y7 = pVar.f10409r;
        if (y7 != null) {
            a0.p pVarR0 = y7.R0(Z.h(16));
            if (pVarR0 != null && pVarR0.f10414w) {
                a0.p pVar2 = pVarR0.f10402k;
                if (!pVar2.f10414w) {
                    AbstractC0905c.C("visitLocalDescendants called on an unattached node");
                    throw null;
                }
                if ((pVar2.f10405n & 16) != 0) {
                    while (pVar2 != null) {
                        if ((pVar2.f10404m & 16) != 0) {
                            AbstractC2367n abstractC2367nF = pVar2;
                            ?? dVar = 0;
                            while (abstractC2367nF != 0) {
                                if (abstractC2367nF instanceof j0) {
                                    if (((j0) abstractC2367nF).X()) {
                                        return;
                                    }
                                } else if ((abstractC2367nF.f10404m & 16) != 0 && (abstractC2367nF instanceof AbstractC2367n)) {
                                    a0.p pVar3 = abstractC2367nF.f17880y;
                                    int i7 = 0;
                                    dVar = dVar;
                                    abstractC2367nF = abstractC2367nF;
                                    while (pVar3 != null) {
                                        if ((pVar3.f10404m & 16) != 0) {
                                            i7++;
                                            dVar = dVar;
                                            if (i7 == 1) {
                                                abstractC2367nF = pVar3;
                                            } else {
                                                if (dVar == 0) {
                                                    dVar = new Q.d(new a0.p[16]);
                                                }
                                                if (abstractC2367nF != 0) {
                                                    dVar.b(abstractC2367nF);
                                                    abstractC2367nF = 0;
                                                }
                                                dVar.b(pVar3);
                                            }
                                        }
                                        pVar3 = pVar3.f10407p;
                                        dVar = dVar;
                                        abstractC2367nF = abstractC2367nF;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                abstractC2367nF = AbstractC2359f.f(dVar);
                            }
                        }
                        pVar2 = pVar2.f10407p;
                    }
                }
            }
            rVar.f17892o = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00de, code lost:
    
        if (y0.AbstractC2359f.h(r18.a(), y0.AbstractC2359f.a(r9, r20)) > 0) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T0(y0.C2357d r15, long r16, y0.r r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.Y.T0(y0.d, long, y0.r, boolean, boolean):void");
    }

    public void U0(C2357d c2357d, long j7, r rVar, boolean z7, boolean z8) {
        Y y7 = this.f17826w;
        if (y7 != null) {
            y7.T0(c2357d, y7.M0(j7), rVar, z7, z8);
        }
    }

    public final void V0() {
        d0 d0Var = this.f17824N;
        if (d0Var != null) {
            d0Var.invalidate();
            return;
        }
        Y y7 = this.f17827x;
        if (y7 != null) {
            y7.V0();
        }
    }

    public final boolean W0() {
        if (this.f17824N != null && this.f17816D <= 0.0f) {
            return true;
        }
        Y y7 = this.f17827x;
        if (y7 != null) {
            return y7.W0();
        }
        return false;
    }

    public final long X0(w0.r rVar, long j7) {
        if (rVar instanceof C2171F) {
            ((C2171F) rVar).f16834k.f17777v.Y0();
            return ((C2171F) rVar).b(this, j7 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        Y yG1 = g1(rVar);
        yG1.Y0();
        Y yL0 = L0(yG1);
        while (yG1 != yL0) {
            j7 = yG1.h1(j7);
            yG1 = yG1.f17827x;
            kotlin.jvm.internal.l.c(yG1);
        }
        return E0(yL0, j7);
    }

    public final void Y0() {
        K k7 = this.f17825v.f17661H;
        int i7 = k7.a.f17661H.f17746c;
        if (i7 == 3 || i7 == 4) {
            if (k7.f17761r.f17726G) {
                k7.e(true);
            } else {
                k7.d(true);
            }
        }
        if (i7 == 4) {
            I i8 = k7.f17762s;
            if (i8 == null || !i8.f17704D) {
                k7.f(true);
            } else {
                k7.g(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r7v7, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void Z0() {
        a0.p pVarP0;
        a0.p pVarR0 = R0(Z.h(128));
        if (pVarR0 == null || (pVarR0.f10402k.f10405n & 128) == 0) {
            return;
        }
        Y.h hVarC = Y.s.c();
        e4.k kVarF = hVarC != null ? hVarC.f() : null;
        Y.h hVarD = Y.s.d(hVarC);
        try {
            boolean zH = Z.h(128);
            if (!zH) {
                pVarP0 = P0().f10406o;
                if (pVarP0 == null) {
                }
            }
            pVarP0 = P0();
            for (a0.p pVarR02 = R0(zH); pVarR02 != null; pVarR02 = pVarR02.f10407p) {
                if ((pVarR02.f10405n & 128) == 0) {
                    break;
                }
                if ((pVarR02.f10404m & 128) != 0) {
                    ?? dVar = 0;
                    AbstractC2367n abstractC2367nF = pVarR02;
                    while (abstractC2367nF != 0) {
                        if (abstractC2367nF instanceof InterfaceC2374v) {
                            ((InterfaceC2374v) abstractC2367nF).r(this.f16842m);
                        } else if ((abstractC2367nF.f10404m & 128) != 0 && (abstractC2367nF instanceof AbstractC2367n)) {
                            a0.p pVar = abstractC2367nF.f17880y;
                            int i7 = 0;
                            abstractC2367nF = abstractC2367nF;
                            dVar = dVar;
                            while (pVar != null) {
                                if ((pVar.f10404m & 128) != 0) {
                                    i7++;
                                    dVar = dVar;
                                    if (i7 == 1) {
                                        abstractC2367nF = pVar;
                                    } else {
                                        if (dVar == 0) {
                                            dVar = new Q.d(new a0.p[16]);
                                        }
                                        if (abstractC2367nF != 0) {
                                            dVar.b(abstractC2367nF);
                                            abstractC2367nF = 0;
                                        }
                                        dVar.b(pVar);
                                    }
                                }
                                pVar = pVar.f10407p;
                                abstractC2367nF = abstractC2367nF;
                                dVar = dVar;
                            }
                            if (i7 == 1) {
                            }
                        }
                        abstractC2367nF = AbstractC2359f.f(dVar);
                    }
                }
                if (pVarR02 == pVarP0) {
                    break;
                }
            }
        } finally {
            Y.s.f(hVarC, hVarD, kVarF);
        }
    }

    @Override // T0.b
    public final float a() {
        return this.f17825v.f17655B.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void a1() {
        boolean zH = Z.h(128);
        a0.p pVarP0 = P0();
        if (!zH && (pVarP0 = pVarP0.f10406o) == null) {
            return;
        }
        for (a0.p pVarR0 = R0(zH); pVarR0 != null && (pVarR0.f10405n & 128) != 0; pVarR0 = pVarR0.f10407p) {
            if ((pVarR0.f10404m & 128) != 0) {
                AbstractC2367n abstractC2367nF = pVarR0;
                ?? dVar = 0;
                while (abstractC2367nF != 0) {
                    if (abstractC2367nF instanceof InterfaceC2374v) {
                        ((InterfaceC2374v) abstractC2367nF).b0(this);
                    } else if ((abstractC2367nF.f10404m & 128) != 0 && (abstractC2367nF instanceof AbstractC2367n)) {
                        a0.p pVar = abstractC2367nF.f17880y;
                        int i7 = 0;
                        abstractC2367nF = abstractC2367nF;
                        dVar = dVar;
                        while (pVar != null) {
                            if ((pVar.f10404m & 128) != 0) {
                                i7++;
                                dVar = dVar;
                                if (i7 == 1) {
                                    abstractC2367nF = pVar;
                                } else {
                                    if (dVar == 0) {
                                        dVar = new Q.d(new a0.p[16]);
                                    }
                                    if (abstractC2367nF != 0) {
                                        dVar.b(abstractC2367nF);
                                        abstractC2367nF = 0;
                                    }
                                    dVar.b(pVar);
                                }
                            }
                            pVar = pVar.f10407p;
                            abstractC2367nF = abstractC2367nF;
                            dVar = dVar;
                        }
                        if (i7 == 1) {
                        }
                    }
                    abstractC2367nF = AbstractC2359f.f(dVar);
                }
            }
            if (pVarR0 == pVarP0) {
                return;
            }
        }
    }

    public abstract void b1(InterfaceC0995r interfaceC0995r, C1375b c1375b);

    public final void c1(long j7, float f5, e4.k kVar) {
        k1(false, kVar);
        if (!T0.h.a(this.f17819G, j7)) {
            this.f17819G = j7;
            C2349D c2349d = this.f17825v;
            c2349d.f17661H.f17761r.v0();
            d0 d0Var = this.f17824N;
            if (d0Var != null) {
                d0Var.i(j7);
            } else {
                Y y7 = this.f17827x;
                if (y7 != null) {
                    y7.V0();
                }
            }
            N.B0(this);
            C2471u c2471u = c2349d.f17679s;
            if (c2471u != null) {
                c2471u.u(c2349d);
            }
        }
        this.f17820H = f5;
        if (this.f17772r) {
            return;
        }
        p0(new i0(y0(), this));
    }

    public final void d1(g0.b bVar, boolean z7, boolean z8) {
        d0 d0Var = this.f17824N;
        if (d0Var != null) {
            if (this.f17829z) {
                if (z8) {
                    long jO0 = O0();
                    float fD = g0.f.d(jO0) / 2.0f;
                    float fB = g0.f.b(jO0) / 2.0f;
                    long j7 = this.f16842m;
                    bVar.a(-fD, -fB, ((int) (j7 >> 32)) + fD, ((int) (j7 & 4294967295L)) + fB);
                } else if (z7) {
                    long j8 = this.f16842m;
                    bVar.a(0.0f, 0.0f, (int) (j8 >> 32), (int) (j8 & 4294967295L));
                }
                if (bVar.b()) {
                    return;
                }
            }
            d0Var.g(bVar, false);
        }
        long j9 = this.f17819G;
        float f5 = (int) (j9 >> 32);
        bVar.a += f5;
        bVar.f11656c += f5;
        float f7 = (int) (j9 & 4294967295L);
        bVar.f11655b += f7;
        bVar.f11657d += f7;
    }

    @Override // w0.r
    public final void e(w0.r rVar, float[] fArr) {
        Y yG1 = g1(rVar);
        yG1.Y0();
        Y yL0 = L0(yG1);
        C0962G.d(fArr);
        yG1.j1(yL0, fArr);
        i1(yL0, fArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void e1(InterfaceC2174I interfaceC2174I) {
        Y y7;
        InterfaceC2174I interfaceC2174I2 = this.f17817E;
        if (interfaceC2174I != interfaceC2174I2) {
            this.f17817E = interfaceC2174I;
            C2349D c2349d = this.f17825v;
            if (interfaceC2174I2 == null || interfaceC2174I.l() != interfaceC2174I2.l() || interfaceC2174I.e() != interfaceC2174I2.e()) {
                int iL = interfaceC2174I.l();
                int iE = interfaceC2174I.e();
                d0 d0Var = this.f17824N;
                if (d0Var != null) {
                    d0Var.c(AbstractC1420H.a(iL, iE));
                } else if (c2349d.F() && (y7 = this.f17827x) != null) {
                    y7.V0();
                }
                l0(AbstractC1420H.a(iL, iE));
                if (this.f17813A != null) {
                    l1(false);
                }
                boolean zH = Z.h(4);
                a0.p pVarP0 = P0();
                if (zH || (pVarP0 = pVarP0.f10406o) != null) {
                    for (a0.p pVarR0 = R0(zH); pVarR0 != null && (pVarR0.f10405n & 4) != 0; pVarR0 = pVarR0.f10407p) {
                        if ((pVarR0.f10404m & 4) != 0) {
                            AbstractC2367n abstractC2367nF = pVarR0;
                            ?? dVar = 0;
                            while (abstractC2367nF != 0) {
                                if (abstractC2367nF instanceof InterfaceC2368o) {
                                    ((InterfaceC2368o) abstractC2367nF).n0();
                                } else if ((abstractC2367nF.f10404m & 4) != 0 && (abstractC2367nF instanceof AbstractC2367n)) {
                                    a0.p pVar = abstractC2367nF.f17880y;
                                    int i7 = 0;
                                    abstractC2367nF = abstractC2367nF;
                                    dVar = dVar;
                                    while (pVar != null) {
                                        if ((pVar.f10404m & 4) != 0) {
                                            i7++;
                                            dVar = dVar;
                                            if (i7 == 1) {
                                                abstractC2367nF = pVar;
                                            } else {
                                                if (dVar == 0) {
                                                    dVar = new Q.d(new a0.p[16]);
                                                }
                                                if (abstractC2367nF != 0) {
                                                    dVar.b(abstractC2367nF);
                                                    abstractC2367nF = 0;
                                                }
                                                dVar.b(pVar);
                                            }
                                        }
                                        pVar = pVar.f10407p;
                                        abstractC2367nF = abstractC2367nF;
                                        dVar = dVar;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                abstractC2367nF = AbstractC2359f.f(dVar);
                            }
                        }
                        if (pVarR0 == pVarP0) {
                            break;
                        }
                    }
                }
                C2471u c2471u = c2349d.f17679s;
                if (c2471u != null) {
                    c2471u.u(c2349d);
                }
            }
            LinkedHashMap linkedHashMap = this.f17818F;
            if (((linkedHashMap == null || linkedHashMap.isEmpty()) && interfaceC2174I.m().isEmpty()) || kotlin.jvm.internal.l.a(interfaceC2174I.m(), this.f17818F)) {
                return;
            }
            c2349d.f17661H.f17761r.f17723D.f();
            LinkedHashMap linkedHashMap2 = this.f17818F;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.f17818F = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC2174I.m());
        }
    }

    @Override // w0.r
    public final long f(long j7) {
        if (!P0().f10414w) {
            AbstractC0905c.C("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        w0.r rVarF = w0.X.f(this);
        C2471u c2471u = (C2471u) AbstractC2352G.a(this.f17825v);
        c2471u.y();
        return X0(rVarF, g0.c.g(C0962G.b(j7, c2471u.f18874a0), rVarF.S(0L)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void f1(a0.p pVar, C2357d c2357d, long j7, r rVar, boolean z7, boolean z8, float f5) {
        boolean z9;
        if (pVar == null) {
            U0(c2357d, j7, rVar, z7, z8);
            return;
        }
        switch (c2357d.f17838k) {
            case 1:
                AbstractC2367n abstractC2367nF = pVar;
                ?? dVar = 0;
                while (true) {
                    int i7 = 0;
                    if (abstractC2367nF == 0) {
                        z9 = false;
                        break;
                    } else {
                        if (abstractC2367nF instanceof j0) {
                            ((j0) abstractC2367nF).p0();
                        } else if ((abstractC2367nF.f10404m & 16) != 0 && (abstractC2367nF instanceof AbstractC2367n)) {
                            a0.p pVar2 = abstractC2367nF.f17880y;
                            abstractC2367nF = abstractC2367nF;
                            dVar = dVar;
                            while (pVar2 != null) {
                                if ((pVar2.f10404m & 16) != 0) {
                                    i7++;
                                    dVar = dVar;
                                    if (i7 == 1) {
                                        abstractC2367nF = pVar2;
                                    } else {
                                        if (dVar == 0) {
                                            dVar = new Q.d(new a0.p[16]);
                                        }
                                        if (abstractC2367nF != 0) {
                                            dVar.b(abstractC2367nF);
                                            abstractC2367nF = 0;
                                        }
                                        dVar.b(pVar2);
                                    }
                                }
                                pVar2 = pVar2.f10407p;
                                abstractC2367nF = abstractC2367nF;
                                dVar = dVar;
                            }
                            if (i7 == 1) {
                            }
                        }
                        abstractC2367nF = AbstractC2359f.f(dVar);
                    }
                }
                break;
            default:
                z9 = false;
                break;
        }
        if (!z9) {
            f1(AbstractC2359f.e(pVar, c2357d.a()), c2357d, j7, rVar, z7, z8, f5);
            return;
        }
        X x7 = new X(this, pVar, c2357d, j7, rVar, z7, z8, f5, 1);
        if (rVar.f17890m == P3.r.y(rVar)) {
            rVar.h(pVar, f5, z8, x7);
            if (rVar.f17890m + 1 == P3.r.y(rVar)) {
                rVar.j();
                return;
            }
            return;
        }
        long jA = rVar.a();
        int i8 = rVar.f17890m;
        rVar.f17890m = P3.r.y(rVar);
        rVar.h(pVar, f5, z8, x7);
        if (rVar.f17890m + 1 < P3.r.y(rVar) && AbstractC2359f.h(jA, rVar.a()) > 0) {
            int i9 = rVar.f17890m + 1;
            int i10 = i8 + 1;
            Object[] objArr = rVar.f17888k;
            P3.m.W(i10, i9, rVar.f17891n, objArr, objArr);
            long[] jArr = rVar.f17889l;
            System.arraycopy(jArr, i9, jArr, i10, rVar.f17891n - i9);
            rVar.f17890m = ((rVar.f17891n + i8) - rVar.f17890m) - 1;
        }
        rVar.j();
        rVar.f17890m = i8;
    }

    @Override // w0.r
    public final long g(long j7) {
        long jS = S(j7);
        C2471u c2471u = (C2471u) AbstractC2352G.a(this.f17825v);
        c2471u.y();
        return C0962G.b(jS, c2471u.f18873W);
    }

    @Override // w0.InterfaceC2197o
    public final T0.k getLayoutDirection() {
        return this.f17825v.f17656C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // w0.S, w0.InterfaceC2172G
    public final Object h() {
        C2349D c2349d = this.f17825v;
        if (!c2349d.f17660G.f(64)) {
            return null;
        }
        P0();
        Object objM0 = null;
        for (a0.p pVar = (m0) c2349d.f17660G.f7175e; pVar != null; pVar = pVar.f10406o) {
            if ((pVar.f10404m & 64) != 0) {
                AbstractC2367n abstractC2367nF = pVar;
                ?? dVar = 0;
                while (abstractC2367nF != 0) {
                    if (abstractC2367nF instanceof h0) {
                        objM0 = ((h0) abstractC2367nF).m0(objM0);
                    } else if ((abstractC2367nF.f10404m & 64) != 0 && (abstractC2367nF instanceof AbstractC2367n)) {
                        a0.p pVar2 = abstractC2367nF.f17880y;
                        int i7 = 0;
                        abstractC2367nF = abstractC2367nF;
                        dVar = dVar;
                        while (pVar2 != null) {
                            if ((pVar2.f10404m & 64) != 0) {
                                i7++;
                                dVar = dVar;
                                if (i7 == 1) {
                                    abstractC2367nF = pVar2;
                                } else {
                                    if (dVar == 0) {
                                        dVar = new Q.d(new a0.p[16]);
                                    }
                                    if (abstractC2367nF != 0) {
                                        dVar.b(abstractC2367nF);
                                        abstractC2367nF = 0;
                                    }
                                    dVar.b(pVar2);
                                }
                            }
                            pVar2 = pVar2.f10407p;
                            abstractC2367nF = abstractC2367nF;
                            dVar = dVar;
                        }
                        if (i7 == 1) {
                        }
                    }
                    abstractC2367nF = AbstractC2359f.f(dVar);
                }
            }
        }
        return objM0;
    }

    public final long h1(long j7) {
        d0 d0Var = this.f17824N;
        if (d0Var != null) {
            j7 = d0Var.b(j7, false);
        }
        long j8 = this.f17819G;
        return AbstractC0832b.e(g0.c.d(j7) + ((int) (j8 >> 32)), g0.c.e(j7) + ((int) (j8 & 4294967295L)));
    }

    @Override // w0.r
    public final w0.r i() {
        if (P0().f10414w) {
            Y0();
            return ((Y) this.f17825v.f17660G.f7174d).f17827x;
        }
        AbstractC0905c.C("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    public final void i1(Y y7, float[] fArr) {
        if (kotlin.jvm.internal.l.a(y7, this)) {
            return;
        }
        Y y8 = this.f17827x;
        kotlin.jvm.internal.l.c(y8);
        y8.i1(y7, fArr);
        if (!T0.h.a(this.f17819G, 0L)) {
            float[] fArr2 = f17810Q;
            C0962G.d(fArr2);
            long j7 = this.f17819G;
            C0962G.h(fArr2, -((int) (j7 >> 32)), -((int) (j7 & 4294967295L)));
            C0962G.g(fArr, fArr2);
        }
        d0 d0Var = this.f17824N;
        if (d0Var != null) {
            d0Var.f(fArr);
        }
    }

    public final void j1(Y y7, float[] fArr) {
        Y y8 = this;
        while (!y8.equals(y7)) {
            d0 d0Var = y8.f17824N;
            if (d0Var != null) {
                d0Var.d(fArr);
            }
            if (!T0.h.a(y8.f17819G, 0L)) {
                float[] fArr2 = f17810Q;
                C0962G.d(fArr2);
                C0962G.h(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L));
                C0962G.g(fArr, fArr2);
            }
            y8 = y8.f17827x;
            kotlin.jvm.internal.l.c(y8);
        }
    }

    @Override // w0.r
    public final long k(w0.r rVar, long j7) {
        return X0(rVar, j7);
    }

    public final void k1(boolean z7, e4.k kVar) {
        C2471u c2471u;
        Reference referencePoll;
        Q.d dVar;
        Object obj;
        C2349D c2349d = this.f17825v;
        boolean z8 = (!z7 && this.f17813A == kVar && kotlin.jvm.internal.l.a(this.f17814B, c2349d.f17655B) && this.f17815C == c2349d.f17656C) ? false : true;
        this.f17814B = c2349d.f17655B;
        this.f17815C = c2349d.f17656C;
        boolean zE = c2349d.E();
        C1861b c1861b = this.f17822L;
        if (!zE || kVar == null) {
            this.f17813A = null;
            d0 d0Var = this.f17824N;
            if (d0Var != null) {
                d0Var.h();
                c2349d.f17662K = true;
                c1861b.invoke();
                if (P0().f10414w && (c2471u = c2349d.f17679s) != null) {
                    c2471u.u(c2349d);
                }
            }
            this.f17824N = null;
            this.f17823M = false;
            return;
        }
        this.f17813A = kVar;
        if (this.f17824N != null) {
            if (z8) {
                l1(true);
                return;
            }
            return;
        }
        C2471u c2471u2 = (C2471u) AbstractC2352G.a(c2349d);
        D.S s7 = this.f17821K;
        do {
            n5.P p7 = c2471u2.f18914z0;
            referencePoll = ((ReferenceQueue) p7.f13379m).poll();
            dVar = (Q.d) p7.f13378l;
            if (referencePoll != null) {
                dVar.m(referencePoll);
            }
        } while (referencePoll != null);
        while (true) {
            if (!dVar.l()) {
                obj = null;
                break;
            } else {
                obj = ((Reference) dVar.n(dVar.f7829m - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        d0 u02 = (d0) obj;
        if (u02 != null) {
            u02.a(s7, c1861b);
        } else if (c2471u2.isHardwareAccelerated() && Build.VERSION.SDK_INT != 28) {
            u02 = new C2472u0(c2471u2.getGraphicsContext().b(), c2471u2.getGraphicsContext(), c2471u2, s7, c1861b);
        } else if (c2471u2.isHardwareAccelerated() && c2471u2.f18878e0) {
            try {
                u02 = new H0(c2471u2, s7, c1861b);
            } catch (Throwable unused) {
                c2471u2.f18878e0 = false;
            }
        } else {
            if (c2471u2.f18865O == null) {
                if (!U0.f18684C) {
                    z0.O.D(new View(c2471u2.getContext()));
                }
                C2466r0 c2466r0 = U0.f18685D ? new C2466r0(c2471u2.getContext()) : new V0(c2471u2.getContext());
                c2471u2.f18865O = c2466r0;
                c2471u2.addView(c2466r0, -1);
            }
            C2466r0 c2466r02 = c2471u2.f18865O;
            kotlin.jvm.internal.l.c(c2466r02);
            u02 = new U0(c2471u2, c2466r02, s7, c1861b);
        }
        u02.c(this.f16842m);
        u02.i(this.f17819G);
        this.f17824N = u02;
        l1(true);
        c2349d.f17662K = true;
        c1861b.invoke();
    }

    public final void l1(boolean z7) {
        C2471u c2471u;
        d0 d0Var = this.f17824N;
        if (d0Var == null) {
            if (this.f17813A == null) {
                return;
            }
            AbstractC0905c.C("null layer with a non-null layerBlock");
            throw null;
        }
        e4.k kVar = this.f17813A;
        if (kVar == null) {
            AbstractC0905c.D("updateLayerParameters requires a non-null layerBlock");
            throw null;
        }
        C0970O c0970o = f17808O;
        c0970o.f(1.0f);
        c0970o.g(1.0f);
        c0970o.b(1.0f);
        c0970o.h(0.0f);
        long j7 = AbstractC0959D.a;
        c0970o.c(j7);
        c0970o.j(j7);
        if (c0970o.f11792r != 8.0f) {
            c0970o.f11785k |= 2048;
            c0970o.f11792r = 8.0f;
        }
        c0970o.k(C0976V.f11815b);
        c0970o.i(AbstractC0968M.a);
        c0970o.e(false);
        c0970o.f11796v = 9205357640488583168L;
        c0970o.f11799y = null;
        c0970o.f11785k = 0;
        C2349D c2349d = this.f17825v;
        c0970o.f11797w = c2349d.f17655B;
        c0970o.f11798x = c2349d.f17656C;
        c0970o.f11796v = AbstractC1420H.O(this.f16842m);
        ((C2471u) AbstractC2352G.a(c2349d)).getSnapshotObserver().a(this, C2358e.f17842p, new C1861b(10, kVar));
        C2373u c2373u = this.J;
        if (c2373u == null) {
            c2373u = new C2373u();
            this.J = c2373u;
        }
        c2373u.a = c0970o.f11786l;
        c2373u.f17896b = c0970o.f11787m;
        c2373u.f17897c = c0970o.f11792r;
        c2373u.f17898d = c0970o.f11793s;
        d0Var.l(c0970o);
        this.f17829z = c0970o.f11795u;
        this.f17816D = c0970o.f11788n;
        if (!z7 || (c2471u = c2349d.f17679s) == null) {
            return;
        }
        c2471u.u(c2349d);
    }

    @Override // T0.b
    public final float n() {
        return this.f17825v.f17655B.n();
    }

    @Override // y0.N
    public final N u0() {
        return this.f17826w;
    }

    @Override // y0.N
    public final boolean w0() {
        return this.f17817E != null;
    }

    @Override // y0.N
    public final C2349D x0() {
        return this.f17825v;
    }

    @Override // w0.r
    public final long y(long j7) {
        if (P0().f10414w) {
            return X0(w0.X.f(this), ((C2471u) AbstractC2352G.a(this.f17825v)).B(j7));
        }
        AbstractC0905c.C("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    @Override // y0.N
    public final InterfaceC2174I y0() {
        InterfaceC2174I interfaceC2174I = this.f17817E;
        if (interfaceC2174I != null) {
            return interfaceC2174I;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // y0.f0
    public final boolean z() {
        return (this.f17824N == null || this.f17828y || !this.f17825v.E()) ? false : true;
    }

    @Override // y0.N
    public final N z0() {
        return this.f17827x;
    }

    @Override // y0.N
    public final w0.r v0() {
        return this;
    }
}
