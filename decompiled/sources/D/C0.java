package D;

import s.C1909d0;

/* loaded from: classes.dex */
public final class C0 extends U3.j implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public int f998k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ C1909d0 f999l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ long f1000m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ M5.c f1001n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ O.Z f1002o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ u.k f1003p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(M5.c cVar, O.Z z7, u.k kVar, S3.c cVar2) {
        super(3, cVar2);
        this.f1001n = cVar;
        this.f1002o = z7;
        this.f1003p = kVar;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j7 = ((g0.c) obj2).a;
        C0 c02 = new C0(this.f1001n, this.f1002o, this.f1003p, (S3.c) obj3);
        c02.f999l = (C1909d0) obj;
        c02.f1000m = j7;
        return c02.invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f998k;
        M5.c cVar = this.f1001n;
        if (i7 == 0) {
            P3.r.Y(obj);
            C1909d0 c1909d0 = this.f999l;
            H5.D.x(cVar, null, new A0(this.f1002o, this.f1000m, this.f1003p, null), 3);
            this.f998k = 1;
            obj = c1909d0.c(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        H5.D.x(cVar, null, new B0(this.f1002o, ((Boolean) obj).booleanValue(), this.f1003p, null), 3);
        return O3.C.a;
    }
}
