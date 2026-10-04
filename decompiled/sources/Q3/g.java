package Q3;

import F5.k;
import f4.InterfaceC0885e;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class g implements Map, Serializable, InterfaceC0885e {

    /* renamed from: x, reason: collision with root package name */
    public static final g f7976x;

    /* renamed from: k, reason: collision with root package name */
    public Object[] f7977k;

    /* renamed from: l, reason: collision with root package name */
    public Object[] f7978l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f7979m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f7980n;

    /* renamed from: o, reason: collision with root package name */
    public int f7981o;

    /* renamed from: p, reason: collision with root package name */
    public int f7982p;

    /* renamed from: q, reason: collision with root package name */
    public int f7983q;

    /* renamed from: r, reason: collision with root package name */
    public int f7984r;

    /* renamed from: s, reason: collision with root package name */
    public int f7985s;

    /* renamed from: t, reason: collision with root package name */
    public h f7986t;

    /* renamed from: u, reason: collision with root package name */
    public k f7987u;

    /* renamed from: v, reason: collision with root package name */
    public h f7988v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7989w;

    static {
        g gVar = new g(0);
        gVar.f7989w = true;
        f7976x = gVar;
    }

    public g() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iO = o(obj);
            int i7 = this.f7981o * 2;
            int length = this.f7980n.length / 2;
            if (i7 > length) {
                i7 = length;
            }
            int i8 = 0;
            while (true) {
                int[] iArr = this.f7980n;
                int i9 = iArr[iO];
                if (i9 <= 0) {
                    int i10 = this.f7982p;
                    Object[] objArr = this.f7977k;
                    if (i10 < objArr.length) {
                        int i11 = i10 + 1;
                        this.f7982p = i11;
                        objArr[i10] = obj;
                        this.f7979m[i10] = iO;
                        iArr[iO] = i11;
                        this.f7985s++;
                        this.f7984r++;
                        if (i8 > this.f7981o) {
                            this.f7981o = i8;
                        }
                        return i10;
                    }
                    j(1);
                } else {
                    if (l.a(this.f7977k[i9 - 1], obj)) {
                        return -i9;
                    }
                    i8++;
                    if (i8 > i7) {
                        p(this.f7980n.length * 2);
                        break;
                    }
                    iO = iO == 0 ? this.f7980n.length - 1 : iO - 1;
                }
            }
        }
    }

    public final g b() {
        c();
        this.f7989w = true;
        if (this.f7985s > 0) {
            return this;
        }
        g gVar = f7976x;
        l.d("null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>", gVar);
        return gVar;
    }

    public final void c() {
        if (this.f7989w) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i7 = this.f7982p - 1;
        if (i7 >= 0) {
            int i8 = 0;
            while (true) {
                int[] iArr = this.f7979m;
                int i9 = iArr[i8];
                if (i9 >= 0) {
                    this.f7980n[i9] = 0;
                    iArr[i8] = -1;
                }
                if (i8 == i7) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        q0.c.M(this.f7977k, 0, this.f7982p);
        Object[] objArr = this.f7978l;
        if (objArr != null) {
            q0.c.M(objArr, 0, this.f7982p);
        }
        this.f7985s = 0;
        this.f7982p = 0;
        this.f7984r++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return k(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m(obj) >= 0;
    }

    public final void e(boolean z7) {
        int i7;
        Object[] objArr = this.f7978l;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i7 = this.f7982p;
            if (i8 >= i7) {
                break;
            }
            int[] iArr = this.f7979m;
            int i10 = iArr[i8];
            if (i10 >= 0) {
                Object[] objArr2 = this.f7977k;
                objArr2[i9] = objArr2[i8];
                if (objArr != null) {
                    objArr[i9] = objArr[i8];
                }
                if (z7) {
                    iArr[i9] = i10;
                    this.f7980n[i10] = i9 + 1;
                }
                i9++;
            }
            i8++;
        }
        q0.c.M(this.f7977k, i9, i7);
        if (objArr != null) {
            q0.c.M(objArr, i9, this.f7982p);
        }
        this.f7982p = i9;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        h hVar = this.f7988v;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 0);
        this.f7988v = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f7985s == map.size() && h(map.entrySet());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iK = k(obj);
        if (iK < 0) {
            return null;
        }
        Object[] objArr = this.f7978l;
        l.c(objArr);
        return objArr[iK];
    }

    public final boolean h(Collection collection) {
        l.f("m", collection);
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!i((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        d dVar = new d(this, 0);
        int i7 = 0;
        while (dVar.hasNext()) {
            int i8 = dVar.f7972k;
            g gVar = (g) dVar.f7975n;
            if (i8 >= gVar.f7982p) {
                throw new NoSuchElementException();
            }
            dVar.f7972k = i8 + 1;
            dVar.f7973l = i8;
            Object obj = gVar.f7977k[i8];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = gVar.f7978l;
            l.c(objArr);
            Object obj2 = objArr[dVar.f7973l];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            dVar.c();
            i7 += iHashCode ^ iHashCode2;
        }
        return i7;
    }

    public final boolean i(Map.Entry entry) {
        l.f("entry", entry);
        int iK = k(entry.getKey());
        if (iK < 0) {
            return false;
        }
        Object[] objArr = this.f7978l;
        l.c(objArr);
        return l.a(objArr[iK], entry.getValue());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f7985s == 0;
    }

    public final void j(int i7) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f7977k;
        int length = objArr.length;
        int i8 = this.f7982p;
        int i9 = length - i8;
        int i10 = i8 - this.f7985s;
        if (i9 < i7 && i9 + i10 >= i7 && i10 >= objArr.length / 4) {
            e(true);
            return;
        }
        int i11 = i8 + i7;
        if (i11 < 0) {
            throw new OutOfMemoryError();
        }
        if (i11 > objArr.length) {
            int length2 = objArr.length;
            int i12 = length2 + (length2 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - 2147483639 > 0) {
                i12 = i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i12);
            l.e("copyOf(...)", objArrCopyOf2);
            this.f7977k = objArrCopyOf2;
            Object[] objArr2 = this.f7978l;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i12);
                l.e("copyOf(...)", objArrCopyOf);
            } else {
                objArrCopyOf = null;
            }
            this.f7978l = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f7979m, i12);
            l.e("copyOf(...)", iArrCopyOf);
            this.f7979m = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i12 >= 1 ? i12 : 1) * 3);
            if (iHighestOneBit > this.f7980n.length) {
                p(iHighestOneBit);
            }
        }
    }

    public final int k(Object obj) {
        int iO = o(obj);
        int i7 = this.f7981o;
        while (true) {
            int i8 = this.f7980n[iO];
            if (i8 == 0) {
                return -1;
            }
            if (i8 > 0) {
                int i9 = i8 - 1;
                if (l.a(this.f7977k[i9], obj)) {
                    return i9;
                }
            }
            i7--;
            if (i7 < 0) {
                return -1;
            }
            iO = iO == 0 ? this.f7980n.length - 1 : iO - 1;
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        h hVar = this.f7986t;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 1);
        this.f7986t = hVar2;
        return hVar2;
    }

    public final int m(Object obj) {
        int i7 = this.f7982p;
        while (true) {
            i7--;
            if (i7 < 0) {
                return -1;
            }
            if (this.f7979m[i7] >= 0) {
                Object[] objArr = this.f7978l;
                l.c(objArr);
                if (l.a(objArr[i7], obj)) {
                    return i7;
                }
            }
        }
    }

    public final int o(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f7983q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f7979m[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r6) {
        /*
            r5 = this;
            int r0 = r5.f7984r
            int r0 = r0 + 1
            r5.f7984r = r0
            int r0 = r5.f7982p
            int r1 = r5.f7985s
            r2 = 0
            if (r0 <= r1) goto L10
            r5.e(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f7980n = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f7983q = r6
        L1c:
            int r6 = r5.f7982p
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f7977k
            r0 = r0[r2]
            int r0 = r5.o(r0)
            int r1 = r5.f7981o
        L2c:
            int[] r3 = r5.f7980n
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f7979m
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q3.g.p(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.f7978l;
        if (objArr == null) {
            int length = this.f7977k.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f7978l = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i7 = (-iA) - 1;
        Object obj3 = objArr[i7];
        objArr[i7] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        l.f("from", map);
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        j(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f7978l;
            if (objArr == null) {
                int length = this.f7977k.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f7978l = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i7 = (-iA) - 1;
                if (!l.a(entry.getValue(), objArr[i7])) {
                    objArr[i7] = entry.getValue();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0024->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f7977k
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.l.f(r1, r0)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f7978l
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f7979m
            r0 = r0[r12]
            int r1 = r11.f7981o
            int r1 = r1 * 2
            int[] r2 = r11.f7980n
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2e
            int[] r0 = r11.f7980n
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.f7981o
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.f7980n
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.f7980n
            r7 = r5[r0]
            if (r7 != 0) goto L44
            r5[r1] = r2
            goto L6c
        L44:
            if (r7 >= 0) goto L4b
            r5[r1] = r6
        L48:
            r1 = r0
            r4 = r2
            goto L65
        L4b:
            java.lang.Object[] r5 = r11.f7977k
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.o(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f7980n
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.f7979m
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.f7980n
            r0[r1] = r6
        L6c:
            int[] r0 = r11.f7979m
            r0[r12] = r6
            int r12 = r11.f7985s
            int r12 = r12 + r6
            r11.f7985s = r12
            int r12 = r11.f7984r
            int r12 = r12 + 1
            r11.f7984r = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q3.g.q(int):void");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iK = k(obj);
        if (iK < 0) {
            return null;
        }
        Object[] objArr = this.f7978l;
        l.c(objArr);
        Object obj2 = objArr[iK];
        q(iK);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f7985s;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f7985s * 3) + 2);
        sb.append("{");
        d dVar = new d(this, 0);
        int i7 = 0;
        while (dVar.hasNext()) {
            if (i7 > 0) {
                sb.append(", ");
            }
            int i8 = dVar.f7972k;
            g gVar = (g) dVar.f7975n;
            if (i8 >= gVar.f7982p) {
                throw new NoSuchElementException();
            }
            dVar.f7972k = i8 + 1;
            dVar.f7973l = i8;
            Object obj = gVar.f7977k[i8];
            if (obj == gVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = gVar.f7978l;
            l.c(objArr);
            Object obj2 = objArr[dVar.f7973l];
            if (obj2 == gVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            dVar.c();
            i7++;
        }
        sb.append("}");
        String string = sb.toString();
        l.e("toString(...)", string);
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        k kVar = this.f7987u;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(1, this);
        this.f7987u = kVar2;
        return kVar2;
    }

    public g(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i7];
        int[] iArr = new int[i7];
        int iHighestOneBit = Integer.highestOneBit((i7 < 1 ? 1 : i7) * 3);
        this.f7977k = objArr;
        this.f7978l = null;
        this.f7979m = iArr;
        this.f7980n = new int[iHighestOneBit];
        this.f7981o = 2;
        this.f7982p = 0;
        this.f7983q = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
