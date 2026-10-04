package w6;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface G extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    J d();

    void f(C2224i c2224i, long j7);

    void flush();
}
