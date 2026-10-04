package F3;

import F.w;
import H5.A;
import O3.C;
import P3.r;
import U3.j;
import e4.n;

/* loaded from: classes.dex */
public final class c extends j implements n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w f2493k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f2494l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(w wVar, String str, S3.c cVar) {
        super(2, cVar);
        this.f2493k = wVar;
        this.f2494l = str;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new c(this.f2493k, this.f2494l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        r.Y(obj);
        return ((E3.b) ((E3.a) this.f2493k.f2037l)).c(this.f2494l);
    }
}
