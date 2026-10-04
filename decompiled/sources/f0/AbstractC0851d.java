package f0;

import D.C0056i;
import H.N;
import O.C0517t;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import p.AbstractC1755i;
import w0.X;
import y0.AbstractC2359f;
import y0.AbstractC2367n;
import y0.C2349D;
import y0.Y;
import y0.m0;
import z0.C2471u;

/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0851d {
    public static final int[] a = new int[2];

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
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [Q.d] */
    public static final void A(C0866s c0866s) {
        C0517t c0517t;
        a0.p pVar = c0866s.f10402k;
        if (!pVar.f10414w) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        C2349D c2349dV = AbstractC2359f.v(c0866s);
        a0.p pVar2 = pVar;
        while (c2349dV != null) {
            if ((((a0.p) c2349dV.f17660G.f7176f).f10405n & 5120) != 0) {
                while (pVar2 != null) {
                    int i7 = pVar2.f10404m;
                    if ((i7 & 5120) != 0) {
                        if (pVar2 != pVar && (i7 & 1024) != 0) {
                            return;
                        }
                        if ((i7 & 4096) != 0) {
                            AbstractC2367n abstractC2367nF = pVar2;
                            ?? dVar = 0;
                            while (abstractC2367nF != 0) {
                                if (abstractC2367nF instanceof InterfaceC0850c) {
                                    InterfaceC0850c interfaceC0850c = (InterfaceC0850c) abstractC2367nF;
                                    interfaceC0850c.B(o(interfaceC0850c));
                                } else if ((abstractC2367nF.f10404m & 4096) != 0 && (abstractC2367nF instanceof AbstractC2367n)) {
                                    a0.p pVar3 = abstractC2367nF.f17880y;
                                    int i8 = 0;
                                    abstractC2367nF = abstractC2367nF;
                                    dVar = dVar;
                                    while (pVar3 != null) {
                                        if ((pVar3.f10404m & 4096) != 0) {
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
    }

    public static final Boolean B(C0866s c0866s, int i7) {
        Boolean boolValueOf;
        N nE = E(c0866s);
        C0867t c0867t = new C0867t(c0866s, 1);
        try {
            if (nE.f2900b) {
                N.b(nE);
            }
            nE.f2900b = true;
            ((Q.d) nE.f2902d).b(c0867t);
            int iB = AbstractC1755i.b(w(c0866s, i7));
            if (iB == 0) {
                boolValueOf = Boolean.valueOf(x(c0866s));
            } else if (iB == 1) {
                boolValueOf = null;
            } else if (iB == 2) {
                boolValueOf = Boolean.TRUE;
            } else {
                if (iB != 3) {
                    throw new D6.r();
                }
                boolValueOf = null;
            }
            return boolValueOf;
        } finally {
            N.c(nE);
        }
    }

    public static final boolean C(C0866s c0866s, C0866s c0866s2) {
        a0.p pVarF;
        a0.p pVarF2;
        C0517t c0517t;
        C0517t c0517t2;
        a0.p pVar = c0866s2.f10402k;
        if (!pVar.f10414w) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        a0.p pVar2 = pVar.f10406o;
        C2349D c2349dV = AbstractC2359f.v(c0866s2);
        loop0: while (true) {
            if (c2349dV == null) {
                pVarF = null;
                break;
            }
            if ((((a0.p) c2349dV.f17660G.f7176f).f10405n & 1024) != 0) {
                while (pVar2 != null) {
                    if ((pVar2.f10404m & 1024) != 0) {
                        pVarF = pVar2;
                        Q.d dVar = null;
                        while (pVarF != null) {
                            if (pVarF instanceof C0866s) {
                                break loop0;
                            }
                            if ((pVarF.f10404m & 1024) != 0 && (pVarF instanceof AbstractC2367n)) {
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
            pVar2 = (c2349dV == null || (c0517t2 = c2349dV.f17660G) == null) ? null : (m0) c0517t2.f7175e;
        }
        if (!kotlin.jvm.internal.l.a(pVarF, c0866s)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int iOrdinal = c0866s.H0().ordinal();
        EnumC0865r enumC0865r = EnumC0865r.f11421l;
        if (iOrdinal == 0) {
            p(c0866s2);
            c0866s.L0(enumC0865r);
            return true;
        }
        if (iOrdinal == 1) {
            if (n(c0866s) == null) {
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            C0866s c0866sN = n(c0866s);
            if (c0866sN != null ? e(c0866sN, false) : true) {
                p(c0866s2);
                return true;
            }
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new D6.r();
            }
            a0.p pVar4 = c0866s.f10402k;
            if (!pVar4.f10414w) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            a0.p pVar5 = pVar4.f10406o;
            C2349D c2349dV2 = AbstractC2359f.v(c0866s);
            loop4: while (true) {
                if (c2349dV2 == null) {
                    pVarF2 = null;
                    break;
                }
                if ((((a0.p) c2349dV2.f17660G.f7176f).f10405n & 1024) != 0) {
                    while (pVar5 != null) {
                        if ((pVar5.f10404m & 1024) != 0) {
                            pVarF2 = pVar5;
                            Q.d dVar2 = null;
                            while (pVarF2 != null) {
                                if (pVarF2 instanceof C0866s) {
                                    break loop4;
                                }
                                if ((pVarF2.f10404m & 1024) != 0 && (pVarF2 instanceof AbstractC2367n)) {
                                    int i8 = 0;
                                    for (a0.p pVar6 = ((AbstractC2367n) pVarF2).f17880y; pVar6 != null; pVar6 = pVar6.f10407p) {
                                        if ((pVar6.f10404m & 1024) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                pVarF2 = pVar6;
                                            } else {
                                                if (dVar2 == null) {
                                                    dVar2 = new Q.d(new a0.p[16]);
                                                }
                                                if (pVarF2 != null) {
                                                    dVar2.b(pVarF2);
                                                    pVarF2 = null;
                                                }
                                                dVar2.b(pVar6);
                                            }
                                        }
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                pVarF2 = AbstractC2359f.f(dVar2);
                            }
                        }
                        pVar5 = pVar5.f10406o;
                    }
                }
                c2349dV2 = c2349dV2.s();
                pVar5 = (c2349dV2 == null || (c0517t = c2349dV2.f17660G) == null) ? null : (m0) c0517t.f7175e;
            }
            C0866s c0866s3 = (C0866s) pVarF2;
            if (c0866s3 == null && ((Boolean) ((androidx.compose.ui.focus.b) ((C2471u) AbstractC2359f.w(c0866s)).getFocusOwner()).a.invoke(null, null)).booleanValue()) {
                p(c0866s2);
                c0866s.L0(enumC0865r);
                return true;
            }
            if (c0866s3 != null && C(c0866s3, c0866s)) {
                boolean zC = C(c0866s, c0866s2);
                if (c0866s.H0() != enumC0865r) {
                    throw new IllegalStateException("Deactivated node is focused");
                }
                if (zC) {
                    A(c0866s3);
                }
                return zC;
            }
        }
        return false;
    }

    public static final boolean D(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof C2471u) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final N E(C0866s c0866s) {
        return ((androidx.compose.ui.focus.b) ((C2471u) AbstractC2359f.w(c0866s)).getFocusOwner()).f10656h;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6 A[PHI: r0
      0x00a6: PHI (r0v16 int) = (r0v4 int), (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int) binds: [B:53:0x00a4, B:56:0x00a9, B:59:0x00ad, B:62:0x00b1, B:65:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(f0.C0866s r9, int r10, e4.k r11) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.AbstractC0851d.F(f0.s, int, e4.k):java.lang.Object");
    }

    public static final boolean G(int i7, C0056i c0056i, C0866s c0866s, g0.d dVar) {
        C0866s c0866sH;
        Q.d dVar2 = new Q.d(new C0866s[16]);
        a0.p pVar = c0866s.f10402k;
        if (!pVar.f10414w) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        Q.d dVar3 = new Q.d(new a0.p[16]);
        a0.p pVar2 = pVar.f10407p;
        if (pVar2 == null) {
            AbstractC2359f.b(dVar3, pVar);
        } else {
            dVar3.b(pVar2);
        }
        while (dVar3.l()) {
            a0.p pVarF = (a0.p) dVar3.n(dVar3.f7829m - 1);
            if ((pVarF.f10405n & 1024) == 0) {
                AbstractC2359f.b(dVar3, pVarF);
            } else {
                while (true) {
                    if (pVarF == null) {
                        break;
                    }
                    if ((pVarF.f10404m & 1024) != 0) {
                        Q.d dVar4 = null;
                        while (pVarF != null) {
                            if (pVarF instanceof C0866s) {
                                C0866s c0866s2 = (C0866s) pVarF;
                                if (c0866s2.f10414w) {
                                    dVar2.b(c0866s2);
                                }
                            } else if ((pVarF.f10404m & 1024) != 0 && (pVarF instanceof AbstractC2367n)) {
                                int i8 = 0;
                                for (a0.p pVar3 = ((AbstractC2367n) pVarF).f17880y; pVar3 != null; pVar3 = pVar3.f10407p) {
                                    if ((pVar3.f10404m & 1024) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            pVarF = pVar3;
                                        } else {
                                            if (dVar4 == null) {
                                                dVar4 = new Q.d(new a0.p[16]);
                                            }
                                            if (pVarF != null) {
                                                dVar4.b(pVarF);
                                                pVarF = null;
                                            }
                                            dVar4.b(pVar3);
                                        }
                                    }
                                }
                                if (i8 == 1) {
                                }
                            }
                            pVarF = AbstractC2359f.f(dVar4);
                        }
                    } else {
                        pVarF = pVarF.f10407p;
                    }
                }
            }
        }
        while (dVar2.l() && (c0866sH = h(dVar2, dVar, i7)) != null) {
            if (c0866sH.G0().a) {
                return ((Boolean) c0056i.invoke(c0866sH)).booleanValue();
            }
            if (l(i7, c0056i, c0866sH, dVar)) {
                return true;
            }
            dVar2.m(c0866sH);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0109, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean H(f0.C0866s r16, f0.C0866s r17, int r18, D.C0056i r19) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.AbstractC0851d.H(f0.s, f0.s, int, D.i):boolean");
    }

    public static final Integer I(int i7) {
        if (i7 == 5) {
            return 33;
        }
        if (i7 == 6) {
            return 130;
        }
        if (i7 == 3) {
            return 17;
        }
        if (i7 == 4) {
            return 66;
        }
        if (i7 == 1) {
            return 2;
        }
        return i7 == 2 ? 1 : null;
    }

    public static final C0849b J(int i7) {
        if (i7 == 1) {
            return new C0849b(2);
        }
        if (i7 == 2) {
            return new C0849b(1);
        }
        if (i7 == 17) {
            return new C0849b(3);
        }
        if (i7 == 33) {
            return new C0849b(5);
        }
        if (i7 == 66) {
            return new C0849b(4);
        }
        if (i7 != 130) {
            return null;
        }
        return new C0849b(6);
    }

    public static final Boolean K(int i7, C0056i c0056i, C0866s c0866s, g0.d dVar) {
        int iOrdinal = c0866s.H0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C0866s c0866sN = n(c0866s);
                if (c0866sN == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = c0866sN.H0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolK = K(i7, c0056i, c0866sN, dVar);
                        if (!kotlin.jvm.internal.l.a(boolK, Boolean.FALSE)) {
                            return boolK;
                        }
                        if (dVar == null) {
                            if (c0866sN.H0() != EnumC0865r.f11421l) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            C0866s c0866sG = g(c0866sN);
                            if (c0866sG == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            dVar = j(c0866sG);
                        }
                        return Boolean.valueOf(l(i7, c0056i, c0866s, dVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new D6.r();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (dVar == null) {
                    dVar = j(c0866sN);
                }
                return Boolean.valueOf(l(i7, c0056i, c0866s, dVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return c0866s.G0().a ? (Boolean) c0056i.invoke(c0866s) : dVar == null ? Boolean.valueOf(i(c0866s, i7, c0056i)) : Boolean.valueOf(G(i7, c0056i, c0866s, dVar));
                }
                throw new D6.r();
            }
        }
        return Boolean.valueOf(i(c0866s, i7, c0056i));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(f0.C0866s r7, D.C0056i r8) {
        /*
            f0.r r0 = r7.H0()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L89
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L37
            if (r0 == r3) goto L89
            if (r0 != r1) goto L31
            boolean r0 = y(r7, r8)
            if (r0 != 0) goto L7d
            f0.k r0 = r7.G0()
            boolean r0 = r0.a
            if (r0 == 0) goto L2d
            java.lang.Object r7 = r8.invoke(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L2e
        L2d:
            r7 = r2
        L2e:
            if (r7 == 0) goto L7c
            goto L7d
        L31:
            D6.r r7 = new D6.r
            r7.<init>()
            throw r7
        L37:
            f0.s r0 = n(r7)
            java.lang.String r5 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L83
            f0.r r6 = r0.H0()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L7e
            if (r6 == r4) goto L5b
            if (r6 == r3) goto L7e
            if (r6 == r1) goto L55
            D6.r r7 = new D6.r
            r7.<init>()
            throw r7
        L55:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L5b:
            boolean r1 = a(r0, r8)
            if (r1 != 0) goto L7d
            boolean r7 = m(r7, r0, r3, r8)
            if (r7 != 0) goto L7d
            f0.k r7 = r0.G0()
            boolean r7 = r7.a
            if (r7 == 0) goto L7c
            java.lang.Object r7 = r8.invoke(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7c
            goto L7d
        L7c:
            return r2
        L7d:
            return r4
        L7e:
            boolean r7 = m(r7, r0, r3, r8)
            return r7
        L83:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L89:
            boolean r7 = y(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.AbstractC0851d.a(f0.s, D.i):boolean");
    }

    public static final boolean b(g0.d dVar, g0.d dVar2, g0.d dVar3, int i7) {
        float f5;
        float f7;
        if (c(i7, dVar3, dVar) || !c(i7, dVar2, dVar)) {
            return false;
        }
        float f8 = dVar3.f11659b;
        float f9 = dVar3.f11661d;
        float f10 = dVar3.a;
        float f11 = dVar3.f11660c;
        float f12 = dVar.f11661d;
        float f13 = dVar.f11659b;
        float f14 = dVar.f11660c;
        float f15 = dVar.a;
        if (i7 == 3) {
            if (f15 < f11) {
                return true;
            }
        } else if (i7 == 4) {
            if (f14 > f10) {
                return true;
            }
        } else if (i7 == 5) {
            if (f13 < f9) {
                return true;
            }
        } else {
            if (i7 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (f12 > f8) {
                return true;
            }
        }
        if (i7 == 3 || i7 == 4) {
            return true;
        }
        if (i7 == 3) {
            f5 = f15 - dVar2.f11660c;
        } else if (i7 == 4) {
            f5 = dVar2.a - f14;
        } else if (i7 == 5) {
            f5 = f13 - dVar2.f11661d;
        } else {
            if (i7 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f5 = dVar2.f11659b - f12;
        }
        float fMax = Math.max(0.0f, f5);
        if (i7 == 3) {
            f7 = f15 - f10;
        } else if (i7 == 4) {
            f7 = f11 - f14;
        } else if (i7 == 5) {
            f7 = f13 - f8;
        } else {
            if (i7 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f7 = f9 - f12;
        }
        return fMax < Math.max(1.0f, f7);
    }

    public static final boolean c(int i7, g0.d dVar, g0.d dVar2) {
        if (i7 == 3 || i7 == 4) {
            return dVar.f11661d > dVar2.f11659b && dVar.f11659b < dVar2.f11661d;
        }
        if (i7 == 5 || i7 == 6) {
            return dVar.f11660c > dVar2.a && dVar.a < dVar2.f11660c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final g0.d d(View view) {
        int[] iArr = a;
        view.getLocationInWindow(iArr);
        float f5 = iArr[0];
        return new g0.d(f5, iArr[1], view.getWidth() + f5, iArr[1] + view.getHeight());
    }

    public static final boolean e(C0866s c0866s, boolean z7) {
        int iOrdinal = c0866s.H0().ordinal();
        EnumC0865r enumC0865r = EnumC0865r.f11422m;
        if (iOrdinal == 0) {
            c0866s.L0(enumC0865r);
            A(c0866s);
            return true;
        }
        if (iOrdinal == 1) {
            C0866s c0866sN = n(c0866s);
            if (!(c0866sN != null ? e(c0866sN, z7) : true)) {
                return false;
            }
            c0866s.L0(enumC0865r);
            A(c0866s);
            return true;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return true;
            }
            throw new D6.r();
        }
        if (z7) {
            c0866s.L0(enumC0865r);
            A(c0866s);
        }
        return z7;
    }

    public static final void f(C0866s c0866s, Q.d dVar) {
        a0.p pVar = c0866s.f10402k;
        if (!pVar.f10414w) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        Q.d dVar2 = new Q.d(new a0.p[16]);
        a0.p pVar2 = pVar.f10407p;
        if (pVar2 == null) {
            AbstractC2359f.b(dVar2, pVar);
        } else {
            dVar2.b(pVar2);
        }
        while (dVar2.l()) {
            a0.p pVarF = (a0.p) dVar2.n(dVar2.f7829m - 1);
            if ((pVarF.f10405n & 1024) == 0) {
                AbstractC2359f.b(dVar2, pVarF);
            } else {
                while (true) {
                    if (pVarF == null) {
                        break;
                    }
                    if ((pVarF.f10404m & 1024) != 0) {
                        Q.d dVar3 = null;
                        while (pVarF != null) {
                            if (pVarF instanceof C0866s) {
                                C0866s c0866s2 = (C0866s) pVarF;
                                if (c0866s2.f10414w && !AbstractC2359f.v(c0866s2).f17668Q) {
                                    if (c0866s2.G0().a) {
                                        dVar.b(c0866s2);
                                    } else {
                                        f(c0866s2, dVar);
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
                                            if (dVar3 == null) {
                                                dVar3 = new Q.d(new a0.p[16]);
                                            }
                                            if (pVarF != null) {
                                                dVar3.b(pVarF);
                                                pVarF = null;
                                            }
                                            dVar3.b(pVar3);
                                        }
                                    }
                                }
                                if (i7 == 1) {
                                }
                            }
                            pVarF = AbstractC2359f.f(dVar3);
                        }
                    } else {
                        pVarF = pVarF.f10407p;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0036, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final f0.C0866s g(f0.C0866s r8) {
        /*
            f0.r r0 = r8.H0()
            int r0 = r0.ordinal()
            if (r0 == 0) goto Lae
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L1c
            r1 = 2
            if (r0 == r1) goto Lae
            r8 = 3
            if (r0 != r8) goto L16
            goto La5
        L16:
            D6.r r8 = new D6.r
            r8.<init>()
            throw r8
        L1c:
            a0.p r8 = r8.f10402k
            boolean r0 = r8.f10414w
            if (r0 == 0) goto La6
            Q.d r0 = new Q.d
            r3 = 16
            a0.p[] r4 = new a0.p[r3]
            r0.<init>(r4)
            a0.p r4 = r8.f10407p
            if (r4 != 0) goto L33
            y0.AbstractC2359f.b(r0, r8)
            goto L36
        L33:
            r0.b(r4)
        L36:
            boolean r8 = r0.l()
            if (r8 == 0) goto La5
            int r8 = r0.f7829m
            int r8 = r8 - r1
            java.lang.Object r8 = r0.n(r8)
            a0.p r8 = (a0.p) r8
            int r4 = r8.f10405n
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L4f
            y0.AbstractC2359f.b(r0, r8)
            goto L36
        L4f:
            if (r8 == 0) goto L36
            int r4 = r8.f10404m
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La2
            r4 = r2
        L58:
            if (r8 == 0) goto L36
            boolean r5 = r8 instanceof f0.C0866s
            if (r5 == 0) goto L67
            f0.s r8 = (f0.C0866s) r8
            f0.s r8 = g(r8)
            if (r8 == 0) goto L9d
            return r8
        L67:
            int r5 = r8.f10404m
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L9d
            boolean r5 = r8 instanceof y0.AbstractC2367n
            if (r5 == 0) goto L9d
            r5 = r8
            y0.n r5 = (y0.AbstractC2367n) r5
            a0.p r5 = r5.f17880y
            r6 = 0
        L77:
            if (r5 == 0) goto L9a
            int r7 = r5.f10404m
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L97
            int r6 = r6 + 1
            if (r6 != r1) goto L85
            r8 = r5
            goto L97
        L85:
            if (r4 != 0) goto L8e
            Q.d r4 = new Q.d
            a0.p[] r7 = new a0.p[r3]
            r4.<init>(r7)
        L8e:
            if (r8 == 0) goto L94
            r4.b(r8)
            r8 = r2
        L94:
            r4.b(r5)
        L97:
            a0.p r5 = r5.f10407p
            goto L77
        L9a:
            if (r6 != r1) goto L9d
            goto L58
        L9d:
            a0.p r8 = y0.AbstractC2359f.f(r4)
            goto L58
        La2:
            a0.p r8 = r8.f10407p
            goto L4f
        La5:
            return r2
        La6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            r8.<init>(r0)
            throw r8
        Lae:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.AbstractC0851d.g(f0.s):f0.s");
    }

    public static final C0866s h(Q.d dVar, g0.d dVar2, int i7) {
        g0.d dVarG;
        if (i7 == 3) {
            dVarG = dVar2.g(dVar2.c() + 1, 0.0f);
        } else if (i7 == 4) {
            dVarG = dVar2.g(-(dVar2.c() + 1), 0.0f);
        } else if (i7 == 5) {
            dVarG = dVar2.g(0.0f, dVar2.b() + 1);
        } else {
            if (i7 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            dVarG = dVar2.g(0.0f, -(dVar2.b() + 1));
        }
        int i8 = dVar.f7829m;
        C0866s c0866s = null;
        if (i8 > 0) {
            Object[] objArr = dVar.f7827k;
            int i9 = 0;
            do {
                C0866s c0866s2 = (C0866s) objArr[i9];
                if (t(c0866s2)) {
                    g0.d dVarJ = j(c0866s2);
                    if (r(i7, dVarJ, dVar2) && (!r(i7, dVarG, dVar2) || b(dVar2, dVarJ, dVarG, i7) || (!b(dVar2, dVarG, dVarJ, i7) && s(i7, dVar2, dVarJ) < s(i7, dVar2, dVarG)))) {
                        c0866s = c0866s2;
                        dVarG = dVarJ;
                    }
                }
                i9++;
            } while (i9 < i8);
        }
        return c0866s;
    }

    public static final boolean i(C0866s c0866s, int i7, e4.k kVar) {
        g0.d dVar;
        Q.d dVar2 = new Q.d(new C0866s[16]);
        f(c0866s, dVar2);
        if (dVar2.f7829m <= 1) {
            C0866s c0866s2 = (C0866s) (dVar2.k() ? null : dVar2.f7827k[0]);
            if (c0866s2 != null) {
                return ((Boolean) kVar.invoke(c0866s2)).booleanValue();
            }
        } else {
            if (i7 == 7) {
                i7 = 4;
            }
            if (i7 == 4 || i7 == 6) {
                g0.d dVarJ = j(c0866s);
                float f5 = dVarJ.f11659b;
                float f7 = dVarJ.a;
                dVar = new g0.d(f7, f5, f7, f5);
            } else {
                if (i7 != 3 && i7 != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                g0.d dVarJ2 = j(c0866s);
                float f8 = dVarJ2.f11661d;
                float f9 = dVarJ2.f11660c;
                dVar = new g0.d(f9, f8, f9, f8);
            }
            C0866s c0866sH = h(dVar2, dVar, i7);
            if (c0866sH != null) {
                return ((Boolean) kVar.invoke(c0866sH)).booleanValue();
            }
        }
        return false;
    }

    public static final g0.d j(C0866s c0866s) {
        Y y7 = c0866s.f10409r;
        return y7 != null ? X.f(y7).K(y7, false) : g0.d.f11658e;
    }

    public static final boolean k(C0866s c0866s, C0056i c0056i) {
        int iOrdinal = c0866s.H0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C0866s c0866sN = n(c0866s);
                if (c0866sN != null) {
                    return k(c0866sN, c0056i) || m(c0866s, c0866sN, 1, c0056i);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return c0866s.G0().a ? ((Boolean) c0056i.invoke(c0866s)).booleanValue() : z(c0866s, c0056i);
                }
                throw new D6.r();
            }
        }
        return z(c0866s, c0056i);
    }

    public static final boolean l(int i7, C0056i c0056i, C0866s c0866s, g0.d dVar) {
        if (G(i7, c0056i, c0866s, dVar)) {
            return true;
        }
        Boolean bool = (Boolean) F(c0866s, i7, new D.Y(c0866s, dVar, i7, c0056i, 5));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(C0866s c0866s, C0866s c0866s2, int i7, C0056i c0056i) {
        if (H(c0866s, c0866s2, i7, c0056i)) {
            return true;
        }
        Boolean bool = (Boolean) F(c0866s, i7, new D.Y(c0866s, c0866s2, i7, c0056i, 4));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x001f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final f0.C0866s n(f0.C0866s r8) {
        /*
            a0.p r8 = r8.f10402k
            boolean r0 = r8.f10414w
            r1 = 0
            if (r0 != 0) goto L9
            goto L9f
        L9:
            if (r0 == 0) goto La0
            Q.d r0 = new Q.d
            r2 = 16
            a0.p[] r3 = new a0.p[r2]
            r0.<init>(r3)
            a0.p r3 = r8.f10407p
            if (r3 != 0) goto L1c
            y0.AbstractC2359f.b(r0, r8)
            goto L1f
        L1c:
            r0.b(r3)
        L1f:
            boolean r8 = r0.l()
            if (r8 == 0) goto L9f
            int r8 = r0.f7829m
            r3 = 1
            int r8 = r8 - r3
            java.lang.Object r8 = r0.n(r8)
            a0.p r8 = (a0.p) r8
            int r4 = r8.f10405n
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L39
            y0.AbstractC2359f.b(r0, r8)
            goto L1f
        L39:
            if (r8 == 0) goto L1f
            int r4 = r8.f10404m
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L9c
            r4 = r1
        L42:
            if (r8 == 0) goto L1f
            boolean r5 = r8 instanceof f0.C0866s
            if (r5 == 0) goto L61
            f0.s r8 = (f0.C0866s) r8
            a0.p r5 = r8.f10402k
            boolean r5 = r5.f10414w
            if (r5 == 0) goto L97
            f0.r r5 = r8.H0()
            int r5 = r5.ordinal()
            if (r5 == 0) goto L60
            if (r5 == r3) goto L60
            r6 = 2
            if (r5 == r6) goto L60
            goto L97
        L60:
            return r8
        L61:
            int r5 = r8.f10404m
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L97
            boolean r5 = r8 instanceof y0.AbstractC2367n
            if (r5 == 0) goto L97
            r5 = r8
            y0.n r5 = (y0.AbstractC2367n) r5
            a0.p r5 = r5.f17880y
            r6 = 0
        L71:
            if (r5 == 0) goto L94
            int r7 = r5.f10404m
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L91
            int r6 = r6 + 1
            if (r6 != r3) goto L7f
            r8 = r5
            goto L91
        L7f:
            if (r4 != 0) goto L88
            Q.d r4 = new Q.d
            a0.p[] r7 = new a0.p[r2]
            r4.<init>(r7)
        L88:
            if (r8 == 0) goto L8e
            r4.b(r8)
            r8 = r1
        L8e:
            r4.b(r5)
        L91:
            a0.p r5 = r5.f10407p
            goto L71
        L94:
            if (r6 != r3) goto L97
            goto L42
        L97:
            a0.p r8 = y0.AbstractC2359f.f(r4)
            goto L42
        L9c:
            a0.p r8 = r8.f10407p
            goto L39
        L9f:
            return r1
        La0:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.AbstractC0851d.n(f0.s):f0.s");
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0075, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final f0.EnumC0865r o(f0.InterfaceC0850c r10) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.AbstractC0851d.o(f0.c):f0.r");
    }

    public static final void p(C0866s c0866s) {
        AbstractC2359f.s(c0866s, new C0867t(c0866s, 0));
        int iOrdinal = c0866s.H0().ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            c0866s.L0(EnumC0865r.f11420k);
        }
    }

    public static final void q(C0866s c0866s) {
        C0852e c0852e = ((androidx.compose.ui.focus.b) ((C2471u) AbstractC2359f.w(c0866s)).getFocusOwner()).f10655g;
        c0852e.b(c0852e.f11391c, c0866s);
    }

    public static final boolean r(int i7, g0.d dVar, g0.d dVar2) {
        float f5 = dVar.a;
        float f7 = dVar.f11660c;
        if (i7 == 3) {
            float f8 = dVar2.f11660c;
            float f9 = dVar2.a;
            return (f8 > f7 || f9 >= f7) && f9 > f5;
        }
        if (i7 == 4) {
            float f10 = dVar2.a;
            float f11 = dVar2.f11660c;
            return (f10 < f5 || f11 <= f5) && f11 < f7;
        }
        float f12 = dVar.f11659b;
        float f13 = dVar.f11661d;
        if (i7 == 5) {
            float f14 = dVar2.f11661d;
            float f15 = dVar2.f11659b;
            return (f14 > f13 || f15 >= f13) && f15 > f12;
        }
        if (i7 != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f16 = dVar2.f11659b;
        float f17 = dVar2.f11661d;
        return (f16 < f12 || f17 <= f12) && f17 < f13;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long s(int r10, g0.d r11, g0.d r12) {
        /*
            float r0 = r12.f11659b
            float r1 = r12.a
            java.lang.String r2 = "This function should only be used for 2-D focus search"
            r3 = 6
            r4 = 5
            r5 = 4
            r6 = 3
            if (r10 != r6) goto L12
            float r7 = r11.a
            float r8 = r12.f11660c
        L10:
            float r7 = r7 - r8
            goto L26
        L12:
            if (r10 != r5) goto L19
            float r7 = r11.f11660c
            float r7 = r1 - r7
            goto L26
        L19:
            if (r10 != r4) goto L20
            float r7 = r11.f11659b
            float r8 = r12.f11661d
            goto L10
        L20:
            if (r10 != r3) goto L6f
            float r7 = r11.f11661d
            float r7 = r0 - r7
        L26:
            r8 = 0
            float r7 = java.lang.Math.max(r8, r7)
            float r7 = java.lang.Math.abs(r7)
            long r7 = (long) r7
            r9 = 2
            if (r10 != r6) goto L34
            goto L36
        L34:
            if (r10 != r5) goto L47
        L36:
            float r10 = r11.b()
            float r1 = (float) r9
            float r10 = r10 / r1
            float r11 = r11.f11659b
            float r10 = r10 + r11
            float r11 = r12.b()
            float r11 = r11 / r1
            float r11 = r11 + r0
        L45:
            float r10 = r10 - r11
            goto L5c
        L47:
            if (r10 != r4) goto L4a
            goto L4c
        L4a:
            if (r10 != r3) goto L69
        L4c:
            float r10 = r11.c()
            float r0 = (float) r9
            float r10 = r10 / r0
            float r11 = r11.a
            float r10 = r10 + r11
            float r11 = r12.c()
            float r11 = r11 / r0
            float r11 = r11 + r1
            goto L45
        L5c:
            float r10 = java.lang.Math.abs(r10)
            long r10 = (long) r10
            r12 = 13
            long r0 = (long) r12
            long r0 = r0 * r7
            long r0 = r0 * r7
            long r10 = r10 * r10
            long r10 = r10 + r0
            return r10
        L69:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r2)
            throw r10
        L6f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.AbstractC0851d.s(int, g0.d, g0.d):long");
    }

    public static final boolean t(C0866s c0866s) {
        C2349D c2349d;
        Y y7;
        C2349D c2349d2;
        Y y8 = c0866s.f10409r;
        return (y8 == null || (c2349d = y8.f17825v) == null || !c2349d.F() || (y7 = c0866s.f10409r) == null || (c2349d2 = y7.f17825v) == null || !c2349d2.E()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [e4.k, java.lang.Object] */
    public static final int u(C0866s c0866s, int i7) {
        int iOrdinal = c0866s.H0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C0866s c0866sN = n(c0866s);
                if (c0866sN == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                int iU = u(c0866sN, i7);
                if (iU == 1) {
                    iU = 0;
                }
                if (iU != 0) {
                    return iU;
                }
                if (!c0866s.f11424x) {
                    c0866s.f11424x = true;
                    try {
                        C0862o c0862o = (C0862o) c0866s.G0().f11415k.invoke(new C0849b(i7));
                        if (c0862o == C0862o.f11417b) {
                            return 1;
                        }
                        if (c0862o == C0862o.f11418c) {
                            return 2;
                        }
                        return c0862o.a(C0855h.f11401p) ? 3 : 4;
                    } finally {
                        c0866s.f11424x = false;
                    }
                }
            } else {
                if (iOrdinal == 2) {
                    return 2;
                }
                if (iOrdinal != 3) {
                    throw new D6.r();
                }
            }
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [e4.k, java.lang.Object] */
    public static final int v(C0866s c0866s, int i7) {
        if (!c0866s.f11425y) {
            c0866s.f11425y = true;
            try {
                C0862o c0862o = (C0862o) c0866s.G0().f11414j.invoke(new C0849b(i7));
                if (c0862o != C0862o.f11417b) {
                    if (c0862o != C0862o.f11418c) {
                        return c0862o.a(C0855h.f11401p) ? 3 : 4;
                    }
                    c0866s.f11425y = false;
                    return 2;
                }
            } finally {
                c0866s.f11425y = false;
            }
        }
        return 1;
    }

    public static final int w(C0866s c0866s, int i7) {
        a0.p pVar;
        C0517t c0517t;
        int iOrdinal = c0866s.H0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C0866s c0866sN = n(c0866s);
                if (c0866sN != null) {
                    return u(c0866sN, i7);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new D6.r();
                }
                a0.p pVar2 = c0866s.f10402k;
                if (!pVar2.f10414w) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                a0.p pVar3 = pVar2.f10406o;
                C2349D c2349dV = AbstractC2359f.v(c0866s);
                loop0: while (true) {
                    pVar = null;
                    if (c2349dV == null) {
                        break;
                    }
                    if ((((a0.p) c2349dV.f17660G.f7176f).f10405n & 1024) != 0) {
                        while (pVar3 != null) {
                            if ((pVar3.f10404m & 1024) != 0) {
                                a0.p pVarF = pVar3;
                                Q.d dVar = null;
                                while (pVarF != null) {
                                    if (pVarF instanceof C0866s) {
                                        pVar = pVarF;
                                        break loop0;
                                    }
                                    if ((pVarF.f10404m & 1024) != 0 && (pVarF instanceof AbstractC2367n)) {
                                        int i8 = 0;
                                        for (a0.p pVar4 = ((AbstractC2367n) pVarF).f17880y; pVar4 != null; pVar4 = pVar4.f10407p) {
                                            if ((pVar4.f10404m & 1024) != 0) {
                                                i8++;
                                                if (i8 == 1) {
                                                    pVarF = pVar4;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new Q.d(new a0.p[16]);
                                                    }
                                                    if (pVarF != null) {
                                                        dVar.b(pVarF);
                                                        pVarF = null;
                                                    }
                                                    dVar.b(pVar4);
                                                }
                                            }
                                        }
                                        if (i8 == 1) {
                                        }
                                    }
                                    pVarF = AbstractC2359f.f(dVar);
                                }
                            }
                            pVar3 = pVar3.f10406o;
                        }
                    }
                    c2349dV = c2349dV.s();
                    pVar3 = (c2349dV == null || (c0517t = c2349dV.f17660G) == null) ? null : (m0) c0517t.f7175e;
                }
                C0866s c0866s2 = (C0866s) pVar;
                if (c0866s2 != null) {
                    int iOrdinal2 = c0866s2.H0().ordinal();
                    if (iOrdinal2 == 0) {
                        return v(c0866s2, i7);
                    }
                    if (iOrdinal2 == 1) {
                        return w(c0866s2, i7);
                    }
                    if (iOrdinal2 == 2) {
                        return 2;
                    }
                    if (iOrdinal2 != 3) {
                        throw new D6.r();
                    }
                    int iW = w(c0866s2, i7);
                    int i9 = iW != 1 ? iW : 0;
                    return i9 == 0 ? v(c0866s2, i7) : i9;
                }
            }
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean x(f0.C0866s r10) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.AbstractC0851d.x(f0.s):boolean");
    }

    public static final boolean y(C0866s c0866s, C0056i c0056i) {
        Object[] objArrCopyOf = new C0866s[16];
        a0.p pVar = c0866s.f10402k;
        if (!pVar.f10414w) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        Q.d dVar = new Q.d(new a0.p[16]);
        a0.p pVar2 = pVar.f10407p;
        if (pVar2 == null) {
            AbstractC2359f.b(dVar, pVar);
        } else {
            dVar.b(pVar2);
        }
        int i7 = 0;
        while (dVar.l()) {
            a0.p pVarF = (a0.p) dVar.n(dVar.f7829m - 1);
            if ((pVarF.f10405n & 1024) == 0) {
                AbstractC2359f.b(dVar, pVarF);
            } else {
                while (true) {
                    if (pVarF == null) {
                        break;
                    }
                    if ((pVarF.f10404m & 1024) != 0) {
                        Q.d dVar2 = null;
                        while (pVarF != null) {
                            if (pVarF instanceof C0866s) {
                                C0866s c0866s2 = (C0866s) pVarF;
                                int i8 = i7 + 1;
                                if (objArrCopyOf.length < i8) {
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i8, objArrCopyOf.length * 2));
                                    kotlin.jvm.internal.l.e("copyOf(this, newSize)", objArrCopyOf);
                                }
                                objArrCopyOf[i7] = c0866s2;
                                i7 = i8;
                            } else if ((pVarF.f10404m & 1024) != 0 && (pVarF instanceof AbstractC2367n)) {
                                int i9 = 0;
                                for (a0.p pVar3 = ((AbstractC2367n) pVarF).f17880y; pVar3 != null; pVar3 = pVar3.f10407p) {
                                    if ((pVar3.f10404m & 1024) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            pVarF = pVar3;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new Q.d(new a0.p[16]);
                                            }
                                            if (pVarF != null) {
                                                dVar2.b(pVarF);
                                                pVarF = null;
                                            }
                                            dVar2.b(pVar3);
                                        }
                                    }
                                }
                                if (i9 == 1) {
                                }
                            }
                            pVarF = AbstractC2359f.f(dVar2);
                        }
                    } else {
                        pVarF = pVarF.f10407p;
                    }
                }
            }
        }
        u uVar = u.f11429k;
        kotlin.jvm.internal.l.f("<this>", objArrCopyOf);
        Arrays.sort(objArrCopyOf, 0, i7, uVar);
        if (i7 > 0) {
            int i10 = i7 - 1;
            do {
                C0866s c0866s3 = (C0866s) objArrCopyOf[i10];
                if (t(c0866s3) && a(c0866s3, c0056i)) {
                    return true;
                }
                i10--;
            } while (i10 >= 0);
        }
        return false;
    }

    public static final boolean z(C0866s c0866s, C0056i c0056i) {
        Object[] objArrCopyOf = new C0866s[16];
        a0.p pVar = c0866s.f10402k;
        if (!pVar.f10414w) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        Q.d dVar = new Q.d(new a0.p[16]);
        a0.p pVar2 = pVar.f10407p;
        if (pVar2 == null) {
            AbstractC2359f.b(dVar, pVar);
        } else {
            dVar.b(pVar2);
        }
        int i7 = 0;
        while (dVar.l()) {
            a0.p pVarF = (a0.p) dVar.n(dVar.f7829m - 1);
            if ((pVarF.f10405n & 1024) == 0) {
                AbstractC2359f.b(dVar, pVarF);
            } else {
                while (true) {
                    if (pVarF == null) {
                        break;
                    }
                    if ((pVarF.f10404m & 1024) != 0) {
                        Q.d dVar2 = null;
                        while (pVarF != null) {
                            if (pVarF instanceof C0866s) {
                                C0866s c0866s2 = (C0866s) pVarF;
                                int i8 = i7 + 1;
                                if (objArrCopyOf.length < i8) {
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, Math.max(i8, objArrCopyOf.length * 2));
                                    kotlin.jvm.internal.l.e("copyOf(this, newSize)", objArrCopyOf);
                                }
                                objArrCopyOf[i7] = c0866s2;
                                i7 = i8;
                            } else if ((pVarF.f10404m & 1024) != 0 && (pVarF instanceof AbstractC2367n)) {
                                int i9 = 0;
                                for (a0.p pVar3 = ((AbstractC2367n) pVarF).f17880y; pVar3 != null; pVar3 = pVar3.f10407p) {
                                    if ((pVar3.f10404m & 1024) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            pVarF = pVar3;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new Q.d(new a0.p[16]);
                                            }
                                            if (pVarF != null) {
                                                dVar2.b(pVarF);
                                                pVarF = null;
                                            }
                                            dVar2.b(pVar3);
                                        }
                                    }
                                }
                                if (i9 == 1) {
                                }
                            }
                            pVarF = AbstractC2359f.f(dVar2);
                        }
                    } else {
                        pVarF = pVarF.f10407p;
                    }
                }
            }
        }
        u uVar = u.f11429k;
        kotlin.jvm.internal.l.f("<this>", objArrCopyOf);
        Arrays.sort(objArrCopyOf, 0, i7, uVar);
        if (i7 > 0) {
            int i10 = 0;
            do {
                C0866s c0866s3 = (C0866s) objArrCopyOf[i10];
                if (t(c0866s3) && k(c0866s3, c0056i)) {
                    return true;
                }
                i10++;
            } while (i10 < i7);
        }
        return false;
    }
}
