package x0;

import O.C0517t;
import a0.p;
import f6.AbstractC0905c;
import y0.AbstractC2359f;
import y0.AbstractC2367n;
import y0.C2349D;
import y0.InterfaceC2366m;
import y0.m0;

/* renamed from: x0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2245e extends InterfaceC2247g, InterfaceC2366m {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [e4.a, kotlin.jvm.internal.m] */
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
    /* JADX WARN: Type inference failed for: r9v0, types: [x0.e, y0.m] */
    @Override // x0.InterfaceC2247g
    default Object h(C2248h c2248h) {
        C0517t c0517t;
        p pVar = ((p) this).f10402k;
        boolean z7 = pVar.f10414w;
        if (!z7) {
            AbstractC0905c.B("ModifierLocal accessed from an unattached node");
            throw null;
        }
        if (!z7) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        p pVar2 = pVar.f10406o;
        C2349D c2349dV = AbstractC2359f.v(this);
        while (c2349dV != null) {
            if ((((p) c2349dV.f17660G.f7176f).f10405n & 32) != 0) {
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
                                p pVar3 = abstractC2367nF.f17880y;
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
                                                dVar = new Q.d(new p[16]);
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

    default e3.c j() {
        return C2242b.a;
    }
}
