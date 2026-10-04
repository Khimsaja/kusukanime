package j3;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: j3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1326l extends AbstractCollection implements List {

    /* renamed from: k, reason: collision with root package name */
    public final Object f12359k;

    /* renamed from: l, reason: collision with root package name */
    public Collection f12360l;

    /* renamed from: m, reason: collision with root package name */
    public final C1326l f12361m;

    /* renamed from: n, reason: collision with root package name */
    public final Collection f12362n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ T f12363o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ T f12364p;

    public C1326l(T t7, Object obj, List list, C1326l c1326l) {
        this.f12364p = t7;
        this.f12363o = t7;
        this.f12359k = obj;
        this.f12360l = list;
        this.f12361m = c1326l;
        this.f12362n = c1326l == null ? null : c1326l.f12360l;
    }

    public final void a() {
        C1326l c1326l = this.f12361m;
        if (c1326l != null) {
            c1326l.a();
        } else {
            this.f12363o.f12298n.put(this.f12359k, this.f12360l);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        boolean zIsEmpty = this.f12360l.isEmpty();
        boolean zAdd = this.f12360l.add(obj);
        if (zAdd) {
            this.f12363o.f12299o++;
            if (zIsEmpty) {
                a();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f12360l.addAll(collection);
        if (zAddAll) {
            this.f12363o.f12299o += this.f12360l.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f12360l.clear();
        this.f12363o.f12299o -= size;
        j();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        h();
        return this.f12360l.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        h();
        return this.f12360l.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        h();
        return this.f12360l.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        h();
        return ((List) this.f12360l).get(i7);
    }

    public final void h() {
        Collection collection;
        C1326l c1326l = this.f12361m;
        if (c1326l != null) {
            c1326l.h();
            if (c1326l.f12360l != this.f12362n) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f12360l.isEmpty() || (collection = (Collection) this.f12363o.f12298n.get(this.f12359k)) == null) {
                return;
            }
            this.f12360l = collection;
        }
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        return this.f12360l.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        h();
        return ((List) this.f12360l).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        h();
        return new C1317c(this);
    }

    public final void j() {
        C1326l c1326l = this.f12361m;
        if (c1326l != null) {
            c1326l.j();
        } else if (this.f12360l.isEmpty()) {
            this.f12363o.f12298n.remove(this.f12359k);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        return ((List) this.f12360l).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        h();
        return new C1325k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        boolean zRemove = this.f12360l.remove(obj);
        if (zRemove) {
            T t7 = this.f12363o;
            t7.f12299o--;
            j();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f12360l.removeAll(collection);
        if (zRemoveAll) {
            this.f12363o.f12299o += this.f12360l.size() - size;
            j();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f12360l.retainAll(collection);
        if (zRetainAll) {
            this.f12363o.f12299o += this.f12360l.size() - size;
            j();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        h();
        return ((List) this.f12360l).set(i7, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        h();
        return this.f12360l.size();
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        h();
        List listSubList = ((List) this.f12360l).subList(i7, i8);
        C1326l c1326l = this.f12361m;
        if (c1326l == null) {
            c1326l = this;
        }
        T t7 = this.f12364p;
        t7.getClass();
        boolean z7 = listSubList instanceof RandomAccess;
        Object obj = this.f12359k;
        return z7 ? new C1322h(t7, obj, listSubList, c1326l) : new C1326l(t7, obj, listSubList, c1326l);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        return this.f12360l.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        h();
        return new C1325k(this, i7);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        h();
        Object objRemove = ((List) this.f12360l).remove(i7);
        T t7 = this.f12364p;
        t7.f12299o--;
        j();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        h();
        boolean zIsEmpty = this.f12360l.isEmpty();
        ((List) this.f12360l).add(i7, obj);
        this.f12364p.f12299o++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f12360l).addAll(i7, collection);
        if (zAddAll) {
            this.f12364p.f12299o += this.f12360l.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }
}
