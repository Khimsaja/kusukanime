package q3;

import H5.A;
import O.Z;
import O3.C;
import P3.r;
import U3.j;
import e4.n;

/* renamed from: q3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1851b extends j implements n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1855f f14726k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f14727l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1851b(C1855f c1855f, Z z7, S3.c cVar) {
        super(2, cVar);
        this.f14726k = c1855f;
        this.f14727l = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1851b(this.f14726k, this.f14727l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C1851b c1851b = (C1851b) create((A) obj, (S3.c) obj2);
        C c2 = C.a;
        c1851b.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        r.Y(obj);
        if (((Boolean) this.f14727l.getValue()) != null) {
            this.f14726k.e();
        }
        return C.a;
    }
}
