package L;

import b1.AbstractC0703b;
import h0.C0998u;

/* loaded from: classes.dex */
public final class r {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5753b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5754c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5755d;

    public r(long j7, long j8, long j9, long j10) {
        this.a = j7;
        this.f5753b = j8;
        this.f5754c = j9;
        this.f5755d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return C0998u.c(this.a, rVar.a) && C0998u.c(this.f5753b, rVar.f5753b) && C0998u.c(this.f5754c, rVar.f5754c) && C0998u.c(this.f5755d, rVar.f5755d);
    }

    public final int hashCode() {
        int i7 = C0998u.f11835h;
        return Long.hashCode(this.f5755d) + AbstractC0703b.c(AbstractC0703b.c(Long.hashCode(this.a) * 31, 31, this.f5753b), 31, this.f5754c);
    }
}
