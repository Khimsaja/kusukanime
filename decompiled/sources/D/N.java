package D;

import s0.C1955C;

/* loaded from: classes.dex */
public final class N extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f1077k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1955C f1078l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0071p0 f1079m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(C1955C c1955c, InterfaceC0071p0 interfaceC0071p0, S3.c cVar) {
        super(2, cVar);
        this.f1078l = c1955c;
        this.f1079m = interfaceC0071p0;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new N(this.f1078l, this.f1079m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f1077k;
        O3.C c2 = O3.C.a;
        if (i7 == 0) {
            P3.r.Y(obj);
            this.f1077k = 1;
            Object objJ = H5.D.j(new C0059j0(this.f1078l, this.f1079m, null), this);
            if (objJ != aVar) {
                objJ = c2;
            }
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        return c2;
    }
}
