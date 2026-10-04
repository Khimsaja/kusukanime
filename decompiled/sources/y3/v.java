package y3;

import H5.D;
import O.Z;
import z5.C2508m;

/* loaded from: classes.dex */
public final class v extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f18359k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f18360l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Z z7, S3.c cVar) {
        super(2, cVar);
        this.f18360l = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new v(this.f18360l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f18359k;
        if (i7 == 0) {
            P3.r.Y(obj);
            this.f18359k = 1;
            if (D.k(3500L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        C2508m c2508m = C.a;
        this.f18360l.setValue(Boolean.FALSE);
        return O3.C.a;
    }
}
