package io.ktor.client.plugins;

import O3.C;
import P3.r;
import U3.j;
import e4.InterfaceC0821a;
import e4.n;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "request", "LO3/C;", "<anonymous>", "(Lio/ktor/client/request/HttpRequestBuilder;)V"}, k = 3, mv = {2, 1, 0})
@U3.e(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$1", f = "HttpCallValidator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HttpCallValidatorKt$HttpCallValidator$2$1 extends j implements n {
    final /* synthetic */ boolean $expectSuccess;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCallValidatorKt$HttpCallValidator$2$1(boolean z7, S3.c<? super HttpCallValidatorKt$HttpCallValidator$2$1> cVar) {
        super(2, cVar);
        this.$expectSuccess = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(boolean z7) {
        return z7;
    }

    @Override // U3.a
    public final S3.c<C> create(Object obj, S3.c<?> cVar) {
        HttpCallValidatorKt$HttpCallValidator$2$1 httpCallValidatorKt$HttpCallValidator$2$1 = new HttpCallValidatorKt$HttpCallValidator$2$1(this.$expectSuccess, cVar);
        httpCallValidatorKt$HttpCallValidator$2$1.L$0 = obj;
        return httpCallValidatorKt$HttpCallValidator$2$1;
    }

    @Override // e4.n
    public final Object invoke(HttpRequestBuilder httpRequestBuilder, S3.c<? super C> cVar) {
        return ((HttpCallValidatorKt$HttpCallValidator$2$1) create(httpRequestBuilder, cVar)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.Y(obj);
        Attributes attributes = ((HttpRequestBuilder) this.L$0).getAttributes();
        AttributeKey<Boolean> expectSuccessAttributeKey = HttpCallValidatorKt.getExpectSuccessAttributeKey();
        final boolean z7 = this.$expectSuccess;
        attributes.computeIfAbsent(expectSuccessAttributeKey, new InterfaceC0821a() { // from class: io.ktor.client.plugins.b
            @Override // e4.InterfaceC0821a
            public final Object invoke() {
                return Boolean.valueOf(HttpCallValidatorKt$HttpCallValidator$2$1.invokeSuspend$lambda$0(z7));
            }
        });
        return C.a;
    }
}
