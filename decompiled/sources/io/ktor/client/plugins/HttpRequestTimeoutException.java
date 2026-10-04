package io.ktor.client.plugins;

import H5.InterfaceC0279u;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestData;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/client/plugins/HttpRequestTimeoutException;", "Ljava/io/IOException;", "Lkotlinx/io/IOException;", "LH5/u;", "", "url", "", "timeoutMillis", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Throwable;)V", "Lio/ktor/client/request/HttpRequestBuilder;", "request", "(Lio/ktor/client/request/HttpRequestBuilder;)V", "Lio/ktor/client/request/HttpRequestData;", "(Lio/ktor/client/request/HttpRequestData;)V", "createCopy", "()Lio/ktor/client/plugins/HttpRequestTimeoutException;", "Ljava/lang/String;", "Ljava/lang/Long;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpRequestTimeoutException extends IOException implements InterfaceC0279u {
    private final Long timeoutMillis;
    private final String url;

    public /* synthetic */ HttpRequestTimeoutException(String str, Long l7, Throwable th, int i7, kotlin.jvm.internal.f fVar) {
        this(str, l7, (i7 & 4) != 0 ? null : th);
    }

    public HttpRequestTimeoutException(String str, Long l7, Throwable th) {
        l.f("url", str);
        StringBuilder sb = new StringBuilder("Request timeout has expired [url=");
        sb.append(str);
        sb.append(", request_timeout=");
        sb.append(l7 == null ? "unknown" : l7);
        sb.append(" ms]");
        super(sb.toString(), th);
        this.url = str;
        this.timeoutMillis = l7;
    }

    @Override // H5.InterfaceC0279u
    public HttpRequestTimeoutException createCopy() {
        return new HttpRequestTimeoutException(this.url, this.timeoutMillis, getCause());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpRequestTimeoutException(HttpRequestBuilder httpRequestBuilder) {
        l.f("request", httpRequestBuilder);
        String strBuildString = httpRequestBuilder.getUrl().buildString();
        HttpTimeoutConfig httpTimeoutConfig = (HttpTimeoutConfig) httpRequestBuilder.getCapabilityOrNull(HttpTimeoutCapability.INSTANCE);
        this(strBuildString, httpTimeoutConfig != null ? httpTimeoutConfig.get_requestTimeoutMillis() : null, null, 4, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpRequestTimeoutException(HttpRequestData httpRequestData) {
        l.f("request", httpRequestData);
        String urlString = httpRequestData.getUrl().getUrlString();
        HttpTimeoutConfig httpTimeoutConfig = (HttpTimeoutConfig) httpRequestData.getCapabilityOrNull(HttpTimeoutCapability.INSTANCE);
        this(urlString, httpTimeoutConfig != null ? httpTimeoutConfig.get_requestTimeoutMillis() : null, null, 4, null);
    }
}
