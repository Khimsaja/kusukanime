package io.ktor.client.plugins;

import H5.A;
import H5.C0284z;
import H5.D;
import H5.InterfaceC0265f0;
import O3.C;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import e4.k;
import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.network.sockets.TimeoutExceptionsKt;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.plugins.sse.SSEClientContent;
import io.ktor.client.request.ClientUpgradeContent;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.utils.ExceptionUtilsJvmKt;
import io.ktor.http.URLProtocolKt;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import io.ktor.utils.io.InternalAPI;
import java.net.SocketTimeoutException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\u000b\u001a\u00020\u0005*\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0015\u001a%\u0010\u0018\u001a\u00060\u0016j\u0002`\u00172\u0006\u0010\u0002\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0017\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a'\u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0081\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"\"\u0018\u0010%\u001a\u00060#j\u0002`$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\"\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u001e\u00101\u001a\u00020,*\u00020\u00018BX\u0082\u0004¢\u0006\f\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00062"}, d2 = {"LH5/A;", "Lio/ktor/client/request/HttpRequestBuilder;", "request", "", "requestTimeout", "LO3/C;", "applyRequestTimeout", "(LH5/A;Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/Long;)V", "Lkotlin/Function1;", "Lio/ktor/client/plugins/HttpTimeoutConfig;", "block", "timeout", "(Lio/ktor/client/request/HttpRequestBuilder;Le4/k;)V", "Lio/ktor/client/request/HttpRequestData;", "", "cause", "Lio/ktor/client/network/sockets/ConnectTimeoutException;", "ConnectTimeoutException", "(Lio/ktor/client/request/HttpRequestData;Ljava/lang/Throwable;)Lio/ktor/client/network/sockets/ConnectTimeoutException;", "", "url", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Throwable;)Lio/ktor/client/network/sockets/ConnectTimeoutException;", "Ljava/net/SocketTimeoutException;", "Lio/ktor/client/network/sockets/SocketTimeoutException;", "SocketTimeoutException", "(Lio/ktor/client/request/HttpRequestData;Ljava/lang/Throwable;)Ljava/net/SocketTimeoutException;", "", "convertLongTimeoutToIntWithInfiniteAsZero", "(J)I", "convertLongTimeoutToLongWithInfiniteAsZero", "(J)J", "T", "Lkotlin/Function0;", "unwrapRequestTimeoutException", "(Le4/a;)Ljava/lang/Object;", "Lz6/b;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lz6/b;", "Lio/ktor/client/plugins/api/ClientPlugin;", "HttpTimeout", "Lio/ktor/client/plugins/api/ClientPlugin;", "getHttpTimeout", "()Lio/ktor/client/plugins/api/ClientPlugin;", "", "getSupportsRequestTimeout", "(Lio/ktor/client/request/HttpRequestBuilder;)Z", "getSupportsRequestTimeout$annotations", "(Lio/ktor/client/request/HttpRequestBuilder;)V", "supportsRequestTimeout", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpTimeoutKt {
    private static final z6.b LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpTimeout");
    private static final ClientPlugin<HttpTimeoutConfig> HttpTimeout = CreatePluginUtilsKt.createClientPlugin("HttpTimeout", HttpTimeoutKt$HttpTimeout$2.INSTANCE, new io.ktor.client.b(17));

    public static final ConnectTimeoutException ConnectTimeoutException(HttpRequestData httpRequestData, Throwable th) {
        Object connectTimeoutMillis;
        l.f("request", httpRequestData);
        StringBuilder sb = new StringBuilder("Connect timeout has expired [url=");
        sb.append(httpRequestData.getUrl());
        sb.append(", connect_timeout=");
        HttpTimeoutConfig httpTimeoutConfig = (HttpTimeoutConfig) httpRequestData.getCapabilityOrNull(HttpTimeoutCapability.INSTANCE);
        if (httpTimeoutConfig == null || (connectTimeoutMillis = httpTimeoutConfig.get_connectTimeoutMillis()) == null) {
            connectTimeoutMillis = "unknown";
        }
        sb.append(connectTimeoutMillis);
        sb.append(" ms]");
        return new ConnectTimeoutException(sb.toString(), th);
    }

    public static /* synthetic */ ConnectTimeoutException ConnectTimeoutException$default(HttpRequestData httpRequestData, Throwable th, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            th = null;
        }
        return ConnectTimeoutException(httpRequestData, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C HttpTimeout$lambda$1(ClientPluginBuilder clientPluginBuilder) {
        l.f("$this$createClientPlugin", clientPluginBuilder);
        clientPluginBuilder.on(Send.INSTANCE, new HttpTimeoutKt$HttpTimeout$3$1(((HttpTimeoutConfig) clientPluginBuilder.getPluginConfig()).get_requestTimeoutMillis(), ((HttpTimeoutConfig) clientPluginBuilder.getPluginConfig()).get_connectTimeoutMillis(), ((HttpTimeoutConfig) clientPluginBuilder.getPluginConfig()).get_socketTimeoutMillis(), null));
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HttpTimeout$lambda$1$hasNotNullTimeouts(Long l7, Long l8, Long l9, boolean z7) {
        return ((!z7 || l7 == null) && l8 == null && l9 == null) ? false : true;
    }

    public static final SocketTimeoutException SocketTimeoutException(HttpRequestData httpRequestData, Throwable th) {
        Object socketTimeoutMillis;
        l.f("request", httpRequestData);
        StringBuilder sb = new StringBuilder("Socket timeout has expired [url=");
        sb.append(httpRequestData.getUrl());
        sb.append(", socket_timeout=");
        HttpTimeoutConfig httpTimeoutConfig = (HttpTimeoutConfig) httpRequestData.getCapabilityOrNull(HttpTimeoutCapability.INSTANCE);
        if (httpTimeoutConfig == null || (socketTimeoutMillis = httpTimeoutConfig.get_socketTimeoutMillis()) == null) {
            socketTimeoutMillis = "unknown";
        }
        sb.append(socketTimeoutMillis);
        sb.append("] ms");
        return TimeoutExceptionsKt.SocketTimeoutException(sb.toString(), th);
    }

    public static /* synthetic */ SocketTimeoutException SocketTimeoutException$default(HttpRequestData httpRequestData, Throwable th, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            th = null;
        }
        return SocketTimeoutException(httpRequestData, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyRequestTimeout(A a, HttpRequestBuilder httpRequestBuilder, Long l7) {
        if (l7 == null || l7.longValue() == Long.MAX_VALUE) {
            return;
        }
        httpRequestBuilder.getExecutionContext().x(new a(7, D.x(a, new C0284z("request-timeout"), new HttpTimeoutKt$applyRequestTimeout$killer$1(l7, httpRequestBuilder, httpRequestBuilder.getExecutionContext(), null), 2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C applyRequestTimeout$lambda$2(InterfaceC0265f0 interfaceC0265f0, Throwable th) {
        interfaceC0265f0.e(null);
        return C.a;
    }

    @InternalAPI
    public static final int convertLongTimeoutToIntWithInfiniteAsZero(long j7) {
        if (j7 == Long.MAX_VALUE) {
            return 0;
        }
        if (j7 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        if (j7 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j7;
    }

    @InternalAPI
    public static final long convertLongTimeoutToLongWithInfiniteAsZero(long j7) {
        if (j7 == Long.MAX_VALUE) {
            return 0L;
        }
        return j7;
    }

    public static final ClientPlugin<HttpTimeoutConfig> getHttpTimeout() {
        return HttpTimeout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getSupportsRequestTimeout(HttpRequestBuilder httpRequestBuilder) {
        return (URLProtocolKt.isWebsocket(httpRequestBuilder.getUrl().getProtocol()) || (httpRequestBuilder.getBody() instanceof ClientUpgradeContent) || (httpRequestBuilder.getBody() instanceof SSEClientContent)) ? false : true;
    }

    private static /* synthetic */ void getSupportsRequestTimeout$annotations(HttpRequestBuilder httpRequestBuilder) {
    }

    public static final void timeout(HttpRequestBuilder httpRequestBuilder, k kVar) {
        l.f("<this>", httpRequestBuilder);
        l.f("block", kVar);
        HttpTimeoutCapability httpTimeoutCapability = HttpTimeoutCapability.INSTANCE;
        HttpTimeoutConfig httpTimeoutConfig = new HttpTimeoutConfig(null, null, null, 7, null);
        kVar.invoke(httpTimeoutConfig);
        httpRequestBuilder.setCapability(httpTimeoutCapability, httpTimeoutConfig);
    }

    public static final <T> T unwrapRequestTimeoutException(InterfaceC0821a interfaceC0821a) throws Throwable {
        l.f("block", interfaceC0821a);
        try {
            return (T) interfaceC0821a.invoke();
        } catch (CancellationException e7) {
            throw ExceptionUtilsJvmKt.unwrapCancellationException(e7);
        }
    }

    public static /* synthetic */ ConnectTimeoutException ConnectTimeoutException$default(String str, Long l7, Throwable th, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th = null;
        }
        return ConnectTimeoutException(str, l7, th);
    }

    public static final ConnectTimeoutException ConnectTimeoutException(String str, Long l7, Throwable th) {
        l.f("url", str);
        StringBuilder sbQ = AbstractC0703b.q("Connect timeout has expired [url=", str, ", connect_timeout=");
        Object obj = l7;
        if (l7 == null) {
            obj = "unknown";
        }
        sbQ.append(obj);
        sbQ.append(" ms]");
        return new ConnectTimeoutException(sbQ.toString(), th);
    }
}
