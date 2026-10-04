package y;

/* renamed from: y.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2311K extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f17583k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2312L f17584l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f17585m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2311K(C2312L c2312l, int i7, S3.c cVar) {
        super(2, cVar);
        this.f17584l = c2312l;
        this.f17585m = i7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C2311K(this.f17584l, this.f17585m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2311K) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f17583k;
        if (i7 == 0) {
            P3.r.Y(obj);
            InterfaceC2308H interfaceC2308H = this.f17584l.f17591y;
            this.f17583k = 1;
            if (interfaceC2308H.d(this.f17585m, this) == aVar) {
                return aVar;
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
