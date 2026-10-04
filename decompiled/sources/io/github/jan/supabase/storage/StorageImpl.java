package io.github.jan.supabase.storage;

import O3.C;
import P3.r;
import a6.v;
import b1.AbstractC0703b;
import e4.k;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.SupabaseSerializer;
import io.github.jan.supabase.auth.AuthenticatedSupabaseApi;
import io.github.jan.supabase.auth.AuthenticatedSupabaseApiKt;
import io.github.jan.supabase.collections.AtomicMutableMap;
import io.github.jan.supabase.storage.Storage;
import io.github.jan.supabase.storage.resumable.ResumableCache;
import io.github.jan.supabase.storage.resumable.SettingsResumableCacheKt;
import io.ktor.client.plugins.HttpTimeoutConfig;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.utils.CacheControl;
import io.ktor.http.ContentDisposition;
import io.ktor.http.ContentType;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpMethod;
import io.ktor.http.content.NullBody;
import io.ktor.http.content.OutgoingContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0096@¢\u0006\u0002\u0010$J\u0018\u0010%\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010'J\u0016\u0010(\u001a\u00020)2\u0006\u0010&\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010'J/\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\r2\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020)0-¢\u0006\u0002\b/H\u0096@¢\u0006\u0002\u00100J/\u00101\u001a\u00020)2\u0006\u0010+\u001a\u00020\r2\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020)0-¢\u0006\u0002\b/H\u0096@¢\u0006\u0002\u00100J\u0016\u00102\u001a\u00020)2\u0006\u0010&\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010'J\u0011\u00103\u001a\u00020 2\u0006\u0010&\u001a\u00020\rH\u0096\u0002J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0096@¢\u0006\u0002\u00108R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lio/github/jan/supabase/storage/StorageImpl;", "Lio/github/jan/supabase/storage/Storage;", "supabaseClient", "Lio/github/jan/supabase/SupabaseClient;", "config", "Lio/github/jan/supabase/storage/Storage$Config;", "<init>", "(Lio/github/jan/supabase/SupabaseClient;Lio/github/jan/supabase/storage/Storage$Config;)V", "getSupabaseClient", "()Lio/github/jan/supabase/SupabaseClient;", "getConfig", "()Lio/github/jan/supabase/storage/Storage$Config;", "pluginKey", "", "getPluginKey", "()Ljava/lang/String;", "apiVersion", "", "getApiVersion", "()I", "serializer", "Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "api", "Lio/github/jan/supabase/auth/AuthenticatedSupabaseApi;", "getApi$storage_kt_release$annotations", "()V", "getApi$storage_kt_release", "()Lio/github/jan/supabase/auth/AuthenticatedSupabaseApi;", "resumableClients", "Lio/github/jan/supabase/collections/AtomicMutableMap;", "Lio/github/jan/supabase/storage/BucketApi;", "retrieveBuckets", "", "Lio/github/jan/supabase/storage/Bucket;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveBucketById", "bucketId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBucket", "", "createBucket", "id", "builder", "Lkotlin/Function1;", "Lio/github/jan/supabase/storage/BucketBuilder;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBucket", "emptyBucket", "get", "parseErrorResponse", "Lio/github/jan/supabase/exceptions/RestException;", "response", "Lio/ktor/client/statement/HttpResponse;", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StorageImpl implements Storage {
    private final AuthenticatedSupabaseApi api;
    private final Storage.Config config;
    private final AtomicMutableMap<String, BucketApi> resumableClients;
    private final SupabaseSerializer serializer;
    private final SupabaseClient supabaseClient;

    @U3.e(c = "io.github.jan.supabase.storage.StorageImpl", f = "Storage.kt", l = {277}, m = "parseErrorResponse", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.storage.StorageImpl$parseErrorResponse$1, reason: invalid class name */
    public static final class AnonymousClass1 extends U3.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StorageImpl.this.parseErrorResponse(null, this);
        }
    }

    @U3.e(c = "io.github.jan.supabase.storage.StorageImpl", f = "Storage.kt", l = {277, 282}, m = "retrieveBucketById", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.storage.StorageImpl$retrieveBucketById$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11481 extends U3.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C11481(S3.c<? super C11481> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StorageImpl.this.retrieveBucketById(null, this);
        }
    }

    @U3.e(c = "io.github.jan.supabase.storage.StorageImpl", f = "Storage.kt", l = {277, 282}, m = "retrieveBuckets", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.storage.StorageImpl$retrieveBuckets$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11491 extends U3.c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C11491(S3.c<? super C11491> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StorageImpl.this.retrieveBuckets(this);
        }
    }

    public StorageImpl(SupabaseClient supabaseClient, Storage.Config config) {
        l.f("supabaseClient", supabaseClient);
        l.f("config", config);
        this.supabaseClient = supabaseClient;
        this.config = config;
        SupabaseSerializer serializer = getConfig().getSerializer();
        this.serializer = serializer == null ? getSupabaseClient().getDefaultSerializer() : serializer;
        this.api = AuthenticatedSupabaseApiKt.authenticatedSupabaseApi(getSupabaseClient(), this, new h(this, 0));
        this.resumableClients = new AtomicMutableMap<>(new O3.l[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C api$lambda$0(StorageImpl storageImpl, HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$authenticatedSupabaseApi", httpRequestBuilder);
        HttpTimeoutKt.timeout(httpRequestBuilder, new h(storageImpl, 1));
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C api$lambda$0$0(StorageImpl storageImpl, HttpTimeoutConfig httpTimeoutConfig) {
        l.f("$this$timeout", httpTimeoutConfig);
        httpTimeoutConfig.setRequestTimeoutMillis(Long.valueOf(A5.a.c(storageImpl.getConfig().m69getTransferTimeoutUwyO8pc())));
        return C.a;
    }

    public static /* synthetic */ void getApi$storage_kt_release$annotations() {
    }

    @Override // io.github.jan.supabase.plugins.SupabasePlugin
    public /* bridge */ Object close(S3.c<? super C> cVar) {
        return super.close(cVar);
    }

    @Override // io.github.jan.supabase.storage.Storage
    public Object createBucket(String str, k kVar, S3.c<? super C> cVar) {
        BucketBuilder bucketBuilder = new BucketBuilder();
        kVar.invoke(bucketBuilder);
        v vVar = new v();
        n6.d.V(ContentDisposition.Parameters.Name, str, vVar);
        n6.d.V("id", str, vVar);
        Boolean bool = bucketBuilder.getPublic();
        n6.d.W(vVar, CacheControl.PUBLIC, Boolean.valueOf(bool != null ? bool.booleanValue() : false));
        List<String> allowedMimeTypes$storage_kt_release = bucketBuilder.getAllowedMimeTypes$storage_kt_release();
        if (allowedMimeTypes$storage_kt_release != null) {
            ArrayList arrayList = new ArrayList(r.p(allowedMimeTypes$storage_kt_release, 10));
            Iterator<T> it = allowedMimeTypes$storage_kt_release.iterator();
            while (it.hasNext()) {
                arrayList.add(a6.l.b((String) it.next()));
            }
            vVar.b("allowed_mime_types", new kotlinx.serialization.json.a(arrayList));
        }
        String fileSizeLimit = bucketBuilder.getFileSizeLimit();
        if (fileSizeLimit != null) {
            n6.d.V("file_size_limit", FileSizeLimit.m59boximpl(fileSizeLimit).m65unboximpl(), vVar);
        }
        final kotlinx.serialization.json.c cVarA = vVar.a();
        AuthenticatedSupabaseApi authenticatedSupabaseApi = this.api;
        final ContentType json = ContentType.Application.INSTANCE.getJson();
        Object objRequest = authenticatedSupabaseApi.request("bucket", new k() { // from class: io.github.jan.supabase.storage.StorageImpl$createBucket$$inlined$postJson$default$1
            @Override // e4.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HttpRequestBuilder) obj);
                return C.a;
            }

            public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                l.f("$this$request", httpRequestBuilder);
                httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
                HttpMessagePropertiesKt.contentType(httpRequestBuilder, json);
                Object obj = cVarA;
                InterfaceC1444w interfaceC1444wA = null;
                if (obj == null) {
                    httpRequestBuilder.setBody(NullBody.INSTANCE);
                    InterfaceC1425d interfaceC1425dB = y.a.b(kotlinx.serialization.json.c.class);
                    try {
                        interfaceC1444wA = y.a(kotlinx.serialization.json.c.class);
                    } catch (Throwable unused) {
                    }
                    AbstractC0703b.z(interfaceC1425dB, interfaceC1444wA, httpRequestBuilder);
                    return;
                }
                if (obj instanceof OutgoingContent) {
                    httpRequestBuilder.setBody(obj);
                    httpRequestBuilder.setBodyType(null);
                } else {
                    httpRequestBuilder.setBody(obj);
                    InterfaceC1425d interfaceC1425dB2 = y.a.b(kotlinx.serialization.json.c.class);
                    try {
                        interfaceC1444wA = y.a(kotlinx.serialization.json.c.class);
                    } catch (Throwable unused2) {
                    }
                    AbstractC0703b.z(interfaceC1425dB2, interfaceC1444wA, httpRequestBuilder);
                }
            }
        }, cVar);
        return objRequest == T3.a.f9048k ? objRequest : C.a;
    }

    @Override // io.github.jan.supabase.storage.Storage
    public Object deleteBucket(String str, S3.c<? super C> cVar) {
        Object objRequest = this.api.request(AbstractC0703b.i("bucket/", str), new k() { // from class: io.github.jan.supabase.storage.StorageImpl$deleteBucket$$inlined$delete$default$1
            @Override // e4.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HttpRequestBuilder) obj);
                return C.a;
            }

            public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                l.f("$this$request", httpRequestBuilder);
                httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
            }
        }, cVar);
        return objRequest == T3.a.f9048k ? objRequest : C.a;
    }

    @Override // io.github.jan.supabase.storage.Storage
    public Object emptyBucket(String str, S3.c<? super C> cVar) {
        Object objRequest = this.api.request(AbstractC0703b.j("bucket/", str, "/empty"), new k() { // from class: io.github.jan.supabase.storage.StorageImpl$emptyBucket$$inlined$post$default$1
            @Override // e4.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HttpRequestBuilder) obj);
                return C.a;
            }

            public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                l.f("$this$request", httpRequestBuilder);
                httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
            }
        }, cVar);
        return objRequest == T3.a.f9048k ? objRequest : C.a;
    }

    @Override // io.github.jan.supabase.storage.Storage
    public /* bridge */ BucketApi from(String str) {
        return super.from(str);
    }

    @Override // io.github.jan.supabase.storage.Storage
    public BucketApi get(String bucketId) {
        l.f("bucketId", bucketId);
        AtomicMutableMap<String, BucketApi> atomicMutableMap = this.resumableClients;
        BucketApi bucketApiImpl = atomicMutableMap.get(bucketId);
        if (bucketApiImpl == null) {
            ResumableCache cache = getConfig().getResumable().getCache();
            if (cache == null) {
                cache = SettingsResumableCacheKt.createDefaultResumableCache();
            }
            bucketApiImpl = new BucketApiImpl(bucketId, this, cache);
            atomicMutableMap.put(bucketId, bucketApiImpl);
        }
        return bucketApiImpl;
    }

    /* renamed from: getApi$storage_kt_release, reason: from getter */
    public final AuthenticatedSupabaseApi getApi() {
        return this.api;
    }

    @Override // io.github.jan.supabase.plugins.MainPlugin
    public int getApiVersion() {
        return 1;
    }

    @Override // io.github.jan.supabase.plugins.SupabasePlugin
    public Storage.Config getConfig() {
        return this.config;
    }

    @Override // io.github.jan.supabase.plugins.MainPlugin
    public String getPluginKey() {
        return Storage.INSTANCE.getKey();
    }

    @Override // io.github.jan.supabase.plugins.CustomSerializationPlugin
    public SupabaseSerializer getSerializer() {
        return this.serializer;
    }

    @Override // io.github.jan.supabase.plugins.SupabasePlugin
    public SupabaseClient getSupabaseClient() {
        return this.supabaseClient;
    }

    @Override // io.github.jan.supabase.plugins.SupabasePlugin
    public /* bridge */ void init() {
        super.init();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.plugins.MainPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object parseErrorResponse(io.ktor.client.statement.HttpResponse r12, S3.c<? super io.github.jan.supabase.exceptions.RestException> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.StorageImpl.parseErrorResponse(io.ktor.client.statement.HttpResponse, S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.plugins.MainPlugin
    public /* bridge */ String resolveUrl(String str) {
        return super.resolveUrl(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.storage.Storage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveBucketById(java.lang.String r8, S3.c<? super io.github.jan.supabase.storage.Bucket> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof io.github.jan.supabase.storage.StorageImpl.C11481
            if (r0 == 0) goto L13
            r0 = r9
            io.github.jan.supabase.storage.StorageImpl$retrieveBucketById$1 r0 = (io.github.jan.supabase.storage.StorageImpl.C11481) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.storage.StorageImpl$retrieveBucketById$1 r0 = new io.github.jan.supabase.storage.StorageImpl$retrieveBucketById$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r8 = r0.L$1
            io.ktor.client.statement.HttpResponse r8 = (io.ktor.client.statement.HttpResponse) r8
            java.lang.Object r8 = r0.L$0
            java.lang.String r8 = (java.lang.String) r8
            P3.r.Y(r9)
            goto L80
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            java.lang.Object r8 = r0.L$2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r0.L$1
            io.github.jan.supabase.network.SupabaseHttpClient r8 = (io.github.jan.supabase.network.SupabaseHttpClient) r8
            java.lang.Object r8 = r0.L$0
            java.lang.String r8 = (java.lang.String) r8
            P3.r.Y(r9)
            goto L6d
        L4c:
            P3.r.Y(r9)
            io.github.jan.supabase.auth.AuthenticatedSupabaseApi r9 = r7.api
            java.lang.String r2 = "bucket/"
            java.lang.String r8 = b1.AbstractC0703b.i(r2, r8)
            io.github.jan.supabase.storage.StorageImpl$retrieveBucketById$$inlined$get$default$1 r2 = new io.github.jan.supabase.storage.StorageImpl$retrieveBucketById$$inlined$get$default$1
            r2.<init>()
            r0.L$0 = r6
            r0.L$1 = r6
            r0.L$2 = r6
            r0.I$0 = r3
            r0.label = r5
            java.lang.Object r9 = r9.request(r8, r2, r0)
            if (r9 != r1) goto L6d
            goto L7f
        L6d:
            io.ktor.client.statement.HttpResponse r9 = (io.ktor.client.statement.HttpResponse) r9
            r0.L$0 = r6
            r0.L$1 = r6
            r0.L$2 = r6
            r0.I$0 = r3
            r0.label = r4
            java.lang.Object r9 = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(r9, r6, r0, r5, r6)
            if (r9 != r1) goto L80
        L7f:
            return r1
        L80:
            java.lang.String r9 = (java.lang.String) r9
            a6.d r8 = io.github.jan.supabase.UtilsKt.getSupabaseJson()     // Catch: V5.b -> L9a
            r8.getClass()     // Catch: V5.b -> L9a
            io.github.jan.supabase.storage.Bucket$Companion r0 = io.github.jan.supabase.storage.Bucket.INSTANCE     // Catch: V5.b -> L9a
            kotlinx.serialization.KSerializer r0 = r0.serializer()     // Catch: V5.b -> L9a
            kotlinx.serialization.KSerializer r0 = n6.m.K(r0)     // Catch: V5.b -> L9a
            kotlinx.serialization.KSerializer r0 = (kotlinx.serialization.KSerializer) r0     // Catch: V5.b -> L9a
            java.lang.Object r8 = r8.b(r9, r0)     // Catch: V5.b -> L9a
            return r8
        L9a:
            io.github.jan.supabase.exceptions.SupabaseEncodingException r8 = new io.github.jan.supabase.exceptions.SupabaseEncodingException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Couldn't decode payload as "
            r0.<init>(r1)
            kotlin.jvm.internal.z r1 = kotlin.jvm.internal.y.a
            java.lang.Class<io.github.jan.supabase.storage.Bucket> r2 = io.github.jan.supabase.storage.Bucket.class
            l4.d r1 = r1.b(r2)
            java.lang.String r1 = r1.n()
            r0.append(r1)
            java.lang.String r1 = ". Input: "
            r0.append(r1)
            java.lang.String r1 = "\n"
            java.lang.String r2 = ""
            java.lang.String r9 = z5.AbstractC2517v.R(r9, r1, r2)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.StorageImpl.retrieveBucketById(java.lang.String, S3.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.storage.Storage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retrieveBuckets(S3.c<? super java.util.List<io.github.jan.supabase.storage.Bucket>> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof io.github.jan.supabase.storage.StorageImpl.C11491
            if (r0 == 0) goto L13
            r0 = r9
            io.github.jan.supabase.storage.StorageImpl$retrieveBuckets$1 r0 = (io.github.jan.supabase.storage.StorageImpl.C11491) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.storage.StorageImpl$retrieveBuckets$1 r0 = new io.github.jan.supabase.storage.StorageImpl$retrieveBuckets$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L44
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r0 = r0.L$0
            io.ktor.client.statement.HttpResponse r0 = (io.ktor.client.statement.HttpResponse) r0
            P3.r.Y(r9)
            goto L70
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r0.L$0
            io.github.jan.supabase.network.SupabaseHttpClient r2 = (io.github.jan.supabase.network.SupabaseHttpClient) r2
            P3.r.Y(r9)
            goto L5f
        L44:
            P3.r.Y(r9)
            io.github.jan.supabase.auth.AuthenticatedSupabaseApi r9 = r8.api
            io.github.jan.supabase.storage.StorageImpl$retrieveBuckets$$inlined$get$default$1 r2 = new io.github.jan.supabase.storage.StorageImpl$retrieveBuckets$$inlined$get$default$1
            r2.<init>()
            r0.L$0 = r6
            r0.L$1 = r6
            r0.I$0 = r3
            r0.label = r5
            java.lang.String r7 = "bucket"
            java.lang.Object r9 = r9.request(r7, r2, r0)
            if (r9 != r1) goto L5f
            goto L6f
        L5f:
            io.ktor.client.statement.HttpResponse r9 = (io.ktor.client.statement.HttpResponse) r9
            r0.L$0 = r6
            r0.L$1 = r6
            r0.I$0 = r3
            r0.label = r4
            java.lang.Object r9 = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(r9, r6, r0, r5, r6)
            if (r9 != r1) goto L70
        L6f:
            return r1
        L70:
            java.lang.String r9 = (java.lang.String) r9
            a6.d r0 = io.github.jan.supabase.UtilsKt.getSupabaseJson()     // Catch: V5.b -> L8a
            r0.getClass()     // Catch: V5.b -> L8a
            Z5.d r1 = new Z5.d     // Catch: V5.b -> L8a
            io.github.jan.supabase.storage.Bucket$Companion r2 = io.github.jan.supabase.storage.Bucket.INSTANCE     // Catch: V5.b -> L8a
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch: V5.b -> L8a
            r3 = 0
            r1.<init>(r2, r3)     // Catch: V5.b -> L8a
            java.lang.Object r9 = r0.b(r9, r1)     // Catch: V5.b -> L8a
            return r9
        L8a:
            io.github.jan.supabase.exceptions.SupabaseEncodingException r0 = new io.github.jan.supabase.exceptions.SupabaseEncodingException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Couldn't decode payload as "
            r1.<init>(r2)
            kotlin.jvm.internal.z r2 = kotlin.jvm.internal.y.a
            java.lang.Class<java.util.List> r3 = java.util.List.class
            l4.d r2 = r2.b(r3)
            java.lang.String r2 = r2.n()
            r1.append(r2)
            java.lang.String r2 = ". Input: "
            r1.append(r2)
            java.lang.String r2 = "\n"
            java.lang.String r3 = ""
            java.lang.String r9 = z5.AbstractC2517v.R(r9, r2, r3)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.StorageImpl.retrieveBuckets(S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.storage.Storage
    public Object updateBucket(String str, k kVar, S3.c<? super C> cVar) {
        BucketBuilder bucketBuilder = new BucketBuilder();
        kVar.invoke(bucketBuilder);
        v vVar = new v();
        n6.d.V(ContentDisposition.Parameters.Name, str, vVar);
        n6.d.V("id", str, vVar);
        if (bucketBuilder.getPublic() != null) {
            n6.d.W(vVar, CacheControl.PUBLIC, bucketBuilder.getPublic());
        }
        List<String> allowedMimeTypes$storage_kt_release = bucketBuilder.getAllowedMimeTypes$storage_kt_release();
        if (allowedMimeTypes$storage_kt_release != null) {
            ArrayList arrayList = new ArrayList(r.p(allowedMimeTypes$storage_kt_release, 10));
            Iterator<T> it = allowedMimeTypes$storage_kt_release.iterator();
            while (it.hasNext()) {
                arrayList.add(a6.l.b((String) it.next()));
            }
            vVar.b("allowed_mime_types", new kotlinx.serialization.json.a(arrayList));
        }
        String fileSizeLimit = bucketBuilder.getFileSizeLimit();
        if (fileSizeLimit != null) {
            n6.d.V("file_size_limit", FileSizeLimit.m59boximpl(fileSizeLimit).m65unboximpl(), vVar);
        }
        final kotlinx.serialization.json.c cVarA = vVar.a();
        AuthenticatedSupabaseApi authenticatedSupabaseApi = this.api;
        String strI = AbstractC0703b.i("bucket/", str);
        final ContentType json = ContentType.Application.INSTANCE.getJson();
        Object objRequest = authenticatedSupabaseApi.request(strI, new k() { // from class: io.github.jan.supabase.storage.StorageImpl$updateBucket$$inlined$putJson$default$1
            @Override // e4.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HttpRequestBuilder) obj);
                return C.a;
            }

            public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                l.f("$this$request", httpRequestBuilder);
                httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
                HttpMessagePropertiesKt.contentType(httpRequestBuilder, json);
                Object obj = cVarA;
                InterfaceC1444w interfaceC1444wA = null;
                if (obj == null) {
                    httpRequestBuilder.setBody(NullBody.INSTANCE);
                    InterfaceC1425d interfaceC1425dB = y.a.b(kotlinx.serialization.json.c.class);
                    try {
                        interfaceC1444wA = y.a(kotlinx.serialization.json.c.class);
                    } catch (Throwable unused) {
                    }
                    AbstractC0703b.z(interfaceC1425dB, interfaceC1444wA, httpRequestBuilder);
                    return;
                }
                if (obj instanceof OutgoingContent) {
                    httpRequestBuilder.setBody(obj);
                    httpRequestBuilder.setBodyType(null);
                } else {
                    httpRequestBuilder.setBody(obj);
                    InterfaceC1425d interfaceC1425dB2 = y.a.b(kotlinx.serialization.json.c.class);
                    try {
                        interfaceC1444wA = y.a(kotlinx.serialization.json.c.class);
                    } catch (Throwable unused2) {
                    }
                    AbstractC0703b.z(interfaceC1425dB2, interfaceC1444wA, httpRequestBuilder);
                }
            }
        }, cVar);
        return objRequest == T3.a.f9048k ? objRequest : C.a;
    }
}
