package D;

/* loaded from: classes.dex */
public final class B0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public O.Z f984k;

    /* renamed from: l, reason: collision with root package name */
    public int f985l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ O.Z f986m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f987n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u.k f988o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(O.Z z7, boolean z8, u.k kVar, S3.c cVar) {
        super(2, cVar);
        this.f986m = z7;
        this.f987n = z8;
        this.f988o = kVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new B0(this.f986m, this.f987n, this.f988o, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((B0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        O.Z z7;
        O.Z z8;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f985l;
        if (i7 == 0) {
            P3.r.Y(obj);
            z7 = this.f986m;
            u.m mVar = (u.m) z7.getValue();
            if (mVar != null) {
                u.i nVar = this.f987n ? new u.n(mVar) : new u.l(mVar);
                u.k kVar = this.f988o;
                if (kVar != null) {
                    this.f984k = z7;
                    this.f985l = 1;
                    if (kVar.b(nVar, this) == aVar) {
                        return aVar;
                    }
                    z8 = z7;
                }
                z7.setValue(null);
            }
            return O3.C.a;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z8 = this.f984k;
        P3.r.Y(obj);
        z7 = z8;
        z7.setValue(null);
        return O3.C.a;
    }
}
