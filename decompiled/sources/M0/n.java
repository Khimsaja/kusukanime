package M0;

/* loaded from: classes.dex */
public final class n extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f6408k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0471d f6409l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C0471d c0471d, S3.c cVar) {
        super(2, cVar);
        this.f6409l = c0471d;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new n(this.f6409l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f6408k;
        if (i7 == 0) {
            P3.r.Y(obj);
            this.f6408k = 1;
            if (this.f6409l.a(this) == aVar) {
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
