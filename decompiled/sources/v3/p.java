package v3;

import H5.A;
import H5.D;
import O3.C;
import androidx.lifecycle.J;

/* loaded from: classes.dex */
public final class p extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z f16582k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(z zVar, S3.c cVar) {
        super(2, cVar);
        this.f16582k = zVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new p(this.f16582k, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        p pVar = (p) create((A) obj, (S3.c) obj2);
        C c2 = C.a;
        pVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        z zVar = this.f16582k;
        D.x(J.h(zVar), null, new y(zVar, null), 3);
        return C.a;
    }
}
