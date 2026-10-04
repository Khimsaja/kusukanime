package p6;

import P3.r;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends ProxySelector {
    public static final a a = new a();

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return r.H(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
