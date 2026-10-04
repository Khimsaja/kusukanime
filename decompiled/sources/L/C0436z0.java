package L;

import b1.AbstractC0703b;
import h0.C0998u;

/* renamed from: L.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0436z0 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5974b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5975c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5976d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5977e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5978f;

    public C0436z0(long j7, long j8, long j9, long j10, long j11, long j12) {
        this.a = j7;
        this.f5974b = j8;
        this.f5975c = j9;
        this.f5976d = j10;
        this.f5977e = j11;
        this.f5978f = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0436z0)) {
            return false;
        }
        C0436z0 c0436z0 = (C0436z0) obj;
        return C0998u.c(this.a, c0436z0.a) && C0998u.c(this.f5974b, c0436z0.f5974b) && C0998u.c(this.f5975c, c0436z0.f5975c) && C0998u.c(this.f5976d, c0436z0.f5976d) && C0998u.c(this.f5977e, c0436z0.f5977e) && C0998u.c(this.f5978f, c0436z0.f5978f);
    }

    public final int hashCode() {
        int i7 = C0998u.f11835h;
        return Long.hashCode(this.f5978f) + AbstractC0703b.c(AbstractC0703b.c(AbstractC0703b.c(AbstractC0703b.c(Long.hashCode(this.a) * 31, 31, this.f5974b), 31, this.f5975c), 31, this.f5976d), 31, this.f5977e);
    }
}
