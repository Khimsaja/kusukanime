package L5;

import H5.A;
import K5.InterfaceC0330i;
import O3.C;

/* loaded from: classes.dex */
public final class k extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f6176k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f6177l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0330i f6178m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f6179n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, InterfaceC0330i interfaceC0330i, Object obj, S3.c cVar) {
        super(2, cVar);
        this.f6177l = nVar;
        this.f6178m = interfaceC0330i;
        this.f6179n = obj;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new k(this.f6177l, this.f6178m, this.f6179n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [U3.j, e4.o] */
    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f6176k;
        if (i7 == 0) {
            P3.r.Y(obj);
            ?? r42 = this.f6177l.f6189o;
            this.f6176k = 1;
            if (r42.invoke(this.f6178m, this.f6179n, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        return C.a;
    }
}
