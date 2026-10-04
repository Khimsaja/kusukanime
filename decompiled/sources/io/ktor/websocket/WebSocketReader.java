package io.ktor.websocket;

import H5.A;
import H5.B;
import H5.C0284z;
import H5.D;
import H5.InterfaceC0265f0;
import J5.i;
import J5.u;
import P3.F;
import S3.h;
import U3.c;
import U3.e;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import l4.AbstractC1420H;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00011B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020'0-8F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lio/ktor/websocket/WebSocketReader;", "LH5/A;", "Lio/ktor/utils/io/ByteReadChannel;", "byteChannel", "LS3/h;", "coroutineContext", "", "maxFrameSize", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;LS3/h;JLio/ktor/utils/io/pool/ObjectPool;)V", "buffer", "LO3/C;", "readLoop", "(Ljava/nio/ByteBuffer;LS3/c;)Ljava/lang/Object;", "parseLoop", "handleFrameIfProduced", "(LS3/c;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "LS3/h;", "getCoroutineContext", "()LS3/h;", "J", "getMaxFrameSize", "()J", "setMaxFrameSize", "(J)V", "Lio/ktor/websocket/WebSocketReader$State;", "state", "Lio/ktor/websocket/WebSocketReader$State;", "Lio/ktor/websocket/FrameParser;", "frameParser", "Lio/ktor/websocket/FrameParser;", "Lio/ktor/websocket/SimpleFrameCollector;", "collector", "Lio/ktor/websocket/SimpleFrameCollector;", "LJ5/i;", "Lio/ktor/websocket/Frame;", "queue", "LJ5/i;", "LH5/f0;", "readerJob", "LH5/f0;", "LJ5/u;", "getIncoming", "()LJ5/u;", "incoming", "State", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WebSocketReader implements A {
    private final ByteReadChannel byteChannel;
    private final SimpleFrameCollector collector;
    private final h coroutineContext;
    private final FrameParser frameParser;
    private long maxFrameSize;
    private final i queue;
    private final InterfaceC0265f0 readerJob;
    private State state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/websocket/WebSocketReader$State;", "", "<init>", "(Ljava/lang/String;I)V", "HEADER", "BODY", "CLOSED", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ V3.a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State HEADER = new State("HEADER", 0);
        public static final State BODY = new State("BODY", 1);
        public static final State CLOSED = new State("CLOSED", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{HEADER, BODY, CLOSED};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = AbstractC1420H.z(stateArr$values);
        }

        private State(String str, int i7) {
        }

        public static V3.a getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.CLOSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @e(c = "io.ktor.websocket.WebSocketReader", f = "WebSocketReader.kt", l = {120}, m = "handleFrameIfProduced")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.websocket.WebSocketReader$handleFrameIfProduced$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketReader.this.handleFrameIfProduced(this);
        }
    }

    @e(c = "io.ktor.websocket.WebSocketReader", f = "WebSocketReader.kt", l = {97, 105}, m = "parseLoop")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.websocket.WebSocketReader$parseLoop$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12901 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12901(S3.c<? super C12901> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketReader.this.parseLoop(null, this);
        }
    }

    @e(c = "io.ktor.websocket.WebSocketReader", f = "WebSocketReader.kt", l = {73, 79}, m = "readLoop")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.websocket.WebSocketReader$readLoop$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12911 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12911(S3.c<? super C12911> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketReader.this.readLoop(null, this);
        }
    }

    public WebSocketReader(ByteReadChannel byteReadChannel, h hVar, long j7, ObjectPool<ByteBuffer> objectPool) {
        l.f("byteChannel", byteReadChannel);
        l.f("coroutineContext", hVar);
        l.f("pool", objectPool);
        this.byteChannel = byteReadChannel;
        this.coroutineContext = hVar;
        this.maxFrameSize = j7;
        this.state = State.HEADER;
        this.frameParser = new FrameParser();
        this.collector = new SimpleFrameCollector();
        this.queue = F.a(8, 6, null);
        this.readerJob = D.w(this, new C0284z("ws-reader"), B.f3792m, new WebSocketReader$readerJob$1(objectPool, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleFrameIfProduced(S3.c<? super O3.C> r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof io.ktor.websocket.WebSocketReader.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r12
            io.ktor.websocket.WebSocketReader$handleFrameIfProduced$1 r0 = (io.ktor.websocket.WebSocketReader.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.WebSocketReader$handleFrameIfProduced$1 r0 = new io.ktor.websocket.WebSocketReader$handleFrameIfProduced$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r12)
            goto L80
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L2f:
            P3.r.Y(r12)
            io.ktor.websocket.SimpleFrameCollector r12 = r11.collector
            boolean r12 = r12.getHasRemaining()
            if (r12 != 0) goto L85
            io.ktor.websocket.FrameParser r12 = r11.frameParser
            io.ktor.websocket.FrameType r12 = r12.getFrameType()
            io.ktor.websocket.FrameType r2 = io.ktor.websocket.FrameType.CLOSE
            if (r12 != r2) goto L47
            io.ktor.websocket.WebSocketReader$State r12 = io.ktor.websocket.WebSocketReader.State.CLOSED
            goto L49
        L47:
            io.ktor.websocket.WebSocketReader$State r12 = io.ktor.websocket.WebSocketReader.State.HEADER
        L49:
            r11.state = r12
            io.ktor.websocket.FrameParser r12 = r11.frameParser
            io.ktor.websocket.Frame$Companion r4 = io.ktor.websocket.Frame.INSTANCE
            boolean r5 = r12.getFin()
            io.ktor.websocket.FrameType r6 = r12.getFrameType()
            io.ktor.websocket.SimpleFrameCollector r2 = r11.collector
            java.lang.Integer r7 = r12.getMaskKey()
            java.nio.ByteBuffer r2 = r2.take(r7)
            byte[] r7 = io.ktor.util.NIOKt.moveToByteArray(r2)
            boolean r8 = r12.getRsv1()
            boolean r9 = r12.getRsv2()
            boolean r10 = r12.getRsv3()
            io.ktor.websocket.Frame r12 = r4.byType(r5, r6, r7, r8, r9, r10)
            J5.i r2 = r11.queue
            r0.label = r3
            java.lang.Object r12 = r2.send(r12, r0)
            if (r12 != r1) goto L80
            return r1
        L80:
            io.ktor.websocket.FrameParser r12 = r11.frameParser
            r12.bodyComplete()
        L85:
            O3.C r12 = O3.C.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketReader.handleFrameIfProduced(S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        throw new io.ktor.websocket.FrameTooBigException(r9.frameParser.getLength());
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object parseLoop(java.nio.ByteBuffer r10, S3.c<? super O3.C> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof io.ktor.websocket.WebSocketReader.C12901
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.websocket.WebSocketReader$parseLoop$1 r0 = (io.ktor.websocket.WebSocketReader.C12901) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.WebSocketReader$parseLoop$1 r0 = new io.ktor.websocket.WebSocketReader$parseLoop$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 == r4) goto L26
            if (r2 != r3) goto L2b
        L26:
            java.lang.Object r10 = r0.L$0
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            goto L33
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            P3.r.Y(r11)
        L36:
            boolean r11 = r10.hasRemaining()
            O3.C r2 = O3.C.a
            if (r11 == 0) goto Lb3
            io.ktor.websocket.WebSocketReader$State r11 = r9.state
            int[] r5 = io.ktor.websocket.WebSocketReader.WhenMappings.$EnumSwitchMapping$0
            int r11 = r11.ordinal()
            r11 = r5[r11]
            if (r11 == r4) goto L66
            if (r11 == r3) goto L56
            r10 = 3
            if (r11 != r10) goto L50
            return r2
        L50:
            D6.r r10 = new D6.r
            r10.<init>()
            throw r10
        L56:
            io.ktor.websocket.SimpleFrameCollector r11 = r9.collector
            r11.handle(r10)
            r0.L$0 = r10
            r0.label = r3
            java.lang.Object r11 = r9.handleFrameIfProduced(r0)
            if (r11 != r1) goto L36
            goto La6
        L66:
            io.ktor.websocket.FrameParser r11 = r9.frameParser
            r11.frame(r10)
            io.ktor.websocket.FrameParser r11 = r9.frameParser
            boolean r11 = r11.getBodyReady()
            if (r11 == 0) goto Lb3
            io.ktor.websocket.WebSocketReader$State r11 = io.ktor.websocket.WebSocketReader.State.BODY
            r9.state = r11
            io.ktor.websocket.FrameParser r11 = r9.frameParser
            long r5 = r11.getLength()
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 > 0) goto La7
            io.ktor.websocket.FrameParser r11 = r9.frameParser
            long r5 = r11.getLength()
            long r7 = r9.maxFrameSize
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 > 0) goto La7
            io.ktor.websocket.SimpleFrameCollector r11 = r9.collector
            io.ktor.websocket.FrameParser r2 = r9.frameParser
            long r5 = r2.getLength()
            int r2 = (int) r5
            r11.start(r2, r10)
            r0.L$0 = r10
            r0.label = r4
            java.lang.Object r11 = r9.handleFrameIfProduced(r0)
            if (r11 != r1) goto L36
        La6:
            return r1
        La7:
            io.ktor.websocket.FrameTooBigException r10 = new io.ktor.websocket.FrameTooBigException
            io.ktor.websocket.FrameParser r11 = r9.frameParser
            long r0 = r11.getLength()
            r10.<init>(r0)
            throw r10
        Lb3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketReader.parseLoop(java.nio.ByteBuffer, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (parseLoop(r6, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0070 -> B:28:0x0073). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readLoop(java.nio.ByteBuffer r6, S3.c<? super O3.C> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.websocket.WebSocketReader.C12911
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.websocket.WebSocketReader$readLoop$1 r0 = (io.ktor.websocket.WebSocketReader.C12911) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.WebSocketReader$readLoop$1 r0 = new io.ktor.websocket.WebSocketReader$readLoop$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.L$0
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            P3.r.Y(r7)
            goto L73
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.L$0
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            P3.r.Y(r7)
            goto L57
        L3e:
            P3.r.Y(r7)
            r6.clear()
        L44:
            io.ktor.websocket.WebSocketReader$State r7 = r5.state
            io.ktor.websocket.WebSocketReader$State r2 = io.ktor.websocket.WebSocketReader.State.CLOSED
            if (r7 == r2) goto L77
            io.ktor.utils.io.ByteReadChannel r7 = r5.byteChannel
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = io.ktor.utils.io.ByteReadChannelOperations_jvmKt.readAvailable(r7, r6, r0)
            if (r7 != r1) goto L57
            goto L72
        L57:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r2 = -1
            if (r7 != r2) goto L65
            io.ktor.websocket.WebSocketReader$State r6 = io.ktor.websocket.WebSocketReader.State.CLOSED
            r5.state = r6
            goto L77
        L65:
            r6.flip()
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r5.parseLoop(r6, r0)
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            r6.compact()
            goto L44
        L77:
            O3.C r6 = O3.C.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketReader.readLoop(java.nio.ByteBuffer, S3.c):java.lang.Object");
    }

    @Override // H5.A
    public h getCoroutineContext() {
        return this.coroutineContext;
    }

    public final u getIncoming() {
        return this.queue;
    }

    public final long getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final void setMaxFrameSize(long j7) {
        this.maxFrameSize = j7;
    }

    public /* synthetic */ WebSocketReader(ByteReadChannel byteReadChannel, h hVar, long j7, ObjectPool objectPool, int i7, f fVar) {
        this(byteReadChannel, hVar, j7, (i7 & 8) != 0 ? ByteBufferPoolKt.getKtorDefaultPool() : objectPool);
    }
}
