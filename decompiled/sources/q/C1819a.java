package q;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1819a extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f14527k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u.k f14528l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u.g f14529m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1819a(u.k kVar, u.g gVar, S3.c cVar) {
        super(2, cVar);
        this.f14528l = kVar;
        this.f14529m = gVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1819a(this.f14528l, this.f14529m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1819a) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f14527k;
        if (i7 == 0) {
            P3.r.Y(obj);
            this.f14527k = 1;
            if (this.f14528l.b(this.f14529m, this) == aVar) {
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
