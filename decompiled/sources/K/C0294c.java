package K;

import y0.AbstractC2359f;

/* renamed from: K.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294c extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f4371k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f4372l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0295d f4373m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u.m f4374n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0294c(p pVar, C0295d c0295d, u.m mVar, S3.c cVar) {
        super(2, cVar);
        this.f4372l = pVar;
        this.f4373m = c0295d;
        this.f4374n = mVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C0294c(this.f4372l, this.f4373m, this.f4374n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0294c) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f4371k;
        u.m mVar = this.f4374n;
        C0295d c0295d = this.f4373m;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                p pVar = this.f4372l;
                this.f4371k = 1;
                if (pVar.a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P3.r.Y(obj);
            }
            c0295d.f4375H.g(mVar);
            AbstractC2359f.n(c0295d);
            return O3.C.a;
        } catch (Throwable th) {
            c0295d.f4375H.g(mVar);
            AbstractC2359f.n(c0295d);
            throw th;
        }
    }
}
