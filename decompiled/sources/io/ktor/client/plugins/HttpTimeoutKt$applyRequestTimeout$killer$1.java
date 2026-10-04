package io.ktor.client.plugins;

import H5.A;
import H5.D;
import H5.InterfaceC0265f0;
import O3.C;
import P3.r;
import U3.j;
import e4.n;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.util.logging.LoggerJvmKt;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
@U3.e(c = "io.ktor.client.plugins.HttpTimeoutKt$applyRequestTimeout$killer$1", f = "HttpTimeout.kt", l = {184}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HttpTimeoutKt$applyRequestTimeout$killer$1 extends j implements n {
    final /* synthetic */ InterfaceC0265f0 $executionContext;
    final /* synthetic */ HttpRequestBuilder $request;
    final /* synthetic */ Long $requestTimeout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpTimeoutKt$applyRequestTimeout$killer$1(Long l7, HttpRequestBuilder httpRequestBuilder, InterfaceC0265f0 interfaceC0265f0, S3.c<? super HttpTimeoutKt$applyRequestTimeout$killer$1> cVar) {
        super(2, cVar);
        this.$requestTimeout = l7;
        this.$request = httpRequestBuilder;
        this.$executionContext = interfaceC0265f0;
    }

    @Override // U3.a
    public final S3.c<C> create(Object obj, S3.c<?> cVar) {
        return new HttpTimeoutKt$applyRequestTimeout$killer$1(this.$requestTimeout, this.$request, this.$executionContext, cVar);
    }

    @Override // e4.n
    public final Object invoke(A a, S3.c<? super C> cVar) {
        return ((HttpTimeoutKt$applyRequestTimeout$killer$1) create(a, cVar)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.label;
        if (i7 == 0) {
            r.Y(obj);
            long jLongValue = this.$requestTimeout.longValue();
            this.label = 1;
            if (D.k(jLongValue, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
        }
        HttpRequestTimeoutException httpRequestTimeoutException = new HttpRequestTimeoutException(this.$request);
        z6.b bVar = HttpTimeoutKt.LOGGER;
        HttpRequestBuilder httpRequestBuilder = this.$request;
        if (LoggerJvmKt.isTraceEnabled(bVar)) {
            bVar.e("Request timeout: " + httpRequestBuilder.getUrl());
        }
        InterfaceC0265f0 interfaceC0265f0 = this.$executionContext;
        String message = httpRequestTimeoutException.getMessage();
        l.c(message);
        D.i(interfaceC0265f0, message, httpRequestTimeoutException);
        return C.a;
    }
}
