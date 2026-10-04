package io.ktor.client.plugins;

import O3.C;
import P3.r;
import U3.j;
import e4.o;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.ContentType;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.content.OutgoingContent;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lio/ktor/http/content/OutgoingContent;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "content", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@U3.e(c = "io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$1", f = "HttpPlainText.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HttpPlainTextKt$HttpPlainText$2$1 extends j implements o {
    final /* synthetic */ String $acceptCharsetHeader;
    final /* synthetic */ Charset $requestCharset;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpPlainTextKt$HttpPlainText$2$1(String str, Charset charset, S3.c<? super HttpPlainTextKt$HttpPlainText$2$1> cVar) {
        super(3, cVar);
        this.$acceptCharsetHeader = str;
        this.$requestCharset = charset;
    }

    @Override // e4.o
    public final Object invoke(HttpRequestBuilder httpRequestBuilder, Object obj, S3.c<? super OutgoingContent> cVar) {
        HttpPlainTextKt$HttpPlainText$2$1 httpPlainTextKt$HttpPlainText$2$1 = new HttpPlainTextKt$HttpPlainText$2$1(this.$acceptCharsetHeader, this.$requestCharset, cVar);
        httpPlainTextKt$HttpPlainText$2$1.L$0 = httpRequestBuilder;
        httpPlainTextKt$HttpPlainText$2$1.L$1 = obj;
        return httpPlainTextKt$HttpPlainText$2$1.invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.Y(obj);
        HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) this.L$0;
        Object obj2 = this.L$1;
        HttpPlainTextKt.HttpPlainText$lambda$6$addCharsetHeaders(this.$acceptCharsetHeader, httpRequestBuilder);
        if (!(obj2 instanceof String)) {
            return null;
        }
        ContentType contentType = HttpMessagePropertiesKt.contentType(httpRequestBuilder);
        if (contentType == null || l.a(contentType.getContentType(), ContentType.Text.INSTANCE.getPlain().getContentType())) {
            return HttpPlainTextKt.HttpPlainText$lambda$6$wrapContent(this.$requestCharset, httpRequestBuilder, (String) obj2, contentType);
        }
        return null;
    }
}
