package L5;

/* loaded from: classes.dex */
public final class x implements S3.c, U3.d {

    /* renamed from: k, reason: collision with root package name */
    public final S3.c f6202k;

    /* renamed from: l, reason: collision with root package name */
    public final S3.h f6203l;

    public x(S3.c cVar, S3.h hVar) {
        this.f6202k = cVar;
        this.f6203l = hVar;
    }

    @Override // U3.d
    public final U3.d getCallerFrame() {
        S3.c cVar = this.f6202k;
        if (cVar instanceof U3.d) {
            return (U3.d) cVar;
        }
        return null;
    }

    @Override // S3.c
    public final S3.h getContext() {
        return this.f6203l;
    }

    @Override // S3.c
    public final void resumeWith(Object obj) {
        this.f6202k.resumeWith(obj);
    }
}
