package io.ktor.network.sockets;

import O3.C;
import S3.c;
import io.ktor.network.sockets.ASocket;
import io.ktor.network.sockets.DatagramReadWriteChannel;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/network/sockets/BoundDatagramSocket;", "Lio/ktor/network/sockets/ASocket;", "Lio/ktor/network/sockets/ABoundSocket;", "Lio/ktor/network/sockets/DatagramReadWriteChannel;", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BoundDatagramSocket extends ASocket, ABoundSocket, DatagramReadWriteChannel {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void dispose(BoundDatagramSocket boundDatagramSocket) {
            ASocket.DefaultImpls.dispose(boundDatagramSocket);
        }

        public static Object receive(BoundDatagramSocket boundDatagramSocket, c<? super Datagram> cVar) {
            return DatagramReadWriteChannel.DefaultImpls.receive(boundDatagramSocket, cVar);
        }

        public static Object send(BoundDatagramSocket boundDatagramSocket, Datagram datagram, c<? super C> cVar) {
            Object objSend = DatagramReadWriteChannel.DefaultImpls.send(boundDatagramSocket, datagram, cVar);
            return objSend == T3.a.f9048k ? objSend : C.a;
        }
    }
}
