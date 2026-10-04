package Q;

import f4.InterfaceC0883c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class b implements List, InterfaceC0883c {

    /* renamed from: k, reason: collision with root package name */
    public final Object f7822k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7823l;

    /* renamed from: m, reason: collision with root package name */
    public int f7824m;

    public b(int i7, int i8, List list) {
        this.f7822k = list;
        this.f7823l = i7;
        this.f7824m = i8;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i7 = this.f7824m;
        this.f7824m = i7 + 1;
        this.f7822k.add(i7, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        this.f7822k.addAll(i7 + this.f7823l, collection);
        this.f7824m = collection.size() + this.f7824m;
        return collection.size() > 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i7 = this.f7824m - 1;
        int i8 = this.f7823l;
        if (i8 <= i7) {
            while (true) {
                this.f7822k.remove(i7);
                if (i7 == i8) {
                    break;
                } else {
                    i7--;
                }
            }
        }
        this.f7824m = i8;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i7 = this.f7824m;
        for (int i8 = this.f7823l; i8 < i7; i8++) {
            if (l.a(this.f7822k.get(i8), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i7) {
        n6.d.e(i7, this);
        return this.f7822k.get(i7 + this.f7823l);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i7 = this.f7824m;
        int i8 = this.f7823l;
        for (int i9 = i8; i9 < i7; i9++) {
            if (l.a(this.f7822k.get(i9), obj)) {
                return i9 - i8;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f7824m == this.f7823l;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i7 = this.f7824m - 1;
        int i8 = this.f7823l;
        if (i8 > i7) {
            return -1;
        }
        while (!l.a(this.f7822k.get(i7), obj)) {
            if (i7 == i8) {
                return -1;
            }
            i7--;
        }
        return i7 - i8;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i7 = this.f7824m;
        for (int i8 = this.f7823l; i8 < i7; i8++) {
            ?? r2 = this.f7822k;
            if (l.a(r2.get(i8), obj)) {
                r2.remove(i8);
                this.f7824m--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i7 = this.f7824m;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i7 != this.f7824m;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i7 = this.f7824m;
        int i8 = i7 - 1;
        int i9 = this.f7823l;
        if (i9 <= i8) {
            while (true) {
                ?? r32 = this.f7822k;
                if (!collection.contains(r32.get(i8))) {
                    r32.remove(i8);
                    this.f7824m--;
                }
                if (i8 == i9) {
                    break;
                }
                i8--;
            }
        }
        return i7 != this.f7824m;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        n6.d.e(i7, this);
        return this.f7822k.set(i7 + this.f7823l, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f7824m - this.f7823l;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i7, Object obj) {
        this.f7822k.add(i7 + this.f7823l, obj);
        this.f7824m++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return new c(i7, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return k.b(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f7822k.addAll(this.f7824m, collection);
        this.f7824m = collection.size() + this.f7824m;
        return collection.size() > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i7) {
        n6.d.e(i7, this);
        this.f7824m--;
        return this.f7822k.remove(i7 + this.f7823l);
    }
}
