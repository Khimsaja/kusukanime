package io.ktor.client.plugins;

import O3.C;
import e4.k;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.plugins.DefaultRequest;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/DefaultRequest$DefaultRequestBuilder;", "LO3/C;", "block", "defaultRequest", "(Lio/ktor/client/HttpClientConfig;Le4/k;)V", "Lz6/b;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lz6/b;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultRequestKt {
    private static final z6.b LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.DefaultRequest");

    public static final void defaultRequest(HttpClientConfig<?> httpClientConfig, k kVar) {
        l.f("<this>", httpClientConfig);
        l.f("block", kVar);
        httpClientConfig.install(DefaultRequest.INSTANCE, new a(2, kVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C defaultRequest$lambda$0(k kVar, DefaultRequest.DefaultRequestBuilder defaultRequestBuilder) {
        l.f("$this$install", defaultRequestBuilder);
        kVar.invoke(defaultRequestBuilder);
        return C.a;
    }
}
