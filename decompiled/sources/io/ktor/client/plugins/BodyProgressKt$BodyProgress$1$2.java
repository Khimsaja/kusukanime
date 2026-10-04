package io.ktor.client.plugins;

import O3.C;
import P3.r;
import U3.j;
import e4.n;
import io.ktor.client.content.ProgressListener;
import io.ktor.client.statement.HttpResponse;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/statement/HttpResponse;", "response"}, k = 3, mv = {2, 1, 0}, xi = 48)
@U3.e(c = "io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$2", f = "BodyProgress.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BodyProgressKt$BodyProgress$1$2 extends j implements n {
    /* synthetic */ Object L$0;
    int label;

    public BodyProgressKt$BodyProgress$1$2(S3.c<? super BodyProgressKt$BodyProgress$1$2> cVar) {
        super(2, cVar);
    }

    @Override // U3.a
    public final S3.c<C> create(Object obj, S3.c<?> cVar) {
        BodyProgressKt$BodyProgress$1$2 bodyProgressKt$BodyProgress$1$2 = new BodyProgressKt$BodyProgress$1$2(cVar);
        bodyProgressKt$BodyProgress$1$2.L$0 = obj;
        return bodyProgressKt$BodyProgress$1$2;
    }

    @Override // e4.n
    public final Object invoke(HttpResponse httpResponse, S3.c<? super HttpResponse> cVar) {
        return ((BodyProgressKt$BodyProgress$1$2) create(httpResponse, cVar)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.Y(obj);
        HttpResponse httpResponse = (HttpResponse) this.L$0;
        ProgressListener progressListener = (ProgressListener) httpResponse.getCall().getRequest().getAttributes().getOrNull(BodyProgressKt.DownloadProgressListenerAttributeKey);
        if (progressListener == null) {
            return null;
        }
        return BodyProgressKt.withObservableDownload(httpResponse, progressListener);
    }
}
