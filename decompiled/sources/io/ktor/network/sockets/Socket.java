package io.ktor.network.sockets;

import H5.A;
import S3.h;
import io.ktor.network.sockets.ReadWriteSocket;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/network/sockets/Socket;", "Lio/ktor/network/sockets/ReadWriteSocket;", "Lio/ktor/network/sockets/ABoundSocket;", "Lio/ktor/network/sockets/AConnectedSocket;", "LH5/A;", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Socket extends ReadWriteSocket, ABoundSocket, AConnectedSocket, A {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void dispose(Socket socket) {
            ReadWriteSocket.DefaultImpls.dispose(socket);
        }
    }

    @Override // H5.A
    /* synthetic */ h getCoroutineContext();
}
