package i0;

/* renamed from: i0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1026j {
    public static final C1035s a = new C1035s(0.31006f, 0.31616f);

    /* renamed from: b, reason: collision with root package name */
    public static final C1035s f11894b = new C1035s(0.34567f, 0.3585f);

    /* renamed from: c, reason: collision with root package name */
    public static final C1035s f11895c = new C1035s(0.32168f, 0.33767f);

    /* renamed from: d, reason: collision with root package name */
    public static final C1035s f11896d = new C1035s(0.31271f, 0.32902f);

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f11897e = {0.964212f, 1.0f, 0.825188f};

    public static AbstractC1019c a(AbstractC1019c abstractC1019c) {
        C1035s c1035s = f11894b;
        C1017a c1017a = C1017a.f11861b;
        if (AbstractC1018b.a(abstractC1019c.f11866b, AbstractC1018b.a)) {
            C1033q c1033q = (C1033q) abstractC1019c;
            C1035s c1035s2 = c1033q.f11912d;
            if (!d(c1035s2, c1035s)) {
                return new C1033q(c1033q.a, c1033q.f11916h, c1035s, h(c(c1017a.a, c1035s2.a(), c1035s.a()), c1033q.f11917i), c1033q.f11919k, c1033q.f11922n, c1033q.f11913e, c1033q.f11914f, c1033q.f11915g, -1);
            }
        }
        return abstractC1019c;
    }

    public static float b(float[] fArr) {
        float f5 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = (((((f8 * f11) + ((f7 * f10) + (f5 * f9))) - (f9 * f10)) - (f7 * f8)) - (f5 * f11)) * 0.5f;
        return f12 < 0.0f ? -f12 : f12;
    }

    public static final float[] c(float[] fArr, float[] fArr2, float[] fArr3) {
        i(fArr, fArr2);
        i(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrG = g(fArr);
        float f5 = fArr4[0];
        float f7 = fArr[0] * f5;
        float f8 = fArr4[1];
        float f9 = fArr[1] * f8;
        float f10 = fArr4[2];
        return h(fArrG, new float[]{f7, f9, fArr[2] * f10, fArr[3] * f5, fArr[4] * f8, fArr[5] * f10, f5 * fArr[6], f8 * fArr[7], f10 * fArr[8]});
    }

    public static final boolean d(C1035s c1035s, C1035s c1035s2) {
        if (c1035s == c1035s2) {
            return true;
        }
        return Math.abs(c1035s.a - c1035s2.a) < 0.001f && Math.abs(c1035s.f11932b - c1035s2.f11932b) < 0.001f;
    }

    public static final C1023g e(AbstractC1019c abstractC1019c, AbstractC1019c abstractC1019c2) {
        if (abstractC1019c == abstractC1019c2) {
            return new C1021e(abstractC1019c, abstractC1019c, 1);
        }
        long j7 = AbstractC1018b.a;
        return (AbstractC1018b.a(abstractC1019c.f11866b, j7) && AbstractC1018b.a(abstractC1019c2.f11866b, j7)) ? new C1022f((C1033q) abstractC1019c, (C1033q) abstractC1019c2) : new C1023g(abstractC1019c, abstractC1019c2, 0);
    }

    public static float f(float f5, float f7, float f8, float f9) {
        return (f5 * f9) - (f7 * f8);
    }

    public static final float[] g(float[] fArr) {
        float f5 = fArr[0];
        float f7 = fArr[3];
        float f8 = fArr[6];
        float f9 = fArr[1];
        float f10 = fArr[4];
        float f11 = fArr[7];
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[8];
        float f15 = (f10 * f14) - (f11 * f13);
        float f16 = (f11 * f12) - (f9 * f14);
        float f17 = (f9 * f13) - (f10 * f12);
        float f18 = (f8 * f17) + (f7 * f16) + (f5 * f15);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f15 / f18;
        fArr2[1] = f16 / f18;
        fArr2[2] = f17 / f18;
        fArr2[3] = ((f8 * f13) - (f7 * f14)) / f18;
        fArr2[4] = ((f14 * f5) - (f8 * f12)) / f18;
        fArr2[5] = ((f12 * f7) - (f13 * f5)) / f18;
        fArr2[6] = ((f7 * f11) - (f8 * f10)) / f18;
        fArr2[7] = ((f8 * f9) - (f11 * f5)) / f18;
        fArr2[8] = ((f5 * f10) - (f7 * f9)) / f18;
        return fArr2;
    }

    public static final float[] h(float[] fArr, float[] fArr2) {
        float f5 = fArr[0];
        float f7 = fArr2[0];
        float f8 = fArr[3];
        float f9 = fArr2[1];
        float f10 = fArr[6];
        float f11 = fArr2[2];
        float f12 = (f10 * f11) + (f8 * f9) + (f5 * f7);
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[7];
        float f16 = (f15 * f11) + (f14 * f9) + (f13 * f7);
        float f17 = fArr[2];
        float f18 = fArr[5];
        float f19 = fArr[8];
        float f20 = (f11 * f19) + (f9 * f18) + (f7 * f17);
        float f21 = fArr2[3];
        float f22 = fArr2[4];
        float f23 = fArr2[5];
        float f24 = (f10 * f23) + (f8 * f22) + (f5 * f21);
        float f25 = (f15 * f23) + (f14 * f22) + (f13 * f21);
        float f26 = (f23 * f19) + (f22 * f18) + (f21 * f17);
        float f27 = fArr2[6];
        float f28 = fArr2[7];
        float f29 = (f8 * f28) + (f5 * f27);
        float f30 = fArr2[8];
        return new float[]{f12, f16, f20, f24, f25, f26, (f10 * f30) + f29, (f15 * f30) + (f14 * f28) + (f13 * f27), (f19 * f30) + (f18 * f28) + (f17 * f27)};
    }

    public static final void i(float[] fArr, float[] fArr2) {
        float f5 = fArr2[0];
        float f7 = fArr2[1];
        float f8 = fArr2[2];
        fArr2[0] = (fArr[6] * f8) + (fArr[3] * f7) + (fArr[0] * f5);
        fArr2[1] = (fArr[7] * f8) + (fArr[4] * f7) + (fArr[1] * f5);
        fArr2[2] = (fArr[8] * f8) + (fArr[5] * f7) + (fArr[2] * f5);
    }
}
