package H5;

/* loaded from: classes.dex */
public final class z0 extends M5.p implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final long f3894o;

    public z0(long j7, A0 a02) {
        super(a02, a02.getContext());
        this.f3894o = j7;
    }

    @Override // H5.n0
    public final String I() {
        return super.I() + "(timeMillis=" + this.f3894o + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        D.o(this.f3833m);
        l(new y0(A6.b.f(this.f3894o, " ms", new StringBuilder("Timed out waiting for ")), this));
    }
}
