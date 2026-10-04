package s;

/* loaded from: classes.dex */
public final class C0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15087k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15088l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ D0 f15089m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U3.j f15090n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0(D0 d02, e4.n nVar, S3.c cVar) {
        super(2, cVar);
        this.f15089m = d02;
        this.f15090n = (U3.j) nVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [U3.j, e4.n] */
    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C0 c02 = new C0(this.f15089m, this.f15090n, cVar);
        c02.f15088l = obj;
        return c02;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0) create((InterfaceC1911e0) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [U3.j, e4.n] */
    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15087k;
        if (i7 == 0) {
            P3.r.Y(obj);
            InterfaceC1911e0 interfaceC1911e0 = (InterfaceC1911e0) this.f15088l;
            D0 d02 = this.f15089m;
            d02.f15104h = interfaceC1911e0;
            this.f15087k = 1;
            if (this.f15090n.invoke(d02.f15105i, this) == aVar) {
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
