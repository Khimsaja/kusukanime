package D6;

import B1.C0017d;
import f6.C0920r;
import f6.C0925w;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f1699x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f1700y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    public final C0017d a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1701b;

    /* renamed from: c, reason: collision with root package name */
    public final Annotation[] f1702c;

    /* renamed from: d, reason: collision with root package name */
    public final Annotation[][] f1703d;

    /* renamed from: e, reason: collision with root package name */
    public final Type[] f1704e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1705f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1706g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1707h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1708i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1709j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1710k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1711l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1712m;

    /* renamed from: n, reason: collision with root package name */
    public String f1713n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1714o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1715p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1716q;

    /* renamed from: r, reason: collision with root package name */
    public String f1717r;

    /* renamed from: s, reason: collision with root package name */
    public C0920r f1718s;

    /* renamed from: t, reason: collision with root package name */
    public C0925w f1719t;

    /* renamed from: u, reason: collision with root package name */
    public LinkedHashSet f1720u;

    /* renamed from: v, reason: collision with root package name */
    public c0[] f1721v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1722w;

    public T(C0017d c0017d, Method method) {
        this.a = c0017d;
        this.f1701b = method;
        this.f1702c = method.getAnnotations();
        this.f1704e = method.getGenericParameterTypes();
        this.f1703d = method.getParameterAnnotations();
    }

    public static Class a(Class cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    public final void b(String str, String str2, boolean z7) {
        String str3 = this.f1713n;
        Method method = this.f1701b;
        if (str3 != null) {
            throw c0.n(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.f1713n = str;
        this.f1714o = z7;
        if (str2.isEmpty()) {
            return;
        }
        int iIndexOf = str2.indexOf(63);
        Pattern pattern = f1699x;
        if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
            String strSubstring = str2.substring(iIndexOf + 1);
            if (pattern.matcher(strSubstring).find()) {
                throw c0.n(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
            }
        }
        this.f1717r = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.f1720u = linkedHashSet;
    }

    public final void c(int i7, Type type) {
        if (c0.j(type)) {
            throw c0.o(this.f1701b, i7, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
