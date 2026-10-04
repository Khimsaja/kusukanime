package s;

/* loaded from: classes.dex */
public final class N extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public kotlin.jvm.internal.x f15179k;

    /* renamed from: l, reason: collision with root package name */
    public int f15180l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f15181m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f15182n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ P f15183o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(kotlin.jvm.internal.x xVar, P p7, S3.c cVar) {
        super(2, cVar);
        this.f15182n = xVar;
        this.f15183o = p7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        N n7 = new N(this.f15182n, this.f15183o, cVar);
        n7.f15181m = obj;
        return n7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((e4.k) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0041 -> B:25:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004d -> B:24:0x0050). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r6.f15180l
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            kotlin.jvm.internal.x r1 = r6.f15179k
            java.lang.Object r3 = r6.f15181m
            e4.k r3 = (e4.k) r3
            P3.r.Y(r7)
            goto L50
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            P3.r.Y(r7)
            java.lang.Object r7 = r6.f15181m
            e4.k r7 = (e4.k) r7
            r3 = r7
        L23:
            kotlin.jvm.internal.x r1 = r6.f15182n
            java.lang.Object r7 = r1.f12720k
            boolean r4 = r7 instanceof s.C1943v
            if (r4 != 0) goto L56
            boolean r4 = r7 instanceof s.C1937s
            if (r4 != 0) goto L56
            boolean r4 = r7 instanceof s.C1939t
            r5 = 0
            if (r4 == 0) goto L37
            s.t r7 = (s.C1939t) r7
            goto L38
        L37:
            r7 = r5
        L38:
            if (r7 == 0) goto L3d
            r3.invoke(r7)
        L3d:
            s.P r7 = r6.f15183o
            J5.e r7 = r7.f15195D
            if (r7 == 0) goto L53
            r6.f15181m = r3
            r6.f15179k = r1
            r6.f15180l = r2
            java.lang.Object r7 = r7.receive(r6)
            if (r7 != r0) goto L50
            return r0
        L50:
            r5 = r7
            s.w r5 = (s.AbstractC1945w) r5
        L53:
            r1.f12720k = r5
            goto L23
        L56:
            O3.C r7 = O3.C.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s.N.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
