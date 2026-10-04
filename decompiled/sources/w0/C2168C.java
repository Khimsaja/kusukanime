package w0;

import O.C0517t;
import f6.AbstractC0905c;
import s0.C1966k;
import y0.AbstractC2352G;
import y0.AbstractC2359f;
import y0.AbstractC2367n;
import y0.C2349D;
import y0.n0;
import y0.o0;
import z0.C2471u;

/* renamed from: w0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2168C implements Y {
    public final /* synthetic */ C2169D a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16815b;

    public C2168C(C2169D c2169d, Object obj) {
        this.a = c2169d;
        this.f16815b = obj;
    }

    @Override // w0.Y
    public final int a() {
        C2349D c2349d = (C2349D) this.a.f16825t.get(this.f16815b);
        if (c2349d != null) {
            return ((Q.a) c2349d.n()).f7821k.f7829m;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [s0.k] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [a0.p] */
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
    @Override // w0.Y
    public final void b(C1966k c1966k) {
        C0517t c0517t;
        a0.p pVar;
        n0 n0Var;
        C2349D c2349d = (C2349D) this.a.f16825t.get(this.f16815b);
        if (c2349d == null || (c0517t = c2349d.f17660G) == null || (pVar = (a0.p) c0517t.f7176f) == null) {
            return;
        }
        a0.p pVar2 = pVar.f10402k;
        if (!pVar2.f10414w) {
            AbstractC0905c.C("visitSubtreeIf called on an unattached node");
            throw null;
        }
        Q.d dVar = new Q.d(new a0.p[16]);
        a0.p pVar3 = pVar2.f10407p;
        if (pVar3 == null) {
            AbstractC2359f.b(dVar, pVar2);
        } else {
            dVar.b(pVar3);
        }
        while (dVar.l()) {
            a0.p pVar4 = (a0.p) dVar.n(dVar.f7829m - 1);
            if ((pVar4.f10405n & 262144) != 0) {
                for (a0.p pVar5 = pVar4; pVar5 != null; pVar5 = pVar5.f10407p) {
                    if ((pVar5.f10404m & 262144) != 0) {
                        ?? dVar2 = 0;
                        AbstractC2367n abstractC2367nF = pVar5;
                        while (abstractC2367nF != 0) {
                            if (abstractC2367nF instanceof o0) {
                                o0 o0Var = (o0) abstractC2367nF;
                                boolean zEquals = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(o0Var.p());
                                n0 n0Var2 = n0.f17882l;
                                if (zEquals) {
                                    c1966k.invoke(o0Var);
                                    n0Var = n0Var2;
                                } else {
                                    n0Var = n0.f17881k;
                                }
                                if (n0Var == n0.f17883m) {
                                    return;
                                }
                                if (n0Var == n0Var2) {
                                    break;
                                }
                            } else if ((abstractC2367nF.f10404m & 262144) != 0 && (abstractC2367nF instanceof AbstractC2367n)) {
                                a0.p pVar6 = abstractC2367nF.f17880y;
                                int i7 = 0;
                                abstractC2367nF = abstractC2367nF;
                                dVar2 = dVar2;
                                while (pVar6 != null) {
                                    if ((pVar6.f10404m & 262144) != 0) {
                                        i7++;
                                        dVar2 = dVar2;
                                        if (i7 == 1) {
                                            abstractC2367nF = pVar6;
                                        } else {
                                            if (dVar2 == 0) {
                                                dVar2 = new Q.d(new a0.p[16]);
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

    @Override // w0.Y
    public final void c(int i7, long j7) {
        C2169D c2169d = this.a;
        C2349D c2349d = (C2349D) c2169d.f16825t.get(this.f16815b);
        if (c2349d == null || !c2349d.E()) {
            return;
        }
        int i8 = ((Q.a) c2349d.n()).f7821k.f7829m;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException("Index (" + i7 + ") is out of bound of [0, " + i8 + ')');
        }
        if (c2349d.F()) {
            throw new IllegalArgumentException("Pre-measure called on node that is not placed");
        }
        C2349D c2349d2 = c2169d.f16816k;
        c2349d2.f17682v = true;
        ((C2471u) AbstractC2352G.a(c2349d)).q((C2349D) ((Q.a) c2349d.n()).get(i7), j7);
        c2349d2.f17682v = false;
    }

    @Override // w0.Y
    public final void dispose() {
        C2169D c2169d = this.a;
        c2169d.e();
        C2349D c2349d = (C2349D) c2169d.f16825t.remove(this.f16815b);
        if (c2349d != null) {
            if (c2169d.f16830y <= 0) {
                throw new IllegalStateException("No pre-composed items to dispose");
            }
            C2349D c2349d2 = c2169d.f16816k;
            int iJ = ((Q.a) c2349d2.p()).f7821k.j(c2349d);
            int i7 = ((Q.a) c2349d2.p()).f7821k.f7829m;
            int i8 = c2169d.f16830y;
            if (iJ < i7 - i8) {
                throw new IllegalStateException("Item is not in pre-composed item range");
            }
            c2169d.f16829x++;
            c2169d.f16830y = i8 - 1;
            int i9 = (((Q.a) c2349d2.p()).f7821k.f7829m - c2169d.f16830y) - c2169d.f16829x;
            c2349d2.f17682v = true;
            c2349d2.I(iJ, i9, 1);
            c2349d2.f17682v = false;
            c2169d.d(i9);
        }
    }
}
