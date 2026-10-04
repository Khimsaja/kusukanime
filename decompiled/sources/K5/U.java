package K5;

/* loaded from: classes.dex */
public final class U extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4783k;

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        U u5 = new U(2, cVar);
        u5.f4783k = obj;
        return u5;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((P) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        return Boolean.valueOf(((P) this.f4783k) != P.f4774k);
    }
}
