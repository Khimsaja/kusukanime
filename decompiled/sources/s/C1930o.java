package s;

/* renamed from: s.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1930o extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15355k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15356l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f15357m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e4.n f15358n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1930o(r rVar, e4.n nVar, S3.c cVar) {
        super(2, cVar);
        this.f15357m = rVar;
        this.f15358n = nVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C1930o c1930o = new C1930o(this.f15357m, this.f15358n, cVar);
        c1930o.f15356l = obj;
        return c1930o;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1930o) create((InterfaceC1911e0) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15355k;
        r rVar = this.f15357m;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                InterfaceC1911e0 interfaceC1911e0 = (InterfaceC1911e0) this.f15356l;
                rVar.f15373d.setValue(Boolean.TRUE);
                e4.n nVar = this.f15358n;
                this.f15355k = 1;
                if (nVar.invoke(interfaceC1911e0, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P3.r.Y(obj);
            }
            rVar.f15373d.setValue(Boolean.FALSE);
            return O3.C.a;
        } catch (Throwable th) {
            rVar.f15373d.setValue(Boolean.FALSE);
            throw th;
        }
    }
}
