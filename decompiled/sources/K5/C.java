package K5;

/* loaded from: classes.dex */
public final class C extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ int f4739k;

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C c2 = new C(2, cVar);
        c2.f4739k = ((Number) obj).intValue();
        return c2;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create(Integer.valueOf(((Number) obj).intValue()), (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        return Boolean.valueOf(this.f4739k > 0);
    }
}
