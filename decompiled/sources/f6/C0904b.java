package f6;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import k4.C1396e;
import w6.C2224i;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* renamed from: f6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0904b {
    public static final C0904b a = new C0904b();

    /* renamed from: b, reason: collision with root package name */
    public static final C0904b f11532b = new C0904b();

    /* renamed from: c, reason: collision with root package name */
    public static final C0904b f11533c = new C0904b();

    public static final C0912j a(C0904b c0904b, String str) {
        C0912j c0912j = new C0912j(str);
        C0912j.f11552d.put(str, c0912j);
        return c0912j;
    }

    public static String b(String str, int i7, int i8, String str2, int i9) {
        int i10 = (i9 & 1) != 0 ? 0 : i7;
        int length = (i9 & 2) != 0 ? str.length() : i8;
        boolean z7 = (i9 & 8) == 0;
        boolean z8 = (i9 & 16) == 0;
        boolean z9 = (i9 & 32) == 0;
        boolean z10 = (i9 & 64) == 0;
        kotlin.jvm.internal.l.f("<this>", str);
        int iCharCount = i10;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i11 = 32;
            int i12 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z10) || AbstractC2510o.X(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z7 || (z8 && !d(str, iCharCount, length)))) || (iCodePointAt == 43 && z9)))) {
                C2224i c2224i = new C2224i();
                c2224i.l0(str, i10, iCharCount);
                C2224i c2224i2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z7 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z9) {
                            c2224i.k0(z7 ? "+" : "%2B");
                        } else if (iCodePointAt2 < i11 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i12 && !z10) || AbstractC2510o.X(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z7 || (z8 && !d(str, iCharCount, length)))))) {
                            if (c2224i2 == null) {
                                c2224i2 = new C2224i();
                            }
                            c2224i2.m0(iCodePointAt2);
                            while (!c2224i2.z()) {
                                byte b4 = c2224i2.readByte();
                                c2224i.g0(37);
                                char[] cArr = C0922t.f11604k;
                                c2224i.g0(cArr[((b4 & 255) >> 4) & 15]);
                                c2224i.g0(cArr[b4 & 15]);
                            }
                        } else {
                            c2224i.m0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i11 = 32;
                    i12 = 128;
                }
                return c2224i.a0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i10, length);
        kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public static boolean d(String str, int i7, int i8) {
        int i9 = i7 + 2;
        return i9 < i8 && str.charAt(i7) == '%' && g6.b.r(str.charAt(i7 + 1)) != -1 && g6.b.r(str.charAt(i9)) != -1;
    }

    public static String e(int i7, int i8, int i9, String str) {
        int i10;
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = str.length();
        }
        boolean z7 = (i9 & 4) == 0;
        kotlin.jvm.internal.l.f("<this>", str);
        int iCharCount = i7;
        while (iCharCount < i8) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z7)) {
                C2224i c2224i = new C2224i();
                c2224i.l0(str, i7, iCharCount);
                while (iCharCount < i8) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i10 = iCharCount + 2) < i8) {
                        int iR = g6.b.r(str.charAt(iCharCount + 1));
                        int iR2 = g6.b.r(str.charAt(i10));
                        if (iR == -1 || iR2 == -1) {
                            c2224i.m0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            c2224i.g0((iR << 4) + iR2);
                            iCharCount = Character.charCount(iCodePointAt) + i10;
                        }
                    } else if (iCodePointAt == 43 && z7) {
                        c2224i.g0(32);
                        iCharCount++;
                    } else {
                        c2224i.m0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return c2224i.a0();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i7, i8);
        kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (i7 <= str.length()) {
            int iD0 = AbstractC2510o.d0(str, '&', i7, 4);
            if (iD0 == -1) {
                iD0 = str.length();
            }
            int iD02 = AbstractC2510o.d0(str, '=', i7, 4);
            if (iD02 == -1 || iD02 > iD0) {
                String strSubstring = str.substring(i7, iD0);
                kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i7, iD02);
                kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring2);
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iD02 + 1, iD0);
                kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring3);
                arrayList.add(strSubstring3);
            }
            i7 = iD0 + 1;
        }
        return arrayList;
    }

    public static void g(ArrayList arrayList, StringBuilder sb) {
        kotlin.jvm.internal.l.f("<this>", arrayList);
        C1396e c1396eG = e3.c.G(e3.c.L(0, arrayList.size()), 2);
        int i7 = c1396eG.f12672k;
        int i8 = c1396eG.f12673l;
        int i9 = c1396eG.f12674m;
        if ((i9 <= 0 || i7 > i8) && (i9 >= 0 || i8 > i7)) {
            return;
        }
        while (true) {
            String str = (String) arrayList.get(i7);
            String str2 = (String) arrayList.get(i7 + 1);
            if (i7 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i7 == i8) {
                return;
            } else {
                i7 += i9;
            }
        }
    }

    public synchronized C0912j c(String str) {
        C0912j c0912j;
        String strConcat;
        try {
            kotlin.jvm.internal.l.f("javaName", str);
            LinkedHashMap linkedHashMap = C0912j.f11552d;
            c0912j = (C0912j) linkedHashMap.get(str);
            if (c0912j == null) {
                if (AbstractC2517v.T(str, "TLS_", false)) {
                    String strSubstring = str.substring(4);
                    kotlin.jvm.internal.l.e("this as java.lang.String).substring(startIndex)", strSubstring);
                    strConcat = "SSL_".concat(strSubstring);
                } else if (AbstractC2517v.T(str, "SSL_", false)) {
                    String strSubstring2 = str.substring(4);
                    kotlin.jvm.internal.l.e("this as java.lang.String).substring(startIndex)", strSubstring2);
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = str;
                }
                c0912j = (C0912j) linkedHashMap.get(strConcat);
                if (c0912j == null) {
                    c0912j = new C0912j(str);
                }
                linkedHashMap.put(str, c0912j);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0912j;
    }
}
