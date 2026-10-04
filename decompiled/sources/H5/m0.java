package H5;

/* loaded from: classes.dex */
public final class m0 extends U3.i implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public p0 f3868k;

    /* renamed from: l, reason: collision with root package name */
    public M5.i f3869l;

    /* renamed from: m, reason: collision with root package name */
    public int f3870m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f3871n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n0 f3872o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, S3.c cVar) {
        super(2, cVar);
        this.f3872o = n0Var;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        m0 m0Var = new m0(this.f3872o, cVar);
        m0Var.f3871n = obj;
        return m0Var;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((y5.j) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0069 -> B:25:0x007e). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r5.f3870m
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            M5.i r1 = r5.f3869l
            H5.p0 r3 = r5.f3868k
            java.lang.Object r4 = r5.f3871n
            y5.j r4 = (y5.j) r4
            P3.r.Y(r6)
            goto L7e
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L20:
            P3.r.Y(r6)
            goto L83
        L24:
            P3.r.Y(r6)
            java.lang.Object r6 = r5.f3871n
            y5.j r6 = (y5.j) r6
            H5.n0 r1 = r5.f3872o
            r1.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = H5.n0.f3873k
            java.lang.Object r1 = r4.get(r1)
            boolean r4 = r1 instanceof H5.C0274o
            if (r4 == 0) goto L44
            H5.o r1 = (H5.C0274o) r1
            H5.n0 r1 = r1.f3875o
            r5.f3870m = r3
            r6.a(r1, r5)
            return r0
        L44:
            boolean r3 = r1 instanceof H5.InterfaceC0255a0
            if (r3 == 0) goto L83
            H5.a0 r1 = (H5.InterfaceC0255a0) r1
            H5.p0 r1 = r1.c()
            if (r1 == 0) goto L83
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = M5.i.f6589k
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.l.d(r4, r3)
            M5.i r3 = (M5.i) r3
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r6
        L61:
            boolean r6 = r1.equals(r3)
            if (r6 != 0) goto L83
            boolean r6 = r1 instanceof H5.C0274o
            if (r6 == 0) goto L7e
            r6 = r1
            H5.o r6 = (H5.C0274o) r6
            r5.f3871n = r4
            r5.f3868k = r3
            r5.f3869l = r1
            r5.f3870m = r2
            H5.n0 r6 = r6.f3875o
            r4.a(r6, r5)
            T3.a r6 = T3.a.f9048k
            return r0
        L7e:
            M5.i r1 = r1.g()
            goto L61
        L83:
            O3.C r6 = O3.C.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
