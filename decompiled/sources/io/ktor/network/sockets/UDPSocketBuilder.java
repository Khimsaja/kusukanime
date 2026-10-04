package io.ktor.network.sockets;

import O3.C;
import S3.c;
import e4.k;
import io.ktor.network.selector.SelectorManager;
import io.ktor.network.sockets.Configurable;
import io.ktor.network.sockets.SocketOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u0014J:\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lio/ktor/network/sockets/UDPSocketBuilder;", "Lio/ktor/network/sockets/Configurable;", "Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;", "Lio/ktor/network/selector/SelectorManager;", "selector", "options", "<init>", "(Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;)V", "Lio/ktor/network/sockets/SocketAddress;", "localAddress", "Lkotlin/Function1;", "LO3/C;", "configure", "Lio/ktor/network/sockets/BoundDatagramSocket;", "bind", "(Lio/ktor/network/sockets/SocketAddress;Le4/k;LS3/c;)Ljava/lang/Object;", "", "hostname", "", "port", "(Ljava/lang/String;ILe4/k;LS3/c;)Ljava/lang/Object;", "remoteAddress", "Lio/ktor/network/sockets/ConnectedDatagramSocket;", "connect", "(Lio/ktor/network/sockets/SocketAddress;Lio/ktor/network/sockets/SocketAddress;Le4/k;LS3/c;)Ljava/lang/Object;", "Lio/ktor/network/selector/SelectorManager;", "Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;", "getOptions", "()Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;", "setOptions", "(Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;)V", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UDPSocketBuilder implements Configurable<UDPSocketBuilder, SocketOptions.UDPSocketOptions> {
    private SocketOptions.UDPSocketOptions options;
    private final SelectorManager selector;

    public UDPSocketBuilder(SelectorManager selectorManager, SocketOptions.UDPSocketOptions uDPSocketOptions) {
        l.f("selector", selectorManager);
        l.f("options", uDPSocketOptions);
        this.selector = selectorManager;
        this.options = uDPSocketOptions;
    }

    public static /* synthetic */ Object bind$default(UDPSocketBuilder uDPSocketBuilder, SocketAddress socketAddress, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            socketAddress = null;
        }
        if ((i7 & 2) != 0) {
            kVar = new b(3);
        }
        return uDPSocketBuilder.bind(socketAddress, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C bind$lambda$0(SocketOptions.UDPSocketOptions uDPSocketOptions) {
        l.f("<this>", uDPSocketOptions);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C bind$lambda$1(SocketOptions.UDPSocketOptions uDPSocketOptions) {
        l.f("<this>", uDPSocketOptions);
        return C.a;
    }

    public static /* synthetic */ Object connect$default(UDPSocketBuilder uDPSocketBuilder, SocketAddress socketAddress, SocketAddress socketAddress2, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            socketAddress2 = null;
        }
        if ((i7 & 4) != 0) {
            kVar = new b(4);
        }
        return uDPSocketBuilder.connect(socketAddress, socketAddress2, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C connect$lambda$2(SocketOptions.UDPSocketOptions uDPSocketOptions) {
        l.f("<this>", uDPSocketOptions);
        return C.a;
    }

    public final Object bind(SocketAddress socketAddress, k kVar, c<? super BoundDatagramSocket> cVar) {
        SelectorManager selectorManager = this.selector;
        SocketOptions.UDPSocketOptions uDPSocketOptionsUdp$ktor_network = getOptions().udp$ktor_network();
        kVar.invoke(uDPSocketOptionsUdp$ktor_network);
        return UDPSocketBuilderJvmKt.udpBind(selectorManager, socketAddress, uDPSocketOptionsUdp$ktor_network, cVar);
    }

    public final Object connect(SocketAddress socketAddress, SocketAddress socketAddress2, k kVar, c<? super ConnectedDatagramSocket> cVar) {
        SelectorManager selectorManager = this.selector;
        SocketOptions.UDPSocketOptions uDPSocketOptionsUdp$ktor_network = getOptions().udp$ktor_network();
        kVar.invoke(uDPSocketOptionsUdp$ktor_network);
        return UDPSocketBuilderJvmKt.udpConnect(selectorManager, socketAddress, socketAddress2, uDPSocketOptionsUdp$ktor_network, cVar);
    }

    public final Object bind(String str, int i7, k kVar, c<? super BoundDatagramSocket> cVar) {
        return bind(new InetSocketAddress(str, i7), kVar, cVar);
    }

    @Override // io.ktor.network.sockets.Configurable
    public UDPSocketBuilder configure(k kVar) {
        return (UDPSocketBuilder) Configurable.DefaultImpls.configure(this, kVar);
    }

    @Override // io.ktor.network.sockets.Configurable
    public SocketOptions.UDPSocketOptions getOptions() {
        return this.options;
    }

    @Override // io.ktor.network.sockets.Configurable
    public void setOptions(SocketOptions.UDPSocketOptions uDPSocketOptions) {
        l.f("<set-?>", uDPSocketOptions);
        this.options = uDPSocketOptions;
    }

    public static /* synthetic */ Object bind$default(UDPSocketBuilder uDPSocketBuilder, String str, int i7, k kVar, c cVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = "0.0.0.0";
        }
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            kVar = new b(2);
        }
        return uDPSocketBuilder.bind(str, i7, kVar, cVar);
    }
}
