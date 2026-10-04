package O;

/* loaded from: classes.dex */
public final class L0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f7011k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f7012l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e4.n f7013m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f7014n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(e4.n nVar, Z z7, S3.c cVar) {
        super(2, cVar);
        this.f7013m = nVar;
        this.f7014n = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        L0 l02 = new L0(this.f7013m, this.f7014n, cVar);
        l02.f7012l = obj;
        return l02;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((L0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f7011k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C0503l0 c0503l0 = new C0503l0(this.f7014n, ((H5.A) this.f7012l).getCoroutineContext());
            this.f7011k = 1;
            if (this.f7013m.invoke(c0503l0, this) == aVar) {
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
