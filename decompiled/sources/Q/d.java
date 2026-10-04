package Q;

import P3.m;
import P3.r;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class d implements RandomAccess {

    /* renamed from: k, reason: collision with root package name */
    public Object[] f7827k;

    /* renamed from: l, reason: collision with root package name */
    public a f7828l;

    /* renamed from: m, reason: collision with root package name */
    public int f7829m = 0;

    public d(Object[] objArr) {
        this.f7827k = objArr;
    }

    public final void a(int i7, Object obj) {
        i(this.f7829m + 1);
        Object[] objArr = this.f7827k;
        int i8 = this.f7829m;
        if (i7 != i8) {
            m.W(i7 + 1, i7, i8, objArr, objArr);
        }
        objArr[i7] = obj;
        this.f7829m++;
    }

    public final void b(Object obj) {
        i(this.f7829m + 1);
        Object[] objArr = this.f7827k;
        int i7 = this.f7829m;
        objArr[i7] = obj;
        this.f7829m = i7 + 1;
    }

    public final void c(int i7, d dVar) {
        if (dVar.k()) {
            return;
        }
        i(this.f7829m + dVar.f7829m);
        Object[] objArr = this.f7827k;
        int i8 = this.f7829m;
        if (i7 != i8) {
            m.W(dVar.f7829m + i7, i7, i8, objArr, objArr);
        }
        m.W(i7, 0, dVar.f7829m, dVar.f7827k, objArr);
        this.f7829m += dVar.f7829m;
    }

    public final void d(int i7, List list) {
        if (list.isEmpty()) {
            return;
        }
        i(list.size() + this.f7829m);
        Object[] objArr = this.f7827k;
        if (i7 != this.f7829m) {
            m.W(list.size() + i7, i7, this.f7829m, objArr, objArr);
        }
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i7 + i8] = list.get(i8);
        }
        this.f7829m = list.size() + this.f7829m;
    }

    public final boolean e(int i7, Collection collection) {
        int i8 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        i(collection.size() + this.f7829m);
        Object[] objArr = this.f7827k;
        if (i7 != this.f7829m) {
            m.W(collection.size() + i7, i7, this.f7829m, objArr, objArr);
        }
        for (Object obj : collection) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                r.X();
                throw null;
            }
            objArr[i8 + i7] = obj;
            i8 = i9;
        }
        this.f7829m = collection.size() + this.f7829m;
        return true;
    }

    public final List f() {
        a aVar = this.f7828l;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f7828l = aVar2;
        return aVar2;
    }

    public final void g() {
        Object[] objArr = this.f7827k;
        int i7 = this.f7829m;
        while (true) {
            i7--;
            if (-1 >= i7) {
                this.f7829m = 0;
                return;
            }
            objArr[i7] = null;
        }
    }

    public final boolean h(Object obj) {
        int i7 = this.f7829m - 1;
        if (i7 >= 0) {
            for (int i8 = 0; !l.a(this.f7827k[i8], obj); i8++) {
                if (i8 != i7) {
                }
            }
            return true;
        }
        return false;
    }

    public final void i(int i7) {
        Object[] objArr = this.f7827k;
        if (objArr.length < i7) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i7, objArr.length * 2));
            l.e("copyOf(this, newSize)", objArrCopyOf);
            this.f7827k = objArrCopyOf;
        }
    }

    public final int j(Object obj) {
        int i7 = this.f7829m;
        if (i7 <= 0) {
            return -1;
        }
        Object[] objArr = this.f7827k;
        int i8 = 0;
        while (!l.a(obj, objArr[i8])) {
            i8++;
            if (i8 >= i7) {
                return -1;
            }
        }
        return i8;
    }

    public final boolean k() {
        return this.f7829m == 0;
    }

    public final boolean l() {
        return this.f7829m != 0;
    }

    public final boolean m(Object obj) {
        int iJ = j(obj);
        if (iJ < 0) {
            return false;
        }
        n(iJ);
        return true;
    }

    public final Object n(int i7) {
        Object[] objArr = this.f7827k;
        Object obj = objArr[i7];
        int i8 = this.f7829m;
        if (i7 != i8 - 1) {
            m.W(i7, i7 + 1, i8, objArr, objArr);
        }
        int i9 = this.f7829m - 1;
        this.f7829m = i9;
        objArr[i9] = null;
        return obj;
    }

    public final void o(int i7, int i8) {
        if (i8 > i7) {
            int i9 = this.f7829m;
            if (i8 < i9) {
                Object[] objArr = this.f7827k;
                m.W(i7, i8, i9, objArr, objArr);
            }
            int i10 = this.f7829m;
            int i11 = i10 - (i8 - i7);
            int i12 = i10 - 1;
            if (i11 <= i12) {
                int i13 = i11;
                while (true) {
                    this.f7827k[i13] = null;
                    if (i13 == i12) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.f7829m = i11;
        }
    }

    public final void p(Comparator comparator) {
        Arrays.sort(this.f7827k, 0, this.f7829m, comparator);
    }
}
