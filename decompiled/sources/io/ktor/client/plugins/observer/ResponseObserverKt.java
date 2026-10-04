package io.ktor.client.plugins.observer;

import O3.C;
import e4.InterfaceC0821a;
import e4.n;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a=\u0010\b\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00002&\u0010\u0007\u001a\"\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001j\u0002`\u0006¢\u0006\u0004\b\b\u0010\t\"#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\u0012\n\u0004\b\b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e*B\u0010\u0011\"\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00012\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¨\u0006\u0012"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "LS3/c;", "LO3/C;", "", "Lio/ktor/client/plugins/observer/ResponseHandler;", "block", "ResponseObserver", "(Lio/ktor/client/HttpClientConfig;Le4/n;)V", "Lio/ktor/client/plugins/api/ClientPlugin;", "Lio/ktor/client/plugins/observer/ResponseObserverConfig;", "Lio/ktor/client/plugins/api/ClientPlugin;", "getResponseObserver", "()Lio/ktor/client/plugins/api/ClientPlugin;", "getResponseObserver$annotations", "()V", "ResponseHandler", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ResponseObserverKt {
    private static final ClientPlugin<ResponseObserverConfig> ResponseObserver = CreatePluginUtilsKt.createClientPlugin("ResponseObserver", AnonymousClass1.INSTANCE, new io.ktor.client.b(23));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends j implements InterfaceC0821a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0, ResponseObserverConfig.class, "<init>", "<init>()V", 0);
        }

        @Override // e4.InterfaceC0821a
        public final ResponseObserverConfig invoke() {
            return new ResponseObserverConfig();
        }
    }

    public static final void ResponseObserver(HttpClientConfig<?> httpClientConfig, n nVar) {
        l.f("<this>", httpClientConfig);
        l.f("block", nVar);
        httpClientConfig.install(ResponseObserver, new a(nVar, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C ResponseObserver$lambda$0(ClientPluginBuilder clientPluginBuilder) {
        l.f("$this$createClientPlugin", clientPluginBuilder);
        n responseHandler$ktor_client_core = ((ResponseObserverConfig) clientPluginBuilder.getPluginConfig()).getResponseHandler();
        clientPluginBuilder.on(AfterReceiveHook.INSTANCE, new ResponseObserverKt$ResponseObserver$2$1(((ResponseObserverConfig) clientPluginBuilder.getPluginConfig()).getFilter(), clientPluginBuilder, responseHandler$ktor_client_core, null));
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C ResponseObserver$lambda$1(n nVar, ResponseObserverConfig responseObserverConfig) {
        l.f("$this$install", responseObserverConfig);
        responseObserverConfig.setResponseHandler$ktor_client_core(nVar);
        return C.a;
    }

    public static final ClientPlugin<ResponseObserverConfig> getResponseObserver() {
        return ResponseObserver;
    }

    public static /* synthetic */ void getResponseObserver$annotations() {
    }
}
