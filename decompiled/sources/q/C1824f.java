package q;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1824f extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f14553k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1839v f14554l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u.m f14555m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824f(C1839v c1839v, u.m mVar, S3.c cVar) {
        super(2, cVar);
        this.f14554l = c1839v;
        this.f14555m = mVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1824f(this.f14554l, this.f14555m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1824f) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f14553k;
        if (i7 == 0) {
            P3.r.Y(obj);
            u.k kVar = this.f14554l.f14648z;
            if (kVar != null) {
                u.n nVar = new u.n(this.f14555m);
                this.f14553k = 1;
                if (kVar.b(nVar, this) == aVar) {
                    return aVar;
                }
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
