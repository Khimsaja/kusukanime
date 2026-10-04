package io.github.jan.supabase;

import A3.e;
import A5.a;
import A5.c;
import A5.g;
import H5.AbstractC0281w;
import I5.d;
import O3.C;
import P3.q;
import a6.h;
import e4.k;
import io.github.jan.supabase.annotations.SupabaseDsl;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.github.jan.supabase.logging.LogLevel;
import io.github.jan.supabase.plugins.SupabasePlugin;
import io.github.jan.supabase.plugins.SupabasePluginProvider;
import io.github.jan.supabase.serializer.KotlinXSerializer;
import io.ktor.client.engine.HttpClientEngine;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010J\u001a\u00020GH\u0001J*\u0010K\u001a\u00020B2 \u0010L\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030A\u0012\u0004\u0012\u00020B01¢\u0006\u0002\bM¢\u0006\u0002\bCH\u0007Ja\u0010N\u001a\u00020B\"\u0004\b\u0000\u0010O\"\u000e\b\u0001\u0010P*\b\u0012\u0004\u0012\u0002HO0H\"\u0014\b\u0002\u0010Q*\u000e\u0012\u0004\u0012\u0002HO\u0012\u0004\u0012\u0002HP0R2\u0006\u0010S\u001a\u0002HQ2\u001e\b\u0002\u0010T\u001a\u0018\u0012\u0004\u0012\u0002HO\u0012\u0004\u0012\u00020B01¢\u0006\u0002\bM¢\u0006\u0002\bCH\u0007¢\u0006\u0002\u0010UR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001c\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R<\u00100\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000302\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u000101j\u0004\u0018\u0001`3X\u0086\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u00109\u001a\u0004\u0018\u00010:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R-\u0010?\u001a!\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030A\u0012\u0004\u0012\u00020B01j\u0002`D¢\u0006\u0002\bC0@X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010E\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020G\u0012\b\u0012\u0006\u0012\u0002\b\u00030H01j\u0002`I0FX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Lio/github/jan/supabase/SupabaseClientBuilder;", "", "supabaseUrl", "", "supabaseKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "useHTTPS", "", "getUseHTTPS", "()Z", "setUseHTTPS", "(Z)V", "httpEngine", "Lio/ktor/client/engine/HttpClientEngine;", "getHttpEngine", "()Lio/ktor/client/engine/HttpClientEngine;", "setHttpEngine", "(Lio/ktor/client/engine/HttpClientEngine;)V", "ignoreModulesInUrl", "getIgnoreModulesInUrl", "setIgnoreModulesInUrl", "requestTimeout", "Lkotlin/time/Duration;", "getRequestTimeout-UwyO8pc", "()J", "setRequestTimeout-LRDsOJo", "(J)V", "J", "value", "Lio/github/jan/supabase/logging/LogLevel;", "defaultLogLevel", "getDefaultLogLevel", "()Lio/github/jan/supabase/logging/LogLevel;", "setDefaultLogLevel", "(Lio/github/jan/supabase/logging/LogLevel;)V", "defaultSerializer", "Lio/github/jan/supabase/SupabaseSerializer;", "getDefaultSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "setDefaultSerializer", "(Lio/github/jan/supabase/SupabaseSerializer;)V", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "setCoroutineDispatcher", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "accessToken", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lio/github/jan/supabase/AccessTokenProvider;", "getAccessToken", "()Lkotlin/jvm/functions/Function1;", "setAccessToken", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "osInformation", "Lio/github/jan/supabase/OSInformation;", "getOsInformation", "()Lio/github/jan/supabase/OSInformation;", "setOsInformation", "(Lio/github/jan/supabase/OSInformation;)V", "httpConfigOverrides", "", "Lio/ktor/client/HttpClientConfig;", "", "Lkotlin/ExtensionFunctionType;", "Lio/github/jan/supabase/HttpConfigOverride;", "plugins", "", "Lio/github/jan/supabase/SupabaseClient;", "Lio/github/jan/supabase/plugins/SupabasePlugin;", "Lio/github/jan/supabase/PluginProvider;", "build", "httpConfig", "block", "Lio/github/jan/supabase/annotations/SupabaseDsl;", "install", "Config", "PluginInstance", "Provider", "Lio/github/jan/supabase/plugins/SupabasePluginProvider;", "plugin", "init", "(Lio/github/jan/supabase/plugins/SupabasePluginProvider;Lkotlin/jvm/functions/Function1;)V", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SupabaseDsl
/* loaded from: classes.dex */
public final class SupabaseClientBuilder {
    private k accessToken;
    private AbstractC0281w coroutineDispatcher;
    private SupabaseSerializer defaultSerializer;
    private final List<k> httpConfigOverrides;
    private HttpClientEngine httpEngine;
    private boolean ignoreModulesInUrl;
    private OSInformation osInformation;
    private final Map<String, k> plugins;
    private long requestTimeout;
    private final String supabaseKey;
    private final String supabaseUrl;
    private boolean useHTTPS;

    public SupabaseClientBuilder(String str, String str2) {
        l.f("supabaseUrl", str);
        l.f("supabaseKey", str2);
        this.supabaseUrl = str;
        this.supabaseKey = str2;
        this.useHTTPS = true;
        int i7 = a.f239n;
        this.requestTimeout = g.n(10, c.f243n);
        this.defaultSerializer = new KotlinXSerializer(q0.c.c(new e(21)));
        this.coroutineDispatcher = DefaultDispatcherKt.getDefaultDispatcher();
        this.osInformation = OSInformation.INSTANCE.getCURRENT();
        this.httpConfigOverrides = new ArrayList();
        this.plugins = new LinkedHashMap();
        String str3 = "realtime/v1";
        if (!AbstractC2510o.W(str, "realtime/v1", false)) {
            str3 = "auth/v1";
            if (!AbstractC2510o.W(str, "auth/v1", false)) {
                str3 = "storage/v1";
                if (!AbstractC2510o.W(str, "storage/v1", false)) {
                    str3 = "rest/v1";
                    if (!AbstractC2510o.W(str, "rest/v1", false)) {
                        str3 = null;
                    }
                }
            }
        }
        if (this.ignoreModulesInUrl || str3 == null) {
            if (AbstractC2517v.T(str, "http://", false)) {
                this.useHTTPS = false;
            }
        } else {
            throw new IllegalStateException(("The Supabase URL should not contain (" + str3 + "), supabase-kt handles the url endpoints. If you want to use a custom url for a module, specify it within their builder but that's not necessary for normal Supabase projects").toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C defaultSerializer$lambda$0(h hVar) {
        l.f("$this$Json", hVar);
        hVar.f10466c = true;
        return C.a;
    }

    public static /* synthetic */ void install$default(SupabaseClientBuilder supabaseClientBuilder, SupabasePluginProvider supabasePluginProvider, k kVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new e(22);
        }
        supabaseClientBuilder.install(supabasePluginProvider, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C install$lambda$0(Object obj) {
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupabasePlugin install$lambda$1(SupabasePluginProvider supabasePluginProvider, Object obj, SupabaseClient supabaseClient) {
        l.f("it", supabaseClient);
        return supabasePluginProvider.create(supabaseClient, obj);
    }

    public final SupabaseClient build() {
        return new SupabaseClientImpl(new SupabaseClientConfig((String) q.A0(AbstractC2510o.u0(this.supabaseUrl, new String[]{"//"}, 0, 6)), this.supabaseKey, getDefaultLogLevel(), new SupabaseNetworkConfig(this.useHTTPS, this.httpEngine, this.httpConfigOverrides, this.requestTimeout, null), this.defaultSerializer, this.coroutineDispatcher, this.accessToken, this.plugins, this.osInformation));
    }

    public final k getAccessToken() {
        return this.accessToken;
    }

    public final AbstractC0281w getCoroutineDispatcher() {
        return this.coroutineDispatcher;
    }

    public final LogLevel getDefaultLogLevel() {
        return SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
    }

    public final SupabaseSerializer getDefaultSerializer() {
        return this.defaultSerializer;
    }

    public final HttpClientEngine getHttpEngine() {
        return this.httpEngine;
    }

    public final boolean getIgnoreModulesInUrl() {
        return this.ignoreModulesInUrl;
    }

    public final OSInformation getOsInformation() {
        return this.osInformation;
    }

    /* renamed from: getRequestTimeout-UwyO8pc, reason: not valid java name and from getter */
    public final long getRequestTimeout() {
        return this.requestTimeout;
    }

    public final boolean getUseHTTPS() {
        return this.useHTTPS;
    }

    @SupabaseDsl
    @SupabaseInternal
    public final void httpConfig(k kVar) {
        l.f("block", kVar);
        this.httpConfigOverrides.add(kVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SupabaseDsl
    public final <Config, PluginInstance extends SupabasePlugin<Config>, Provider extends SupabasePluginProvider<Config, PluginInstance>> void install(Provider provider, k kVar) {
        l.f("plugin", provider);
        l.f("init", kVar);
        Object objCreateConfig = provider.createConfig(kVar);
        provider.setup(this, objCreateConfig);
        this.plugins.put(provider.getKey(), new d(3, provider, objCreateConfig));
    }

    public final void setAccessToken(k kVar) {
        this.accessToken = kVar;
    }

    public final void setCoroutineDispatcher(AbstractC0281w abstractC0281w) {
        l.f("<set-?>", abstractC0281w);
        this.coroutineDispatcher = abstractC0281w;
    }

    public final void setDefaultLogLevel(LogLevel logLevel) {
        l.f("value", logLevel);
        SupabaseClient.INSTANCE.setDEFAULT_LOG_LEVEL$supabase_kt_release(logLevel);
    }

    public final void setDefaultSerializer(SupabaseSerializer supabaseSerializer) {
        l.f("<set-?>", supabaseSerializer);
        this.defaultSerializer = supabaseSerializer;
    }

    public final void setHttpEngine(HttpClientEngine httpClientEngine) {
        this.httpEngine = httpClientEngine;
    }

    public final void setIgnoreModulesInUrl(boolean z7) {
        this.ignoreModulesInUrl = z7;
    }

    public final void setOsInformation(OSInformation oSInformation) {
        this.osInformation = oSInformation;
    }

    /* renamed from: setRequestTimeout-LRDsOJo, reason: not valid java name */
    public final void m6setRequestTimeoutLRDsOJo(long j7) {
        this.requestTimeout = j7;
    }

    public final void setUseHTTPS(boolean z7) {
        this.useHTTPS = z7;
    }
}
