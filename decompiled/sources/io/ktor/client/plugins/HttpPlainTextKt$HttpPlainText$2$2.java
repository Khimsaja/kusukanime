package io.ktor.client.plugins;

import O3.C;
import P3.r;
import S5.n;
import U3.j;
import e4.q;
import io.ktor.client.plugins.api.TransformResponseBodyContext;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\n"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/api/TransformResponseBodyContext;", "response", "Lio/ktor/client/statement/HttpResponse;", "content", "Lio/ktor/utils/io/ByteReadChannel;", "requestedType", "Lio/ktor/util/reflect/TypeInfo;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@U3.e(c = "io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$2", f = "HttpPlainText.kt", l = {147}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HttpPlainTextKt$HttpPlainText$2$2 extends j implements q {
    final /* synthetic */ Charset $responseCharsetFallback;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpPlainTextKt$HttpPlainText$2$2(Charset charset, S3.c<? super HttpPlainTextKt$HttpPlainText$2$2> cVar) {
        super(5, cVar);
        this.$responseCharsetFallback = charset;
    }

    @Override // e4.q
    public final Object invoke(TransformResponseBodyContext transformResponseBodyContext, HttpResponse httpResponse, ByteReadChannel byteReadChannel, TypeInfo typeInfo, S3.c<Object> cVar) {
        HttpPlainTextKt$HttpPlainText$2$2 httpPlainTextKt$HttpPlainText$2$2 = new HttpPlainTextKt$HttpPlainText$2$2(this.$responseCharsetFallback, cVar);
        httpPlainTextKt$HttpPlainText$2$2.L$0 = httpResponse;
        httpPlainTextKt$HttpPlainText$2$2.L$1 = byteReadChannel;
        httpPlainTextKt$HttpPlainText$2$2.L$2 = typeInfo;
        return httpPlainTextKt$HttpPlainText$2$2.invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        HttpResponse httpResponse;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.label;
        if (i7 == 0) {
            r.Y(obj);
            HttpResponse httpResponse2 = (HttpResponse) this.L$0;
            ByteReadChannel byteReadChannel = (ByteReadChannel) this.L$1;
            if (!l.a(((TypeInfo) this.L$2).getType(), y.a.b(String.class))) {
                return null;
            }
            this.L$0 = httpResponse2;
            this.L$1 = null;
            this.label = 1;
            Object remaining = ByteReadChannelOperationsKt.readRemaining(byteReadChannel, this);
            if (remaining == aVar) {
                return aVar;
            }
            httpResponse = httpResponse2;
            obj = remaining;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            httpResponse = (HttpResponse) this.L$0;
            r.Y(obj);
        }
        return HttpPlainTextKt.HttpPlainText$lambda$6$read(this.$responseCharsetFallback, httpResponse.getCall(), (n) obj);
    }
}
