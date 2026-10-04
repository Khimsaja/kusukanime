package M;

/* renamed from: M.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0456n extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f6321k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6322l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0446d f6323m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0460s f6324n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0456n(C0446d c0446d, C0460s c0460s, S3.c cVar) {
        super(2, cVar);
        this.f6323m = c0446d;
        this.f6324n = c0460s;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C0456n c0456n = new C0456n(this.f6323m, this.f6324n, cVar);
        c0456n.f6322l = obj;
        return c0456n;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0456n) create((O3.l) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f6321k;
        if (i7 == 0) {
            P3.r.Y(obj);
            O3.l lVar = (O3.l) this.f6322l;
            B b4 = (B) lVar.f7528k;
            C0458p c0458p = this.f6324n.f6344n;
            this.f6321k = 1;
            if (this.f6323m.invoke(c0458p, b4, lVar.f7529l, this) == aVar) {
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
