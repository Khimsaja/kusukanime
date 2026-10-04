package o;

import b1.AbstractC0703b;

/* renamed from: o.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1596H {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13483b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13484c;

    public C1596H(float f5, float f7, long j7) {
        this.a = f5;
        this.f13483b = f7;
        this.f13484c = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1596H)) {
            return false;
        }
        C1596H c1596h = (C1596H) obj;
        return Float.compare(this.a, c1596h.a) == 0 && Float.compare(this.f13483b, c1596h.f13483b) == 0 && this.f13484c == c1596h.f13484c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13484c) + AbstractC0703b.b(this.f13483b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.f13483b + ", duration=" + this.f13484c + ')';
    }
}
