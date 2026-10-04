package H4;

import f1.AbstractC0870c;
import io.ktor.http.ContentDisposition;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public abstract class w {
    public static final W4.c a;

    /* renamed from: b, reason: collision with root package name */
    public static final W4.b f3754b;

    static {
        W4.c cVar = new W4.c("kotlin.jvm.JvmField");
        a = cVar;
        android.support.v4.media.session.b.L(cVar);
        android.support.v4.media.session.b.L(new W4.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f3754b = android.support.v4.media.session.b.s("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String str) {
        kotlin.jvm.internal.l.f("propertyName", str);
        if (c(str)) {
            return str;
        }
        return "get" + AbstractC0870c.K(str);
    }

    public static final String b(String str) {
        String strK;
        StringBuilder sb = new StringBuilder("set");
        if (c(str)) {
            strK = str.substring(2);
            kotlin.jvm.internal.l.e("substring(...)", strK);
        } else {
            strK = AbstractC0870c.K(str);
        }
        sb.append(strK);
        return sb.toString();
    }

    public static final boolean c(String str) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        if (AbstractC2517v.T(str, "is", false) && str.length() != 2) {
            char cCharAt = str.charAt(2);
            if (kotlin.jvm.internal.l.g(97, cCharAt) > 0 || kotlin.jvm.internal.l.g(cCharAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }
}
