package Q;

import f4.InterfaceC0883c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class a implements List, InterfaceC0883c {

    /* renamed from: k, reason: collision with root package name */
    public final d f7821k;

    public a(d dVar) {
        this.f7821k = dVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f7821k.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        d dVar = this.f7821k;
        return dVar.e(dVar.f7829m, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f7821k.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7821k.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        d dVar = this.f7821k;
        dVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!dVar.h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        n6.d.e(i7, this);
        return this.f7821k.f7827k[i7];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f7821k.j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f7821k.k();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        d dVar = this.f7821k;
        int i7 = dVar.f7829m;
        if (i7 <= 0) {
            return -1;
        }
        int i8 = i7 - 1;
        Object[] objArr = dVar.f7827k;
        while (!l.a(obj, objArr[i8])) {
            i8--;
            if (i8 < 0) {
                return -1;
            }
        }
        return i8;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f7821k.m(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        d dVar = this.f7821k;
        dVar.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i7 = dVar.f7829m;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            dVar.m(it.next());
        }
        return i7 != dVar.f7829m;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        d dVar = this.f7821k;
        int i7 = dVar.f7829m;
        for (int i8 = i7 - 1; -1 < i8; i8--) {
            if (!collection.contains(dVar.f7827k[i8])) {
                dVar.n(i8);
            }
        }
        return i7 != dVar.f7829m;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        n6.d.e(i7, this);
        Object[] objArr = this.f7821k.f7827k;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f7821k.f7829m;
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        n6.d.f(i7, i8, this);
        return new b(i7, i8, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return k.a(this);
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        this.f7821k.a(i7, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return new c(i7, this);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        n6.d.e(i7, this);
        return this.f7821k.n(i7);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return k.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        return this.f7821k.e(i7, collection);
    }
}
