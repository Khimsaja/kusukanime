package io.ktor.client.call;

import S3.h;
import e4.k;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&¨\u0006*"}, d2 = {"Lio/ktor/client/call/DelegatedResponse;", "Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/client/call/HttpClientCall;", "call", "origin", "Lkotlin/Function1;", "Lio/ktor/utils/io/ByteReadChannel;", "content", "Lio/ktor/http/Headers;", "headers", "<init>", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/client/statement/HttpResponse;Le4/k;Lio/ktor/http/Headers;)V", "Lio/ktor/client/call/HttpClientCall;", "getCall", "()Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/statement/HttpResponse;", "Le4/k;", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "LS3/h;", "coroutineContext", "LS3/h;", "getCoroutineContext", "()LS3/h;", "getRawContent", "()Lio/ktor/utils/io/ByteReadChannel;", "rawContent", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "status", "Lio/ktor/http/HttpProtocolVersion;", "getVersion", "()Lio/ktor/http/HttpProtocolVersion;", "version", "Lio/ktor/util/date/GMTDate;", "getRequestTime", "()Lio/ktor/util/date/GMTDate;", "requestTime", "getResponseTime", "responseTime", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DelegatedResponse extends HttpResponse {
    private final HttpClientCall call;
    private final k content;
    private final h coroutineContext;
    private final Headers headers;
    private final HttpResponse origin;

    public /* synthetic */ DelegatedResponse(HttpClientCall httpClientCall, HttpResponse httpResponse, k kVar, Headers headers, int i7, f fVar) {
        this(httpClientCall, httpResponse, kVar, (i7 & 8) != 0 ? httpResponse.getHeaders() : headers);
    }

    @Override // io.ktor.client.statement.HttpResponse
    public HttpClientCall getCall() {
        return this.call;
    }

    @Override // io.ktor.client.statement.HttpResponse, H5.A
    public h getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.http.HttpMessage
    public Headers getHeaders() {
        return this.headers;
    }

    @Override // io.ktor.client.statement.HttpResponse
    public ByteReadChannel getRawContent() {
        return (ByteReadChannel) this.content.invoke(this.origin);
    }

    @Override // io.ktor.client.statement.HttpResponse
    public GMTDate getRequestTime() {
        return this.origin.getRequestTime();
    }

    @Override // io.ktor.client.statement.HttpResponse
    public GMTDate getResponseTime() {
        return this.origin.getResponseTime();
    }

    @Override // io.ktor.client.statement.HttpResponse
    public HttpStatusCode getStatus() {
        return this.origin.getStatus();
    }

    @Override // io.ktor.client.statement.HttpResponse
    public HttpProtocolVersion getVersion() {
        return this.origin.getVersion();
    }

    public DelegatedResponse(HttpClientCall httpClientCall, HttpResponse httpResponse, k kVar, Headers headers) {
        l.f("call", httpClientCall);
        l.f("origin", httpResponse);
        l.f("content", kVar);
        l.f("headers", headers);
        this.call = httpClientCall;
        this.origin = httpResponse;
        this.content = kVar;
        this.headers = headers;
        this.coroutineContext = httpResponse.getCoroutineContext();
    }
}
