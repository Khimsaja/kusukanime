package j3;

import f6.AbstractC0915m;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class E extends l0 implements ListIterator {

    /* renamed from: k, reason: collision with root package name */
    public final int f12271k;

    /* renamed from: l, reason: collision with root package name */
    public int f12272l;

    /* renamed from: m, reason: collision with root package name */
    public final G f12273m;

    public E(G g4, int i7) {
        int size = g4.size();
        AbstractC0915m.i(i7, size);
        this.f12271k = size;
        this.f12272l = i7;
        this.f12273m = g4;
    }

    public final Object a(int i7) {
        return this.f12273m.get(i7);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f12272l < this.f12271k;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12272l > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f12272l;
        this.f12272l = i7 + 1;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12272l;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f12272l - 1;
        this.f12272l = i7;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12272l - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
