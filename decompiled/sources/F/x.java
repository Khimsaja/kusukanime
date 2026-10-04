package F;

import z0.D0;

/* loaded from: classes.dex */
public final class x extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f2039k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y f2040l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0143f f2041m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, C0143f c0143f, S3.c cVar) {
        super(2, cVar);
        this.f2040l = yVar;
        this.f2041m = c0143f;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new x(this.f2040l, this.f2041m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((x) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
        return T3.a.f9048k;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f2039k;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
            throw new D6.r();
        }
        P3.r.Y(obj);
        this.f2039k = 1;
        D0.a(this.f2040l, this.f2041m, this);
        return aVar;
    }
}
