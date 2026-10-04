package p;

import O.C0486d;

/* loaded from: classes.dex */
public final class t0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public float f14129k;

    /* renamed from: l, reason: collision with root package name */
    public int f14130l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f14131m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u0 f14132n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, S3.c cVar) {
        super(2, cVar);
        this.f14132n = u0Var;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        t0 t0Var = new t0(this.f14132n, cVar);
        t0Var.f14131m = obj;
        return t0Var;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((t0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        float fN;
        H5.A a;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f14130l;
        if (i7 == 0) {
            P3.r.Y(obj);
            H5.A a7 = (H5.A) this.f14131m;
            fN = AbstractC1745d.n(a7.getCoroutineContext());
            a = a7;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fN = this.f14129k;
            a = (H5.A) this.f14131m;
            P3.r.Y(obj);
        }
        while (H5.D.u(a)) {
            M.J j7 = new M.J(this.f14132n, fN);
            this.f14131m = a;
            this.f14129k = fN;
            this.f14130l = 1;
            if (C0486d.F(getContext()).P(j7, this) == aVar) {
                return aVar;
            }
        }
        return O3.C.a;
    }
}
