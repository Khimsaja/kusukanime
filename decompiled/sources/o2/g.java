package o2;

import B1.K;
import V1.B;
import V1.z;

/* loaded from: classes.dex */
public final class g implements f {
    public final long[] a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f13587b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13588c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13589d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13590e;

    public g(long[] jArr, long[] jArr2, long j7, long j8, int i7) {
        this.a = jArr;
        this.f13587b = jArr2;
        this.f13588c = j7;
        this.f13589d = j8;
        this.f13590e = i7;
    }

    @Override // o2.f
    public final long c() {
        return this.f13589d;
    }

    @Override // V1.A
    public final boolean g() {
        return true;
    }

    @Override // o2.f
    public final long h(long j7) {
        return this.a[K.d(this.f13587b, j7, true)];
    }

    @Override // V1.A
    public final z j(long j7) {
        long[] jArr = this.a;
        int iD = K.d(jArr, j7, true);
        long j8 = jArr[iD];
        long[] jArr2 = this.f13587b;
        B b4 = new B(j8, jArr2[iD]);
        if (j8 >= j7 || iD == jArr.length - 1) {
            return new z(b4, b4);
        }
        int i7 = iD + 1;
        return new z(b4, new B(jArr[i7], jArr2[i7]));
    }

    @Override // o2.f
    public final int k() {
        return this.f13590e;
    }

    @Override // V1.A
    public final long l() {
        return this.f13588c;
    }
}
