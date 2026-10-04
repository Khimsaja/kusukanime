package io.ktor.client.engine;

import H5.A;
import O3.C;
import P3.r;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "Lio/ktor/client/request/HttpResponseData;", "<anonymous>", "(LH5/A;)Lio/ktor/client/request/HttpResponseData;"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2", f = "HttpClientEngine.kt", l = {183}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HttpClientEngine$executeWithinCallContext$2 extends j implements n {
    final /* synthetic */ HttpRequestData $requestData;
    int label;
    final /* synthetic */ HttpClientEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClientEngine$executeWithinCallContext$2(HttpClientEngine httpClientEngine, HttpRequestData httpRequestData, S3.c<? super HttpClientEngine$executeWithinCallContext$2> cVar) {
        super(2, cVar);
        this.this$0 = httpClientEngine;
        this.$requestData = httpRequestData;
    }

    @Override // U3.a
    public final S3.c<C> create(Object obj, S3.c<?> cVar) {
        return new HttpClientEngine$executeWithinCallContext$2(this.this$0, this.$requestData, cVar);
    }

    @Override // e4.n
    public final Object invoke(A a, S3.c<? super HttpResponseData> cVar) {
        return ((HttpClientEngine$executeWithinCallContext$2) create(a, cVar)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
            return obj;
        }
        r.Y(obj);
        if (HttpClientEngine.DefaultImpls.getClosed(this.this$0)) {
            throw new ClientEngineClosedException(null, 1, null);
        }
        HttpClientEngine httpClientEngine = this.this$0;
        HttpRequestData httpRequestData = this.$requestData;
        this.label = 1;
        Object objExecute = httpClientEngine.execute(httpRequestData, this);
        return objExecute == aVar ? aVar : objExecute;
    }
}
