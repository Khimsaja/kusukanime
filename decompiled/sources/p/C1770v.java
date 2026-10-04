package p;

import b1.AbstractC0703b;
import h0.AbstractC0968M;

/* renamed from: p.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1770v implements InterfaceC1774z {

    /* renamed from: k, reason: collision with root package name */
    public final float f14145k;

    /* renamed from: l, reason: collision with root package name */
    public final float f14146l;

    /* renamed from: m, reason: collision with root package name */
    public final float f14147m;

    /* renamed from: n, reason: collision with root package name */
    public final float f14148n;

    /* renamed from: o, reason: collision with root package name */
    public final float f14149o;

    public C1770v(float f5, float f7, float f8) {
        int iA;
        this.f14145k = f5;
        this.f14146l = f7;
        this.f14147m = f8;
        if (Float.isNaN(f5) || Float.isNaN(f7) || Float.isNaN(f8) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f5 + ", " + f7 + ", " + f8 + ", 1.0.");
        }
        float[] fArr = new float[5];
        float f9 = (f7 - 0.0f) * 3.0f;
        float f10 = (1.0f - f7) * 3.0f;
        double d4 = f9;
        double d6 = f10;
        double d7 = 0.0f;
        double d8 = d6 * 2.0d;
        double d9 = (d4 - d8) + d7;
        if (d9 == 0.0d) {
            iA = d6 == d7 ? 0 : AbstractC0968M.A((float) ((d8 - d7) / (d8 - (d7 * 2.0d))), fArr, 0);
        } else {
            double d10 = -Math.sqrt((d6 * d6) - (d7 * d4));
            double d11 = (-d4) + d6;
            int iA2 = AbstractC0968M.A((float) ((-(d10 + d11)) / d9), fArr, 0);
            iA = AbstractC0968M.A((float) ((d10 - d11) / d9), fArr, iA2) + iA2;
            if (iA > 1) {
                float f11 = fArr[0];
                float f12 = fArr[1];
                if (f11 > f12) {
                    fArr[0] = f12;
                    fArr[1] = f11;
                } else if (f11 == f12) {
                    iA--;
                }
            }
        }
        float f13 = (f10 - f9) * 2.0f;
        int iA3 = AbstractC0968M.A((-f13) / (((0.0f - f10) * 2.0f) - f13), fArr, iA) + iA;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i7 = 0; i7 < iA3; i7++) {
            float f14 = fArr[i7];
            float f15 = (((((((((f7 - 1.0f) * 3.0f) + 1.0f) - 0.0f) * f14) + (((1.0f - (f7 * 2.0f)) + 0.0f) * 3.0f)) * f14) + f9) * f14) + 0.0f;
            fMin = Math.min(fMin, f15);
            fMax = Math.max(fMax, f15);
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fMin) << 32) | (Float.floatToRawIntBits(fMax) & 4294967295L);
        this.f14148n = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f14149o = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc A[PHI: r4
      0x00bc: PHI (r4v25 float) = (r4v15 float), (r4v20 float), (r4v33 float) binds: [B:67:0x014b, B:81:0x017a, B:35:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b8  */
    @Override // p.InterfaceC1774z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float b(float r28) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1770v.b(float):float");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1770v)) {
            return false;
        }
        C1770v c1770v = (C1770v) obj;
        return this.f14145k == c1770v.f14145k && this.f14146l == c1770v.f14146l && this.f14147m == c1770v.f14147m;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + AbstractC0703b.b(this.f14147m, AbstractC0703b.b(this.f14146l, Float.hashCode(this.f14145k) * 31, 31), 31);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.f14145k + ", b=" + this.f14146l + ", c=" + this.f14147m + ", d=1.0)";
    }
}
