package M;

/* renamed from: M.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0448f extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f6291k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U3.j f6292l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6293m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ H5.A f6294n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0448f(e4.n nVar, Object obj, H5.A a, S3.c cVar) {
        super(2, cVar);
        this.f6292l = (U3.j) nVar;
        this.f6293m = obj;
        this.f6294n = a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [U3.j, e4.n] */
    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C0448f(this.f6292l, this.f6293m, this.f6294n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0448f) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [U3.j, e4.n] */
    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f6291k;
        if (i7 == 0) {
            P3.r.Y(obj);
            this.f6291k = 1;
            if (this.f6292l.invoke(this.f6293m, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        H5.D.h(this.f6294n, new C0445c());
        return O3.C.a;
    }
}
