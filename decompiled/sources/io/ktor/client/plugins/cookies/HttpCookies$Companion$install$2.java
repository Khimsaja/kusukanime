package io.ktor.client.plugins.cookies;

import O3.C;
import P3.r;
import S3.c;
import U3.e;
import U3.j;
import e4.o;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "it", "LO3/C;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.client.plugins.cookies.HttpCookies$Companion$install$2", f = "HttpCookies.kt", l = {132}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HttpCookies$Companion$install$2 extends j implements o {
    final /* synthetic */ HttpCookies $plugin;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCookies$Companion$install$2(HttpCookies httpCookies, c<? super HttpCookies$Companion$install$2> cVar) {
        super(3, cVar);
        this.$plugin = httpCookies;
    }

    @Override // e4.o
    public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, c<? super C> cVar) {
        HttpCookies$Companion$install$2 httpCookies$Companion$install$2 = new HttpCookies$Companion$install$2(this.$plugin, cVar);
        httpCookies$Companion$install$2.L$0 = pipelineContext;
        return httpCookies$Companion$install$2.invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.label;
        if (i7 == 0) {
            r.Y(obj);
            PipelineContext pipelineContext = (PipelineContext) this.L$0;
            HttpCookies httpCookies = this.$plugin;
            HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) pipelineContext.getContext();
            this.label = 1;
            if (httpCookies.sendCookiesWith$ktor_client_core(httpRequestBuilder, this) == aVar) {
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
