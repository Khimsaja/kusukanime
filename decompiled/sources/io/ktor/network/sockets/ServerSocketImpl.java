package io.ktor.network.sockets;

import H5.D;
import H5.h0;
import H5.r;
import U3.c;
import U3.e;
import io.ktor.network.selector.SelectInterest;
import io.ktor.network.selector.SelectableBase;
import io.ktor.network.selector.SelectorManager;
import io.ktor.network.sockets.ServerSocket;
import java.io.IOException;
import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lio/ktor/network/sockets/ServerSocketImpl;", "Lio/ktor/network/selector/SelectableBase;", "Lio/ktor/network/sockets/ServerSocket;", "Ljava/nio/channels/ServerSocketChannel;", "channel", "Lio/ktor/network/selector/SelectorManager;", "selector", "<init>", "(Ljava/nio/channels/ServerSocketChannel;Lio/ktor/network/selector/SelectorManager;)V", "Lio/ktor/network/sockets/Socket;", "acceptSuspend", "(LS3/c;)Ljava/lang/Object;", "Ljava/nio/channels/SocketChannel;", "nioChannel", "accepted", "(Ljava/nio/channels/SocketChannel;)Lio/ktor/network/sockets/Socket;", "accept", "LO3/C;", "close", "()V", "Ljava/nio/channels/ServerSocketChannel;", "getChannel", "()Ljava/nio/channels/ServerSocketChannel;", "Lio/ktor/network/selector/SelectorManager;", "getSelector", "()Lio/ktor/network/selector/SelectorManager;", "LH5/r;", "socketContext", "LH5/r;", "getSocketContext", "()LH5/r;", "Lio/ktor/network/sockets/SocketAddress;", "getLocalAddress", "()Lio/ktor/network/sockets/SocketAddress;", "localAddress", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ServerSocketImpl extends SelectableBase implements ServerSocket {
    private final ServerSocketChannel channel;
    private final SelectorManager selector;
    private final r socketContext;

    @e(c = "io.ktor.network.sockets.ServerSocketImpl", f = "ServerSocketImpl.kt", l = {41}, m = "acceptSuspend")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.network.sockets.ServerSocketImpl$acceptSuspend$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ServerSocketImpl.this.acceptSuspend(this);
        }
    }

    public ServerSocketImpl(ServerSocketChannel serverSocketChannel, SelectorManager selectorManager) {
        l.f("channel", serverSocketChannel);
        l.f("selector", selectorManager);
        this.channel = serverSocketChannel;
        this.selector = selectorManager;
        if (getChannel().isBlocking()) {
            throw new IllegalArgumentException("Channel need to be configured as non-blocking.");
        }
        this.socketContext = D.d();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:18:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object acceptSuspend(S3.c<? super io.ktor.network.sockets.Socket> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.ktor.network.sockets.ServerSocketImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.network.sockets.ServerSocketImpl$acceptSuspend$1 r0 = (io.ktor.network.sockets.ServerSocketImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.network.sockets.ServerSocketImpl$acceptSuspend$1 r0 = new io.ktor.network.sockets.ServerSocketImpl$acceptSuspend$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            P3.r.Y(r5)
        L32:
            io.ktor.network.selector.SelectInterest r5 = io.ktor.network.selector.SelectInterest.ACCEPT
            r4.interestOp(r5, r3)
            io.ktor.network.selector.SelectorManager r2 = r4.selector
            r0.label = r3
            java.lang.Object r5 = r2.select(r4, r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            java.nio.channels.ServerSocketChannel r5 = r4.getChannel()
            java.nio.channels.SocketChannel r5 = r5.accept()
            if (r5 == 0) goto L32
            io.ktor.network.sockets.Socket r5 = r4.accepted(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.ServerSocketImpl.acceptSuspend(S3.c):java.lang.Object");
    }

    private final Socket accepted(SocketChannel nioChannel) throws IOException {
        interestOp(SelectInterest.ACCEPT, false);
        nioChannel.configureBlocking(false);
        if (getLocalAddress() instanceof InetSocketAddress) {
            if (JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
                nioChannel.setOption((SocketOption<SocketOption>) StandardSocketOptions.TCP_NODELAY, (SocketOption) Boolean.TRUE);
            } else {
                nioChannel.socket().setTcpNoDelay(true);
            }
        }
        return new SocketImpl(nioChannel, this.selector, null, 4, null);
    }

    @Override // io.ktor.network.sockets.Acceptable
    public Object accept(S3.c<? super Socket> cVar) throws IOException {
        SocketChannel socketChannelAccept = getChannel().accept();
        return socketChannelAccept != null ? accepted(socketChannelAccept) : acceptSuspend(cVar);
    }

    @Override // io.ktor.network.selector.SelectableBase, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            try {
                getChannel().close();
                this.selector.notifyClosed(this);
                ((h0) getSocketContext()).Z();
            } catch (Throwable th) {
                this.selector.notifyClosed(this);
                throw th;
            }
        } catch (Throwable th2) {
            ((h0) getSocketContext()).a0(th2);
        }
    }

    @Override // io.ktor.network.selector.SelectableBase, io.ktor.network.selector.Selectable, H5.N
    public void dispose() {
        ServerSocket.DefaultImpls.dispose(this);
    }

    @Override // io.ktor.network.sockets.ABoundSocket
    public SocketAddress getLocalAddress() {
        java.net.SocketAddress localAddress = JavaSocketOptionsKt.getJava7NetworkApisAvailable() ? getChannel().getLocalAddress() : getChannel().socket().getLocalSocketAddress();
        l.c(localAddress);
        return JavaSocketAddressUtilsKt.toSocketAddress(localAddress);
    }

    public final SelectorManager getSelector() {
        return this.selector;
    }

    @Override // io.ktor.network.selector.Selectable
    public ServerSocketChannel getChannel() {
        return this.channel;
    }

    @Override // io.ktor.network.sockets.ASocket
    public r getSocketContext() {
        return this.socketContext;
    }
}
