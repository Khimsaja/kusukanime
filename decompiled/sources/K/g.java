package K;

import H.F;
import K5.InterfaceC0329h;

/* loaded from: classes.dex */
public final class g extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f4378k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4379l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u.j f4380m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0292a f4381n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(u.j jVar, C0292a c0292a, S3.c cVar) {
        super(2, cVar);
        this.f4380m = jVar;
        this.f4381n = c0292a;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        g gVar = new g(this.f4380m, this.f4381n, cVar);
        gVar.f4379l = obj;
        return gVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f4378k;
        if (i7 == 0) {
            P3.r.Y(obj);
            H5.A a = (H5.A) this.f4379l;
            InterfaceC0329h interfaceC0329hA = this.f4380m.a();
            F f5 = new F(2, this.f4381n, a);
            this.f4378k = 1;
            if (interfaceC0329hA.collect(f5, this) == aVar) {
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
