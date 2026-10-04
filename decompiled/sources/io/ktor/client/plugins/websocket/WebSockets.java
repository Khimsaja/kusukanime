package io.ktor.client.plugins.websocket;

import P3.q;
import P3.v;
import e4.k;
import io.github.jan.supabase.auth.SettingsSessionManager;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.request.UtilsKt;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.http.HttpHeaders;
import io.ktor.serialization.WebsocketContentConverter;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.KtorDsl;
import io.ktor.websocket.DefaultWebSocketSession;
import io.ktor.websocket.DefaultWebSocketSessionKt;
import io.ktor.websocket.WebSocketExtension;
import io.ktor.websocket.WebSocketExtensionHeader;
import io.ktor.websocket.WebSocketExtensionHeaderKt;
import io.ktor.websocket.WebSocketExtensionsConfig;
import io.ktor.websocket.WebSocketSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 *2\u00020\u0001:\u0002+*B-\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u000bB\t\b\u0016¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b%\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lio/ktor/client/plugins/websocket/WebSockets;", "", "", "pingIntervalMillis", "maxFrameSize", "Lio/ktor/websocket/WebSocketExtensionsConfig;", "extensionsConfig", "Lio/ktor/serialization/WebsocketContentConverter;", "contentConverter", "<init>", "(JJLio/ktor/websocket/WebSocketExtensionsConfig;Lio/ktor/serialization/WebsocketContentConverter;)V", "(JJ)V", "()V", "Lio/ktor/client/request/HttpRequestBuilder;", "context", "LO3/C;", "installExtensions", "(Lio/ktor/client/request/HttpRequestBuilder;)V", "Lio/ktor/client/call/HttpClientCall;", "call", "", "Lio/ktor/websocket/WebSocketExtension;", "completeNegotiation", "(Lio/ktor/client/call/HttpClientCall;)Ljava/util/List;", "Lio/ktor/websocket/WebSocketExtensionHeader;", "protocols", "addNegotiatedProtocols", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/util/List;)V", "Lio/ktor/websocket/WebSocketSession;", SettingsSessionManager.SETTINGS_KEY, "Lio/ktor/websocket/DefaultWebSocketSession;", "convertSessionToDefault$ktor_client_core", "(Lio/ktor/websocket/WebSocketSession;)Lio/ktor/websocket/DefaultWebSocketSession;", "convertSessionToDefault", "J", "getPingIntervalMillis", "()J", "getMaxFrameSize", "Lio/ktor/websocket/WebSocketExtensionsConfig;", "Lio/ktor/serialization/WebsocketContentConverter;", "getContentConverter", "()Lio/ktor/serialization/WebsocketContentConverter;", "Plugin", "Config", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WebSockets {

    /* renamed from: Plugin, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0 == true ? 1 : 0);
    private static final AttributeKey<WebSockets> key;
    private final WebsocketContentConverter contentConverter;
    private final WebSocketExtensionsConfig extensionsConfig;
    private final long maxFrameSize;
    private final long pingIntervalMillis;

    @KtorDsl
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lio/ktor/client/plugins/websocket/WebSockets$Config;", "", "<init>", "()V", "Lkotlin/Function1;", "Lio/ktor/websocket/WebSocketExtensionsConfig;", "LO3/C;", "block", "extensions", "(Le4/k;)V", "extensionsConfig", "Lio/ktor/websocket/WebSocketExtensionsConfig;", "getExtensionsConfig$ktor_client_core", "()Lio/ktor/websocket/WebSocketExtensionsConfig;", "", "pingIntervalMillis", "J", "getPingIntervalMillis", "()J", "setPingIntervalMillis", "(J)V", "maxFrameSize", "getMaxFrameSize", "setMaxFrameSize", "Lio/ktor/serialization/WebsocketContentConverter;", "contentConverter", "Lio/ktor/serialization/WebsocketContentConverter;", "getContentConverter", "()Lio/ktor/serialization/WebsocketContentConverter;", "setContentConverter", "(Lio/ktor/serialization/WebsocketContentConverter;)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Config {
        private WebsocketContentConverter contentConverter;
        private final WebSocketExtensionsConfig extensionsConfig = new WebSocketExtensionsConfig();
        private long maxFrameSize = 2147483647L;
        private long pingIntervalMillis;

        public final void extensions(k block) {
            l.f("block", block);
            block.invoke(this.extensionsConfig);
        }

        public final WebsocketContentConverter getContentConverter() {
            return this.contentConverter;
        }

        /* renamed from: getExtensionsConfig$ktor_client_core, reason: from getter */
        public final WebSocketExtensionsConfig getExtensionsConfig() {
            return this.extensionsConfig;
        }

        public final long getMaxFrameSize() {
            return this.maxFrameSize;
        }

        public final long getPingIntervalMillis() {
            return this.pingIntervalMillis;
        }

        public final void setContentConverter(WebsocketContentConverter websocketContentConverter) {
            this.contentConverter = websocketContentConverter;
        }

        public final void setMaxFrameSize(long j7) {
            this.maxFrameSize = j7;
        }

        public final void setPingIntervalMillis(long j7) {
            this.pingIntervalMillis = j7;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/client/plugins/websocket/WebSockets$Plugin;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/websocket/WebSockets$Config;", "Lio/ktor/client/plugins/websocket/WebSockets;", "<init>", "()V", "Lkotlin/Function1;", "LO3/C;", "block", "prepare", "(Le4/k;)Lio/ktor/client/plugins/websocket/WebSockets;", "plugin", "Lio/ktor/client/HttpClient;", "scope", "install", "(Lio/ktor/client/plugins/websocket/WebSockets;Lio/ktor/client/HttpClient;)V", "Lio/ktor/util/AttributeKey;", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.websocket.WebSockets$Plugin, reason: from kotlin metadata */
    public static final class Companion implements HttpClientPlugin<Config, WebSockets> {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey<WebSockets> getKey() {
            return WebSockets.key;
        }

        private Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(WebSockets plugin, HttpClient scope) {
            l.f("plugin", plugin);
            l.f("scope", scope);
            boolean zContains = scope.getEngine().getSupportedCapabilities().contains(WebSocketExtensionsCapability.INSTANCE);
            scope.getRequestPipeline().intercept(HttpRequestPipeline.INSTANCE.getRender(), new WebSockets$Plugin$install$1(zContains, plugin, null));
            scope.getResponsePipeline().intercept(HttpResponsePipeline.INSTANCE.getTransform(), new WebSockets$Plugin$install$2(plugin, zContains, null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public WebSockets prepare(k block) {
            l.f("block", block);
            Config config = new Config();
            block.invoke(config);
            return new WebSockets(config.getPingIntervalMillis(), config.getMaxFrameSize(), config.getExtensionsConfig(), config.getContentConverter());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        InterfaceC1444w interfaceC1444wA = null;
        InterfaceC1425d interfaceC1425dB = y.a.b(WebSockets.class);
        try {
            interfaceC1444wA = y.a(WebSockets.class);
        } catch (Throwable unused) {
        }
        key = new AttributeKey<>("Websocket", new TypeInfo(interfaceC1425dB, interfaceC1444wA));
    }

    public WebSockets(long j7, long j8, WebSocketExtensionsConfig webSocketExtensionsConfig, WebsocketContentConverter websocketContentConverter) {
        l.f("extensionsConfig", webSocketExtensionsConfig);
        this.pingIntervalMillis = j7;
        this.maxFrameSize = j8;
        this.extensionsConfig = webSocketExtensionsConfig;
        this.contentConverter = websocketContentConverter;
    }

    private final void addNegotiatedProtocols(HttpRequestBuilder context, List<WebSocketExtensionHeader> protocols) throws IOException {
        if (protocols.isEmpty()) {
            return;
        }
        UtilsKt.header(context, HttpHeaders.INSTANCE.getSecWebSocketExtensions(), q.y0(protocols, ",", null, null, null, 62));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<WebSocketExtension<?>> completeNegotiation(HttpClientCall call) {
        List<WebSocketExtensionHeader> webSocketExtensions;
        String str = call.getResponse().getHeaders().get(HttpHeaders.INSTANCE.getSecWebSocketExtensions());
        if (str == null || (webSocketExtensions = WebSocketExtensionHeaderKt.parseWebSocketExtensions(str)) == null) {
            webSocketExtensions = P3.y.f7779k;
        }
        List list = (List) call.getAttributes().get(WebSocketsKt.REQUEST_EXTENSIONS_KEY);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((WebSocketExtension) obj).clientNegotiation(webSocketExtensions)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void installExtensions(HttpRequestBuilder context) throws IOException {
        List<WebSocketExtension<?>> listBuild = this.extensionsConfig.build();
        context.getAttributes().put(WebSocketsKt.REQUEST_EXTENSIONS_KEY, listBuild);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listBuild.iterator();
        while (it.hasNext()) {
            v.e0(arrayList, ((WebSocketExtension) it.next()).getProtocols());
        }
        addNegotiatedProtocols(context, arrayList);
    }

    public final DefaultWebSocketSession convertSessionToDefault$ktor_client_core(WebSocketSession session) {
        l.f(SettingsSessionManager.SETTINGS_KEY, session);
        if (session instanceof DefaultWebSocketSession) {
            return (DefaultWebSocketSession) session;
        }
        long j7 = this.pingIntervalMillis;
        DefaultWebSocketSession DefaultWebSocketSession = DefaultWebSocketSessionKt.DefaultWebSocketSession(session, j7, 2 * j7);
        DefaultWebSocketSession.setMaxFrameSize(this.maxFrameSize);
        return DefaultWebSocketSession;
    }

    public final WebsocketContentConverter getContentConverter() {
        return this.contentConverter;
    }

    public final long getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final long getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    public /* synthetic */ WebSockets(long j7, long j8, WebSocketExtensionsConfig webSocketExtensionsConfig, WebsocketContentConverter websocketContentConverter, int i7, f fVar) {
        this(j7, j8, webSocketExtensionsConfig, (i7 & 8) != 0 ? null : websocketContentConverter);
    }

    public /* synthetic */ WebSockets(long j7, long j8, int i7, f fVar) {
        this((i7 & 1) != 0 ? 0L : j7, (i7 & 2) != 0 ? 2147483647L : j8);
    }

    public WebSockets(long j7, long j8) {
        this(j7, j8, new WebSocketExtensionsConfig(), null, 8, null);
    }

    public WebSockets() {
        this(0L, 2147483647L, new WebSocketExtensionsConfig(), null, 8, null);
    }
}
