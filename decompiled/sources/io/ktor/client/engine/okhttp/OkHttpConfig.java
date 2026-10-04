package io.ktor.client.engine.okhttp;

import O3.C;
import e4.k;
import f6.C0887A;
import f6.InterfaceC0900N;
import f6.InterfaceC0924v;
import f6.z;
import io.ktor.client.engine.HttpClientEngineConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rR.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\tR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttpConfig;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "<init>", "()V", "Lkotlin/Function1;", "Lf6/z;", "LO3/C;", "block", "config", "(Le4/k;)V", "Lf6/v;", "interceptor", "addInterceptor", "(Lf6/v;)V", "addNetworkInterceptor", "Le4/k;", "getConfig$ktor_client_okhttp", "()Le4/k;", "setConfig$ktor_client_okhttp", "Lf6/A;", "preconfigured", "Lf6/A;", "getPreconfigured", "()Lf6/A;", "setPreconfigured", "(Lf6/A;)V", "", "clientCacheSize", "I", "getClientCacheSize", "()I", "setClientCacheSize", "(I)V", "Lf6/N;", "webSocketFactory", "Lf6/N;", "getWebSocketFactory", "()Lf6/N;", "setWebSocketFactory", "(Lf6/N;)V", "ktor-client-okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OkHttpConfig extends HttpClientEngineConfig {
    private C0887A preconfigured;
    private InterfaceC0900N webSocketFactory;
    private k config = new io.ktor.client.b(5);
    private int clientCacheSize = 10;

    /* JADX INFO: Access modifiers changed from: private */
    public static final C addInterceptor$lambda$2(InterfaceC0924v interfaceC0924v, z zVar) {
        l.f("$this$config", zVar);
        l.f("interceptor", interfaceC0924v);
        zVar.f11630c.add(interfaceC0924v);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C addNetworkInterceptor$lambda$3(InterfaceC0924v interfaceC0924v, z zVar) {
        l.f("$this$config", zVar);
        l.f("interceptor", interfaceC0924v);
        zVar.f11631d.add(interfaceC0924v);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C config$lambda$0(z zVar) {
        l.f("<this>", zVar);
        zVar.f11635h = false;
        zVar.f11636i = false;
        zVar.f11633f = true;
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C config$lambda$1(k kVar, k kVar2, z zVar) {
        l.f("<this>", zVar);
        kVar.invoke(zVar);
        kVar2.invoke(zVar);
        return C.a;
    }

    public final void addInterceptor(InterfaceC0924v interceptor) {
        l.f("interceptor", interceptor);
        config(new a(interceptor, 1));
    }

    public final void addNetworkInterceptor(InterfaceC0924v interceptor) {
        l.f("interceptor", interceptor);
        config(new a(interceptor, 0));
    }

    public final void config(k block) {
        l.f("block", block);
        this.config = new io.ktor.client.a(this.config, block, 2);
    }

    public final int getClientCacheSize() {
        return this.clientCacheSize;
    }

    /* renamed from: getConfig$ktor_client_okhttp, reason: from getter */
    public final k getConfig() {
        return this.config;
    }

    public final C0887A getPreconfigured() {
        return this.preconfigured;
    }

    public final InterfaceC0900N getWebSocketFactory() {
        return this.webSocketFactory;
    }

    public final void setClientCacheSize(int i7) {
        this.clientCacheSize = i7;
    }

    public final void setConfig$ktor_client_okhttp(k kVar) {
        l.f("<set-?>", kVar);
        this.config = kVar;
    }

    public final void setPreconfigured(C0887A c0887a) {
        this.preconfigured = c0887a;
    }

    public final void setWebSocketFactory(InterfaceC0900N interfaceC0900N) {
        this.webSocketFactory = interfaceC0900N;
    }
}
