package io.github.jan.supabase.collections;

import A3.e;
import D5.a;
import D5.b;
import E5.c;
import E5.i;
import P3.AbstractC0560a;
import P3.m;
import P3.q;
import f4.InterfaceC0883c;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.ktor.http.ContentDisposition;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u0010\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016J\u001d\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\fH\u0096\u0002¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0012H\u0016J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0096\u0002J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\fH\u0016J\u001e\u0010#\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010$J\u0015\u0010%\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\u001aJ\u0016\u0010&\u001a\u00020\u00122\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016J\u0016\u0010'\u001a\u00020\u00122\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016J\u0015\u0010(\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J\u0015\u0010)\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010*J\u0015\u0010+\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010*J\u0016\u0010,\u001a\u00020\u00122\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016J\u0016\u0010-\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0018J\u0018\u0010.\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006/"}, d2 = {"Lio/github/jan/supabase/collections/AtomicMutableList;", "E", "", "elements", "", "<init>", "([Ljava/lang/Object;)V", "list", "Lkotlin/concurrent/atomics/AtomicReference;", "Lkotlinx/collections/immutable/PersistentList;", "Ljava/util/concurrent/atomic/AtomicReference;", ContentDisposition.Parameters.Size, "", "getSize", "()I", "clear", "", "addAll", "", "", "index", "add", "element", "(ILjava/lang/Object;)V", "(Ljava/lang/Object;)Z", "get", "(I)Ljava/lang/Object;", "isEmpty", "iterator", "", "listIterator", "", "subList", "fromIndex", "toIndex", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "removeAt", "retainAll", "removeAll", "remove", "lastIndexOf", "(Ljava/lang/Object;)I", "indexOf", "containsAll", "contains", "checkElementIndex", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SupabaseInternal
/* loaded from: classes.dex */
public final class AtomicMutableList<E> implements List<E>, InterfaceC0883c {
    private final AtomicReference<b> list;

    public AtomicMutableList(E... eArr) {
        l.f("elements", eArr);
        Object[] objArrCopyOf = Arrays.copyOf(eArr, eArr.length);
        l.f("elements", objArrCopyOf);
        this.list = new AtomicReference<>(i.f1971l.addAll((Collection) m.P(objArrCopyOf)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b add$lambda$0(int i7, Object obj, b bVar) {
        l.f("current", bVar);
        return bVar.add(i7, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b add$lambda$1(Object obj, b bVar) {
        l.f("current", bVar);
        return bVar.add(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b addAll$lambda$0(Collection collection, b bVar) {
        l.f("current", bVar);
        return bVar.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b addAll$lambda$1(int i7, Collection collection, b bVar) {
        l.f("current", bVar);
        return bVar.addAll(i7, collection);
    }

    private final void checkElementIndex(int index, int size) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(A6.b.e(index, size, "index: ", ", size: "));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final b clear$lambda$0(b bVar) {
        l.f("it", bVar);
        return ((AbstractC0560a) bVar).isEmpty() ? bVar : i.f1971l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b remove$lambda$0(Object obj, b bVar) {
        l.f("current", bVar);
        c cVar = (c) bVar;
        int iIndexOf = cVar.indexOf(obj);
        return iIndexOf != -1 ? cVar.f(iIndexOf) : cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b removeAll$lambda$0(Collection collection, b bVar) {
        l.f("current", bVar);
        c cVar = (c) bVar;
        l.f("elements", collection);
        return collection.isEmpty() ? cVar : cVar.n(new E5.b(1, collection));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b retainAll$lambda$0(Collection collection, b bVar) {
        l.f("current", bVar);
        c cVar = (c) bVar;
        l.f("elements", collection);
        return collection.isEmpty() ? i.f1971l : cVar.n(new E5.b(0, collection));
    }

    @Override // java.util.List
    public void add(int index, E element) {
        AtomicUtilsKt.update(this.list, new K3.b(index, 1, element));
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> elements) {
        l.f("elements", elements);
        if (elements.isEmpty()) {
            return false;
        }
        return AtomicUtilsKt.updateIfChanged(this.list, new E5.b(4, elements));
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        AtomicUtilsKt.updateIfChanged(this.list, new e(11));
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return ((c) this.list.get()).contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        l.f("elements", elements);
        return ((c) this.list.get()).containsAll(elements);
    }

    @Override // java.util.List
    public E get(int index) {
        return (E) this.list.get().get(index);
    }

    public int getSize() {
        return ((AbstractC0560a) ((b) this.list.get())).size();
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return this.list.get().indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return ((AbstractC0560a) ((b) this.list.get())).isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return q.U0(this.list.get()).iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return this.list.get().lastIndexOf(element);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return q.U0(this.list.get()).listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ E remove(int i7) {
        return removeAt(i7);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> elements) {
        l.f("elements", elements);
        if (elements.isEmpty()) {
            return false;
        }
        return AtomicUtilsKt.updateIfChanged(this.list, new E5.b(5, elements));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public E removeAt(int index) {
        while (true) {
            b bVar = this.list.get();
            checkElementIndex(index, ((AbstractC0560a) bVar).a());
            E e7 = (E) bVar.get(index);
            b bVarF = bVar.f(index);
            AtomicReference<b> atomicReference = this.list;
            while (!atomicReference.compareAndSet(bVar, bVarF)) {
                if (atomicReference.get() != bVar) {
                    break;
                }
            }
            return e7;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> elements) {
        l.f("elements", elements);
        return AtomicUtilsKt.updateIfChanged(this.list, new E5.b(3, elements));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public E set(int index, E element) {
        while (true) {
            b bVar = this.list.get();
            checkElementIndex(index, ((AbstractC0560a) bVar).a());
            E e7 = (E) bVar.get(index);
            b bVar2 = bVar.set(index, (Object) element);
            AtomicReference<b> atomicReference = this.list;
            while (!atomicReference.compareAndSet(bVar, bVar2)) {
                if (atomicReference.get() != bVar) {
                    break;
                }
            }
            return e7;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public List<E> subList(int fromIndex, int toIndex) {
        c cVar = (c) this.list.get();
        cVar.getClass();
        return q.U0(new a(cVar, fromIndex, toIndex));
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return k.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E element) {
        return AtomicUtilsKt.updateIfChanged(this.list, new K3.a(0, element));
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int index) {
        return q.U0(this.list.get()).listIterator(index);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        return AtomicUtilsKt.updateIfChanged(this.list, new K3.a(1, element));
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        l.f("array", tArr);
        return (T[]) k.b(this, tArr);
    }

    @Override // java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        l.f("elements", elements);
        if (elements.isEmpty()) {
            return false;
        }
        return AtomicUtilsKt.updateIfChanged(this.list, new K3.b(index, 0, elements));
    }
}
