package M;

/* renamed from: M.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0454l extends U3.j implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public int f6314k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0460s f6315l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0459q f6316m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0454l(C0459q c0459q, C0460s c0460s, S3.c cVar) {
        super(1, cVar);
        this.f6315l = c0460s;
        this.f6316m = c0459q;
    }

    @Override // U3.a
    public final S3.c create(S3.c cVar) {
        return new C0454l(this.f6316m, this.f6315l, cVar);
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        return ((C0454l) create((S3.c) obj)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f6314k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C0460s c0460s = this.f6315l;
            C0452j c0452j = new C0452j(c0460s, 0);
            C0453k c0453k = new C0453k(this.f6316m, c0460s, null);
            this.f6314k = 1;
            if (androidx.compose.material3.internal.a.a(c0452j, c0453k, this) == aVar) {
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
