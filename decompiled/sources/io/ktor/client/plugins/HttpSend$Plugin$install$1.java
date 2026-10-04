package io.ktor.client.plugins;

import O3.C;
import U3.j;
import e4.o;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "content", "LO3/C;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 1, 0})
@U3.e(c = "io.ktor.client.plugins.HttpSend$Plugin$install$1", f = "HttpSend.kt", l = {98, 99}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HttpSend$Plugin$install$1 extends j implements o {
    final /* synthetic */ HttpSend $plugin;
    final /* synthetic */ HttpClient $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpSend$Plugin$install$1(HttpSend httpSend, HttpClient httpClient, S3.c<? super HttpSend$Plugin$install$1> cVar) {
        super(3, cVar);
        this.$plugin = httpSend;
        this.$scope = httpClient;
    }

    @Override // e4.o
    public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, S3.c<? super C> cVar) {
        HttpSend$Plugin$install$1 httpSend$Plugin$install$1 = new HttpSend$Plugin$install$1(this.$plugin, this.$scope, cVar);
        httpSend$Plugin$install$1.L$0 = pipelineContext;
        httpSend$Plugin$install$1.L$1 = obj;
        return httpSend$Plugin$install$1.invokeSuspend(C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
    
        if (r1.proceedWith((io.ktor.client.call.HttpClientCall) r9, r8) == r0) goto L35;
     */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpSend$Plugin$install$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
