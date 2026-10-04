package O0;

import P3.y;
import f4.InterfaceC0881a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class b implements Collection, InterfaceC0881a {

    /* renamed from: m, reason: collision with root package name */
    public static final b f7249m = new b(y.f7779k);

    /* renamed from: k, reason: collision with root package name */
    public final List f7250k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7251l;

    public b(List list) {
        this.f7250k = list;
        this.f7251l = list.size();
    }

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
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f7250k.contains((a) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f7250k.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return l.a(this.f7250k, ((b) obj).f7250k);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f7250k.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f7250k.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f7250k.iterator();
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
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f7251l;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return k.a(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.f7250k + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return k.b(this, objArr);
    }
}
