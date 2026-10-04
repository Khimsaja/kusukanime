package p;

/* renamed from: p.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1733U extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public R5.c f13910k;

    /* renamed from: l, reason: collision with root package name */
    public C1746d0 f13911l;

    /* renamed from: m, reason: collision with root package name */
    public int f13912m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1746d0 f13913n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f13914o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ u0 f13915p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1733U(S3.c cVar, Object obj, C1746d0 c1746d0, u0 u0Var) {
        super(2, cVar);
        this.f13913n = c1746d0;
        this.f13914o = obj;
        this.f13915p = u0Var;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1733U(cVar, this.f13914o, this.f13913n, this.f13915p);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1733U) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0175, code lost:
    
        if (p.C1746d0.O0(r15, r24) != r0) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1733U.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
