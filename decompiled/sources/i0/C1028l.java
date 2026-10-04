package i0;

import P3.F;
import h0.AbstractC0968M;

/* renamed from: i0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1028l extends AbstractC1019c {

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f11899d;

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f11900e;

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f11901f;

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f11902g;

    static {
        float[] fArrH = AbstractC1026j.h(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC1026j.c(C1017a.f11861b.a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f11899d = fArrH;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f11900e = fArr;
        f11901f = AbstractC1026j.g(fArrH);
        f11902g = AbstractC1026j.g(fArr);
    }

    @Override // i0.AbstractC1019c
    public final float a(int i7) {
        return i7 == 0 ? 1.0f : 0.5f;
    }

    @Override // i0.AbstractC1019c
    public final float b(int i7) {
        return i7 == 0 ? 0.0f : -0.5f;
    }

    @Override // i0.AbstractC1019c
    public final long d(float f5, float f7, float f8) {
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (f7 < -0.5f) {
            f7 = -0.5f;
        }
        if (f7 > 0.5f) {
            f7 = 0.5f;
        }
        if (f8 < -0.5f) {
            f8 = -0.5f;
        }
        float f9 = f8 <= 0.5f ? f8 : 0.5f;
        float[] fArr = f11902g;
        float f10 = (fArr[6] * f9) + (fArr[3] * f7) + (fArr[0] * f5);
        float f11 = (fArr[7] * f9) + (fArr[4] * f7) + (fArr[1] * f5);
        float f12 = (fArr[8] * f9) + (fArr[5] * f7) + (fArr[2] * f5);
        float f13 = f11 * f11 * f11;
        float f14 = f12 * f12 * f12;
        float[] fArr2 = f11901f;
        float f15 = (fArr2[6] * f14) + (fArr2[3] * f13) + (fArr2[0] * f10 * f10 * f10);
        return (Float.floatToRawIntBits((fArr2[7] * f14) + (fArr2[4] * f13) + (fArr2[1] * r11)) & 4294967295L) | (Float.floatToRawIntBits(f15) << 32);
    }

    @Override // i0.AbstractC1019c
    public final float e(float f5, float f7, float f8) {
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (f7 < -0.5f) {
            f7 = -0.5f;
        }
        if (f7 > 0.5f) {
            f7 = 0.5f;
        }
        if (f8 < -0.5f) {
            f8 = -0.5f;
        }
        float f9 = f8 <= 0.5f ? f8 : 0.5f;
        float[] fArr = f11902g;
        float f10 = (fArr[6] * f9) + (fArr[3] * f7) + (fArr[0] * f5);
        float f11 = (fArr[7] * f9) + (fArr[4] * f7) + (fArr[1] * f5);
        float f12 = (fArr[8] * f9) + (fArr[5] * f7) + (fArr[2] * f5);
        float f13 = f10 * f10 * f10;
        float f14 = f11 * f11 * f11;
        float f15 = f12 * f12 * f12;
        float[] fArr2 = f11901f;
        return (fArr2[8] * f15) + (fArr2[5] * f14) + (fArr2[2] * f13);
    }

    @Override // i0.AbstractC1019c
    public final long f(float f5, float f7, float f8, float f9, AbstractC1019c abstractC1019c) {
        float[] fArr = f11899d;
        float f10 = (fArr[6] * f8) + (fArr[3] * f7) + (fArr[0] * f5);
        float f11 = (fArr[7] * f8) + (fArr[4] * f7) + (fArr[1] * f5);
        float f12 = (fArr[8] * f8) + (fArr[5] * f7) + (fArr[2] * f5);
        float fQ = F.q(f10);
        float fQ2 = F.q(f11);
        float fQ3 = F.q(f12);
        float[] fArr2 = f11900e;
        return AbstractC0968M.b((fArr2[6] * fQ3) + (fArr2[3] * fQ2) + (fArr2[0] * fQ), (fArr2[7] * fQ3) + (fArr2[4] * fQ2) + (fArr2[1] * fQ), (fArr2[8] * fQ3) + (fArr2[5] * fQ2) + (fArr2[2] * fQ), f9, abstractC1019c);
    }
}
