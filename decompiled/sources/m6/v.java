package m6;

import b1.AbstractC0703b;
import f6.C0920r;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class v {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final n f13090b;

    /* renamed from: c, reason: collision with root package name */
    public long f13091c;

    /* renamed from: d, reason: collision with root package name */
    public long f13092d;

    /* renamed from: e, reason: collision with root package name */
    public long f13093e;

    /* renamed from: f, reason: collision with root package name */
    public long f13094f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f13095g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13096h;

    /* renamed from: i, reason: collision with root package name */
    public final t f13097i;

    /* renamed from: j, reason: collision with root package name */
    public final s f13098j;

    /* renamed from: k, reason: collision with root package name */
    public final u f13099k;

    /* renamed from: l, reason: collision with root package name */
    public final u f13100l;

    /* renamed from: m, reason: collision with root package name */
    public int f13101m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f13102n;

    public v(int i7, n nVar, boolean z7, boolean z8, C0920r c0920r) {
        kotlin.jvm.internal.l.f("connection", nVar);
        this.a = i7;
        this.f13090b = nVar;
        this.f13094f = nVar.f13038A.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f13095g = arrayDeque;
        this.f13097i = new t(this, nVar.f13061z.a(), z8);
        this.f13098j = new s(this, z7);
        this.f13099k = new u(this);
        this.f13100l = new u(this);
        if (c0920r == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(c0920r);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r2 = this;
            byte[] r0 = g6.b.a
            monitor-enter(r2)
            m6.t r0 = r2.f13097i     // Catch: java.lang.Throwable -> L19
            boolean r1 = r0.f13084l     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1b
            boolean r0 = r0.f13087o     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            m6.s r0 = r2.f13098j     // Catch: java.lang.Throwable -> L19
            boolean r1 = r0.f13079k     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L17
            boolean r0 = r0.f13081m     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
        L17:
            r0 = 1
            goto L1c
        L19:
            r0 = move-exception
            goto L34
        L1b:
            r0 = 0
        L1c:
            boolean r1 = r2.h()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            if (r0 == 0) goto L2a
            r0 = 9
            r1 = 0
            r2.c(r0, r1)
            return
        L2a:
            if (r1 != 0) goto L33
            m6.n r0 = r2.f13090b
            int r1 = r2.a
            r0.g(r1)
        L33:
            return
        L34:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.v.a():void");
    }

    public final void b() throws IOException {
        s sVar = this.f13098j;
        if (sVar.f13081m) {
            throw new IOException("stream closed");
        }
        if (sVar.f13079k) {
            throw new IOException("stream finished");
        }
        if (this.f13101m != 0) {
            IOException iOException = this.f13102n;
            if (iOException != null) {
                throw iOException;
            }
            int i7 = this.f13101m;
            AbstractC0703b.s(i7);
            throw new B(i7);
        }
    }

    public final void c(int i7, IOException iOException) {
        AbstractC0703b.w(i7, "rstStatusCode");
        if (d(i7, iOException)) {
            n nVar = this.f13090b;
            nVar.getClass();
            AbstractC0703b.w(i7, "statusCode");
            nVar.f13044G.s(this.a, i7);
        }
    }

    public final boolean d(int i7, IOException iOException) {
        byte[] bArr = g6.b.a;
        synchronized (this) {
            if (this.f13101m != 0) {
                return false;
            }
            this.f13101m = i7;
            this.f13102n = iOException;
            notifyAll();
            if (this.f13097i.f13084l) {
                if (this.f13098j.f13079k) {
                    return false;
                }
            }
            this.f13090b.g(this.a);
            return true;
        }
    }

    public final void e(int i7) {
        AbstractC0703b.w(i7, "errorCode");
        if (d(i7, null)) {
            this.f13090b.s(this.a, i7);
        }
    }

    public final s f() {
        synchronized (this) {
            if (!this.f13096h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f13098j;
    }

    public final boolean g() {
        boolean z7 = (this.a & 1) == 1;
        this.f13090b.getClass();
        return true == z7;
    }

    public final synchronized boolean h() {
        if (this.f13101m != 0) {
            return false;
        }
        t tVar = this.f13097i;
        if (tVar.f13084l || tVar.f13087o) {
            s sVar = this.f13098j;
            if (sVar.f13079k || sVar.f13081m) {
                if (this.f13096h) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void i(C0920r c0920r, boolean z7) {
        boolean zH;
        kotlin.jvm.internal.l.f("headers", c0920r);
        byte[] bArr = g6.b.a;
        synchronized (this) {
            try {
                if (this.f13096h && z7) {
                    this.f13097i.getClass();
                } else {
                    this.f13096h = true;
                    this.f13095g.add(c0920r);
                }
                if (z7) {
                    this.f13097i.f13084l = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.f13090b.g(this.a);
    }

    public final synchronized void j(int i7) {
        AbstractC0703b.w(i7, "errorCode");
        if (this.f13101m == 0) {
            this.f13101m = i7;
            notifyAll();
        }
    }

    public final void k() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
