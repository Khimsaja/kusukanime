package io.ktor.client.plugins.api;

import J3.a;
import e4.InterfaceC0821a;
import e4.o;
import e4.p;
import e4.q;
import io.ktor.client.HttpClient;
import io.ktor.util.AttributeKey;
import io.ktor.utils.io.KtorDsl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@KtorDsl
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B-\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0011\u001a\u00020\u000f2.\u0010\u0010\u001a*\b\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0016\u001a\u00020\u000f2(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017JG\u0010\u001c\u001a\u00020\u000f28\u0010\u0010\u001a4\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018¢\u0006\u0004\b\u001c\u0010\u001dJE\u0010 \u001a\u00020\u000f26\u0010\u0010\u001a2\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018¢\u0006\u0004\b \u0010\u001dJ\u001b\u0010\"\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0!¢\u0006\u0004\b\"\u0010#J)\u0010(\u001a\u00020\u000f\"\u0004\b\u0001\u0010$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010%2\u0006\u0010'\u001a\u00028\u0001¢\u0006\u0004\b(\u0010)R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u00102R$\u00105\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u000304038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010#¨\u0006="}, d2 = {"Lio/ktor/client/plugins/api/ClientPluginBuilder;", "", "PluginConfig", "Lio/ktor/util/AttributeKey;", "Lio/ktor/client/plugins/api/ClientPluginInstance;", "key", "Lio/ktor/client/HttpClient;", "client", "pluginConfig", "<init>", "(Lio/ktor/util/AttributeKey;Lio/ktor/client/HttpClient;Ljava/lang/Object;)V", "Lkotlin/Function4;", "Lio/ktor/client/plugins/api/OnRequestContext;", "Lio/ktor/client/request/HttpRequestBuilder;", "LS3/c;", "LO3/C;", "block", "onRequest", "(Le4/p;)V", "Lkotlin/Function3;", "Lio/ktor/client/plugins/api/OnResponseContext;", "Lio/ktor/client/statement/HttpResponse;", "onResponse", "(Le4/o;)V", "Lkotlin/Function5;", "Lio/ktor/client/plugins/api/TransformRequestBodyContext;", "Lio/ktor/util/reflect/TypeInfo;", "Lio/ktor/http/content/OutgoingContent;", "transformRequestBody", "(Le4/q;)V", "Lio/ktor/client/plugins/api/TransformResponseBodyContext;", "Lio/ktor/utils/io/ByteReadChannel;", "transformResponseBody", "Lkotlin/Function0;", "onClose", "(Le4/a;)V", "HookHandler", "Lio/ktor/client/plugins/api/ClientHook;", "hook", "handler", "on", "(Lio/ktor/client/plugins/api/ClientHook;Ljava/lang/Object;)V", "Lio/ktor/util/AttributeKey;", "getKey$ktor_client_core", "()Lio/ktor/util/AttributeKey;", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;", "Ljava/lang/Object;", "getPluginConfig", "()Ljava/lang/Object;", "", "Lio/ktor/client/plugins/api/HookHandler;", "hooks", "Ljava/util/List;", "getHooks$ktor_client_core", "()Ljava/util/List;", "Le4/a;", "getOnClose$ktor_client_core", "()Le4/a;", "setOnClose$ktor_client_core", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClientPluginBuilder<PluginConfig> {
    private final HttpClient client;
    private final List<HookHandler<?>> hooks;
    private final AttributeKey<ClientPluginInstance<PluginConfig>> key;
    private InterfaceC0821a onClose;
    private final PluginConfig pluginConfig;

    public ClientPluginBuilder(AttributeKey<ClientPluginInstance<PluginConfig>> attributeKey, HttpClient httpClient, PluginConfig pluginconfig) {
        l.f("key", attributeKey);
        l.f("client", httpClient);
        l.f("pluginConfig", pluginconfig);
        this.key = attributeKey;
        this.client = httpClient;
        this.pluginConfig = pluginconfig;
        this.hooks = new ArrayList();
        this.onClose = new a(17);
    }

    public final HttpClient getClient() {
        return this.client;
    }

    public final List<HookHandler<?>> getHooks$ktor_client_core() {
        return this.hooks;
    }

    public final AttributeKey<ClientPluginInstance<PluginConfig>> getKey$ktor_client_core() {
        return this.key;
    }

    /* renamed from: getOnClose$ktor_client_core, reason: from getter */
    public final InterfaceC0821a getOnClose() {
        return this.onClose;
    }

    public final PluginConfig getPluginConfig() {
        return this.pluginConfig;
    }

    public final <HookHandler> void on(ClientHook<HookHandler> hook, HookHandler handler) {
        l.f("hook", hook);
        this.hooks.add(new HookHandler<>(hook, handler));
    }

    public final void onClose(InterfaceC0821a block) {
        l.f("block", block);
        this.onClose = block;
    }

    public final void onRequest(p block) {
        l.f("block", block);
        on(RequestHook.INSTANCE, block);
    }

    public final void onResponse(o block) {
        l.f("block", block);
        on(ResponseHook.INSTANCE, block);
    }

    public final void setOnClose$ktor_client_core(InterfaceC0821a interfaceC0821a) {
        l.f("<set-?>", interfaceC0821a);
        this.onClose = interfaceC0821a;
    }

    public final void transformRequestBody(q block) {
        l.f("block", block);
        on(TransformRequestBodyHook.INSTANCE, block);
    }

    public final void transformResponseBody(q block) {
        l.f("block", block);
        on(TransformResponseBodyHook.INSTANCE, block);
    }
}
