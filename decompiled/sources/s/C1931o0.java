package s;

/* renamed from: s.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1931o0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15359k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1944v0 f15360l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f15361m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1931o0(C1944v0 c1944v0, long j7, S3.c cVar) {
        super(2, cVar);
        this.f15360l = c1944v0;
        this.f15361m = j7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1931o0(this.f15360l, this.f15361m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1931o0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r8.f15359k
            O3.C r2 = O3.C.a
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            P3.r.Y(r9)
            return r2
        Lf:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L17:
            P3.r.Y(r9)
            s.v0 r9 = r8.f15360l
            s.D0 r9 = r9.f15391M
            r8.f15359k = r3
            s.a0 r1 = r9.f15100d
            s.a0 r4 = s.EnumC1903a0.f15260l
            r5 = 0
            long r6 = r8.f15361m
            if (r1 != r4) goto L2e
            long r3 = T0.o.a(r6, r5, r5, r3)
            goto L33
        L2e:
            r1 = 2
            long r3 = T0.o.a(r6, r5, r5, r1)
        L33:
            s.B0 r1 = new s.B0
            r5 = 0
            r1.<init>(r9, r5)
            q.e0 r5 = r9.f15098b
            if (r5 == 0) goto L56
            s.w0 r6 = r9.a
            boolean r6 = r6.c()
            if (r6 != 0) goto L4d
            s.w0 r9 = r9.a
            boolean r9 = r9.a()
            if (r9 == 0) goto L56
        L4d:
            java.lang.Object r9 = r5.b(r3, r1, r8)
            if (r9 != r0) goto L54
            goto L65
        L54:
            r9 = r2
            goto L65
        L56:
            s.B0 r9 = new s.B0
            s.D0 r1 = r1.f15069n
            r9.<init>(r1, r8)
            r9.f15068m = r3
            java.lang.Object r9 = r9.invokeSuspend(r2)
            if (r9 != r0) goto L54
        L65:
            if (r9 != r0) goto L68
            return r0
        L68:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C1931o0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
