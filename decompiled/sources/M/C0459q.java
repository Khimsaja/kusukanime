package M;

/* renamed from: M.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0459q extends U3.j implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public int f6329k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ L2.e f6330l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s.T f6331m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0459q(L2.e eVar, s.T t7, S3.c cVar) {
        super(3, cVar);
        this.f6330l = eVar;
        this.f6331m = t7;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s.T t7 = this.f6331m;
        return new C0459q(this.f6330l, t7, (S3.c) obj3).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f6329k;
        if (i7 == 0) {
            P3.r.Y(obj);
            r rVar = (r) this.f6330l.f6045l;
            this.f6329k = 1;
            if (this.f6331m.invoke(rVar, this) == aVar) {
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
