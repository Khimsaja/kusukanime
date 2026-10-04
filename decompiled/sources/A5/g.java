package A5;

import F.w;
import P3.F;
import e4.k;
import io.ktor.client.utils.CIOKt;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public abstract class g {
    public static final int[] a = {1, 10, 100, CIOKt.DEFAULT_HTTP_POOL_SIZE, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f253b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f254c = {3, 6};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f255d = {1, 2, 4, 5, 7, 8};

    public static final long a(String str) {
        c cVar;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i7 = a.f239n;
        char cCharAt2 = str.charAt(0);
        int i8 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z7 = (i8 > 0) && AbstractC2510o.x0(str, '-');
        if (length <= i8) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i8) != 'P') {
            throw new IllegalArgumentException();
        }
        int i9 = i8 + 1;
        if (i9 == length) {
            throw new IllegalArgumentException();
        }
        c cVar2 = null;
        long jF = 0;
        boolean z8 = false;
        while (i9 < length) {
            if (str.charAt(i9) != 'T') {
                int i10 = i9;
                while (i10 < str.length() && (('0' <= (cCharAt = str.charAt(i10)) && cCharAt < ':') || AbstractC2510o.X("+-.", cCharAt))) {
                    i10++;
                }
                String strSubstring = str.substring(i9, i10);
                l.e("substring(...)", strSubstring);
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i9;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i11 = length2 + 1;
                if (z8) {
                    if (cCharAt3 == 'H') {
                        cVar = c.f245p;
                    } else if (cCharAt3 == 'M') {
                        cVar = c.f244o;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        cVar = c.f243n;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    cVar = c.f246q;
                }
                if (cVar2 != null && cVar2.compareTo(cVar) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iD0 = AbstractC2510o.d0(strSubstring, '.', 0, 6);
                if (cVar != c.f243n || iD0 <= 0) {
                    jF = a.f(jF, o(l(strSubstring), cVar));
                } else {
                    String strSubstring2 = strSubstring.substring(0, iD0);
                    l.e("substring(...)", strSubstring2);
                    long jF2 = a.f(jF, o(l(strSubstring2), cVar));
                    String strSubstring3 = strSubstring.substring(iD0);
                    l.e("substring(...)", strSubstring3);
                    jF = a.f(jF2, m(Double.parseDouble(strSubstring3), cVar));
                }
                cVar2 = cVar;
                i9 = i11;
            } else {
                if (z8 || (i9 = i9 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z8 = true;
            }
        }
        return z7 ? a.j(jF) : jF;
    }

    public static final double b(double d4, c cVar, c cVar2) {
        l.f("sourceUnit", cVar);
        l.f("targetUnit", cVar2);
        long jConvert = cVar2.f248k.convert(1L, cVar.f248k);
        return jConvert > 0 ? d4 * jConvert : d4 / r8.convert(1L, r9);
    }

    public static final long c(long j7, c cVar, c cVar2) {
        l.f("sourceUnit", cVar);
        l.f("targetUnit", cVar2);
        return cVar2.f248k.convert(j7, cVar.f248k);
    }

    public static final long d(long j7) {
        long j8 = (j7 << 1) + 1;
        int i7 = a.f239n;
        int i8 = b.a;
        return j8;
    }

    public static final long e(long j7) {
        return (-4611686018426L > j7 || j7 >= 4611686018427L) ? d(e3.c.l(j7, -4611686018427387903L, 4611686018427387903L)) : f(j7 * 1000000);
    }

    public static final long f(long j7) {
        long j8 = j7 << 1;
        int i7 = a.f239n;
        int i8 = b.a;
        return j8;
    }

    public static final void g(StringBuilder sb, StringBuilder sb2, int i7) {
        if (i7 < 10) {
            sb.append('0');
        }
        sb2.append(i7);
    }

    public static d h(long j7, long j8) {
        long j9 = j8 / 1000000000;
        if ((j8 ^ 1000000000) < 0 && j9 * 1000000000 != j8) {
            j9--;
        }
        long j10 = j7 + j9;
        if ((j7 ^ j10) < 0 && (j9 ^ j7) >= 0) {
            return j7 > 0 ? d.f250n : d.f249m;
        }
        if (j10 < -31557014167219200L) {
            return d.f249m;
        }
        if (j10 > 31556889864403199L) {
            return d.f250n;
        }
        long j11 = j8 % 1000000000;
        return new d(j10, (int) (j11 + ((((j11 ^ 1000000000) & ((-j11) | j11)) >> 63) & 1000000000)));
    }

    public static final w i(String str, String str2, int i7, k kVar) {
        char cCharAt = str.charAt(i7);
        if (((Boolean) kVar.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return j(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i7);
    }

    public static final w j(String str, String str2) {
        return new w(str2 + " when parsing an Instant from \"" + p(64, str) + '\"', str);
    }

    public static final int k(int i7, String str) {
        return (str.charAt(i7 + 1) - '0') + ((str.charAt(i7) - '0') * 10);
    }

    public static final long l(String str) {
        char cCharAt;
        int length = str.length();
        int i7 = (length <= 0 || !AbstractC2510o.X("+-", str.charAt(0))) ? 0 : 1;
        if (length - i7 > 16) {
            int i8 = i7;
            while (true) {
                if (i7 < length) {
                    char cCharAt2 = str.charAt(i7);
                    if (cCharAt2 == '0') {
                        if (i8 == i7) {
                            i8++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i7++;
                } else if (length - i8 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!AbstractC2517v.T(str, "+", false) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(AbstractC2510o.Y(1, str));
    }

    public static final long m(double d4, c cVar) {
        double dB = b(d4, cVar, c.f241l);
        if (Double.isNaN(dB)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jX = F.X(dB);
        return (-4611686018426999999L > jX || jX >= 4611686018427000000L) ? e(F.X(b(d4, cVar, c.f242m))) : f(jX);
    }

    public static final long n(int i7, c cVar) {
        l.f("unit", cVar);
        return cVar.compareTo(c.f243n) <= 0 ? f(c(i7, cVar, c.f241l)) : o(i7, cVar);
    }

    public static final long o(long j7, c cVar) {
        l.f("unit", cVar);
        c cVar2 = c.f241l;
        long jC = c(4611686018426999999L, cVar2, cVar);
        if ((-jC) <= j7 && j7 <= jC) {
            return f(c(j7, cVar, cVar2));
        }
        c cVar3 = c.f242m;
        l.f("targetUnit", cVar3);
        return d(e3.c.l(cVar3.f248k.convert(j7, cVar.f248k), -4611686018427387903L, 4611686018427387903L));
    }

    public static final String p(int i7, String str) {
        if (str.length() <= i7) {
            return str.toString();
        }
        return str.subSequence(0, i7).toString() + "...";
    }
}
