package l6;

import b1.AbstractC0703b;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import w6.C2224i;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: n, reason: collision with root package name */
    public long f12855n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Q4.b f12856o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Q4.b bVar, long j7) {
        super(bVar);
        this.f12856o = bVar;
        this.f12855n = j7;
        if (j7 == 0) {
            b();
        }
    }

    @Override // l6.a, w6.H
    public final long F(C2224i c2224i, long j7) throws IOException {
        l.f("sink", c2224i);
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.h("byteCount < 0: ", j7).toString());
        }
        if (this.f12846l) {
            throw new IllegalStateException("closed");
        }
        long j8 = this.f12855n;
        if (j8 == 0) {
            return -1L;
        }
        long jF = super.F(c2224i, Math.min(j8, j7));
        if (jF == -1) {
            ((j6.l) this.f12856o.f8006d).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
        long j9 = this.f12855n - jF;
        this.f12855n = j9;
        if (j9 == 0) {
            b();
        }
        return jF;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12846l) {
            return;
        }
        if (this.f12855n != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!g6.b.h(this)) {
                ((j6.l) this.f12856o.f8006d).k();
                b();
            }
        }
        this.f12846l = true;
    }
}
