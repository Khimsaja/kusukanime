package H1;

import B1.AbstractC0015b;
import java.util.Objects;

/* loaded from: classes.dex */
public final class S {
    public final O1.B a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3358b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3359c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3360d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3361e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3362f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3363g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3364h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3365i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3366j;

    public S(O1.B b4, long j7, long j8, long j9, long j10, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        boolean z12 = true;
        AbstractC0015b.c(!z11 || z9);
        AbstractC0015b.c(!z10 || z9);
        if (z8 && (z9 || z10 || z11)) {
            z12 = false;
        }
        AbstractC0015b.c(z12);
        this.a = b4;
        this.f3358b = j7;
        this.f3359c = j8;
        this.f3360d = j9;
        this.f3361e = j10;
        this.f3362f = z7;
        this.f3363g = z8;
        this.f3364h = z9;
        this.f3365i = z10;
        this.f3366j = z11;
    }

    public final S a(long j7) {
        if (j7 == this.f3359c) {
            return this;
        }
        return new S(this.a, this.f3358b, j7, this.f3360d, this.f3361e, this.f3362f, this.f3363g, this.f3364h, this.f3365i, this.f3366j);
    }

    public final S b(long j7) {
        if (j7 == this.f3358b) {
            return this;
        }
        return new S(this.a, j7, this.f3359c, this.f3360d, this.f3361e, this.f3362f, this.f3363g, this.f3364h, this.f3365i, this.f3366j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && S.class == obj.getClass()) {
            S s7 = (S) obj;
            if (this.f3358b == s7.f3358b && this.f3359c == s7.f3359c && this.f3360d == s7.f3360d && this.f3361e == s7.f3361e && this.f3362f == s7.f3362f && this.f3363g == s7.f3363g && this.f3364h == s7.f3364h && this.f3365i == s7.f3365i && this.f3366j == s7.f3366j && Objects.equals(this.a, s7.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.f3358b)) * 31) + ((int) this.f3359c)) * 31) + ((int) this.f3360d)) * 31) + ((int) this.f3361e)) * 31) + (this.f3362f ? 1 : 0)) * 31) + (this.f3363g ? 1 : 0)) * 31) + (this.f3364h ? 1 : 0)) * 31) + (this.f3365i ? 1 : 0)) * 31) + (this.f3366j ? 1 : 0);
    }
}
