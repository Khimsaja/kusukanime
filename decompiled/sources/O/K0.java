package O;

/* loaded from: classes.dex */
public final class K0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f7007k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f7008l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e4.n f7009m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f7010n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(e4.n nVar, Z z7, S3.c cVar) {
        super(2, cVar);
        this.f7009m = nVar;
        this.f7010n = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        K0 k02 = new K0(this.f7009m, this.f7010n, cVar);
        k02.f7008l = obj;
        return k02;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((K0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f7007k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C0503l0 c0503l0 = new C0503l0(this.f7010n, ((H5.A) this.f7008l).getCoroutineContext());
            this.f7007k = 1;
            if (this.f7009m.invoke(c0503l0, this) == aVar) {
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
