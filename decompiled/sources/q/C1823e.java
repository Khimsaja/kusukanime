package q;

/* renamed from: q.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1823e extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f14550k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1839v f14551l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u.m f14552m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1823e(C1839v c1839v, u.m mVar, S3.c cVar) {
        super(2, cVar);
        this.f14551l = c1839v;
        this.f14552m = mVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1823e(this.f14551l, this.f14552m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1823e) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f14550k;
        if (i7 == 0) {
            P3.r.Y(obj);
            u.k kVar = this.f14551l.f14648z;
            if (kVar != null) {
                this.f14550k = 1;
                if (kVar.b(this.f14552m, this) == aVar) {
                    return aVar;
                }
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
