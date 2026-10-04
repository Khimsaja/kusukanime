package o2;

import B1.K;
import V1.B;
import V1.z;
import android.util.Pair;

/* loaded from: classes.dex */
public final class c implements f {
    public final long[] a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f13567b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13568c;

    public c(long j7, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.f13567b = jArr2;
        this.f13568c = j7 == -9223372036854775807L ? K.F(jArr2[jArr2.length - 1]) : j7;
    }

    public static Pair a(long j7, long[] jArr, long[] jArr2) {
        int iD = K.d(jArr, j7, true);
        long j8 = jArr[iD];
        long j9 = jArr2[iD];
        int i7 = iD + 1;
        if (i7 == jArr.length) {
            return Pair.create(Long.valueOf(j8), Long.valueOf(j9));
        }
        return Pair.create(Long.valueOf(j7), Long.valueOf(((long) ((jArr[i7] == j8 ? 0.0d : (j7 - j8) / (r6 - j8)) * (jArr2[i7] - j9))) + j9));
    }

    @Override // o2.f
    public final long c() {
        return -1L;
    }

    @Override // V1.A
    public final boolean g() {
        return true;
    }

    @Override // o2.f
    public final long h(long j7) {
        return K.F(((Long) a(j7, this.a, this.f13567b).second).longValue());
    }

    @Override // V1.A
    public final z j(long j7) {
        Pair pairA = a(K.P(K.i(j7, 0L, this.f13568c)), this.f13567b, this.a);
        B b4 = new B(K.F(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new z(b4, b4);
    }

    @Override // o2.f
    public final int k() {
        return -2147483647;
    }

    @Override // V1.A
    public final long l() {
        return this.f13568c;
    }
}
