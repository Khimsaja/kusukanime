package io.ktor.client.plugins.sse;

import A3.d;
import H5.A;
import H5.C0263e0;
import H5.C0284z;
import H5.D;
import H5.InterfaceC0265f0;
import K5.C0332k;
import K5.C0336o;
import K5.C0338q;
import K5.InterfaceC0329h;
import O3.C;
import O3.InterfaceC0554c;
import S3.h;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.sse.ServerSentEvent;
import io.ktor.sse.ServerSentEventKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelKt;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

@InterfaceC0554c
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0004H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u0004H\u0082@¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u000b*\u00060\u0017j\u0002`\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u0019*\u00060\u0017j\u0002`\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u0013H\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u001f*\u00020\u0013H\u0002¢\u0006\u0004\b\"\u0010!J\u0013\u0010#\u001a\u00020\u001f*\u00020\u0013H\u0002¢\u0006\u0004\b#\u0010!R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010.R\u0014\u00104\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0013098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0013098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lio/ktor/client/plugins/sse/DefaultClientSSESession;", "Lio/ktor/client/plugins/sse/SSESession;", "Lio/ktor/client/plugins/sse/SSEClientContent;", "content", "Lio/ktor/utils/io/ByteReadChannel;", "input", "LS3/h;", "coroutineContext", "<init>", "(Lio/ktor/client/plugins/sse/SSEClientContent;Lio/ktor/utils/io/ByteReadChannel;LS3/h;)V", "(Lio/ktor/client/plugins/sse/SSEClientContent;Lio/ktor/utils/io/ByteReadChannel;)V", "LO3/C;", "doReconnection", "(LS3/c;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequestBuilder;", "getRequestForReconnection", "()Lio/ktor/client/request/HttpRequestBuilder;", "close", "()V", "Lio/ktor/sse/ServerSentEvent;", "tryParseEvent", "(Lio/ktor/utils/io/ByteReadChannel;LS3/c;)Ljava/lang/Object;", "parseEvent", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "comment", "appendComment", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "toText", "(Ljava/lang/StringBuilder;)Ljava/lang/String;", "", "isEmpty", "(Lio/ktor/sse/ServerSentEvent;)Z", "isCommentsEvent", "isRetryEvent", "Lio/ktor/utils/io/ByteReadChannel;", "LS3/h;", "getCoroutineContext", "()LS3/h;", "lastEventId", "Ljava/lang/String;", "", "reconnectionTimeMillis", "J", "showCommentEvents", "Z", "showRetryEvents", "", "maxReconnectionAttempts", "I", "needToReconnect", "initialRequest", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/HttpClient;", "clientForReconnection", "Lio/ktor/client/HttpClient;", "LK5/h;", "_incoming", "LK5/h;", "getIncoming", "()LK5/h;", "incoming", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultClientSSESession implements SSESession {
    private InterfaceC0329h _incoming;
    private final HttpClient clientForReconnection;
    private final h coroutineContext;
    private final HttpRequestBuilder initialRequest;
    private ByteReadChannel input;
    private String lastEventId;
    private final int maxReconnectionAttempts;
    private boolean needToReconnect;
    private long reconnectionTimeMillis;
    private final boolean showCommentEvents;
    private final boolean showRetryEvents;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.client.plugins.sse.DefaultClientSSESession$doReconnection$2", f = "DefaultClientSSESession.kt", l = {95, 102}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.plugins.sse.DefaultClientSSESession$doReconnection$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements n {
        Object L$0;
        Object L$1;
        int label;

        public AnonymousClass2(S3.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            return DefaultClientSSESession.this.new AnonymousClass2(cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, S3.c<? super C> cVar) {
            return ((AnonymousClass2) create(a, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
        
            if (r10 != r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[Catch: all -> 0x001b, TRY_ENTER, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:28:0x00bb, B:30:0x00cb, B:31:0x00e3, B:33:0x00f6, B:34:0x00fc, B:19:0x0044, B:22:0x0061, B:24:0x0073, B:25:0x00a8, B:14:0x002b), top: B:47:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:28:0x00bb, B:30:0x00cb, B:31:0x00e3, B:33:0x00f6, B:34:0x00fc, B:19:0x0044, B:22:0x0061, B:24:0x0073, B:25:0x00a8, B:14:0x002b), top: B:47:0x0008 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b8 -> B:28:0x00bb). Please report as a decompilation issue!!! */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 354
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.DefaultClientSSESession.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @e(c = "io.ktor.client.plugins.sse.DefaultClientSSESession", f = "DefaultClientSSESession.kt", l = {161, 163, 212}, m = "parseEvent")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.sse.DefaultClientSSESession$parseEvent$1, reason: invalid class name */
    public static final class AnonymousClass1 extends U3.c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultClientSSESession.this.parseEvent(null, this);
        }
    }

    @e(c = "io.ktor.client.plugins.sse.DefaultClientSSESession", f = "DefaultClientSSESession.kt", l = {145}, m = "tryParseEvent")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.sse.DefaultClientSSESession$tryParseEvent$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11771 extends U3.c {
        int label;
        /* synthetic */ Object result;

        public C11771(S3.c<? super C11771> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultClientSSESession.this.tryParseEvent(null, this);
        }
    }

    public DefaultClientSSESession(SSEClientContent sSEClientContent, ByteReadChannel byteReadChannel, h hVar) {
        l.f("content", sSEClientContent);
        l.f("input", byteReadChannel);
        l.f("coroutineContext", hVar);
        this.input = byteReadChannel;
        this.coroutineContext = hVar;
        this.reconnectionTimeMillis = A5.a.c(sSEClientContent.getReconnectionTime());
        this.showCommentEvents = sSEClientContent.getShowCommentEvents();
        this.showRetryEvents = sSEClientContent.getShowRetryEvents();
        int maxReconnectionAttempts = sSEClientContent.getMaxReconnectionAttempts();
        this.maxReconnectionAttempts = maxReconnectionAttempts;
        this.needToReconnect = maxReconnectionAttempts > 0;
        HttpRequestBuilder initialRequest = sSEClientContent.getInitialRequest();
        this.initialRequest = initialRequest;
        this.clientForReconnection = (HttpClient) initialRequest.getAttributes().get(SSEKt.getSSEClientForReconnectionAttr());
        this._incoming = new C0336o(new C0338q(new C0332k(new DefaultClientSSESession$_incoming$1(this, null)), new DefaultClientSSESession$_incoming$2(this, null), 0), new DefaultClientSSESession$_incoming$3(this, null));
        D.q(getCoroutineContext()).x(new d(16, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C _init_$lambda$0(DefaultClientSSESession defaultClientSSESession, Throwable th) {
        defaultClientSSESession.close();
        return C.a;
    }

    private final void appendComment(StringBuilder sb, String str) {
        sb.append(AbstractC2510o.o0(AbstractC2510o.o0(str, ServerSentEventKt.COLON), ServerSentEventKt.SPACE));
        sb.append(ServerSentEventKt.END_OF_LINE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void close() {
        InterfaceC0265f0 interfaceC0265f0 = (InterfaceC0265f0) getCoroutineContext().get(C0263e0.f3843k);
        if (interfaceC0265f0 != null) {
            interfaceC0265f0.e(null);
        }
        ByteReadChannelKt.cancel(this.input);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object doReconnection(S3.c<? super C> cVar) {
        Object objG = D.G(getCoroutineContext(), new AnonymousClass2(null), cVar);
        return objG == T3.a.f9048k ? objG : C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpRequestBuilder getRequestForReconnection() {
        HttpRequestBuilder httpRequestBuilderTakeFrom = new HttpRequestBuilder().takeFrom(this.initialRequest);
        httpRequestBuilderTakeFrom.getAttributes().remove(BuildersKt.getSseRequestAttr());
        httpRequestBuilderTakeFrom.getAttributes().put(SSEKt.getSSEReconnectionRequestAttr(), Boolean.TRUE);
        String str = this.lastEventId;
        if (str != null) {
            httpRequestBuilderTakeFrom.getHeaders().append("Last-Event-ID", str);
        }
        return httpRequestBuilderTakeFrom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCommentsEvent(ServerSentEvent serverSentEvent) {
        return serverSentEvent.getData() == null && serverSentEvent.getEvent() == null && serverSentEvent.getId() == null && serverSentEvent.getRetry() == null && serverSentEvent.getComments() != null;
    }

    private final boolean isEmpty(ServerSentEvent serverSentEvent) {
        return serverSentEvent.getData() == null && serverSentEvent.getId() == null && serverSentEvent.getEvent() == null && serverSentEvent.getRetry() == null && serverSentEvent.getComments() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRetryEvent(ServerSentEvent serverSentEvent) {
        return serverSentEvent.getData() == null && serverSentEvent.getEvent() == null && serverSentEvent.getId() == null && serverSentEvent.getComments() == null && serverSentEvent.getRetry() != null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00f3 -> B:30:0x00f7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x01e5 -> B:84:0x01eb). Please report as a decompilation issue!!! */
    public final java.lang.Object parseEvent(io.ktor.utils.io.ByteReadChannel r20, S3.c<? super io.ktor.sse.ServerSentEvent> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.DefaultClientSSESession.parseEvent(io.ktor.utils.io.ByteReadChannel, S3.c):java.lang.Object");
    }

    private final String toText(StringBuilder sb) {
        String string = sb.toString();
        l.e("toString(...)", string);
        return AbstractC2510o.p0(string, ServerSentEventKt.END_OF_LINE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object tryParseEvent(io.ktor.utils.io.ByteReadChannel r5, S3.c<? super io.ktor.sse.ServerSentEvent> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.plugins.sse.DefaultClientSSESession.C11771
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.sse.DefaultClientSSESession$tryParseEvent$1 r0 = (io.ktor.client.plugins.sse.DefaultClientSSESession.C11771) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.sse.DefaultClientSSESession$tryParseEvent$1 r0 = new io.ktor.client.plugins.sse.DefaultClientSSESession$tryParseEvent$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r6)     // Catch: io.ktor.utils.io.ClosedByteChannelException -> L3e
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            P3.r.Y(r6)
            r0.label = r3     // Catch: io.ktor.utils.io.ClosedByteChannelException -> L3e
            java.lang.Object r6 = r4.parseEvent(r5, r0)     // Catch: io.ktor.utils.io.ClosedByteChannelException -> L3e
            if (r6 != r1) goto L3b
            return r1
        L3b:
            io.ktor.sse.ServerSentEvent r6 = (io.ktor.sse.ServerSentEvent) r6     // Catch: io.ktor.utils.io.ClosedByteChannelException -> L3e
            return r6
        L3e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.DefaultClientSSESession.tryParseEvent(io.ktor.utils.io.ByteReadChannel, S3.c):java.lang.Object");
    }

    @Override // io.ktor.client.plugins.sse.SSESession, H5.A
    public h getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.client.plugins.sse.SSESession
    public InterfaceC0329h getIncoming() {
        return this._incoming;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultClientSSESession(SSEClientContent sSEClientContent, ByteReadChannel byteReadChannel) {
        this(sSEClientContent, byteReadChannel, sSEClientContent.getCallContext().plus(D.d()).plus(new C0284z("DefaultClientSSESession")));
        l.f("content", sSEClientContent);
        l.f("input", byteReadChannel);
    }
}
