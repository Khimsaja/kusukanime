package p;

/* renamed from: p.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1750f0 {
    public float a;

    /* renamed from: b, reason: collision with root package name */
    public double f14009b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14010c;

    /* renamed from: d, reason: collision with root package name */
    public double f14011d;

    /* renamed from: e, reason: collision with root package name */
    public double f14012e;

    /* renamed from: f, reason: collision with root package name */
    public double f14013f;

    /* renamed from: g, reason: collision with root package name */
    public float f14014g;

    public final long a(float f5, float f7, long j7) {
        double dCos;
        double dExp;
        if (!this.f14010c) {
            if (this.a == Float.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f8 = this.f14014g;
            double d4 = f8;
            double d6 = d4 * d4;
            if (f8 > 1.0f) {
                double d7 = this.f14009b;
                double d8 = d6 - 1;
                this.f14011d = (Math.sqrt(d8) * d7) + ((-f8) * d7);
                double d9 = -this.f14014g;
                double d10 = this.f14009b;
                this.f14012e = (d9 * d10) - (Math.sqrt(d8) * d10);
            } else if (f8 >= 0.0f && f8 < 1.0f) {
                this.f14013f = Math.sqrt(1 - d6) * this.f14009b;
            }
            this.f14010c = true;
        }
        float f9 = f5 - this.a;
        double d11 = j7 / 1000.0d;
        float f10 = this.f14014g;
        if (f10 > 1.0f) {
            double d12 = f9;
            double d13 = this.f14012e;
            double d14 = ((d13 * d12) - f7) / (d13 - this.f14011d);
            double d15 = d12 - d14;
            dExp = (Math.exp(this.f14011d * d11) * d14) + (Math.exp(d13 * d11) * d15);
            double d16 = this.f14012e;
            double dExp2 = Math.exp(d16 * d11) * d15 * d16;
            double d17 = this.f14011d;
            dCos = (Math.exp(d17 * d11) * d14 * d17) + dExp2;
        } else if (f10 == 1.0f) {
            double d18 = this.f14009b;
            double d19 = f9;
            double d20 = (d18 * d19) + f7;
            double d21 = (d20 * d11) + d19;
            dExp = Math.exp((-d18) * d11) * d21;
            double dExp3 = Math.exp((-this.f14009b) * d11) * d21;
            double d22 = -this.f14009b;
            dCos = (dExp3 * d22) + (Math.exp(d22 * d11) * d20);
        } else {
            double d23 = 1 / this.f14013f;
            double d24 = this.f14009b;
            double d25 = f9;
            double d26 = ((f10 * d24 * d25) + f7) * d23;
            double dExp4 = Math.exp((-f10) * d24 * d11) * ((Math.sin(this.f14013f * d11) * d26) + (Math.cos(this.f14013f * d11) * d25));
            double d27 = this.f14009b;
            double d28 = (-d27) * dExp4 * this.f14014g;
            double dExp5 = Math.exp((-r7) * d27 * d11);
            double d29 = this.f14013f;
            double dSin = Math.sin(d29 * d11) * (-d29) * d25;
            double d30 = this.f14013f;
            dCos = (((Math.cos(d30 * d11) * d26 * d30) + dSin) * dExp5) + d28;
            dExp = dExp4;
        }
        return (Float.floatToRawIntBits((float) (dExp + this.a)) << 32) | (Float.floatToRawIntBits((float) dCos) & 4294967295L);
    }
}
