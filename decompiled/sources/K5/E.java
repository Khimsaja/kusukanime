package K5;

/* loaded from: classes.dex */
public final class E extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f4745k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ V f4746l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0329h f4747m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y f4748n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Float f4749o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(V v5, InterfaceC0329h interfaceC0329h, Y y7, Float f5, S3.c cVar) {
        super(2, cVar);
        this.f4746l = v5;
        this.f4747m = interfaceC0329h;
        this.f4748n = y7;
        this.f4749o = f5;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new E(this.f4746l, this.f4747m, this.f4748n, this.f4749o, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6 A[RETURN] */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            r21 = this;
            r0 = r21
            r1 = 1
            T3.a r2 = T3.a.f9048k
            int r3 = r0.f4745k
            O3.C r4 = O3.C.a
            K5.h r5 = r0.f4747m
            K5.Y r6 = r0.f4748n
            r7 = 2
            r8 = 4
            r9 = 3
            if (r3 == 0) goto L32
            if (r3 == r1) goto L2e
            if (r3 == r7) goto L2a
            if (r3 == r9) goto L26
            if (r3 != r8) goto L1e
            P3.r.Y(r22)
            return r4
        L1e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L26:
            P3.r.Y(r22)
            return r4
        L2a:
            P3.r.Y(r22)
            goto L5d
        L2e:
            P3.r.Y(r22)
            return r4
        L32:
            P3.r.Y(r22)
            K5.S r3 = K5.Q.a
            K5.V r10 = r0.f4746l
            if (r10 != r3) goto L45
            r0.f4745k = r1
            java.lang.Object r1 = r5.collect(r6, r0)
            if (r1 != r2) goto Lc6
            goto Lc5
        L45:
            K5.S r3 = K5.Q.f4778b
            r11 = 0
            if (r10 != r3) goto L66
            L5.y r1 = r6.g()
            K5.C r3 = new K5.C
            r3.<init>(r7, r11)
            r0.f4745k = r7
            java.lang.Object r1 = K5.N.i(r1, r3, r0)
            if (r1 != r2) goto L5d
            goto Lc5
        L5d:
            r0.f4745k = r9
            java.lang.Object r1 = r5.collect(r6, r0)
            if (r1 != r2) goto Lc6
            goto Lc5
        L66:
            L5.y r14 = r6.g()
            K5.T r13 = new K5.T
            r13.<init>(r10, r11)
            int r3 = K5.AbstractC0342v.a
            L5.n r12 = new L5.n
            S3.i r15 = S3.i.f8767k
            J5.c r17 = J5.c.f4299k
            r16 = -2
            r12.<init>(r13, r14, r15, r16, r17)
            K5.U r3 = new K5.U
            r3.<init>(r7, r11)
            K5.q r7 = new K5.q
            r7.<init>(r12, r3, r1)
            K5.h r1 = K5.N.f(r7)
            K5.h r1 = K5.N.f(r1)
            K5.D r3 = new K5.D
            java.lang.Float r7 = r0.f4749o
            r3.<init>(r5, r6, r7, r11)
            r0.f4745k = r8
            K5.u r5 = new K5.u
            r5.<init>(r3, r11)
            r18 = r15
            L5.n r15 = new L5.n
            r19 = -2
            r16 = r5
            r20 = r17
            r17 = r1
            r15.<init>(r16, r17, r18, r19, r20)
            r3 = r15
            r15 = r18
            r1 = r20
            r5 = 0
            K5.h r1 = r3.b(r15, r5, r1)
            L5.s r3 = L5.s.f6194k
            java.lang.Object r1 = r1.collect(r3, r0)
            if (r1 != r2) goto Lbe
            goto Lbf
        Lbe:
            r1 = r4
        Lbf:
            if (r1 != r2) goto Lc2
            goto Lc3
        Lc2:
            r1 = r4
        Lc3:
            if (r1 != r2) goto Lc6
        Lc5:
            return r2
        Lc6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.E.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
