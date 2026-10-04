package s0;

/* loaded from: classes.dex */
public final class y extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15500k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f15501l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1953A f15502m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(long j7, C1953A c1953a, S3.c cVar) {
        super(2, cVar);
        this.f15501l = j7;
        this.f15502m = c1953a;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new y(this.f15501l, this.f15502m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (H5.D.k(1, r10) == r0) goto L15;
     */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r10.f15500k
            r2 = 1
            long r4 = r10.f15501l
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L20
            if (r1 == r7) goto L1c
            if (r1 != r6) goto L14
            P3.r.Y(r11)
            goto L37
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            P3.r.Y(r11)
            goto L2e
        L20:
            P3.r.Y(r11)
            long r8 = r4 - r2
            r10.f15500k = r7
            java.lang.Object r11 = H5.D.k(r8, r10)
            if (r11 != r0) goto L2e
            goto L36
        L2e:
            r10.f15500k = r6
            java.lang.Object r11 = H5.D.k(r2, r10)
            if (r11 != r0) goto L37
        L36:
            return r0
        L37:
            s0.A r11 = r10.f15502m
            H5.k r11 = r11.f15426m
            if (r11 == 0) goto L49
            s0.j r0 = new s0.j
            r0.<init>(r4)
            O3.n r0 = P3.r.r(r0)
            r11.resumeWith(r0)
        L49:
            O3.C r11 = O3.C.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
