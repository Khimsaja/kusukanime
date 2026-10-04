package io.ktor.client.plugins.sse;

import K5.InterfaceC0330i;
import O3.C;
import U3.e;
import U3.j;
import e4.n;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LK5/i;", "Lio/ktor/sse/ServerSentEvent;", "LO3/C;", "<anonymous>", "(LK5/i;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$1", f = "DefaultClientSSESession.kt", l = {48, 53, 57}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DefaultClientSSESession$_incoming$1 extends j implements n {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultClientSSESession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultClientSSESession$_incoming$1(DefaultClientSSESession defaultClientSSESession, S3.c<? super DefaultClientSSESession$_incoming$1> cVar) {
        super(2, cVar);
        this.this$0 = defaultClientSSESession;
    }

    @Override // U3.a
    public final S3.c<C> create(Object obj, S3.c<?> cVar) {
        DefaultClientSSESession$_incoming$1 defaultClientSSESession$_incoming$1 = new DefaultClientSSESession$_incoming$1(this.this$0, cVar);
        defaultClientSSESession$_incoming$1.L$0 = obj;
        return defaultClientSSESession$_incoming$1;
    }

    @Override // e4.n
    public final Object invoke(InterfaceC0330i interfaceC0330i, S3.c<? super C> cVar) {
        return ((DefaultClientSSESession$_incoming$1) create(interfaceC0330i, cVar)).invokeSuspend(C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (r1.emit(r8, r7) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        if (r1.doReconnection(r7) == r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097 A[PHI: r8
      0x0097: PHI (r8v3 K5.i) = (r8v8 K5.i), (r8v9 K5.i) binds: [B:23:0x0067, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008a -> B:15:0x0043). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00a9 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00ac -> B:13:0x0037). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L30
            if (r1 == r4) goto L28
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r1 = r7.L$0
            K5.i r1 = (K5.InterfaceC0330i) r1
            P3.r.Y(r8)
            r8 = r1
            goto L37
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            java.lang.Object r1 = r7.L$0
            K5.i r1 = (K5.InterfaceC0330i) r1
            P3.r.Y(r8)
            goto L8a
        L28:
            java.lang.Object r1 = r7.L$0
            K5.i r1 = (K5.InterfaceC0330i) r1
            P3.r.Y(r8)
            goto L63
        L30:
            P3.r.Y(r8)
            java.lang.Object r8 = r7.L$0
            K5.i r8 = (K5.InterfaceC0330i) r8
        L37:
            io.ktor.client.plugins.sse.DefaultClientSSESession r1 = r7.this$0
            S3.h r1 = r1.getCoroutineContext()
            boolean r1 = H5.D.v(r1)
            if (r1 == 0) goto Lb2
        L43:
            io.ktor.client.plugins.sse.DefaultClientSSESession r1 = r7.this$0
            S3.h r1 = r1.getCoroutineContext()
            boolean r1 = H5.D.v(r1)
            if (r1 == 0) goto L97
            io.ktor.client.plugins.sse.DefaultClientSSESession r1 = r7.this$0
            io.ktor.utils.io.ByteReadChannel r5 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$getInput$p(r1)
            r7.L$0 = r8
            r7.label = r4
            java.lang.Object r1 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$tryParseEvent(r1, r5, r7)
            if (r1 != r0) goto L60
            goto Lab
        L60:
            r6 = r1
            r1 = r8
            r8 = r6
        L63:
            io.ktor.sse.ServerSentEvent r8 = (io.ktor.sse.ServerSentEvent) r8
            if (r8 != 0) goto L69
            r8 = r1
            goto L97
        L69:
            io.ktor.client.plugins.sse.DefaultClientSSESession r5 = r7.this$0
            boolean r5 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$isCommentsEvent(r5, r8)
            if (r5 == 0) goto L79
            io.ktor.client.plugins.sse.DefaultClientSSESession r5 = r7.this$0
            boolean r5 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$getShowCommentEvents$p(r5)
            if (r5 == 0) goto L8a
        L79:
            io.ktor.client.plugins.sse.DefaultClientSSESession r5 = r7.this$0
            boolean r5 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$isRetryEvent(r5, r8)
            if (r5 == 0) goto L8c
            io.ktor.client.plugins.sse.DefaultClientSSESession r5 = r7.this$0
            boolean r5 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$getShowRetryEvents$p(r5)
            if (r5 == 0) goto L8a
            goto L8c
        L8a:
            r8 = r1
            goto L43
        L8c:
            r7.L$0 = r1
            r7.label = r3
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L8a
            goto Lab
        L97:
            io.ktor.client.plugins.sse.DefaultClientSSESession r1 = r7.this$0
            boolean r1 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$getNeedToReconnect$p(r1)
            if (r1 == 0) goto Lac
            io.ktor.client.plugins.sse.DefaultClientSSESession r1 = r7.this$0
            r7.L$0 = r8
            r7.label = r2
            java.lang.Object r1 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$doReconnection(r1, r7)
            if (r1 != r0) goto L37
        Lab:
            return r0
        Lac:
            io.ktor.client.plugins.sse.DefaultClientSSESession r1 = r7.this$0
            io.ktor.client.plugins.sse.DefaultClientSSESession.access$close(r1)
            goto L37
        Lb2:
            O3.C r8 = O3.C.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
