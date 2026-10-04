package io.ktor.network.sockets;

import J5.m;
import J5.v;
import M5.r;
import O3.C;
import O3.InterfaceC0554c;
import S5.j;
import U3.c;
import U3.e;
import e4.k;
import io.ktor.network.util.PoolsKt;
import io.ktor.utils.io.core.ByteReadPacketKt;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010 \u001a\u00020\r2\u0014\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\r0\u001eH\u0017¢\u0006\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u00148VX\u0097\u0004¢\u0006\f\u0012\u0004\b-\u0010\u0011\u001a\u0004\b+\u0010,R&\u00101\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lio/ktor/network/sockets/DatagramSendChannel;", "LJ5/v;", "Lio/ktor/network/sockets/Datagram;", "Ljava/nio/channels/DatagramChannel;", "channel", "Lio/ktor/network/sockets/DatagramSocketImpl;", "socket", "<init>", "(Ljava/nio/channels/DatagramChannel;Lio/ktor/network/sockets/DatagramSocketImpl;)V", "Ljava/nio/ByteBuffer;", "buffer", "Lio/ktor/network/sockets/SocketAddress;", "address", "LO3/C;", "sendSuspend", "(Ljava/nio/ByteBuffer;Lio/ktor/network/sockets/SocketAddress;LS3/c;)Ljava/lang/Object;", "closeAndCheckHandler", "()V", "", "cause", "", "close", "(Ljava/lang/Throwable;)Z", "element", "LJ5/m;", "trySend-JP2dKIU", "(Lio/ktor/network/sockets/Datagram;)Ljava/lang/Object;", "trySend", "send", "(Lio/ktor/network/sockets/Datagram;LS3/c;)Ljava/lang/Object;", "Lkotlin/Function1;", "handler", "invokeOnClose", "(Le4/k;)V", "Ljava/nio/channels/DatagramChannel;", "getChannel", "()Ljava/nio/channels/DatagramChannel;", "Lio/ktor/network/sockets/DatagramSocketImpl;", "getSocket", "()Lio/ktor/network/sockets/DatagramSocketImpl;", "LR5/a;", "lock", "LR5/a;", "isClosedForSend", "()Z", "isClosedForSend$annotations", "LP5/a;", "getOnSend", "()LP5/a;", "onSend", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatagramSendChannel implements v {
    private final DatagramChannel channel;
    private volatile /* synthetic */ int closed;
    private volatile /* synthetic */ Object closedCause;
    private final R5.a lock;
    private volatile /* synthetic */ Object onCloseHandler;
    private final DatagramSocketImpl socket;
    private static final /* synthetic */ AtomicReferenceFieldUpdater onCloseHandler$FU = AtomicReferenceFieldUpdater.newUpdater(DatagramSendChannel.class, Object.class, "onCloseHandler");
    private static final /* synthetic */ AtomicIntegerFieldUpdater closed$FU = AtomicIntegerFieldUpdater.newUpdater(DatagramSendChannel.class, "closed");

    @e(c = "io.ktor.network.sockets.DatagramSendChannel", f = "DatagramSendChannel.kt", l = {201, 95}, m = "send")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.network.sockets.DatagramSendChannel$send$1, reason: invalid class name */
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
            return DatagramSendChannel.this.send((Datagram) null, (S3.c<? super C>) this);
        }
    }

    @e(c = "io.ktor.network.sockets.DatagramSendChannel", f = "DatagramSendChannel.kt", l = {136}, m = "sendSuspend")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.network.sockets.DatagramSendChannel$sendSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12371 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12371(S3.c<? super C12371> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatagramSendChannel.this.sendSuspend(null, null, this);
        }
    }

    public DatagramSendChannel(DatagramChannel datagramChannel, DatagramSocketImpl datagramSocketImpl) {
        l.f("channel", datagramChannel);
        l.f("socket", datagramSocketImpl);
        this.channel = datagramChannel;
        this.socket = datagramSocketImpl;
        this.onCloseHandler = null;
        this.closed = 0;
        this.closedCause = null;
        this.lock = new R5.c();
    }

    private final void closeAndCheckHandler() {
        while (true) {
            k kVar = (k) this.onCloseHandler;
            if (kVar != DatagramSendChannelKt.CLOSED_INVOKED) {
                if (kVar == null) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = onCloseHandler$FU;
                    k kVar2 = DatagramSendChannelKt.CLOSED;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, kVar2)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = onCloseHandler$FU;
                k kVar3 = DatagramSendChannelKt.CLOSED_INVOKED;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, kVar, kVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != kVar) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
                kVar.invoke(this.closedCause);
                return;
            }
            return;
        }
    }

    public static /* synthetic */ void isClosedForSend$annotations() {
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0056 -> B:18:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendSuspend(java.nio.ByteBuffer r7, io.ktor.network.sockets.SocketAddress r8, S3.c<? super O3.C> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof io.ktor.network.sockets.DatagramSendChannel.C12371
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.network.sockets.DatagramSendChannel$sendSuspend$1 r0 = (io.ktor.network.sockets.DatagramSendChannel.C12371) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.network.sockets.DatagramSendChannel$sendSuspend$1 r0 = new io.ktor.network.sockets.DatagramSendChannel$sendSuspend$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.L$1
            io.ktor.network.sockets.SocketAddress r7 = (io.ktor.network.sockets.SocketAddress) r7
            java.lang.Object r8 = r0.L$0
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            P3.r.Y(r9)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L59
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            P3.r.Y(r9)
        L3d:
            io.ktor.network.sockets.DatagramSocketImpl r9 = r6.socket
            io.ktor.network.selector.SelectInterest r2 = io.ktor.network.selector.SelectInterest.WRITE
            r9.interestOp(r2, r3)
            io.ktor.network.sockets.DatagramSocketImpl r9 = r6.socket
            io.ktor.network.selector.SelectorManager r9 = r9.getSelector()
            io.ktor.network.sockets.DatagramSocketImpl r4 = r6.socket
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r9 = r9.select(r4, r2, r0)
            if (r9 != r1) goto L59
            return r1
        L59:
            java.nio.channels.DatagramChannel r9 = r6.channel
            java.net.SocketAddress r2 = io.ktor.network.sockets.JavaSocketAddressUtilsKt.toJavaAddress(r8)
            int r9 = r9.send(r7, r2)
            if (r9 == 0) goto L3d
            io.ktor.network.sockets.DatagramSocketImpl r7 = r6.socket
            io.ktor.network.selector.SelectInterest r8 = io.ktor.network.selector.SelectInterest.WRITE
            r9 = 0
            r7.interestOp(r8, r9)
            O3.C r7 = O3.C.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.DatagramSendChannel.sendSuspend(java.nio.ByteBuffer, io.ktor.network.sockets.SocketAddress, S3.c):java.lang.Object");
    }

    @Override // J5.v
    public boolean close(Throwable cause) {
        if (!closed$FU.compareAndSet(this, 0, 1)) {
            return false;
        }
        this.closedCause = cause;
        if (!this.socket.isClosed()) {
            this.socket.close();
        }
        closeAndCheckHandler();
        return true;
    }

    public final DatagramChannel getChannel() {
        return this.channel;
    }

    public P5.a getOnSend() {
        throw new O3.k("An operation is not implemented: [DatagramSendChannel] doesn't support [onSend] select clause");
    }

    public final DatagramSocketImpl getSocket() {
        return this.socket;
    }

    @Override // J5.v
    public void invokeOnClose(k handler) {
        l.f("handler", handler);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = onCloseHandler$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, handler)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                if (this.onCloseHandler != DatagramSendChannelKt.CLOSED) {
                    DatagramSendChannelKt.failInvokeOnClose((k) this.onCloseHandler);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = onCloseHandler$FU;
                k kVar = DatagramSendChannelKt.CLOSED;
                k kVar2 = DatagramSendChannelKt.CLOSED_INVOKED;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, kVar, kVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != kVar) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
                handler.invoke(this.closedCause);
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    @Override // J5.v
    public boolean isClosedForSend() {
        return this.closed;
    }

    @Override // J5.v
    public /* bridge */ /* synthetic */ Object send(Object obj, S3.c cVar) {
        return send((Datagram) obj, (S3.c<? super C>) cVar);
    }

    @InterfaceC0554c
    public boolean offer(Datagram datagram) throws Throwable {
        Object objMo2trySendJP2dKIU = mo2trySendJP2dKIU((Object) datagram);
        if (!(objMo2trySendJP2dKIU instanceof J5.l)) {
            return true;
        }
        J5.k kVar = objMo2trySendJP2dKIU instanceof J5.k ? (J5.k) objMo2trySendJP2dKIU : null;
        Throwable th = kVar != null ? kVar.a : null;
        if (th == null) {
            return false;
        }
        int i7 = r.a;
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v12, types: [R5.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object send(io.ktor.network.sockets.Datagram r8, S3.c<? super O3.C> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof io.ktor.network.sockets.DatagramSendChannel.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.network.sockets.DatagramSendChannel$send$1 r0 = (io.ktor.network.sockets.DatagramSendChannel.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.network.sockets.DatagramSendChannel$send$1 r0 = new io.ktor.network.sockets.DatagramSendChannel$send$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.L$0
            R5.a r8 = (R5.a) r8
            P3.r.Y(r9)     // Catch: java.lang.Throwable -> L2f
            goto L72
        L2f:
            r9 = move-exception
            goto L7e
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.L$1
            R5.a r8 = (R5.a) r8
            java.lang.Object r2 = r0.L$0
            io.ktor.network.sockets.Datagram r2 = (io.ktor.network.sockets.Datagram) r2
            P3.r.Y(r9)
            r9 = r8
            r8 = r2
            goto L5b
        L47:
            P3.r.Y(r9)
            R5.a r9 = r7.lock
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            R5.c r9 = (R5.c) r9
            java.lang.Object r2 = r9.c(r0)
            if (r2 != r1) goto L5b
            goto L70
        L5b:
            O5.e r2 = H5.M.a     // Catch: java.lang.Throwable -> L7a
            O5.d r2 = O5.d.f7623l     // Catch: java.lang.Throwable -> L7a
            io.ktor.network.sockets.DatagramSendChannel$send$2$1 r4 = new io.ktor.network.sockets.DatagramSendChannel$send$2$1     // Catch: java.lang.Throwable -> L7a
            r4.<init>(r8, r7, r5)     // Catch: java.lang.Throwable -> L7a
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L7a
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L7a
            r0.label = r3     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r8 = H5.D.G(r2, r4, r0)     // Catch: java.lang.Throwable -> L7a
            if (r8 != r1) goto L71
        L70:
            return r1
        L71:
            r8 = r9
        L72:
            R5.c r8 = (R5.c) r8
            r8.e(r5)
            O3.C r8 = O3.C.a
            return r8
        L7a:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L7e:
            R5.c r8 = (R5.c) r8
            r8.e(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.DatagramSendChannel.send(io.ktor.network.sockets.Datagram, S3.c):java.lang.Object");
    }

    @Override // J5.v
    /* renamed from: trySend-JP2dKIU, reason: not valid java name and merged with bridge method [inline-methods] */
    public Object mo2trySendJP2dKIU(Datagram element) {
        boolean z7;
        l.f("element", element);
        if (!((R5.c) this.lock).d()) {
            return m.f4338b;
        }
        try {
            long remaining = ByteReadPacketKt.getRemaining(element.getPacket());
            S5.a aVarA = element.getPacket().a();
            if (aVarA.z()) {
                throw new IllegalArgumentException("Buffer is empty");
            }
            j jVar = aVarA.f8782k;
            l.c(jVar);
            byte[] bArr = jVar.a;
            int i7 = jVar.f8801b;
            ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(bArr, i7, jVar.f8802c - i7).slice().asReadOnlyBuffer();
            l.c(byteBufferAsReadOnlyBuffer);
            if (byteBufferAsReadOnlyBuffer.remaining() < remaining) {
                z7 = true;
            } else {
                z7 = false;
                if (this.channel.send(byteBufferAsReadOnlyBuffer, JavaSocketAddressUtilsKt.toJavaAddress(element.getAddress())) == 0) {
                    byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.limit());
                } else {
                    byteBufferAsReadOnlyBuffer.position(0);
                }
            }
            int iPosition = byteBufferAsReadOnlyBuffer.position();
            if (iPosition != 0) {
                if (iPosition < 0) {
                    throw new IllegalStateException("Returned negative read bytes count");
                }
                if (iPosition > jVar.b()) {
                    throw new IllegalStateException("Returned too many bytes");
                }
                aVarA.n(iPosition);
            }
            if (z7) {
                ObjectPool<ByteBuffer> defaultDatagramByteBufferPool = PoolsKt.getDefaultDatagramByteBufferPool();
                ByteBuffer byteBufferBorrow = defaultDatagramByteBufferPool.borrow();
                try {
                    ByteBuffer byteBuffer = byteBufferBorrow;
                    DatagramSendChannelKt.writeMessageTo(element.getPacket().N(), byteBuffer);
                    if (this.channel.send(byteBuffer, JavaSocketAddressUtilsKt.toJavaAddress(element.getAddress())) == 0) {
                        ByteReadPacketKt.discard$default(element.getPacket(), 0L, 1, null);
                    }
                    defaultDatagramByteBufferPool.recycle(byteBufferBorrow);
                } catch (Throwable th) {
                    defaultDatagramByteBufferPool.recycle(byteBufferBorrow);
                    throw th;
                }
            }
            ((R5.c) this.lock).e(null);
            return C.a;
        } catch (Throwable th2) {
            ((R5.c) this.lock).e(null);
            throw th2;
        }
    }
}
