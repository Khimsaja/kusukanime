package i0;

/* renamed from: i0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1034r {
    public final double a;

    /* renamed from: b, reason: collision with root package name */
    public final double f11926b;

    /* renamed from: c, reason: collision with root package name */
    public final double f11927c;

    /* renamed from: d, reason: collision with root package name */
    public final double f11928d;

    /* renamed from: e, reason: collision with root package name */
    public final double f11929e;

    /* renamed from: f, reason: collision with root package name */
    public final double f11930f;

    /* renamed from: g, reason: collision with root package name */
    public final double f11931g;

    public /* synthetic */ C1034r(double d4, double d6, double d7, double d8, double d9) {
        this(d4, d6, d7, d8, d9, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1034r)) {
            return false;
        }
        C1034r c1034r = (C1034r) obj;
        return Double.compare(this.a, c1034r.a) == 0 && Double.compare(this.f11926b, c1034r.f11926b) == 0 && Double.compare(this.f11927c, c1034r.f11927c) == 0 && Double.compare(this.f11928d, c1034r.f11928d) == 0 && Double.compare(this.f11929e, c1034r.f11929e) == 0 && Double.compare(this.f11930f, c1034r.f11930f) == 0 && Double.compare(this.f11931g, c1034r.f11931g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f11931g) + ((Double.hashCode(this.f11930f) + ((Double.hashCode(this.f11929e) + ((Double.hashCode(this.f11928d) + ((Double.hashCode(this.f11927c) + ((Double.hashCode(this.f11926b) + (Double.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.a + ", a=" + this.f11926b + ", b=" + this.f11927c + ", c=" + this.f11928d + ", d=" + this.f11929e + ", e=" + this.f11930f + ", f=" + this.f11931g + ')';
    }

    public C1034r(double d4, double d6, double d7, double d8, double d9, double d10, double d11) {
        this.a = d4;
        this.f11926b = d6;
        this.f11927c = d7;
        this.f11928d = d8;
        this.f11929e = d9;
        this.f11930f = d10;
        this.f11931g = d11;
        if (Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d8) || Double.isNaN(d9) || Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d4)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d9 < 0.0d || d9 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d9);
        }
        if (d9 == 0.0d && (d6 == 0.0d || d4 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d9 >= 1.0d && d8 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d6 == 0.0d || d4 == 0.0d) && d8 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d8 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d6 < 0.0d || d4 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
