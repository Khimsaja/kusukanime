package w6;

import java.io.EOFException;

/* renamed from: w6.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2222g implements G {
    @Override // w6.G
    public final J d() {
        return J.f17126d;
    }

    @Override // w6.G
    public final void f(C2224i c2224i, long j7) throws EOFException {
        kotlin.jvm.internal.l.f("source", c2224i);
        c2224i.n(j7);
    }

    @Override // w6.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // w6.G, java.io.Flushable
    public final void flush() {
    }
}
