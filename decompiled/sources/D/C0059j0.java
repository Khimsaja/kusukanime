package D;

import s0.C1955C;

/* renamed from: D.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059j0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f1204k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1955C f1205l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0071p0 f1206m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0059j0(C1955C c1955c, InterfaceC0071p0 interfaceC0071p0, S3.c cVar) {
        super(2, cVar);
        this.f1205l = c1955c;
        this.f1206m = interfaceC0071p0;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C0059j0 c0059j0 = new C0059j0(this.f1205l, this.f1206m, cVar);
        c0059j0.f1204k = obj;
        return c0059j0;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0059j0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        H5.A a = (H5.A) this.f1204k;
        H5.B b4 = H5.B.f3790k;
        C1955C c1955c = this.f1205l;
        InterfaceC0071p0 interfaceC0071p0 = this.f1206m;
        H5.D.x(a, null, new C0055h0(c1955c, interfaceC0071p0, null), 1);
        return H5.D.x(a, null, new C0057i0(c1955c, interfaceC0071p0, null), 1);
    }
}
