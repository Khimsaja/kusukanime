package j3;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class O extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractCollection f12293k;

    /* renamed from: l, reason: collision with root package name */
    public final i3.d f12294l;

    /* JADX WARN: Multi-variable type inference failed */
    public O(List list, i3.d dVar) {
        list.getClass();
        this.f12293k = (AbstractCollection) list;
        this.f12294l = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return this.f12294l.apply(this.f12293k.get(i7));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f12293k.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new N(this, this.f12293k.listIterator(i7), 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        return this.f12294l.apply(this.f12293k.remove(i7));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        this.f12293k.subList(i7, i8).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12293k.size();
    }
}
