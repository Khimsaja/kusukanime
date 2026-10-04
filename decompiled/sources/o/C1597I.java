package o;

/* renamed from: o.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1597I {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13485b;

    public C1597I(float f5, T0.b bVar) {
        this.a = f5;
        float fA = bVar.a();
        float f7 = AbstractC1598J.a;
        this.f13485b = fA * 386.0878f * 160.0f * 0.84f;
    }

    public final C1596H a(float f5) {
        double dB = b(f5);
        double d4 = AbstractC1598J.a;
        double d6 = d4 - 1.0d;
        return new C1596H(f5, (float) (Math.exp((d4 / d6) * dB) * this.a * this.f13485b), (long) (Math.exp(dB / d6) * 1000.0d));
    }

    public final double b(float f5) {
        float[] fArr = AbstractC1604b.a;
        return Math.log((Math.abs(f5) * 0.35f) / (this.a * this.f13485b));
    }
}
