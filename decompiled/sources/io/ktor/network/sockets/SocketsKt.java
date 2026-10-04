package io.ktor.network.sockets;

import U3.c;
import U3.e;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u0010\u001a\u00020\u000f*\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\"\u0015\u0010\u0012\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0015\u0010\u0018\u001a\u00020\u0015*\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lio/ktor/network/sockets/ASocket;", "LO3/C;", "awaitClosed", "(Lio/ktor/network/sockets/ASocket;LS3/c;)Ljava/lang/Object;", "Lio/ktor/network/sockets/AReadable;", "Lio/ktor/utils/io/ByteReadChannel;", "openReadChannel", "(Lio/ktor/network/sockets/AReadable;)Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/network/sockets/AWritable;", "", "autoFlush", "Lio/ktor/utils/io/ByteWriteChannel;", "openWriteChannel", "(Lio/ktor/network/sockets/AWritable;Z)Lio/ktor/utils/io/ByteWriteChannel;", "Lio/ktor/network/sockets/Socket;", "Lio/ktor/network/sockets/Connection;", "connection", "(Lio/ktor/network/sockets/Socket;)Lio/ktor/network/sockets/Connection;", "isClosed", "(Lio/ktor/network/sockets/ASocket;)Z", "Lio/ktor/network/sockets/ServerSocket;", "", "getPort", "(Lio/ktor/network/sockets/ServerSocket;)I", "port", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SocketsKt {

    @e(c = "io.ktor.network.sockets.SocketsKt", f = "Sockets.kt", l = {49}, m = "awaitClosed")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.network.sockets.SocketsKt$awaitClosed$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SocketsKt.awaitClosed(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitClosed(io.ktor.network.sockets.ASocket r4, S3.c<? super O3.C> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.network.sockets.SocketsKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.network.sockets.SocketsKt$awaitClosed$1 r0 = (io.ktor.network.sockets.SocketsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.network.sockets.SocketsKt$awaitClosed$1 r0 = new io.ktor.network.sockets.SocketsKt$awaitClosed$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            io.ktor.network.sockets.ASocket r4 = (io.ktor.network.sockets.ASocket) r4
            P3.r.Y(r5)
            goto L45
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            P3.r.Y(r5)
            H5.f0 r5 = r4.getSocketContext()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.m(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            H5.f0 r5 = r4.getSocketContext()
            boolean r5 = r5.isCancelled()
            if (r5 != 0) goto L52
            O3.C r4 = O3.C.a
            return r4
        L52:
            H5.f0 r4 = r4.getSocketContext()
            java.util.concurrent.CancellationException r4 = r4.H()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.SocketsKt.awaitClosed(io.ktor.network.sockets.ASocket, S3.c):java.lang.Object");
    }

    public static final Connection connection(Socket socket) {
        l.f("<this>", socket);
        return new Connection(socket, openReadChannel(socket), openWriteChannel$default(socket, false, 1, null));
    }

    public static final int getPort(ServerSocket serverSocket) {
        l.f("<this>", serverSocket);
        return SocketAddressKt.port(serverSocket.getLocalAddress());
    }

    public static final boolean isClosed(ASocket aSocket) {
        l.f("<this>", aSocket);
        return aSocket.getSocketContext().J();
    }

    public static final ByteReadChannel openReadChannel(AReadable aReadable) {
        l.f("<this>", aReadable);
        ByteChannel byteChannel = new ByteChannel(false);
        aReadable.attachForReading(byteChannel);
        return byteChannel;
    }

    public static final ByteWriteChannel openWriteChannel(AWritable aWritable, boolean z7) {
        l.f("<this>", aWritable);
        ByteChannel byteChannel = new ByteChannel(z7);
        aWritable.attachForWriting(byteChannel);
        return byteChannel;
    }

    public static /* synthetic */ ByteWriteChannel openWriteChannel$default(AWritable aWritable, boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        return openWriteChannel(aWritable, z7);
    }
}
