package H5;

/* loaded from: classes.dex */
public final class Q extends T {

    /* renamed from: m, reason: collision with root package name */
    public final C0270k f3818m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V f3819n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(V v5, long j7, C0270k c0270k) {
        super(j7);
        this.f3819n = v5;
        this.f3818m = c0270k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3818m.A(this.f3819n);
    }

    @Override // H5.T
    public final String toString() {
        return super.toString() + this.f3818m;
    }
}
