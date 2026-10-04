package Q3;

import P3.AbstractC0566g;
import P3.m;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class b extends AbstractC0566g implements RandomAccess, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public Object[] f7959k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7960l;

    /* renamed from: m, reason: collision with root package name */
    public int f7961m;

    /* renamed from: n, reason: collision with root package name */
    public final b f7962n;

    /* renamed from: o, reason: collision with root package name */
    public final c f7963o;

    public b(Object[] objArr, int i7, int i8, b bVar, c cVar) {
        l.f("backing", objArr);
        l.f("root", cVar);
        this.f7959k = objArr;
        this.f7960l = i7;
        this.f7961m = i8;
        this.f7962n = bVar;
        this.f7963o = cVar;
        ((AbstractList) this).modCount = ((AbstractList) cVar).modCount;
    }

    @Override // P3.AbstractC0566g
    public final int a() {
        p();
        return this.f7961m;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        q();
        p();
        o(this.f7960l + this.f7961m, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        l.f("elements", collection);
        q();
        p();
        int size = collection.size();
        m(this.f7960l + this.f7961m, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        q();
        p();
        s(this.f7960l, this.f7961m);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        p();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return q0.c.g(this.f7959k, this.f7960l, this.f7961m, (List) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        p();
        int i8 = this.f7961m;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(A6.b.e(i7, i8, "index: ", ", size: "));
        }
        return this.f7959k[this.f7960l + i7];
    }

    @Override // P3.AbstractC0566g
    public final Object h(int i7) {
        q();
        p();
        int i8 = this.f7961m;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(A6.b.e(i7, i8, "index: ", ", size: "));
        }
        return r(this.f7960l + i7);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        p();
        Object[] objArr = this.f7959k;
        int i7 = this.f7961m;
        int iHashCode = 1;
        for (int i8 = 0; i8 < i7; i8++) {
            Object obj = objArr[this.f7960l + i8];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        p();
        for (int i7 = 0; i7 < this.f7961m; i7++) {
            if (l.a(this.f7959k[this.f7960l + i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        p();
        return this.f7961m == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        p();
        for (int i7 = this.f7961m - 1; i7 >= 0; i7--) {
            if (l.a(this.f7959k[this.f7960l + i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void m(int i7, Collection collection, int i8) {
        ((AbstractList) this).modCount++;
        c cVar = this.f7963o;
        b bVar = this.f7962n;
        if (bVar != null) {
            bVar.m(i7, collection, i8);
        } else {
            c cVar2 = c.f7964n;
            cVar.m(i7, collection, i8);
        }
        this.f7959k = cVar.f7965k;
        this.f7961m += i8;
    }

    public final void o(int i7, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f7963o;
        b bVar = this.f7962n;
        if (bVar != null) {
            bVar.o(i7, obj);
        } else {
            c cVar2 = c.f7964n;
            cVar.o(i7, obj);
        }
        this.f7959k = cVar.f7965k;
        this.f7961m++;
    }

    public final void p() {
        if (((AbstractList) this.f7963o).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void q() {
        if (this.f7963o.f7967m) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object r(int i7) {
        Object objR;
        ((AbstractList) this).modCount++;
        b bVar = this.f7962n;
        if (bVar != null) {
            objR = bVar.r(i7);
        } else {
            c cVar = c.f7964n;
            objR = this.f7963o.r(i7);
        }
        this.f7961m--;
        return objR;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        q();
        p();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            h(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        l.f("elements", collection);
        q();
        p();
        return t(this.f7960l, this.f7961m, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        l.f("elements", collection);
        q();
        p();
        return t(this.f7960l, this.f7961m, collection, true) > 0;
    }

    public final void s(int i7, int i8) {
        if (i8 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f7962n;
        if (bVar != null) {
            bVar.s(i7, i8);
        } else {
            c cVar = c.f7964n;
            this.f7963o.s(i7, i8);
        }
        this.f7961m -= i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        q();
        p();
        int i8 = this.f7961m;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(A6.b.e(i7, i8, "index: ", ", size: "));
        }
        Object[] objArr = this.f7959k;
        int i9 = this.f7960l;
        Object obj2 = objArr[i9 + i7];
        objArr[i9 + i7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i8) {
        q0.c.m(i7, i8, this.f7961m);
        return new b(this.f7959k, this.f7960l + i7, i8 - i7, this, this.f7963o);
    }

    public final int t(int i7, int i8, Collection collection, boolean z7) {
        int iT;
        b bVar = this.f7962n;
        if (bVar != null) {
            iT = bVar.t(i7, i8, collection, z7);
        } else {
            c cVar = c.f7964n;
            iT = this.f7963o.t(i7, i8, collection, z7);
        }
        if (iT > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f7961m -= iT;
        return iT;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        l.f("array", objArr);
        p();
        int length = objArr.length;
        int i7 = this.f7961m;
        int i8 = this.f7960l;
        if (length < i7) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f7959k, i8, i7 + i8, objArr.getClass());
            l.e("copyOfRange(...)", objArrCopyOfRange);
            return objArrCopyOfRange;
        }
        m.W(0, i8, i7 + i8, this.f7959k, objArr);
        int i9 = this.f7961m;
        if (i9 < objArr.length) {
            objArr[i9] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        p();
        return q0.c.h(this.f7959k, this.f7960l, this.f7961m, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        p();
        int i8 = this.f7961m;
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(A6.b.e(i7, i8, "index: ", ", size: "));
        }
        return new a(this, i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        q();
        p();
        int i8 = this.f7961m;
        if (i7 >= 0 && i7 <= i8) {
            o(this.f7960l + i7, obj);
            return;
        }
        throw new IndexOutOfBoundsException(A6.b.e(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        l.f("elements", collection);
        q();
        p();
        int i8 = this.f7961m;
        if (i7 >= 0 && i7 <= i8) {
            int size = collection.size();
            m(this.f7960l + i7, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(A6.b.e(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        p();
        Object[] objArr = this.f7959k;
        int i7 = this.f7961m;
        int i8 = this.f7960l;
        return m.b0(objArr, i8, i7 + i8);
    }
}
