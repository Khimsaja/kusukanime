package p;

/* renamed from: p.Y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1737Y extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f13926k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f13927l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f13928m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f13929n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1746d0 f13930o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ u0 f13931p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f13932q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1737Y(Object obj, Object obj2, C1746d0 c1746d0, u0 u0Var, float f5, S3.c cVar) {
        super(2, cVar);
        this.f13928m = obj;
        this.f13929n = obj2;
        this.f13930o = c1746d0;
        this.f13931p = u0Var;
        this.f13932q = f5;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C1737Y c1737y = new C1737Y(this.f13928m, this.f13929n, this.f13930o, this.f13931p, this.f13932q, cVar);
        c1737y.f13927l = obj;
        return c1737y;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1737Y) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f13926k;
        O3.C c2 = O3.C.a;
        C1746d0 c1746d0 = this.f13930o;
        if (i7 == 0) {
            P3.r.Y(obj);
            H5.A a = (H5.A) this.f13927l;
            Object obj2 = this.f13928m;
            Object obj3 = this.f13929n;
            if (kotlin.jvm.internal.l.a(obj2, obj3)) {
                c1746d0.f13994x = null;
                if (kotlin.jvm.internal.l.a(c1746d0.f13983m.getValue(), obj2)) {
                    return c2;
                }
            } else {
                C1746d0.L0(c1746d0);
            }
            boolean zA = kotlin.jvm.internal.l.a(obj2, obj3);
            float f5 = this.f13932q;
            if (!zA) {
                u0 u0Var = this.f13931p;
                u0Var.q(obj2);
                u0Var.o(0L);
                c1746d0.f13982l.setValue(obj2);
                u0Var.j(f5);
            }
            c1746d0.U0(f5);
            if (c1746d0.f13993w.f12934b != 0) {
                H5.D.x(a, null, new C1736X(c1746d0, null), 3);
            } else {
                c1746d0.f13992v = Long.MIN_VALUE;
            }
            this.f13926k = 1;
            if (C1746d0.P0(c1746d0, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        c1746d0.T0();
        return c2;
    }
}
