package O;

import H5.C0263e0;
import H5.InterfaceC0265f0;
import K5.C0332k;
import P.C0556a;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import m.AbstractC1476F;
import m.C1472B;

/* renamed from: O.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0486d {
    public static final C0481a0 a = new C0481a0("provider");

    /* renamed from: b, reason: collision with root package name */
    public static final C0481a0 f7058b = new C0481a0("provider");

    /* renamed from: c, reason: collision with root package name */
    public static final C0481a0 f7059c = new C0481a0("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    public static final C0481a0 f7060d = new C0481a0("providers");

    /* renamed from: e, reason: collision with root package name */
    public static final C0481a0 f7061e = new C0481a0("reference");

    /* renamed from: f, reason: collision with root package name */
    public static final B2.e f7062f = new B2.e(5);

    /* renamed from: g, reason: collision with root package name */
    public static final Object f7063g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static final H f7064h = new H();

    public static final void A(D0 d02, C0517t c0517t) {
        int i7;
        int iC;
        int iO;
        int i8 = d02.f6985t;
        int i9 = d02.f6986u;
        while (i8 < i9) {
            Object objW = d02.w(i8);
            if (objW instanceof InterfaceC0498j) {
                c0517t.h((InterfaceC0498j) objW, d02.o() - d02.E(d02.f6967b, d02.p(i8)), -1, -1);
            }
            int iE = d02.E(d02.f6967b, d02.p(i8));
            int i10 = i8 + 1;
            int iF = d02.f(d02.f6967b, d02.p(i10));
            int i11 = iE;
            while (i11 < iF) {
                int i12 = i11 - iE;
                Object obj = d02.f6968c[d02.g(i11)];
                boolean z7 = obj instanceof x0;
                T t7 = C0502l.a;
                if (z7) {
                    x0 x0Var = (x0) obj;
                    w0 w0Var = x0Var.a;
                    if (w0Var instanceof C0504m) {
                        i7 = i9;
                    } else {
                        int iG = d02.g(d02.F(i8, i12));
                        Object[] objArr = d02.f6968c;
                        i7 = i9;
                        Object obj2 = objArr[iG];
                        objArr[iG] = t7;
                        if (obj != obj2) {
                            w("Slot table is out of sync");
                            throw null;
                        }
                        int iO2 = d02.o() - i12;
                        C0484c c0484c = x0Var.f7243b;
                        if (c0484c == null || !c0484c.a()) {
                            iC = -1;
                            iO = -1;
                        } else {
                            iC = d02.c(c0484c);
                            iO = d02.o() - d02.f(d02.f6967b, d02.p(d02.q(iC) + iC));
                        }
                        c0517t.h(w0Var, iO2, iC, iO);
                    }
                } else {
                    i7 = i9;
                    if (obj instanceof C0509o0) {
                        int iG2 = d02.g(d02.F(i8, i12));
                        Object[] objArr2 = d02.f6968c;
                        Object obj3 = objArr2[iG2];
                        objArr2[iG2] = t7;
                        if (obj != obj3) {
                            w("Slot table is out of sync");
                            throw null;
                        }
                        ((C0509o0) obj).d();
                    } else {
                        continue;
                    }
                }
                i11++;
                i9 = i7;
            }
            i8 = i10;
        }
    }

    public static final Q.d B() {
        B2.l lVar = J0.f7001b;
        Q.d dVar = (Q.d) lVar.s();
        if (dVar != null) {
            return dVar;
        }
        Q.d dVar2 = new Q.d(new C0508o[0]);
        lVar.L(dVar2);
        return dVar2;
    }

    public static final E C(I0 i02, InterfaceC0821a interfaceC0821a) {
        B2.l lVar = J0.a;
        return new E(i02, interfaceC0821a);
    }

    public static final E D(InterfaceC0821a interfaceC0821a) {
        B2.l lVar = J0.a;
        return new E(null, interfaceC0821a);
    }

    public static final int E(int i7, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) >>> 1;
            int iG = kotlin.jvm.internal.l.g(((N) arrayList.get(i9)).f7018b, i7);
            if (iG < 0) {
                i8 = i9 + 1;
            } else {
                if (iG <= 0) {
                    return i9;
                }
                size = i9 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static final U F(S3.h hVar) {
        U u5 = (U) hVar.get(T.f7045l);
        if (u5 != null) {
            return u5;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final void G(C0510p c0510p, e4.n nVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>", nVar);
        kotlin.jvm.internal.B.e(2, nVar);
        nVar.invoke(c0510p, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List H(D0 d02, int i7, D0 d03, boolean z7, boolean z8, boolean z9) {
        P3.y yVar;
        boolean zB;
        C0484c c0484cI;
        int i8;
        int i9;
        int iQ = d02.q(i7);
        int i10 = i7 + iQ;
        int iF = d02.f(d02.f6967b, d02.p(i7));
        int iF2 = d02.f(d02.f6967b, d02.p(i10));
        int i11 = iF2 - iF;
        boolean z10 = i7 >= 0 && (d02.f6967b[(d02.p(i7) * 5) + 1] & 201326592) != 0;
        d03.r(iQ);
        d03.s(i11, d03.f6985t);
        if (d02.f6972g < i10) {
            d02.u(i10);
        }
        if (d02.f6976k < iF2) {
            d02.v(iF2, i10);
        }
        int[] iArr = d03.f6967b;
        int i12 = d03.f6985t;
        int i13 = i12 * 5;
        P3.m.V(i13, i7 * 5, i10 * 5, d02.f6967b, iArr);
        Object[] objArr = d03.f6968c;
        int i14 = d03.f6974i;
        P3.m.W(i14, iF, iF2, d02.f6968c, objArr);
        int i15 = d03.f6987v;
        iArr[i13 + 2] = i15;
        int i16 = i12 - i7;
        int i17 = i12 + iQ;
        int iF3 = i14 - d03.f(iArr, i12);
        int i18 = d03.f6978m;
        int i19 = d03.f6977l;
        int length = objArr.length;
        boolean z11 = z10;
        int i20 = i18;
        int i21 = i12;
        while (i21 < i17) {
            if (i21 != i12) {
                int i22 = (i21 * 5) + 2;
                iArr[i22] = iArr[i22] + i16;
            }
            int i23 = i16;
            int iF4 = d03.f(iArr, i21) + iF3;
            if (i20 < i21) {
                i8 = i17;
                i9 = 0;
            } else {
                i8 = i17;
                i9 = d03.f6976k;
            }
            iArr[(i21 * 5) + 4] = D0.h(iF4, i9, i19, length);
            if (i21 == i20) {
                i20++;
            }
            i21++;
            i17 = i8;
            i16 = i23;
        }
        int i24 = i16;
        int i25 = i17;
        d03.f6978m = i20;
        int iN = n(d02.f6969d, i7, d02.n());
        int iN2 = n(d02.f6969d, i10, d02.n());
        if (iN < iN2) {
            ArrayList arrayList = d02.f6969d;
            ArrayList arrayList2 = new ArrayList(iN2 - iN);
            for (int i26 = iN; i26 < iN2; i26++) {
                C0484c c0484c = (C0484c) arrayList.get(i26);
                c0484c.a += i24;
                arrayList2.add(c0484c);
            }
            d03.f6969d.addAll(n(d03.f6969d, d03.f6985t, d03.n()), arrayList2);
            arrayList.subList(iN, iN2).clear();
            yVar = arrayList2;
        } else {
            yVar = P3.y.f7779k;
        }
        if (!yVar.isEmpty()) {
            HashMap map = d02.f6970e;
            HashMap map2 = d03.f6970e;
            if (map != null && map2 != null) {
                int size = yVar.size();
                for (int i27 = 0; i27 < size; i27++) {
                }
            }
        }
        int i28 = d03.f6987v;
        HashMap map3 = d03.f6970e;
        if (map3 != null && (c0484cI = d03.I(i15)) != null) {
        }
        int iX = d02.x(d02.f6967b, i7);
        if (!z9) {
            zB = false;
        } else if (z7) {
            boolean z12 = iX >= 0;
            if (z12) {
                d02.G();
                d02.a(iX - d02.f6985t);
                d02.G();
            }
            d02.a(i7 - d02.f6985t);
            boolean zA = d02.A();
            if (z12) {
                d02.D();
                d02.i();
                d02.D();
                d02.i();
            }
            zB = zA;
        } else {
            zB = d02.B(i7, iQ);
            d02.C(iF, i11, i7 - 1);
        }
        if (zB) {
            w("Unexpectedly removed anchors");
            throw null;
        }
        d03.f6980o += m(iArr, i12) ? 1 : o(iArr, i12);
        if (z8) {
            d03.f6985t = i25;
            d03.f6974i = i14 + i11;
        }
        if (z11) {
            d03.K(i15);
        }
        return yVar;
    }

    public static final C0485c0 I(float f5) {
        int i7 = AbstractC0482b.f7056b;
        return new C0485c0(f5);
    }

    public static final C0487d0 J(int i7) {
        int i8 = AbstractC0482b.f7056b;
        return new C0487d0(i7);
    }

    public static final C0493g0 K(Object obj, I0 i02) {
        int i7 = AbstractC0482b.f7056b;
        return new C0493g0(obj, i02);
    }

    public static final Object L(InterfaceC0501k0 interfaceC0501k0, AbstractC0505m0 abstractC0505m0) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>", abstractC0505m0);
        W.d dVar = (W.d) interfaceC0501k0;
        Object objB = dVar.get(abstractC0505m0);
        if (objB == null) {
            objB = abstractC0505m0.b();
        }
        return ((U0) objB).a(dVar);
    }

    public static final C0506n M(C0510p c0510p) {
        C0510p c0510p2;
        c0510p.P(206, f7061e);
        if (c0510p.f7127O) {
            D0 d02 = c0510p.f7122H;
            int i7 = d02.f6987v;
            int iP = d02.p(i7);
            int[] iArr = d02.f6967b;
            int i8 = (iP * 5) + 1;
            int i9 = iArr[i8];
            if ((i9 & 134217728) == 0) {
                iArr[i8] = i9 | 134217728;
                if (!h(iArr, iP)) {
                    d02.K(d02.x(d02.f6967b, i7));
                }
            }
        }
        Object objA = c0510p.A();
        C0504m c0504m = objA instanceof C0504m ? (C0504m) objA : null;
        if (c0504m == null) {
            c0510p2 = c0510p;
            c0504m = new C0504m(new C0506n(c0510p2, c0510p.f7128P, c0510p.f7143p, c0510p.f7116B, c0510p.f7134g.f7206z));
            c0510p2.c0(c0504m);
        } else {
            c0510p2 = c0510p;
        }
        InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
        C0506n c0506n = c0504m.f7096k;
        c0506n.f7101f.setValue(interfaceC0501k0M);
        c0510p2.p(false);
        return c0506n;
    }

    public static final Z N(Object obj, C0510p c0510p) {
        Object objH = c0510p.H();
        if (objH == C0502l.a) {
            objH = K(obj, T.f7049p);
            c0510p.b0(objH);
        }
        Z z7 = (Z) objH;
        z7.setValue(obj);
        return z7;
    }

    public static final void O(D0 d02, C0517t c0517t) {
        int iO;
        int[] iArr = d02.f6967b;
        int i7 = d02.f6985t;
        int iF = d02.f(iArr, d02.p(d02.q(i7) + i7));
        for (int iF2 = d02.f(d02.f6967b, d02.p(d02.f6985t)); iF2 < iF; iF2++) {
            Object obj = d02.f6968c[d02.g(iF2)];
            int iC = -1;
            if (obj instanceof InterfaceC0498j) {
                int iO2 = d02.o() - iF2;
                InterfaceC0498j interfaceC0498j = (InterfaceC0498j) obj;
                C1472B c1472b = (C1472B) c0517t.f7177g;
                if (c1472b == null) {
                    int i8 = AbstractC1476F.a;
                    c1472b = new C1472B();
                    c0517t.f7177g = c1472b;
                }
                c1472b.f12864b[c1472b.d(interfaceC0498j)] = interfaceC0498j;
                c0517t.h(interfaceC0498j, iO2, -1, -1);
            }
            if (obj instanceof x0) {
                int iO3 = d02.o() - iF2;
                x0 x0Var = (x0) obj;
                C0484c c0484c = x0Var.f7243b;
                if (c0484c == null || !c0484c.a()) {
                    iO = -1;
                } else {
                    iC = d02.c(c0484c);
                    iO = d02.o() - d02.f(d02.f6967b, d02.p(d02.q(iC) + iC));
                }
                c0517t.h(x0Var.a, iO3, iC, iO);
            }
            if (obj instanceof C0509o0) {
                ((C0509o0) obj).d();
            }
        }
        d02.A();
    }

    public static final void P(boolean z7) {
        if (z7) {
            return;
        }
        w("Check failed");
        throw null;
    }

    public static final int Q(ArrayList arrayList, int i7, int i8) {
        int size = arrayList.size() - 1;
        int i9 = 0;
        while (i9 <= size) {
            int i10 = (i9 + size) >>> 1;
            int i11 = ((C0484c) arrayList.get(i10)).a;
            if (i11 < 0) {
                i11 += i8;
            }
            int iG = kotlin.jvm.internal.l.g(i11, i7);
            if (iG < 0) {
                i9 = i10 + 1;
            } else {
                if (iG <= 0) {
                    return i10;
                }
                size = i10 - 1;
            }
        }
        return -(i9 + 1);
    }

    public static final void R(C0510p c0510p, e4.n nVar, Object obj) {
        if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), obj)) {
            c0510p.b0(obj);
            c0510p.b(obj, nVar);
        }
    }

    public static final C0332k S(InterfaceC0821a interfaceC0821a) {
        return new C0332k(new P0(null, interfaceC0821a));
    }

    public static final void T(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void U(String str) {
        throw new IllegalStateException(str);
    }

    public static final int V(int i7) {
        int i8 = 306783378 & i7;
        int i9 = 613566756 & i7;
        return (i7 & (-920350135)) | (i9 >> 1) | i8 | ((i8 << 1) & i9);
    }

    public static final W.d W(C0507n0[] c0507n0Arr, InterfaceC0501k0 interfaceC0501k0, InterfaceC0501k0 interfaceC0501k02) {
        W.c cVar = new W.c(W.d.f9511n);
        for (C0507n0 c0507n0 : c0507n0Arr) {
            AbstractC0505m0 abstractC0505m0 = c0507n0.a;
            if (c0507n0.f7107f || !((W.d) interfaceC0501k0).containsKey(abstractC0505m0)) {
                cVar.put(abstractC0505m0, abstractC0505m0.c(c0507n0, (U0) ((W.d) interfaceC0501k02).get(abstractC0505m0)));
            }
        }
        return cVar.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(O.C0507n0 r10, e4.n r11, O.C0510p r12, int r13) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0486d.a(O.n0, e4.n, O.p, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v4, types: [O.k0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(O.C0507n0[] r7, e4.n r8, O.C0510p r9, int r10) {
        /*
            r0 = -1390796515(0xffffffffad1a211d, float:-8.761239E-12)
            r9.T(r0)
            O.k0 r0 = r9.m()
            O.a0 r1 = O.C0486d.f7058b
            r2 = 201(0xc9, float:2.82E-43)
            r9.P(r2, r1)
            boolean r1 = r9.f7127O
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L25
            W.d r1 = W.d.f9511n
            W.d r1 = W(r7, r0, r1)
            W.d r0 = r9.a0(r0, r1)
            r9.I = r3
        L23:
            r1 = r2
            goto L72
        L25:
            O.A0 r1 = r9.f7120F
            int r4 = r1.f6935g
            java.lang.Object r1 = r1.g(r4, r2)
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            kotlin.jvm.internal.l.d(r4, r1)
            O.k0 r1 = (O.InterfaceC0501k0) r1
            O.A0 r5 = r9.f7120F
            int r6 = r5.f6935g
            java.lang.Object r5 = r5.g(r6, r3)
            kotlin.jvm.internal.l.d(r4, r5)
            O.k0 r5 = (O.InterfaceC0501k0) r5
            W.d r4 = W(r7, r0, r5)
            boolean r6 = r9.y()
            if (r6 == 0) goto L63
            boolean r6 = r9.f7151x
            if (r6 != 0) goto L63
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L56
            goto L63
        L56:
            int r0 = r9.f7138k
            O.A0 r4 = r9.f7120F
            int r4 = r4.l()
            int r4 = r4 + r0
            r9.f7138k = r4
            r0 = r1
            goto L23
        L63:
            W.d r0 = r9.a0(r0, r4)
            boolean r4 = r9.f7151x
            if (r4 != 0) goto L71
            boolean r1 = kotlin.jvm.internal.l.a(r0, r1)
            if (r1 != 0) goto L23
        L71:
            r1 = r3
        L72:
            if (r1 == 0) goto L7b
            boolean r4 = r9.f7127O
            if (r4 != 0) goto L7b
            r9.F(r0)
        L7b:
            boolean r4 = r9.f7149v
            O.M r5 = r9.f7150w
            r5.b(r4)
            r9.f7149v = r1
            r9.J = r0
            O.a0 r1 = O.C0486d.f7059c
            r4 = 202(0xca, float:2.83E-43)
            r9.N(r4, r2, r1, r0)
            int r0 = r10 >> 3
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.invoke(r9, r0)
            r9.p(r2)
            r9.p(r2)
            int r0 = r5.a()
            if (r0 == 0) goto La5
            r2 = r3
        La5:
            r9.f7149v = r2
            r0 = 0
            r9.J = r0
            O.o0 r9 = r9.s()
            if (r9 == 0) goto Lb8
            D.m r0 = new D.m
            r1 = 3
            r0.<init>(r10, r1, r7, r8)
            r9.f7111d = r0
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0486d.b(O.n0[], e4.n, O.p, int):void");
    }

    public static final void c(Object obj, e4.k kVar, C0510p c0510p) {
        boolean zF = c0510p.f(obj);
        Object objH = c0510p.H();
        if (zF || objH == C0502l.a) {
            objH = new F(kVar);
            c0510p.b0(objH);
        }
    }

    public static final void d(Object obj, Object obj2, e4.k kVar, C0510p c0510p) {
        boolean zF = c0510p.f(obj) | c0510p.f(obj2);
        Object objH = c0510p.H();
        if (zF || objH == C0502l.a) {
            objH = new F(kVar);
            c0510p.b0(objH);
        }
    }

    public static final void e(C0510p c0510p, e4.n nVar, Object obj) {
        S3.h hVarH = c0510p.f7129b.h();
        boolean zF = c0510p.f(obj);
        Object objH = c0510p.H();
        if (zF || objH == C0502l.a) {
            objH = new Q(hVarH, nVar);
            c0510p.b0(objH);
        }
    }

    public static final void f(Object obj, Object obj2, e4.n nVar, C0510p c0510p) {
        S3.h hVarH = c0510p.f7129b.h();
        boolean zF = c0510p.f(obj) | c0510p.f(obj2);
        Object objH = c0510p.H();
        if (zF || objH == C0502l.a) {
            objH = new Q(hVarH, nVar);
            c0510p.b0(objH);
        }
    }

    public static final void g(InterfaceC0821a interfaceC0821a, C0510p c0510p) {
        C0556a c0556a = c0510p.f7124L.f7652b;
        c0556a.getClass();
        P.v vVar = P.v.f7687c;
        P.D d4 = c0556a.f7651i;
        d4.g0(vVar);
        n6.d.c0(d4, 0, interfaceC0821a);
        int i7 = d4.f7649o;
        int i8 = vVar.a;
        int iZ = P.D.Z(d4, i8);
        int i9 = vVar.f7642b;
        if (i7 == iZ && d4.f7650p == P.D.Z(d4, i9)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            if (((1 << i11) & d4.f7649o) != 0) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(vVar.b(i11));
                i10++;
            }
        }
        String string = sb.toString();
        StringBuilder sbL = A6.b.l(string, "StringBuilder().apply(builderAction).toString()");
        int i12 = 0;
        for (int i13 = 0; i13 < i9; i13++) {
            if (((1 << i13) & d4.f7650p) != 0) {
                if (i10 > 0) {
                    sbL.append(", ");
                }
                sbL.append(vVar.c(i13));
                i12++;
            }
        }
        String string2 = sbL.toString();
        kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string2);
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(vVar);
        sb2.append(". Not all arguments were provided. Missing ");
        A6.b.q(sb2, i10, " int arguments (", string, ") and ");
        A6.b.s(sb2, i12, " object arguments (", string2, ").");
        throw null;
    }

    public static final boolean h(int[] iArr, int i7) {
        return (iArr[(i7 * 5) + 1] & 67108864) != 0;
    }

    public static final int i(int[] iArr, int i7) {
        return iArr[(i7 * 5) + 4];
    }

    public static final int j(int[] iArr, int i7) {
        return iArr[(i7 * 5) + 3];
    }

    public static final boolean k(int[] iArr, int i7) {
        return (iArr[(i7 * 5) + 1] & 268435456) != 0;
    }

    public static final boolean l(int[] iArr, int i7) {
        return (iArr[(i7 * 5) + 1] & 536870912) != 0;
    }

    public static final boolean m(int[] iArr, int i7) {
        return (iArr[(i7 * 5) + 1] & 1073741824) != 0;
    }

    public static final int n(ArrayList arrayList, int i7, int i8) {
        int iQ = Q(arrayList, i7, i8);
        return iQ >= 0 ? iQ : -(iQ + 1);
    }

    public static final int o(int[] iArr, int i7) {
        return iArr[(i7 * 5) + 1] & 67108863;
    }

    public static final int p(int[] iArr, int i7) {
        return iArr[(i7 * 5) + 2];
    }

    public static final void q(ArrayList arrayList, int i7, int i8) {
        int iE = E(i7, arrayList);
        if (iE < 0) {
            iE = -(iE + 1);
        }
        while (iE < arrayList.size() && ((N) arrayList.get(iE)).f7018b < i8) {
            arrayList.remove(iE);
        }
    }

    public static final int r(int[] iArr, int i7) {
        int i8 = i7 * 5;
        int i9 = iArr[i8 + 4];
        int i10 = 1;
        switch (iArr[i8 + 1] >> 28) {
            case 0:
                i10 = 0;
                break;
            case 1:
            case 2:
            case GzipHeaderFlags.EXTRA /* 4 */:
                break;
            case 3:
            case 5:
            case 6:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        return i10 + i9;
    }

    public static final void s(int i7, int i8, int[] iArr) {
        P(i8 >= 0);
        iArr[(i7 * 5) + 3] = i8;
    }

    public static final void t(int i7, int i8, int[] iArr) {
        P(i8 >= 0 && i8 < 67108863);
        int i9 = (i7 * 5) + 1;
        iArr[i9] = i8 | (iArr[i9] & (-67108864));
    }

    public static final Z u(K5.J j7, Object obj, S3.h hVar, C0510p c0510p, int i7, int i8) {
        if ((i8 & 2) != 0) {
            hVar = S3.i.f8767k;
        }
        boolean zH = c0510p.h(hVar) | c0510p.h(j7);
        Object objH = c0510p.H();
        Object obj2 = C0502l.a;
        if (zH || objH == obj2) {
            objH = new O0(hVar, j7, null);
            c0510p.b0(objH);
        }
        e4.n nVar = (e4.n) objH;
        Object objH2 = c0510p.H();
        if (objH2 == obj2) {
            objH2 = K(obj, T.f7049p);
            c0510p.b0(objH2);
        }
        Z z7 = (Z) objH2;
        boolean zH2 = c0510p.h(nVar);
        Object objH3 = c0510p.H();
        if (zH2 || objH3 == obj2) {
            objH3 = new L0(nVar, z7, null);
            c0510p.b0(objH3);
        }
        f(j7, hVar, (e4.n) objH3, c0510p);
        return z7;
    }

    public static final Z v(K5.W w7, C0510p c0510p) {
        return u(w7, w7.getValue(), S3.i.f8767k, c0510p, 0, 0);
    }

    public static final void w(String str) {
        throw new C0500k(AbstractC0703b.j("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void x(String str) {
        throw new C0500k(AbstractC0703b.j("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final M5.c y(C0510p c0510p) {
        S3.i iVar = S3.i.f8767k;
        C0263e0 c0263e0 = C0263e0.f3843k;
        S3.h hVarH = c0510p.f7129b.h();
        return H5.D.c(hVarH.plus(new H5.h0((InterfaceC0265f0) hVarH.get(c0263e0))).plus(iVar));
    }

    public static final long z() {
        return Thread.currentThread().getId();
    }
}
