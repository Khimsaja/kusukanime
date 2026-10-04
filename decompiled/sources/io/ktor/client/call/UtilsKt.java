package io.ktor.client.call;

import io.ktor.http.HttpMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "contentLength", "bodySize", "Lio/ktor/http/HttpMethod;", "method", "LO3/C;", "checkContentLength", "(Ljava/lang/Long;JLio/ktor/http/HttpMethod;)V", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UtilsKt {
    public static final void checkContentLength(Long l7, long j7, HttpMethod httpMethod) {
        l.f("method", httpMethod);
        if (l7 == null || l7.longValue() < 0 || httpMethod.equals(HttpMethod.INSTANCE.getHead()) || l7.longValue() == j7) {
            return;
        }
        throw new IllegalStateException(("Content-Length mismatch: expected " + l7 + " bytes, but received " + j7 + " bytes").toString());
    }
}
