package w6;

/* loaded from: classes.dex */
public abstract class p implements G {

    /* renamed from: k, reason: collision with root package name */
    public final G f17172k;

    public p(G g4) {
        kotlin.jvm.internal.l.f("delegate", g4);
        this.f17172k = g4;
    }

    @Override // w6.G, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17172k.close();
    }

    @Override // w6.G
    public final J d() {
        return this.f17172k.d();
    }

    @Override // w6.G
    public void f(C2224i c2224i, long j7) {
        kotlin.jvm.internal.l.f("source", c2224i);
        this.f17172k.f(c2224i, j7);
    }

    @Override // w6.G, java.io.Flushable
    public void flush() {
        this.f17172k.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f17172k + ')';
    }
}
