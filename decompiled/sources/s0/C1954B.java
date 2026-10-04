package s0;

/* renamed from: s0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1954B extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15429k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1955C f15430l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1954B(C1955C c1955c, S3.c cVar) {
        super(2, cVar);
        this.f15430l = c1955c;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1954B(this.f15430l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1954B) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15429k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C1955C c1955c = this.f15430l;
            e4.n nVar = c1955c.f15439z;
            this.f15429k = 1;
            if (nVar.invoke(c1955c, this) == aVar) {
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
