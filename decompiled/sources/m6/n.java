package m6;

import b1.AbstractC0703b;
import io.ktor.network.sockets.DatagramKt;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import w6.C;

/* loaded from: classes.dex */
public final class n implements Closeable {
    public static final A J;

    /* renamed from: A, reason: collision with root package name */
    public A f13038A;

    /* renamed from: B, reason: collision with root package name */
    public long f13039B;

    /* renamed from: C, reason: collision with root package name */
    public long f13040C;

    /* renamed from: D, reason: collision with root package name */
    public long f13041D;

    /* renamed from: E, reason: collision with root package name */
    public long f13042E;

    /* renamed from: F, reason: collision with root package name */
    public final Socket f13043F;

    /* renamed from: G, reason: collision with root package name */
    public final w f13044G;

    /* renamed from: H, reason: collision with root package name */
    public final A3.q f13045H;
    public final LinkedHashSet I;

    /* renamed from: k, reason: collision with root package name */
    public final h f13046k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f13047l = new LinkedHashMap();

    /* renamed from: m, reason: collision with root package name */
    public final String f13048m;

    /* renamed from: n, reason: collision with root package name */
    public int f13049n;

    /* renamed from: o, reason: collision with root package name */
    public int f13050o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13051p;

    /* renamed from: q, reason: collision with root package name */
    public final i6.d f13052q;

    /* renamed from: r, reason: collision with root package name */
    public final i6.c f13053r;

    /* renamed from: s, reason: collision with root package name */
    public final i6.c f13054s;

    /* renamed from: t, reason: collision with root package name */
    public final i6.c f13055t;

    /* renamed from: u, reason: collision with root package name */
    public final z f13056u;

    /* renamed from: v, reason: collision with root package name */
    public long f13057v;

    /* renamed from: w, reason: collision with root package name */
    public long f13058w;

    /* renamed from: x, reason: collision with root package name */
    public long f13059x;

    /* renamed from: y, reason: collision with root package name */
    public long f13060y;

    /* renamed from: z, reason: collision with root package name */
    public final A f13061z;

    static {
        A a = new A();
        a.c(7, DatagramKt.MAX_DATAGRAM_SIZE);
        a.c(5, 16384);
        J = a;
    }

    public n(B0.b bVar) {
        this.f13046k = (h) bVar.f280p;
        String str = (String) bVar.f277m;
        if (str == null) {
            kotlin.jvm.internal.l.l("connectionName");
            throw null;
        }
        this.f13048m = str;
        this.f13050o = 3;
        i6.d dVar = (i6.d) bVar.f275k;
        this.f13052q = dVar;
        this.f13053r = dVar.e();
        this.f13054s = dVar.e();
        this.f13055t = dVar.e();
        this.f13056u = z.a;
        A a = new A();
        a.c(7, 16777216);
        this.f13061z = a;
        this.f13038A = J;
        this.f13042E = r0.a();
        Socket socket = (Socket) bVar.f276l;
        if (socket == null) {
            kotlin.jvm.internal.l.l("socket");
            throw null;
        }
        this.f13043F = socket;
        w6.A a7 = (w6.A) bVar.f279o;
        if (a7 == null) {
            kotlin.jvm.internal.l.l("sink");
            throw null;
        }
        this.f13044G = new w(a7);
        C c2 = (C) bVar.f278n;
        if (c2 == null) {
            kotlin.jvm.internal.l.l("source");
            throw null;
        }
        this.f13045H = new A3.q(11, this, new r(c2), false);
        this.I = new LinkedHashSet();
    }

    public final void b(int i7, int i8, IOException iOException) throws IOException {
        int i9;
        Object[] array;
        AbstractC0703b.w(i7, "connectionCode");
        AbstractC0703b.w(i8, "streamCode");
        byte[] bArr = g6.b.a;
        try {
            i(i7);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f13047l.isEmpty()) {
                array = null;
            } else {
                array = this.f13047l.values().toArray(new v[0]);
                this.f13047l.clear();
            }
        }
        v[] vVarArr = (v[]) array;
        if (vVarArr != null) {
            for (v vVar : vVarArr) {
                try {
                    vVar.c(i8, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f13044G.close();
        } catch (IOException unused3) {
        }
        try {
            this.f13043F.close();
        } catch (IOException unused4) {
        }
        this.f13053r.e();
        this.f13054s.e();
        this.f13055t.e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        b(1, 9, null);
    }

    public final synchronized v e(int i7) {
        return (v) this.f13047l.get(Integer.valueOf(i7));
    }

    public final void flush() {
        this.f13044G.flush();
    }

    public final synchronized v g(int i7) {
        v vVar;
        vVar = (v) this.f13047l.remove(Integer.valueOf(i7));
        notifyAll();
        return vVar;
    }

    public final void i(int i7) {
        AbstractC0703b.w(i7, "statusCode");
        synchronized (this.f13044G) {
            synchronized (this) {
                if (this.f13051p) {
                    return;
                }
                this.f13051p = true;
                this.f13044G.i(g6.b.a, this.f13049n, i7);
            }
        }
    }

    public final synchronized void j(long j7) {
        long j8 = this.f13039B + j7;
        this.f13039B = j8;
        long j9 = j8 - this.f13040C;
        if (j9 >= this.f13061z.a() / 2) {
            v(0, j9);
            this.f13040C += j9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f13044G.f13106m);
        r6 = r2;
        r8.f13041D += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r9, boolean r10, w6.C2224i r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            m6.w r12 = r8.f13044G
            r12.e(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.f13041D     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.f13042E     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f13047l     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            m6.w r4 = r8.f13044G     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f13106m     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f13041D     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f13041D = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            m6.w r4 = r8.f13044G
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.e(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.n.m(int, boolean, w6.i, long):void");
    }

    public final void s(int i7, int i8) {
        AbstractC0703b.w(i8, "errorCode");
        this.f13053r.c(new j(this.f13048m + '[' + i7 + "] writeSynReset", this, i7, i8, 2), 0L);
    }

    public final void v(int i7, long j7) {
        this.f13053r.c(new m(this.f13048m + '[' + i7 + "] windowUpdate", this, i7, j7), 0L);
    }
}
