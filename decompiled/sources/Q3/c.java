package Q3;

import P3.AbstractC0566g;
import P3.m;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c extends AbstractC0566g implements RandomAccess, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public static final c f7964n;

    /* renamed from: k, reason: collision with root package name */
    public Object[] f7965k;

    /* renamed from: l, reason: collision with root package name */
    public int f7966l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7967m;

    static {
        c cVar = new c(0);
        cVar.f7967m = true;
        f7964n = cVar;
    }

    public c(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f7965k = new Object[i7];
    }

    @Override // P3.AbstractC0566g
    public final int a() {
        return this.f7966l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        p();
        int i7 = this.f7966l;
        ((AbstractList) this).modCount++;
        q(i7, 1);
        this.f7965k[i7] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        l.f("elements", collection);
        p();
        int size = collection.size();
        m(this.f7966l, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        p();
        s(0, this.f7966l);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (q0.c.g(this.f7965k, 0, this.f7966l, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int i8 = this.f7966l;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(A6.b.e(i7, i8, "index: ", ", size: "));
        }
        return this.f7965k[i7];
    }

    @Override // P3.AbstractC0566g
    public final Object h(int i7) {
        p();
        int i8 = this.f7966l;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(A6.b.e(i7, i8, "index: ", ", size: "));
        }
        return r(i7);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f7965k;
        int i7 = this.f7966l;
        int iHashCode = 1;
        for (int i8 = 0; i8 < i7; i8++) {
            Object obj = objArr[i8];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i7 = 0; i7 < this.f7966l; i7++) {
            if (l.a(this.f7965k[i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f7966l == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i7 = this.f7966l - 1; i7 >= 0; i7--) {
            if (l.a(this.f7965k[i7], obj)) {
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
        q(i7, i8);
        Iterator it = collection.iterator();
        for (int i9 = 0; i9 < i8; i9++) {
            this.f7965k[i7 + i9] = it.next();
        }
    }

    public final void o(int i7, Object obj) {
        ((AbstractList) this).modCount++;
        q(i7, 1);
        this.f7965k[i7] = obj;
    }

    public final void p() {
        if (this.f7967m) {
            throw new UnsupportedOperationException();
        }
    }

    public final void q(int i7, int i8) {
        int i9 = this.f7966l + i8;
        if (i9 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f7965k;
        if (i9 > objArr.length) {
            int length = objArr.length;
            int i10 = length + (length >> 1);
            if (i10 - i9 < 0) {
                i10 = i9;
            }
            if (i10 - 2147483639 > 0) {
                i10 = i9 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i10);
            l.e("copyOf(...)", objArrCopyOf);
            this.f7965k = objArrCopyOf;
        }
        Object[] objArr2 = this.f7965k;
        m.W(i7 + i8, i7, this.f7966l, objArr2, objArr2);
        this.f7966l += i8;
    }

    public final Object r(int i7) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f7965k;
        Object obj = objArr[i7];
        m.W(i7, i7 + 1, this.f7966l, objArr, objArr);
        Object[] objArr2 = this.f7965k;
        int i8 = this.f7966l - 1;
        l.f("<this>", objArr2);
        objArr2[i8] = null;
        this.f7966l--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        p();
        return t(0, this.f7966l, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        l.f("elements", collection);
        p();
        return t(0, this.f7966l, collection, true) > 0;
    }

    public final void s(int i7, int i8) {
        if (i8 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f7965k;
        m.W(i7, i7 + i8, this.f7966l, objArr, objArr);
        Object[] objArr2 = this.f7965k;
        int i9 = this.f7966l;
        q0.c.M(objArr2, i9 - i8, i9);
        this.f7966l -= i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        p();
        int i8 = this.f7966l;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(A6.b.e(i7, i8, "index: ", ", size: "));
        }
        Object[] objArr = this.f7965k;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i8) {
        q0.c.m(i7, i8, this.f7966l);
        return new b(this.f7965k, i7, i8 - i7, null, this);
    }

    public final int t(int i7, int i8, Collection collection, boolean z7) {
        int i9 = 0;
        int i10 = 0;
        while (i9 < i8) {
            int i11 = i7 + i9;
            if (collection.contains(this.f7965k[i11]) == z7) {
                Object[] objArr = this.f7965k;
                i9++;
                objArr[i10 + i7] = objArr[i11];
                i10++;
            } else {
                i9++;
            }
        }
        int i12 = i8 - i10;
        Object[] objArr2 = this.f7965k;
        m.W(i7 + i10, i8 + i7, this.f7966l, objArr2, objArr2);
        Object[] objArr3 = this.f7965k;
        int i13 = this.f7966l;
        q0.c.M(objArr3, i13 - i12, i13);
        if (i12 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f7966l -= i12;
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        l.f("array", objArr);
        int length = objArr.length;
        int i7 = this.f7966l;
        if (length < i7) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f7965k, 0, i7, objArr.getClass());
            l.e("copyOfRange(...)", objArrCopyOfRange);
            return objArrCopyOfRange;
        }
        m.W(0, 0, i7, this.f7965k, objArr);
        int i8 = this.f7966l;
        if (i8 < objArr.length) {
            objArr[i8] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return q0.c.h(this.f7965k, 0, this.f7966l, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        int i8 = this.f7966l;
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(A6.b.e(i7, i8, "index: ", ", size: "));
        }
        return new a(this, i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        l.f("elements", collection);
        p();
        int i8 = this.f7966l;
        if (i7 >= 0 && i7 <= i8) {
            int size = collection.size();
            m(i7, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(A6.b.e(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        p();
        int i8 = this.f7966l;
        if (i7 >= 0 && i7 <= i8) {
            ((AbstractList) this).modCount++;
            q(i7, 1);
            this.f7965k[i7] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(A6.b.e(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return m.b0(this.f7965k, 0, this.f7966l);
    }
}
