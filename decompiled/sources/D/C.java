package D;

import f0.EnumC0865r;

/* loaded from: classes.dex */
public final class C extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0053g0 f989l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f990m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N0.x f991n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ N0.w f992o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N0.l f993p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ N0.q f994q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ H.S f995r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ H5.A f996s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ A.c f997t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(C0053g0 c0053g0, boolean z7, N0.x xVar, N0.w wVar, N0.l lVar, N0.q qVar, H.S s7, H5.A a, A.c cVar) {
        super(1);
        this.f989l = c0053g0;
        this.f990m = z7;
        this.f991n = xVar;
        this.f992o = wVar;
        this.f993p = lVar;
        this.f994q = qVar;
        this.f995r = s7;
        this.f996s = a;
        this.f997t = cVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        N0 n0D;
        EnumC0865r enumC0865r = (EnumC0865r) obj;
        C0053g0 c0053g0 = this.f989l;
        if (c0053g0.b() != enumC0865r.a()) {
            c0053g0.f1147f.setValue(Boolean.valueOf(enumC0865r.a()));
            boolean zB = c0053g0.b();
            N0.q qVar = this.f994q;
            N0.w wVar = this.f992o;
            if (zB && this.f990m) {
                AbstractC0047d0.j(this.f991n, c0053g0, wVar, this.f993p, qVar);
            } else {
                AbstractC0047d0.g(c0053g0);
            }
            if (enumC0865r.a() && (n0D = c0053g0.d()) != null) {
                H5.D.x(this.f996s, null, new B(this.f997t, wVar, c0053g0, n0D, qVar, null), 3);
            }
            if (!enumC0865r.a()) {
                this.f995r.e(null);
            }
        }
        return O3.C.a;
    }
}
