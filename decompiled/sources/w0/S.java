package w0;

import l4.AbstractC1420H;

/* loaded from: classes.dex */
public abstract class S {

    /* renamed from: k, reason: collision with root package name */
    public int f16840k;

    /* renamed from: l, reason: collision with root package name */
    public int f16841l;

    /* renamed from: m, reason: collision with root package name */
    public long f16842m = AbstractC1420H.a(0, 0);

    /* renamed from: n, reason: collision with root package name */
    public long f16843n = U.a;

    /* renamed from: o, reason: collision with root package name */
    public long f16844o = 0;

    public abstract int c0(C2196n c2196n);

    public int f0() {
        return (int) (this.f16842m & 4294967295L);
    }

    public Object h() {
        return null;
    }

    public int h0() {
        return (int) (this.f16842m >> 32);
    }

    public final void i0() {
        this.f16840k = e3.c.k((int) (this.f16842m >> 32), T0.a.j(this.f16843n), T0.a.h(this.f16843n));
        int iK = e3.c.k((int) (this.f16842m & 4294967295L), T0.a.i(this.f16843n), T0.a.g(this.f16843n));
        this.f16841l = iK;
        int i7 = this.f16840k;
        long j7 = this.f16842m;
        this.f16844o = P3.F.b((i7 - ((int) (j7 >> 32))) / 2, (iK - ((int) (j7 & 4294967295L))) / 2);
    }

    public abstract void j0(long j7, float f5, e4.k kVar);

    public final void l0(long j7) {
        if (T0.j.a(this.f16842m, j7)) {
            return;
        }
        this.f16842m = j7;
        i0();
    }

    public final void m0(long j7) {
        if (T0.a.b(this.f16843n, j7)) {
            return;
        }
        this.f16843n = j7;
        i0();
    }
}
