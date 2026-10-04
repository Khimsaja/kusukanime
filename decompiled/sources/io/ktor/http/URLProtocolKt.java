package io.ktor.http;

import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Lio/ktor/http/URLProtocol;", "", "isWebsocket", "(Lio/ktor/http/URLProtocol;)Z", "isSecure", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class URLProtocolKt {
    public static final boolean isSecure(URLProtocol uRLProtocol) {
        l.f("<this>", uRLProtocol);
        return l.a(uRLProtocol.getName(), "https") || l.a(uRLProtocol.getName(), "wss");
    }

    public static final boolean isWebsocket(URLProtocol uRLProtocol) {
        l.f("<this>", uRLProtocol);
        return l.a(uRLProtocol.getName(), "ws") || l.a(uRLProtocol.getName(), "wss");
    }
}
