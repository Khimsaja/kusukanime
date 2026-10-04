package io.ktor.client.plugins.cookies;

import O3.C;
import P3.m;
import S3.c;
import io.ktor.http.Cookie;
import io.ktor.http.IpParserKt;
import io.ktor.http.URLProtocolKt;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import io.ktor.util.TextKt;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a$\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\n*\u00020\u00032\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\r\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/client/plugins/cookies/CookiesStorage;", "", "urlString", "Lio/ktor/http/Cookie;", "cookie", "LO3/C;", "addCookie", "(Lio/ktor/client/plugins/cookies/CookiesStorage;Ljava/lang/String;Lio/ktor/http/Cookie;LS3/c;)Ljava/lang/Object;", "Lio/ktor/http/Url;", "requestUrl", "", "matches", "(Lio/ktor/http/Cookie;Lio/ktor/http/Url;)Z", "fillDefaults", "(Lio/ktor/http/Cookie;Lio/ktor/http/Url;)Lio/ktor/http/Cookie;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CookiesStorageKt {
    public static final Object addCookie(CookiesStorage cookiesStorage, String str, Cookie cookie, c<? super C> cVar) {
        Object objAddCookie = cookiesStorage.addCookie(URLUtilsKt.Url(str), cookie, cVar);
        return objAddCookie == T3.a.f9048k ? objAddCookie : C.a;
    }

    public static final Cookie fillDefaults(Cookie cookie, Url url) {
        l.f("<this>", cookie);
        l.f("requestUrl", url);
        String path = cookie.getPath();
        Cookie cookieCopy$default = (path == null || !AbstractC2517v.T(path, "/", false)) ? Cookie.copy$default(cookie, null, null, null, null, null, null, url.getEncodedPath(), false, false, null, 959, null) : cookie;
        String domain = cookieCopy$default.getDomain();
        return (domain == null || AbstractC2510o.g0(domain)) ? Cookie.copy$default(cookieCopy$default, null, null, null, null, null, url.getHost(), null, false, false, null, 991, null) : cookieCopy$default;
    }

    public static final boolean matches(Cookie cookie, Url url) {
        String lowerCasePreservingASCIIRules;
        CharSequence charSequenceSubSequence;
        l.f("<this>", cookie);
        l.f("requestUrl", url);
        String domain = cookie.getDomain();
        if (domain != null && (lowerCasePreservingASCIIRules = TextKt.toLowerCasePreservingASCIIRules(domain)) != null) {
            char[] cArr = {'.'};
            int length = lowerCasePreservingASCIIRules.length();
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    charSequenceSubSequence = "";
                    break;
                }
                if (!m.S(cArr, lowerCasePreservingASCIIRules.charAt(i7))) {
                    charSequenceSubSequence = lowerCasePreservingASCIIRules.subSequence(i7, lowerCasePreservingASCIIRules.length());
                    break;
                }
                i7++;
            }
            String string = charSequenceSubSequence.toString();
            if (string != null) {
                cookie.getPath();
                String path = cookie.getPath();
                if (path == null) {
                    throw new IllegalStateException("Path field should have the default value");
                }
                if (!AbstractC2510o.a0(path, '/')) {
                    path = cookie.getPath() + '/';
                }
                String lowerCasePreservingASCIIRules2 = TextKt.toLowerCasePreservingASCIIRules(url.getHost());
                String encodedPath = url.getEncodedPath();
                if (!AbstractC2510o.a0(encodedPath, '/')) {
                    encodedPath = encodedPath + '/';
                }
                return (l.a(lowerCasePreservingASCIIRules2, string) || (!IpParserKt.hostIsIp(lowerCasePreservingASCIIRules2) && AbstractC2517v.L(lowerCasePreservingASCIIRules2, ".".concat(string), false))) && (l.a(path, "/") || l.a(encodedPath, path) || AbstractC2517v.T(encodedPath, path, false)) && (!cookie.getSecure() || URLProtocolKt.isSecure(url.getProtocol()));
            }
        }
        throw new IllegalStateException("Domain field should have the default value");
    }
}
