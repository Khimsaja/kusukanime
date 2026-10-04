package io.ktor.client;

import A3.d;
import H5.C0263e0;
import H5.InterfaceC0265f0;
import O3.C;
import S3.f;
import e4.k;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.engine.HttpClientEngineConfig;
import io.ktor.client.engine.HttpClientEngineFactory;
import io.ktor.utils.io.KtorDsl;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/client/engine/HttpClientEngineConfig;", "T", "Lio/ktor/client/engine/HttpClientEngineFactory;", "engineFactory", "Lkotlin/Function1;", "Lio/ktor/client/HttpClientConfig;", "LO3/C;", "block", "Lio/ktor/client/HttpClient;", "HttpClient", "(Lio/ktor/client/engine/HttpClientEngineFactory;Le4/k;)Lio/ktor/client/HttpClient;", "Lio/ktor/client/engine/HttpClientEngine;", "engine", "(Lio/ktor/client/engine/HttpClientEngine;Le4/k;)Lio/ktor/client/HttpClient;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpClientKt {
    @KtorDsl
    public static final <T extends HttpClientEngineConfig> HttpClient HttpClient(HttpClientEngineFactory<? extends T> httpClientEngineFactory, k kVar) {
        l.f("engineFactory", httpClientEngineFactory);
        l.f("block", kVar);
        HttpClientConfig httpClientConfig = new HttpClientConfig();
        kVar.invoke(httpClientConfig);
        HttpClientEngine httpClientEngineCreate = httpClientEngineFactory.create(httpClientConfig.getEngineConfig());
        HttpClient httpClient = new HttpClient(httpClientEngineCreate, httpClientConfig, true);
        f fVar = httpClient.getCoroutineContext().get(C0263e0.f3843k);
        l.c(fVar);
        ((InterfaceC0265f0) fVar).x(new d(13, httpClientEngineCreate));
        return httpClient;
    }

    public static /* synthetic */ HttpClient HttpClient$default(HttpClientEngineFactory httpClientEngineFactory, k kVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new b(3);
        }
        return HttpClient(httpClientEngineFactory, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C HttpClient$lambda$0(HttpClientConfig httpClientConfig) {
        l.f("<this>", httpClientConfig);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C HttpClient$lambda$1(HttpClientEngine httpClientEngine, Throwable th) throws IOException {
        httpClientEngine.close();
        return C.a;
    }

    @KtorDsl
    public static final HttpClient HttpClient(HttpClientEngine httpClientEngine, k kVar) {
        l.f("engine", httpClientEngine);
        l.f("block", kVar);
        HttpClientConfig httpClientConfig = new HttpClientConfig();
        kVar.invoke(httpClientConfig);
        return new HttpClient(httpClientEngine, httpClientConfig, false);
    }
}
