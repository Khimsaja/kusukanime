package L;

import b1.AbstractC0703b;
import h0.C0998u;

/* renamed from: L.a2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0350a2 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5446b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5447c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5448d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5449e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5450f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5451g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5452h;

    /* renamed from: i, reason: collision with root package name */
    public final long f5453i;

    /* renamed from: j, reason: collision with root package name */
    public final long f5454j;

    /* renamed from: k, reason: collision with root package name */
    public final long f5455k;

    /* renamed from: l, reason: collision with root package name */
    public final long f5456l;

    /* renamed from: m, reason: collision with root package name */
    public final long f5457m;

    public C0350a2(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.a = j7;
        this.f5446b = j8;
        this.f5447c = j9;
        this.f5448d = j10;
        this.f5449e = j11;
        this.f5450f = j12;
        this.f5451g = j13;
        this.f5452h = j14;
        this.f5453i = j15;
        this.f5454j = j16;
        this.f5455k = j17;
        this.f5456l = j18;
        this.f5457m = j19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0350a2)) {
            return false;
        }
        C0350a2 c0350a2 = (C0350a2) obj;
        return C0998u.c(this.a, c0350a2.a) && C0998u.c(this.f5446b, c0350a2.f5446b) && C0998u.c(this.f5447c, c0350a2.f5447c) && C0998u.c(this.f5448d, c0350a2.f5448d) && C0998u.c(this.f5449e, c0350a2.f5449e) && C0998u.c(this.f5450f, c0350a2.f5450f) && C0998u.c(this.f5451g, c0350a2.f5451g) && C0998u.c(this.f5452h, c0350a2.f5452h) && C0998u.c(this.f5453i, c0350a2.f5453i) && C0998u.c(this.f5454j, c0350a2.f5454j) && C0998u.c(this.f5455k, c0350a2.f5455k) && C0998u.c(this.f5456l, c0350a2.f5456l) && C0998u.c(this.f5457m, c0350a2.f5457m);
    }

    public final int hashCode() {
        int i7 = C0998u.f11835h;
        return Long.hashCode(this.f5457m) + AbstractC0703b.c(AbstractC0703b.c(AbstractC0703b.c(AbstractC0703b.c(AbstractC0703b.c(AbstractC0703b.c(AbstractC0703b.c(AbstractC0703b.c(AbstractC0703b.c(AbstractC0703b.c(AbstractC0703b.c(Long.hashCode(this.a) * 31, 31, this.f5446b), 31, this.f5447c), 31, this.f5448d), 31, this.f5449e), 31, this.f5450f), 31, this.f5451g), 31, this.f5452h), 31, this.f5453i), 31, this.f5454j), 31, this.f5455k), 31, this.f5456l);
    }
}
