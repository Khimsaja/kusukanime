package z0;

/* loaded from: classes.dex */
public final class m1 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f18807k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o1 f18808l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(o1 o1Var, S3.c cVar) {
        super(2, cVar);
        this.f18808l = o1Var;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new m1(this.f18808l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((m1) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f18807k;
        O3.C c2 = O3.C.a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
            return c2;
        }
        P3.r.Y(obj);
        C2471u c2471u = this.f18808l.f18818k;
        this.f18807k = 1;
        Object objA = c2471u.f18909x.a(this);
        if (objA != aVar) {
            objA = c2;
        }
        return objA == aVar ? aVar : c2;
    }
}
