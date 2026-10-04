package l6;

import b1.AbstractC0703b;
import java.io.IOException;
import kotlin.jvm.internal.l;
import w6.C2224i;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: n, reason: collision with root package name */
    public boolean f12861n;

    @Override // l6.a, w6.H
    public final long F(C2224i c2224i, long j7) throws IOException {
        l.f("sink", c2224i);
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.h("byteCount < 0: ", j7).toString());
        }
        if (this.f12846l) {
            throw new IllegalStateException("closed");
        }
        if (this.f12861n) {
            return -1L;
        }
        long jF = super.F(c2224i, j7);
        if (jF != -1) {
            return jF;
        }
        this.f12861n = true;
        b();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12846l) {
            return;
        }
        if (!this.f12861n) {
            b();
        }
        this.f12846l = true;
    }
}
