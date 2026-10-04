package x6;

import b1.AbstractC0703b;
import java.io.EOFException;
import kotlin.jvm.internal.l;
import w6.AbstractC2217b;
import w6.C2224i;
import w6.D;
import z5.C2496a;

/* loaded from: classes.dex */
public abstract class a {
    public static final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f17521b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(C2496a.f19036b);
        l.e("getBytes(...)", bytes);
        a = bytes;
        f17521b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(C2224i c2224i, w6.l lVar, long j7, long j8, int i7) {
        D d4;
        long j9 = j7;
        long j10 = j8;
        l.f("<this>", c2224i);
        l.f("bytes", lVar);
        byte[] bArr = lVar.f17158k;
        long j11 = i7;
        AbstractC2217b.e(bArr.length, 0, j11);
        if (i7 <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long j12 = 0;
        if (j9 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.h("fromIndex < 0: ", j9).toString());
        }
        if (j9 > j10) {
            StringBuilder sbK = A6.b.k("fromIndex > toIndex: ", j9, " > ");
            sbK.append(j10);
            throw new IllegalArgumentException(sbK.toString().toString());
        }
        long j13 = c2224i.f17156l;
        if (j10 > j13) {
            j10 = j13;
        }
        if (j9 == j10 || (d4 = c2224i.f17155k) == null) {
            return -1L;
        }
        if (j13 - j9 < j9) {
            while (j13 > j9) {
                d4 = d4.f17121g;
                l.c(d4);
                j13 -= d4.f17117c - d4.f17116b;
            }
            byte b4 = bArr[0];
            long jMin = Math.min(j10, (c2224i.f17156l - j11) + 1);
            while (j13 < jMin) {
                int iMin = (int) Math.min(d4.f17117c, (d4.f17116b + jMin) - j13);
                int i8 = (int) ((d4.f17116b + j9) - j13);
                while (i8 < iMin) {
                    byte b7 = b4;
                    if (d4.a[i8] == b7 && b(d4, i8 + 1, bArr, 1, i7)) {
                        return (i8 - d4.f17116b) + j13;
                    }
                    i8++;
                    b4 = b7;
                }
                j13 += d4.f17117c - d4.f17116b;
                d4 = d4.f17120f;
                l.c(d4);
                j9 = j13;
            }
            return -1L;
        }
        while (true) {
            long j14 = (d4.f17117c - d4.f17116b) + j12;
            if (j14 > j9) {
                break;
            }
            d4 = d4.f17120f;
            l.c(d4);
            j12 = j14;
        }
        byte b8 = bArr[0];
        long jMin2 = Math.min(j10, (c2224i.f17156l - j11) + 1);
        while (j12 < jMin2) {
            int iMin2 = (int) Math.min(d4.f17117c, (d4.f17116b + jMin2) - j12);
            for (int i9 = (int) ((d4.f17116b + j9) - j12); i9 < iMin2; i9++) {
                if (d4.a[i9] == b8 && b(d4, i9 + 1, bArr, 1, i7)) {
                    return (i9 - d4.f17116b) + j12;
                }
            }
            j12 += d4.f17117c - d4.f17116b;
            d4 = d4.f17120f;
            l.c(d4);
            j9 = j12;
        }
        return -1L;
    }

    public static final boolean b(D d4, int i7, byte[] bArr, int i8, int i9) {
        int i10 = d4.f17117c;
        byte[] bArr2 = d4.a;
        while (i8 < i9) {
            if (i7 == i10) {
                d4 = d4.f17120f;
                l.c(d4);
                i7 = d4.f17116b;
                i10 = d4.f17117c;
                bArr2 = d4.a;
            }
            if (bArr2[i7] != bArr[i8]) {
                return false;
            }
            i7++;
            i8++;
        }
        return true;
    }

    public static final String c(C2224i c2224i, long j7) throws EOFException {
        l.f("<this>", c2224i);
        if (j7 > 0) {
            long j8 = j7 - 1;
            if (c2224i.v(j8) == 13) {
                String strZ = c2224i.Z(j8, C2496a.f19036b);
                c2224i.n(2L);
                return strZ;
            }
        }
        String strZ2 = c2224i.Z(j7, C2496a.f19036b);
        c2224i.n(1L);
        return strZ2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r19 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int d(w6.C2224i r17, w6.x r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.a.d(w6.i, w6.x, boolean):int");
    }
}
