package io.ktor.utils.io;

import O3.C;
import P3.r;
import S3.c;
import S5.n;
import U3.e;
import e4.InterfaceC0821a;
import f6.AbstractC0915m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001GB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJH\u0010\u0011\u001a\u00020\u0007\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\n2\u001a\b\u0004\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r\u0012\u0004\u0012\u00028\u00000\f2\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0082H¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0014\u001a\u00020\u0007\"\n\b\u0000\u0010\u0013\u0018\u0001*\u00020\nH\u0082\b¢\u0006\u0004\b\u0014\u0010\tJ\u0019\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J4\u0010\u001a\u001a\u00020\u0007\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\n2\u0006\u0010\u0019\u001a\u00028\u00002\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0082\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007H\u0096@¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\"\u0010\tJ\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\tJ\u0010\u0010$\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b$\u0010!J\u0019\u0010%\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b%\u0010\u0018J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001e\u00103\u001a\u000601j\u0002`28\u0002X\u0082\u0004¢\u0006\f\n\u0004\b3\u00104\u0012\u0004\b5\u0010\tR\u0014\u00106\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010.R\u0014\u00107\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010.R\u001a\u0010<\u001a\u0002088VX\u0097\u0004¢\u0006\f\u0012\u0004\b;\u0010\t\u001a\u0004\b9\u0010:R\u001a\u0010A\u001a\u00020=8VX\u0097\u0004¢\u0006\f\u0012\u0004\b@\u0010\t\u001a\u0004\b>\u0010?R\u0016\u0010D\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010+R\u0014\u0010F\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010+¨\u0006H"}, d2 = {"Lio/ktor/utils/io/ByteChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/BufferedByteWriteChannel;", "", "autoFlush", "<init>", "(Z)V", "LO3/C;", "moveFlushToReadBuffer", "()V", "Lio/ktor/utils/io/ByteChannel$Slot$Task;", "TaskType", "Lkotlin/Function1;", "LS3/c;", "createTask", "Lkotlin/Function0;", "shouldSleep", "sleepWhile", "(Le4/k;Le4/a;LS3/c;)Ljava/lang/Object;", "Expected", "resumeSlot", "", "cause", "closeSlot", "(Ljava/lang/Throwable;)V", "slot", "trySuspend", "(Lio/ktor/utils/io/ByteChannel$Slot$Task;Le4/a;)V", "", "min", "awaitContent", "(ILS3/c;)Ljava/lang/Object;", "flush", "(LS3/c;)Ljava/lang/Object;", "flushWriteBuffer", "close", "flushAndClose", "cancel", "", "toString", "()Ljava/lang/String;", "Z", "getAutoFlush", "()Z", "LS5/a;", "flushBuffer", "LS5/a;", "flushBufferSize", "I", "", "Lio/ktor/utils/io/locks/SynchronizedObject;", "flushBufferMutex", "Ljava/lang/Object;", "getFlushBufferMutex$annotations", "_readBuffer", "_writeBuffer", "LS5/n;", "getReadBuffer", "()LS5/n;", "getReadBuffer$annotations", "readBuffer", "LS5/l;", "getWriteBuffer", "()LS5/l;", "getWriteBuffer$annotations", "writeBuffer", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "isClosedForWrite", "isClosedForRead", "Slot", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ByteChannel implements ByteReadChannel, BufferedByteWriteChannel {
    volatile /* synthetic */ Object _closedCause;
    private final S5.a _readBuffer;
    private final S5.a _writeBuffer;
    private final boolean autoFlush;
    private final S5.a flushBuffer;
    private final Object flushBufferMutex;
    private volatile int flushBufferSize;
    volatile /* synthetic */ Object suspensionSlot;
    static final /* synthetic */ AtomicReferenceFieldUpdater suspensionSlot$FU = AtomicReferenceFieldUpdater.newUpdater(ByteChannel.class, Object.class, "suspensionSlot");
    static final /* synthetic */ AtomicReferenceFieldUpdater _closedCause$FU = AtomicReferenceFieldUpdater.newUpdater(ByteChannel.class, Object.class, "_closedCause");

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u0000 \u00022\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot;", "", "Companion", "Empty", "Closed", "Task", "Read", "Write", "Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "Lio/ktor/utils/io/ByteChannel$Slot$Empty;", "Lio/ktor/utils/io/ByteChannel$Slot$Task;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Slot {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "Lio/ktor/utils/io/ByteChannel$Slot;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Closed implements Slot {
            private final Throwable cause;

            public Closed(Throwable th) {
                this.cause = th;
            }

            public static /* synthetic */ Closed copy$default(Closed closed, Throwable th, int i7, Object obj) {
                if ((i7 & 1) != 0) {
                    th = closed.cause;
                }
                return closed.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getCause() {
                return this.cause;
            }

            public final Closed copy(Throwable cause) {
                return new Closed(cause);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Closed) && l.a(this.cause, ((Closed) other).cause);
            }

            public final Throwable getCause() {
                return this.cause;
            }

            public int hashCode() {
                Throwable th = this.cause;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            public String toString() {
                return "Closed(cause=" + this.cause + ')';
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Companion;", "", "<init>", "()V", "Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "CLOSED", "Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "getCLOSED", "()Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "getCLOSED$annotations", "LO3/o;", "LO3/C;", "RESUME", "Ljava/lang/Object;", "getRESUME-d1pmJ48", "()Ljava/lang/Object;", "getRESUME-d1pmJ48$annotations", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static final Closed CLOSED = new Closed(null);
            private static final Object RESUME = C.a;

            private Companion() {
            }

            public static /* synthetic */ void getCLOSED$annotations() {
            }

            /* renamed from: getRESUME-d1pmJ48$annotations, reason: not valid java name */
            public static /* synthetic */ void m193getRESUMEd1pmJ48$annotations() {
            }

            public final Closed getCLOSED() {
                return CLOSED;
            }

            /* renamed from: getRESUME-d1pmJ48, reason: not valid java name */
            public final Object m194getRESUMEd1pmJ48() {
                return RESUME;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Empty;", "Lio/ktor/utils/io/ByteChannel$Slot;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Empty implements Slot {
            public static final Empty INSTANCE = new Empty();

            private Empty() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Empty);
            }

            public int hashCode() {
                return -231472095;
            }

            public String toString() {
                return "Empty";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Read;", "Lio/ktor/utils/io/ByteChannel$Slot$Task;", "LS3/c;", "LO3/C;", "continuation", "<init>", "(LS3/c;)V", "", "taskName", "()Ljava/lang/String;", "LS3/c;", "getContinuation", "()LS3/c;", "", "created", "Ljava/lang/Throwable;", "getCreated", "()Ljava/lang/Throwable;", "setCreated", "(Ljava/lang/Throwable;)V", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Read implements Task {
            private final c<C> continuation;
            private Throwable created;

            /* JADX WARN: Multi-variable type inference failed */
            public Read(c<? super C> cVar) {
                l.f("continuation", cVar);
                this.continuation = cVar;
                if (ByteChannel_jvmKt.getDEVELOPMENT_MODE()) {
                    int iHashCode = getContinuation().hashCode();
                    AbstractC0915m.k(16);
                    String string = Integer.toString(iHashCode, 16);
                    l.e("toString(...)", string);
                    Throwable th = new Throwable("ReadTask 0x".concat(string));
                    q0.c.R(th);
                    setCreated(th);
                }
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public c<C> getContinuation() {
                return this.continuation;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public Throwable getCreated() {
                return this.created;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public void resume() {
                Task.DefaultImpls.resume(this);
            }

            public void setCreated(Throwable th) {
                this.created = th;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public String taskName() {
                return "read";
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public void resume(Throwable th) {
                Task.DefaultImpls.resume(this, th);
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0006\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Task;", "Lio/ktor/utils/io/ByteChannel$Slot;", "", "taskName", "()Ljava/lang/String;", "LO3/C;", "resume", "()V", "", "throwable", "(Ljava/lang/Throwable;)V", "getCreated", "()Ljava/lang/Throwable;", "created", "LS3/c;", "getContinuation", "()LS3/c;", "continuation", "Lio/ktor/utils/io/ByteChannel$Slot$Read;", "Lio/ktor/utils/io/ByteChannel$Slot$Write;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface Task extends Slot {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class DefaultImpls {
                public static void resume(Task task) {
                    task.getContinuation().resumeWith(Slot.INSTANCE.m194getRESUMEd1pmJ48());
                }

                public static /* synthetic */ void resume$default(Task task, Throwable th, int i7, Object obj) {
                    if (obj != null) {
                        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resume");
                    }
                    if ((i7 & 1) != 0) {
                        th = null;
                    }
                    task.resume(th);
                }

                public static void resume(Task task, Throwable th) {
                    task.getContinuation().resumeWith(th != null ? r.r(th) : Slot.INSTANCE.m194getRESUMEd1pmJ48());
                }
            }

            c<C> getContinuation();

            Throwable getCreated();

            void resume();

            void resume(Throwable throwable);

            String taskName();
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Write;", "Lio/ktor/utils/io/ByteChannel$Slot$Task;", "LS3/c;", "LO3/C;", "continuation", "<init>", "(LS3/c;)V", "", "taskName", "()Ljava/lang/String;", "LS3/c;", "getContinuation", "()LS3/c;", "", "created", "Ljava/lang/Throwable;", "getCreated", "()Ljava/lang/Throwable;", "setCreated", "(Ljava/lang/Throwable;)V", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Write implements Task {
            private final c<C> continuation;
            private Throwable created;

            /* JADX WARN: Multi-variable type inference failed */
            public Write(c<? super C> cVar) {
                l.f("continuation", cVar);
                this.continuation = cVar;
                if (ByteChannel_jvmKt.getDEVELOPMENT_MODE()) {
                    int iHashCode = getContinuation().hashCode();
                    AbstractC0915m.k(16);
                    String string = Integer.toString(iHashCode, 16);
                    l.e("toString(...)", string);
                    Throwable th = new Throwable("WriteTask 0x".concat(string));
                    q0.c.R(th);
                    setCreated(th);
                }
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public c<C> getContinuation() {
                return this.continuation;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public Throwable getCreated() {
                return this.created;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public void resume() {
                Task.DefaultImpls.resume(this);
            }

            public void setCreated(Throwable th) {
                this.created = th;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public String taskName() {
                return "write";
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public void resume(Throwable th) {
                Task.DefaultImpls.resume(this, th);
            }
        }

        static Closed getCLOSED() {
            return INSTANCE.getCLOSED();
        }

        /* renamed from: getRESUME-d1pmJ48, reason: not valid java name */
        static Object m192getRESUMEd1pmJ48() {
            return INSTANCE.m194getRESUMEd1pmJ48();
        }
    }

    @e(c = "io.ktor.utils.io.ByteChannel", f = "ByteChannel.kt", l = {284}, m = "awaitContent")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteChannel$awaitContent$1, reason: invalid class name */
    public static final class AnonymousClass1 extends U3.c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannel.this.awaitContent(0, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteChannel", f = "ByteChannel.kt", l = {284}, m = "flush")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteChannel$flush$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12481 extends U3.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12481(c<? super C12481> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannel.this.flush(this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteChannel", f = "ByteChannel.kt", l = {128}, m = "flushAndClose")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteChannel$flushAndClose$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12491 extends U3.c {
        int label;
        /* synthetic */ Object result;

        public C12491(c<? super C12491> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannel.this.flushAndClose(this);
        }
    }

    public ByteChannel() {
        this(false, 1, null);
    }

    private final void closeSlot(Throwable cause) {
        Slot slot = (Slot) suspensionSlot$FU.getAndSet(this, cause != null ? new Slot.Closed(cause) : Slot.INSTANCE.getCLOSED());
        if (slot instanceof Slot.Task) {
            ((Slot.Task) slot).resume(cause);
        }
    }

    private static /* synthetic */ void getFlushBufferMutex$annotations() {
    }

    @InternalAPI
    public static /* synthetic */ void getReadBuffer$annotations() {
    }

    @InternalAPI
    public static /* synthetic */ void getWriteBuffer$annotations() {
    }

    private final void moveFlushToReadBuffer() {
        synchronized (this.flushBufferMutex) {
            this.flushBuffer.B(this._readBuffer);
            this.flushBufferSize = 0;
        }
        Slot slot = (Slot) this.suspensionSlot;
        if (slot instanceof Slot.Write) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = suspensionSlot$FU;
            Slot.Empty empty = Slot.Empty.INSTANCE;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, slot, empty)) {
                if (atomicReferenceFieldUpdater.get(this) != slot) {
                    return;
                }
            }
            ((Slot.Task) slot).resume();
        }
    }

    private final <Expected extends Slot.Task> void resumeSlot() {
        l.k();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        r1.resume();
        r0.q();
        r0 = T3.a.f9048k;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <TaskType extends io.ktor.utils.io.ByteChannel.Slot.Task> java.lang.Object sleepWhile(e4.k r6, e4.InterfaceC0821a r7, S3.c<? super O3.C> r8) {
        /*
            r5 = this;
        L0:
            java.lang.Object r0 = r7.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L43
            H5.k r0 = new H5.k
            S3.c r1 = P3.r.E(r8)
            r2 = 1
            r0.<init>(r2, r1)
            r0.r()
            java.lang.Object r1 = r6.invoke(r0)
            io.ktor.utils.io.ByteChannel$Slot$Task r1 = (io.ktor.utils.io.ByteChannel.Slot.Task) r1
            java.lang.Object r2 = r5.suspensionSlot
            io.ktor.utils.io.ByteChannel$Slot r2 = (io.ktor.utils.io.ByteChannel.Slot) r2
            boolean r3 = r2 instanceof io.ktor.utils.io.ByteChannel.Slot.Closed
            if (r3 != 0) goto L3e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = io.ktor.utils.io.ByteChannel.suspensionSlot$FU
        L29:
            boolean r4 = r3.compareAndSet(r5, r2, r1)
            if (r4 != 0) goto L3e
            java.lang.Object r4 = r3.get(r5)
            if (r4 == r2) goto L29
            r1.resume()
            r0.q()
            T3.a r0 = T3.a.f9048k
            goto L0
        L3e:
            kotlin.jvm.internal.l.k()
            r6 = 0
            throw r6
        L43:
            O3.C r6 = O3.C.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannel.sleepWhile(e4.k, e4.a, S3.c):java.lang.Object");
    }

    private final <TaskType extends Slot.Task> void trySuspend(TaskType slot, InterfaceC0821a shouldSleep) {
        Slot slot2 = (Slot) this.suspensionSlot;
        if (!(slot2 instanceof Slot.Closed)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = suspensionSlot$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, slot2, slot)) {
                if (atomicReferenceFieldUpdater.get(this) != slot2) {
                    slot.resume();
                    return;
                }
            }
        }
        l.k();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.ByteReadChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitContent(int r12, S3.c<? super java.lang.Boolean> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannel.awaitContent(int, S3.c):java.lang.Object");
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public void cancel(Throwable cause) {
        if (this._closedCause != null) {
            return;
        }
        CloseToken closeToken = new CloseToken(cause);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _closedCause$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, closeToken) && atomicReferenceFieldUpdater.get(this) == null) {
        }
        closeSlot(CloseToken.wrapCause$default(closeToken, null, 1, null));
    }

    @Override // io.ktor.utils.io.BufferedByteWriteChannel
    public void close() {
        flushWriteBuffer();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _closedCause$FU;
        CloseToken closed = CloseTokenKt.getCLOSED();
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, closed)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                return;
            }
        }
        closeSlot(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.ByteWriteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object flush(S3.c<? super O3.C> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannel.flush(S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.ByteWriteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object flushAndClose(S3.c<? super O3.C> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteChannel.C12491
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteChannel$flushAndClose$1 r0 = (io.ktor.utils.io.ByteChannel.C12491) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannel$flushAndClose$1 r0 = new io.ktor.utils.io.ByteChannel$flushAndClose$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            P3.r.Y(r5)     // Catch: java.lang.Throwable -> L27
            goto L40
        L27:
            r5 = move-exception
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            P3.r.Y(r5)
            r0.label = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = r4.flush(r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L40
            return r1
        L3d:
            P3.r.r(r5)
        L40:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = io.ktor.utils.io.ByteChannel._closedCause$FU
            io.ktor.utils.io.CloseToken r0 = io.ktor.utils.io.CloseTokenKt.getCLOSED()
        L46:
            r1 = 0
            boolean r2 = r5.compareAndSet(r4, r1, r0)
            O3.C r3 = O3.C.a
            if (r2 == 0) goto L53
            r4.closeSlot(r1)
            return r3
        L53:
            java.lang.Object r1 = r5.get(r4)
            if (r1 == 0) goto L46
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannel.flushAndClose(S3.c):java.lang.Object");
    }

    @Override // io.ktor.utils.io.BufferedByteWriteChannel
    @InternalAPI
    public void flushWriteBuffer() {
        if (this._writeBuffer.z()) {
            return;
        }
        synchronized (this.flushBufferMutex) {
            S5.a aVar = this._writeBuffer;
            int i7 = (int) aVar.f8784m;
            this.flushBuffer.M(aVar);
            this.flushBufferSize += i7;
        }
        Slot slot = (Slot) this.suspensionSlot;
        if (slot instanceof Slot.Read) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = suspensionSlot$FU;
            Slot.Empty empty = Slot.Empty.INSTANCE;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, slot, empty)) {
                if (atomicReferenceFieldUpdater.get(this) != slot) {
                    return;
                }
            }
            ((Slot.Task) slot).resume();
        }
    }

    public final boolean getAutoFlush() {
        return this.autoFlush;
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public Throwable getClosedCause() {
        CloseToken closeToken = (CloseToken) this._closedCause;
        if (closeToken != null) {
            return CloseToken.wrapCause$default(closeToken, null, 1, null);
        }
        return null;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public n getReadBuffer() throws Throwable {
        CloseToken closeToken = (CloseToken) this._closedCause;
        if (closeToken != null) {
            closeToken.throwOrNull(ByteChannel$readBuffer$1.INSTANCE);
        }
        if (this._readBuffer.z()) {
            moveFlushToReadBuffer();
        }
        return this._readBuffer;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public S5.l getWriteBuffer() throws ClosedWriteChannelException {
        CloseToken closeToken;
        if (isClosedForWrite() && ((closeToken = (CloseToken) this._closedCause) == null || closeToken.throwOrNull(ByteChannel$writeBuffer$1.INSTANCE) == null)) {
            throw new ClosedWriteChannelException(null, 1, null);
        }
        return this._writeBuffer;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public boolean isClosedForRead() {
        if (getClosedCause() == null) {
            return isClosedForWrite() && this.flushBufferSize == 0 && this._readBuffer.z();
        }
        return true;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public boolean isClosedForWrite() {
        return this._closedCause != null;
    }

    public String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }

    public ByteChannel(boolean z7) {
        this.autoFlush = z7;
        this.flushBuffer = new S5.a();
        this.flushBufferMutex = new Object();
        this.suspensionSlot = Slot.Empty.INSTANCE;
        this._readBuffer = new S5.a();
        this._writeBuffer = new S5.a();
        this._closedCause = null;
    }

    public /* synthetic */ ByteChannel(boolean z7, int i7, f fVar) {
        this((i7 & 1) != 0 ? false : z7);
    }
}
