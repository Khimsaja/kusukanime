package Q;

import f4.InterfaceC0881a;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class c implements ListIterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final Object f7825k;

    /* renamed from: l, reason: collision with root package name */
    public int f7826l;

    public c(int i7, List list) {
        this.f7825k = list;
        this.f7826l = i7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f7825k.add(this.f7826l, obj);
        this.f7826l++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f7826l < this.f7825k.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7826l > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i7 = this.f7826l;
        this.f7826l = i7 + 1;
        return this.f7825k.get(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7826l;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i7 = this.f7826l - 1;
        this.f7826l = i7;
        return this.f7825k.get(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7826l - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i7 = this.f7826l - 1;
        this.f7826l = i7;
        this.f7825k.remove(i7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f7825k.set(this.f7826l, obj);
    }
}
