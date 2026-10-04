package L;

import b1.AbstractC0703b;
import h0.C0998u;

/* renamed from: L.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0368f0 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5533b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5534c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5535d;

    public C0368f0(long j7, long j8, long j9, long j10) {
        this.a = j7;
        this.f5533b = j8;
        this.f5534c = j9;
        this.f5535d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0368f0)) {
            return false;
        }
        C0368f0 c0368f0 = (C0368f0) obj;
        return C0998u.c(this.a, c0368f0.a) && C0998u.c(this.f5533b, c0368f0.f5533b) && C0998u.c(this.f5534c, c0368f0.f5534c) && C0998u.c(this.f5535d, c0368f0.f5535d);
    }

    public final int hashCode() {
        int i7 = C0998u.f11835h;
        return Long.hashCode(this.f5535d) + AbstractC0703b.c(AbstractC0703b.c(Long.hashCode(this.a) * 31, 31, this.f5533b), 31, this.f5534c);
    }
}
