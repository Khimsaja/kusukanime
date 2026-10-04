package io.ktor.client.plugins;

import O3.C;
import P3.r;
import U3.j;
import e4.o;
import io.ktor.client.content.ObservableContent;
import io.ktor.client.content.ProgressListener;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.content.OutgoingContent;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lio/ktor/http/content/OutgoingContent;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "content"}, k = 3, mv = {2, 1, 0}, xi = 48)
@U3.e(c = "io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$1", f = "BodyProgress.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BodyProgressKt$BodyProgress$1$1 extends j implements o {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public BodyProgressKt$BodyProgress$1$1(S3.c<? super BodyProgressKt$BodyProgress$1$1> cVar) {
        super(3, cVar);
    }

    @Override // e4.o
    public final Object invoke(HttpRequestBuilder httpRequestBuilder, OutgoingContent outgoingContent, S3.c<? super OutgoingContent> cVar) {
        BodyProgressKt$BodyProgress$1$1 bodyProgressKt$BodyProgress$1$1 = new BodyProgressKt$BodyProgress$1$1(cVar);
        bodyProgressKt$BodyProgress$1$1.L$0 = httpRequestBuilder;
        bodyProgressKt$BodyProgress$1$1.L$1 = outgoingContent;
        return bodyProgressKt$BodyProgress$1$1.invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.Y(obj);
        HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) this.L$0;
        OutgoingContent outgoingContent = (OutgoingContent) this.L$1;
        ProgressListener progressListener = (ProgressListener) httpRequestBuilder.getAttributes().getOrNull(BodyProgressKt.UploadProgressListenerAttributeKey);
        if (progressListener == null) {
            return null;
        }
        return new ObservableContent(outgoingContent, httpRequestBuilder.getExecutionContext(), progressListener);
    }
}
