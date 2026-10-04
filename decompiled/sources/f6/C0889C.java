package f6;

import D4.S;
import b1.AbstractC0703b;
import e5.AbstractC0832b;
import f.AbstractC0841b;
import io.ktor.http.LinkHeader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import z5.AbstractC2517v;

/* renamed from: f6.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0889C {
    public C0922t a;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0893G f11473d;

    /* renamed from: e, reason: collision with root package name */
    public LinkedHashMap f11474e = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public String f11471b = "GET";

    /* renamed from: c, reason: collision with root package name */
    public S f11472c = new S(5, false);

    public final C0890D a() {
        Map mapUnmodifiableMap;
        C0922t c0922t = this.a;
        if (c0922t == null) {
            throw new IllegalStateException("url == null");
        }
        String str = this.f11471b;
        C0920r c0920rL = this.f11472c.l();
        AbstractC0893G abstractC0893G = this.f11473d;
        LinkedHashMap linkedHashMap = this.f11474e;
        byte[] bArr = g6.b.a;
        kotlin.jvm.internal.l.f("<this>", linkedHashMap);
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = P3.z.f7780k;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            kotlin.jvm.internal.l.e("{\n    Collections.unmodi…(LinkedHashMap(this))\n  }", mapUnmodifiableMap);
        }
        return new C0890D(c0922t, str, c0920rL, abstractC0893G, mapUnmodifiableMap);
    }

    public final void b(C0906d c0906d) {
        kotlin.jvm.internal.l.f("cacheControl", c0906d);
        String string = c0906d.toString();
        if (string.length() == 0) {
            this.f11472c.x("Cache-Control");
        } else {
            c("Cache-Control", string);
        }
    }

    public final void c(String str, String str2) {
        kotlin.jvm.internal.l.f("value", str2);
        S s7 = this.f11472c;
        s7.getClass();
        AbstractC0832b.j(str);
        AbstractC0832b.k(str2, str);
        s7.x(str);
        s7.i(str, str2);
    }

    public final void d(String str, AbstractC0893G abstractC0893G) {
        kotlin.jvm.internal.l.f("method", str);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (abstractC0893G == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(AbstractC0703b.j("method ", str, " must have a request body.").toString());
            }
        } else if (!AbstractC0841b.n(str)) {
            throw new IllegalArgumentException(AbstractC0703b.j("method ", str, " must not have a request body.").toString());
        }
        this.f11471b = str;
        this.f11473d = abstractC0893G;
    }

    public final void e(Class cls, Object obj) {
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, cls);
        if (obj == null) {
            this.f11474e.remove(cls);
            return;
        }
        if (this.f11474e.isEmpty()) {
            this.f11474e = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = this.f11474e;
        Object objCast = cls.cast(obj);
        kotlin.jvm.internal.l.c(objCast);
        linkedHashMap.put(cls, objCast);
    }

    public final void f(String str) {
        kotlin.jvm.internal.l.f("url", str);
        if (AbstractC2517v.T(str, "ws:", true)) {
            String strSubstring = str.substring(3);
            kotlin.jvm.internal.l.e("this as java.lang.String).substring(startIndex)", strSubstring);
            str = "http:".concat(strSubstring);
        } else if (AbstractC2517v.T(str, "wss:", true)) {
            String strSubstring2 = str.substring(4);
            kotlin.jvm.internal.l.e("this as java.lang.String).substring(startIndex)", strSubstring2);
            str = "https:".concat(strSubstring2);
        }
        kotlin.jvm.internal.l.f("<this>", str);
        C0921s c0921s = new C0921s();
        c0921s.c(null, str);
        this.a = c0921s.a();
    }
}
