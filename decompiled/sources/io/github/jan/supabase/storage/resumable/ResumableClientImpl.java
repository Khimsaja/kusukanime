package io.github.jan.supabase.storage.resumable;

import O3.C;
import P3.q;
import P3.r;
import Q3.g;
import T3.a;
import U3.c;
import U3.e;
import U3.j;
import a4.C0665c;
import e4.k;
import io.github.jan.supabase.auth.Auth;
import io.github.jan.supabase.plugins.SupabasePlugin;
import io.github.jan.supabase.storage.BucketApi;
import io.github.jan.supabase.storage.Storage;
import io.github.jan.supabase.storage.StorageKt;
import io.github.jan.supabase.storage.UploadOptionBuilder;
import io.github.jan.supabase.storage.f;
import io.ktor.client.HttpClient;
import io.ktor.http.ContentDisposition;
import io.ktor.http.ContentType;
import io.ktor.http.FileContentTypeKt;
import io.ktor.utils.io.core.StringsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Jb\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112F\u0010\u0014\u001aB\b\u0001\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0015H\u0096@¢\u0006\u0002\u0010\u001dJr\u0010\u001e\u001a\u00020\u001321\u0010\u001f\u001a-\b\u0001\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001c0 2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\r2\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$¢\u0006\u0002\b'H\u0096@¢\u0006\u0002\u0010(Jc\u0010)\u001a\u00020*2\"\u0010\u001f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001c0 2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u000f2\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$¢\u0006\u0002\b'H\u0082@¢\u0006\u0002\u0010+JR\u0010,\u001a\u00020*2\"\u0010\u001f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001c0 2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010/J\u001e\u00100\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rH\u0082@¢\u0006\u0002\u00101J\b\u00102\u001a\u00020\rH\u0002J(\u00103\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r042\u0006\u0010\"\u001a\u00020\r2\n\b\u0002\u00105\u001a\u0004\u0018\u000106H\u0002J\u001c\u00107\u001a\u00020\r2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r04H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lio/github/jan/supabase/storage/resumable/ResumableClientImpl;", "Lio/github/jan/supabase/storage/resumable/ResumableClient;", "storageApi", "Lio/github/jan/supabase/storage/BucketApi;", "cache", "Lio/github/jan/supabase/storage/resumable/ResumableCache;", "<init>", "(Lio/github/jan/supabase/storage/BucketApi;Lio/github/jan/supabase/storage/resumable/ResumableCache;)V", "httpClient", "Lio/ktor/client/HttpClient;", "getHttpClient$annotations", "()V", "url", "", "chunkSize", "", "continuePreviousUploads", "", "Lkotlinx/coroutines/Deferred;", "Lio/github/jan/supabase/storage/resumable/ResumableUpload;", "channelProducer", "Lkotlin/Function3;", "Lkotlin/ParameterName;", ContentDisposition.Parameters.Name, "source", "offset", "Lkotlin/coroutines/Continuation;", "Lio/ktor/utils/io/ByteReadChannel;", "", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createOrContinueUpload", "channel", "Lkotlin/Function2;", ContentDisposition.Parameters.Size, "path", "options", "Lkotlin/Function1;", "Lio/github/jan/supabase/storage/UploadOptionBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Ljava/lang/String;JLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createUpload", "Lio/github/jan/supabase/storage/resumable/ResumableUploadImpl;", "(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resumeUpload", "entry", "Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "(Lkotlin/jvm/functions/Function2;Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveServerOffset", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accessTokenOrApiKey", "createMetadata", "", "contentType", "Lio/ktor/http/ContentType;", "encodeMetadata", "metadata", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ResumableClientImpl implements ResumableClient {
    private final ResumableCache cache;
    private final long chunkSize;
    private final HttpClient httpClient;
    private final BucketApi storageApi;
    private final String url;

    @e(c = "io.github.jan.supabase.storage.resumable.ResumableClientImpl", f = "ResumableClient.kt", l = {83, 86}, m = "continuePreviousUploads", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.storage.resumable.ResumableClientImpl$continuePreviousUploads$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ResumableClientImpl.this.continuePreviousUploads(null, this);
        }
    }

    @e(c = "io.github.jan.supabase.storage.resumable.ResumableClientImpl", f = "ResumableClient.kt", l = {101, 104, 106}, m = "createOrContinueUpload", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.storage.resumable.ResumableClientImpl$createOrContinueUpload$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11501 extends c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C11501(S3.c<? super C11501> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ResumableClientImpl.this.createOrContinueUpload(null, null, 0L, null, null, this);
        }
    }

    @e(c = "io.github.jan.supabase.storage.resumable.ResumableClientImpl", f = "ResumableClient.kt", l = {212, 121, 127}, m = "createUpload", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.storage.resumable.ResumableClientImpl$createUpload$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11511 extends c {
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
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public C11511(S3.c<? super C11511> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ResumableClientImpl.this.createUpload(null, null, null, 0L, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @e(c = "io.github.jan.supabase.storage.resumable.ResumableClientImpl$createUpload$2", f = "ResumableClient.kt", l = {138}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.storage.resumable.ResumableClientImpl$createUpload$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements k {
        final /* synthetic */ String $path;
        final /* synthetic */ String $uploadUrl;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, S3.c<? super AnonymousClass2> cVar) {
            super(1, cVar);
            this.$uploadUrl = str;
            this.$path = str2;
        }

        @Override // U3.a
        public final S3.c<C> create(S3.c<?> cVar) {
            return ResumableClientImpl.this.new AnonymousClass2(this.$uploadUrl, this.$path, cVar);
        }

        @Override // e4.k
        public final Object invoke(S3.c<? super Long> cVar) {
            return ((AnonymousClass2) create(cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar = a.f9048k;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
                return obj;
            }
            r.Y(obj);
            ResumableClientImpl resumableClientImpl = ResumableClientImpl.this;
            String str = this.$uploadUrl;
            String str2 = this.$path;
            this.label = 1;
            Object objRetrieveServerOffset = resumableClientImpl.retrieveServerOffset(str, str2, this);
            return objRetrieveServerOffset == aVar ? aVar : objRetrieveServerOffset;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @e(c = "io.github.jan.supabase.storage.resumable.ResumableClientImpl$createUpload$3", f = "ResumableClient.kt", l = {139}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.storage.resumable.ResumableClientImpl$createUpload$3, reason: invalid class name */
    public static final class AnonymousClass3 extends j implements k {
        final /* synthetic */ String $fingerprint;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, S3.c<? super AnonymousClass3> cVar) {
            super(1, cVar);
            this.$fingerprint = str;
        }

        @Override // U3.a
        public final S3.c<C> create(S3.c<?> cVar) {
            return ResumableClientImpl.this.new AnonymousClass3(this.$fingerprint, cVar);
        }

        @Override // e4.k
        public final Object invoke(S3.c<? super C> cVar) {
            return ((AnonymousClass3) create(cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar = a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                ResumableCache resumableCache = ResumableClientImpl.this.cache;
                String str = this.$fingerprint;
                this.label = 1;
                if (resumableCache.mo98removeiiNwMIM(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
            return C.a;
        }
    }

    @e(c = "io.github.jan.supabase.storage.resumable.ResumableClientImpl", f = "ResumableClient.kt", l = {148, 149, 154}, m = "resumeUpload", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.storage.resumable.ResumableClientImpl$resumeUpload$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11521 extends c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C11521(S3.c<? super C11521> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ResumableClientImpl.this.resumeUpload(null, null, null, null, 0L, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @e(c = "io.github.jan.supabase.storage.resumable.ResumableClientImpl$resumeUpload$4", f = "ResumableClient.kt", l = {166}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.storage.resumable.ResumableClientImpl$resumeUpload$4, reason: invalid class name */
    public static final class AnonymousClass4 extends j implements k {
        final /* synthetic */ ResumableCacheEntry $entry;
        final /* synthetic */ String $path;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ResumableCacheEntry resumableCacheEntry, String str, S3.c<? super AnonymousClass4> cVar) {
            super(1, cVar);
            this.$entry = resumableCacheEntry;
            this.$path = str;
        }

        @Override // U3.a
        public final S3.c<C> create(S3.c<?> cVar) {
            return ResumableClientImpl.this.new AnonymousClass4(this.$entry, this.$path, cVar);
        }

        @Override // e4.k
        public final Object invoke(S3.c<? super Long> cVar) {
            return ((AnonymousClass4) create(cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar = a.f9048k;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
                return obj;
            }
            r.Y(obj);
            ResumableClientImpl resumableClientImpl = ResumableClientImpl.this;
            String url = this.$entry.getUrl();
            String str = this.$path;
            this.label = 1;
            Object objRetrieveServerOffset = resumableClientImpl.retrieveServerOffset(url, str, this);
            return objRetrieveServerOffset == aVar ? aVar : objRetrieveServerOffset;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @e(c = "io.github.jan.supabase.storage.resumable.ResumableClientImpl$resumeUpload$5", f = "ResumableClient.kt", l = {167}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.storage.resumable.ResumableClientImpl$resumeUpload$5, reason: invalid class name */
    public static final class AnonymousClass5 extends j implements k {
        final /* synthetic */ String $fingerprint;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, S3.c<? super AnonymousClass5> cVar) {
            super(1, cVar);
            this.$fingerprint = str;
        }

        @Override // U3.a
        public final S3.c<C> create(S3.c<?> cVar) {
            return ResumableClientImpl.this.new AnonymousClass5(this.$fingerprint, cVar);
        }

        @Override // e4.k
        public final Object invoke(S3.c<? super C> cVar) {
            return ((AnonymousClass5) create(cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar = a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                ResumableCache resumableCache = ResumableClientImpl.this.cache;
                String str = this.$fingerprint;
                this.label = 1;
                if (resumableCache.mo98removeiiNwMIM(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
            return C.a;
        }
    }

    @e(c = "io.github.jan.supabase.storage.resumable.ResumableClientImpl", f = "ResumableClient.kt", l = {207, 179}, m = "retrieveServerOffset", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.storage.resumable.ResumableClientImpl$retrieveServerOffset$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11531 extends c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C11531(S3.c<? super C11531> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ResumableClientImpl.this.retrieveServerOffset(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResumableClientImpl(BucketApi bucketApi, ResumableCache resumableCache) {
        l.f("storageApi", bucketApi);
        l.f("cache", resumableCache);
        this.storageApi = bucketApi;
        this.cache = resumableCache;
        this.httpClient = bucketApi.getSupabaseClient().getHttpClient().getHttpClient();
        this.url = StorageKt.getStorage(bucketApi.getSupabaseClient()).resolveUrl("upload/resumable");
        this.chunkSize = ((Storage.Config) StorageKt.getStorage(bucketApi.getSupabaseClient()).getConfig()).getResumable().getDefaultChunkSize();
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

    private final Map<String, String> createMetadata(String path, ContentType contentType) {
        String string;
        g gVar = new g();
        gVar.put("bucketName", this.storageApi.getBucketId());
        gVar.put("objectName", path);
        if (contentType == null || (string = contentType.toString()) == null) {
            string = FileContentTypeKt.defaultForFilePath(ContentType.INSTANCE, path).toString();
        }
        gVar.put("contentType", string);
        return gVar.b();
    }

    public static /* synthetic */ Map createMetadata$default(ResumableClientImpl resumableClientImpl, String str, ContentType contentType, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            contentType = null;
        }
        return resumableClientImpl.createMetadata(str, contentType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01b3, code lost:
    
        if (r4 == r6) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createUpload(e4.n r35, java.lang.String r36, java.lang.String r37, long r38, e4.k r40, S3.c<? super io.github.jan.supabase.storage.resumable.ResumableUploadImpl> r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.resumable.ResumableClientImpl.createUpload(e4.n, java.lang.String, java.lang.String, long, e4.k, S3.c):java.lang.Object");
    }

    private final String encodeMetadata(Map<String, String> metadata) {
        return q.y0(metadata.entrySet(), ",", null, null, new f(28), 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence encodeMetadata$lambda$0(Map.Entry entry) {
        l.f("<destruct>", entry);
        return ((String) entry.getKey()) + ' ' + C0665c.a(C0665c.f10439e, StringsKt.toByteArray$default((String) entry.getValue(), null, 1, null));
    }

    private static /* synthetic */ void getHttpClient$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resumeUpload(e4.n r34, io.github.jan.supabase.storage.resumable.ResumableCacheEntry r35, java.lang.String r36, java.lang.String r37, long r38, S3.c<? super io.github.jan.supabase.storage.resumable.ResumableUploadImpl> r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.resumable.ResumableClientImpl.resumeUpload(e4.n, io.github.jan.supabase.storage.resumable.ResumableCacheEntry, java.lang.String, java.lang.String, long, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C resumeUpload$lambda$1(ResumableCacheEntry resumableCacheEntry, UploadOptionBuilder uploadOptionBuilder) {
        l.f("$this$createUpload", uploadOptionBuilder);
        uploadOptionBuilder.setUpsert(resumableCacheEntry.getUpsert());
        uploadOptionBuilder.setContentType(ContentType.INSTANCE.parse(resumableCacheEntry.getContentType()));
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e2, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object retrieveServerOffset(java.lang.String r8, java.lang.String r9, S3.c<? super java.lang.Long> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.resumable.ResumableClientImpl.retrieveServerOffset(java.lang.String, java.lang.String, S3.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (r0 == r6) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x010d -> B:32:0x010e). Please report as a decompilation issue!!! */
    @Override // io.github.jan.supabase.storage.resumable.ResumableClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object continuePreviousUploads(e4.o r17, S3.c<? super java.util.List<? extends H5.G>> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.resumable.ResumableClientImpl.continuePreviousUploads(e4.o, S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.storage.resumable.ResumableClient
    public /* bridge */ Object createOrContinueUpload(byte[] bArr, String str, String str2, k kVar, S3.c<? super ResumableUpload> cVar) {
        return super.createOrContinueUpload(bArr, str, str2, kVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // io.github.jan.supabase.storage.resumable.ResumableClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object createOrContinueUpload(e4.n r17, java.lang.String r18, long r19, java.lang.String r21, e4.k r22, S3.c<? super io.github.jan.supabase.storage.resumable.ResumableUpload> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.resumable.ResumableClientImpl.createOrContinueUpload(e4.n, java.lang.String, long, java.lang.String, e4.k, S3.c):java.lang.Object");
    }
}
