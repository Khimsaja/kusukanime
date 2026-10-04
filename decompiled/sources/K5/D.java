package K5;

/* loaded from: classes.dex */
public final class D extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f4740k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4741l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0329h f4742m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y f4743n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Float f4744o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(InterfaceC0329h interfaceC0329h, Y y7, Float f5, S3.c cVar) {
        super(2, cVar);
        this.f4742m = interfaceC0329h;
        this.f4743n = y7;
        this.f4744o = f5;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        D d4 = new D(this.f4742m, this.f4743n, this.f4744o, cVar);
        d4.f4741l = obj;
        return d4;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((P) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f4740k;
        if (i7 == 0) {
            P3.r.Y(obj);
            int iOrdinal = ((P) this.f4741l).ordinal();
            Y y7 = this.f4743n;
            if (iOrdinal == 0) {
                this.f4740k = 1;
                if (this.f4742m.collect(y7, this) == aVar) {
                    return aVar;
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new D6.r();
                }
                F2.G g4 = N.a;
                Float f5 = this.f4744o;
                if (f5 == g4) {
                    y7.getClass();
                    throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                }
                y7.h(f5);
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
