package io.ktor.client.plugins.cache;

import O3.C;
import P3.J;
import P3.q;
import T3.a;
import U3.c;
import U3.e;
import e4.k;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.cache.storage.HttpCacheStorage;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.request.UtilsKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaderValueParserKt;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.date.GMTDate;
import io.ktor.util.pipeline.PipelineContext;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a8\u0010\n\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0080@¢\u0006\u0004\b\n\u0010\u000b\u001a8\u0010\u000e\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0080@¢\u0006\u0004\b\u000e\u0010\u000f\u001a0\u0010\u0012\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001c\u0010\u0014\u001a\u00020\f*\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015\u001a%\u0010\u0018\u001a\u0004\u0018\u00010\f*\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001aA\u0010\"\u001a\u0004\u0018\u00010!*\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010#\u001a%\u0010\"\u001a\u0004\u0018\u00010!*\u00020\u00032\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\"\u0010%¨\u0006&"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/plugins/cache/HttpCache;", "plugin", "Lio/ktor/http/content/OutgoingContent;", "content", "Lio/ktor/client/HttpClient;", "scope", "LO3/C;", "interceptSendLegacy", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/plugins/cache/HttpCache;Lio/ktor/http/content/OutgoingContent;Lio/ktor/client/HttpClient;LS3/c;)Ljava/lang/Object;", "Lio/ktor/client/statement/HttpResponse;", "response", "interceptReceiveLegacy", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponse;Lio/ktor/client/plugins/cache/HttpCache;Lio/ktor/client/HttpClient;LS3/c;)Ljava/lang/Object;", "Lio/ktor/client/call/HttpClientCall;", "cachedCall", "proceedWithWarning", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/call/HttpClientCall;Lio/ktor/client/HttpClient;LS3/c;)Ljava/lang/Object;", "cacheResponse", "(Lio/ktor/client/plugins/cache/HttpCache;Lio/ktor/client/statement/HttpResponse;LS3/c;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequest;", "request", "findAndRefresh", "(Lio/ktor/client/plugins/cache/HttpCache;Lio/ktor/client/request/HttpRequest;Lio/ktor/client/statement/HttpResponse;)Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "storage", "", "", "varyKeys", "Lio/ktor/http/Url;", "url", "Lio/ktor/client/plugins/cache/HttpCacheEntry;", "findResponse", "(Lio/ktor/client/plugins/cache/HttpCache;Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;Ljava/util/Map;Lio/ktor/http/Url;Lio/ktor/client/request/HttpRequest;)Lio/ktor/client/plugins/cache/HttpCacheEntry;", "context", "(Lio/ktor/client/plugins/cache/HttpCache;Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/http/content/OutgoingContent;)Lio/ktor/client/plugins/cache/HttpCacheEntry;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpCacheLegacyKt {

    @e(c = "io.ktor.client.plugins.cache.HttpCacheLegacyKt", f = "HttpCacheLegacy.kt", l = {120}, m = "cacheResponse")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.HttpCacheLegacyKt$cacheResponse$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCacheLegacyKt.cacheResponse(null, null, this);
        }
    }

    @e(c = "io.ktor.client.plugins.cache.HttpCacheLegacyKt", f = "HttpCacheLegacy.kt", l = {61, 62, 82}, m = "interceptReceiveLegacy")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.HttpCacheLegacyKt$interceptReceiveLegacy$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11631 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C11631(S3.c<? super C11631> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCacheLegacyKt.interceptReceiveLegacy(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object cacheResponse(io.ktor.client.plugins.cache.HttpCache r8, io.ktor.client.statement.HttpResponse r9, S3.c<? super io.ktor.client.statement.HttpResponse> r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof io.ktor.client.plugins.cache.HttpCacheLegacyKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.client.plugins.cache.HttpCacheLegacyKt$cacheResponse$1 r0 = (io.ktor.client.plugins.cache.HttpCacheLegacyKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.HttpCacheLegacyKt$cacheResponse$1 r0 = new io.ktor.client.plugins.cache.HttpCacheLegacyKt$cacheResponse$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r10)
            goto L7d
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            P3.r.Y(r10)
            io.ktor.client.call.HttpClientCall r10 = r9.getCall()
            io.ktor.client.request.HttpRequest r10 = r10.getRequest()
            java.util.List r2 = io.ktor.http.HttpMessagePropertiesKt.cacheControl(r9)
            java.util.List r4 = io.ktor.http.HttpMessagePropertiesKt.cacheControl(r10)
            io.ktor.client.plugins.cache.CacheControl r5 = io.ktor.client.plugins.cache.CacheControl.INSTANCE
            io.ktor.http.HeaderValue r6 = r5.getPRIVATE$ktor_client_core()
            boolean r6 = r2.contains(r6)
            if (r6 == 0) goto L53
            io.ktor.client.plugins.cache.storage.HttpCacheStorage r6 = r8.getPrivateStorage()
            goto L57
        L53:
            io.ktor.client.plugins.cache.storage.HttpCacheStorage r6 = r8.getPublicStorage()
        L57:
            io.ktor.http.HeaderValue r7 = r5.getNO_STORE$ktor_client_core()
            boolean r2 = r2.contains(r7)
            if (r2 != 0) goto L84
            io.ktor.http.HeaderValue r2 = r5.getNO_STORE$ktor_client_core()
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L6c
            goto L84
        L6c:
            io.ktor.http.Url r10 = r10.getUrl()
            boolean r8 = r8.getIsSharedClient()
            r0.label = r3
            java.lang.Object r10 = io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.store(r6, r10, r9, r8, r0)
            if (r10 != r1) goto L7d
            return r1
        L7d:
            io.ktor.client.plugins.cache.HttpCacheEntry r10 = (io.ktor.client.plugins.cache.HttpCacheEntry) r10
            io.ktor.client.statement.HttpResponse r8 = r10.produceResponse$ktor_client_core()
            return r8
        L84:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.HttpCacheLegacyKt.cacheResponse(io.ktor.client.plugins.cache.HttpCache, io.ktor.client.statement.HttpResponse, S3.c):java.lang.Object");
    }

    private static final HttpResponse findAndRefresh(HttpCache httpCache, HttpRequest httpRequest, HttpResponse httpResponse) {
        Url url = httpResponse.getCall().getRequest().getUrl();
        HttpCacheStorage privateStorage = HttpMessagePropertiesKt.cacheControl(httpResponse).contains(CacheControl.INSTANCE.getPRIVATE$ktor_client_core()) ? httpCache.getPrivateStorage() : httpCache.getPublicStorage();
        HttpCacheEntry httpCacheEntryFindResponse = findResponse(httpCache, privateStorage, HttpCacheEntryKt.varyKeys(httpResponse), url, httpRequest);
        if (httpCacheEntryFindResponse == null) {
            return null;
        }
        privateStorage.store(url, new HttpCacheEntry(HttpCacheEntryKt.cacheExpires$default(httpResponse, httpCache.getIsSharedClient(), null, 2, null), httpCacheEntryFindResponse.getVaryKeys(), httpCacheEntryFindResponse.getResponse(), httpCacheEntryFindResponse.getBody()));
        return httpCacheEntryFindResponse.produceResponse$ktor_client_core();
    }

    private static final HttpCacheEntry findResponse(HttpCache httpCache, HttpCacheStorage httpCacheStorage, Map<String, String> map, Url url, HttpRequest httpRequest) {
        Object next;
        if (!map.isEmpty()) {
            return httpCacheStorage.find(url, map);
        }
        k kVarMergedHeadersLookup = HttpCacheKt.mergedHeadersLookup(httpRequest.getContent(), new HttpCacheLegacyKt$findResponse$requestHeaders$1(httpRequest.getHeaders()), new HttpCacheLegacyKt$findResponse$requestHeaders$2(httpRequest.getHeaders()));
        Iterator it = q.O0(httpCacheStorage.findByUrl(url), new Comparator() { // from class: io.ktor.client.plugins.cache.HttpCacheLegacyKt$findResponse$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t8) {
                return z1.c.h(((HttpCacheEntry) t8).getResponse().getResponseTime(), ((HttpCacheEntry) t7).getResponse().getResponseTime());
            }
        }).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Map<String, String> varyKeys = ((HttpCacheEntry) next).getVaryKeys();
            if (!varyKeys.isEmpty()) {
                for (Map.Entry<String, String> entry : varyKeys.entrySet()) {
                    String key = entry.getKey();
                    if (!l.a(kVarMergedHeadersLookup.invoke(key), entry.getValue())) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        return (HttpCacheEntry) next;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object interceptReceiveLegacy(io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponse, O3.C> r7, io.ktor.client.statement.HttpResponse r8, io.ktor.client.plugins.cache.HttpCache r9, io.ktor.client.HttpClient r10, S3.c<? super O3.C> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.HttpCacheLegacyKt.interceptReceiveLegacy(io.ktor.util.pipeline.PipelineContext, io.ktor.client.statement.HttpResponse, io.ktor.client.plugins.cache.HttpCache, io.ktor.client.HttpClient, S3.c):java.lang.Object");
    }

    public static final Object interceptSendLegacy(PipelineContext<Object, HttpRequestBuilder> pipelineContext, HttpCache httpCache, OutgoingContent outgoingContent, HttpClient httpClient, S3.c<? super C> cVar) {
        Object objProceedWithMissingCache$ktor_client_core;
        HttpCacheEntry httpCacheEntryFindResponse = findResponse(httpCache, pipelineContext.getContext(), outgoingContent);
        C c2 = C.a;
        if (httpCacheEntryFindResponse == null) {
            return (HttpHeaderValueParserKt.parseHeaderValue(pipelineContext.getContext().getHeaders().get(HttpHeaders.INSTANCE.getCacheControl())).contains(CacheControl.INSTANCE.getONLY_IF_CACHED$ktor_client_core()) && (objProceedWithMissingCache$ktor_client_core = HttpCache.INSTANCE.proceedWithMissingCache$ktor_client_core(pipelineContext, httpClient, cVar)) == a.f9048k) ? objProceedWithMissingCache$ktor_client_core : c2;
        }
        HttpClientCall call = httpCacheEntryFindResponse.produceResponse$ktor_client_core().getCall();
        ValidateStatus validateStatusShouldValidate = HttpCacheEntryKt.shouldValidate(httpCacheEntryFindResponse.getExpires(), httpCacheEntryFindResponse.getResponse().getHeaders(), pipelineContext.getContext());
        if (validateStatusShouldValidate == ValidateStatus.ShouldNotValidate) {
            Object objProceedWithCache$ktor_client_core = HttpCache.INSTANCE.proceedWithCache$ktor_client_core(pipelineContext, httpClient, call, cVar);
            return objProceedWithCache$ktor_client_core == a.f9048k ? objProceedWithCache$ktor_client_core : c2;
        }
        if (validateStatusShouldValidate == ValidateStatus.ShouldWarn) {
            Object objProceedWithWarning = proceedWithWarning(pipelineContext, call, httpClient, cVar);
            return objProceedWithWarning == a.f9048k ? objProceedWithWarning : c2;
        }
        Headers responseHeaders = httpCacheEntryFindResponse.getResponseHeaders();
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        String str = responseHeaders.get(httpHeaders.getETag());
        if (str != null) {
            UtilsKt.header(pipelineContext.getContext(), httpHeaders.getIfNoneMatch(), str);
        }
        String str2 = httpCacheEntryFindResponse.getResponseHeaders().get(httpHeaders.getLastModified());
        if (str2 != null) {
            UtilsKt.header(pipelineContext.getContext(), httpHeaders.getIfModifiedSince(), str2);
        }
        return c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object proceedWithWarning(PipelineContext<Object, HttpRequestBuilder> pipelineContext, HttpClientCall httpClientCall, HttpClient httpClient, S3.c<? super C> cVar) {
        HttpRequestData httpRequestDataBuild = pipelineContext.getContext().build();
        HttpStatusCode status = httpClientCall.getResponse().getStatus();
        GMTDate requestTime = httpClientCall.getResponse().getRequestTime();
        Headers.Companion companion = Headers.INSTANCE;
        HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
        headersBuilder.appendAll(httpClientCall.getResponse().getHeaders());
        headersBuilder.append(HttpHeaders.INSTANCE.getWarning(), "110");
        HttpClientCall httpClientCall2 = new HttpClientCall(httpClient, httpRequestDataBuild, new HttpResponseData(status, requestTime, headersBuilder.build(), httpClientCall.getResponse().getVersion(), httpClientCall.getResponse().getRawContent(), httpClientCall.getResponse().getCoroutineContext()));
        pipelineContext.finish();
        httpClient.getMonitor().raise(HttpCache.INSTANCE.getHttpResponseFromCache(), httpClientCall2.getResponse());
        Object objProceedWith = pipelineContext.proceedWith(httpClientCall2, cVar);
        return objProceedWith == a.f9048k ? objProceedWith : C.a;
    }

    private static final HttpCacheEntry findResponse(HttpCache httpCache, HttpRequestBuilder httpRequestBuilder, OutgoingContent outgoingContent) {
        Url Url = URLUtilsKt.Url(httpRequestBuilder.getUrl());
        k kVarMergedHeadersLookup = HttpCacheKt.mergedHeadersLookup(outgoingContent, new HttpCacheLegacyKt$findResponse$lookup$1(httpRequestBuilder.getHeaders()), new HttpCacheLegacyKt$findResponse$lookup$2(httpRequestBuilder.getHeaders()));
        for (HttpCacheEntry httpCacheEntry : J.T(httpCache.getPrivateStorage().findByUrl(Url), httpCache.getPublicStorage().findByUrl(Url))) {
            Map<String, String> varyKeys = httpCacheEntry.getVaryKeys();
            if (!varyKeys.isEmpty() && !varyKeys.isEmpty()) {
                for (Map.Entry<String, String> entry : varyKeys.entrySet()) {
                    String key = entry.getKey();
                    if (!l.a(kVarMergedHeadersLookup.invoke(key), entry.getValue())) {
                        break;
                    }
                }
            }
            return httpCacheEntry;
        }
        return null;
    }
}
