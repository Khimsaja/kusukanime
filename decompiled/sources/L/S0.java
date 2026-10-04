package L;

/* loaded from: classes.dex */
public final class S0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f5337k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0390k2 f5338l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(C0390k2 c0390k2, S3.c cVar) {
        super(2, cVar);
        this.f5338l = c0390k2;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new S0(this.f5338l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((S0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f5337k;
        if (i7 == 0) {
            P3.r.Y(obj);
            this.f5337k = 1;
            if (this.f5338l.b(this) == aVar) {
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
