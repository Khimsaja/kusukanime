package io.ktor.client;

import e4.k;
import f6.z;
import io.ktor.client.engine.HttpClientEngineConfig;
import io.ktor.client.engine.okhttp.OkHttpConfig;
import io.ktor.websocket.Frame;
import io.ktor.websocket.WebSocketDeflateExtension;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12096k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f12097l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f12098m;

    public /* synthetic */ a(k kVar, k kVar2, int i7) {
        this.f12096k = i7;
        this.f12097l = kVar;
        this.f12098m = kVar2;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12096k) {
            case 0:
                return HttpClientConfig.install$lambda$3(this.f12097l, this.f12098m, obj);
            case 1:
                return HttpClientConfig.engine$lambda$1(this.f12097l, this.f12098m, (HttpClientEngineConfig) obj);
            case 2:
                return OkHttpConfig.config$lambda$1(this.f12097l, this.f12098m, (z) obj);
            case 3:
                return Boolean.valueOf(WebSocketDeflateExtension.Config.compressIf$lambda$3(this.f12097l, this.f12098m, (Frame) obj));
            default:
                return WebSocketDeflateExtension.Config.configureProtocols$lambda$2(this.f12097l, this.f12098m, (List) obj);
        }
    }
}
