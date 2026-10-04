package A5;

import java.io.Serializable;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class d implements Comparable, Serializable {

    /* renamed from: m, reason: collision with root package name */
    public static final d f249m = new d(-31557014167219200L, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final d f250n = new d(31556889864403199L, 999999999);

    /* renamed from: k, reason: collision with root package name */
    public final long f251k;

    /* renamed from: l, reason: collision with root package name */
    public final int f252l;

    public d(long j7, int i7) {
        this.f251k = j7;
        this.f252l = i7;
        if (-31557014167219200L > j7 || j7 >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(d dVar) {
        l.f("other", dVar);
        int iH = l.h(this.f251k, dVar.f251k);
        return iH != 0 ? iH : l.g(this.f252l, dVar.f252l);
    }

    public final d b(long j7) {
        int i7 = a.f239n;
        long jH = a.h(j7, c.f243n);
        int iD = a.d(j7);
        if (jH == 0 && iD == 0) {
            return this;
        }
        long j8 = this.f251k;
        long j9 = j8 + jH;
        return ((j8 ^ j9) >= 0 || (jH ^ j8) < 0) ? g.h(j9, this.f252l + iD) : j7 > 0 ? f250n : f249m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f251k == dVar.f251k && this.f252l == dVar.f252l;
    }

    public final int hashCode() {
        return (this.f252l * 51) + Long.hashCode(this.f251k);
    }

    public final String toString() {
        long j7;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j8 = this.f251k;
        long j9 = j8 / 86400;
        long j10 = 0;
        if ((j8 ^ 86400) < 0 && j9 * 86400 != j8) {
            j9--;
        }
        long j11 = j8 % 86400;
        int i7 = (int) (j11 + (86400 & (((j11 ^ 86400) & ((-j11) | j11)) >> 63)));
        long j12 = (j9 + 719528) - 60;
        if (j12 < 0) {
            long j13 = 146097;
            long j14 = ((j12 + 1) / j13) - 1;
            j7 = 0;
            j10 = 400 * j14;
            j12 += (-j14) * j13;
        } else {
            j7 = 0;
        }
        long j15 = 400;
        long j16 = ((j15 * j12) + 591) / 146097;
        long j17 = 365;
        long j18 = 4;
        long j19 = 100;
        long j20 = j12 - ((j16 / j15) + (((j16 / j18) + (j17 * j16)) - (j16 / j19)));
        if (j20 < j7) {
            j16--;
            j20 = j12 - ((j16 / j15) + (((j16 / j18) + (j17 * j16)) - (j16 / j19)));
        }
        int i8 = (int) j20;
        int i9 = ((i8 * 5) + 2) / 153;
        int i10 = ((i9 + 2) % 12) + 1;
        int i11 = (i8 - (((i9 * 306) + 5) / 10)) + 1;
        int i12 = (int) (j16 + j10 + (i9 / 10));
        int i13 = i7 / 3600;
        int i14 = i7 - (i13 * 3600);
        int i15 = i14 / 60;
        int i16 = i14 - (i15 * 60);
        int i17 = 0;
        if (Math.abs(i12) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i12 >= 0) {
                sb2.append(i12 + 10000);
                l.e("deleteCharAt(...)", sb2.deleteCharAt(0));
            } else {
                sb2.append(i12 - 10000);
                l.e("deleteCharAt(...)", sb2.deleteCharAt(1));
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i12 >= 10000) {
                sb.append('+');
            }
            sb.append(i12);
        }
        sb.append('-');
        g.g(sb, sb, i10);
        sb.append('-');
        g.g(sb, sb, i11);
        sb.append('T');
        g.g(sb, sb, i13);
        sb.append(':');
        g.g(sb, sb, i15);
        sb.append(':');
        g.g(sb, sb, i16);
        int i18 = this.f252l;
        if (i18 != 0) {
            sb.append('.');
            while (true) {
                iArr = g.a;
                int i19 = i17 + 1;
                if (i18 % iArr[i19] != 0) {
                    break;
                }
                i17 = i19;
            }
            int i20 = i17 - (i17 % 3);
            String strValueOf = String.valueOf((i18 / iArr[i20]) + iArr[9 - i20]);
            l.d("null cannot be cast to non-null type java.lang.String", strValueOf);
            String strSubstring = strValueOf.substring(1);
            l.e("substring(...)", strSubstring);
            sb.append(strSubstring);
        }
        sb.append('Z');
        return sb.toString();
    }
}
