package K5;

import H5.C0270k;

/* loaded from: classes.dex */
public final class K implements H5.N {

    /* renamed from: k, reason: collision with root package name */
    public final M f4752k;

    /* renamed from: l, reason: collision with root package name */
    public final long f4753l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f4754m;

    /* renamed from: n, reason: collision with root package name */
    public final C0270k f4755n;

    public K(M m7, long j7, Object obj, C0270k c0270k) {
        this.f4752k = m7;
        this.f4753l = j7;
        this.f4754m = obj;
        this.f4755n = c0270k;
    }

    @Override // H5.N
    public final void dispose() {
        M m7 = this.f4752k;
        synchronized (m7) {
            if (this.f4753l < m7.n()) {
                return;
            }
            Object[] objArr = m7.f4766r;
            kotlin.jvm.internal.l.c(objArr);
            long j7 = this.f4753l;
            if (objArr[((int) j7) & (objArr.length - 1)] != this) {
                return;
            }
            N.d(objArr, j7, N.a);
            m7.i();
        }
    }
}
