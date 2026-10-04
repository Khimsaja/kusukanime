package z5;

import b1.AbstractC0703b;

/* renamed from: z5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2499d {
    public static final int[] a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f19046b;

    static {
        int[] iArr = new int[256];
        int i7 = 0;
        for (int i8 = 0; i8 < 256; i8++) {
            iArr[i8] = "0123456789abcdef".charAt(i8 & 15) | ("0123456789abcdef".charAt(i8 >> 4) << '\b');
        }
        a = iArr;
        int[] iArr2 = new int[256];
        for (int i9 = 0; i9 < 256; i9++) {
            iArr2[i9] = "0123456789ABCDEF".charAt(i9 & 15) | ("0123456789ABCDEF".charAt(i9 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i10 = 0; i10 < 256; i10++) {
            iArr3[i10] = -1;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i11)] = i12;
            i11++;
            i12++;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i13)] = i14;
            i13++;
            i14++;
        }
        long[] jArr = new long[256];
        for (int i15 = 0; i15 < 256; i15++) {
            jArr[i15] = -1;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        int i18 = 0;
        while (i7 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i7)] = i18;
            i7++;
            i18++;
        }
        f19046b = jArr;
    }

    public static final void a(String str, int i7, int i8) {
        int i9 = i8 - i7;
        if (i9 < 1) {
            String strSubstring = str.substring(i7, i8);
            kotlin.jvm.internal.l.e("substring(...)", strSubstring);
            throw new NumberFormatException("Expected at least 1 hexadecimal digits at index " + i7 + ", but was \"" + strSubstring + "\" of length " + i9);
        }
        if (i9 > 16) {
            int i10 = (i9 + i7) - 16;
            while (i7 < i10) {
                if (str.charAt(i7) != '0') {
                    StringBuilder sbP = AbstractC0703b.p(i7, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    sbP.append(str.charAt(i7));
                    sbP.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbP.toString());
                }
                i7++;
            }
        }
    }

    public static long b(String str, int i7, int i8) {
        C2502g c2502g = C2502g.f19048d;
        kotlin.jvm.internal.l.f("format", c2502g);
        q0.c.l(i7, i8, str.length());
        if (c2502g.f19050c.a) {
            a(str, i7, i8);
            return c(str, i7, i8);
        }
        if (i8 - i7 > 0) {
            a(str, i7, i8);
            return c(str, i7, i8);
        }
        String strSubstring = str.substring(i7, i8);
        kotlin.jvm.internal.l.e("substring(...)", strSubstring);
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(strSubstring));
    }

    public static final long c(String str, int i7, int i8) {
        long j7 = 0;
        while (i7 < i8) {
            long j8 = j7 << 4;
            char cCharAt = str.charAt(i7);
            if ((cCharAt >>> '\b') == 0) {
                long j9 = f19046b[cCharAt];
                if (j9 >= 0) {
                    j7 = j8 | j9;
                    i7++;
                }
            }
            StringBuilder sbP = AbstractC0703b.p(i7, "Expected a hexadecimal digit at index ", ", but was ");
            sbP.append(str.charAt(i7));
            throw new NumberFormatException(sbP.toString());
        }
        return j7;
    }
}
