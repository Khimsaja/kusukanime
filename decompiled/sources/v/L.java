package v;

import b1.AbstractC0703b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import m.AbstractC1489j;
import m.C1487h;
import m.C1495p;
import m.C1496q;
import p.AbstractC1755i;
import s0.C1958c;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import w0.InterfaceC2176K;
import w0.InterfaceC2197o;

/* loaded from: classes.dex */
public final class L implements InterfaceC2176K, b0 {
    public final InterfaceC2126e a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2128g f16390b;

    /* renamed from: c, reason: collision with root package name */
    public final float f16391c;

    /* renamed from: d, reason: collision with root package name */
    public final C2144x f16392d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16393e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16394f;

    /* renamed from: g, reason: collision with root package name */
    public final I f16395g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlin.jvm.internal.m f16396h = K.f16386m;

    /* renamed from: i, reason: collision with root package name */
    public final kotlin.jvm.internal.m f16397i = K.f16387n;

    /* renamed from: j, reason: collision with root package name */
    public final kotlin.jvm.internal.m f16398j = K.f16388o;

    public L(InterfaceC2126e interfaceC2126e, InterfaceC2128g interfaceC2128g, float f5, C2144x c2144x, float f7, int i7, I i8) {
        this.a = interfaceC2126e;
        this.f16390b = interfaceC2128g;
        this.f16391c = f5;
        this.f16392d = c2144x;
        this.f16393e = f7;
        this.f16394f = i7;
        this.f16395g = i8;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [e4.o, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v5, types: [e4.o, kotlin.jvm.internal.m] */
    @Override // w0.InterfaceC2176K
    public final int a(InterfaceC2197o interfaceC2197o, List list, int i7) {
        List list2 = (List) P3.q.u0(1, list);
        InterfaceC2172G interfaceC2172G = list2 != null ? (InterfaceC2172G) P3.q.t0(list2) : null;
        List list3 = (List) P3.q.u0(2, list);
        this.f16395g.b(interfaceC2172G, list3 != null ? (InterfaceC2172G) P3.q.t0(list3) : null, q0.c.b(i7, 0, 13));
        List list4 = (List) P3.q.t0(list);
        if (list4 == null) {
            list4 = P3.y.f7779k;
        }
        return (int) (G.b(list4, this.f16398j, this.f16397i, i7, interfaceC2197o.O(this.f16391c), interfaceC2197o.O(this.f16393e), this.f16394f, this.f16395g) >> 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w0.InterfaceC2176K
    public final InterfaceC2174I b(InterfaceC2175J interfaceC2175J, List list, long j7) throws Throwable {
        InterfaceC2172G interfaceC2172G;
        Iterator it;
        Q.d dVar;
        int i7;
        w0.S s7;
        C1487h c1487h;
        C1958c c1958c;
        C2121B c2121bA;
        InterfaceC2172G interfaceC2172G2;
        InterfaceC2172G interfaceC2172G3;
        InterfaceC2172G interfaceC2172G4;
        w0.S s8;
        C1487h c1487h2;
        int i8;
        C1487h c1487h3;
        C1958c c1958c2;
        long jA;
        w0.S s9;
        long jA2;
        w0.S sB;
        int i9 = this.f16394f;
        P3.z zVar = P3.z.f7780k;
        if (i9 != 0 && !((ArrayList) list).isEmpty()) {
            int iG = T0.a.g(j7);
            I i10 = this.f16395g;
            if (iG != 0) {
                List list2 = (List) P3.q.r0(list);
                if (list2.isEmpty()) {
                    return interfaceC2175J.T(0, 0, zVar, C2134m.f16465p);
                }
                List list3 = (List) P3.q.u0(1, list);
                InterfaceC2172G interfaceC2172G5 = list3 != null ? (InterfaceC2172G) P3.q.t0(list3) : null;
                List list4 = (List) P3.q.u0(2, list);
                InterfaceC2172G interfaceC2172G6 = list4 != null ? (InterfaceC2172G) P3.q.t0(list4) : null;
                list2.size();
                i10.getClass();
                long jH = AbstractC2123b.h(AbstractC2123b.d(10, AbstractC2123b.c(1, j7)));
                if (interfaceC2172G5 != null) {
                    G.c(interfaceC2172G5, this, jH, new H(i10, this, 0));
                    i10.a = interfaceC2172G5;
                }
                if (interfaceC2172G6 != null) {
                    G.c(interfaceC2172G6, this, jH, new H(i10, this, 1));
                    i10.f16373c = interfaceC2172G6;
                }
                Iterator it2 = list2.iterator();
                long jC = AbstractC2123b.c(1, j7);
                Q.d dVar2 = new Q.d(new InterfaceC2174I[16]);
                int iH = T0.a.h(jC);
                int iJ = T0.a.j(jC);
                int iG2 = T0.a.g(jC);
                C1496q c1496q = AbstractC1489j.a;
                C1496q c1496q2 = new C1496q();
                ArrayList arrayList = new ArrayList();
                int iCeil = (int) Math.ceil(interfaceC2175J.x(this.f16391c));
                int iCeil2 = (int) Math.ceil(interfaceC2175J.x(this.f16393e));
                long jA3 = q0.c.a(0, iH, 0, iG2);
                long jH2 = AbstractC2123b.h(AbstractC2123b.d(14, jA3));
                if (it2.hasNext()) {
                    try {
                        interfaceC2172G = (InterfaceC2172G) it2.next();
                    } catch (IndexOutOfBoundsException unused) {
                    }
                } else {
                    interfaceC2172G = null;
                }
                if (interfaceC2172G != null) {
                    if (AbstractC2123b.f(AbstractC2123b.e(interfaceC2172G)) == 0.0f) {
                        AbstractC2123b.e(interfaceC2172G);
                        sB = interfaceC2172G.b(jH2);
                        jA2 = C1487h.a(sB.h0(), sB.f0());
                    } else {
                        int iW = interfaceC2172G.W(Integer.MAX_VALUE);
                        jA2 = C1487h.a(iW, interfaceC2172G.b0(iW));
                        sB = null;
                    }
                    it = it2;
                    dVar = dVar2;
                    i7 = iJ;
                    c1487h = new C1487h(jA2);
                    s7 = sB;
                } else {
                    it = it2;
                    dVar = dVar2;
                    i7 = iJ;
                    s7 = null;
                    c1487h = null;
                }
                w0.S s10 = s7;
                Integer numValueOf = c1487h != null ? Integer.valueOf((int) (c1487h.a >> 32)) : null;
                Integer numValueOf2 = c1487h != null ? Integer.valueOf((int) (c1487h.a & 4294967295L)) : null;
                C1495p c1495p = new C1495p();
                Q.d dVar3 = dVar;
                C1495p c1495p2 = new C1495p();
                Integer numValueOf3 = numValueOf2;
                int i11 = this.f16394f;
                I i12 = this.f16395g;
                C c2 = new C(i11, i12, jC, iCeil, iCeil2);
                int i13 = iCeil2;
                C1487h c1487h4 = c1487h;
                C1958c c1958cB = c2.b(it.hasNext(), 0, C1487h.a(iH, iG2), c1487h4, 0, 0, 0, false, false);
                if (c1958cB.f15442b) {
                    c1958c = c1958cB;
                    c2121bA = c2.a(c1958c, c1487h4 != null, -1, 0, iH, 0);
                } else {
                    c1958c = c1958cB;
                    c2121bA = null;
                }
                Iterator it3 = it;
                int i14 = iH;
                InterfaceC2172G interfaceC2172G7 = interfaceC2172G;
                C1958c c1958c3 = c1958c;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int iMax = i7;
                int i20 = iG2;
                int i21 = 0;
                while (!c1958c3.f15442b && interfaceC2172G7 != null) {
                    kotlin.jvm.internal.l.c(numValueOf);
                    int iIntValue = numValueOf.intValue();
                    kotlin.jvm.internal.l.c(numValueOf3);
                    int i22 = i13;
                    int i23 = i16 + iIntValue;
                    int iMax2 = Math.max(i21, numValueOf3.intValue());
                    int i24 = i14 - iIntValue;
                    int i25 = i15 + 1;
                    i12.getClass();
                    arrayList.add(interfaceC2172G7);
                    c1496q2.h(i15, s10);
                    int i26 = i25 - i17;
                    if (it3.hasNext()) {
                        try {
                            interfaceC2172G2 = (InterfaceC2172G) it3.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            interfaceC2172G2 = null;
                        }
                        interfaceC2172G3 = interfaceC2172G2;
                    } else {
                        interfaceC2172G3 = null;
                    }
                    if (interfaceC2172G3 != null) {
                        if (AbstractC2123b.f(AbstractC2123b.e(interfaceC2172G3)) == 0.0f) {
                            AbstractC2123b.e(interfaceC2172G3);
                            w0.S sB2 = interfaceC2172G3.b(jH2);
                            s9 = sB2;
                            jA = C1487h.a(sB2.h0(), s9.f0());
                        } else {
                            int iW2 = interfaceC2172G3.W(Integer.MAX_VALUE);
                            jA = C1487h.a(iW2, interfaceC2172G3.b0(iW2));
                            s9 = null;
                        }
                        interfaceC2172G4 = interfaceC2172G3;
                        c1487h2 = new C1487h(jA);
                        s8 = s9;
                    } else {
                        interfaceC2172G4 = interfaceC2172G3;
                        s8 = null;
                        c1487h2 = null;
                    }
                    w0.S s11 = s8;
                    Integer numValueOf4 = c1487h2 != null ? Integer.valueOf(((int) (c1487h2.a >> 32)) + iCeil) : null;
                    numValueOf3 = c1487h2 != null ? Integer.valueOf((int) (c1487h2.a & 4294967295L)) : null;
                    boolean zHasNext = it3.hasNext();
                    int i27 = i18;
                    long jA4 = C1487h.a(i24, i20);
                    if (c1487h2 == null) {
                        i8 = i24;
                        c1487h3 = null;
                    } else {
                        kotlin.jvm.internal.l.c(numValueOf4);
                        int iIntValue2 = numValueOf4.intValue();
                        kotlin.jvm.internal.l.c(numValueOf3);
                        i8 = i24;
                        c1487h3 = new C1487h(C1487h.a(iIntValue2, numValueOf3.intValue()));
                    }
                    C1958c c1958cB2 = c2.b(zHasNext, i26, jA4, c1487h3, i27, i19, iMax2, false, false);
                    if (c1958cB2.a) {
                        int iMin = Math.min(Math.max(iMax, i23), iH);
                        int i28 = i19 + iMax2;
                        c1958c2 = c1958cB2;
                        C2121B c2121bA2 = c2.a(c1958c2, c1487h2 != null, i27, i28, i8, i26);
                        c1495p2.a(iMax2);
                        i20 = (i20 - i28) - i22;
                        c1495p.a(i25);
                        i18 = i27 + 1;
                        i19 = i28 + i22;
                        iMax = iMin;
                        c2121bA = c2121bA2;
                        numValueOf = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - iCeil) : null;
                        i17 = i25;
                        i8 = iH;
                        i21 = 0;
                        i23 = 0;
                    } else {
                        c1958c2 = c1958cB2;
                        i21 = iMax2;
                        numValueOf = numValueOf4;
                        i18 = i27;
                    }
                    i15 = i25;
                    s10 = s11;
                    interfaceC2172G7 = interfaceC2172G4;
                    i13 = i22;
                    i14 = i8;
                    i16 = i23;
                    c1958c3 = c1958c2;
                }
                if (c2121bA != null) {
                    arrayList.add(c2121bA.a);
                    c1496q2.h(arrayList.size() - 1, c2121bA.f16349b);
                    int i29 = c1495p.f12905b - 1;
                    boolean z7 = c2121bA.f16351d;
                    long j8 = c2121bA.f16350c;
                    if (z7) {
                        c1495p2.e(i29, Math.max(c1495p2.c(i29), (int) (j8 & 4294967295L)));
                        int i30 = c1495p.f12905b;
                        if (i30 == 0) {
                            throw new NoSuchElementException("IntList is empty.");
                        }
                        c1495p.e(i29, c1495p.a[i30 - 1] + 1);
                    } else {
                        c1495p2.a((int) (j8 & 4294967295L));
                        int i31 = c1495p.f12905b;
                        if (i31 == 0) {
                            throw new NoSuchElementException("IntList is empty.");
                        }
                        c1495p.a(c1495p.a[i31 - 1] + 1);
                    }
                }
                int size = arrayList.size();
                w0.S[] sArr = new w0.S[size];
                for (int i32 = 0; i32 < size; i32++) {
                    sArr[i32] = c1496q2.e(i32);
                }
                int i33 = c1495p.f12905b;
                int[] iArr = new int[i33];
                for (int i34 = 0; i34 < i33; i34++) {
                    iArr[i34] = 0;
                }
                int i35 = c1495p.f12905b;
                int[] iArr2 = new int[i35];
                for (int i36 = 0; i36 < i35; i36++) {
                    iArr2[i36] = 0;
                }
                int[] iArr3 = c1495p.a;
                int i37 = 0;
                int i38 = 0;
                int i39 = 0;
                for (int i40 = c1495p.f12905b; i38 < i40; i40 = i40) {
                    int i41 = iArr3[i38];
                    int iC = c1495p2.c(i38);
                    int i42 = T0.a.i(jA3);
                    int iH2 = T0.a.h(jA3);
                    int[] iArr4 = iArr3;
                    Q.d dVar4 = dVar3;
                    InterfaceC2174I interfaceC2174IG = AbstractC2123b.g(this, iMax, i42, iH2, iC, iCeil, interfaceC2175J, arrayList, sArr, i37, i41, iArr, i38);
                    int iL = interfaceC2174IG.l();
                    int iE = interfaceC2174IG.e();
                    iArr2[i38] = iE;
                    i39 += iE;
                    iMax = Math.max(iMax, iL);
                    dVar4.b(interfaceC2174IG);
                    i38++;
                    i37 = i41;
                    dVar3 = dVar4;
                    iArr3 = iArr4;
                }
                Q.d dVar5 = dVar3;
                if (dVar5.k()) {
                    iMax = 0;
                    i39 = 0;
                }
                InterfaceC2128g interfaceC2128g = this.f16390b;
                int iK = e3.c.k(((dVar5.f7829m - 1) * interfaceC2175J.O(interfaceC2128g.a())) + i39, T0.a.i(jC), T0.a.g(jC));
                interfaceC2128g.c(interfaceC2175J, iK, iArr2, iArr);
                return interfaceC2175J.T(e3.c.k(iMax, T0.a.j(jC), T0.a.h(jC)), iK, zVar, new F(0, dVar5));
            }
            i10.getClass();
        }
        return interfaceC2175J.T(0, 0, zVar, C2134m.f16464o);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [e4.o, kotlin.jvm.internal.m] */
    @Override // w0.InterfaceC2176K
    public final int c(InterfaceC2197o interfaceC2197o, List list, int i7) {
        List list2 = (List) P3.q.u0(1, list);
        InterfaceC2172G interfaceC2172G = list2 != null ? (InterfaceC2172G) P3.q.t0(list2) : null;
        List list3 = (List) P3.q.u0(2, list);
        this.f16395g.b(interfaceC2172G, list3 != null ? (InterfaceC2172G) P3.q.t0(list3) : null, q0.c.b(0, i7, 7));
        List list4 = (List) P3.q.t0(list);
        if (list4 == null) {
            list4 = P3.y.f7779k;
        }
        int iO = interfaceC2197o.O(this.f16391c);
        ?? r02 = this.f16396h;
        int size = list4.size();
        int i8 = 0;
        int iMax = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < size) {
            int iIntValue = ((Number) r02.invoke((InterfaceC2172G) list4.get(i8), Integer.valueOf(i8), Integer.valueOf(i7))).intValue() + iO;
            int i11 = i8 + 1;
            if (i11 - i9 == this.f16394f || i11 == list4.size()) {
                iMax = Math.max(iMax, (i10 + iIntValue) - iO);
                i9 = i8;
                i10 = 0;
            } else {
                i10 += iIntValue;
            }
            i8 = i11;
        }
        return iMax;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [e4.o, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v6, types: [e4.o, kotlin.jvm.internal.m] */
    @Override // w0.InterfaceC2176K
    public final int d(InterfaceC2197o interfaceC2197o, List list, int i7) {
        int i8 = 1;
        List list2 = (List) P3.q.u0(1, list);
        InterfaceC2172G interfaceC2172G = list2 != null ? (InterfaceC2172G) P3.q.t0(list2) : null;
        char c2 = 2;
        List list3 = (List) P3.q.u0(2, list);
        int i9 = 0;
        this.f16395g.b(interfaceC2172G, list3 != null ? (InterfaceC2172G) P3.q.t0(list3) : null, q0.c.b(0, i7, 7));
        List list4 = (List) P3.q.t0(list);
        if (list4 == null) {
            list4 = P3.y.f7779k;
        }
        List list5 = list4;
        int iO = interfaceC2197o.O(this.f16391c);
        int iO2 = interfaceC2197o.O(this.f16393e);
        ?? r12 = this.f16398j;
        ?? r2 = this.f16397i;
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = 0;
        }
        int size2 = list5.size();
        int[] iArr2 = new int[size2];
        for (int i11 = 0; i11 < size2; i11++) {
            iArr2[i11] = 0;
        }
        int size3 = list5.size();
        int i12 = 0;
        while (i12 < size3) {
            char c4 = c2;
            InterfaceC2172G interfaceC2172G2 = (InterfaceC2172G) list5.get(i12);
            int i13 = i8;
            int iIntValue = ((Number) r12.invoke(interfaceC2172G2, Integer.valueOf(i12), Integer.valueOf(i7))).intValue();
            iArr[i12] = iIntValue;
            iArr2[i12] = ((Number) r2.invoke(interfaceC2172G2, Integer.valueOf(i12), Integer.valueOf(iIntValue))).intValue();
            i12++;
            i9 = i9;
            i8 = i13;
            c2 = c4;
        }
        int i14 = i8;
        int i15 = i9;
        int size4 = list5.size();
        I i16 = this.f16395g;
        if (Integer.MAX_VALUE < size4) {
            i16.getClass();
        }
        if (Integer.MAX_VALUE >= list5.size()) {
            i16.getClass();
        }
        int iMin = Math.min(Integer.MAX_VALUE, list5.size());
        int i17 = i15;
        int i18 = i17;
        while (i17 < size) {
            i18 += iArr[i17];
            i17++;
        }
        int size5 = ((list5.size() - 1) * iO) + i18;
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i19 = iArr2[i15];
        k4.f it = new k4.g(i14, size2 - 1, i14).iterator();
        while (it.f12677m) {
            int i20 = iArr2[it.a()];
            if (i19 < i20) {
                i19 = i20;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i21 = iArr[i15];
        k4.f it2 = new k4.g(1, size - 1, 1).iterator();
        while (it2.f12677m) {
            int i22 = iArr[it2.a()];
            if (i21 < i22) {
                i21 = i22;
            }
        }
        int i23 = size5;
        while (i21 <= size5 && i19 != i7) {
            int i24 = (i21 + size5) / 2;
            I i25 = i16;
            int[] iArr3 = iArr2;
            long jB = G.b(list5, new E(iArr, 0), new E(iArr2, 1), i24, iO, iO2, this.f16394f, i25);
            int[] iArr4 = iArr;
            int i26 = (int) (jB >> 32);
            int i27 = (int) (jB & 4294967295L);
            if (i26 > i7 || i27 < iMin) {
                i21 = i24 + 1;
                if (i21 > size5) {
                    return i21;
                }
            } else {
                if (i26 >= i7) {
                    return i24;
                }
                size5 = i24 - 1;
            }
            iArr2 = iArr3;
            iArr = iArr4;
            i16 = i25;
            i19 = i26;
            i23 = i24;
        }
        return i23;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [e4.o, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v5, types: [e4.o, kotlin.jvm.internal.m] */
    @Override // w0.InterfaceC2176K
    public final int e(InterfaceC2197o interfaceC2197o, List list, int i7) {
        List list2 = (List) P3.q.u0(1, list);
        InterfaceC2172G interfaceC2172G = list2 != null ? (InterfaceC2172G) P3.q.t0(list2) : null;
        List list3 = (List) P3.q.u0(2, list);
        this.f16395g.b(interfaceC2172G, list3 != null ? (InterfaceC2172G) P3.q.t0(list3) : null, q0.c.b(i7, 0, 13));
        List list4 = (List) P3.q.t0(list);
        if (list4 == null) {
            list4 = P3.y.f7779k;
        }
        return (int) (G.b(list4, this.f16398j, this.f16397i, i7, interfaceC2197o.O(this.f16391c), interfaceC2197o.O(this.f16393e), this.f16394f, this.f16395g) >> 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l7 = (L) obj;
        l7.getClass();
        return this.a.equals(l7.a) && this.f16390b.equals(l7.f16390b) && T0.e.a(this.f16391c, l7.f16391c) && kotlin.jvm.internal.l.a(this.f16392d, l7.f16392d) && T0.e.a(this.f16393e, l7.f16393e) && this.f16394f == l7.f16394f && kotlin.jvm.internal.l.a(this.f16395g, l7.f16395g);
    }

    @Override // v.b0
    public final InterfaceC2174I f(w0.S[] sArr, InterfaceC2175J interfaceC2175J, int[] iArr, int i7, int i8, int[] iArr2, int i9, int i10, int i11) {
        return interfaceC2175J.T(i7, i8, P3.z.f7780k, new J(iArr2, i9, i10, i11, sArr, this, i8, interfaceC2175J, iArr));
    }

    @Override // v.b0
    public final void g(int i7, int[] iArr, int[] iArr2, InterfaceC2175J interfaceC2175J) {
        this.a.b(interfaceC2175J, i7, iArr, interfaceC2175J.getLayoutDirection(), iArr2);
    }

    @Override // v.b0
    public final long h(int i7, int i8, int i9, boolean z7) {
        return e0.a(i7, i8, i9, z7);
    }

    public final int hashCode() {
        int iB = AbstractC0703b.b(this.f16391c, (this.f16390b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31);
        this.f16392d.getClass();
        return this.f16395g.hashCode() + AbstractC1755i.a(Integer.MAX_VALUE, AbstractC1755i.a(this.f16394f, AbstractC0703b.b(this.f16393e, (Float.hashCode(-1.0f) + iB) * 31, 31), 31), 31);
    }

    @Override // v.b0
    public final int i(w0.S s7) {
        return s7.f0();
    }

    @Override // v.b0
    public final int j(w0.S s7) {
        return s7.h0();
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.f16390b + ", mainAxisSpacing=" + ((Object) T0.e.b(this.f16391c)) + ", crossAxisAlignment=" + this.f16392d + ", crossAxisArrangementSpacing=" + ((Object) T0.e.b(this.f16393e)) + ", maxItemsInMainAxis=" + this.f16394f + ", maxLines=2147483647, overflow=" + this.f16395g + ')';
    }
}
