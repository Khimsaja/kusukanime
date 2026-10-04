package io.github.jan.supabase.auth;

import A5.g;
import H5.AbstractC0281w;
import O3.InterfaceC0554c;
import io.github.jan.supabase.SupabaseSerializer;
import io.github.jan.supabase.annotations.SupabaseExperimental;
import io.github.jan.supabase.plugins.MainConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R&\u0010#\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b%\u0010\u0003\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010<\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R\u001c\u0010?\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00109\"\u0004\bA\u0010;R\u001a\u0010B\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u000e\"\u0004\bD\u0010\u0010R$\u0010E\u001a\u00020F8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bG\u0010\u0003\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lio/github/jan/supabase/auth/AuthConfigDefaults;", "Lio/github/jan/supabase/plugins/MainConfig;", "<init>", "()V", "retryDelay", "Lkotlin/time/Duration;", "getRetryDelay-UwyO8pc", "()J", "setRetryDelay-LRDsOJo", "(J)V", "J", "alwaysAutoRefresh", "", "getAlwaysAutoRefresh", "()Z", "setAlwaysAutoRefresh", "(Z)V", "autoLoadFromStorage", "getAutoLoadFromStorage", "setAutoLoadFromStorage", "autoSaveToStorage", "getAutoSaveToStorage", "setAutoSaveToStorage", "sessionManager", "Lio/github/jan/supabase/auth/SessionManager;", "getSessionManager", "()Lio/github/jan/supabase/auth/SessionManager;", "setSessionManager", "(Lio/github/jan/supabase/auth/SessionManager;)V", "codeVerifierCache", "Lio/github/jan/supabase/auth/CodeVerifierCache;", "getCodeVerifierCache", "()Lio/github/jan/supabase/auth/CodeVerifierCache;", "setCodeVerifierCache", "(Lio/github/jan/supabase/auth/CodeVerifierCache;)V", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineDispatcher$annotations", "getCoroutineDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "setCoroutineDispatcher", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "flowType", "Lio/github/jan/supabase/auth/FlowType;", "getFlowType", "()Lio/github/jan/supabase/auth/FlowType;", "setFlowType", "(Lio/github/jan/supabase/auth/FlowType;)V", "serializer", "Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "setSerializer", "(Lio/github/jan/supabase/SupabaseSerializer;)V", "scheme", "", "getScheme", "()Ljava/lang/String;", "setScheme", "(Ljava/lang/String;)V", "host", "getHost", "setHost", "defaultRedirectUrl", "getDefaultRedirectUrl", "setDefaultRedirectUrl", "enableLifecycleCallbacks", "getEnableLifecycleCallbacks", "setEnableLifecycleCallbacks", "urlLauncher", "Lio/github/jan/supabase/auth/UrlLauncher;", "getUrlLauncher$annotations", "getUrlLauncher", "()Lio/github/jan/supabase/auth/UrlLauncher;", "setUrlLauncher", "(Lio/github/jan/supabase/auth/UrlLauncher;)V", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class AuthConfigDefaults extends MainConfig {
    private boolean alwaysAutoRefresh;
    private boolean autoLoadFromStorage;
    private boolean autoSaveToStorage;
    private CodeVerifierCache codeVerifierCache;
    private AbstractC0281w coroutineDispatcher;
    private String defaultRedirectUrl;
    private boolean enableLifecycleCallbacks;
    private FlowType flowType;
    private String host;
    private long retryDelay;
    private String scheme;
    private SupabaseSerializer serializer;
    private SessionManager sessionManager;
    private UrlLauncher urlLauncher;

    public AuthConfigDefaults() {
        int i7 = A5.a.f239n;
        this.retryDelay = g.n(10, A5.c.f243n);
        this.alwaysAutoRefresh = true;
        this.autoLoadFromStorage = true;
        this.autoSaveToStorage = true;
        this.flowType = FlowType.IMPLICIT;
        this.enableLifecycleCallbacks = true;
        this.urlLauncher = UrlLauncher.INSTANCE.getDEFAULT();
    }

    @InterfaceC0554c
    public static /* synthetic */ void getCoroutineDispatcher$annotations() {
    }

    @SupabaseExperimental
    public static /* synthetic */ void getUrlLauncher$annotations() {
    }

    public final boolean getAlwaysAutoRefresh() {
        return this.alwaysAutoRefresh;
    }

    public final boolean getAutoLoadFromStorage() {
        return this.autoLoadFromStorage;
    }

    public final boolean getAutoSaveToStorage() {
        return this.autoSaveToStorage;
    }

    public final CodeVerifierCache getCodeVerifierCache() {
        return this.codeVerifierCache;
    }

    public final AbstractC0281w getCoroutineDispatcher() {
        return this.coroutineDispatcher;
    }

    public final String getDefaultRedirectUrl() {
        return this.defaultRedirectUrl;
    }

    public final boolean getEnableLifecycleCallbacks() {
        return this.enableLifecycleCallbacks;
    }

    public final FlowType getFlowType() {
        return this.flowType;
    }

    public final String getHost() {
        return this.host;
    }

    /* renamed from: getRetryDelay-UwyO8pc, reason: not valid java name and from getter */
    public final long getRetryDelay() {
        return this.retryDelay;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final SupabaseSerializer getSerializer() {
        return this.serializer;
    }

    public final SessionManager getSessionManager() {
        return this.sessionManager;
    }

    public final UrlLauncher getUrlLauncher() {
        return this.urlLauncher;
    }

    public final void setAlwaysAutoRefresh(boolean z7) {
        this.alwaysAutoRefresh = z7;
    }

    public final void setAutoLoadFromStorage(boolean z7) {
        this.autoLoadFromStorage = z7;
    }

    public final void setAutoSaveToStorage(boolean z7) {
        this.autoSaveToStorage = z7;
    }

    public final void setCodeVerifierCache(CodeVerifierCache codeVerifierCache) {
        this.codeVerifierCache = codeVerifierCache;
    }

    public final void setCoroutineDispatcher(AbstractC0281w abstractC0281w) {
        this.coroutineDispatcher = abstractC0281w;
    }

    public final void setDefaultRedirectUrl(String str) {
        this.defaultRedirectUrl = str;
    }

    public final void setEnableLifecycleCallbacks(boolean z7) {
        this.enableLifecycleCallbacks = z7;
    }

    public final void setFlowType(FlowType flowType) {
        l.f("<set-?>", flowType);
        this.flowType = flowType;
    }

    public final void setHost(String str) {
        this.host = str;
    }

    /* renamed from: setRetryDelay-LRDsOJo, reason: not valid java name */
    public final void m12setRetryDelayLRDsOJo(long j7) {
        this.retryDelay = j7;
    }

    public final void setScheme(String str) {
        this.scheme = str;
    }

    public final void setSerializer(SupabaseSerializer supabaseSerializer) {
        this.serializer = supabaseSerializer;
    }

    public final void setSessionManager(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    public final void setUrlLauncher(UrlLauncher urlLauncher) {
        l.f("<set-?>", urlLauncher);
        this.urlLauncher = urlLauncher;
    }
}
