package p;

/* renamed from: p.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1749f extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public J5.d f14002k;

    /* renamed from: l, reason: collision with root package name */
    public int f14003l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f14004m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ J5.i f14005n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1743c f14006o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ O.Z f14007p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ O.Z f14008q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1749f(J5.i iVar, C1743c c1743c, O.Z z7, O.Z z8, S3.c cVar) {
        super(2, cVar);
        this.f14005n = iVar;
        this.f14006o = c1743c;
        this.f14007p = z7;
        this.f14008q = z8;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C1749f c1749f = new C1749f(this.f14005n, this.f14006o, this.f14007p, this.f14008q, cVar);
        c1749f.f14004m = obj;
        return c1749f;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1749f) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:12:0x0036). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r12.f14003l
            J5.i r2 = r12.f14005n
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 != r3) goto L15
            J5.d r1 = r12.f14002k
            java.lang.Object r4 = r12.f14004m
            H5.A r4 = (H5.A) r4
            P3.r.Y(r13)
            goto L36
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            P3.r.Y(r13)
            java.lang.Object r13 = r12.f14004m
            H5.A r13 = (H5.A) r13
            J5.d r1 = r2.iterator()
            r4 = r13
        L29:
            r12.f14004m = r4
            r12.f14002k = r1
            r12.f14003l = r3
            java.lang.Object r13 = r1.b(r12)
            if (r13 != r0) goto L36
            return r0
        L36:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L61
            java.lang.Object r13 = r1.c()
            java.lang.Object r5 = r2.a()
            java.lang.Object r5 = J5.m.a(r5)
            if (r5 != 0) goto L4e
            r7 = r13
            goto L4f
        L4e:
            r7 = r5
        L4f:
            p.e r6 = new p.e
            O.Z r10 = r12.f14008q
            O.Z r9 = r12.f14007p
            p.c r8 = r12.f14006o
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r13 = 3
            r5 = 0
            H5.D.x(r4, r5, r6, r13)
            goto L29
        L61:
            O3.C r13 = O3.C.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1749f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
