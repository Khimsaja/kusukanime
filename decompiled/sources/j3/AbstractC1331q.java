package j3;

import b1.AbstractC0703b;
import f6.AbstractC0905c;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: j3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1331q {
    public static void a(int i7, Object[] objArr) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (objArr[i8] == null) {
                throw new NullPointerException(AbstractC0703b.g(i8, "at index "));
            }
        }
    }

    public static void b(int i7, String str) {
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i7);
    }

    public static Object c(int i7) {
        if (i7 < 2 || i7 > 1073741824 || Integer.highestOneBit(i7) != i7) {
            throw new IllegalArgumentException(AbstractC0703b.g(i7, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i7 <= 256 ? new byte[i7] : i7 <= 65536 ? new short[i7] : new int[i7];
    }

    public static boolean d(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean e(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static g0 f(Set set, i3.e eVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof g0)) {
                set.getClass();
                return new g0(set, eVar);
            }
            g0 g0Var = (g0) set;
            i3.e eVar2 = g0Var.f12352l;
            eVar2.getClass();
            return new g0(g0Var.f12351k, new i3.f(Arrays.asList(eVar2, eVar)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof g0)) {
            set2.getClass();
            return new h0(set2, eVar);
        }
        g0 g0Var2 = (g0) set2;
        i3.e eVar3 = g0Var2.f12352l;
        eVar3.getClass();
        return new h0((SortedSet) g0Var2.f12351k, new i3.f(Arrays.asList(eVar3, eVar)));
    }

    public static Object g(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int h(Set set) {
        Iterator it = set.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i7 = ~(~(i7 + (next != null ? next.hashCode() : 0)));
        }
        return i7;
    }

    public static f0 i(J j7, J j8) {
        if (j7 == null) {
            throw new NullPointerException("set1");
        }
        if (j8 != null) {
            return new f0(j7, j8);
        }
        throw new NullPointerException("set2");
    }

    public static int j(int i7, int i8, int i9) {
        return (i7 & (~i9)) | (i8 & i9);
    }

    public static ArrayList k(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static int l(Object obj, Object obj2, int i7, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i8;
        int i9;
        int iO = o(obj);
        int i10 = iO & i7;
        int iP = p(i10, obj3);
        if (iP != 0) {
            int i11 = ~i7;
            int i12 = iO & i11;
            int i13 = -1;
            while (true) {
                i8 = iP - 1;
                i9 = iArr[i8];
                if ((i9 & i11) == i12 && AbstractC0905c.l(obj, objArr[i8]) && (objArr2 == null || AbstractC0905c.l(obj2, objArr2[i8]))) {
                    break;
                }
                int i14 = i9 & i7;
                if (i14 == 0) {
                    break;
                }
                i13 = i8;
                iP = i14;
            }
            int i15 = i9 & i7;
            if (i13 == -1) {
                q(i10, i15, obj3);
                return i8;
            }
            iArr[i13] = j(iArr[i13], i15, i7);
            return i8;
        }
        return -1;
    }

    public static void m(List list, i3.e eVar, int i7, int i8) {
        for (int size = list.size() - 1; size > i8; size--) {
            if (eVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            list.remove(i9);
        }
    }

    public static int n(int i7) {
        return (int) (Integer.rotateLeft((int) (i7 * (-862048943)), 15) * 461845907);
    }

    public static int o(Object obj) {
        return n(obj == null ? 0 : obj.hashCode());
    }

    public static int p(int i7, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i7] & 255 : obj instanceof short[] ? ((short[]) obj)[i7] & 65535 : ((int[]) obj)[i7];
    }

    public static void q(int i7, int i8, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i7] = (byte) i8;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i7] = (short) i8;
        } else {
            ((int[]) obj)[i7] = i8;
        }
    }

    public static AbstractList r(List list, i3.d dVar) {
        return list != null ? new O(list, dVar) : new P(list, dVar);
    }
}
