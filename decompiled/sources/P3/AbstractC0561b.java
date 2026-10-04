package P3;

import f4.InterfaceC0881a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: P3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0561b implements Iterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public int f7756k;

    /* renamed from: l, reason: collision with root package name */
    public Object f7757l;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f7756k;
        if (i7 == 0) {
            this.f7756k = 3;
            a();
            return this.f7756k == 1;
        }
        if (i7 == 1) {
            return true;
        }
        if (i7 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f7756k;
        if (i7 == 1) {
            this.f7756k = 0;
            return this.f7757l;
        }
        if (i7 != 2) {
            this.f7756k = 3;
            a();
            if (this.f7756k == 1) {
                this.f7756k = 0;
                return this.f7757l;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
