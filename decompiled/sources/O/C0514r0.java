package O;

/* renamed from: O.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0514r0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f7162k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f7163l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0520u0 f7164m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U f7165n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0514r0(C0520u0 c0520u0, U u5, S3.c cVar) {
        super(2, cVar);
        this.f7164m = c0520u0;
        this.f7165n = u5;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C0514r0 c0514r0 = new C0514r0(this.f7164m, this.f7165n, cVar);
        c0514r0.f7163l = obj;
        return c0514r0;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0514r0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f7162k;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
            return O3.C.a;
        }
        P3.r.Y(obj);
        H5.A a = (H5.A) this.f7163l;
        this.f7162k = 1;
        this.f7164m.invoke(a, this.f7165n, this);
        return aVar;
    }
}
