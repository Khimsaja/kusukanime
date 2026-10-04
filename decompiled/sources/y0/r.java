package y0;

import e4.InterfaceC0821a;
import f4.InterfaceC0881a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final class r implements List, InterfaceC0881a {

    /* renamed from: n, reason: collision with root package name */
    public int f17891n;

    /* renamed from: k, reason: collision with root package name */
    public Object[] f17888k = new Object[16];

    /* renamed from: l, reason: collision with root package name */
    public long[] f17889l = new long[16];

    /* renamed from: m, reason: collision with root package name */
    public int f17890m = -1;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17892o = true;

    public final long a() {
        long jA = AbstractC2359f.a(Float.POSITIVE_INFINITY, false);
        int i7 = this.f17890m + 1;
        int iY = P3.r.y(this);
        if (i7 <= iY) {
            while (true) {
                long j7 = this.f17889l[i7];
                if (AbstractC2359f.h(j7, jA) < 0) {
                    jA = j7;
                }
                if (Float.intBitsToFloat((int) (jA >> 32)) < 0.0f && ((int) (4294967295L & jA)) != 0) {
                    return jA;
                }
                if (i7 == iY) {
                    break;
                }
                i7++;
            }
        }
        return jA;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f17890m = -1;
        j();
        this.f17892o = true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof a0.p) && indexOf((a0.p) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((a0.p) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Object obj = this.f17888k[i7];
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node", obj);
        return (a0.p) obj;
    }

    public final void h(a0.p pVar, float f5, boolean z7, InterfaceC0821a interfaceC0821a) {
        int i7 = this.f17890m;
        int i8 = i7 + 1;
        this.f17890m = i8;
        Object[] objArr = this.f17888k;
        if (i8 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", objArrCopyOf);
            this.f17888k = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.f17889l, length);
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", jArrCopyOf);
            this.f17889l = jArrCopyOf;
        }
        Object[] objArr2 = this.f17888k;
        int i9 = this.f17890m;
        objArr2[i9] = pVar;
        this.f17889l[i9] = AbstractC2359f.a(f5, z7);
        j();
        interfaceC0821a.invoke();
        this.f17890m = i7;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof a0.p)) {
            return -1;
        }
        a0.p pVar = (a0.p) obj;
        int iY = P3.r.y(this);
        if (iY >= 0) {
            int i7 = 0;
            while (!kotlin.jvm.internal.l.a(this.f17888k[i7], pVar)) {
                if (i7 != iY) {
                    i7++;
                }
            }
            return i7;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f17891n == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new Q3.a(this, 0, 7);
    }

    public final void j() {
        int i7 = this.f17890m + 1;
        int iY = P3.r.y(this);
        if (i7 <= iY) {
            while (true) {
                this.f17888k[i7] = null;
                if (i7 == iY) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.f17891n = this.f17890m + 1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof a0.p)) {
            return -1;
        }
        a0.p pVar = (a0.p) obj;
        for (int iY = P3.r.y(this); -1 < iY; iY--) {
            if (kotlin.jvm.internal.l.a(this.f17888k[iY], pVar)) {
                return iY;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new Q3.a(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f17891n;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        return new C2370q(this, i7, i8);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return new Q3.a(this, i7, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.k.b(this, objArr);
    }
}
