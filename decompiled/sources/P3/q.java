package P3;

import b1.AbstractC0703b;
import e5.AbstractC0832b;
import java.io.IOException;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import l4.AbstractC1420H;
import v.c0;

/* loaded from: classes.dex */
public abstract class q extends v {
    public static Object A0(List list) {
        kotlin.jvm.internal.l.f("<this>", list);
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(r.y(list));
    }

    public static Object B0(List list) {
        kotlin.jvm.internal.l.f("<this>", list);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable C0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList D0(List list, Serializable serializable) {
        kotlin.jvm.internal.l.f("<this>", list);
        ArrayList arrayList = new ArrayList(r.p(list, 10));
        boolean z7 = false;
        for (Object obj : list) {
            boolean z8 = true;
            if (!z7 && kotlin.jvm.internal.l.a(obj, serializable)) {
                z7 = true;
                z8 = false;
            }
            if (z8) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList E0(Iterable iterable, Iterable iterable2) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        if (iterable instanceof Collection) {
            return G0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        v.e0(arrayList, iterable);
        v.e0(arrayList, iterable2);
        return arrayList;
    }

    public static ArrayList F0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return H0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        v.e0(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList G0(Collection collection, Iterable iterable) {
        kotlin.jvm.internal.l.f("<this>", collection);
        kotlin.jvm.internal.l.f("elements", iterable);
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            v.e0(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList H0(Collection collection, Object obj) {
        kotlin.jvm.internal.l.f("<this>", collection);
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List I0(Iterable iterable) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return S0(iterable);
        }
        List listV0 = V0(iterable);
        Collections.reverse(listV0);
        return listV0;
    }

    public static Object J0(Iterable iterable) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        if (iterable instanceof List) {
            return K0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object K0(List list) {
        kotlin.jvm.internal.l.f("<this>", list);
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object L0(Iterable iterable) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object M0(List list) {
        kotlin.jvm.internal.l.f("<this>", list);
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List N0(List list, k4.g gVar) {
        kotlin.jvm.internal.l.f("<this>", list);
        kotlin.jvm.internal.l.f("indices", gVar);
        if (gVar.isEmpty()) {
            return y.f7779k;
        }
        return S0(list.subList(gVar.f12672k, gVar.f12673l + 1));
    }

    public static List O0(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        if (!(iterable instanceof Collection)) {
            List listV0 = V0(iterable);
            u.d0(listV0, comparator);
            return listV0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return S0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        kotlin.jvm.internal.l.f("<this>", array);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return m.P(array);
    }

    public static List P0(Iterable iterable, int i7) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        if (i7 < 0) {
            throw new IllegalArgumentException(c0.a(i7, "Requested element count ", " is less than zero.").toString());
        }
        if (i7 == 0) {
            return y.f7779k;
        }
        if (iterable instanceof Collection) {
            if (i7 >= ((Collection) iterable).size()) {
                return S0(iterable);
            }
            if (i7 == 1) {
                return r.H(q0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i7);
        Iterator it = iterable.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i8++;
            if (i8 == i7) {
                break;
            }
        }
        return r.O(arrayList);
    }

    public static final void Q0(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] R0(List list) {
        kotlin.jvm.internal.l.f("<this>", list);
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            iArr[i7] = ((Number) it.next()).intValue();
            i7++;
        }
        return iArr;
    }

    public static List S0(Iterable iterable) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        if (!(iterable instanceof Collection)) {
            return r.O(V0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return y.f7779k;
        }
        if (size != 1) {
            return U0(collection);
        }
        return r.H(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] T0(List list) {
        kotlin.jvm.internal.l.f("<this>", list);
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            jArr[i7] = ((Number) it.next()).longValue();
            i7++;
        }
        return jArr;
    }

    public static ArrayList U0(Collection collection) {
        kotlin.jvm.internal.l.f("<this>", collection);
        return new ArrayList(collection);
    }

    public static final List V0(Iterable iterable) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        if (iterable instanceof Collection) {
            return U0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        Q0(iterable, arrayList);
        return arrayList;
    }

    public static Set W0(Iterable iterable) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Q0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set X0(Iterable iterable) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        boolean z7 = iterable instanceof Collection;
        A a = A.f7737k;
        if (z7) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return AbstractC1420H.K(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(F.I(collection.size()));
                Q0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Q0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : AbstractC1420H.K(linkedHashSet2.iterator().next());
            }
        }
        return a;
    }

    public static o Y0(List list) {
        kotlin.jvm.internal.l.f("<this>", list);
        return new o(1, new w(0, list));
    }

    public static ArrayList Z0(Collection collection, Collection collection2) {
        kotlin.jvm.internal.l.f("<this>", collection);
        kotlin.jvm.internal.l.f("other", collection2);
        Iterator it = collection.iterator();
        Iterator it2 = collection2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(r.p(collection, 10), r.p(collection2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new O3.l(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final int j0(int i7, List list) {
        if (i7 >= 0 && i7 <= r.y(list)) {
            return r.y(list) - i7;
        }
        StringBuilder sbP = AbstractC0703b.p(i7, "Element index ", " must be in range [");
        sbP.append(new k4.g(0, r.y(list), 1));
        sbP.append("].");
        throw new IndexOutOfBoundsException(sbP.toString());
    }

    public static final int k0(int i7, List list) {
        if (i7 >= 0 && i7 <= list.size()) {
            return list.size() - i7;
        }
        StringBuilder sbP = AbstractC0703b.p(i7, "Position index ", " must be in range [");
        sbP.append(new k4.g(0, list.size(), 1));
        sbP.append("].");
        throw new IndexOutOfBoundsException(sbP.toString());
    }

    public static p l0(Iterable iterable) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        return new p(1, iterable);
    }

    public static boolean m0(Iterable iterable, Object obj) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : v0(iterable, obj) >= 0;
    }

    public static List n0(Iterable iterable) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        return S0(W0(iterable));
    }

    public static List o0(Iterable iterable, int i7) {
        ArrayList arrayList;
        kotlin.jvm.internal.l.f("<this>", iterable);
        if (i7 < 0) {
            throw new IllegalArgumentException(c0.a(i7, "Requested element count ", " is less than zero.").toString());
        }
        if (i7 == 0) {
            return S0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i7;
            if (size <= 0) {
                return y.f7779k;
            }
            if (size == 1) {
                return r.H(z0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i7 < size2) {
                        arrayList.add(list.get(i7));
                        i7++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i7);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i8 = 0;
        for (Object obj : iterable) {
            if (i8 >= i7) {
                arrayList.add(obj);
            } else {
                i8++;
            }
        }
        return r.O(arrayList);
    }

    public static List p0(List list) {
        kotlin.jvm.internal.l.f("<this>", list);
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return P0(list, size);
    }

    public static Object q0(Iterable iterable) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        if (iterable instanceof List) {
            return r0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object r0(List list) {
        kotlin.jvm.internal.l.f("<this>", list);
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object s0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object t0(List list) {
        kotlin.jvm.internal.l.f("<this>", list);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object u0(int i7, List list) {
        kotlin.jvm.internal.l.f("<this>", list);
        if (i7 < 0 || i7 >= list.size()) {
            return null;
        }
        return list.get(i7);
    }

    public static int v0(Iterable iterable, Object obj) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i7 = 0;
        for (Object obj2 : iterable) {
            if (i7 < 0) {
                r.X();
                throw null;
            }
            if (kotlin.jvm.internal.l.a(obj, obj2)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public static final void w0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, e4.k kVar) throws IOException {
        kotlin.jvm.internal.l.f("<this>", iterable);
        kotlin.jvm.internal.l.f("buffer", appendable);
        kotlin.jvm.internal.l.f("separator", charSequence);
        kotlin.jvm.internal.l.f("prefix", charSequence2);
        kotlin.jvm.internal.l.f("postfix", charSequence3);
        appendable.append(charSequence2);
        int i7 = 0;
        for (Object obj : iterable) {
            i7++;
            if (i7 > 1) {
                appendable.append(charSequence);
            }
            AbstractC0832b.h(appendable, obj, kVar);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ void x0(Iterable iterable, Appendable appendable, String str, String str2, String str3, e4.k kVar, int i7) throws IOException {
        if ((i7 & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i7 & 4) != 0 ? "" : str2;
        String str6 = (i7 & 8) != 0 ? "" : str3;
        if ((i7 & 64) != 0) {
            kVar = null;
        }
        w0(iterable, appendable, str4, str5, str6, "...", kVar);
    }

    public static String y0(Iterable iterable, String str, String str2, String str3, e4.k kVar, int i7) throws IOException {
        if ((i7 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i7 & 2) != 0 ? "" : str2;
        String str6 = (i7 & 4) != 0 ? "" : str3;
        if ((i7 & 32) != 0) {
            kVar = null;
        }
        kotlin.jvm.internal.l.f("<this>", iterable);
        kotlin.jvm.internal.l.f("prefix", str5);
        StringBuilder sb = new StringBuilder();
        w0(iterable, sb, str4, str5, str6, "...", kVar);
        return sb.toString();
    }

    public static Object z0(Iterable iterable) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        if (iterable instanceof List) {
            return A0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }
}
