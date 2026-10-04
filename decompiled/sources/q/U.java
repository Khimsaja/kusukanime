package q;

/* loaded from: classes.dex */
public final class U extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f14500k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ V f14501l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(V v5, S3.c cVar) {
        super(2, cVar);
        this.f14501l = v5;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new U(this.f14501l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((U) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
        return T3.a.f9048k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (O.C0486d.F(getContext()).P(new O.V(0, r8), r7) == r0) goto L20;
     */
    /* JADX WARN: Path cross not found for [B:13:0x0025, B:16:0x002e], limit reached: 23 */
    /* JADX WARN: Path cross not found for [B:16:0x002e, B:13:0x0025], limit reached: 23 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0030 -> B:11:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0048 -> B:21:0x004b). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r7.f14500k
            r2 = 2
            r3 = 1
            q.V r4 = r7.f14501l
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            P3.r.Y(r8)
            goto L4b
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            P3.r.Y(r8)
            goto L2e
        L1e:
            P3.r.Y(r8)
        L21:
            J5.e r8 = r4.f14509H
            if (r8 == 0) goto L2e
            r7.f14500k = r3
            java.lang.Object r8 = r8.receive(r7)
            if (r8 != r0) goto L2e
            goto L4a
        L2e:
            q.f0 r8 = r4.f14504C
            if (r8 == 0) goto L21
            q.q r8 = q.C1835q.f14611n
            r7.f14500k = r2
            S3.h r1 = r7.getContext()
            O.U r1 = O.C0486d.F(r1)
            O.V r5 = new O.V
            r6 = 0
            r5.<init>(r6, r8)
            java.lang.Object r8 = r1.P(r5, r7)
            if (r8 != r0) goto L4b
        L4a:
            return r0
        L4b:
            q.f0 r8 = r4.f14504C
            if (r8 == 0) goto L21
            q.h0 r8 = (q.h0) r8
            r8.d()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: q.U.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
