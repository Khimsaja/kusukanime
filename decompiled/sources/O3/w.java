package O3;

import f4.InterfaceC0881a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class w implements Collection, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final int[] f7547k;

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
        if (!(obj instanceof v)) {
            return false;
        }
        int i7 = ((v) obj).f7546k;
        int[] iArr = this.f7547k;
        int length = iArr.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                i8 = -1;
                break;
            }
            if (i7 == iArr[i8]) {
                break;
            }
            i8++;
        }
        return i8 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        Collection collection2 = collection;
        if (!collection2.isEmpty()) {
            for (Object obj : collection2) {
                if (obj instanceof v) {
                    int i7 = ((v) obj).f7546k;
                    int[] iArr = this.f7547k;
                    int length = iArr.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            i8 = -1;
                            break;
                        }
                        if (i7 == iArr[i8]) {
                            break;
                        }
                        i8++;
                    }
                    if (i8 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return kotlin.jvm.internal.l.a(this.f7547k, ((w) obj).f7547k);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f7547k);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f7547k.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new t(1, this.f7547k);
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
        return this.f7547k.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f7547k) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        kotlin.jvm.internal.l.f("array", objArr);
        return kotlin.jvm.internal.k.b(this, objArr);
    }
}
