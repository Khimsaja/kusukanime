package L5;

import O3.C;

/* loaded from: classes.dex */
public final class f extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f6166k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6167l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f6168m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, S3.c cVar) {
        super(2, cVar);
        this.f6168m = gVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        f fVar = new f(this.f6168m, cVar);
        fVar.f6167l = obj;
        return fVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((J5.t) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f6166k;
        if (i7 == 0) {
            P3.r.Y(obj);
            J5.t tVar = (J5.t) this.f6167l;
            this.f6166k = 1;
            if (this.f6168m.d(tVar, this) == aVar) {
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
