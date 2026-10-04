package io.ktor.websocket;

import H5.A;
import H5.B;
import H5.C0263e0;
import H5.C0276q;
import H5.C0284z;
import H5.D;
import H5.G;
import H5.InterfaceC0265f0;
import H5.InterfaceC0275p;
import H5.M;
import H5.h0;
import H5.n0;
import H5.r;
import J5.i;
import J5.u;
import J5.v;
import O3.C;
import O3.InterfaceC0554c;
import P3.F;
import P3.q;
import S3.h;
import U3.c;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.http.ContentType;
import io.ktor.util.logging.LoggerJvmKt;
import io.ktor.websocket.CloseReason;
import io.ktor.websocket.DefaultWebSocketSession;
import io.ktor.websocket.Frame;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z6.b;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u001f\u0010\u0014J&\u0010$\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0082@¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010\u0016J\"\u0010.\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010-\u001a\u00020,H\u0082@¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b2\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020 048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020,078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020,078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010?\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010B\u001a\u00020A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER*\u0010\u0005\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00048\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR*\u0010\u0006\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00048\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010G\u001a\u0004\bL\u0010I\"\u0004\bM\u0010KR\"\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020,0S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020,0\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u001e\u0010\\\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R$\u0010a\u001a\u00020&2\u0006\u0010]\u001a\u00020&8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b^\u0010(\"\u0004\b_\u0010`R$\u0010d\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bb\u0010I\"\u0004\bc\u0010K¨\u0006f"}, d2 = {"Lio/ktor/websocket/DefaultWebSocketSessionImpl;", "Lio/ktor/websocket/DefaultWebSocketSession;", "Lio/ktor/websocket/WebSocketSession;", "raw", "", "pingIntervalMillis", "timeoutMillis", "<init>", "(Lio/ktor/websocket/WebSocketSession;JJ)V", "", "Lio/ktor/websocket/WebSocketExtension;", "negotiatedExtensions", "LO3/C;", "start", "(Ljava/util/List;)V", "", ContentType.Message.TYPE, "goingAway", "(Ljava/lang/String;LS3/c;)Ljava/lang/Object;", "flush", "(LS3/c;)Ljava/lang/Object;", "terminate", "()V", "LJ5/v;", "Lio/ktor/websocket/Frame$Ping;", "ponger", "LH5/f0;", "runIncomingProcessor", "(LJ5/v;)LH5/f0;", "runOutgoingProcessor", "()LH5/f0;", "outgoingProcessorLoop", "Lio/ktor/websocket/CloseReason;", "reason", "", "exception", "sendCloseSequence", "(Lio/ktor/websocket/CloseReason;Ljava/lang/Throwable;LS3/c;)Ljava/lang/Object;", "", "tryClose", "()Z", "runOrCancelPinger", "LS5/l;", "packet", "Lio/ktor/websocket/Frame;", "frame", "checkMaxFrameSize", "(LS5/l;Lio/ktor/websocket/Frame;LS3/c;)Ljava/lang/Object;", "processIncomingExtensions", "(Lio/ktor/websocket/Frame;)Lio/ktor/websocket/Frame;", "processOutgoingExtensions", "Lio/ktor/websocket/WebSocketSession;", "LH5/p;", "closeReasonRef", "LH5/p;", "LJ5/i;", "filtered", "LJ5/i;", "outgoingToBeProcessed", "LH5/r;", "context", "LH5/r;", "", "_extensions", "Ljava/util/List;", "LS3/h;", "coroutineContext", "LS3/h;", "getCoroutineContext", "()LS3/h;", "newValue", "J", "getPingIntervalMillis", "()J", "setPingIntervalMillis", "(J)V", "getTimeoutMillis", "setTimeoutMillis", "LH5/G;", "closeReason", "LH5/G;", "getCloseReason", "()LH5/G;", "LJ5/u;", "getIncoming", "()LJ5/u;", "incoming", "getOutgoing", "()LJ5/v;", "outgoing", "getExtensions", "()Ljava/util/List;", "extensions", "value", "getMasking", "setMasking", "(Z)V", "masking", "getMaxFrameSize", "setMaxFrameSize", "maxFrameSize", "Companion", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultWebSocketSessionImpl implements DefaultWebSocketSession, WebSocketSession {
    private final List<WebSocketExtension<?>> _extensions;
    private final G closeReason;
    private final InterfaceC0275p closeReasonRef;
    private volatile /* synthetic */ int closed;
    private final r context;
    private final h coroutineContext;
    private final i filtered;
    private final i outgoingToBeProcessed;
    private long pingIntervalMillis;
    volatile /* synthetic */ Object pinger;
    private final WebSocketSession raw;
    private volatile /* synthetic */ int started;
    private long timeoutMillis;
    private static final Frame.Pong EmptyPong = new Frame.Pong(new byte[0], NonDisposableHandle.INSTANCE);
    static final /* synthetic */ AtomicReferenceFieldUpdater pinger$FU = AtomicReferenceFieldUpdater.newUpdater(DefaultWebSocketSessionImpl.class, Object.class, "pinger");
    private static final /* synthetic */ AtomicIntegerFieldUpdater closed$FU = AtomicIntegerFieldUpdater.newUpdater(DefaultWebSocketSessionImpl.class, "closed");
    private static final /* synthetic */ AtomicIntegerFieldUpdater started$FU = AtomicIntegerFieldUpdater.newUpdater(DefaultWebSocketSessionImpl.class, "started");

    @e(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", l = {361}, m = "checkMaxFrameSize")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int I$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultWebSocketSessionImpl.this.checkMaxFrameSize(null, null, this);
        }
    }

    @e(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", l = {286, 290, 300}, m = "outgoingProcessorLoop")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.websocket.DefaultWebSocketSessionImpl$outgoingProcessorLoop$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12841 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12841(S3.c<? super C12841> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultWebSocketSessionImpl.this.outgoingProcessorLoop(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1", f = "DefaultWebSocketSession.kt", l = {406, 207, 260, 213, 214, 216, 231, 246, 260, 260, 260, 260}, m = "invokeSuspend")
    /* renamed from: io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12851 extends j implements n {
        final /* synthetic */ v $ponger;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12851(v vVar, S3.c<? super C12851> cVar) {
            super(2, cVar);
            this.$ponger = vVar;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            C12851 c12851 = DefaultWebSocketSessionImpl.this.new C12851(this.$ponger, cVar);
            c12851.L$0 = obj;
            return c12851;
        }

        @Override // e4.n
        public final Object invoke(A a, S3.c<? super C> cVar) {
            return ((C12851) create(a, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x03a0, code lost:
        
            if (r6.send(r0, r31) == r2) goto L147;
         */
        /* JADX WARN: Code restructure failed: missing block: B:160:0x03a4, code lost:
        
            r6 = r12.f12720k;
            kotlin.jvm.internal.l.c(r6);
            io.ktor.utils.io.core.BytePacketBuilderKt.writeFully$default((S5.l) r6, r0.getData(), 0, 0, 6, null);
            r0 = r13;
            r13 = r7;
            r7 = r0;
            r0 = r12;
            r12 = r9;
            r9 = r10;
            r10 = r11;
            r11 = r0;
            r0 = r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:161:0x0312, code lost:
        
            r0 = r7;
            r7 = r8;
            r8 = r9;
            r9 = r10;
            r10 = r11;
            r11 = r12;
            r12 = r13;
            r13 = r14;
         */
        /* JADX WARN: Removed duplicated region for block: B:103:0x03a8  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0184 A[Catch: all -> 0x004b, TryCatch #4 {all -> 0x004b, blocks: (B:23:0x00e7, B:40:0x017c, B:42:0x0184, B:44:0x0194, B:45:0x01b0, B:47:0x01b4, B:49:0x01be, B:51:0x01cc, B:52:0x01d0, B:55:0x01ef, B:67:0x0236, B:69:0x023a, B:71:0x0240, B:74:0x025b, B:76:0x025f, B:79:0x027a, B:14:0x006f, B:28:0x0102, B:31:0x0127), top: B:153:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0201  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0211  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x02ad A[Catch: all -> 0x009f, TryCatch #5 {all -> 0x009f, blocks: (B:83:0x02a7, B:85:0x02ad, B:87:0x02b1, B:88:0x02b3, B:90:0x02b7, B:91:0x02bd, B:92:0x02e0, B:94:0x02e4, B:99:0x031f, B:17:0x0099), top: B:155:0x0099 }] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x02e0 A[Catch: all -> 0x009f, TryCatch #5 {all -> 0x009f, blocks: (B:83:0x02a7, B:85:0x02ad, B:87:0x02b1, B:88:0x02b3, B:90:0x02b7, B:91:0x02bd, B:92:0x02e0, B:94:0x02e4, B:99:0x031f, B:17:0x0099), top: B:155:0x0099 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x023e -> B:98:0x0312). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0257 -> B:98:0x0312). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0276 -> B:98:0x0312). Please report as a decompilation issue!!! */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 1262
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.DefaultWebSocketSessionImpl.C12851.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runOutgoingProcessor$1", f = "DefaultWebSocketSession.kt", l = {270, 281, 281, 281, 274, 281, 281, 278, 281, 281}, m = "invokeSuspend")
    /* renamed from: io.ktor.websocket.DefaultWebSocketSessionImpl$runOutgoingProcessor$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12861 extends j implements n {
        Object L$0;
        int label;

        public C12861(S3.c<? super C12861> cVar) {
            super(2, cVar);
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            return DefaultWebSocketSessionImpl.this.new C12861(cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, S3.c<? super C> cVar) {
            return ((C12861) create(a, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
        
            if (io.ktor.websocket.WebSocketSessionKt.close$default(r11, null, r10, 1, null) != r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
        
            if (io.ktor.websocket.WebSocketSessionKt.close$default(r11, null, r10, 1, null) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
        
            if (io.ktor.websocket.WebSocketSessionKt.close$default(r11, null, r10, 1, null) != r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00eb, code lost:
        
            if (io.ktor.websocket.WebSocketSessionKt.close$default(r11, null, r10, 1, null) == r1) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0127, code lost:
        
            if (io.ktor.websocket.WebSocketSessionKt.close$default(r11, null, r10, 1, null) != r1) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0140, code lost:
        
            if (io.ktor.websocket.WebSocketSessionKt.close$default(r11, null, r10, 1, null) != r1) goto L59;
         */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0142 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 352
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.DefaultWebSocketSessionImpl.C12861.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @e(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", l = {315}, m = "sendCloseSequence")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.websocket.DefaultWebSocketSessionImpl$sendCloseSequence$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12871 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12871(S3.c<? super C12871> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultWebSocketSessionImpl.this.sendCloseSequence(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$start$2", f = "DefaultWebSocketSession.kt", l = {165, 166}, m = "invokeSuspend")
    /* renamed from: io.ktor.websocket.DefaultWebSocketSessionImpl$start$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements n {
        final /* synthetic */ InterfaceC0265f0 $incomingJob;
        final /* synthetic */ InterfaceC0265f0 $outgoingJob;
        int label;
        final /* synthetic */ DefaultWebSocketSessionImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC0265f0 interfaceC0265f0, InterfaceC0265f0 interfaceC0265f02, DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, S3.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$incomingJob = interfaceC0265f0;
            this.$outgoingJob = interfaceC0265f02;
            this.this$0 = defaultWebSocketSessionImpl;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            return new AnonymousClass2(this.$incomingJob, this.$outgoingJob, this.this$0, cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, S3.c<? super C> cVar) {
            return ((AnonymousClass2) create(a, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        
            if (r5.m(r4) == r0) goto L15;
         */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                T3.a r0 = T3.a.f9048k
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                P3.r.Y(r5)
                goto L35
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                P3.r.Y(r5)
                goto L2a
            L1c:
                P3.r.Y(r5)
                H5.f0 r5 = r4.$incomingJob
                r4.label = r3
                java.lang.Object r5 = r5.m(r4)
                if (r5 != r0) goto L2a
                goto L34
            L2a:
                H5.f0 r5 = r4.$outgoingJob
                r4.label = r2
                java.lang.Object r5 = r5.m(r4)
                if (r5 != r0) goto L35
            L34:
                return r0
            L35:
                io.ktor.websocket.DefaultWebSocketSessionImpl r5 = r4.this$0
                H5.r r5 = io.ktor.websocket.DefaultWebSocketSessionImpl.access$getContext$p(r5)
                r0 = 0
                H5.n0 r5 = (H5.n0) r5
                r5.e(r0)
                O3.C r5 = O3.C.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.DefaultWebSocketSessionImpl.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public DefaultWebSocketSessionImpl(WebSocketSession webSocketSession, long j7, long j8) {
        l.f("raw", webSocketSession);
        this.raw = webSocketSession;
        this.pinger = null;
        C0276q c0276qB = D.b();
        this.closeReasonRef = c0276qB;
        this.filtered = F.a(8, 6, null);
        this.outgoingToBeProcessed = F.a(UtilsKt.getOUTGOING_CHANNEL_CAPACITY(), 6, null);
        this.closed = 0;
        h0 h0Var = new h0((InterfaceC0265f0) webSocketSession.getCoroutineContext().get(C0263e0.f3843k));
        this.context = h0Var;
        this._extensions = new ArrayList();
        this.started = 0;
        this.coroutineContext = webSocketSession.getCoroutineContext().plus(h0Var).plus(new C0284z("ws-default"));
        this.pingIntervalMillis = j7;
        this.timeoutMillis = j8;
        this.closeReason = c0276qB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkMaxFrameSize(S5.l r9, io.ktor.websocket.Frame r10, S3.c<? super O3.C> r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof io.ktor.websocket.DefaultWebSocketSessionImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1 r0 = (io.ktor.websocket.DefaultWebSocketSessionImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1 r0 = new io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2b:
            int r9 = r0.I$0
            P3.r.Y(r11)
            goto L76
        L31:
            P3.r.Y(r11)
            byte[] r10 = r10.getData()
            int r10 = r10.length
            if (r9 == 0) goto L40
            int r11 = io.ktor.utils.io.core.BytePacketBuilderKt.getSize(r9)
            goto L41
        L40:
            r11 = 0
        L41:
            int r10 = r10 + r11
            long r4 = (long) r10
            long r6 = r8.getMaxFrameSize()
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 <= 0) goto L7d
            if (r9 == 0) goto L50
            r9.close()
        L50:
            io.ktor.websocket.CloseReason r9 = new io.ktor.websocket.CloseReason
            io.ktor.websocket.CloseReason$Codes r11 = io.ktor.websocket.CloseReason.Codes.TOO_BIG
            java.lang.String r2 = "Frame is too big: "
            java.lang.String r4 = ". Max size is "
            java.lang.StringBuilder r2 = b1.AbstractC0703b.p(r10, r2, r4)
            long r4 = r8.getMaxFrameSize()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r9.<init>(r11, r2)
            r0.I$0 = r10
            r0.label = r3
            java.lang.Object r9 = io.ktor.websocket.WebSocketSessionKt.close(r8, r9, r0)
            if (r9 != r1) goto L75
            return r1
        L75:
            r9 = r10
        L76:
            io.ktor.websocket.FrameTooBigException r10 = new io.ktor.websocket.FrameTooBigException
            long r0 = (long) r9
            r10.<init>(r0)
            throw r10
        L7d:
            O3.C r9 = O3.C.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.DefaultWebSocketSessionImpl.checkMaxFrameSize(S5.l, io.ktor.websocket.Frame, S3.c):java.lang.Object");
    }

    public static /* synthetic */ Object goingAway$default(DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, String str, S3.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = "Server is going down";
        }
        return defaultWebSocketSessionImpl.goingAway(str, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        if (sendCloseSequence$default(r12, r7, null, r9, 2, null) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00cc -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object outgoingProcessorLoop(S3.c<? super O3.C> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.DefaultWebSocketSessionImpl.outgoingProcessorLoop(S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Frame processIncomingExtensions(Frame frame) {
        Iterator<T> it = getExtensions().iterator();
        while (it.hasNext()) {
            frame = ((WebSocketExtension) it.next()).processIncomingFrame(frame);
        }
        return frame;
    }

    private final Frame processOutgoingExtensions(Frame frame) {
        Iterator<T> it = getExtensions().iterator();
        while (it.hasNext()) {
            frame = ((WebSocketExtension) it.next()).processOutgoingFrame(frame);
        }
        return frame;
    }

    private final InterfaceC0265f0 runIncomingProcessor(v ponger) {
        return D.x(this, DefaultWebSocketSessionKt.IncomingProcessorCoroutineName.plus(M.f3814b), new C12851(ponger, null), 2);
    }

    private final void runOrCancelPinger() {
        DefaultWebSocketSessionImpl defaultWebSocketSessionImpl;
        v vVarPinger;
        long pingIntervalMillis = getPingIntervalMillis();
        if (this.closed == 0 && pingIntervalMillis > 0) {
            defaultWebSocketSessionImpl = this;
            vVarPinger = PingPongKt.pinger(defaultWebSocketSessionImpl, this.raw.getOutgoing(), pingIntervalMillis, getTimeoutMillis(), new DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1(this, null));
        } else {
            defaultWebSocketSessionImpl = this;
            vVarPinger = null;
        }
        v vVar = (v) pinger$FU.getAndSet(this, vVarPinger);
        if (vVar != null) {
            vVar.close(null);
        }
        if (vVarPinger != null) {
            boolean z7 = vVarPinger.mo2trySendJP2dKIU(EmptyPong) instanceof J5.l;
        }
        if (defaultWebSocketSessionImpl.closed == 0 || vVarPinger == null) {
            return;
        }
        runOrCancelPinger();
    }

    private final InterfaceC0265f0 runOutgoingProcessor() {
        return D.w(this, DefaultWebSocketSessionKt.OutgoingProcessorCoroutineName.plus(M.f3814b), B.f3793n, new C12861(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendCloseSequence(io.ktor.websocket.CloseReason r7, java.lang.Throwable r8, S3.c<? super O3.C> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof io.ktor.websocket.DefaultWebSocketSessionImpl.C12871
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.websocket.DefaultWebSocketSessionImpl$sendCloseSequence$1 r0 = (io.ktor.websocket.DefaultWebSocketSessionImpl.C12871) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.DefaultWebSocketSessionImpl$sendCloseSequence$1 r0 = new io.ktor.websocket.DefaultWebSocketSessionImpl$sendCloseSequence$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            O3.C r3 = O3.C.a
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r7 = r0.L$1
            io.ktor.websocket.CloseReason r7 = (io.ktor.websocket.CloseReason) r7
            java.lang.Object r8 = r0.L$0
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            P3.r.Y(r9)     // Catch: java.lang.Throwable -> L32
            goto Lab
        L32:
            r9 = move-exception
            goto Lbf
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            P3.r.Y(r9)
            boolean r9 = r6.tryClose()
            if (r9 != 0) goto L47
            goto Lbe
        L47:
            z6.b r9 = io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER()
            boolean r2 = io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(r9)
            if (r2 == 0) goto L72
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Sending Close Sequence for session "
            r2.<init>(r5)
            r2.append(r6)
            java.lang.String r5 = " with reason "
            r2.append(r5)
            r2.append(r7)
            java.lang.String r5 = " and exception "
            r2.append(r5)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r9.e(r2)
        L72:
            H5.r r9 = r6.context
            H5.h0 r9 = (H5.h0) r9
            r9.Z()
            if (r7 != 0) goto L84
            io.ktor.websocket.CloseReason r7 = new io.ktor.websocket.CloseReason
            io.ktor.websocket.CloseReason$Codes r9 = io.ktor.websocket.CloseReason.Codes.NORMAL
            java.lang.String r2 = ""
            r7.<init>(r9, r2)
        L84:
            r6.runOrCancelPinger()     // Catch: java.lang.Throwable -> L32
            short r9 = r7.getCode()     // Catch: java.lang.Throwable -> L32
            io.ktor.websocket.CloseReason$Codes r2 = io.ktor.websocket.CloseReason.Codes.CLOSED_ABNORMALLY     // Catch: java.lang.Throwable -> L32
            short r2 = r2.getCode()     // Catch: java.lang.Throwable -> L32
            if (r9 == r2) goto Lab
            io.ktor.websocket.WebSocketSession r9 = r6.raw     // Catch: java.lang.Throwable -> L32
            J5.v r9 = r9.getOutgoing()     // Catch: java.lang.Throwable -> L32
            io.ktor.websocket.Frame$Close r2 = new io.ktor.websocket.Frame$Close     // Catch: java.lang.Throwable -> L32
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L32
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L32
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L32
            r0.label = r4     // Catch: java.lang.Throwable -> L32
            java.lang.Object r9 = r9.send(r2, r0)     // Catch: java.lang.Throwable -> L32
            if (r9 != r1) goto Lab
            return r1
        Lab:
            H5.p r9 = r6.closeReasonRef
            H5.q r9 = (H5.C0276q) r9
            r9.F(r7)
            if (r8 == 0) goto Lbe
            J5.i r7 = r6.outgoingToBeProcessed
            r7.close(r8)
            J5.i r7 = r6.filtered
            r7.close(r8)
        Lbe:
            return r3
        Lbf:
            H5.p r0 = r6.closeReasonRef
            H5.q r0 = (H5.C0276q) r0
            r0.F(r7)
            if (r8 == 0) goto Ld2
            J5.i r7 = r6.outgoingToBeProcessed
            r7.close(r8)
            J5.i r7 = r6.filtered
            r7.close(r8)
        Ld2:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.DefaultWebSocketSessionImpl.sendCloseSequence(io.ktor.websocket.CloseReason, java.lang.Throwable, S3.c):java.lang.Object");
    }

    public static /* synthetic */ Object sendCloseSequence$default(DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, CloseReason closeReason, Throwable th, S3.c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            th = null;
        }
        return defaultWebSocketSessionImpl.sendCloseSequence(closeReason, th, cVar);
    }

    private final boolean tryClose() {
        return closed$FU.compareAndSet(this, 0, 1);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public Object flush(S3.c<? super C> cVar) {
        Object objFlush = this.raw.flush(cVar);
        return objFlush == T3.a.f9048k ? objFlush : C.a;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public G getCloseReason() {
        return this.closeReason;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession, io.ktor.websocket.WebSocketSession, H5.A
    public h getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public List<WebSocketExtension<?>> getExtensions() {
        return this._extensions;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public u getIncoming() {
        return this.filtered;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public boolean getMasking() {
        return this.raw.getMasking();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public long getMaxFrameSize() {
        return this.raw.getMaxFrameSize();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public v getOutgoing() {
        return this.outgoingToBeProcessed;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public long getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    public final Object goingAway(String str, S3.c<? super C> cVar) {
        Object objSendCloseSequence$default = sendCloseSequence$default(this, new CloseReason(CloseReason.Codes.GOING_AWAY, str), null, cVar, 2, null);
        return objSendCloseSequence$default == T3.a.f9048k ? objSendCloseSequence$default : C.a;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public Object send(Frame frame, S3.c<? super C> cVar) {
        return DefaultWebSocketSession.DefaultImpls.send(this, frame, cVar);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMasking(boolean z7) {
        this.raw.setMasking(z7);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMaxFrameSize(long j7) {
        this.raw.setMaxFrameSize(j7);
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public void setPingIntervalMillis(long j7) {
        this.pingIntervalMillis = j7;
        runOrCancelPinger();
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public void setTimeoutMillis(long j7) {
        this.timeoutMillis = j7;
        runOrCancelPinger();
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public void start(List<? extends WebSocketExtension<?>> negotiatedExtensions) {
        List<? extends WebSocketExtension<?>> list;
        l.f("negotiatedExtensions", negotiatedExtensions);
        if (!started$FU.compareAndSet(this, 0, 1)) {
            throw new IllegalStateException(("WebSocket session " + this + " is already started.").toString());
        }
        b logger = DefaultWebSocketSessionKt.getLOGGER();
        if (LoggerJvmKt.isTraceEnabled(logger)) {
            StringBuilder sb = new StringBuilder("Starting default WebSocketSession(");
            sb.append(this);
            sb.append(") with negotiated extensions: ");
            list = negotiatedExtensions;
            sb.append(q.y0(list, null, null, null, null, 63));
            logger.e(sb.toString());
        } else {
            list = negotiatedExtensions;
        }
        this._extensions.addAll(list);
        runOrCancelPinger();
        D.x(this, null, new AnonymousClass2(runIncomingProcessor(PingPongKt.ponger(this, getOutgoing())), runOutgoingProcessor(), this, null), 3);
    }

    @Override // io.ktor.websocket.WebSocketSession
    @InterfaceC0554c
    public void terminate() {
        ((n0) this.context).e(null);
        D.h(this.raw, null);
    }
}
