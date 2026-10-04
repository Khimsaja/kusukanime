package j3;

import f6.AbstractC0905c;
import f6.AbstractC0915m;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class G extends B implements List, RandomAccess {

    /* renamed from: l, reason: collision with root package name */
    public static final E f12277l = new E(X.f12304o, 0);

    public static X q(int i7, Object[] objArr) {
        return i7 == 0 ? X.f12304o : new X(i7, objArr);
    }

    public static D r() {
        return new D(4);
    }

    public static G s(Collection collection) {
        if (!(collection instanceof B)) {
            Object[] array = collection.toArray();
            AbstractC1331q.a(array.length, array);
            return q(array.length, array);
        }
        G gA = ((B) collection).a();
        if (!gA.p()) {
            return gA;
        }
        Object[] array2 = gA.toArray(B.f12268k);
        return q(array2.length, array2);
    }

    public static X t(Object[] objArr) {
        if (objArr.length == 0) {
            return X.f12304o;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        AbstractC1331q.a(objArr2.length, objArr2);
        return q(objArr2.length, objArr2);
    }

    public static X v(Long l7, Long l8, Long l9, Long l10, Long l11) {
        Object[] objArr = {l7, l8, l9, l10, l11};
        AbstractC1331q.a(5, objArr);
        return q(5, objArr);
    }

    public static X w(Object obj) {
        Object[] objArr = {obj};
        AbstractC1331q.a(1, objArr);
        return q(1, objArr);
    }

    public static X x(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC1331q.a(2, objArr);
        return q(2, objArr);
    }

    public static X y(W w7, List list) {
        w7.getClass();
        if (list == null) {
            list = AbstractC1331q.k(list.iterator());
        }
        Object[] array = list.toArray();
        AbstractC1331q.a(array.length, array);
        Arrays.sort(array, w7);
        return q(array.length, array);
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j3.B, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && AbstractC0905c.l(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i7 = 0; i7 < size; i7++) {
                        if (AbstractC0905c.l(get(i7), list.get(i7))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // j3.B
    public int h(int i7, Object[] objArr) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i7 + i8] = get(i8);
        }
        return i7 + size;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i8 = 0; i8 < size; i8++) {
            i7 = ~(~(get(i8).hashCode() + (i7 * 31)));
        }
        return i7;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (obj.equals(get(i7))) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final E listIterator(int i7) {
        AbstractC0915m.i(i7, size());
        return isEmpty() ? f12277l : new E(this, i7);
    }

    @Override // java.util.List
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public G subList(int i7, int i8) {
        AbstractC0915m.j(i7, i8, size());
        int i9 = i8 - i7;
        return i9 == size() ? this : i9 == 0 ? X.f12304o : new F(this, i7, i9);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // j3.B
    public final G a() {
        return this;
    }
}
