package U3;

/* loaded from: classes.dex */
public abstract class h extends a {
    public h(S3.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != S3.i.f8767k) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // S3.c
    public S3.h getContext() {
        return S3.i.f8767k;
    }
}
