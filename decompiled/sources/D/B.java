package D;

/* loaded from: classes.dex */
public final class B extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f978k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A.c f979l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N0.w f980m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0053g0 f981n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ N0 f982o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N0.q f983p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(A.c cVar, N0.w wVar, C0053g0 c0053g0, N0 n02, N0.q qVar, S3.c cVar2) {
        super(2, cVar2);
        this.f979l = cVar;
        this.f980m = wVar;
        this.f981n = c0053g0;
        this.f982o = n02;
        this.f983p = qVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new B(this.f979l, this.f980m, this.f981n, this.f982o, this.f983p, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f978k;
        O3.C c2 = O3.C.a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
            return c2;
        }
        P3.r.Y(obj);
        C0069o0 c0069o0 = this.f981n.a;
        H0.F f5 = this.f982o.a;
        this.f978k = 1;
        int iB = this.f983p.b(H0.H.d(this.f980m.f6896b));
        Object objA = this.f979l.a(iB < f5.a.a.a.length() ? f5.b(iB) : iB != 0 ? f5.b(iB - 1) : new g0.d(0.0f, 0.0f, 1.0f, (int) (u0.a(c0069o0.f1254b, c0069o0.f1259g, c0069o0.f1260h, u0.a, 1) & 4294967295L)), this);
        if (objA != aVar) {
            objA = c2;
        }
        return objA == aVar ? aVar : c2;
    }
}
