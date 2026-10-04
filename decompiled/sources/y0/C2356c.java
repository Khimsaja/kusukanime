package y0;

import O.C0517t;
import android.os.SystemClock;
import android.view.MotionEvent;
import e0.InterfaceC0809a;
import e0.InterfaceC0813e;
import f0.EnumC0865r;
import f0.InterfaceC0850c;
import f0.InterfaceC0857j;
import f0.InterfaceC0860m;
import f0.InterfaceC0863p;
import f6.AbstractC0905c;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import l4.AbstractC1420H;
import o.C1610h;
import s0.AbstractC1971p;
import s0.C1963h;
import s0.EnumC1964i;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import w0.InterfaceC2201t;
import x0.C2241a;
import x0.C2242b;
import x0.C2244d;
import x0.C2248h;
import x0.InterfaceC2243c;
import x0.InterfaceC2245e;
import x0.InterfaceC2246f;
import x0.InterfaceC2247g;
import y.C2322c;
import z0.C2471u;

/* renamed from: y0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2356c extends a0.p implements InterfaceC2375w, InterfaceC2368o, l0, j0, InterfaceC2245e, InterfaceC2247g, h0, InterfaceC2374v, InterfaceC2369p, InterfaceC0850c, InterfaceC0860m, InterfaceC0863p, f0, InterfaceC0809a {

    /* renamed from: x, reason: collision with root package name */
    public a0.o f17833x;

    /* renamed from: y, reason: collision with root package name */
    public C2241a f17834y;

    /* renamed from: z, reason: collision with root package name */
    public HashSet f17835z;

    @Override // f0.InterfaceC0850c
    public final void B(EnumC0865r enumC0865r) {
        AbstractC0905c.C("onFocusEvent called on wrong node");
        throw null;
    }

    @Override // y0.InterfaceC2369p
    public final void E(Y y7) {
        a0.o oVar = this.f17833x;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier", oVar);
        C2322c c2322c = (C2322c) oVar;
        if (c2322c.a) {
            return;
        }
        c2322c.a = true;
        S3.j jVar = c2322c.f17619b;
        if (jVar != null) {
            jVar.resumeWith(O3.C.a);
        }
        c2322c.f17619b = null;
    }

    public final void G0(boolean z7) {
        if (!this.f10414w) {
            AbstractC0905c.C("initializeModifier called on unattached node");
            throw null;
        }
        a0.o oVar = this.f17833x;
        if ((this.f10404m & 32) != 0) {
            if (oVar instanceof InterfaceC2243c) {
                C2355b c2355b = new C2355b(this, 0);
                Q.d dVar = ((C2471u) AbstractC2359f.w(this)).A0;
                if (!dVar.h(c2355b)) {
                    dVar.b(c2355b);
                }
            }
            if (oVar instanceof InterfaceC2246f) {
                InterfaceC2246f interfaceC2246f = (InterfaceC2246f) oVar;
                C2241a c2241a = this.f17834y;
                if (c2241a == null || !c2241a.q(interfaceC2246f.getKey())) {
                    C2241a c2241a2 = new C2241a();
                    c2241a2.a = interfaceC2246f;
                    this.f17834y = c2241a2;
                    if (AbstractC2359f.d(this)) {
                        C2244d modifierLocalManager = ((C2471u) AbstractC2359f.w(this)).getModifierLocalManager();
                        C2248h key = interfaceC2246f.getKey();
                        modifierLocalManager.f17297b.b(this);
                        modifierLocalManager.f17298c.b(key);
                        modifierLocalManager.a();
                    }
                } else {
                    c2241a.a = interfaceC2246f;
                    C2244d modifierLocalManager2 = ((C2471u) AbstractC2359f.w(this)).getModifierLocalManager();
                    C2248h key2 = interfaceC2246f.getKey();
                    modifierLocalManager2.f17297b.b(this);
                    modifierLocalManager2.f17298c.b(key2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.f10404m & 4) != 0 && !z7) {
            AbstractC2359f.t(this, 2).V0();
        }
        if ((this.f10404m & 2) != 0) {
            if (AbstractC2359f.d(this)) {
                Y y7 = this.f10409r;
                kotlin.jvm.internal.l.c(y7);
                ((C2377y) y7).m1(this);
                d0 d0Var = y7.f17824N;
                if (d0Var != null) {
                    d0Var.invalidate();
                }
            }
            if (!z7) {
                AbstractC2359f.t(this, 2).V0();
                AbstractC2359f.v(this).B();
            }
        }
        if (oVar instanceof w.p) {
            w.p pVar = (w.p) oVar;
            C2349D c2349dV = AbstractC2359f.v(this);
            switch (pVar.a) {
                case 0:
                    ((w.u) pVar.f16777b).f16799j = c2349dV;
                    break;
                case 1:
                    ((x.v) pVar.f16777b).f17285h = c2349dV;
                    break;
                default:
                    ((z.C) pVar.f16777b).f18425w.setValue(c2349dV);
                    break;
            }
        }
        if ((this.f10404m & 256) != 0 && (oVar instanceof C2322c) && AbstractC2359f.d(this)) {
            AbstractC2359f.v(this).B();
        }
        int i7 = this.f10404m;
        if ((i7 & 16) != 0 && (oVar instanceof s0.u)) {
            ((s0.u) oVar).f15495d.f667m = this.f10409r;
        }
        if ((i7 & 8) != 0) {
            ((C2471u) AbstractC2359f.w(this)).x();
        }
    }

    public final void H0() {
        if (!this.f10414w) {
            AbstractC0905c.C("unInitializeModifier called on unattached node");
            throw null;
        }
        a0.o oVar = this.f17833x;
        if ((this.f10404m & 32) != 0) {
            if (oVar instanceof InterfaceC2246f) {
                C2244d modifierLocalManager = ((C2471u) AbstractC2359f.w(this)).getModifierLocalManager();
                C2248h key = ((InterfaceC2246f) oVar).getKey();
                modifierLocalManager.f17299d.b(AbstractC2359f.v(this));
                modifierLocalManager.f17300e.b(key);
                modifierLocalManager.a();
            }
            if (oVar instanceof InterfaceC2243c) {
                ((InterfaceC2243c) oVar).j(AbstractC2359f.a);
            }
        }
        if ((this.f10404m & 8) != 0) {
            ((C2471u) AbstractC2359f.w(this)).x();
        }
    }

    public final void I0() {
        if (this.f10414w) {
            this.f17835z.clear();
            ((C2471u) AbstractC2359f.w(this)).getSnapshotObserver().a(this, C2358e.f17839m, new C2355b(this, 1));
        }
    }

    @Override // f0.InterfaceC0860m
    public final void Q(InterfaceC0857j interfaceC0857j) {
        AbstractC0905c.C("applyFocusProperties called on wrong node");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.List] */
    @Override // y0.j0
    public final void W(C1963h c1963h, EnumC1964i enumC1964i, long j7) {
        boolean z7;
        a0.o oVar = this.f17833x;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier", oVar);
        C2.H h7 = ((s0.u) oVar).f15495d;
        ?? r11 = c1963h.a;
        s0.u uVar = (s0.u) h7.f668n;
        if (uVar.f15494c) {
            z7 = true;
            break;
        }
        int size = r11.size();
        for (int i7 = 0; i7 < size; i7++) {
            s0.r rVar = (s0.r) r11.get(i7);
            if (AbstractC1971p.a(rVar) || AbstractC1971p.c(rVar)) {
                z7 = true;
                break;
            }
        }
        z7 = false;
        int i8 = h7.f666l;
        EnumC1964i enumC1964i2 = EnumC1964i.f15463m;
        if (i8 != 3) {
            if (enumC1964i == EnumC1964i.f15461k && z7) {
                h7.e(c1963h);
            }
            if (enumC1964i == enumC1964i2 && !z7) {
                h7.e(c1963h);
            }
        }
        if (enumC1964i == enumC1964i2) {
            int size2 = r11.size();
            for (int i9 = 0; i9 < size2; i9++) {
                if (!AbstractC1971p.c((s0.r) r11.get(i9))) {
                    return;
                }
            }
            h7.f666l = 1;
            uVar.f15494c = false;
        }
    }

    @Override // y0.j0
    public final boolean X() {
        a0.o oVar = this.f17833x;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier", oVar);
        ((s0.u) oVar).f15495d.getClass();
        return true;
    }

    @Override // e0.InterfaceC0809a
    public final T0.b a() {
        return AbstractC2359f.v(this).f17655B;
    }

    @Override // y0.InterfaceC2375w
    public final int b(N n7, InterfaceC2172G interfaceC2172G, int i7) {
        a0.o oVar = this.f17833x;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier", oVar);
        return ((InterfaceC2201t) oVar).b(n7, interfaceC2172G, i7);
    }

    @Override // y0.InterfaceC2375w
    public final int c(N n7, InterfaceC2172G interfaceC2172G, int i7) {
        a0.o oVar = this.f17833x;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier", oVar);
        return ((InterfaceC2201t) oVar).c(n7, interfaceC2172G, i7);
    }

    @Override // e0.InterfaceC0809a
    public final long d() {
        return AbstractC1420H.O(AbstractC2359f.t(this, 128).f16842m);
    }

    @Override // y0.InterfaceC2375w
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        a0.o oVar = this.f17833x;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier", oVar);
        return ((InterfaceC2201t) oVar).e(interfaceC2175J, interfaceC2172G, j7);
    }

    @Override // y0.InterfaceC2368o
    public final void f(C2351F c2351f) {
        a0.o oVar = this.f17833x;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier", oVar);
        ((InterfaceC0813e) oVar).f(c2351f);
    }

    @Override // y0.j0
    public final void f0() {
        a0.o oVar = this.f17833x;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier", oVar);
        C2.H h7 = ((s0.u) oVar).f15495d;
        if (h7.f666l == 2) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            s0.u uVar = (s0.u) h7.f668n;
            ((W0.c) uVar.h()).invoke(motionEventObtain);
            motionEventObtain.recycle();
            h7.f666l = 1;
            uVar.f15494c = false;
        }
    }

    @Override // y0.InterfaceC2375w
    public final int g(N n7, InterfaceC2172G interfaceC2172G, int i7) {
        a0.o oVar = this.f17833x;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier", oVar);
        return ((InterfaceC2201t) oVar).g(n7, interfaceC2172G, i7);
    }

    @Override // e0.InterfaceC0809a
    public final T0.k getLayoutDirection() {
        return AbstractC2359f.v(this).f17656C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [e4.a, kotlin.jvm.internal.m] */
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
    @Override // x0.InterfaceC2245e, x0.InterfaceC2247g
    public final Object h(C2248h c2248h) {
        C0517t c0517t;
        this.f17835z.add(c2248h);
        a0.p pVar = this.f10402k;
        if (!pVar.f10414w) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        a0.p pVar2 = pVar.f10406o;
        C2349D c2349dV = AbstractC2359f.v(this);
        while (c2349dV != null) {
            if ((((a0.p) c2349dV.f17660G.f7176f).f10405n & 32) != 0) {
                while (pVar2 != null) {
                    if ((pVar2.f10404m & 32) != 0) {
                        AbstractC2367n abstractC2367nF = pVar2;
                        ?? dVar = 0;
                        while (abstractC2367nF != 0) {
                            if (abstractC2367nF instanceof InterfaceC2245e) {
                                InterfaceC2245e interfaceC2245e = (InterfaceC2245e) abstractC2367nF;
                                if (interfaceC2245e.j().q(c2248h)) {
                                    return interfaceC2245e.j().w(c2248h);
                                }
                            } else if ((abstractC2367nF.f10404m & 32) != 0 && (abstractC2367nF instanceof AbstractC2367n)) {
                                a0.p pVar3 = abstractC2367nF.f17880y;
                                int i7 = 0;
                                abstractC2367nF = abstractC2367nF;
                                dVar = dVar;
                                while (pVar3 != null) {
                                    if ((pVar3.f10404m & 32) != 0) {
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
                            abstractC2367nF = AbstractC2359f.f(dVar);
                        }
                    }
                    pVar2 = pVar2.f10406o;
                }
            }
            c2349dV = c2349dV.s();
            pVar2 = (c2349dV == null || (c0517t = c2349dV.f17660G) == null) ? null : (m0) c0517t.f7175e;
        }
        return c2248h.a.invoke();
    }

    @Override // y0.InterfaceC2375w
    public final int i(N n7, InterfaceC2172G interfaceC2172G, int i7) {
        a0.o oVar = this.f17833x;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier", oVar);
        return ((InterfaceC2201t) oVar).i(n7, interfaceC2172G, i7);
    }

    @Override // x0.InterfaceC2245e
    public final e3.c j() {
        C2241a c2241a = this.f17834y;
        return c2241a != null ? c2241a : C2242b.a;
    }

    @Override // y0.h0
    public final Object m0(Object obj) {
        a0.o oVar = this.f17833x;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier", oVar);
        return (C1610h) oVar;
    }

    @Override // y0.InterfaceC2368o
    public final void n0() {
        AbstractC2359f.n(this);
    }

    @Override // y0.j0
    public final void p0() {
        a0.o oVar = this.f17833x;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier", oVar);
    }

    public final String toString() {
        return this.f17833x.toString();
    }

    @Override // y0.l0
    public final void y(F0.i iVar) {
        a0.o oVar = this.f17833x;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier", oVar);
        F0.i iVarL = ((F0.j) oVar).l();
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration", iVar);
        if (iVarL.f2097l) {
            iVar.f2097l = true;
        }
        if (iVarL.f2098m) {
            iVar.f2098m = true;
        }
        for (Map.Entry entry : iVarL.f2096k.entrySet()) {
            F0.t tVar = (F0.t) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = iVar.f2096k;
            if (!linkedHashMap.containsKey(tVar)) {
                linkedHashMap.put(tVar, value);
            } else if (value instanceof F0.a) {
                Object obj = linkedHashMap.get(tVar);
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>", obj);
                F0.a aVar = (F0.a) obj;
                String str = aVar.a;
                if (str == null) {
                    str = ((F0.a) value).a;
                }
                O3.e eVar = aVar.f2062b;
                if (eVar == null) {
                    eVar = ((F0.a) value).f2062b;
                }
                linkedHashMap.put(tVar, new F0.a(str, eVar));
            }
        }
    }

    @Override // a0.p
    public final void y0() {
        G0(true);
    }

    @Override // y0.f0
    public final boolean z() {
        return this.f10414w;
    }

    @Override // a0.p
    public final void z0() {
        H0();
    }

    @Override // y0.InterfaceC2374v
    public final void b0(w0.r rVar) {
    }

    @Override // y0.InterfaceC2374v
    public final void r(long j7) {
    }
}
