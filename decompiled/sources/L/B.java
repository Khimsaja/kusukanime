package L;

import b1.AbstractC0703b;
import h0.C0998u;

/* loaded from: classes.dex */
public final class B {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4924b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4925c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4926d;

    public B(long j7, long j8, long j9, long j10) {
        this.a = j7;
        this.f4924b = j8;
        this.f4925c = j9;
        this.f4926d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof B)) {
            return false;
        }
        B b4 = (B) obj;
        return C0998u.c(this.a, b4.a) && C0998u.c(this.f4924b, b4.f4924b) && C0998u.c(this.f4925c, b4.f4925c) && C0998u.c(this.f4926d, b4.f4926d);
    }

    public final int hashCode() {
        int i7 = C0998u.f11835h;
        return Long.hashCode(this.f4926d) + AbstractC0703b.c(AbstractC0703b.c(Long.hashCode(this.a) * 31, 31, this.f4924b), 31, this.f4925c);
    }
}
