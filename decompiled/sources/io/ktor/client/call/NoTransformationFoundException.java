package io.ktor.client.call;

import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import l4.InterfaceC1425d;
import z5.AbstractC2511p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/client/call/NoTransformationFoundException;", "Ljava/lang/UnsupportedOperationException;", "Lkotlin/UnsupportedOperationException;", "Lio/ktor/client/statement/HttpResponse;", "response", "Ll4/d;", "from", "to", "<init>", "(Lio/ktor/client/statement/HttpResponse;Ll4/d;Ll4/d;)V", "", ContentType.Message.TYPE, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NoTransformationFoundException extends UnsupportedOperationException {
    private final String message;

    public NoTransformationFoundException(HttpResponse httpResponse, InterfaceC1425d interfaceC1425d, InterfaceC1425d interfaceC1425d2) {
        l.f("response", httpResponse);
        l.f("from", interfaceC1425d);
        l.f("to", interfaceC1425d2);
        StringBuilder sb = new StringBuilder("\n        Expected response body of the type '");
        sb.append(interfaceC1425d2);
        sb.append("' but was '");
        sb.append(interfaceC1425d);
        sb.append("'\n        In response from `");
        sb.append(HttpResponseKt.getRequest(httpResponse).getUrl());
        sb.append("`\n        Response status `");
        sb.append(httpResponse.getStatus());
        sb.append("`\n        Response header `ContentType: ");
        Headers headers = httpResponse.getHeaders();
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        sb.append(headers.get(httpHeaders.getContentType()));
        sb.append("` \n        Request header `Accept: ");
        sb.append(HttpResponseKt.getRequest(httpResponse).getHeaders().get(httpHeaders.getAccept()));
        sb.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.message = AbstractC2511p.E(sb.toString());
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
