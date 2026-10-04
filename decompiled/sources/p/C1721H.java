package p;

/* renamed from: p.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1721H extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ float f13863k;

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C1721H c1721h = new C1721H(2, cVar);
        c1721h.f13863k = ((Number) obj).floatValue();
        return c1721h;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1721H) create(Float.valueOf(((Number) obj).floatValue()), (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        return Boolean.valueOf(this.f13863k > 0.0f);
    }
}
