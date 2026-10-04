package H5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class T implements Runnable, Comparable, N {
    private volatile Object _heap;

    /* renamed from: k, reason: collision with root package name */
    public long f3821k;

    /* renamed from: l, reason: collision with root package name */
    public int f3822l = -1;

    public T(long j7) {
        this.f3821k = j7;
    }

    public final int a(long j7, U u5, V v5) {
        synchronized (this) {
            if (this._heap == D.f3797b) {
                return 2;
            }
            synchronized (u5) {
                try {
                    T[] tArr = u5.a;
                    T t7 = tArr != null ? tArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V.f3824p;
                    v5.getClass();
                    if (V.f3826r.get(v5) == 1) {
                        return 1;
                    }
                    if (t7 == null) {
                        u5.f3823c = j7;
                    } else {
                        long j8 = t7.f3821k;
                        if (j8 - j7 < 0) {
                            j7 = j8;
                        }
                        if (j7 - u5.f3823c > 0) {
                            u5.f3823c = j7;
                        }
                    }
                    long j9 = this.f3821k;
                    long j10 = u5.f3823c;
                    if (j9 - j10 < 0) {
                        this.f3821k = j10;
                    }
                    u5.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b(U u5) {
        if (this._heap == D.f3797b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = u5;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j7 = this.f3821k - ((T) obj).f3821k;
        if (j7 > 0) {
            return 1;
        }
        return j7 < 0 ? -1 : 0;
    }

    @Override // H5.N
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                F2.G g4 = D.f3797b;
                if (obj == g4) {
                    return;
                }
                U u5 = obj instanceof U ? (U) obj : null;
                if (u5 != null) {
                    synchronized (u5) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof M5.t ? (M5.t) obj2 : null) != null) {
                            u5.b(this.f3822l);
                        }
                    }
                }
                this._heap = g4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f3821k + ']';
    }
}
