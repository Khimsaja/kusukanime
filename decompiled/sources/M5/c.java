package M5;

import H5.A;

/* loaded from: classes.dex */
public final class c implements A {

    /* renamed from: k, reason: collision with root package name */
    public final S3.h f6575k;

    public c(S3.h hVar) {
        this.f6575k = hVar;
    }

    @Override // H5.A
    public final S3.h getCoroutineContext() {
        return this.f6575k;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f6575k + ')';
    }
}
