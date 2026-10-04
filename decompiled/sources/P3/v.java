package P3;

import f4.InterfaceC0881a;
import f4.InterfaceC0882b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class v extends u {
    public static void e0(Collection collection, Iterable iterable) {
        kotlin.jvm.internal.l.f("<this>", collection);
        kotlin.jvm.internal.l.f("elements", iterable);
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void f0(List list, Object[] objArr) {
        kotlin.jvm.internal.l.f("<this>", list);
        kotlin.jvm.internal.l.f("elements", objArr);
        list.addAll(m.P(objArr));
    }

    public static void g0(e4.k kVar, List list) {
        int iY;
        kotlin.jvm.internal.l.f("<this>", list);
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof InterfaceC0881a) && !(list instanceof InterfaceC0882b)) {
                kotlin.jvm.internal.B.j("kotlin.collections.MutableIterable", list);
                throw null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) kVar.invoke(it.next())).booleanValue()) {
                    it.remove();
                }
            }
            return;
        }
        int iY2 = r.y(list);
        int i7 = 0;
        if (iY2 >= 0) {
            int i8 = 0;
            while (true) {
                Object obj = list.get(i7);
                if (!((Boolean) kVar.invoke(obj)).booleanValue()) {
                    if (i8 != i7) {
                        list.set(i8, obj);
                    }
                    i8++;
                }
                if (i7 == iY2) {
                    break;
                } else {
                    i7++;
                }
            }
            i7 = i8;
        }
        if (i7 >= list.size() || i7 > (iY = r.y(list))) {
            return;
        }
        while (true) {
            list.remove(iY);
            if (iY == i7) {
                return;
            } else {
                iY--;
            }
        }
    }

    public static Object h0(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static Object i0(List list) {
        kotlin.jvm.internal.l.f("<this>", list);
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(r.y(list));
    }
}
