package io.ktor.network.sockets;

import H5.InterfaceC0265f0;
import H5.N;
import java.io.Closeable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lio/ktor/network/sockets/ASocket;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "LH5/N;", "LO3/C;", "dispose", "()V", "LH5/f0;", "getSocketContext", "()LH5/f0;", "socketContext", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ASocket extends Closeable, N {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void dispose(ASocket aSocket) {
            try {
                aSocket.close();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // H5.N
    void dispose();

    InterfaceC0265f0 getSocketContext();
}
