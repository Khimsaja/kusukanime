package io.ktor.client;

import e4.k;
import f6.C0887A;
import f6.z;
import io.ktor.client.engine.HttpClientEngineConfig;
import io.ktor.client.engine.HttpClientEngineFactory;
import io.ktor.client.engine.okhttp.OkHttpConfig;
import io.ktor.client.engine.okhttp.OkHttpEngine;
import io.ktor.client.plugins.BodyProgressKt;
import io.ktor.client.plugins.DefaultRequest;
import io.ktor.client.plugins.DoubleReceivePluginKt;
import io.ktor.client.plugins.HttpCallValidatorKt;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.plugins.HttpPlainTextKt;
import io.ktor.client.plugins.HttpRedirectKt;
import io.ktor.client.plugins.HttpRequestLifecycleKt;
import io.ktor.client.plugins.HttpRequestRetryKt;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.plugins.UserAgentConfig;
import io.ktor.client.plugins.UserAgentKt;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig;
import io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt;
import io.ktor.client.plugins.observer.ResponseObserverKt;
import io.ktor.client.plugins.sse.BuildersKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.URLBuilder;
import io.ktor.util.GzipHeaderFlags;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12099k;

    public /* synthetic */ b(int i7) {
        this.f12099k = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12099k) {
            case 0:
                return HttpClientConfig.install$lambda$2(obj);
            case 1:
                return HttpClientConfig.engineConfig$lambda$0((HttpClientEngineConfig) obj);
            case 2:
                return HttpClientJvmKt.HttpClient$lambda$0((HttpClientConfig) obj);
            case 3:
                return HttpClientKt.HttpClient$lambda$0((HttpClientConfig) obj);
            case GzipHeaderFlags.EXTRA /* 4 */:
                return HttpClientEngineFactory.DefaultImpls.create$lambda$0((HttpClientEngineConfig) obj);
            case 5:
                return OkHttpConfig.config$lambda$0((z) obj);
            case 6:
                return OkHttpEngine.clientCache$lambda$0((C0887A) obj);
            case 7:
                return BodyProgressKt.BodyProgress$lambda$0((ClientPluginBuilder) obj);
            case 8:
                return DefaultRequest.DefaultRequestBuilder.url$lambda$0((URLBuilder) obj);
            case 9:
                return DoubleReceivePluginKt.SaveBody$lambda$1((ClientPluginBuilder) obj);
            case 10:
                return DoubleReceivePluginKt.SaveBodyPlugin$lambda$2((ClientPluginBuilder) obj);
            case 11:
                return HttpCallValidatorKt.HttpCallValidator$lambda$2((ClientPluginBuilder) obj);
            case 12:
                return HttpClientPlugin.DefaultImpls.prepare$lambda$0(obj);
            case 13:
                return HttpPlainTextKt.HttpPlainText$lambda$6((ClientPluginBuilder) obj);
            case 14:
                return HttpRedirectKt.HttpRedirect$lambda$2((ClientPluginBuilder) obj);
            case 15:
                return HttpRequestLifecycleKt.HttpRequestLifecycle$lambda$0((ClientPluginBuilder) obj);
            case 16:
                return HttpRequestRetryKt.HttpRequestRetry$lambda$1((ClientPluginBuilder) obj);
            case 17:
                return HttpTimeoutKt.HttpTimeout$lambda$1((ClientPluginBuilder) obj);
            case 18:
                return UserAgentKt.CurlUserAgent$lambda$3((UserAgentConfig) obj);
            case 19:
                return UserAgentKt.UserAgent$lambda$1((ClientPluginBuilder) obj);
            case 20:
                return UserAgentKt.BrowserUserAgent$lambda$2((UserAgentConfig) obj);
            case 21:
                return ContentNegotiationKt.ContentNegotiation$lambda$16$convertRequest$lambda$11((ContentNegotiationConfig.ConverterRegistration) obj);
            case 22:
                return ContentNegotiationKt.ContentNegotiation$lambda$16((ClientPluginBuilder) obj);
            case 23:
                return ResponseObserverKt.ResponseObserver$lambda$0((ClientPluginBuilder) obj);
            case 24:
                return BuildersKt.serverSentEvents_BqdlHlk$lambda$19((HttpRequestBuilder) obj);
            case 25:
                return BuildersKt.serverSentEventsSession_Mswn__c$lambda$17((HttpRequestBuilder) obj);
            case 26:
                return BuildersKt.serverSentEvents_3bFjkrY$lambda$8((HttpRequestBuilder) obj);
            case 27:
                return BuildersKt.serverSentEvents_1wIb_0I$lambda$6((HttpRequestBuilder) obj);
            case 28:
                return BuildersKt.sse_tL6_L_A$lambda$12((HttpRequestBuilder) obj);
            default:
                return BuildersKt.serverSentEvents_pTj2aPc$lambda$21((HttpRequestBuilder) obj);
        }
    }
}
