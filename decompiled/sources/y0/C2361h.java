package y0;

import O.C0486d;
import O.InterfaceC0523w;
import O.S0;
import e0.C0810b;
import w0.InterfaceC2173H;
import z0.AbstractC2455l0;

/* renamed from: y0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2361h extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: m, reason: collision with root package name */
    public static final C2361h f17860m = new C2361h(2, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C2361h f17861n = new C2361h(2, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C2361h f17862o = new C2361h(2, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final C2361h f17863p = new C2361h(2, 3);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f17864l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2361h(int i7, int i8) {
        super(i7);
        this.f17864l = i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17864l) {
            case 0:
                ((Number) obj2).intValue();
                ((InterfaceC2364k) obj).getClass();
                break;
            case 1:
                ((C2349D) ((InterfaceC2364k) obj)).Y((InterfaceC2173H) obj2);
                break;
            case 2:
                ((C2349D) ((InterfaceC2364k) obj)).Z((a0.q) obj2);
                break;
            default:
                InterfaceC0523w interfaceC0523w = (InterfaceC0523w) obj2;
                C2349D c2349d = (C2349D) ((InterfaceC2364k) obj);
                c2349d.f17658E = interfaceC0523w;
                S0 s02 = AbstractC2455l0.f18787f;
                W.d dVar = (W.d) interfaceC0523w;
                dVar.getClass();
                c2349d.W((T0.b) C0486d.L(dVar, s02));
                T0.k kVar = (T0.k) C0486d.L(dVar, AbstractC2455l0.f18793l);
                if (c2349d.f17656C != kVar) {
                    c2349d.f17656C = kVar;
                    c2349d.B();
                    C2349D c2349dS = c2349d.s();
                    if (c2349dS != null) {
                        c2349dS.y();
                    }
                    c2349d.A();
                    a0.p pVar = (a0.p) c2349d.f17660G.f7176f;
                    if ((pVar.f10405n & 4) != 0) {
                        while (pVar != null) {
                            if ((pVar.f10404m & 4) != 0) {
                                AbstractC2367n abstractC2367nF = pVar;
                                ?? dVar2 = 0;
                                while (abstractC2367nF != 0) {
                                    if (abstractC2367nF instanceof InterfaceC2368o) {
                                        InterfaceC2368o interfaceC2368o = (InterfaceC2368o) abstractC2367nF;
                                        if (interfaceC2368o instanceof C0810b) {
                                            ((C0810b) interfaceC2368o).G0();
                                        }
                                    } else if ((abstractC2367nF.f10404m & 4) != 0 && (abstractC2367nF instanceof AbstractC2367n)) {
                                        a0.p pVar2 = abstractC2367nF.f17880y;
                                        int i7 = 0;
                                        abstractC2367nF = abstractC2367nF;
                                        dVar2 = dVar2;
                                        while (pVar2 != null) {
                                            if ((pVar2.f10404m & 4) != 0) {
                                                i7++;
                                                dVar2 = dVar2;
                                                if (i7 == 1) {
                                                    abstractC2367nF = pVar2;
                                                } else {
                                                    if (dVar2 == 0) {
                                                        dVar2 = new Q.d(new a0.p[16]);
                                                    }
                                                    if (abstractC2367nF != 0) {
                                                        dVar2.b(abstractC2367nF);
                                                        abstractC2367nF = 0;
                                                    }
                                                    dVar2.b(pVar2);
                                                }
                                            }
                                            pVar2 = pVar2.f10407p;
                                            abstractC2367nF = abstractC2367nF;
                                            dVar2 = dVar2;
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    abstractC2367nF = AbstractC2359f.f(dVar2);
                                }
                            }
                            if ((pVar.f10405n & 4) != 0) {
                                pVar = pVar.f10407p;
                            }
                        }
                    }
                }
                z0.S0 s03 = (z0.S0) C0486d.L(dVar, AbstractC2455l0.f18798q);
                if (!kotlin.jvm.internal.l.a(c2349d.f17657D, s03)) {
                    c2349d.f17657D = s03;
                    a0.p pVar3 = (a0.p) c2349d.f17660G.f7176f;
                    if ((pVar3.f10405n & 16) != 0) {
                        while (pVar3 != null) {
                            if ((pVar3.f10404m & 16) != 0) {
                                AbstractC2367n abstractC2367nF2 = pVar3;
                                ?? dVar3 = 0;
                                while (abstractC2367nF2 != 0) {
                                    if (abstractC2367nF2 instanceof j0) {
                                        ((j0) abstractC2367nF2).c0();
                                    } else if ((abstractC2367nF2.f10404m & 16) != 0 && (abstractC2367nF2 instanceof AbstractC2367n)) {
                                        a0.p pVar4 = abstractC2367nF2.f17880y;
                                        int i8 = 0;
                                        abstractC2367nF2 = abstractC2367nF2;
                                        dVar3 = dVar3;
                                        while (pVar4 != null) {
                                            if ((pVar4.f10404m & 16) != 0) {
                                                i8++;
                                                dVar3 = dVar3;
                                                if (i8 == 1) {
                                                    abstractC2367nF2 = pVar4;
                                                } else {
                                                    if (dVar3 == 0) {
                                                        dVar3 = new Q.d(new a0.p[16]);
                                                    }
                                                    if (abstractC2367nF2 != 0) {
                                                        dVar3.b(abstractC2367nF2);
                                                        abstractC2367nF2 = 0;
                                                    }
                                                    dVar3.b(pVar4);
                                                }
                                            }
                                            pVar4 = pVar4.f10407p;
                                            abstractC2367nF2 = abstractC2367nF2;
                                            dVar3 = dVar3;
                                        }
                                        if (i8 == 1) {
                                        }
                                    }
                                    abstractC2367nF2 = AbstractC2359f.f(dVar3);
                                }
                            }
                            if ((pVar3.f10405n & 16) != 0) {
                                pVar3 = pVar3.f10407p;
                            }
                        }
                    }
                }
                a0.p pVar5 = (a0.p) c2349d.f17660G.f7176f;
                if ((pVar5.f10405n & 32768) != 0) {
                    while (pVar5 != null) {
                        if ((pVar5.f10404m & 32768) != 0) {
                            AbstractC2367n abstractC2367nF3 = pVar5;
                            ?? dVar4 = 0;
                            while (abstractC2367nF3 != 0) {
                                if (abstractC2367nF3 instanceof InterfaceC2365l) {
                                    a0.p pVar6 = ((a0.p) ((InterfaceC2365l) abstractC2367nF3)).f10402k;
                                    if (pVar6.f10414w) {
                                        Z.d(pVar6);
                                    } else {
                                        pVar6.f10411t = true;
                                    }
                                } else if ((abstractC2367nF3.f10404m & 32768) != 0 && (abstractC2367nF3 instanceof AbstractC2367n)) {
                                    a0.p pVar7 = abstractC2367nF3.f17880y;
                                    int i9 = 0;
                                    abstractC2367nF3 = abstractC2367nF3;
                                    dVar4 = dVar4;
                                    while (pVar7 != null) {
                                        if ((pVar7.f10404m & 32768) != 0) {
                                            i9++;
                                            dVar4 = dVar4;
                                            if (i9 == 1) {
                                                abstractC2367nF3 = pVar7;
                                            } else {
                                                if (dVar4 == 0) {
                                                    dVar4 = new Q.d(new a0.p[16]);
                                                }
                                                if (abstractC2367nF3 != 0) {
                                                    dVar4.b(abstractC2367nF3);
                                                    abstractC2367nF3 = 0;
                                                }
                                                dVar4.b(pVar7);
                                            }
                                        }
                                        pVar7 = pVar7.f10407p;
                                        abstractC2367nF3 = abstractC2367nF3;
                                        dVar4 = dVar4;
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                abstractC2367nF3 = AbstractC2359f.f(dVar4);
                            }
                        }
                        if ((pVar5.f10405n & 32768) != 0) {
                            pVar5 = pVar5.f10407p;
                        }
                    }
                }
                break;
        }
        return O3.C.a;
    }
}
