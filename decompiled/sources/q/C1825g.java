package q;

/* renamed from: q.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1825g extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1839v f14556k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1825g(C1839v c1839v, S3.c cVar) {
        super(2, cVar);
        this.f14556k = c1839v;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1825g(this.f14556k, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C1825g c1825g = (C1825g) create((H5.A) obj, (S3.c) obj2);
        O3.C c2 = O3.C.a;
        c1825g.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        C1839v c1839v = this.f14556k;
        if (c1839v.f14642K == null) {
            u.g gVar = new u.g();
            u.k kVar = c1839v.f14648z;
            if (kVar != null) {
                H5.D.x(c1839v.u0(), null, new C1819a(kVar, gVar, null), 3);
            }
            c1839v.f14642K = gVar;
        }
        return O3.C.a;
    }
}
