package M;

/* renamed from: M.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0457o extends U3.j implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public int f6325k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0460s f6326l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6327m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0446d f6328n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0457o(C0460s c0460s, Object obj, C0446d c0446d, S3.c cVar) {
        super(1, cVar);
        this.f6326l = c0460s;
        this.f6327m = obj;
        this.f6328n = c0446d;
    }

    @Override // U3.a
    public final S3.c create(S3.c cVar) {
        return new C0457o(this.f6326l, this.f6327m, this.f6328n, cVar);
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        return ((C0457o) create((S3.c) obj)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f6325k;
        if (i7 == 0) {
            P3.r.Y(obj);
            Object obj2 = this.f6327m;
            C0460s c0460s = this.f6326l;
            c0460s.h(obj2);
            C0452j c0452j = new C0452j(c0460s, 1);
            C0456n c0456n = new C0456n(this.f6328n, c0460s, null);
            this.f6325k = 1;
            if (androidx.compose.material3.internal.a.a(c0452j, c0456n, this) == aVar) {
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
