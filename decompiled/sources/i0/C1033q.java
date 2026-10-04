package i0;

import h0.AbstractC0968M;
import java.util.Arrays;

/* renamed from: i0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1033q extends AbstractC1019c {

    /* renamed from: r, reason: collision with root package name */
    public static final I1.e f11911r = new I1.e(21);

    /* renamed from: d, reason: collision with root package name */
    public final C1035s f11912d;

    /* renamed from: e, reason: collision with root package name */
    public final float f11913e;

    /* renamed from: f, reason: collision with root package name */
    public final float f11914f;

    /* renamed from: g, reason: collision with root package name */
    public final C1034r f11915g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f11916h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f11917i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f11918j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC1025i f11919k;

    /* renamed from: l, reason: collision with root package name */
    public final C1032p f11920l;

    /* renamed from: m, reason: collision with root package name */
    public final C1029m f11921m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC1025i f11922n;

    /* renamed from: o, reason: collision with root package name */
    public final C1032p f11923o;

    /* renamed from: p, reason: collision with root package name */
    public final C1029m f11924p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f11925q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0286  */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1033q(java.lang.String r34, float[] r35, i0.C1035s r36, float[] r37, i0.InterfaceC1025i r38, i0.InterfaceC1025i r39, float r40, float r41, i0.C1034r r42, int r43) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.C1033q.<init>(java.lang.String, float[], i0.s, float[], i0.i, i0.i, float, float, i0.r, int):void");
    }

    @Override // i0.AbstractC1019c
    public final float a(int i7) {
        return this.f11914f;
    }

    @Override // i0.AbstractC1019c
    public final float b(int i7) {
        return this.f11913e;
    }

    @Override // i0.AbstractC1019c
    public final boolean c() {
        return this.f11925q;
    }

    @Override // i0.AbstractC1019c
    public final long d(float f5, float f7, float f8) {
        double d4 = f5;
        C1029m c1029m = this.f11924p;
        float fD = (float) c1029m.d(d4);
        float fD2 = (float) c1029m.d(f7);
        float fD3 = (float) c1029m.d(f8);
        float[] fArr = this.f11917i;
        float f9 = (fArr[6] * fD3) + (fArr[3] * fD2) + (fArr[0] * fD);
        float f10 = (fArr[7] * fD3) + (fArr[4] * fD2) + (fArr[1] * fD);
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32);
    }

    @Override // i0.AbstractC1019c
    public final float e(float f5, float f7, float f8) {
        double d4 = f5;
        C1029m c1029m = this.f11924p;
        float fD = (float) c1029m.d(d4);
        float fD2 = (float) c1029m.d(f7);
        float fD3 = (float) c1029m.d(f8);
        float[] fArr = this.f11917i;
        return (fArr[8] * fD3) + (fArr[5] * fD2) + (fArr[2] * fD);
    }

    @Override // i0.AbstractC1019c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1033q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C1033q c1033q = (C1033q) obj;
        if (Float.compare(c1033q.f11913e, this.f11913e) != 0 || Float.compare(c1033q.f11914f, this.f11914f) != 0 || !kotlin.jvm.internal.l.a(this.f11912d, c1033q.f11912d) || !Arrays.equals(this.f11916h, c1033q.f11916h)) {
            return false;
        }
        C1034r c1034r = c1033q.f11915g;
        C1034r c1034r2 = this.f11915g;
        if (c1034r2 != null) {
            return kotlin.jvm.internal.l.a(c1034r2, c1034r);
        }
        if (c1034r == null) {
            return true;
        }
        if (kotlin.jvm.internal.l.a(this.f11919k, c1033q.f11919k)) {
            return kotlin.jvm.internal.l.a(this.f11922n, c1033q.f11922n);
        }
        return false;
    }

    @Override // i0.AbstractC1019c
    public final long f(float f5, float f7, float f8, float f9, AbstractC1019c abstractC1019c) {
        float[] fArr = this.f11918j;
        float f10 = (fArr[6] * f8) + (fArr[3] * f7) + (fArr[0] * f5);
        float f11 = (fArr[7] * f8) + (fArr[4] * f7) + (fArr[1] * f5);
        float f12 = (fArr[8] * f8) + (fArr[5] * f7) + (fArr[2] * f5);
        C1029m c1029m = this.f11921m;
        return AbstractC0968M.b((float) c1029m.d(f10), (float) c1029m.d(f11), (float) c1029m.d(f12), f9, abstractC1019c);
    }

    @Override // i0.AbstractC1019c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f11916h) + ((this.f11912d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f5 = this.f11913e;
        int iFloatToIntBits = (iHashCode + (f5 == 0.0f ? 0 : Float.floatToIntBits(f5))) * 31;
        float f7 = this.f11914f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f7 == 0.0f ? 0 : Float.floatToIntBits(f7))) * 31;
        C1034r c1034r = this.f11915g;
        int iHashCode2 = iFloatToIntBits2 + (c1034r != null ? c1034r.hashCode() : 0);
        if (c1034r == null) {
            return this.f11922n.hashCode() + ((this.f11919k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    public C1033q(String str, float[] fArr, C1035s c1035s, final C1034r c1034r, int i7) {
        InterfaceC1025i interfaceC1025i;
        InterfaceC1025i interfaceC1025i2;
        double d4 = c1034r.f11930f;
        double d6 = c1034r.f11931g;
        if (d4 == 0.0d && d6 == 0.0d) {
            final int i8 = 0;
            interfaceC1025i = new InterfaceC1025i() { // from class: i0.o
                @Override // i0.InterfaceC1025i
                public final double d(double d7) {
                    switch (i8) {
                        case 0:
                            C1034r c1034r2 = c1034r;
                            double d8 = c1034r2.f11929e;
                            double d9 = c1034r2.f11928d;
                            return d7 >= d8 * d9 ? (Math.pow(d7, 1.0d / c1034r2.a) - c1034r2.f11927c) / c1034r2.f11926b : d7 / d9;
                        case 1:
                            C1034r c1034r3 = c1034r;
                            double d10 = c1034r3.f11926b;
                            double d11 = c1034r3.f11929e;
                            double d12 = c1034r3.f11928d;
                            return d7 >= d11 * d12 ? (Math.pow(d7 - c1034r3.f11930f, 1.0d / c1034r3.a) - c1034r3.f11927c) / d10 : (d7 - c1034r3.f11931g) / d12;
                        case 2:
                            C1034r c1034r4 = c1034r;
                            return d7 >= c1034r4.f11929e ? Math.pow((c1034r4.f11926b * d7) + c1034r4.f11927c, c1034r4.a) : d7 * c1034r4.f11928d;
                        default:
                            C1034r c1034r5 = c1034r;
                            double d13 = c1034r5.f11926b;
                            if (d7 >= c1034r5.f11929e) {
                                return Math.pow((d13 * d7) + c1034r5.f11927c, c1034r5.a) + c1034r5.f11930f;
                            }
                            return c1034r5.f11931g + (c1034r5.f11928d * d7);
                    }
                }
            };
        } else {
            final int i9 = 1;
            interfaceC1025i = new InterfaceC1025i() { // from class: i0.o
                @Override // i0.InterfaceC1025i
                public final double d(double d7) {
                    switch (i9) {
                        case 0:
                            C1034r c1034r2 = c1034r;
                            double d8 = c1034r2.f11929e;
                            double d9 = c1034r2.f11928d;
                            return d7 >= d8 * d9 ? (Math.pow(d7, 1.0d / c1034r2.a) - c1034r2.f11927c) / c1034r2.f11926b : d7 / d9;
                        case 1:
                            C1034r c1034r3 = c1034r;
                            double d10 = c1034r3.f11926b;
                            double d11 = c1034r3.f11929e;
                            double d12 = c1034r3.f11928d;
                            return d7 >= d11 * d12 ? (Math.pow(d7 - c1034r3.f11930f, 1.0d / c1034r3.a) - c1034r3.f11927c) / d10 : (d7 - c1034r3.f11931g) / d12;
                        case 2:
                            C1034r c1034r4 = c1034r;
                            return d7 >= c1034r4.f11929e ? Math.pow((c1034r4.f11926b * d7) + c1034r4.f11927c, c1034r4.a) : d7 * c1034r4.f11928d;
                        default:
                            C1034r c1034r5 = c1034r;
                            double d13 = c1034r5.f11926b;
                            if (d7 >= c1034r5.f11929e) {
                                return Math.pow((d13 * d7) + c1034r5.f11927c, c1034r5.a) + c1034r5.f11930f;
                            }
                            return c1034r5.f11931g + (c1034r5.f11928d * d7);
                    }
                }
            };
        }
        if (d4 == 0.0d && d6 == 0.0d) {
            final int i10 = 2;
            interfaceC1025i2 = new InterfaceC1025i() { // from class: i0.o
                @Override // i0.InterfaceC1025i
                public final double d(double d7) {
                    switch (i10) {
                        case 0:
                            C1034r c1034r2 = c1034r;
                            double d8 = c1034r2.f11929e;
                            double d9 = c1034r2.f11928d;
                            return d7 >= d8 * d9 ? (Math.pow(d7, 1.0d / c1034r2.a) - c1034r2.f11927c) / c1034r2.f11926b : d7 / d9;
                        case 1:
                            C1034r c1034r3 = c1034r;
                            double d10 = c1034r3.f11926b;
                            double d11 = c1034r3.f11929e;
                            double d12 = c1034r3.f11928d;
                            return d7 >= d11 * d12 ? (Math.pow(d7 - c1034r3.f11930f, 1.0d / c1034r3.a) - c1034r3.f11927c) / d10 : (d7 - c1034r3.f11931g) / d12;
                        case 2:
                            C1034r c1034r4 = c1034r;
                            return d7 >= c1034r4.f11929e ? Math.pow((c1034r4.f11926b * d7) + c1034r4.f11927c, c1034r4.a) : d7 * c1034r4.f11928d;
                        default:
                            C1034r c1034r5 = c1034r;
                            double d13 = c1034r5.f11926b;
                            if (d7 >= c1034r5.f11929e) {
                                return Math.pow((d13 * d7) + c1034r5.f11927c, c1034r5.a) + c1034r5.f11930f;
                            }
                            return c1034r5.f11931g + (c1034r5.f11928d * d7);
                    }
                }
            };
        } else {
            final int i11 = 3;
            interfaceC1025i2 = new InterfaceC1025i() { // from class: i0.o
                @Override // i0.InterfaceC1025i
                public final double d(double d7) {
                    switch (i11) {
                        case 0:
                            C1034r c1034r2 = c1034r;
                            double d8 = c1034r2.f11929e;
                            double d9 = c1034r2.f11928d;
                            return d7 >= d8 * d9 ? (Math.pow(d7, 1.0d / c1034r2.a) - c1034r2.f11927c) / c1034r2.f11926b : d7 / d9;
                        case 1:
                            C1034r c1034r3 = c1034r;
                            double d10 = c1034r3.f11926b;
                            double d11 = c1034r3.f11929e;
                            double d12 = c1034r3.f11928d;
                            return d7 >= d11 * d12 ? (Math.pow(d7 - c1034r3.f11930f, 1.0d / c1034r3.a) - c1034r3.f11927c) / d10 : (d7 - c1034r3.f11931g) / d12;
                        case 2:
                            C1034r c1034r4 = c1034r;
                            return d7 >= c1034r4.f11929e ? Math.pow((c1034r4.f11926b * d7) + c1034r4.f11927c, c1034r4.a) : d7 * c1034r4.f11928d;
                        default:
                            C1034r c1034r5 = c1034r;
                            double d13 = c1034r5.f11926b;
                            if (d7 >= c1034r5.f11929e) {
                                return Math.pow((d13 * d7) + c1034r5.f11927c, c1034r5.a) + c1034r5.f11930f;
                            }
                            return c1034r5.f11931g + (c1034r5.f11928d * d7);
                    }
                }
            };
        }
        this(str, fArr, c1035s, null, interfaceC1025i, interfaceC1025i2, 0.0f, 1.0f, c1034r, i7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1033q(String str, float[] fArr, C1035s c1035s, final double d4, float f5, float f7, int i7) {
        InterfaceC1025i interfaceC1025i;
        InterfaceC1025i interfaceC1025i2 = f11911r;
        if (d4 == 1.0d) {
            interfaceC1025i = interfaceC1025i2;
        } else {
            final int i8 = 0;
            interfaceC1025i = new InterfaceC1025i() { // from class: i0.n
                @Override // i0.InterfaceC1025i
                public final double d(double d6) {
                    switch (i8) {
                        case 0:
                            if (d6 < 0.0d) {
                                d6 = 0.0d;
                            }
                            return Math.pow(d6, 1.0d / d4);
                        default:
                            if (d6 < 0.0d) {
                                d6 = 0.0d;
                            }
                            return Math.pow(d6, d4);
                    }
                }
            };
        }
        if (d4 != 1.0d) {
            final int i9 = 1;
            interfaceC1025i2 = new InterfaceC1025i() { // from class: i0.n
                @Override // i0.InterfaceC1025i
                public final double d(double d6) {
                    switch (i9) {
                        case 0:
                            if (d6 < 0.0d) {
                                d6 = 0.0d;
                            }
                            return Math.pow(d6, 1.0d / d4);
                        default:
                            if (d6 < 0.0d) {
                                d6 = 0.0d;
                            }
                            return Math.pow(d6, d4);
                    }
                }
            };
        }
        this(str, fArr, c1035s, null, interfaceC1025i, interfaceC1025i2, f5, f7, new C1034r(d4, 1.0d, 0.0d, 0.0d, 0.0d), i7);
    }
}
