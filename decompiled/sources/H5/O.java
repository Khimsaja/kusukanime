package H5;

/* loaded from: classes.dex */
public final class O extends i0 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f3815o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f3816p;

    public /* synthetic */ O(int i7, Object obj) {
        this.f3815o = i7;
        this.f3816p = obj;
    }

    @Override // H5.i0
    public final boolean j() {
        switch (this.f3815o) {
        }
        return false;
    }

    @Override // H5.i0
    public final void k(Throwable th) {
        switch (this.f3815o) {
            case 0:
                ((N) this.f3816p).dispose();
                break;
            case 1:
                ((e4.k) this.f3816p).invoke(th);
                break;
            default:
                Object obj = n0.f3873k.get(i());
                boolean z7 = obj instanceof C0278t;
                j0 j0Var = (j0) this.f3816p;
                if (!z7) {
                    j0Var.resumeWith(D.E(obj));
                    break;
                } else {
                    j0Var.resumeWith(P3.r.r(((C0278t) obj).a));
                    break;
                }
        }
    }
}
