package s;

/* loaded from: classes.dex */
public final class I0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15143k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U3.j f15144l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1909d0 f15145m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s0.r f15146n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I0(e4.o oVar, C1909d0 c1909d0, s0.r rVar, S3.c cVar) {
        super(2, cVar);
        this.f15144l = (U3.j) oVar;
        this.f15145m = c1909d0;
        this.f15146n = rVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [U3.j, e4.o] */
    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new I0(this.f15144l, this.f15145m, this.f15146n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((I0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [U3.j, e4.o] */
    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15143k;
        if (i7 == 0) {
            P3.r.Y(obj);
            g0.c cVar = new g0.c(this.f15146n.f15470c);
            this.f15143k = 1;
            if (this.f15144l.invoke(this.f15145m, cVar, this) == aVar) {
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
