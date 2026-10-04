package w;

import O3.C;
import s.InterfaceC1911e0;
import y0.C2349D;

/* loaded from: classes.dex */
public final class r extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u f16784k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f16785l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, int i7, S3.c cVar) {
        super(2, cVar);
        this.f16784k = uVar;
        this.f16785l = i7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new r(this.f16784k, this.f16785l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        r rVar = (r) create((InterfaceC1911e0) obj, (S3.c) obj2);
        C c2 = C.a;
        rVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        u uVar = this.f16784k;
        n nVar = uVar.f16793d;
        int iF = nVar.f16771b.f();
        int i7 = this.f16785l;
        if (iF != i7 || nVar.f16772c.f() != 0) {
            uVar.f16802m.d();
        }
        nVar.a(i7, 0);
        nVar.f16774e = null;
        C2349D c2349d = uVar.f16799j;
        if (c2349d != null) {
            c2349d.k();
        }
        return C.a;
    }
}
