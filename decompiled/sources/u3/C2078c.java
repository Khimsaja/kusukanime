package u3;

import H5.A;
import H5.D;
import O3.C;
import P3.r;
import U3.j;
import androidx.lifecycle.J;
import e4.n;

/* renamed from: u3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2078c extends j implements n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C2084i f16260k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2078c(C2084i c2084i, S3.c cVar) {
        super(2, cVar);
        this.f16260k = c2084i;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C2078c(this.f16260k, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C2078c c2078c = (C2078c) create((A) obj, (S3.c) obj2);
        C c2 = C.a;
        c2078c.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        r.Y(obj);
        C2084i c2084i = this.f16260k;
        c2084i.getClass();
        D.x(J.h(c2084i), null, new C2083h(c2084i, null), 3);
        return C.a;
    }
}
