package E5;

import P3.m;
import P3.r;
import e4.k;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.l;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: k, reason: collision with root package name */
    public final Object[] f1955k;

    /* renamed from: l, reason: collision with root package name */
    public final Object[] f1956l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1957m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1958n;

    public e(Object[] objArr, Object[] objArr2, int i7, int i8) {
        l.f("root", objArr);
        l.f("tail", objArr2);
        this.f1955k = objArr;
        this.f1956l = objArr2;
        this.f1957m = i7;
        this.f1958n = i8;
        if (a() > 32) {
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + a()).toString());
    }

    public static Object[] h(Object[] objArr, int i7, int i8, Object obj, C0.a aVar) {
        Object[] objArrCopyOf;
        int iG = AbstractC1420H.G(i8, i7);
        if (i7 == 0) {
            if (iG == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                l.e("copyOf(...)", objArrCopyOf);
            }
            m.W(iG + 1, iG, 31, objArr, objArrCopyOf);
            aVar.a = objArr[31];
            objArrCopyOf[iG] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        l.e("copyOf(...)", objArrCopyOf2);
        int i9 = i7 - 5;
        Object obj2 = objArr[iG];
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
        objArrCopyOf2[iG] = h((Object[]) obj2, i9, i8, obj, aVar);
        while (true) {
            iG++;
            if (iG >= 32 || objArrCopyOf2[iG] == null) {
                break;
            }
            Object obj3 = objArr[iG];
            l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj3);
            objArrCopyOf2[iG] = h((Object[]) obj3, i9, 0, aVar.a, aVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] m(Object[] objArr, int i7, int i8, C0.a aVar) {
        Object[] objArrM;
        int iG = AbstractC1420H.G(i8, i7);
        if (i7 == 5) {
            aVar.a = objArr[iG];
            objArrM = null;
        } else {
            Object obj = objArr[iG];
            l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
            objArrM = m((Object[]) obj, i7 - 5, i8, aVar);
        }
        if (objArrM == null && iG == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        l.e("copyOf(...)", objArrCopyOf);
        objArrCopyOf[iG] = objArrM;
        return objArrCopyOf;
    }

    public static Object[] t(Object[] objArr, int i7, int i8, Object obj) {
        int iG = AbstractC1420H.G(i8, i7);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        l.e("copyOf(...)", objArrCopyOf);
        if (i7 == 0) {
            objArrCopyOf[iG] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iG];
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
        objArrCopyOf[iG] = t((Object[]) obj2, i7 - 5, i8, obj);
        return objArrCopyOf;
    }

    @Override // P3.AbstractC0560a
    public final int a() {
        return this.f1957m;
    }

    @Override // java.util.Collection, java.util.List, D5.b
    public final D5.b add(Object obj) {
        int iS = s();
        int i7 = this.f1957m;
        int i8 = i7 - iS;
        Object[] objArr = this.f1955k;
        Object[] objArr2 = this.f1956l;
        if (i8 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return o(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        l.e("copyOf(...)", objArrCopyOf);
        objArrCopyOf[i8] = obj;
        return new e(objArr, objArrCopyOf, i7 + 1, this.f1958n);
    }

    @Override // D5.b
    public final D5.b f(int i7) {
        r.i(i7, this.f1957m);
        int iS = s();
        Object[] objArr = this.f1955k;
        int i8 = this.f1958n;
        return i7 >= iS ? r(objArr, iS, i8, i7 - iS) : r(q(objArr, i8, i7, new C0.a(this.f1956l[0])), iS, i8, 0);
    }

    @Override // D5.b
    public final f g() {
        return new f(this, this.f1955k, this.f1956l, this.f1958n);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Object[] objArr;
        r.i(i7, a());
        if (s() <= i7) {
            objArr = this.f1956l;
        } else {
            objArr = this.f1955k;
            for (int i8 = this.f1958n; i8 > 0; i8 -= 5) {
                Object obj = objArr[AbstractC1420H.G(i7, i8)];
                l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
                objArr = (Object[]) obj;
            }
        }
        return objArr[i7 & 31];
    }

    public final e j(int i7, Object obj, Object[] objArr) {
        int iS = s();
        int i8 = this.f1957m;
        int i9 = i8 - iS;
        Object[] objArr2 = this.f1956l;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        l.e("copyOf(...)", objArrCopyOf);
        if (i9 < 32) {
            m.W(i7 + 1, i7, i9, objArr2, objArrCopyOf);
            objArrCopyOf[i7] = obj;
            return new e(objArr, objArrCopyOf, i8 + 1, this.f1958n);
        }
        Object obj2 = objArr2[31];
        m.W(i7 + 1, i7, i9 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i7] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return o(objArr, objArrCopyOf, objArr3);
    }

    @Override // P3.AbstractC0564e, java.util.List
    public final ListIterator listIterator(int i7) {
        r.k(i7, this.f1957m);
        return new g(i7, this.f1957m, (this.f1958n / 5) + 1, this.f1955k, this.f1956l);
    }

    @Override // D5.b
    public final D5.b n(k kVar) {
        f fVar = new f(this, this.f1955k, this.f1956l, this.f1958n);
        fVar.I(kVar);
        return fVar.j();
    }

    public final e o(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i7 = this.f1957m;
        int i8 = i7 >> 5;
        int i9 = this.f1958n;
        if (i8 <= (1 << i9)) {
            return new e(p(i9, objArr, objArr2), objArr3, i7 + 1, i9);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i10 = i9 + 5;
        return new e(p(i10, objArr4, objArr2), objArr3, i7 + 1, i10);
    }

    public final Object[] p(int i7, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iG = AbstractC1420H.G(a() - 1, i7);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            l.e("copyOf(...)", objArrCopyOf);
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i7 == 5) {
            objArrCopyOf[iG] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iG] = p(i7 - 5, (Object[]) objArrCopyOf[iG], objArr2);
        return objArrCopyOf;
    }

    public final Object[] q(Object[] objArr, int i7, int i8, C0.a aVar) {
        Object[] objArrCopyOf;
        int iG = AbstractC1420H.G(i8, i7);
        if (i7 == 0) {
            if (iG == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                l.e("copyOf(...)", objArrCopyOf);
            }
            m.W(iG, iG + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = aVar.a;
            aVar.a = objArr[iG];
            return objArrCopyOf;
        }
        int iG2 = objArr[31] == null ? AbstractC1420H.G(s() - 1, i7) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        l.e("copyOf(...)", objArrCopyOf2);
        int i9 = i7 - 5;
        int i10 = iG + 1;
        if (i10 <= iG2) {
            while (true) {
                Object obj = objArrCopyOf2[iG2];
                l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
                objArrCopyOf2[iG2] = q((Object[]) obj, i9, 0, aVar);
                if (iG2 == i10) {
                    break;
                }
                iG2--;
            }
        }
        Object obj2 = objArrCopyOf2[iG];
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
        objArrCopyOf2[iG] = q((Object[]) obj2, i9, i8, aVar);
        return objArrCopyOf2;
    }

    public final c r(Object[] objArr, int i7, int i8, int i9) {
        int i10 = this.f1957m - i7;
        Object obj = null;
        if (i10 != 1) {
            Object[] objArr2 = this.f1956l;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            l.e("copyOf(...)", objArrCopyOf);
            int i11 = i10 - 1;
            if (i9 < i11) {
                m.W(i9, i9 + 1, i10, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i11] = null;
            return new e(objArr, objArrCopyOf, (i7 + i10) - 1, i8);
        }
        if (i8 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                l.e("copyOf(...)", objArr);
            }
            return new i(objArr);
        }
        C0.a aVar = new C0.a(obj);
        Object[] objArrM = m(objArr, i8, i7 - 1, aVar);
        l.c(objArrM);
        Object obj2 = aVar.a;
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
        Object[] objArr3 = (Object[]) obj2;
        if (objArrM[1] != null) {
            return new e(objArrM, objArr3, i7, i8);
        }
        Object obj3 = objArrM[0];
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj3);
        return new e((Object[]) obj3, objArr3, i7, i8 - 5);
    }

    public final int s() {
        return (this.f1957m - 1) & (-32);
    }

    @Override // P3.AbstractC0564e, java.util.List, D5.b
    public final D5.b set(int i7, Object obj) {
        int i8 = this.f1957m;
        r.i(i7, i8);
        int iS = s();
        Object[] objArr = this.f1955k;
        Object[] objArr2 = this.f1956l;
        int i9 = this.f1958n;
        if (iS > i7) {
            return new e(t(objArr, i9, i7, obj), objArr2, i8, i9);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        l.e("copyOf(...)", objArrCopyOf);
        objArrCopyOf[i7 & 31] = obj;
        return new e(objArr, objArrCopyOf, i8, i9);
    }

    @Override // java.util.List, D5.b
    public final D5.b add(int i7, Object obj) {
        int i8 = this.f1957m;
        r.k(i7, i8);
        if (i7 == i8) {
            return add(obj);
        }
        int iS = s();
        Object[] objArr = this.f1955k;
        if (i7 >= iS) {
            return j(i7 - iS, obj, objArr);
        }
        C0.a aVar = new C0.a(null);
        return j(0, aVar.a, h(objArr, this.f1958n, i7, obj, aVar));
    }
}
