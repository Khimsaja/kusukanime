package z1;

import B1.AbstractC0015b;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18970b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18971c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18972d;

    /* renamed from: e, reason: collision with root package name */
    public final float f18973e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18974f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18975g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18976h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f18977i;

    /* renamed from: j, reason: collision with root package name */
    public short[] f18978j;

    /* renamed from: k, reason: collision with root package name */
    public int f18979k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f18980l;

    /* renamed from: m, reason: collision with root package name */
    public int f18981m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f18982n;

    /* renamed from: o, reason: collision with root package name */
    public int f18983o;

    /* renamed from: p, reason: collision with root package name */
    public int f18984p;

    /* renamed from: q, reason: collision with root package name */
    public int f18985q;

    /* renamed from: r, reason: collision with root package name */
    public int f18986r;

    /* renamed from: s, reason: collision with root package name */
    public int f18987s;

    /* renamed from: t, reason: collision with root package name */
    public int f18988t;

    /* renamed from: u, reason: collision with root package name */
    public int f18989u;

    /* renamed from: v, reason: collision with root package name */
    public int f18990v;

    /* renamed from: w, reason: collision with root package name */
    public double f18991w;

    public i(float f5, float f7, int i7, int i8, int i9) {
        this.a = i7;
        this.f18970b = i8;
        this.f18971c = f5;
        this.f18972d = f7;
        this.f18973e = i7 / i9;
        this.f18974f = i7 / 400;
        int i10 = i7 / 65;
        this.f18975g = i10;
        int i11 = i10 * 2;
        this.f18976h = i11;
        this.f18977i = new short[i11];
        this.f18978j = new short[i11 * i8];
        this.f18980l = new short[i11 * i8];
        this.f18982n = new short[i11 * i8];
    }

    public static void e(int i7, int i8, short[] sArr, int i9, short[] sArr2, int i10, short[] sArr3, int i11) {
        for (int i12 = 0; i12 < i8; i12++) {
            int i13 = (i9 * i8) + i12;
            int i14 = (i11 * i8) + i12;
            int i15 = (i10 * i8) + i12;
            for (int i16 = 0; i16 < i7; i16++) {
                sArr[i13] = (short) (((sArr3[i14] * i16) + ((i7 - i16) * sArr2[i15])) / i7);
                i13 += i8;
                i15 += i8;
                i14 += i8;
            }
        }
    }

    public final void a(short[] sArr, int i7, int i8) {
        short[] sArrC = c(this.f18980l, this.f18981m, i8);
        this.f18980l = sArrC;
        int i9 = this.f18970b;
        System.arraycopy(sArr, i7 * i9, sArrC, this.f18981m * i9, i9 * i8);
        this.f18981m += i8;
    }

    public final void b(short[] sArr, int i7, int i8) {
        int i9 = this.f18976h / i8;
        int i10 = this.f18970b;
        int i11 = i8 * i10;
        int i12 = i7 * i10;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 += sArr[(i13 * i11) + i12 + i15];
            }
            this.f18977i[i13] = (short) (i14 / i11);
        }
    }

    public final short[] c(short[] sArr, int i7, int i8) {
        int length = sArr.length;
        int i9 = this.f18970b;
        int i10 = length / i9;
        return i7 + i8 <= i10 ? sArr : Arrays.copyOf(sArr, (((i10 * 3) / 2) + i8) * i9);
    }

    public final int d(short[] sArr, int i7, int i8, int i9) {
        int i10 = i7 * this.f18970b;
        int i11 = 255;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i8 <= i9) {
            int iAbs = 0;
            for (int i15 = 0; i15 < i8; i15++) {
                iAbs += Math.abs(sArr[i10 + i15] - sArr[(i10 + i8) + i15]);
            }
            if (iAbs * i13 < i12 * i8) {
                i13 = i8;
                i12 = iAbs;
            }
            if (iAbs * i11 > i14 * i8) {
                i11 = i8;
                i14 = iAbs;
            }
            i8++;
        }
        this.f18989u = i12 / i13;
        this.f18990v = i14 / i11;
        return i13;
    }

    public final void f() {
        float f5;
        double d4;
        int iD;
        int i7;
        int i8;
        int iRound;
        int i9;
        int i10;
        int i11;
        long j7;
        long j8;
        int i12 = this.f18981m;
        float f7 = this.f18971c;
        float f8 = this.f18972d;
        double d6 = f7 / f8;
        float f9 = this.f18973e * f8;
        int i13 = this.a;
        int i14 = this.f18970b;
        int i15 = 0;
        int i16 = 1;
        if (d6 > 1.0000100135803223d || d6 < 0.9999899864196777d) {
            int i17 = this.f18979k;
            int i18 = this.f18976h;
            if (i17 >= i18) {
                int i19 = 0;
                while (true) {
                    int i20 = this.f18986r;
                    if (i20 > 0) {
                        int iMin = Math.min(i18, i20);
                        a(this.f18978j, i19, iMin);
                        this.f18986r -= iMin;
                        i19 += iMin;
                        f5 = f9;
                        d4 = d6;
                    } else {
                        short[] sArr = this.f18978j;
                        int i21 = i13 > 4000 ? i13 / 4000 : i16;
                        int i22 = this.f18975g;
                        int i23 = this.f18974f;
                        if (i14 == i16 && i21 == i16) {
                            iD = d(sArr, i19, i23, i22);
                            f5 = f9;
                            d4 = d6;
                        } else {
                            b(sArr, i19, i21);
                            f5 = f9;
                            d4 = d6;
                            short[] sArr2 = this.f18977i;
                            int iD2 = d(sArr2, i15, i23 / i21, i22 / i21);
                            if (i21 != 1) {
                                int i24 = iD2 * i21;
                                int i25 = i21 * 4;
                                int i26 = i24 - i25;
                                int i27 = i24 + i25;
                                if (i26 >= i23) {
                                    i23 = i26;
                                }
                                if (i27 <= i22) {
                                    i22 = i27;
                                }
                                if (i14 == 1) {
                                    iD = d(sArr, i19, i23, i22);
                                } else {
                                    b(sArr, i19, 1);
                                    iD = d(sArr2, i15, i23, i22);
                                }
                            } else {
                                iD = iD2;
                            }
                        }
                        int i28 = this.f18989u;
                        int i29 = this.f18990v;
                        if (i28 == 0 || (i7 = this.f18987s) == 0 || i29 > i28 * 3 || i28 * 2 <= this.f18988t * 3) {
                            i7 = iD;
                        }
                        this.f18988t = i28;
                        this.f18987s = iD;
                        if (d4 > 1.0d) {
                            short[] sArr3 = this.f18978j;
                            if (d4 >= 2.0d) {
                                double d7 = (i7 / (d4 - 1.0d)) + this.f18991w;
                                iRound = (int) Math.round(d7);
                                this.f18991w = d7 - iRound;
                            } else {
                                double d8 = (((2.0d - d4) * i7) / (d4 - 1.0d)) + this.f18991w;
                                int iRound2 = (int) Math.round(d8);
                                this.f18986r = iRound2;
                                this.f18991w = d8 - iRound2;
                                iRound = i7;
                            }
                            short[] sArrC = c(this.f18980l, this.f18981m, iRound);
                            this.f18980l = sArrC;
                            int i30 = i19 + i7;
                            int i31 = i19;
                            int i32 = iRound;
                            e(i32, this.f18970b, sArrC, this.f18981m, sArr3, i31, sArr3, i30);
                            this.f18981m += i32;
                            i19 = i7 + i32 + i31;
                        } else {
                            int i33 = i19;
                            short[] sArr4 = this.f18978j;
                            if (d4 < 0.5d) {
                                double d9 = ((i7 * d4) / (1.0d - d4)) + this.f18991w;
                                int iRound3 = (int) Math.round(d9);
                                this.f18991w = d9 - iRound3;
                                i8 = iRound3;
                            } else {
                                double d10 = ((((d4 * 2.0d) - 1.0d) * i7) / (1.0d - d4)) + this.f18991w;
                                int iRound4 = (int) Math.round(d10);
                                this.f18986r = iRound4;
                                this.f18991w = d10 - iRound4;
                                i8 = i7;
                            }
                            int i34 = i7 + i8;
                            short[] sArrC2 = c(this.f18980l, this.f18981m, i34);
                            this.f18980l = sArrC2;
                            System.arraycopy(sArr4, i33 * i14, sArrC2, this.f18981m * i14, i7 * i14);
                            e(i8, this.f18970b, this.f18980l, this.f18981m + i7, sArr4, i33 + i7, sArr4, i33);
                            this.f18981m += i34;
                            i19 = i33 + i8;
                        }
                    }
                    if (i19 + i18 > i17) {
                        break;
                    }
                    i15 = 0;
                    i16 = 1;
                    f9 = f5;
                    d6 = d4;
                }
                int i35 = this.f18979k - i19;
                short[] sArr5 = this.f18978j;
                System.arraycopy(sArr5, i19 * i14, sArr5, 0, i35 * i14);
                this.f18979k = i35;
            }
            if (f5 != 1.0f || this.f18981m == i12) {
            }
            long j9 = (long) (i13 / f5);
            long j10 = i13;
            while (j9 != 0 && j10 != 0 && j9 % 2 == 0 && j10 % 2 == 0) {
                j9 /= 2;
                j10 /= 2;
            }
            int i36 = this.f18981m - i12;
            short[] sArrC3 = c(this.f18982n, this.f18983o, i36);
            this.f18982n = sArrC3;
            System.arraycopy(this.f18980l, i12 * i14, sArrC3, this.f18983o * i14, i36 * i14);
            this.f18981m = i12;
            this.f18983o += i36;
            int i37 = 0;
            while (true) {
                i9 = this.f18983o;
                i10 = i9 - 1;
                if (i37 >= i10) {
                    break;
                }
                while (true) {
                    i11 = this.f18984p + 1;
                    j7 = i11;
                    long j11 = j7 * j9;
                    j8 = this.f18985q;
                    if (j11 <= j8 * j10) {
                        break;
                    }
                    this.f18980l = c(this.f18980l, this.f18981m, 1);
                    int i38 = 0;
                    while (i38 < i14) {
                        short[] sArr6 = this.f18980l;
                        int i39 = (this.f18981m * i14) + i38;
                        short[] sArr7 = this.f18982n;
                        int i40 = (i37 * i14) + i38;
                        short s7 = sArr7[i40];
                        short s8 = sArr7[i40 + i14];
                        long j12 = j9;
                        int i41 = i37;
                        long j13 = (r12 + 1) * j12;
                        long j14 = j13 - (this.f18985q * j10);
                        long j15 = j13 - (this.f18984p * j12);
                        sArr6[i39] = (short) ((((j15 - j14) * s8) + (s7 * j14)) / j15);
                        i38++;
                        i37 = i41;
                        j9 = j12;
                    }
                    this.f18985q++;
                    this.f18981m++;
                    i37 = i37;
                    j9 = j9;
                }
                long j16 = j9;
                int i42 = i37;
                this.f18984p = i11;
                if (j7 == j10) {
                    this.f18984p = 0;
                    AbstractC0015b.h(j8 == j16);
                    this.f18985q = 0;
                }
                i37 = i42 + 1;
                j9 = j16;
            }
            if (i10 == 0) {
                return;
            }
            short[] sArr8 = this.f18982n;
            System.arraycopy(sArr8, i10 * i14, sArr8, 0, (i9 - i10) * i14);
            this.f18983o -= i10;
            return;
        }
        a(this.f18978j, 0, this.f18979k);
        this.f18979k = 0;
        f5 = f9;
        if (f5 != 1.0f) {
        }
    }
}
