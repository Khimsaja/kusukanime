package D;

/* renamed from: D.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073q0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f1275k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F.q f1276l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0073q0(F.q qVar, S3.c cVar) {
        super(2, cVar);
        this.f1276l = qVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C0073q0(this.f1276l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0073q0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f1275k;
        O3.C c2 = O3.C.a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
            return c2;
        }
        P3.r.Y(obj);
        this.f1275k = 1;
        F.q qVar = this.f1276l;
        qVar.getClass();
        Object objJ = H5.D.j(new F.p(qVar, null), this);
        if (objJ != aVar) {
            objJ = c2;
        }
        return objJ == aVar ? aVar : c2;
    }
}
