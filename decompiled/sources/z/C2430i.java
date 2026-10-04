package z;

import s0.C1955C;

/* renamed from: z.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2430i extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f18472k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f18473l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2425d f18474m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2430i(C2425d c2425d, S3.c cVar) {
        super(2, cVar);
        this.f18474m = c2425d;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C2430i c2430i = new C2430i(this.f18474m, cVar);
        c2430i.f18473l = obj;
        return c2430i;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2430i) create((C1955C) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f18472k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C2429h c2429h = new C2429h((C1955C) this.f18473l, this.f18474m, null);
            this.f18472k = 1;
            if (H5.D.j(c2429h, this) == aVar) {
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
