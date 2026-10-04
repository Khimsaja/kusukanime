package i0;

import h0.AbstractC0968M;
import h0.C0998u;
import java.util.Arrays;

/* renamed from: i0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1022f extends C1023g {

    /* renamed from: e, reason: collision with root package name */
    public final C1033q f11888e;

    /* renamed from: f, reason: collision with root package name */
    public final C1033q f11889f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f11890g;

    public C1022f(C1033q c1033q, C1033q c1033q2) {
        float[] fArrH;
        super(c1033q2, c1033q, c1033q2, null);
        this.f11888e = c1033q;
        this.f11889f = c1033q2;
        C1035s c1035s = c1033q2.f11912d;
        C1035s c1035s2 = c1033q.f11912d;
        boolean zD = AbstractC1026j.d(c1035s2, c1035s);
        float[] fArrH2 = c1033q.f11917i;
        float[] fArrG = c1033q2.f11918j;
        if (zD) {
            fArrH = AbstractC1026j.h(fArrG, fArrH2);
        } else {
            float[] fArrA = c1035s2.a();
            C1035s c1035s3 = c1033q2.f11912d;
            float[] fArrA2 = c1035s3.a();
            C1035s c1035s4 = AbstractC1026j.f11894b;
            boolean zD2 = AbstractC1026j.d(c1035s2, c1035s4);
            float[] fArr = AbstractC1026j.f11897e;
            float[] fArr2 = C1017a.f11861b.a;
            if (!zD2) {
                float[] fArrCopyOf = Arrays.copyOf(fArr, 3);
                kotlin.jvm.internal.l.e("copyOf(this, size)", fArrCopyOf);
                fArrH2 = AbstractC1026j.h(AbstractC1026j.c(fArr2, fArrA, fArrCopyOf), fArrH2);
            }
            if (!AbstractC1026j.d(c1035s3, c1035s4)) {
                float[] fArrCopyOf2 = Arrays.copyOf(fArr, 3);
                kotlin.jvm.internal.l.e("copyOf(this, size)", fArrCopyOf2);
                fArrG = AbstractC1026j.g(AbstractC1026j.h(AbstractC1026j.c(fArr2, fArrA2, fArrCopyOf2), c1033q2.f11917i));
            }
            fArrH = AbstractC1026j.h(fArrG, fArrH2);
        }
        this.f11890g = fArrH;
    }

    @Override // i0.C1023g
    public final long a(long j7) {
        float fH = C0998u.h(j7);
        float fG = C0998u.g(j7);
        float fE = C0998u.e(j7);
        float fD = C0998u.d(j7);
        C1029m c1029m = this.f11888e.f11924p;
        float fD2 = (float) c1029m.d(fH);
        float fD3 = (float) c1029m.d(fG);
        float fD4 = (float) c1029m.d(fE);
        float[] fArr = this.f11890g;
        float f5 = (fArr[6] * fD4) + (fArr[3] * fD3) + (fArr[0] * fD2);
        float f7 = (fArr[7] * fD4) + (fArr[4] * fD3) + (fArr[1] * fD2);
        float f8 = (fArr[8] * fD4) + (fArr[5] * fD3) + (fArr[2] * fD2);
        C1033q c1033q = this.f11889f;
        float fD5 = (float) c1033q.f11921m.d(f5);
        double d4 = f7;
        C1029m c1029m2 = c1033q.f11921m;
        return AbstractC0968M.b(fD5, (float) c1029m2.d(d4), (float) c1029m2.d(f8), fD, c1033q);
    }
}
