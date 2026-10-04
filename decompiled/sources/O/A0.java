package O;

import b1.AbstractC0703b;
import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class A0 {
    public final B0 a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f6930b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6931c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f6932d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6933e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6934f;

    /* renamed from: g, reason: collision with root package name */
    public int f6935g;

    /* renamed from: h, reason: collision with root package name */
    public int f6936h;

    /* renamed from: i, reason: collision with root package name */
    public int f6937i;

    /* renamed from: j, reason: collision with root package name */
    public final M f6938j;

    /* renamed from: k, reason: collision with root package name */
    public int f6939k;

    /* renamed from: l, reason: collision with root package name */
    public int f6940l;

    /* renamed from: m, reason: collision with root package name */
    public int f6941m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6942n;

    public A0(B0 b02) {
        this.a = b02;
        this.f6930b = b02.f6946k;
        int i7 = b02.f6947l;
        this.f6931c = i7;
        this.f6932d = b02.f6948m;
        this.f6933e = b02.f6949n;
        this.f6936h = i7;
        this.f6937i = -1;
        this.f6938j = new M();
    }

    public final C0484c a(int i7) {
        ArrayList arrayList = this.a.f6953r;
        int iQ = C0486d.Q(arrayList, i7, this.f6931c);
        if (iQ >= 0) {
            return (C0484c) arrayList.get(iQ);
        }
        C0484c c0484c = new C0484c(i7);
        arrayList.add(-(iQ + 1), c0484c);
        return c0484c;
    }

    public final Object b(int[] iArr, int i7) {
        int length;
        if (!C0486d.k(iArr, i7)) {
            return C0502l.a;
        }
        int i8 = i7 * 5;
        if (i8 >= iArr.length) {
            length = iArr.length;
        } else {
            int i9 = iArr[i8 + 4];
            int i10 = 1;
            switch (iArr[i8 + 1] >> 29) {
                case 0:
                    i10 = 0;
                    break;
                case 1:
                case 2:
                case GzipHeaderFlags.EXTRA /* 4 */:
                    break;
                case 3:
                case 5:
                case 6:
                    i10 = 2;
                    break;
                default:
                    i10 = 3;
                    break;
            }
            length = i10 + i9;
        }
        return this.f6932d[length];
    }

    public final void c() {
        int i7;
        this.f6934f = true;
        B0 b02 = this.a;
        b02.getClass();
        if (this.a != b02 || (i7 = b02.f6950o) <= 0) {
            C0486d.w("Unexpected reader close()");
            throw null;
        }
        b02.f6950o = i7 - 1;
    }

    public final void d() {
        if (this.f6939k == 0) {
            if (!(this.f6935g == this.f6936h)) {
                C0486d.w("endGroup() not called at the end of a group");
                throw null;
            }
            int i7 = this.f6937i;
            int[] iArr = this.f6930b;
            int iP = C0486d.p(iArr, i7);
            this.f6937i = iP;
            int i8 = this.f6931c;
            this.f6936h = iP < 0 ? i8 : C0486d.j(iArr, iP) + iP;
            int iA = this.f6938j.a();
            if (iA < 0) {
                this.f6940l = 0;
                this.f6941m = 0;
            } else {
                this.f6940l = iA;
                this.f6941m = iP >= i8 - 1 ? this.f6933e : C0486d.i(iArr, iP + 1);
            }
        }
    }

    public final Object e() {
        int i7 = this.f6935g;
        if (i7 < this.f6936h) {
            return b(this.f6930b, i7);
        }
        return 0;
    }

    public final int f() {
        int i7 = this.f6935g;
        if (i7 >= this.f6936h) {
            return 0;
        }
        return this.f6930b[i7 * 5];
    }

    public final Object g(int i7, int i8) {
        int[] iArr = this.f6930b;
        int iR = C0486d.r(iArr, i7);
        int i9 = i7 + 1;
        int i10 = iR + i8;
        return i10 < (i9 < this.f6931c ? iArr[(i9 * 5) + 4] : this.f6933e) ? this.f6932d[i10] : C0502l.a;
    }

    public final Object h() {
        int i7;
        if (this.f6939k > 0 || (i7 = this.f6940l) >= this.f6941m) {
            this.f6942n = false;
            return C0502l.a;
        }
        this.f6942n = true;
        this.f6940l = i7 + 1;
        return this.f6932d[i7];
    }

    public final Object i(int i7) {
        int[] iArr = this.f6930b;
        if (!C0486d.m(iArr, i7)) {
            return null;
        }
        if (!C0486d.m(iArr, i7)) {
            return C0502l.a;
        }
        return this.f6932d[iArr[(i7 * 5) + 4]];
    }

    public final Object j(int[] iArr, int i7) {
        if (!C0486d.l(iArr, i7)) {
            return null;
        }
        Object[] objArr = this.f6932d;
        int i8 = i7 * 5;
        int i9 = iArr[i8 + 4];
        int i10 = 1;
        switch (iArr[i8 + 1] >> 30) {
            case 0:
                i10 = 0;
                break;
            case 1:
            case 2:
            case GzipHeaderFlags.EXTRA /* 4 */:
                break;
            case 3:
            case 5:
            case 6:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        return objArr[i10 + i9];
    }

    public final void k(int i7) {
        if (!(this.f6939k == 0)) {
            C0486d.w("Cannot reposition while in an empty region");
            throw null;
        }
        this.f6935g = i7;
        int[] iArr = this.f6930b;
        int i8 = this.f6931c;
        int iP = i7 < i8 ? C0486d.p(iArr, i7) : -1;
        this.f6937i = iP;
        if (iP < 0) {
            this.f6936h = i8;
        } else {
            this.f6936h = C0486d.j(iArr, iP) + iP;
        }
        this.f6940l = 0;
        this.f6941m = 0;
    }

    public final int l() {
        if (!(this.f6939k == 0)) {
            C0486d.w("Cannot skip while in an empty region");
            throw null;
        }
        int i7 = this.f6935g;
        int[] iArr = this.f6930b;
        int iO = C0486d.m(iArr, i7) ? 1 : C0486d.o(iArr, this.f6935g);
        int i8 = this.f6935g;
        this.f6935g = C0486d.j(iArr, i8) + i8;
        return iO;
    }

    public final void m() {
        if (!(this.f6939k == 0)) {
            C0486d.w("Cannot skip the enclosing group while in an empty region");
            throw null;
        }
        this.f6935g = this.f6936h;
        this.f6940l = 0;
        this.f6941m = 0;
    }

    public final void n() {
        if (this.f6939k <= 0) {
            int i7 = this.f6937i;
            int i8 = this.f6935g;
            int[] iArr = this.f6930b;
            if (!(C0486d.p(iArr, i8) == i7)) {
                C0486d.T("Invalid slot table detected");
                throw null;
            }
            int i9 = this.f6940l;
            int i10 = this.f6941m;
            M m7 = this.f6938j;
            if (i9 == 0 && i10 == 0) {
                m7.b(-1);
            } else {
                m7.b(i9);
            }
            this.f6937i = i8;
            this.f6936h = C0486d.j(iArr, i8) + i8;
            int i11 = i8 + 1;
            this.f6935g = i11;
            this.f6940l = C0486d.r(iArr, i8);
            this.f6941m = i8 >= this.f6931c - 1 ? this.f6933e : C0486d.i(iArr, i11);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f6935g);
        sb.append(", key=");
        sb.append(f());
        sb.append(", parent=");
        sb.append(this.f6937i);
        sb.append(", end=");
        return AbstractC0703b.l(sb, this.f6936h, ')');
    }
}
