package io.github.jan.supabase.auth;

import D6.r;
import O3.C;
import a6.C0673c;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.auth.user.UserInfo;
import io.github.jan.supabase.auth.user.UserSession;
import io.github.jan.supabase.logging.LogLevel;
import io.github.jan.supabase.logging.SupabaseLogger;
import io.ktor.http.LinkHeader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;
import z5.AbstractC2511p;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003\u001a\u0012\u0010\b\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003\u001a2\u0010\n\u001a\u00020\u000b\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\r*\u00020\u00062\u0006\u0010\u000e\u001a\u0002H\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0086H¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"noDeeplinkError", "", "arg", "", "parseSessionFromFragment", "Lio/github/jan/supabase/auth/user/UserSession;", "Lio/github/jan/supabase/auth/Auth;", "fragment", "parseSessionFromUrl", "url", "signInAnonymously", "", "T", "", "data", "captchaToken", "(Lio/github/jan/supabase/auth/Auth;Ljava/lang/Object;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "auth-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AuthExtensionsKt {
    public static final Void noDeeplinkError(String str) {
        l.f("arg", str);
        throw new IllegalStateException(AbstractC2511p.E("\n        Trying to use a deeplink as a redirect url, but no deeplink " + str + " is set in the AuthConfig.\n        If you want to use deep linking, set the scheme and host in the AuthConfig:\n        install(Auth) {\n            scheme = \"YOUR_SCHEME\"\n            host = \"YOUR_HOST\"\n        }\n        You can also provide a custom redirect url.\n    ").toString());
    }

    public static final UserSession parseSessionFromFragment(Auth auth, String str) {
        l.f("<this>", auth);
        l.f("fragment", str);
        Map<String, String> fragmentParts = UrlUtilsKt.getFragmentParts(str);
        SupabaseLogger logger = Auth.INSTANCE.getLogger();
        LogLevel logLevel = LogLevel.DEBUG;
        LogLevel level = logger.getLevel();
        if (level == null) {
            level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
        }
        if (logLevel.compareTo(level) >= 0) {
            logger.log(logLevel, (Throwable) null, "Fragment parts: " + fragmentParts);
        }
        String str2 = fragmentParts.get("access_token");
        if (str2 == null) {
            UtilsKt.invalidArg("No access token found");
            throw new r();
        }
        String str3 = fragmentParts.get("refresh_token");
        if (str3 == null) {
            UtilsKt.invalidArg("No refresh token found");
            throw new r();
        }
        String str4 = fragmentParts.get("expires_in");
        if (str4 == null) {
            UtilsKt.invalidArg("No expires in found");
            throw new r();
        }
        long j7 = Long.parseLong(str4);
        String str5 = fragmentParts.get("token_type");
        if (str5 == null) {
            UtilsKt.invalidArg("No token type found");
            throw new r();
        }
        String str6 = fragmentParts.get(LinkHeader.Parameters.Type);
        if (str6 == null) {
            str6 = "";
        }
        return new UserSession(str2, str3, fragmentParts.get("provider_refresh_token"), fragmentParts.get("provider_token"), j7, str5, (UserInfo) null, str6, (A5.d) null, 256, (f) null);
    }

    public static final UserSession parseSessionFromUrl(Auth auth, String str) {
        l.f("<this>", auth);
        l.f("url", str);
        return parseSessionFromFragment(auth, AbstractC2510o.B0(str, "#", str));
    }

    public static final <T> Object signInAnonymously(Auth auth, T t7, String str, S3.c<? super C> cVar) {
        auth.getSerializer();
        C0673c c0673c = a6.d.f10459d;
        l.k();
        throw null;
    }

    public static Object signInAnonymously$default(Auth auth, Object obj, String str, S3.c cVar, int i7, Object obj2) {
        auth.getSerializer();
        C0673c c0673c = a6.d.f10459d;
        l.k();
        throw null;
    }
}
