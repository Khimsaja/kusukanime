package s;

/* renamed from: s.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1932p extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15362k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f15363l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q.X f15364m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e4.n f15365n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1932p(r rVar, q.X x7, e4.n nVar, S3.c cVar) {
        super(2, cVar);
        this.f15363l = rVar;
        this.f15364m = x7;
        this.f15365n = nVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1932p(this.f15363l, this.f15364m, this.f15365n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1932p) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15362k;
        if (i7 == 0) {
            P3.r.Y(obj);
            r rVar = this.f15363l;
            q.a0 a0Var = rVar.f15372c;
            C1934q c1934q = rVar.f15371b;
            C1930o c1930o = new C1930o(rVar, this.f15365n, null);
            this.f15362k = 1;
            a0Var.getClass();
            if (H5.D.j(new q.Z(this.f15364m, a0Var, c1930o, c1934q, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        return O3.C.a;
    }
}
