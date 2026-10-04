package s0;

import java.util.concurrent.CancellationException;

/* renamed from: s0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1965j extends CancellationException {
    public C1965j(long j7) {
        super("Timed out waiting for " + j7 + " ms");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC1971p.f15468b);
        return this;
    }
}
