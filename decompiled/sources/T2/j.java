package T2;

import H5.A;
import K5.AbstractC0342v;
import K5.C0332k;
import K5.C0341u;
import O.C0486d;
import O3.C;

/* loaded from: classes.dex */
public final class j extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f9003k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f9004l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, S3.c cVar) {
        super(2, cVar);
        this.f9004l = oVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new j(this.f9004l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f9003k;
        if (i7 == 0) {
            P3.r.Y(obj);
            o oVar = this.f9004l;
            C0332k c0332kS = C0486d.S(new B.e(18, oVar));
            h hVar = new h(oVar, null);
            int i8 = AbstractC0342v.a;
            L5.n nVar = new L5.n(new C0341u(hVar, null), c0332kS, S3.i.f8767k, -2, J5.c.f4299k);
            i iVar = new i(oVar);
            this.f9003k = 1;
            if (nVar.collect(iVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        return C.a;
    }
}
