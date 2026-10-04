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
import io.ktor.network.selector.SelectInterest;
import io.ktor.network.selector.Selectable;
import io.ktor.network.selector.SelectorManager;
import io.ktor.network.sockets.SocketOptions;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.WriterJob;
import io.ktor.utils.io.WriterScope;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a?\u0010\u0011\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001c\u0010\u0015\u001a\u00020\u0014*\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016\u001a \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LH5/A;", "Lio/ktor/utils/io/ByteChannel;", "channel", "Ljava/nio/channels/ReadableByteChannel;", "nioChannel", "Lio/ktor/network/selector/Selectable;", "selectable", "Lio/ktor/network/selector/SelectorManager;", "selector", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "socketOptions", "Lio/ktor/utils/io/WriterJob;", "attachForReadingImpl", "(LH5/A;Lio/ktor/utils/io/ByteChannel;Ljava/nio/channels/ReadableByteChannel;Lio/ktor/network/selector/Selectable;Lio/ktor/network/selector/SelectorManager;Lio/ktor/utils/io/pool/ObjectPool;Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;)Lio/ktor/utils/io/WriterJob;", "attachForReadingDirectImpl", "(LH5/A;Lio/ktor/utils/io/ByteChannel;Ljava/nio/channels/ReadableByteChannel;Lio/ktor/network/selector/Selectable;Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;)Lio/ktor/utils/io/WriterJob;", "Lio/ktor/utils/io/ByteWriteChannel;", "", "readFrom", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/nio/channels/ReadableByteChannel;LS3/c;)Ljava/lang/Object;", "LO3/C;", "selectForRead", "(Lio/ktor/network/selector/Selectable;Lio/ktor/network/selector/SelectorManager;LS3/c;)Ljava/lang/Object;", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CIOReaderKt {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "LO3/C;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingDirectImpl$1", f = "CIOReader.kt", l = {96, 105, 108, 109, 96, 105, 108, 109}, m = "invokeSuspend")
    /* renamed from: io.ktor.network.sockets.CIOReaderKt$attachForReadingDirectImpl$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        final /* synthetic */ ByteChannel $channel;
        final /* synthetic */ ReadableByteChannel $nioChannel;
        final /* synthetic */ Selectable $selectable;
        final /* synthetic */ SelectorManager $selector;
        final /* synthetic */ SocketOptions.TCPClientSocketOptions $socketOptions;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Selectable selectable, SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, ByteChannel byteChannel, ReadableByteChannel readableByteChannel, SelectorManager selectorManager, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$selectable = selectable;
            this.$socketOptions = tCPClientSocketOptions;
            this.$channel = byteChannel;
            this.$nioChannel = readableByteChannel;
            this.$selector = selectorManager;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$selectable, this.$socketOptions, this.$channel, this.$nioChannel, this.$selector, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // e4.n
        public final Object invoke(WriterScope writerScope, c<? super C> cVar) {
            return ((AnonymousClass1) create(writerScope, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:83:0x021f, code lost:
        
            if (r14 != r0) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0228, code lost:
        
            if (((java.lang.Number) r14).intValue() != 0) goto L87;
         */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0133 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:87:0x022a, B:43:0x012b, B:45:0x0133, B:47:0x013d, B:51:0x015a, B:53:0x0162, B:55:0x0168, B:58:0x017d, B:61:0x0192, B:64:0x01a7, B:67:0x01b1, B:91:0x0236, B:92:0x0239, B:94:0x0241, B:103:0x0268, B:88:0x0230, B:89:0x0233, B:21:0x009d, B:26:0x00ba, B:29:0x00d3, B:32:0x00ec, B:35:0x00f9, B:37:0x0105, B:40:0x0112, B:7:0x0029, B:85:0x0222, B:79:0x01f5, B:82:0x020b, B:68:0x01b4, B:72:0x01d1, B:74:0x01d9, B:76:0x01df, B:12:0x004a, B:15:0x0067, B:18:0x0084), top: B:113:0x0006, inners: #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0162 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:87:0x022a, B:43:0x012b, B:45:0x0133, B:47:0x013d, B:51:0x015a, B:53:0x0162, B:55:0x0168, B:58:0x017d, B:61:0x0192, B:64:0x01a7, B:67:0x01b1, B:91:0x0236, B:92:0x0239, B:94:0x0241, B:103:0x0268, B:88:0x0230, B:89:0x0233, B:21:0x009d, B:26:0x00ba, B:29:0x00d3, B:32:0x00ec, B:35:0x00f9, B:37:0x0105, B:40:0x0112, B:7:0x0029, B:85:0x0222, B:79:0x01f5, B:82:0x020b, B:68:0x01b4, B:72:0x01d1, B:74:0x01d9, B:76:0x01df, B:12:0x004a, B:15:0x0067, B:18:0x0084), top: B:113:0x0006, inners: #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0190  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0192 A[Catch: all -> 0x00a2, PHI: r1 r4 r5 r6 r7
          0x0192: PHI (r1v18 io.ktor.network.selector.SelectorManager) = (r1v7 io.ktor.network.selector.SelectorManager), (r1v19 io.ktor.network.selector.SelectorManager) binds: [B:26:0x00ba, B:59:0x018e] A[DONT_GENERATE, DONT_INLINE]
          0x0192: PHI (r4v18 io.ktor.network.selector.Selectable) = (r4v7 io.ktor.network.selector.Selectable), (r4v19 io.ktor.network.selector.Selectable) binds: [B:26:0x00ba, B:59:0x018e] A[DONT_GENERATE, DONT_INLINE]
          0x0192: PHI (r5v19 java.nio.channels.ReadableByteChannel) = (r5v8 java.nio.channels.ReadableByteChannel), (r5v20 java.nio.channels.ReadableByteChannel) binds: [B:26:0x00ba, B:59:0x018e] A[DONT_GENERATE, DONT_INLINE]
          0x0192: PHI (r6v17 io.ktor.utils.io.ByteChannel) = (r6v6 io.ktor.utils.io.ByteChannel), (r6v18 io.ktor.utils.io.ByteChannel) binds: [B:26:0x00ba, B:59:0x018e] A[DONT_GENERATE, DONT_INLINE]
          0x0192: PHI (r7v18 io.ktor.network.util.Timeout) = (r7v7 io.ktor.network.util.Timeout), (r7v19 io.ktor.network.util.Timeout) binds: [B:26:0x00ba, B:59:0x018e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00a2, blocks: (B:87:0x022a, B:43:0x012b, B:45:0x0133, B:47:0x013d, B:51:0x015a, B:53:0x0162, B:55:0x0168, B:58:0x017d, B:61:0x0192, B:64:0x01a7, B:67:0x01b1, B:91:0x0236, B:92:0x0239, B:94:0x0241, B:103:0x0268, B:88:0x0230, B:89:0x0233, B:21:0x009d, B:26:0x00ba, B:29:0x00d3, B:32:0x00ec, B:35:0x00f9, B:37:0x0105, B:40:0x0112, B:7:0x0029, B:85:0x0222, B:79:0x01f5, B:82:0x020b, B:68:0x01b4, B:72:0x01d1, B:74:0x01d9, B:76:0x01df, B:12:0x004a, B:15:0x0067, B:18:0x0084), top: B:113:0x0006, inners: #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01d9 A[Catch: all -> 0x002e, TryCatch #3 {all -> 0x002e, blocks: (B:7:0x0029, B:85:0x0222, B:79:0x01f5, B:82:0x020b, B:68:0x01b4, B:72:0x01d1, B:74:0x01d9, B:76:0x01df, B:12:0x004a, B:15:0x0067, B:18:0x0084), top: B:113:0x0006, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01dd  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x020a  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x020b A[Catch: all -> 0x002e, PHI: r1 r4 r5 r6 r7 r8
          0x020b: PHI (r1v24 io.ktor.network.selector.SelectorManager) = (r1v15 io.ktor.network.selector.SelectorManager), (r1v25 io.ktor.network.selector.SelectorManager) binds: [B:12:0x004a, B:80:0x0208] A[DONT_GENERATE, DONT_INLINE]
          0x020b: PHI (r4v22 io.ktor.network.selector.Selectable) = (r4v15 io.ktor.network.selector.Selectable), (r4v23 io.ktor.network.selector.Selectable) binds: [B:12:0x004a, B:80:0x0208] A[DONT_GENERATE, DONT_INLINE]
          0x020b: PHI (r5v25 java.nio.channels.ReadableByteChannel) = (r5v16 java.nio.channels.ReadableByteChannel), (r5v26 java.nio.channels.ReadableByteChannel) binds: [B:12:0x004a, B:80:0x0208] A[DONT_GENERATE, DONT_INLINE]
          0x020b: PHI (r6v26 io.ktor.utils.io.ByteChannel) = (r6v14 io.ktor.utils.io.ByteChannel), (r6v27 io.ktor.utils.io.ByteChannel) binds: [B:12:0x004a, B:80:0x0208] A[DONT_GENERATE, DONT_INLINE]
          0x020b: PHI (r7v24 io.ktor.network.util.Timeout) = (r7v15 io.ktor.network.util.Timeout), (r7v25 io.ktor.network.util.Timeout) binds: [B:12:0x004a, B:80:0x0208] A[DONT_GENERATE, DONT_INLINE]
          0x020b: PHI (r8v12 io.ktor.network.util.Timeout) = (r8v6 io.ktor.network.util.Timeout), (r8v13 io.ktor.network.util.Timeout) binds: [B:12:0x004a, B:80:0x0208] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {all -> 0x002e, blocks: (B:7:0x0029, B:85:0x0222, B:79:0x01f5, B:82:0x020b, B:68:0x01b4, B:72:0x01d1, B:74:0x01d9, B:76:0x01df, B:12:0x004a, B:15:0x0067, B:18:0x0084), top: B:113:0x0006, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0234  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0162 -> B:43:0x012b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0166 -> B:43:0x012b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01ad -> B:58:0x017d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01af -> B:43:0x012b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01d9 -> B:87:0x022a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01dd -> B:87:0x022a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x021f -> B:85:0x0222). Please report as a decompilation issue!!! */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 672
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.CIOReaderKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "LO3/C;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1", f = "CIOReader.kt", l = {42, 44, 42, 44, 55}, m = "invokeSuspend")
    /* renamed from: io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12351 extends j implements n {
        final /* synthetic */ ByteBuffer $buffer;
        final /* synthetic */ ByteChannel $channel;
        final /* synthetic */ ReadableByteChannel $nioChannel;
        final /* synthetic */ ObjectPool<ByteBuffer> $pool;
        final /* synthetic */ Selectable $selectable;
        final /* synthetic */ SelectorManager $selector;
        final /* synthetic */ SocketOptions.TCPClientSocketOptions $socketOptions;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12351(SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, ByteChannel byteChannel, Selectable selectable, ByteBuffer byteBuffer, ObjectPool<ByteBuffer> objectPool, ReadableByteChannel readableByteChannel, SelectorManager selectorManager, c<? super C12351> cVar) {
            super(2, cVar);
            this.$socketOptions = tCPClientSocketOptions;
            this.$channel = byteChannel;
            this.$selectable = selectable;
            this.$buffer = byteBuffer;
            this.$pool = objectPool;
            this.$nioChannel = readableByteChannel;
            this.$selector = selectorManager;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            C12351 c12351 = new C12351(this.$socketOptions, this.$channel, this.$selectable, this.$buffer, this.$pool, this.$nioChannel, this.$selector, cVar);
            c12351.L$0 = obj;
            return c12351;
        }

        @Override // e4.n
        public final Object invoke(WriterScope writerScope, c<? super C> cVar) {
            return ((C12351) create(writerScope, cVar)).invokeSuspend(C.a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:57:0x016d A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:55:0x0165, B:57:0x016d, B:61:0x0196, B:65:0x01c4, B:17:0x004c, B:22:0x0074), top: B:96:0x000c, outer: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01c8 A[Catch: all -> 0x0021, DONT_GENERATE, TRY_ENTER, TryCatch #1 {all -> 0x0021, blocks: (B:10:0x001c, B:84:0x022d, B:38:0x00ed, B:40:0x00fe, B:42:0x0106, B:46:0x012d, B:50:0x0159, B:68:0x01cb, B:70:0x01d0, B:72:0x01d7, B:81:0x0203, B:53:0x015f, B:67:0x01c8, B:85:0x0235, B:86:0x0238, B:25:0x0095, B:28:0x00b6, B:31:0x00c3, B:33:0x00c7, B:36:0x00d4, B:55:0x0165, B:57:0x016d, B:61:0x0196, B:65:0x01c4, B:17:0x004c, B:22:0x0074), top: B:96:0x000c, inners: #0 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x015b -> B:40:0x00fe). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01c6 -> B:55:0x0165). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x022a -> B:84:0x022d). Please report as a decompilation issue!!! */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 608
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.CIOReaderKt.C12351.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @e(c = "io.ktor.network.sockets.CIOReaderKt", f = "CIOReader.kt", l = {133}, m = "readFrom")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.network.sockets.CIOReaderKt$readFrom$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12361 extends U3.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12361(c<? super C12361> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CIOReaderKt.readFrom(null, null, this);
        }
    }

    public static final WriterJob attachForReadingDirectImpl(A a, ByteChannel byteChannel, ReadableByteChannel readableByteChannel, Selectable selectable, SelectorManager selectorManager, SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        l.f("<this>", a);
        l.f("channel", byteChannel);
        l.f("nioChannel", readableByteChannel);
        l.f("selectable", selectable);
        l.f("selector", selectorManager);
        O5.e eVar = M.a;
        return ByteWriteChannelOperationsKt.writer(a, d.f7623l.plus(new C0284z("cio-from-nio-reader")), byteChannel, new AnonymousClass1(selectable, tCPClientSocketOptions, byteChannel, readableByteChannel, selectorManager, null));
    }

    public static /* synthetic */ WriterJob attachForReadingDirectImpl$default(A a, ByteChannel byteChannel, ReadableByteChannel readableByteChannel, Selectable selectable, SelectorManager selectorManager, SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, int i7, Object obj) {
        if ((i7 & 16) != 0) {
            tCPClientSocketOptions = null;
        }
        return attachForReadingDirectImpl(a, byteChannel, readableByteChannel, selectable, selectorManager, tCPClientSocketOptions);
    }

    public static final WriterJob attachForReadingImpl(A a, ByteChannel byteChannel, ReadableByteChannel readableByteChannel, Selectable selectable, SelectorManager selectorManager, ObjectPool<ByteBuffer> objectPool, SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        l.f("<this>", a);
        l.f("channel", byteChannel);
        l.f("nioChannel", readableByteChannel);
        l.f("selectable", selectable);
        l.f("selector", selectorManager);
        l.f("pool", objectPool);
        ByteBuffer byteBufferBorrow = objectPool.borrow();
        O5.e eVar = M.a;
        return ByteWriteChannelOperationsKt.writer(a, d.f7623l.plus(new C0284z("cio-from-nio-reader")), byteChannel, new C12351(tCPClientSocketOptions, byteChannel, selectable, byteBufferBorrow, objectPool, readableByteChannel, selectorManager, null));
    }

    public static /* synthetic */ WriterJob attachForReadingImpl$default(A a, ByteChannel byteChannel, ReadableByteChannel readableByteChannel, Selectable selectable, SelectorManager selectorManager, ObjectPool objectPool, SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, int i7, Object obj) {
        if ((i7 & 32) != 0) {
            tCPClientSocketOptions = null;
        }
        return attachForReadingImpl(a, byteChannel, readableByteChannel, selectable, selectorManager, objectPool, tCPClientSocketOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readFrom(io.ktor.utils.io.ByteWriteChannel r7, java.nio.channels.ReadableByteChannel r8, S3.c<? super java.lang.Integer> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.ktor.network.sockets.CIOReaderKt.C12361
            if (r0 == 0) goto L14
            r0 = r9
            io.ktor.network.sockets.CIOReaderKt$readFrom$1 r0 = (io.ktor.network.sockets.CIOReaderKt.C12361) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            io.ktor.network.sockets.CIOReaderKt$readFrom$1 r0 = new io.ktor.network.sockets.CIOReaderKt$readFrom$1
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.result
            T3.a r0 = T3.a.f9048k
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            java.lang.Object r7 = r4.L$0
            kotlin.jvm.internal.v r7 = (kotlin.jvm.internal.v) r7
            P3.r.Y(r9)
            goto L53
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            P3.r.Y(r9)
            kotlin.jvm.internal.v r9 = new kotlin.jvm.internal.v
            r9.<init>()
            I5.d r3 = new I5.d
            r1 = 6
            r3.<init>(r1, r9, r8)
            r4.L$0 = r9
            r4.label = r2
            r5 = 1
            r6 = 0
            r2 = 0
            r1 = r7
            java.lang.Object r7 = io.ktor.utils.io.ByteWriteChannelOperations_jvmKt.write$default(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L52
            return r0
        L52:
            r7 = r9
        L53:
            int r7 = r7.f12718k
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.CIOReaderKt.readFrom(io.ktor.utils.io.ByteWriteChannel, java.nio.channels.ReadableByteChannel, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C readFrom$lambda$0(v vVar, ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) {
        l.f("buffer", byteBuffer);
        vVar.f12718k = readableByteChannel.read(byteBuffer);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object selectForRead(Selectable selectable, SelectorManager selectorManager, c<? super C> cVar) {
        SelectInterest selectInterest = SelectInterest.READ;
        selectable.interestOp(selectInterest, true);
        Object objSelect = selectorManager.select(selectable, selectInterest, cVar);
        return objSelect == T3.a.f9048k ? objSelect : C.a;
    }
}
