package m6;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import w6.C;
import w6.C2224i;
import w6.H;
import w6.J;

/* loaded from: classes.dex */
public final class q implements H {

    /* renamed from: k, reason: collision with root package name */
    public final C f13069k;

    /* renamed from: l, reason: collision with root package name */
    public int f13070l;

    /* renamed from: m, reason: collision with root package name */
    public int f13071m;

    /* renamed from: n, reason: collision with root package name */
    public int f13072n;

    /* renamed from: o, reason: collision with root package name */
    public int f13073o;

    /* renamed from: p, reason: collision with root package name */
    public int f13074p;

    public q(C c2) {
        kotlin.jvm.internal.l.f("source", c2);
        this.f13069k = c2;
    }

    @Override // w6.H
    public final long F(C2224i c2224i, long j7) throws IOException {
        int i7;
        int i8;
        kotlin.jvm.internal.l.f("sink", c2224i);
        do {
            int i9 = this.f13073o;
            C c2 = this.f13069k;
            if (i9 == 0) {
                c2.n(this.f13074p);
                this.f13074p = 0;
                if ((this.f13071m & 4) == 0) {
                    i7 = this.f13072n;
                    int iS = g6.b.s(c2);
                    this.f13073o = iS;
                    this.f13070l = iS;
                    int i10 = c2.readByte() & 255;
                    this.f13071m = c2.readByte() & 255;
                    Logger logger = r.f13075n;
                    if (logger.isLoggable(Level.FINE)) {
                        w6.l lVar = f.a;
                        logger.fine(f.a(true, this.f13072n, this.f13070l, i10, this.f13071m));
                    }
                    i8 = c2.readInt() & Integer.MAX_VALUE;
                    this.f13072n = i8;
                    if (i10 != 9) {
                        throw new IOException(i10 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jF = c2.F(c2224i, Math.min(j7, i9));
                if (jF != -1) {
                    this.f13073o -= (int) jF;
                    return jF;
                }
            }
            return -1L;
        } while (i8 == i7);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // w6.H
    public final J d() {
        return this.f13069k.f17113k.d();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
