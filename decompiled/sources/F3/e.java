package F3;

import F.w;
import H5.A;
import O3.C;
import P3.r;
import U3.j;
import e4.n;

/* loaded from: classes.dex */
public final class e extends j implements n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w f2496k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f2497l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f2498m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(w wVar, String str, String str2, S3.c cVar) {
        super(2, cVar);
        this.f2496k = wVar;
        this.f2497l = str;
        this.f2498m = str2;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new e(this.f2496k, this.f2497l, this.f2498m, cVar);
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
        r.Y(obj);
        E3.a aVar2 = (E3.a) this.f2496k.f2037l;
        ((E3.b) aVar2).l(this.f2497l, this.f2498m);
        return C.a;
    }
}
