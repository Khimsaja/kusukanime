package h0;

import e5.AbstractC0832b;
import java.util.Arrays;
import z5.AbstractC2511p;

/* renamed from: h0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0962G {
    public final float[] a;

    public static float[] a() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final long b(long j7, float[] fArr) {
        float fD = g0.c.d(j7);
        float fE = g0.c.e(j7);
        float f5 = 1 / (((fArr[7] * fE) + (fArr[3] * fD)) + fArr[15]);
        if (Float.isInfinite(f5) || Float.isNaN(f5)) {
            f5 = 0.0f;
        }
        return AbstractC0832b.e(((fArr[4] * fE) + (fArr[0] * fD) + fArr[12]) * f5, ((fArr[5] * fE) + (fArr[1] * fD) + fArr[13]) * f5);
    }

    public static final void c(float[] fArr, g0.b bVar) {
        long jB = b(AbstractC0832b.e(bVar.a, bVar.f11655b), fArr);
        long jB2 = b(AbstractC0832b.e(bVar.a, bVar.f11657d), fArr);
        long jB3 = b(AbstractC0832b.e(bVar.f11656c, bVar.f11655b), fArr);
        long jB4 = b(AbstractC0832b.e(bVar.f11656c, bVar.f11657d), fArr);
        bVar.a = Math.min(Math.min(g0.c.d(jB), g0.c.d(jB2)), Math.min(g0.c.d(jB3), g0.c.d(jB4)));
        bVar.f11655b = Math.min(Math.min(g0.c.e(jB), g0.c.e(jB2)), Math.min(g0.c.e(jB3), g0.c.e(jB4)));
        bVar.f11656c = Math.max(Math.max(g0.c.d(jB), g0.c.d(jB2)), Math.max(g0.c.d(jB3), g0.c.d(jB4)));
        bVar.f11657d = Math.max(Math.max(g0.c.e(jB), g0.c.e(jB2)), Math.max(g0.c.e(jB3), g0.c.e(jB4)));
    }

    public static final void d(float[] fArr) {
        int i7 = 0;
        while (i7 < 4) {
            int i8 = 0;
            while (i8 < 4) {
                fArr[(i8 * 4) + i7] = i7 == i8 ? 1.0f : 0.0f;
                i8++;
            }
            i7++;
        }
    }

    public static final void e(float[] fArr, float f5) {
        double d4 = (f5 * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d4);
        float fSin = (float) Math.sin(d4);
        float f7 = fArr[0];
        float f8 = fArr[4];
        float f9 = (fSin * f8) + (fCos * f7);
        float f10 = -fSin;
        float f11 = fArr[1];
        float f12 = fArr[5];
        float f13 = (fSin * f12) + (fCos * f11);
        float f14 = fArr[2];
        float f15 = fArr[6];
        float f16 = (fSin * f15) + (fCos * f14);
        float f17 = fArr[3];
        float f18 = fArr[7];
        fArr[0] = f9;
        fArr[1] = f13;
        fArr[2] = f16;
        fArr[3] = (fSin * f18) + (fCos * f17);
        fArr[4] = (f8 * fCos) + (f7 * f10);
        fArr[5] = (f12 * fCos) + (f11 * f10);
        fArr[6] = (f15 * fCos) + (f14 * f10);
        fArr[7] = (fCos * f18) + (f10 * f17);
    }

    public static final void f(float[] fArr, float f5, float f7) {
        fArr[0] = fArr[0] * f5;
        fArr[1] = fArr[1] * f5;
        fArr[2] = fArr[2] * f5;
        fArr[3] = fArr[3] * f5;
        fArr[4] = fArr[4] * f7;
        fArr[5] = fArr[5] * f7;
        fArr[6] = fArr[6] * f7;
        fArr[7] = fArr[7] * f7;
        fArr[8] = fArr[8] * 1.0f;
        fArr[9] = fArr[9] * 1.0f;
        fArr[10] = fArr[10] * 1.0f;
        fArr[11] = fArr[11] * 1.0f;
    }

    public static final void g(float[] fArr, float[] fArr2) {
        float fK = AbstractC0968M.k(0, 0, fArr, fArr2);
        float fK2 = AbstractC0968M.k(0, 1, fArr, fArr2);
        float fK3 = AbstractC0968M.k(0, 2, fArr, fArr2);
        float fK4 = AbstractC0968M.k(0, 3, fArr, fArr2);
        float fK5 = AbstractC0968M.k(1, 0, fArr, fArr2);
        float fK6 = AbstractC0968M.k(1, 1, fArr, fArr2);
        float fK7 = AbstractC0968M.k(1, 2, fArr, fArr2);
        float fK8 = AbstractC0968M.k(1, 3, fArr, fArr2);
        float fK9 = AbstractC0968M.k(2, 0, fArr, fArr2);
        float fK10 = AbstractC0968M.k(2, 1, fArr, fArr2);
        float fK11 = AbstractC0968M.k(2, 2, fArr, fArr2);
        float fK12 = AbstractC0968M.k(2, 3, fArr, fArr2);
        float fK13 = AbstractC0968M.k(3, 0, fArr, fArr2);
        float fK14 = AbstractC0968M.k(3, 1, fArr, fArr2);
        float fK15 = AbstractC0968M.k(3, 2, fArr, fArr2);
        float fK16 = AbstractC0968M.k(3, 3, fArr, fArr2);
        fArr[0] = fK;
        fArr[1] = fK2;
        fArr[2] = fK3;
        fArr[3] = fK4;
        fArr[4] = fK5;
        fArr[5] = fK6;
        fArr[6] = fK7;
        fArr[7] = fK8;
        fArr[8] = fK9;
        fArr[9] = fK10;
        fArr[10] = fK11;
        fArr[11] = fK12;
        fArr[12] = fK13;
        fArr[13] = fK14;
        fArr[14] = fK15;
        fArr[15] = fK16;
    }

    public static final void h(float[] fArr, float f5, float f7) {
        float f8 = (fArr[8] * 0.0f) + (fArr[4] * f7) + (fArr[0] * f5) + fArr[12];
        float f9 = (fArr[9] * 0.0f) + (fArr[5] * f7) + (fArr[1] * f5) + fArr[13];
        float f10 = (fArr[10] * 0.0f) + (fArr[6] * f7) + (fArr[2] * f5) + fArr[14];
        float f11 = (fArr[11] * 0.0f) + (fArr[7] * f7) + (fArr[3] * f5) + fArr[15];
        fArr[12] = f8;
        fArr[13] = f9;
        fArr[14] = f10;
        fArr[15] = f11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0962G) {
            return kotlin.jvm.internal.l.a(this.a, ((C0962G) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |");
        float[] fArr = this.a;
        sb.append(fArr[0]);
        sb.append(' ');
        sb.append(fArr[1]);
        sb.append(' ');
        sb.append(fArr[2]);
        sb.append(' ');
        sb.append(fArr[3]);
        sb.append("|\n            |");
        sb.append(fArr[4]);
        sb.append(' ');
        sb.append(fArr[5]);
        sb.append(' ');
        sb.append(fArr[6]);
        sb.append(' ');
        sb.append(fArr[7]);
        sb.append("|\n            |");
        sb.append(fArr[8]);
        sb.append(' ');
        sb.append(fArr[9]);
        sb.append(' ');
        sb.append(fArr[10]);
        sb.append(' ');
        sb.append(fArr[11]);
        sb.append("|\n            |");
        sb.append(fArr[12]);
        sb.append(' ');
        sb.append(fArr[13]);
        sb.append(' ');
        sb.append(fArr[14]);
        sb.append(' ');
        sb.append(fArr[15]);
        sb.append("|\n        ");
        return AbstractC2511p.E(sb.toString());
    }
}
