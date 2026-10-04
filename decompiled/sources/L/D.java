package L;

import p.C1743c;

/* loaded from: classes.dex */
public final class D extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f5018k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1743c f5019l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f5020m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f5021n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ E f5022o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ u.i f5023p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(C1743c c1743c, float f5, boolean z7, E e7, u.i iVar, S3.c cVar) {
        super(2, cVar);
        this.f5019l = c1743c;
        this.f5020m = f5;
        this.f5021n = z7;
        this.f5022o = e7;
        this.f5023p = iVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new D(this.f5019l, this.f5020m, this.f5021n, this.f5022o, this.f5023p, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r8.e(r7, r1) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (M.AbstractC0464w.a(r8, r4, r1, r7.f5023p, r7) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        return r0;
     */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r7.f5018k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L15:
            P3.r.Y(r8)
            goto L95
        L1a:
            P3.r.Y(r8)
            p.c r8 = r7.f5019l
            O.g0 r1 = r8.f13960e
            java.lang.Object r1 = r1.getValue()
            T0.e r1 = (T0.e) r1
            float r1 = r1.f8839k
            float r4 = r7.f5020m
            boolean r1 = T0.e.a(r1, r4)
            if (r1 != 0) goto L95
            boolean r1 = r7.f5021n
            if (r1 != 0) goto L43
            T0.e r1 = new T0.e
            r1.<init>(r4)
            r7.f5018k = r3
            java.lang.Object r8 = r8.e(r7, r1)
            if (r8 != r0) goto L95
            goto L94
        L43:
            O.g0 r1 = r8.f13960e
            java.lang.Object r1 = r1.getValue()
            T0.e r1 = (T0.e) r1
            float r1 = r1.f8839k
            L.E r3 = r7.f5022o
            float r5 = r3.f5039b
            boolean r5 = T0.e.a(r1, r5)
            if (r5 == 0) goto L5f
            u.m r1 = new u.m
            r5 = 0
            r1.<init>(r5)
            goto L8a
        L5f:
            float r5 = r3.f5041d
            boolean r5 = T0.e.a(r1, r5)
            if (r5 == 0) goto L6d
            u.g r1 = new u.g
            r1.<init>()
            goto L8a
        L6d:
            float r5 = r3.f5040c
            boolean r5 = T0.e.a(r1, r5)
            if (r5 == 0) goto L7b
            u.d r1 = new u.d
            r1.<init>()
            goto L8a
        L7b:
            float r3 = r3.f5042e
            boolean r1 = T0.e.a(r1, r3)
            if (r1 == 0) goto L89
            u.b r1 = new u.b
            r1.<init>()
            goto L8a
        L89:
            r1 = 0
        L8a:
            r7.f5018k = r2
            u.i r2 = r7.f5023p
            java.lang.Object r8 = M.AbstractC0464w.a(r8, r4, r1, r2, r7)
            if (r8 != r0) goto L95
        L94:
            return r0
        L95:
            O3.C r8 = O3.C.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: L.D.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
