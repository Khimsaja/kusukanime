package K5;

/* loaded from: classes.dex */
public final class T extends U3.j implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public int f4779k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ InterfaceC0330i f4780l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ int f4781m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V f4782n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(V v5, S3.c cVar) {
        super(3, cVar);
        this.f4782n = v5;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        T t7 = new T(this.f4782n, (S3.c) obj3);
        t7.f4780l = (InterfaceC0330i) obj;
        t7.f4781m = iIntValue;
        return t7.invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r1.emit(r9, r8) != r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a A[PHI: r1
      0x006a: PHI (r1v3 K5.i) = (r1v2 K5.i), (r1v6 K5.i) binds: [B:25:0x0067, B:13:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[PHI: r1
      0x007d: PHI (r1v4 K5.i) = (r1v3 K5.i), (r1v7 K5.i) binds: [B:28:0x007a, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r8.f4779k
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            K5.V r7 = r8.f4782n
            if (r1 == 0) goto L36
            if (r1 == r6) goto L32
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L26
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            goto L32
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            K5.i r1 = r8.f4780l
            P3.r.Y(r9)
            goto L7d
        L26:
            K5.i r1 = r8.f4780l
            P3.r.Y(r9)
            goto L6a
        L2c:
            K5.i r1 = r8.f4780l
            P3.r.Y(r9)
            goto L5a
        L32:
            P3.r.Y(r9)
            goto L8b
        L36:
            P3.r.Y(r9)
            K5.i r1 = r8.f4780l
            int r9 = r8.f4781m
            if (r9 <= 0) goto L4a
            K5.P r9 = K5.P.f4774k
            r8.f4779k = r6
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L8b
            goto L8a
        L4a:
            r7.getClass()
            r8.f4780l = r1
            r8.f4779k = r5
            r5 = 0
            java.lang.Object r9 = H5.D.k(r5, r8)
            if (r9 != r0) goto L5a
            goto L8a
        L5a:
            r7.getClass()
            K5.P r9 = K5.P.f4775l
            r8.f4780l = r1
            r8.f4779k = r4
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L6a
            goto L8a
        L6a:
            r7.getClass()
            r8.f4780l = r1
            r8.f4779k = r3
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r9 = H5.D.k(r3, r8)
            if (r9 != r0) goto L7d
            goto L8a
        L7d:
            K5.P r9 = K5.P.f4776m
            r3 = 0
            r8.f4780l = r3
            r8.f4779k = r2
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L8b
        L8a:
            return r0
        L8b:
            O3.C r9 = O3.C.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.T.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
