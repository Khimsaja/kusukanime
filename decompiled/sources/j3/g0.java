package j3;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public class g0 extends AbstractCollection implements Set {

    /* renamed from: k, reason: collision with root package name */
    public final Set f12351k;

    /* renamed from: l, reason: collision with root package name */
    public final i3.e f12352l;

    public g0(Set set, i3.e eVar) {
        this.f12351k = set;
        this.f12352l = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f12352l.apply(obj)) {
            return this.f12351k.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f12352l.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f12351k.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f12351k;
        boolean z7 = set instanceof RandomAccess;
        i3.e eVar = this.f12352l;
        if (!z7 || !(set instanceof List)) {
            Iterator it = set.iterator();
            eVar.getClass();
            while (it.hasNext()) {
                if (eVar.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        eVar.getClass();
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            Object obj = list.get(i8);
            if (!eVar.apply(obj)) {
                if (i8 > i7) {
                    try {
                        list.set(i7, obj);
                    } catch (IllegalArgumentException unused) {
                        AbstractC1331q.m(list, eVar, i7, i8);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        AbstractC1331q.m(list, eVar, i7, i8);
                        return;
                    }
                }
                i7++;
            }
        }
        list.subList(i7, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f12351k;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f12352l.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return AbstractC1331q.e(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC1331q.h(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f12351k.iterator();
        i3.e eVar = this.f12352l;
        if (eVar == null) {
            throw new NullPointerException("predicate");
        }
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (eVar.apply(it.next())) {
                break;
            }
            i7++;
        }
        return true ^ (i7 != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f12351k.iterator();
        it.getClass();
        i3.e eVar = this.f12352l;
        eVar.getClass();
        return new K(it, eVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f12351k.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f12351k.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f12352l.apply(next) && collection.contains(next)) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f12351k.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f12352l.apply(next) && !collection.contains(next)) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f12351k.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (this.f12352l.apply(it.next())) {
                i7++;
            }
        }
        return i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC1331q.k(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return AbstractC1331q.k(iterator()).toArray(objArr);
    }
}
