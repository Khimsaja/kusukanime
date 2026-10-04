package E5;

import P3.AbstractC0564e;
import P3.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class c extends AbstractC0564e implements D5.b {
    @Override // java.util.List, D5.b
    public D5.b addAll(int i7, Collection collection) {
        l.f("c", collection);
        r.k(i7, a());
        if (collection.isEmpty()) {
            return this;
        }
        f fVarG = g();
        fVarG.addAll(i7, collection);
        return fVarG.j();
    }

    @Override // P3.AbstractC0560a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // P3.AbstractC0560a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        l.f("elements", collection);
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // P3.AbstractC0564e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // P3.AbstractC0564e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // P3.AbstractC0564e, java.util.List
    public final List subList(int i7, int i8) {
        return new D5.a(this, i7, i8);
    }

    @Override // java.util.Collection, java.util.List, D5.b
    public D5.b addAll(Collection collection) {
        l.f("elements", collection);
        if (collection.isEmpty()) {
            return this;
        }
        f fVarG = g();
        fVarG.addAll(collection);
        return fVarG.j();
    }
}
