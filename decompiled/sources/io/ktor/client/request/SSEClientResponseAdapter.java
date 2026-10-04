package io.ktor.client.request;

import io.ktor.utils.io.InternalAPI;
import kotlin.Metadata;

@InternalAPI
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/ktor/client/request/SSEClientResponseAdapter;", "Lio/ktor/client/request/ResponseAdapter;", "<init>", "()V", "Lio/ktor/client/request/HttpRequestData;", "data", "Lio/ktor/http/HttpStatusCode;", "status", "Lio/ktor/http/Headers;", "headers", "Lio/ktor/utils/io/ByteReadChannel;", "responseBody", "Lio/ktor/http/content/OutgoingContent;", "outgoingContent", "LS3/h;", "callContext", "", "adapt", "(Lio/ktor/client/request/HttpRequestData;Lio/ktor/http/HttpStatusCode;Lio/ktor/http/Headers;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/http/content/OutgoingContent;LS3/h;)Ljava/lang/Object;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SSEClientResponseAdapter implements ResponseAdapter {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r3.equals(r2.getNoContent()) != false) goto L19;
     */
    @Override // io.ktor.client.request.ResponseAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object adapt(io.ktor.client.request.HttpRequestData r2, io.ktor.http.HttpStatusCode r3, io.ktor.http.Headers r4, io.ktor.utils.io.ByteReadChannel r5, io.ktor.http.content.OutgoingContent r6, S3.h r7) {
        /*
            r1 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.l.f(r0, r2)
            java.lang.String r0 = "status"
            kotlin.jvm.internal.l.f(r0, r3)
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.l.f(r0, r4)
            java.lang.String r0 = "responseBody"
            kotlin.jvm.internal.l.f(r0, r5)
            java.lang.String r0 = "outgoingContent"
            kotlin.jvm.internal.l.f(r0, r6)
            java.lang.String r0 = "callContext"
            kotlin.jvm.internal.l.f(r0, r7)
            io.ktor.http.HttpHeaders r7 = io.ktor.http.HttpHeaders.INSTANCE
            java.lang.String r7 = r7.getContentType()
            java.lang.String r4 = r4.get(r7)
            r7 = 0
            if (r4 == 0) goto L32
            io.ktor.http.ContentType$Companion r0 = io.ktor.http.ContentType.INSTANCE
            io.ktor.http.ContentType r4 = r0.parse(r4)
            goto L33
        L32:
            r4 = r7
        L33:
            boolean r0 = io.ktor.client.request.HttpRequestKt.isSseRequest(r2)
            if (r0 == 0) goto L71
            boolean r2 = io.ktor.client.request.HttpRequestKt.isSseReconnectionRequest(r2)
            if (r2 != 0) goto L71
            io.ktor.http.HttpStatusCode$Companion r2 = io.ktor.http.HttpStatusCode.INSTANCE
            io.ktor.http.HttpStatusCode r0 = r2.getOK()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L5f
            if (r4 == 0) goto L52
            io.ktor.http.ContentType r4 = r4.withoutParameters()
            goto L53
        L52:
            r4 = r7
        L53:
            io.ktor.http.ContentType$Text r0 = io.ktor.http.ContentType.Text.INSTANCE
            io.ktor.http.ContentType r0 = r0.getEventStream()
            boolean r4 = kotlin.jvm.internal.l.a(r4, r0)
            if (r4 != 0) goto L69
        L5f:
            io.ktor.http.HttpStatusCode r2 = r2.getNoContent()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L71
        L69:
            io.ktor.client.plugins.sse.SSEClientContent r6 = (io.ktor.client.plugins.sse.SSEClientContent) r6
            io.ktor.client.plugins.sse.DefaultClientSSESession r2 = new io.ktor.client.plugins.sse.DefaultClientSSESession
            r2.<init>(r6, r5)
            return r2
        L71:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.request.SSEClientResponseAdapter.adapt(io.ktor.client.request.HttpRequestData, io.ktor.http.HttpStatusCode, io.ktor.http.Headers, io.ktor.utils.io.ByteReadChannel, io.ktor.http.content.OutgoingContent, S3.h):java.lang.Object");
    }
}
