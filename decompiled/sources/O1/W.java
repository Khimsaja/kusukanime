package O1;

import B1.AbstractC0015b;

/* loaded from: classes.dex */
public final class W implements q2.h {

    /* renamed from: k, reason: collision with root package name */
    public long f7366k;

    /* renamed from: l, reason: collision with root package name */
    public long f7367l;

    /* renamed from: m, reason: collision with root package name */
    public Object f7368m;

    /* renamed from: n, reason: collision with root package name */
    public Object f7369n;

    public W(long j7, int i7) {
        AbstractC0015b.h(((R1.a) this.f7368m) == null);
        this.f7366k = j7;
        this.f7367l = j7 + i7;
    }

    public static final long a(W w7, long j7, long j8) {
        w7.getClass();
        if (j8 == 0) {
            return j7;
        }
        long j9 = 4;
        return (j7 / j9) + ((j8 / j9) * 3);
    }

    @Override // q2.h
    public long f(V1.k kVar) {
        long j7 = this.f7367l;
        if (j7 < 0) {
            return -1L;
        }
        long j8 = -(j7 + 2);
        this.f7367l = -1L;
        return j8;
    }

    @Override // q2.h
    public V1.A g() {
        AbstractC0015b.h(this.f7366k != -1);
        return new V1.s(0, this.f7366k, (V1.t) this.f7368m);
    }

    @Override // q2.h
    public void j(long j7) {
        long[] jArr = (long[]) ((L2.e) this.f7369n).f6045l;
        this.f7367l = jArr[B1.K.d(jArr, j7, true)];
    }

    public W(String str, byte[] bArr, long j7, long j8) {
        this.f7368m = str;
        this.f7369n = bArr;
        this.f7366k = j7;
        this.f7367l = j8;
    }
}
