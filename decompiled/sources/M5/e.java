package M5;

/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: k, reason: collision with root package name */
    public final transient S3.h f6576k;

    public e(S3.h hVar) {
        this.f6576k = hVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.f6576k);
    }
}
