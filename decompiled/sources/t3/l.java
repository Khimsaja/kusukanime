package t3;

import H.F;
import H5.A;
import K5.C0332k;
import O.C0486d;
import O.Z;
import O3.C;
import P3.r;
import x.v;

/* loaded from: classes.dex */
public final class l extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f16007k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f16008l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f16009m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f16010n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(v vVar, p pVar, Z z7, S3.c cVar) {
        super(2, cVar);
        this.f16008l = vVar;
        this.f16009m = pVar;
        this.f16010n = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new l(this.f16008l, this.f16009m, this.f16010n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f16007k;
        if (i7 == 0) {
            r.Y(obj);
            C0332k c0332kS = C0486d.S(new k(this.f16008l, 0));
            F f5 = new F(7, this.f16009m, this.f16010n);
            this.f16007k = 1;
            if (c0332kS.collect(f5, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
        }
        return C.a;
    }
}
