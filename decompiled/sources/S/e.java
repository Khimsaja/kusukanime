package S;

import O.C0486d;
import O3.t;
import P3.AbstractC0566g;
import P3.m;
import P3.r;
import e4.k;
import f4.InterfaceC0882b;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class e extends AbstractC0566g implements Collection, InterfaceC0882b {

    /* renamed from: k, reason: collision with root package name */
    public b f8687k;

    /* renamed from: l, reason: collision with root package name */
    public Object[] f8688l;

    /* renamed from: m, reason: collision with root package name */
    public Object[] f8689m;

    /* renamed from: n, reason: collision with root package name */
    public int f8690n;

    /* renamed from: o, reason: collision with root package name */
    public V.b f8691o = new V.b();

    /* renamed from: p, reason: collision with root package name */
    public Object[] f8692p;

    /* renamed from: q, reason: collision with root package name */
    public Object[] f8693q;

    /* renamed from: r, reason: collision with root package name */
    public int f8694r;

    public e(b bVar, Object[] objArr, Object[] objArr2, int i7) {
        this.f8687k = bVar;
        this.f8688l = objArr;
        this.f8689m = objArr2;
        this.f8690n = i7;
        this.f8692p = objArr;
        this.f8693q = objArr2;
        this.f8694r = bVar.a();
    }

    public static void m(Object[] objArr, int i7, Iterator it) {
        while (i7 < 32 && it.hasNext()) {
            objArr[i7] = it.next();
            i7++;
        }
    }

    public final void A(Object[] objArr, int i7, int i8) {
        Object obj = null;
        if (i8 == 0) {
            this.f8692p = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f8693q = objArr;
            this.f8694r = i7;
            this.f8690n = i8;
            return;
        }
        C0.a aVar = new C0.a(obj);
        l.c(objArr);
        Object[] objArrZ = z(objArr, i8, i7, aVar);
        l.c(objArrZ);
        Object obj2 = aVar.a;
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
        this.f8693q = (Object[]) obj2;
        this.f8694r = i7;
        if (objArrZ[1] == null) {
            this.f8692p = (Object[]) objArrZ[0];
            this.f8690n = i8 - 5;
        } else {
            this.f8692p = objArrZ;
            this.f8690n = i8;
        }
    }

    public final Object[] B(Object[] objArr, int i7, int i8, Iterator it) {
        if (!it.hasNext()) {
            C0486d.T("invalid buffersIterator");
            throw null;
        }
        if (!(i8 >= 0)) {
            C0486d.T("negative shift");
            throw null;
        }
        if (i8 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrU = u(objArr);
        int iD = r.D(i7, i8);
        int i9 = i8 - 5;
        objArrU[iD] = B((Object[]) objArrU[iD], i7, i9, it);
        while (true) {
            iD++;
            if (iD >= 32 || !it.hasNext()) {
                break;
            }
            objArrU[iD] = B((Object[]) objArrU[iD], 0, i9, it);
        }
        return objArrU;
    }

    public final Object[] C(Object[] objArr, int i7, Object[][] objArr2) {
        t tVarI = l.i(objArr2);
        int i8 = i7 >> 5;
        int i9 = this.f8690n;
        Object[] objArrB = i8 < (1 << i9) ? B(objArr, i7, i9, tVarI) : u(objArr);
        while (tVarI.hasNext()) {
            this.f8690n += 5;
            objArrB = x(objArrB);
            int i10 = this.f8690n;
            B(objArrB, 1 << i10, i10, tVarI);
        }
        return objArrB;
    }

    public final void D(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i7 = this.f8694r;
        int i8 = i7 >> 5;
        int i9 = this.f8690n;
        if (i8 > (1 << i9)) {
            this.f8692p = E(this.f8690n + 5, x(objArr), objArr2);
            this.f8693q = objArr3;
            this.f8690n += 5;
            this.f8694r++;
            return;
        }
        if (objArr == null) {
            this.f8692p = objArr2;
            this.f8693q = objArr3;
            this.f8694r = i7 + 1;
        } else {
            this.f8692p = E(i9, objArr, objArr2);
            this.f8693q = objArr3;
            this.f8694r++;
        }
    }

    public final Object[] E(int i7, Object[] objArr, Object[] objArr2) {
        int iD = r.D(a() - 1, i7);
        Object[] objArrU = u(objArr);
        if (i7 == 5) {
            objArrU[iD] = objArr2;
            return objArrU;
        }
        objArrU[iD] = E(i7 - 5, (Object[]) objArrU[iD], objArr2);
        return objArrU;
    }

    public final int F(k kVar, Object[] objArr, int i7, int i8, C0.a aVar, ArrayList arrayList, ArrayList arrayList2) {
        if (s(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = aVar.a;
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrW = objArr2;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj2 = objArr[i9];
            if (!((Boolean) kVar.invoke(obj2)).booleanValue()) {
                if (i8 == 32) {
                    objArrW = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : w();
                    i8 = 0;
                }
                objArrW[i8] = obj2;
                i8++;
            }
        }
        aVar.a = objArrW;
        if (objArr2 != objArrW) {
            arrayList2.add(objArr2);
        }
        return i8;
    }

    public final int G(k kVar, Object[] objArr, int i7, C0.a aVar) {
        Object[] objArrU = objArr;
        int i8 = i7;
        boolean z7 = false;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (((Boolean) kVar.invoke(obj)).booleanValue()) {
                if (!z7) {
                    objArrU = u(objArr);
                    z7 = true;
                    i8 = i9;
                }
            } else if (z7) {
                objArrU[i8] = obj;
                i8++;
            }
        }
        aVar.a = objArrU;
        return i8;
    }

    public final int H(k kVar, int i7, C0.a aVar) {
        int iG = G(kVar, this.f8693q, i7, aVar);
        if (iG == i7) {
            return i7;
        }
        Object obj = aVar.a;
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iG, i7, (Object) null);
        this.f8693q = objArr;
        this.f8694r -= i7 - iG;
        return iG;
    }

    public final boolean I(k kVar) {
        Object[] objArrB;
        int i7;
        k kVar2 = kVar;
        int iO = O();
        Object[] objArrY = null;
        C0.a aVar = new C0.a(objArrY);
        boolean z7 = false;
        if (this.f8692p != null) {
            E5.a aVarT = t(0);
            int iG = 32;
            while (iG == 32 && aVarT.hasNext()) {
                iG = G(kVar2, (Object[]) aVarT.next(), 32, aVar);
            }
            if (iG == 32) {
                int iH = H(kVar2, iO, aVar);
                if (iH == 0) {
                    A(this.f8692p, this.f8694r, this.f8690n);
                }
                if (iH != iO) {
                }
            } else {
                int i8 = (aVarT.f1949l - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iF = iG;
                while (aVarT.hasNext()) {
                    iF = F(kVar2, (Object[]) aVarT.next(), 32, iF, aVar, arrayList2, arrayList);
                    kVar2 = kVar;
                }
                int iF2 = F(kVar, this.f8693q, iO, iF, aVar, arrayList2, arrayList);
                Object obj = aVar.a;
                l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iF2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrB = this.f8692p;
                    l.c(objArrB);
                } else {
                    objArrB = B(this.f8692p, i8, this.f8690n, arrayList.iterator());
                }
                int size = i8 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    C0486d.T("invalid size");
                    throw null;
                }
                if (size == 0) {
                    this.f8690n = 0;
                } else {
                    int i9 = size - 1;
                    while (true) {
                        i7 = this.f8690n;
                        if ((i9 >> i7) != 0) {
                            break;
                        }
                        this.f8690n = i7 - 5;
                        Object[] objArr2 = objArrB[0];
                        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", objArr2);
                        objArrB = objArr2;
                    }
                    objArrY = y(objArrB, i9, i7);
                }
                this.f8692p = objArrY;
                this.f8693q = objArr;
                this.f8694r = size + iF2;
            }
            z7 = true;
        } else if (H(kVar2, iO, aVar) != iO) {
            z7 = true;
        }
        if (z7) {
            ((AbstractList) this).modCount++;
        }
        return z7;
    }

    public final Object[] J(Object[] objArr, int i7, int i8, C0.a aVar) {
        int iD = r.D(i8, i7);
        if (i7 == 0) {
            Object obj = objArr[iD];
            Object[] objArrU = u(objArr);
            m.W(iD, iD + 1, 32, objArr, objArrU);
            objArrU[31] = aVar.a;
            aVar.a = obj;
            return objArrU;
        }
        int iD2 = objArr[31] == null ? r.D(L() - 1, i7) : 31;
        Object[] objArrU2 = u(objArr);
        int i9 = i7 - 5;
        int i10 = iD + 1;
        if (i10 <= iD2) {
            while (true) {
                Object obj2 = objArrU2[iD2];
                l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
                objArrU2[iD2] = J((Object[]) obj2, i9, 0, aVar);
                if (iD2 == i10) {
                    break;
                }
                iD2--;
            }
        }
        Object obj3 = objArrU2[iD];
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj3);
        objArrU2[iD] = J((Object[]) obj3, i9, i8, aVar);
        return objArrU2;
    }

    public final Object K(Object[] objArr, int i7, int i8, int i9) {
        int i10 = this.f8694r - i7;
        if (i10 == 1) {
            Object obj = this.f8693q[0];
            A(objArr, i7, i8);
            return obj;
        }
        Object[] objArr2 = this.f8693q;
        Object obj2 = objArr2[i9];
        Object[] objArrU = u(objArr2);
        m.W(i9, i9 + 1, i10, objArr2, objArrU);
        objArrU[i10 - 1] = null;
        this.f8692p = objArr;
        this.f8693q = objArrU;
        this.f8694r = (i7 + i10) - 1;
        this.f8690n = i8;
        return obj2;
    }

    public final int L() {
        int i7 = this.f8694r;
        if (i7 <= 32) {
            return 0;
        }
        return (i7 - 1) & (-32);
    }

    public final Object[] M(Object[] objArr, int i7, int i8, Object obj, C0.a aVar) {
        int iD = r.D(i8, i7);
        Object[] objArrU = u(objArr);
        if (i7 != 0) {
            Object obj2 = objArrU[iD];
            l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
            objArrU[iD] = M((Object[]) obj2, i7 - 5, i8, obj, aVar);
            return objArrU;
        }
        if (objArrU != objArr) {
            ((AbstractList) this).modCount++;
        }
        aVar.a = objArrU[iD];
        objArrU[iD] = obj;
        return objArrU;
    }

    public final void N(Collection collection, int i7, Object[] objArr, int i8, Object[][] objArr2, int i9, Object[] objArr3) {
        Object[] objArrW;
        if (i9 < 1) {
            C0486d.T("requires at least one nullBuffer");
            throw null;
        }
        Object[] objArrU = u(objArr);
        objArr2[0] = objArrU;
        int i10 = i7 & 31;
        int size = ((collection.size() + i7) - 1) & 31;
        int i11 = (i8 - i10) + size;
        if (i11 < 32) {
            m.W(size + 1, i10, i8, objArrU, objArr3);
        } else {
            int i12 = i11 - 31;
            if (i9 == 1) {
                objArrW = objArrU;
            } else {
                objArrW = w();
                i9--;
                objArr2[i9] = objArrW;
            }
            int i13 = i8 - i12;
            m.W(0, i13, i8, objArrU, objArr3);
            m.W(size + 1, i10, i13, objArrU, objArrW);
            objArr3 = objArrW;
        }
        Iterator it = collection.iterator();
        m(objArrU, i10, it);
        for (int i14 = 1; i14 < i9; i14++) {
            Object[] objArrW2 = w();
            m(objArrW2, 0, it);
            objArr2[i14] = objArrW2;
        }
        m(objArr3, 0, it);
    }

    public final int O() {
        int i7 = this.f8694r;
        return i7 <= 32 ? i7 : i7 - ((i7 - 1) & (-32));
    }

    @Override // P3.AbstractC0566g
    public final int a() {
        return this.f8694r;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        r.l(i7, a());
        if (i7 == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iL = L();
        if (i7 >= iL) {
            r(i7 - iL, obj, this.f8692p);
            return;
        }
        C0.a aVar = new C0.a(null);
        Object[] objArr = this.f8692p;
        l.c(objArr);
        r(0, aVar.a, q(objArr, this.f8690n, i7, obj, aVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        Collection collection2;
        e eVar;
        Object[] objArrW;
        r.l(i7, this.f8694r);
        if (i7 == this.f8694r) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i8 = (i7 >> 5) << 5;
        int size = ((collection.size() + (this.f8694r - i8)) - 1) / 32;
        if (size == 0) {
            int i9 = i7 & 31;
            int size2 = ((collection.size() + i7) - 1) & 31;
            Object[] objArr = this.f8693q;
            Object[] objArrU = u(objArr);
            m.W(size2 + 1, i9, O(), objArr, objArrU);
            m(objArrU, i9, collection.iterator());
            this.f8693q = objArrU;
            this.f8694r = collection.size() + this.f8694r;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iO = O();
        int size3 = collection.size() + this.f8694r;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i7 >= L()) {
            objArrW = w();
            collection2 = collection;
            N(collection2, i7, this.f8693q, iO, objArr2, size, objArrW);
            eVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            eVar = this;
            if (size3 > iO) {
                int i10 = size3 - iO;
                Object[] objArrV = v(i10, eVar.f8693q);
                eVar.p(collection2, i7, i10, objArr2, size, objArrV);
                objArr2 = objArr2;
                objArrW = objArrV;
            } else {
                Object[] objArr3 = eVar.f8693q;
                objArrW = w();
                int i11 = iO - size3;
                m.W(0, i11, iO, objArr3, objArrW);
                int i12 = 32 - i11;
                Object[] objArrV2 = v(i12, eVar.f8693q);
                int i13 = size - 1;
                objArr2[i13] = objArrV2;
                eVar.p(collection2, i7, i12, objArr2, i13, objArrV2);
                collection2 = collection2;
            }
        }
        eVar.f8692p = C(eVar.f8692p, i8, objArr2);
        eVar.f8693q = objArrW;
        eVar.f8694r = collection2.size() + eVar.f8694r;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        Object[] objArr;
        r.j(i7, a());
        if (L() <= i7) {
            objArr = this.f8693q;
        } else {
            objArr = this.f8692p;
            l.c(objArr);
            for (int i8 = this.f8690n; i8 > 0; i8 -= 5) {
                Object obj = objArr[r.D(i7, i8)];
                l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
                objArr = (Object[]) obj;
            }
        }
        return objArr[i7 & 31];
    }

    @Override // P3.AbstractC0566g
    public final Object h(int i7) {
        r.j(i7, a());
        ((AbstractList) this).modCount++;
        int iL = L();
        if (i7 >= iL) {
            return K(this.f8692p, iL, this.f8690n, i7 - iL);
        }
        C0.a aVar = new C0.a(this.f8693q[0]);
        Object[] objArr = this.f8692p;
        l.c(objArr);
        K(J(objArr, this.f8690n, i7, aVar), iL, this.f8690n, 0);
        return aVar.a;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final b j() {
        b dVar;
        Object[] objArr = this.f8692p;
        if (objArr == this.f8688l && this.f8693q == this.f8689m) {
            dVar = this.f8687k;
        } else {
            this.f8691o = new V.b();
            this.f8688l = objArr;
            Object[] objArr2 = this.f8693q;
            this.f8689m = objArr2;
            if (objArr != null) {
                dVar = new d(objArr, objArr2, this.f8694r, this.f8690n);
            } else if (objArr2.length == 0) {
                dVar = h.f8701l;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.f8694r);
                l.e("copyOf(this, newSize)", objArrCopyOf);
                dVar = new h(objArrCopyOf);
            }
        }
        this.f8687k = dVar;
        return dVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        r.l(i7, this.f8694r);
        return new g(this, i7);
    }

    public final int o() {
        return ((AbstractList) this).modCount;
    }

    public final void p(Collection collection, int i7, int i8, Object[][] objArr, int i9, Object[] objArr2) {
        if (this.f8692p == null) {
            throw new IllegalStateException("root is null");
        }
        int i10 = i7 >> 5;
        E5.a aVarT = t(L() >> 5);
        int i11 = i9;
        Object[] objArrV = objArr2;
        while (aVarT.f1949l - 1 != i10) {
            Object[] objArr3 = (Object[]) aVarT.previous();
            m.W(0, 32 - i8, 32, objArr3, objArrV);
            objArrV = v(i8, objArr3);
            i11--;
            objArr[i11] = objArrV;
        }
        Object[] objArr4 = (Object[]) aVarT.previous();
        int iL = i9 - (((L() >> 5) - 1) - i10);
        if (iL < i9) {
            objArr2 = objArr[iL];
            l.c(objArr2);
        }
        N(collection, i7, objArr4, 32, objArr, iL, objArr2);
    }

    public final Object[] q(Object[] objArr, int i7, int i8, Object obj, C0.a aVar) {
        Object obj2;
        int iD = r.D(i8, i7);
        if (i7 == 0) {
            aVar.a = objArr[31];
            Object[] objArrU = u(objArr);
            m.W(iD + 1, iD, 31, objArr, objArrU);
            objArrU[iD] = obj;
            return objArrU;
        }
        Object[] objArrU2 = u(objArr);
        int i9 = i7 - 5;
        Object obj3 = objArrU2[iD];
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj3);
        objArrU2[iD] = q((Object[]) obj3, i9, i8, obj, aVar);
        while (true) {
            iD++;
            if (iD >= 32 || (obj2 = objArrU2[iD]) == null) {
                break;
            }
            objArrU2[iD] = q((Object[]) obj2, i9, 0, aVar.a, aVar);
        }
        return objArrU2;
    }

    public final void r(int i7, Object obj, Object[] objArr) {
        int iO = O();
        Object[] objArrU = u(this.f8693q);
        if (iO >= 32) {
            Object[] objArr2 = this.f8693q;
            Object obj2 = objArr2[31];
            m.W(i7 + 1, i7, 31, objArr2, objArrU);
            objArrU[i7] = obj;
            D(objArr, objArrU, x(obj2));
            return;
        }
        m.W(i7 + 1, i7, iO, this.f8693q, objArrU);
        objArrU[i7] = obj;
        this.f8692p = objArr;
        this.f8693q = objArrU;
        this.f8694r++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return I(new a(1, collection));
    }

    public final boolean s(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f8691o;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        r.j(i7, a());
        if (L() > i7) {
            C0.a aVar = new C0.a(null);
            Object[] objArr = this.f8692p;
            l.c(objArr);
            this.f8692p = M(objArr, this.f8690n, i7, obj, aVar);
            return aVar.a;
        }
        Object[] objArrU = u(this.f8693q);
        if (objArrU != this.f8693q) {
            ((AbstractList) this).modCount++;
        }
        int i8 = i7 & 31;
        Object obj2 = objArrU[i8];
        objArrU[i8] = obj;
        this.f8693q = objArrU;
        return obj2;
    }

    public final E5.a t(int i7) {
        Object[] objArr = this.f8692p;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iL = L() >> 5;
        r.l(i7, iL);
        int i8 = this.f8690n;
        return i8 == 0 ? new c(i7, objArr) : new i(objArr, i7, iL, i8 / 5);
    }

    public final Object[] u(Object[] objArr) {
        if (objArr == null) {
            return w();
        }
        if (s(objArr)) {
            return objArr;
        }
        Object[] objArrW = w();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        m.Z(0, length, 6, objArr, objArrW);
        return objArrW;
    }

    public final Object[] v(int i7, Object[] objArr) {
        if (s(objArr)) {
            m.W(i7, 0, 32 - i7, objArr, objArr);
            return objArr;
        }
        Object[] objArrW = w();
        m.W(i7, 0, 32 - i7, objArr, objArrW);
        return objArrW;
    }

    public final Object[] w() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f8691o;
        return objArr;
    }

    public final Object[] x(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f8691o;
        return objArr;
    }

    public final Object[] y(Object[] objArr, int i7, int i8) {
        if (!(i8 >= 0)) {
            C0486d.T("shift should be positive");
            throw null;
        }
        if (i8 == 0) {
            return objArr;
        }
        int iD = r.D(i7, i8);
        Object obj = objArr[iD];
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
        Object objY = y((Object[]) obj, i7, i8 - 5);
        if (iD < 31) {
            int i9 = iD + 1;
            if (objArr[i9] != null) {
                if (s(objArr)) {
                    Arrays.fill(objArr, i9, 32, (Object) null);
                }
                Object[] objArrW = w();
                m.W(0, 0, i9, objArr, objArrW);
                objArr = objArrW;
            }
        }
        if (objY == objArr[iD]) {
            return objArr;
        }
        Object[] objArrU = u(objArr);
        objArrU[iD] = objY;
        return objArrU;
    }

    public final Object[] z(Object[] objArr, int i7, int i8, C0.a aVar) {
        Object[] objArrZ;
        int iD = r.D(i8 - 1, i7);
        if (i7 == 5) {
            aVar.a = objArr[iD];
            objArrZ = null;
        } else {
            Object obj = objArr[iD];
            l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
            objArrZ = z((Object[]) obj, i7 - 5, i8, aVar);
        }
        if (objArrZ == null && iD == 0) {
            return null;
        }
        Object[] objArrU = u(objArr);
        objArrU[iD] = objArrZ;
        return objArrU;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iO = O();
        if (iO < 32) {
            Object[] objArrU = u(this.f8693q);
            objArrU[iO] = obj;
            this.f8693q = objArrU;
            this.f8694r = a() + 1;
        } else {
            D(this.f8692p, this.f8693q, x(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iO = O();
        Iterator it = collection.iterator();
        if (32 - iO >= collection.size()) {
            Object[] objArrU = u(this.f8693q);
            m(objArrU, iO, it);
            this.f8693q = objArrU;
            this.f8694r = collection.size() + this.f8694r;
            return true;
        }
        int size = ((collection.size() + iO) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrU2 = u(this.f8693q);
        m(objArrU2, iO, it);
        objArr[0] = objArrU2;
        for (int i7 = 1; i7 < size; i7++) {
            Object[] objArrW = w();
            m(objArrW, 0, it);
            objArr[i7] = objArrW;
        }
        this.f8692p = C(this.f8692p, L(), objArr);
        Object[] objArrW2 = w();
        m(objArrW2, 0, it);
        this.f8693q = objArrW2;
        this.f8694r = collection.size() + this.f8694r;
        return true;
    }
}
