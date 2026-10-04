package p;

/* renamed from: p.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1747e extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f13997k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f13998l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1743c f13999m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ O.Z f14000n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ O.Z f14001o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1747e(Object obj, C1743c c1743c, O.Z z7, O.Z z8, S3.c cVar) {
        super(2, cVar);
        this.f13998l = obj;
        this.f13999m = c1743c;
        this.f14000n = z7;
        this.f14001o = z8;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1747e(this.f13998l, this.f13999m, this.f14000n, this.f14001o, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1747e) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f13997k;
        C1743c c1743c = this.f13999m;
        if (i7 == 0) {
            P3.r.Y(obj);
            Object value = c1743c.f13960e.getValue();
            Object obj2 = this.f13998l;
            if (!kotlin.jvm.internal.l.a(obj2, value)) {
                C1752g0 c1752g0 = AbstractC1751g.a;
                InterfaceC1760l interfaceC1760l = (InterfaceC1760l) this.f14000n.getValue();
                this.f13997k = 1;
                if (C1743c.c(c1743c, obj2, interfaceC1760l, this, 12) == aVar) {
                    return aVar;
                }
            }
            return O3.C.a;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        P3.r.Y(obj);
        C1752g0 c1752g02 = AbstractC1751g.a;
        e4.k kVar = (e4.k) this.f14001o.getValue();
        if (kVar != null) {
            kVar.invoke(c1743c.d());
        }
        return O3.C.a;
    }
}
