package io.ktor.client.plugins;

import O3.C;
import O3.InterfaceC0554c;
import O3.i;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.AttributeKey;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import io.ktor.util.reflect.TypeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0003\"\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007\"\u001f\u0010\u000f\u001a\u00060\tj\u0002`\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00108\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\"&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u0012\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0019\u0010\u0014\"\u0015\u0010\u001d\u001a\u00020\u001c*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "LO3/C;", "skipSaveBody", "(Lio/ktor/client/request/HttpRequestBuilder;)V", "skipSavingBody", "Lio/ktor/util/AttributeKey;", "SKIP_SAVE_BODY", "Lio/ktor/util/AttributeKey;", "RESPONSE_BODY_SAVED", "Lz6/b;", "Lio/ktor/util/logging/Logger;", "LOGGER$delegate", "LO3/i;", "getLOGGER", "()Lz6/b;", "LOGGER", "Lio/ktor/client/plugins/api/ClientPlugin;", "SaveBody", "Lio/ktor/client/plugins/api/ClientPlugin;", "getSaveBody", "()Lio/ktor/client/plugins/api/ClientPlugin;", "getSaveBody$annotations", "()V", "Lio/ktor/client/plugins/SaveBodyPluginConfig;", "SaveBodyPlugin", "getSaveBodyPlugin", "getSaveBodyPlugin$annotations", "Lio/ktor/client/statement/HttpResponse;", "", "isSaved", "(Lio/ktor/client/statement/HttpResponse;)Z", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DoubleReceivePluginKt {
    private static final i LOGGER$delegate;
    private static final AttributeKey<C> RESPONSE_BODY_SAVED;
    private static final AttributeKey<C> SKIP_SAVE_BODY;
    private static final ClientPlugin<C> SaveBody;
    private static final ClientPlugin<SaveBodyPluginConfig> SaveBodyPlugin;

    static {
        InterfaceC1444w interfaceC1444wA;
        InterfaceC1425d interfaceC1425dB = y.a.b(C.class);
        InterfaceC1444w interfaceC1444wA2 = null;
        try {
            interfaceC1444wA = y.a(C.class);
        } catch (Throwable unused) {
            interfaceC1444wA = null;
        }
        SKIP_SAVE_BODY = new AttributeKey<>("SkipSaveBody", new TypeInfo(interfaceC1425dB, interfaceC1444wA));
        InterfaceC1425d interfaceC1425dB2 = y.a.b(C.class);
        try {
            interfaceC1444wA2 = y.a(C.class);
        } catch (Throwable unused2) {
        }
        RESPONSE_BODY_SAVED = new AttributeKey<>("ResponseBodySaved", new TypeInfo(interfaceC1425dB2, interfaceC1444wA2));
        LOGGER$delegate = z1.c.C(new J3.a(16));
        SaveBody = CreatePluginUtilsKt.createClientPlugin("SaveBody", new io.ktor.client.b(9));
        SaveBodyPlugin = CreatePluginUtilsKt.createClientPlugin("DoubleReceivePlugin", DoubleReceivePluginKt$SaveBodyPlugin$1.INSTANCE, new io.ktor.client.b(10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z6.b LOGGER_delegate$lambda$0() {
        return KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.SaveBody");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C SaveBody$lambda$1(ClientPluginBuilder clientPluginBuilder) {
        l.f("$this$createClientPlugin", clientPluginBuilder);
        clientPluginBuilder.getClient().getReceivePipeline().intercept(HttpReceivePipeline.INSTANCE.getBefore(), new DoubleReceivePluginKt$SaveBody$1$1(null));
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C SaveBodyPlugin$lambda$2(ClientPluginBuilder clientPluginBuilder) {
        l.f("$this$createClientPlugin", clientPluginBuilder);
        if (((SaveBodyPluginConfig) clientPluginBuilder.getPluginConfig()).getDisabled()) {
            getLOGGER().d(Messages.SAVE_BODY_DISABLED_MESSAGE);
        } else {
            getLOGGER().d(Messages.SAVE_BODY_ENABLED_MESSAGE);
        }
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z6.b getLOGGER() {
        return (z6.b) LOGGER$delegate.getValue();
    }

    public static final ClientPlugin<C> getSaveBody() {
        return SaveBody;
    }

    public static /* synthetic */ void getSaveBody$annotations() {
    }

    public static final ClientPlugin<SaveBodyPluginConfig> getSaveBodyPlugin() {
        return SaveBodyPlugin;
    }

    @InterfaceC0554c
    public static /* synthetic */ void getSaveBodyPlugin$annotations() {
    }

    public static final boolean isSaved(HttpResponse httpResponse) {
        l.f("<this>", httpResponse);
        return httpResponse.getCall().getAttributes().contains(RESPONSE_BODY_SAVED);
    }

    public static final void skipSaveBody(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        httpRequestBuilder.getAttributes().put(SKIP_SAVE_BODY, C.a);
    }

    @InterfaceC0554c
    public static final void skipSavingBody(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        getLOGGER().d(Messages.SKIP_SAVING_BODY_MESSAGE);
    }
}
