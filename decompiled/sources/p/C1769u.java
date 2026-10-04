package p;

/* renamed from: p.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1769u {
    public double a;

    /* renamed from: b, reason: collision with root package name */
    public double f14133b;

    public C1769u(double d4, double d6) {
        this.a = d4;
        this.f14133b = d6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1769u)) {
            return false;
        }
        C1769u c1769u = (C1769u) obj;
        return Double.compare(this.a, c1769u.a) == 0 && Double.compare(this.f14133b, c1769u.f14133b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f14133b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.a + ", _imaginary=" + this.f14133b + ')';
    }
}
