package f0;

import H.N;
import O.C0517t;
import f6.AbstractC0905c;
import kotlin.jvm.internal.x;
import m.C1504y;
import x0.InterfaceC2245e;
import y0.AbstractC2359f;
import y0.AbstractC2367n;
import y0.C2349D;
import y0.InterfaceC2365l;
import y0.Y;
import y0.a0;
import y0.m0;
import z0.C2471u;

/* renamed from: f0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0866s extends a0.p implements InterfaceC2365l, a0, InterfaceC2245e {

    /* renamed from: x, reason: collision with root package name */
    public boolean f11424x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11425y;

    /* renamed from: z, reason: collision with root package name */
    public EnumC0865r f11426z;

    public static final boolean I0(C0866s c0866s) {
        a0.p pVar = c0866s.f10402k;
        if (!pVar.f10414w) {
            AbstractC0905c.C("visitSubtreeIf called on an unattached node");
            throw null;
        }
        Q.d dVar = new Q.d(new a0.p[16]);
        a0.p pVar2 = pVar.f10407p;
        if (pVar2 == null) {
            AbstractC2359f.b(dVar, pVar);
        } else {
            dVar.b(pVar2);
        }
        while (true) {
            if (!dVar.l()) {
                break;
            }
            a0.p pVar3 = (a0.p) dVar.n(dVar.f7829m - 1);
            if ((pVar3.f10405n & 1024) != 0) {
                for (a0.p pVar4 = pVar3; pVar4 != null; pVar4 = pVar4.f10407p) {
                    if ((pVar4.f10404m & 1024) != 0) {
                        Q.d dVar2 = null;
                        a0.p pVarF = pVar4;
                        while (pVarF != null) {
                            if (pVarF instanceof C0866s) {
                                C0866s c0866s2 = (C0866s) pVarF;
                                if (c0866s2.f11426z != null) {
                                    int iOrdinal = c0866s2.H0().ordinal();
                                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                        return true;
                                    }
                                    if (iOrdinal != 3) {
                                        throw new D6.r();
                                    }
                                }
                            } else if ((pVarF.f10404m & 1024) != 0 && (pVarF instanceof AbstractC2367n)) {
                                int i7 = 0;
                                for (a0.p pVar5 = ((AbstractC2367n) pVarF).f17880y; pVar5 != null; pVar5 = pVar5.f10407p) {
                                    if ((pVar5.f10404m & 1024) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            pVarF = pVar5;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new Q.d(new a0.p[16]);
                                            }
                                            if (pVarF != null) {
                                                dVar2.b(pVarF);
                                                pVarF = null;
                                            }
                                            dVar2.b(pVar5);
                                        }
                                    }
                                }
                                if (i7 == 1) {
                                }
                            }
                            pVarF = AbstractC2359f.f(dVar2);
                        }
                    }
                }
            }
            AbstractC2359f.b(dVar, pVar3);
        }
        return false;
    }

    public static final boolean J0(C0866s c0866s) {
        C0517t c0517t;
        a0.p pVar = c0866s.f10402k;
        if (!pVar.f10414w) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        a0.p pVar2 = pVar.f10406o;
        C2349D c2349dV = AbstractC2359f.v(c0866s);
        while (true) {
            if (c2349dV == null) {
                break;
            }
            if ((((a0.p) c2349dV.f17660G.f7176f).f10405n & 1024) != 0) {
                while (pVar2 != null) {
                    if ((pVar2.f10404m & 1024) != 0) {
                        a0.p pVarF = pVar2;
                        Q.d dVar = null;
                        while (pVarF != null) {
                            if (pVarF instanceof C0866s) {
                                C0866s c0866s2 = (C0866s) pVarF;
                                if (c0866s2.f11426z != null) {
                                    int iOrdinal = c0866s2.H0().ordinal();
                                    if (iOrdinal != 0) {
                                        if (iOrdinal == 1) {
                                            return true;
                                        }
                                        if (iOrdinal != 2 && iOrdinal != 3) {
                                            throw new D6.r();
                                        }
                                    }
                                }
                            } else if ((pVarF.f10404m & 1024) != 0 && (pVarF instanceof AbstractC2367n)) {
                                int i7 = 0;
                                for (a0.p pVar3 = ((AbstractC2367n) pVarF).f17880y; pVar3 != null; pVar3 = pVar3.f10407p) {
                                    if ((pVar3.f10404m & 1024) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            pVarF = pVar3;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new Q.d(new a0.p[16]);
                                            }
                                            if (pVarF != null) {
                                                dVar.b(pVarF);
                                                pVarF = null;
                                            }
                                            dVar.b(pVar3);
                                        }
                                    }
                                }
                                if (i7 == 1) {
                                }
                            }
                            pVarF = AbstractC2359f.f(dVar);
                        }
                    }
                    pVar2 = pVar2.f10406o;
                }
            }
            c2349dV = c2349dV.s();
            pVar2 = (c2349dV == null || (c0517t = c2349dV.f17660G) == null) ? null : (m0) c0517t.f7175e;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [Q.d] */
    public final C0858k G0() {
        C0517t c0517t;
        C0858k c0858k = new C0858k();
        c0858k.a = true;
        C0862o c0862o = C0862o.f11417b;
        c0858k.f11406b = c0862o;
        c0858k.f11407c = c0862o;
        c0858k.f11408d = c0862o;
        c0858k.f11409e = c0862o;
        c0858k.f11410f = c0862o;
        c0858k.f11411g = c0862o;
        c0858k.f11412h = c0862o;
        c0858k.f11413i = c0862o;
        c0858k.f11414j = C0855h.f11399n;
        c0858k.f11415k = C0855h.f11400o;
        a0.p pVar = this.f10402k;
        if (!pVar.f10414w) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        C2349D c2349dV = AbstractC2359f.v(this);
        a0.p pVar2 = pVar;
        loop0: while (c2349dV != null) {
            if ((((a0.p) c2349dV.f17660G.f7176f).f10405n & 3072) != 0) {
                while (pVar2 != null) {
                    int i7 = pVar2.f10404m;
                    if ((i7 & 3072) != 0) {
                        if (pVar2 != pVar && (i7 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i7 & 2048) != 0) {
                            AbstractC2367n abstractC2367nF = pVar2;
                            ?? dVar = 0;
                            while (abstractC2367nF != 0) {
                                if (abstractC2367nF instanceof InterfaceC0860m) {
                                    ((InterfaceC0860m) abstractC2367nF).Q(c0858k);
                                } else if ((abstractC2367nF.f10404m & 2048) != 0 && (abstractC2367nF instanceof AbstractC2367n)) {
                                    a0.p pVar3 = abstractC2367nF.f17880y;
                                    int i8 = 0;
                                    abstractC2367nF = abstractC2367nF;
                                    dVar = dVar;
                                    while (pVar3 != null) {
                                        if ((pVar3.f10404m & 2048) != 0) {
                                            i8++;
                                            dVar = dVar;
                                            if (i8 == 1) {
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
                                        abstractC2367nF = abstractC2367nF;
                                        dVar = dVar;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                abstractC2367nF = AbstractC2359f.f(dVar);
                            }
                        }
                    }
                    pVar2 = pVar2.f10406o;
                }
            }
            c2349dV = c2349dV.s();
            pVar2 = (c2349dV == null || (c0517t = c2349dV.f17660G) == null) ? null : (m0) c0517t.f7175e;
        }
        return c0858k;
    }

    public final EnumC0865r H0() {
        EnumC0865r enumC0865r;
        C2349D c2349d;
        C2471u c2471u;
        InterfaceC0854g focusOwner;
        Y y7 = this.f10402k.f10409r;
        N n7 = (y7 == null || (c2349d = y7.f17825v) == null || (c2471u = c2349d.f17679s) == null || (focusOwner = c2471u.getFocusOwner()) == null) ? null : ((androidx.compose.ui.focus.b) focusOwner).f10656h;
        if (n7 != null && (enumC0865r = (EnumC0865r) ((C1504y) n7.f2901c).e(this)) != null) {
            return enumC0865r;
        }
        EnumC0865r enumC0865r2 = this.f11426z;
        return enumC0865r2 == null ? EnumC0865r.f11422m : enumC0865r2;
    }

    @Override // y0.a0
    public final void K() {
        EnumC0865r enumC0865rH0 = H0();
        K0();
        if (enumC0865rH0 != H0()) {
            AbstractC0851d.A(this);
        }
    }

    public final void K0() {
        EnumC0865r enumC0865r = this.f11426z;
        if (enumC0865r == null) {
            if (enumC0865r != null) {
                throw new IllegalStateException("Re-initializing focus target node.");
            }
            N nE = AbstractC0851d.E(this);
            try {
                if (nE.f2900b) {
                    N.b(nE);
                }
                nE.f2900b = true;
                L0((J0(this) && I0(this)) ? EnumC0865r.f11421l : EnumC0865r.f11422m);
                N.c(nE);
            } catch (Throwable th) {
                N.c(nE);
                throw th;
            }
        }
        int iOrdinal = H0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 2) {
            x xVar = new x();
            AbstractC2359f.s(this, new A.m(9, xVar, this));
            Object obj = xVar.f12720k;
            if (obj == null) {
                kotlin.jvm.internal.l.l("focusProperties");
                throw null;
            }
            if (((InterfaceC0857j) obj).a()) {
                return;
            }
            ((androidx.compose.ui.focus.b) ((C2471u) AbstractC2359f.w(this)).getFocusOwner()).a(8, true, true);
        }
    }

    public final void L0(EnumC0865r enumC0865r) {
        ((C1504y) AbstractC0851d.E(this).f2901c).i(this, enumC0865r);
    }

    @Override // a0.p
    public final boolean v0() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    @Override // a0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z0() {
        /*
            r4 = this;
            f0.r r0 = r4.H0()
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 == r1) goto L11
            r2 = 2
            if (r0 == r2) goto L2e
            goto L43
        L11:
            H.N r0 = f0.AbstractC0851d.E(r4)
            boolean r2 = r0.f2900b     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1f
            H.N.b(r0)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r1 = move-exception
            goto L2a
        L1f:
            r0.f2900b = r1     // Catch: java.lang.Throwable -> L1d
            f0.r r1 = f0.EnumC0865r.f11422m     // Catch: java.lang.Throwable -> L1d
            r4.L0(r1)     // Catch: java.lang.Throwable -> L1d
            H.N.c(r0)
            goto L43
        L2a:
            H.N.c(r0)
            throw r1
        L2e:
            y0.e0 r0 = y0.AbstractC2359f.w(r4)
            z0.u r0 = (z0.C2471u) r0
            f0.g r0 = r0.getFocusOwner()
            androidx.compose.ui.focus.b r0 = (androidx.compose.ui.focus.b) r0
            r2 = 0
            r3 = 8
            r0.a(r3, r1, r2)
            f0.AbstractC0851d.q(r4)
        L43:
            r0 = 0
            r4.f11426z = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0866s.z0():void");
    }
}
