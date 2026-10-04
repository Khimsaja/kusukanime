package io.github.jan.supabase.storage;

import O3.C;
import P3.m;
import e4.k;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.storage.resumable.ResumableClient;
import io.ktor.client.utils.CacheControl;
import io.ktor.utils.io.ByteChannelCtorKt;
import io.ktor.utils.io.ByteWriteChannel;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000 U2\u00020\u0001:\u0001UJ9\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H\u0096@¢\u0006\u0002\u0010\u0018J9\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00192\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H¦@¢\u0006\u0002\u0010\u001aJA\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H\u0096@¢\u0006\u0002\u0010\u001dJA\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00192\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H¦@¢\u0006\u0002\u0010\u001eJ9\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H\u0096@¢\u0006\u0002\u0010\u0018J9\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00192\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H¦@¢\u0006\u0002\u0010\u001aJ\u001c\u0010 \u001a\u00020\u00162\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\"H¦@¢\u0006\u0002\u0010#J\"\u0010 \u001a\u00020\u00162\u0012\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030$\"\u00020\u0003H\u0096@¢\u0006\u0002\u0010%J*\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003H¦@¢\u0006\u0002\u0010*J*\u0010+\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003H¦@¢\u0006\u0002\u0010*J \u0010,\u001a\u00020-2\u0006\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020/H¦@¢\u0006\u0002\u00100J;\u00101\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u00102\u001a\u0002032\u0019\b\u0002\u00104\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H¦@¢\u0006\u0004\b6\u00107J,\u00108\u001a\b\u0012\u0004\u0012\u00020:092\u0006\u00102\u001a\u0002032\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\"H¦@¢\u0006\u0004\b;\u0010<J2\u00108\u001a\b\u0012\u0004\u0012\u00020:092\u0006\u00102\u001a\u0002032\u0012\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030$\"\u00020\u0003H\u0096@¢\u0006\u0004\b;\u0010=J1\u0010>\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00032\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H¦@¢\u0006\u0002\u0010@J9\u0010>\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010A\u001a\u00020B2\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H¦@¢\u0006\u0002\u0010CJ1\u0010D\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00032\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H¦@¢\u0006\u0002\u0010@J9\u0010D\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010A\u001a\u00020B2\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H¦@¢\u0006\u0002\u0010CJ9\u0010E\u001a\b\u0012\u0004\u0012\u00020F092\b\b\u0002\u0010G\u001a\u00020\u00032\u0019\b\u0002\u0010H\u001a\u0013\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H¦@¢\u0006\u0002\u0010@J\u0016\u0010J\u001a\u00020K2\u0006\u0010\u0010\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010LJ\u0016\u0010M\u001a\u00020/2\u0006\u0010\u0010\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010LJ\u0016\u0010N\u001a\u00020\u00162\u0006\u0010O\u001a\u00020/H¦@¢\u0006\u0002\u0010PJ\u0010\u0010Q\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010R\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H&J+\u0010S\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0019\b\u0002\u00104\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H&J+\u0010T\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0019\b\u0002\u00104\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006VÀ\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/storage/BucketApi;", "", "bucketId", "", "getBucketId", "()Ljava/lang/String;", "supabaseClient", "Lio/github/jan/supabase/SupabaseClient;", "getSupabaseClient", "()Lio/github/jan/supabase/SupabaseClient;", "resumable", "Lio/github/jan/supabase/storage/resumable/ResumableClient;", "getResumable", "()Lio/github/jan/supabase/storage/resumable/ResumableClient;", "upload", "Lio/github/jan/supabase/storage/FileUploadResponse;", "path", "data", "", "options", "Lkotlin/Function1;", "Lio/github/jan/supabase/storage/UploadOptionBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;[BLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/github/jan/supabase/storage/UploadData;", "(Ljava/lang/String;Lio/github/jan/supabase/storage/UploadData;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadToSignedUrl", "token", "(Ljava/lang/String;Ljava/lang/String;[BLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/storage/UploadData;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "delete", "paths", "", "(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "move", "from", "to", "destinationBucket", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copy", "createSignedUploadUrl", "Lio/github/jan/supabase/storage/UploadSignedUrl;", "upsert", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSignedUrl", "expiresIn", "Lkotlin/time/Duration;", "transform", "Lio/github/jan/supabase/storage/ImageTransformation;", "createSignedUrl-dWUq8MI", "(Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSignedUrls", "", "Lio/github/jan/supabase/storage/SignedUrl;", "createSignedUrls-KLykuaI", "(JLjava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(J[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadAuthenticated", "Lio/github/jan/supabase/storage/DownloadOptionBuilder;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "channel", "Lio/ktor/utils/io/ByteWriteChannel;", "(Ljava/lang/String;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadPublic", "list", "Lio/github/jan/supabase/storage/FileObject;", "prefix", "filter", "Lio/github/jan/supabase/storage/BucketListFilter;", "info", "Lio/github/jan/supabase/storage/FileObjectV2;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exists", "changePublicStatusTo", CacheControl.PUBLIC, "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "publicUrl", "authenticatedUrl", "authenticatedRenderUrl", "publicRenderUrl", "Companion", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BucketApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String METADATA_HEADER = "x-metadata";
    public static final String UPSERT_HEADER = "x-upsert";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/storage/BucketApi$Companion;", "", "<init>", "()V", "UPSERT_HEADER", "", "METADATA_HEADER", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String METADATA_HEADER = "x-metadata";
        public static final String UPSERT_HEADER = "x-upsert";

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: createSignedUrls-KLykuaI, reason: not valid java name */
        public static Object m41createSignedUrlsKLykuaI(BucketApi bucketApi, long j7, String[] strArr, S3.c<? super List<SignedUrl>> cVar) {
            return BucketApi.super.mo39createSignedUrlsKLykuaI(j7, strArr, cVar);
        }

        @Deprecated
        public static Object delete(BucketApi bucketApi, String[] strArr, S3.c<? super C> cVar) {
            return BucketApi.super.delete(strArr, cVar);
        }

        @Deprecated
        public static Object update(BucketApi bucketApi, String str, byte[] bArr, k kVar, S3.c<? super FileUploadResponse> cVar) {
            return BucketApi.super.update(str, bArr, kVar, cVar);
        }

        @Deprecated
        public static Object upload(BucketApi bucketApi, String str, byte[] bArr, k kVar, S3.c<? super FileUploadResponse> cVar) {
            return BucketApi.super.upload(str, bArr, kVar, cVar);
        }

        @Deprecated
        public static Object uploadToSignedUrl(BucketApi bucketApi, String str, String str2, byte[] bArr, k kVar, S3.c<? super FileUploadResponse> cVar) {
            return BucketApi.super.uploadToSignedUrl(str, str2, bArr, kVar, cVar);
        }
    }

    static /* synthetic */ String authenticatedRenderUrl$default(BucketApi bucketApi, String str, k kVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: authenticatedRenderUrl");
        }
        if ((i7 & 2) != 0) {
            kVar = new a(8);
        }
        return bucketApi.authenticatedRenderUrl(str, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C authenticatedRenderUrl$lambda$0(ImageTransformation imageTransformation) {
        l.f("<this>", imageTransformation);
        return C.a;
    }

    static /* synthetic */ Object copy$default(BucketApi bucketApi, String str, String str2, String str3, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i7 & 4) != 0) {
            str3 = null;
        }
        return bucketApi.copy(str, str2, str3, cVar);
    }

    static /* synthetic */ Object createSignedUploadUrl$default(BucketApi bucketApi, String str, boolean z7, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSignedUploadUrl");
        }
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        return bucketApi.createSignedUploadUrl(str, z7, cVar);
    }

    /* renamed from: createSignedUrl-dWUq8MI$default, reason: not valid java name */
    static /* synthetic */ Object m35createSignedUrldWUq8MI$default(BucketApi bucketApi, String str, long j7, k kVar, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSignedUrl-dWUq8MI");
        }
        if ((i7 & 4) != 0) {
            kVar = new a(13);
        }
        return bucketApi.mo37createSignedUrldWUq8MI(str, j7, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C createSignedUrl_dWUq8MI$lambda$0(ImageTransformation imageTransformation) {
        l.f("<this>", imageTransformation);
        return C.a;
    }

    /* renamed from: createSignedUrls-KLykuaI$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m36createSignedUrlsKLykuaI$suspendImpl(BucketApi bucketApi, long j7, String[] strArr, S3.c<? super List<SignedUrl>> cVar) {
        return bucketApi.mo38createSignedUrlsKLykuaI(j7, m.u0(strArr), cVar);
    }

    static Object delete$suspendImpl(BucketApi bucketApi, String[] strArr, S3.c<? super C> cVar) {
        Object objDelete = bucketApi.delete(m.u0(strArr), cVar);
        return objDelete == T3.a.f9048k ? objDelete : C.a;
    }

    static /* synthetic */ Object downloadAuthenticated$default(BucketApi bucketApi, String str, k kVar, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadAuthenticated");
        }
        if ((i7 & 2) != 0) {
            kVar = new a(5);
        }
        return bucketApi.downloadAuthenticated(str, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C downloadAuthenticated$lambda$0(DownloadOptionBuilder downloadOptionBuilder) {
        l.f("<this>", downloadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C downloadAuthenticated$lambda$1(DownloadOptionBuilder downloadOptionBuilder) {
        l.f("<this>", downloadOptionBuilder);
        return C.a;
    }

    static /* synthetic */ Object downloadPublic$default(BucketApi bucketApi, String str, k kVar, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadPublic");
        }
        if ((i7 & 2) != 0) {
            kVar = new a(6);
        }
        return bucketApi.downloadPublic(str, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C downloadPublic$lambda$0(DownloadOptionBuilder downloadOptionBuilder) {
        l.f("<this>", downloadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C downloadPublic$lambda$1(DownloadOptionBuilder downloadOptionBuilder) {
        l.f("<this>", downloadOptionBuilder);
        return C.a;
    }

    static /* synthetic */ Object list$default(BucketApi bucketApi, String str, k kVar, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: list");
        }
        if ((i7 & 1) != 0) {
            str = "";
        }
        if ((i7 & 2) != 0) {
            kVar = new a(10);
        }
        return bucketApi.list(str, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C list$lambda$0(BucketListFilter bucketListFilter) {
        l.f("<this>", bucketListFilter);
        return C.a;
    }

    static /* synthetic */ Object move$default(BucketApi bucketApi, String str, String str2, String str3, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: move");
        }
        if ((i7 & 4) != 0) {
            str3 = null;
        }
        return bucketApi.move(str, str2, str3, cVar);
    }

    static /* synthetic */ String publicRenderUrl$default(BucketApi bucketApi, String str, k kVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: publicRenderUrl");
        }
        if ((i7 & 2) != 0) {
            kVar = new a(11);
        }
        return bucketApi.publicRenderUrl(str, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C publicRenderUrl$lambda$0(ImageTransformation imageTransformation) {
        l.f("<this>", imageTransformation);
        return C.a;
    }

    static /* synthetic */ Object update$default(BucketApi bucketApi, String str, byte[] bArr, k kVar, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i7 & 4) != 0) {
            kVar = new a(9);
        }
        return bucketApi.update(str, bArr, kVar, (S3.c<? super FileUploadResponse>) cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C update$lambda$0(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C update$lambda$2(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    static /* synthetic */ Object update$suspendImpl(BucketApi bucketApi, String str, byte[] bArr, k kVar, S3.c<? super FileUploadResponse> cVar) {
        if (bArr.length == 0) {
            throw new IllegalArgumentException("The data to upload should not be empty");
        }
        return bucketApi.update(str, new UploadData(ByteChannelCtorKt.ByteReadChannel$default(bArr, 0, 0, 6, null), bArr.length), kVar, cVar);
    }

    static /* synthetic */ Object upload$default(BucketApi bucketApi, String str, byte[] bArr, k kVar, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: upload");
        }
        if ((i7 & 4) != 0) {
            kVar = new a(15);
        }
        return bucketApi.upload(str, bArr, kVar, (S3.c<? super FileUploadResponse>) cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C upload$lambda$0(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C upload$lambda$2(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    static /* synthetic */ Object upload$suspendImpl(BucketApi bucketApi, String str, byte[] bArr, k kVar, S3.c<? super FileUploadResponse> cVar) {
        if (bArr.length == 0) {
            throw new IllegalArgumentException("The data to upload should not be empty");
        }
        return bucketApi.upload(str, new UploadData(ByteChannelCtorKt.ByteReadChannel$default(bArr, 0, 0, 6, null), bArr.length), kVar, cVar);
    }

    static /* synthetic */ Object uploadToSignedUrl$default(BucketApi bucketApi, String str, String str2, byte[] bArr, k kVar, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadToSignedUrl");
        }
        if ((i7 & 8) != 0) {
            kVar = new a(7);
        }
        return bucketApi.uploadToSignedUrl(str, str2, bArr, kVar, (S3.c<? super FileUploadResponse>) cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C uploadToSignedUrl$lambda$0(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C uploadToSignedUrl$lambda$2(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    static /* synthetic */ Object uploadToSignedUrl$suspendImpl(BucketApi bucketApi, String str, String str2, byte[] bArr, k kVar, S3.c<? super FileUploadResponse> cVar) {
        if (bArr.length == 0) {
            throw new IllegalArgumentException("The data to upload should not be empty");
        }
        return bucketApi.uploadToSignedUrl(str, str2, new UploadData(ByteChannelCtorKt.ByteReadChannel$default(bArr, 0, 0, 6, null), bArr.length), kVar, cVar);
    }

    String authenticatedRenderUrl(String str, k kVar);

    String authenticatedUrl(String path);

    Object changePublicStatusTo(boolean z7, S3.c<? super C> cVar);

    Object copy(String str, String str2, String str3, S3.c<? super C> cVar);

    Object createSignedUploadUrl(String str, boolean z7, S3.c<? super UploadSignedUrl> cVar);

    /* renamed from: createSignedUrl-dWUq8MI, reason: not valid java name */
    Object mo37createSignedUrldWUq8MI(String str, long j7, k kVar, S3.c<? super String> cVar);

    /* renamed from: createSignedUrls-KLykuaI, reason: not valid java name */
    Object mo38createSignedUrlsKLykuaI(long j7, Collection<String> collection, S3.c<? super List<SignedUrl>> cVar);

    /* renamed from: createSignedUrls-KLykuaI, reason: not valid java name */
    default Object mo39createSignedUrlsKLykuaI(long j7, String[] strArr, S3.c<? super List<SignedUrl>> cVar) {
        return m36createSignedUrlsKLykuaI$suspendImpl(this, j7, strArr, cVar);
    }

    Object delete(Collection<String> collection, S3.c<? super C> cVar);

    default Object delete(String[] strArr, S3.c<? super C> cVar) {
        return delete$suspendImpl(this, strArr, cVar);
    }

    Object downloadAuthenticated(String str, k kVar, S3.c<? super byte[]> cVar);

    Object downloadAuthenticated(String str, ByteWriteChannel byteWriteChannel, k kVar, S3.c<? super C> cVar);

    Object downloadPublic(String str, k kVar, S3.c<? super byte[]> cVar);

    Object downloadPublic(String str, ByteWriteChannel byteWriteChannel, k kVar, S3.c<? super C> cVar);

    Object exists(String str, S3.c<? super Boolean> cVar);

    String getBucketId();

    ResumableClient getResumable();

    SupabaseClient getSupabaseClient();

    Object info(String str, S3.c<? super FileObjectV2> cVar);

    Object list(String str, k kVar, S3.c<? super List<FileObject>> cVar);

    Object move(String str, String str2, String str3, S3.c<? super C> cVar);

    String publicRenderUrl(String str, k kVar);

    String publicUrl(String path);

    Object update(String str, UploadData uploadData, k kVar, S3.c<? super FileUploadResponse> cVar);

    default Object update(String str, byte[] bArr, k kVar, S3.c<? super FileUploadResponse> cVar) {
        return update$suspendImpl(this, str, bArr, kVar, cVar);
    }

    Object upload(String str, UploadData uploadData, k kVar, S3.c<? super FileUploadResponse> cVar);

    default Object upload(String str, byte[] bArr, k kVar, S3.c<? super FileUploadResponse> cVar) {
        return upload$suspendImpl(this, str, bArr, kVar, cVar);
    }

    Object uploadToSignedUrl(String str, String str2, UploadData uploadData, k kVar, S3.c<? super FileUploadResponse> cVar);

    default Object uploadToSignedUrl(String str, String str2, byte[] bArr, k kVar, S3.c<? super FileUploadResponse> cVar) {
        return uploadToSignedUrl$suspendImpl(this, str, str2, bArr, kVar, cVar);
    }

    static /* synthetic */ Object downloadAuthenticated$default(BucketApi bucketApi, String str, ByteWriteChannel byteWriteChannel, k kVar, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadAuthenticated");
        }
        if ((i7 & 4) != 0) {
            kVar = new a(17);
        }
        return bucketApi.downloadAuthenticated(str, byteWriteChannel, kVar, cVar);
    }

    static /* synthetic */ Object downloadPublic$default(BucketApi bucketApi, String str, ByteWriteChannel byteWriteChannel, k kVar, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadPublic");
        }
        if ((i7 & 4) != 0) {
            kVar = new a(14);
        }
        return bucketApi.downloadPublic(str, byteWriteChannel, kVar, cVar);
    }

    static /* synthetic */ Object update$default(BucketApi bucketApi, String str, UploadData uploadData, k kVar, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i7 & 4) != 0) {
            kVar = new a(16);
        }
        return bucketApi.update(str, uploadData, kVar, (S3.c<? super FileUploadResponse>) cVar);
    }

    static /* synthetic */ Object upload$default(BucketApi bucketApi, String str, UploadData uploadData, k kVar, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: upload");
        }
        if ((i7 & 4) != 0) {
            kVar = new a(12);
        }
        return bucketApi.upload(str, uploadData, kVar, (S3.c<? super FileUploadResponse>) cVar);
    }

    static /* synthetic */ Object uploadToSignedUrl$default(BucketApi bucketApi, String str, String str2, UploadData uploadData, k kVar, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadToSignedUrl");
        }
        if ((i7 & 8) != 0) {
            kVar = new a(18);
        }
        return bucketApi.uploadToSignedUrl(str, str2, uploadData, kVar, (S3.c<? super FileUploadResponse>) cVar);
    }
}
