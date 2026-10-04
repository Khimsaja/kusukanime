package v3;

import H.F;
import H5.A;
import K5.C0332k;
import O.C0486d;
import O.Z;
import O3.C;

/* loaded from: classes.dex */
public final class n extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f16577k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x.v f16578l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f16579m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f16580n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(x.v vVar, z zVar, Z z7, S3.c cVar) {
        super(2, cVar);
        this.f16578l = vVar;
        this.f16579m = zVar;
        this.f16580n = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new n(this.f16578l, this.f16579m, this.f16580n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f16577k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C0332k c0332kS = C0486d.S(new t3.k(this.f16578l, 1));
            F f5 = new F(9, this.f16579m, this.f16580n);
            this.f16577k = 1;
            if (c0332kS.collect(f5, this) == aVar) {
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
