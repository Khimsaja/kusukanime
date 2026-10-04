package j3;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class P extends AbstractSequentialList implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractCollection f12295k;

    /* renamed from: l, reason: collision with root package name */
    public final i3.d f12296l;

    /* JADX WARN: Multi-variable type inference failed */
    public P(List list, i3.d dVar) {
        list.getClass();
        this.f12295k = (AbstractCollection) list;
        this.f12296l = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f12295k.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new N(this, this.f12295k.listIterator(i7), 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        this.f12295k.subList(i7, i8).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12295k.size();
    }
}
