package w6;

/* loaded from: classes.dex */
public final class z implements H {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2226k f17192k;

    /* renamed from: l, reason: collision with root package name */
    public final C2224i f17193l;

    /* renamed from: m, reason: collision with root package name */
    public D f17194m;

    /* renamed from: n, reason: collision with root package name */
    public int f17195n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17196o;

    /* renamed from: p, reason: collision with root package name */
    public long f17197p;

    public z(InterfaceC2226k interfaceC2226k) {
        this.f17192k = interfaceC2226k;
        C2224i c2224iA = interfaceC2226k.a();
        this.f17193l = c2224iA;
        D d4 = c2224iA.f17155k;
        this.f17194m = d4;
        this.f17195n = d4 != null ? d4.f17116b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f17116b) goto L15;
     */
    @Override // w6.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long F(w6.C2224i r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.l.f(r0, r9)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.f17196o
            if (r3 != 0) goto L63
            w6.D r3 = r8.f17194m
            w6.i r4 = r8.f17193l
            if (r3 == 0) goto L2b
            w6.D r5 = r4.f17155k
            if (r3 != r5) goto L23
            int r3 = r8.f17195n
            kotlin.jvm.internal.l.c(r5)
            int r5 = r5.f17116b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.f17197p
            r2 = 1
            long r0 = r0 + r2
            w6.k r2 = r8.f17192k
            boolean r0 = r2.c(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            w6.D r0 = r8.f17194m
            if (r0 != 0) goto L4c
            w6.D r0 = r4.f17155k
            if (r0 == 0) goto L4c
            r8.f17194m = r0
            int r0 = r0.f17116b
            r8.f17195n = r0
        L4c:
            long r0 = r4.f17156l
            long r2 = r8.f17197p
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            w6.i r2 = r8.f17193l
            long r4 = r8.f17197p
            r3 = r9
            r2.i(r3, r4, r6)
            long r9 = r8.f17197p
            long r9 = r9 + r6
            r8.f17197p = r9
            return r6
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6b:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = b1.AbstractC0703b.h(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.z.F(w6.i, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17196o = true;
    }

    @Override // w6.H
    public final J d() {
        return this.f17192k.d();
    }
}
