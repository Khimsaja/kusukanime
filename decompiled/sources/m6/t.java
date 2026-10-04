package m6;

import w6.C2224i;
import w6.H;
import w6.J;

/* loaded from: classes.dex */
public final class t implements H {

    /* renamed from: k, reason: collision with root package name */
    public final long f13083k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13084l;

    /* renamed from: m, reason: collision with root package name */
    public final C2224i f13085m = new C2224i();

    /* renamed from: n, reason: collision with root package name */
    public final C2224i f13086n = new C2224i();

    /* renamed from: o, reason: collision with root package name */
    public boolean f13087o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f13088p;

    public t(v vVar, long j7, boolean z7) {
        this.f13088p = vVar;
        this.f13083k = j7;
        this.f13084l = z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0087 A[LOOP:0: B:4:0x000e->B:45:0x0087, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x008a A[SYNTHETIC] */
    @Override // w6.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long F(w6.C2224i r15, long r16) throws java.lang.Throwable {
        /*
            r14 = this;
            r0 = r15
            r1 = r16
            java.lang.String r3 = "sink"
            kotlin.jvm.internal.l.f(r3, r15)
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto La8
        Le:
            m6.v r5 = r14.f13088p
            monitor-enter(r5)
            m6.u r6 = r5.f13099k     // Catch: java.lang.Throwable -> L93
            r6.i()     // Catch: java.lang.Throwable -> L93
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L31
            int r6 = r5.f13101m     // Catch: java.lang.Throwable -> L9d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L37
            boolean r6 = r14.f13084l     // Catch: java.lang.Throwable -> L31
            if (r6 != 0) goto L37
            java.io.IOException r6 = r5.f13102n     // Catch: java.lang.Throwable -> L31
            if (r6 != 0) goto L38
            m6.B r6 = new m6.B     // Catch: java.lang.Throwable -> L31
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L31
            int r7 = r5.f13101m     // Catch: java.lang.Throwable -> L34
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L31
            b1.AbstractC0703b.s(r7)     // Catch: java.lang.Throwable -> L31
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L31
            goto L38
        L31:
            r0 = move-exception
            goto La0
        L34:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L34
            throw r0     // Catch: java.lang.Throwable -> L31
        L37:
            r6 = 0
        L38:
            boolean r7 = r14.f13087o     // Catch: java.lang.Throwable -> L31
            if (r7 != 0) goto L95
            w6.i r7 = r14.f13086n     // Catch: java.lang.Throwable -> L31
            long r8 = r7.f17156l     // Catch: java.lang.Throwable -> L31
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            r11 = -1
            r13 = 0
            if (r10 <= 0) goto L74
            long r8 = java.lang.Math.min(r1, r8)     // Catch: java.lang.Throwable -> L31
            long r7 = r7.F(r15, r8)     // Catch: java.lang.Throwable -> L31
            long r9 = r5.f13091c     // Catch: java.lang.Throwable -> L31
            long r9 = r9 + r7
            r5.f13091c = r9     // Catch: java.lang.Throwable -> L31
            long r3 = r5.f13092d     // Catch: java.lang.Throwable -> L31
            long r9 = r9 - r3
            if (r6 != 0) goto L7f
            m6.n r3 = r5.f13090b     // Catch: java.lang.Throwable -> L31
            m6.A r3 = r3.f13061z     // Catch: java.lang.Throwable -> L31
            int r3 = r3.a()     // Catch: java.lang.Throwable -> L31
            int r3 = r3 / 2
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L31
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 < 0) goto L7f
            m6.n r3 = r5.f13090b     // Catch: java.lang.Throwable -> L31
            int r4 = r5.a     // Catch: java.lang.Throwable -> L31
            r3.v(r4, r9)     // Catch: java.lang.Throwable -> L31
            long r3 = r5.f13091c     // Catch: java.lang.Throwable -> L31
            r5.f13092d = r3     // Catch: java.lang.Throwable -> L31
            goto L7f
        L74:
            boolean r3 = r14.f13084l     // Catch: java.lang.Throwable -> L31
            if (r3 != 0) goto L7e
            if (r6 != 0) goto L7e
            r5.k()     // Catch: java.lang.Throwable -> L31
            r13 = 1
        L7e:
            r7 = r11
        L7f:
            m6.u r3 = r5.f13099k     // Catch: java.lang.Throwable -> L93
            r3.l()     // Catch: java.lang.Throwable -> L93
            monitor-exit(r5)
            if (r13 == 0) goto L8a
            r3 = 0
            goto Le
        L8a:
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 == 0) goto L8f
            return r7
        L8f:
            if (r6 != 0) goto L92
            return r11
        L92:
            throw r6
        L93:
            r0 = move-exception
            goto La6
        L95:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "stream closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        L9d:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9d
            throw r0     // Catch: java.lang.Throwable -> L31
        La0:
            m6.u r1 = r5.f13099k     // Catch: java.lang.Throwable -> L93
            r1.l()     // Catch: java.lang.Throwable -> L93
            throw r0     // Catch: java.lang.Throwable -> L93
        La6:
            monitor-exit(r5)
            throw r0
        La8:
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r0 = b1.AbstractC0703b.h(r0, r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.t.F(w6.i, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j7;
        v vVar = this.f13088p;
        synchronized (vVar) {
            this.f13087o = true;
            C2224i c2224i = this.f13086n;
            j7 = c2224i.f17156l;
            c2224i.b();
            vVar.notifyAll();
        }
        if (j7 > 0) {
            byte[] bArr = g6.b.a;
            this.f13088p.f13090b.j(j7);
        }
        this.f13088p.a();
    }

    @Override // w6.H
    public final J d() {
        return this.f13088p.f13099k;
    }
}
