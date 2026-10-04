package f6;

import java.io.Closeable;
import w6.InterfaceC2226k;

/* renamed from: f6.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0897K implements Closeable {
    public abstract long b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        g6.b.c(g());
    }

    public abstract C0925w e();

    public abstract InterfaceC2226k g();
}
