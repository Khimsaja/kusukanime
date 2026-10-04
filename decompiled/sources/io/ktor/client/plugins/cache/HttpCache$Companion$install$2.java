package io.ktor.client.plugins.cache;

import O3.C;
import S3.c;
import U3.e;
import U3.j;
import e4.o;
import io.ktor.client.HttpClient;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponse;", "LO3/C;", "response", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponse;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.client.plugins.cache.HttpCache$Companion$install$2", f = "HttpCache.kt", l = {219, 225, 232, 240, 256}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HttpCache$Companion$install$2 extends j implements o {
    final /* synthetic */ HttpCache $plugin;
    final /* synthetic */ HttpClient $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCache$Companion$install$2(HttpCache httpCache, HttpClient httpClient, c<? super HttpCache$Companion$install$2> cVar) {
        super(3, cVar);
        this.$plugin = httpCache;
        this.$scope = httpClient;
    }

    @Override // e4.o
    public final Object invoke(PipelineContext<HttpResponse, C> pipelineContext, HttpResponse httpResponse, c<? super C> cVar) {
        HttpCache$Companion$install$2 httpCache$Companion$install$2 = new HttpCache$Companion$install$2(this.$plugin, this.$scope, cVar);
        httpCache$Companion$install$2.L$0 = pipelineContext;
        httpCache$Companion$install$2.L$1 = httpResponse;
        return httpCache$Companion$install$2.invokeSuspend(C.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c0 A[RETURN] */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.HttpCache$Companion$install$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
