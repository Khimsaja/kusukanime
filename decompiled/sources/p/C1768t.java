package p;

import java.util.Arrays;

/* renamed from: p.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1768t {

    /* renamed from: s, reason: collision with root package name */
    public static float[] f14111s;
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14112b;

    /* renamed from: c, reason: collision with root package name */
    public final float f14113c;

    /* renamed from: d, reason: collision with root package name */
    public final float f14114d;

    /* renamed from: e, reason: collision with root package name */
    public final float f14115e;

    /* renamed from: f, reason: collision with root package name */
    public final float f14116f;

    /* renamed from: g, reason: collision with root package name */
    public final float f14117g;

    /* renamed from: h, reason: collision with root package name */
    public float f14118h;

    /* renamed from: i, reason: collision with root package name */
    public float f14119i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f14120j;

    /* renamed from: k, reason: collision with root package name */
    public final float f14121k;

    /* renamed from: l, reason: collision with root package name */
    public final float f14122l;

    /* renamed from: m, reason: collision with root package name */
    public final float f14123m;

    /* renamed from: n, reason: collision with root package name */
    public final float f14124n;

    /* renamed from: o, reason: collision with root package name */
    public final float f14125o;

    /* renamed from: p, reason: collision with root package name */
    public final float f14126p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f14127q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f14128r;

    public C1768t(int i7, float f5, float f7, float f8, float f9, float f10, float f11) {
        boolean z7;
        float f12;
        float f13;
        float f14 = f8;
        this.a = f5;
        this.f14112b = f7;
        this.f14113c = f14;
        this.f14114d = f9;
        this.f14115e = f10;
        this.f14116f = f11;
        float f15 = f10 - f14;
        float f16 = f11 - f9;
        int i8 = 1;
        float f17 = 0.0f;
        boolean z8 = i7 == 1 || (i7 == 4 ? f16 > 0.0f : !(i7 != 5 || f16 >= 0.0f));
        this.f14127q = z8;
        float f18 = f7 - f5;
        float f19 = 1 / f18;
        this.f14121k = f19;
        boolean z9 = 3 == i7;
        if (z9 || Math.abs(f15) < 0.001f || Math.abs(f16) < 0.001f) {
            float fHypot = (float) Math.hypot(f16, f15);
            this.f14117g = fHypot;
            this.f14126p = fHypot * f19;
            this.f14124n = f15 / f18;
            this.f14125o = f16 / f18;
            this.f14120j = new float[101];
            this.f14122l = Float.NaN;
            this.f14123m = Float.NaN;
            z7 = true;
        } else {
            this.f14120j = new float[101];
            this.f14122l = (z8 ? -1 : 1) * f15;
            this.f14123m = f16 * (z8 ? 1 : -1);
            this.f14124n = z8 ? f10 : f14;
            this.f14125o = z8 ? f9 : f11;
            float f20 = f9 - f11;
            int length = R1.i.e().length;
            float fHypot2 = 0.0f;
            float f21 = 0.0f;
            float f22 = 0.0f;
            int i9 = 0;
            while (i9 < length) {
                int i10 = i8;
                float f23 = f17;
                double radians = (float) Math.toRadians((i9 * 90.0d) / (R1.i.e().length - i10));
                float fSin = ((float) Math.sin(radians)) * f15;
                float fCos = ((float) Math.cos(radians)) * f20;
                if (i9 > 0) {
                    f12 = f20;
                    f13 = fSin;
                    fHypot2 += (float) Math.hypot(fSin - f21, fCos - f22);
                    R1.i.e()[i9] = fHypot2;
                } else {
                    f12 = f20;
                    f13 = fSin;
                }
                i9++;
                f20 = f12;
                f21 = f13;
                f22 = fCos;
                i8 = i10;
                f17 = f23;
            }
            int i11 = i8;
            float f24 = f17;
            this.f14117g = fHypot2;
            int length2 = R1.i.e().length;
            for (int i12 = 0; i12 < length2; i12++) {
                float[] fArrE = R1.i.e();
                fArrE[i12] = fArrE[i12] / fHypot2;
            }
            float[] fArr = this.f14120j;
            int length3 = fArr.length;
            for (int i13 = 0; i13 < length3; i13++) {
                float length4 = i13 / (fArr.length - i11);
                float[] fArrE2 = R1.i.e();
                int iBinarySearch = Arrays.binarySearch(fArrE2, 0, fArrE2.length, length4);
                if (iBinarySearch >= 0) {
                    fArr[i13] = iBinarySearch / (R1.i.e().length - i11);
                } else if (iBinarySearch == -1) {
                    fArr[i13] = f24;
                } else {
                    int i14 = -iBinarySearch;
                    int i15 = i14 - 2;
                    fArr[i13] = (((length4 - R1.i.e()[i15]) / (R1.i.e()[i14 - i11] - R1.i.e()[i15])) + i15) / (R1.i.e().length - i11);
                }
            }
            this.f14126p = this.f14117g * this.f14121k;
            z7 = z9;
        }
        this.f14128r = z7;
    }

    public final float a() {
        float f5 = this.f14122l * this.f14119i;
        float fHypot = this.f14126p / ((float) Math.hypot(f5, (-this.f14123m) * this.f14118h));
        return this.f14127q ? (-f5) * fHypot : f5 * fHypot;
    }

    public final float b() {
        float f5 = this.f14122l * this.f14119i;
        float f7 = (-this.f14123m) * this.f14118h;
        float fHypot = this.f14126p / ((float) Math.hypot(f5, f7));
        return this.f14127q ? (-f7) * fHypot : f7 * fHypot;
    }

    public final void c(float f5) {
        float f7 = (this.f14127q ? this.f14112b - f5 : f5 - this.a) * this.f14121k;
        float f8 = 0.0f;
        if (f7 > 0.0f) {
            f8 = 1.0f;
            if (f7 < 1.0f) {
                float[] fArr = this.f14120j;
                float length = f7 * (fArr.length - 1);
                int i7 = (int) length;
                float f9 = fArr[i7];
                f8 = ((fArr[i7 + 1] - f9) * (length - i7)) + f9;
            }
        }
        double d4 = f8 * 1.5707964f;
        this.f14118h = (float) Math.sin(d4);
        this.f14119i = (float) Math.cos(d4);
    }
}
