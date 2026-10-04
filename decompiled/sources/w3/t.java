package w3;

import H5.A;
import O.Z;
import O3.C;

/* loaded from: classes.dex */
public final class t extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y f17058k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f17059l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(y yVar, Z z7, S3.c cVar) {
        super(2, cVar);
        this.f17058k = yVar;
        this.f17059l = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new t(this.f17058k, this.f17059l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        t tVar = (t) create((A) obj, (S3.c) obj2);
        C c2 = C.a;
        tVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        if (((Boolean) this.f17059l.getValue()) != null) {
            this.f17058k.e();
        }
        return C.a;
    }
}
