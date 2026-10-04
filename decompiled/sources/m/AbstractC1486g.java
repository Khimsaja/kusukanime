package m;

/* renamed from: m.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1486g {
    public static final float[] a;

    static {
        long[] jArr = AbstractC1475E.a;
        int iF = AbstractC1475E.f(0);
        int iMax = iF > 0 ? Math.max(7, AbstractC1475E.e(iF)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            P3.m.e0(jArr);
        }
        int i7 = iMax >> 3;
        long j7 = 255 << ((iMax & 7) << 3);
        jArr[i7] = (jArr[i7] & (~j7)) | j7;
        float[] fArr = new float[iMax];
        a = new float[0];
    }
}
