package io.ktor.client.plugins;

import O3.C;
import U3.j;
import e4.n;
import e4.o;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.request.HttpRequestBuilder;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/api/Send$Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@U3.e(c = "io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1", f = "HttpRequestRetry.kt", l = {352, 355, 371}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HttpRequestRetryKt$HttpRequestRetry$2$1 extends j implements o {
    final /* synthetic */ n $delay;
    final /* synthetic */ n $delayMillis;
    final /* synthetic */ int $maxRetries;
    final /* synthetic */ n $modifyRequest;
    final /* synthetic */ o $shouldRetry;
    final /* synthetic */ o $shouldRetryOnException;
    final /* synthetic */ ClientPluginBuilder<HttpRequestRetryConfig> $this_createClientPlugin;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRequestRetryKt$HttpRequestRetry$2$1(o oVar, o oVar2, int i7, n nVar, n nVar2, ClientPluginBuilder<HttpRequestRetryConfig> clientPluginBuilder, n nVar3, S3.c<? super HttpRequestRetryKt$HttpRequestRetry$2$1> cVar) {
        super(3, cVar);
        this.$shouldRetry = oVar;
        this.$shouldRetryOnException = oVar2;
        this.$maxRetries = i7;
        this.$delayMillis = nVar;
        this.$modifyRequest = nVar2;
        this.$this_createClientPlugin = clientPluginBuilder;
        this.$delay = nVar3;
    }

    @Override // e4.o
    public final Object invoke(Send.Sender sender, HttpRequestBuilder httpRequestBuilder, S3.c<? super HttpClientCall> cVar) {
        HttpRequestRetryKt$HttpRequestRetry$2$1 httpRequestRetryKt$HttpRequestRetry$2$1 = new HttpRequestRetryKt$HttpRequestRetry$2$1(this.$shouldRetry, this.$shouldRetryOnException, this.$maxRetries, this.$delayMillis, this.$modifyRequest, this.$this_createClientPlugin, this.$delay, cVar);
        httpRequestRetryKt$HttpRequestRetry$2$1.L$0 = sender;
        httpRequestRetryKt$HttpRequestRetry$2$1.L$1 = httpRequestBuilder;
        return httpRequestRetryKt$HttpRequestRetry$2$1.invokeSuspend(C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x01ed, code lost:
    
        if (r3.invoke(r4, r16) != r2) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0152 A[Catch: all -> 0x0133, PHI: r0 r7 r8 r9 r10 r11 r12 r13 r14 r15
      0x0152: PHI (r0v5 java.lang.Object) = (r0v10 java.lang.Object), (r0v23 java.lang.Object) binds: [B:42:0x014e, B:18:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r7v4 int) = (r7v5 int), (r7v11 int) binds: [B:42:0x014e, B:18:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r8v5 int) = (r8v7 int), (r8v16 int) binds: [B:42:0x014e, B:18:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r9v3 io.ktor.client.request.HttpRequestBuilder) = (r9v4 io.ktor.client.request.HttpRequestBuilder), (r9v14 io.ktor.client.request.HttpRequestBuilder) binds: [B:42:0x014e, B:18:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r10v4 e4.n) = (r10v5 e4.n), (r10v17 e4.n) binds: [B:42:0x014e, B:18:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r11v4 e4.n) = (r11v5 e4.n), (r11v15 e4.n) binds: [B:42:0x014e, B:18:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r12v4 e4.o) = (r12v5 e4.o), (r12v16 e4.o) binds: [B:42:0x014e, B:18:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r13v4 e4.o) = (r13v5 e4.o), (r13v12 e4.o) binds: [B:42:0x014e, B:18:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r14v4 io.ktor.client.request.HttpRequestBuilder) = (r14v5 io.ktor.client.request.HttpRequestBuilder), (r14v11 io.ktor.client.request.HttpRequestBuilder) binds: [B:42:0x014e, B:18:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r15v5 io.ktor.client.plugins.api.Send$Sender) = (r15v6 io.ktor.client.plugins.api.Send$Sender), (r15v11 io.ktor.client.plugins.api.Send$Sender) binds: [B:42:0x014e, B:18:0x00a0] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0133, blocks: (B:38:0x011e, B:41:0x0136, B:44:0x0152, B:46:0x015a), top: B:63:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015a A[Catch: all -> 0x0133, TRY_LEAVE, TryCatch #1 {all -> 0x0133, blocks: (B:38:0x011e, B:41:0x0136, B:44:0x0152, B:46:0x015a), top: B:63:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017e A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:48:0x0173, B:52:0x017e, B:12:0x006f, B:17:0x009d), top: B:62:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01ed -> B:8:0x0036). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
