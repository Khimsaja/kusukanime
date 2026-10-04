package q;

import s.C1909d0;

/* renamed from: q.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1838u extends U3.j implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public int f14629k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ C1909d0 f14630l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ long f14631m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1839v f14632n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1838u(C1839v c1839v, S3.c cVar) {
        super(3, cVar);
        this.f14632n = c1839v;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j7 = ((g0.c) obj2).a;
        C1838u c1838u = new C1838u(this.f14632n, (S3.c) obj3);
        c1838u.f14630l = (C1909d0) obj;
        c1838u.f14631m = j7;
        return c1838u.invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objJ;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f14629k;
        O3.C c2 = O3.C.a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
            return c2;
        }
        P3.r.Y(obj);
        C1909d0 c1909d0 = this.f14630l;
        long j7 = this.f14631m;
        C1839v c1839v = this.f14632n;
        if (c1839v.f14637D) {
            this.f14629k = 1;
            u.k kVar = c1839v.f14648z;
            if (kVar == null || (objJ = H5.D.j(new C1822d(c1909d0, j7, kVar, c1839v, null), this)) != aVar) {
                objJ = c2;
            }
            if (objJ == aVar) {
                return aVar;
            }
        }
        return c2;
    }
}
