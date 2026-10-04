package io.ktor.client.plugins;

import O3.C;
import P3.r;
import U3.j;
import e4.o;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.request.HttpRequestBuilder;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/api/Send$Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@U3.e(c = "io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$3$1", f = "HttpTimeout.kt", l = {168}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HttpTimeoutKt$HttpTimeout$3$1 extends j implements o {
    final /* synthetic */ Long $connectTimeoutMillis;
    final /* synthetic */ Long $requestTimeoutMillis;
    final /* synthetic */ Long $socketTimeoutMillis;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpTimeoutKt$HttpTimeout$3$1(Long l7, Long l8, Long l9, S3.c<? super HttpTimeoutKt$HttpTimeout$3$1> cVar) {
        super(3, cVar);
        this.$requestTimeoutMillis = l7;
        this.$connectTimeoutMillis = l8;
        this.$socketTimeoutMillis = l9;
    }

    @Override // e4.o
    public final Object invoke(Send.Sender sender, HttpRequestBuilder httpRequestBuilder, S3.c<? super HttpClientCall> cVar) {
        HttpTimeoutKt$HttpTimeout$3$1 httpTimeoutKt$HttpTimeout$3$1 = new HttpTimeoutKt$HttpTimeout$3$1(this.$requestTimeoutMillis, this.$connectTimeoutMillis, this.$socketTimeoutMillis, cVar);
        httpTimeoutKt$HttpTimeout$3$1.L$0 = sender;
        httpTimeoutKt$HttpTimeout$3$1.L$1 = httpRequestBuilder;
        return httpTimeoutKt$HttpTimeout$3$1.invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
            return obj;
        }
        r.Y(obj);
        Send.Sender sender = (Send.Sender) this.L$0;
        HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) this.L$1;
        boolean supportsRequestTimeout = HttpTimeoutKt.getSupportsRequestTimeout(httpRequestBuilder);
        HttpTimeoutCapability httpTimeoutCapability = HttpTimeoutCapability.INSTANCE;
        HttpTimeoutConfig httpTimeoutConfig = (HttpTimeoutConfig) httpRequestBuilder.getCapabilityOrNull(httpTimeoutCapability);
        if (httpTimeoutConfig == null && HttpTimeoutKt.HttpTimeout$lambda$1$hasNotNullTimeouts(this.$requestTimeoutMillis, this.$connectTimeoutMillis, this.$socketTimeoutMillis, supportsRequestTimeout)) {
            HttpTimeoutConfig httpTimeoutConfig2 = new HttpTimeoutConfig(null, null, null, 7, null);
            httpRequestBuilder.setCapability(httpTimeoutCapability, httpTimeoutConfig2);
            httpTimeoutConfig = httpTimeoutConfig2;
        }
        if (httpTimeoutConfig != null) {
            Long l7 = this.$connectTimeoutMillis;
            Long l8 = this.$socketTimeoutMillis;
            Long l9 = this.$requestTimeoutMillis;
            Long l10 = httpTimeoutConfig.get_connectTimeoutMillis();
            if (l10 != null) {
                l7 = l10;
            }
            httpTimeoutConfig.setConnectTimeoutMillis(l7);
            Long l11 = httpTimeoutConfig.get_socketTimeoutMillis();
            if (l11 != null) {
                l8 = l11;
            }
            httpTimeoutConfig.setSocketTimeoutMillis(l8);
            if (supportsRequestTimeout) {
                Long l12 = httpTimeoutConfig.get_requestTimeoutMillis();
                if (l12 != null) {
                    l9 = l12;
                }
                httpTimeoutConfig.setRequestTimeoutMillis(l9);
                HttpTimeoutKt.applyRequestTimeout(sender, httpRequestBuilder, httpTimeoutConfig.get_requestTimeoutMillis());
            }
        }
        this.L$0 = null;
        this.label = 1;
        Object objProceed = sender.proceed(httpRequestBuilder, this);
        return objProceed == aVar ? aVar : objProceed;
    }
}
