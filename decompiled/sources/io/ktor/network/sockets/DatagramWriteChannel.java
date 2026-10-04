package io.ktor.network.sockets;

import J5.v;
import O3.C;
import S3.c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lio/ktor/network/sockets/DatagramWriteChannel;", "", "Lio/ktor/network/sockets/Datagram;", "datagram", "LO3/C;", "send", "(Lio/ktor/network/sockets/Datagram;LS3/c;)Ljava/lang/Object;", "LJ5/v;", "getOutgoing", "()LJ5/v;", "outgoing", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DatagramWriteChannel {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Object send(DatagramWriteChannel datagramWriteChannel, Datagram datagram, c<? super C> cVar) {
            Object objSend = datagramWriteChannel.getOutgoing().send(datagram, cVar);
            return objSend == T3.a.f9048k ? objSend : C.a;
        }
    }

    v getOutgoing();

    Object send(Datagram datagram, c<? super C> cVar);
}
