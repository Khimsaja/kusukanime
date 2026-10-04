package io.github.jan.supabase.storage;

import K5.InterfaceC0329h;
import O3.C;
import android.annotation.SuppressLint;
import android.net.Uri;
import e4.k;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.jvm.javaio.ReadingKt;
import java.io.FileNotFoundException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a=\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086@¢\u0006\u0002\u0010\f\u001a;\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b\u001aE\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086@¢\u0006\u0002\u0010\u0012\u001aC\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b\u001a=\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086@¢\u0006\u0002\u0010\f\u001a;\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b\u001a\f\u0010\u0016\u001a\u00020\u0017*\u00020\u0006H\u0003¨\u0006\u0018"}, d2 = {"upload", "Lio/github/jan/supabase/storage/FileUploadResponse;", "Lio/github/jan/supabase/storage/BucketApi;", "path", "", "uri", "Landroid/net/Uri;", "options", "Lkotlin/Function1;", "Lio/github/jan/supabase/storage/UploadOptionBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lio/github/jan/supabase/storage/BucketApi;Ljava/lang/String;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadAsFlow", "Lkotlinx/coroutines/flow/Flow;", "Lio/github/jan/supabase/storage/UploadStatus;", "uploadToSignedUrl", "token", "(Lio/github/jan/supabase/storage/BucketApi;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadToSignedUrlAsFlow", "update", "updateAsFlow", "readChannel", "Lio/ktor/utils/io/ByteReadChannel;", "storage-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidUtilsKt {
    @SuppressLint({"Recycle"})
    private static final ByteReadChannel readChannel(Uri uri) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream = ContextKt.applicationContext().getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            return ReadingKt.toByteReadChannelWithArrayPool$default(inputStreamOpenInputStream, null, null, 3, null);
        }
        throw new IllegalArgumentException("Uri is not readable");
    }

    public static final Object update(BucketApi bucketApi, String str, Uri uri, k kVar, S3.c<? super FileUploadResponse> cVar) {
        return bucketApi.update(str, new UploadData(readChannel(uri), ResumableAndroidUtilsKt.getContentSize(uri)), kVar, cVar);
    }

    public static /* synthetic */ Object update$default(BucketApi bucketApi, String str, Uri uri, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new a(2);
        }
        return update(bucketApi, str, uri, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C update$lambda$0(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    public static final InterfaceC0329h updateAsFlow(BucketApi bucketApi, String str, Uri uri, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("uri", uri);
        l.f("options", kVar);
        return FlowExtensionKt.updateAsFlow(bucketApi, str, new UploadData(readChannel(uri), ResumableAndroidUtilsKt.getContentSize(uri)), kVar);
    }

    public static /* synthetic */ InterfaceC0329h updateAsFlow$default(BucketApi bucketApi, String str, Uri uri, k kVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new a(4);
        }
        return updateAsFlow(bucketApi, str, uri, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C updateAsFlow$lambda$0(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    public static final Object upload(BucketApi bucketApi, String str, Uri uri, k kVar, S3.c<? super FileUploadResponse> cVar) {
        return bucketApi.upload(str, new UploadData(readChannel(uri), ResumableAndroidUtilsKt.getContentSize(uri)), kVar, cVar);
    }

    public static /* synthetic */ Object upload$default(BucketApi bucketApi, String str, Uri uri, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new a(3);
        }
        return upload(bucketApi, str, uri, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C upload$lambda$0(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    public static final InterfaceC0329h uploadAsFlow(BucketApi bucketApi, String str, Uri uri, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("uri", uri);
        l.f("options", kVar);
        return FlowExtensionKt.uploadAsFlow(bucketApi, str, new UploadData(readChannel(uri), ResumableAndroidUtilsKt.getContentSize(uri)), kVar);
    }

    public static /* synthetic */ InterfaceC0329h uploadAsFlow$default(BucketApi bucketApi, String str, Uri uri, k kVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new a(0);
        }
        return uploadAsFlow(bucketApi, str, uri, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C uploadAsFlow$lambda$0(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    public static final Object uploadToSignedUrl(BucketApi bucketApi, String str, String str2, Uri uri, k kVar, S3.c<? super FileUploadResponse> cVar) {
        return bucketApi.uploadToSignedUrl(str, str2, new UploadData(readChannel(uri), ResumableAndroidUtilsKt.getContentSize(uri)), kVar, cVar);
    }

    public static /* synthetic */ Object uploadToSignedUrl$default(BucketApi bucketApi, String str, String str2, Uri uri, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            kVar = new A3.e(29);
        }
        return uploadToSignedUrl(bucketApi, str, str2, uri, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C uploadToSignedUrl$lambda$0(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    public static final InterfaceC0329h uploadToSignedUrlAsFlow(BucketApi bucketApi, String str, String str2, Uri uri, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("token", str2);
        l.f("uri", uri);
        l.f("options", kVar);
        return FlowExtensionKt.uploadToSignedUrlAsFlow(bucketApi, str, str2, new UploadData(readChannel(uri), ResumableAndroidUtilsKt.getContentSize(uri)), kVar);
    }

    public static /* synthetic */ InterfaceC0329h uploadToSignedUrlAsFlow$default(BucketApi bucketApi, String str, String str2, Uri uri, k kVar, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            kVar = new a(1);
        }
        return uploadToSignedUrlAsFlow(bucketApi, str, str2, uri, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C uploadToSignedUrlAsFlow$lambda$0(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }
}
