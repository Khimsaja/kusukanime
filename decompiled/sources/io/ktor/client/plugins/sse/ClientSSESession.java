package io.ktor.client.plugins.sse;

import K5.InterfaceC0329h;
import S3.h;
import io.ktor.client.call.HttpClientCall;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lio/ktor/client/plugins/sse/ClientSSESession;", "Lio/ktor/client/plugins/sse/SSESession;", "Lio/ktor/client/call/HttpClientCall;", "call", "delegate", "<init>", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/client/plugins/sse/SSESession;)V", "Lio/ktor/client/call/HttpClientCall;", "getCall", "()Lio/ktor/client/call/HttpClientCall;", "LK5/h;", "Lio/ktor/sse/ServerSentEvent;", "getIncoming", "()LK5/h;", "incoming", "LS3/h;", "getCoroutineContext", "()LS3/h;", "coroutineContext", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClientSSESession implements SSESession {
    private final /* synthetic */ SSESession $$delegate_0;
    private final HttpClientCall call;

    public ClientSSESession(HttpClientCall httpClientCall, SSESession sSESession) {
        l.f("call", httpClientCall);
        l.f("delegate", sSESession);
        this.$$delegate_0 = sSESession;
        this.call = httpClientCall;
    }

    public final HttpClientCall getCall() {
        return this.call;
    }

    @Override // io.ktor.client.plugins.sse.SSESession, H5.A
    public h getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override // io.ktor.client.plugins.sse.SSESession
    public InterfaceC0329h getIncoming() {
        return this.$$delegate_0.getIncoming();
    }
}
