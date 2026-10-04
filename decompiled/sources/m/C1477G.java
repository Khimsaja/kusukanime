package m;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import n.AbstractC1529a;

/* renamed from: m.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1477G {

    /* renamed from: k, reason: collision with root package name */
    public int[] f12868k;

    /* renamed from: l, reason: collision with root package name */
    public Object[] f12869l;

    /* renamed from: m, reason: collision with root package name */
    public int f12870m;

    public C1477G(int i7) {
        this.f12868k = i7 == 0 ? AbstractC1529a.a : new int[i7];
        this.f12869l = i7 == 0 ? AbstractC1529a.f13115c : new Object[i7 << 1];
    }

    public final int a(Object obj) {
        int i7 = this.f12870m * 2;
        Object[] objArr = this.f12869l;
        if (obj == null) {
            for (int i8 = 1; i8 < i7; i8 += 2) {
                if (objArr[i8] == null) {
                    return i8 >> 1;
                }
            }
            return -1;
        }
        for (int i9 = 1; i9 < i7; i9 += 2) {
            if (obj.equals(objArr[i9])) {
                return i9 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i7, Object obj) {
        int i8 = this.f12870m;
        if (i8 == 0) {
            return -1;
        }
        int iA = AbstractC1529a.a(i8, i7, this.f12868k);
        if (iA < 0 || kotlin.jvm.internal.l.a(obj, this.f12869l[iA << 1])) {
            return iA;
        }
        int i9 = iA + 1;
        while (i9 < i8 && this.f12868k[i9] == i7) {
            if (kotlin.jvm.internal.l.a(obj, this.f12869l[i9 << 1])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = iA - 1; i10 >= 0 && this.f12868k[i10] == i7; i10--) {
            if (kotlin.jvm.internal.l.a(obj, this.f12869l[i10 << 1])) {
                return i10;
            }
        }
        return ~i9;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.f12870m > 0) {
            this.f12868k = AbstractC1529a.a;
            this.f12869l = AbstractC1529a.f13115c;
            this.f12870m = 0;
        }
        if (this.f12870m > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d() {
        int i7 = this.f12870m;
        if (i7 == 0) {
            return -1;
        }
        int iA = AbstractC1529a.a(i7, 0, this.f12868k);
        if (iA < 0 || this.f12869l[iA << 1] == null) {
            return iA;
        }
        int i8 = iA + 1;
        while (i8 < i7 && this.f12868k[i8] == 0) {
            if (this.f12869l[i8 << 1] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = iA - 1; i9 >= 0 && this.f12868k[i9] == 0; i9--) {
            if (this.f12869l[i9 << 1] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    public final Object e(int i7) {
        boolean z7 = false;
        if (i7 >= 0 && i7 < this.f12870m) {
            z7 = true;
        }
        if (z7) {
            return this.f12869l[i7 << 1];
        }
        AbstractC1529a.c("Expected index to be within 0..size()-1, but was " + i7);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C1477G) {
                int i7 = this.f12870m;
                if (i7 != ((C1477G) obj).f12870m) {
                    return false;
                }
                C1477G c1477g = (C1477G) obj;
                for (int i8 = 0; i8 < i7; i8++) {
                    Object objE = e(i8);
                    Object objH = h(i8);
                    Object obj2 = c1477g.get(objE);
                    if (objH == null) {
                        if (obj2 != null || !c1477g.containsKey(objE)) {
                            return false;
                        }
                    } else if (!objH.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f12870m != ((Map) obj).size()) {
                return false;
            }
            int i9 = this.f12870m;
            for (int i10 = 0; i10 < i9; i10++) {
                Object objE2 = e(i10);
                Object objH2 = h(i10);
                Object obj3 = ((Map) obj).get(objE2);
                if (objH2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objE2)) {
                        return false;
                    }
                } else if (!objH2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i7) {
        if (!(i7 >= 0 && i7 < this.f12870m)) {
            AbstractC1529a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        Object[] objArr = this.f12869l;
        int i8 = i7 << 1;
        Object obj = objArr[i8 + 1];
        int i9 = this.f12870m;
        if (i9 <= 1) {
            clear();
            return obj;
        }
        int i10 = i9 - 1;
        int[] iArr = this.f12868k;
        if (iArr.length <= 8 || i9 >= iArr.length / 3) {
            if (i7 < i10) {
                int i11 = i7 + 1;
                P3.m.V(i7, i11, i9, iArr, iArr);
                Object[] objArr2 = this.f12869l;
                P3.m.W(i8, i11 << 1, i9 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f12869l;
            int i12 = i10 << 1;
            objArr3[i12] = null;
            objArr3[i12 + 1] = null;
        } else {
            int i13 = i9 > 8 ? i9 + (i9 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", iArrCopyOf);
            this.f12868k = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f12869l, i13 << 1);
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", objArrCopyOf);
            this.f12869l = objArrCopyOf;
            if (i9 != this.f12870m) {
                throw new ConcurrentModificationException();
            }
            if (i7 > 0) {
                P3.m.V(0, 0, i7, iArr, this.f12868k);
                P3.m.W(0, 0, i8, objArr, this.f12869l);
            }
            if (i7 < i10) {
                int i14 = i7 + 1;
                P3.m.V(i7, i14, i9, iArr, this.f12868k);
                P3.m.W(i8, i14 << 1, i9 << 1, objArr, this.f12869l);
            }
        }
        if (i9 != this.f12870m) {
            throw new ConcurrentModificationException();
        }
        this.f12870m = i10;
        return obj;
    }

    public final Object g(int i7, Object obj) {
        boolean z7 = false;
        if (i7 >= 0 && i7 < this.f12870m) {
            z7 = true;
        }
        if (!z7) {
            AbstractC1529a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        int i8 = (i7 << 1) + 1;
        Object[] objArr = this.f12869l;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return this.f12869l[(iC << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iC = c(obj);
        return iC >= 0 ? this.f12869l[(iC << 1) + 1] : obj2;
    }

    public final Object h(int i7) {
        boolean z7 = false;
        if (i7 >= 0 && i7 < this.f12870m) {
            z7 = true;
        }
        if (z7) {
            return this.f12869l[(i7 << 1) + 1];
        }
        AbstractC1529a.c("Expected index to be within 0..size()-1, but was " + i7);
        throw null;
    }

    public final int hashCode() {
        int[] iArr = this.f12868k;
        Object[] objArr = this.f12869l;
        int i7 = this.f12870m;
        int i8 = 1;
        int i9 = 0;
        int iHashCode = 0;
        while (i9 < i7) {
            Object obj = objArr[i8];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i9];
            i9++;
            i8 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.f12870m <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i7 = this.f12870m;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iB = obj != null ? b(iHashCode, obj) : d();
        if (iB >= 0) {
            int i8 = (iB << 1) + 1;
            Object[] objArr = this.f12869l;
            Object obj3 = objArr[i8];
            objArr[i8] = obj2;
            return obj3;
        }
        int i9 = ~iB;
        int[] iArr = this.f12868k;
        if (i7 >= iArr.length) {
            int i10 = 8;
            if (i7 >= 8) {
                i10 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i10 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", iArrCopyOf);
            this.f12868k = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f12869l, i10 << 1);
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", objArrCopyOf);
            this.f12869l = objArrCopyOf;
            if (i7 != this.f12870m) {
                throw new ConcurrentModificationException();
            }
        }
        if (i9 < i7) {
            int[] iArr2 = this.f12868k;
            int i11 = i9 + 1;
            P3.m.V(i11, i9, i7, iArr2, iArr2);
            Object[] objArr2 = this.f12869l;
            P3.m.W(i11 << 1, i9 << 1, this.f12870m << 1, objArr2, objArr2);
        }
        int i12 = this.f12870m;
        if (i7 == i12) {
            int[] iArr3 = this.f12868k;
            if (i9 < iArr3.length) {
                iArr3[i9] = iHashCode;
                Object[] objArr3 = this.f12869l;
                int i13 = i9 << 1;
                objArr3[i13] = obj;
                objArr3[i13 + 1] = obj2;
                this.f12870m = i12 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return f(iC);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC >= 0) {
            return g(iC, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f12870m;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12870m * 28);
        sb.append('{');
        int i7 = this.f12870m;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object objE = e(i8);
            if (objE != sb) {
                sb.append(objE);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objH = h(i8);
            if (objH != sb) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.l.e("StringBuilder(capacity).…builderAction).toString()", string);
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC < 0 || !kotlin.jvm.internal.l.a(obj2, h(iC))) {
            return false;
        }
        f(iC);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iC = c(obj);
        if (iC < 0 || !kotlin.jvm.internal.l.a(obj2, h(iC))) {
            return false;
        }
        g(iC, obj3);
        return true;
    }
}
