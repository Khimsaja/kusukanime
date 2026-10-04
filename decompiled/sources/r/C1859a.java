package r;

import b1.AbstractC0703b;
import h0.C0998u;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1859a {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14752b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14753c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14754d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14755e;

    public C1859a(long j7, long j8, long j9, long j10, long j11) {
        this.a = j7;
        this.f14752b = j8;
        this.f14753c = j9;
        this.f14754d = j10;
        this.f14755e = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1859a)) {
            return false;
        }
        C1859a c1859a = (C1859a) obj;
        return C0998u.c(this.a, c1859a.a) && C0998u.c(this.f14752b, c1859a.f14752b) && C0998u.c(this.f14753c, c1859a.f14753c) && C0998u.c(this.f14754d, c1859a.f14754d) && C0998u.c(this.f14755e, c1859a.f14755e);
    }

    public final int hashCode() {
        int i7 = C0998u.f11835h;
        return Long.hashCode(this.f14755e) + AbstractC0703b.c(AbstractC0703b.c(AbstractC0703b.c(Long.hashCode(this.a) * 31, 31, this.f14752b), 31, this.f14753c), 31, this.f14754d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        AbstractC0703b.x(this.a, ", textColor=", sb);
        AbstractC0703b.x(this.f14752b, ", iconColor=", sb);
        AbstractC0703b.x(this.f14753c, ", disabledTextColor=", sb);
        AbstractC0703b.x(this.f14754d, ", disabledIconColor=", sb);
        sb.append((Object) C0998u.i(this.f14755e));
        sb.append(')');
        return sb.toString();
    }
}
