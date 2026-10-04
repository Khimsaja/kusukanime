package io.ktor.network.sockets;

import O3.C;
import O3.InterfaceC0554c;
import e4.k;
import io.ktor.network.selector.SelectorManager;
import io.ktor.network.sockets.SocketOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\u0007\u001a\u00028\u0000\"\u0012\b\u0000\u0010\u0006*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0005*\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/network/selector/SelectorManager;", "selector", "Lio/ktor/network/sockets/SocketBuilder;", "aSocket", "(Lio/ktor/network/selector/SelectorManager;)Lio/ktor/network/sockets/SocketBuilder;", "Lio/ktor/network/sockets/Configurable;", "T", "tcpNoDelay", "(Lio/ktor/network/sockets/Configurable;)Lio/ktor/network/sockets/Configurable;", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BuildersKt {
    public static final SocketBuilder aSocket(SelectorManager selectorManager) {
        l.f("selector", selectorManager);
        return new SocketBuilder(selectorManager, SocketOptions.INSTANCE.create$ktor_network());
    }

    @InterfaceC0554c
    public static final <T extends Configurable<? extends T, ?>> T tcpNoDelay(T t7) {
        l.f("<this>", t7);
        return (T) t7.configure(new k() { // from class: io.ktor.network.sockets.BuildersKt.tcpNoDelay.1
            @Override // e4.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SocketOptions) obj);
                return C.a;
            }

            public final void invoke(SocketOptions socketOptions) {
                l.f("$this$configure", socketOptions);
                if (socketOptions instanceof SocketOptions.TCPClientSocketOptions) {
                    ((SocketOptions.TCPClientSocketOptions) socketOptions).setNoDelay(true);
                }
            }
        });
    }
}
