package m;

import b1.AbstractC0703b;
import java.util.Arrays;

/* renamed from: m.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1495p {
    public int[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f12905b;

    public C1495p(int i7) {
        this.a = i7 == 0 ? AbstractC1490k.a : new int[i7];
    }

    public final void a(int i7) {
        b(this.f12905b + 1);
        int[] iArr = this.a;
        int i8 = this.f12905b;
        iArr[i8] = i7;
        this.f12905b = i8 + 1;
    }

    public final void b(int i7) {
        int[] iArr = this.a;
        if (iArr.length < i7) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i7, (iArr.length * 3) / 2));
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", iArrCopyOf);
            this.a = iArrCopyOf;
        }
    }

    public final int c(int i7) {
        if (i7 >= 0 && i7 < this.f12905b) {
            return this.a[i7];
        }
        StringBuilder sbP = AbstractC0703b.p(i7, "Index ", " must be in 0..");
        sbP.append(this.f12905b - 1);
        throw new IndexOutOfBoundsException(sbP.toString());
    }

    public final int d(int i7) {
        int i8;
        if (i7 < 0 || i7 >= (i8 = this.f12905b)) {
            StringBuilder sbP = AbstractC0703b.p(i7, "Index ", " must be in 0..");
            sbP.append(this.f12905b - 1);
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        int[] iArr = this.a;
        int i9 = iArr[i7];
        if (i7 != i8 - 1) {
            P3.m.V(i7, i7 + 1, i8, iArr, iArr);
        }
        this.f12905b--;
        return i9;
    }

    public final void e(int i7, int i8) {
        if (i7 < 0 || i7 >= this.f12905b) {
            StringBuilder sbP = AbstractC0703b.p(i7, "set index ", " must be between 0 .. ");
            sbP.append(this.f12905b - 1);
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        int[] iArr = this.a;
        int i9 = iArr[i7];
        iArr[i7] = i8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1495p) {
            C1495p c1495p = (C1495p) obj;
            int i7 = c1495p.f12905b;
            int i8 = this.f12905b;
            if (i7 == i8) {
                int[] iArr = this.a;
                int[] iArr2 = c1495p.a;
                k4.g gVarL = e3.c.L(0, i8);
                int i9 = gVarL.f12672k;
                int i10 = gVarL.f12673l;
                if (i9 > i10) {
                    return true;
                }
                while (iArr[i9] == iArr2[i9]) {
                    if (i9 == i10) {
                        return true;
                    }
                    i9++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i7 = this.f12905b;
        int iHashCode = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode += Integer.hashCode(iArr[i8]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.a;
        int i7 = this.f12905b;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                sb.append((CharSequence) "]");
                break;
            }
            int i9 = iArr[i8];
            if (i8 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i8 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i9);
            i8++;
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }

    public /* synthetic */ C1495p() {
        this(16);
    }
}
