package io.ktor.client.plugins;

import H5.D;
import O3.C;
import P3.r;
import U3.j;
import e4.n;
import io.ktor.client.statement.HttpResponse;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.WriterScope;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "LO3/C;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 1, 0})
@U3.e(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$result$channel$1", f = "DefaultTransform.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DefaultTransformKt$defaultTransformers$2$result$channel$1 extends j implements n {
    final /* synthetic */ Object $body;
    final /* synthetic */ HttpResponse $response;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultTransformKt$defaultTransformers$2$result$channel$1(Object obj, HttpResponse httpResponse, S3.c<? super DefaultTransformKt$defaultTransformers$2$result$channel$1> cVar) {
        super(2, cVar);
        this.$body = obj;
        this.$response = httpResponse;
    }

    @Override // U3.a
    public final S3.c<C> create(Object obj, S3.c<?> cVar) {
        DefaultTransformKt$defaultTransformers$2$result$channel$1 defaultTransformKt$defaultTransformers$2$result$channel$1 = new DefaultTransformKt$defaultTransformers$2$result$channel$1(this.$body, this.$response, cVar);
        defaultTransformKt$defaultTransformers$2$result$channel$1.L$0 = obj;
        return defaultTransformKt$defaultTransformers$2$result$channel$1;
    }

    @Override // e4.n
    public final Object invoke(WriterScope writerScope, S3.c<? super C> cVar) {
        return ((DefaultTransformKt$defaultTransformers$2$result$channel$1) create(writerScope, cVar)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.label;
        try {
            if (i7 == 0) {
                r.Y(obj);
                WriterScope writerScope = (WriterScope) this.L$0;
                ByteReadChannel byteReadChannel = (ByteReadChannel) this.$body;
                ByteWriteChannel channel = writerScope.getChannel();
                this.label = 1;
                obj = ByteReadChannelOperationsKt.copyTo(byteReadChannel, channel, Long.MAX_VALUE, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
            ((Number) obj).longValue();
            return C.a;
        } catch (CancellationException e7) {
            D.h(this.$response, e7);
            throw e7;
        } catch (Throwable th) {
            D.h(this.$response, D.a("Receive failed", th));
            throw th;
        }
    }
}
