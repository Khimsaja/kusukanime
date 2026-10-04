package io.ktor.client.engine;

import O3.C;
import e4.k;
import io.ktor.client.engine.HttpClientEngineConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003J%\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/client/engine/HttpClientEngineFactory;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "T", "", "Lkotlin/Function1;", "LO3/C;", "block", "Lio/ktor/client/engine/HttpClientEngine;", "create", "(Le4/k;)Lio/ktor/client/engine/HttpClientEngine;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface HttpClientEngineFactory<T extends HttpClientEngineConfig> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ HttpClientEngine create$default(HttpClientEngineFactory httpClientEngineFactory, k kVar, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
            if ((i7 & 1) != 0) {
                kVar = new io.ktor.client.b(4);
            }
            return httpClientEngineFactory.create(kVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C create$lambda$0(HttpClientEngineConfig httpClientEngineConfig) {
            l.f("<this>", httpClientEngineConfig);
            return C.a;
        }
    }

    HttpClientEngine create(k block);
}
