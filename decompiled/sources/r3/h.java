package r3;

import H5.A;
import H5.D;
import O3.C;
import P3.r;
import androidx.lifecycle.J;

/* loaded from: classes.dex */
public final class h extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m f14884k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f14885l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f14886m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, String str, String str2, S3.c cVar) {
        super(2, cVar);
        this.f14884k = mVar;
        this.f14885l = str;
        this.f14886m = str2;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new h(this.f14884k, this.f14885l, this.f14886m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        h hVar = (h) create((A) obj, (S3.c) obj2);
        C c2 = C.a;
        hVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        r.Y(obj);
        m mVar = this.f14884k;
        mVar.getClass();
        String str = this.f14885l;
        kotlin.jvm.internal.l.f("animeSlug", str);
        mVar.f14920s = str;
        mVar.f14921t = this.f14886m;
        D.x(J.h(mVar), null, new j(mVar, null), 3);
        return C.a;
    }
}
