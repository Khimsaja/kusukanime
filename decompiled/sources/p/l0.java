package p;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f14042l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f14043m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1753h f14044n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1761m f14045o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e4.k f14046p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(kotlin.jvm.internal.x xVar, float f5, InterfaceC1753h interfaceC1753h, C1761m c1761m, e4.k kVar) {
        super(1);
        this.f14042l = xVar;
        this.f14043m = f5;
        this.f14044n = interfaceC1753h;
        this.f14045o = c1761m;
        this.f14046p = kVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Object obj2 = this.f14042l.f12720k;
        kotlin.jvm.internal.l.c(obj2);
        AbstractC1745d.m((C1759k) obj2, jLongValue, this.f14043m, this.f14044n, this.f14045o, this.f14046p);
        return O3.C.a;
    }
}
