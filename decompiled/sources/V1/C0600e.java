package V1;

import B1.K;

/* renamed from: V1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0600e {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9370b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9371c;

    /* renamed from: d, reason: collision with root package name */
    public long f9372d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f9373e;

    /* renamed from: f, reason: collision with root package name */
    public long f9374f;

    /* renamed from: g, reason: collision with root package name */
    public long f9375g;

    /* renamed from: h, reason: collision with root package name */
    public long f9376h;

    public C0600e(long j7, long j8, long j9, long j10, long j11, long j12) {
        this.a = j7;
        this.f9370b = j8;
        this.f9373e = j9;
        this.f9374f = j10;
        this.f9375g = j11;
        this.f9371c = j12;
        this.f9376h = a(j8, 0L, j9, j10, j11, j12);
    }

    public static long a(long j7, long j8, long j9, long j10, long j11, long j12) {
        if (j10 + 1 >= j11 || j8 + 1 >= j9) {
            return j10;
        }
        long j13 = (long) ((j7 - j8) * ((j11 - j10) / (j9 - j8)));
        return K.i(((j13 + j10) - j12) - (j13 / 20), j10, j11 - 1);
    }
}
