package H;

import s0.C1955C;

/* renamed from: H.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0207y extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f3030k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f3031l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e4.k f3032m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0207y(e4.k kVar, S3.c cVar) {
        super(2, cVar);
        this.f3032m = kVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C0207y c0207y = new C0207y(this.f3032m, cVar);
        c0207y.f3031l = obj;
        return c0207y;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0207y) create((C1955C) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f3030k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C1955C c1955c = (C1955C) this.f3031l;
            C0206x c0206x = new C0206x(this.f3032m, null);
            this.f3030k = 1;
            if (c1955c.G0(c0206x, this) == aVar) {
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
