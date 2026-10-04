package P3;

import e5.AbstractC0832b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public abstract class m extends z1.c {
    public static Iterable O(Object[] objArr) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        return objArr.length == 0 ? y.f7779k : new o(0, objArr);
    }

    public static List P(Object[] objArr) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        List listAsList = Arrays.asList(objArr);
        kotlin.jvm.internal.l.e("asList(...)", listAsList);
        return listAsList;
    }

    public static y5.h Q(Object[] objArr) {
        return objArr.length == 0 ? y5.d.a : new p(0, objArr);
    }

    public static boolean R(Object obj, Object[] objArr) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        return l0(obj, objArr) >= 0;
    }

    public static boolean S(char[] cArr, char c2) {
        int length = cArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            if (c2 == cArr[i7]) {
                break;
            }
            i7++;
        }
        return i7 >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [long[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [short[]] */
    public static boolean T(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            Object obj = objArr[i7];
            Object obj2 = objArr2[i7];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!T((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof O3.u) && (obj2 instanceof O3.u)) {
                    O3.u uVar = (O3.u) obj2;
                    byte[] bArr = ((O3.u) obj).f7545k;
                    if (bArr == null) {
                        bArr = null;
                    }
                    byte[] bArr2 = uVar.f7545k;
                    if (!Arrays.equals(bArr, bArr2 != null ? bArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof O3.B) && (obj2 instanceof O3.B)) {
                    O3.B b4 = (O3.B) obj2;
                    short[] sArr = ((O3.B) obj).f7510k;
                    if (sArr == null) {
                        sArr = null;
                    }
                    ?? r52 = b4.f7510k;
                    if (!Arrays.equals(sArr, (short[]) (r52 != 0 ? r52 : null))) {
                        return false;
                    }
                } else if ((obj instanceof O3.w) && (obj2 instanceof O3.w)) {
                    O3.w wVar = (O3.w) obj2;
                    int[] iArr = ((O3.w) obj).f7547k;
                    if (iArr == null) {
                        iArr = null;
                    }
                    ?? r53 = wVar.f7547k;
                    if (!Arrays.equals(iArr, (int[]) (r53 != 0 ? r53 : null))) {
                        return false;
                    }
                } else if ((obj instanceof O3.y) && (obj2 instanceof O3.y)) {
                    O3.y yVar = (O3.y) obj2;
                    long[] jArr = ((O3.y) obj).f7549k;
                    if (jArr == null) {
                        jArr = null;
                    }
                    ?? r54 = yVar.f7549k;
                    if (!Arrays.equals(jArr, (long[]) (r54 != 0 ? r54 : null))) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void U(int i7, int i8, int i9, byte[] bArr, byte[] bArr2) {
        kotlin.jvm.internal.l.f("<this>", bArr);
        kotlin.jvm.internal.l.f("destination", bArr2);
        System.arraycopy(bArr, i8, bArr2, i7, i9 - i8);
    }

    public static void V(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        kotlin.jvm.internal.l.f("<this>", iArr);
        kotlin.jvm.internal.l.f("destination", iArr2);
        System.arraycopy(iArr, i8, iArr2, i7, i9 - i8);
    }

    public static void W(int i7, int i8, int i9, Object[] objArr, Object[] objArr2) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        kotlin.jvm.internal.l.f("destination", objArr2);
        System.arraycopy(objArr, i8, objArr2, i7, i9 - i8);
    }

    public static void X(char[] cArr, char[] cArr2, int i7, int i8, int i9) {
        kotlin.jvm.internal.l.f("<this>", cArr);
        kotlin.jvm.internal.l.f("destination", cArr2);
        System.arraycopy(cArr, i8, cArr2, i7, i9 - i8);
    }

    public static /* synthetic */ void Y(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 8) != 0) {
            i8 = iArr.length;
        }
        V(i7, 0, i8, iArr, iArr2);
    }

    public static /* synthetic */ void Z(int i7, int i8, int i9, Object[] objArr, Object[] objArr2) {
        if ((i9 & 4) != 0) {
            i7 = 0;
        }
        if ((i9 & 8) != 0) {
            i8 = objArr.length;
        }
        W(0, i7, i8, objArr, objArr2);
    }

    public static byte[] a0(byte[] bArr, int i7, int i8) {
        kotlin.jvm.internal.l.f("<this>", bArr);
        z1.c.j(i8, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i7, i8);
        kotlin.jvm.internal.l.e("copyOfRange(...)", bArrCopyOfRange);
        return bArrCopyOfRange;
    }

    public static Object[] b0(Object[] objArr, int i7, int i8) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        z1.c.j(i8, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i7, i8);
        kotlin.jvm.internal.l.e("copyOfRange(...)", objArrCopyOfRange);
        return objArrCopyOfRange;
    }

    public static void c0(Object[] objArr, int i7, int i8) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        Arrays.fill(objArr, i7, i8, (Object) null);
    }

    public static void d0(int[] iArr, int i7) {
        int length = iArr.length;
        kotlin.jvm.internal.l.f("<this>", iArr);
        Arrays.fill(iArr, 0, length, i7);
    }

    public static void e0(long[] jArr) {
        int length = jArr.length;
        kotlin.jvm.internal.l.f("<this>", jArr);
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    public static ArrayList g0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object h0(Object[] objArr) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object i0(Object[] objArr) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static k4.g j0(int[] iArr) {
        return new k4.g(0, iArr.length - 1, 1);
    }

    public static Integer k0(int[] iArr, int i7) {
        kotlin.jvm.internal.l.f("<this>", iArr);
        if (i7 < 0 || i7 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i7]);
    }

    public static int l0(Object obj, Object[] objArr) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        int i7 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i7 < length) {
                if (objArr[i7] == null) {
                    return i7;
                }
                i7++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i7 < length2) {
            if (obj.equals(objArr[i7])) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public static final void m0(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, e4.k kVar) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        sb.append(charSequence2);
        int i7 = 0;
        for (Object obj : objArr) {
            i7++;
            if (i7 > 1) {
                sb.append(charSequence);
            }
            AbstractC0832b.h(sb, obj, kVar);
        }
        sb.append(charSequence3);
    }

    public static String n0(Object[] objArr, String str, String str2, String str3, e4.k kVar, int i7) {
        String str4 = (i7 & 2) != 0 ? "" : str2;
        String str5 = (i7 & 4) != 0 ? "" : str3;
        if ((i7 & 32) != 0) {
            kVar = null;
        }
        kotlin.jvm.internal.l.f("<this>", objArr);
        StringBuilder sb = new StringBuilder();
        m0(objArr, sb, str, str4, str5, "...", kVar);
        return sb.toString();
    }

    public static Object o0(Object[] objArr) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int p0(Object obj, Object[] objArr) {
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i7 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i7 < 0) {
                        break;
                    }
                    length = i7;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i8 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i8 < 0) {
                        break;
                    }
                    length2 = i8;
                }
            }
        }
        return -1;
    }

    public static char q0(char[] cArr) {
        kotlin.jvm.internal.l.f("<this>", cArr);
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object r0(Object[] objArr) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static List s0(Object[] objArr, Comparator comparator) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.l.e("copyOf(...)", objArr);
            if (objArr.length > 1) {
                Arrays.sort(objArr, comparator);
            }
        }
        return P(objArr);
    }

    public static final void t0(Object[] objArr, LinkedHashSet linkedHashSet) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
    }

    public static List u0(Object[] objArr) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new k(objArr, false)) : r.H(objArr[0]) : y.f7779k;
    }

    public static Set v0(Object[] objArr) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        int length = objArr.length;
        if (length == 0) {
            return A.f7737k;
        }
        if (length == 1) {
            return AbstractC1420H.K(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(F.I(objArr.length));
        t0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static ArrayList w0(Object[] objArr, Object[] objArr2) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        kotlin.jvm.internal.l.f("other", objArr2);
        int iMin = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i7 = 0; i7 < iMin; i7++) {
            arrayList.add(new O3.l(objArr[i7], objArr2[i7]));
        }
        return arrayList;
    }
}
