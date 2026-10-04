package L0;

import M0.C0472e;
import M0.C0473f;
import P3.m;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c {
    public int[] a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f6001b;

    /* renamed from: c, reason: collision with root package name */
    public int f6002c;

    public final Object a(Object obj) {
        int iC = obj == null ? c() : b(obj.hashCode(), obj);
        if (iC >= 0) {
            return this.f6001b[(iC << 1) + 1];
        }
        return null;
    }

    public final int b(int i7, Object obj) {
        int i8 = this.f6002c;
        if (i8 == 0) {
            return -1;
        }
        int iA = a.a(i8, i7, this.a);
        if (iA < 0 || l.a(obj, this.f6001b[iA << 1])) {
            return iA;
        }
        int i9 = iA + 1;
        while (i9 < i8 && this.a[i9] == i7) {
            if (l.a(obj, this.f6001b[i9 << 1])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = iA - 1; i10 >= 0 && this.a[i10] == i7; i10--) {
            if (l.a(obj, this.f6001b[i10 << 1])) {
                return i10;
            }
        }
        return ~i9;
    }

    public final int c() {
        int i7 = this.f6002c;
        if (i7 == 0) {
            return -1;
        }
        int iA = a.a(i7, 0, this.a);
        if (iA < 0 || this.f6001b[iA << 1] == null) {
            return iA;
        }
        int i8 = iA + 1;
        while (i8 < i7 && this.a[i8] == 0) {
            if (this.f6001b[i8 << 1] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = iA - 1; i9 >= 0 && this.a[i9] == 0; i9--) {
            if (this.f6001b[i9 << 1] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    public final Object d(C0473f c0473f, C0472e c0472e) {
        int iHashCode;
        int iB;
        int i7 = this.f6002c;
        if (c0473f == null) {
            iB = c();
            iHashCode = 0;
        } else {
            iHashCode = c0473f.hashCode();
            iB = b(iHashCode, c0473f);
        }
        if (iB >= 0) {
            int i8 = (iB << 1) + 1;
            Object[] objArr = this.f6001b;
            Object obj = objArr[i8];
            objArr[i8] = c0472e;
            return obj;
        }
        int i9 = ~iB;
        int[] iArr = this.a;
        if (i7 >= iArr.length) {
            int i10 = 8;
            if (i7 >= 8) {
                i10 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i10 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            l.e("copyOf(this, newSize)", iArrCopyOf);
            this.a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f6001b, i10 << 1);
            l.e("copyOf(this, newSize)", objArrCopyOf);
            this.f6001b = objArrCopyOf;
            if (i7 != this.f6002c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i9 < i7) {
            int[] iArr2 = this.a;
            int i11 = i9 + 1;
            m.V(i11, i9, i7, iArr2, iArr2);
            Object[] objArr2 = this.f6001b;
            m.W(i11 << 1, i9 << 1, this.f6002c << 1, objArr2, objArr2);
        }
        int i12 = this.f6002c;
        if (i7 == i12) {
            int[] iArr3 = this.a;
            if (i9 < iArr3.length) {
                iArr3[i9] = iHashCode;
                Object[] objArr3 = this.f6001b;
                int i13 = i9 << 1;
                objArr3[i13] = c0473f;
                objArr3[i13 + 1] = c0472e;
                this.f6002c = i12 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final boolean equals(Object obj) {
        int i7;
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof c) {
                c cVar = (c) obj;
                int i8 = this.f6002c;
                if (i8 == cVar.f6002c) {
                    for (int i9 = 0; i9 < i8; i9++) {
                        Object[] objArr = this.f6001b;
                        int i10 = i9 << 1;
                        Object obj2 = objArr[i10];
                        Object obj3 = objArr[i10 + 1];
                        Object objA = cVar.a(obj2);
                        if (obj3 == null) {
                            if (objA == null) {
                                if ((obj2 == null ? cVar.c() : cVar.b(obj2.hashCode(), obj2)) >= 0) {
                                }
                            }
                        } else if (obj3.equals(objA)) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof Map) && this.f6002c == ((Map) obj).size()) {
                int i11 = this.f6002c;
                for (0; i7 < i11; i7 + 1) {
                    Object[] objArr2 = this.f6001b;
                    int i12 = i7 << 1;
                    Object obj4 = objArr2[i12];
                    Object obj5 = objArr2[i12 + 1];
                    Object obj6 = ((Map) obj).get(obj4);
                    if (obj5 == null) {
                        i7 = (obj6 == null && ((Map) obj).containsKey(obj4)) ? i7 + 1 : 0;
                    } else if (obj5.equals(obj6)) {
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        Object[] objArr = this.f6001b;
        int i7 = this.f6002c;
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

    public final String toString() {
        int i7 = this.f6002c;
        if (i7 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i7 * 28);
        sb.append('{');
        int i8 = this.f6002c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            int i10 = i9 << 1;
            Object obj = this.f6001b[i10];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.f6001b[i10 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
