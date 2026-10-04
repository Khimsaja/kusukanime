package io.ktor.client;

import O3.C;
import io.ktor.client.engine.HttpClientEngineFactory;
import io.ktor.utils.io.KtorDsl;
import java.util.Iterator;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import y5.C2418a;
import y5.k;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\"\u001e\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u0012\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/Function1;", "Lio/ktor/client/HttpClientConfig;", "LO3/C;", "block", "Lio/ktor/client/HttpClient;", "HttpClient", "(Le4/k;)Lio/ktor/client/HttpClient;", "Lio/ktor/client/engine/HttpClientEngineFactory;", "FACTORY", "Lio/ktor/client/engine/HttpClientEngineFactory;", "getFACTORY$annotations", "()V", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpClientJvmKt {
    private static final HttpClientEngineFactory<?> FACTORY;

    static {
        HttpClientEngineFactory<?> factory;
        Iterator it = ServiceLoader.load(HttpClientEngineContainer.class, HttpClientEngineContainer.class.getClassLoader()).iterator();
        l.e("iterator(...)", it);
        Iterator it2 = ((C2418a) k.N(it)).iterator();
        HttpClientEngineContainer httpClientEngineContainer = (HttpClientEngineContainer) (!it2.hasNext() ? null : it2.next());
        if (httpClientEngineContainer == null || (factory = httpClientEngineContainer.getFactory()) == null) {
            throw new IllegalStateException("Failed to find HTTP client engine implementation: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html");
        }
        FACTORY = factory;
    }

    @KtorDsl
    public static final HttpClient HttpClient(e4.k kVar) {
        l.f("block", kVar);
        return HttpClientKt.HttpClient(FACTORY, kVar);
    }

    public static /* synthetic */ HttpClient HttpClient$default(e4.k kVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            kVar = new b(2);
        }
        return HttpClient(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C HttpClient$lambda$0(HttpClientConfig httpClientConfig) {
        l.f("<this>", httpClientConfig);
        return C.a;
    }

    private static /* synthetic */ void getFACTORY$annotations() {
    }
}
