package H;

import D.C0059j0;
import D.InterfaceC0071p0;
import s0.C1955C;

/* loaded from: classes.dex */
public final class U extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f2934k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2935l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0071p0 f2936m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(InterfaceC0071p0 interfaceC0071p0, S3.c cVar) {
        super(2, cVar);
        this.f2936m = interfaceC0071p0;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        U u5 = new U(this.f2936m, cVar);
        u5.f2935l = obj;
        return u5;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((C1955C) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f2934k;
        O3.C c2 = O3.C.a;
        if (i7 == 0) {
            P3.r.Y(obj);
            C1955C c1955c = (C1955C) this.f2935l;
            this.f2934k = 1;
            Object objJ = H5.D.j(new C0059j0(c1955c, this.f2936m, null), this);
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
