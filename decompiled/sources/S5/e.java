package S5;

import java.io.Flushable;

/* loaded from: classes.dex */
public interface e extends AutoCloseable, Flushable {
    void close();

    @Override // java.io.Flushable
    void flush();

    void write(a aVar, long j7);
}
