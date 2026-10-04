package s0;

import H.N;
import m.C1492m;
import m.C1502w;
import s.C1904b;
import y0.AbstractC2359f;
import y0.AbstractC2367n;
import y0.Y;
import y0.j0;

/* renamed from: s0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1962g extends C1904b {

    /* renamed from: b, reason: collision with root package name */
    public final a0.p f15450b;

    /* renamed from: c, reason: collision with root package name */
    public final B1.r f15451c;

    /* renamed from: d, reason: collision with root package name */
    public final C1492m f15452d;

    /* renamed from: e, reason: collision with root package name */
    public Y f15453e;

    /* renamed from: f, reason: collision with root package name */
    public C1963h f15454f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15455g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15456h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15457i;

    public C1962g(a0.p pVar) {
        super(1);
        this.f15450b = pVar;
        B1.r rVar = new B1.r();
        rVar.f357b = new long[2];
        this.f15451c = rVar;
        this.f15452d = new C1492m(2);
        this.f15456h = true;
        this.f15457i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013b  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r5v1, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    @Override // s.C1904b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(m.C1492m r44, w0.r r45, H.N r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.C1962g.a(m.m, w0.r, H.N, boolean):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // s.C1904b
    public final void c(N n7) {
        super.c(n7);
        C1963h c1963h = this.f15454f;
        if (c1963h == null) {
            return;
        }
        this.f15455g = this.f15456h;
        ?? r12 = c1963h.a;
        int size = r12.size();
        for (int i7 = 0; i7 < size; i7++) {
            r rVar = (r) r12.get(i7);
            boolean z7 = rVar.f15471d;
            long j7 = rVar.a;
            boolean zD = n7.d(j7);
            boolean z8 = this.f15456h;
            if ((!z7 && !zD) || (!z7 && !z8)) {
                B1.r rVar2 = this.f15451c;
                int i8 = rVar2.a;
                int i9 = 0;
                while (true) {
                    if (i9 >= i8) {
                        break;
                    }
                    if (j7 == rVar2.f357b[i9]) {
                        rVar2.f(i9);
                        break;
                    }
                    i9++;
                }
            }
        }
        this.f15456h = false;
        this.f15457i = c1963h.f15460d == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [Q.d] */
    public final void f() {
        Q.d dVar = this.a;
        int i7 = dVar.f7829m;
        if (i7 > 0) {
            Object[] objArr = dVar.f7827k;
            int i8 = 0;
            do {
                ((C1962g) objArr[i8]).f();
                i8++;
            } while (i8 < i7);
        }
        AbstractC2367n abstractC2367nF = this.f15450b;
        ?? dVar2 = 0;
        while (abstractC2367nF != 0) {
            if (abstractC2367nF instanceof j0) {
                ((j0) abstractC2367nF).f0();
            } else if ((abstractC2367nF.f10404m & 16) != 0 && (abstractC2367nF instanceof AbstractC2367n)) {
                a0.p pVar = abstractC2367nF.f17880y;
                int i9 = 0;
                abstractC2367nF = abstractC2367nF;
                dVar2 = dVar2;
                while (pVar != null) {
                    if ((pVar.f10404m & 16) != 0) {
                        i9++;
                        dVar2 = dVar2;
                        if (i9 == 1) {
                            abstractC2367nF = pVar;
                        } else {
                            if (dVar2 == 0) {
                                dVar2 = new Q.d(new a0.p[16]);
                            }
                            if (abstractC2367nF != 0) {
                                dVar2.b(abstractC2367nF);
                                abstractC2367nF = 0;
                            }
                            dVar2.b(pVar);
                        }
                    }
                    pVar = pVar.f10407p;
                    abstractC2367nF = abstractC2367nF;
                    dVar2 = dVar2;
                }
                if (i9 == 1) {
                }
            }
            abstractC2367nF = AbstractC2359f.f(dVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final boolean g(N n7) {
        Q.d dVar;
        int i7;
        C1492m c1492m = this.f15452d;
        boolean z7 = false;
        int i8 = 0;
        z7 = false;
        if (!(c1492m.f() == 0)) {
            a0.p pVar = this.f15450b;
            if (pVar.f10414w) {
                C1963h c1963h = this.f15454f;
                kotlin.jvm.internal.l.c(c1963h);
                Y y7 = this.f15453e;
                kotlin.jvm.internal.l.c(y7);
                long j7 = y7.f16842m;
                AbstractC2367n abstractC2367nF = pVar;
                ?? dVar2 = 0;
                while (abstractC2367nF != 0) {
                    if (abstractC2367nF instanceof j0) {
                        ((j0) abstractC2367nF).W(c1963h, EnumC1964i.f15463m, j7);
                    } else if ((abstractC2367nF.f10404m & 16) != 0 && (abstractC2367nF instanceof AbstractC2367n)) {
                        a0.p pVar2 = abstractC2367nF.f17880y;
                        int i9 = 0;
                        abstractC2367nF = abstractC2367nF;
                        dVar2 = dVar2;
                        while (pVar2 != null) {
                            if ((pVar2.f10404m & 16) != 0) {
                                i9++;
                                dVar2 = dVar2;
                                if (i9 == 1) {
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
                        if (i9 == 1) {
                        }
                    }
                    abstractC2367nF = AbstractC2359f.f(dVar2);
                }
                if (pVar.f10414w && (i7 = (dVar = this.a).f7829m) > 0) {
                    Object[] objArr = dVar.f7827k;
                    do {
                        ((C1962g) objArr[i8]).g(n7);
                        i8++;
                    } while (i8 < i7);
                }
                z7 = true;
            }
        }
        c(n7);
        c1492m.a();
        this.f15453e = null;
        return z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r0v5, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [a0.p] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [Q.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean h(N n7, boolean z7) {
        Q.d dVar;
        int i7;
        if (!(this.f15452d.f() == 0)) {
            AbstractC2367n abstractC2367nF = this.f15450b;
            if (abstractC2367nF.f10414w) {
                C1963h c1963h = this.f15454f;
                kotlin.jvm.internal.l.c(c1963h);
                Y y7 = this.f15453e;
                kotlin.jvm.internal.l.c(y7);
                long j7 = y7.f16842m;
                AbstractC2367n abstractC2367nF2 = abstractC2367nF;
                ?? dVar2 = 0;
                while (abstractC2367nF2 != 0) {
                    if (abstractC2367nF2 instanceof j0) {
                        ((j0) abstractC2367nF2).W(c1963h, EnumC1964i.f15461k, j7);
                    } else if ((abstractC2367nF2.f10404m & 16) != 0 && (abstractC2367nF2 instanceof AbstractC2367n)) {
                        a0.p pVar = abstractC2367nF2.f17880y;
                        int i8 = 0;
                        abstractC2367nF2 = abstractC2367nF2;
                        dVar2 = dVar2;
                        while (pVar != null) {
                            if ((pVar.f10404m & 16) != 0) {
                                i8++;
                                dVar2 = dVar2;
                                if (i8 == 1) {
                                    abstractC2367nF2 = pVar;
                                } else {
                                    if (dVar2 == 0) {
                                        dVar2 = new Q.d(new a0.p[16]);
                                    }
                                    if (abstractC2367nF2 != 0) {
                                        dVar2.b(abstractC2367nF2);
                                        abstractC2367nF2 = 0;
                                    }
                                    dVar2.b(pVar);
                                }
                            }
                            pVar = pVar.f10407p;
                            abstractC2367nF2 = abstractC2367nF2;
                            dVar2 = dVar2;
                        }
                        if (i8 == 1) {
                        }
                    }
                    abstractC2367nF2 = AbstractC2359f.f(dVar2);
                }
                if (abstractC2367nF.f10414w && (i7 = (dVar = this.a).f7829m) > 0) {
                    Object[] objArr = dVar.f7827k;
                    int i9 = 0;
                    do {
                        C1962g c1962g = (C1962g) objArr[i9];
                        kotlin.jvm.internal.l.c(this.f15453e);
                        c1962g.h(n7, z7);
                        i9++;
                    } while (i9 < i7);
                }
                if (abstractC2367nF.f10414w) {
                    ?? dVar3 = 0;
                    while (abstractC2367nF != 0) {
                        if (abstractC2367nF instanceof j0) {
                            ((j0) abstractC2367nF).W(c1963h, EnumC1964i.f15462l, j7);
                        } else if ((abstractC2367nF.f10404m & 16) != 0 && (abstractC2367nF instanceof AbstractC2367n)) {
                            a0.p pVar2 = abstractC2367nF.f17880y;
                            int i10 = 0;
                            abstractC2367nF = abstractC2367nF;
                            dVar3 = dVar3;
                            while (pVar2 != null) {
                                if ((pVar2.f10404m & 16) != 0) {
                                    i10++;
                                    dVar3 = dVar3;
                                    if (i10 == 1) {
                                        abstractC2367nF = pVar2;
                                    } else {
                                        if (dVar3 == 0) {
                                            dVar3 = new Q.d(new a0.p[16]);
                                        }
                                        if (abstractC2367nF != 0) {
                                            dVar3.b(abstractC2367nF);
                                            abstractC2367nF = 0;
                                        }
                                        dVar3.b(pVar2);
                                    }
                                }
                                pVar2 = pVar2.f10407p;
                                abstractC2367nF = abstractC2367nF;
                                dVar3 = dVar3;
                            }
                            if (i10 == 1) {
                            }
                        }
                        abstractC2367nF = AbstractC2359f.f(dVar3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void i(long j7, C1502w c1502w) {
        B1.r rVar = this.f15451c;
        int i7 = 0;
        if (rVar.d(j7)) {
            Object[] objArr = c1502w.a;
            int i8 = c1502w.f12934b;
            int i9 = 0;
            while (true) {
                if (i9 >= i8) {
                    i9 = -1;
                    break;
                } else if (equals(objArr[i9])) {
                    break;
                } else {
                    i9++;
                }
            }
            if (!(i9 >= 0)) {
                int i10 = rVar.a;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        break;
                    }
                    if (j7 == rVar.f357b[i11]) {
                        rVar.f(i11);
                        break;
                    }
                    i11++;
                }
                this.f15452d.e(j7);
            }
        }
        Q.d dVar = this.a;
        int i12 = dVar.f7829m;
        if (i12 > 0) {
            Object[] objArr2 = dVar.f7827k;
            do {
                ((C1962g) objArr2[i7]).i(j7, c1502w);
                i7++;
            } while (i7 < i12);
        }
    }

    public final String toString() {
        return "Node(pointerInputFilter=" + this.f15450b + ", children=" + this.a + ", pointerIds=" + this.f15451c + ')';
    }
}
