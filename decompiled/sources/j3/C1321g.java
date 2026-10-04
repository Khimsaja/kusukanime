package j3;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: j3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1321g extends C1324j implements NavigableSet {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T f12350n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1321g(T t7, NavigableMap navigableMap) {
        super(t7, navigableMap);
        this.f12350n = t7;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return a().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C1319e) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C1321g(this.f12350n, a().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return a().floorKey(obj);
    }

    @Override // j3.C1324j
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final NavigableMap a() {
        return (NavigableMap) ((SortedMap) this.f12344k);
    }

    @Override // j3.C1324j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return a().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return a().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C1317c c1317c = (C1317c) iterator();
        if (!c1317c.hasNext()) {
            return null;
        }
        Object next = c1317c.next();
        c1317c.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // j3.C1324j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // j3.C1324j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z7) {
        return new C1321g(this.f12350n, a().headMap(obj, z7));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z7, Object obj2, boolean z8) {
        return new C1321g(this.f12350n, a().subMap(obj, z7, obj2, z8));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z7) {
        return new C1321g(this.f12350n, a().tailMap(obj, z7));
    }
}
