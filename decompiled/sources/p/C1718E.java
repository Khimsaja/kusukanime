package p;

/* renamed from: p.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1718E implements InterfaceC1716C {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13848b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1774z f13849c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13850d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13851e;

    public C1718E(int i7, int i8, InterfaceC1774z interfaceC1774z) {
        this.a = i7;
        this.f13848b = i8;
        this.f13849c = interfaceC1774z;
        this.f13850d = i7 * 1000000;
        this.f13851e = i8 * 1000000;
    }

    @Override // p.InterfaceC1716C
    public final float b(long j7, float f5, float f7, float f8) {
        float fL = this.a == 0 ? 1.0f : e3.c.l(j7 - this.f13851e, 0L, this.f13850d) / this.f13850d;
        if (fL < 0.0f) {
            fL = 0.0f;
        }
        float fB = this.f13849c.b(fL <= 1.0f ? fL : 1.0f);
        B0 b02 = C0.a;
        return (f7 * fB) + ((1 - fB) * f5);
    }

    @Override // p.InterfaceC1716C
    public final float c(long j7, float f5, float f7, float f8) {
        long jL = e3.c.l(j7 - this.f13851e, 0L, this.f13850d);
        if (jL < 0) {
            return 0.0f;
        }
        if (jL == 0) {
            return f8;
        }
        return (b(jL, f5, f7, f8) - b(jL - 1000000, f5, f7, f8)) * 1000.0f;
    }

    @Override // p.InterfaceC1716C
    public final long d(float f5, float f7, float f8) {
        return (this.f13848b + this.a) * 1000000;
    }
}
