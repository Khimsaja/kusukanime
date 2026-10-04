package io.ktor.websocket;

import H5.B;
import H5.C0263e0;
import H5.C0284z;
import H5.D;
import H5.InterfaceC0265f0;
import H5.h0;
import H5.n0;
import H5.r;
import J5.i;
import J5.u;
import J5.v;
import O3.C;
import O3.InterfaceC0554c;
import P3.F;
import P3.y;
import S3.c;
import S3.h;
import U3.e;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.websocket.WebSocketSession;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001?B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\"\u0010\u0007\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\t\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020#028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020#068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u001e\u0010>\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030;0:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lio/ktor/websocket/RawWebSocketCommon;", "Lio/ktor/websocket/WebSocketSession;", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/utils/io/ByteWriteChannel;", "output", "", "maxFrameSize", "", "masking", "LS3/h;", "coroutineContext", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JZLS3/h;)V", "LO3/C;", "flush", "(LS3/c;)Ljava/lang/Object;", "terminate", "()V", "Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "J", "getMaxFrameSize", "()J", "setMaxFrameSize", "(J)V", "Z", "getMasking", "()Z", "setMasking", "(Z)V", "LH5/r;", "socketJob", "LH5/r;", "LJ5/i;", "Lio/ktor/websocket/Frame;", "_incoming", "LJ5/i;", "", "_outgoing", "", "lastOpcode", "I", "LS3/h;", "getCoroutineContext", "()LS3/h;", "LH5/f0;", "writerJob", "LH5/f0;", "readerJob", "LJ5/u;", "getIncoming", "()LJ5/u;", "incoming", "LJ5/v;", "getOutgoing", "()LJ5/v;", "outgoing", "", "Lio/ktor/websocket/WebSocketExtension;", "getExtensions", "()Ljava/util/List;", "extensions", "FlushRequest", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RawWebSocketCommon implements WebSocketSession {
    private final i _incoming;
    private final i _outgoing;
    private final h coroutineContext;
    private final ByteReadChannel input;
    private int lastOpcode;
    private boolean masking;
    private long maxFrameSize;
    private final ByteWriteChannel output;
    private final InterfaceC0265f0 readerJob;
    private final r socketJob;
    private final InterfaceC0265f0 writerJob;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/websocket/RawWebSocketCommon$FlushRequest;", "", "LH5/f0;", "parent", "<init>", "(LH5/f0;)V", "", "complete", "()Z", "LO3/C;", "await", "(LS3/c;)Ljava/lang/Object;", "LH5/r;", "done", "LH5/r;", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FlushRequest {
        private final r done;

        public FlushRequest(InterfaceC0265f0 interfaceC0265f0) {
            this.done = new h0(interfaceC0265f0);
        }

        public final Object await(c<? super C> cVar) {
            Object objM = ((n0) this.done).m(cVar);
            return objM == T3.a.f9048k ? objM : C.a;
        }

        public final boolean complete() {
            return ((h0) this.done).F(C.a);
        }
    }

    @e(c = "io.ktor.websocket.RawWebSocketCommon", f = "RawWebSocketCommon.kt", l = {131, 134, 139}, m = "flush")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.websocket.RawWebSocketCommon$flush$1, reason: invalid class name */
    public static final class AnonymousClass1 extends U3.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RawWebSocketCommon.this.flush(this);
        }
    }

    public RawWebSocketCommon(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j7, boolean z7, h hVar) {
        l.f("input", byteReadChannel);
        l.f("output", byteWriteChannel);
        l.f("coroutineContext", hVar);
        this.input = byteReadChannel;
        this.output = byteWriteChannel;
        this.maxFrameSize = j7;
        this.masking = z7;
        h0 h0Var = new h0((InterfaceC0265f0) hVar.get(C0263e0.f3843k));
        this.socketJob = h0Var;
        this._incoming = F.a(8, 6, null);
        this._outgoing = F.a(8, 6, null);
        this.coroutineContext = hVar.plus(h0Var).plus(new C0284z("raw-ws"));
        C0284z c0284z = new C0284z("ws-writer");
        B b4 = B.f3792m;
        this.writerJob = D.w(this, c0284z, b4, new RawWebSocketCommon$writerJob$1(this, null));
        this.readerJob = D.w(this, new C0284z("ws-reader"), b4, new RawWebSocketCommon$readerJob$1(this, null));
        h0Var.Z();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        if (r9.send(r2, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (r5.await(r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, io.ktor.websocket.RawWebSocketCommon$FlushRequest] */
    @Override // io.ktor.websocket.WebSocketSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object flush(S3.c<? super O3.C> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof io.ktor.websocket.RawWebSocketCommon.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.websocket.RawWebSocketCommon$flush$1 r0 = (io.ktor.websocket.RawWebSocketCommon.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.RawWebSocketCommon$flush$1 r0 = new io.ktor.websocket.RawWebSocketCommon$flush$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            P3.r.Y(r9)
            goto L97
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            java.lang.Object r2 = r0.L$0
            io.ktor.websocket.RawWebSocketCommon$FlushRequest r2 = (io.ktor.websocket.RawWebSocketCommon.FlushRequest) r2
            P3.r.Y(r9)
            goto L89
        L3f:
            java.lang.Object r2 = r0.L$1
            io.ktor.websocket.RawWebSocketCommon$FlushRequest r2 = (io.ktor.websocket.RawWebSocketCommon.FlushRequest) r2
            java.lang.Object r5 = r0.L$0
            io.ktor.websocket.RawWebSocketCommon$FlushRequest r5 = (io.ktor.websocket.RawWebSocketCommon.FlushRequest) r5
            P3.r.Y(r9)     // Catch: java.lang.Throwable -> L4b J5.q -> L76
            goto L8a
        L4b:
            r9 = move-exception
            goto L72
        L4d:
            P3.r.Y(r9)
            io.ktor.websocket.RawWebSocketCommon$FlushRequest r2 = new io.ktor.websocket.RawWebSocketCommon$FlushRequest
            S3.h r9 = r8.getCoroutineContext()
            H5.e0 r7 = H5.C0263e0.f3843k
            S3.f r9 = r9.get(r7)
            H5.f0 r9 = (H5.InterfaceC0265f0) r9
            r2.<init>(r9)
            J5.i r9 = r8._outgoing     // Catch: java.lang.Throwable -> L4b J5.q -> L70
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L4b J5.q -> L70
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L4b J5.q -> L70
            r0.label = r5     // Catch: java.lang.Throwable -> L4b J5.q -> L70
            java.lang.Object r9 = r9.send(r2, r0)     // Catch: java.lang.Throwable -> L4b J5.q -> L70
            if (r9 != r1) goto L89
            goto L96
        L70:
            r5 = r2
            goto L76
        L72:
            r2.complete()
            throw r9
        L76:
            r2.complete()
            H5.f0 r9 = r8.writerJob
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r9 = r9.m(r0)
            if (r9 != r1) goto L88
            goto L96
        L88:
            r2 = r5
        L89:
            r5 = r2
        L8a:
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r9 = r5.await(r0)
            if (r9 != r1) goto L97
        L96:
            return r1
        L97:
            O3.C r9 = O3.C.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.RawWebSocketCommon.flush(S3.c):java.lang.Object");
    }

    @Override // io.ktor.websocket.WebSocketSession, H5.A
    public h getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public List<WebSocketExtension<?>> getExtensions() {
        return y.f7779k;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public u getIncoming() {
        return this._incoming;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public boolean getMasking() {
        return this.masking;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public long getMaxFrameSize() {
        return this.maxFrameSize;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public v getOutgoing() {
        return this._outgoing;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public Object send(Frame frame, c<? super C> cVar) {
        return WebSocketSession.DefaultImpls.send(this, frame, cVar);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMasking(boolean z7) {
        this.masking = z7;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMaxFrameSize(long j7) {
        this.maxFrameSize = j7;
    }

    @Override // io.ktor.websocket.WebSocketSession
    @InterfaceC0554c
    public void terminate() {
        getOutgoing().close(null);
        ((h0) this.socketJob).Z();
    }

    public /* synthetic */ RawWebSocketCommon(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j7, boolean z7, h hVar, int i7, f fVar) {
        this(byteReadChannel, byteWriteChannel, (i7 & 4) != 0 ? 2147483647L : j7, (i7 & 8) != 0 ? false : z7, hVar);
    }
}
