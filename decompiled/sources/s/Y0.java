package s;

import s0.C1953A;
import s0.EnumC1964i;

/* loaded from: classes.dex */
public final class Y0 extends U3.i implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15237k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15238l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H5.A f15239m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e4.k f15240n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e4.k f15241o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f15242p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1909d0 f15243q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(H5.A a, e4.k kVar, e4.k kVar2, kotlin.jvm.internal.x xVar, C1909d0 c1909d0, S3.c cVar) {
        super(2, cVar);
        this.f15239m = a;
        this.f15240n = kVar;
        this.f15241o = kVar2;
        this.f15242p = xVar;
        this.f15243q = c1909d0;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        Y0 y02 = new Y0(this.f15239m, this.f15240n, this.f15241o, this.f15242p, this.f15243q, cVar);
        y02.f15238l = obj;
        return y02;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((Y0) create((C1953A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15237k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C1953A c1953a = (C1953A) this.f15238l;
            this.f15237k = 1;
            obj = c1.e(c1953a, EnumC1964i.f15462l, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        s0.r rVar = (s0.r) obj;
        O3.C c2 = O3.C.a;
        C1909d0 c1909d0 = this.f15243q;
        H5.A a = this.f15239m;
        if (rVar == null) {
            H5.D.x(a, null, new X0(c1909d0, null), 3);
            this.f15241o.invoke(new g0.c(((s0.r) this.f15242p.f12720k).f15470c));
            return c2;
        }
        rVar.a();
        H5.D.x(a, null, new W0(c1909d0, null), 3);
        this.f15240n.invoke(new g0.c(rVar.f15470c));
        return c2;
    }
}
