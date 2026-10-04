package io.ktor.network.sockets;

import A3.d;
import H5.A;
import H5.C0263e0;
import H5.C0284z;
import H5.D;
import H5.InterfaceC0265f0;
import H5.h0;
import H5.r;
import O3.C;
import S3.c;
import S3.h;
import U3.e;
import U3.j;
import e4.k;
import e4.n;
import io.ktor.network.selector.SelectableBase;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteChannelUtilsKt;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.ReaderJob;
import io.ktor.utils.io.WriterJob;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u001a\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u001b\u0010\u0019J\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u000bH ¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\b0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R#\u0010/\u001a\u00020,*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010+0*8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R%\u00102\u001a\u0004\u0018\u00010\u000b*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010+0*8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lio/ktor/network/sockets/SocketBase;", "Lio/ktor/network/sockets/ReadWriteSocket;", "Lio/ktor/network/selector/SelectableBase;", "LH5/A;", "LS3/h;", "parent", "<init>", "(LS3/h;)V", "LO3/C;", "checkChannels", "()V", "", "e1", "e2", "combine", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "dispose", "close", "Lio/ktor/utils/io/ByteChannel;", "channel", "Lio/ktor/utils/io/WriterJob;", "attachForReading", "(Lio/ktor/utils/io/ByteChannel;)Lio/ktor/utils/io/WriterJob;", "Lio/ktor/utils/io/ReaderJob;", "attachForWriting", "(Lio/ktor/utils/io/ByteChannel;)Lio/ktor/utils/io/ReaderJob;", "attachForReadingImpl", "attachForWritingImpl", "actualClose$ktor_network", "()Ljava/lang/Throwable;", "actualClose", "Lkotlin/Function1;", "channelCompletionHandler", "Le4/k;", "LH5/r;", "socketContext", "LH5/r;", "getSocketContext", "()LH5/r;", "getCoroutineContext", "()LS3/h;", "coroutineContext", "Lkotlinx/atomicfu/AtomicRef;", "Lio/ktor/utils/io/ChannelJob;", "", "getCompletedOrNotStarted", "(Lkotlinx/atomicfu/AtomicRef;)Z", "completedOrNotStarted", "getException", "(Lkotlinx/atomicfu/AtomicRef;)Ljava/lang/Throwable;", "exception", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class SocketBase extends SelectableBase implements ReadWriteSocket, A {
    private volatile /* synthetic */ int actualCloseFlag;
    private final k channelCompletionHandler;
    private volatile /* synthetic */ int closeFlag;
    volatile /* synthetic */ Object readerJob;
    private final r socketContext;
    volatile /* synthetic */ Object writerJob;
    private static final /* synthetic */ AtomicIntegerFieldUpdater closeFlag$FU = AtomicIntegerFieldUpdater.newUpdater(SocketBase.class, "closeFlag");
    private static final /* synthetic */ AtomicIntegerFieldUpdater actualCloseFlag$FU = AtomicIntegerFieldUpdater.newUpdater(SocketBase.class, "actualCloseFlag");
    static final /* synthetic */ AtomicReferenceFieldUpdater readerJob$FU = AtomicReferenceFieldUpdater.newUpdater(SocketBase.class, Object.class, "readerJob");
    static final /* synthetic */ AtomicReferenceFieldUpdater writerJob$FU = AtomicReferenceFieldUpdater.newUpdater(SocketBase.class, Object.class, "writerJob");

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.network.sockets.SocketBase$close$1", f = "SocketBase.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: io.ktor.network.sockets.SocketBase$close$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            return SocketBase.this.new AnonymousClass1(cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, c<? super C> cVar) {
            return ((AnonymousClass1) create(a, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                P3.r.Y(obj);
                ReaderJob readerJob = (ReaderJob) SocketBase.this.readerJob;
                if (readerJob != null) {
                    this.label = 1;
                    if (readerJob.flushAndClose(this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P3.r.Y(obj);
            }
            WriterJob writerJob = (WriterJob) SocketBase.this.writerJob;
            if (writerJob != null) {
                ByteWriteChannelOperationsKt.cancel(writerJob);
            }
            SocketBase.this.checkChannels();
            return C.a;
        }
    }

    public SocketBase(h hVar) {
        l.f("parent", hVar);
        this.closeFlag = 0;
        this.actualCloseFlag = 0;
        this.readerJob = null;
        this.writerJob = null;
        this.channelCompletionHandler = new d(21, this);
        this.socketContext = new h0((InterfaceC0265f0) hVar.get(C0263e0.f3843k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C channelCompletionHandler$lambda$0(SocketBase socketBase, Throwable th) {
        socketBase.checkChannels();
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void checkChannels() {
        /*
            r4 = this;
            int r0 = r4.closeFlag
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r4.readerJob
            io.ktor.utils.io.ChannelJob r0 = (io.ktor.utils.io.ChannelJob) r0
            if (r0 == 0) goto L10
            boolean r0 = io.ktor.utils.io.ByteWriteChannelOperationsKt.isCompleted(r0)
            if (r0 == 0) goto L7f
        L10:
            java.lang.Object r0 = r4.writerJob
            io.ktor.utils.io.ChannelJob r0 = (io.ktor.utils.io.ChannelJob) r0
            if (r0 == 0) goto L1c
            boolean r0 = io.ktor.utils.io.ByteWriteChannelOperationsKt.isCompleted(r0)
            if (r0 == 0) goto L7f
        L1c:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = io.ktor.network.sockets.SocketBase.actualCloseFlag$FU
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r4, r1, r2)
            if (r0 != 0) goto L27
            goto L7f
        L27:
            java.lang.Object r0 = r4.readerJob
            io.ktor.utils.io.ChannelJob r0 = (io.ktor.utils.io.ChannelJob) r0
            r1 = 0
            if (r0 == 0) goto L43
            boolean r2 = io.ktor.utils.io.ByteWriteChannelOperationsKt.isCancelled(r0)
            if (r2 == 0) goto L35
            goto L36
        L35:
            r0 = r1
        L36:
            if (r0 == 0) goto L43
            java.util.concurrent.CancellationException r0 = io.ktor.utils.io.ByteWriteChannelOperationsKt.getCancellationException(r0)
            if (r0 == 0) goto L43
            java.lang.Throwable r0 = r0.getCause()
            goto L44
        L43:
            r0 = r1
        L44:
            java.lang.Object r2 = r4.writerJob
            io.ktor.utils.io.ChannelJob r2 = (io.ktor.utils.io.ChannelJob) r2
            if (r2 == 0) goto L5e
            boolean r3 = io.ktor.utils.io.ByteWriteChannelOperationsKt.isCancelled(r2)
            if (r3 == 0) goto L51
            goto L52
        L51:
            r2 = r1
        L52:
            if (r2 == 0) goto L5e
            java.util.concurrent.CancellationException r2 = io.ktor.utils.io.ByteWriteChannelOperationsKt.getCancellationException(r2)
            if (r2 == 0) goto L5e
            java.lang.Throwable r1 = r2.getCause()
        L5e:
            java.lang.Throwable r2 = r4.actualClose$ktor_network()
            java.lang.Throwable r0 = r4.combine(r0, r1)
            java.lang.Throwable r0 = r4.combine(r0, r2)
            if (r0 != 0) goto L76
            H5.r r0 = r4.getSocketContext()
            H5.h0 r0 = (H5.h0) r0
            r0.Z()
            return
        L76:
            H5.r r1 = r4.getSocketContext()
            H5.h0 r1 = (H5.h0) r1
            r1.a0(r0)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.SocketBase.checkChannels():void");
    }

    private final Throwable combine(Throwable e12, Throwable e22) {
        if (e12 == null) {
            return e22;
        }
        if (e22 == null || e12 == e22) {
            return e12;
        }
        q0.c.j(e12, e22);
        return e12;
    }

    public abstract Throwable actualClose$ktor_network();

    @Override // io.ktor.network.sockets.AReadable
    public final WriterJob attachForReading(ByteChannel channel) throws Throwable {
        l.f("channel", channel);
        if (this.closeFlag != 0) {
            IOException iOException = new IOException("Socket closed");
            ByteWriteChannelOperationsKt.close(channel, iOException);
            throw iOException;
        }
        WriterJob writerJobAttachForReadingImpl = attachForReadingImpl(channel);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = writerJob$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, writerJobAttachForReadingImpl)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                IllegalStateException illegalStateException = new IllegalStateException("reading channel has already been set");
                ByteWriteChannelOperationsKt.cancel(writerJobAttachForReadingImpl);
                throw illegalStateException;
            }
        }
        if (this.closeFlag == 0) {
            ByteChannelUtilsKt.attachJob(channel, writerJobAttachForReadingImpl);
            ByteWriteChannelOperationsKt.invokeOnCompletion(writerJobAttachForReadingImpl, this.channelCompletionHandler);
            return writerJobAttachForReadingImpl;
        }
        IOException iOException2 = new IOException("Socket closed");
        ByteWriteChannelOperationsKt.cancel(writerJobAttachForReadingImpl);
        ByteWriteChannelOperationsKt.close(channel, iOException2);
        throw iOException2;
    }

    public abstract WriterJob attachForReadingImpl(ByteChannel channel);

    @Override // io.ktor.network.sockets.AWritable
    public final ReaderJob attachForWriting(ByteChannel channel) throws Throwable {
        l.f("channel", channel);
        if (this.closeFlag != 0) {
            IOException iOException = new IOException("Socket closed");
            ByteWriteChannelOperationsKt.close(channel, iOException);
            throw iOException;
        }
        ReaderJob readerJobAttachForWritingImpl = attachForWritingImpl(channel);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = readerJob$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, readerJobAttachForWritingImpl)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                IllegalStateException illegalStateException = new IllegalStateException("writing channel has already been set");
                ByteWriteChannelOperationsKt.cancel(readerJobAttachForWritingImpl);
                throw illegalStateException;
            }
        }
        if (this.closeFlag == 0) {
            ByteChannelUtilsKt.attachJob(channel, readerJobAttachForWritingImpl);
            ByteWriteChannelOperationsKt.invokeOnCompletion(readerJobAttachForWritingImpl, this.channelCompletionHandler);
            return readerJobAttachForWritingImpl;
        }
        IOException iOException2 = new IOException("Socket closed");
        ByteWriteChannelOperationsKt.cancel(readerJobAttachForWritingImpl);
        ByteWriteChannelOperationsKt.close(channel, iOException2);
        throw iOException2;
    }

    public abstract ReaderJob attachForWritingImpl(ByteChannel channel);

    @Override // io.ktor.network.selector.SelectableBase, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (closeFlag$FU.compareAndSet(this, 0, 1)) {
            D.x(this, new C0284z("socket-close"), new AnonymousClass1(null), 2);
        }
    }

    @Override // io.ktor.network.selector.SelectableBase, io.ktor.network.selector.Selectable, H5.N
    public void dispose() {
        close();
    }

    @Override // H5.A
    public h getCoroutineContext() {
        return getSocketContext();
    }

    @Override // io.ktor.network.sockets.ASocket
    public r getSocketContext() {
        return this.socketContext;
    }
}
