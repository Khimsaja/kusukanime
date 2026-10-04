package p;

import O.C0493g0;

/* renamed from: p.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1740a0 extends U3.j implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public int f13946k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1746d0 f13947l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f13948m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u0 f13949n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1740a0(S3.c cVar, Object obj, C1746d0 c1746d0, u0 u0Var) {
        super(1, cVar);
        this.f13947l = c1746d0;
        this.f13948m = obj;
        this.f13949n = u0Var;
    }

    @Override // U3.a
    public final S3.c create(S3.c cVar) {
        return new C1740a0(cVar, this.f13948m, this.f13947l, this.f13949n);
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        return ((C1740a0) create((S3.c) obj)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f13946k;
        u0 u0Var = this.f13949n;
        if (i7 == 0) {
            P3.r.Y(obj);
            C1746d0 c1746d0 = this.f13947l;
            c1746d0.R0();
            c1746d0.f13992v = Long.MIN_VALUE;
            c1746d0.U0(0.0f);
            Object value = c1746d0.f13983m.getValue();
            Object obj2 = this.f13948m;
            boolean zEquals = obj2.equals(value);
            C0493g0 c0493g0 = c1746d0.f13982l;
            float f5 = zEquals ? -4.0f : obj2.equals(c0493g0.getValue()) ? -5.0f : -3.0f;
            u0Var.q(obj2);
            u0Var.o(0L);
            c0493g0.setValue(obj2);
            c1746d0.U0(0.0f);
            c1746d0.H0(obj2);
            u0Var.j(f5);
            if (f5 == -3.0f) {
                this.f13946k = 1;
                if (C1746d0.P0(c1746d0, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        u0Var.i();
        return O3.C.a;
    }
}
