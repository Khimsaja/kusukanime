package io.ktor.client.plugins.sse;

import K5.InterfaceC0329h;
import S3.h;
import e4.n;
import io.ktor.client.call.HttpClientCall;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR(\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00108\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lio/ktor/client/plugins/sse/ClientSSESessionWithDeserialization;", "Lio/ktor/client/plugins/sse/SSESessionWithDeserialization;", "Lio/ktor/client/call/HttpClientCall;", "call", "delegate", "<init>", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/client/plugins/sse/SSESessionWithDeserialization;)V", "Lio/ktor/client/call/HttpClientCall;", "getCall", "()Lio/ktor/client/call/HttpClientCall;", "LK5/h;", "Lio/ktor/sse/TypedServerSentEvent;", "", "getIncoming", "()LK5/h;", "incoming", "Lkotlin/Function2;", "Lio/ktor/util/reflect/TypeInfo;", "", "getDeserializer", "()Le4/n;", "deserializer", "LS3/h;", "getCoroutineContext", "()LS3/h;", "coroutineContext", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClientSSESessionWithDeserialization implements SSESessionWithDeserialization {
    private final /* synthetic */ SSESessionWithDeserialization $$delegate_0;
    private final HttpClientCall call;

    public ClientSSESessionWithDeserialization(HttpClientCall httpClientCall, SSESessionWithDeserialization sSESessionWithDeserialization) {
        l.f("call", httpClientCall);
        l.f("delegate", sSESessionWithDeserialization);
        this.$$delegate_0 = sSESessionWithDeserialization;
        this.call = httpClientCall;
    }

    public final HttpClientCall getCall() {
        return this.call;
    }

    @Override // io.ktor.client.plugins.sse.SSESessionWithDeserialization, H5.A
    public h getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override // io.ktor.client.plugins.sse.SSESessionWithDeserialization
    public n getDeserializer() {
        return this.$$delegate_0.getDeserializer();
    }

    @Override // io.ktor.client.plugins.sse.SSESessionWithDeserialization
    public InterfaceC0329h getIncoming() {
        return this.$$delegate_0.getIncoming();
    }
}
