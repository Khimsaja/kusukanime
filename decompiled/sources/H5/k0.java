package H5;

/* loaded from: classes.dex */
public final class k0 extends i0 {

    /* renamed from: o, reason: collision with root package name */
    public final n0 f3857o;

    /* renamed from: p, reason: collision with root package name */
    public final l0 f3858p;

    /* renamed from: q, reason: collision with root package name */
    public final C0274o f3859q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f3860r;

    public k0(n0 n0Var, l0 l0Var, C0274o c0274o, Object obj) {
        this.f3857o = n0Var;
        this.f3858p = l0Var;
        this.f3859q = c0274o;
        this.f3860r = obj;
    }

    @Override // H5.i0
    public final boolean j() {
        return false;
    }

    @Override // H5.i0
    public final void k(Throwable th) {
        C0274o c0274o = this.f3859q;
        n0 n0Var = this.f3857o;
        n0Var.getClass();
        C0274o c0274oK = n0.K(c0274o);
        l0 l0Var = this.f3858p;
        Object obj = this.f3860r;
        if (c0274oK == null || !n0Var.Y(l0Var, c0274oK, obj)) {
            l0Var.f3865k.a(new M5.h(2), 2);
            C0274o c0274oK2 = n0.K(c0274o);
            if (c0274oK2 == null || !n0Var.Y(l0Var, c0274oK2, obj)) {
                n0Var.d(n0Var.u(l0Var, obj));
            }
        }
    }
}
