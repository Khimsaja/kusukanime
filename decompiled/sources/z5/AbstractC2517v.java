package z5;

import f6.AbstractC0915m;

/* renamed from: z5.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2517v extends AbstractC2516u {
    public static String H(char[] cArr, int i7, int i8) {
        q0.c.l(i7, i8, cArr.length);
        return new String(cArr, i7, i8 - i7);
    }

    public static String I(byte[] bArr) {
        kotlin.jvm.internal.l.f("<this>", bArr);
        return new String(bArr, C2496a.f19036b);
    }

    public static String J(byte[] bArr, int i7, int i8) {
        kotlin.jvm.internal.l.f("<this>", bArr);
        q0.c.l(i7, i8, bArr.length);
        return new String(bArr, i7, i8 - i7, C2496a.f19036b);
    }

    public static byte[] K(String str) {
        kotlin.jvm.internal.l.f("<this>", str);
        byte[] bytes = str.getBytes(C2496a.f19036b);
        kotlin.jvm.internal.l.e("getBytes(...)", bytes);
        return bytes;
    }

    public static boolean L(String str, String str2, boolean z7) {
        kotlin.jvm.internal.l.f("<this>", str);
        kotlin.jvm.internal.l.f("suffix", str2);
        return !z7 ? str.endsWith(str2) : O(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static boolean M(String str, String str2, boolean z7) {
        return str == null ? str2 == null : !z7 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final void N(String str) {
        throw new NumberFormatException(A6.b.d('\'', "Invalid number format: '", str));
    }

    public static boolean O(int i7, int i8, int i9, String str, String str2, boolean z7) {
        kotlin.jvm.internal.l.f("<this>", str);
        kotlin.jvm.internal.l.f("other", str2);
        return !z7 ? str.regionMatches(i7, str2, i8, i9) : str.regionMatches(z7, i7, str2, i8, i9);
    }

    public static String P(int i7, String str) {
        if (i7 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i7 + '.').toString());
        }
        if (i7 == 0) {
            return "";
        }
        int i8 = 1;
        if (i7 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i7];
            for (int i9 = 0; i9 < i7; i9++) {
                cArr[i9] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i7);
        if (1 <= i7) {
            while (true) {
                sb.append((CharSequence) str);
                if (i8 == i7) {
                    break;
                }
                i8++;
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.c(string);
        return string;
    }

    public static String Q(String str, char c2, char c4) {
        kotlin.jvm.internal.l.f("<this>", str);
        String strReplace = str.replace(c2, c4);
        kotlin.jvm.internal.l.e("replace(...)", strReplace);
        return strReplace;
    }

    public static String R(String str, String str2, String str3) {
        kotlin.jvm.internal.l.f("<this>", str);
        int iC0 = AbstractC2510o.c0(str, str2, 0, false);
        if (iC0 < 0) {
            return str;
        }
        int length = str2.length();
        int i7 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i8 = 0;
        do {
            sb.append((CharSequence) str, i8, iC0);
            sb.append(str3);
            i8 = iC0 + length;
            if (iC0 >= str.length()) {
                break;
            }
            iC0 = AbstractC2510o.c0(str, str2, iC0 + i7, false);
        } while (iC0 > 0);
        sb.append((CharSequence) str, i8, str.length());
        String string = sb.toString();
        kotlin.jvm.internal.l.e("toString(...)", string);
        return string;
    }

    public static boolean S(int i7, String str, String str2, boolean z7) {
        kotlin.jvm.internal.l.f("<this>", str);
        return !z7 ? str.startsWith(str2, i7) : O(i7, 0, str2.length(), str, str2, z7);
    }

    public static boolean T(String str, String str2, boolean z7) {
        kotlin.jvm.internal.l.f("<this>", str);
        kotlin.jvm.internal.l.f("prefix", str2);
        return !z7 ? str.startsWith(str2) : O(0, 0, str2.length(), str, str2, z7);
    }

    public static Integer U(String str) {
        boolean z7;
        int i7;
        int i8;
        kotlin.jvm.internal.l.f("<this>", str);
        AbstractC0915m.k(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char cCharAt = str.charAt(0);
        int i10 = -2147483647;
        if (kotlin.jvm.internal.l.g(cCharAt, 48) < 0) {
            i7 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z7 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i10 = Integer.MIN_VALUE;
                z7 = true;
            }
        } else {
            z7 = false;
            i7 = 0;
        }
        int i11 = -59652323;
        while (i7 < length) {
            int iDigit = Character.digit((int) str.charAt(i7), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i9 < i11 && (i11 != -59652323 || i9 < (i11 = i10 / 10))) || (i8 = i9 * 10) < i10 + iDigit) {
                return null;
            }
            i9 = i8 - iDigit;
            i7++;
        }
        return z7 ? Integer.valueOf(i9) : Integer.valueOf(-i9);
    }

    public static Long V(String str) {
        boolean z7;
        kotlin.jvm.internal.l.f("<this>", str);
        AbstractC0915m.k(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i7 = 0;
        char cCharAt = str.charAt(0);
        long j7 = -9223372036854775807L;
        if (kotlin.jvm.internal.l.g(cCharAt, 48) < 0) {
            z7 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z7 = false;
                i7 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j7 = Long.MIN_VALUE;
                i7 = 1;
            }
        } else {
            z7 = false;
        }
        long j8 = 0;
        long j9 = -256204778801521550L;
        while (i7 < length) {
            int iDigit = Character.digit((int) str.charAt(i7), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j8 < j9) {
                if (j9 != -256204778801521550L) {
                    return null;
                }
                j9 = j7 / 10;
                if (j8 < j9) {
                    return null;
                }
            }
            long j10 = j8 * 10;
            long j11 = iDigit;
            if (j10 < j7 + j11) {
                return null;
            }
            j8 = j10 - j11;
            i7++;
        }
        return z7 ? Long.valueOf(j8) : Long.valueOf(-j8);
    }
}
