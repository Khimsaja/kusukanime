package w3;

import H5.A;
import H5.D;
import O3.C;
import androidx.lifecycle.J;

/* loaded from: classes.dex */
public final class e extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j f16964k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, S3.c cVar) {
        super(2, cVar);
        this.f16964k = jVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new e(this.f16964k, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        e eVar = (e) create((A) obj, (S3.c) obj2);
        C c2 = C.a;
        eVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        j jVar = this.f16964k;
        jVar.getClass();
        D.x(J.h(jVar), null, new g(jVar, null), 3);
        return C.a;
    }
}
