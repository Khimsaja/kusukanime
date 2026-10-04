package g6;

import O3.t;
import P3.q;
import P3.r;
import e5.AbstractC0832b;
import f6.AbstractC0893G;
import f6.C0887A;
import f6.C0892F;
import f6.C0895I;
import f6.C0896J;
import f6.C0920r;
import f6.C0922t;
import io.ktor.http.ContentDisposition;
import io.ktor.sse.ServerSentEventKt;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import m6.C1528b;
import p.I0;
import w6.AbstractC2217b;
import w6.C;
import w6.C2224i;
import w6.H;
import w6.l;
import z5.AbstractC2510o;
import z5.C2508m;

/* loaded from: classes.dex */
public abstract class b {
    public static final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0920r f11772b = AbstractC0832b.A(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final C0896J f11773c;

    /* renamed from: d, reason: collision with root package name */
    public static final TimeZone f11774d;

    /* renamed from: e, reason: collision with root package name */
    public static final C2508m f11775e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f11776f;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        C2224i c2224i = new C2224i();
        c2224i.f0(bArr);
        f11773c = new C0896J(null, 0, c2224i, 0);
        C0892F.c(AbstractC0893G.Companion, bArr, null, 0, 7);
        l lVar = l.f17157n;
        AbstractC2217b.f(I0.r("efbbbf"), I0.r("feff"), I0.r("fffe"), I0.r("0000ffff"), I0.r("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        kotlin.jvm.internal.l.c(timeZone);
        f11774d = timeZone;
        f11775e = new C2508m("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f11776f = AbstractC2510o.p0(AbstractC2510o.o0(C0887A.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(C0922t c0922t, C0922t c0922t2) {
        kotlin.jvm.internal.l.f("<this>", c0922t);
        kotlin.jvm.internal.l.f("other", c0922t2);
        return kotlin.jvm.internal.l.a(c0922t.f11607d, c0922t2.f11607d) && c0922t.f11608e == c0922t2.f11608e && kotlin.jvm.internal.l.a(c0922t.a, c0922t2.a);
    }

    public static final int b(long j7, TimeUnit timeUnit) {
        if (j7 < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j7);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis != 0 || j7 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
    }

    public static final void c(Closeable closeable) throws IOException {
        kotlin.jvm.internal.l.f("<this>", closeable);
        try {
            closeable.close();
        } catch (RuntimeException e7) {
            throw e7;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        kotlin.jvm.internal.l.f("<this>", socket);
        try {
            socket.close();
        } catch (AssertionError e7) {
            throw e7;
        } catch (RuntimeException e8) {
            if (!kotlin.jvm.internal.l.a(e8.getMessage(), "bio == null")) {
                throw e8;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(int i7, int i8, String str, String str2) {
        kotlin.jvm.internal.l.f("<this>", str);
        while (i7 < i8) {
            if (AbstractC2510o.X(str2, str.charAt(i7))) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static final int f(String str, int i7, int i8, char c2) {
        kotlin.jvm.internal.l.f("<this>", str);
        while (i7 < i8) {
            if (str.charAt(i7) == c2) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static /* synthetic */ int g(String str, char c2, int i7, int i8, int i9) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = str.length();
        }
        return f(str, i7, i8, c2);
    }

    public static final boolean h(H h7) {
        kotlin.jvm.internal.l.f("timeUnit", TimeUnit.MILLISECONDS);
        try {
            return t(h7, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String i(String str, Object... objArr) {
        kotlin.jvm.internal.l.f("format", str);
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean j(String[] strArr, String[] strArr2, Comparator comparator) {
        kotlin.jvm.internal.l.f("<this>", strArr);
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                t tVarI = kotlin.jvm.internal.l.i(strArr2);
                while (tVarI.hasNext()) {
                    if (comparator.compare(str, (String) tVarI.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long k(C0895I c0895i) {
        String strA = c0895i.f11500p.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List l(Object... objArr) {
        kotlin.jvm.internal.l.f("elements", objArr);
        Object[] objArr2 = (Object[]) objArr.clone();
        List listUnmodifiableList = Collections.unmodifiableList(r.I(Arrays.copyOf(objArr2, objArr2.length)));
        kotlin.jvm.internal.l.e("unmodifiableList(listOf(*elements.clone()))", listUnmodifiableList);
        return listUnmodifiableList;
    }

    public static final int m(String str) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (kotlin.jvm.internal.l.g(cCharAt, 31) <= 0 || kotlin.jvm.internal.l.g(cCharAt, 127) >= 0) {
                return i7;
            }
        }
        return -1;
    }

    public static final int n(String str, int i7, int i8) {
        kotlin.jvm.internal.l.f("<this>", str);
        while (i7 < i8) {
            char cCharAt = str.charAt(i7);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static final int o(String str, int i7, int i8) {
        kotlin.jvm.internal.l.f("<this>", str);
        int i9 = i8 - 1;
        if (i7 <= i9) {
            while (true) {
                char cCharAt = str.charAt(i9);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i9 + 1;
                }
                if (i9 == i7) {
                    break;
                }
                i9--;
            }
        }
        return i7;
    }

    public static final String[] p(String[] strArr, String[] strArr2, Comparator comparator) {
        kotlin.jvm.internal.l.f("other", strArr2);
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i7]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i7++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean q(String str) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int r(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final int s(C c2) {
        kotlin.jvm.internal.l.f("<this>", c2);
        return (c2.readByte() & 255) | ((c2.readByte() & 255) << 16) | ((c2.readByte() & 255) << 8);
    }

    public static final boolean t(H h7, int i7) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.l.f("timeUnit", timeUnit);
        long jNanoTime = System.nanoTime();
        long jC = h7.d().e() ? h7.d().c() - jNanoTime : Long.MAX_VALUE;
        h7.d().d(Math.min(jC, timeUnit.toNanos(i7)) + jNanoTime);
        try {
            C2224i c2224i = new C2224i();
            while (h7.F(c2224i, 8192L) != -1) {
                c2224i.b();
            }
            if (jC == Long.MAX_VALUE) {
                h7.d().a();
                return true;
            }
            h7.d().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                h7.d().a();
                return false;
            }
            h7.d().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                h7.d().a();
            } else {
                h7.d().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final C0920r u(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1528b c1528b = (C1528b) it.next();
            String strR = c1528b.a.r();
            String strR2 = c1528b.f13002b.r();
            arrayList.add(strR);
            arrayList.add(AbstractC2510o.J0(strR2).toString());
        }
        return new C0920r((String[]) arrayList.toArray(new String[0]));
    }

    public static final String v(C0922t c0922t, boolean z7) {
        kotlin.jvm.internal.l.f("<this>", c0922t);
        String strD = c0922t.f11607d;
        if (AbstractC2510o.W(strD, ServerSentEventKt.COLON, false)) {
            strD = A6.b.d(']', "[", strD);
        }
        int i7 = c0922t.f11608e;
        if (!z7) {
            String str = c0922t.a;
            kotlin.jvm.internal.l.f("scheme", str);
            if (i7 == (str.equals("http") ? 80 : str.equals("https") ? 443 : -1)) {
                return strD;
            }
        }
        return strD + ':' + i7;
    }

    public static final List w(List list) {
        kotlin.jvm.internal.l.f("<this>", list);
        List listUnmodifiableList = Collections.unmodifiableList(q.U0(list));
        kotlin.jvm.internal.l.e("unmodifiableList(toMutableList())", listUnmodifiableList);
        return listUnmodifiableList;
    }

    public static final int x(int i7, String str) {
        if (str == null) {
            return i7;
        }
        try {
            long j7 = Long.parseLong(str);
            if (j7 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j7 < 0) {
                return 0;
            }
            return (int) j7;
        } catch (NumberFormatException unused) {
            return i7;
        }
    }

    public static final String y(String str, int i7, int i8) {
        int iN = n(str, i7, i8);
        String strSubstring = str.substring(iN, o(str, iN, i8));
        kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }
}
