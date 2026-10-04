package r1;

/* renamed from: r1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1866e {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14820b;

    public C1866e(long j7, long j8) {
        if (j8 == 0) {
            this.a = 0L;
            this.f14820b = 1L;
        } else {
            this.a = j7;
            this.f14820b = j8;
        }
    }

    public final String toString() {
        return this.a + "/" + this.f14820b;
    }
}
