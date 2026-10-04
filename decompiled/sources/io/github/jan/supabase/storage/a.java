package io.github.jan.supabase.storage;

import e4.k;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.util.GzipHeaderFlags;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12078k;

    public /* synthetic */ a(int i7) {
        this.f12078k = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12078k) {
            case 0:
                return AndroidUtilsKt.uploadAsFlow$lambda$0((UploadOptionBuilder) obj);
            case 1:
                return AndroidUtilsKt.uploadToSignedUrlAsFlow$lambda$0((UploadOptionBuilder) obj);
            case 2:
                return AndroidUtilsKt.update$lambda$0((UploadOptionBuilder) obj);
            case 3:
                return AndroidUtilsKt.upload$lambda$0((UploadOptionBuilder) obj);
            case GzipHeaderFlags.EXTRA /* 4 */:
                return AndroidUtilsKt.updateAsFlow$lambda$0((UploadOptionBuilder) obj);
            case 5:
                return BucketApi.downloadAuthenticated$lambda$0((DownloadOptionBuilder) obj);
            case 6:
                return BucketApi.downloadPublic$lambda$0((DownloadOptionBuilder) obj);
            case 7:
                return BucketApi.uploadToSignedUrl$lambda$0((UploadOptionBuilder) obj);
            case 8:
                return BucketApi.authenticatedRenderUrl$lambda$0((ImageTransformation) obj);
            case 9:
                return BucketApi.update$lambda$0((UploadOptionBuilder) obj);
            case 10:
                return BucketApi.list$lambda$0((BucketListFilter) obj);
            case 11:
                return BucketApi.publicRenderUrl$lambda$0((ImageTransformation) obj);
            case 12:
                return BucketApi.upload$lambda$2((UploadOptionBuilder) obj);
            case 13:
                return BucketApi.createSignedUrl_dWUq8MI$lambda$0((ImageTransformation) obj);
            case 14:
                return BucketApi.downloadPublic$lambda$1((DownloadOptionBuilder) obj);
            case 15:
                return BucketApi.upload$lambda$0((UploadOptionBuilder) obj);
            case 16:
                return BucketApi.update$lambda$2((UploadOptionBuilder) obj);
            case 17:
                return BucketApi.downloadAuthenticated$lambda$1((DownloadOptionBuilder) obj);
            case 18:
                return BucketApi.uploadToSignedUrl$lambda$2((UploadOptionBuilder) obj);
            case 19:
                return BucketApiImpl.exists$lambda$0((HttpRequestBuilder) obj);
            case 20:
                return DownloadOptionBuilder._init_$lambda$0((ImageTransformation) obj);
            case 21:
                return FlowExtensionKt.updateAsFlow$lambda$1((UploadOptionBuilder) obj);
            case 22:
                return FlowExtensionKt.uploadAsFlow$lambda$1((UploadOptionBuilder) obj);
            case 23:
                return FlowExtensionKt.downloadAuthenticatedAsFlow$lambda$1((DownloadOptionBuilder) obj);
            case 24:
                return FlowExtensionKt.uploadToSignedUrlAsFlow$lambda$1((UploadOptionBuilder) obj);
            case 25:
                return FlowExtensionKt.updateAsFlow$lambda$0((UploadOptionBuilder) obj);
            case 26:
                return FlowExtensionKt.downloadPublicAsFlow$lambda$0((DownloadOptionBuilder) obj);
            case 27:
                return FlowExtensionKt.downloadAuthenticatedAsFlow$lambda$0((DownloadOptionBuilder) obj);
            case 28:
                return FlowExtensionKt.downloadPublicAsFlow$lambda$1((DownloadOptionBuilder) obj);
            default:
                return FlowExtensionKt.uploadAsFlow$lambda$0((UploadOptionBuilder) obj);
        }
    }
}
