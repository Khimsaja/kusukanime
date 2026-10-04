package s;

import s0.C1953A;

/* loaded from: classes.dex */
public final class L0 extends U3.i implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15162k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15163l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H5.A f15164m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U3.j f15165n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f15166o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1909d0 f15167p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public L0(H5.A a, e4.o oVar, e4.k kVar, C1909d0 c1909d0, S3.c cVar) {
        super(2, cVar);
        this.f15164m = a;
        this.f15165n = (U3.j) oVar;
        this.f15166o = (kotlin.jvm.internal.m) kVar;
        this.f15167p = c1909d0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [U3.j, e4.o] */
    /* JADX WARN: Type inference failed for: r3v0, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        ?? r32 = this.f15166o;
        C1909d0 c1909d0 = this.f15167p;
        L0 l02 = new L0(this.f15164m, this.f15165n, r32, c1909d0, cVar);
        l02.f15163l = obj;
        return l02;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((L0) create((C1953A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r10 == r0) goto L18;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r8v0, types: [U3.j, e4.o] */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r9.f15162k
            s.d0 r2 = r9.f15167p
            H5.A r3 = r9.f15164m
            r4 = 3
            r5 = 0
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L26
            if (r1 == r7) goto L1e
            if (r1 != r6) goto L16
            P3.r.Y(r10)
            goto L61
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            java.lang.Object r1 = r9.f15163l
            s0.A r1 = (s0.C1953A) r1
            P3.r.Y(r10)
            goto L41
        L26:
            P3.r.Y(r10)
            java.lang.Object r10 = r9.f15163l
            r1 = r10
            s0.A r1 = (s0.C1953A) r1
            s.H0 r10 = new s.H0
            r10.<init>(r2, r5)
            H5.D.x(r3, r5, r10, r4)
            r9.f15163l = r1
            r9.f15162k = r7
            java.lang.Object r10 = s.c1.c(r1, r9, r4)
            if (r10 != r0) goto L41
            goto L60
        L41:
            s0.r r10 = (s0.r) r10
            r10.a()
            s.Q r7 = s.c1.a
            U3.j r8 = r9.f15165n
            if (r8 == r7) goto L54
            s.I0 r7 = new s.I0
            r7.<init>(r8, r2, r10, r5)
            H5.D.x(r3, r5, r7, r4)
        L54:
            r9.f15163l = r5
            r9.f15162k = r6
            s0.i r10 = s0.EnumC1964i.f15462l
            java.lang.Object r10 = s.c1.e(r1, r10, r9)
            if (r10 != r0) goto L61
        L60:
            return r0
        L61:
            s0.r r10 = (s0.r) r10
            if (r10 != 0) goto L6e
            s.J0 r10 = new s.J0
            r10.<init>(r2, r5)
            H5.D.x(r3, r5, r10, r4)
            goto L85
        L6e:
            r10.a()
            s.K0 r0 = new s.K0
            r0.<init>(r2, r5)
            H5.D.x(r3, r5, r0, r4)
            kotlin.jvm.internal.m r0 = r9.f15166o
            g0.c r1 = new g0.c
            long r2 = r10.f15470c
            r1.<init>(r2)
            r0.invoke(r1)
        L85:
            O3.C r10 = O3.C.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: s.L0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
