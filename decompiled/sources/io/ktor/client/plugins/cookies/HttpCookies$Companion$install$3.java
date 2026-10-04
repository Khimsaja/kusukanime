package io.ktor.client.plugins.cookies;

import O3.C;
import P3.r;
import S3.c;
import U3.e;
import U3.j;
import e4.o;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponse;", "LO3/C;", "response", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponse;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.client.plugins.cookies.HttpCookies$Companion$install$3", f = "HttpCookies.kt", l = {136}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HttpCookies$Companion$install$3 extends j implements o {
    final /* synthetic */ HttpCookies $plugin;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCookies$Companion$install$3(HttpCookies httpCookies, c<? super HttpCookies$Companion$install$3> cVar) {
        super(3, cVar);
        this.$plugin = httpCookies;
    }

    @Override // e4.o
    public final Object invoke(PipelineContext<HttpResponse, C> pipelineContext, HttpResponse httpResponse, c<? super C> cVar) {
        HttpCookies$Companion$install$3 httpCookies$Companion$install$3 = new HttpCookies$Companion$install$3(this.$plugin, cVar);
        httpCookies$Companion$install$3.L$0 = httpResponse;
        return httpCookies$Companion$install$3.invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.label;
        if (i7 == 0) {
            r.Y(obj);
            HttpResponse httpResponse = (HttpResponse) this.L$0;
            HttpCookies httpCookies = this.$plugin;
            this.label = 1;
            if (httpCookies.saveCookiesFrom$ktor_client_core(httpResponse, this) == aVar) {
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
