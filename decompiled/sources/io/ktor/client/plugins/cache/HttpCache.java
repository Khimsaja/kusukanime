package io.ktor.client.plugins.cache;

import O3.C;
import O3.InterfaceC0554c;
import S3.c;
import S3.h;
import T3.a;
import U3.e;
import e4.k;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.plugins.cache.storage.CacheStorage;
import io.ktor.client.plugins.cache.storage.CachedResponseData;
import io.ktor.client.plugins.cache.storage.HttpCacheStorage;
import io.ktor.client.plugins.cache.storage.HttpCacheStorageKt;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.events.EventDefinition;
import io.ktor.http.HeaderValue;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.AttributeKey;
import io.ktor.util.date.DateJvmKt;
import io.ktor.util.date.GMTDate;
import io.ktor.util.pipeline.InvalidPhaseException;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.pipeline.PipelinePhase;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteChannelCtorKt;
import io.ktor.utils.io.KtorDsl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 .2\u00020\u0001:\u0002/.B9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J>\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u00052\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b\u001c\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R \u0010\u0004\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u001a\u0010\n\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lio/ktor/client/plugins/cache/HttpCache;", "", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "publicStorage", "privateStorage", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "publicStorageNew", "privateStorageNew", "", "useOldStorage", "isSharedClient", "<init>", "(Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;Lio/ktor/client/plugins/cache/storage/CacheStorage;Lio/ktor/client/plugins/cache/storage/CacheStorage;ZZ)V", "Lio/ktor/client/statement/HttpResponse;", "response", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "cacheResponse", "(Lio/ktor/client/statement/HttpResponse;LS3/c;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequest;", "request", "findAndRefresh", "(Lio/ktor/client/request/HttpRequest;Lio/ktor/client/statement/HttpResponse;LS3/c;)Ljava/lang/Object;", "storage", "", "", "varyKeys", "Lio/ktor/http/Url;", "url", "findResponse", "(Lio/ktor/client/plugins/cache/storage/CacheStorage;Ljava/util/Map;Lio/ktor/http/Url;Lio/ktor/client/request/HttpRequest;LS3/c;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequestBuilder;", "context", "Lio/ktor/http/content/OutgoingContent;", "content", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/http/content/OutgoingContent;LS3/c;)Ljava/lang/Object;", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "getPublicStorage$ktor_client_core", "()Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "getPublicStorage$ktor_client_core$annotations", "()V", "getPrivateStorage$ktor_client_core", "getPrivateStorage$ktor_client_core$annotations", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "Z", "isSharedClient$ktor_client_core", "()Z", "Companion", "Config", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpCache {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0 == true ? 1 : 0);
    private static final EventDefinition<HttpResponse> HttpResponseFromCache;
    private static final AttributeKey<HttpCache> key;
    private final boolean isSharedClient;
    private final HttpCacheStorage privateStorage;
    private final CacheStorage privateStorageNew;
    private final HttpCacheStorage publicStorage;
    private final CacheStorage publicStorageNew;
    private final boolean useOldStorage;

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u0010\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u00032\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u001d\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0080@¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010 \u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0080@¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lio/ktor/client/plugins/cache/HttpCache$Companion;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/cache/HttpCache$Config;", "Lio/ktor/client/plugins/cache/HttpCache;", "<init>", "()V", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "cachedResponse", "Lio/ktor/client/HttpClient;", "scope", "LS3/h;", "callContext", "LO3/C;", "proceedWithWarning", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Lio/ktor/client/HttpClient;LS3/h;LS3/c;)Ljava/lang/Object;", "Lkotlin/Function1;", "block", "prepare", "(Le4/k;)Lio/ktor/client/plugins/cache/HttpCache;", "plugin", "install", "(Lio/ktor/client/plugins/cache/HttpCache;Lio/ktor/client/HttpClient;)V", "Lio/ktor/client/call/HttpClientCall;", "cachedCall", "proceedWithCache$ktor_client_core", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/HttpClient;Lio/ktor/client/call/HttpClientCall;LS3/c;)Ljava/lang/Object;", "proceedWithCache", "proceedWithMissingCache$ktor_client_core", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/HttpClient;LS3/c;)Ljava/lang/Object;", "proceedWithMissingCache", "Lio/ktor/util/AttributeKey;", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "Lio/ktor/events/EventDefinition;", "Lio/ktor/client/statement/HttpResponse;", "HttpResponseFromCache", "Lio/ktor/events/EventDefinition;", "getHttpResponseFromCache", "()Lio/ktor/events/EventDefinition;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements HttpClientPlugin<Config, HttpCache> {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object proceedWithWarning(PipelineContext<Object, HttpRequestBuilder> pipelineContext, CachedResponseData cachedResponseData, HttpClient httpClient, h hVar, c<? super C> cVar) {
            HttpRequestData httpRequestDataBuild = pipelineContext.getContext().build();
            HttpStatusCode statusCode = cachedResponseData.getStatusCode();
            GMTDate requestTime = cachedResponseData.getRequestTime();
            Headers.Companion companion = Headers.INSTANCE;
            HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
            headersBuilder.appendAll(cachedResponseData.getHeaders());
            headersBuilder.append(HttpHeaders.INSTANCE.getWarning(), "110");
            HttpClientCall httpClientCall = new HttpClientCall(httpClient, httpRequestDataBuild, new HttpResponseData(statusCode, requestTime, headersBuilder.build(), cachedResponseData.getVersion(), ByteChannelCtorKt.ByteReadChannel$default(cachedResponseData.getBody(), 0, 0, 6, null), hVar));
            pipelineContext.finish();
            httpClient.getMonitor().raise(getHttpResponseFromCache(), httpClientCall.getResponse());
            Object objProceedWith = pipelineContext.proceedWith(httpClientCall, cVar);
            return objProceedWith == a.f9048k ? objProceedWith : C.a;
        }

        public final EventDefinition<HttpResponse> getHttpResponseFromCache() {
            return HttpCache.HttpResponseFromCache;
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey<HttpCache> getKey() {
            return HttpCache.key;
        }

        public final Object proceedWithCache$ktor_client_core(PipelineContext<Object, HttpRequestBuilder> pipelineContext, HttpClient httpClient, HttpClientCall httpClientCall, c<? super C> cVar) {
            pipelineContext.finish();
            httpClient.getMonitor().raise(getHttpResponseFromCache(), httpClientCall.getResponse());
            Object objProceedWith = pipelineContext.proceedWith(httpClientCall, cVar);
            return objProceedWith == a.f9048k ? objProceedWith : C.a;
        }

        public final Object proceedWithMissingCache$ktor_client_core(PipelineContext<Object, HttpRequestBuilder> pipelineContext, HttpClient httpClient, c<? super C> cVar) {
            pipelineContext.finish();
            HttpRequestData httpRequestDataBuild = pipelineContext.getContext().build();
            Object objProceedWith = pipelineContext.proceedWith(new HttpClientCall(httpClient, httpRequestDataBuild, new HttpResponseData(HttpStatusCode.INSTANCE.getGatewayTimeout(), DateJvmKt.GMTDate$default(null, 1, null), Headers.INSTANCE.getEmpty(), HttpProtocolVersion.INSTANCE.getHTTP_1_1(), ByteChannelCtorKt.ByteReadChannel$default(new byte[0], 0, 0, 6, null), httpRequestDataBuild.getExecutionContext())), cVar);
            return objProceedWith == a.f9048k ? objProceedWith : C.a;
        }

        private Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(HttpCache plugin, HttpClient scope) throws InvalidPhaseException {
            l.f("plugin", plugin);
            l.f("scope", scope);
            PipelinePhase pipelinePhase = new PipelinePhase("Cache");
            scope.getSendPipeline().insertPhaseAfter(HttpSendPipeline.INSTANCE.getState(), pipelinePhase);
            scope.getSendPipeline().intercept(pipelinePhase, new HttpCache$Companion$install$1(plugin, scope, null));
            PipelinePhase pipelinePhase2 = new PipelinePhase("Cache");
            scope.getReceivePipeline().insertPhaseAfter(HttpReceivePipeline.INSTANCE.getState(), pipelinePhase2);
            scope.getReceivePipeline().intercept(pipelinePhase2, new HttpCache$Companion$install$2(plugin, scope, null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public HttpCache prepare(k block) {
            l.f("block", block);
            Config config = new Config();
            block.invoke(config);
            return new HttpCache(config.getPublicStorage(), config.getPrivateStorage(), config.getPublicStorageNew(), config.getPrivateStorageNew(), config.getUseOldStorage(), config.getIsShared(), null);
        }
    }

    @KtorDsl
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR\"\u0010\n\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\bR\"\u0010\u000f\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\bR\"\u0010\u0013\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R0\u0010\u0007\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\u001d\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R0\u0010\t\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010\u001d\u0012\u0004\b%\u0010\u0003\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!¨\u0006&"}, d2 = {"Lio/ktor/client/plugins/cache/HttpCache$Config;", "", "<init>", "()V", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "storage", "LO3/C;", "publicStorage", "(Lio/ktor/client/plugins/cache/storage/CacheStorage;)V", "privateStorage", "publicStorageNew", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "getPublicStorageNew$ktor_client_core", "()Lio/ktor/client/plugins/cache/storage/CacheStorage;", "setPublicStorageNew$ktor_client_core", "privateStorageNew", "getPrivateStorageNew$ktor_client_core", "setPrivateStorageNew$ktor_client_core", "", "useOldStorage", "Z", "getUseOldStorage$ktor_client_core", "()Z", "setUseOldStorage$ktor_client_core", "(Z)V", "isShared", "setShared", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "value", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "getPublicStorage", "()Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "setPublicStorage", "(Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;)V", "getPublicStorage$annotations", "getPrivateStorage", "setPrivateStorage", "getPrivateStorage$annotations", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Config {
        private boolean isShared;
        private HttpCacheStorage privateStorage;
        private CacheStorage privateStorageNew;
        private HttpCacheStorage publicStorage;
        private CacheStorage publicStorageNew;
        private boolean useOldStorage;

        public Config() {
            CacheStorage.Companion companion = CacheStorage.INSTANCE;
            this.publicStorageNew = (CacheStorage) companion.getUnlimited().invoke();
            this.privateStorageNew = (CacheStorage) companion.getUnlimited().invoke();
            HttpCacheStorage.Companion companion2 = HttpCacheStorage.INSTANCE;
            this.publicStorage = (HttpCacheStorage) companion2.getUnlimited().invoke();
            this.privateStorage = (HttpCacheStorage) companion2.getUnlimited().invoke();
        }

        @InterfaceC0554c
        public static /* synthetic */ void getPrivateStorage$annotations() {
        }

        @InterfaceC0554c
        public static /* synthetic */ void getPublicStorage$annotations() {
        }

        public final HttpCacheStorage getPrivateStorage() {
            return this.privateStorage;
        }

        /* renamed from: getPrivateStorageNew$ktor_client_core, reason: from getter */
        public final CacheStorage getPrivateStorageNew() {
            return this.privateStorageNew;
        }

        public final HttpCacheStorage getPublicStorage() {
            return this.publicStorage;
        }

        /* renamed from: getPublicStorageNew$ktor_client_core, reason: from getter */
        public final CacheStorage getPublicStorageNew() {
            return this.publicStorageNew;
        }

        /* renamed from: getUseOldStorage$ktor_client_core, reason: from getter */
        public final boolean getUseOldStorage() {
            return this.useOldStorage;
        }

        /* renamed from: isShared, reason: from getter */
        public final boolean getIsShared() {
            return this.isShared;
        }

        public final void privateStorage(CacheStorage storage) {
            l.f("storage", storage);
            this.privateStorageNew = storage;
        }

        public final void publicStorage(CacheStorage storage) {
            l.f("storage", storage);
            this.publicStorageNew = storage;
        }

        public final void setPrivateStorage(HttpCacheStorage httpCacheStorage) {
            l.f("value", httpCacheStorage);
            this.useOldStorage = true;
            this.privateStorage = httpCacheStorage;
        }

        public final void setPrivateStorageNew$ktor_client_core(CacheStorage cacheStorage) {
            l.f("<set-?>", cacheStorage);
            this.privateStorageNew = cacheStorage;
        }

        public final void setPublicStorage(HttpCacheStorage httpCacheStorage) {
            l.f("value", httpCacheStorage);
            this.useOldStorage = true;
            this.publicStorage = httpCacheStorage;
        }

        public final void setPublicStorageNew$ktor_client_core(CacheStorage cacheStorage) {
            l.f("<set-?>", cacheStorage);
            this.publicStorageNew = cacheStorage;
        }

        public final void setShared(boolean z7) {
            this.isShared = z7;
        }

        public final void setUseOldStorage$ktor_client_core(boolean z7) {
            this.useOldStorage = z7;
        }
    }

    @e(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", l = {343, 344}, m = "findAndRefresh")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.HttpCache$findAndRefresh$1, reason: invalid class name */
    public static final class AnonymousClass1 extends U3.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCache.this.findAndRefresh(null, null, this);
        }
    }

    @e(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", l = {355, 360}, m = "findResponse")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.HttpCache$findResponse$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11621 extends U3.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C11621(c<? super C11621> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCache.this.findResponse(null, null, null, null, this);
        }
    }

    @e(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", l = {370, 370}, m = "findResponse")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.HttpCache$findResponse$4, reason: invalid class name */
    public static final class AnonymousClass4 extends U3.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass4(c<? super AnonymousClass4> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCache.this.findResponse(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        InterfaceC1444w interfaceC1444wA = null;
        InterfaceC1425d interfaceC1425dB = y.a.b(HttpCache.class);
        try {
            interfaceC1444wA = y.a(HttpCache.class);
        } catch (Throwable unused) {
        }
        key = new AttributeKey<>("HttpCache", new TypeInfo(interfaceC1425dB, interfaceC1444wA));
        HttpResponseFromCache = new EventDefinition<>();
    }

    public /* synthetic */ HttpCache(HttpCacheStorage httpCacheStorage, HttpCacheStorage httpCacheStorage2, CacheStorage cacheStorage, CacheStorage cacheStorage2, boolean z7, boolean z8, f fVar) {
        this(httpCacheStorage, httpCacheStorage2, cacheStorage, cacheStorage2, z7, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object cacheResponse(HttpResponse httpResponse, c<? super CachedResponseData> cVar) {
        HttpRequest request = httpResponse.getCall().getRequest();
        List<HeaderValue> listCacheControl = HttpMessagePropertiesKt.cacheControl(httpResponse);
        List<HeaderValue> listCacheControl2 = HttpMessagePropertiesKt.cacheControl(request);
        CacheControl cacheControl = CacheControl.INSTANCE;
        boolean zContains = listCacheControl.contains(cacheControl.getPRIVATE$ktor_client_core());
        if (zContains && this.isSharedClient) {
            return null;
        }
        CacheStorage cacheStorage = zContains ? this.privateStorageNew : this.publicStorageNew;
        if (listCacheControl.contains(cacheControl.getNO_STORE$ktor_client_core()) || listCacheControl2.contains(cacheControl.getNO_STORE$ktor_client_core())) {
            return null;
        }
        return HttpCacheStorageKt.store(cacheStorage, httpResponse, HttpCacheEntryKt.varyKeys(httpResponse), this.isSharedClient, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object findAndRefresh(io.ktor.client.request.HttpRequest r10, io.ktor.client.statement.HttpResponse r11, S3.c<? super io.ktor.client.statement.HttpResponse> r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof io.ktor.client.plugins.cache.HttpCache.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r12
            io.ktor.client.plugins.cache.HttpCache$findAndRefresh$1 r0 = (io.ktor.client.plugins.cache.HttpCache.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            io.ktor.client.plugins.cache.HttpCache$findAndRefresh$1 r0 = new io.ktor.client.plugins.cache.HttpCache$findAndRefresh$1
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.result
            T3.a r0 = T3.a.f9048k
            int r1 = r6.label
            r2 = 1
            r7 = 2
            r8 = 0
            if (r1 == 0) goto L55
            if (r1 == r2) goto L43
            if (r1 != r7) goto L3b
            java.lang.Object r10 = r6.L$2
            io.ktor.client.plugins.cache.storage.CachedResponseData r10 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r10
            java.lang.Object r11 = r6.L$1
            io.ktor.client.statement.HttpResponse r11 = (io.ktor.client.statement.HttpResponse) r11
            java.lang.Object r0 = r6.L$0
            io.ktor.client.request.HttpRequest r0 = (io.ktor.client.request.HttpRequest) r0
            P3.r.Y(r12)
            r1 = r9
            goto Lbf
        L3b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L43:
            java.lang.Object r10 = r6.L$2
            io.ktor.client.plugins.cache.storage.CacheStorage r10 = (io.ktor.client.plugins.cache.storage.CacheStorage) r10
            java.lang.Object r11 = r6.L$1
            io.ktor.client.statement.HttpResponse r11 = (io.ktor.client.statement.HttpResponse) r11
            java.lang.Object r1 = r6.L$0
            io.ktor.client.request.HttpRequest r1 = (io.ktor.client.request.HttpRequest) r1
            P3.r.Y(r12)
            r5 = r1
            r1 = r9
            goto L97
        L55:
            P3.r.Y(r12)
            io.ktor.client.call.HttpClientCall r12 = r11.getCall()
            io.ktor.client.request.HttpRequest r12 = r12.getRequest()
            io.ktor.http.Url r4 = r12.getUrl()
            java.util.List r12 = io.ktor.http.HttpMessagePropertiesKt.cacheControl(r11)
            io.ktor.client.plugins.cache.CacheControl r1 = io.ktor.client.plugins.cache.CacheControl.INSTANCE
            io.ktor.http.HeaderValue r1 = r1.getPRIVATE$ktor_client_core()
            boolean r12 = r12.contains(r1)
            if (r12 == 0) goto L79
            boolean r1 = r9.isSharedClient
            if (r1 == 0) goto L79
            return r8
        L79:
            if (r12 == 0) goto L7e
            io.ktor.client.plugins.cache.storage.CacheStorage r12 = r9.privateStorageNew
            goto L80
        L7e:
            io.ktor.client.plugins.cache.storage.CacheStorage r12 = r9.publicStorageNew
        L80:
            java.util.Map r3 = io.ktor.client.plugins.cache.HttpCacheEntryKt.varyKeys(r11)
            r6.L$0 = r10
            r6.L$1 = r11
            r6.L$2 = r12
            r6.label = r2
            r1 = r9
            r5 = r10
            r2 = r12
            java.lang.Object r12 = r1.findResponse(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L96
            goto Lbc
        L96:
            r10 = r2
        L97:
            io.ktor.client.plugins.cache.storage.CachedResponseData r12 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r12
            if (r12 != 0) goto L9c
            return r8
        L9c:
            io.ktor.http.Url r2 = r5.getUrl()
            java.util.Map r3 = r12.getVaryKeys()
            boolean r4 = r1.isSharedClient
            io.ktor.util.date.GMTDate r4 = io.ktor.client.plugins.cache.HttpCacheEntryKt.cacheExpires$default(r11, r4, r8, r7, r8)
            io.ktor.client.plugins.cache.storage.CachedResponseData r3 = r12.copy$ktor_client_core(r3, r4)
            r6.L$0 = r5
            r6.L$1 = r11
            r6.L$2 = r12
            r6.label = r7
            java.lang.Object r10 = r10.store(r2, r3, r6)
            if (r10 != r0) goto Lbd
        Lbc:
            return r0
        Lbd:
            r10 = r12
            r0 = r5
        Lbf:
            io.ktor.client.call.HttpClientCall r12 = r0.getCall()
            io.ktor.client.HttpClient r12 = r12.getClient()
            S3.h r11 = r11.getCoroutineContext()
            io.ktor.client.statement.HttpResponse r10 = io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.createResponse(r10, r12, r0, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.HttpCache.findAndRefresh(io.ktor.client.request.HttpRequest, io.ktor.client.statement.HttpResponse, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object findResponse(io.ktor.client.plugins.cache.storage.CacheStorage r6, java.util.Map<java.lang.String, java.lang.String> r7, io.ktor.http.Url r8, io.ktor.client.request.HttpRequest r9, S3.c<? super io.ktor.client.plugins.cache.storage.CachedResponseData> r10) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r10 instanceof io.ktor.client.plugins.cache.HttpCache.C11621
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.client.plugins.cache.HttpCache$findResponse$1 r0 = (io.ktor.client.plugins.cache.HttpCache.C11621) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.HttpCache$findResponse$1 r0 = new io.ktor.client.plugins.cache.HttpCache$findResponse$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.L$0
            e4.k r6 = (e4.k) r6
            P3.r.Y(r10)
            goto L73
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            P3.r.Y(r10)
            return r10
        L3a:
            P3.r.Y(r10)
            boolean r10 = r7.isEmpty()
            if (r10 != 0) goto L4d
            r0.label = r4
            java.lang.Object r6 = r6.find(r8, r7, r0)
            if (r6 != r1) goto L4c
            goto L71
        L4c:
            return r6
        L4d:
            io.ktor.http.content.OutgoingContent r7 = r9.getContent()
            io.ktor.client.plugins.cache.HttpCache$findResponse$requestHeaders$1 r10 = new io.ktor.client.plugins.cache.HttpCache$findResponse$requestHeaders$1
            io.ktor.http.Headers r2 = r9.getHeaders()
            r10.<init>(r2)
            io.ktor.client.plugins.cache.HttpCache$findResponse$requestHeaders$2 r2 = new io.ktor.client.plugins.cache.HttpCache$findResponse$requestHeaders$2
            io.ktor.http.Headers r9 = r9.getHeaders()
            r2.<init>(r9)
            e4.k r7 = io.ktor.client.plugins.cache.HttpCacheKt.mergedHeadersLookup(r7, r10, r2)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r10 = r6.findAll(r8, r0)
            if (r10 != r1) goto L72
        L71:
            return r1
        L72:
            r6 = r7
        L73:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            io.ktor.client.plugins.cache.HttpCache$findResponse$$inlined$sortedByDescending$1 r7 = new io.ktor.client.plugins.cache.HttpCache$findResponse$$inlined$sortedByDescending$1
            r7.<init>()
            java.util.List r7 = P3.q.O0(r10, r7)
            java.util.Iterator r7 = r7.iterator()
        L82:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lc5
            java.lang.Object r8 = r7.next()
            r9 = r8
            io.ktor.client.plugins.cache.storage.CachedResponseData r9 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r9
            java.util.Map r9 = r9.getVaryKeys()
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L9a
            goto Lc6
        L9a:
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        La2:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lc6
            java.lang.Object r10 = r9.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r0 = r10.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r10 = r10.getValue()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r0 = r6.invoke(r0)
            boolean r10 = kotlin.jvm.internal.l.a(r0, r10)
            if (r10 != 0) goto La2
            goto L82
        Lc5:
            r8 = 0
        Lc6:
            io.ktor.client.plugins.cache.storage.CachedResponseData r8 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.HttpCache.findResponse(io.ktor.client.plugins.cache.storage.CacheStorage, java.util.Map, io.ktor.http.Url, io.ktor.client.request.HttpRequest, S3.c):java.lang.Object");
    }

    @InterfaceC0554c
    public static /* synthetic */ void getPrivateStorage$ktor_client_core$annotations() {
    }

    @InterfaceC0554c
    public static /* synthetic */ void getPublicStorage$ktor_client_core$annotations() {
    }

    /* renamed from: getPrivateStorage$ktor_client_core, reason: from getter */
    public final HttpCacheStorage getPrivateStorage() {
        return this.privateStorage;
    }

    /* renamed from: getPublicStorage$ktor_client_core, reason: from getter */
    public final HttpCacheStorage getPublicStorage() {
        return this.publicStorage;
    }

    /* renamed from: isSharedClient$ktor_client_core, reason: from getter */
    public final boolean getIsSharedClient() {
        return this.isSharedClient;
    }

    private HttpCache(HttpCacheStorage httpCacheStorage, HttpCacheStorage httpCacheStorage2, CacheStorage cacheStorage, CacheStorage cacheStorage2, boolean z7, boolean z8) {
        this.publicStorage = httpCacheStorage;
        this.privateStorage = httpCacheStorage2;
        this.publicStorageNew = cacheStorage;
        this.privateStorageNew = cacheStorage2;
        this.useOldStorage = z7;
        this.isSharedClient = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object findResponse(io.ktor.client.request.HttpRequestBuilder r8, io.ktor.http.content.OutgoingContent r9, S3.c<? super io.ktor.client.plugins.cache.storage.CachedResponseData> r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof io.ktor.client.plugins.cache.HttpCache.AnonymousClass4
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.client.plugins.cache.HttpCache$findResponse$4 r0 = (io.ktor.client.plugins.cache.HttpCache.AnonymousClass4) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.HttpCache$findResponse$4 r0 = new io.ktor.client.plugins.cache.HttpCache$findResponse$4
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r8 = r0.L$1
            java.util.Set r8 = (java.util.Set) r8
            java.lang.Object r9 = r0.L$0
            e4.k r9 = (e4.k) r9
            P3.r.Y(r10)
            goto L8e
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            java.lang.Object r8 = r0.L$1
            e4.k r8 = (e4.k) r8
            java.lang.Object r9 = r0.L$0
            io.ktor.http.Url r9 = (io.ktor.http.Url) r9
            P3.r.Y(r10)
            goto L79
        L46:
            P3.r.Y(r10)
            io.ktor.http.URLBuilder r10 = r8.getUrl()
            io.ktor.http.Url r10 = io.ktor.http.URLUtilsKt.Url(r10)
            io.ktor.client.plugins.cache.HttpCache$findResponse$lookup$1 r2 = new io.ktor.client.plugins.cache.HttpCache$findResponse$lookup$1
            io.ktor.http.HeadersBuilder r5 = r8.getHeaders()
            r2.<init>(r5)
            io.ktor.client.plugins.cache.HttpCache$findResponse$lookup$2 r5 = new io.ktor.client.plugins.cache.HttpCache$findResponse$lookup$2
            io.ktor.http.HeadersBuilder r8 = r8.getHeaders()
            r5.<init>(r8)
            e4.k r8 = io.ktor.client.plugins.cache.HttpCacheKt.mergedHeadersLookup(r9, r2, r5)
            io.ktor.client.plugins.cache.storage.CacheStorage r9 = r7.privateStorageNew
            r0.L$0 = r10
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r9.findAll(r10, r0)
            if (r9 != r1) goto L76
            goto L89
        L76:
            r6 = r10
            r10 = r9
            r9 = r6
        L79:
            java.util.Set r10 = (java.util.Set) r10
            io.ktor.client.plugins.cache.storage.CacheStorage r2 = r7.publicStorageNew
            r0.L$0 = r8
            r0.L$1 = r10
            r0.label = r3
            java.lang.Object r9 = r2.findAll(r9, r0)
            if (r9 != r1) goto L8a
        L89:
            return r1
        L8a:
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L8e:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.LinkedHashSet r8 = P3.J.T(r8, r10)
            java.util.Iterator r8 = r8.iterator()
        L98:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto Le1
            java.lang.Object r10 = r8.next()
            io.ktor.client.plugins.cache.storage.CachedResponseData r10 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r10
            java.util.Map r0 = r10.getVaryKeys()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Le0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb5
            goto Le0
        Lb5:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Lbd:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Le0
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r9.invoke(r2)
            boolean r1 = kotlin.jvm.internal.l.a(r2, r1)
            if (r1 != 0) goto Lbd
            goto L98
        Le0:
            return r10
        Le1:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.HttpCache.findResponse(io.ktor.client.request.HttpRequestBuilder, io.ktor.http.content.OutgoingContent, S3.c):java.lang.Object");
    }
}
