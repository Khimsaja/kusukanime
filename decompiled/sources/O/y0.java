package O;

/* loaded from: classes.dex */
public final class y0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f7246k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e4.k f7247l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(e4.k kVar, S3.c cVar) {
        super(2, cVar);
        this.f7247l = kVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new y0(this.f7247l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((y0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f7246k;
        if (i7 == 0) {
            P3.r.Y(obj);
            this.f7246k = 1;
            if (H5.D.k(16L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        return this.f7247l.invoke(new Long(System.nanoTime()));
    }
}
