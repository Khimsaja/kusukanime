package L;

import M.C0460s;
import O.C0485c0;
import e5.AbstractC0832b;
import r0.InterfaceC1860a;

/* renamed from: L.h2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0378h2 implements InterfaceC1860a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0390k2 f5596k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e4.k f5597l;

    public C0378h2(C0390k2 c0390k2, e4.k kVar) {
        this.f5596k = c0390k2;
        this.f5597l = kVar;
    }

    @Override // r0.InterfaceC1860a
    public final long M(int i7, long j7, long j8) {
        if (i7 != 1) {
            return 0L;
        }
        C0460s c0460s = this.f5596k.f5637b;
        float fE = c0460s.e(g0.c.e(j8));
        C0485c0 c0485c0 = c0460s.f6340j;
        float f5 = Float.isNaN(c0485c0.f()) ? 0.0f : c0485c0.f();
        c0485c0.g(fE);
        return AbstractC0832b.e(0.0f, fE - f5);
    }

    @Override // r0.InterfaceC1860a
    public final Object Y(long j7, long j8, S3.c cVar) {
        this.f5597l.invoke(new Float(T0.o.c(j8)));
        return new T0.o(j8);
    }

    @Override // r0.InterfaceC1860a
    public final long l0(int i7, long j7) {
        float fE = g0.c.e(j7);
        if (fE >= 0.0f || i7 != 1) {
            return 0L;
        }
        C0460s c0460s = this.f5596k.f5637b;
        float fE2 = c0460s.e(fE);
        C0485c0 c0485c0 = c0460s.f6340j;
        float f5 = Float.isNaN(c0485c0.f()) ? 0.0f : c0485c0.f();
        c0485c0.g(fE2);
        return AbstractC0832b.e(0.0f, fE2 - f5);
    }

    @Override // r0.InterfaceC1860a
    public final Object m(long j7, S3.c cVar) {
        float fC = T0.o.c(j7);
        C0390k2 c0390k2 = this.f5596k;
        float f5 = c0390k2.f5637b.f();
        float fC2 = c0390k2.f5637b.d().c();
        if (fC >= 0.0f || f5 <= fC2) {
            j7 = 0;
        } else {
            this.f5597l.invoke(new Float(fC));
        }
        return new T0.o(j7);
    }
}
