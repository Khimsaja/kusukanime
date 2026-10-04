package s;

/* loaded from: classes.dex */
public final class U extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15215k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15216l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W f15217m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f15218n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(W w7, long j7, S3.c cVar) {
        super(2, cVar);
        this.f15217m = w7;
        this.f15218n = j7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        U u5 = new U(this.f15217m, this.f15218n, cVar);
        u5.f15216l = obj;
        return u5;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15215k;
        if (i7 == 0) {
            P3.r.Y(obj);
            H5.A a = (H5.A) this.f15216l;
            e4.o oVar = this.f15217m.f15230K;
            g0.c cVar = new g0.c(this.f15218n);
            this.f15215k = 1;
            if (oVar.invoke(a, cVar, this) == aVar) {
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
