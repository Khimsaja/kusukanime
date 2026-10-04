package io.github.jan.supabase.auth;

import O3.C;
import a6.v;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¨\u0006\u0007"}, d2 = {"putCaptchaToken", "", "Lkotlinx/serialization/json/JsonObjectBuilder;", "token", "", "putCodeChallenge", "codeChallenge", "auth-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JsonUtilsKt {
    public static final void putCaptchaToken(v vVar, String str) {
        l.f("<this>", vVar);
        l.f("token", str);
        v vVar2 = new v();
        putCaptchaToken$lambda$0(str, vVar2);
        vVar.b("gotrue_meta_security", vVar2.a());
    }

    private static final C putCaptchaToken$lambda$0(String str, v vVar) {
        l.f("$this$putJsonObject", vVar);
        n6.d.V("captcha_token", str, vVar);
        return C.a;
    }

    public static final void putCodeChallenge(v vVar, String str) {
        l.f("<this>", vVar);
        l.f("codeChallenge", str);
        n6.d.V("code_challenge", str, vVar);
        n6.d.V("code_challenge_method", PKCEConstants.CHALLENGE_METHOD, vVar);
    }
}
