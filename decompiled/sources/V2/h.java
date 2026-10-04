package V2;

import D.C0042b;
import java.io.EOFException;
import java.io.IOException;
import w6.C2224i;
import w6.G;
import w6.p;

/* loaded from: classes.dex */
public final class h extends p {

    /* renamed from: l, reason: collision with root package name */
    public final C0042b f9476l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9477m;

    public h(G g4, C0042b c0042b) {
        super(g4);
        this.f9476l = c0042b;
    }

    @Override // w6.p, w6.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e7) {
            this.f9477m = true;
            this.f9476l.invoke(e7);
        }
    }

    @Override // w6.p, w6.G
    public final void f(C2224i c2224i, long j7) throws EOFException {
        if (this.f9477m) {
            c2224i.n(j7);
            return;
        }
        try {
            super.f(c2224i, j7);
        } catch (IOException e7) {
            this.f9477m = true;
            this.f9476l.invoke(e7);
        }
    }

    @Override // w6.p, w6.G, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e7) {
            this.f9477m = true;
            this.f9476l.invoke(e7);
        }
    }
}
