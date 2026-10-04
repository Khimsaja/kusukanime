package q;

import h0.C0975U;

/* renamed from: q.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1837t {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final C0975U f14628b;

    public C1837t(float f5, C0975U c0975u) {
        this.a = f5;
        this.f14628b = c0975u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1837t)) {
            return false;
        }
        C1837t c1837t = (C1837t) obj;
        return T0.e.a(this.a, c1837t.a) && this.f14628b.equals(c1837t.f14628b);
    }

    public final int hashCode() {
        return this.f14628b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) T0.e.b(this.a)) + ", brush=" + this.f14628b + ')';
    }
}
