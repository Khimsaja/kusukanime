package i0;

import h0.C0998u;

/* renamed from: i0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1023g {
    public final AbstractC1019c a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1019c f11891b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1019c f11892c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f11893d;

    public C1023g(AbstractC1019c abstractC1019c, AbstractC1019c abstractC1019c2, AbstractC1019c abstractC1019c3, float[] fArr) {
        this.a = abstractC1019c;
        this.f11891b = abstractC1019c2;
        this.f11892c = abstractC1019c3;
        this.f11893d = fArr;
    }

    public long a(long j7) {
        float fH = C0998u.h(j7);
        float fG = C0998u.g(j7);
        float fE = C0998u.e(j7);
        float fD = C0998u.d(j7);
        AbstractC1019c abstractC1019c = this.f11891b;
        long jD = abstractC1019c.d(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = abstractC1019c.e(fH, fG, fE);
        float[] fArr = this.f11893d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f5 = fIntBitsToFloat;
        float f7 = fIntBitsToFloat2;
        return this.f11892c.f(f5, f7, fE2, fD, this.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1023g(i0.AbstractC1019c r11, i0.AbstractC1019c r12, int r13) {
        /*
            r10 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            long r4 = r11.f11866b
            long r6 = i0.AbstractC1018b.a
            boolean r4 = i0.AbstractC1018b.a(r4, r6)
            if (r4 == 0) goto L13
            i0.c r4 = i0.AbstractC1026j.a(r11)
            goto L14
        L13:
            r4 = r11
        L14:
            long r8 = r12.f11866b
            boolean r5 = i0.AbstractC1018b.a(r8, r6)
            if (r5 == 0) goto L21
            i0.c r5 = i0.AbstractC1026j.a(r12)
            goto L22
        L21:
            r5 = r12
        L22:
            if (r13 != r3) goto L69
            long r8 = r11.f11866b
            boolean r13 = i0.AbstractC1018b.a(r8, r6)
            long r8 = r12.f11866b
            boolean r6 = i0.AbstractC1018b.a(r8, r6)
            if (r13 == 0) goto L35
            if (r6 == 0) goto L35
            goto L69
        L35:
            if (r13 != 0) goto L39
            if (r6 == 0) goto L69
        L39:
            if (r13 == 0) goto L3c
            goto L3d
        L3c:
            r11 = r12
        L3d:
            i0.q r11 = (i0.C1033q) r11
            float[] r7 = i0.AbstractC1026j.f11897e
            i0.s r11 = r11.f11912d
            if (r13 == 0) goto L4a
            float[] r13 = r11.a()
            goto L4b
        L4a:
            r13 = r7
        L4b:
            if (r6 == 0) goto L51
            float[] r7 = r11.a()
        L51:
            r11 = r13[r2]
            r6 = r7[r2]
            float r11 = r11 / r6
            r6 = r13[r1]
            r8 = r7[r1]
            float r6 = r6 / r8
            r13 = r13[r0]
            r7 = r7[r0]
            float r13 = r13 / r7
            float[] r3 = new float[r3]
            r3[r2] = r11
            r3[r1] = r6
            r3[r0] = r13
            goto L6a
        L69:
            r3 = 0
        L6a:
            r10.<init>(r12, r4, r5, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.C1023g.<init>(i0.c, i0.c, int):void");
    }
}
