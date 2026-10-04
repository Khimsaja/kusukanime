package io.ktor.network.sockets;

import H5.A;
import O3.C;
import S3.c;
import U3.e;
import U3.j;
import e4.n;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.network.sockets.DatagramSendChannel$send$2$1", f = "DatagramSendChannel.kt", l = {113, 126}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DatagramSendChannel$send$2$1 extends j implements n {
    final /* synthetic */ Datagram $element;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ DatagramSendChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatagramSendChannel$send$2$1(Datagram datagram, DatagramSendChannel datagramSendChannel, c<? super DatagramSendChannel$send$2$1> cVar) {
        super(2, cVar);
        this.$element = datagram;
        this.this$0 = datagramSendChannel;
    }

    @Override // U3.a
    public final c<C> create(Object obj, c<?> cVar) {
        return new DatagramSendChannel$send$2$1(this.$element, this.this$0, cVar);
    }

    @Override // e4.n
    public final Object invoke(A a, c<? super C> cVar) {
        return ((DatagramSendChannel$send$2$1) create(a, cVar)).invokeSuspend(C.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.DatagramSendChannel$send$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
