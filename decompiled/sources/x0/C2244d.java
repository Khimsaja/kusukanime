package x0;

import a0.p;
import f6.AbstractC0905c;
import java.util.HashSet;
import r0.C1861b;
import y0.AbstractC2359f;
import y0.AbstractC2367n;
import y0.C2349D;
import y0.C2356c;
import z0.C2471u;

/* renamed from: x0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2244d {
    public final C2471u a;

    /* renamed from: b, reason: collision with root package name */
    public final Q.d f17297b = new Q.d(new C2356c[16]);

    /* renamed from: c, reason: collision with root package name */
    public final Q.d f17298c = new Q.d(new C2248h[16]);

    /* renamed from: d, reason: collision with root package name */
    public final Q.d f17299d = new Q.d(new C2349D[16]);

    /* renamed from: e, reason: collision with root package name */
    public final Q.d f17300e = new Q.d(new C2248h[16]);

    /* renamed from: f, reason: collision with root package name */
    public boolean f17301f;

    public C2244d(C2471u c2471u) {
        this.a = c2471u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void b(p pVar, C2248h c2248h, HashSet hashSet) {
        p pVar2 = pVar.f10402k;
        if (!pVar2.f10414w) {
            AbstractC0905c.C("visitSubtreeIf called on an unattached node");
            throw null;
        }
        Q.d dVar = new Q.d(new p[16]);
        p pVar3 = pVar2.f10407p;
        if (pVar3 == null) {
            AbstractC2359f.b(dVar, pVar2);
        } else {
            dVar.b(pVar3);
        }
        while (dVar.l()) {
            p pVar4 = (p) dVar.n(dVar.f7829m - 1);
            if ((pVar4.f10405n & 32) != 0) {
                for (p pVar5 = pVar4; pVar5 != null; pVar5 = pVar5.f10407p) {
                    if ((pVar5.f10404m & 32) != 0) {
                        ?? dVar2 = 0;
                        AbstractC2367n abstractC2367nF = pVar5;
                        while (abstractC2367nF != 0) {
                            if (abstractC2367nF instanceof InterfaceC2245e) {
                                InterfaceC2245e interfaceC2245e = (InterfaceC2245e) abstractC2367nF;
                                if (interfaceC2245e instanceof C2356c) {
                                    C2356c c2356c = (C2356c) interfaceC2245e;
                                    if ((c2356c.f17833x instanceof InterfaceC2243c) && c2356c.f17835z.contains(c2248h)) {
                                        hashSet.add(interfaceC2245e);
                                    }
                                }
                                if (interfaceC2245e.j().q(c2248h)) {
                                    break;
                                }
                            } else if ((abstractC2367nF.f10404m & 32) != 0 && (abstractC2367nF instanceof AbstractC2367n)) {
                                p pVar6 = abstractC2367nF.f17880y;
                                int i7 = 0;
                                abstractC2367nF = abstractC2367nF;
                                dVar2 = dVar2;
                                while (pVar6 != null) {
                                    if ((pVar6.f10404m & 32) != 0) {
                                        i7++;
                                        dVar2 = dVar2;
                                        if (i7 == 1) {
                                            abstractC2367nF = pVar6;
                                        } else {
                                            if (dVar2 == 0) {
                                                dVar2 = new Q.d(new p[16]);
                                            }
                                            if (abstractC2367nF != 0) {
                                                dVar2.b(abstractC2367nF);
                                                abstractC2367nF = 0;
                                            }
                                            dVar2.b(pVar6);
                                        }
                                    }
                                    pVar6 = pVar6.f10407p;
                                    abstractC2367nF = abstractC2367nF;
                                    dVar2 = dVar2;
                                }
                                if (i7 == 1) {
                                }
                            }
                            abstractC2367nF = AbstractC2359f.f(dVar2);
                        }
                    }
                }
            }
            AbstractC2359f.b(dVar, pVar4);
        }
    }

    public final void a() {
        if (this.f17301f) {
            return;
        }
        this.f17301f = true;
        C1861b c1861b = new C1861b(4, this);
        Q.d dVar = this.a.A0;
        if (dVar.h(c1861b)) {
            return;
        }
        dVar.b(c1861b);
    }
}
