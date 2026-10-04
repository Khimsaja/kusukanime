package s;

import p.C1724K;
import s0.C1955C;
import t0.C2033c;

/* loaded from: classes.dex */
public final class J extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15147k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15148l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P f15149m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(P p7, S3.c cVar) {
        super(2, cVar);
        this.f15149m = p7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        J j7 = new J(this.f15149m, cVar);
        j7.f15148l = obj;
        return j7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((C1955C) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15147k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C1955C c1955c = (C1955C) this.f15148l;
            C2033c c2033c = new C2033c();
            P p7 = this.f15149m;
            C1900H c1900h = new C1900H(p7, c1955c, new D.F0(5, p7, c2033c), new C1724K(10, c2033c, p7), new C1901I(p7, 0), new C1901I(p7, 1), new H.M(16, c2033c, p7), null);
            this.f15147k = 1;
            if (H5.D.j(c1900h, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        return O3.C.a;
    }
}
