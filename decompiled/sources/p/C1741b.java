package p;

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1741b extends U3.j implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1743c f13950k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f13951l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1741b(C1743c c1743c, Object obj, S3.c cVar) {
        super(1, cVar);
        this.f13950k = c1743c;
        this.f13951l = obj;
    }

    @Override // U3.a
    public final S3.c create(S3.c cVar) {
        return new C1741b(this.f13950k, this.f13951l, cVar);
    }

    @Override // e4.k
    public final Object invoke(Object obj) throws Throwable {
        C1741b c1741b = (C1741b) create((S3.c) obj);
        O3.C c2 = O3.C.a;
        c1741b.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        C1743c c1743c = this.f13950k;
        C1743c.b(c1743c);
        Object objA = C1743c.a(c1743c, this.f13951l);
        c1743c.f13958c.f14048l.setValue(objA);
        c1743c.f13960e.setValue(objA);
        return O3.C.a;
    }
}
