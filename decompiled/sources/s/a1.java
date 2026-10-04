package s;

import f6.AbstractC0915m;
import s0.C1955C;

/* loaded from: classes.dex */
public final class a1 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15262k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15263l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1955C f15264m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Q f15265n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e4.k f15266o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e4.k f15267p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(C1955C c1955c, Q q6, e4.k kVar, e4.k kVar2, S3.c cVar) {
        super(2, cVar);
        this.f15264m = c1955c;
        this.f15265n = q6;
        this.f15266o = kVar;
        this.f15267p = kVar2;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        a1 a1Var = new a1(this.f15264m, this.f15265n, this.f15266o, this.f15267p, cVar);
        a1Var.f15263l = obj;
        return a1Var;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((a1) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15262k;
        if (i7 == 0) {
            P3.r.Y(obj);
            H5.A a = (H5.A) this.f15263l;
            C1955C c1955c = this.f15264m;
            C1909d0 c1909d0 = new C1909d0(c1955c);
            Z0 z02 = new Z0(a, this.f15265n, this.f15266o, this.f15267p, c1909d0, null);
            this.f15262k = 1;
            if (AbstractC0915m.f(c1955c, z02, this) == aVar) {
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
