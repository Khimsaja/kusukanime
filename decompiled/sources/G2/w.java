package G2;

import android.net.Uri;
import android.os.Bundle;
import f1.AbstractC0870c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f2738m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f2739n = Pattern.compile("\\{(.+?)\\}");
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2740b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2741c;

    /* renamed from: d, reason: collision with root package name */
    public final O3.q f2742d;

    /* renamed from: e, reason: collision with root package name */
    public final O3.q f2743e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2744f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2745g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2746h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f2747i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2748j;

    /* renamed from: k, reason: collision with root package name */
    public final O3.q f2749k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2750l;

    public w(String str) {
        this.a = str;
        ArrayList arrayList = new ArrayList();
        this.f2740b = arrayList;
        this.f2742d = z1.c.C(new u(this, 6));
        this.f2743e = z1.c.C(new u(this, 4));
        O3.j jVar = O3.j.f7526l;
        this.f2744f = z1.c.B(jVar, new u(this, 7));
        this.f2746h = z1.c.B(jVar, new u(this, 1));
        this.f2747i = z1.c.B(jVar, new u(this, 0));
        this.f2748j = z1.c.B(jVar, new u(this, 3));
        this.f2749k = z1.c.C(new u(this, 2));
        z1.c.C(new u(this, 5));
        StringBuilder sb = new StringBuilder("^");
        if (!f2738m.matcher(str).find()) {
            sb.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
        matcher.find();
        boolean z7 = false;
        String strSubstring = str.substring(0, matcher.start());
        kotlin.jvm.internal.l.e("substring(...)", strSubstring);
        a(strSubstring, arrayList, sb);
        if (!AbstractC2510o.W(sb, ".*", false) && !AbstractC2510o.W(sb, "([^/]+?)", false)) {
            z7 = true;
        }
        this.f2750l = z7;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        String string = sb.toString();
        kotlin.jvm.internal.l.e("uriRegex.toString()", string);
        this.f2741c = AbstractC2517v.R(string, ".*", "\\E.*\\Q");
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        Matcher matcher = f2739n.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.String", strGroup);
            arrayList.add(strGroup);
            if (matcher.start() > iEnd) {
                String strSubstring = str.substring(iEnd, matcher.start());
                kotlin.jvm.internal.l.e("substring(...)", strSubstring);
                sb.append(Pattern.quote(strSubstring));
            }
            sb.append("([^/]*?|)");
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            String strSubstring2 = str.substring(iEnd);
            kotlin.jvm.internal.l.e("substring(...)", strSubstring2);
            sb.append(Pattern.quote(strSubstring2));
        }
    }

    public static void d(Bundle bundle, String str, String str2, C0169f c0169f) {
        if (c0169f == null) {
            bundle.putString(str, str2);
            return;
        }
        M m7 = c0169f.a;
        kotlin.jvm.internal.l.f("key", str);
        m7.e(bundle, str, m7.c(str2));
    }

    public final boolean b(Matcher matcher, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.f2740b;
        ArrayList arrayList2 = new ArrayList(P3.r.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                P3.r.X();
                throw null;
            }
            String str = (String) next;
            String strDecode = Uri.decode(matcher.group(i8));
            C0169f c0169f = (C0169f) linkedHashMap.get(str);
            try {
                kotlin.jvm.internal.l.e("value", strDecode);
                d(bundle, str, strDecode, c0169f);
                arrayList2.add(O3.C.a);
                i7 = i8;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [O3.i, java.lang.Object] */
    public final boolean c(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        Object objValueOf;
        boolean z7;
        Object obj;
        String query;
        for (Map.Entry entry : ((Map) this.f2744f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            t tVar = (t) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.f2745g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = P3.r.H(query);
            }
            kotlin.jvm.internal.l.e("inputParams", queryParameters);
            Object obj2 = O3.C.a;
            int i7 = 0;
            Bundle bundleH = AbstractC0870c.H(new O3.l[0]);
            Iterator it = tVar.f2733b.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                C0169f c0169f = (C0169f) linkedHashMap.get(str2);
                M m7 = c0169f != null ? c0169f.a : null;
                if ((m7 instanceof J) && !c0169f.f2697b) {
                    ((J) m7).getClass();
                    boolean z8 = false;
                    switch (z8) {
                        case false:
                            obj = new boolean[0];
                            break;
                        case true:
                            obj = new float[0];
                            break;
                        case true:
                            obj = new int[0];
                            break;
                        case true:
                            obj = new long[0];
                            break;
                        default:
                            obj = new String[0];
                            break;
                    }
                    m7.e(bundleH, str2, obj);
                }
            }
            for (String str3 : queryParameters) {
                String str4 = tVar.a;
                Matcher matcher = str4 != null ? Pattern.compile(str4, 32).matcher(str3) : null;
                if (matcher == null || !matcher.matches()) {
                    return i7;
                }
                ArrayList arrayList = tVar.f2733b;
                ArrayList arrayList2 = new ArrayList(P3.r.p(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                int i8 = i7;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        P3.r.X();
                        throw null;
                    }
                    String str5 = (String) next;
                    String strGroup = matcher.group(i9);
                    if (strGroup == null) {
                        strGroup = "";
                    }
                    int i10 = i7;
                    C0169f c0169f2 = (C0169f) linkedHashMap.get(str5);
                    try {
                        if (bundleH.containsKey(str5)) {
                            if (bundleH.containsKey(str5)) {
                                if (c0169f2 != null) {
                                    M m8 = c0169f2.a;
                                    Object objA = m8.a(str5, bundleH);
                                    if (!bundleH.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this bundle.");
                                    }
                                    m8.e(bundleH, str5, m8.d(strGroup, objA));
                                }
                                z7 = i10;
                            } else {
                                z7 = 1;
                            }
                            try {
                                objValueOf = Boolean.valueOf(z7);
                            } catch (IllegalArgumentException unused) {
                                objValueOf = obj2;
                                arrayList2.add(objValueOf);
                                i8 = i9;
                                i7 = i10;
                            }
                        } else {
                            d(bundleH, str5, strGroup, c0169f2);
                            objValueOf = obj2;
                        }
                    } catch (IllegalArgumentException unused2) {
                    }
                    arrayList2.add(objValueOf);
                    i8 = i9;
                    i7 = i10;
                }
            }
            bundle.putAll(bundleH);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof w)) {
            return false;
        }
        return this.a.equals(((w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }
}
