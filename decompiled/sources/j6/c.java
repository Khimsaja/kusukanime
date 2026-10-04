package j6;

import H1.C0231l;
import java.io.IOException;
import java.net.ProtocolException;
import w6.C2224i;
import w6.G;
import w6.p;

/* loaded from: classes.dex */
public final class c extends p {

    /* renamed from: l, reason: collision with root package name */
    public final long f12485l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12486m;

    /* renamed from: n, reason: collision with root package name */
    public long f12487n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12488o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0231l f12489p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C0231l c0231l, G g4, long j7) {
        super(g4);
        kotlin.jvm.internal.l.f("delegate", g4);
        this.f12489p = c0231l;
        this.f12485l = j7;
    }

    public final IOException b(IOException iOException) {
        if (this.f12486m) {
            return iOException;
        }
        this.f12486m = true;
        return this.f12489p.c(false, true, iOException);
    }

    @Override // w6.p, w6.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f12488o) {
            return;
        }
        this.f12488o = true;
        long j7 = this.f12485l;
        if (j7 != -1 && this.f12487n != j7) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            b(null);
        } catch (IOException e7) {
            throw b(e7);
        }
    }

    @Override // w6.p, w6.G
    public final void f(C2224i c2224i, long j7) throws IOException {
        kotlin.jvm.internal.l.f("source", c2224i);
        if (this.f12488o) {
            throw new IllegalStateException("closed");
        }
        long j8 = this.f12485l;
        if (j8 != -1 && this.f12487n + j7 > j8) {
            StringBuilder sbK = A6.b.k("expected ", j8, " bytes but received ");
            sbK.append(this.f12487n + j7);
            throw new ProtocolException(sbK.toString());
        }
        try {
            super.f(c2224i, j7);
            this.f12487n += j7;
        } catch (IOException e7) {
            throw b(e7);
        }
    }

    @Override // w6.p, w6.G, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e7) {
            throw b(e7);
        }
    }
}
