package p;

/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f14035l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f14036m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1753h f14037n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC1766r f14038o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1761m f14039p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f14040q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e4.k f14041r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(kotlin.jvm.internal.x xVar, Object obj, InterfaceC1753h interfaceC1753h, AbstractC1766r abstractC1766r, C1761m c1761m, float f5, e4.k kVar) {
        super(1);
        this.f14035l = xVar;
        this.f14036m = obj;
        this.f14037n = interfaceC1753h;
        this.f14038o = abstractC1766r;
        this.f14039p = c1761m;
        this.f14040q = f5;
        this.f14041r = kVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        InterfaceC1753h interfaceC1753h = this.f14037n;
        B0 b0D = interfaceC1753h.d();
        Object objE = interfaceC1753h.e();
        H.C c2 = new H.C(this.f14039p, 1);
        C1759k c1759k = new C1759k(this.f14036m, b0D, this.f14038o, jLongValue, objE, jLongValue, c2);
        AbstractC1745d.m(c1759k, jLongValue, this.f14040q, this.f14037n, this.f14039p, this.f14041r);
        this.f14035l.f12720k = c1759k;
        return O3.C.a;
    }
}
