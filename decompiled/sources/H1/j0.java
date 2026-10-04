package H1;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class j0 extends y1.P {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f3508k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f3509b;

    /* renamed from: c, reason: collision with root package name */
    public final O1.c0 f3510c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3511d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3512e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f3513f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f3514g;

    /* renamed from: h, reason: collision with root package name */
    public final y1.P[] f3515h;

    /* renamed from: i, reason: collision with root package name */
    public final Object[] f3516i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f3517j;

    /* JADX WARN: Illegal instructions before constructor call */
    public j0(List list, O1.c0 c0Var) {
        y1.P[] pArr = new y1.P[list.size()];
        Iterator it = list.iterator();
        int i7 = 0;
        int i8 = 0;
        while (it.hasNext()) {
            pArr[i8] = ((U) it.next()).b();
            i8++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i7] = ((U) it2.next()).a();
            i7++;
        }
        this(pArr, objArr, c0Var);
    }

    @Override // y1.P
    public final int a(boolean z7) {
        if (this.f3509b != 0) {
            int iQ = 0;
            if (z7) {
                int[] iArr = this.f3510c.f7420b;
                iQ = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                y1.P[] pArr = this.f3515h;
                if (!pArr[iQ].p()) {
                    return pArr[iQ].a(z7) + this.f3514g[iQ];
                }
                iQ = q(iQ, z7);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // y1.P
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f3517j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = this.f3515h[iIntValue].b(obj3)) != -1) {
                return this.f3513f[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // y1.P
    public final int c(boolean z7) {
        int iR;
        int i7 = this.f3509b;
        if (i7 != 0) {
            if (z7) {
                int[] iArr = this.f3510c.f7420b;
                iR = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iR = i7 - 1;
            }
            do {
                y1.P[] pArr = this.f3515h;
                if (!pArr[iR].p()) {
                    return pArr[iR].c(z7) + this.f3514g[iR];
                }
                iR = r(iR, z7);
            } while (iR != -1);
        }
        return -1;
    }

    @Override // y1.P
    public final int e(int i7, int i8, boolean z7) {
        int[] iArr = this.f3514g;
        int iC = B1.K.c(iArr, i7 + 1, false, false);
        int i9 = iArr[iC];
        y1.P[] pArr = this.f3515h;
        int iE = pArr[iC].e(i7 - i9, i8 != 2 ? i8 : 0, z7);
        if (iE != -1) {
            return i9 + iE;
        }
        int iQ = q(iC, z7);
        while (iQ != -1 && pArr[iQ].p()) {
            iQ = q(iQ, z7);
        }
        if (iQ != -1) {
            return pArr[iQ].a(z7) + iArr[iQ];
        }
        if (i8 == 2) {
            return a(z7);
        }
        return -1;
    }

    @Override // y1.P
    public final y1.N f(int i7, y1.N n7, boolean z7) {
        int[] iArr = this.f3513f;
        int iC = B1.K.c(iArr, i7 + 1, false, false);
        int i8 = this.f3514g[iC];
        this.f3515h[iC].f(i7 - iArr[iC], n7, z7);
        n7.f17948c += i8;
        if (z7) {
            Object obj = this.f3516i[iC];
            Object obj2 = n7.f17947b;
            obj2.getClass();
            n7.f17947b = Pair.create(obj, obj2);
        }
        return n7;
    }

    @Override // y1.P
    public final y1.N g(Object obj, y1.N n7) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f3517j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i7 = this.f3514g[iIntValue];
        this.f3515h[iIntValue].g(obj3, n7);
        n7.f17948c += i7;
        n7.f17947b = obj;
        return n7;
    }

    @Override // y1.P
    public final int h() {
        return this.f3512e;
    }

    @Override // y1.P
    public final int k(int i7, int i8, boolean z7) {
        int[] iArr = this.f3514g;
        int iC = B1.K.c(iArr, i7 + 1, false, false);
        int i9 = iArr[iC];
        y1.P[] pArr = this.f3515h;
        int iK = pArr[iC].k(i7 - i9, i8 != 2 ? i8 : 0, z7);
        if (iK != -1) {
            return i9 + iK;
        }
        int iR = r(iC, z7);
        while (iR != -1 && pArr[iR].p()) {
            iR = r(iR, z7);
        }
        if (iR != -1) {
            return pArr[iR].c(z7) + iArr[iR];
        }
        if (i8 == 2) {
            return c(z7);
        }
        return -1;
    }

    @Override // y1.P
    public final Object l(int i7) {
        int[] iArr = this.f3513f;
        int iC = B1.K.c(iArr, i7 + 1, false, false);
        return Pair.create(this.f3516i[iC], this.f3515h[iC].l(i7 - iArr[iC]));
    }

    @Override // y1.P
    public final y1.O m(int i7, y1.O o7, long j7) {
        int[] iArr = this.f3514g;
        int iC = B1.K.c(iArr, i7 + 1, false, false);
        int i8 = iArr[iC];
        int i9 = this.f3513f[iC];
        this.f3515h[iC].m(i7 - i8, o7, j7);
        Object objCreate = this.f3516i[iC];
        if (!y1.O.f17953p.equals(o7.a)) {
            objCreate = Pair.create(objCreate, o7.a);
        }
        o7.a = objCreate;
        o7.f17966m += i9;
        o7.f17967n += i9;
        return o7;
    }

    @Override // y1.P
    public final int o() {
        return this.f3511d;
    }

    public final int q(int i7, boolean z7) {
        if (!z7) {
            if (i7 < this.f3509b - 1) {
                return i7 + 1;
            }
            return -1;
        }
        O1.c0 c0Var = this.f3510c;
        int i8 = c0Var.f7421c[i7] + 1;
        int[] iArr = c0Var.f7420b;
        if (i8 < iArr.length) {
            return iArr[i8];
        }
        return -1;
    }

    public final int r(int i7, boolean z7) {
        if (!z7) {
            if (i7 > 0) {
                return i7 - 1;
            }
            return -1;
        }
        O1.c0 c0Var = this.f3510c;
        int i8 = c0Var.f7421c[i7] - 1;
        if (i8 >= 0) {
            return c0Var.f7420b[i8];
        }
        return -1;
    }

    public j0(y1.P[] pArr, Object[] objArr, O1.c0 c0Var) {
        this.f3510c = c0Var;
        this.f3509b = c0Var.f7420b.length;
        int length = pArr.length;
        this.f3515h = pArr;
        this.f3513f = new int[length];
        this.f3514g = new int[length];
        this.f3516i = objArr;
        this.f3517j = new HashMap();
        int length2 = pArr.length;
        int i7 = 0;
        int iO = 0;
        int iH = 0;
        int i8 = 0;
        while (i7 < length2) {
            y1.P p7 = pArr[i7];
            this.f3515h[i8] = p7;
            this.f3514g[i8] = iO;
            this.f3513f[i8] = iH;
            iO += p7.o();
            iH += this.f3515h[i8].h();
            this.f3517j.put(objArr[i8], Integer.valueOf(i8));
            i7++;
            i8++;
        }
        this.f3511d = iO;
        this.f3512e = iH;
    }
}
