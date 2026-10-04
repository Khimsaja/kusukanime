package l6;

import io.ktor.sse.ServerSentEventKt;
import kotlin.jvm.internal.l;
import w6.A;
import w6.C2224i;
import w6.G;
import w6.J;
import w6.r;

/* loaded from: classes.dex */
public final class b implements G {

    /* renamed from: k, reason: collision with root package name */
    public final r f12848k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12849l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Q4.b f12850m;

    public b(Q4.b bVar) {
        this.f12850m = bVar;
        this.f12848k = new r(((A) bVar.f8008f).f17109k.d());
    }

    @Override // w6.G, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f12849l) {
            return;
        }
        this.f12849l = true;
        ((A) this.f12850m.f8008f).R("0\r\n\r\n");
        Q4.b bVar = this.f12850m;
        r rVar = this.f12848k;
        bVar.getClass();
        J j7 = rVar.f17174e;
        rVar.f17174e = J.f17126d;
        j7.a();
        j7.b();
        this.f12850m.f8004b = 3;
    }

    @Override // w6.G
    public final J d() {
        return this.f12848k;
    }

    @Override // w6.G
    public final void f(C2224i c2224i, long j7) {
        l.f("source", c2224i);
        if (this.f12849l) {
            throw new IllegalStateException("closed");
        }
        if (j7 == 0) {
            return;
        }
        Q4.b bVar = this.f12850m;
        A a = (A) bVar.f8008f;
        if (a.f17111m) {
            throw new IllegalStateException("closed");
        }
        a.f17110l.i0(j7);
        a.b();
        A a7 = (A) bVar.f8008f;
        a7.R(ServerSentEventKt.END_OF_LINE);
        a7.f(c2224i, j7);
        a7.R(ServerSentEventKt.END_OF_LINE);
    }

    @Override // w6.G, java.io.Flushable
    public final synchronized void flush() {
        if (this.f12849l) {
            return;
        }
        ((A) this.f12850m.f8008f).flush();
    }
}
