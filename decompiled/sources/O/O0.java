package O;

/* loaded from: classes.dex */
public final class O0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f7024k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f7025l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S3.h f7026m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ K5.J f7027n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(S3.h hVar, K5.J j7, S3.c cVar) {
        super(2, cVar);
        this.f7026m = hVar;
        this.f7027n = j7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        O0 o02 = new O0(this.f7026m, this.f7027n, cVar);
        o02.f7025l = obj;
        return o02;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((O0) create((C0503l0) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r5.collect(r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (H5.D.G(r4, r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        return r0;
     */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r6.f7024k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L15:
            P3.r.Y(r7)
            goto L4a
        L19:
            P3.r.Y(r7)
            java.lang.Object r7 = r6.f7025l
            O.l0 r7 = (O.C0503l0) r7
            S3.i r1 = S3.i.f8767k
            S3.h r4 = r6.f7026m
            boolean r1 = kotlin.jvm.internal.l.a(r4, r1)
            K5.J r5 = r6.f7027n
            if (r1 == 0) goto L3b
            O.M0 r1 = new O.M0
            r2 = 0
            r1.<init>(r7, r2)
            r6.f7024k = r3
            java.lang.Object r7 = r5.collect(r1, r6)
            if (r7 != r0) goto L4a
            goto L49
        L3b:
            O.N0 r1 = new O.N0
            r3 = 0
            r1.<init>(r5, r7, r3)
            r6.f7024k = r2
            java.lang.Object r7 = H5.D.G(r4, r1, r6)
            if (r7 != r0) goto L4a
        L49:
            return r0
        L4a:
            O3.C r7 = O3.C.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: O.O0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
