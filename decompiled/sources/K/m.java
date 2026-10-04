package K;

/* loaded from: classes.dex */
public final class m extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4395k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f4396l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, S3.c cVar) {
        super(2, cVar);
        this.f4396l = pVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        m mVar = new m(this.f4396l, cVar);
        mVar.f4395k = obj;
        return mVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        H5.A a = (H5.A) this.f4395k;
        p pVar = this.f4396l;
        H5.D.x(a, null, new j(pVar, null), 3);
        H5.D.x(a, null, new k(pVar, null), 3);
        return H5.D.x(a, null, new l(pVar, null), 3);
    }
}
