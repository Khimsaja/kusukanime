package H5;

/* renamed from: H5.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259c0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f3838k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B.e f3839l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0259c0(B.e eVar, S3.c cVar) {
        super(2, cVar);
        this.f3839l = eVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C0259c0 c0259c0 = new C0259c0(this.f3839l, cVar);
        c0259c0.f3838k = obj;
        return c0259c0;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0259c0) create((A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        return r0.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        r1.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        throw r5;
     */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            T3.a r0 = T3.a.f9048k
            P3.r.Y(r5)
            java.lang.Object r5 = r4.f3838k
            H5.A r5 = (H5.A) r5
            S3.h r5 = r5.getCoroutineContext()
            B.e r0 = r4.f3839l
            H5.x0 r1 = new H5.x0     // Catch: java.lang.InterruptedException -> L42
            r1.<init>()     // Catch: java.lang.InterruptedException -> L42
            H5.f0 r5 = H5.D.q(r5)     // Catch: java.lang.InterruptedException -> L42
            r2 = 1
            H5.N r5 = H5.D.t(r5, r2, r1)     // Catch: java.lang.InterruptedException -> L42
            r1.f3890p = r5     // Catch: java.lang.InterruptedException -> L42
        L1f:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = H5.x0.f3888q     // Catch: java.lang.InterruptedException -> L42
            int r2 = r5.get(r1)     // Catch: java.lang.InterruptedException -> L42
            if (r2 == 0) goto L33
            r5 = 2
            if (r2 == r5) goto L3a
            r5 = 3
            if (r2 != r5) goto L2e
            goto L3a
        L2e:
            H5.x0.m(r2)     // Catch: java.lang.InterruptedException -> L42
            r5 = 0
            throw r5     // Catch: java.lang.InterruptedException -> L42
        L33:
            r3 = 0
            boolean r5 = r5.compareAndSet(r1, r2, r3)     // Catch: java.lang.InterruptedException -> L42
            if (r5 == 0) goto L1f
        L3a:
            java.lang.Object r5 = r0.invoke()     // Catch: java.lang.Throwable -> L44
            r1.l()     // Catch: java.lang.InterruptedException -> L42
            return r5
        L42:
            r5 = move-exception
            goto L49
        L44:
            r5 = move-exception
            r1.l()     // Catch: java.lang.InterruptedException -> L42
            throw r5     // Catch: java.lang.InterruptedException -> L42
        L49:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Blocking call was interrupted due to parent cancellation"
            r0.<init>(r1)
            java.lang.Throwable r5 = r0.initCause(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.C0259c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
