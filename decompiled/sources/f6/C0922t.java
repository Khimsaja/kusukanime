package f6;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import z5.AbstractC2510o;

/* renamed from: f6.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0922t {

    /* renamed from: k, reason: collision with root package name */
    public static final char[] f11604k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11605b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11606c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11607d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11608e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f11609f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f11610g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11611h;

    /* renamed from: i, reason: collision with root package name */
    public final String f11612i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f11613j;

    public C0922t(String str, String str2, String str3, String str4, int i7, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        kotlin.jvm.internal.l.f("scheme", str);
        kotlin.jvm.internal.l.f("host", str4);
        this.a = str;
        this.f11605b = str2;
        this.f11606c = str3;
        this.f11607d = str4;
        this.f11608e = i7;
        this.f11609f = arrayList;
        this.f11610g = arrayList2;
        this.f11611h = str5;
        this.f11612i = str6;
        this.f11613j = str.equals("https");
    }

    public final String a() {
        if (this.f11606c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.f11612i;
        String strSubstring = str.substring(AbstractC2510o.d0(str, ':', length, 4) + 1, AbstractC2510o.d0(str, '@', 0, 6));
        kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.f11612i;
        int iD0 = AbstractC2510o.d0(str, '/', length, 4);
        String strSubstring = str.substring(iD0, g6.b.e(iD0, str.length(), str, "?#"));
        kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.f11612i;
        int iD0 = AbstractC2510o.d0(str, '/', length, 4);
        int iE = g6.b.e(iD0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iD0 < iE) {
            int i7 = iD0 + 1;
            int iF = g6.b.f(str, i7, iE, '/');
            String strSubstring = str.substring(i7, iF);
            kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
            arrayList.add(strSubstring);
            iD0 = iF;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f11610g == null) {
            return null;
        }
        String str = this.f11612i;
        int iD0 = AbstractC2510o.d0(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iD0, g6.b.f(str, iD0, str.length(), '#'));
        kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public final String e() {
        if (this.f11605b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.f11612i;
        String strSubstring = str.substring(length, g6.b.e(length, str.length(), str, ":@"));
        kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0922t) && kotlin.jvm.internal.l.a(((C0922t) obj).f11612i, this.f11612i);
    }

    public final C0921s f(String str) {
        kotlin.jvm.internal.l.f("link", str);
        try {
            C0921s c0921s = new C0921s();
            c0921s.c(this, str);
            return c0921s;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String g() {
        C0921s c0921sF = f("/...");
        kotlin.jvm.internal.l.c(c0921sF);
        c0921sF.f11597b = C0904b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        c0921sF.f11598c = C0904b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return c0921sF.a().f11612i;
    }

    public final URI h() {
        String strSubstring;
        String strReplaceAll;
        C0921s c0921s = new C0921s();
        String str = this.a;
        c0921s.a = str;
        c0921s.f11597b = e();
        c0921s.f11598c = a();
        c0921s.f11599d = this.f11607d;
        kotlin.jvm.internal.l.f("scheme", str);
        int i7 = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i8 = this.f11608e;
        c0921s.f11600e = i8 != i7 ? i8 : -1;
        ArrayList arrayList = c0921s.f11601f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        c0921s.f11602g = strD != null ? C0904b.f(C0904b.b(strD, 0, 0, " \"'<>#", 211)) : null;
        if (this.f11611h == null) {
            strSubstring = null;
        } else {
            String str2 = this.f11612i;
            strSubstring = str2.substring(AbstractC2510o.d0(str2, '#', 0, 6) + 1);
            kotlin.jvm.internal.l.e("this as java.lang.String).substring(startIndex)", strSubstring);
        }
        c0921s.f11603h = strSubstring;
        String str3 = c0921s.f11599d;
        if (str3 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            kotlin.jvm.internal.l.e("compile(...)", patternCompile);
            strReplaceAll = patternCompile.matcher(str3).replaceAll("");
            kotlin.jvm.internal.l.e("replaceAll(...)", strReplaceAll);
        } else {
            strReplaceAll = null;
        }
        c0921s.f11599d = strReplaceAll;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.set(i9, C0904b.b((String) arrayList.get(i9), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = c0921s.f11602g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                String str4 = (String) arrayList2.get(i10);
                arrayList2.set(i10, str4 != null ? C0904b.b(str4, 0, 0, "\\^`{|}", 195) : null);
            }
        }
        String str5 = c0921s.f11603h;
        c0921s.f11603h = str5 != null ? C0904b.b(str5, 0, 0, " \"#<>\\^`{|}", 163) : null;
        String string = c0921s.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e7) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                kotlin.jvm.internal.l.e("compile(...)", patternCompile2);
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                kotlin.jvm.internal.l.e("replaceAll(...)", strReplaceAll2);
                URI uriCreate = URI.create(strReplaceAll2);
                kotlin.jvm.internal.l.e("{\n      // Unlikely edge…Unexpected!\n      }\n    }", uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e7);
            }
        }
    }

    public final int hashCode() {
        return this.f11612i.hashCode();
    }

    public final String toString() {
        return this.f11612i;
    }
}
