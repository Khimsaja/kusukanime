package X4;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class J implements ListIterator {

    /* renamed from: k, reason: collision with root package name */
    public ListIterator f9854k;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f9854k.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9854k.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f9854k.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9854k.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f9854k.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9854k.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
