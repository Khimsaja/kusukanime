package y0;

import O.C0493g0;
import O.C0517t;
import O.C0521v;
import O.InterfaceC0498j;
import O.InterfaceC0523w;
import e0.C0810b;
import f6.AbstractC0905c;
import h0.C0970O;
import h0.InterfaceC0995r;
import java.util.List;
import k0.C1375b;
import p.AbstractC1755i;
import r0.C1861b;
import w0.C2169D;
import w0.InterfaceC2173H;
import z0.C2471u;
import z0.S0;

/* renamed from: y0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2349D implements InterfaceC0498j, f0, InterfaceC2364k {

    /* renamed from: T, reason: collision with root package name */
    public static final C2346A f17651T = new C2346A("Undefined intrinsics block and it is required");

    /* renamed from: U, reason: collision with root package name */
    public static final C2378z f17652U = new C2378z();

    /* renamed from: V, reason: collision with root package name */
    public static final B2.e f17653V = new B2.e(18);

    /* renamed from: A, reason: collision with root package name */
    public n5.P f17654A;

    /* renamed from: B, reason: collision with root package name */
    public T0.b f17655B;

    /* renamed from: C, reason: collision with root package name */
    public T0.k f17656C;

    /* renamed from: D, reason: collision with root package name */
    public S0 f17657D;

    /* renamed from: E, reason: collision with root package name */
    public InterfaceC0523w f17658E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f17659F;

    /* renamed from: G, reason: collision with root package name */
    public final C0517t f17660G;

    /* renamed from: H, reason: collision with root package name */
    public final K f17661H;
    public C2169D I;
    public Y J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f17662K;

    /* renamed from: L, reason: collision with root package name */
    public a0.q f17663L;

    /* renamed from: M, reason: collision with root package name */
    public a0.q f17664M;

    /* renamed from: N, reason: collision with root package name */
    public W0.b f17665N;

    /* renamed from: O, reason: collision with root package name */
    public W0.c f17666O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f17667P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f17668Q;

    /* renamed from: R, reason: collision with root package name */
    public int f17669R;

    /* renamed from: S, reason: collision with root package name */
    public int f17670S;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f17671k;

    /* renamed from: l, reason: collision with root package name */
    public int f17672l;

    /* renamed from: m, reason: collision with root package name */
    public C2349D f17673m;

    /* renamed from: n, reason: collision with root package name */
    public int f17674n;

    /* renamed from: o, reason: collision with root package name */
    public final n5.P f17675o;

    /* renamed from: p, reason: collision with root package name */
    public Q.d f17676p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17677q;

    /* renamed from: r, reason: collision with root package name */
    public C2349D f17678r;

    /* renamed from: s, reason: collision with root package name */
    public C2471u f17679s;

    /* renamed from: t, reason: collision with root package name */
    public W0.q f17680t;

    /* renamed from: u, reason: collision with root package name */
    public int f17681u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f17682v;

    /* renamed from: w, reason: collision with root package name */
    public F0.i f17683w;

    /* renamed from: x, reason: collision with root package name */
    public final Q.d f17684x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f17685y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC2173H f17686z;

    public C2349D(int i7) {
        this((i7 & 1) == 0, F0.k.a.addAndGet(1));
    }

    public static boolean M(C2349D c2349d) {
        J j7 = c2349d.f17661H.f17761r;
        return c2349d.L(j7.f17737s ? new T0.a(j7.f16843n) : null);
    }

    public static void R(C2349D c2349d, boolean z7, int i7) {
        C2349D c2349dS;
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        boolean z8 = (i7 & 2) != 0;
        boolean z9 = (i7 & 4) != 0;
        if (c2349d.f17673m == null) {
            AbstractC0905c.C("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
            throw null;
        }
        C2471u c2471u = c2349d.f17679s;
        if (c2471u == null || c2349d.f17682v || c2349d.f17671k) {
            return;
        }
        c2471u.v(c2349d, true, z7, z8);
        if (z9) {
            I i8 = c2349d.f17661H.f17762s;
            kotlin.jvm.internal.l.c(i8);
            K k7 = i8.f17708H;
            C2349D c2349dS2 = k7.a.s();
            int i9 = k7.a.f17669R;
            if (c2349dS2 == null || i9 == 3) {
                return;
            }
            while (c2349dS2.f17669R == i9 && (c2349dS = c2349dS2.s()) != null) {
                c2349dS2 = c2349dS;
            }
            int iB = AbstractC1755i.b(i9);
            if (iB == 0) {
                if (c2349dS2.f17673m != null) {
                    R(c2349dS2, z7, 6);
                    return;
                } else {
                    T(c2349dS2, z7, 6);
                    return;
                }
            }
            if (iB != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (c2349dS2.f17673m != null) {
                c2349dS2.Q(z7);
            } else {
                c2349dS2.S(z7);
            }
        }
    }

    public static void T(C2349D c2349d, boolean z7, int i7) {
        C2471u c2471u;
        C2349D c2349dS;
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        boolean z8 = (i7 & 2) != 0;
        boolean z9 = (i7 & 4) != 0;
        if (c2349d.f17682v || c2349d.f17671k || (c2471u = c2349d.f17679s) == null) {
            return;
        }
        c2471u.v(c2349d, false, z7, z8);
        if (z9) {
            K k7 = c2349d.f17661H.f17761r.f17733P;
            C2349D c2349dS2 = k7.a.s();
            int i8 = k7.a.f17669R;
            if (c2349dS2 == null || i8 == 3) {
                return;
            }
            while (c2349dS2.f17669R == i8 && (c2349dS = c2349dS2.s()) != null) {
                c2349dS2 = c2349dS;
            }
            int iB = AbstractC1755i.b(i8);
            if (iB == 0) {
                T(c2349dS2, z7, 6);
            } else {
                if (iB != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                c2349dS2.S(z7);
            }
        }
    }

    public static void U(C2349D c2349d) {
        int i7 = AbstractC2348C.a[AbstractC1755i.b(c2349d.f17661H.f17746c)];
        K k7 = c2349d.f17661H;
        if (i7 != 1) {
            throw new IllegalStateException("Unexpected state ".concat(v.c0.f(k7.f17746c)));
        }
        if (k7.f17750g) {
            R(c2349d, true, 6);
            return;
        }
        if (k7.f17751h) {
            c2349d.Q(true);
        }
        if (k7.f17747d) {
            T(c2349d, true, 6);
        } else if (k7.f17748e) {
            c2349d.S(true);
        }
    }

    public final void A() {
        C0517t c0517t = this.f17660G;
        Y y7 = (Y) c0517t.f7174d;
        C2372t c2372t = (C2372t) c0517t.f7173c;
        while (y7 != c2372t) {
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator", y7);
            C2377y c2377y = (C2377y) y7;
            d0 d0Var = c2377y.f17824N;
            if (d0Var != null) {
                d0Var.invalidate();
            }
            y7 = c2377y.f17826w;
        }
        d0 d0Var2 = ((C2372t) c0517t.f7173c).f17824N;
        if (d0Var2 != null) {
            d0Var2.invalidate();
        }
    }

    public final void B() {
        if (this.f17673m != null) {
            R(this, false, 7);
        } else {
            T(this, false, 7);
        }
    }

    public final void C() {
        this.f17683w = null;
        ((C2471u) AbstractC2352G.a(this)).x();
    }

    public final void D() {
        C2349D c2349d;
        if (this.f17674n > 0) {
            this.f17677q = true;
        }
        if (!this.f17671k || (c2349d = this.f17678r) == null) {
            return;
        }
        c2349d.D();
    }

    public final boolean E() {
        return this.f17679s != null;
    }

    public final boolean F() {
        return this.f17661H.f17761r.f17721B;
    }

    public final Boolean G() {
        I i7 = this.f17661H.f17762s;
        if (i7 != null) {
            return Boolean.valueOf(i7.f17719z);
        }
        return null;
    }

    public final void H() {
        C2349D c2349dS;
        if (this.f17669R == 3) {
            g();
        }
        I i7 = this.f17661H.f17762s;
        kotlin.jvm.internal.l.c(i7);
        try {
            i7.f17709p = true;
            if (!i7.f17714u) {
                AbstractC0905c.C("replace() called on item that was not placed");
                throw null;
            }
            i7.f17707G = false;
            boolean z7 = i7.f17719z;
            i7.x0(i7.f17717x, i7.f17718y);
            if (z7 && !i7.f17707G && (c2349dS = i7.f17708H.a.s()) != null) {
                c2349dS.Q(false);
            }
        } finally {
            i7.f17709p = false;
        }
    }

    public final void I(int i7, int i8, int i9) {
        if (i7 == i8) {
            return;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = i7 > i8 ? i7 + i10 : i7;
            int i12 = i7 > i8 ? i8 + i10 : (i8 + i9) - 2;
            n5.P p7 = this.f17675o;
            Object objN = ((Q.d) p7.f13378l).n(i11);
            C1861b c1861b = (C1861b) p7.f13379m;
            c1861b.invoke();
            ((Q.d) p7.f13378l).a(i12, (C2349D) objN);
            c1861b.invoke();
        }
        K();
        D();
        B();
    }

    public final void J(C2349D c2349d) {
        if (c2349d.f17661H.f17757n > 0) {
            this.f17661H.b(r0.f17757n - 1);
        }
        if (this.f17679s != null) {
            c2349d.i();
        }
        c2349d.f17678r = null;
        ((Y) c2349d.f17660G.f7174d).f17827x = null;
        if (c2349d.f17671k) {
            this.f17674n--;
            Q.d dVar = (Q.d) c2349d.f17675o.f13378l;
            int i7 = dVar.f7829m;
            if (i7 > 0) {
                Object[] objArr = dVar.f7827k;
                int i8 = 0;
                do {
                    ((Y) ((C2349D) objArr[i8]).f17660G.f7174d).f17827x = null;
                    i8++;
                } while (i8 < i7);
            }
        }
        D();
        K();
    }

    public final void K() {
        if (!this.f17671k) {
            this.f17685y = true;
            return;
        }
        C2349D c2349dS = s();
        if (c2349dS != null) {
            c2349dS.K();
        }
    }

    public final boolean L(T0.a aVar) {
        if (aVar == null) {
            return false;
        }
        if (this.f17669R == 3) {
            f();
        }
        return this.f17661H.f17761r.z0(aVar.a);
    }

    public final void N() {
        n5.P p7 = this.f17675o;
        int i7 = ((Q.d) p7.f13378l).f7829m;
        while (true) {
            i7--;
            Q.d dVar = (Q.d) p7.f13378l;
            if (-1 >= i7) {
                dVar.g();
                ((C1861b) p7.f13379m).invoke();
                return;
            }
            J((C2349D) dVar.f7827k[i7]);
        }
    }

    public final void O(int i7, int i8) {
        if (i8 < 0) {
            AbstractC0905c.B("count (" + i8 + ") must be greater than 0");
            throw null;
        }
        int i9 = (i8 + i7) - 1;
        if (i7 > i9) {
            return;
        }
        while (true) {
            n5.P p7 = this.f17675o;
            J((C2349D) ((Q.d) p7.f13378l).f7827k[i9]);
            Object objN = ((Q.d) p7.f13378l).n(i9);
            ((C1861b) p7.f13379m).invoke();
            if (i9 == i7) {
                return;
            } else {
                i9--;
            }
        }
    }

    public final void P() {
        C2349D c2349dS;
        if (this.f17669R == 3) {
            g();
        }
        J j7 = this.f17661H.f17761r;
        j7.getClass();
        try {
            j7.f17734p = true;
            if (!j7.f17738t) {
                AbstractC0905c.C("replace called on unplaced item");
                throw null;
            }
            boolean z7 = j7.f17721B;
            j7.y0(j7.f17741w, j7.f17743y, j7.f17742x);
            if (z7 && !j7.J && (c2349dS = j7.f17733P.a.s()) != null) {
                c2349dS.S(false);
            }
        } finally {
            j7.f17734p = false;
        }
    }

    public final void Q(boolean z7) {
        C2471u c2471u;
        if (this.f17671k || (c2471u = this.f17679s) == null) {
            return;
        }
        c2471u.w(this, true, z7);
    }

    public final void S(boolean z7) {
        C2471u c2471u;
        if (this.f17671k || (c2471u = this.f17679s) == null) {
            return;
        }
        c2471u.w(this, false, z7);
    }

    public final void V() {
        Q.d dVarV = v();
        int i7 = dVarV.f7829m;
        if (i7 > 0) {
            Object[] objArr = dVarV.f7827k;
            int i8 = 0;
            do {
                C2349D c2349d = (C2349D) objArr[i8];
                int i9 = c2349d.f17670S;
                c2349d.f17669R = i9;
                if (i9 != 3) {
                    c2349d.V();
                }
                i8++;
            } while (i8 < i7);
        }
    }

    public final void W(T0.b bVar) {
        if (kotlin.jvm.internal.l.a(this.f17655B, bVar)) {
            return;
        }
        this.f17655B = bVar;
        B();
        C2349D c2349dS = s();
        if (c2349dS != null) {
            c2349dS.y();
        }
        A();
        for (a0.p pVar = (a0.p) this.f17660G.f7176f; pVar != null; pVar = pVar.f10407p) {
            if ((pVar.f10404m & 16) != 0) {
                ((j0) pVar).k();
            } else if (pVar instanceof C0810b) {
                ((C0810b) pVar).G0();
            }
        }
    }

    public final void X(C2349D c2349d) {
        if (kotlin.jvm.internal.l.a(c2349d, this.f17673m)) {
            return;
        }
        this.f17673m = c2349d;
        if (c2349d != null) {
            K k7 = this.f17661H;
            if (k7.f17762s == null) {
                k7.f17762s = new I(k7);
            }
            C0517t c0517t = this.f17660G;
            Y y7 = ((C2372t) c0517t.f7173c).f17826w;
            for (Y y8 = (Y) c0517t.f7174d; !kotlin.jvm.internal.l.a(y8, y7) && y8 != null; y8 = y8.f17826w) {
                y8.K0();
            }
        }
        B();
    }

    public final void Y(InterfaceC2173H interfaceC2173H) {
        if (kotlin.jvm.internal.l.a(this.f17686z, interfaceC2173H)) {
            return;
        }
        this.f17686z = interfaceC2173H;
        n5.P p7 = this.f17654A;
        if (p7 != null) {
            ((C0493g0) p7.f13379m).setValue(interfaceC2173H);
        }
        B();
    }

    public final void Z(a0.q qVar) {
        if (!(!this.f17671k || this.f17663L == a0.n.a)) {
            AbstractC0905c.B("Modifiers are not supported on virtual LayoutNodes");
            throw null;
        }
        if (this.f17668Q) {
            AbstractC0905c.B("modifier is updated when deactivated");
            throw null;
        }
        if (E()) {
            d(qVar);
        } else {
            this.f17664M = qVar;
        }
    }

    @Override // O.InterfaceC0498j
    public final void a() {
        if (!E()) {
            AbstractC0905c.B("onReuse is only expected on attached node");
            throw null;
        }
        W0.q qVar = this.f17680t;
        if (qVar != null) {
            qVar.a();
        }
        C2169D c2169d = this.I;
        if (c2169d != null) {
            c2169d.f(false);
        }
        boolean z7 = this.f17668Q;
        C0517t c0517t = this.f17660G;
        if (z7) {
            this.f17668Q = false;
            C();
        } else {
            for (a0.p pVar = (m0) c0517t.f7175e; pVar != null; pVar = pVar.f10406o) {
                if (pVar.f10414w) {
                    pVar.B0();
                }
            }
            a0.p pVar2 = (m0) c0517t.f7175e;
            for (a0.p pVar3 = pVar2; pVar3 != null; pVar3 = pVar3.f10406o) {
                if (pVar3.f10414w) {
                    pVar3.D0();
                }
            }
            while (pVar2 != null) {
                if (pVar2.f10414w) {
                    pVar2.x0();
                }
                pVar2 = pVar2.f10406o;
            }
        }
        this.f17672l = F0.k.a.addAndGet(1);
        for (a0.p pVar4 = (a0.p) c0517t.f7176f; pVar4 != null; pVar4 = pVar4.f10407p) {
            pVar4.w0();
        }
        c0517t.i();
        U(this);
    }

    public final void a0() {
        if (this.f17674n <= 0 || !this.f17677q) {
            return;
        }
        int i7 = 0;
        this.f17677q = false;
        Q.d dVar = this.f17676p;
        if (dVar == null) {
            dVar = new Q.d(new C2349D[16]);
            this.f17676p = dVar;
        }
        dVar.g();
        Q.d dVar2 = (Q.d) this.f17675o.f13378l;
        int i8 = dVar2.f7829m;
        if (i8 > 0) {
            Object[] objArr = dVar2.f7827k;
            do {
                C2349D c2349d = (C2349D) objArr[i7];
                if (c2349d.f17671k) {
                    dVar.c(dVar.f7829m, c2349d.v());
                } else {
                    dVar.b(c2349d);
                }
                i7++;
            } while (i7 < i8);
        }
        K k7 = this.f17661H;
        k7.f17761r.f17725F = true;
        I i9 = k7.f17762s;
        if (i9 != null) {
            i9.f17703C = true;
        }
    }

    @Override // O.InterfaceC0498j
    public final void b() {
        W0.q qVar = this.f17680t;
        if (qVar != null) {
            qVar.b();
        }
        C2169D c2169d = this.I;
        if (c2169d != null) {
            c2169d.b();
        }
        C0517t c0517t = this.f17660G;
        Y y7 = ((C2372t) c0517t.f7173c).f17826w;
        for (Y y8 = (Y) c0517t.f7174d; !kotlin.jvm.internal.l.a(y8, y7) && y8 != null; y8 = y8.f17826w) {
            y8.f17828y = true;
            y8.f17822L.invoke();
            if (y8.f17824N != null) {
                y8.k1(false, null);
                y8.f17825v.S(false);
            }
        }
    }

    @Override // O.InterfaceC0498j
    public final void c() {
        W0.q qVar = this.f17680t;
        if (qVar != null) {
            qVar.c();
        }
        C2169D c2169d = this.I;
        if (c2169d != null) {
            c2169d.f(true);
        }
        this.f17668Q = true;
        C0517t c0517t = this.f17660G;
        for (a0.p pVar = (m0) c0517t.f7175e; pVar != null; pVar = pVar.f10406o) {
            if (pVar.f10414w) {
                pVar.B0();
            }
        }
        a0.p pVar2 = (m0) c0517t.f7175e;
        for (a0.p pVar3 = pVar2; pVar3 != null; pVar3 = pVar3.f10406o) {
            if (pVar3.f10414w) {
                pVar3.D0();
            }
        }
        while (pVar2 != null) {
            if (pVar2.f10414w) {
                pVar2.x0();
            }
            pVar2 = pVar2.f10406o;
        }
        if (E()) {
            C();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c2, code lost:
    
        if (r2 >= r6) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c4, code lost:
    
        if (r3 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c6, code lost:
    
        if (r1 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ca, code lost:
    
        if (r13.f17664M == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cc, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ce, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cf, code lost:
    
        r6 = !r4;
        r5 = r1;
        r1 = r2;
        r4 = r8;
        r1.j(r2, r3, r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00da, code lost:
    
        f6.AbstractC0905c.D("structuralUpdate requires a non-null tail");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00df, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e0, code lost:
    
        f6.AbstractC0905c.D("expected prior modifier list to be non-empty");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e4, code lost:
    
        r2 = r2;
        r4 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [a0.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(a0.q r18) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.C2349D.d(a0.q):void");
    }

    public final void e(C2471u c2471u) {
        C2349D c2349d;
        if (!(this.f17679s == null)) {
            AbstractC0905c.C("Cannot attach " + this + " as it already is attached.  Tree: " + h(0));
            throw null;
        }
        C2349D c2349d2 = this.f17678r;
        if (c2349d2 != null && !kotlin.jvm.internal.l.a(c2349d2.f17679s, c2471u)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(c2471u);
            sb.append(") than the parent's owner(");
            C2349D c2349dS = s();
            sb.append(c2349dS != null ? c2349dS.f17679s : null);
            sb.append("). This tree: ");
            sb.append(h(0));
            sb.append(" Parent tree: ");
            C2349D c2349d3 = this.f17678r;
            sb.append(c2349d3 != null ? c2349d3.h(0) : null);
            AbstractC0905c.C(sb.toString());
            throw null;
        }
        C2349D c2349dS2 = s();
        K k7 = this.f17661H;
        if (c2349dS2 == null) {
            k7.f17761r.f17721B = true;
            I i7 = k7.f17762s;
            if (i7 != null) {
                i7.f17719z = true;
            }
        }
        C0517t c0517t = this.f17660G;
        ((Y) c0517t.f7174d).f17827x = c2349dS2 != null ? (C2372t) c2349dS2.f17660G.f7173c : null;
        this.f17679s = c2471u;
        this.f17681u = (c2349dS2 != null ? c2349dS2.f17681u : -1) + 1;
        a0.q qVar = this.f17664M;
        if (qVar != null) {
            d(qVar);
        }
        this.f17664M = null;
        if (c0517t.f(8)) {
            C();
        }
        c2471u.getClass();
        C2349D c2349d4 = this.f17678r;
        if (c2349d4 == null || (c2349d = c2349d4.f17673m) == null) {
            c2349d = this.f17673m;
        }
        X(c2349d);
        if (this.f17673m == null && c0517t.f(512)) {
            X(this);
        }
        if (!this.f17668Q) {
            for (a0.p pVar = (a0.p) c0517t.f7176f; pVar != null; pVar = pVar.f10407p) {
                pVar.w0();
            }
        }
        Q.d dVar = (Q.d) this.f17675o.f13378l;
        int i8 = dVar.f7829m;
        if (i8 > 0) {
            Object[] objArr = dVar.f7827k;
            int i9 = 0;
            do {
                ((C2349D) objArr[i9]).e(c2471u);
                i9++;
            } while (i9 < i8);
        }
        if (!this.f17668Q) {
            c0517t.i();
        }
        B();
        if (c2349dS2 != null) {
            c2349dS2.B();
        }
        Y y7 = ((C2372t) c0517t.f7173c).f17826w;
        for (Y y8 = (Y) c0517t.f7174d; !kotlin.jvm.internal.l.a(y8, y7) && y8 != null; y8 = y8.f17826w) {
            y8.k1(true, y8.f17813A);
            d0 d0Var = y8.f17824N;
            if (d0Var != null) {
                d0Var.invalidate();
            }
        }
        W0.b bVar = this.f17665N;
        if (bVar != null) {
            bVar.invoke(c2471u);
        }
        k7.h();
        if (this.f17668Q) {
            return;
        }
        a0.p pVar2 = (a0.p) c0517t.f7176f;
        if ((pVar2.f10405n & 7168) != 0) {
            while (pVar2 != null) {
                int i10 = pVar2.f10404m;
                if (((i10 & 4096) != 0) | ((i10 & 1024) != 0) | ((i10 & 2048) != 0)) {
                    Z.a(pVar2);
                }
                pVar2 = pVar2.f10407p;
            }
        }
    }

    public final void f() {
        this.f17670S = this.f17669R;
        this.f17669R = 3;
        Q.d dVarV = v();
        int i7 = dVarV.f7829m;
        if (i7 > 0) {
            Object[] objArr = dVarV.f7827k;
            int i8 = 0;
            do {
                C2349D c2349d = (C2349D) objArr[i8];
                if (c2349d.f17669R != 3) {
                    c2349d.f();
                }
                i8++;
            } while (i8 < i7);
        }
    }

    public final void g() {
        this.f17670S = this.f17669R;
        this.f17669R = 3;
        Q.d dVarV = v();
        int i7 = dVarV.f7829m;
        if (i7 > 0) {
            Object[] objArr = dVarV.f7827k;
            int i8 = 0;
            do {
                C2349D c2349d = (C2349D) objArr[i8];
                if (c2349d.f17669R == 2) {
                    c2349d.g();
                }
                i8++;
            } while (i8 < i7);
        }
    }

    public final String h(int i7) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < i7; i8++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        Q.d dVarV = v();
        int i9 = dVarV.f7829m;
        if (i9 > 0) {
            Object[] objArr = dVarV.f7827k;
            int i10 = 0;
            do {
                sb.append(((C2349D) objArr[i10]).h(i7 + 1));
                i10++;
            } while (i10 < i9);
        }
        String string = sb.toString();
        if (i7 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public final void i() {
        C2350E c2350e;
        C2471u c2471u = this.f17679s;
        if (c2471u == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            C2349D c2349dS = s();
            sb.append(c2349dS != null ? c2349dS.h(0) : null);
            AbstractC0905c.D(sb.toString());
            throw null;
        }
        C2349D c2349dS2 = s();
        K k7 = this.f17661H;
        if (c2349dS2 != null) {
            c2349dS2.y();
            c2349dS2.B();
            k7.f17761r.f17739u = 3;
            I i7 = k7.f17762s;
            if (i7 != null) {
                i7.f17712s = 3;
            }
        }
        C2350E c2350e2 = k7.f17761r.f17723D;
        c2350e2.f17687b = true;
        c2350e2.f17688c = false;
        c2350e2.f17690e = false;
        c2350e2.f17689d = false;
        c2350e2.f17691f = false;
        c2350e2.f17692g = false;
        c2350e2.f17693h = null;
        I i8 = k7.f17762s;
        if (i8 != null && (c2350e = i8.f17701A) != null) {
            c2350e.f17687b = true;
            c2350e.f17688c = false;
            c2350e.f17690e = false;
            c2350e.f17689d = false;
            c2350e.f17691f = false;
            c2350e.f17692g = false;
            c2350e.f17693h = null;
        }
        W0.c cVar = this.f17666O;
        if (cVar != null) {
            cVar.invoke(c2471u);
        }
        C0517t c0517t = this.f17660G;
        if (c0517t.f(8)) {
            C();
        }
        a0.p pVar = (m0) c0517t.f7175e;
        for (a0.p pVar2 = pVar; pVar2 != null; pVar2 = pVar2.f10406o) {
            if (pVar2.f10414w) {
                pVar2.D0();
            }
        }
        this.f17682v = true;
        Q.d dVar = (Q.d) this.f17675o.f13378l;
        int i9 = dVar.f7829m;
        if (i9 > 0) {
            Object[] objArr = dVar.f7827k;
            int i10 = 0;
            do {
                ((C2349D) objArr[i10]).i();
                i10++;
            } while (i10 < i9);
        }
        this.f17682v = false;
        while (pVar != null) {
            if (pVar.f10414w) {
                pVar.x0();
            }
            pVar = pVar.f10406o;
        }
        Q q6 = c2471u.f18868R;
        n5.P p7 = q6.f17784b;
        ((n5.P) p7.f13378l).n(this);
        ((n5.P) p7.f13379m).n(this);
        ((Q.d) q6.f17787e.f13378l).m(this);
        c2471u.J = true;
        this.f17679s = null;
        X(null);
        this.f17681u = 0;
        J j7 = k7.f17761r;
        j7.f17736r = Integer.MAX_VALUE;
        j7.f17735q = Integer.MAX_VALUE;
        j7.f17721B = false;
        I i11 = k7.f17762s;
        if (i11 != null) {
            i11.f17711r = Integer.MAX_VALUE;
            i11.f17710q = Integer.MAX_VALUE;
            i11.f17719z = false;
        }
    }

    public final void j(InterfaceC0995r interfaceC0995r, C1375b c1375b) {
        ((Y) this.f17660G.f7174d).H0(interfaceC0995r, c1375b);
    }

    public final void k() {
        if (this.f17673m != null) {
            R(this, false, 5);
        } else {
            T(this, false, 5);
        }
        J j7 = this.f17661H.f17761r;
        T0.a aVar = j7.f17737s ? new T0.a(j7.f16843n) : null;
        if (aVar != null) {
            C2471u c2471u = this.f17679s;
            if (c2471u != null) {
                c2471u.q(this, aVar.a);
                return;
            }
            return;
        }
        C2471u c2471u2 = this.f17679s;
        if (c2471u2 != null) {
            c2471u2.p(true);
        }
    }

    public final List l() {
        I i7 = this.f17661H.f17762s;
        kotlin.jvm.internal.l.c(i7);
        K k7 = i7.f17708H;
        k7.a.n();
        boolean z7 = i7.f17703C;
        Q.d dVar = i7.f17702B;
        if (!z7) {
            return dVar.f();
        }
        C2349D c2349d = k7.a;
        Q.d dVarV = c2349d.v();
        int i8 = dVarV.f7829m;
        if (i8 > 0) {
            Object[] objArr = dVarV.f7827k;
            int i9 = 0;
            do {
                C2349D c2349d2 = (C2349D) objArr[i9];
                if (dVar.f7829m <= i9) {
                    I i10 = c2349d2.f17661H.f17762s;
                    kotlin.jvm.internal.l.c(i10);
                    dVar.b(i10);
                } else {
                    I i11 = c2349d2.f17661H.f17762s;
                    kotlin.jvm.internal.l.c(i11);
                    Object[] objArr2 = dVar.f7827k;
                    Object obj = objArr2[i9];
                    objArr2[i9] = i11;
                }
                i9++;
            } while (i9 < i8);
        }
        dVar.o(((Q.a) c2349d.n()).f7821k.f7829m, dVar.f7829m);
        i7.f17703C = false;
        return dVar.f();
    }

    public final List m() {
        return this.f17661H.f17761r.n0();
    }

    public final List n() {
        return v().f();
    }

    public final F0.i o() {
        if (!E() || this.f17668Q) {
            return null;
        }
        if (!this.f17660G.f(8) || this.f17683w != null) {
            return this.f17683w;
        }
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.f12720k = new F0.i();
        g0 snapshotObserver = ((C2471u) AbstractC2352G.a(this)).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.f17855d, new A.m(13, this, xVar));
        F0.i iVar = (F0.i) xVar.f12720k;
        this.f17683w = iVar;
        return iVar;
    }

    public final List p() {
        return ((Q.d) this.f17675o.f13378l).f();
    }

    public final int q() {
        int i7;
        I i8 = this.f17661H.f17762s;
        if (i8 == null || (i7 = i8.f17712s) == 0) {
            return 3;
        }
        return i7;
    }

    public final n5.P r() {
        n5.P p7 = this.f17654A;
        if (p7 != null) {
            return p7;
        }
        n5.P p8 = new n5.P(this, this.f17686z);
        this.f17654A = p8;
        return p8;
    }

    public final C2349D s() {
        C2349D c2349d = this.f17678r;
        while (c2349d != null && c2349d.f17671k) {
            c2349d = c2349d.f17678r;
        }
        return c2349d;
    }

    public final int t() {
        return this.f17661H.f17761r.f17736r;
    }

    public final String toString() {
        return z0.O.B(this) + " children: " + ((Q.a) n()).f7821k.f7829m + " measurePolicy: " + this.f17686z;
    }

    public final Q.d u() {
        boolean z7 = this.f17685y;
        Q.d dVar = this.f17684x;
        if (z7) {
            dVar.g();
            dVar.c(dVar.f7829m, v());
            dVar.p(f17653V);
            this.f17685y = false;
        }
        return dVar;
    }

    public final Q.d v() {
        a0();
        if (this.f17674n == 0) {
            return (Q.d) this.f17675o.f13378l;
        }
        Q.d dVar = this.f17676p;
        kotlin.jvm.internal.l.c(dVar);
        return dVar;
    }

    public final void w(long j7, r rVar, boolean z7, boolean z8) {
        C0517t c0517t = this.f17660G;
        Y y7 = (Y) c0517t.f7174d;
        C0970O c0970o = Y.f17808O;
        ((Y) c0517t.f7174d).T0(Y.f17811R, y7.M0(j7), rVar, z7, z8);
    }

    public final void x(int i7, C2349D c2349d) {
        if (!(c2349d.f17678r == null)) {
            StringBuilder sb = new StringBuilder("Cannot insert ");
            sb.append(c2349d);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(h(0));
            sb.append(" Other tree: ");
            C2349D c2349d2 = c2349d.f17678r;
            sb.append(c2349d2 != null ? c2349d2.h(0) : null);
            AbstractC0905c.C(sb.toString());
            throw null;
        }
        if (c2349d.f17679s != null) {
            AbstractC0905c.C("Cannot insert " + c2349d + " because it already has an owner. This tree: " + h(0) + " Other tree: " + c2349d.h(0));
            throw null;
        }
        c2349d.f17678r = this;
        n5.P p7 = this.f17675o;
        ((Q.d) p7.f13378l).a(i7, c2349d);
        ((C1861b) p7.f13379m).invoke();
        K();
        if (c2349d.f17671k) {
            this.f17674n++;
        }
        D();
        C2471u c2471u = this.f17679s;
        if (c2471u != null) {
            c2349d.e(c2471u);
        }
        if (c2349d.f17661H.f17757n > 0) {
            K k7 = this.f17661H;
            k7.b(k7.f17757n + 1);
        }
    }

    public final void y() {
        if (this.f17662K) {
            C0517t c0517t = this.f17660G;
            Y y7 = (C2372t) c0517t.f7173c;
            Y y8 = ((Y) c0517t.f7174d).f17827x;
            this.J = null;
            while (true) {
                if (kotlin.jvm.internal.l.a(y7, y8)) {
                    break;
                }
                if ((y7 != null ? y7.f17824N : null) != null) {
                    this.J = y7;
                    break;
                }
                y7 = y7 != null ? y7.f17827x : null;
            }
        }
        Y y9 = this.J;
        if (y9 != null && y9.f17824N == null) {
            AbstractC0905c.D("layer was not set");
            throw null;
        }
        if (y9 != null) {
            y9.V0();
            return;
        }
        C2349D c2349dS = s();
        if (c2349dS != null) {
            c2349dS.y();
        }
    }

    @Override // y0.f0
    public final boolean z() {
        return E();
    }

    public C2349D(boolean z7, int i7) {
        this.f17671k = z7;
        this.f17672l = i7;
        this.f17675o = new n5.P(12, new Q.d(new C2349D[16]), new C1861b(6, this));
        this.f17684x = new Q.d(new C2349D[16]);
        this.f17685y = true;
        this.f17686z = f17651T;
        this.f17655B = AbstractC2352G.a;
        this.f17656C = T0.k.f8844k;
        this.f17657D = f17652U;
        InterfaceC0523w.f7241d.getClass();
        this.f17658E = C0521v.f7218b;
        this.f17669R = 3;
        this.f17670S = 3;
        this.f17660G = new C0517t(this);
        this.f17661H = new K(this);
        this.f17662K = true;
        this.f17663L = a0.n.a;
    }
}
