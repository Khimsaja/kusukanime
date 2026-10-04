package H5;

import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final class o0 extends u0 {

    /* renamed from: n, reason: collision with root package name */
    public final S3.c f3876n;

    public o0(S3.h hVar, e4.n nVar) {
        super(hVar, true, false);
        this.f3876n = P3.r.q(this, this, nVar);
    }

    @Override // H5.n0
    public final void R() throws Throwable {
        try {
            M5.a.h(P3.r.E(this.f3876n), O3.C.a);
        } catch (Throwable th) {
            AbstractC1420H.y(th, this);
            throw null;
        }
    }
}
