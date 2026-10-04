package io.ktor.websocket;

import H5.A;
import H5.B;
import H5.C0284z;
import H5.D;
import H5.InterfaceC0265f0;
import H5.h0;
import H5.n0;
import H5.r;
import J5.i;
import J5.v;
import O3.C;
import P3.F;
import S3.c;
import S3.h;
import U3.e;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00016B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u0013028F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Lio/ktor/websocket/WebSocketWriter;", "LH5/A;", "Lio/ktor/utils/io/ByteWriteChannel;", "writeChannel", "LS3/h;", "coroutineContext", "", "masking", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;LS3/h;ZLio/ktor/utils/io/pool/ObjectPool;)V", "buffer", "LO3/C;", "writeLoop", "(Ljava/nio/ByteBuffer;LS3/c;)Ljava/lang/Object;", "drainQueueAndDiscard", "()V", "Lio/ktor/websocket/Frame;", "firstMsg", "drainQueueAndSerialize", "(Lio/ktor/websocket/Frame;Ljava/nio/ByteBuffer;LS3/c;)Ljava/lang/Object;", "frame", "send", "(Lio/ktor/websocket/Frame;LS3/c;)Ljava/lang/Object;", "flush", "(LS3/c;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteWriteChannel;", "LS3/h;", "getCoroutineContext", "()LS3/h;", "Z", "getMasking", "()Z", "setMasking", "(Z)V", "Lio/ktor/utils/io/pool/ObjectPool;", "getPool", "()Lio/ktor/utils/io/pool/ObjectPool;", "LJ5/i;", "", "queue", "LJ5/i;", "Lio/ktor/websocket/Serializer;", "serializer", "Lio/ktor/websocket/Serializer;", "LH5/f0;", "writeLoopJob", "LH5/f0;", "LJ5/v;", "getOutgoing", "()LJ5/v;", "outgoing", "FlushRequest", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WebSocketWriter implements A {
    private final h coroutineContext;
    private boolean masking;
    private final ObjectPool<ByteBuffer> pool;
    private final i queue;
    private final Serializer serializer;
    private final ByteWriteChannel writeChannel;
    private final InterfaceC0265f0 writeLoopJob;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/websocket/WebSocketWriter$FlushRequest;", "", "LH5/f0;", "parent", "<init>", "(LH5/f0;)V", "", "complete", "()Z", "LO3/C;", "await", "(LS3/c;)Ljava/lang/Object;", "LH5/r;", "done", "LH5/r;", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    @e(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", l = {125, 129, 143}, m = "drainQueueAndSerialize")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.websocket.WebSocketWriter$drainQueueAndSerialize$1, reason: invalid class name */
    public static final class AnonymousClass1 extends U3.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketWriter.this.drainQueueAndSerialize(null, null, this);
        }
    }

    @e(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", l = {163, 166, 171}, m = "flush")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.websocket.WebSocketWriter$flush$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12921 extends U3.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12921(c<? super C12921> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketWriter.this.flush(this);
        }
    }

    @e(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", l = {50, 52, 67, 67, 67, 67}, m = "writeLoop")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.websocket.WebSocketWriter$writeLoop$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12931 extends U3.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12931(c<? super C12931> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketWriter.this.writeLoop(null, this);
        }
    }

    public WebSocketWriter(ByteWriteChannel byteWriteChannel, h hVar, boolean z7, ObjectPool<ByteBuffer> objectPool) {
        l.f("writeChannel", byteWriteChannel);
        l.f("coroutineContext", hVar);
        l.f("pool", objectPool);
        this.writeChannel = byteWriteChannel;
        this.coroutineContext = hVar;
        this.masking = z7;
        this.pool = objectPool;
        this.queue = F.a(8, 6, null);
        this.serializer = new Serializer();
        this.writeLoopJob = D.w(this, new C0284z("ws-writer"), B.f3792m, new WebSocketWriter$writeLoopJob$1(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        throw new java.lang.IllegalArgumentException("unknown message " + r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void drainQueueAndDiscard() {
        /*
            r4 = this;
            J5.i r0 = r4.queue
            r1 = 0
            r0.close(r1)
        L6:
            J5.i r0 = r4.queue     // Catch: java.util.concurrent.CancellationException -> L4a
            java.lang.Object r0 = r0.a()     // Catch: java.util.concurrent.CancellationException -> L4a
            java.lang.Object r0 = J5.m.a(r0)     // Catch: java.util.concurrent.CancellationException -> L4a
            if (r0 != 0) goto L13
            goto L4a
        L13:
            boolean r1 = r0 instanceof io.ktor.websocket.Frame.Close     // Catch: java.util.concurrent.CancellationException -> L4a
            if (r1 != 0) goto L6
            boolean r1 = r0 instanceof io.ktor.websocket.Frame.Ping     // Catch: java.util.concurrent.CancellationException -> L4a
            if (r1 != 0) goto L6
            boolean r1 = r0 instanceof io.ktor.websocket.Frame.Pong     // Catch: java.util.concurrent.CancellationException -> L4a
            if (r1 == 0) goto L20
            goto L6
        L20:
            boolean r1 = r0 instanceof io.ktor.websocket.WebSocketWriter.FlushRequest     // Catch: java.util.concurrent.CancellationException -> L4a
            if (r1 == 0) goto L2a
            io.ktor.websocket.WebSocketWriter$FlushRequest r0 = (io.ktor.websocket.WebSocketWriter.FlushRequest) r0     // Catch: java.util.concurrent.CancellationException -> L4a
            r0.complete()     // Catch: java.util.concurrent.CancellationException -> L4a
            goto L6
        L2a:
            boolean r1 = r0 instanceof io.ktor.websocket.Frame.Text     // Catch: java.util.concurrent.CancellationException -> L4a
            if (r1 != 0) goto L6
            boolean r1 = r0 instanceof io.ktor.websocket.Frame.Binary     // Catch: java.util.concurrent.CancellationException -> L4a
            if (r1 == 0) goto L33
            goto L6
        L33:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.util.concurrent.CancellationException -> L4a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.util.concurrent.CancellationException -> L4a
            r2.<init>()     // Catch: java.util.concurrent.CancellationException -> L4a
            java.lang.String r3 = "unknown message "
            r2.append(r3)     // Catch: java.util.concurrent.CancellationException -> L4a
            r2.append(r0)     // Catch: java.util.concurrent.CancellationException -> L4a
            java.lang.String r0 = r2.toString()     // Catch: java.util.concurrent.CancellationException -> L4a
            r1.<init>(r0)     // Catch: java.util.concurrent.CancellationException -> L4a
            throw r1     // Catch: java.util.concurrent.CancellationException -> L4a
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketWriter.drainQueueAndDiscard():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:20:0x0072
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:74:0x0151, B:75:0x0153], limit reached: 87 */
    /* JADX WARN: Path cross not found for [B:75:0x0153, B:74:0x0151], limit reached: 87 */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0151 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0125 -> B:72:0x014b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x012b -> B:72:0x014b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0131 -> B:72:0x014b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0143 -> B:71:0x0146). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object drainQueueAndSerialize(io.ktor.websocket.Frame r9, java.nio.ByteBuffer r10, S3.c<? super java.lang.Boolean> r11) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketWriter.drainQueueAndSerialize(io.ktor.websocket.Frame, java.nio.ByteBuffer, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e9, code lost:
    
        if (r8.flushAndClose(r2) != r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0107, code lost:
    
        if (r8.flushAndClose(r0) != r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012d, code lost:
    
        if (r8.flushAndClose(r0) != r1) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087 A[Catch: all -> 0x00ac, ChannelWriteException -> 0x00af, TryCatch #4 {ChannelWriteException -> 0x00af, all -> 0x00ac, blocks: (B:38:0x00a0, B:31:0x007f, B:33:0x0087, B:35:0x008f, B:46:0x00b2, B:48:0x00b6, B:49:0x00bc, B:50:0x00d2), top: B:72:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d3 A[PHI: r2
      0x00d3: PHI (r2v12 io.ktor.websocket.WebSocketWriter$writeLoop$1) = (r2v8 io.ktor.websocket.WebSocketWriter$writeLoop$1), (r2v13 io.ktor.websocket.WebSocketWriter$writeLoop$1) binds: [B:32:0x0085, B:40:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x009c -> B:72:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00b6 -> B:41:0x00a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeLoop(java.nio.ByteBuffer r8, S3.c<? super O3.C> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketWriter.writeLoop(java.nio.ByteBuffer, S3.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        if (r9.send(r2, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (r5.await(r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, io.ktor.websocket.WebSocketWriter$FlushRequest] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object flush(S3.c<? super O3.C> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof io.ktor.websocket.WebSocketWriter.C12921
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.websocket.WebSocketWriter$flush$1 r0 = (io.ktor.websocket.WebSocketWriter.C12921) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.WebSocketWriter$flush$1 r0 = new io.ktor.websocket.WebSocketWriter$flush$1
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
            io.ktor.websocket.WebSocketWriter$FlushRequest r2 = (io.ktor.websocket.WebSocketWriter.FlushRequest) r2
            P3.r.Y(r9)
            goto L89
        L3f:
            java.lang.Object r2 = r0.L$1
            io.ktor.websocket.WebSocketWriter$FlushRequest r2 = (io.ktor.websocket.WebSocketWriter.FlushRequest) r2
            java.lang.Object r5 = r0.L$0
            io.ktor.websocket.WebSocketWriter$FlushRequest r5 = (io.ktor.websocket.WebSocketWriter.FlushRequest) r5
            P3.r.Y(r9)     // Catch: java.lang.Throwable -> L4b J5.q -> L76
            goto L8a
        L4b:
            r9 = move-exception
            goto L72
        L4d:
            P3.r.Y(r9)
            io.ktor.websocket.WebSocketWriter$FlushRequest r2 = new io.ktor.websocket.WebSocketWriter$FlushRequest
            S3.h r9 = r8.getCoroutineContext()
            H5.e0 r7 = H5.C0263e0.f3843k
            S3.f r9 = r9.get(r7)
            H5.f0 r9 = (H5.InterfaceC0265f0) r9
            r2.<init>(r9)
            J5.i r9 = r8.queue     // Catch: java.lang.Throwable -> L4b J5.q -> L70
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
            H5.f0 r9 = r8.writeLoopJob
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
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketWriter.flush(S3.c):java.lang.Object");
    }

    @Override // H5.A
    public h getCoroutineContext() {
        return this.coroutineContext;
    }

    public final boolean getMasking() {
        return this.masking;
    }

    public final v getOutgoing() {
        return this.queue;
    }

    public final ObjectPool<ByteBuffer> getPool() {
        return this.pool;
    }

    public final Object send(Frame frame, c<? super C> cVar) {
        Object objSend = this.queue.send(frame, cVar);
        return objSend == T3.a.f9048k ? objSend : C.a;
    }

    public final void setMasking(boolean z7) {
        this.masking = z7;
    }

    public /* synthetic */ WebSocketWriter(ByteWriteChannel byteWriteChannel, h hVar, boolean z7, ObjectPool objectPool, int i7, f fVar) {
        this(byteWriteChannel, hVar, (i7 & 4) != 0 ? false : z7, (i7 & 8) != 0 ? ByteBufferPoolKt.getKtorDefaultPool() : objectPool);
    }
}
