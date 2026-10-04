package F;

import H5.InterfaceC0265f0;

/* loaded from: classes.dex */
public final class o extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f2030k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0265f0 f2031l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f2032m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(InterfaceC0265f0 interfaceC0265f0, q qVar, S3.c cVar) {
        super(2, cVar);
        this.f2031l = interfaceC0265f0;
        this.f2032m = qVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new o(this.f2031l, this.f2032m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((o) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
        return T3.a.f9048k;
    }

    /* JADX WARN: Path cross not found for [B:18:0x0031, B:24:0x0043], limit reached: 29 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053 A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0014, B:24:0x0043, B:27:0x0053, B:13:0x0022), top: B:32:0x000c }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x005e -> B:24:0x0043). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r9.f2030k
            r2 = 0
            r3 = 500(0x1f4, double:2.47E-321)
            r5 = 3
            r6 = 2
            r7 = 1
            F.q r8 = r9.f2032m
            if (r1 == 0) goto L2a
            if (r1 == r7) goto L26
            if (r1 == r6) goto L22
            if (r1 != r5) goto L1a
            P3.r.Y(r10)     // Catch: java.lang.Throwable -> L18
            goto L43
        L18:
            r10 = move-exception
            goto L61
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            P3.r.Y(r10)     // Catch: java.lang.Throwable -> L18
            goto L53
        L26:
            P3.r.Y(r10)
            goto L43
        L2a:
            P3.r.Y(r10)
            H5.f0 r10 = r9.f2031l
            if (r10 == 0) goto L43
            r9.f2030k = r7
            r1 = 0
            r10.e(r1)
            java.lang.Object r10 = r10.m(r9)
            if (r10 != r0) goto L3e
            goto L40
        L3e:
            O3.C r10 = O3.C.a
        L40:
            if (r10 != r0) goto L43
            goto L60
        L43:
            O.c0 r10 = r8.f2035b     // Catch: java.lang.Throwable -> L18
            r1 = 1065353216(0x3f800000, float:1.0)
            r10.g(r1)     // Catch: java.lang.Throwable -> L18
            r9.f2030k = r6     // Catch: java.lang.Throwable -> L18
            java.lang.Object r10 = H5.D.k(r3, r9)     // Catch: java.lang.Throwable -> L18
            if (r10 != r0) goto L53
            goto L60
        L53:
            O.c0 r10 = r8.f2035b     // Catch: java.lang.Throwable -> L18
            r10.g(r2)     // Catch: java.lang.Throwable -> L18
            r9.f2030k = r5     // Catch: java.lang.Throwable -> L18
            java.lang.Object r10 = H5.D.k(r3, r9)     // Catch: java.lang.Throwable -> L18
            if (r10 != r0) goto L43
        L60:
            return r0
        L61:
            O.c0 r0 = r8.f2035b
            r0.g(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: F.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
