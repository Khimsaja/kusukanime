package io.github.jan.supabase.storage;

import K5.InterfaceC0329h;
import O3.C;
import e4.k;
import io.ktor.util.cio.FileChannelsAtNioPathKt;
import io.ktor.util.cio.FileChannelsKt;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086@¢\u0006\u0002\u0010\f\u001a;\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b\u001a=\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00102\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086@¢\u0006\u0002\u0010\u0011\u001a;\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00102\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b\u001aE\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086@¢\u0006\u0002\u0010\u0014\u001aC\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b\u001aE\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00102\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086@¢\u0006\u0002\u0010\u0016\u001aC\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00102\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b\u001a=\u0010\u0017\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00102\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086@¢\u0006\u0002\u0010\u0011\u001a;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00102\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b\u001a=\u0010\u0017\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086@¢\u0006\u0002\u0010\f\u001a;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b\u001a=\u0010\u0019\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086@¢\u0006\u0002\u0010\f\u001a;\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b\u001a=\u0010\u0019\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00102\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086@¢\u0006\u0002\u0010\u0011\u001a;\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00102\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b\u001a=\u0010\u001d\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086@¢\u0006\u0002\u0010\f\u001a;\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b\u001a=\u0010\u001d\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00102\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086@¢\u0006\u0002\u0010\u0011\u001a;\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00102\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¨\u0006\u001f"}, d2 = {"upload", "Lio/github/jan/supabase/storage/FileUploadResponse;", "Lio/github/jan/supabase/storage/BucketApi;", "path", "", "file", "Ljava/io/File;", "options", "Lkotlin/Function1;", "Lio/github/jan/supabase/storage/UploadOptionBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lio/github/jan/supabase/storage/BucketApi;Ljava/lang/String;Ljava/io/File;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadAsFlow", "Lkotlinx/coroutines/flow/Flow;", "Lio/github/jan/supabase/storage/UploadStatus;", "Ljava/nio/file/Path;", "(Lio/github/jan/supabase/storage/BucketApi;Ljava/lang/String;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadToSignedUrl", "token", "(Lio/github/jan/supabase/storage/BucketApi;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadToSignedUrlAsFlow", "(Lio/github/jan/supabase/storage/BucketApi;Ljava/lang/String;Ljava/lang/String;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "updateAsFlow", "downloadAuthenticatedTo", "Lio/github/jan/supabase/storage/DownloadOptionBuilder;", "downloadAuthenticatedToAsFlow", "Lio/github/jan/supabase/storage/DownloadStatus;", "downloadPublicTo", "downloadPublicToAsFlow", "storage-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JvmUtilsKt {

    @U3.e(c = "io.github.jan.supabase.storage.JvmUtilsKt", f = "JvmUtils.kt", l = {177}, m = "downloadPublicTo", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.storage.JvmUtilsKt$downloadPublicTo$3, reason: invalid class name */
    public static final class AnonymousClass3 extends U3.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(S3.c<? super AnonymousClass3> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JvmUtilsKt.downloadPublicTo((BucketApi) null, (String) null, (Path) null, (k) null, this);
        }
    }

    public static final Object downloadAuthenticatedTo(BucketApi bucketApi, String str, File file, k kVar, S3.c<? super C> cVar) {
        Object objDownloadAuthenticated = bucketApi.downloadAuthenticated(str, FileChannelsKt.writeChannel$default(file, null, 1, null), kVar, cVar);
        return objDownloadAuthenticated == T3.a.f9048k ? objDownloadAuthenticated : C.a;
    }

    public static /* synthetic */ Object downloadAuthenticatedTo$default(BucketApi bucketApi, String str, File file, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new f(15);
        }
        return downloadAuthenticatedTo(bucketApi, str, file, kVar, (S3.c<? super C>) cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C downloadAuthenticatedTo$lambda$0(DownloadOptionBuilder downloadOptionBuilder) {
        l.f("<this>", downloadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C downloadAuthenticatedTo$lambda$1(DownloadOptionBuilder downloadOptionBuilder) {
        l.f("<this>", downloadOptionBuilder);
        return C.a;
    }

    public static final InterfaceC0329h downloadAuthenticatedToAsFlow(BucketApi bucketApi, String str, File file, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("file", file);
        l.f("options", kVar);
        return FlowExtensionKt.downloadAuthenticatedAsFlow(bucketApi, str, FileChannelsKt.writeChannel$default(file, null, 1, null), kVar);
    }

    public static /* synthetic */ InterfaceC0329h downloadAuthenticatedToAsFlow$default(BucketApi bucketApi, String str, File file, k kVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new f(11);
        }
        return downloadAuthenticatedToAsFlow(bucketApi, str, file, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C downloadAuthenticatedToAsFlow$lambda$0(DownloadOptionBuilder downloadOptionBuilder) {
        l.f("<this>", downloadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C downloadAuthenticatedToAsFlow$lambda$1(DownloadOptionBuilder downloadOptionBuilder) {
        l.f("<this>", downloadOptionBuilder);
        return C.a;
    }

    public static final Object downloadPublicTo(BucketApi bucketApi, String str, File file, k kVar, S3.c<? super C> cVar) {
        Object objDownloadPublic = bucketApi.downloadPublic(str, FileChannelsKt.writeChannel$default(file, null, 1, null), kVar, cVar);
        return objDownloadPublic == T3.a.f9048k ? objDownloadPublic : C.a;
    }

    public static /* synthetic */ Object downloadPublicTo$default(BucketApi bucketApi, String str, File file, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new f(5);
        }
        return downloadPublicTo(bucketApi, str, file, kVar, (S3.c<? super C>) cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C downloadPublicTo$lambda$0(DownloadOptionBuilder downloadOptionBuilder) {
        l.f("<this>", downloadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C downloadPublicTo$lambda$1(DownloadOptionBuilder downloadOptionBuilder) {
        l.f("<this>", downloadOptionBuilder);
        return C.a;
    }

    public static final InterfaceC0329h downloadPublicToAsFlow(BucketApi bucketApi, String str, File file, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("file", file);
        l.f("options", kVar);
        return FlowExtensionKt.downloadPublicAsFlow(bucketApi, str, FileChannelsKt.writeChannel$default(file, null, 1, null), kVar);
    }

    public static /* synthetic */ InterfaceC0329h downloadPublicToAsFlow$default(BucketApi bucketApi, String str, File file, k kVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new f(10);
        }
        return downloadPublicToAsFlow(bucketApi, str, file, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C downloadPublicToAsFlow$lambda$0(DownloadOptionBuilder downloadOptionBuilder) {
        l.f("<this>", downloadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C downloadPublicToAsFlow$lambda$1(DownloadOptionBuilder downloadOptionBuilder) {
        l.f("<this>", downloadOptionBuilder);
        return C.a;
    }

    public static final Object update(BucketApi bucketApi, String str, Path path, k kVar, S3.c<? super FileUploadResponse> cVar) {
        return bucketApi.update(str, new UploadData(FileChannelsAtNioPathKt.readChannel$default(path, 0L, 0L, null, 7, null), Files.size(path)), kVar, cVar);
    }

    public static /* synthetic */ Object update$default(BucketApi bucketApi, String str, Path path, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new f(18);
        }
        return update(bucketApi, str, path, kVar, (S3.c<? super FileUploadResponse>) cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C update$lambda$0(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C update$lambda$1(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    public static final InterfaceC0329h updateAsFlow(BucketApi bucketApi, String str, Path path, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("file", path);
        l.f("options", kVar);
        return FlowExtensionKt.updateAsFlow(bucketApi, str, new UploadData(FileChannelsAtNioPathKt.readChannel$default(path, 0L, 0L, null, 7, null), Files.size(path)), kVar);
    }

    public static /* synthetic */ InterfaceC0329h updateAsFlow$default(BucketApi bucketApi, String str, Path path, k kVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new f(17);
        }
        return updateAsFlow(bucketApi, str, path, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C updateAsFlow$lambda$0(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C updateAsFlow$lambda$1(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    public static final Object upload(BucketApi bucketApi, String str, File file, k kVar, S3.c<? super FileUploadResponse> cVar) {
        return bucketApi.upload(str, new UploadData(FileChannelsKt.readChannel$default(file, 0L, 0L, null, 7, null), file.length()), kVar, cVar);
    }

    public static /* synthetic */ Object upload$default(BucketApi bucketApi, String str, File file, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new f(13);
        }
        return upload(bucketApi, str, file, kVar, (S3.c<? super FileUploadResponse>) cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C upload$lambda$0(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C upload$lambda$1(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    public static final InterfaceC0329h uploadAsFlow(BucketApi bucketApi, String str, File file, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("file", file);
        l.f("options", kVar);
        return FlowExtensionKt.uploadAsFlow(bucketApi, str, new UploadData(FileChannelsKt.readChannel$default(file, 0L, 0L, null, 7, null), file.length()), kVar);
    }

    public static /* synthetic */ InterfaceC0329h uploadAsFlow$default(BucketApi bucketApi, String str, File file, k kVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new f(19);
        }
        return uploadAsFlow(bucketApi, str, file, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C uploadAsFlow$lambda$0(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C uploadAsFlow$lambda$1(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    public static final Object uploadToSignedUrl(BucketApi bucketApi, String str, String str2, File file, k kVar, S3.c<? super FileUploadResponse> cVar) {
        return bucketApi.uploadToSignedUrl(str, str2, new UploadData(FileChannelsKt.readChannel$default(file, 0L, 0L, null, 7, null), file.length()), kVar, cVar);
    }

    public static /* synthetic */ Object uploadToSignedUrl$default(BucketApi bucketApi, String str, String str2, File file, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            kVar = new f(14);
        }
        return uploadToSignedUrl(bucketApi, str, str2, file, kVar, (S3.c<? super FileUploadResponse>) cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C uploadToSignedUrl$lambda$0(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C uploadToSignedUrl$lambda$1(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    public static final InterfaceC0329h uploadToSignedUrlAsFlow(BucketApi bucketApi, String str, String str2, File file, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("token", str2);
        l.f("file", file);
        l.f("options", kVar);
        return FlowExtensionKt.uploadToSignedUrlAsFlow(bucketApi, str, str2, new UploadData(FileChannelsKt.readChannel$default(file, 0L, 0L, null, 7, null), file.length()), kVar);
    }

    public static /* synthetic */ InterfaceC0329h uploadToSignedUrlAsFlow$default(BucketApi bucketApi, String str, String str2, File file, k kVar, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            kVar = new f(7);
        }
        return uploadToSignedUrlAsFlow(bucketApi, str, str2, file, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C uploadToSignedUrlAsFlow$lambda$0(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C uploadToSignedUrlAsFlow$lambda$1(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    public static final Object downloadAuthenticatedTo(BucketApi bucketApi, String str, Path path, k kVar, S3.c<? super C> cVar) {
        File file = path.toFile();
        l.e("toFile(...)", file);
        Object objDownloadAuthenticated = bucketApi.downloadAuthenticated(str, FileChannelsKt.writeChannel$default(file, null, 1, null), kVar, cVar);
        return objDownloadAuthenticated == T3.a.f9048k ? objDownloadAuthenticated : C.a;
    }

    public static /* synthetic */ Object downloadAuthenticatedTo$default(BucketApi bucketApi, String str, Path path, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new f(3);
        }
        return downloadAuthenticatedTo(bucketApi, str, path, kVar, (S3.c<? super C>) cVar);
    }

    public static final InterfaceC0329h downloadAuthenticatedToAsFlow(BucketApi bucketApi, String str, Path path, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("file", path);
        l.f("options", kVar);
        File file = path.toFile();
        l.e("toFile(...)", file);
        return FlowExtensionKt.downloadAuthenticatedAsFlow(bucketApi, str, FileChannelsKt.writeChannel$default(file, null, 1, null), kVar);
    }

    public static /* synthetic */ InterfaceC0329h downloadAuthenticatedToAsFlow$default(BucketApi bucketApi, String str, Path path, k kVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new f(1);
        }
        return downloadAuthenticatedToAsFlow(bucketApi, str, path, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object downloadPublicTo(io.github.jan.supabase.storage.BucketApi r4, java.lang.String r5, java.nio.file.Path r6, e4.k r7, S3.c<? super O3.C> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof io.github.jan.supabase.storage.JvmUtilsKt.AnonymousClass3
            if (r0 == 0) goto L13
            r0 = r8
            io.github.jan.supabase.storage.JvmUtilsKt$downloadPublicTo$3 r0 = (io.github.jan.supabase.storage.JvmUtilsKt.AnonymousClass3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.storage.JvmUtilsKt$downloadPublicTo$3 r0 = new io.github.jan.supabase.storage.JvmUtilsKt$downloadPublicTo$3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r4 = r0.L$3
            e4.k r4 = (e4.k) r4
            java.lang.Object r4 = r0.L$2
            r6 = r4
            java.nio.file.Path r6 = (java.nio.file.Path) r6
            java.lang.Object r4 = r0.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r0.L$0
            io.github.jan.supabase.storage.BucketApi r4 = (io.github.jan.supabase.storage.BucketApi) r4
            P3.r.Y(r8)
            goto L55
        L38:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L40:
            P3.r.Y(r8)
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.L$2 = r6
            r0.L$3 = r8
            r0.label = r3
            java.lang.Object r8 = r4.downloadPublic(r5, r7, r0)
            if (r8 != r1) goto L55
            return r1
        L55:
            byte[] r8 = (byte[]) r8
            r4 = 0
            java.nio.file.OpenOption[] r5 = new java.nio.file.OpenOption[r4]
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r5, r4)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.nio.file.Files.write(r6, r8, r4)
            O3.C r4 = O3.C.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.JvmUtilsKt.downloadPublicTo(io.github.jan.supabase.storage.BucketApi, java.lang.String, java.nio.file.Path, e4.k, S3.c):java.lang.Object");
    }

    public static /* synthetic */ Object downloadPublicTo$default(BucketApi bucketApi, String str, Path path, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new f(16);
        }
        return downloadPublicTo(bucketApi, str, path, kVar, (S3.c<? super C>) cVar);
    }

    public static final InterfaceC0329h downloadPublicToAsFlow(BucketApi bucketApi, String str, Path path, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("file", path);
        l.f("options", kVar);
        File file = path.toFile();
        l.e("toFile(...)", file);
        return FlowExtensionKt.downloadPublicAsFlow(bucketApi, str, FileChannelsKt.writeChannel$default(file, null, 1, null), kVar);
    }

    public static /* synthetic */ InterfaceC0329h downloadPublicToAsFlow$default(BucketApi bucketApi, String str, Path path, k kVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new f(8);
        }
        return downloadPublicToAsFlow(bucketApi, str, path, kVar);
    }

    public static final Object update(BucketApi bucketApi, String str, File file, k kVar, S3.c<? super FileUploadResponse> cVar) {
        return bucketApi.update(str, new UploadData(FileChannelsKt.readChannel$default(file, 0L, 0L, null, 7, null), file.length()), kVar, cVar);
    }

    public static /* synthetic */ Object update$default(BucketApi bucketApi, String str, File file, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new f(4);
        }
        return update(bucketApi, str, file, kVar, (S3.c<? super FileUploadResponse>) cVar);
    }

    public static final InterfaceC0329h updateAsFlow(BucketApi bucketApi, String str, File file, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("file", file);
        l.f("options", kVar);
        return FlowExtensionKt.updateAsFlow(bucketApi, str, new UploadData(FileChannelsKt.readChannel$default(file, 0L, 0L, null, 7, null), file.length()), kVar);
    }

    public static /* synthetic */ InterfaceC0329h updateAsFlow$default(BucketApi bucketApi, String str, File file, k kVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new f(9);
        }
        return updateAsFlow(bucketApi, str, file, kVar);
    }

    public static final Object upload(BucketApi bucketApi, String str, Path path, k kVar, S3.c<? super FileUploadResponse> cVar) {
        return bucketApi.upload(str, new UploadData(FileChannelsAtNioPathKt.readChannel$default(path, 0L, 0L, null, 7, null), Files.size(path)), kVar, cVar);
    }

    public static /* synthetic */ Object upload$default(BucketApi bucketApi, String str, Path path, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new f(6);
        }
        return upload(bucketApi, str, path, kVar, (S3.c<? super FileUploadResponse>) cVar);
    }

    public static final InterfaceC0329h uploadAsFlow(BucketApi bucketApi, String str, Path path, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("file", path);
        l.f("options", kVar);
        return FlowExtensionKt.uploadAsFlow(bucketApi, str, new UploadData(FileChannelsAtNioPathKt.readChannel$default(path, 0L, 0L, null, 7, null), Files.size(path)), kVar);
    }

    public static /* synthetic */ InterfaceC0329h uploadAsFlow$default(BucketApi bucketApi, String str, Path path, k kVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new f(2);
        }
        return uploadAsFlow(bucketApi, str, path, kVar);
    }

    public static final Object uploadToSignedUrl(BucketApi bucketApi, String str, String str2, Path path, k kVar, S3.c<? super FileUploadResponse> cVar) {
        return bucketApi.uploadToSignedUrl(str, str2, new UploadData(FileChannelsAtNioPathKt.readChannel$default(path, 0L, 0L, null, 7, null), Files.size(path)), kVar, cVar);
    }

    public static /* synthetic */ Object uploadToSignedUrl$default(BucketApi bucketApi, String str, String str2, Path path, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            kVar = new f(20);
        }
        return uploadToSignedUrl(bucketApi, str, str2, path, kVar, (S3.c<? super FileUploadResponse>) cVar);
    }

    public static final InterfaceC0329h uploadToSignedUrlAsFlow(BucketApi bucketApi, String str, String str2, Path path, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("token", str2);
        l.f("file", path);
        l.f("options", kVar);
        return FlowExtensionKt.uploadToSignedUrlAsFlow(bucketApi, str, str2, new UploadData(FileChannelsAtNioPathKt.readChannel$default(path, 0L, 0L, null, 7, null), Files.size(path)), kVar);
    }

    public static /* synthetic */ InterfaceC0329h uploadToSignedUrlAsFlow$default(BucketApi bucketApi, String str, String str2, Path path, k kVar, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            kVar = new f(12);
        }
        return uploadToSignedUrlAsFlow(bucketApi, str, str2, path, kVar);
    }
}
