package X4;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class L extends AbstractList implements RandomAccess, t {

    /* renamed from: k, reason: collision with root package name */
    public final C0621s f9856k;

    public L(C0621s c0621s) {
        this.f9856k = c0621s;
    }

    @Override // X4.t
    public final AbstractC0608e c(int i7) {
        return this.f9856k.c(i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return (String) this.f9856k.get(i7);
    }

    @Override // X4.t
    public final void i(v vVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        K k7 = new K();
        k7.f9855k = this.f9856k.iterator();
        return k7;
    }

    @Override // X4.t
    public final List k() {
        return Collections.unmodifiableList(this.f9856k.f9909k);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        J j7 = new J();
        j7.f9854k = this.f9856k.listIterator(i7);
        return j7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9856k.size();
    }

    @Override // X4.t
    public final L e() {
        return this;
    }
}
