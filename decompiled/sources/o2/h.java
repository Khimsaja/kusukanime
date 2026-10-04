package o2;

import B1.AbstractC0015b;
import B1.K;
import V1.B;
import V1.z;

/* loaded from: classes.dex */
public final class h implements f {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13591b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13592c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13593d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13594e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13595f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f13596g;

    public h(long j7, int i7, long j8, int i8, long j9, long[] jArr) {
        this.a = j7;
        this.f13591b = i7;
        this.f13592c = j8;
        this.f13593d = i8;
        this.f13594e = j9;
        this.f13596g = jArr;
        this.f13595f = j9 != -1 ? j7 + j9 : -1L;
    }

    @Override // o2.f
    public final long c() {
        return this.f13595f;
    }

    @Override // V1.A
    public final boolean g() {
        return this.f13596g != null;
    }

    @Override // o2.f
    public final long h(long j7) {
        long j8 = j7 - this.a;
        if (!g() || j8 <= this.f13591b) {
            return 0L;
        }
        long[] jArr = this.f13596g;
        AbstractC0015b.i(jArr);
        double d4 = (j8 * 256.0d) / this.f13594e;
        int iD = K.d(jArr, (long) d4, true);
        long j9 = this.f13592c;
        long j10 = (iD * j9) / 100;
        long j11 = jArr[iD];
        int i7 = iD + 1;
        long j12 = (j9 * i7) / 100;
        return Math.round((j11 == (iD == 99 ? 256L : jArr[i7]) ? 0.0d : (d4 - j11) / (r0 - j11)) * (j12 - j10)) + j10;
    }

    @Override // V1.A
    public final z j(long j7) {
        double d4;
        double d6;
        boolean zG = g();
        int i7 = this.f13591b;
        long j8 = this.a;
        if (!zG) {
            B b4 = new B(0L, j8 + i7);
            return new z(b4, b4);
        }
        long jI = K.i(j7, 0L, this.f13592c);
        double d7 = (jI * 100.0d) / this.f13592c;
        double d8 = 0.0d;
        if (d7 <= 0.0d) {
            d4 = 256.0d;
        } else if (d7 >= 100.0d) {
            d4 = 256.0d;
            d8 = 256.0d;
        } else {
            int i8 = (int) d7;
            long[] jArr = this.f13596g;
            AbstractC0015b.i(jArr);
            double d9 = jArr[i8];
            if (i8 == 99) {
                d4 = 256.0d;
                d6 = 256.0d;
            } else {
                d4 = 256.0d;
                d6 = jArr[i8 + 1];
            }
            d8 = ((d6 - d9) * (d7 - i8)) + d9;
        }
        long j9 = this.f13594e;
        B b7 = new B(jI, j8 + K.i(Math.round((d8 / d4) * j9), i7, j9 - 1));
        return new z(b7, b7);
    }

    @Override // o2.f
    public final int k() {
        return this.f13593d;
    }

    @Override // V1.A
    public final long l() {
        return this.f13592c;
    }
}
