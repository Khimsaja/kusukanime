package io.ktor.network.sockets;

import U3.c;
import U3.e;
import kotlin.Metadata;

@e(c = "io.ktor.network.sockets.SocketImpl", f = "SocketImpl.kt", l = {47, 65}, m = "connect$ktor_network")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SocketImpl$connect$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SocketImpl<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SocketImpl$connect$1(SocketImpl<? extends S> socketImpl, S3.c<? super SocketImpl$connect$1> cVar) {
        super(cVar);
        this.this$0 = socketImpl;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.connect$ktor_network(null, this);
    }
}
