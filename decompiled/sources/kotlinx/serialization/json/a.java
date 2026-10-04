package kotlinx.serialization.json;

import P3.q;
import V5.i;
import a6.g;
import f4.InterfaceC0881a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

@i(with = g.class)
/* loaded from: classes.dex */
public final class a extends b implements List<b>, InterfaceC0881a {
    public static final JsonArray$Companion Companion = new JsonArray$Companion();

    /* renamed from: k, reason: collision with root package name */
    public final List f12721k;

    public a(List list) {
        l.f("content", list);
        this.f12721k = list;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i7, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection<? extends b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        l.f("element", bVar);
        return this.f12721k.contains(bVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        l.f("elements", collection);
        return this.f12721k.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return l.a(this.f12721k, obj);
    }

    @Override // java.util.List
    public final b get(int i7) {
        return (b) this.f12721k.get(i7);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f12721k.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof b)) {
            return -1;
        }
        b bVar = (b) obj;
        l.f("element", bVar);
        return this.f12721k.indexOf(bVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f12721k.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f12721k.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof b)) {
            return -1;
        }
        b bVar = (b) obj;
        l.f("element", bVar);
        return this.f12721k.lastIndexOf(bVar);
    }

    @Override // java.util.List
    public final ListIterator<b> listIterator() {
        return this.f12721k.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ b remove(int i7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<b> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ b set(int i7, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f12721k.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super b> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<b> subList(int i7, int i8) {
        return this.f12721k.subList(i7, i8);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return k.a(this);
    }

    public final String toString() {
        return q.y0(this.f12721k, ",", "[", "]", null, 56);
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
    public final ListIterator<b> listIterator(int i7) {
        return this.f12721k.listIterator(i7);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        l.f("array", objArr);
        return k.b(this, objArr);
    }
}
