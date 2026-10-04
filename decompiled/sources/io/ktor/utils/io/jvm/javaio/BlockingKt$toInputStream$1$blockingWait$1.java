package io.ktor.utils.io.jvm.javaio;

import H5.A;
import O3.C;
import P3.r;
import S3.c;
import T3.a;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "", "<anonymous>", "(LH5/A;)Z"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.utils.io.jvm.javaio.BlockingKt$toInputStream$1$blockingWait$1", f = "Blocking.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BlockingKt$toInputStream$1$blockingWait$1 extends j implements n {
    final /* synthetic */ ByteReadChannel $this_toInputStream;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockingKt$toInputStream$1$blockingWait$1(ByteReadChannel byteReadChannel, c<? super BlockingKt$toInputStream$1$blockingWait$1> cVar) {
        super(2, cVar);
        this.$this_toInputStream = byteReadChannel;
    }

    @Override // U3.a
    public final c<C> create(Object obj, c<?> cVar) {
        return new BlockingKt$toInputStream$1$blockingWait$1(this.$this_toInputStream, cVar);
    }

    @Override // e4.n
    public final Object invoke(A a, c<? super Boolean> cVar) {
        return ((BlockingKt$toInputStream$1$blockingWait$1) create(a, cVar)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f9048k;
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
            return obj;
        }
        r.Y(obj);
        ByteReadChannel byteReadChannel = this.$this_toInputStream;
        this.label = 1;
        Object objAwaitContent$default = ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, this, 1, null);
        return objAwaitContent$default == aVar ? aVar : objAwaitContent$default;
    }
}
