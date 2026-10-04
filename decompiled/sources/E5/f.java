package E5;

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
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final class f extends AbstractC0566g implements Collection, InterfaceC0882b {

    /* renamed from: k, reason: collision with root package name */
    public int f1959k;

    /* renamed from: l, reason: collision with root package name */
    public c f1960l;

    /* renamed from: m, reason: collision with root package name */
    public A.e f1961m;

    /* renamed from: n, reason: collision with root package name */
    public Object[] f1962n;

    /* renamed from: o, reason: collision with root package name */
    public Object[] f1963o;

    /* renamed from: p, reason: collision with root package name */
    public int f1964p;

    public f(c cVar, Object[] objArr, Object[] objArr2, int i7) {
        l.f("vectorTail", objArr2);
        this.f1959k = i7;
        this.f1960l = cVar;
        this.f1961m = new A.e(7);
        this.f1962n = objArr;
        this.f1963o = objArr2;
        this.f1964p = cVar.a();
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
            N(null);
            if (objArr == null) {
                objArr = new Object[0];
            }
            O(objArr);
            this.f1964p = i7;
            this.f1959k = i8;
            return;
        }
        C0.a aVar = new C0.a(obj);
        l.c(objArr);
        Object[] objArrZ = z(objArr, i8, i7, aVar);
        l.c(objArrZ);
        Object obj2 = aVar.a;
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
        O((Object[]) obj2);
        this.f1964p = i7;
        if (objArrZ[1] == null) {
            N((Object[]) objArrZ[0]);
            this.f1959k = i8 - 5;
        } else {
            N(objArrZ);
            this.f1959k = i8;
        }
    }

    public final Object[] B(Object[] objArr, int i7, int i8, Iterator it) {
        if (!it.hasNext()) {
            throw new IllegalStateException("Check failed.");
        }
        if (i8 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i8 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrU = u(objArr);
        int iG = AbstractC1420H.G(i7, i8);
        int i9 = i8 - 5;
        objArrU[iG] = B((Object[]) objArrU[iG], i7, i9, it);
        while (true) {
            iG++;
            if (iG >= 32 || !it.hasNext()) {
                break;
            }
            objArrU[iG] = B((Object[]) objArrU[iG], 0, i9, it);
        }
        return objArrU;
    }

    public final Object[] C(Object[] objArr, int i7, Object[][] objArr2) {
        t tVarI = l.i(objArr2);
        int i8 = i7 >> 5;
        int i9 = this.f1959k;
        Object[] objArrB = i8 < (1 << i9) ? B(objArr, i7, i9, tVarI) : u(objArr);
        while (tVarI.hasNext()) {
            this.f1959k += 5;
            objArrB = x(objArrB);
            int i10 = this.f1959k;
            B(objArrB, 1 << i10, i10, tVarI);
        }
        return objArrB;
    }

    public final void D(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i7 = this.f1964p >> 5;
        int i8 = this.f1959k;
        if (i7 > (1 << i8)) {
            N(E(this.f1959k + 5, x(objArr), objArr2));
            O(objArr3);
            this.f1959k += 5;
            this.f1964p++;
            return;
        }
        if (objArr == null) {
            N(objArr2);
            O(objArr3);
            this.f1964p++;
        } else {
            N(E(i8, objArr, objArr2));
            O(objArr3);
            this.f1964p++;
        }
    }

    public final Object[] E(int i7, Object[] objArr, Object[] objArr2) {
        int iG = AbstractC1420H.G(a() - 1, i7);
        Object[] objArrU = u(objArr);
        if (i7 == 5) {
            objArrU[iG] = objArr2;
            return objArrU;
        }
        objArrU[iG] = E(i7 - 5, (Object[]) objArrU[iG], objArr2);
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
        int iG = G(kVar, this.f1963o, i7, aVar);
        if (iG == i7) {
            return i7;
        }
        Object obj = aVar.a;
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iG, i7, (Object) null);
        O(objArr);
        this.f1964p -= i7 - iG;
        return iG;
    }

    public final boolean I(k kVar) {
        Object[] objArrB;
        int i7;
        k kVar2 = kVar;
        int iQ = Q();
        Object[] objArrY = null;
        C0.a aVar = new C0.a(objArrY);
        boolean z7 = false;
        if (this.f1962n != null) {
            a aVarT = t(0);
            int iG = 32;
            while (iG == 32 && aVarT.hasNext()) {
                iG = G(kVar2, (Object[]) aVarT.next(), 32, aVar);
            }
            if (iG == 32) {
                int iH = H(kVar2, iQ, aVar);
                if (iH == 0) {
                    A(this.f1962n, this.f1964p, this.f1959k);
                }
                if (iH != iQ) {
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
                int iF2 = F(kVar, this.f1963o, iQ, iF, aVar, arrayList2, arrayList);
                Object obj = aVar.a;
                l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iF2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrB = this.f1962n;
                    l.c(objArrB);
                } else {
                    objArrB = B(this.f1962n, i8, this.f1959k, arrayList.iterator());
                }
                int size = i8 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (size == 0) {
                    this.f1959k = 0;
                } else {
                    int i9 = size - 1;
                    while (true) {
                        i7 = this.f1959k;
                        if ((i9 >> i7) != 0) {
                            break;
                        }
                        this.f1959k = i7 - 5;
                        Object[] objArr2 = objArrB[0];
                        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", objArr2);
                        objArrB = objArr2;
                    }
                    objArrY = y(objArrB, i9, i7);
                }
                N(objArrY);
                O(objArr);
                this.f1964p = size + iF2;
            }
            z7 = true;
        } else if (H(kVar2, iQ, aVar) != iQ) {
            z7 = true;
        }
        if (z7) {
            ((AbstractList) this).modCount++;
        }
        return z7;
    }

    public final Object[] J(Object[] objArr, int i7, int i8, C0.a aVar) {
        int iG = AbstractC1420H.G(i8, i7);
        if (i7 == 0) {
            Object obj = objArr[iG];
            Object[] objArrU = u(objArr);
            m.W(iG, iG + 1, 32, objArr, objArrU);
            objArrU[31] = aVar.a;
            aVar.a = obj;
            return objArrU;
        }
        int iG2 = objArr[31] == null ? AbstractC1420H.G(L() - 1, i7) : 31;
        Object[] objArrU2 = u(objArr);
        int i9 = i7 - 5;
        int i10 = iG + 1;
        if (i10 <= iG2) {
            while (true) {
                Object obj2 = objArrU2[iG2];
                l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
                objArrU2[iG2] = J((Object[]) obj2, i9, 0, aVar);
                if (iG2 == i10) {
                    break;
                }
                iG2--;
            }
        }
        Object obj3 = objArrU2[iG];
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj3);
        objArrU2[iG] = J((Object[]) obj3, i9, i8, aVar);
        return objArrU2;
    }

    public final Object K(Object[] objArr, int i7, int i8, int i9) {
        int i10 = this.f1964p - i7;
        if (i10 == 1) {
            Object obj = this.f1963o[0];
            A(objArr, i7, i8);
            return obj;
        }
        Object[] objArr2 = this.f1963o;
        Object obj2 = objArr2[i9];
        Object[] objArrU = u(objArr2);
        m.W(i9, i9 + 1, i10, objArr2, objArrU);
        objArrU[i10 - 1] = null;
        N(objArr);
        O(objArrU);
        this.f1964p = (i7 + i10) - 1;
        this.f1959k = i8;
        return obj2;
    }

    public final int L() {
        int i7 = this.f1964p;
        if (i7 <= 32) {
            return 0;
        }
        return (i7 - 1) & (-32);
    }

    public final Object[] M(Object[] objArr, int i7, int i8, Object obj, C0.a aVar) {
        int iG = AbstractC1420H.G(i8, i7);
        Object[] objArrU = u(objArr);
        if (i7 != 0) {
            Object obj2 = objArrU[iG];
            l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
            objArrU[iG] = M((Object[]) obj2, i7 - 5, i8, obj, aVar);
            return objArrU;
        }
        if (objArrU != objArr) {
            ((AbstractList) this).modCount++;
        }
        aVar.a = objArrU[iG];
        objArrU[iG] = obj;
        return objArrU;
    }

    public final void N(Object[] objArr) {
        if (objArr != this.f1962n) {
            this.f1960l = null;
            this.f1962n = objArr;
        }
    }

    public final void O(Object[] objArr) {
        if (objArr != this.f1963o) {
            this.f1960l = null;
            this.f1963o = objArr;
        }
    }

    public final void P(Collection collection, int i7, Object[] objArr, int i8, Object[][] objArr2, int i9, Object[] objArr3) {
        Object[] objArrW;
        if (i9 < 1) {
            throw new IllegalStateException("Check failed.");
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

    public final int Q() {
        int i7 = this.f1964p;
        return i7 <= 32 ? i7 : i7 - ((i7 - 1) & (-32));
    }

    @Override // P3.AbstractC0566g
    public final int a() {
        return this.f1964p;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        r.k(i7, a());
        if (i7 == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iL = L();
        if (i7 >= iL) {
            r(i7 - iL, obj, this.f1962n);
            return;
        }
        C0.a aVar = new C0.a(null);
        Object[] objArr = this.f1962n;
        l.c(objArr);
        r(0, aVar.a, q(objArr, this.f1959k, i7, obj, aVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        Collection collection2;
        f fVar;
        Object[] objArrW;
        l.f("elements", collection);
        r.k(i7, this.f1964p);
        if (i7 == this.f1964p) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i8 = (i7 >> 5) << 5;
        int size = ((collection.size() + (this.f1964p - i8)) - 1) / 32;
        if (size == 0) {
            int i9 = i7 & 31;
            int size2 = ((collection.size() + i7) - 1) & 31;
            Object[] objArr = this.f1963o;
            Object[] objArrU = u(objArr);
            m.W(size2 + 1, i9, Q(), objArr, objArrU);
            m(objArrU, i9, collection.iterator());
            O(objArrU);
            this.f1964p = collection.size() + this.f1964p;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iQ = Q();
        int size3 = collection.size() + this.f1964p;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i7 >= L()) {
            objArrW = w();
            collection2 = collection;
            P(collection2, i7, this.f1963o, iQ, objArr2, size, objArrW);
            fVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            fVar = this;
            if (size3 > iQ) {
                int i10 = size3 - iQ;
                Object[] objArrV = v(i10, fVar.f1963o);
                fVar.p(collection2, i7, i10, objArr2, size, objArrV);
                objArr2 = objArr2;
                objArrW = objArrV;
            } else {
                Object[] objArr3 = fVar.f1963o;
                objArrW = w();
                int i11 = iQ - size3;
                m.W(0, i11, iQ, objArr3, objArrW);
                int i12 = 32 - i11;
                Object[] objArrV2 = v(i12, fVar.f1963o);
                int i13 = size - 1;
                objArr2[i13] = objArrV2;
                fVar.p(collection2, i7, i12, objArr2, i13, objArrV2);
                collection2 = collection2;
            }
        }
        N(C(fVar.f1962n, i8, objArr2));
        O(objArrW);
        fVar.f1964p = collection2.size() + fVar.f1964p;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        Object[] objArr;
        r.i(i7, a());
        if (L() <= i7) {
            objArr = this.f1963o;
        } else {
            objArr = this.f1962n;
            l.c(objArr);
            for (int i8 = this.f1959k; i8 > 0; i8 -= 5) {
                Object obj = objArr[AbstractC1420H.G(i7, i8)];
                l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
                objArr = (Object[]) obj;
            }
        }
        return objArr[i7 & 31];
    }

    @Override // P3.AbstractC0566g
    public final Object h(int i7) {
        r.i(i7, a());
        ((AbstractList) this).modCount++;
        int iL = L();
        if (i7 >= iL) {
            return K(this.f1962n, iL, this.f1959k, i7 - iL);
        }
        C0.a aVar = new C0.a(this.f1963o[0]);
        Object[] objArr = this.f1962n;
        l.c(objArr);
        K(J(objArr, this.f1959k, i7, aVar), iL, this.f1959k, 0);
        return aVar.a;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final D5.b j() {
        c eVar = this.f1960l;
        if (eVar == null) {
            Object[] objArr = this.f1962n;
            Object[] objArr2 = this.f1963o;
            this.f1961m = new A.e(7);
            if (objArr != null) {
                eVar = new e(objArr, objArr2, this.f1964p, this.f1959k);
            } else if (objArr2.length == 0) {
                eVar = i.f1971l;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.f1964p);
                l.e("copyOf(...)", objArrCopyOf);
                eVar = new i(objArrCopyOf);
            }
            this.f1960l = eVar;
        }
        return eVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        r.k(i7, this.f1964p);
        return new h(this, i7);
    }

    public final int o() {
        return ((AbstractList) this).modCount;
    }

    public final void p(Collection collection, int i7, int i8, Object[][] objArr, int i9, Object[] objArr2) {
        if (this.f1962n == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i10 = i7 >> 5;
        a aVarT = t(L() >> 5);
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
        P(collection, i7, objArr4, 32, objArr, iL, objArr2);
    }

    public final Object[] q(Object[] objArr, int i7, int i8, Object obj, C0.a aVar) {
        Object obj2;
        int iG = AbstractC1420H.G(i8, i7);
        if (i7 == 0) {
            aVar.a = objArr[31];
            Object[] objArrU = u(objArr);
            m.W(iG + 1, iG, 31, objArr, objArrU);
            objArrU[iG] = obj;
            return objArrU;
        }
        Object[] objArrU2 = u(objArr);
        int i9 = i7 - 5;
        Object obj3 = objArrU2[iG];
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj3);
        objArrU2[iG] = q((Object[]) obj3, i9, i8, obj, aVar);
        while (true) {
            iG++;
            if (iG >= 32 || (obj2 = objArrU2[iG]) == null) {
                break;
            }
            objArrU2[iG] = q((Object[]) obj2, i9, 0, aVar.a, aVar);
        }
        return objArrU2;
    }

    public final void r(int i7, Object obj, Object[] objArr) {
        int iQ = Q();
        Object[] objArrU = u(this.f1963o);
        if (iQ >= 32) {
            Object[] objArr2 = this.f1963o;
            Object obj2 = objArr2[31];
            m.W(i7 + 1, i7, 31, objArr2, objArrU);
            objArrU[i7] = obj;
            D(objArr, objArrU, x(obj2));
            return;
        }
        m.W(i7 + 1, i7, iQ, this.f1963o, objArrU);
        objArrU[i7] = obj;
        N(objArr);
        O(objArrU);
        this.f1964p++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        l.f("elements", collection);
        if (collection.isEmpty()) {
            return false;
        }
        return I(new b(2, collection));
    }

    public final boolean s(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f1961m;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        r.i(i7, a());
        if (L() > i7) {
            C0.a aVar = new C0.a(null);
            Object[] objArr = this.f1962n;
            l.c(objArr);
            N(M(objArr, this.f1959k, i7, obj, aVar));
            return aVar.a;
        }
        Object[] objArrU = u(this.f1963o);
        if (objArrU != this.f1963o) {
            ((AbstractList) this).modCount++;
        }
        int i8 = i7 & 31;
        Object obj2 = objArrU[i8];
        objArrU[i8] = obj;
        O(objArrU);
        return obj2;
    }

    public final a t(int i7) {
        if (this.f1962n == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int iL = L() >> 5;
        r.k(i7, iL);
        int i8 = this.f1959k;
        if (i8 == 0) {
            Object[] objArr = this.f1962n;
            l.c(objArr);
            return new d(i7, objArr);
        }
        Object[] objArr2 = this.f1962n;
        l.c(objArr2);
        return new j(objArr2, i7, iL, i8 / 5);
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
        objArr[32] = this.f1961m;
        return objArr;
    }

    public final Object[] x(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f1961m;
        return objArr;
    }

    public final Object[] y(Object[] objArr, int i7, int i8) {
        if (i8 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i8 == 0) {
            return objArr;
        }
        int iG = AbstractC1420H.G(i7, i8);
        Object obj = objArr[iG];
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
        Object objY = y((Object[]) obj, i7, i8 - 5);
        if (iG < 31) {
            int i9 = iG + 1;
            if (objArr[i9] != null) {
                if (s(objArr)) {
                    Arrays.fill(objArr, i9, 32, (Object) null);
                }
                Object[] objArrW = w();
                m.W(0, 0, i9, objArr, objArrW);
                objArr = objArrW;
            }
        }
        if (objY == objArr[iG]) {
            return objArr;
        }
        Object[] objArrU = u(objArr);
        objArrU[iG] = objY;
        return objArrU;
    }

    public final Object[] z(Object[] objArr, int i7, int i8, C0.a aVar) {
        Object[] objArrZ;
        int iG = AbstractC1420H.G(i8 - 1, i7);
        if (i7 == 5) {
            aVar.a = objArr[iG];
            objArrZ = null;
        } else {
            Object obj = objArr[iG];
            l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
            objArrZ = z((Object[]) obj, i7 - 5, i8, aVar);
        }
        if (objArrZ == null && iG == 0) {
            return null;
        }
        Object[] objArrU = u(objArr);
        objArrU[iG] = objArrZ;
        return objArrU;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iQ = Q();
        if (iQ < 32) {
            Object[] objArrU = u(this.f1963o);
            objArrU[iQ] = obj;
            O(objArrU);
            this.f1964p = a() + 1;
        } else {
            D(this.f1962n, this.f1963o, x(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        l.f("elements", collection);
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iQ = Q();
        Iterator it = collection.iterator();
        if (32 - iQ >= collection.size()) {
            Object[] objArrU = u(this.f1963o);
            m(objArrU, iQ, it);
            O(objArrU);
            this.f1964p = collection.size() + this.f1964p;
            return true;
        }
        int size = ((collection.size() + iQ) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrU2 = u(this.f1963o);
        m(objArrU2, iQ, it);
        objArr[0] = objArrU2;
        for (int i7 = 1; i7 < size; i7++) {
            Object[] objArrW = w();
            m(objArrW, 0, it);
            objArr[i7] = objArrW;
        }
        N(C(this.f1962n, L(), objArr));
        Object[] objArrW2 = w();
        m(objArrW2, 0, it);
        O(objArrW2);
        this.f1964p = collection.size() + this.f1964p;
        return true;
    }
}
