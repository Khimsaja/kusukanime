package w6;

import b1.AbstractC0703b;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import v.c0;

/* loaded from: classes.dex */
public final class F extends l {

    /* renamed from: o, reason: collision with root package name */
    public final transient byte[][] f17124o;

    /* renamed from: p, reason: collision with root package name */
    public final transient int[] f17125p;

    public F(byte[][] bArr, int[] iArr) {
        super(l.f17157n.f17158k);
        this.f17124o = bArr;
        this.f17125p = iArr;
    }

    @Override // w6.l
    public final String a() {
        throw null;
    }

    @Override // w6.l
    public final l c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f17124o;
        int length = bArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int[] iArr = this.f17125p;
            int i9 = iArr[length + i7];
            int i10 = iArr[i7];
            messageDigest.update(bArr[i7], i9, i10 - i8);
            i7++;
            i8 = i10;
        }
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.l.c(bArrDigest);
        return new l(bArrDigest);
    }

    @Override // w6.l
    public final int d() {
        return this.f17125p[this.f17124o.length - 1];
    }

    @Override // w6.l
    public final String e() {
        return t().e();
    }

    @Override // w6.l
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (lVar.d() == d() && m(0, lVar, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // w6.l
    public final int f(byte[] bArr, int i7) {
        kotlin.jvm.internal.l.f("other", bArr);
        return t().f(bArr, i7);
    }

    @Override // w6.l
    public final byte[] h() {
        return q();
    }

    @Override // w6.l
    public final int hashCode() {
        int i7 = this.f17159l;
        if (i7 != 0) {
            return i7;
        }
        byte[][] bArr = this.f17124o;
        int length = bArr.length;
        int i8 = 0;
        int i9 = 1;
        int i10 = 0;
        while (i8 < length) {
            int[] iArr = this.f17125p;
            int i11 = iArr[length + i8];
            int i12 = iArr[i8];
            byte[] bArr2 = bArr[i8];
            int i13 = (i12 - i10) + i11;
            while (i11 < i13) {
                i9 = (i9 * 31) + bArr2[i11];
                i11++;
            }
            i8++;
            i10 = i12;
        }
        this.f17159l = i9;
        return i9;
    }

    @Override // w6.l
    public final byte i(int i7) {
        byte[][] bArr = this.f17124o;
        int length = bArr.length - 1;
        int[] iArr = this.f17125p;
        AbstractC2217b.e(iArr[length], i7, 1L);
        int iH = x6.b.h(this, i7);
        return bArr[iH][(i7 - (iH == 0 ? 0 : iArr[iH - 1])) + iArr[bArr.length + iH]];
    }

    @Override // w6.l
    public final int j(byte[] bArr) {
        kotlin.jvm.internal.l.f("other", bArr);
        return t().j(bArr);
    }

    @Override // w6.l
    public final boolean l(int i7, int i8, int i9, byte[] bArr) {
        kotlin.jvm.internal.l.f("other", bArr);
        if (i7 < 0 || i7 > d() - i9 || i8 < 0 || i8 > bArr.length - i9) {
            return false;
        }
        int i10 = i9 + i7;
        int iH = x6.b.h(this, i7);
        while (i7 < i10) {
            int[] iArr = this.f17125p;
            int i11 = iH == 0 ? 0 : iArr[iH - 1];
            int i12 = iArr[iH] - i11;
            byte[][] bArr2 = this.f17124o;
            int i13 = iArr[bArr2.length + iH];
            int iMin = Math.min(i10, i12 + i11) - i7;
            if (!AbstractC2217b.a((i7 - i11) + i13, i8, iMin, bArr2[iH], bArr)) {
                return false;
            }
            i8 += iMin;
            i7 += iMin;
            iH++;
        }
        return true;
    }

    @Override // w6.l
    public final boolean m(int i7, l lVar, int i8) {
        kotlin.jvm.internal.l.f("other", lVar);
        if (i7 >= 0 && i7 <= d() - i8) {
            int i9 = i8 + i7;
            int iH = x6.b.h(this, i7);
            int i10 = 0;
            while (i7 < i9) {
                int[] iArr = this.f17125p;
                int i11 = iH == 0 ? 0 : iArr[iH - 1];
                int i12 = iArr[iH] - i11;
                byte[][] bArr = this.f17124o;
                int i13 = iArr[bArr.length + iH];
                int iMin = Math.min(i9, i12 + i11) - i7;
                if (lVar.l(i10, (i7 - i11) + i13, iMin, bArr[iH])) {
                    i10 += iMin;
                    i7 += iMin;
                    iH++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // w6.l
    public final l n(int i7, int i8) {
        if (i8 == -1234567890) {
            i8 = d();
        }
        if (i7 < 0) {
            throw new IllegalArgumentException(c0.a(i7, "beginIndex=", " < 0").toString());
        }
        if (i8 > d()) {
            StringBuilder sbP = AbstractC0703b.p(i8, "endIndex=", " > length(");
            sbP.append(d());
            sbP.append(')');
            throw new IllegalArgumentException(sbP.toString().toString());
        }
        int i9 = i8 - i7;
        if (i9 < 0) {
            throw new IllegalArgumentException(A6.b.e(i8, i7, "endIndex=", " < beginIndex=").toString());
        }
        if (i7 == 0 && i8 == d()) {
            return this;
        }
        if (i7 == i8) {
            return l.f17157n;
        }
        int iH = x6.b.h(this, i7);
        int iH2 = x6.b.h(this, i8 - 1);
        byte[][] bArr = this.f17124o;
        byte[][] bArr2 = (byte[][]) P3.m.b0(bArr, iH, iH2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f17125p;
        if (iH <= iH2) {
            int i10 = iH;
            int i11 = 0;
            while (true) {
                iArr[i11] = Math.min(iArr2[i10] - i7, i9);
                int i12 = i11 + 1;
                iArr[i11 + bArr2.length] = iArr2[bArr.length + i10];
                if (i10 == iH2) {
                    break;
                }
                i10++;
                i11 = i12;
            }
        }
        int i13 = iH != 0 ? iArr2[iH - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i7 - i13) + iArr[length];
        return new F(bArr2, iArr);
    }

    @Override // w6.l
    public final l p() {
        return t().p();
    }

    @Override // w6.l
    public final byte[] q() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f17124o;
        int length = bArr2.length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < length) {
            int[] iArr = this.f17125p;
            int i10 = iArr[length + i7];
            int i11 = iArr[i7];
            int i12 = i11 - i8;
            P3.m.U(i9, i10, i10 + i12, bArr2[i7], bArr);
            i9 += i12;
            i7++;
            i8 = i11;
        }
        return bArr;
    }

    @Override // w6.l
    public final void s(C2224i c2224i, int i7) {
        kotlin.jvm.internal.l.f("buffer", c2224i);
        int iH = x6.b.h(this, 0);
        int i8 = 0;
        while (i8 < i7) {
            int[] iArr = this.f17125p;
            int i9 = iH == 0 ? 0 : iArr[iH - 1];
            int i10 = iArr[iH] - i9;
            byte[][] bArr = this.f17124o;
            int i11 = iArr[bArr.length + iH];
            int iMin = Math.min(i7, i10 + i9) - i8;
            int i12 = (i8 - i9) + i11;
            D d4 = new D(bArr[iH], i12, i12 + iMin, true, false);
            D d6 = c2224i.f17155k;
            if (d6 == null) {
                d4.f17121g = d4;
                d4.f17120f = d4;
                c2224i.f17155k = d4;
            } else {
                D d7 = d6.f17121g;
                kotlin.jvm.internal.l.c(d7);
                d7.b(d4);
            }
            i8 += iMin;
            iH++;
        }
        c2224i.f17156l += i7;
    }

    public final l t() {
        return new l(q());
    }

    @Override // w6.l
    public final String toString() {
        return t().toString();
    }
}
