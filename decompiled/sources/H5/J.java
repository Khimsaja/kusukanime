package H5;

/* loaded from: classes.dex */
public final class J extends Exception {

    /* renamed from: k, reason: collision with root package name */
    public final Throwable f3811k;

    public J(Throwable th, AbstractC0281w abstractC0281w, S3.h hVar) {
        super("Coroutine dispatcher " + abstractC0281w + " threw an exception, context = " + hVar, th);
        this.f3811k = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f3811k;
    }
}
