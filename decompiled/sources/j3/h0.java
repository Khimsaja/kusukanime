package j3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class h0 extends g0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f12351k).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f12351k.iterator();
        it.getClass();
        i3.e eVar = this.f12352l;
        eVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (eVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new h0(((SortedSet) this.f12351k).headSet(obj), this.f12352l);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f12351k;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f12352l.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new h0(((SortedSet) this.f12351k).subSet(obj, obj2), this.f12352l);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new h0(((SortedSet) this.f12351k).tailSet(obj), this.f12352l);
    }
}
