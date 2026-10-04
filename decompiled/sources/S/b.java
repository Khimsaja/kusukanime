package S;

import P3.AbstractC0564e;
import f4.InterfaceC0881a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class b extends AbstractC0564e implements List, Collection, InterfaceC0881a {
    @Override // P3.AbstractC0560a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // P3.AbstractC0560a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
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

    public abstract b h(int i7, Object obj);

    @Override // P3.AbstractC0564e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract b j(Object obj);

    @Override // P3.AbstractC0564e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public b m(Collection collection) {
        e eVarO = o();
        eVarO.addAll(collection);
        return eVarO.j();
    }

    public abstract e o();

    public abstract b p(a aVar);

    public abstract b q(int i7);

    public abstract b r(int i7, Object obj);

    @Override // P3.AbstractC0564e, java.util.List
    public final List subList(int i7, int i8) {
        return new D5.a(this, i7, i8);
    }
}
