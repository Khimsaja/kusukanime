package s;

import p.C1724K;

/* loaded from: classes.dex */
public final class T extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15210k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15211l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f15212m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W f15213n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(N n7, W w7, S3.c cVar) {
        super(2, cVar);
        this.f15212m = n7;
        this.f15213n = w7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        T t7 = new T(this.f15212m, this.f15213n, cVar);
        t7.f15211l = obj;
        return t7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((T) create((M.r) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15210k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C1724K c1724k = new C1724K(11, (M.r) this.f15211l, this.f15213n);
            this.f15210k = 1;
            if (this.f15212m.invoke(c1724k, this) == aVar) {
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
