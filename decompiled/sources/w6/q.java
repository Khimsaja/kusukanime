package w6;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class q implements H {

    /* renamed from: k, reason: collision with root package name */
    public final H f17173k;

    public q(H h7) {
        kotlin.jvm.internal.l.f("delegate", h7);
        this.f17173k = h7;
    }

    @Override // w6.H
    public long F(C2224i c2224i, long j7) {
        kotlin.jvm.internal.l.f("sink", c2224i);
        return this.f17173k.F(c2224i, j7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f17173k.close();
    }

    @Override // w6.H
    public final J d() {
        return this.f17173k.d();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f17173k + ')';
    }
}
