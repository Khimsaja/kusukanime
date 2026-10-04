package J5;

import H5.A;
import O3.C;

/* loaded from: classes.dex */
public final class o extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f4341k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4342l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f4343m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f4344n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(v vVar, Object obj, S3.c cVar) {
        super(2, cVar);
        this.f4343m = vVar;
        this.f4344n = obj;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        o oVar = new o(this.f4343m, this.f4344n, cVar);
        oVar.f4342l = obj;
        return oVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objR;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f4341k;
        Object kVar = C.a;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                v vVar = this.f4343m;
                Object obj2 = this.f4344n;
                this.f4341k = 1;
                if (vVar.send(obj2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P3.r.Y(obj);
            }
            objR = kVar;
        } catch (Throwable th) {
            objR = P3.r.r(th);
        }
        if (objR instanceof O3.n) {
            kVar = new k(O3.o.a(objR));
        }
        return new m(kVar);
    }
}
