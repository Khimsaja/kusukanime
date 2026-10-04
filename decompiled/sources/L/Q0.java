package L;

import p.C1743c;

/* loaded from: classes.dex */
public final class Q0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f5306k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1743c f5307l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(C1743c c1743c, S3.c cVar) {
        super(2, cVar);
        this.f5307l = c1743c;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new Q0(this.f5307l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((Q0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f5306k;
        if (i7 == 0) {
            P3.r.Y(obj);
            Float f5 = new Float(0.0f);
            this.f5306k = 1;
            if (C1743c.c(this.f5307l, f5, null, this, 14) == aVar) {
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
