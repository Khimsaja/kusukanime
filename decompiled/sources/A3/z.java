package A3;

import O3.C;

/* loaded from: classes.dex */
public final class z extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f206k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B f207l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f208m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(B b4, String str, S3.c cVar) {
        super(2, cVar);
        this.f207l = b4;
        this.f208m = str;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new z(this.f207l, this.f208m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (A3.B.e(r5.f207l, r5.f208m, r5) == r0) goto L15;
     */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r5.f206k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            P3.r.Y(r6)
            goto L37
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            P3.r.Y(r6)
            goto L2a
        L1c:
            P3.r.Y(r6)
            r5.f206k = r3
            r3 = 250(0xfa, double:1.235E-321)
            java.lang.Object r6 = H5.D.k(r3, r5)
            if (r6 != r0) goto L2a
            goto L36
        L2a:
            r5.f206k = r2
            java.lang.String r6 = r5.f208m
            A3.B r1 = r5.f207l
            java.lang.Object r6 = A3.B.e(r1, r6, r5)
            if (r6 != r0) goto L37
        L36:
            return r0
        L37:
            O3.C r6 = O3.C.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
