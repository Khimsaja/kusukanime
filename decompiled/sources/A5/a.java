package A5;

import io.ktor.client.utils.CIOKt;
import io.ktor.util.date.GMTDateParser;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class a implements Comparable {

    /* renamed from: l, reason: collision with root package name */
    public static final long f237l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f238m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f239n = 0;

    /* renamed from: k, reason: collision with root package name */
    public final long f240k;

    static {
        int i7 = b.a;
        f237l = g.d(4611686018427387903L);
        f238m = g.d(-4611686018427387903L);
    }

    public static final long a(long j7, long j8) {
        long j9 = 1000000;
        long j10 = j8 / j9;
        long j11 = j7 + j10;
        if (-4611686018426L > j11 || j11 >= 4611686018427L) {
            return g.d(e3.c.l(j11, -4611686018427387903L, 4611686018427387903L));
        }
        return g.f((j11 * j9) + (j8 - (j10 * j9)));
    }

    public static final void b(StringBuilder sb, int i7, int i8, int i9, String str, boolean z7) {
        sb.append(i7);
        if (i8 != 0) {
            sb.append('.');
            String strL0 = AbstractC2510o.l0(i9, String.valueOf(i8));
            int i10 = -1;
            int length = strL0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    if (strL0.charAt(length) != '0') {
                        i10 = length;
                        break;
                    } else if (i11 < 0) {
                        break;
                    } else {
                        length = i11;
                    }
                }
            }
            int i12 = i10 + 1;
            if (z7 || i12 >= 3) {
                sb.append((CharSequence) strL0, 0, ((i10 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strL0, 0, i12);
            }
        }
        sb.append(str);
    }

    public static final long c(long j7) {
        return ((((int) j7) & 1) != 1 || e(j7)) ? h(j7, c.f242m) : j7 >> 1;
    }

    public static final int d(long j7) {
        if (e(j7)) {
            return 0;
        }
        return (((int) j7) & 1) == 1 ? (int) (((j7 >> 1) % CIOKt.DEFAULT_HTTP_POOL_SIZE) * 1000000) : (int) ((j7 >> 1) % 1000000000);
    }

    public static final boolean e(long j7) {
        return j7 == f237l || j7 == f238m;
    }

    public static final long f(long j7, long j8) {
        if (e(j7)) {
            if (!e(j8) || (j8 ^ j7) >= 0) {
                return j7;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (e(j8)) {
            return j8;
        }
        int i7 = ((int) j7) & 1;
        if (i7 != (((int) j8) & 1)) {
            return i7 == 1 ? a(j7 >> 1, j8 >> 1) : a(j8 >> 1, j7 >> 1);
        }
        long j9 = (j7 >> 1) + (j8 >> 1);
        return i7 == 0 ? (-4611686018426999999L > j9 || j9 >= 4611686018427000000L) ? g.d(j9 / 1000000) : g.f(j9) : g.e(j9);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long g(long r21, double r23) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A5.a.g(long, double):long");
    }

    public static final long h(long j7, c cVar) {
        l.f("unit", cVar);
        if (j7 == f237l) {
            return Long.MAX_VALUE;
        }
        if (j7 == f238m) {
            return Long.MIN_VALUE;
        }
        long j8 = j7 >> 1;
        c cVar2 = (((int) j7) & 1) == 0 ? c.f241l : c.f242m;
        l.f("sourceUnit", cVar2);
        return cVar.f248k.convert(j8, cVar2.f248k);
    }

    public static String i(long j7) {
        long j8;
        int iH;
        if (j7 == 0) {
            return "0s";
        }
        if (j7 == f237l) {
            return "Infinity";
        }
        if (j7 == f238m) {
            return "-Infinity";
        }
        int i7 = 0;
        boolean z7 = j7 < 0;
        StringBuilder sb = new StringBuilder();
        if (z7) {
            sb.append('-');
        }
        long j9 = j7 < 0 ? j(j7) : j7;
        long jH = h(j9, c.f246q);
        int iH2 = e(j9) ? 0 : (int) (h(j9, c.f245p) % 24);
        if (e(j9)) {
            j8 = 0;
            iH = 0;
        } else {
            j8 = 0;
            iH = (int) (h(j9, c.f244o) % 60);
        }
        int iH3 = e(j9) ? 0 : (int) (h(j9, c.f243n) % 60);
        int iD = d(j9);
        boolean z8 = jH != j8;
        boolean z9 = iH2 != 0;
        boolean z10 = iH != 0;
        boolean z11 = (iH3 == 0 && iD == 0) ? false : true;
        if (z8) {
            sb.append(jH);
            sb.append(GMTDateParser.DAY_OF_MONTH);
            i7 = 1;
        }
        if (z9 || (z8 && (z10 || z11))) {
            int i8 = i7 + 1;
            if (i7 > 0) {
                sb.append(' ');
            }
            sb.append(iH2);
            sb.append(GMTDateParser.HOURS);
            i7 = i8;
        }
        if (z10 || (z11 && (z9 || z8))) {
            int i9 = i7 + 1;
            if (i7 > 0) {
                sb.append(' ');
            }
            sb.append(iH);
            sb.append(GMTDateParser.MINUTES);
            i7 = i9;
        }
        if (z11) {
            int i10 = i7 + 1;
            if (i7 > 0) {
                sb.append(' ');
            }
            if (iH3 != 0 || z8 || z9 || z10) {
                b(sb, iH3, iD, 9, "s", false);
            } else if (iD >= 1000000) {
                b(sb, iD / 1000000, iD % 1000000, 6, "ms", false);
            } else if (iD >= 1000) {
                b(sb, iD / CIOKt.DEFAULT_HTTP_POOL_SIZE, iD % CIOKt.DEFAULT_HTTP_POOL_SIZE, 3, "us", false);
            } else {
                sb.append(iD);
                sb.append("ns");
            }
            i7 = i10;
        }
        if (z7 && i7 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long j(long j7) {
        long j8 = ((-(j7 >> 1)) << 1) + (((int) j7) & 1);
        int i7 = b.a;
        return j8;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j7 = ((a) obj).f240k;
        long j8 = this.f240k;
        long j9 = j8 ^ j7;
        if (j9 < 0 || (((int) j9) & 1) == 0) {
            return l.h(j8, j7);
        }
        int i7 = (((int) j8) & 1) - (((int) j7) & 1);
        return j8 < 0 ? -i7 : i7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f240k == ((a) obj).f240k;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f240k);
    }

    public final String toString() {
        return i(this.f240k);
    }
}
