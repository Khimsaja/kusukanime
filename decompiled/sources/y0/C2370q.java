package y0;

import f4.InterfaceC0881a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: y0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2370q implements List, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final int f17885k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17886l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f17887m;

    public C2370q(r rVar, int i7, int i8) {
        this.f17887m = rVar;
        this.f17885k = i7;
        this.f17886l = i8;
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
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
        Object obj = this.f17887m.f17888k[i7 + this.f17885k];
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node", obj);
        return (a0.p) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof a0.p)) {
            return -1;
        }
        a0.p pVar = (a0.p) obj;
        int i7 = this.f17885k;
        int i8 = this.f17886l;
        if (i7 <= i8) {
            int i9 = i7;
            while (!kotlin.jvm.internal.l.a(this.f17887m.f17888k[i9], pVar)) {
                if (i9 != i8) {
                    i9++;
                }
            }
            return i9 - i7;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i7 = this.f17885k;
        return new Q3.a(this.f17887m, i7, i7, this.f17886l);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof a0.p)) {
            return -1;
        }
        a0.p pVar = (a0.p) obj;
        int i7 = this.f17886l;
        int i8 = this.f17885k;
        if (i8 <= i7) {
            while (!kotlin.jvm.internal.l.a(this.f17887m.f17888k[i7], pVar)) {
                if (i7 != i8) {
                    i7--;
                }
            }
            return i7 - i8;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i7 = this.f17885k;
        return new Q3.a(this.f17887m, i7, i7, this.f17886l);
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
        return this.f17886l - this.f17885k;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        int i9 = this.f17885k;
        return new C2370q(this.f17887m, i7 + i9, i9 + i8);
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
        int i8 = this.f17885k;
        int i9 = this.f17886l;
        return new Q3.a(this.f17887m, i7 + i8, i8, i9);
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
