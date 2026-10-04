package y0;

import e0.InterfaceC0813e;
import f0.AbstractC0851d;
import f0.C0852e;
import f0.C0866s;
import f0.InterfaceC0850c;
import f0.InterfaceC0860m;
import f6.AbstractC0905c;
import m.AbstractC1473C;
import m.C1501v;
import o.C1610h;
import u0.C2065a;
import w0.InterfaceC2201t;
import x0.InterfaceC2243c;
import x0.InterfaceC2245e;
import x0.InterfaceC2246f;
import y.C2322c;
import z0.C2471u;

/* loaded from: classes.dex */
public abstract class Z {
    public static final C1501v a;

    static {
        C1501v c1501v = AbstractC1473C.a;
        a = new C1501v();
    }

    public static final void a(a0.p pVar) {
        if (pVar.f10414w) {
            b(pVar, -1, 1);
        } else {
            AbstractC0905c.C("autoInvalidateInsertedNode called on unattached node");
            throw null;
        }
    }

    public static final void b(a0.p pVar, int i7, int i8) {
        if (!(pVar instanceof AbstractC2367n)) {
            c(pVar, i7 & pVar.f10404m, i8);
            return;
        }
        AbstractC2367n abstractC2367n = (AbstractC2367n) pVar;
        c(pVar, abstractC2367n.f17879x & i7, i8);
        int i9 = (~abstractC2367n.f17879x) & i7;
        for (a0.p pVar2 = abstractC2367n.f17880y; pVar2 != null; pVar2 = pVar2.f10407p) {
            b(pVar2, i9, i8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(a0.p pVar, int i7, int i8) {
        if (i8 != 0 || pVar.v0()) {
            if ((i7 & 2) != 0 && (pVar instanceof InterfaceC2375w)) {
                AbstractC2359f.o((InterfaceC2375w) pVar);
                if (i8 == 2) {
                    Y yT = AbstractC2359f.t(pVar, 2);
                    yT.f17828y = true;
                    yT.f17822L.invoke();
                    if (yT.f17824N != null) {
                        yT.k1(false, null);
                        yT.f17825v.S(false);
                    }
                }
            }
            if ((i7 & 128) != 0 && (pVar instanceof InterfaceC2374v) && i8 != 2) {
                AbstractC2359f.v(pVar).B();
            }
            if ((i7 & 256) != 0 && (pVar instanceof InterfaceC2369p) && i8 != 2) {
                C2349D c2349dV = AbstractC2359f.v(pVar);
                K k7 = c2349dV.f17661H;
                if (!k7.f17748e && !k7.f17747d && !c2349dV.f17667P) {
                    C2471u c2471u = (C2471u) AbstractC2352G.a(c2349dV);
                    ((Q.d) c2471u.f18868R.f17787e.f13378l).b(c2349dV);
                    c2349dV.f17667P = true;
                    c2471u.A(null);
                }
            }
            if ((i7 & 4) != 0 && (pVar instanceof InterfaceC2368o)) {
                AbstractC2359f.n((InterfaceC2368o) pVar);
            }
            if ((i7 & 8) != 0 && (pVar instanceof l0)) {
                AbstractC2359f.p((l0) pVar);
            }
            if ((i7 & 64) != 0 && (pVar instanceof h0)) {
                K k8 = AbstractC2359f.v((h0) pVar).f17661H;
                k8.f17761r.f17744z = true;
                I i9 = k8.f17762s;
                if (i9 != null) {
                    i9.f17705E = true;
                }
            }
            if ((i7 & 1024) != 0 && (pVar instanceof C0866s) && i8 != 2) {
                AbstractC0851d.q((C0866s) pVar);
            }
            if ((i7 & 2048) != 0 && (pVar instanceof InterfaceC0860m)) {
                InterfaceC0860m interfaceC0860m = (InterfaceC0860m) pVar;
                C2360g.f17852b = null;
                interfaceC0860m.Q(C2360g.a);
                if (C2360g.f17852b != null) {
                    if (i8 == 2) {
                        a0.p pVar2 = ((a0.p) interfaceC0860m).f10402k;
                        if (!pVar2.f10414w) {
                            throw new IllegalStateException("visitChildren called on an unattached node");
                        }
                        Q.d dVar = new Q.d(new a0.p[16]);
                        a0.p pVar3 = pVar2.f10407p;
                        if (pVar3 == null) {
                            AbstractC2359f.b(dVar, pVar2);
                        } else {
                            dVar.b(pVar3);
                        }
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
                                                AbstractC0851d.q((C0866s) pVarF);
                                            } else if ((pVarF.f10404m & 1024) != 0 && (pVarF instanceof AbstractC2367n)) {
                                                int i10 = 0;
                                                for (a0.p pVar4 = ((AbstractC2367n) pVarF).f17880y; pVar4 != null; pVar4 = pVar4.f10407p) {
                                                    if ((pVar4.f10404m & 1024) != 0) {
                                                        i10++;
                                                        if (i10 == 1) {
                                                            pVarF = pVar4;
                                                        } else {
                                                            if (dVar2 == null) {
                                                                dVar2 = new Q.d(new a0.p[16]);
                                                            }
                                                            if (pVarF != null) {
                                                                dVar2.b(pVarF);
                                                                pVarF = null;
                                                            }
                                                            dVar2.b(pVar4);
                                                        }
                                                    }
                                                }
                                                if (i10 == 1) {
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
                    } else {
                        C0852e c0852e = ((androidx.compose.ui.focus.b) ((C2471u) AbstractC2359f.w(interfaceC0860m)).getFocusOwner()).f10655g;
                        c0852e.b(c0852e.f11393e, interfaceC0860m);
                    }
                }
            }
            if ((i7 & 4096) == 0 || !(pVar instanceof InterfaceC0850c)) {
                return;
            }
            InterfaceC0850c interfaceC0850c = (InterfaceC0850c) pVar;
            C0852e c0852e2 = ((androidx.compose.ui.focus.b) ((C2471u) AbstractC2359f.w(interfaceC0850c)).getFocusOwner()).f10655g;
            c0852e2.b(c0852e2.f11392d, interfaceC0850c);
        }
    }

    public static final void d(a0.p pVar) {
        if (pVar.f10414w) {
            b(pVar, -1, 0);
        } else {
            AbstractC0905c.C("autoInvalidateUpdatedNode called on unattached node");
            throw null;
        }
    }

    public static final int e(a0.o oVar) {
        int i7 = oVar instanceof InterfaceC2201t ? 3 : 1;
        if (oVar instanceof InterfaceC0813e) {
            i7 |= 4;
        }
        if (oVar instanceof F0.j) {
            i7 |= 8;
        }
        if (oVar instanceof s0.u) {
            i7 |= 16;
        }
        if ((oVar instanceof InterfaceC2243c) || (oVar instanceof InterfaceC2246f)) {
            i7 |= 32;
        }
        if (oVar instanceof C2322c) {
            i7 |= 256;
        }
        return oVar instanceof C1610h ? i7 | 64 : i7;
    }

    public static final int f(a0.p pVar) {
        int i7 = pVar.f10404m;
        if (i7 != 0) {
            return i7;
        }
        Class<?> cls = pVar.getClass();
        C1501v c1501v = a;
        int iC = c1501v.c(cls);
        if (iC >= 0) {
            return c1501v.f12930c[iC];
        }
        int i8 = pVar instanceof InterfaceC2375w ? 3 : 1;
        if (pVar instanceof InterfaceC2368o) {
            i8 |= 4;
        }
        if (pVar instanceof l0) {
            i8 |= 8;
        }
        if (pVar instanceof j0) {
            i8 |= 16;
        }
        if (pVar instanceof InterfaceC2245e) {
            i8 |= 32;
        }
        if (pVar instanceof h0) {
            i8 |= 64;
        }
        if (pVar instanceof InterfaceC2374v) {
            i8 |= 128;
        }
        if (pVar instanceof InterfaceC2369p) {
            i8 |= 256;
        }
        if (pVar instanceof C0866s) {
            i8 |= 1024;
        }
        if (pVar instanceof InterfaceC0860m) {
            i8 |= 2048;
        }
        if (pVar instanceof InterfaceC0850c) {
            i8 |= 4096;
        }
        if (pVar instanceof q0.d) {
            i8 |= 8192;
        }
        if (pVar instanceof C2065a) {
            i8 |= 16384;
        }
        if (pVar instanceof InterfaceC2365l) {
            i8 |= 32768;
        }
        if (pVar instanceof o0) {
            i8 |= 262144;
        }
        c1501v.f(i8, cls);
        return i8;
    }

    public static final int g(a0.p pVar) {
        if (!(pVar instanceof AbstractC2367n)) {
            return f(pVar);
        }
        AbstractC2367n abstractC2367n = (AbstractC2367n) pVar;
        int iG = abstractC2367n.f17879x;
        for (a0.p pVar2 = abstractC2367n.f17880y; pVar2 != null; pVar2 = pVar2.f10407p) {
            iG |= g(pVar2);
        }
        return iG;
    }

    public static final boolean h(int i7) {
        return (i7 & 128) != 0;
    }
}
