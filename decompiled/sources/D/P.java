package D;

import s0.C1955C;

/* loaded from: classes.dex */
public final class P extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f1089k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1955C f1090l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0071p0 f1091m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ H.S f1092n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(C1955C c1955c, InterfaceC0071p0 interfaceC0071p0, H.S s7, S3.c cVar) {
        super(2, cVar);
        this.f1090l = c1955c;
        this.f1091m = interfaceC0071p0;
        this.f1092n = s7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        P p7 = new P(this.f1090l, this.f1091m, this.f1092n, cVar);
        p7.f1089k = obj;
        return p7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        P p7 = (P) create((H5.A) obj, (S3.c) obj2);
        O3.C c2 = O3.C.a;
        p7.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        H5.A a = (H5.A) this.f1089k;
        H5.B b4 = H5.B.f3790k;
        C1955C c1955c = this.f1090l;
        H5.D.x(a, null, new N(c1955c, this.f1091m, null), 1);
        H5.D.x(a, null, new O(c1955c, this.f1092n, null), 1);
        return O3.C.a;
    }
}
