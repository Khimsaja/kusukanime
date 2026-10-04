package h0;

import b1.AbstractC0703b;

/* renamed from: h0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0972Q {

    /* renamed from: d, reason: collision with root package name */
    public static final C0972Q f11801d = new C0972Q();
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11802b;

    /* renamed from: c, reason: collision with root package name */
    public final float f11803c;

    public C0972Q(float f5, long j7, long j8) {
        this.a = j7;
        this.f11802b = j8;
        this.f11803c = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0972Q)) {
            return false;
        }
        C0972Q c0972q = (C0972Q) obj;
        return C0998u.c(this.a, c0972q.a) && g0.c.b(this.f11802b, c0972q.f11802b) && this.f11803c == c0972q.f11803c;
    }

    public final int hashCode() {
        int i7 = C0998u.f11835h;
        return Float.hashCode(this.f11803c) + AbstractC0703b.c(Long.hashCode(this.a) * 31, 31, this.f11802b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        AbstractC0703b.x(this.a, ", offset=", sb);
        sb.append((Object) g0.c.j(this.f11802b));
        sb.append(", blurRadius=");
        return AbstractC0703b.k(sb, this.f11803c, ')');
    }

    public /* synthetic */ C0972Q() {
        this(0.0f, AbstractC0968M.d(4278190080L), 0L);
    }
}
