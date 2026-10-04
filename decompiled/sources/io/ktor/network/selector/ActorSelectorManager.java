package io.ktor.network.selector;

import H5.A;
import H5.C0284z;
import H5.D;
import O3.C;
import S3.c;
import S3.h;
import T3.a;
import U3.e;
import U3.j;
import e4.InterfaceC0821a;
import e4.n;
import java.io.Closeable;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00014B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rH\u0082H¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0019\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\bH\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\bH\u0082@¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\u0016R\u0018\u0010!\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R&\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010(R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lio/ktor/network/selector/ActorSelectorManager;", "Lio/ktor/network/selector/SelectorManagerSupport;", "Ljava/io/Closeable;", "LH5/A;", "LS3/h;", "context", "<init>", "(LS3/h;)V", "Lio/ktor/network/selector/LockFreeMPSCQueue;", "Lio/ktor/network/selector/Selectable;", "mb", "Ljava/nio/channels/Selector;", "selector", "LO3/C;", "process", "(Lio/ktor/network/selector/LockFreeMPSCQueue;Ljava/nio/channels/Selector;LS3/c;)Ljava/lang/Object;", "", "select", "(Ljava/nio/channels/Selector;LS3/c;)Ljava/lang/Object;", "dispatchIfNeeded", "(LS3/c;)Ljava/lang/Object;", "selectWakeup", "()V", "processInterests", "(Lio/ktor/network/selector/LockFreeMPSCQueue;Ljava/nio/channels/Selector;)V", "receiveOrNull", "(Lio/ktor/network/selector/LockFreeMPSCQueue;LS3/c;)Ljava/lang/Object;", "receiveOrNullSuspend", "selectable", "notifyClosed", "(Lio/ktor/network/selector/Selectable;)V", "publishInterest", "close", "selectorRef", "Ljava/nio/channels/Selector;", "Ljava/util/concurrent/atomic/AtomicLong;", "wakeup", "Ljava/util/concurrent/atomic/AtomicLong;", "", "inSelect", "Z", "Lio/ktor/network/selector/ActorSelectorManager$ContinuationHolder;", "LS3/c;", "continuation", "Lio/ktor/network/selector/ActorSelectorManager$ContinuationHolder;", "closed", "selectionQueue", "Lio/ktor/network/selector/LockFreeMPSCQueue;", "coroutineContext", "LS3/h;", "getCoroutineContext", "()LS3/h;", "ContinuationHolder", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActorSelectorManager extends SelectorManagerSupport implements Closeable, A {
    private volatile boolean closed;
    private final ContinuationHolder<C, c<C>> continuation;
    private final h coroutineContext;
    private volatile boolean inSelect;
    private final LockFreeMPSCQueue<Selectable> selectionQueue;
    private volatile Selector selectorRef;
    private final AtomicLong wakeup;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.network.selector.ActorSelectorManager$1", f = "ActorSelectorManager.kt", l = {44}, m = "invokeSuspend")
    /* renamed from: io.ktor.network.selector.ActorSelectorManager$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            return ActorSelectorManager.this.new AnonymousClass1(cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, c<? super C> cVar) {
            return ((AnonymousClass1) create(a, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0093 A[Catch: all -> 0x0060, LOOP:0: B:28:0x0081->B:32:0x0093, LOOP_END, TRY_ENTER, TryCatch #0 {all -> 0x0060, blocks: (B:19:0x004f, B:20:0x005c, B:28:0x0081, B:32:0x0093, B:27:0x0073, B:34:0x009f, B:35:0x00af, B:26:0x0066), top: B:42:0x0006, inners: #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x008d A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v5, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r4v9, types: [java.io.Closeable] */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                T3.a r0 = T3.a.f9048k
                int r1 = r6.label
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L24
                if (r1 != r2) goto L1c
                java.lang.Object r0 = r6.L$2
                java.nio.channels.spi.AbstractSelector r0 = (java.nio.channels.spi.AbstractSelector) r0
                java.lang.Object r1 = r6.L$1
                io.ktor.network.selector.ActorSelectorManager r1 = (io.ktor.network.selector.ActorSelectorManager) r1
                java.lang.Object r4 = r6.L$0
                java.io.Closeable r4 = (java.io.Closeable) r4
                P3.r.Y(r7)     // Catch: java.lang.Throwable -> L1a
                goto L4f
            L1a:
                r7 = move-exception
                goto L66
            L1c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L24:
                P3.r.Y(r7)
                io.ktor.network.selector.ActorSelectorManager r7 = io.ktor.network.selector.ActorSelectorManager.this
                java.nio.channels.spi.SelectorProvider r7 = r7.getProvider()
                java.nio.channels.spi.AbstractSelector r7 = r7.openSelector()
                if (r7 == 0) goto Lb6
                io.ktor.network.selector.ActorSelectorManager r1 = io.ktor.network.selector.ActorSelectorManager.this
                io.ktor.network.selector.ActorSelectorManager.access$setSelectorRef$p(r1, r7)
                io.ktor.network.selector.ActorSelectorManager r1 = io.ktor.network.selector.ActorSelectorManager.this
                io.ktor.network.selector.LockFreeMPSCQueue r4 = io.ktor.network.selector.ActorSelectorManager.access$getSelectionQueue$p(r1)     // Catch: java.lang.Throwable -> L62
                r6.L$0 = r7     // Catch: java.lang.Throwable -> L62
                r6.L$1 = r1     // Catch: java.lang.Throwable -> L62
                r6.L$2 = r7     // Catch: java.lang.Throwable -> L62
                r6.label = r2     // Catch: java.lang.Throwable -> L62
                java.lang.Object r4 = io.ktor.network.selector.ActorSelectorManager.access$process(r1, r4, r7, r6)     // Catch: java.lang.Throwable -> L62
                if (r4 != r0) goto L4d
                return r0
            L4d:
                r0 = r7
                r4 = r0
            L4f:
                io.ktor.network.selector.ActorSelectorManager.access$setClosed$p(r1, r2)     // Catch: java.lang.Throwable -> L60
                io.ktor.network.selector.LockFreeMPSCQueue r7 = io.ktor.network.selector.ActorSelectorManager.access$getSelectionQueue$p(r1)     // Catch: java.lang.Throwable -> L60
                r7.close()     // Catch: java.lang.Throwable -> L60
                io.ktor.network.selector.ActorSelectorManager.access$setSelectorRef$p(r1, r3)     // Catch: java.lang.Throwable -> L60
            L5c:
                r1.cancelAllSuspensions(r0, r3)     // Catch: java.lang.Throwable -> L60
                goto L81
            L60:
                r7 = move-exception
                goto Lb0
            L62:
                r0 = move-exception
                r4 = r7
                r7 = r0
                r0 = r4
            L66:
                io.ktor.network.selector.ActorSelectorManager.access$setClosed$p(r1, r2)     // Catch: java.lang.Throwable -> L9e
                io.ktor.network.selector.LockFreeMPSCQueue r5 = io.ktor.network.selector.ActorSelectorManager.access$getSelectionQueue$p(r1)     // Catch: java.lang.Throwable -> L9e
                r5.close()     // Catch: java.lang.Throwable -> L9e
                r1.cancelAllSuspensions(r0, r7)     // Catch: java.lang.Throwable -> L9e
                io.ktor.network.selector.ActorSelectorManager.access$setClosed$p(r1, r2)     // Catch: java.lang.Throwable -> L60
                io.ktor.network.selector.LockFreeMPSCQueue r7 = io.ktor.network.selector.ActorSelectorManager.access$getSelectionQueue$p(r1)     // Catch: java.lang.Throwable -> L60
                r7.close()     // Catch: java.lang.Throwable -> L60
                io.ktor.network.selector.ActorSelectorManager.access$setSelectorRef$p(r1, r3)     // Catch: java.lang.Throwable -> L60
                goto L5c
            L81:
                io.ktor.network.selector.LockFreeMPSCQueue r7 = io.ktor.network.selector.ActorSelectorManager.access$getSelectionQueue$p(r1)     // Catch: java.lang.Throwable -> L60
                java.lang.Object r7 = r7.removeFirstOrNull()     // Catch: java.lang.Throwable -> L60
                io.ktor.network.selector.Selectable r7 = (io.ktor.network.selector.Selectable) r7     // Catch: java.lang.Throwable -> L60
                if (r7 != 0) goto L93
                P3.r.o(r4, r3)
                O3.C r7 = O3.C.a
                return r7
            L93:
                J5.q r0 = new J5.q     // Catch: java.lang.Throwable -> L60
                java.lang.String r2 = "Failed to apply interest: selector closed"
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L60
                r1.cancelAllSuspensions(r7, r0)     // Catch: java.lang.Throwable -> L60
                goto L81
            L9e:
                r7 = move-exception
                io.ktor.network.selector.ActorSelectorManager.access$setClosed$p(r1, r2)     // Catch: java.lang.Throwable -> L60
                io.ktor.network.selector.LockFreeMPSCQueue r2 = io.ktor.network.selector.ActorSelectorManager.access$getSelectionQueue$p(r1)     // Catch: java.lang.Throwable -> L60
                r2.close()     // Catch: java.lang.Throwable -> L60
                io.ktor.network.selector.ActorSelectorManager.access$setSelectorRef$p(r1, r3)     // Catch: java.lang.Throwable -> L60
                r1.cancelAllSuspensions(r0, r3)     // Catch: java.lang.Throwable -> L60
                throw r7     // Catch: java.lang.Throwable -> L60
            Lb0:
                throw r7     // Catch: java.lang.Throwable -> Lb1
            Lb1:
                r0 = move-exception
                P3.r.o(r4, r7)
                throw r0
            Lb6:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "openSelector() = null"
                r7.<init>(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.selector.ActorSelectorManager.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00028\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Lio/ktor/network/selector/ActorSelectorManager$ContinuationHolder;", "R", "LS3/c;", "C", "", "<init>", "()V", "value", "", "resume", "(Ljava/lang/Object;)Z", "continuation", "Lkotlin/Function0;", "condition", "suspendIf", "(LS3/c;Le4/a;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "ref", "Ljava/util/concurrent/atomic/AtomicReference;", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContinuationHolder<R, C extends c<? super R>> {
        private final AtomicReference<C> ref = new AtomicReference<>(null);

        public final boolean resume(R value) {
            C andSet = this.ref.getAndSet(null);
            if (andSet == null) {
                return false;
            }
            andSet.resumeWith(value);
            return true;
        }

        public final Object suspendIf(C continuation, InterfaceC0821a condition) {
            l.f("continuation", continuation);
            l.f("condition", condition);
            if (!((Boolean) condition.invoke()).booleanValue()) {
                return null;
            }
            AtomicReference atomicReference = this.ref;
            while (!atomicReference.compareAndSet(null, continuation)) {
                if (atomicReference.get() != null) {
                    throw new IllegalStateException("Continuation is already set");
                }
            }
            if (!((Boolean) condition.invoke()).booleanValue()) {
                AtomicReference atomicReference2 = this.ref;
                while (!atomicReference2.compareAndSet(continuation, null)) {
                    if (atomicReference2.get() != continuation) {
                    }
                }
                return null;
            }
            return a.f9048k;
        }
    }

    @e(c = "io.ktor.network.selector.ActorSelectorManager", f = "ActorSelectorManager.kt", l = {70, 74, 90}, m = "process")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.network.selector.ActorSelectorManager$process$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12321 extends U3.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12321(c<? super C12321> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActorSelectorManager.this.process(null, null, this);
        }
    }

    @e(c = "io.ktor.network.selector.ActorSelectorManager", f = "ActorSelectorManager.kt", l = {168}, m = "receiveOrNullSuspend")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.network.selector.ActorSelectorManager$receiveOrNullSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12331 extends U3.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12331(c<? super C12331> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActorSelectorManager.this.receiveOrNullSuspend(null, this);
        }
    }

    @e(c = "io.ktor.network.selector.ActorSelectorManager", f = "ActorSelectorManager.kt", l = {210}, m = "select")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.network.selector.ActorSelectorManager$select$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12341 extends U3.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12341(c<? super C12341> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActorSelectorManager.this.select(null, this);
        }
    }

    public ActorSelectorManager(h hVar) {
        l.f("context", hVar);
        this.wakeup = new AtomicLong();
        this.continuation = new ContinuationHolder<>();
        this.selectionQueue = new LockFreeMPSCQueue<>();
        this.coroutineContext = hVar.plus(new C0284z("selector"));
        D.x(this, null, new AnonymousClass1(null), 3);
    }

    private final Object dispatchIfNeeded(c<? super C> cVar) {
        D.I(cVar);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e3, code lost:
    
        if (r12 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0088 -> B:19:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a2 -> B:19:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b0 -> B:19:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e3 -> B:44:0x00e6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object process(io.ktor.network.selector.LockFreeMPSCQueue<io.ktor.network.selector.Selectable> r10, java.nio.channels.Selector r11, S3.c<? super O3.C> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.selector.ActorSelectorManager.process(io.ktor.network.selector.LockFreeMPSCQueue, java.nio.channels.Selector, S3.c):java.lang.Object");
    }

    private final void processInterests(LockFreeMPSCQueue<Selectable> mb, Selector selector) {
        while (true) {
            Selectable selectableRemoveFirstOrNull = mb.removeFirstOrNull();
            if (selectableRemoveFirstOrNull == null) {
                return;
            } else {
                applyInterest(selector, selectableRemoveFirstOrNull);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object receiveOrNull(LockFreeMPSCQueue<Selectable> lockFreeMPSCQueue, c<? super Selectable> cVar) {
        Selectable selectableRemoveFirstOrNull = lockFreeMPSCQueue.removeFirstOrNull();
        return selectableRemoveFirstOrNull == null ? receiveOrNullSuspend(lockFreeMPSCQueue, cVar) : selectableRemoveFirstOrNull;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object receiveOrNullSuspend(io.ktor.network.selector.LockFreeMPSCQueue<io.ktor.network.selector.Selectable> r7, S3.c<? super io.ktor.network.selector.Selectable> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.ktor.network.selector.ActorSelectorManager.C12331
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.network.selector.ActorSelectorManager$receiveOrNullSuspend$1 r0 = (io.ktor.network.selector.ActorSelectorManager.C12331) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.network.selector.ActorSelectorManager$receiveOrNullSuspend$1 r0 = new io.ktor.network.selector.ActorSelectorManager$receiveOrNullSuspend$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            java.lang.Object r7 = r0.L$0
            io.ktor.network.selector.LockFreeMPSCQueue r7 = (io.ktor.network.selector.LockFreeMPSCQueue) r7
            goto L30
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            P3.r.Y(r8)
        L33:
            java.lang.Object r8 = r7.removeFirstOrNull()
            io.ktor.network.selector.Selectable r8 = (io.ktor.network.selector.Selectable) r8
            if (r8 == 0) goto L3c
            return r8
        L3c:
            boolean r8 = r6.closed
            r2 = 0
            if (r8 == 0) goto L42
            return r2
        L42:
            r0.L$0 = r7
            r0.label = r3
            io.ktor.network.selector.ActorSelectorManager$ContinuationHolder<O3.C, S3.c<O3.C>> r8 = r6.continuation
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L8a
            boolean r4 = r6.closed
            if (r4 != 0) goto L8a
            java.util.concurrent.atomic.AtomicReference r4 = io.ktor.network.selector.ActorSelectorManager.ContinuationHolder.access$getRef$p(r8)
        L56:
            boolean r5 = r4.compareAndSet(r2, r0)
            if (r5 == 0) goto L7b
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L67
            boolean r4 = r6.closed
            if (r4 != 0) goto L67
            goto L78
        L67:
            java.util.concurrent.atomic.AtomicReference r5 = io.ktor.network.selector.ActorSelectorManager.ContinuationHolder.access$getRef$p(r8)
        L6b:
            boolean r8 = r5.compareAndSet(r0, r2)
            if (r8 == 0) goto L72
            goto L8a
        L72:
            java.lang.Object r8 = r5.get()
            if (r8 == r0) goto L6b
        L78:
            T3.a r2 = T3.a.f9048k
            goto L8a
        L7b:
            java.lang.Object r5 = r4.get()
            if (r5 != 0) goto L82
            goto L56
        L82:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Continuation is already set"
            r7.<init>(r8)
            throw r7
        L8a:
            if (r2 != 0) goto L8e
            O3.C r2 = O3.C.a
        L8e:
            T3.a r8 = T3.a.f9048k
            if (r2 != r1) goto L33
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.selector.ActorSelectorManager.receiveOrNullSuspend(io.ktor.network.selector.LockFreeMPSCQueue, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object select(java.nio.channels.Selector r5, S3.c<? super java.lang.Integer> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.network.selector.ActorSelectorManager.C12341
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.network.selector.ActorSelectorManager$select$1 r0 = (io.ktor.network.selector.ActorSelectorManager.C12341) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.network.selector.ActorSelectorManager$select$1 r0 = new io.ktor.network.selector.ActorSelectorManager$select$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            java.nio.channels.Selector r5 = (java.nio.channels.Selector) r5
            P3.r.Y(r6)
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            P3.r.Y(r6)
            r4.inSelect = r3
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = H5.D.I(r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.util.concurrent.atomic.AtomicLong r6 = r4.wakeup
            long r0 = r6.get()
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r0 = 0
            if (r6 != 0) goto L59
            r1 = 500(0x1f4, double:2.47E-321)
            int r5 = r5.select(r1)
            r4.inSelect = r0
            goto L64
        L59:
            r4.inSelect = r0
            java.util.concurrent.atomic.AtomicLong r6 = r4.wakeup
            r6.set(r2)
            int r5 = r5.selectNow()
        L64:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.selector.ActorSelectorManager.select(java.nio.channels.Selector, S3.c):java.lang.Object");
    }

    private final void selectWakeup() {
        Selector selector;
        if (this.wakeup.incrementAndGet() == 1 && this.inSelect && (selector = this.selectorRef) != null) {
            selector.wakeup();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
        this.selectionQueue.close();
        if (this.continuation.resume(C.a)) {
            return;
        }
        selectWakeup();
    }

    @Override // io.ktor.network.selector.SelectorManagerSupport, io.ktor.network.selector.SelectorManager, H5.A
    public h getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.network.selector.SelectorManager
    public void notifyClosed(Selectable selectable) {
        SelectionKey selectionKeyKeyFor;
        l.f("selectable", selectable);
        cancelAllSuspensions(selectable, new ClosedChannelException());
        Selector selector = this.selectorRef;
        if (selector == null || (selectionKeyKeyFor = selectable.getChannel().keyFor(selector)) == null) {
            return;
        }
        selectionKeyKeyFor.cancel();
        selectWakeup();
    }

    @Override // io.ktor.network.selector.SelectorManagerSupport
    public void publishInterest(Selectable selectable) {
        l.f("selectable", selectable);
        try {
            if (this.selectionQueue.addLast(selectable)) {
                this.continuation.resume(C.a);
                selectWakeup();
            } else {
                if (!selectable.getChannel().isOpen()) {
                    throw new ClosedChannelException();
                }
                throw new ClosedSelectorException();
            }
        } catch (Throwable th) {
            cancelAllSuspensions(selectable, th);
        }
    }
}
