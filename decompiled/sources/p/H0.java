package p;

import m.C1495p;
import m.C1496q;

/* loaded from: classes.dex */
public final class H0 implements E0 {

    /* renamed from: k, reason: collision with root package name */
    public final C1495p f13864k;

    /* renamed from: l, reason: collision with root package name */
    public final C1496q f13865l;

    /* renamed from: m, reason: collision with root package name */
    public final int f13866m;

    /* renamed from: n, reason: collision with root package name */
    public final I1.e f13867n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f13868o;

    /* renamed from: p, reason: collision with root package name */
    public float[] f13869p;

    /* renamed from: q, reason: collision with root package name */
    public AbstractC1766r f13870q;

    /* renamed from: r, reason: collision with root package name */
    public AbstractC1766r f13871r;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC1766r f13872s;

    /* renamed from: t, reason: collision with root package name */
    public AbstractC1766r f13873t;

    /* renamed from: u, reason: collision with root package name */
    public float[] f13874u;

    /* renamed from: v, reason: collision with root package name */
    public float[] f13875v;

    /* renamed from: w, reason: collision with root package name */
    public X4.y f13876w;

    public H0(C1495p c1495p, C1496q c1496q, int i7, I1.e eVar) {
        this.f13864k = c1495p;
        this.f13865l = c1496q;
        this.f13866m = i7;
        this.f13867n = eVar;
    }

    public final int c(int i7) {
        int i8;
        C1495p c1495p = this.f13864k;
        int i9 = c1495p.f12905b;
        if (i9 < 0) {
            throw new IllegalArgumentException("fromIndex(0) > toIndex(" + i9 + ')');
        }
        int i10 = i9 - 1;
        int i11 = 0;
        while (true) {
            if (i11 <= i10) {
                i8 = (i11 + i10) >>> 1;
                int iC = c1495p.c(i8);
                if (iC >= i7) {
                    if (iC <= i7) {
                        break;
                    }
                    i10 = i8 - 1;
                } else {
                    i11 = i8 + 1;
                }
            } else {
                i8 = -(i11 + 1);
                break;
            }
        }
        return i8 < -1 ? -(i8 + 2) : i8;
    }

    @Override // p.D0
    public final AbstractC1766r e(long j7, AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2, AbstractC1766r abstractC1766r3) throws Throwable {
        int i7 = 0;
        long jL = e3.c.l((j7 / 1000000) - 0, 0L, this.f13866m);
        if (jL < 0) {
            return abstractC1766r3;
        }
        g(abstractC1766r, abstractC1766r2, abstractC1766r3);
        if (this.f13876w == null) {
            AbstractC1766r abstractC1766rI = i((jL - 1) * 1000000, abstractC1766r, abstractC1766r2, abstractC1766r3);
            AbstractC1766r abstractC1766rI2 = i(jL * 1000000, abstractC1766r, abstractC1766r2, abstractC1766r3);
            int iB = abstractC1766rI.b();
            while (i7 < iB) {
                AbstractC1766r abstractC1766r4 = this.f13871r;
                if (abstractC1766r4 == null) {
                    kotlin.jvm.internal.l.l("velocityVector");
                    throw null;
                }
                abstractC1766r4.e((abstractC1766rI.a(i7) - abstractC1766rI2.a(i7)) * 1000.0f, i7);
                i7++;
            }
            AbstractC1766r abstractC1766r5 = this.f13871r;
            if (abstractC1766r5 != null) {
                return abstractC1766r5;
            }
            kotlin.jvm.internal.l.l("velocityVector");
            throw null;
        }
        int i8 = (int) jL;
        float f5 = f(c(i8), i8, false);
        X4.y yVar = this.f13876w;
        if (yVar == null) {
            kotlin.jvm.internal.l.l("arcSpline");
            throw null;
        }
        float[] fArr = this.f13875v;
        if (fArr == null) {
            kotlin.jvm.internal.l.l("slopeArray");
            throw null;
        }
        C1768t[][] c1768tArr = (C1768t[][]) yVar.f9916l;
        float f7 = c1768tArr[0][0].a;
        if (f5 < f7) {
            f5 = f7;
        } else if (f5 > c1768tArr[c1768tArr.length - 1][0].f14112b) {
            f5 = c1768tArr[c1768tArr.length - 1][0].f14112b;
        }
        int length = c1768tArr.length;
        boolean z7 = false;
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < fArr.length) {
                C1768t c1768t = c1768tArr[i9][i11];
                if (f5 <= c1768t.f14112b) {
                    if (c1768t.f14128r) {
                        fArr[i10] = c1768t.f14124n;
                        fArr[i10 + 1] = c1768t.f14125o;
                    } else {
                        c1768t.c(f5);
                        fArr[i10] = c1768tArr[i9][i11].a();
                        fArr[i10 + 1] = c1768tArr[i9][i11].b();
                    }
                    z7 = true;
                }
                i10 += 2;
                i11++;
            }
            if (z7) {
                break;
            }
        }
        float[] fArr2 = this.f13875v;
        if (fArr2 == null) {
            kotlin.jvm.internal.l.l("slopeArray");
            throw null;
        }
        int length2 = fArr2.length;
        while (i7 < length2) {
            AbstractC1766r abstractC1766r6 = this.f13871r;
            if (abstractC1766r6 == null) {
                kotlin.jvm.internal.l.l("velocityVector");
                throw null;
            }
            float[] fArr3 = this.f13875v;
            if (fArr3 == null) {
                kotlin.jvm.internal.l.l("slopeArray");
                throw null;
            }
            abstractC1766r6.e(fArr3[i7], i7);
            i7++;
        }
        AbstractC1766r abstractC1766r7 = this.f13871r;
        if (abstractC1766r7 != null) {
            return abstractC1766r7;
        }
        kotlin.jvm.internal.l.l("velocityVector");
        throw null;
    }

    public final float f(int i7, int i8, boolean z7) {
        InterfaceC1774z interfaceC1774z;
        float f5;
        C1495p c1495p = this.f13864k;
        if (i7 >= c1495p.f12905b - 1) {
            f5 = i8;
        } else {
            int iC = c1495p.c(i7);
            int iC2 = c1495p.c(i7 + 1);
            if (i8 == iC) {
                f5 = iC;
            } else {
                int i9 = iC2 - iC;
                G0 g02 = (G0) this.f13865l.e(iC);
                if (g02 == null || (interfaceC1774z = g02.f13862b) == null) {
                    interfaceC1774z = this.f13867n;
                }
                float f7 = i9;
                float fB = interfaceC1774z.b((i8 - iC) / f7);
                if (z7) {
                    return fB;
                }
                f5 = (f7 * fB) + iC;
            }
        }
        return f5 / 1000;
    }

    public final void g(AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2, AbstractC1766r abstractC1766r3) {
        float[] fArr;
        float[] fArr2;
        boolean z7 = this.f13876w != null;
        AbstractC1766r abstractC1766r4 = this.f13870q;
        C1496q c1496q = this.f13865l;
        C1495p c1495p = this.f13864k;
        if (abstractC1766r4 == null) {
            this.f13870q = abstractC1766r.c();
            this.f13871r = abstractC1766r3.c();
            int i7 = c1495p.f12905b;
            float[] fArr3 = new float[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                fArr3[i8] = c1495p.c(i8) / 1000;
            }
            this.f13869p = fArr3;
            int i9 = c1495p.f12905b;
            int[] iArr = new int[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                iArr[i10] = 0;
            }
            this.f13868o = iArr;
        }
        if (z7) {
            if (this.f13876w != null) {
                AbstractC1766r abstractC1766r5 = this.f13872s;
                if (abstractC1766r5 == null) {
                    kotlin.jvm.internal.l.l("lastInitialValue");
                    throw null;
                }
                if (abstractC1766r5.equals(abstractC1766r)) {
                    AbstractC1766r abstractC1766r6 = this.f13873t;
                    if (abstractC1766r6 == null) {
                        kotlin.jvm.internal.l.l("lastTargetValue");
                        throw null;
                    }
                    if (abstractC1766r6.equals(abstractC1766r2)) {
                        return;
                    }
                }
            }
            this.f13872s = abstractC1766r;
            this.f13873t = abstractC1766r2;
            int iB = abstractC1766r.b() + (abstractC1766r.b() % 2);
            this.f13874u = new float[iB];
            this.f13875v = new float[iB];
            int i11 = c1495p.f12905b;
            float[][] fArr4 = new float[i11][];
            for (int i12 = 0; i12 < i11; i12++) {
                int iC = c1495p.c(i12);
                if (iC != 0) {
                    if (iC != this.f13866m) {
                        fArr = new float[iB];
                        Object objE = c1496q.e(iC);
                        kotlin.jvm.internal.l.c(objE);
                        G0 g02 = (G0) objE;
                        for (int i13 = 0; i13 < iB; i13++) {
                            fArr[i13] = g02.a.a(i13);
                        }
                    } else if (c1496q.b(iC)) {
                        fArr = new float[iB];
                        Object objE2 = c1496q.e(iC);
                        kotlin.jvm.internal.l.c(objE2);
                        G0 g03 = (G0) objE2;
                        for (int i14 = 0; i14 < iB; i14++) {
                            fArr[i14] = g03.a.a(i14);
                        }
                    } else {
                        fArr2 = new float[iB];
                        for (int i15 = 0; i15 < iB; i15++) {
                            fArr2[i15] = abstractC1766r2.a(i15);
                        }
                    }
                    fArr2 = fArr;
                } else if (c1496q.b(iC)) {
                    fArr = new float[iB];
                    Object objE3 = c1496q.e(iC);
                    kotlin.jvm.internal.l.c(objE3);
                    G0 g04 = (G0) objE3;
                    for (int i16 = 0; i16 < iB; i16++) {
                        fArr[i16] = g04.a.a(i16);
                    }
                    fArr2 = fArr;
                } else {
                    fArr2 = new float[iB];
                    for (int i17 = 0; i17 < iB; i17++) {
                        fArr2[i17] = abstractC1766r.a(i17);
                    }
                }
                fArr4[i12] = fArr2;
            }
            int[] iArr2 = this.f13868o;
            if (iArr2 == null) {
                kotlin.jvm.internal.l.l("modes");
                throw null;
            }
            float[] fArr5 = this.f13869p;
            if (fArr5 == null) {
                kotlin.jvm.internal.l.l("times");
                throw null;
            }
            this.f13876w = new X4.y(iArr2, fArr5, fArr4);
        }
    }

    @Override // p.D0
    public final AbstractC1766r i(long j7, AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2, AbstractC1766r abstractC1766r3) throws Throwable {
        int i7;
        Throwable th;
        int length;
        boolean z7;
        int i8;
        AbstractC1766r abstractC1766r4 = abstractC1766r;
        AbstractC1766r abstractC1766r5 = abstractC1766r2;
        boolean z8 = true;
        int i9 = 0;
        int i10 = this.f13866m;
        int iL = (int) e3.c.l((j7 / 1000000) - 0, 0L, i10);
        C1496q c1496q = this.f13865l;
        if (c1496q.b(iL)) {
            Object objE = c1496q.e(iL);
            kotlin.jvm.internal.l.c(objE);
            return ((G0) objE).a;
        }
        if (iL >= i10) {
            return abstractC1766r5;
        }
        if (iL <= 0) {
            return abstractC1766r4;
        }
        g(abstractC1766r4, abstractC1766r5, abstractC1766r3);
        if (this.f13876w == null) {
            int iC = c(iL);
            float f5 = f(iC, iL, true);
            C1495p c1495p = this.f13864k;
            int iC2 = c1495p.c(iC);
            if (c1496q.b(iC2)) {
                Object objE2 = c1496q.e(iC2);
                kotlin.jvm.internal.l.c(objE2);
                abstractC1766r4 = ((G0) objE2).a;
            }
            int iC3 = c1495p.c(iC + 1);
            if (c1496q.b(iC3)) {
                Object objE3 = c1496q.e(iC3);
                kotlin.jvm.internal.l.c(objE3);
                abstractC1766r5 = ((G0) objE3).a;
            }
            AbstractC1766r abstractC1766r6 = this.f13870q;
            if (abstractC1766r6 == null) {
                kotlin.jvm.internal.l.l("valueVector");
                throw null;
            }
            int iB = abstractC1766r6.b();
            for (int i11 = 0; i11 < iB; i11++) {
                AbstractC1766r abstractC1766r7 = this.f13870q;
                if (abstractC1766r7 == null) {
                    kotlin.jvm.internal.l.l("valueVector");
                    throw null;
                }
                float fA = abstractC1766r4.a(i11);
                float fA2 = abstractC1766r5.a(i11);
                B0 b02 = C0.a;
                abstractC1766r7.e((fA2 * f5) + ((1 - f5) * fA), i11);
            }
            AbstractC1766r abstractC1766r8 = this.f13870q;
            if (abstractC1766r8 != null) {
                return abstractC1766r8;
            }
            kotlin.jvm.internal.l.l("valueVector");
            throw null;
        }
        float f7 = f(c(iL), iL, false);
        X4.y yVar = this.f13876w;
        if (yVar == null) {
            kotlin.jvm.internal.l.l("arcSpline");
            throw null;
        }
        float[] fArr = this.f13874u;
        if (fArr == null) {
            kotlin.jvm.internal.l.l("posArray");
            throw null;
        }
        C1768t[][] c1768tArr = (C1768t[][]) yVar.f9916l;
        float f8 = c1768tArr[0][0].a;
        if (f7 >= f8 && f7 <= c1768tArr[c1768tArr.length - 1][0].f14112b) {
            int length2 = c1768tArr.length;
            int i12 = 0;
            boolean z9 = false;
            while (true) {
                if (i12 >= length2) {
                    i7 = i9;
                    th = null;
                    break;
                }
                int i13 = i9;
                int i14 = i13;
                while (i13 < fArr.length) {
                    C1768t c1768t = c1768tArr[i12][i14];
                    if (f7 <= c1768t.f14112b) {
                        if (c1768t.f14128r) {
                            float f9 = c1768t.a;
                            i8 = i9;
                            float f10 = c1768t.f14121k;
                            float f11 = c1768t.f14115e;
                            z7 = z8;
                            float f12 = c1768t.f14113c;
                            fArr[i13] = ((f11 - f12) * (f7 - f9) * f10) + f12;
                            float f13 = (f7 - f9) * f10;
                            float f14 = c1768t.f14116f;
                            float f15 = c1768t.f14114d;
                            fArr[i13 + 1] = ((f14 - f15) * f13) + f15;
                        } else {
                            z7 = z8;
                            i8 = i9;
                            c1768t.c(f7);
                            C1768t c1768t2 = c1768tArr[i12][i14];
                            fArr[i13] = (c1768t2.f14122l * c1768t2.f14118h) + c1768t2.f14124n;
                            fArr[i13 + 1] = (c1768t2.f14123m * c1768t2.f14119i) + c1768t2.f14125o;
                        }
                        z9 = z7;
                    } else {
                        z7 = z8;
                        i8 = i9;
                    }
                    i13 += 2;
                    i14++;
                    i9 = i8;
                    z8 = z7;
                }
                boolean z10 = z8;
                i7 = i9;
                th = null;
                if (z9) {
                    break;
                }
                i12++;
                i9 = i7;
                z8 = z10;
            }
        } else {
            i7 = 0;
            th = null;
            if (f7 > c1768tArr[c1768tArr.length - 1][0].f14112b) {
                length = c1768tArr.length - 1;
                f8 = c1768tArr[c1768tArr.length - 1][0].f14112b;
            } else {
                length = 0;
            }
            float f16 = f7 - f8;
            int i15 = 0;
            int i16 = 0;
            while (i15 < fArr.length) {
                C1768t c1768t3 = c1768tArr[length][i16];
                if (c1768t3.f14128r) {
                    float f17 = c1768t3.a;
                    float f18 = c1768t3.f14121k;
                    float f19 = c1768t3.f14115e;
                    float f20 = c1768t3.f14113c;
                    fArr[i15] = (c1768t3.f14124n * f16) + ((f19 - f20) * (f8 - f17) * f18) + f20;
                    float f21 = (f8 - f17) * f18;
                    float f22 = c1768t3.f14116f;
                    float f23 = c1768t3.f14114d;
                    fArr[i15 + 1] = (c1768t3.f14125o * f16) + ((f22 - f23) * f21) + f23;
                } else {
                    c1768t3.c(f8);
                    C1768t c1768t4 = c1768tArr[length][i16];
                    fArr[i15] = (c1768t4.a() * f16) + (c1768t4.f14122l * c1768t4.f14118h) + c1768t4.f14124n;
                    C1768t c1768t5 = c1768tArr[length][i16];
                    fArr[i15 + 1] = (c1768t5.b() * f16) + (c1768t5.f14123m * c1768t5.f14119i) + c1768t5.f14125o;
                }
                i15 += 2;
                i16++;
            }
        }
        float[] fArr2 = this.f13874u;
        if (fArr2 == null) {
            kotlin.jvm.internal.l.l("posArray");
            throw th;
        }
        int length3 = fArr2.length;
        for (int i17 = i7; i17 < length3; i17++) {
            AbstractC1766r abstractC1766r9 = this.f13870q;
            if (abstractC1766r9 == null) {
                kotlin.jvm.internal.l.l("valueVector");
                throw th;
            }
            float[] fArr3 = this.f13874u;
            if (fArr3 == null) {
                kotlin.jvm.internal.l.l("posArray");
                throw th;
            }
            abstractC1766r9.e(fArr3[i17], i17);
        }
        AbstractC1766r abstractC1766r10 = this.f13870q;
        if (abstractC1766r10 != null) {
            return abstractC1766r10;
        }
        kotlin.jvm.internal.l.l("valueVector");
        throw th;
    }

    @Override // p.E0
    public final int m() {
        return 0;
    }

    @Override // p.E0
    public final int o() {
        return this.f13866m;
    }
}
