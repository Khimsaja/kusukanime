package P3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class H extends AbstractC0566g {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f7753k;

    public H(ArrayList arrayList) {
        this.f7753k = arrayList;
    }

    @Override // P3.AbstractC0566g
    public final int a() {
        return this.f7753k.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        this.f7753k.add(q.k0(i7, this), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f7753k.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return this.f7753k.get(q.j0(i7, this));
    }

    @Override // P3.AbstractC0566g
    public final Object h(int i7) {
        return this.f7753k.remove(q.j0(i7, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new G(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new G(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        return this.f7753k.set(q.j0(i7, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new G(this, i7);
    }
}
