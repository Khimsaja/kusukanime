package io.ktor.client.engine;

import io.ktor.http.LinkHeader;
import java.net.Proxy;
import java.net.SocketAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0019\u0010\t\u001a\u00020\u0006*\u00060\u0000j\u0002`\u00018F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b*\n\u0010\n\"\u00020\u00002\u00020\u0000¨\u0006\u000b"}, d2 = {"Ljava/net/Proxy;", "Lio/ktor/client/engine/ProxyConfig;", "Ljava/net/SocketAddress;", "Lio/ktor/util/network/NetworkAddress;", "resolveAddress", "(Ljava/net/Proxy;)Ljava/net/SocketAddress;", "Lio/ktor/client/engine/ProxyType;", "getType", "(Ljava/net/Proxy;)Lio/ktor/client/engine/ProxyType;", LinkHeader.Parameters.Type, "ProxyConfig", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProxyConfigJvmKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.SOCKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ProxyType getType(Proxy proxy) {
        l.f("<this>", proxy);
        Proxy.Type type = proxy.type();
        int i7 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        return i7 != 1 ? i7 != 2 ? ProxyType.UNKNOWN : ProxyType.HTTP : ProxyType.SOCKS;
    }

    public static final SocketAddress resolveAddress(Proxy proxy) {
        l.f("<this>", proxy);
        SocketAddress socketAddressAddress = proxy.address();
        l.e("address(...)", socketAddressAddress);
        return socketAddressAddress;
    }
}
