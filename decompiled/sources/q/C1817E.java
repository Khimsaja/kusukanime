package q;

/* renamed from: q.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1817E extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f14474k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u.k f14475l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u.i f14476m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ H5.N f14477n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817E(u.k kVar, u.i iVar, H5.N n7, S3.c cVar) {
        super(2, cVar);
        this.f14475l = kVar;
        this.f14476m = iVar;
        this.f14477n = n7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1817E(this.f14475l, this.f14476m, this.f14477n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1817E) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f14474k;
        if (i7 == 0) {
            P3.r.Y(obj);
            this.f14474k = 1;
            if (this.f14475l.b(this.f14476m, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        H5.N n7 = this.f14477n;
        if (n7 != null) {
            n7.dispose();
        }
        return O3.C.a;
    }
}
