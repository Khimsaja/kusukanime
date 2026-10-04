package b1;

import O.C0510p;
import e4.k;
import f6.AbstractC0905c;
import h0.C0998u;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpStatement;
import io.ktor.util.reflect.TypeInfo;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.z;
import l4.InterfaceC1425d;
import l4.InterfaceC1442u;
import l4.InterfaceC1444w;
import v.c0;
import y0.C2361h;

/* renamed from: b1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0703b {
    public static /* synthetic */ void A(int i7, String str) {
        if (i7 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(A6.b.h(str, " must not be null"));
        l.j(nullPointerException, l.class.getName());
        throw nullPointerException;
    }

    public static /* synthetic */ String B(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "SYNTHESIZED" : "DELEGATION" : "FAKE_OVERRIDE" : "DECLARATION";
    }

    public static int a(float f5, float f7, float f8) {
        return Math.round((f5 + f7) * f8);
    }

    public static int b(float f5, int i7, int i8) {
        return (Float.hashCode(f5) + i7) * i8;
    }

    public static int c(int i7, int i8, long j7) {
        return (Long.hashCode(j7) + i7) * i8;
    }

    public static int d(int i7, int i8, boolean z7) {
        return (Boolean.hashCode(z7) + i7) * i8;
    }

    public static HttpStatement e(k kVar, HttpRequestBuilder httpRequestBuilder, HttpRequestBuilder httpRequestBuilder2, HttpClient httpClient) {
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder2, httpClient);
    }

    public static Object f(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, S3.c cVar) {
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static String g(int i7, String str) {
        return str + i7;
    }

    public static String h(String str, long j7) {
        return str + j7;
    }

    public static String i(String str, String str2) {
        return str + str2;
    }

    public static String j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String k(StringBuilder sb, float f5, char c2) {
        sb.append(f5);
        sb.append(c2);
        return sb.toString();
    }

    public static String l(StringBuilder sb, int i7, char c2) {
        sb.append(i7);
        sb.append(c2);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String n(StringBuilder sb, boolean z7, char c2) {
        sb.append(z7);
        sb.append(c2);
        return sb.toString();
    }

    public static String o(z zVar, Class cls, StringBuilder sb) {
        sb.append(zVar.b(cls));
        return sb.toString();
    }

    public static StringBuilder p(int i7, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i7);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder q(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static InterfaceC1442u r(Class cls, String str, String str2, int i7, z zVar) {
        return zVar.h(new r(cls, str, str2, i7));
    }

    public static /* synthetic */ void s(int i7) {
        if (i7 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        l.j(nullPointerException, l.class.getName());
        throw nullPointerException;
    }

    public static void t(int i7, int i8, int i9, int i10, int i11) {
        AbstractC0905c.a(i7);
        AbstractC0905c.a(i8);
        AbstractC0905c.a(i9);
        AbstractC0905c.a(i10);
        AbstractC0905c.a(i11);
    }

    public static void u(int i7, C0510p c0510p, int i8, C2361h c2361h) {
        c0510p.b0(Integer.valueOf(i7));
        c0510p.b(Integer.valueOf(i8), c2361h);
    }

    public static void v(int i7, W.a aVar, C0510p c0510p, boolean z7) {
        aVar.invoke(c0510p, Integer.valueOf(i7));
        c0510p.p(z7);
    }

    public static /* synthetic */ void w(int i7, String str) {
        if (i7 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = l.class.getName();
            int i8 = 0;
            while (!stackTrace[i8].getClassName().equals(name)) {
                i8++;
            }
            while (stackTrace[i8].getClassName().equals(name)) {
                i8++;
            }
            StackTraceElement stackTraceElement = stackTrace[i8];
            StringBuilder sbC = c0.c("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            sbC.append(str);
            NullPointerException nullPointerException = new NullPointerException(sbC.toString());
            l.j(nullPointerException, l.class.getName());
            throw nullPointerException;
        }
    }

    public static void x(long j7, String str, StringBuilder sb) {
        sb.append((Object) C0998u.i(j7));
        sb.append(str);
    }

    public static void y(B2.l lVar, long j7) {
        lVar.t().i();
        lVar.P(j7);
    }

    public static void z(InterfaceC1425d interfaceC1425d, InterfaceC1444w interfaceC1444w, HttpRequestBuilder httpRequestBuilder) {
        httpRequestBuilder.setBodyType(new TypeInfo(interfaceC1425d, interfaceC1444w));
    }
}
