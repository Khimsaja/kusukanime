package L5;

/* loaded from: classes.dex */
public final class p implements S3.h {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S3.h f6191k;

    /* renamed from: l, reason: collision with root package name */
    public final Throwable f6192l;

    public p(S3.h hVar, Throwable th) {
        this.f6191k = hVar;
        this.f6192l = th;
    }

    @Override // S3.h
    public final Object fold(Object obj, e4.n nVar) {
        return this.f6191k.fold(obj, nVar);
    }

    @Override // S3.h
    public final S3.f get(S3.g gVar) {
        return this.f6191k.get(gVar);
    }

    @Override // S3.h
    public final S3.h minusKey(S3.g gVar) {
        return this.f6191k.minusKey(gVar);
    }

    @Override // S3.h
    public final S3.h plus(S3.h hVar) {
        return this.f6191k.plus(hVar);
    }
}
