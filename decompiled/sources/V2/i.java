package V2;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class i implements Closeable {

    /* renamed from: k, reason: collision with root package name */
    public final d f9478k;

    public i(d dVar) {
        this.f9478k = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9478k.close();
    }
}
