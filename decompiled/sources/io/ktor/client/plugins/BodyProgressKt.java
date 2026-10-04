package io.ktor.client.plugins;

import O3.C;
import io.ktor.client.call.DelegatedCallKt;
import io.ktor.client.content.ProgressListener;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.utils.ByteChannelUtilsKt;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0006*\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\b\"\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f\"\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/client/content/ProgressListener;", "listener", "withObservableDownload", "(Lio/ktor/client/statement/HttpResponse;Lio/ktor/client/content/ProgressListener;)Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/client/request/HttpRequestBuilder;", "LO3/C;", "onDownload", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/content/ProgressListener;)V", "onUpload", "Lio/ktor/util/AttributeKey;", "UploadProgressListenerAttributeKey", "Lio/ktor/util/AttributeKey;", "DownloadProgressListenerAttributeKey", "Lio/ktor/client/plugins/api/ClientPlugin;", "BodyProgress", "Lio/ktor/client/plugins/api/ClientPlugin;", "getBodyProgress", "()Lio/ktor/client/plugins/api/ClientPlugin;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BodyProgressKt {
    private static final ClientPlugin<C> BodyProgress;
    private static final AttributeKey<ProgressListener> DownloadProgressListenerAttributeKey;
    private static final AttributeKey<ProgressListener> UploadProgressListenerAttributeKey;

    static {
        InterfaceC1444w interfaceC1444wA;
        InterfaceC1425d interfaceC1425dB = y.a.b(ProgressListener.class);
        InterfaceC1444w interfaceC1444wA2 = null;
        try {
            interfaceC1444wA = y.a(ProgressListener.class);
        } catch (Throwable unused) {
            interfaceC1444wA = null;
        }
        UploadProgressListenerAttributeKey = new AttributeKey<>("UploadProgressListenerAttributeKey", new TypeInfo(interfaceC1425dB, interfaceC1444wA));
        InterfaceC1425d interfaceC1425dB2 = y.a.b(ProgressListener.class);
        try {
            interfaceC1444wA2 = y.a(ProgressListener.class);
        } catch (Throwable unused2) {
        }
        DownloadProgressListenerAttributeKey = new AttributeKey<>("DownloadProgressListenerAttributeKey", new TypeInfo(interfaceC1425dB2, interfaceC1444wA2));
        BodyProgress = CreatePluginUtilsKt.createClientPlugin("BodyProgress", new io.ktor.client.b(7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C BodyProgress$lambda$0(ClientPluginBuilder clientPluginBuilder) {
        l.f("$this$createClientPlugin", clientPluginBuilder);
        clientPluginBuilder.on(AfterRenderHook.INSTANCE, new BodyProgressKt$BodyProgress$1$1(null));
        clientPluginBuilder.on(AfterReceiveHook.INSTANCE, new BodyProgressKt$BodyProgress$1$2(null));
        return C.a;
    }

    public static final ClientPlugin<C> getBodyProgress() {
        return BodyProgress;
    }

    public static final void onDownload(HttpRequestBuilder httpRequestBuilder, ProgressListener progressListener) {
        l.f("<this>", httpRequestBuilder);
        if (progressListener == null) {
            httpRequestBuilder.getAttributes().remove(DownloadProgressListenerAttributeKey);
        } else {
            httpRequestBuilder.getAttributes().put(DownloadProgressListenerAttributeKey, progressListener);
        }
    }

    public static final void onUpload(HttpRequestBuilder httpRequestBuilder, ProgressListener progressListener) {
        l.f("<this>", httpRequestBuilder);
        if (progressListener == null) {
            httpRequestBuilder.getAttributes().remove(UploadProgressListenerAttributeKey);
        } else {
            httpRequestBuilder.getAttributes().put(UploadProgressListenerAttributeKey, progressListener);
        }
    }

    public static final HttpResponse withObservableDownload(HttpResponse httpResponse, ProgressListener progressListener) {
        l.f("<this>", httpResponse);
        l.f("listener", progressListener);
        return DelegatedCallKt.replaceResponse$default(httpResponse.getCall(), null, new a(1, ByteChannelUtilsKt.observable(httpResponse.getRawContent(), httpResponse.getCoroutineContext(), HttpMessagePropertiesKt.contentLength(httpResponse), progressListener)), 1, null).getResponse();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteReadChannel withObservableDownload$lambda$1(ByteReadChannel byteReadChannel, HttpResponse httpResponse) {
        l.f("$this$replaceResponse", httpResponse);
        return byteReadChannel;
    }
}
