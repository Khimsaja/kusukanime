package o;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1604b {
    public static final float[] a;

    static {
        float f5;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float[] fArr = new float[101];
        a = fArr;
        float[] fArr2 = new float[101];
        float f15 = 0.0f;
        int i7 = 0;
        float f16 = 0.0f;
        while (true) {
            float f17 = 1.0f;
            if (i7 >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f18 = i7 / 100;
            float f19 = 1.0f;
            while (true) {
                f5 = ((f19 - f15) / 2.0f) + f15;
                f7 = f17 - f5;
                f8 = f5 * 3.0f * f7;
                f9 = f5 * f5 * f5;
                float f20 = (((f5 * 0.35000002f) + (f7 * 0.175f)) * f8) + f9;
                f10 = f17;
                if (Math.abs(f20 - f18) < 1.0E-5d) {
                    break;
                }
                if (f20 > f18) {
                    f19 = f5;
                } else {
                    f15 = f5;
                }
                f17 = f10;
            }
            float f21 = 0.5f;
            fArr[i7] = (((f7 * 0.5f) + f5) * f8) + f9;
            float f22 = f10;
            while (true) {
                f11 = ((f22 - f16) / 2.0f) + f16;
                f12 = f10 - f11;
                f13 = f11 * 3.0f * f12;
                f14 = f11 * f11 * f11;
                float f23 = (((f12 * f21) + f11) * f13) + f14;
                float f24 = f22;
                if (Math.abs(f23 - f18) >= 1.0E-5d) {
                    if (f23 > f18) {
                        f22 = f11;
                    } else {
                        f16 = f11;
                        f22 = f24;
                    }
                    f21 = 0.5f;
                }
            }
            fArr2[i7] = (((f11 * 0.35000002f) + (f12 * 0.175f)) * f13) + f14;
            i7++;
        }
    }

    public static C1603a a(float f5) {
        float f7 = 0.0f;
        float f8 = 1.0f;
        float fJ = e3.c.j(f5, 0.0f, 1.0f);
        float f9 = 100;
        int i7 = (int) (f9 * fJ);
        if (i7 < 100) {
            float f10 = i7 / f9;
            int i8 = i7 + 1;
            float f11 = i8 / f9;
            float[] fArr = a;
            float f12 = fArr[i7];
            float f13 = (fArr[i8] - f12) / (f11 - f10);
            float f14 = ((fJ - f10) * f13) + f12;
            f7 = f13;
            f8 = f14;
        }
        return new C1603a(f8, f7);
    }
}
