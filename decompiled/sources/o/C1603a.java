package o;

import b1.AbstractC0703b;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1603a {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13488b;

    public C1603a(float f5, float f7) {
        this.a = f5;
        this.f13488b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1603a)) {
            return false;
        }
        C1603a c1603a = (C1603a) obj;
        return Float.compare(this.a, c1603a.a) == 0 && Float.compare(this.f13488b, c1603a.f13488b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13488b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.a);
        sb.append(", velocityCoefficient=");
        return AbstractC0703b.k(sb, this.f13488b, ')');
    }
}
