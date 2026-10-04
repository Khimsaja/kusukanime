package H;

import p.C1743c;
import p.C1752g0;

/* loaded from: classes.dex */
public final class E extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f2879k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1743c f2880l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f2881m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(C1743c c1743c, long j7, S3.c cVar) {
        super(2, cVar);
        this.f2880l = c1743c;
        this.f2881m = j7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new E(this.f2880l, this.f2881m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f2879k;
        if (i7 == 0) {
            P3.r.Y(obj);
            g0.c cVar = new g0.c(this.f2881m);
            C1752g0 c1752g0 = H.f2891d;
            this.f2879k = 1;
            if (C1743c.c(this.f2880l, cVar, c1752g0, this, 12) == aVar) {
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
