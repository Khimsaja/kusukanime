package s;

/* loaded from: classes.dex */
public final class U0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15219k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1909d0 f15220l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(C1909d0 c1909d0, S3.c cVar) {
        super(2, cVar);
        this.f15220l = c1909d0;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new U0(this.f15220l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((U0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15219k;
        if (i7 == 0) {
            P3.r.Y(obj);
            this.f15219k = 1;
            if (this.f15220l.b(this) == aVar) {
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
