package q;

/* loaded from: classes.dex */
public final class G extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f14480k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H f14481l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(H h7, S3.c cVar) {
        super(2, cVar);
        this.f14481l = h7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new G(this.f14481l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f14480k;
        if (i7 == 0) {
            P3.r.Y(obj);
            this.f14480k = 1;
            if (P3.r.T(this.f14481l, null, this) == aVar) {
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
