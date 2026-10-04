package io.ktor.client.plugins;

import H5.InterfaceC0265f0;
import H5.h0;
import H5.r;
import O3.C;
import e4.k;
import e4.n;
import e4.o;
import f.AbstractC0847h;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.utils.ExceptionUtilsJvmKt;
import io.ktor.events.EventDefinition;
import io.ktor.util.AttributeKey;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l4.C1447z;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0014\u0010\f\u001a\u00020\b*\u00020\u000bH\u0082@¢\u0006\u0004\b\f\u0010\r\"\u0018\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0006¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\"\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\"2\u0010&\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0#0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"\"2\u0010'\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0#0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\"\",\u0010*\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030(0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\"\",\u0010-\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020,0(0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\"¨\u0006."}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/HttpRequestRetryConfig;", "LO3/C;", "block", "retry", "(Lio/ktor/client/request/HttpRequestBuilder;Le4/k;)V", "", "", "isTimeoutException", "(Ljava/lang/Throwable;)Z", "Lio/ktor/client/statement/HttpResponse;", "throwOnInvalidResponseBody", "(Lio/ktor/client/statement/HttpResponse;LS3/c;)Ljava/lang/Object;", "Lz6/b;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lz6/b;", "Lio/ktor/events/EventDefinition;", "Lio/ktor/client/plugins/HttpRetryEventData;", "HttpRequestRetryEvent", "Lio/ktor/events/EventDefinition;", "getHttpRequestRetryEvent", "()Lio/ktor/events/EventDefinition;", "Lio/ktor/client/plugins/api/ClientPlugin;", "HttpRequestRetry", "Lio/ktor/client/plugins/api/ClientPlugin;", "getHttpRequestRetry", "()Lio/ktor/client/plugins/api/ClientPlugin;", "getHttpRequestRetry$annotations", "()V", "Lio/ktor/util/AttributeKey;", "", "MaxRetriesPerRequestAttributeKey", "Lio/ktor/util/AttributeKey;", "Lkotlin/Function3;", "Lio/ktor/client/plugins/HttpRetryShouldRetryContext;", "Lio/ktor/client/request/HttpRequest;", "ShouldRetryPerRequestAttributeKey", "ShouldRetryOnExceptionPerRequestAttributeKey", "Lkotlin/Function2;", "Lio/ktor/client/plugins/HttpRetryModifyRequestContext;", "ModifyRequestPerRequestAttributeKey", "Lio/ktor/client/plugins/HttpRetryDelayContext;", "", "RetryDelayPerRequestAttributeKey", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpRequestRetryKt {
    private static final ClientPlugin<HttpRequestRetryConfig> HttpRequestRetry;
    private static final EventDefinition<HttpRetryEventData> HttpRequestRetryEvent;
    private static final z6.b LOGGER;
    private static final AttributeKey<Integer> MaxRetriesPerRequestAttributeKey;
    private static final AttributeKey<n> ModifyRequestPerRequestAttributeKey;
    private static final AttributeKey<n> RetryDelayPerRequestAttributeKey;
    private static final AttributeKey<o> ShouldRetryOnExceptionPerRequestAttributeKey;
    private static final AttributeKey<o> ShouldRetryPerRequestAttributeKey;

    static {
        InterfaceC1444w interfaceC1444wA;
        InterfaceC1444w interfaceC1444wC;
        InterfaceC1444w interfaceC1444wC2;
        InterfaceC1444w interfaceC1444wC3;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpRequestRetry");
        HttpRequestRetryEvent = new EventDefinition<>();
        HttpRequestRetry = CreatePluginUtilsKt.createClientPlugin("RetryFeature", HttpRequestRetryKt$HttpRequestRetry$1.INSTANCE, new io.ktor.client.b(16));
        InterfaceC1425d interfaceC1425dB = y.a.b(Integer.class);
        InterfaceC1444w interfaceC1444wC4 = null;
        try {
            interfaceC1444wA = y.a(cls2);
        } catch (Throwable unused) {
            interfaceC1444wA = null;
        }
        MaxRetriesPerRequestAttributeKey = new AttributeKey<>("MaxRetriesPerRequestAttributeKey", new TypeInfo(interfaceC1425dB, interfaceC1444wA));
        InterfaceC1425d interfaceC1425dB2 = y.a.b(o.class);
        try {
            C1447z c1447z = C1447z.f12758c;
            interfaceC1444wC = y.c(o.class, AbstractC0847h.q(y.a(HttpRetryShouldRetryContext.class)), AbstractC0847h.q(y.a(HttpRequest.class)), AbstractC0847h.q(y.a(HttpResponse.class)), AbstractC0847h.q(y.a(cls)));
        } catch (Throwable unused2) {
            interfaceC1444wC = null;
        }
        ShouldRetryPerRequestAttributeKey = new AttributeKey<>("ShouldRetryPerRequestAttributeKey", new TypeInfo(interfaceC1425dB2, interfaceC1444wC));
        InterfaceC1425d interfaceC1425dB3 = y.a.b(o.class);
        try {
            C1447z c1447z2 = C1447z.f12758c;
            interfaceC1444wC2 = y.c(o.class, AbstractC0847h.q(y.a(HttpRetryShouldRetryContext.class)), AbstractC0847h.q(y.a(HttpRequestBuilder.class)), AbstractC0847h.q(y.a(Throwable.class)), AbstractC0847h.q(y.a(cls)));
        } catch (Throwable unused3) {
            interfaceC1444wC2 = null;
        }
        ShouldRetryOnExceptionPerRequestAttributeKey = new AttributeKey<>("ShouldRetryOnExceptionPerRequestAttributeKey", new TypeInfo(interfaceC1425dB3, interfaceC1444wC2));
        InterfaceC1425d interfaceC1425dB4 = y.a.b(n.class);
        try {
            C1447z c1447z3 = C1447z.f12758c;
            interfaceC1444wC3 = y.c(n.class, AbstractC0847h.q(y.a(HttpRetryModifyRequestContext.class)), AbstractC0847h.q(y.a(HttpRequestBuilder.class)), AbstractC0847h.q(y.a(C.class)));
        } catch (Throwable unused4) {
            interfaceC1444wC3 = null;
        }
        ModifyRequestPerRequestAttributeKey = new AttributeKey<>("ModifyRequestPerRequestAttributeKey", new TypeInfo(interfaceC1425dB4, interfaceC1444wC3));
        InterfaceC1425d interfaceC1425dB5 = y.a.b(n.class);
        try {
            C1447z c1447z4 = C1447z.f12758c;
            interfaceC1444wC4 = y.c(n.class, AbstractC0847h.q(y.a(HttpRetryDelayContext.class)), AbstractC0847h.q(y.a(cls2)), AbstractC0847h.q(y.a(Long.TYPE)));
        } catch (Throwable unused5) {
        }
        RetryDelayPerRequestAttributeKey = new AttributeKey<>("RetryDelayPerRequestAttributeKey", new TypeInfo(interfaceC1425dB5, interfaceC1444wC4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C HttpRequestRetry$lambda$1(ClientPluginBuilder clientPluginBuilder) {
        l.f("$this$createClientPlugin", clientPluginBuilder);
        o shouldRetry$ktor_client_core = ((HttpRequestRetryConfig) clientPluginBuilder.getPluginConfig()).getShouldRetry$ktor_client_core();
        o shouldRetryOnException$ktor_client_core = ((HttpRequestRetryConfig) clientPluginBuilder.getPluginConfig()).getShouldRetryOnException$ktor_client_core();
        n delayMillis$ktor_client_core = ((HttpRequestRetryConfig) clientPluginBuilder.getPluginConfig()).getDelayMillis$ktor_client_core();
        n delay$ktor_client_core = ((HttpRequestRetryConfig) clientPluginBuilder.getPluginConfig()).getDelay();
        clientPluginBuilder.on(Send.INSTANCE, new HttpRequestRetryKt$HttpRequestRetry$2$1(shouldRetry$ktor_client_core, shouldRetryOnException$ktor_client_core, ((HttpRequestRetryConfig) clientPluginBuilder.getPluginConfig()).getMaxRetries(), delayMillis$ktor_client_core, ((HttpRequestRetryConfig) clientPluginBuilder.getPluginConfig()).getModifyRequest(), clientPluginBuilder, delay$ktor_client_core, null));
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HttpRequestBuilder HttpRequestRetry$lambda$1$prepareRequest(HttpRequestBuilder httpRequestBuilder) {
        HttpRequestBuilder httpRequestBuilderTakeFrom = new HttpRequestBuilder().takeFrom(httpRequestBuilder);
        httpRequestBuilder.getExecutionContext().x(new a(6, httpRequestBuilderTakeFrom));
        return httpRequestBuilderTakeFrom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C HttpRequestRetry$lambda$1$prepareRequest$lambda$0(HttpRequestBuilder httpRequestBuilder, Throwable th) {
        InterfaceC0265f0 executionContext = httpRequestBuilder.getExecutionContext();
        l.d("null cannot be cast to non-null type kotlinx.coroutines.CompletableJob", executionContext);
        r rVar = (r) executionContext;
        if (th == null) {
            ((h0) rVar).Z();
        } else {
            ((h0) rVar).a0(th);
        }
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HttpRequestRetry$lambda$1$shouldRetry(int i7, int i8, o oVar, HttpClientCall httpClientCall) {
        return i7 < i8 && ((Boolean) oVar.invoke(new HttpRetryShouldRetryContext(i7 + 1), httpClientCall.getRequest(), httpClientCall.getResponse())).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HttpRequestRetry$lambda$1$shouldRetryOnException(int i7, int i8, o oVar, HttpRequestBuilder httpRequestBuilder, Throwable th) {
        return i7 < i8 && ((Boolean) oVar.invoke(new HttpRetryShouldRetryContext(i7 + 1), httpRequestBuilder, th)).booleanValue();
    }

    public static final ClientPlugin<HttpRequestRetryConfig> getHttpRequestRetry() {
        return HttpRequestRetry;
    }

    public static /* synthetic */ void getHttpRequestRetry$annotations() {
    }

    public static final EventDefinition<HttpRetryEventData> getHttpRequestRetryEvent() {
        return HttpRequestRetryEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isTimeoutException(Throwable th) {
        Throwable thUnwrapCancellationException = ExceptionUtilsJvmKt.unwrapCancellationException(th);
        return (thUnwrapCancellationException instanceof HttpRequestTimeoutException) || (thUnwrapCancellationException instanceof ConnectTimeoutException) || (thUnwrapCancellationException instanceof SocketTimeoutException);
    }

    public static final void retry(HttpRequestBuilder httpRequestBuilder, k kVar) {
        l.f("<this>", httpRequestBuilder);
        l.f("block", kVar);
        HttpRequestRetryConfig httpRequestRetryConfig = new HttpRequestRetryConfig();
        kVar.invoke(httpRequestRetryConfig);
        httpRequestBuilder.getAttributes().put(ShouldRetryPerRequestAttributeKey, httpRequestRetryConfig.getShouldRetry$ktor_client_core());
        httpRequestBuilder.getAttributes().put(ShouldRetryOnExceptionPerRequestAttributeKey, httpRequestRetryConfig.getShouldRetryOnException$ktor_client_core());
        httpRequestBuilder.getAttributes().put(RetryDelayPerRequestAttributeKey, httpRequestRetryConfig.getDelayMillis$ktor_client_core());
        httpRequestBuilder.getAttributes().put(MaxRetriesPerRequestAttributeKey, Integer.valueOf(httpRequestRetryConfig.getMaxRetries()));
        httpRequestBuilder.getAttributes().put(ModifyRequestPerRequestAttributeKey, httpRequestRetryConfig.getModifyRequest());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object throwOnInvalidResponseBody(HttpResponse httpResponse, S3.c<? super Boolean> cVar) {
        return DoubleReceivePluginKt.isSaved(httpResponse) ? ByteReadChannel.DefaultImpls.awaitContent$default(httpResponse.getRawContent(), 0, cVar, 1, null) : Boolean.FALSE;
    }
}
