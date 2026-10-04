package w5;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public boolean f17098k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17099l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f17100m;

    public e(f fVar) {
        this.f17100m = fVar;
        this.f17099l = ((AbstractList) fVar).modCount;
    }

    public final void a() {
        f fVar = this.f17100m;
        int i7 = ((AbstractList) fVar).modCount;
        int i8 = this.f17099l;
        if (i7 == i8) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) fVar).modCount + "; expected: " + i8);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f17098k;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f17098k) {
            throw new NoSuchElementException();
        }
        this.f17098k = true;
        a();
        return this.f17100m.f17102l;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        this.f17100m.clear();
    }
}
