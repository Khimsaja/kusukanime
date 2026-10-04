package m;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1481b implements Set {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1484e f12882k;

    public C1481b(C1484e c1484e) {
        this.f12882k = c1484e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f12882k.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12882k.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f12882k.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        C1484e c1484e = this.f12882k;
        try {
            if (c1484e.f12870m == set.size()) {
                return c1484e.i(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C1484e c1484e = this.f12882k;
        int iHashCode = 0;
        for (int i7 = c1484e.f12870m - 1; i7 >= 0; i7--) {
            Object objE = c1484e.e(i7);
            iHashCode += objE == null ? 0 : objE.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f12882k.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1480a(this.f12882k, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C1484e c1484e = this.f12882k;
        int iC = c1484e.c(obj);
        if (iC < 0) {
            return false;
        }
        c1484e.f(iC);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f12882k.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1484e c1484e = this.f12882k;
        int i7 = c1484e.f12870m;
        for (int i8 = i7 - 1; i8 >= 0; i8--) {
            if (!collection.contains(c1484e.e(i8))) {
                c1484e.f(i8);
            }
        }
        return i7 != c1484e.f12870m;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f12882k.f12870m;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C1484e c1484e = this.f12882k;
        int i7 = c1484e.f12870m;
        Object[] objArr = new Object[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = c1484e.e(i8);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1484e c1484e = this.f12882k;
        int i7 = c1484e.f12870m;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        }
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = c1484e.e(i8);
        }
        if (objArr.length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
