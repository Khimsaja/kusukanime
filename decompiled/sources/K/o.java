package K;

/* loaded from: classes.dex */
public final class o extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4399k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f4400l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, S3.c cVar) {
        super(2, cVar);
        this.f4400l = pVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        o oVar = new o(this.f4400l, cVar);
        oVar.f4399k = obj;
        return oVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        return H5.D.x((H5.A) this.f4399k, null, new n(this.f4400l, null), 3);
    }
}
