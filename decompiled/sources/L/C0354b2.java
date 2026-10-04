package L;

/* renamed from: L.b2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354b2 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f5462k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u.k f5463l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y.r f5464m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0354b2(u.k kVar, Y.r rVar, S3.c cVar) {
        super(2, cVar);
        this.f5463l = kVar;
        this.f5464m = rVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C0354b2(this.f5463l, this.f5464m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0354b2) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f5462k;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
            return O3.C.a;
        }
        P3.r.Y(obj);
        K5.M m7 = this.f5463l.a;
        C0417t c0417t = new C0417t(this.f5464m, 2);
        this.f5462k = 1;
        m7.getClass();
        K5.M.j(m7, c0417t, this);
        return aVar;
    }
}
