package io.ktor.websocket;

import A6.b;
import H5.A;
import H5.C0263e0;
import H5.C0284z;
import H5.D;
import H5.InterfaceC0265f0;
import H5.h0;
import H5.r;
import J5.i;
import J5.u;
import J5.v;
import O3.C;
import O3.InterfaceC0554c;
import P3.F;
import S3.c;
import S3.h;
import U3.e;
import U3.j;
import e4.n;
import h4.AbstractC1009a;
import h4.InterfaceC1011c;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.pool.ObjectPool;
import io.ktor.websocket.WebSocketSession;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import l4.InterfaceC1443v;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR+\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00068V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R+\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00102\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u001a068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001a0:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001e\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lio/ktor/websocket/RawWebSocketJvm;", "Lio/ktor/websocket/WebSocketSession;", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/utils/io/ByteWriteChannel;", "output", "", "maxFrameSize", "", "masking", "LS3/h;", "coroutineContext", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JZLS3/h;Lio/ktor/utils/io/pool/ObjectPool;)V", "LO3/C;", "flush", "(LS3/c;)Ljava/lang/Object;", "terminate", "()V", "LH5/r;", "socketJob", "LH5/r;", "LJ5/i;", "Lio/ktor/websocket/Frame;", "filtered", "LJ5/i;", "LS3/h;", "getCoroutineContext", "()LS3/h;", "<set-?>", "maxFrameSize$delegate", "Lh4/c;", "getMaxFrameSize", "()J", "setMaxFrameSize", "(J)V", "masking$delegate", "getMasking", "()Z", "setMasking", "(Z)V", "Lio/ktor/websocket/WebSocketWriter;", "writer", "Lio/ktor/websocket/WebSocketWriter;", "getWriter$ktor_websockets", "()Lio/ktor/websocket/WebSocketWriter;", "Lio/ktor/websocket/WebSocketReader;", "reader", "Lio/ktor/websocket/WebSocketReader;", "getReader$ktor_websockets", "()Lio/ktor/websocket/WebSocketReader;", "LJ5/u;", "getIncoming", "()LJ5/u;", "incoming", "LJ5/v;", "getOutgoing", "()LJ5/v;", "outgoing", "", "Lio/ktor/websocket/WebSocketExtension;", "getExtensions", "()Ljava/util/List;", "extensions", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RawWebSocketJvm implements WebSocketSession {
    static final /* synthetic */ InterfaceC1443v[] $$delegatedProperties;
    private final h coroutineContext;
    private final i filtered;

    /* renamed from: masking$delegate, reason: from kotlin metadata */
    private final InterfaceC1011c masking;

    /* renamed from: maxFrameSize$delegate, reason: from kotlin metadata */
    private final InterfaceC1011c maxFrameSize;
    private final WebSocketReader reader;
    private final r socketJob;
    private final WebSocketWriter writer;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.websocket.RawWebSocketJvm$1", f = "RawWebSocketJvm.kt", l = {70, 71}, m = "invokeSuspend")
    /* renamed from: io.ktor.websocket.RawWebSocketJvm$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        Object L$0;
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            return RawWebSocketJvm.this.new AnonymousClass1(cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, c<? super C> cVar) {
            return ((AnonymousClass1) create(a, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
        
            if (r5.send(r8, r7) == r0) goto L32;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0058 A[Catch: all -> 0x0016, CancellationException -> 0x0018, ProtocolViolationException -> 0x001b, FrameTooBigException -> 0x001e, TRY_LEAVE, TryCatch #1 {FrameTooBigException -> 0x001e, blocks: (B:7:0x0011, B:24:0x0042, B:28:0x0050, B:30:0x0058, B:20:0x002d, B:23:0x0034), top: B:45:0x0007, outer: #0 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x006c -> B:8:0x0014). Please report as a decompilation issue!!! */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.RawWebSocketJvm.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        o oVar = new o(RawWebSocketJvm.class, "maxFrameSize", "getMaxFrameSize()J", 0);
        z zVar = y.a;
        $$delegatedProperties = new InterfaceC1443v[]{zVar.f(oVar), b.m(RawWebSocketJvm.class, "masking", "getMasking()Z", 0, zVar)};
    }

    public RawWebSocketJvm(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j7, boolean z7, h hVar, ObjectPool<ByteBuffer> objectPool) {
        l.f("input", byteReadChannel);
        l.f("output", byteWriteChannel);
        l.f("coroutineContext", hVar);
        l.f("pool", objectPool);
        h0 h0Var = new h0((InterfaceC0265f0) hVar.get(C0263e0.f3843k));
        this.socketJob = h0Var;
        this.filtered = F.a(0, 6, null);
        this.coroutineContext = hVar.plus(h0Var).plus(new C0284z("raw-ws"));
        final Long lValueOf = Long.valueOf(j7);
        this.maxFrameSize = new AbstractC1009a(lValueOf) { // from class: io.ktor.websocket.RawWebSocketJvm$special$$inlined$observable$1
            @Override // h4.AbstractC1009a
            public void afterChange(InterfaceC1443v property, Long oldValue, Long newValue) {
                l.f("property", property);
                long jLongValue = newValue.longValue();
                oldValue.longValue();
                this.getReader().setMaxFrameSize(jLongValue);
            }
        };
        final Boolean boolValueOf = Boolean.valueOf(z7);
        this.masking = new AbstractC1009a(boolValueOf) { // from class: io.ktor.websocket.RawWebSocketJvm$special$$inlined$observable$2
            @Override // h4.AbstractC1009a
            public void afterChange(InterfaceC1443v property, Boolean oldValue, Boolean newValue) {
                l.f("property", property);
                boolean zBooleanValue = newValue.booleanValue();
                oldValue.getClass();
                this.getWriter().setMasking(zBooleanValue);
            }
        };
        this.writer = new WebSocketWriter(byteWriteChannel, getCoroutineContext(), z7, objectPool);
        this.reader = new WebSocketReader(byteReadChannel, getCoroutineContext(), j7, objectPool);
        D.x(this, null, new AnonymousClass1(null), 3);
        h0Var.Z();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public Object flush(c<? super C> cVar) throws Throwable {
        Object objFlush = this.writer.flush(cVar);
        return objFlush == T3.a.f9048k ? objFlush : C.a;
    }

    @Override // io.ktor.websocket.WebSocketSession, H5.A
    public h getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public List<WebSocketExtension<?>> getExtensions() {
        return P3.y.f7779k;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public u getIncoming() {
        return this.filtered;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public boolean getMasking() {
        return ((Boolean) this.masking.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public long getMaxFrameSize() {
        return ((Number) this.maxFrameSize.getValue(this, $$delegatedProperties[0])).longValue();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public v getOutgoing() {
        return this.writer.getOutgoing();
    }

    /* renamed from: getReader$ktor_websockets, reason: from getter */
    public final WebSocketReader getReader() {
        return this.reader;
    }

    /* renamed from: getWriter$ktor_websockets, reason: from getter */
    public final WebSocketWriter getWriter() {
        return this.writer;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public Object send(Frame frame, c<? super C> cVar) {
        return WebSocketSession.DefaultImpls.send(this, frame, cVar);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMasking(boolean z7) {
        this.masking.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z7));
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMaxFrameSize(long j7) {
        this.maxFrameSize.setValue(this, $$delegatedProperties[0], Long.valueOf(j7));
    }

    @Override // io.ktor.websocket.WebSocketSession
    @InterfaceC0554c
    public void terminate() {
        getOutgoing().close(null);
        ((h0) this.socketJob).Z();
    }

    public /* synthetic */ RawWebSocketJvm(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j7, boolean z7, h hVar, ObjectPool objectPool, int i7, f fVar) {
        this(byteReadChannel, byteWriteChannel, (i7 & 4) != 0 ? 2147483647L : j7, (i7 & 8) != 0 ? false : z7, hVar, (i7 & 32) != 0 ? ByteBufferPoolKt.getKtorDefaultPool() : objectPool);
    }
}
