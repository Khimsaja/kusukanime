package io.ktor.network.sockets;

import O3.C;
import S3.c;
import io.ktor.network.sockets.DatagramReadChannel;
import io.ktor.network.sockets.DatagramWriteChannel;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/network/sockets/DatagramReadWriteChannel;", "Lio/ktor/network/sockets/DatagramReadChannel;", "Lio/ktor/network/sockets/DatagramWriteChannel;", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DatagramReadWriteChannel extends DatagramReadChannel, DatagramWriteChannel {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Object receive(DatagramReadWriteChannel datagramReadWriteChannel, c<? super Datagram> cVar) {
            return DatagramReadChannel.DefaultImpls.receive(datagramReadWriteChannel, cVar);
        }

        public static Object send(DatagramReadWriteChannel datagramReadWriteChannel, Datagram datagram, c<? super C> cVar) {
            Object objSend = DatagramWriteChannel.DefaultImpls.send(datagramReadWriteChannel, datagram, cVar);
            return objSend == T3.a.f9048k ? objSend : C.a;
        }
    }
}
