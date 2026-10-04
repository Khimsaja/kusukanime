package io.ktor.client.plugins.cache.storage;

import O3.InterfaceC0554c;
import S3.h;
import U3.c;
import U3.e;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.call.SavedHttpCall;
import io.ktor.client.plugins.cache.HttpCacheEntry;
import io.ktor.client.plugins.cache.HttpCacheEntryKt;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.Url;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.InternalAPI;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0080@¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\b\u001a\u00020\f*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0087@¢\u0006\u0004\b\b\u0010\r\u001a:\u0010\b\u001a\u00020\f*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\b\u0010\u0011\u001a+\u0010\u0018\u001a\u00020\u0003*\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "Lio/ktor/http/Url;", "url", "Lio/ktor/client/statement/HttpResponse;", "value", "", "isShared", "Lio/ktor/client/plugins/cache/HttpCacheEntry;", "store", "(Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;Lio/ktor/http/Url;Lio/ktor/client/statement/HttpResponse;ZLS3/c;)Ljava/lang/Object;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "response", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "(Lio/ktor/client/plugins/cache/storage/CacheStorage;Lio/ktor/client/statement/HttpResponse;LS3/c;)Ljava/lang/Object;", "", "", "varyKeys", "(Lio/ktor/client/plugins/cache/storage/CacheStorage;Lio/ktor/client/statement/HttpResponse;Ljava/util/Map;ZLS3/c;)Ljava/lang/Object;", "Lio/ktor/client/HttpClient;", "client", "Lio/ktor/client/request/HttpRequest;", "request", "LS3/h;", "responseContext", "createResponse", "(Lio/ktor/client/plugins/cache/storage/CachedResponseData;Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequest;LS3/h;)Lio/ktor/client/statement/HttpResponse;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpCacheStorageKt {

    @e(c = "io.ktor.client.plugins.cache.storage.HttpCacheStorageKt", f = "HttpCacheStorage.kt", l = {69}, m = "store")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCacheStorageKt.store((HttpCacheStorage) null, (Url) null, (HttpResponse) null, false, (S3.c<? super HttpCacheEntry>) this);
        }
    }

    @e(c = "io.ktor.client.plugins.cache.storage.HttpCacheStorageKt", f = "HttpCacheStorage.kt", l = {159, 171}, m = "store")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$3, reason: invalid class name */
    public static final class AnonymousClass3 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(S3.c<? super AnonymousClass3> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCacheStorageKt.store((CacheStorage) null, (HttpResponse) null, (Map<String, String>) null, false, (S3.c<? super CachedResponseData>) this);
        }
    }

    public static final HttpResponse createResponse(final CachedResponseData cachedResponseData, HttpClient httpClient, HttpRequest httpRequest, final h hVar) {
        l.f("<this>", cachedResponseData);
        l.f("client", httpClient);
        l.f("request", httpRequest);
        l.f("responseContext", hVar);
        return new SavedHttpCall(httpClient, httpRequest, new HttpResponse(cachedResponseData, hVar) { // from class: io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$createResponse$response$1
            private final h coroutineContext;
            private final Headers headers;
            private final GMTDate requestTime;
            private final GMTDate responseTime;
            private final HttpStatusCode status;
            private final HttpProtocolVersion version;

            {
                this.status = cachedResponseData.getStatusCode();
                this.version = cachedResponseData.getVersion();
                this.requestTime = cachedResponseData.getRequestTime();
                this.responseTime = cachedResponseData.getResponseTime();
                this.headers = cachedResponseData.getHeaders();
                this.coroutineContext = hVar;
            }

            @InternalAPI
            public static /* synthetic */ void getRawContent$annotations() {
            }

            @Override // io.ktor.client.statement.HttpResponse
            public HttpClientCall getCall() {
                throw new IllegalStateException("This is a fake response");
            }

            @Override // io.ktor.client.statement.HttpResponse, H5.A
            public h getCoroutineContext() {
                return this.coroutineContext;
            }

            @Override // io.ktor.http.HttpMessage
            public Headers getHeaders() {
                return this.headers;
            }

            @Override // io.ktor.client.statement.HttpResponse
            public ByteReadChannel getRawContent() {
                throw new IllegalStateException("This is a fake response");
            }

            @Override // io.ktor.client.statement.HttpResponse
            public GMTDate getRequestTime() {
                return this.requestTime;
            }

            @Override // io.ktor.client.statement.HttpResponse
            public GMTDate getResponseTime() {
                return this.responseTime;
            }

            @Override // io.ktor.client.statement.HttpResponse
            public HttpStatusCode getStatus() {
                return this.status;
            }

            @Override // io.ktor.client.statement.HttpResponse
            public HttpProtocolVersion getVersion() {
                return this.version;
            }
        }, cachedResponseData.getBody()).getResponse();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object store(io.ktor.client.plugins.cache.storage.HttpCacheStorage r4, io.ktor.http.Url r5, io.ktor.client.statement.HttpResponse r6, boolean r7, S3.c<? super io.ktor.client.plugins.cache.HttpCacheEntry> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$1 r0 = (io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$1 r0 = new io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.L$1
            r5 = r4
            io.ktor.http.Url r5 = (io.ktor.http.Url) r5
            java.lang.Object r4 = r0.L$0
            io.ktor.client.plugins.cache.storage.HttpCacheStorage r4 = (io.ktor.client.plugins.cache.storage.HttpCacheStorage) r4
            P3.r.Y(r8)
            goto L48
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            P3.r.Y(r8)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r8 = io.ktor.client.plugins.cache.HttpCacheEntryKt.HttpCacheEntry(r7, r6, r0)
            if (r8 != r1) goto L48
            return r1
        L48:
            io.ktor.client.plugins.cache.HttpCacheEntry r8 = (io.ktor.client.plugins.cache.HttpCacheEntry) r8
            r4.store(r5, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.store(io.ktor.client.plugins.cache.storage.HttpCacheStorage, io.ktor.http.Url, io.ktor.client.statement.HttpResponse, boolean, S3.c):java.lang.Object");
    }

    public static /* synthetic */ Object store$default(CacheStorage cacheStorage, HttpResponse httpResponse, Map map, boolean z7, S3.c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z7 = false;
        }
        return store(cacheStorage, httpResponse, (Map<String, String>) map, z7, (S3.c<? super CachedResponseData>) cVar);
    }

    @InterfaceC0554c
    public static final Object store(CacheStorage cacheStorage, HttpResponse httpResponse, S3.c<? super CachedResponseData> cVar) {
        return store$default(cacheStorage, httpResponse, HttpCacheEntryKt.varyKeys(httpResponse), false, cVar, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object store(io.ktor.client.plugins.cache.storage.CacheStorage r18, io.ktor.client.statement.HttpResponse r19, java.util.Map<java.lang.String, java.lang.String> r20, boolean r21, S3.c<? super io.ktor.client.plugins.cache.storage.CachedResponseData> r22) throws java.lang.Throwable {
        /*
            r0 = r22
            boolean r1 = r0 instanceof io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.AnonymousClass3
            if (r1 == 0) goto L15
            r1 = r0
            io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$3 r1 = (io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.AnonymousClass3) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$3 r1 = new io.ktor.client.plugins.cache.storage.HttpCacheStorageKt$store$3
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.result
            T3.a r2 = T3.a.f9048k
            int r3 = r1.label
            r4 = 1
            r5 = 2
            if (r3 == 0) goto L51
            if (r3 == r4) goto L38
            if (r3 != r5) goto L30
            java.lang.Object r1 = r1.L$0
            io.ktor.client.plugins.cache.storage.CachedResponseData r1 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r1
            P3.r.Y(r0)
            return r1
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            boolean r3 = r1.Z$0
            java.lang.Object r4 = r1.L$3
            io.ktor.http.Url r4 = (io.ktor.http.Url) r4
            java.lang.Object r6 = r1.L$2
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r7 = r1.L$1
            io.ktor.client.statement.HttpResponse r7 = (io.ktor.client.statement.HttpResponse) r7
            java.lang.Object r8 = r1.L$0
            io.ktor.client.plugins.cache.storage.CacheStorage r8 = (io.ktor.client.plugins.cache.storage.CacheStorage) r8
            P3.r.Y(r0)
            r16 = r6
            r6 = r8
            goto L84
        L51:
            P3.r.Y(r0)
            io.ktor.client.call.HttpClientCall r0 = r19.getCall()
            io.ktor.client.request.HttpRequest r0 = r0.getRequest()
            io.ktor.http.Url r0 = r0.getUrl()
            io.ktor.utils.io.ByteReadChannel r3 = r19.getRawContent()
            r6 = r18
            r1.L$0 = r6
            r7 = r19
            r1.L$1 = r7
            r8 = r20
            r1.L$2 = r8
            r1.L$3 = r0
            r9 = r21
            r1.Z$0 = r9
            r1.label = r4
            java.lang.Object r3 = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(r3, r1)
            if (r3 != r2) goto L7f
            goto Lc4
        L7f:
            r4 = r0
            r0 = r3
            r16 = r8
            r3 = r9
        L84:
            S5.n r0 = (S5.n) r0
            byte[] r17 = io.ktor.utils.io.core.StringsKt.readBytes(r0)
            io.ktor.client.call.HttpClientCall r0 = r7.getCall()
            io.ktor.client.request.HttpRequest r0 = r0.getRequest()
            io.ktor.http.Url r9 = r0.getUrl()
            io.ktor.http.HttpStatusCode r10 = r7.getStatus()
            io.ktor.util.date.GMTDate r11 = r7.getRequestTime()
            io.ktor.http.Headers r15 = r7.getHeaders()
            io.ktor.http.HttpProtocolVersion r13 = r7.getVersion()
            io.ktor.util.date.GMTDate r12 = r7.getResponseTime()
            r0 = 0
            io.ktor.util.date.GMTDate r14 = io.ktor.client.plugins.cache.HttpCacheEntryKt.cacheExpires$default(r7, r3, r0, r5, r0)
            io.ktor.client.plugins.cache.storage.CachedResponseData r8 = new io.ktor.client.plugins.cache.storage.CachedResponseData
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1.L$0 = r8
            r1.L$1 = r0
            r1.L$2 = r0
            r1.L$3 = r0
            r1.label = r5
            java.lang.Object r0 = r6.store(r4, r8, r1)
            if (r0 != r2) goto Lc5
        Lc4:
            return r2
        Lc5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.HttpCacheStorageKt.store(io.ktor.client.plugins.cache.storage.CacheStorage, io.ktor.client.statement.HttpResponse, java.util.Map, boolean, S3.c):java.lang.Object");
    }
}
