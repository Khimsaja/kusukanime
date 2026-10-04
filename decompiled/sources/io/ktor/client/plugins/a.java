package io.ktor.client.plugins;

import H5.N;
import H5.h0;
import H5.r;
import H5.u0;
import e4.k;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.plugins.DefaultRequest;
import io.ktor.client.plugins.DefaultTransformKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.GzipHeaderFlags;
import io.ktor.utils.io.ByteReadChannel;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12113k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f12114l;

    public /* synthetic */ a(int i7, Object obj) {
        this.f12113k = i7;
        this.f12114l = obj;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12113k) {
            case 0:
                return DefaultTransformKt.AnonymousClass2.invokeSuspend$lambda$1$lambda$0((h0) this.f12114l, (Throwable) obj);
            case 1:
                return BodyProgressKt.withObservableDownload$lambda$1((ByteReadChannel) this.f12114l, (HttpResponse) obj);
            case 2:
                return DefaultRequestKt.defaultRequest$lambda$0((k) this.f12114l, (DefaultRequest.DefaultRequestBuilder) obj);
            case 3:
                return DefaultResponseValidationKt.addDefaultResponseValidation$lambda$0((HttpClientConfig) this.f12114l, (HttpCallValidatorConfig) obj);
            case GzipHeaderFlags.EXTRA /* 4 */:
                return HttpRequestLifecycleKt.attachToClientEngineJob$lambda$1((r) this.f12114l, (Throwable) obj);
            case 5:
                return HttpRequestLifecycleKt.attachToClientEngineJob$lambda$2((N) this.f12114l, (Throwable) obj);
            case 6:
                return HttpRequestRetryKt.HttpRequestRetry$lambda$1$prepareRequest$lambda$0((HttpRequestBuilder) this.f12114l, (Throwable) obj);
            default:
                return HttpTimeoutKt.applyRequestTimeout$lambda$2((u0) this.f12114l, (Throwable) obj);
        }
    }
}
