package io.github.jan.supabase.storage.resumable;

import H5.A;
import H5.AbstractC0281w;
import H5.D;
import K5.G;
import K5.I;
import K5.N;
import K5.W;
import K5.Y;
import O3.C;
import T3.a;
import U3.c;
import U3.e;
import U3.j;
import e4.k;
import e4.n;
import io.github.jan.supabase.auth.Auth;
import io.github.jan.supabase.plugins.SupabasePlugin;
import io.github.jan.supabase.storage.BucketApi;
import io.github.jan.supabase.storage.Storage;
import io.github.jan.supabase.storage.StorageKt;
import io.github.jan.supabase.storage.UploadStatus;
import io.ktor.client.HttpClient;
import io.ktor.http.ContentDisposition;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelKt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u001c\u0010\u0015\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0016\u0012\u001c\u0010\u0017\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u00103\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u00104J\u000e\u00105\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u00104J\u000e\u00106\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u00104J\u000e\u00107\u001a\u000208H\u0082@¢\u0006\u0002\u00104J\b\u00109\u001a\u00020\u0005H\u0002R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010 R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0015\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R&\u0010\u0017\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u000e\u0010\"\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010%R\u000e\u0010&\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lio/github/jan/supabase/storage/resumable/ResumableUploadImpl;", "Lio/github/jan/supabase/storage/resumable/ResumableUpload;", "fingerprint", "Lio/github/jan/supabase/storage/resumable/Fingerprint;", "path", "", "cacheEntry", "Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "createDataStream", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "Lio/ktor/utils/io/ByteReadChannel;", "", "offset", "chunkSize", "locationUrl", "httpClient", "Lio/ktor/client/HttpClient;", "storageApi", "Lio/github/jan/supabase/storage/BucketApi;", "retrieveServerOffset", "Lkotlin/Function1;", "removeFromCache", "", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;Lkotlin/jvm/functions/Function2;JJLjava/lang/String;Lio/ktor/client/HttpClient;Lio/github/jan/supabase/storage/BucketApi;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFingerprint-h-pxtCA", "()Ljava/lang/String;", "Ljava/lang/String;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", ContentDisposition.Parameters.Size, "paused", "Lkotlin/concurrent/atomics/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "serverOffset", "_stateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/github/jan/supabase/storage/resumable/ResumableUploadState;", "stateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "config", "Lio/github/jan/supabase/storage/Storage$Config$Resumable;", "dataStream", "pause", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "startOrResumeUploading", "uploadChunk", "", "accessTokenOrApiKey", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ResumableUploadImpl implements ResumableUpload {
    private final G _stateFlow;
    private final ResumableCacheEntry cacheEntry;
    private final long chunkSize;
    private final Storage.Config.Resumable config;
    private final n createDataStream;
    private ByteReadChannel dataStream;
    private final String fingerprint;
    private final HttpClient httpClient;
    private final String locationUrl;
    private long offset;
    private final String path;
    private final AtomicBoolean paused;
    private final k removeFromCache;
    private final k retrieveServerOffset;
    private final A scope;
    private long serverOffset;
    private final long size;
    private final W stateFlow;
    private final BucketApi storageApi;

    @e(c = "io.github.jan.supabase.storage.resumable.ResumableUploadImpl", f = "ResumableUpload.kt", l = {113}, m = "startOrResumeUploading", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.storage.resumable.ResumableUploadImpl$startOrResumeUploading$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ResumableUploadImpl.this.startOrResumeUploading(this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @e(c = "io.github.jan.supabase.storage.resumable.ResumableUploadImpl$startOrResumeUploading$2", f = "ResumableUpload.kt", l = {121, 124, 128, 134, 140, 149}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.storage.resumable.ResumableUploadImpl$startOrResumeUploading$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements n {
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public AnonymousClass2(S3.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = ResumableUploadImpl.this.new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // e4.n
        public final Object invoke(A a, S3.c<? super C> cVar) {
            return ((AnonymousClass2) create(a, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:71:0x01ff, code lost:
        
            if (H5.D.l(r10, r19) == r3) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x02a7, code lost:
        
            if (r0.invoke(r19) == r3) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x0061, code lost:
        
            r0 = r19.this$0._stateFlow;
            r10 = new io.github.jan.supabase.storage.resumable.ResumableUploadState(r19.this$0.getFingerprint(), r19.this$0.cacheEntry, new io.github.jan.supabase.storage.UploadStatus.Progress(r19.this$0.offset, r19.this$0.size), r19.this$0.paused.get(), null);
            r0 = (K5.Y) r0;
            r0.getClass();
            r0.i(null, r10);
            r9 = r9;
            r7 = 1;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00e8 A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:37:0x00b8, B:40:0x00ce, B:42:0x00e8, B:45:0x010d, B:46:0x0114, B:47:0x0117, B:15:0x0047, B:20:0x0057), top: B:89:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0114 A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:37:0x00b8, B:40:0x00ce, B:42:0x00e8, B:45:0x010d, B:46:0x0114, B:47:0x0117, B:15:0x0047, B:20:0x0057), top: B:89:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0190  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0249  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x017b -> B:23:0x0061). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01ff -> B:73:0x0203). Please report as a decompilation issue!!! */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 724
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.resumable.ResumableUploadImpl.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @e(c = "io.github.jan.supabase.storage.resumable.ResumableUploadImpl", f = "ResumableUpload.kt", l = {158, 226, 185}, m = "uploadChunk", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.storage.resumable.ResumableUploadImpl$uploadChunk$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11541 extends c {
        int I$0;
        int I$1;
        int I$2;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C11541(S3.c<? super C11541> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ResumableUploadImpl.this.uploadChunk(this);
        }
    }

    public /* synthetic */ ResumableUploadImpl(String str, String str2, ResumableCacheEntry resumableCacheEntry, n nVar, long j7, long j8, String str3, HttpClient httpClient, BucketApi bucketApi, k kVar, k kVar2, AbstractC0281w abstractC0281w, f fVar) {
        this(str, str2, resumableCacheEntry, nVar, j7, j8, str3, httpClient, bucketApi, kVar, kVar2, abstractC0281w);
    }

    private final String accessTokenOrApiKey() {
        String strCurrentAccessTokenOrNull;
        SupabasePlugin<?> supabasePlugin = this.storageApi.getSupabaseClient().getPluginManager().getInstalledPlugins().get(Auth.INSTANCE.getKey());
        if (!(supabasePlugin instanceof Auth)) {
            supabasePlugin = null;
        }
        Auth auth = (Auth) supabasePlugin;
        return (auth == null || (strCurrentAccessTokenOrNull = auth.currentAccessTokenOrNull()) == null) ? this.storageApi.getSupabaseClient().getSupabaseKey() : strCurrentAccessTokenOrNull;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uploadChunk(S3.c<? super java.lang.Integer> r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.resumable.ResumableUploadImpl.uploadChunk(S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.storage.resumable.ResumableUpload
    public Object cancel(S3.c<? super C> cVar) {
        D.h(this.scope, null);
        ByteReadChannel byteReadChannel = this.dataStream;
        if (byteReadChannel != null) {
            ByteReadChannelKt.cancel(byteReadChannel);
        }
        Object objInvoke = this.removeFromCache.invoke(cVar);
        return objInvoke == a.f9048k ? objInvoke : C.a;
    }

    @Override // io.github.jan.supabase.storage.resumable.ResumableUpload
    /* renamed from: getFingerprint-h-pxtCA, reason: from getter */
    public String getFingerprint() {
        return this.fingerprint;
    }

    @Override // io.github.jan.supabase.storage.resumable.ResumableUpload
    public W getStateFlow() {
        return this.stateFlow;
    }

    @Override // io.github.jan.supabase.storage.resumable.ResumableUpload
    public Object pause(S3.c<? super C> cVar) {
        this.paused.set(true);
        return C.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.storage.resumable.ResumableUpload
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object startOrResumeUploading(S3.c<? super O3.C> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.github.jan.supabase.storage.resumable.ResumableUploadImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            io.github.jan.supabase.storage.resumable.ResumableUploadImpl$startOrResumeUploading$1 r0 = (io.github.jan.supabase.storage.resumable.ResumableUploadImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.storage.resumable.ResumableUploadImpl$startOrResumeUploading$1 r0 = new io.github.jan.supabase.storage.resumable.ResumableUploadImpl$startOrResumeUploading$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            io.github.jan.supabase.storage.resumable.ResumableUploadImpl r0 = (io.github.jan.supabase.storage.resumable.ResumableUploadImpl) r0
            P3.r.Y(r7)
            goto L55
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            P3.r.Y(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.paused
            r2 = 0
            r7.compareAndSet(r3, r2)
            io.ktor.utils.io.ByteReadChannel r7 = r6.dataStream
            if (r7 != 0) goto L59
            e4.n r7 = r6.createDataStream
            long r4 = r6.offset
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.invoke(r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r0 = r6
        L55:
            io.ktor.utils.io.ByteReadChannel r7 = (io.ktor.utils.io.ByteReadChannel) r7
            r0.dataStream = r7
        L59:
            H5.A r7 = r6.scope
            io.github.jan.supabase.storage.resumable.ResumableUploadImpl$startOrResumeUploading$2 r0 = new io.github.jan.supabase.storage.resumable.ResumableUploadImpl$startOrResumeUploading$2
            r1 = 0
            r0.<init>(r1)
            r2 = 3
            H5.D.x(r7, r1, r0, r2)
            O3.C r7 = O3.C.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.resumable.ResumableUploadImpl.startOrResumeUploading(S3.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ResumableUploadImpl(String str, String str2, ResumableCacheEntry resumableCacheEntry, n nVar, long j7, long j8, String str3, HttpClient httpClient, BucketApi bucketApi, k kVar, k kVar2, AbstractC0281w abstractC0281w) {
        l.f("fingerprint", str);
        l.f("path", str2);
        l.f("cacheEntry", resumableCacheEntry);
        l.f("createDataStream", nVar);
        l.f("locationUrl", str3);
        l.f("httpClient", httpClient);
        l.f("storageApi", bucketApi);
        l.f("retrieveServerOffset", kVar);
        l.f("removeFromCache", kVar2);
        l.f("coroutineDispatcher", abstractC0281w);
        this.fingerprint = str;
        this.path = str2;
        this.cacheEntry = resumableCacheEntry;
        this.createDataStream = nVar;
        this.offset = j7;
        this.chunkSize = j8;
        this.locationUrl = str3;
        this.httpClient = httpClient;
        this.storageApi = bucketApi;
        this.retrieveServerOffset = kVar;
        this.removeFromCache = kVar2;
        long jM90getSizeimpl = Fingerprint.m90getSizeimpl(getFingerprint());
        this.size = jM90getSizeimpl;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.paused = atomicBoolean;
        Y yB = N.b(new ResumableUploadState(getFingerprint(), resumableCacheEntry, new UploadStatus.Progress(this.offset, jM90getSizeimpl), atomicBoolean.get(), null));
        this._stateFlow = yB;
        this.stateFlow = new I(yB);
        this.scope = D.c(abstractC0281w);
        this.config = ((Storage.Config) StorageKt.getStorage(bucketApi.getSupabaseClient()).getConfig()).getResumable();
    }
}
