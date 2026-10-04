package j3;

import f6.AbstractC0905c;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: j3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1334u extends AbstractMap implements Serializable {

    /* renamed from: t, reason: collision with root package name */
    public static final Object f12383t = new Object();

    /* renamed from: k, reason: collision with root package name */
    public transient Object f12384k;

    /* renamed from: l, reason: collision with root package name */
    public transient int[] f12385l;

    /* renamed from: m, reason: collision with root package name */
    public transient Object[] f12386m;

    /* renamed from: n, reason: collision with root package name */
    public transient Object[] f12387n;

    /* renamed from: o, reason: collision with root package name */
    public transient int f12388o;

    /* renamed from: p, reason: collision with root package name */
    public transient int f12389p;

    /* renamed from: q, reason: collision with root package name */
    public transient C1332s f12390q;

    /* renamed from: r, reason: collision with root package name */
    public transient C1332s f12391r;

    /* renamed from: s, reason: collision with root package name */
    public transient C1328n f12392s;

    public static C1334u a() {
        C1334u c1334u = new C1334u();
        c1334u.f12388o = Math.min(Math.max(8, 1), 1073741823);
        return c1334u;
    }

    public final Map b() {
        Object obj = this.f12384k;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.f12388o & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.f12388o += 32;
        Map mapB = b();
        if (mapB != null) {
            this.f12388o = Math.min(Math.max(size(), 3), 1073741823);
            mapB.clear();
            this.f12384k = null;
            this.f12389p = 0;
            return;
        }
        Arrays.fill(i(), 0, this.f12389p, (Object) null);
        Arrays.fill(j(), 0, this.f12389p, (Object) null);
        Object obj = this.f12384k;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(h(), 0, this.f12389p, 0);
        this.f12389p = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapB = b();
        return mapB != null ? mapB.containsKey(obj) : d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.containsValue(obj);
        }
        for (int i7 = 0; i7 < this.f12389p; i7++) {
            if (AbstractC0905c.l(obj, j()[i7])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (f()) {
            return -1;
        }
        int iO = AbstractC1331q.o(obj);
        int iC = c();
        Object obj2 = this.f12384k;
        Objects.requireNonNull(obj2);
        int iP = AbstractC1331q.p(iO & iC, obj2);
        if (iP == 0) {
            return -1;
        }
        int i7 = ~iC;
        int i8 = iO & i7;
        do {
            int i9 = iP - 1;
            int i10 = h()[i9];
            if ((i10 & i7) == i8 && AbstractC0905c.l(obj, i()[i9])) {
                return i9;
            }
            iP = i10 & iC;
        } while (iP != 0);
        return -1;
    }

    public final void e(int i7, int i8) {
        Object obj = this.f12384k;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        Object[] objArrI = i();
        Object[] objArrJ = j();
        int size = size();
        int i9 = size - 1;
        if (i7 >= i9) {
            objArrI[i7] = null;
            objArrJ[i7] = null;
            iArrH[i7] = 0;
            return;
        }
        Object obj2 = objArrI[i9];
        objArrI[i7] = obj2;
        objArrJ[i7] = objArrJ[i9];
        objArrI[i9] = null;
        objArrJ[i9] = null;
        iArrH[i7] = iArrH[i9];
        iArrH[i9] = 0;
        int iO = AbstractC1331q.o(obj2) & i8;
        int iP = AbstractC1331q.p(iO, obj);
        if (iP == size) {
            AbstractC1331q.q(iO, i7 + 1, obj);
            return;
        }
        while (true) {
            int i10 = iP - 1;
            int i11 = iArrH[i10];
            int i12 = i11 & i8;
            if (i12 == size) {
                iArrH[i10] = AbstractC1331q.j(i11, i7 + 1, i8);
                return;
            }
            iP = i12;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C1332s c1332s = this.f12391r;
        if (c1332s != null) {
            return c1332s;
        }
        C1332s c1332s2 = new C1332s(this, 0);
        this.f12391r = c1332s2;
        return c1332s2;
    }

    public final boolean f() {
        return this.f12384k == null;
    }

    public final Object g(Object obj) {
        boolean zF = f();
        Object obj2 = f12383t;
        if (!zF) {
            int iC = c();
            Object obj3 = this.f12384k;
            Objects.requireNonNull(obj3);
            int iL = AbstractC1331q.l(obj, null, iC, obj3, h(), i(), null);
            if (iL != -1) {
                Object obj4 = j()[iL];
                e(iL, iC);
                this.f12389p--;
                this.f12388o += 32;
                return obj4;
            }
        }
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.get(obj);
        }
        int iD = d(obj);
        if (iD == -1) {
            return null;
        }
        return j()[iD];
    }

    public final int[] h() {
        int[] iArr = this.f12385l;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.f12386m;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.f12387n;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int k(int i7, int i8, int i9, int i10) {
        Object objC = AbstractC1331q.c(i8);
        int i11 = i8 - 1;
        if (i10 != 0) {
            AbstractC1331q.q(i9 & i11, i10 + 1, objC);
        }
        Object obj = this.f12384k;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        for (int i12 = 0; i12 <= i7; i12++) {
            int iP = AbstractC1331q.p(i12, obj);
            while (iP != 0) {
                int i13 = iP - 1;
                int i14 = iArrH[i13];
                int i15 = ((~i7) & i14) | i12;
                int i16 = i15 & i11;
                int iP2 = AbstractC1331q.p(i16, objC);
                AbstractC1331q.q(i16, iP, objC);
                iArrH[i13] = AbstractC1331q.j(i15, iP2, i11);
                iP = i14 & i7;
            }
        }
        this.f12384k = objC;
        this.f12388o = AbstractC1331q.j(this.f12388o, 32 - Integer.numberOfLeadingZeros(i11), 31);
        return i11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C1332s c1332s = this.f12390q;
        if (c1332s != null) {
            return c1332s;
        }
        C1332s c1332s2 = new C1332s(this, 1);
        this.f12390q = c1332s2;
        return c1332s2;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0104 -> B:41:0x00ea). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.C1334u.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.remove(obj);
        }
        Object objG = g(obj);
        if (objG == f12383t) {
            return null;
        }
        return objG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapB = b();
        return mapB != null ? mapB.size() : this.f12389p;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C1328n c1328n = this.f12392s;
        if (c1328n != null) {
            return c1328n;
        }
        C1328n c1328n2 = new C1328n(1, this);
        this.f12392s = c1328n2;
        return c1328n2;
    }
}
