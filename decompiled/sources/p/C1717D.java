package p;

/* renamed from: p.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1717D implements InterfaceC1716C {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final C1750f0 f13847b;

    public C1717D(float f5, float f7, float f8) {
        this.a = f8;
        C1750f0 c1750f0 = new C1750f0();
        c1750f0.a = 1.0f;
        double dSqrt = Math.sqrt(50.0d);
        c1750f0.f14009b = dSqrt;
        c1750f0.f14014g = 1.0f;
        if (f5 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        c1750f0.f14014g = f5;
        c1750f0.f14010c = false;
        if (((float) (dSqrt * dSqrt)) <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        c1750f0.f14009b = Math.sqrt(f7);
        c1750f0.f14010c = false;
        this.f13847b = c1750f0;
    }

    @Override // p.InterfaceC1716C
    public final float b(long j7, float f5, float f7, float f8) {
        C1750f0 c1750f0 = this.f13847b;
        c1750f0.a = f7;
        return Float.intBitsToFloat((int) (c1750f0.a(f5, f8, j7 / 1000000) >> 32));
    }

    @Override // p.InterfaceC1716C
    public final float c(long j7, float f5, float f7, float f8) {
        C1750f0 c1750f0 = this.f13847b;
        c1750f0.a = f7;
        return Float.intBitsToFloat((int) (c1750f0.a(f5, f8, j7 / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0171  */
    @Override // p.InterfaceC1716C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(float r37, float r38, float r39) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1717D.d(float, float, float):long");
    }

    @Override // p.InterfaceC1716C
    public final float e(float f5, float f7, float f8) {
        return 0.0f;
    }
}
