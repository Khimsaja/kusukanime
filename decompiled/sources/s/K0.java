package s;

/* loaded from: classes.dex */
public final class K0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1909d0 f15155k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(C1909d0 c1909d0, S3.c cVar) {
        super(2, cVar);
        this.f15155k = c1909d0;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new K0(this.f15155k, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        K0 k02 = (K0) create((H5.A) obj, (S3.c) obj2);
        O3.C c2 = O3.C.a;
        k02.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        C1909d0 c1909d0 = this.f15155k;
        c1909d0.f15283l = true;
        c1909d0.f15285n.e(null);
        return O3.C.a;
    }
}
