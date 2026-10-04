package io.ktor.client.plugins;

import O3.C;
import P3.r;
import U3.j;
import e4.n;
import e4.o;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/api/Send$Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@U3.e(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$2", f = "HttpCallValidator.kt", l = {128, 129}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HttpCallValidatorKt$HttpCallValidator$2$2 extends j implements o {
    final /* synthetic */ List<n> $responseValidators;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HttpCallValidatorKt$HttpCallValidator$2$2(List<? extends n> list, S3.c<? super HttpCallValidatorKt$HttpCallValidator$2$2> cVar) {
        super(3, cVar);
        this.$responseValidators = list;
    }

    @Override // e4.o
    public final Object invoke(Send.Sender sender, HttpRequestBuilder httpRequestBuilder, S3.c<? super HttpClientCall> cVar) {
        HttpCallValidatorKt$HttpCallValidator$2$2 httpCallValidatorKt$HttpCallValidator$2$2 = new HttpCallValidatorKt$HttpCallValidator$2$2(this.$responseValidators, cVar);
        httpCallValidatorKt$HttpCallValidator$2$2.L$0 = sender;
        httpCallValidatorKt$HttpCallValidator$2$2.L$1 = httpRequestBuilder;
        return httpCallValidatorKt$HttpCallValidator$2$2.invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.label;
        if (i7 == 0) {
            r.Y(obj);
            Send.Sender sender = (Send.Sender) this.L$0;
            HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) this.L$1;
            this.L$0 = null;
            this.label = 1;
            obj = sender.proceed(httpRequestBuilder, this);
            if (obj != aVar) {
            }
        }
        if (i7 != 1) {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            HttpClientCall httpClientCall = (HttpClientCall) this.L$0;
            r.Y(obj);
            return httpClientCall;
        }
        r.Y(obj);
        HttpClientCall httpClientCall2 = (HttpClientCall) obj;
        List<n> list = this.$responseValidators;
        HttpResponse response = httpClientCall2.getResponse();
        this.L$0 = httpClientCall2;
        this.label = 2;
        return HttpCallValidatorKt.HttpCallValidator$lambda$2$validateResponse(list, response, this) == aVar ? aVar : httpClientCall2;
    }
}
