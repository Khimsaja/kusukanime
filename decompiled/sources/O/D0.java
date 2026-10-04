package O;

import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayList;
import java.util.HashMap;
import m.C1496q;
import m.C1502w;

/* loaded from: classes.dex */
public final class D0 {
    public final B0 a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f6967b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f6968c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f6969d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f6970e;

    /* renamed from: f, reason: collision with root package name */
    public C1496q f6971f;

    /* renamed from: g, reason: collision with root package name */
    public int f6972g;

    /* renamed from: h, reason: collision with root package name */
    public int f6973h;

    /* renamed from: i, reason: collision with root package name */
    public int f6974i;

    /* renamed from: j, reason: collision with root package name */
    public int f6975j;

    /* renamed from: k, reason: collision with root package name */
    public int f6976k;

    /* renamed from: l, reason: collision with root package name */
    public int f6977l;

    /* renamed from: m, reason: collision with root package name */
    public int f6978m;

    /* renamed from: n, reason: collision with root package name */
    public int f6979n;

    /* renamed from: o, reason: collision with root package name */
    public int f6980o;

    /* renamed from: p, reason: collision with root package name */
    public final M f6981p;

    /* renamed from: q, reason: collision with root package name */
    public final M f6982q;

    /* renamed from: r, reason: collision with root package name */
    public final M f6983r;

    /* renamed from: s, reason: collision with root package name */
    public C1496q f6984s;

    /* renamed from: t, reason: collision with root package name */
    public int f6985t;

    /* renamed from: u, reason: collision with root package name */
    public int f6986u;

    /* renamed from: v, reason: collision with root package name */
    public int f6987v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6988w;

    /* renamed from: x, reason: collision with root package name */
    public D4.S f6989x;

    public D0(B0 b02) {
        this.a = b02;
        int[] iArr = b02.f6946k;
        this.f6967b = iArr;
        Object[] objArr = b02.f6948m;
        this.f6968c = objArr;
        this.f6969d = b02.f6953r;
        this.f6970e = b02.f6954s;
        this.f6971f = b02.f6955t;
        int i7 = b02.f6947l;
        this.f6972g = i7;
        this.f6973h = (iArr.length / 5) - i7;
        int i8 = b02.f6949n;
        this.f6976k = i8;
        this.f6977l = objArr.length - i8;
        this.f6978m = i7;
        this.f6981p = new M();
        this.f6982q = new M();
        this.f6983r = new M();
        this.f6986u = i7;
        this.f6987v = -1;
    }

    public static int h(int i7, int i8, int i9, int i10) {
        return i7 > i8 ? -(((i10 - i9) - i7) + 1) : i7;
    }

    public final boolean A() {
        C0484c c0484cI;
        if (this.f6979n != 0) {
            C0486d.w("Cannot remove group while inserting");
            throw null;
        }
        int i7 = this.f6985t;
        int i8 = this.f6974i;
        int iF = f(this.f6967b, p(i7));
        int iP = p(this.f6985t);
        int iJ = C0486d.j(this.f6967b, iP) + this.f6985t;
        this.f6985t = iJ;
        this.f6974i = f(this.f6967b, p(iJ));
        int iO = C0486d.m(this.f6967b, iP) ? 1 : C0486d.o(this.f6967b, iP);
        int i9 = this.f6987v;
        HashMap map = this.f6970e;
        if (map != null && (c0484cI = I(i9)) != null) {
        }
        D4.S s7 = this.f6989x;
        if (s7 != null) {
            while (true) {
                ArrayList arrayList = s7.f1530k;
                if (arrayList.isEmpty() || ((Number) P3.q.r0(arrayList)).intValue() < i7) {
                    break;
                }
                s7.y();
            }
        }
        boolean zB = B(i7, this.f6985t - i7);
        C(iF, this.f6974i - iF, i7 - 1);
        this.f6985t = i7;
        this.f6974i = i8;
        this.f6980o -= iO;
        return zB;
    }

    public final boolean B(int i7, int i8) {
        if (i8 > 0) {
            ArrayList arrayList = this.f6969d;
            u(i7);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f6970e;
                int i9 = i7 + i8;
                int iN = C0486d.n(this.f6969d, i9, m() - this.f6973h);
                if (iN >= this.f6969d.size()) {
                    iN--;
                }
                int i10 = iN + 1;
                int i11 = 0;
                while (iN >= 0) {
                    C0484c c0484c = (C0484c) this.f6969d.get(iN);
                    int iC = c(c0484c);
                    if (iC < i7) {
                        break;
                    }
                    if (iC < i9) {
                        c0484c.a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i11 == 0) {
                            i11 = iN + 1;
                        }
                        i10 = iN;
                    }
                    iN--;
                }
                z = i10 < i11;
                if (z) {
                    this.f6969d.subList(i10, i11).clear();
                }
            }
            this.f6972g = i7;
            this.f6973h += i8;
            int i12 = this.f6978m;
            if (i12 > i7) {
                this.f6978m = Math.max(i7, i12 - i8);
            }
            int i13 = this.f6986u;
            if (i13 >= this.f6972g) {
                this.f6986u = i13 - i8;
            }
            int i14 = this.f6987v;
            if (i14 >= 0 && C0486d.h(this.f6967b, p(i14))) {
                K(i14);
            }
        }
        return z;
    }

    public final void C(int i7, int i8, int i9) {
        if (i8 > 0) {
            int i10 = this.f6977l;
            int i11 = i7 + i8;
            v(i11, i9);
            this.f6976k = i7;
            this.f6977l = i10 + i8;
            P3.m.c0(this.f6968c, i7, i11);
            int i12 = this.f6975j;
            if (i12 >= i7) {
                this.f6975j = i12 - i8;
            }
        }
    }

    public final void D() {
        int i7 = this.f6986u;
        this.f6985t = i7;
        this.f6974i = f(this.f6967b, p(i7));
    }

    public final int E(int[] iArr, int i7) {
        if (i7 >= m()) {
            return this.f6968c.length - this.f6977l;
        }
        int iR = C0486d.r(iArr, i7);
        return iR < 0 ? (this.f6968c.length - this.f6977l) + iR + 1 : iR;
    }

    public final int F(int i7, int i8) {
        int iE = E(this.f6967b, p(i7));
        int i9 = iE + i8;
        if (i9 >= iE && i9 < f(this.f6967b, p(i7 + 1))) {
            return i9;
        }
        C0486d.w("Write to an invalid slot index " + i8 + " for group " + i7);
        throw null;
    }

    public final void G() {
        if (this.f6979n != 0) {
            C0486d.w("Key must be supplied when inserting");
            throw null;
        }
        T t7 = C0502l.a;
        H(0, t7, t7, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(int i7, Object obj, Object obj2, boolean z7) {
        int i8;
        HashMap map;
        C0484c c0484cI;
        int i9 = this.f6987v;
        Object[] objArr = this.f6979n > 0;
        this.f6983r.b(this.f6980o);
        T t7 = C0502l.a;
        if (objArr == true) {
            int i10 = this.f6985t;
            int iF = f(this.f6967b, p(i10));
            r(1);
            this.f6974i = iF;
            this.f6975j = iF;
            int iP = p(i10);
            int i11 = obj != t7 ? 1 : 0;
            int i12 = (z7 || obj2 == t7) ? 0 : 1;
            int iH = h(iF, this.f6976k, this.f6977l, this.f6968c.length);
            if (iH >= 0 && this.f6978m < i10) {
                iH = -(((this.f6968c.length - this.f6977l) - iH) + 1);
            }
            int[] iArr = this.f6967b;
            int i13 = this.f6987v;
            int i14 = z7 ? 1073741824 : 0;
            int i15 = i11 != 0 ? 536870912 : 0;
            int i16 = i12 != 0 ? 268435456 : 0;
            int i17 = iP * 5;
            iArr[i17] = i7;
            iArr[i17 + 1] = i14 | i15 | i16;
            iArr[i17 + 2] = i13;
            iArr[i17 + 3] = 0;
            iArr[i17 + 4] = iH;
            int i18 = (z7 ? 1 : 0) + i11 + i12;
            if (i18 > 0) {
                s(i18, i10);
                Object[] objArr2 = this.f6968c;
                int i19 = this.f6974i;
                if (z7) {
                    objArr2[i19] = obj2;
                    i19++;
                }
                if (i11 != 0) {
                    objArr2[i19] = obj;
                    i19++;
                }
                if (i12 != 0) {
                    objArr2[i19] = obj2;
                    i19++;
                }
                this.f6974i = i19;
            }
            this.f6980o = 0;
            i8 = i10 + 1;
            this.f6987v = i10;
            this.f6985t = i8;
            if (i9 >= 0 && (map = this.f6970e) != null && (c0484cI = I(i9)) != null) {
            }
        } else {
            this.f6981p.b(i9);
            this.f6982q.b((m() - this.f6973h) - this.f6986u);
            int i20 = this.f6985t;
            int iP2 = p(i20);
            if (!kotlin.jvm.internal.l.a(obj2, t7)) {
                if (z7) {
                    L(this.f6985t, obj2);
                } else {
                    J(obj2);
                }
            }
            this.f6974i = E(this.f6967b, iP2);
            this.f6975j = f(this.f6967b, p(this.f6985t + 1));
            this.f6980o = C0486d.o(this.f6967b, iP2);
            this.f6987v = i20;
            this.f6985t = i20 + 1;
            i8 = i20 + this.f6967b[(iP2 * 5) + 3];
        }
        this.f6986u = i8;
    }

    public final C0484c I(int i7) {
        ArrayList arrayList;
        int iQ;
        if (i7 < 0 || i7 >= n() || (iQ = C0486d.Q((arrayList = this.f6969d), i7, n())) < 0) {
            return null;
        }
        return (C0484c) arrayList.get(iQ);
    }

    public final void J(Object obj) {
        int iP = p(this.f6985t);
        if (!C0486d.k(this.f6967b, iP)) {
            C0486d.w("Updating the data of a group that was not created with a data slot");
            throw null;
        }
        Object[] objArr = this.f6968c;
        int[] iArr = this.f6967b;
        int iF = f(iArr, iP);
        int i7 = 1;
        switch (iArr[(iP * 5) + 1] >> 29) {
            case 0:
                i7 = 0;
                break;
            case 1:
            case 2:
            case GzipHeaderFlags.EXTRA /* 4 */:
                break;
            case 3:
            case 5:
            case 6:
                i7 = 2;
                break;
            default:
                i7 = 3;
                break;
        }
        objArr[g(i7 + iF)] = obj;
    }

    public final void K(int i7) {
        if (i7 >= 0) {
            D4.S s7 = this.f6989x;
            if (s7 == null) {
                s7 = new D4.S(2, false);
                this.f6989x = s7;
            }
            s7.f(i7);
        }
    }

    public final void L(int i7, Object obj) {
        int iP = p(i7);
        int[] iArr = this.f6967b;
        if (iP < iArr.length && C0486d.m(iArr, iP)) {
            this.f6968c[g(f(this.f6967b, iP))] = obj;
            return;
        }
        C0486d.w("Updating the node of a group at " + i7 + " that was not created with as a node group");
        throw null;
    }

    public final void a(int i7) {
        boolean z7 = false;
        if (!(i7 >= 0)) {
            C0486d.w("Cannot seek backwards");
            throw null;
        }
        if (!(this.f6979n <= 0)) {
            C0486d.U("Cannot call seek() while inserting");
            throw null;
        }
        if (i7 == 0) {
            return;
        }
        int i8 = this.f6985t + i7;
        if (i8 >= this.f6987v && i8 <= this.f6986u) {
            z7 = true;
        }
        if (z7) {
            this.f6985t = i8;
            int iF = f(this.f6967b, p(i8));
            this.f6974i = iF;
            this.f6975j = iF;
            return;
        }
        C0486d.w("Cannot seek outside the current group (" + this.f6987v + '-' + this.f6986u + ')');
        throw null;
    }

    public final C0484c b(int i7) {
        ArrayList arrayList = this.f6969d;
        int iQ = C0486d.Q(arrayList, i7, n());
        if (iQ >= 0) {
            return (C0484c) arrayList.get(iQ);
        }
        if (i7 > this.f6972g) {
            i7 = -(n() - i7);
        }
        C0484c c0484c = new C0484c(i7);
        arrayList.add(-(iQ + 1), c0484c);
        return c0484c;
    }

    public final int c(C0484c c0484c) {
        int i7 = c0484c.a;
        return i7 < 0 ? n() + i7 : i7;
    }

    public final void d() {
        int i7 = this.f6979n;
        this.f6979n = i7 + 1;
        if (i7 == 0) {
            this.f6982q.b((m() - this.f6973h) - this.f6986u);
        }
    }

    public final void e(boolean z7) {
        this.f6988w = true;
        if (z7 && this.f6981p.f7015b == 0) {
            u(n());
            v(this.f6968c.length - this.f6977l, this.f6972g);
            int i7 = this.f6976k;
            P3.m.c0(this.f6968c, i7, this.f6977l + i7);
            z();
        }
        int[] iArr = this.f6967b;
        int i8 = this.f6972g;
        Object[] objArr = this.f6968c;
        int i9 = this.f6976k;
        ArrayList arrayList = this.f6969d;
        HashMap map = this.f6970e;
        C1496q c1496q = this.f6971f;
        B0 b02 = this.a;
        b02.getClass();
        if (!b02.f6951p) {
            C0486d.T("Unexpected writer close()");
            throw null;
        }
        b02.f6951p = false;
        b02.f6946k = iArr;
        b02.f6947l = i8;
        b02.f6948m = objArr;
        b02.f6949n = i9;
        b02.f6953r = arrayList;
        b02.f6954s = map;
        b02.f6955t = c1496q;
    }

    public final int f(int[] iArr, int i7) {
        if (i7 >= m()) {
            return this.f6968c.length - this.f6977l;
        }
        int i8 = C0486d.i(iArr, i7);
        return i8 < 0 ? (this.f6968c.length - this.f6977l) + i8 + 1 : i8;
    }

    public final int g(int i7) {
        return i7 < this.f6976k ? i7 : i7 + this.f6977l;
    }

    public final void i() {
        C1502w c1502w;
        boolean z7 = this.f6979n > 0;
        int i7 = this.f6985t;
        int i8 = this.f6986u;
        int i9 = this.f6987v;
        int iP = p(i9);
        int i10 = this.f6980o;
        int i11 = i7 - i9;
        boolean zM = C0486d.m(this.f6967b, iP);
        M m7 = this.f6983r;
        if (z7) {
            C1496q c1496q = this.f6984s;
            if (c1496q != null && (c1502w = (C1502w) c1496q.e(i9)) != null) {
                Object[] objArr = c1502w.a;
                int i12 = c1502w.f12934b;
                for (int i13 = 0; i13 < i12; i13++) {
                    y(objArr[i13]);
                }
            }
            C0486d.s(iP, i11, this.f6967b);
            C0486d.t(iP, i10, this.f6967b);
            int iA = m7.a();
            if (zM) {
                i10 = 1;
            }
            this.f6980o = iA + i10;
            int iX = x(this.f6967b, i9);
            this.f6987v = iX;
            int iN = iX < 0 ? n() : p(iX + 1);
            int iF = iN >= 0 ? f(this.f6967b, iN) : 0;
            this.f6974i = iF;
            this.f6975j = iF;
            return;
        }
        if (i7 != i8) {
            C0486d.w("Expected to be at the end of a group");
            throw null;
        }
        int[] iArr = this.f6967b;
        int i14 = iArr[(iP * 5) + 3];
        int iO = C0486d.o(iArr, iP);
        C0486d.s(iP, i11, this.f6967b);
        C0486d.t(iP, i10, this.f6967b);
        int iA2 = this.f6981p.a();
        this.f6986u = (m() - this.f6973h) - this.f6982q.a();
        this.f6987v = iA2;
        int iX2 = x(this.f6967b, i9);
        int iA3 = m7.a();
        this.f6980o = iA3;
        if (iX2 == iA2) {
            this.f6980o = iA3 + (zM ? 0 : i10 - iO);
            return;
        }
        int i15 = i11 - i14;
        int i16 = zM ? 0 : i10 - iO;
        if (i15 != 0 || i16 != 0) {
            while (iX2 != 0 && iX2 != iA2 && (i16 != 0 || i15 != 0)) {
                int iP2 = p(iX2);
                if (i15 != 0) {
                    int[] iArr2 = this.f6967b;
                    C0486d.s(iP2, iArr2[(iP2 * 5) + 3] + i15, iArr2);
                }
                if (i16 != 0) {
                    int[] iArr3 = this.f6967b;
                    C0486d.t(iP2, C0486d.o(iArr3, iP2) + i16, iArr3);
                }
                if (C0486d.m(this.f6967b, iP2)) {
                    i16 = 0;
                }
                iX2 = x(this.f6967b, iX2);
            }
        }
        this.f6980o += i16;
    }

    public final void j() {
        int i7 = this.f6979n;
        if (!(i7 > 0)) {
            C0486d.U("Unbalanced begin/end insert");
            throw null;
        }
        int i8 = i7 - 1;
        this.f6979n = i8;
        if (i8 == 0) {
            if (this.f6983r.f7015b == this.f6981p.f7015b) {
                this.f6986u = (m() - this.f6973h) - this.f6982q.a();
            } else {
                C0486d.w("startGroup/endGroup mismatch while inserting");
                throw null;
            }
        }
    }

    public final void k(int i7) {
        boolean z7 = false;
        if (!(this.f6979n <= 0)) {
            C0486d.w("Cannot call ensureStarted() while inserting");
            throw null;
        }
        int i8 = this.f6987v;
        if (i8 != i7) {
            if (i7 >= i8 && i7 < this.f6986u) {
                z7 = true;
            }
            if (!z7) {
                C0486d.w("Started group at " + i7 + " must be a subgroup of the group at " + i8);
                throw null;
            }
            int i9 = this.f6985t;
            int i10 = this.f6974i;
            int i11 = this.f6975j;
            this.f6985t = i7;
            G();
            this.f6985t = i9;
            this.f6974i = i10;
            this.f6975j = i11;
        }
    }

    public final void l(int i7, int i8, int i9) {
        if (i7 >= this.f6972g) {
            i7 = -((n() - i7) + 2);
        }
        while (i9 < i8) {
            this.f6967b[(p(i9) * 5) + 2] = i7;
            int i10 = this.f6967b[(p(i9) * 5) + 3] + i9;
            l(i9, i10, i9 + 1);
            i9 = i10;
        }
    }

    public final int m() {
        return this.f6967b.length / 5;
    }

    public final int n() {
        return m() - this.f6973h;
    }

    public final int o() {
        return this.f6968c.length - this.f6977l;
    }

    public final int p(int i7) {
        return i7 < this.f6972g ? i7 : i7 + this.f6973h;
    }

    public final int q(int i7) {
        return C0486d.j(this.f6967b, p(i7));
    }

    public final void r(int i7) {
        if (i7 > 0) {
            int i8 = this.f6985t;
            u(i8);
            int i9 = this.f6972g;
            int i10 = this.f6973h;
            int[] iArr = this.f6967b;
            int length = iArr.length / 5;
            int i11 = length - i10;
            if (i10 < i7) {
                int iMax = Math.max(Math.max(length * 2, i11 + i7), 32);
                int[] iArr2 = new int[iMax * 5];
                int i12 = iMax - i11;
                P3.m.V(0, 0, i9 * 5, iArr, iArr2);
                P3.m.V((i9 + i12) * 5, (i10 + i9) * 5, length * 5, iArr, iArr2);
                this.f6967b = iArr2;
                i10 = i12;
            }
            int i13 = this.f6986u;
            if (i13 >= i9) {
                this.f6986u = i13 + i7;
            }
            int i14 = i9 + i7;
            this.f6972g = i14;
            this.f6973h = i10 - i7;
            int iH = h(i11 > 0 ? f(this.f6967b, p(i8 + i7)) : 0, this.f6978m >= i9 ? this.f6976k : 0, this.f6977l, this.f6968c.length);
            for (int i15 = i9; i15 < i14; i15++) {
                this.f6967b[(i15 * 5) + 4] = iH;
            }
            int i16 = this.f6978m;
            if (i16 >= i9) {
                this.f6978m = i16 + i7;
            }
        }
    }

    public final void s(int i7, int i8) {
        if (i7 > 0) {
            v(this.f6974i, i8);
            int i9 = this.f6976k;
            int i10 = this.f6977l;
            if (i10 < i7) {
                Object[] objArr = this.f6968c;
                int length = objArr.length;
                int i11 = length - i10;
                int iMax = Math.max(Math.max(length * 2, i11 + i7), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i12 = 0; i12 < iMax; i12++) {
                    objArr2[i12] = null;
                }
                int i13 = iMax - i11;
                P3.m.W(0, 0, i9, objArr, objArr2);
                P3.m.W(i9 + i13, i10 + i9, length, objArr, objArr2);
                this.f6968c = objArr2;
                i10 = i13;
            }
            int i14 = this.f6975j;
            if (i14 >= i9) {
                this.f6975j = i14 + i7;
            }
            this.f6976k = i9 + i7;
            this.f6977l = i10 - i7;
        }
    }

    public final void t(B0 b02, int i7) {
        C0486d.P(this.f6979n > 0);
        if (i7 == 0 && this.f6985t == 0 && this.a.f6947l == 0) {
            int[] iArr = b02.f6946k;
            int i8 = iArr[(i7 * 5) + 3];
            int i9 = b02.f6947l;
            if (i8 == i9) {
                int[] iArr2 = this.f6967b;
                Object[] objArr = this.f6968c;
                ArrayList arrayList = this.f6969d;
                HashMap map = this.f6970e;
                C1496q c1496q = this.f6971f;
                Object[] objArr2 = b02.f6948m;
                int i10 = b02.f6949n;
                HashMap map2 = b02.f6954s;
                C1496q c1496q2 = b02.f6955t;
                this.f6967b = iArr;
                this.f6968c = objArr2;
                this.f6969d = b02.f6953r;
                this.f6972g = i9;
                this.f6973h = (iArr.length / 5) - i9;
                this.f6976k = i10;
                this.f6977l = objArr2.length - i10;
                this.f6978m = i9;
                this.f6970e = map2;
                this.f6971f = c1496q2;
                b02.f6946k = iArr2;
                b02.f6947l = 0;
                b02.f6948m = objArr;
                b02.f6949n = 0;
                b02.f6953r = arrayList;
                b02.f6954s = map;
                b02.f6955t = c1496q;
                return;
            }
        }
        D0 d0M = b02.m();
        try {
            C0486d.H(d0M, i7, this, true, true, false);
            d0M.e(true);
        } catch (Throwable th) {
            d0M.e(false);
            throw th;
        }
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f6985t + " end=" + this.f6986u + " size = " + n() + " gap=" + this.f6972g + '-' + (this.f6972g + this.f6973h) + ')';
    }

    public final void u(int i7) {
        C0484c c0484c;
        int i8;
        C0484c c0484c2;
        int i9;
        int i10;
        int i11 = this.f6973h;
        int i12 = this.f6972g;
        if (i12 != i7) {
            if (!this.f6969d.isEmpty()) {
                int iM = m() - this.f6973h;
                if (i12 < i7) {
                    for (int iN = C0486d.n(this.f6969d, i12, iM); iN < this.f6969d.size() && (i9 = (c0484c2 = (C0484c) this.f6969d.get(iN)).a) < 0 && (i10 = i9 + iM) < i7; iN++) {
                        c0484c2.a = i10;
                    }
                } else {
                    for (int iN2 = C0486d.n(this.f6969d, i7, iM); iN2 < this.f6969d.size() && (i8 = (c0484c = (C0484c) this.f6969d.get(iN2)).a) >= 0; iN2++) {
                        c0484c.a = -(iM - i8);
                    }
                }
            }
            if (i11 > 0) {
                int[] iArr = this.f6967b;
                int i13 = i7 * 5;
                int i14 = i11 * 5;
                int i15 = i12 * 5;
                if (i7 < i12) {
                    P3.m.V(i14 + i13, i13, i15, iArr, iArr);
                } else {
                    P3.m.V(i15, i15 + i14, i13 + i14, iArr, iArr);
                }
            }
            if (i7 < i12) {
                i12 = i7 + i11;
            }
            int iM2 = m();
            C0486d.P(i12 < iM2);
            while (i12 < iM2) {
                int i16 = (i12 * 5) + 2;
                int i17 = this.f6967b[i16];
                int iN3 = i17 > -2 ? i17 : (n() + i17) - (-2);
                if (iN3 >= i7) {
                    iN3 = -((n() - iN3) - (-2));
                }
                if (iN3 != i17) {
                    this.f6967b[i16] = iN3;
                }
                i12++;
                if (i12 == i7) {
                    i12 += i11;
                }
            }
        }
        this.f6972g = i7;
    }

    public final void v(int i7, int i8) {
        int i9 = this.f6977l;
        int i10 = this.f6976k;
        int i11 = this.f6978m;
        if (i10 != i7) {
            Object[] objArr = this.f6968c;
            if (i7 < i10) {
                P3.m.W(i7 + i9, i7, i10, objArr, objArr);
            } else {
                P3.m.W(i10, i10 + i9, i7 + i9, objArr, objArr);
            }
        }
        int iMin = Math.min(i8 + 1, n());
        if (i11 != iMin) {
            int length = this.f6968c.length - i9;
            if (iMin < i11) {
                int iP = p(iMin);
                int iP2 = p(i11);
                int i12 = this.f6972g;
                while (iP < iP2) {
                    int[] iArr = this.f6967b;
                    int i13 = (iP * 5) + 4;
                    int i14 = iArr[i13];
                    if (i14 < 0) {
                        C0486d.w("Unexpected anchor value, expected a positive anchor");
                        throw null;
                    }
                    iArr[i13] = -((length - i14) + 1);
                    iP++;
                    if (iP == i12) {
                        iP += this.f6973h;
                    }
                }
            } else {
                int iP3 = p(i11);
                int iP4 = p(iMin);
                while (iP3 < iP4) {
                    int[] iArr2 = this.f6967b;
                    int i15 = (iP3 * 5) + 4;
                    int i16 = iArr2[i15];
                    if (i16 >= 0) {
                        C0486d.w("Unexpected anchor value, expected a negative anchor");
                        throw null;
                    }
                    iArr2[i15] = i16 + length + 1;
                    iP3++;
                    if (iP3 == this.f6972g) {
                        iP3 += this.f6973h;
                    }
                }
            }
            this.f6978m = iMin;
        }
        this.f6976k = i7;
    }

    public final Object w(int i7) {
        int iP = p(i7);
        if (C0486d.m(this.f6967b, iP)) {
            return this.f6968c[g(f(this.f6967b, iP))];
        }
        return null;
    }

    public final int x(int[] iArr, int i7) {
        int iP = C0486d.p(iArr, p(i7));
        return iP > -2 ? iP : (n() + iP) - (-2);
    }

    public final Object y(Object obj) {
        if (this.f6979n > 0) {
            s(1, this.f6987v);
        }
        Object[] objArr = this.f6968c;
        int i7 = this.f6974i;
        this.f6974i = i7 + 1;
        Object obj2 = objArr[g(i7)];
        int i8 = this.f6974i;
        if (i8 <= this.f6975j) {
            this.f6968c[g(i8 - 1)] = obj;
            return obj2;
        }
        C0486d.w("Writing to an invalid slot");
        throw null;
    }

    public final void z() {
        boolean z7;
        D4.S s7 = this.f6989x;
        if (s7 != null) {
            while (!s7.f1530k.isEmpty()) {
                int iY = s7.y();
                int iP = p(iY);
                int iQ = iY + 1;
                int iQ2 = q(iY) + iY;
                while (true) {
                    if (iQ >= iQ2) {
                        z7 = false;
                        break;
                    } else {
                        if ((this.f6967b[(p(iQ) * 5) + 1] & 201326592) != 0) {
                            z7 = true;
                            break;
                        }
                        iQ += q(iQ);
                    }
                }
                if (C0486d.h(this.f6967b, iP) != z7) {
                    int[] iArr = this.f6967b;
                    int i7 = (iP * 5) + 1;
                    if (z7) {
                        iArr[i7] = iArr[i7] | 67108864;
                    } else {
                        iArr[i7] = iArr[i7] & (-67108865);
                    }
                    int iX = x(iArr, iY);
                    if (iX >= 0) {
                        s7.f(iX);
                    }
                }
            }
        }
    }
}
