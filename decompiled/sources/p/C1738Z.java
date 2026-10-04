package p;

/* renamed from: p.Z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1738Z extends U3.j implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public int f13933k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f13934l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f13935m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1746d0 f13936n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u0 f13937o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f13938p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1738Z(Object obj, Object obj2, C1746d0 c1746d0, u0 u0Var, float f5, S3.c cVar) {
        super(1, cVar);
        this.f13934l = obj;
        this.f13935m = obj2;
        this.f13936n = c1746d0;
        this.f13937o = u0Var;
        this.f13938p = f5;
    }

    @Override // U3.a
    public final S3.c create(S3.c cVar) {
        return new C1738Z(this.f13934l, this.f13935m, this.f13936n, this.f13937o, this.f13938p, cVar);
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        return ((C1738Z) create((S3.c) obj)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f13933k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C1737Y c1737y = new C1737Y(this.f13934l, this.f13935m, this.f13936n, this.f13937o, this.f13938p, null);
            this.f13933k = 1;
            if (H5.D.j(c1737y, this) == aVar) {
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
