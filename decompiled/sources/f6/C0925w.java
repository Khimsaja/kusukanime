package f6;

import io.ktor.http.auth.HttpAuthHeader;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import z5.AbstractC2517v;

/* renamed from: f6.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0925w {

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f11614e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f11615f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11616b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11617c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f11618d;

    public C0925w(String str, String str2, String str3, String[] strArr) {
        this.a = str;
        this.f11616b = str2;
        this.f11617c = str3;
        this.f11618d = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.f11618d;
        int i7 = 0;
        int iB = P3.r.B(0, strArr.length - 1, 2);
        if (iB < 0) {
            str = null;
            break;
        }
        while (!AbstractC2517v.M(strArr[i7], HttpAuthHeader.Parameters.Charset, true)) {
            if (i7 == iB) {
                str = null;
                break;
            }
            i7 += 2;
        }
        str = strArr[i7 + 1];
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0925w) && kotlin.jvm.internal.l.a(((C0925w) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
