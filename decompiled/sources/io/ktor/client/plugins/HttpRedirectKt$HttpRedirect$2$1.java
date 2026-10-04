package io.ktor.client.plugins;

import O3.C;
import P3.r;
import U3.j;
import e4.o;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.request.HttpRequestBuilder;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/api/Send$Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@U3.e(c = "io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$1", f = "HttpRedirect.kt", l = {103, 108}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HttpRedirectKt$HttpRedirect$2$1 extends j implements o {
    final /* synthetic */ boolean $allowHttpsDowngrade;
    final /* synthetic */ boolean $checkHttpMethod;
    final /* synthetic */ ClientPluginBuilder<HttpRedirectConfig> $this_createClientPlugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRedirectKt$HttpRedirect$2$1(boolean z7, boolean z8, ClientPluginBuilder<HttpRedirectConfig> clientPluginBuilder, S3.c<? super HttpRedirectKt$HttpRedirect$2$1> cVar) {
        super(3, cVar);
        this.$checkHttpMethod = z7;
        this.$allowHttpsDowngrade = z8;
        this.$this_createClientPlugin = clientPluginBuilder;
    }

    @Override // e4.o
    public final Object invoke(Send.Sender sender, HttpRequestBuilder httpRequestBuilder, S3.c<? super HttpClientCall> cVar) {
        HttpRedirectKt$HttpRedirect$2$1 httpRedirectKt$HttpRedirect$2$1 = new HttpRedirectKt$HttpRedirect$2$1(this.$checkHttpMethod, this.$allowHttpsDowngrade, this.$this_createClientPlugin, cVar);
        httpRedirectKt$HttpRedirect$2$1.L$0 = sender;
        httpRedirectKt$HttpRedirect$2$1.L$1 = httpRequestBuilder;
        return httpRedirectKt$HttpRedirect$2$1.invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        HttpRequestBuilder httpRequestBuilder;
        Send.Sender sender;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.label;
        if (i7 == 0) {
            r.Y(obj);
            Send.Sender sender2 = (Send.Sender) this.L$0;
            httpRequestBuilder = (HttpRequestBuilder) this.L$1;
            this.L$0 = sender2;
            this.L$1 = httpRequestBuilder;
            this.label = 1;
            Object objProceed = sender2.proceed(httpRequestBuilder, this);
            if (objProceed != aVar) {
                sender = sender2;
                obj = objProceed;
            }
        }
        if (i7 != 1) {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
            return obj;
        }
        httpRequestBuilder = (HttpRequestBuilder) this.L$1;
        sender = (Send.Sender) this.L$0;
        r.Y(obj);
        HttpRequestBuilder httpRequestBuilder2 = httpRequestBuilder;
        HttpClientCall httpClientCall = (HttpClientCall) obj;
        if (this.$checkHttpMethod && !HttpRedirectKt.ALLOWED_FOR_REDIRECT.contains(httpClientCall.getRequest().getMethod())) {
            return httpClientCall;
        }
        boolean z7 = this.$allowHttpsDowngrade;
        HttpClient client = this.$this_createClientPlugin.getClient();
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object objHttpRedirect$lambda$2$handleCall = HttpRedirectKt.HttpRedirect$lambda$2$handleCall(sender, httpRequestBuilder2, httpClientCall, z7, client, this);
        return objHttpRedirect$lambda$2$handleCall == aVar ? aVar : objHttpRedirect$lambda$2$handleCall;
    }
}
