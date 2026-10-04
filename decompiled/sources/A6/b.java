package A6;

import B1.AbstractC0015b;
import C1.i;
import O.C0486d;
import V1.G;
import android.os.Bundle;
import io.ktor.util.GzipHeaderFlags;
import java.util.HashMap;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.z;
import l4.InterfaceC1433l;
import y1.C2392n;
import y1.C2393o;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ boolean a(int i7) {
        if (i7 == 1 || i7 == 2) {
            return false;
        }
        if (i7 == 3 || i7 == 4) {
            return true;
        }
        throw null;
    }

    public static int b(String str, int i7, int i8) {
        return (str.hashCode() + i7) * i8;
    }

    public static Object c(Bundle bundle, String str, String str2, String str3, String str4) {
        l.f(str, bundle);
        l.f(str3, str2);
        return bundle.get(str4);
    }

    public static String d(char c2, String str, String str2) {
        return str + str2 + c2;
    }

    public static String e(int i7, int i8, String str, String str2) {
        return str + i7 + str2 + i8;
    }

    public static String f(long j7, String str, StringBuilder sb) {
        sb.append(j7);
        sb.append(str);
        return sb.toString();
    }

    public static String g(String str, i iVar, String str2) {
        return str + iVar + str2;
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static String i(StringBuilder sb, Object obj, char c2) {
        sb.append(obj);
        sb.append(c2);
        return sb.toString();
    }

    public static String j(StringBuilder sb, String str, char c2) {
        sb.append(str);
        sb.append(c2);
        return sb.toString();
    }

    public static StringBuilder k(String str, long j7, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j7);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder l(String str, String str2) {
        l.e(str2, str);
        return new StringBuilder();
    }

    public static InterfaceC1433l m(Class cls, String str, String str2, int i7, z zVar) {
        return zVar.f(new o(cls, str, str2, i7));
    }

    public static void n(int i7, String str, String str2) {
        AbstractC0015b.v(str2, str + i7);
    }

    public static void o(int i7, HashMap map, String str, int i8, String str2) {
        map.put(str, Integer.valueOf(i7));
        map.put(str2, Integer.valueOf(i8));
    }

    public static void p(String str, String str2, String str3) {
        AbstractC0015b.v(str3, str + str2);
    }

    public static void q(StringBuilder sb, int i7, String str, String str2, String str3) {
        sb.append(i7);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void r(C2392n c2392n, G g4) {
        g4.a(new C2393o(c2392n));
    }

    public static void s(StringBuilder sb, int i7, String str, String str2, String str3) {
        sb.append(i7);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        C0486d.U(sb.toString());
        throw null;
    }

    public static /* synthetic */ String t(int i7) {
        switch (i7) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case GzipHeaderFlags.EXTRA /* 4 */:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
