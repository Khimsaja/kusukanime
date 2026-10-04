package O;

/* loaded from: classes.dex */
public final class Q implements w0 {

    /* renamed from: k, reason: collision with root package name */
    public final e4.n f7039k;

    /* renamed from: l, reason: collision with root package name */
    public final M5.c f7040l;

    /* renamed from: m, reason: collision with root package name */
    public H5.u0 f7041m;

    public Q(S3.h hVar, e4.n nVar) {
        this.f7039k = nVar;
        this.f7040l = H5.D.c(hVar);
    }

    @Override // O.w0
    public final void a() {
        H5.u0 u0Var = this.f7041m;
        if (u0Var != null) {
            H5.D.i(u0Var, "Old job was still running!", null);
        }
        this.f7041m = H5.D.x(this.f7040l, null, this.f7039k, 3);
    }

    @Override // O.w0
    public final void b() {
        H5.u0 u0Var = this.f7041m;
        if (u0Var != null) {
            u0Var.n(new L5.o());
        }
        this.f7041m = null;
    }

    @Override // O.w0
    public final void e() {
        H5.u0 u0Var = this.f7041m;
        if (u0Var != null) {
            u0Var.n(new L5.o());
        }
        this.f7041m = null;
    }
}
