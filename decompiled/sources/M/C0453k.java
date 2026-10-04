package M;

/* renamed from: M.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0453k extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f6310k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6311l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0459q f6312m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0460s f6313n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0453k(C0459q c0459q, C0460s c0460s, S3.c cVar) {
        super(2, cVar);
        this.f6312m = c0459q;
        this.f6313n = c0460s;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C0453k c0453k = new C0453k(this.f6312m, this.f6313n, cVar);
        c0453k.f6311l = obj;
        return c0453k;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0453k) create((B) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f6310k;
        if (i7 == 0) {
            P3.r.Y(obj);
            B b4 = (B) this.f6311l;
            C0458p c0458p = this.f6313n.f6344n;
            this.f6310k = 1;
            if (this.f6312m.invoke(c0458p, b4, this) == aVar) {
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
