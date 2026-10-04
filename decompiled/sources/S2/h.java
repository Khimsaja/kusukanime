package S2;

import H5.A;
import O3.C;
import P3.r;
import d3.C0797i;
import e4.n;

/* loaded from: classes.dex */
public final class h extends U3.j implements n {

    /* renamed from: k, reason: collision with root package name */
    public int f8735k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f8736l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0797i f8737m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, S3.c cVar, C0797i c0797i) {
        super(2, cVar);
        this.f8736l = mVar;
        this.f8737m = c0797i;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new h(this.f8736l, cVar, this.f8737m);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f8735k;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
            return obj;
        }
        r.Y(obj);
        this.f8735k = 1;
        Object objA = m.a(this.f8736l, this.f8737m, 1, this);
        return objA == aVar ? aVar : objA;
    }
}
