package k4;

import f4.InterfaceC0881a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i implements Iterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final long f12683k;

    /* renamed from: l, reason: collision with root package name */
    public final long f12684l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12685m;

    /* renamed from: n, reason: collision with root package name */
    public long f12686n;

    public i(long j7, long j8, long j9) {
        this.f12683k = j9;
        this.f12684l = j8;
        boolean z7 = false;
        if (j9 <= 0 ? j7 >= j8 : j7 <= j8) {
            z7 = true;
        }
        this.f12685m = z7;
        this.f12686n = z7 ? j7 : j8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12685m;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j7 = this.f12686n;
        if (j7 != this.f12684l) {
            this.f12686n = this.f12683k + j7;
        } else {
            if (!this.f12685m) {
                throw new NoSuchElementException();
            }
            this.f12685m = false;
        }
        return Long.valueOf(j7);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
