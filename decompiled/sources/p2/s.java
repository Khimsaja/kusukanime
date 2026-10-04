package p2;

import B1.AbstractC0015b;
import B1.K;

/* loaded from: classes.dex */
public final class s {
    public final p a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14335b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f14336c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f14337d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14338e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f14339f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f14340g;

    /* renamed from: h, reason: collision with root package name */
    public final long f14341h;

    public s(p pVar, long[] jArr, int[] iArr, int i7, long[] jArr2, int[] iArr2, long j7) {
        AbstractC0015b.c(iArr.length == jArr2.length);
        AbstractC0015b.c(jArr.length == jArr2.length);
        AbstractC0015b.c(iArr2.length == jArr2.length);
        this.a = pVar;
        this.f14336c = jArr;
        this.f14337d = iArr;
        this.f14338e = i7;
        this.f14339f = jArr2;
        this.f14340g = iArr2;
        this.f14341h = j7;
        this.f14335b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j7) {
        long[] jArr = this.f14339f;
        for (int iA = K.a(jArr, j7, true); iA < jArr.length; iA++) {
            if ((this.f14340g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }
}
