package io.ktor.client.plugins.observer;

import O3.InterfaceC0554c;
import e4.InterfaceC0821a;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\u0003\u0010\u0007\u001a#\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/utils/io/ByteReadChannel;", "content", "wrapWithContent", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/utils/io/ByteReadChannel;)Lio/ktor/client/call/HttpClientCall;", "Lkotlin/Function0;", "block", "(Lio/ktor/client/call/HttpClientCall;Le4/a;)Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/http/Headers;", "headers", "wrap", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/http/Headers;)Lio/ktor/client/call/HttpClientCall;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DelegatedCallKt {
    @InterfaceC0554c
    public static final HttpClientCall wrap(HttpClientCall httpClientCall, ByteReadChannel byteReadChannel, Headers headers) {
        l.f("<this>", httpClientCall);
        l.f("content", byteReadChannel);
        l.f("headers", headers);
        return io.ktor.client.call.DelegatedCallKt.replaceResponse(httpClientCall, headers, new b(byteReadChannel, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteReadChannel wrap$lambda$2(ByteReadChannel byteReadChannel, HttpResponse httpResponse) {
        l.f("$this$replaceResponse", httpResponse);
        return byteReadChannel;
    }

    @InterfaceC0554c
    public static final HttpClientCall wrapWithContent(HttpClientCall httpClientCall, ByteReadChannel byteReadChannel) {
        l.f("<this>", httpClientCall);
        l.f("content", byteReadChannel);
        return io.ktor.client.call.DelegatedCallKt.replaceResponse$default(httpClientCall, null, new b(byteReadChannel, 2), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteReadChannel wrapWithContent$lambda$0(ByteReadChannel byteReadChannel, HttpResponse httpResponse) {
        l.f("$this$replaceResponse", httpResponse);
        return byteReadChannel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteReadChannel wrapWithContent$lambda$1(InterfaceC0821a interfaceC0821a, HttpResponse httpResponse) {
        l.f("$this$replaceResponse", httpResponse);
        return (ByteReadChannel) interfaceC0821a.invoke();
    }

    @InterfaceC0554c
    public static final HttpClientCall wrapWithContent(HttpClientCall httpClientCall, InterfaceC0821a interfaceC0821a) {
        l.f("<this>", httpClientCall);
        l.f("block", interfaceC0821a);
        return io.ktor.client.call.DelegatedCallKt.replaceResponse$default(httpClientCall, null, new a(interfaceC0821a, 0), 1, null);
    }
}
