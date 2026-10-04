package O3;

import f4.InterfaceC0881a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class B implements Collection, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final short[] f7510k;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof A)) {
            return false;
        }
        short s7 = ((A) obj).f7509k;
        short[] sArr = this.f7510k;
        int length = sArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            if (s7 == sArr[i7]) {
                break;
            }
            i7++;
        }
        return i7 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        Collection collection2 = collection;
        if (!collection2.isEmpty()) {
            for (Object obj : collection2) {
                if (obj instanceof A) {
                    short s7 = ((A) obj).f7509k;
                    short[] sArr = this.f7510k;
                    int length = sArr.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            i7 = -1;
                            break;
                        }
                        if (s7 == sArr[i7]) {
                            break;
                        }
                        i7++;
                    }
                    if (i7 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof B) {
            return kotlin.jvm.internal.l.a(this.f7510k, ((B) obj).f7510k);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f7510k);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f7510k.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new t(3, this.f7510k);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f7510k.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.f7510k) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        kotlin.jvm.internal.l.f("array", objArr);
        return kotlin.jvm.internal.k.b(this, objArr);
    }
}
