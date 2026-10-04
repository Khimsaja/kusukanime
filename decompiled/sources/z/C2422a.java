package z;

import O.C0485c0;
import O1.C0541o;
import java.util.concurrent.CancellationException;
import r0.InterfaceC1860a;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2422a implements InterfaceC1860a {

    /* renamed from: k, reason: collision with root package name */
    public final C2425d f18442k;

    public C2422a(C2425d c2425d) {
        this.f18442k = c2425d;
    }

    @Override // r0.InterfaceC1860a
    public final long M(int i7, long j7, long j8) {
        if (i7 != 2 || g0.c.d(j8) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // r0.InterfaceC1860a
    public final Object Y(long j7, long j8, S3.c cVar) {
        return new T0.o(T0.o.a(j8, 0.0f, 0.0f, 1));
    }

    @Override // r0.InterfaceC1860a
    public final long l0(int i7, long j7) {
        if (i7 != 1) {
            return 0L;
        }
        C2425d c2425d = this.f18442k;
        C0541o c0541o = c2425d.f18405c;
        if (Math.abs(((C0485c0) c0541o.f7470d).f()) <= 1.0E-6d) {
            return 0L;
        }
        float f5 = ((C0485c0) c0541o.f7470d).f() * c2425d.m();
        float f7 = ((c2425d.k().f18520b + c2425d.k().f18521c) * (-Math.signum(((C0485c0) c0541o.f7470d).f()))) + f5;
        if (((C0485c0) c0541o.f7470d).f() > 0.0f) {
            f7 = f5;
            f5 = f7;
        }
        float f8 = -c2425d.f18412j.d(-e3.c.j(g0.c.d(j7), f5, f7));
        float fE = g0.c.e(j7);
        return (Float.floatToRawIntBits(fE) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
    }
}
