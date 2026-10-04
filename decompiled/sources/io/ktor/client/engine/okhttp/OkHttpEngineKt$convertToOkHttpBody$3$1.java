package io.ktor.client.engine.okhttp;

import O3.C;
import P3.r;
import S3.c;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.WriterScope;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "LO3/C;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.client.engine.okhttp.OkHttpEngineKt$convertToOkHttpBody$3$1", f = "OkHttpEngine.kt", l = {218}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OkHttpEngineKt$convertToOkHttpBody$3$1 extends j implements n {
    final /* synthetic */ OutgoingContent $this_convertToOkHttpBody;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttpEngineKt$convertToOkHttpBody$3$1(OutgoingContent outgoingContent, c<? super OkHttpEngineKt$convertToOkHttpBody$3$1> cVar) {
        super(2, cVar);
        this.$this_convertToOkHttpBody = outgoingContent;
    }

    @Override // U3.a
    public final c<C> create(Object obj, c<?> cVar) {
        OkHttpEngineKt$convertToOkHttpBody$3$1 okHttpEngineKt$convertToOkHttpBody$3$1 = new OkHttpEngineKt$convertToOkHttpBody$3$1(this.$this_convertToOkHttpBody, cVar);
        okHttpEngineKt$convertToOkHttpBody$3$1.L$0 = obj;
        return okHttpEngineKt$convertToOkHttpBody$3$1;
    }

    @Override // e4.n
    public final Object invoke(WriterScope writerScope, c<? super C> cVar) {
        return ((OkHttpEngineKt$convertToOkHttpBody$3$1) create(writerScope, cVar)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.label;
        if (i7 == 0) {
            r.Y(obj);
            WriterScope writerScope = (WriterScope) this.L$0;
            OutgoingContent.WriteChannelContent writeChannelContent = (OutgoingContent.WriteChannelContent) this.$this_convertToOkHttpBody;
            ByteWriteChannel channel = writerScope.getChannel();
            this.label = 1;
            if (writeChannelContent.writeTo(channel, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
        }
        return C.a;
    }
}
