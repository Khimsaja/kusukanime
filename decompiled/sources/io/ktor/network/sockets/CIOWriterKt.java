package io.ktor.network.sockets;

import H5.A;
import H5.C0284z;
import H5.M;
import O3.C;
import O5.d;
import S3.c;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.network.selector.Selectable;
import io.ktor.network.selector.SelectorManager;
import io.ktor.network.sockets.SocketOptions;
import io.ktor.network.util.Timeout;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ReaderJob;
import io.ktor.utils.io.ReaderScope;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LH5/A;", "Lio/ktor/utils/io/ByteChannel;", "channel", "Ljava/nio/channels/WritableByteChannel;", "nioChannel", "Lio/ktor/network/selector/Selectable;", "selectable", "Lio/ktor/network/selector/SelectorManager;", "selector", "Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "socketOptions", "Lio/ktor/utils/io/ReaderJob;", "attachForWritingDirectImpl", "(LH5/A;Lio/ktor/utils/io/ByteChannel;Ljava/nio/channels/WritableByteChannel;Lio/ktor/network/selector/Selectable;Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;)Lio/ktor/utils/io/ReaderJob;", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CIOWriterKt {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/ReaderScope;", "LO3/C;", "<anonymous>", "(Lio/ktor/utils/io/ReaderScope;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1", f = "CIOWriter.kt", l = {33, 75, 79, 50}, m = "invokeSuspend")
    /* renamed from: io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        final /* synthetic */ ByteChannel $channel;
        final /* synthetic */ WritableByteChannel $nioChannel;
        final /* synthetic */ Selectable $selectable;
        final /* synthetic */ SelectorManager $selector;
        final /* synthetic */ SocketOptions.TCPClientSocketOptions $socketOptions;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Selectable selectable, SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, ByteChannel byteChannel, SelectorManager selectorManager, WritableByteChannel writableByteChannel, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$selectable = selectable;
            this.$socketOptions = tCPClientSocketOptions;
            this.$channel = byteChannel;
            this.$selector = selectorManager;
            this.$nioChannel = writableByteChannel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C invokeSuspend$lambda$1(Timeout timeout, v vVar, WritableByteChannel writableByteChannel, ByteBuffer byteBuffer) {
            while (byteBuffer.hasRemaining()) {
                if (timeout == null) {
                    do {
                        vVar.f12718k = writableByteChannel.write(byteBuffer);
                        if (byteBuffer.hasRemaining()) {
                        }
                    } while (vVar.f12718k > 0);
                } else {
                    timeout.start();
                    do {
                        try {
                            vVar.f12718k = writableByteChannel.write(byteBuffer);
                            if (!byteBuffer.hasRemaining()) {
                                break;
                            }
                        } finally {
                            timeout.stop();
                        }
                    } while (vVar.f12718k > 0);
                }
            }
            return C.a;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$selectable, this.$socketOptions, this.$channel, this.$selector, this.$nioChannel, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // e4.n
        public final Object invoke(ReaderScope readerScope, c<? super C> cVar) {
            return ((AnonymousClass1) create(readerScope, cVar)).invokeSuspend(C.a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0107 A[Catch: all -> 0x001f, TryCatch #2 {all -> 0x001f, blocks: (B:10:0x001a, B:34:0x00ab, B:36:0x00b3, B:38:0x00bb, B:41:0x00ce, B:45:0x00f2, B:47:0x00fa, B:48:0x0103, B:50:0x0107, B:53:0x0123, B:54:0x014a, B:56:0x014d, B:17:0x003a, B:19:0x0047, B:22:0x0063, B:26:0x0081, B:28:0x0085, B:31:0x0092), top: B:80:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:84:? A[PHI: r11
          PHI (r11v3 io.ktor.network.util.Timeout) = (r11v0 io.ktor.network.util.Timeout), (r11v0 io.ktor.network.util.Timeout), (r11v5 io.ktor.network.util.Timeout) binds: [B:49:0x0105, B:51:0x0120, B:33:0x00aa] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0105 -> B:34:0x00ab). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0120 -> B:34:0x00ab). Please report as a decompilation issue!!! */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 416
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.CIOWriterKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final ReaderJob attachForWritingDirectImpl(A a, ByteChannel byteChannel, WritableByteChannel writableByteChannel, Selectable selectable, SelectorManager selectorManager, SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        l.f("<this>", a);
        l.f("channel", byteChannel);
        l.f("nioChannel", writableByteChannel);
        l.f("selectable", selectable);
        l.f("selector", selectorManager);
        O5.e eVar = M.a;
        return ByteReadChannelOperationsKt.reader(a, d.f7623l.plus(new C0284z("cio-to-nio-writer")), byteChannel, new AnonymousClass1(selectable, tCPClientSocketOptions, byteChannel, selectorManager, writableByteChannel, null));
    }

    public static /* synthetic */ ReaderJob attachForWritingDirectImpl$default(A a, ByteChannel byteChannel, WritableByteChannel writableByteChannel, Selectable selectable, SelectorManager selectorManager, SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, int i7, Object obj) {
        if ((i7 & 16) != 0) {
            tCPClientSocketOptions = null;
        }
        return attachForWritingDirectImpl(a, byteChannel, writableByteChannel, selectable, selectorManager, tCPClientSocketOptions);
    }
}
