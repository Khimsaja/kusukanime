package D;

import f6.AbstractC0915m;
import s0.C1955C;

/* renamed from: D.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055h0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f1179k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1955C f1180l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0071p0 f1181m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0055h0(C1955C c1955c, InterfaceC0071p0 interfaceC0071p0, S3.c cVar) {
        super(2, cVar);
        this.f1180l = c1955c;
        this.f1181m = interfaceC0071p0;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C0055h0(this.f1180l, this.f1181m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0055h0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f1179k;
        O3.C c2 = O3.C.a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
            return c2;
        }
        P3.r.Y(obj);
        this.f1179k = 1;
        Object objF = AbstractC0915m.f(this.f1180l, new C0065m0(this.f1181m, null), this);
        if (objF != aVar) {
            objF = c2;
        }
        return objF == aVar ? aVar : c2;
    }
}
