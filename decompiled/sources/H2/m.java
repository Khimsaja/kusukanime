package H2;

import G2.C0174k;
import K5.Y;
import O.Z;
import O3.C;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class m extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Z f3626k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f3627l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y.r f3628m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Z z7, p pVar, Y.r rVar, S3.c cVar) {
        super(2, cVar);
        this.f3626k = z7;
        this.f3627l = pVar;
        this.f3628m = rVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new m(this.f3626k, this.f3627l, this.f3628m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        m mVar = (m) create((H5.A) obj, (S3.c) obj2);
        C c2 = C.a;
        mVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        for (C0174k c0174k : (Set) this.f3626k.getValue()) {
            p pVar = this.f3627l;
            if (!((List) ((Y) pVar.b().f2723e.f4751k).getValue()).contains(c0174k) && !this.f3628m.contains(c0174k)) {
                pVar.b().b(c0174k);
            }
        }
        return C.a;
    }
}
