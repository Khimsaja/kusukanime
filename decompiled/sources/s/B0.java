package s;

/* loaded from: classes.dex */
public final class B0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public long f15066k;

    /* renamed from: l, reason: collision with root package name */
    public int f15067l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ long f15068m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ D0 f15069n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(D0 d02, S3.c cVar) {
        super(2, cVar);
        this.f15069n = d02;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        B0 b02 = new B0(this.f15069n, cVar);
        b02.f15068m = ((T0.o) obj).a;
        return b02;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        long j7 = ((T0.o) obj).a;
        B0 b02 = new B0(this.f15069n, (S3.c) obj2);
        b02.f15068m = j7;
        return b02.invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r14.f15067l
            r2 = 3
            r3 = 2
            r4 = 1
            s.D0 r5 = r14.f15069n
            if (r1 == 0) goto L2f
            if (r1 == r4) goto L29
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            long r0 = r14.f15066k
            long r2 = r14.f15068m
            P3.r.Y(r15)
            goto L71
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            long r3 = r14.f15066k
            long r6 = r14.f15068m
            P3.r.Y(r15)
            goto L57
        L29:
            long r6 = r14.f15068m
            P3.r.Y(r15)
            goto L41
        L2f:
            P3.r.Y(r15)
            long r6 = r14.f15068m
            r0.e r15 = r5.f15102f
            r14.f15068m = r6
            r14.f15067l = r4
            java.lang.Object r15 = r15.b(r6, r14)
            if (r15 != r0) goto L41
            goto L6e
        L41:
            T0.o r15 = (T0.o) r15
            long r8 = r15.a
            long r8 = T0.o.d(r6, r8)
            r14.f15068m = r6
            r14.f15066k = r8
            r14.f15067l = r3
            java.lang.Object r15 = r5.b(r8, r14)
            if (r15 != r0) goto L56
            goto L6e
        L56:
            r3 = r8
        L57:
            T0.o r15 = (T0.o) r15
            long r11 = r15.a
            r0.e r8 = r5.f15102f
            long r9 = T0.o.d(r3, r11)
            r14.f15068m = r6
            r14.f15066k = r11
            r14.f15067l = r2
            r13 = r14
            java.lang.Object r15 = r8.a(r9, r11, r13)
            if (r15 != r0) goto L6f
        L6e:
            return r0
        L6f:
            r2 = r6
            r0 = r11
        L71:
            T0.o r15 = (T0.o) r15
            long r4 = r15.a
            long r0 = T0.o.d(r0, r4)
            long r0 = T0.o.d(r2, r0)
            T0.o r15 = new T0.o
            r15.<init>(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: s.B0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
