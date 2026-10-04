package m;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: m.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1483d implements Collection {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1484e f12887k;

    public C1483d(C1484e c1484e) {
        this.f12887k = c1484e;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f12887k.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12887k.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f12887k.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1480a(this.f12887k, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C1484e c1484e = this.f12887k;
        int iA = c1484e.a(obj);
        if (iA < 0) {
            return false;
        }
        c1484e.f(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C1484e c1484e = this.f12887k;
        int i7 = c1484e.f12870m;
        int i8 = 0;
        boolean z7 = false;
        while (i8 < i7) {
            if (collection.contains(c1484e.h(i8))) {
                c1484e.f(i8);
                i8--;
                i7--;
                z7 = true;
            }
            i8++;
        }
        return z7;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1484e c1484e = this.f12887k;
        int i7 = c1484e.f12870m;
        int i8 = 0;
        boolean z7 = false;
        while (i8 < i7) {
            if (!collection.contains(c1484e.h(i8))) {
                c1484e.f(i8);
                i8--;
                i7--;
                z7 = true;
            }
            i8++;
        }
        return z7;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f12887k.f12870m;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C1484e c1484e = this.f12887k;
        int i7 = c1484e.f12870m;
        Object[] objArr = new Object[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = c1484e.h(i8);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1484e c1484e = this.f12887k;
        int i7 = c1484e.f12870m;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        }
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = c1484e.h(i8);
        }
        if (objArr.length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
