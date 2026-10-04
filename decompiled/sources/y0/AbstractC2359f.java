package y0;

import O.AbstractC0505m0;
import O.C0486d;
import O.C0517t;
import android.view.View;
import e4.InterfaceC0821a;
import f6.AbstractC0905c;
import java.util.ArrayList;
import p.AbstractC1755i;
import s0.C1967l;
import w0.C2196n;
import w0.InterfaceC2197o;
import z0.C2471u;

/* renamed from: y0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2359f {
    public static final C2357d a = new C2357d(0);

    public static final long a(float f5, boolean z7) {
        return ((z7 ? 1L : 0L) & 4294967295L) | (Float.floatToIntBits(f5) << 32);
    }

    public static final void b(Q.d dVar, a0.p pVar) {
        Q.d dVarV = v(pVar).v();
        int i7 = dVarV.f7829m;
        if (i7 > 0) {
            int i8 = i7 - 1;
            Object[] objArr = dVarV.f7827k;
            do {
                dVar.b((a0.p) ((C2349D) objArr[i8]).f17660G.f7176f);
                i8--;
            } while (i8 >= 0);
        }
    }

    public static final int c(N n7, C2196n c2196n) {
        N nU0 = n7.u0();
        if (nU0 == null) {
            AbstractC0905c.C("Child of " + n7 + " cannot be null when calculating alignment line");
            throw null;
        }
        if (n7.y0().m().containsKey(c2196n)) {
            Integer num = (Integer) n7.y0().m().get(c2196n);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iC0 = nU0.c0(c2196n);
            if (iC0 != Integer.MIN_VALUE) {
                nU0.f17771q = true;
                n7.f17772r = true;
                n7.C0();
                nU0.f17771q = false;
                n7.f17772r = false;
                return c2196n instanceof C2196n ? iC0 + ((int) (nU0.A0() & 4294967295L)) : iC0 + ((int) (nU0.A0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final boolean d(C2356c c2356c) {
        m0 m0Var = (m0) v(c2356c).f17660G.f7175e;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode", m0Var);
        return m0Var.f17878x;
    }

    public static final a0.p e(InterfaceC2366m interfaceC2366m, int i7) {
        a0.p pVar = ((a0.p) interfaceC2366m).f10402k.f10407p;
        if (pVar == null || (pVar.f10405n & i7) == 0) {
            return null;
        }
        while (pVar != null) {
            int i8 = pVar.f10404m;
            if ((i8 & 2) != 0) {
                return null;
            }
            if ((i8 & i7) != 0) {
                return pVar;
            }
            pVar = pVar.f10407p;
        }
        return null;
    }

    public static final a0.p f(Q.d dVar) {
        if (dVar == null || dVar.k()) {
            return null;
        }
        return (a0.p) dVar.n(dVar.f7829m - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC2375w g(a0.p pVar) {
        if ((pVar.f10404m & 2) != 0) {
            if (pVar instanceof InterfaceC2375w) {
                return (InterfaceC2375w) pVar;
            }
            if (pVar instanceof AbstractC2367n) {
                a0.p pVar2 = ((AbstractC2367n) pVar).f17880y;
                while (pVar2 != 0) {
                    if (pVar2 instanceof InterfaceC2375w) {
                        return (InterfaceC2375w) pVar2;
                    }
                    pVar2 = (!(pVar2 instanceof AbstractC2367n) || (pVar2.f10404m & 2) == 0) ? pVar2.f10407p : ((AbstractC2367n) pVar2).f17880y;
                }
            }
        }
        return null;
    }

    public static final int h(long j7, long j8) {
        boolean z7 = ((int) (j7 & 4294967295L)) != 0;
        return z7 != (((int) (4294967295L & j8)) != 0) ? z7 ? -1 : 1 : (int) Math.signum(Float.intBitsToFloat((int) (j7 >> 32)) - Float.intBitsToFloat((int) (j8 >> 32)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object i(InterfaceC2365l interfaceC2365l, AbstractC0505m0 abstractC0505m0) {
        if (!((a0.p) interfaceC2365l).f10402k.f10414w) {
            AbstractC0905c.C("Cannot read CompositionLocal because the Modifier node is not currently attached.");
            throw null;
        }
        W.d dVar = (W.d) v(interfaceC2365l).f17658E;
        dVar.getClass();
        return C0486d.L(dVar, abstractC0505m0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final o0 j(InterfaceC2366m interfaceC2366m, Object obj) {
        C0517t c0517t;
        a0.p pVar = ((a0.p) interfaceC2366m).f10402k;
        if (!pVar.f10414w) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        a0.p pVar2 = pVar.f10406o;
        C2349D c2349dV = v(interfaceC2366m);
        while (c2349dV != null) {
            if ((((a0.p) c2349dV.f17660G.f7176f).f10405n & 262144) != 0) {
                while (pVar2 != null) {
                    if ((pVar2.f10404m & 262144) != 0) {
                        AbstractC2367n abstractC2367nF = pVar2;
                        ?? dVar = 0;
                        while (abstractC2367nF != 0) {
                            if (abstractC2367nF instanceof o0) {
                                o0 o0Var = (o0) abstractC2367nF;
                                if (obj.equals(o0Var.p())) {
                                    return o0Var;
                                }
                            } else if ((abstractC2367nF.f10404m & 262144) != 0 && (abstractC2367nF instanceof AbstractC2367n)) {
                                a0.p pVar3 = abstractC2367nF.f17880y;
                                int i7 = 0;
                                abstractC2367nF = abstractC2367nF;
                                dVar = dVar;
                                while (pVar3 != null) {
                                    if ((pVar3.f10404m & 262144) != 0) {
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
                                    abstractC2367nF = abstractC2367nF;
                                    dVar = dVar;
                                }
                                if (i7 == 1) {
                                }
                            }
                            abstractC2367nF = f(dVar);
                        }
                    }
                    pVar2 = pVar2.f10406o;
                }
            }
            c2349dV = c2349dV.s();
            pVar2 = (c2349dV == null || (c0517t = c2349dV.f17660G) == null) ? null : (m0) c0517t.f7175e;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, y0.m, y0.o0] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [a0.p] */
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
    public static final o0 k(o0 o0Var) {
        C0517t c0517t;
        a0.p pVar = ((a0.p) o0Var).f10402k;
        if (!pVar.f10414w) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        a0.p pVar2 = pVar.f10406o;
        C2349D c2349dV = v(o0Var);
        while (c2349dV != null) {
            if ((((a0.p) c2349dV.f17660G.f7176f).f10405n & 262144) != 0) {
                while (pVar2 != null) {
                    if ((pVar2.f10404m & 262144) != 0) {
                        AbstractC2367n abstractC2367nF = pVar2;
                        ?? dVar = 0;
                        while (abstractC2367nF != 0) {
                            if (abstractC2367nF instanceof o0) {
                                o0 o0Var2 = (o0) abstractC2367nF;
                                if (kotlin.jvm.internal.l.a(o0Var.p(), o0Var2.p()) && o0Var.getClass() == o0Var2.getClass()) {
                                    return o0Var2;
                                }
                            } else if ((abstractC2367nF.f10404m & 262144) != 0 && (abstractC2367nF instanceof AbstractC2367n)) {
                                a0.p pVar3 = abstractC2367nF.f17880y;
                                int i7 = 0;
                                abstractC2367nF = abstractC2367nF;
                                dVar = dVar;
                                while (pVar3 != null) {
                                    if ((pVar3.f10404m & 262144) != 0) {
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
                                    abstractC2367nF = abstractC2367nF;
                                    dVar = dVar;
                                }
                                if (i7 == 1) {
                                }
                            }
                            abstractC2367nF = f(dVar);
                        }
                    }
                    pVar2 = pVar2.f10406o;
                }
            }
            c2349dV = c2349dV.s();
            pVar2 = (c2349dV == null || (c0517t = c2349dV.f17660G) == null) ? null : (m0) c0517t.f7175e;
        }
        return null;
    }

    public static final ArrayList l(InterfaceC2197o interfaceC2197o) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode", interfaceC2197o);
        C2349D c2349dX0 = ((N) interfaceC2197o).x0();
        boolean zQ = q(c2349dX0);
        Q.a aVar = (Q.a) c2349dX0.p();
        Q.d dVar = aVar.f7821k;
        ArrayList arrayList = new ArrayList(dVar.f7829m);
        int i7 = dVar.f7829m;
        for (int i8 = 0; i8 < i7; i8++) {
            C2349D c2349d = (C2349D) aVar.get(i8);
            arrayList.add(zQ ? c2349d.l() : c2349d.m());
        }
        return arrayList;
    }

    public static final int m(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(InterfaceC2368o interfaceC2368o) {
        if (((a0.p) interfaceC2368o).f10402k.f10414w) {
            t(interfaceC2368o, 1).V0();
        }
    }

    public static final void o(InterfaceC2375w interfaceC2375w) {
        v(interfaceC2375w).B();
    }

    public static final void p(l0 l0Var) {
        v(l0Var).C();
    }

    public static final boolean q(C2349D c2349d) {
        int iB = AbstractC1755i.b(c2349d.f17661H.f17746c);
        if (iB == 0) {
            return false;
        }
        if (iB != 1) {
            if (iB == 2) {
                return false;
            }
            if (iB != 3) {
                if (iB != 4) {
                    throw new D6.r();
                }
                C2349D c2349dS = c2349d.s();
                if (c2349dS != null) {
                    return q(c2349dS);
                }
                throw new IllegalArgumentException("no parent for idle node");
            }
        }
        return true;
    }

    public static final boolean r(C2349D c2349d) {
        if (c2349d.f17673m == null) {
            return false;
        }
        C2349D c2349dS = c2349d.s();
        return (c2349dS != null ? c2349dS.f17673m : null) == null || c2349d.f17661H.f17745b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void s(a0.p pVar, InterfaceC0821a interfaceC0821a) {
        b0 b0Var = pVar.f10408q;
        if (b0Var == null) {
            b0Var = new b0((a0) pVar);
            pVar.f10408q = b0Var;
        }
        ((C2471u) w(pVar)).getSnapshotObserver().a(b0Var, C2358e.f17843q, interfaceC0821a);
    }

    public static final Y t(InterfaceC2366m interfaceC2366m, int i7) {
        Y y7 = ((a0.p) interfaceC2366m).f10402k.f10409r;
        kotlin.jvm.internal.l.c(y7);
        if (y7.P0() != interfaceC2366m || !Z.h(i7)) {
            return y7;
        }
        Y y8 = y7.f17826w;
        kotlin.jvm.internal.l.c(y8);
        return y8;
    }

    public static final Y u(InterfaceC2366m interfaceC2366m) {
        if (!((a0.p) interfaceC2366m).f10402k.f10414w) {
            AbstractC0905c.C("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
            throw null;
        }
        Y yT = t(interfaceC2366m, 2);
        if (yT.P0().f10414w) {
            return yT;
        }
        AbstractC0905c.C("LayoutCoordinates is not attached.");
        throw null;
    }

    public static final C2349D v(InterfaceC2366m interfaceC2366m) {
        Y y7 = ((a0.p) interfaceC2366m).f10402k.f10409r;
        if (y7 != null) {
            return y7.f17825v;
        }
        AbstractC0905c.D("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw null;
    }

    public static final e0 w(InterfaceC2366m interfaceC2366m) {
        C2471u c2471u = v(interfaceC2366m).f17679s;
        if (c2471u != null) {
            return c2471u;
        }
        AbstractC0905c.D("This node does not have an owner.");
        throw null;
    }

    public static final View x(InterfaceC2366m interfaceC2366m) {
        if (((a0.p) interfaceC2366m).f10402k.f10414w) {
            return (View) AbstractC2352G.a(v(interfaceC2366m));
        }
        AbstractC0905c.C("Cannot get View because the Modifier node is not currently attached.");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [e4.k] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void y(C1967l c1967l, e4.k kVar) {
        C0517t c0517t;
        a0.p pVar = c1967l.f10402k;
        if (!pVar.f10414w) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        a0.p pVar2 = pVar.f10406o;
        C2349D c2349dV = v(c1967l);
        while (c2349dV != null) {
            if ((((a0.p) c2349dV.f17660G.f7176f).f10405n & 262144) != 0) {
                while (pVar2 != null) {
                    if ((pVar2.f10404m & 262144) != 0) {
                        AbstractC2367n abstractC2367nF = pVar2;
                        ?? dVar = 0;
                        while (abstractC2367nF != 0) {
                            boolean zBooleanValue = true;
                            if (abstractC2367nF instanceof o0) {
                                o0 o0Var = (o0) abstractC2367nF;
                                if ("androidx.compose.ui.input.pointer.PointerHoverIcon".equals(o0Var.p()) && C1967l.class == o0Var.getClass()) {
                                    zBooleanValue = ((Boolean) kVar.invoke(o0Var)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((abstractC2367nF.f10404m & 262144) != 0) && (abstractC2367nF instanceof AbstractC2367n)) {
                                    a0.p pVar3 = abstractC2367nF.f17880y;
                                    int i7 = 0;
                                    abstractC2367nF = abstractC2367nF;
                                    dVar = dVar;
                                    while (pVar3 != null) {
                                        if ((pVar3.f10404m & 262144) != 0) {
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
                                        abstractC2367nF = abstractC2367nF;
                                        dVar = dVar;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                            }
                            abstractC2367nF = f(dVar);
                        }
                    }
                    pVar2 = pVar2.f10406o;
                }
            }
            c2349dV = c2349dV.s();
            pVar2 = (c2349dV == null || (c0517t = c2349dV.f17660G) == null) ? null : (m0) c0517t.f7175e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, y0.o0] */
    /* JADX WARN: Type inference failed for: r13v0, types: [e4.k] */
    /* JADX WARN: Type inference failed for: r7v10, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void z(o0 o0Var, e4.k kVar) {
        a0.p pVar = ((a0.p) o0Var).f10402k;
        if (!pVar.f10414w) {
            AbstractC0905c.C("visitSubtreeIf called on an unattached node");
            throw null;
        }
        Q.d dVar = new Q.d(new a0.p[16]);
        a0.p pVar2 = pVar.f10407p;
        if (pVar2 == null) {
            b(dVar, pVar);
        } else {
            dVar.b(pVar2);
        }
        while (dVar.l()) {
            a0.p pVar3 = (a0.p) dVar.n(dVar.f7829m - 1);
            if ((pVar3.f10405n & 262144) != 0) {
                for (a0.p pVar4 = pVar3; pVar4 != null; pVar4 = pVar4.f10407p) {
                    if ((pVar4.f10404m & 262144) != 0) {
                        ?? dVar2 = 0;
                        AbstractC2367n abstractC2367nF = pVar4;
                        while (abstractC2367nF != 0) {
                            if (abstractC2367nF instanceof o0) {
                                o0 o0Var2 = (o0) abstractC2367nF;
                                n0 n0Var = (kotlin.jvm.internal.l.a(o0Var.p(), o0Var2.p()) && o0Var.getClass() == o0Var2.getClass()) ? (n0) kVar.invoke(o0Var2) : n0.f17881k;
                                if (n0Var == n0.f17883m) {
                                    return;
                                }
                                if (n0Var == n0.f17882l) {
                                    break;
                                }
                            } else if ((abstractC2367nF.f10404m & 262144) != 0 && (abstractC2367nF instanceof AbstractC2367n)) {
                                a0.p pVar5 = abstractC2367nF.f17880y;
                                int i7 = 0;
                                abstractC2367nF = abstractC2367nF;
                                dVar2 = dVar2;
                                while (pVar5 != null) {
                                    if ((pVar5.f10404m & 262144) != 0) {
                                        i7++;
                                        dVar2 = dVar2;
                                        if (i7 == 1) {
                                            abstractC2367nF = pVar5;
                                        } else {
                                            if (dVar2 == 0) {
                                                dVar2 = new Q.d(new a0.p[16]);
                                            }
                                            if (abstractC2367nF != 0) {
                                                dVar2.b(abstractC2367nF);
                                                abstractC2367nF = 0;
                                            }
                                            dVar2.b(pVar5);
                                        }
                                    }
                                    pVar5 = pVar5.f10407p;
                                    abstractC2367nF = abstractC2367nF;
                                    dVar2 = dVar2;
                                }
                                if (i7 == 1) {
                                }
                            }
                            abstractC2367nF = f(dVar2);
                        }
                    }
                }
            }
            b(dVar, pVar3);
        }
    }
}
