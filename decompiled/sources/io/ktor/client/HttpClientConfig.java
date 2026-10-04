package io.ktor.client;

import A3.d;
import O3.C;
import O3.InterfaceC0554c;
import e4.k;
import io.ktor.client.engine.HttpClientEngineConfig;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.AttributesJvmKt;
import io.ktor.util.PlatformUtils;
import io.ktor.utils.io.KtorDsl;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@KtorDsl
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJK\u0010\u0010\u001a\u00020\u0007\"\b\b\u0001\u0010\u000b*\u00020\u0003\"\b\b\u0002\u0010\f*\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0010\u0010\u0015J\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0010\u0010\u0017J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001b\u001a\u00020\u00072\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001cR0\u0010\u001f\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u00060\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R0\u0010!\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R,\u0010\"\u001a\u001a\u0012\u0004\u0012\u00020\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u00060\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R.\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\nR\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\"\u00102\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010*\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R(\u00105\u001a\u00020(8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b5\u0010*\u0012\u0004\b8\u0010\u0005\u001a\u0004\b6\u0010,\"\u0004\b7\u0010.¨\u00069"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "T", "", "<init>", "()V", "Lkotlin/Function1;", "LO3/C;", "block", "engine", "(Le4/k;)V", "TBuilder", "TPlugin", "Lio/ktor/client/plugins/HttpClientPlugin;", "plugin", "configure", "install", "(Lio/ktor/client/plugins/HttpClientPlugin;Le4/k;)V", "", "key", "Lio/ktor/client/HttpClient;", "(Ljava/lang/String;Le4/k;)V", "client", "(Lio/ktor/client/HttpClient;)V", "clone", "()Lio/ktor/client/HttpClientConfig;", "other", "plusAssign", "(Lio/ktor/client/HttpClientConfig;)V", "", "Lio/ktor/util/AttributeKey;", "plugins", "Ljava/util/Map;", "pluginConfigurations", "customInterceptors", "engineConfig", "Le4/k;", "getEngineConfig$ktor_client_core", "()Le4/k;", "setEngineConfig$ktor_client_core", "", "followRedirects", "Z", "getFollowRedirects", "()Z", "setFollowRedirects", "(Z)V", "useDefaultTransformers", "getUseDefaultTransformers", "setUseDefaultTransformers", "expectSuccess", "getExpectSuccess", "setExpectSuccess", "developmentMode", "getDevelopmentMode", "setDevelopmentMode", "getDevelopmentMode$annotations", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpClientConfig<T extends HttpClientEngineConfig> {
    private boolean expectSuccess;
    private final Map<AttributeKey<?>, k> plugins = new LinkedHashMap();
    private final Map<AttributeKey<?>, k> pluginConfigurations = new LinkedHashMap();
    private final Map<String, k> customInterceptors = new LinkedHashMap();
    private k engineConfig = new b(1);
    private boolean followRedirects = true;
    private boolean useDefaultTransformers = true;
    private boolean developmentMode = PlatformUtils.INSTANCE.getIS_DEVELOPMENT_MODE();

    /* JADX INFO: Access modifiers changed from: private */
    public static final C engine$lambda$1(k kVar, k kVar2, HttpClientEngineConfig httpClientEngineConfig) {
        l.f("<this>", httpClientEngineConfig);
        kVar.invoke(httpClientEngineConfig);
        kVar2.invoke(httpClientEngineConfig);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C engineConfig$lambda$0(HttpClientEngineConfig httpClientEngineConfig) {
        l.f("<this>", httpClientEngineConfig);
        return C.a;
    }

    @InterfaceC0554c
    public static /* synthetic */ void getDevelopmentMode$annotations() {
    }

    public static /* synthetic */ void install$default(HttpClientConfig httpClientConfig, HttpClientPlugin httpClientPlugin, k kVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new b(0);
        }
        httpClientConfig.install(httpClientPlugin, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C install$lambda$2(Object obj) {
        l.f("<this>", obj);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C install$lambda$3(k kVar, k kVar2, Object obj) {
        l.f("<this>", obj);
        if (kVar != null) {
            kVar.invoke(obj);
        }
        kVar2.invoke(obj);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C install$lambda$5(HttpClientPlugin httpClientPlugin, HttpClient httpClient) {
        l.f("scope", httpClient);
        Attributes attributes = (Attributes) httpClient.getAttributes().computeIfAbsent(HttpClientPluginKt.getPLUGIN_INSTALLED_LIST(), new J3.a(13));
        k kVar = ((HttpClientConfig) httpClient.getConfig$ktor_client_core()).pluginConfigurations.get(httpClientPlugin.getKey());
        l.c(kVar);
        Object objPrepare = httpClientPlugin.prepare(kVar);
        httpClientPlugin.install(objPrepare, httpClient);
        attributes.put(httpClientPlugin.getKey(), objPrepare);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Attributes install$lambda$5$lambda$4() {
        return AttributesJvmKt.Attributes(true);
    }

    public final HttpClientConfig<T> clone() {
        HttpClientConfig<T> httpClientConfig = new HttpClientConfig<>();
        httpClientConfig.plusAssign(this);
        return httpClientConfig;
    }

    public final void engine(k block) {
        l.f("block", block);
        this.engineConfig = new a(this.engineConfig, block, 1);
    }

    public final boolean getDevelopmentMode() {
        return this.developmentMode;
    }

    /* renamed from: getEngineConfig$ktor_client_core, reason: from getter */
    public final k getEngineConfig() {
        return this.engineConfig;
    }

    public final boolean getExpectSuccess() {
        return this.expectSuccess;
    }

    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    public final boolean getUseDefaultTransformers() {
        return this.useDefaultTransformers;
    }

    public final <TBuilder, TPlugin> void install(HttpClientPlugin<? extends TBuilder, TPlugin> plugin, k configure) {
        l.f("plugin", plugin);
        l.f("configure", configure);
        this.pluginConfigurations.put(plugin.getKey(), new a(this.pluginConfigurations.get(plugin.getKey()), configure, 0));
        if (this.plugins.containsKey(plugin.getKey())) {
            return;
        }
        this.plugins.put(plugin.getKey(), new d(12, plugin));
    }

    public final void plusAssign(HttpClientConfig<? extends T> other) {
        l.f("other", other);
        this.followRedirects = other.followRedirects;
        this.useDefaultTransformers = other.useDefaultTransformers;
        this.expectSuccess = other.expectSuccess;
        this.plugins.putAll(other.plugins);
        this.pluginConfigurations.putAll(other.pluginConfigurations);
        this.customInterceptors.putAll(other.customInterceptors);
    }

    public final void setDevelopmentMode(boolean z7) {
        this.developmentMode = z7;
    }

    public final void setEngineConfig$ktor_client_core(k kVar) {
        l.f("<set-?>", kVar);
        this.engineConfig = kVar;
    }

    public final void setExpectSuccess(boolean z7) {
        this.expectSuccess = z7;
    }

    public final void setFollowRedirects(boolean z7) {
        this.followRedirects = z7;
    }

    public final void setUseDefaultTransformers(boolean z7) {
        this.useDefaultTransformers = z7;
    }

    public final void install(String key, k block) {
        l.f("key", key);
        l.f("block", block);
        this.customInterceptors.put(key, block);
    }

    public final void install(HttpClient client) {
        l.f("client", client);
        Iterator<T> it = this.plugins.values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).invoke(client);
        }
        Iterator<T> it2 = this.customInterceptors.values().iterator();
        while (it2.hasNext()) {
            ((k) it2.next()).invoke(client);
        }
    }
}
