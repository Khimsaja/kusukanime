package D;

/* loaded from: classes.dex */
public final class A0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public Object f973k;

    /* renamed from: l, reason: collision with root package name */
    public int f974l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ O.Z f975m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f976n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u.k f977o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(O.Z z7, long j7, u.k kVar, S3.c cVar) {
        super(2, cVar);
        this.f975m = z7;
        this.f976n = j7;
        this.f977o = kVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new A0(this.f975m, this.f976n, this.f977o, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((A0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r2.b(r1, r8) == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r8.f974l
            u.k r2 = r8.f977o
            r3 = 2
            r4 = 1
            O.Z r5 = r8.f975m
            if (r1 == 0) goto L28
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            java.lang.Object r0 = r8.f973k
            u.m r0 = (u.m) r0
            P3.r.Y(r9)
            goto L5f
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            java.lang.Object r1 = r8.f973k
            O.Z r1 = (O.Z) r1
            P3.r.Y(r9)
            goto L46
        L28:
            P3.r.Y(r9)
            java.lang.Object r9 = r5.getValue()
            u.m r9 = (u.m) r9
            if (r9 == 0) goto L4a
            u.l r1 = new u.l
            r1.<init>(r9)
            if (r2 == 0) goto L45
            r8.f973k = r5
            r8.f974l = r4
            java.lang.Object r9 = r2.b(r1, r8)
            if (r9 != r0) goto L45
            goto L5d
        L45:
            r1 = r5
        L46:
            r9 = 0
            r1.setValue(r9)
        L4a:
            u.m r9 = new u.m
            long r6 = r8.f976n
            r9.<init>(r6)
            if (r2 == 0) goto L60
            r8.f973k = r9
            r8.f974l = r3
            java.lang.Object r1 = r2.b(r9, r8)
            if (r1 != r0) goto L5e
        L5d:
            return r0
        L5e:
            r0 = r9
        L5f:
            r9 = r0
        L60:
            r5.setValue(r9)
            O3.C r9 = O3.C.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: D.A0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
