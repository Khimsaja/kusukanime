package A;

import H5.A;
import O3.C;
import P3.r;
import e4.n;
import y0.AbstractC2359f;
import y0.Y;

/* loaded from: classes.dex */
public final class h extends U3.j implements n {

    /* renamed from: k, reason: collision with root package name */
    public int f19k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f20l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f21m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, j jVar, S3.c cVar) {
        super(2, cVar);
        this.f20l = kVar;
        this.f21m = jVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new h(this.f20l, this.f21m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a lVar;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f19k;
        if (i7 == 0) {
            r.Y(obj);
            k kVar = this.f20l;
            if (kVar.f10414w) {
                if (kVar.f10402k.f10414w) {
                    lVar = (a) AbstractC2359f.j(kVar, k.f31z);
                    if (lVar == null) {
                        lVar = new l(kVar);
                    }
                } else {
                    lVar = null;
                }
                if (lVar != null) {
                    Y yU = AbstractC2359f.u(kVar);
                    this.f19k = 1;
                    if (lVar.C(yU, this.f21m, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
        }
        return C.a;
    }
}
