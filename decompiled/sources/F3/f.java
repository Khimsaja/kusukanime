package F3;

import F.w;
import H5.A;
import O3.C;
import P3.r;
import U3.j;
import e4.n;

/* loaded from: classes.dex */
public final class f extends j implements n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w f2499k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f2500l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(w wVar, String str, S3.c cVar) {
        super(2, cVar);
        this.f2499k = wVar;
        this.f2500l = str;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new f(this.f2499k, this.f2500l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        f fVar = (f) create((A) obj, (S3.c) obj2);
        C c2 = C.a;
        fVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        r.Y(obj);
        ((E3.b) ((E3.a) this.f2499k.f2037l)).m(this.f2500l);
        return C.a;
    }
}
