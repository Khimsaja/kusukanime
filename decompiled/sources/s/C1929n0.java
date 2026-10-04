package s;

import p.C1724K;

/* renamed from: s.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1929n0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15351k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15352l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f15353m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ D0 f15354n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1929n0(N n7, D0 d02, S3.c cVar) {
        super(2, cVar);
        this.f15353m = n7;
        this.f15354n = d02;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C1929n0 c1929n0 = new C1929n0(this.f15353m, this.f15354n, cVar);
        c1929n0.f15352l = obj;
        return c1929n0;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1929n0) create((A0) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15351k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C1724K c1724k = new C1724K(12, (A0) this.f15352l, this.f15354n);
            this.f15351k = 1;
            if (this.f15353m.invoke(c1724k, this) == aVar) {
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
