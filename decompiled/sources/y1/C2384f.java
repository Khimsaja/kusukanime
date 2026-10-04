package y1;

import b1.AbstractC0703b;
import java.util.Arrays;
import v.c0;

/* renamed from: y1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2384f {

    /* renamed from: h, reason: collision with root package name */
    public static final C2384f f18035h = new C2384f(1, 2, 3, -1, -1, null);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18036b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18037c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f18038d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18039e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18040f;

    /* renamed from: g, reason: collision with root package name */
    public int f18041g;

    static {
        c0.d(0, 1, 2, 3, 4);
        B1.K.B(5);
    }

    public C2384f(int i7, int i8, int i9, int i10, int i11, byte[] bArr) {
        this.a = i7;
        this.f18036b = i8;
        this.f18037c = i9;
        this.f18038d = bArr;
        this.f18039e = i10;
        this.f18040f = i11;
    }

    public static String a(int i7) {
        return i7 != -1 ? i7 != 1 ? i7 != 2 ? AbstractC0703b.g(i7, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String b(int i7) {
        return i7 != -1 ? i7 != 6 ? i7 != 1 ? i7 != 2 ? AbstractC0703b.g(i7, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String c(int i7) {
        return i7 != -1 ? i7 != 10 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 6 ? i7 != 7 ? AbstractC0703b.g(i7, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean e(C2384f c2384f) {
        if (c2384f == null) {
            return true;
        }
        int i7 = c2384f.a;
        if (i7 != -1 && i7 != 1 && i7 != 2) {
            return false;
        }
        int i8 = c2384f.f18036b;
        if (i8 != -1 && i8 != 2) {
            return false;
        }
        int i9 = c2384f.f18037c;
        if ((i9 != -1 && i9 != 3) || c2384f.f18038d != null) {
            return false;
        }
        int i10 = c2384f.f18040f;
        if (i10 != -1 && i10 != 8) {
            return false;
        }
        int i11 = c2384f.f18039e;
        return i11 == -1 || i11 == 8;
    }

    public static int f(int i7) {
        if (i7 == 1) {
            return 1;
        }
        if (i7 != 9) {
            return (i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i7) {
        if (i7 == 1) {
            return 3;
        }
        if (i7 == 4) {
            return 10;
        }
        if (i7 == 13) {
            return 2;
        }
        if (i7 == 16) {
            return 6;
        }
        if (i7 != 18) {
            return (i7 == 6 || i7 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.a == -1 || this.f18036b == -1 || this.f18037c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2384f.class == obj.getClass()) {
            C2384f c2384f = (C2384f) obj;
            if (this.a == c2384f.a && this.f18036b == c2384f.f18036b && this.f18037c == c2384f.f18037c && Arrays.equals(this.f18038d, c2384f.f18038d) && this.f18039e == c2384f.f18039e && this.f18040f == c2384f.f18040f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f18041g == 0) {
            this.f18041g = ((((Arrays.hashCode(this.f18038d) + ((((((527 + this.a) * 31) + this.f18036b) * 31) + this.f18037c) * 31)) * 31) + this.f18039e) * 31) + this.f18040f;
        }
        return this.f18041g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.a));
        sb.append(", ");
        sb.append(a(this.f18036b));
        sb.append(", ");
        sb.append(c(this.f18037c));
        sb.append(", ");
        sb.append(this.f18038d != null);
        sb.append(", ");
        String str2 = "NA";
        int i7 = this.f18039e;
        if (i7 != -1) {
            str = i7 + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i8 = this.f18040f;
        if (i8 != -1) {
            str2 = i8 + "bit Chroma";
        }
        return AbstractC0703b.m(sb, str2, ")");
    }
}
