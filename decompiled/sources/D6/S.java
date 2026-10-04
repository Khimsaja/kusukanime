package D6;

import b1.AbstractC0703b;
import f.AbstractC0841b;
import f6.AbstractC0893G;
import f6.C0889C;
import f6.C0904b;
import f6.C0920r;
import f6.C0921s;
import f6.C0922t;
import f6.C0925w;
import f6.C0926x;
import f6.C0927y;
import io.ktor.http.ContentDisposition;
import io.ktor.http.ContentType;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f1687l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f1688m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final C0922t f1689b;

    /* renamed from: c, reason: collision with root package name */
    public String f1690c;

    /* renamed from: d, reason: collision with root package name */
    public C0921s f1691d;

    /* renamed from: e, reason: collision with root package name */
    public final C0889C f1692e = new C0889C();

    /* renamed from: f, reason: collision with root package name */
    public final D4.S f1693f;

    /* renamed from: g, reason: collision with root package name */
    public C0925w f1694g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1695h;

    /* renamed from: i, reason: collision with root package name */
    public final B2.l f1696i;

    /* renamed from: j, reason: collision with root package name */
    public final D4.T f1697j;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC0893G f1698k;

    public S(String str, C0922t c0922t, String str2, C0920r c0920r, C0925w c0925w, boolean z7, boolean z8, boolean z9) {
        this.a = str;
        this.f1689b = c0922t;
        this.f1690c = str2;
        this.f1694g = c0925w;
        this.f1695h = z7;
        if (c0920r != null) {
            this.f1693f = c0920r.j();
        } else {
            this.f1693f = new D4.S(5, false);
        }
        if (z8) {
            this.f1697j = new D4.T(2);
            return;
        }
        if (z9) {
            B2.l lVar = new B2.l(21);
            this.f1696i = lVar;
            C0925w c0925w2 = C0927y.f11621f;
            kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, c0925w2);
            if (c0925w2.f11616b.equals(ContentType.MultiPart.TYPE)) {
                lVar.f417m = c0925w2;
            } else {
                throw new IllegalArgumentException(("multipart != " + c0925w2).toString());
            }
        }
    }

    public final void a(String str, String str2, boolean z7) {
        D4.T t7 = this.f1697j;
        if (z7) {
            t7.getClass();
            kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
            t7.a.add(C0904b.b(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 83));
            t7.f1531b.add(C0904b.b(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 83));
            return;
        }
        t7.getClass();
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        t7.a.add(C0904b.b(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 91));
        t7.f1531b.add(C0904b.b(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 91));
    }

    public final void b(String str, String str2, boolean z7) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Pattern pattern = C0925w.f11614e;
                this.f1694g = AbstractC0841b.k(str2);
                return;
            } catch (IllegalArgumentException e7) {
                throw new IllegalArgumentException(AbstractC0703b.i("Malformed content type: ", str2), e7);
            }
        }
        D4.S s7 = this.f1693f;
        if (z7) {
            s7.k(str, str2);
        } else {
            s7.h(str, str2);
        }
    }

    public final void c(C0920r c0920r, AbstractC0893G abstractC0893G) {
        B2.l lVar = this.f1696i;
        lVar.getClass();
        kotlin.jvm.internal.l.f("body", abstractC0893G);
        if (c0920r.a("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (c0920r.a("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        ((ArrayList) lVar.f418n).add(new C0926x(c0920r, abstractC0893G));
    }

    public final void d(String str, String str2, boolean z7) {
        String str3 = this.f1690c;
        if (str3 != null) {
            C0922t c0922t = this.f1689b;
            C0921s c0921sF = c0922t.f(str3);
            this.f1691d = c0921sF;
            if (c0921sF == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + c0922t + ", Relative: " + this.f1690c);
            }
            this.f1690c = null;
        }
        if (z7) {
            C0921s c0921s = this.f1691d;
            c0921s.getClass();
            kotlin.jvm.internal.l.f("encodedName", str);
            if (c0921s.f11602g == null) {
                c0921s.f11602g = new ArrayList();
            }
            ArrayList arrayList = c0921s.f11602g;
            kotlin.jvm.internal.l.c(arrayList);
            arrayList.add(C0904b.b(str, 0, 0, " \"'<>#&=", 211));
            ArrayList arrayList2 = c0921s.f11602g;
            kotlin.jvm.internal.l.c(arrayList2);
            arrayList2.add(str2 != null ? C0904b.b(str2, 0, 0, " \"'<>#&=", 211) : null);
            return;
        }
        C0921s c0921s2 = this.f1691d;
        c0921s2.getClass();
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        if (c0921s2.f11602g == null) {
            c0921s2.f11602g = new ArrayList();
        }
        ArrayList arrayList3 = c0921s2.f11602g;
        kotlin.jvm.internal.l.c(arrayList3);
        arrayList3.add(C0904b.b(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 219));
        ArrayList arrayList4 = c0921s2.f11602g;
        kotlin.jvm.internal.l.c(arrayList4);
        arrayList4.add(str2 != null ? C0904b.b(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 219) : null);
    }
}
