package O5;

import H5.AbstractC0281w;
import H5.X;
import M5.s;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d extends X implements Executor {

    /* renamed from: l, reason: collision with root package name */
    public static final d f7623l = new d();

    /* renamed from: m, reason: collision with root package name */
    public static final AbstractC0281w f7624m;

    static {
        l lVar = l.f7635l;
        int i7 = s.a;
        if (64 >= i7) {
            i7 = 64;
        }
        f7624m = lVar.Z(M5.a.l("kotlinx.coroutines.io.parallelism", i7, 12));
    }

    @Override // H5.AbstractC0281w
    public final void W(S3.h hVar, Runnable runnable) {
        f7624m.W(hVar, runnable);
    }

    @Override // H5.AbstractC0281w
    public final void X(S3.h hVar, Runnable runnable) {
        f7624m.X(hVar, runnable);
    }

    @Override // H5.AbstractC0281w
    public final AbstractC0281w Z(int i7) {
        return l.f7635l.Z(i7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        W(S3.i.f8767k, runnable);
    }

    @Override // H5.AbstractC0281w
    public final String toString() {
        return "Dispatchers.IO";
    }
}
