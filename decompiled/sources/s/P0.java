package s;

/* loaded from: classes.dex */
public final class P0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15200k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q f15201l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1909d0 f15202m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s0.r f15203n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(Q q6, C1909d0 c1909d0, s0.r rVar, S3.c cVar) {
        super(2, cVar);
        this.f15201l = q6;
        this.f15202m = c1909d0;
        this.f15203n = rVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new P0(this.f15201l, this.f15202m, this.f15203n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((P0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15200k;
        O3.C c2 = O3.C.a;
        if (i7 == 0) {
            P3.r.Y(obj);
            this.f15200k = 1;
            this.f15201l.getClass();
            new Q(3, this, 2).invokeSuspend(c2);
            if (c2 == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        return c2;
    }
}
