package io.ktor.network.sockets;

import O3.C;
import S3.c;
import e4.k;
import io.ktor.network.selector.SelectorManager;
import io.ktor.network.sockets.Configurable;
import io.ktor.network.sockets.SocketOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\fH\u0086@¢\u0006\u0004\b\u0015\u0010\u0012J.\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0018J2\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00162\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\fH\u0086@¢\u0006\u0004\b\u0015\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lio/ktor/network/sockets/TcpSocketBuilder;", "Lio/ktor/network/sockets/Configurable;", "Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;", "Lio/ktor/network/selector/SelectorManager;", "selector", "options", "<init>", "(Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;)V", "", "hostname", "", "port", "Lkotlin/Function1;", "Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "LO3/C;", "configure", "Lio/ktor/network/sockets/Socket;", "connect", "(Ljava/lang/String;ILe4/k;LS3/c;)Ljava/lang/Object;", "Lio/ktor/network/sockets/SocketOptions$AcceptorOptions;", "Lio/ktor/network/sockets/ServerSocket;", "bind", "Lio/ktor/network/sockets/SocketAddress;", "remoteAddress", "(Lio/ktor/network/sockets/SocketAddress;Le4/k;LS3/c;)Ljava/lang/Object;", "localAddress", "Lio/ktor/network/selector/SelectorManager;", "Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;", "getOptions", "()Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;", "setOptions", "(Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;)V", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TcpSocketBuilder implements Configurable<TcpSocketBuilder, SocketOptions.PeerSocketOptions> {
    private SocketOptions.PeerSocketOptions options;
    private final SelectorManager selector;

    public TcpSocketBuilder(SelectorManager selectorManager, SocketOptions.PeerSocketOptions peerSocketOptions) {
        l.f("selector", selectorManager);
        l.f("options", peerSocketOptions);
        this.selector = selectorManager;
        this.options = peerSocketOptions;
    }

    public static /* synthetic */ Object bind$default(TcpSocketBuilder tcpSocketBuilder, String str, int i7, k kVar, c cVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = "0.0.0.0";
        }
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            kVar = new b(1);
        }
        return tcpSocketBuilder.bind(str, i7, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C bind$lambda$1(SocketOptions.AcceptorOptions acceptorOptions) {
        l.f("<this>", acceptorOptions);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C bind$lambda$3(SocketOptions.AcceptorOptions acceptorOptions) {
        l.f("<this>", acceptorOptions);
        return C.a;
    }

    public static /* synthetic */ Object connect$default(TcpSocketBuilder tcpSocketBuilder, String str, int i7, k kVar, c cVar, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            kVar = new io.ktor.client.request.a(28);
        }
        return tcpSocketBuilder.connect(str, i7, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C connect$lambda$0(SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        l.f("<this>", tCPClientSocketOptions);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C connect$lambda$2(SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        l.f("<this>", tCPClientSocketOptions);
        return C.a;
    }

    public final Object bind(String str, int i7, k kVar, c<? super ServerSocket> cVar) {
        return bind(new InetSocketAddress(str, i7), kVar, cVar);
    }

    public final Object connect(String str, int i7, k kVar, c<? super Socket> cVar) {
        return connect(new InetSocketAddress(str, i7), kVar, cVar);
    }

    public final Object bind(SocketAddress socketAddress, k kVar, c<? super ServerSocket> cVar) {
        SelectorManager selectorManager = this.selector;
        SocketOptions.AcceptorOptions acceptorOptionsTcpAccept$ktor_network = getOptions().tcpAccept$ktor_network();
        kVar.invoke(acceptorOptionsTcpAccept$ktor_network);
        return ConnectUtilsJvmKt.tcpBind(selectorManager, socketAddress, acceptorOptionsTcpAccept$ktor_network, cVar);
    }

    @Override // io.ktor.network.sockets.Configurable
    public TcpSocketBuilder configure(k kVar) {
        return (TcpSocketBuilder) Configurable.DefaultImpls.configure(this, kVar);
    }

    public final Object connect(SocketAddress socketAddress, k kVar, c<? super Socket> cVar) {
        SelectorManager selectorManager = this.selector;
        SocketOptions.TCPClientSocketOptions tCPClientSocketOptionsTcpConnect$ktor_network = getOptions().tcpConnect$ktor_network();
        kVar.invoke(tCPClientSocketOptionsTcpConnect$ktor_network);
        return ConnectUtilsJvmKt.tcpConnect(selectorManager, socketAddress, tCPClientSocketOptionsTcpConnect$ktor_network, cVar);
    }

    @Override // io.ktor.network.sockets.Configurable
    public SocketOptions.PeerSocketOptions getOptions() {
        return this.options;
    }

    @Override // io.ktor.network.sockets.Configurable
    public void setOptions(SocketOptions.PeerSocketOptions peerSocketOptions) {
        l.f("<set-?>", peerSocketOptions);
        this.options = peerSocketOptions;
    }

    public static /* synthetic */ Object connect$default(TcpSocketBuilder tcpSocketBuilder, SocketAddress socketAddress, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new b(0);
        }
        return tcpSocketBuilder.connect(socketAddress, kVar, cVar);
    }

    public static /* synthetic */ Object bind$default(TcpSocketBuilder tcpSocketBuilder, SocketAddress socketAddress, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            socketAddress = null;
        }
        if ((i7 & 2) != 0) {
            kVar = new io.ktor.client.request.a(29);
        }
        return tcpSocketBuilder.bind(socketAddress, kVar, cVar);
    }
}
