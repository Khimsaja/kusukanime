package O;

/* loaded from: classes.dex */
public final class z0 implements U {

    /* renamed from: k, reason: collision with root package name */
    public static final z0 f7248k = new z0();

    @Override // O.U
    public final Object P(e4.k kVar, S3.c cVar) {
        O5.e eVar = H5.M.a;
        return H5.D.G(M5.m.a, new y0(kVar, null), cVar);
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
