package L;

import b1.AbstractC0703b;
import h0.C0998u;

/* renamed from: L.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0393l1 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5643b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5644c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5645d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5646e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5647f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5648g;

    public C0393l1(long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.a = j7;
        this.f5643b = j8;
        this.f5644c = j9;
        this.f5645d = j10;
        this.f5646e = j11;
        this.f5647f = j12;
        this.f5648g = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0393l1)) {
            return false;
        }
        C0393l1 c0393l1 = (C0393l1) obj;
        return C0998u.c(this.a, c0393l1.a) && C0998u.c(this.f5645d, c0393l1.f5645d) && C0998u.c(this.f5643b, c0393l1.f5643b) && C0998u.c(this.f5646e, c0393l1.f5646e) && C0998u.c(this.f5644c, c0393l1.f5644c) && C0998u.c(this.f5647f, c0393l1.f5647f) && C0998u.c(this.f5648g, c0393l1.f5648g);
    }

    public final int hashCode() {
        int i7 = C0998u.f11835h;
        return Long.hashCode(this.f5648g) + AbstractC0703b.c(AbstractC0703b.c(AbstractC0703b.c(AbstractC0703b.c(AbstractC0703b.c(Long.hashCode(this.a) * 31, 31, this.f5645d), 31, this.f5643b), 31, this.f5646e), 31, this.f5644c), 31, this.f5647f);
    }
}
