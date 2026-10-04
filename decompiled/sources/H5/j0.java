package H5;

/* loaded from: classes.dex */
public final class j0 extends C0270k {

    /* renamed from: s, reason: collision with root package name */
    public final n0 f3851s;

    public j0(n0 n0Var, S3.c cVar) {
        super(1, cVar);
        this.f3851s = n0Var;
    }

    @Override // H5.C0270k
    public final Throwable p(n0 n0Var) {
        Throwable thD;
        n0 n0Var2 = this.f3851s;
        n0Var2.getClass();
        Object obj = n0.f3873k.get(n0Var2);
        return (!(obj instanceof l0) || (thD = ((l0) obj).d()) == null) ? obj instanceof C0278t ? ((C0278t) obj).a : n0Var.H() : thD;
    }

    @Override // H5.C0270k
    public final String x() {
        return "AwaitContinuation";
    }
}
