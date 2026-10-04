package q3;

import H5.A;
import O3.C;
import P3.r;
import U3.j;
import e4.n;

/* renamed from: q3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1850a extends j implements n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1855f f14725k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1850a(C1855f c1855f, S3.c cVar) {
        super(2, cVar);
        this.f14725k = c1855f;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1850a(this.f14725k, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C1850a c1850a = (C1850a) create((A) obj, (S3.c) obj2);
        C c2 = C.a;
        c1850a.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        r.Y(obj);
        this.f14725k.e();
        return C.a;
    }
}
