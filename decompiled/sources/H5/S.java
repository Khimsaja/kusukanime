package H5;

/* loaded from: classes.dex */
public final class S extends T {

    /* renamed from: m, reason: collision with root package name */
    public final z0 f3820m;

    public S(long j7, z0 z0Var) {
        super(j7);
        this.f3820m = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3820m.run();
    }

    @Override // H5.T
    public final String toString() {
        return super.toString() + this.f3820m;
    }
}
