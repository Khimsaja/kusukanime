package z5;

import b1.AbstractC0703b;
import f6.AbstractC0915m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import v.c0;

/* renamed from: z5.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2510o extends AbstractC2517v {
    public static String A0(char c2, String str, String str2) {
        int iD0 = d0(str, c2, 0, 6);
        if (iD0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iD0 + 1, str.length());
        kotlin.jvm.internal.l.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static String B0(String str, String str2, String str3) {
        kotlin.jvm.internal.l.f("<this>", str);
        kotlin.jvm.internal.l.f("delimiter", str2);
        kotlin.jvm.internal.l.f("missingDelimiterValue", str3);
        int iE0 = e0(str, str2, 0, false, 6);
        if (iE0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(str2.length() + iE0, str.length());
        kotlin.jvm.internal.l.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static String C0(char c2, String str, String str2) {
        kotlin.jvm.internal.l.f("<this>", str);
        kotlin.jvm.internal.l.f("missingDelimiterValue", str2);
        int iJ0 = j0(str, c2, 0, 6);
        if (iJ0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iJ0 + 1, str.length());
        kotlin.jvm.internal.l.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static String D0(String str, String str2, String str3) {
        int iI0 = i0(0, 6, str, str2);
        if (iI0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(str2.length() + iI0, str.length());
        kotlin.jvm.internal.l.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static String E0(String str, char c2) {
        kotlin.jvm.internal.l.f("<this>", str);
        kotlin.jvm.internal.l.f("missingDelimiterValue", str);
        int iD0 = d0(str, c2, 0, 6);
        if (iD0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iD0);
        kotlin.jvm.internal.l.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static String F0(String str, String str2) {
        kotlin.jvm.internal.l.f("<this>", str);
        kotlin.jvm.internal.l.f("missingDelimiterValue", str);
        int iE0 = e0(str, str2, 0, false, 6);
        if (iE0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iE0);
        kotlin.jvm.internal.l.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static String G0(char c2, String str, String str2) {
        kotlin.jvm.internal.l.f("<this>", str);
        kotlin.jvm.internal.l.f("missingDelimiterValue", str2);
        int iJ0 = j0(str, c2, 0, 6);
        if (iJ0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iJ0);
        kotlin.jvm.internal.l.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static String H0(String str, String str2, String str3) {
        kotlin.jvm.internal.l.f("<this>", str);
        int iI0 = i0(0, 6, str, str2);
        if (iI0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iI0);
        kotlin.jvm.internal.l.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static String I0(int i7, String str) {
        kotlin.jvm.internal.l.f("<this>", str);
        if (i7 < 0) {
            throw new IllegalArgumentException(c0.a(i7, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i7 > length) {
            i7 = length;
        }
        String strSubstring = str.substring(0, i7);
        kotlin.jvm.internal.l.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static CharSequence J0(String str) {
        kotlin.jvm.internal.l.f("<this>", str);
        int length = str.length() - 1;
        int i7 = 0;
        boolean z7 = false;
        while (i7 <= length) {
            boolean zB = AbstractC0915m.B(str.charAt(!z7 ? i7 : length));
            if (z7) {
                if (!zB) {
                    break;
                }
                length--;
            } else if (zB) {
                i7++;
            } else {
                z7 = true;
            }
        }
        return str.subSequence(i7, length + 1);
    }

    public static String K0(String str, char... cArr) {
        int length = str.length() - 1;
        int i7 = 0;
        boolean z7 = false;
        while (i7 <= length) {
            boolean zS = P3.m.S(cArr, str.charAt(!z7 ? i7 : length));
            if (z7) {
                if (!zS) {
                    break;
                }
                length--;
            } else if (zS) {
                i7++;
            } else {
                z7 = true;
            }
        }
        return str.subSequence(i7, length + 1).toString();
    }

    public static boolean W(CharSequence charSequence, String str, boolean z7) {
        kotlin.jvm.internal.l.f("<this>", charSequence);
        return e0(charSequence, str, 0, z7, 2) >= 0;
    }

    public static boolean X(CharSequence charSequence, char c2) {
        kotlin.jvm.internal.l.f("<this>", charSequence);
        return d0(charSequence, c2, 0, 2) >= 0;
    }

    public static String Y(int i7, String str) {
        kotlin.jvm.internal.l.f("<this>", str);
        if (i7 < 0) {
            throw new IllegalArgumentException(c0.a(i7, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i7 > length) {
            i7 = length;
        }
        String strSubstring = str.substring(i7);
        kotlin.jvm.internal.l.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static boolean Z(CharSequence charSequence, String str) {
        kotlin.jvm.internal.l.f("<this>", charSequence);
        return charSequence instanceof String ? AbstractC2517v.L((String) charSequence, str, false) : n0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static boolean a0(String str, char c2) {
        kotlin.jvm.internal.l.f("<this>", str);
        return str.length() > 0 && AbstractC0915m.o(str.charAt(b0(str)), c2, false);
    }

    public static int b0(CharSequence charSequence) {
        kotlin.jvm.internal.l.f("<this>", charSequence);
        return charSequence.length() - 1;
    }

    public static final int c0(CharSequence charSequence, String str, int i7, boolean z7) {
        kotlin.jvm.internal.l.f("<this>", charSequence);
        kotlin.jvm.internal.l.f("string", str);
        if (!z7 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i7);
        }
        int length = charSequence.length();
        if (i7 < 0) {
            i7 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        k4.g gVar = new k4.g(i7, length, 1);
        boolean z8 = charSequence instanceof String;
        int i8 = gVar.f12674m;
        int i9 = gVar.f12673l;
        int i10 = gVar.f12672k;
        if (!z8 || str == null) {
            boolean z9 = z7;
            if ((i8 <= 0 || i10 > i9) && (i8 >= 0 || i9 > i10)) {
                return -1;
            }
            while (true) {
                CharSequence charSequence2 = charSequence;
                boolean z10 = z9;
                z9 = z10;
                if (n0(str, 0, charSequence2, i10, str.length(), z10)) {
                    return i10;
                }
                if (i10 == i9) {
                    return -1;
                }
                i10 += i8;
                charSequence = charSequence2;
            }
        } else {
            if ((i8 <= 0 || i10 > i9) && (i8 >= 0 || i9 > i10)) {
                return -1;
            }
            int i11 = i10;
            while (true) {
                String str2 = str;
                boolean z11 = z7;
                if (AbstractC2517v.O(0, i11, str.length(), str2, (String) charSequence, z11)) {
                    return i11;
                }
                if (i11 == i9) {
                    return -1;
                }
                i11 += i8;
                str = str2;
                z7 = z11;
            }
        }
    }

    public static int d0(CharSequence charSequence, char c2, int i7, int i8) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        kotlin.jvm.internal.l.f("<this>", charSequence);
        return !(charSequence instanceof String) ? f0(charSequence, new char[]{c2}, i7, false) : ((String) charSequence).indexOf(c2, i7);
    }

    public static /* synthetic */ int e0(CharSequence charSequence, String str, int i7, boolean z7, int i8) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return c0(charSequence, str, i7, z7);
    }

    public static final int f0(CharSequence charSequence, char[] cArr, int i7, boolean z7) {
        kotlin.jvm.internal.l.f("<this>", charSequence);
        kotlin.jvm.internal.l.f("chars", cArr);
        if (!z7 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(P3.m.q0(cArr), i7);
        }
        if (i7 < 0) {
            i7 = 0;
        }
        int iB0 = b0(charSequence);
        if (i7 > iB0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i7);
            for (char c2 : cArr) {
                if (AbstractC0915m.o(c2, cCharAt, z7)) {
                    return i7;
                }
            }
            if (i7 == iB0) {
                return -1;
            }
            i7++;
        }
    }

    public static boolean g0(CharSequence charSequence) {
        kotlin.jvm.internal.l.f("<this>", charSequence);
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            if (!AbstractC0915m.B(charSequence.charAt(i7))) {
                return false;
            }
        }
        return true;
    }

    public static char h0(CharSequence charSequence) {
        kotlin.jvm.internal.l.f("<this>", charSequence);
        if (charSequence.length() != 0) {
            return charSequence.charAt(b0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int i0(int i7, int i8, String str, String str2) {
        if ((i8 & 2) != 0) {
            i7 = b0(str);
        }
        kotlin.jvm.internal.l.f("<this>", str);
        kotlin.jvm.internal.l.f("string", str2);
        return str.lastIndexOf(str2, i7);
    }

    public static int j0(CharSequence charSequence, char c2, int i7, int i8) {
        if ((i8 & 2) != 0) {
            i7 = b0(charSequence);
        }
        kotlin.jvm.internal.l.f("<this>", charSequence);
        return !(charSequence instanceof String) ? k0(charSequence, new char[]{c2}, i7) : ((String) charSequence).lastIndexOf(c2, i7);
    }

    public static final int k0(CharSequence charSequence, char[] cArr, int i7) {
        kotlin.jvm.internal.l.f("<this>", charSequence);
        kotlin.jvm.internal.l.f("chars", cArr);
        if (cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(P3.m.q0(cArr), i7);
        }
        int iB0 = b0(charSequence);
        if (i7 > iB0) {
            i7 = iB0;
        }
        while (-1 < i7) {
            char cCharAt = charSequence.charAt(i7);
            for (char c2 : cArr) {
                if (AbstractC0915m.o(c2, cCharAt, false)) {
                    return i7;
                }
            }
            i7--;
        }
        return -1;
    }

    public static String l0(int i7, String str) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.l.f("<this>", str);
        if (i7 < 0) {
            throw new IllegalArgumentException(c0.a(i7, "Desired length ", " is less than zero."));
        }
        if (i7 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i7);
            int length = i7 - str.length();
            int i8 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i8 == length) {
                        break;
                    }
                    i8++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static C2498c m0(CharSequence charSequence, String[] strArr, int i7) {
        r0(i7);
        return new C2498c(charSequence, i7, new D3.c(10, P3.m.P(strArr)));
    }

    public static final boolean n0(CharSequence charSequence, int i7, CharSequence charSequence2, int i8, int i9, boolean z7) {
        kotlin.jvm.internal.l.f("<this>", charSequence);
        kotlin.jvm.internal.l.f("other", charSequence2);
        if (i8 < 0 || i7 < 0 || i7 > charSequence.length() - i9 || i8 > charSequence2.length() - i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!AbstractC0915m.o(charSequence.charAt(i7 + i10), charSequence2.charAt(i8 + i10), z7)) {
                return false;
            }
        }
        return true;
    }

    public static String o0(String str, String str2) {
        kotlin.jvm.internal.l.f("<this>", str);
        if (!w0(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        kotlin.jvm.internal.l.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static String p0(String str, String str2) {
        kotlin.jvm.internal.l.f("<this>", str);
        if (!Z(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        kotlin.jvm.internal.l.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static String q0(String str) {
        kotlin.jvm.internal.l.f("<this>", str);
        if (str.length() < 2 || !w0(str, "\"", false) || !Z(str, "\"")) {
            return str;
        }
        String strSubstring = str.substring(1, str.length() - 1);
        kotlin.jvm.internal.l.e("substring(...)", strSubstring);
        return strSubstring;
    }

    public static final void r0(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.g(i7, "Limit must be non-negative, but was ").toString());
        }
    }

    public static char s0(String str) {
        kotlin.jvm.internal.l.f("<this>", str);
        int length = str.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return str.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static final List t0(int i7, CharSequence charSequence, String str) {
        r0(i7);
        int iC0 = c0(charSequence, str, 0, false);
        if (iC0 == -1 || i7 == 1) {
            return P3.r.H(charSequence.toString());
        }
        boolean z7 = i7 > 0;
        int i8 = 10;
        if (z7 && i7 <= 10) {
            i8 = i7;
        }
        ArrayList arrayList = new ArrayList(i8);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iC0).toString());
            length = str.length() + iC0;
            if (z7 && arrayList.size() == i7 - 1) {
                break;
            }
            iC0 = c0(charSequence, str, length, false);
        } while (iC0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List u0(CharSequence charSequence, String[] strArr, int i7, int i8) {
        if ((i8 & 4) != 0) {
            i7 = 0;
        }
        kotlin.jvm.internal.l.f("<this>", charSequence);
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return t0(i7, charSequence, str);
            }
        }
        C2498c c2498cM0 = m0(charSequence, strArr, i7);
        ArrayList arrayList = new ArrayList(P3.r.p(new P3.o(3, c2498cM0), 10));
        Iterator it = c2498cM0.iterator();
        while (it.hasNext()) {
            arrayList.add(y0(charSequence, (k4.g) it.next()));
        }
        return arrayList;
    }

    public static List v0(String str, char[] cArr) {
        kotlin.jvm.internal.l.f("<this>", str);
        if (cArr.length == 1) {
            return t0(0, str, String.valueOf(cArr[0]));
        }
        r0(0);
        C2498c c2498c = new C2498c(str, 0, new D3.c(9, cArr));
        ArrayList arrayList = new ArrayList(P3.r.p(new P3.o(3, c2498c), 10));
        Iterator it = c2498c.iterator();
        while (it.hasNext()) {
            arrayList.add(y0(str, (k4.g) it.next()));
        }
        return arrayList;
    }

    public static boolean w0(CharSequence charSequence, String str, boolean z7) {
        kotlin.jvm.internal.l.f("<this>", charSequence);
        return (z7 || !(charSequence instanceof String)) ? n0(charSequence, 0, str, 0, str.length(), z7) : AbstractC2517v.T((String) charSequence, str, false);
    }

    public static boolean x0(String str, char c2) {
        kotlin.jvm.internal.l.f("<this>", str);
        return str.length() > 0 && AbstractC0915m.o(str.charAt(0), c2, false);
    }

    public static final String y0(CharSequence charSequence, k4.g gVar) {
        kotlin.jvm.internal.l.f("<this>", charSequence);
        kotlin.jvm.internal.l.f("range", gVar);
        return charSequence.subSequence(gVar.f12672k, gVar.f12673l + 1).toString();
    }

    public static String z0(String str, k4.g gVar) {
        kotlin.jvm.internal.l.f("range", gVar);
        String strSubstring = str.substring(gVar.f12672k, gVar.f12673l + 1);
        kotlin.jvm.internal.l.e("substring(...)", strSubstring);
        return strSubstring;
    }
}
