package io.ktor.client.plugins;

import H5.D;
import H5.InterfaceC0265f0;
import H5.N;
import H5.h0;
import H5.n0;
import H5.r;
import O3.C;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LH5/r;", "requestJob", "LH5/f0;", "clientEngineJob", "LO3/C;", "attachToClientEngineJob", "(LH5/r;LH5/f0;)V", "Lz6/b;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lz6/b;", "Lio/ktor/client/plugins/api/ClientPlugin;", "HttpRequestLifecycle", "Lio/ktor/client/plugins/api/ClientPlugin;", "getHttpRequestLifecycle", "()Lio/ktor/client/plugins/api/ClientPlugin;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpRequestLifecycleKt {
    private static final z6.b LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpRequestLifecycle");
    private static final ClientPlugin<C> HttpRequestLifecycle = CreatePluginUtilsKt.createClientPlugin("RequestLifecycle", new io.ktor.client.b(15));

    /* JADX INFO: Access modifiers changed from: private */
    public static final C HttpRequestLifecycle$lambda$0(ClientPluginBuilder clientPluginBuilder) {
        l.f("$this$createClientPlugin", clientPluginBuilder);
        clientPluginBuilder.on(SetupRequestContext.INSTANCE, new HttpRequestLifecycleKt$HttpRequestLifecycle$1$1(clientPluginBuilder, null));
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void attachToClientEngineJob(r rVar, InterfaceC0265f0 interfaceC0265f0) {
        N nX = interfaceC0265f0.x(new a(4, rVar));
        ((n0) rVar).x(new a(5, nX));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C attachToClientEngineJob$lambda$1(r rVar, Throwable th) {
        if (th != null) {
            LOGGER.e("Cancelling request because engine Job failed with error: " + th);
            D.i(rVar, "Engine failed", th);
        } else {
            LOGGER.e("Cancelling request because engine Job completed");
            ((h0) rVar).Z();
        }
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C attachToClientEngineJob$lambda$2(N n7, Throwable th) {
        n7.dispose();
        return C.a;
    }

    public static final ClientPlugin<C> getHttpRequestLifecycle() {
        return HttpRequestLifecycle;
    }
}
