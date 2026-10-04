package B2;

import B1.B;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f373c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f374d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final B a = new B();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f375b = new StringBuilder();

    public static String a(B b4, StringBuilder sb) {
        boolean z7 = false;
        sb.setLength(0);
        int i7 = b4.f288b;
        int i8 = b4.f289c;
        while (i7 < i8 && !z7) {
            char c2 = (char) b4.a[i7];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z7 = true;
            } else {
                i7++;
                sb.append(c2);
            }
        }
        b4.G(i7 - b4.f288b);
        return sb.toString();
    }

    public static String b(B b4, StringBuilder sb) {
        c(b4);
        if (b4.a() == 0) {
            return null;
        }
        String strA = a(b4, sb);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) b4.t());
    }

    public static void c(B b4) {
        while (true) {
            for (boolean z7 = true; b4.a() > 0 && z7; z7 = false) {
                int i7 = b4.f288b;
                byte[] bArr = b4.a;
                byte b7 = bArr[i7];
                char c2 = (char) b7;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    b4.G(1);
                } else {
                    int i8 = b4.f289c;
                    int i9 = i7 + 2;
                    if (i9 <= i8) {
                        int i10 = i7 + 1;
                        if (b7 == 47 && bArr[i10] == 42) {
                            while (true) {
                                int i11 = i9 + 1;
                                if (i11 >= i8) {
                                    break;
                                }
                                if (((char) bArr[i9]) == '*' && ((char) bArr[i11]) == '/') {
                                    i9 += 2;
                                    i8 = i9;
                                } else {
                                    i9 = i11;
                                }
                            }
                            b4.G(i8 - b4.f288b);
                        }
                    }
                }
            }
            return;
        }
    }
}
