package K5;

/* renamed from: K5.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0341u extends U3.j implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public int f4859k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ InterfaceC0330i f4860l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f4861m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U3.j f4862n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0341u(e4.n nVar, S3.c cVar) {
        super(3, cVar);
        this.f4862n = (U3.j) nVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [U3.j, e4.n] */
    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C0341u c0341u = new C0341u(this.f4862n, (S3.c) obj3);
        c0341u.f4860l = (InterfaceC0330i) obj;
        c0341u.f4861m = obj2;
        return c0341u.invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r1.emit(r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v1, types: [U3.j, e4.n] */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r4.f4859k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            P3.r.Y(r5)
            goto L3e
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            K5.i r1 = r4.f4860l
            P3.r.Y(r5)
            goto L32
        L1e:
            P3.r.Y(r5)
            K5.i r1 = r4.f4860l
            java.lang.Object r5 = r4.f4861m
            r4.f4860l = r1
            r4.f4859k = r3
            U3.j r3 = r4.f4862n
            java.lang.Object r5 = r3.invoke(r5, r4)
            if (r5 != r0) goto L32
            goto L3d
        L32:
            r3 = 0
            r4.f4860l = r3
            r4.f4859k = r2
            java.lang.Object r5 = r1.emit(r5, r4)
            if (r5 != r0) goto L3e
        L3d:
            return r0
        L3e:
            O3.C r5 = O3.C.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.C0341u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
