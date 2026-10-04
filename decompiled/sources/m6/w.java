package m6;

import b1.AbstractC0703b;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import p.AbstractC1755i;
import w6.C2224i;

/* loaded from: classes.dex */
public final class w implements Closeable {

    /* renamed from: p, reason: collision with root package name */
    public static final Logger f13103p = Logger.getLogger(f.class.getName());

    /* renamed from: k, reason: collision with root package name */
    public final w6.A f13104k;

    /* renamed from: l, reason: collision with root package name */
    public final C2224i f13105l;

    /* renamed from: m, reason: collision with root package name */
    public int f13106m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13107n;

    /* renamed from: o, reason: collision with root package name */
    public final d f13108o;

    public w(w6.A a) {
        kotlin.jvm.internal.l.f("sink", a);
        this.f13104k = a;
        C2224i c2224i = new C2224i();
        this.f13105l = c2224i;
        this.f13106m = 16384;
        this.f13108o = new d(c2224i);
    }

    public final synchronized void b(A a) {
        try {
            kotlin.jvm.internal.l.f("peerSettings", a);
            if (this.f13107n) {
                throw new IOException("closed");
            }
            int i7 = this.f13106m;
            int i8 = a.a;
            if ((i8 & 32) != 0) {
                i7 = a.f12994b[5];
            }
            this.f13106m = i7;
            if (((i8 & 2) != 0 ? a.f12994b[1] : -1) != -1) {
                d dVar = this.f13108o;
                int i9 = (i8 & 2) != 0 ? a.f12994b[1] : -1;
                dVar.getClass();
                int iMin = Math.min(i9, 16384);
                int i10 = dVar.f13012d;
                if (i10 != iMin) {
                    if (iMin < i10) {
                        dVar.f13010b = Math.min(dVar.f13010b, iMin);
                    }
                    dVar.f13011c = true;
                    dVar.f13012d = iMin;
                    int i11 = dVar.f13016h;
                    if (iMin < i11) {
                        if (iMin == 0) {
                            C1528b[] c1528bArr = dVar.f13013e;
                            P3.m.c0(c1528bArr, 0, c1528bArr.length);
                            dVar.f13014f = dVar.f13013e.length - 1;
                            dVar.f13015g = 0;
                            dVar.f13016h = 0;
                        } else {
                            dVar.a(i11 - iMin);
                        }
                    }
                }
            }
            g(0, 0, 4, 1);
            this.f13104k.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f13107n = true;
        this.f13104k.close();
    }

    public final synchronized void e(boolean z7, int i7, C2224i c2224i, int i8) {
        if (this.f13107n) {
            throw new IOException("closed");
        }
        g(i7, i8, 0, z7 ? 1 : 0);
        if (i8 > 0) {
            kotlin.jvm.internal.l.c(c2224i);
            this.f13104k.f(c2224i, i8);
        }
    }

    public final synchronized void flush() {
        if (this.f13107n) {
            throw new IOException("closed");
        }
        this.f13104k.flush();
    }

    public final void g(int i7, int i8, int i9, int i10) {
        Level level = Level.FINE;
        Logger logger = f13103p;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(false, i7, i8, i9, i10));
        }
        if (i8 > this.f13106m) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f13106m + ": " + i8).toString());
        }
        if ((Integer.MIN_VALUE & i7) != 0) {
            throw new IllegalArgumentException(AbstractC0703b.g(i7, "reserved bit set: ").toString());
        }
        byte[] bArr = g6.b.a;
        w6.A a = this.f13104k;
        kotlin.jvm.internal.l.f("<this>", a);
        a.A((i8 >>> 16) & 255);
        a.A((i8 >>> 8) & 255);
        a.A(i8 & 255);
        a.A(i9 & 255);
        a.A(i10 & 255);
        a.e(i7 & Integer.MAX_VALUE);
    }

    public final synchronized void i(byte[] bArr, int i7, int i8) {
        AbstractC0703b.w(i8, "errorCode");
        if (this.f13107n) {
            throw new IOException("closed");
        }
        if (AbstractC1755i.b(i8) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        g(0, bArr.length + 8, 7, 0);
        this.f13104k.e(i7);
        this.f13104k.e(AbstractC1755i.b(i8));
        if (bArr.length != 0) {
            this.f13104k.E(bArr);
        }
        this.f13104k.flush();
    }

    public final synchronized void j(boolean z7, int i7, ArrayList arrayList) {
        if (this.f13107n) {
            throw new IOException("closed");
        }
        this.f13108o.d(arrayList);
        long j7 = this.f13105l.f17156l;
        long jMin = Math.min(this.f13106m, j7);
        int i8 = j7 == jMin ? 4 : 0;
        if (z7) {
            i8 |= 1;
        }
        g(i7, (int) jMin, 1, i8);
        this.f13104k.f(this.f13105l, jMin);
        if (j7 > jMin) {
            long j8 = j7 - jMin;
            while (j8 > 0) {
                long jMin2 = Math.min(this.f13106m, j8);
                j8 -= jMin2;
                g(i7, (int) jMin2, 9, j8 == 0 ? 4 : 0);
                this.f13104k.f(this.f13105l, jMin2);
            }
        }
    }

    public final synchronized void m(int i7, int i8, boolean z7) {
        if (this.f13107n) {
            throw new IOException("closed");
        }
        g(0, 8, 6, z7 ? 1 : 0);
        this.f13104k.e(i7);
        this.f13104k.e(i8);
        this.f13104k.flush();
    }

    public final synchronized void s(int i7, int i8) {
        AbstractC0703b.w(i8, "errorCode");
        if (this.f13107n) {
            throw new IOException("closed");
        }
        if (AbstractC1755i.b(i8) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        g(i7, 4, 3, 0);
        this.f13104k.e(AbstractC1755i.b(i8));
        this.f13104k.flush();
    }

    public final synchronized void v(int i7, long j7) {
        if (this.f13107n) {
            throw new IOException("closed");
        }
        if (j7 == 0 || j7 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j7).toString());
        }
        g(i7, 4, 8, 0);
        this.f13104k.e((int) j7);
        this.f13104k.flush();
    }
}
