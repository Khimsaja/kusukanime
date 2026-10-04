package io.ktor.client.plugins;

import O3.C;
import P3.r;
import U3.j;
import e4.p;
import io.ktor.client.plugins.api.OnRequestContext;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.UtilsKt;
import io.ktor.http.HttpHeaders;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/ktor/client/plugins/api/OnRequestContext;", "Lio/ktor/client/request/HttpRequestBuilder;", "request", "", "<unused var>", "LO3/C;", "<anonymous>", "(Lio/ktor/client/plugins/api/OnRequestContext;Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/Object;)V"}, k = 3, mv = {2, 1, 0})
@U3.e(c = "io.ktor.client.plugins.UserAgentKt$UserAgent$3$1", f = "UserAgent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UserAgentKt$UserAgent$3$1 extends j implements p {
    final /* synthetic */ String $agent;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAgentKt$UserAgent$3$1(String str, S3.c<? super UserAgentKt$UserAgent$3$1> cVar) {
        super(4, cVar);
        this.$agent = str;
    }

    @Override // e4.p
    public final Object invoke(OnRequestContext onRequestContext, HttpRequestBuilder httpRequestBuilder, Object obj, S3.c<? super C> cVar) {
        UserAgentKt$UserAgent$3$1 userAgentKt$UserAgent$3$1 = new UserAgentKt$UserAgent$3$1(this.$agent, cVar);
        userAgentKt$UserAgent$3$1.L$0 = httpRequestBuilder;
        return userAgentKt$UserAgent$3$1.invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.Y(obj);
        HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) this.L$0;
        UserAgentKt.LOGGER.e("Adding User-Agent header: agent for " + httpRequestBuilder.getUrl());
        UtilsKt.header(httpRequestBuilder, HttpHeaders.INSTANCE.getUserAgent(), this.$agent);
        return C.a;
    }
}
