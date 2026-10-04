package io.ktor.network.sockets;

import H5.B;
import H5.D;
import H5.M;
import J5.s;
import J5.u;
import J5.v;
import O3.C;
import O5.d;
import P3.F;
import U3.c;
import U3.e;
import e4.n;
import io.ktor.network.selector.SelectInterest;
import io.ktor.network.selector.SelectorManager;
import io.ktor.network.sockets.BoundDatagramSocket;
import io.ktor.network.util.PoolsKt;
import io.ktor.utils.io.core.BytePacketBuilderExtensions_jvmKt;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0082P¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u0013R\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lio/ktor/network/sockets/DatagramSocketImpl;", "Lio/ktor/network/sockets/BoundDatagramSocket;", "Lio/ktor/network/sockets/ConnectedDatagramSocket;", "Lio/ktor/network/sockets/NIOSocketImpl;", "Ljava/nio/channels/DatagramChannel;", "channel", "Lio/ktor/network/selector/SelectorManager;", "selector", "<init>", "(Ljava/nio/channels/DatagramChannel;Lio/ktor/network/selector/SelectorManager;)V", "Lio/ktor/network/sockets/Datagram;", "receiveImpl", "(LS3/c;)Ljava/lang/Object;", "Ljava/nio/ByteBuffer;", "buffer", "receiveSuspend", "(Ljava/nio/ByteBuffer;LS3/c;)Ljava/lang/Object;", "LO3/C;", "close", "()V", "Ljava/nio/channels/DatagramChannel;", "getChannel", "()Ljava/nio/channels/DatagramChannel;", "LJ5/v;", "sender", "LJ5/v;", "LJ5/u;", "receiver", "LJ5/u;", "getReceiver$annotations", "Lio/ktor/network/sockets/SocketAddress;", "getLocalAddress", "()Lio/ktor/network/sockets/SocketAddress;", "localAddress", "getRemoteAddress", "remoteAddress", "getIncoming", "()LJ5/u;", "incoming", "getOutgoing", "()LJ5/v;", "outgoing", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatagramSocketImpl extends NIOSocketImpl<DatagramChannel> implements BoundDatagramSocket, ConnectedDatagramSocket {
    private final DatagramChannel channel;
    private final u receiver;
    private final v sender;

    @e(c = "io.ktor.network.sockets.DatagramSocketImpl", f = "DatagramSocketImpl.kt", l = {90}, m = "receiveSuspend")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.network.sockets.DatagramSocketImpl$receiveSuspend$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatagramSocketImpl.this.receiveSuspend(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatagramSocketImpl(DatagramChannel datagramChannel, SelectorManager selectorManager) {
        super(datagramChannel, selectorManager, PoolsKt.getDefaultDatagramByteBufferPool(), null, 8, null);
        l.f("channel", datagramChannel);
        l.f("selector", selectorManager);
        this.channel = datagramChannel;
        this.sender = new DatagramSendChannel(getChannel(), this);
        O5.e eVar = M.a;
        d dVar = d.f7623l;
        n datagramSocketImpl$receiver$1 = new DatagramSocketImpl$receiver$1(this, null);
        J5.c cVar = J5.c.f4299k;
        B b4 = B.f3790k;
        s sVar = new s(D.y(this, dVar), F.a(0, 4, cVar), true, true);
        sVar.b0(b4, sVar, datagramSocketImpl$receiver$1);
        this.receiver = sVar;
    }

    private static /* synthetic */ void getReceiver$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object receiveImpl(S3.c<? super Datagram> cVar) {
        ByteBuffer byteBufferBorrow = PoolsKt.getDefaultDatagramByteBufferPool().borrow();
        try {
            java.net.SocketAddress socketAddressReceive = getChannel().receive(byteBufferBorrow);
            if (socketAddressReceive == null) {
                return receiveSuspend(byteBufferBorrow, cVar);
            }
            interestOp(SelectInterest.READ, false);
            byteBufferBorrow.flip();
            S5.a aVar = new S5.a();
            BytePacketBuilderExtensions_jvmKt.writeFully(aVar, byteBufferBorrow);
            Datagram datagram = new Datagram(aVar, JavaSocketAddressUtilsKt.toSocketAddress(socketAddressReceive));
            return datagram;
        } finally {
            PoolsKt.getDefaultDatagramByteBufferPool().recycle(byteBufferBorrow);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0050 -> B:26:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object receiveSuspend(java.nio.ByteBuffer r6, S3.c<? super io.ktor.network.sockets.Datagram> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.network.sockets.DatagramSocketImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.network.sockets.DatagramSocketImpl$receiveSuspend$1 r0 = (io.ktor.network.sockets.DatagramSocketImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.network.sockets.DatagramSocketImpl$receiveSuspend$1 r0 = new io.ktor.network.sockets.DatagramSocketImpl$receiveSuspend$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.L$1
            io.ktor.network.sockets.DatagramSocketImpl r6 = (io.ktor.network.sockets.DatagramSocketImpl) r6
            java.lang.Object r2 = r0.L$0
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            P3.r.Y(r7)
            r7 = r2
            goto L53
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            P3.r.Y(r7)
            r7 = r6
            r6 = r5
        L3d:
            io.ktor.network.selector.SelectInterest r2 = io.ktor.network.selector.SelectInterest.READ
            r6.interestOp(r2, r3)
            io.ktor.network.selector.SelectorManager r4 = r6.getSelector()
            r0.L$0 = r7
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r2 = r4.select(r6, r2, r0)
            if (r2 != r1) goto L53
            return r1
        L53:
            java.nio.channels.DatagramChannel r2 = r6.getChannel()     // Catch: java.lang.Throwable -> L80
            java.net.SocketAddress r2 = r2.receive(r7)     // Catch: java.lang.Throwable -> L80
            if (r2 != 0) goto L5e
            goto L3d
        L5e:
            io.ktor.network.selector.SelectInterest r0 = io.ktor.network.selector.SelectInterest.READ
            r1 = 0
            r6.interestOp(r0, r1)
            r7.flip()
            S5.a r6 = new S5.a
            r6.<init>()
            io.ktor.utils.io.core.BytePacketBuilderExtensions_jvmKt.writeFully(r6, r7)
            io.ktor.network.sockets.SocketAddress r0 = io.ktor.network.sockets.JavaSocketAddressUtilsKt.toSocketAddress(r2)
            io.ktor.network.sockets.Datagram r1 = new io.ktor.network.sockets.Datagram
            r1.<init>(r6, r0)
            io.ktor.utils.io.pool.ObjectPool r6 = io.ktor.network.util.PoolsKt.getDefaultDatagramByteBufferPool()
            r6.recycle(r7)
            return r1
        L80:
            r6 = move-exception
            io.ktor.utils.io.pool.ObjectPool r0 = io.ktor.network.util.PoolsKt.getDefaultDatagramByteBufferPool()
            r0.recycle(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.DatagramSocketImpl.receiveSuspend(java.nio.ByteBuffer, S3.c):java.lang.Object");
    }

    @Override // io.ktor.network.sockets.SocketBase, io.ktor.network.selector.SelectableBase, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.receiver.e(null);
        super.close();
        this.sender.close(null);
    }

    @Override // io.ktor.network.sockets.DatagramReadChannel
    /* renamed from: getIncoming, reason: from getter */
    public u getReceiver() {
        return this.receiver;
    }

    @Override // io.ktor.network.sockets.ABoundSocket
    public SocketAddress getLocalAddress() {
        SocketAddress socketAddress;
        java.net.SocketAddress localAddress = JavaSocketOptionsKt.getJava7NetworkApisAvailable() ? getChannel().getLocalAddress() : getChannel().socket().getLocalSocketAddress();
        if (localAddress == null || (socketAddress = JavaSocketAddressUtilsKt.toSocketAddress(localAddress)) == null) {
            throw new IllegalStateException("Channel is not yet bound");
        }
        return socketAddress;
    }

    @Override // io.ktor.network.sockets.DatagramWriteChannel
    /* renamed from: getOutgoing, reason: from getter */
    public v getSender() {
        return this.sender;
    }

    @Override // io.ktor.network.sockets.AConnectedSocket
    public SocketAddress getRemoteAddress() {
        SocketAddress socketAddress;
        java.net.SocketAddress remoteAddress = JavaSocketOptionsKt.getJava7NetworkApisAvailable() ? getChannel().getRemoteAddress() : getChannel().socket().getRemoteSocketAddress();
        if (remoteAddress == null || (socketAddress = JavaSocketAddressUtilsKt.toSocketAddress(remoteAddress)) == null) {
            throw new IllegalStateException("Channel is not yet connected");
        }
        return socketAddress;
    }

    @Override // io.ktor.network.sockets.DatagramReadChannel
    public Object receive(S3.c<? super Datagram> cVar) {
        return BoundDatagramSocket.DefaultImpls.receive(this, cVar);
    }

    @Override // io.ktor.network.sockets.DatagramWriteChannel
    public Object send(Datagram datagram, S3.c<? super C> cVar) {
        return BoundDatagramSocket.DefaultImpls.send(this, datagram, cVar);
    }

    @Override // io.ktor.network.sockets.NIOSocketImpl, io.ktor.network.selector.Selectable
    public DatagramChannel getChannel() {
        return this.channel;
    }
}
