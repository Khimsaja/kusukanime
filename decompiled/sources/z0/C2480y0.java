package z0;

import O.C0485c0;
import O.C0486d;

/* renamed from: z0.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2480y0 implements a0.r {

    /* renamed from: k, reason: collision with root package name */
    public final C0485c0 f18943k = C0486d.I(1.0f);

    @Override // a0.r
    public final float O() {
        return this.f18943k.f();
    }

    @Override // S3.h
    public final Object fold(Object obj, e4.n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override // S3.h
    public final S3.f get(S3.g gVar) {
        return P3.F.u(this, gVar);
    }

    @Override // S3.h
    public final S3.h minusKey(S3.g gVar) {
        return P3.F.K(this, gVar);
    }

    @Override // S3.h
    public final S3.h plus(S3.h hVar) {
        return P3.F.M(this, hVar);
    }
}
