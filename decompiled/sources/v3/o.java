package v3;

import H5.A;
import O3.C;

/* loaded from: classes.dex */
public final class o extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z f16581k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z zVar, S3.c cVar) {
        super(2, cVar);
        this.f16581k = zVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new o(this.f16581k, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        o oVar = (o) create((A) obj, (S3.c) obj2);
        C c2 = C.a;
        oVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        this.f16581k.g();
        return C.a;
    }
}
