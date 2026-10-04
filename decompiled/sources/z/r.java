package z;

import p.AbstractC1745d;

/* loaded from: classes.dex */
public final class r extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f18507k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2425d f18508l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C2425d c2425d, S3.c cVar) {
        super(2, cVar);
        this.f18508l = c2425d;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new r(this.f18508l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f18507k;
        O3.C c2 = O3.C.a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
            return c2;
        }
        P3.r.Y(obj);
        this.f18507k = 1;
        float f5 = G.a;
        C2425d c2425d = this.f18508l;
        if (c2425d.j() + 1 >= c2425d.l() || (objF = c2425d.f(c2425d.j() + 1, AbstractC1745d.p(7, null), this)) != aVar) {
            objF = c2;
        }
        return objF == aVar ? aVar : c2;
    }
}
