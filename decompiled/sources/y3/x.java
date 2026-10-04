package y3;

import H5.D;
import O.Z;
import z5.C2508m;

/* loaded from: classes.dex */
public final class x extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f18363k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f18364l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Z z7, S3.c cVar) {
        super(2, cVar);
        this.f18364l = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new x(this.f18364l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f18363k;
        Z z7 = this.f18364l;
        if (i7 == 0) {
            P3.r.Y(obj);
            C2508m c2508m = C.a;
            if (((Float) z7.getValue()) != null) {
                this.f18363k = 1;
                if (D.k(700L, this) == aVar) {
                    return aVar;
                }
            }
            return O3.C.a;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        P3.r.Y(obj);
        C2508m c2508m2 = C.a;
        z7.setValue(null);
        return O3.C.a;
    }
}
