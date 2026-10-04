package io.ktor.client.plugins;

import O3.C;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0004\u0010\u0003\"\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "LO3/C;", "BrowserUserAgent", "(Lio/ktor/client/HttpClientConfig;)V", "CurlUserAgent", "Lz6/b;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lz6/b;", "Lio/ktor/client/plugins/api/ClientPlugin;", "Lio/ktor/client/plugins/UserAgentConfig;", "UserAgent", "Lio/ktor/client/plugins/api/ClientPlugin;", "getUserAgent", "()Lio/ktor/client/plugins/api/ClientPlugin;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserAgentKt {
    private static final z6.b LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.UserAgent");
    private static final ClientPlugin<UserAgentConfig> UserAgent = CreatePluginUtilsKt.createClientPlugin("UserAgent", UserAgentKt$UserAgent$2.INSTANCE, new io.ktor.client.b(19));

    public static final void BrowserUserAgent(HttpClientConfig<?> httpClientConfig) {
        l.f("<this>", httpClientConfig);
        httpClientConfig.install(UserAgent, new io.ktor.client.b(20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C BrowserUserAgent$lambda$2(UserAgentConfig userAgentConfig) {
        l.f("$this$install", userAgentConfig);
        userAgentConfig.setAgent("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/70.0.3538.77 Chrome/70.0.3538.77 Safari/537.36");
        return C.a;
    }

    public static final void CurlUserAgent(HttpClientConfig<?> httpClientConfig) {
        l.f("<this>", httpClientConfig);
        httpClientConfig.install(UserAgent, new io.ktor.client.b(18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C CurlUserAgent$lambda$3(UserAgentConfig userAgentConfig) {
        l.f("$this$install", userAgentConfig);
        userAgentConfig.setAgent("curl/7.61.0");
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C UserAgent$lambda$1(ClientPluginBuilder clientPluginBuilder) {
        l.f("$this$createClientPlugin", clientPluginBuilder);
        clientPluginBuilder.onRequest(new UserAgentKt$UserAgent$3$1(((UserAgentConfig) clientPluginBuilder.getPluginConfig()).getAgent(), null));
        return C.a;
    }

    public static final ClientPlugin<UserAgentConfig> getUserAgent() {
        return UserAgent;
    }
}
