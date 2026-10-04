package io.github.jan.supabase.auth;

import K5.J;
import K5.W;
import O3.C;
import P3.r;
import e4.k;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.SupabaseClientBuilder;
import io.github.jan.supabase.annotations.SupabaseExperimental;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.github.jan.supabase.auth.OtpType;
import io.github.jan.supabase.auth.admin.AdminApi;
import io.github.jan.supabase.auth.event.AuthEvent;
import io.github.jan.supabase.auth.mfa.MfaApi;
import io.github.jan.supabase.auth.providers.AuthProvider;
import io.github.jan.supabase.auth.providers.ExternalAuthConfigDefaults;
import io.github.jan.supabase.auth.providers.OAuthProvider;
import io.github.jan.supabase.auth.providers.builtin.SSO;
import io.github.jan.supabase.auth.status.SessionSource;
import io.github.jan.supabase.auth.status.SessionStatus;
import io.github.jan.supabase.auth.user.Identity;
import io.github.jan.supabase.auth.user.UserInfo;
import io.github.jan.supabase.auth.user.UserSession;
import io.github.jan.supabase.logging.SupabaseLogger;
import io.github.jan.supabase.plugins.CustomSerializationPlugin;
import io.github.jan.supabase.plugins.MainPlugin;
import io.github.jan.supabase.plugins.SupabasePluginProvider;
import io.ktor.http.LinkHeader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u0086\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0086\u0001Jc\u0010#\u001a\u0004\u0018\u0001H$\"\u0004\b\u0000\u0010%\"\u0004\b\u0001\u0010$\"\u0014\b\u0002\u0010&*\u000e\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H$0'2\u0006\u0010(\u001a\u0002H&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\u001b\b\u0002\u0010+\u001a\u0015\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u00020-\u0018\u00010,¢\u0006\u0002\b.H¦@¢\u0006\u0002\u0010/Ja\u00100\u001a\u00020-\"\u0004\b\u0000\u0010%\"\u0004\b\u0001\u0010$\"\u0014\b\u0002\u0010&*\u000e\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H$0'2\u0006\u0010(\u001a\u0002H&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\u001b\b\u0002\u0010+\u001a\u0015\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u00020-\u0018\u00010,¢\u0006\u0002\b.H¦@¢\u0006\u0002\u0010/J&\u00101\u001a\u00020-2\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\n\b\u0002\u00104\u001a\u0004\u0018\u00010*H¦@¢\u0006\u0002\u00105J?\u00106\u001a\u0004\u0018\u00010*2\u0006\u0010(\u001a\u0002072\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\u0019\b\u0002\u0010+\u001a\u0013\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020-0,¢\u0006\u0002\b.H¦@¢\u0006\u0002\u00109J \u0010:\u001a\u00020-2\u0006\u0010;\u001a\u00020*2\b\b\u0002\u0010<\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010=J3\u0010>\u001a\u00020?2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\u0017\u0010+\u001a\u0013\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020-0,¢\u0006\u0002\b.H¦@¢\u0006\u0002\u0010AJ=\u0010B\u001a\u00020C2\b\b\u0002\u0010D\u001a\u00020\u00112\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\u0017\u0010+\u001a\u0013\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020-0,¢\u0006\u0002\b.H¦@¢\u0006\u0002\u0010FJ*\u0010G\u001a\u00020-2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020*2\n\b\u0002\u00104\u001a\u0004\u0018\u00010*H¦@¢\u0006\u0002\u0010KJ*\u0010L\u001a\u00020-2\u0006\u0010H\u001a\u00020M2\u0006\u0010N\u001a\u00020*2\n\b\u0002\u00104\u001a\u0004\u0018\u00010*H¦@¢\u0006\u0002\u0010OJ.\u0010P\u001a\u00020-2\u0006\u0010J\u001a\u00020*2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u00104\u001a\u0004\u0018\u00010*H¦@¢\u0006\u0002\u0010QJ\u000e\u0010R\u001a\u00020-H¦@¢\u0006\u0002\u0010SJ2\u0010T\u001a\u00020-2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020*2\u0006\u0010U\u001a\u00020*2\n\b\u0002\u00104\u001a\u0004\u0018\u00010*H¦@¢\u0006\u0002\u0010VJ*\u0010T\u001a\u00020-2\u0006\u0010H\u001a\u00020I2\u0006\u0010W\u001a\u00020*2\n\b\u0002\u00104\u001a\u0004\u0018\u00010*H¦@¢\u0006\u0002\u0010KJ2\u0010X\u001a\u00020-2\u0006\u0010H\u001a\u00020M2\u0006\u0010N\u001a\u00020*2\u0006\u0010U\u001a\u00020*2\n\b\u0002\u00104\u001a\u0004\u0018\u00010*H¦@¢\u0006\u0002\u0010YJ\u0016\u0010Z\u001a\u00020C2\u0006\u0010[\u001a\u00020*H¦@¢\u0006\u0002\u0010\\J\u0018\u0010]\u001a\u00020C2\b\b\u0002\u0010^\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010_J\u0018\u0010`\u001a\u00020-2\b\b\u0002\u0010a\u001a\u00020bH¦@¢\u0006\u0002\u0010cJ*\u0010d\u001a\u00020-2\u0006\u0010e\u001a\u00020f2\b\b\u0002\u0010g\u001a\u00020\u00112\b\b\u0002\u0010h\u001a\u00020iH¦@¢\u0006\u0002\u0010jJ4\u0010k\u001a\u00020-2\u0006\u0010l\u001a\u00020*2\b\b\u0002\u0010m\u001a\u00020*2\b\b\u0002\u0010Z\u001a\u00020\u00112\b\b\u0002\u0010g\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010nJ\u0018\u0010o\u001a\u00020\u00112\b\b\u0002\u0010g\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010_J\u0016\u0010p\u001a\u00020f2\u0006\u0010m\u001a\u00020*H¦@¢\u0006\u0002\u0010\\J\u000e\u0010q\u001a\u00020-H¦@¢\u0006\u0002\u0010SJ\u000e\u0010r\u001a\u00020-H¦@¢\u0006\u0002\u0010SJ\u0010\u0010s\u001a\u00020-2\u0006\u0010t\u001a\u00020\u0006H'J\u0010\u0010u\u001a\u00020-2\u0006\u0010v\u001a\u00020\u000bH'J \u0010w\u001a\u00020f2\u0006\u0010x\u001a\u00020*2\b\b\u0002\u0010y\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010=J\u000e\u0010z\u001a\u00020-H¦@¢\u0006\u0002\u0010SJA\u0010{\u001a\u00020*2\u0006\u0010(\u001a\u0002072\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010|\u001a\u00020*2\u0019\b\u0002\u0010}\u001a\u0013\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020-0,¢\u0006\u0002\b.H&J\b\u0010~\u001a\u00020-H&J\n\u0010\u007f\u001a\u0004\u0018\u00010*H\u0016J\u000b\u0010\u0080\u0001\u001a\u0004\u0018\u00010fH\u0016J\u000b\u0010\u0081\u0001\u001a\u0004\u0018\u00010CH\u0016J\u0013\u0010\u0082\u0001\u001a\f\u0012\u0005\u0012\u00030\u0084\u0001\u0018\u00010\u0083\u0001H\u0016J\u000f\u0010\u0085\u0001\u001a\u00020-H¦@¢\u0006\u0002\u0010SR\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X§\u0004¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020 X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006\u0087\u0001À\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/auth/Auth;", "Lio/github/jan/supabase/plugins/MainPlugin;", "Lio/github/jan/supabase/auth/AuthConfig;", "Lio/github/jan/supabase/plugins/CustomSerializationPlugin;", "sessionStatus", "Lkotlinx/coroutines/flow/StateFlow;", "Lio/github/jan/supabase/auth/status/SessionStatus;", "getSessionStatus", "()Lkotlinx/coroutines/flow/StateFlow;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "Lio/github/jan/supabase/auth/event/AuthEvent;", "getEvents$annotations", "()V", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "isAutoRefreshRunning", "", "()Z", "sessionManager", "Lio/github/jan/supabase/auth/SessionManager;", "getSessionManager", "()Lio/github/jan/supabase/auth/SessionManager;", "admin", "Lio/github/jan/supabase/auth/admin/AdminApi;", "getAdmin", "()Lio/github/jan/supabase/auth/admin/AdminApi;", "mfa", "Lio/github/jan/supabase/auth/mfa/MfaApi;", "getMfa", "()Lio/github/jan/supabase/auth/mfa/MfaApi;", "codeVerifierCache", "Lio/github/jan/supabase/auth/CodeVerifierCache;", "getCodeVerifierCache", "()Lio/github/jan/supabase/auth/CodeVerifierCache;", "signUpWith", "R", "C", "Provider", "Lio/github/jan/supabase/auth/providers/AuthProvider;", "provider", "redirectUrl", "", "config", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lio/github/jan/supabase/auth/providers/AuthProvider;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInWith", "signInAnonymously", "data", "Lkotlinx/serialization/json/JsonObject;", "captchaToken", "(Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "linkIdentity", "Lio/github/jan/supabase/auth/providers/OAuthProvider;", "Lio/github/jan/supabase/auth/providers/ExternalAuthConfigDefaults;", "(Lio/github/jan/supabase/auth/providers/OAuthProvider;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unlinkIdentity", "identityId", "updateLocalUser", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveSSOUrl", "Lio/github/jan/supabase/auth/providers/builtin/SSO$Result;", "Lio/github/jan/supabase/auth/providers/builtin/SSO$Config;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUser", "Lio/github/jan/supabase/auth/user/UserInfo;", "updateCurrentUser", "Lio/github/jan/supabase/auth/user/UserUpdateBuilder;", "(ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resendEmail", LinkHeader.Parameters.Type, "Lio/github/jan/supabase/auth/OtpType$Email;", "email", "(Lio/github/jan/supabase/auth/OtpType$Email;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resendPhone", "Lio/github/jan/supabase/auth/OtpType$Phone;", "phone", "(Lio/github/jan/supabase/auth/OtpType$Phone;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetPasswordForEmail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reauthenticate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyEmailOtp", "token", "(Lio/github/jan/supabase/auth/OtpType$Email;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tokenHash", "verifyPhoneOtp", "(Lio/github/jan/supabase/auth/OtpType$Phone;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveUser", "jwt", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveUserForCurrentSession", "updateSession", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signOut", "scope", "Lio/github/jan/supabase/auth/SignOutScope;", "(Lio/github/jan/supabase/auth/SignOutScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "importSession", SettingsSessionManager.SETTINGS_KEY, "Lio/github/jan/supabase/auth/user/UserSession;", "autoRefresh", "source", "Lio/github/jan/supabase/auth/status/SessionSource;", "(Lio/github/jan/supabase/auth/user/UserSession;ZLio/github/jan/supabase/auth/status/SessionSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "importAuthToken", "accessToken", "refreshToken", "(Ljava/lang/String;Ljava/lang/String;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFromStorage", "refreshSession", "refreshCurrentSession", "clearSession", "setSessionStatus", "status", "emitEvent", "event", "exchangeCodeForSession", "code", "saveSession", "startAutoRefreshForCurrentSession", "getOAuthUrl", "url", "additionalConfig", "stopAutoRefreshForCurrentSession", "currentAccessTokenOrNull", "currentSessionOrNull", "currentUserOrNull", "currentIdentitiesOrNull", "", "Lio/github/jan/supabase/auth/user/Identity;", "awaitInitialization", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Auth extends MainPlugin<AuthConfig>, CustomSerializationPlugin {
    public static final int API_VERSION = 1;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u0016\u001a\u00020\u00022\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lio/github/jan/supabase/auth/Auth$Companion;", "Lio/github/jan/supabase/plugins/SupabasePluginProvider;", "Lio/github/jan/supabase/auth/AuthConfig;", "Lio/github/jan/supabase/auth/Auth;", "<init>", "()V", "HASH_PARAMETERS", "", "", "getHASH_PARAMETERS$auth_kt_release", "()Ljava/util/List;", "QUERY_PARAMETERS", "getQUERY_PARAMETERS$auth_kt_release", "key", "getKey", "()Ljava/lang/String;", "logger", "Lio/github/jan/supabase/logging/SupabaseLogger;", "getLogger", "()Lio/github/jan/supabase/logging/SupabaseLogger;", "API_VERSION", "", "createConfig", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "create", "supabaseClient", "Lio/github/jan/supabase/SupabaseClient;", "config", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements SupabasePluginProvider<AuthConfig, Auth> {
        public static final int API_VERSION = 1;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final List<String> HASH_PARAMETERS = r.I("access_token", "refresh_token", "expires_in", "expires_at", "token_type", LinkHeader.Parameters.Type, "provider_refresh_token", "provider_token", "error", "error_code", "error_description");
        private static final List<String> QUERY_PARAMETERS = r.I("code", "error_code", "error", "error_description");
        private static final String key = "auth";
        private static final SupabaseLogger logger = SupabaseClient.Companion.createLogger$default(SupabaseClient.INSTANCE, "Supabase-Auth", null, 2, null);

        private Companion() {
        }

        public final List<String> getHASH_PARAMETERS$auth_kt_release() {
            return HASH_PARAMETERS;
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public String getKey() {
            return key;
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public SupabaseLogger getLogger() {
            return logger;
        }

        public final List<String> getQUERY_PARAMETERS$auth_kt_release() {
            return QUERY_PARAMETERS;
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public /* bridge */ void setup(SupabaseClientBuilder supabaseClientBuilder, AuthConfig authConfig) {
            super.setup(supabaseClientBuilder, (SupabaseClientBuilder) authConfig);
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public Auth create(SupabaseClient supabaseClient, AuthConfig config) {
            l.f("supabaseClient", supabaseClient);
            l.f("config", config);
            return new AuthImpl(supabaseClient, config);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public AuthConfig createConfig(k kVar) {
            l.f("init", kVar);
            AuthConfig authConfig = new AuthConfig();
            kVar.invoke(authConfig);
            return authConfig;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static Object close(Auth auth, S3.c<? super C> cVar) {
            return Auth.super.close(cVar);
        }

        @Deprecated
        public static String currentAccessTokenOrNull(Auth auth) {
            return Auth.super.currentAccessTokenOrNull();
        }

        @Deprecated
        public static List<Identity> currentIdentitiesOrNull(Auth auth) {
            return Auth.super.currentIdentitiesOrNull();
        }

        @Deprecated
        public static UserSession currentSessionOrNull(Auth auth) {
            return Auth.super.currentSessionOrNull();
        }

        @Deprecated
        public static UserInfo currentUserOrNull(Auth auth) {
            return Auth.super.currentUserOrNull();
        }

        @SupabaseExperimental
        public static /* synthetic */ void getEvents$annotations() {
        }

        @Deprecated
        public static Object importAuthToken(Auth auth, String str, String str2, boolean z7, boolean z8, S3.c<? super C> cVar) {
            return Auth.super.importAuthToken(str, str2, z7, z8, cVar);
        }

        @Deprecated
        public static void init(Auth auth) {
            Auth.super.init();
        }

        @Deprecated
        public static String resolveUrl(Auth auth, String str) {
            l.f("path", str);
            return Auth.super.resolveUrl(str);
        }
    }

    @U3.e(c = "io.github.jan.supabase.auth.Auth", f = "Auth.kt", l = {329, 329}, m = "importAuthToken$suspendImpl", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.Auth$importAuthToken$1, reason: invalid class name */
    public static final class AnonymousClass1 extends U3.c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Auth.importAuthToken$suspendImpl(Auth.this, null, null, false, false, this);
        }
    }

    static /* synthetic */ Object exchangeCodeForSession$default(Auth auth, String str, boolean z7, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exchangeCodeForSession");
        }
        if ((i7 & 2) != 0) {
            z7 = true;
        }
        return auth.exchangeCodeForSession(str, z7, cVar);
    }

    static /* synthetic */ String getOAuthUrl$default(Auth auth, OAuthProvider oAuthProvider, String str, String str2, k kVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOAuthUrl");
        }
        if ((i7 & 2) != 0) {
            str = RedirectUrlKt.defaultRedirectUrl(auth);
        }
        if ((i7 & 4) != 0) {
            str2 = "authorize";
        }
        if ((i7 & 8) != 0) {
            kVar = new c(3);
        }
        return auth.getOAuthUrl(oAuthProvider, str, str2, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C getOAuthUrl$lambda$0(ExternalAuthConfigDefaults externalAuthConfigDefaults) {
        l.f("<this>", externalAuthConfigDefaults);
        return C.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object importAuthToken$default(Auth auth, String str, String str2, boolean z7, boolean z8, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: importAuthToken");
        }
        if ((i7 & 2) != 0) {
            str2 = "";
        }
        String str3 = str2;
        boolean z9 = (i7 & 4) != 0 ? false : z7;
        if ((i7 & 8) != 0) {
            z8 = !AbstractC2510o.g0(str3) ? ((AuthConfig) auth.getConfig()).getAlwaysAutoRefresh() : false;
        }
        return auth.importAuthToken(str, str3, z9, z8, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0100, code lost:
    
        if (importSession$default(r5, r10, r7, null, r9, 4, null) != r4) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object importAuthToken$suspendImpl(io.github.jan.supabase.auth.Auth r25, java.lang.String r26, java.lang.String r27, boolean r28, boolean r29, S3.c<? super O3.C> r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.Auth.importAuthToken$suspendImpl(io.github.jan.supabase.auth.Auth, java.lang.String, java.lang.String, boolean, boolean, S3.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object importSession$default(Auth auth, UserSession userSession, boolean z7, SessionSource sessionSource, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: importSession");
        }
        if ((i7 & 2) != 0) {
            z7 = ((AuthConfig) auth.getConfig()).getAlwaysAutoRefresh();
        }
        if ((i7 & 4) != 0) {
            sessionSource = SessionSource.Unknown.INSTANCE;
        }
        return auth.importSession(userSession, z7, sessionSource, cVar);
    }

    static /* synthetic */ Object linkIdentity$default(Auth auth, OAuthProvider oAuthProvider, String str, k kVar, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkIdentity");
        }
        if ((i7 & 2) != 0) {
            str = RedirectUrlKt.defaultRedirectUrl(auth);
        }
        if ((i7 & 4) != 0) {
            kVar = new c(2);
        }
        return auth.linkIdentity(oAuthProvider, str, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C linkIdentity$lambda$0(ExternalAuthConfigDefaults externalAuthConfigDefaults) {
        l.f("<this>", externalAuthConfigDefaults);
        return C.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object loadFromStorage$default(Auth auth, boolean z7, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadFromStorage");
        }
        if ((i7 & 1) != 0) {
            z7 = ((AuthConfig) auth.getConfig()).getAlwaysAutoRefresh();
        }
        return auth.loadFromStorage(z7, cVar);
    }

    static /* synthetic */ Object resendEmail$default(Auth auth, OtpType.Email email, String str, String str2, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resendEmail");
        }
        if ((i7 & 4) != 0) {
            str2 = null;
        }
        return auth.resendEmail(email, str, str2, cVar);
    }

    static /* synthetic */ Object resendPhone$default(Auth auth, OtpType.Phone phone, String str, String str2, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resendPhone");
        }
        if ((i7 & 4) != 0) {
            str2 = null;
        }
        return auth.resendPhone(phone, str, str2, cVar);
    }

    static /* synthetic */ Object resetPasswordForEmail$default(Auth auth, String str, String str2, String str3, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetPasswordForEmail");
        }
        if ((i7 & 2) != 0) {
            str2 = RedirectUrlKt.defaultRedirectUrl(auth);
        }
        if ((i7 & 4) != 0) {
            str3 = null;
        }
        return auth.resetPasswordForEmail(str, str2, str3, cVar);
    }

    static /* synthetic */ Object retrieveSSOUrl$default(Auth auth, String str, k kVar, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveSSOUrl");
        }
        if ((i7 & 1) != 0) {
            str = RedirectUrlKt.defaultRedirectUrl(auth);
        }
        return auth.retrieveSSOUrl(str, kVar, cVar);
    }

    static /* synthetic */ Object retrieveUserForCurrentSession$default(Auth auth, boolean z7, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveUserForCurrentSession");
        }
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        return auth.retrieveUserForCurrentSession(z7, cVar);
    }

    static /* synthetic */ Object signInAnonymously$default(Auth auth, kotlinx.serialization.json.c cVar, String str, S3.c cVar2, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signInAnonymously");
        }
        if ((i7 & 1) != 0) {
            cVar = null;
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        return auth.signInAnonymously(cVar, str, cVar2);
    }

    static /* synthetic */ Object signInWith$default(Auth auth, AuthProvider authProvider, String str, k kVar, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signInWith");
        }
        if ((i7 & 2) != 0) {
            str = RedirectUrlKt.defaultRedirectUrl(auth);
        }
        if ((i7 & 4) != 0) {
            kVar = null;
        }
        return auth.signInWith(authProvider, str, kVar, cVar);
    }

    static /* synthetic */ Object signOut$default(Auth auth, SignOutScope signOutScope, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signOut");
        }
        if ((i7 & 1) != 0) {
            signOutScope = SignOutScope.LOCAL;
        }
        return auth.signOut(signOutScope, cVar);
    }

    static /* synthetic */ Object signUpWith$default(Auth auth, AuthProvider authProvider, String str, k kVar, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signUpWith");
        }
        if ((i7 & 2) != 0) {
            str = RedirectUrlKt.defaultRedirectUrl(auth);
        }
        if ((i7 & 4) != 0) {
            kVar = null;
        }
        return auth.signUpWith(authProvider, str, kVar, cVar);
    }

    static /* synthetic */ Object unlinkIdentity$default(Auth auth, String str, boolean z7, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlinkIdentity");
        }
        if ((i7 & 2) != 0) {
            z7 = true;
        }
        return auth.unlinkIdentity(str, z7, cVar);
    }

    static /* synthetic */ Object updateUser$default(Auth auth, boolean z7, String str, k kVar, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateUser");
        }
        if ((i7 & 1) != 0) {
            z7 = true;
        }
        if ((i7 & 2) != 0) {
            str = RedirectUrlKt.defaultRedirectUrl(auth);
        }
        return auth.updateUser(z7, str, kVar, cVar);
    }

    static /* synthetic */ Object verifyEmailOtp$default(Auth auth, OtpType.Email email, String str, String str2, String str3, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyEmailOtp");
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        return auth.verifyEmailOtp(email, str, str2, str3, cVar);
    }

    static /* synthetic */ Object verifyPhoneOtp$default(Auth auth, OtpType.Phone phone, String str, String str2, String str3, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyPhoneOtp");
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        return auth.verifyPhoneOtp(phone, str, str2, str3, cVar);
    }

    Object awaitInitialization(S3.c<? super C> cVar);

    Object clearSession(S3.c<? super C> cVar);

    default String currentAccessTokenOrNull() {
        UserSession userSessionCurrentSessionOrNull = currentSessionOrNull();
        if (userSessionCurrentSessionOrNull != null) {
            return userSessionCurrentSessionOrNull.getAccessToken();
        }
        return null;
    }

    default List<Identity> currentIdentitiesOrNull() {
        UserInfo userInfoCurrentUserOrNull = currentUserOrNull();
        if (userInfoCurrentUserOrNull != null) {
            return userInfoCurrentUserOrNull.getIdentities();
        }
        return null;
    }

    default UserSession currentSessionOrNull() {
        SessionStatus sessionStatus = (SessionStatus) getSessionStatus().getValue();
        if (sessionStatus instanceof SessionStatus.Authenticated) {
            return ((SessionStatus.Authenticated) sessionStatus).getSession();
        }
        return null;
    }

    default UserInfo currentUserOrNull() {
        UserSession userSessionCurrentSessionOrNull = currentSessionOrNull();
        if (userSessionCurrentSessionOrNull != null) {
            return userSessionCurrentSessionOrNull.getUser();
        }
        return null;
    }

    @SupabaseInternal
    void emitEvent(AuthEvent event);

    Object exchangeCodeForSession(String str, boolean z7, S3.c<? super UserSession> cVar);

    AdminApi getAdmin();

    CodeVerifierCache getCodeVerifierCache();

    J getEvents();

    MfaApi getMfa();

    String getOAuthUrl(OAuthProvider oAuthProvider, String str, String str2, k kVar);

    SessionManager getSessionManager();

    W getSessionStatus();

    default Object importAuthToken(String str, String str2, boolean z7, boolean z8, S3.c<? super C> cVar) {
        return importAuthToken$suspendImpl(this, str, str2, z7, z8, cVar);
    }

    Object importSession(UserSession userSession, boolean z7, SessionSource sessionSource, S3.c<? super C> cVar);

    boolean isAutoRefreshRunning();

    Object linkIdentity(OAuthProvider oAuthProvider, String str, k kVar, S3.c<? super String> cVar);

    Object loadFromStorage(boolean z7, S3.c<? super Boolean> cVar);

    Object reauthenticate(S3.c<? super C> cVar);

    Object refreshCurrentSession(S3.c<? super C> cVar);

    Object refreshSession(String str, S3.c<? super UserSession> cVar);

    Object resendEmail(OtpType.Email email, String str, String str2, S3.c<? super C> cVar);

    Object resendPhone(OtpType.Phone phone, String str, String str2, S3.c<? super C> cVar);

    Object resetPasswordForEmail(String str, String str2, String str3, S3.c<? super C> cVar);

    Object retrieveSSOUrl(String str, k kVar, S3.c<? super SSO.Result> cVar);

    Object retrieveUser(String str, S3.c<? super UserInfo> cVar);

    Object retrieveUserForCurrentSession(boolean z7, S3.c<? super UserInfo> cVar);

    @SupabaseInternal
    void setSessionStatus(SessionStatus status);

    Object signInAnonymously(kotlinx.serialization.json.c cVar, String str, S3.c<? super C> cVar2);

    <C, R, Provider extends AuthProvider<C, R>> Object signInWith(Provider provider, String str, k kVar, S3.c<? super C> cVar);

    Object signOut(SignOutScope signOutScope, S3.c<? super C> cVar);

    <C, R, Provider extends AuthProvider<C, R>> Object signUpWith(Provider provider, String str, k kVar, S3.c<? super R> cVar);

    Object startAutoRefreshForCurrentSession(S3.c<? super C> cVar);

    void stopAutoRefreshForCurrentSession();

    Object unlinkIdentity(String str, boolean z7, S3.c<? super C> cVar);

    Object updateUser(boolean z7, String str, k kVar, S3.c<? super UserInfo> cVar);

    Object verifyEmailOtp(OtpType.Email email, String str, String str2, S3.c<? super C> cVar);

    Object verifyEmailOtp(OtpType.Email email, String str, String str2, String str3, S3.c<? super C> cVar);

    Object verifyPhoneOtp(OtpType.Phone phone, String str, String str2, String str3, S3.c<? super C> cVar);

    static /* synthetic */ Object verifyEmailOtp$default(Auth auth, OtpType.Email email, String str, String str2, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyEmailOtp");
        }
        if ((i7 & 4) != 0) {
            str2 = null;
        }
        return auth.verifyEmailOtp(email, str, str2, cVar);
    }
}
