package U0;

import m.AbstractC1493n;
import m.C1478H;
import n.AbstractC1529a;

/* loaded from: classes.dex */
public abstract class b {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: b, reason: collision with root package name */
    public static volatile C1478H f9129b = new C1478H(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f9130c;

    static {
        Object[] objArr = new Object[0];
        f9130c = objArr;
        synchronized (objArr) {
            f9129b.d((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f9129b.d((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f9129b.d((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f9129b.d((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f9129b.d((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f9129b.c(0) / 100.0f) - 0.01f <= 1.03f) {
            throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
    }

    public static a a(float f5) {
        float fC;
        a cVar;
        if (f5 < 1.03f) {
            return null;
        }
        int i7 = (int) (f5 * 100.0f);
        a aVar = (a) f9129b.b(i7);
        if (aVar != null) {
            return aVar;
        }
        C1478H c1478h = f9129b;
        if (c1478h.f12871k) {
            AbstractC1493n.a(c1478h);
        }
        int iA = AbstractC1529a.a(c1478h.f12874n, i7, c1478h.f12872l);
        if (iA >= 0) {
            return (a) f9129b.f(iA);
        }
        int i8 = -(iA + 1);
        int i9 = i8 - 1;
        if (i8 >= f9129b.e()) {
            c cVar2 = new c(new float[]{1.0f}, new float[]{f5});
            b(f5, cVar2);
            return cVar2;
        }
        float[] fArr = a;
        if (i9 < 0) {
            cVar = new c(fArr, fArr);
            fC = 1.0f;
        } else {
            fC = f9129b.c(i9) / 100.0f;
            cVar = (a) f9129b.f(i9);
        }
        float fC2 = f9129b.c(i8) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fC == fC2 ? 0.0f : (f5 - fC) / (fC2 - fC))) * 1.0f) + 0.0f;
        a aVar2 = (a) f9129b.f(i8);
        float[] fArr2 = new float[9];
        for (int i10 = 0; i10 < 9; i10++) {
            float f7 = fArr[i10];
            float fB = cVar.b(f7);
            fArr2[i10] = ((aVar2.b(f7) - fB) * fMax) + fB;
        }
        c cVar3 = new c(fArr, fArr2);
        b(f5, cVar3);
        return cVar3;
    }

    public static void b(float f5, c cVar) {
        synchronized (f9130c) {
            C1478H c1478hClone = f9129b.clone();
            c1478hClone.d((int) (f5 * 100.0f), cVar);
            f9129b = c1478hClone;
        }
    }
}
