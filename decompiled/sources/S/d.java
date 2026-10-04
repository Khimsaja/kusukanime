package S;

import O.C0486d;
import P3.m;
import P3.r;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: k, reason: collision with root package name */
    public final Object[] f8683k;

    /* renamed from: l, reason: collision with root package name */
    public final Object[] f8684l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8685m;

    /* renamed from: n, reason: collision with root package name */
    public final int f8686n;

    public d(Object[] objArr, Object[] objArr2, int i7, int i8) {
        this.f8683k = objArr;
        this.f8684l = objArr2;
        this.f8685m = i7;
        this.f8686n = i8;
        if (a() > 32) {
            int length = objArr2.length;
            return;
        }
        C0486d.T("Trie-based persistent vector should have at least 33 elements, got " + a());
        throw null;
    }

    public static Object[] A(Object[] objArr, int i7, int i8, Object obj) {
        int iD = r.D(i8, i7);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        l.e("copyOf(this, newSize)", objArrCopyOf);
        if (i7 == 0) {
            objArrCopyOf[iD] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iD];
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
        objArrCopyOf[iD] = A((Object[]) obj2, i7 - 5, i8, obj);
        return objArrCopyOf;
    }

    public static Object[] s(Object[] objArr, int i7, int i8, Object obj, C0.a aVar) {
        Object[] objArrCopyOf;
        int iD = r.D(i8, i7);
        if (i7 == 0) {
            if (iD == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                l.e("copyOf(this, newSize)", objArrCopyOf);
            }
            m.W(iD + 1, iD, 31, objArr, objArrCopyOf);
            aVar.a = objArr[31];
            objArrCopyOf[iD] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        l.e("copyOf(this, newSize)", objArrCopyOf2);
        int i9 = i7 - 5;
        Object obj2 = objArr[iD];
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
        objArrCopyOf2[iD] = s((Object[]) obj2, i9, i8, obj, aVar);
        while (true) {
            iD++;
            if (iD >= 32 || objArrCopyOf2[iD] == null) {
                break;
            }
            Object obj3 = objArr[iD];
            l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj3);
            objArrCopyOf2[iD] = s((Object[]) obj3, i9, 0, aVar.a, aVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] u(Object[] objArr, int i7, int i8, C0.a aVar) {
        Object[] objArrU;
        int iD = r.D(i8, i7);
        if (i7 == 5) {
            aVar.a = objArr[iD];
            objArrU = null;
        } else {
            Object obj = objArr[iD];
            l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
            objArrU = u((Object[]) obj, i7 - 5, i8, aVar);
        }
        if (objArrU == null && iD == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        l.e("copyOf(this, newSize)", objArrCopyOf);
        objArrCopyOf[iD] = objArrU;
        return objArrCopyOf;
    }

    @Override // P3.AbstractC0560a
    public final int a() {
        return this.f8685m;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Object[] objArr;
        r.j(i7, a());
        if (z() <= i7) {
            objArr = this.f8684l;
        } else {
            objArr = this.f8683k;
            for (int i8 = this.f8686n; i8 > 0; i8 -= 5) {
                Object obj = objArr[r.D(i7, i8)];
                l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
                objArr = (Object[]) obj;
            }
        }
        return objArr[i7 & 31];
    }

    @Override // S.b
    public final b h(int i7, Object obj) {
        int i8 = this.f8685m;
        r.l(i7, i8);
        if (i7 == i8) {
            return j(obj);
        }
        int iZ = z();
        Object[] objArr = this.f8683k;
        if (i7 >= iZ) {
            return t(i7 - iZ, obj, objArr);
        }
        C0.a aVar = new C0.a(null);
        return t(0, aVar.a, s(objArr, this.f8686n, i7, obj, aVar));
    }

    @Override // S.b
    public final b j(Object obj) {
        int iZ = z();
        int i7 = this.f8685m;
        int i8 = i7 - iZ;
        Object[] objArr = this.f8683k;
        Object[] objArr2 = this.f8684l;
        if (i8 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return v(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        l.e("copyOf(this, newSize)", objArrCopyOf);
        objArrCopyOf[i8] = obj;
        return new d(objArr, objArrCopyOf, i7 + 1, this.f8686n);
    }

    @Override // P3.AbstractC0564e, java.util.List
    public final ListIterator listIterator(int i7) {
        r.l(i7, this.f8685m);
        return new f(i7, this.f8685m, (this.f8686n / 5) + 1, this.f8683k, this.f8684l);
    }

    @Override // S.b
    public final e o() {
        return new e(this, this.f8683k, this.f8684l, this.f8686n);
    }

    @Override // S.b
    public final b p(a aVar) {
        e eVar = new e(this, this.f8683k, this.f8684l, this.f8686n);
        eVar.I(aVar);
        return eVar.j();
    }

    @Override // S.b
    public final b q(int i7) {
        r.j(i7, this.f8685m);
        int iZ = z();
        Object[] objArr = this.f8683k;
        int i8 = this.f8686n;
        return i7 >= iZ ? y(objArr, iZ, i8, i7 - iZ) : y(x(objArr, i8, i7, new C0.a(this.f8684l[0])), iZ, i8, 0);
    }

    @Override // S.b
    public final b r(int i7, Object obj) {
        int i8 = this.f8685m;
        r.j(i7, i8);
        int iZ = z();
        Object[] objArr = this.f8683k;
        Object[] objArr2 = this.f8684l;
        int i9 = this.f8686n;
        if (iZ > i7) {
            return new d(A(objArr, i9, i7, obj), objArr2, i8, i9);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        l.e("copyOf(this, newSize)", objArrCopyOf);
        objArrCopyOf[i7 & 31] = obj;
        return new d(objArr, objArrCopyOf, i8, i9);
    }

    public final d t(int i7, Object obj, Object[] objArr) {
        int iZ = z();
        int i8 = this.f8685m;
        int i9 = i8 - iZ;
        Object[] objArr2 = this.f8684l;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        l.e("copyOf(this, newSize)", objArrCopyOf);
        if (i9 < 32) {
            m.W(i7 + 1, i7, i9, objArr2, objArrCopyOf);
            objArrCopyOf[i7] = obj;
            return new d(objArr, objArrCopyOf, i8 + 1, this.f8686n);
        }
        Object obj2 = objArr2[31];
        m.W(i7 + 1, i7, i9 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i7] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return v(objArr, objArrCopyOf, objArr3);
    }

    public final d v(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i7 = this.f8685m;
        int i8 = i7 >> 5;
        int i9 = this.f8686n;
        if (i8 <= (1 << i9)) {
            return new d(w(i9, objArr, objArr2), objArr3, i7 + 1, i9);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i10 = i9 + 5;
        return new d(w(i10, objArr4, objArr2), objArr3, i7 + 1, i10);
    }

    public final Object[] w(int i7, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iD = r.D(a() - 1, i7);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            l.e("copyOf(this, newSize)", objArrCopyOf);
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i7 == 5) {
            objArrCopyOf[iD] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iD] = w(i7 - 5, (Object[]) objArrCopyOf[iD], objArr2);
        return objArrCopyOf;
    }

    public final Object[] x(Object[] objArr, int i7, int i8, C0.a aVar) {
        Object[] objArrCopyOf;
        int iD = r.D(i8, i7);
        if (i7 == 0) {
            if (iD == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                l.e("copyOf(this, newSize)", objArrCopyOf);
            }
            m.W(iD, iD + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = aVar.a;
            aVar.a = objArr[iD];
            return objArrCopyOf;
        }
        int iD2 = objArr[31] == null ? r.D(z() - 1, i7) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        l.e("copyOf(this, newSize)", objArrCopyOf2);
        int i9 = i7 - 5;
        int i10 = iD + 1;
        if (i10 <= iD2) {
            while (true) {
                Object obj = objArrCopyOf2[iD2];
                l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
                objArrCopyOf2[iD2] = x((Object[]) obj, i9, 0, aVar);
                if (iD2 == i10) {
                    break;
                }
                iD2--;
            }
        }
        Object obj2 = objArrCopyOf2[iD];
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
        objArrCopyOf2[iD] = x((Object[]) obj2, i9, i8, aVar);
        return objArrCopyOf2;
    }

    public final b y(Object[] objArr, int i7, int i8, int i9) {
        int i10 = this.f8685m - i7;
        Object obj = null;
        if (i10 != 1) {
            Object[] objArr2 = this.f8684l;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            l.e("copyOf(this, newSize)", objArrCopyOf);
            int i11 = i10 - 1;
            if (i9 < i11) {
                m.W(i9, i9 + 1, i10, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i11] = null;
            return new d(objArr, objArrCopyOf, (i7 + i10) - 1, i8);
        }
        if (i8 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                l.e("copyOf(this, newSize)", objArr);
            }
            return new h(objArr);
        }
        C0.a aVar = new C0.a(obj);
        Object[] objArrU = u(objArr, i8, i7 - 1, aVar);
        l.c(objArrU);
        Object obj2 = aVar.a;
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
        Object[] objArr3 = (Object[]) obj2;
        if (objArrU[1] != null) {
            return new d(objArrU, objArr3, i7, i8);
        }
        Object obj3 = objArrU[0];
        l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj3);
        return new d((Object[]) obj3, objArr3, i7, i8 - 5);
    }

    public final int z() {
        return (this.f8685m - 1) & (-32);
    }
}
