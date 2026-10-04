package O;

/* loaded from: classes.dex */
public final class N0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f7020k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K5.J f7021l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0503l0 f7022m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(K5.J j7, C0503l0 c0503l0, S3.c cVar) {
        super(2, cVar);
        this.f7021l = j7;
        this.f7022m = c0503l0;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new N0(this.f7021l, this.f7022m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((N0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f7020k;
        if (i7 == 0) {
            P3.r.Y(obj);
            M0 m02 = new M0(this.f7022m, 1);
            this.f7020k = 1;
            if (this.f7021l.collect(m02, this) == aVar) {
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
