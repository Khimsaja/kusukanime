package O3;

import f4.InterfaceC0881a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class y implements Collection, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final long[] f7549k;

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
        if (!(obj instanceof x)) {
            return false;
        }
        long j7 = ((x) obj).f7548k;
        long[] jArr = this.f7549k;
        int length = jArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            if (j7 == jArr[i7]) {
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
                if (obj instanceof x) {
                    long j7 = ((x) obj).f7548k;
                    long[] jArr = this.f7549k;
                    int length = jArr.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            i7 = -1;
                            break;
                        }
                        if (j7 == jArr[i7]) {
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
        if (obj instanceof y) {
            return kotlin.jvm.internal.l.a(this.f7549k, ((y) obj).f7549k);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f7549k);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f7549k.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new t(2, this.f7549k);
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
        return this.f7549k.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.f7549k) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        kotlin.jvm.internal.l.f("array", objArr);
        return kotlin.jvm.internal.k.b(this, objArr);
    }
}
