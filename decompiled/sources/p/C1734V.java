package p;

/* renamed from: p.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1734V extends U3.j implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public int f13916k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u0 f13917l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1746d0 f13918m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f13919n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1734V(S3.c cVar, Object obj, C1746d0 c1746d0, u0 u0Var) {
        super(1, cVar);
        this.f13917l = u0Var;
        this.f13918m = c1746d0;
        this.f13919n = obj;
    }

    @Override // U3.a
    public final S3.c create(S3.c cVar) {
        return new C1734V(cVar, this.f13919n, this.f13918m, this.f13917l);
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        return ((C1734V) create((S3.c) obj)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f13916k;
        u0 u0Var = this.f13917l;
        if (i7 == 0) {
            P3.r.Y(obj);
            C1733U c1733u = new C1733U(null, this.f13919n, this.f13918m, u0Var);
            this.f13916k = 1;
            if (H5.D.j(c1733u, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        u0Var.i();
        return O3.C.a;
    }
}
