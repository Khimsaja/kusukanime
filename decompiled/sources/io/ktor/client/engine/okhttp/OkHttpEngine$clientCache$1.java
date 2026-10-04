package io.ktor.client.engine.okhttp;

import e4.k;
import f6.C0887A;
import io.ktor.client.plugins.HttpTimeoutConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.j;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class OkHttpEngine$clientCache$1 extends j implements k {
    public OkHttpEngine$clientCache$1(Object obj) {
        super(1, 0, OkHttpEngine.class, obj, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeoutConfig;)Lokhttp3/OkHttpClient;");
    }

    @Override // e4.k
    public final C0887A invoke(HttpTimeoutConfig httpTimeoutConfig) {
        return ((OkHttpEngine) this.receiver).createOkHttpClient(httpTimeoutConfig);
    }
}
