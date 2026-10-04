package z0;

import F.C0139b;

/* loaded from: classes.dex */
public final class f1 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f18751k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K5.W f18752l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2480y0 f18753m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(K5.W w7, C2480y0 c2480y0, S3.c cVar) {
        super(2, cVar);
        this.f18752l = w7;
        this.f18753m = c2480y0;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new f1(this.f18752l, this.f18753m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((f1) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
        return T3.a.f9048k;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f18751k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C0139b c0139b = new C0139b(2, this.f18753m);
            this.f18751k = 1;
            if (this.f18752l.collect(c0139b, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        throw new D6.r();
    }
}
