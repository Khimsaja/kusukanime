package F3;

import F.w;
import H5.A;
import O3.C;
import P3.r;
import U3.j;
import android.content.SharedPreferences;
import e4.n;

/* loaded from: classes.dex */
public final class d extends j implements n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w f2495k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(w wVar, S3.c cVar) {
        super(2, cVar);
        this.f2495k = wVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new d(this.f2495k, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        r.Y(obj);
        return ((SharedPreferences) ((E3.b) ((E3.a) this.f2495k.f2037l)).f1932c).getAll().keySet();
    }
}
