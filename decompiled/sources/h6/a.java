package h6;

import f6.C0894H;
import f6.C0895I;

/* loaded from: classes.dex */
public final class a {
    public static final C0895I a(C0895I c0895i) {
        if ((c0895i != null ? c0895i.f11501q : null) == null) {
            return c0895i;
        }
        C0894H c0894hG = c0895i.g();
        c0894hG.f11488g = null;
        return c0894hG.a();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
