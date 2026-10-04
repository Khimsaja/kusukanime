package P3;

import b1.AbstractC0703b;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class l extends AbstractC0566g {

    /* renamed from: n, reason: collision with root package name */
    public static final Object[] f7764n = new Object[0];

    /* renamed from: k, reason: collision with root package name */
    public int f7765k;

    /* renamed from: l, reason: collision with root package name */
    public Object[] f7766l;

    /* renamed from: m, reason: collision with root package name */
    public int f7767m;

    public l() {
        this.f7766l = f7764n;
    }

    @Override // P3.AbstractC0566g
    public final int a() {
        return this.f7767m;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int length;
        int i8 = this.f7767m;
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(A6.b.e(i7, i8, "index: ", ", size: "));
        }
        if (i7 == i8) {
            addLast(obj);
            return;
        }
        if (i7 == 0) {
            addFirst(obj);
            return;
        }
        t();
        m(this.f7767m + 1);
        int iS = s(this.f7765k + i7);
        int i9 = this.f7767m;
        if (i7 < ((i9 + 1) >> 1)) {
            if (iS == 0) {
                Object[] objArr = this.f7766l;
                kotlin.jvm.internal.l.f("<this>", objArr);
                iS = objArr.length;
            }
            int i10 = iS - 1;
            int i11 = this.f7765k;
            if (i11 == 0) {
                Object[] objArr2 = this.f7766l;
                kotlin.jvm.internal.l.f("<this>", objArr2);
                length = objArr2.length - 1;
            } else {
                length = i11 - 1;
            }
            int i12 = this.f7765k;
            if (i10 >= i12) {
                Object[] objArr3 = this.f7766l;
                objArr3[length] = objArr3[i12];
                m.W(i12, i12 + 1, i10 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f7766l;
                m.W(i12 - 1, i12, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f7766l;
                objArr5[objArr5.length - 1] = objArr5[0];
                m.W(0, 1, i10 + 1, objArr5, objArr5);
            }
            this.f7766l[i10] = obj;
            this.f7765k = length;
        } else {
            int iS2 = s(i9 + this.f7765k);
            if (iS < iS2) {
                Object[] objArr6 = this.f7766l;
                m.W(iS + 1, iS, iS2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f7766l;
                m.W(1, 0, iS2, objArr7, objArr7);
                Object[] objArr8 = this.f7766l;
                objArr8[0] = objArr8[objArr8.length - 1];
                m.W(iS + 1, iS, objArr8.length - 1, objArr8, objArr8);
            }
            this.f7766l[iS] = obj;
        }
        this.f7767m++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        int i8 = this.f7767m;
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(A6.b.e(i7, i8, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i7 == this.f7767m) {
            return addAll(collection);
        }
        t();
        m(collection.size() + this.f7767m);
        int iS = s(this.f7767m + this.f7765k);
        int iS2 = s(this.f7765k + i7);
        int size = collection.size();
        if (i7 >= ((this.f7767m + 1) >> 1)) {
            int i9 = iS2 + size;
            if (iS2 < iS) {
                int i10 = size + iS;
                Object[] objArr = this.f7766l;
                if (i10 <= objArr.length) {
                    m.W(i9, iS2, iS, objArr, objArr);
                } else if (i9 >= objArr.length) {
                    m.W(i9 - objArr.length, iS2, iS, objArr, objArr);
                } else {
                    int length = iS - (i10 - objArr.length);
                    m.W(0, length, iS, objArr, objArr);
                    Object[] objArr2 = this.f7766l;
                    m.W(i9, iS2, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f7766l;
                m.W(size, 0, iS, objArr3, objArr3);
                Object[] objArr4 = this.f7766l;
                if (i9 >= objArr4.length) {
                    m.W(i9 - objArr4.length, iS2, objArr4.length, objArr4, objArr4);
                } else {
                    m.W(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f7766l;
                    m.W(i9, iS2, objArr5.length - size, objArr5, objArr5);
                }
            }
            j(iS2, collection);
            return true;
        }
        int i11 = this.f7765k;
        int length2 = i11 - size;
        if (iS2 < i11) {
            Object[] objArr6 = this.f7766l;
            m.W(length2, i11, objArr6.length, objArr6, objArr6);
            if (size >= iS2) {
                Object[] objArr7 = this.f7766l;
                m.W(objArr7.length - size, 0, iS2, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f7766l;
                m.W(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f7766l;
                m.W(0, size, iS2, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f7766l;
            m.W(length2, i11, iS2, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f7766l;
            length2 += objArr11.length;
            int i12 = iS2 - i11;
            int length3 = objArr11.length - length2;
            if (length3 >= i12) {
                m.W(length2, i11, iS2, objArr11, objArr11);
            } else {
                m.W(length2, i11, i11 + length3, objArr11, objArr11);
                Object[] objArr12 = this.f7766l;
                m.W(0, this.f7765k + length3, iS2, objArr12, objArr12);
            }
        }
        this.f7765k = length2;
        j(q(iS2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        t();
        m(this.f7767m + 1);
        int length = this.f7765k;
        if (length == 0) {
            Object[] objArr = this.f7766l;
            kotlin.jvm.internal.l.f("<this>", objArr);
            length = objArr.length;
        }
        int i7 = length - 1;
        this.f7765k = i7;
        this.f7766l[i7] = obj;
        this.f7767m++;
    }

    public final void addLast(Object obj) {
        t();
        m(a() + 1);
        this.f7766l[s(a() + this.f7765k)] = obj;
        this.f7767m = a() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            t();
            r(this.f7765k, s(a() + this.f7765k));
        }
        this.f7765k = 0;
        this.f7767m = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f7766l[this.f7765k];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int iA = a();
        if (i7 < 0 || i7 >= iA) {
            throw new IndexOutOfBoundsException(A6.b.e(i7, iA, "index: ", ", size: "));
        }
        return this.f7766l[s(this.f7765k + i7)];
    }

    @Override // P3.AbstractC0566g
    public final Object h(int i7) {
        int i8 = this.f7767m;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(A6.b.e(i7, i8, "index: ", ", size: "));
        }
        if (i7 == r.y(this)) {
            return removeLast();
        }
        if (i7 == 0) {
            return removeFirst();
        }
        t();
        int iS = s(this.f7765k + i7);
        Object[] objArr = this.f7766l;
        Object obj = objArr[iS];
        if (i7 < (this.f7767m >> 1)) {
            int i9 = this.f7765k;
            if (iS >= i9) {
                m.W(i9 + 1, i9, iS, objArr, objArr);
            } else {
                m.W(1, 0, iS, objArr, objArr);
                Object[] objArr2 = this.f7766l;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i10 = this.f7765k;
                m.W(i10 + 1, i10, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f7766l;
            int i11 = this.f7765k;
            objArr3[i11] = null;
            this.f7765k = o(i11);
        } else {
            int iS2 = s(r.y(this) + this.f7765k);
            if (iS <= iS2) {
                Object[] objArr4 = this.f7766l;
                m.W(iS, iS + 1, iS2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f7766l;
                m.W(iS, iS + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f7766l;
                objArr6[objArr6.length - 1] = objArr6[0];
                m.W(0, 1, iS2 + 1, objArr6, objArr6);
            }
            this.f7766l[iS2] = null;
        }
        this.f7767m--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i7;
        int iS = s(a() + this.f7765k);
        int length = this.f7765k;
        if (length < iS) {
            while (length < iS) {
                if (kotlin.jvm.internal.l.a(obj, this.f7766l[length])) {
                    i7 = this.f7765k;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iS) {
            return -1;
        }
        int length2 = this.f7766l.length;
        while (true) {
            if (length >= length2) {
                for (int i8 = 0; i8 < iS; i8++) {
                    if (kotlin.jvm.internal.l.a(obj, this.f7766l[i8])) {
                        length = i8 + this.f7766l.length;
                        i7 = this.f7765k;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.l.a(obj, this.f7766l[length])) {
                i7 = this.f7765k;
                break;
            }
            length++;
        }
        return length - i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final void j(int i7, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f7766l.length;
        while (i7 < length && it.hasNext()) {
            this.f7766l[i7] = it.next();
            i7++;
        }
        int i8 = this.f7765k;
        for (int i9 = 0; i9 < i8 && it.hasNext(); i9++) {
            this.f7766l[i9] = it.next();
        }
        this.f7767m = collection.size() + this.f7767m;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f7766l[s(r.y(this) + this.f7765k)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i7;
        int iS = s(this.f7767m + this.f7765k);
        int i8 = this.f7765k;
        if (i8 < iS) {
            length = iS - 1;
            if (i8 <= length) {
                while (!kotlin.jvm.internal.l.a(obj, this.f7766l[length])) {
                    if (length != i8) {
                        length--;
                    }
                }
                i7 = this.f7765k;
                return length - i7;
            }
            return -1;
        }
        if (i8 > iS) {
            int i9 = iS - 1;
            while (true) {
                if (-1 >= i9) {
                    Object[] objArr = this.f7766l;
                    kotlin.jvm.internal.l.f("<this>", objArr);
                    length = objArr.length - 1;
                    int i10 = this.f7765k;
                    if (i10 <= length) {
                        while (!kotlin.jvm.internal.l.a(obj, this.f7766l[length])) {
                            if (length != i10) {
                                length--;
                            }
                        }
                        i7 = this.f7765k;
                    }
                } else {
                    if (kotlin.jvm.internal.l.a(obj, this.f7766l[i9])) {
                        length = i9 + this.f7766l.length;
                        i7 = this.f7765k;
                        break;
                    }
                    i9--;
                }
            }
        }
        return -1;
    }

    public final void m(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f7766l;
        if (i7 <= objArr.length) {
            return;
        }
        if (objArr == f7764n) {
            if (i7 < 10) {
                i7 = 10;
            }
            this.f7766l = new Object[i7];
            return;
        }
        int length = objArr.length;
        int i8 = length + (length >> 1);
        if (i8 - i7 < 0) {
            i8 = i7;
        }
        if (i8 - 2147483639 > 0) {
            i8 = i7 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i8];
        m.W(0, this.f7765k, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f7766l;
        int length2 = objArr3.length;
        int i9 = this.f7765k;
        m.W(length2 - i9, 0, i9, objArr3, objArr2);
        this.f7765k = 0;
        this.f7766l = objArr2;
    }

    public final int o(int i7) {
        kotlin.jvm.internal.l.f("<this>", this.f7766l);
        if (i7 == r0.length - 1) {
            return 0;
        }
        return i7 + 1;
    }

    public final Object p() {
        if (isEmpty()) {
            return null;
        }
        return this.f7766l[s(r.y(this) + this.f7765k)];
    }

    public final int q(int i7) {
        return i7 < 0 ? i7 + this.f7766l.length : i7;
    }

    public final void r(int i7, int i8) {
        if (i7 < i8) {
            m.c0(this.f7766l, i7, i8);
            return;
        }
        Object[] objArr = this.f7766l;
        m.c0(objArr, i7, objArr.length);
        m.c0(this.f7766l, 0, i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        h(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iS;
        kotlin.jvm.internal.l.f("elements", collection);
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.f7766l.length != 0) {
            int iS2 = s(this.f7767m + this.f7765k);
            int i7 = this.f7765k;
            if (i7 < iS2) {
                iS = i7;
                while (i7 < iS2) {
                    Object obj = this.f7766l[i7];
                    if (collection.contains(obj)) {
                        z7 = true;
                    } else {
                        this.f7766l[iS] = obj;
                        iS++;
                    }
                    i7++;
                }
                m.c0(this.f7766l, iS, iS2);
            } else {
                int length = this.f7766l.length;
                boolean z8 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f7766l;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (collection.contains(obj2)) {
                        z8 = true;
                    } else {
                        this.f7766l[i8] = obj2;
                        i8++;
                    }
                    i7++;
                }
                iS = s(i8);
                for (int i9 = 0; i9 < iS2; i9++) {
                    Object[] objArr2 = this.f7766l;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (collection.contains(obj3)) {
                        z8 = true;
                    } else {
                        this.f7766l[iS] = obj3;
                        iS = o(iS);
                    }
                }
                z7 = z8;
            }
            if (z7) {
                t();
                this.f7767m = q(iS - this.f7765k);
            }
        }
        return z7;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        t();
        Object[] objArr = this.f7766l;
        int i7 = this.f7765k;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f7765k = o(i7);
        this.f7767m = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        t();
        int iS = s(r.y(this) + this.f7765k);
        Object[] objArr = this.f7766l;
        Object obj = objArr[iS];
        objArr[iS] = null;
        this.f7767m = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        q0.c.m(i7, i8, this.f7767m);
        int i9 = i8 - i7;
        if (i9 == 0) {
            return;
        }
        if (i9 == this.f7767m) {
            clear();
            return;
        }
        if (i9 == 1) {
            h(i7);
            return;
        }
        t();
        if (i7 < this.f7767m - i8) {
            int iS = s(this.f7765k + (i7 - 1));
            int iS2 = s(this.f7765k + (i8 - 1));
            while (i7 > 0) {
                int i10 = iS + 1;
                int iMin = Math.min(i7, Math.min(i10, iS2 + 1));
                Object[] objArr = this.f7766l;
                int i11 = iS2 - iMin;
                int i12 = iS - iMin;
                m.W(i11 + 1, i12 + 1, i10, objArr, objArr);
                iS = q(i12);
                iS2 = q(i11);
                i7 -= iMin;
            }
            int iS3 = s(this.f7765k + i9);
            r(this.f7765k, iS3);
            this.f7765k = iS3;
        } else {
            int iS4 = s(this.f7765k + i8);
            int iS5 = s(this.f7765k + i7);
            int i13 = this.f7767m;
            while (true) {
                i13 -= i8;
                if (i13 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f7766l;
                i8 = Math.min(i13, Math.min(objArr2.length - iS4, objArr2.length - iS5));
                Object[] objArr3 = this.f7766l;
                int i14 = iS4 + i8;
                m.W(iS5, iS4, i14, objArr3, objArr3);
                iS4 = s(i14);
                iS5 = s(iS5 + i8);
            }
            int iS6 = s(this.f7767m + this.f7765k);
            r(q(iS6 - i9), iS6);
        }
        this.f7767m -= i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iS;
        kotlin.jvm.internal.l.f("elements", collection);
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.f7766l.length != 0) {
            int iS2 = s(this.f7767m + this.f7765k);
            int i7 = this.f7765k;
            if (i7 < iS2) {
                iS = i7;
                while (i7 < iS2) {
                    Object obj = this.f7766l[i7];
                    if (collection.contains(obj)) {
                        this.f7766l[iS] = obj;
                        iS++;
                    } else {
                        z7 = true;
                    }
                    i7++;
                }
                m.c0(this.f7766l, iS, iS2);
            } else {
                int length = this.f7766l.length;
                boolean z8 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f7766l;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (collection.contains(obj2)) {
                        this.f7766l[i8] = obj2;
                        i8++;
                    } else {
                        z8 = true;
                    }
                    i7++;
                }
                iS = s(i8);
                for (int i9 = 0; i9 < iS2; i9++) {
                    Object[] objArr2 = this.f7766l;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (collection.contains(obj3)) {
                        this.f7766l[iS] = obj3;
                        iS = o(iS);
                    } else {
                        z8 = true;
                    }
                }
                z7 = z8;
            }
            if (z7) {
                t();
                this.f7767m = q(iS - this.f7765k);
            }
        }
        return z7;
    }

    public final int s(int i7) {
        Object[] objArr = this.f7766l;
        return i7 >= objArr.length ? i7 - objArr.length : i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        int iA = a();
        if (i7 < 0 || i7 >= iA) {
            throw new IndexOutOfBoundsException(A6.b.e(i7, iA, "index: ", ", size: "));
        }
        int iS = s(this.f7765k + i7);
        Object[] objArr = this.f7766l;
        Object obj2 = objArr[iS];
        objArr[iS] = obj;
        return obj2;
    }

    public final void t() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    public l(int i7) {
        Object[] objArr;
        if (i7 == 0) {
            objArr = f7764n;
        } else if (i7 > 0) {
            objArr = new Object[i7];
        } else {
            throw new IllegalArgumentException(AbstractC0703b.g(i7, "Illegal Capacity: "));
        }
        this.f7766l = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) throws NegativeArraySizeException {
        kotlin.jvm.internal.l.f("array", objArr);
        int length = objArr.length;
        int i7 = this.f7767m;
        if (length < i7) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i7);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>", objNewInstance);
            objArr = (Object[]) objNewInstance;
        }
        int iS = s(this.f7767m + this.f7765k);
        int i8 = this.f7765k;
        if (i8 < iS) {
            m.Z(i8, iS, 2, this.f7766l, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f7766l;
            m.W(0, this.f7765k, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f7766l;
            m.W(objArr3.length - this.f7765k, 0, iS, objArr3, objArr);
        }
        int i9 = this.f7767m;
        if (i9 < objArr.length) {
            objArr[i9] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        if (collection.isEmpty()) {
            return false;
        }
        t();
        m(collection.size() + a());
        j(s(a() + this.f7765k), collection);
        return true;
    }
}
