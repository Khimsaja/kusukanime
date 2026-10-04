package io.github.jan.supabase.storage;

import e4.k;
import io.github.jan.supabase.storage.resumable.ResumableClient;
import io.github.jan.supabase.storage.resumable.ResumableClientImpl;
import io.ktor.client.HttpClient;
import io.ktor.util.GzipHeaderFlags;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12090k;

    public /* synthetic */ f(int i7) {
        this.f12090k = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12090k) {
            case 0:
                return FlowExtensionKt.uploadToSignedUrlAsFlow$lambda$0((UploadOptionBuilder) obj);
            case 1:
                return JvmUtilsKt.downloadAuthenticatedToAsFlow$lambda$1((DownloadOptionBuilder) obj);
            case 2:
                return JvmUtilsKt.uploadAsFlow$lambda$1((UploadOptionBuilder) obj);
            case 3:
                return JvmUtilsKt.downloadAuthenticatedTo$lambda$1((DownloadOptionBuilder) obj);
            case GzipHeaderFlags.EXTRA /* 4 */:
                return JvmUtilsKt.update$lambda$1((UploadOptionBuilder) obj);
            case 5:
                return JvmUtilsKt.downloadPublicTo$lambda$0((DownloadOptionBuilder) obj);
            case 6:
                return JvmUtilsKt.upload$lambda$1((UploadOptionBuilder) obj);
            case 7:
                return JvmUtilsKt.uploadToSignedUrlAsFlow$lambda$0((UploadOptionBuilder) obj);
            case 8:
                return JvmUtilsKt.downloadPublicToAsFlow$lambda$1((DownloadOptionBuilder) obj);
            case 9:
                return JvmUtilsKt.updateAsFlow$lambda$1((UploadOptionBuilder) obj);
            case 10:
                return JvmUtilsKt.downloadPublicToAsFlow$lambda$0((DownloadOptionBuilder) obj);
            case 11:
                return JvmUtilsKt.downloadAuthenticatedToAsFlow$lambda$0((DownloadOptionBuilder) obj);
            case 12:
                return JvmUtilsKt.uploadToSignedUrlAsFlow$lambda$1((UploadOptionBuilder) obj);
            case 13:
                return JvmUtilsKt.upload$lambda$0((UploadOptionBuilder) obj);
            case 14:
                return JvmUtilsKt.uploadToSignedUrl$lambda$0((UploadOptionBuilder) obj);
            case 15:
                return JvmUtilsKt.downloadAuthenticatedTo$lambda$0((DownloadOptionBuilder) obj);
            case 16:
                return JvmUtilsKt.downloadPublicTo$lambda$1((DownloadOptionBuilder) obj);
            case 17:
                return JvmUtilsKt.updateAsFlow$lambda$0((UploadOptionBuilder) obj);
            case 18:
                return JvmUtilsKt.update$lambda$0((UploadOptionBuilder) obj);
            case 19:
                return JvmUtilsKt.uploadAsFlow$lambda$0((UploadOptionBuilder) obj);
            case 20:
                return JvmUtilsKt.uploadToSignedUrl$lambda$1((UploadOptionBuilder) obj);
            case 21:
                return ResumableAndroidUtilsKt.createOrContinueUpload$lambda$0((UploadOptionBuilder) obj);
            case 22:
                return ResumableUtilsKt.createOrContinueUpload$lambda$0((UploadOptionBuilder) obj);
            case 23:
                return ResumableUtilsKt.createOrContinueUpload$lambda$1((UploadOptionBuilder) obj);
            case 24:
                return Storage.updateBucket$lambda$0((BucketBuilder) obj);
            case 25:
                return Storage.createBucket$lambda$0((BucketBuilder) obj);
            case 26:
                return ResumableClient.createOrContinueUpload$lambda$0((UploadOptionBuilder) obj);
            case 27:
                return ResumableClient.createOrContinueUpload$lambda$1((UploadOptionBuilder) obj);
            case 28:
                return ResumableClientImpl.encodeMetadata$lambda$0((Map.Entry) obj);
            default:
                return HttpClient.lambda$2$lambda$1((HttpClient) obj);
        }
    }
}
