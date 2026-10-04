package m;

/* renamed from: m.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1505z extends U3.i implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public U.c f12945k;

    /* renamed from: l, reason: collision with root package name */
    public C1472B f12946l;

    /* renamed from: m, reason: collision with root package name */
    public long[] f12947m;

    /* renamed from: n, reason: collision with root package name */
    public int f12948n;

    /* renamed from: o, reason: collision with root package name */
    public int f12949o;

    /* renamed from: p, reason: collision with root package name */
    public int f12950p;

    /* renamed from: q, reason: collision with root package name */
    public int f12951q;

    /* renamed from: r, reason: collision with root package name */
    public long f12952r;

    /* renamed from: s, reason: collision with root package name */
    public int f12953s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f12954t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1472B f12955u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ U.c f12956v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1505z(C1472B c1472b, U.c cVar, S3.c cVar2) {
        super(2, cVar2);
        this.f12955u = c1472b;
        this.f12956v = cVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C1505z c1505z = new C1505z(this.f12955u, this.f12956v, cVar);
        c1505z.f12954t = obj;
        return c1505z;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1505z) create((y5.j) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:22:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:19:0x0093). Please report as a decompilation issue!!! */
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
            int r3 = r0.f12953s
            r4 = 0
            r5 = 8
            if (r3 == 0) goto L2f
            if (r3 != r1) goto L27
            int r3 = r0.f12951q
            int r6 = r0.f12950p
            long r7 = r0.f12952r
            int r9 = r0.f12949o
            int r10 = r0.f12948n
            long[] r11 = r0.f12947m
            m.B r12 = r0.f12946l
            U.c r13 = r0.f12945k
            java.lang.Object r14 = r0.f12954t
            y5.j r14 = (y5.j) r14
            P3.r.Y(r22)
            goto L93
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2f:
            P3.r.Y(r22)
            java.lang.Object r3 = r0.f12954t
            y5.j r3 = (y5.j) r3
            m.B r6 = r0.f12955u
            long[] r7 = r6.a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La2
            U.c r9 = r0.f12956v
            r10 = r4
        L42:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L9e
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r3
            r3 = r4
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L65:
            if (r3 >= r6) goto L96
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L93
            int r4 = r9 << 3
            int r4 = r4 + r3
            r13.f9126l = r4
            java.lang.Object[] r5 = r12.f12864b
            r4 = r5[r4]
            r0.f12954t = r14
            r0.f12945k = r13
            r0.f12946l = r12
            r0.f12947m = r11
            r0.f12948n = r10
            r0.f12949o = r9
            r0.f12952r = r7
            r0.f12950p = r6
            r0.f12951q = r3
            r0.f12953s = r1
            r14.a(r4, r0)
            T3.a r1 = T3.a.f9048k
            return r2
        L93:
            long r7 = r7 >> r5
            int r3 = r3 + r1
            goto L65
        L96:
            if (r6 != r5) goto La2
            r8 = r10
            r7 = r11
            r6 = r12
            r3 = r14
            r10 = r9
            r9 = r13
        L9e:
            if (r10 == r8) goto La2
            int r10 = r10 + r1
            goto L42
        La2:
            O3.C r1 = O3.C.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C1505z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
