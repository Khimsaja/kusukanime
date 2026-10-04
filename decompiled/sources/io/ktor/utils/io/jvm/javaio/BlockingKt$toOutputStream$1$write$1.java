package io.ktor.utils.io.jvm.javaio;

import H5.A;
import O3.C;
import P3.r;
import S3.c;
import T3.a;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$write$1", f = "Blocking.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BlockingKt$toOutputStream$1$write$1 extends j implements n {
    final /* synthetic */ int $b;
    final /* synthetic */ ByteWriteChannel $this_toOutputStream;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockingKt$toOutputStream$1$write$1(ByteWriteChannel byteWriteChannel, int i7, c<? super BlockingKt$toOutputStream$1$write$1> cVar) {
        super(2, cVar);
        this.$this_toOutputStream = byteWriteChannel;
        this.$b = i7;
    }

    @Override // U3.a
    public final c<C> create(Object obj, c<?> cVar) {
        return new BlockingKt$toOutputStream$1$write$1(this.$this_toOutputStream, this.$b, cVar);
    }

    @Override // e4.n
    public final Object invoke(A a, c<? super C> cVar) {
        return ((BlockingKt$toOutputStream$1$write$1) create(a, cVar)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f9048k;
        int i7 = this.label;
        if (i7 == 0) {
            r.Y(obj);
            ByteWriteChannel byteWriteChannel = this.$this_toOutputStream;
            byte b4 = (byte) this.$b;
            this.label = 1;
            if (ByteWriteChannelOperationsKt.writeByte(byteWriteChannel, b4, this) == aVar) {
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
