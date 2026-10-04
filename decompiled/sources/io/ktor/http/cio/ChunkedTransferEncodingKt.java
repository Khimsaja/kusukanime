package io.ktor.http.cio;

import H5.A;
import H5.Y;
import O3.C;
import O3.InterfaceC0554c;
import P3.r;
import S3.c;
import S3.h;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.sse.ServerSentEventKt;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.ReaderJob;
import io.ktor.utils.io.ReaderScope;
import io.ktor.utils.io.WriterJob;
import io.ktor.utils.io.WriterScope;
import io.ktor.utils.io.core.StringsKt;
import io.ktor.utils.io.pool.DefaultPool;
import io.ktor.utils.io.pool.ObjectPool;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\b\u001a\u001f\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t\u001a \u0010\u0005\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0005\u0010\r\u001a!\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014\u001a \u0010\u0013\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0013\u0010\u0015\u001a\u0013\u0010\u0016\u001a\u00020\f*\u00020\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a,\u0010\u001d\u001a\u00020\u001a*\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010\u001f\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u0014\u0010!\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010 \"\u001e\u0010%\u001a\f\u0012\b\u0012\u00060#j\u0002`$0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\"\u0014\u0010(\u001a\u00020'8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)\"\u0014\u0010*\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010,\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+*\n\u0010-\"\u00020\u00032\u00020\u0003*\n\u0010.\"\u00020\u00112\u00020\u0011¨\u0006/"}, d2 = {"LH5/A;", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/utils/io/WriterJob;", "Lio/ktor/http/cio/DecoderJob;", "decodeChunked", "(LH5/A;Lio/ktor/utils/io/ByteReadChannel;)Lio/ktor/utils/io/WriterJob;", "", "contentLength", "(LH5/A;Lio/ktor/utils/io/ByteReadChannel;J)Lio/ktor/utils/io/WriterJob;", "Lio/ktor/utils/io/ByteWriteChannel;", "out", "LO3/C;", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;LS3/c;)Ljava/lang/Object;", "output", "LS3/h;", "coroutineContext", "Lio/ktor/utils/io/ReaderJob;", "Lio/ktor/http/cio/EncoderJob;", "encodeChunked", "(Lio/ktor/utils/io/ByteWriteChannel;LS3/h;)Lio/ktor/utils/io/ReaderJob;", "(Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/utils/io/ByteReadChannel;LS3/c;)Ljava/lang/Object;", "rethrowCloseCause", "(Lio/ktor/utils/io/ByteReadChannel;)V", "", "memory", "", "startIndex", "endIndex", "writeChunk", "(Lio/ktor/utils/io/ByteWriteChannel;[BIILS3/c;)Ljava/lang/Object;", "MAX_CHUNK_SIZE_LENGTH", "I", "CHUNK_BUFFER_POOL_SIZE", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "ChunkSizeBufferPool", "Lio/ktor/utils/io/pool/ObjectPool;", "", "CrLfShort", "S", "CrLf", "[B", "LastChunkBytes", "DecoderJob", "EncoderJob", "ktor-http-cio"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChunkedTransferEncodingKt {
    private static final int CHUNK_BUFFER_POOL_SIZE = 2048;
    private static final short CrLfShort = 3338;
    private static final int MAX_CHUNK_SIZE_LENGTH = 128;
    private static final ObjectPool<StringBuilder> ChunkSizeBufferPool = new DefaultPool<StringBuilder>() { // from class: io.ktor.http.cio.ChunkedTransferEncodingKt$ChunkSizeBufferPool$1
        @Override // io.ktor.utils.io.pool.DefaultPool
        public StringBuilder clearInstance(StringBuilder instance) {
            l.f("instance", instance);
            instance.setLength(0);
            return instance;
        }

        @Override // io.ktor.utils.io.pool.DefaultPool
        public StringBuilder produceInstance() {
            return new StringBuilder(128);
        }
    };
    private static final byte[] CrLf = StringsKt.toByteArray$default(ServerSentEventKt.END_OF_LINE, null, 1, null);
    private static final byte[] LastChunkBytes = StringsKt.toByteArray$default("0\r\n\r\n", null, 1, null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "LO3/C;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.http.cio.ChunkedTransferEncodingKt$decodeChunked$1", f = "ChunkedTransferEncoding.kt", l = {54}, m = "invokeSuspend")
    /* renamed from: io.ktor.http.cio.ChunkedTransferEncodingKt$decodeChunked$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        final /* synthetic */ ByteReadChannel $input;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ByteReadChannel byteReadChannel, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$input = byteReadChannel;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$input, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // e4.n
        public final Object invoke(WriterScope writerScope, c<? super C> cVar) {
            return ((AnonymousClass1) create(writerScope, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                WriterScope writerScope = (WriterScope) this.L$0;
                ByteReadChannel byteReadChannel = this.$input;
                ByteWriteChannel channel = writerScope.getChannel();
                this.label = 1;
                if (ChunkedTransferEncodingKt.decodeChunked(byteReadChannel, channel, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
            return C.a;
        }
    }

    @e(c = "io.ktor.http.cio.ChunkedTransferEncodingKt", f = "ChunkedTransferEncoding.kt", l = {72, 81, 82, 87, 101, 101}, m = "decodeChunked")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.http.cio.ChunkedTransferEncodingKt$decodeChunked$2, reason: invalid class name */
    public static final class AnonymousClass2 extends U3.c {
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChunkedTransferEncodingKt.decodeChunked((ByteReadChannel) null, (ByteWriteChannel) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/ReaderScope;", "LO3/C;", "<anonymous>", "(Lio/ktor/utils/io/ReaderScope;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$1", f = "ChunkedTransferEncoding.kt", l = {122}, m = "invokeSuspend")
    /* renamed from: io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12231 extends j implements n {
        final /* synthetic */ ByteWriteChannel $output;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12231(ByteWriteChannel byteWriteChannel, c<? super C12231> cVar) {
            super(2, cVar);
            this.$output = byteWriteChannel;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            C12231 c12231 = new C12231(this.$output, cVar);
            c12231.L$0 = obj;
            return c12231;
        }

        @Override // e4.n
        public final Object invoke(ReaderScope readerScope, c<? super C> cVar) {
            return ((C12231) create(readerScope, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                ReaderScope readerScope = (ReaderScope) this.L$0;
                ByteWriteChannel byteWriteChannel = this.$output;
                ByteReadChannel channel = readerScope.getChannel();
                this.label = 1;
                if (ChunkedTransferEncodingKt.encodeChunked(byteWriteChannel, channel, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
            return C.a;
        }
    }

    @e(c = "io.ktor.http.cio.ChunkedTransferEncodingKt", f = "ChunkedTransferEncoding.kt", l = {175, 135, 140, 146, 146}, m = "encodeChunked")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$2, reason: invalid class name and case insensitive filesystem */
    public static final class C12242 extends U3.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C12242(c<? super C12242> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChunkedTransferEncodingKt.encodeChunked(null, null, this);
        }
    }

    @e(c = "io.ktor.http.cio.ChunkedTransferEncodingKt", f = "ChunkedTransferEncoding.kt", l = {164, 165, 167, 168, 169}, m = "writeChunk")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.http.cio.ChunkedTransferEncodingKt$writeChunk$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12251 extends U3.c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12251(c<? super C12251> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChunkedTransferEncodingKt.writeChunk(null, null, 0, 0, this);
        }
    }

    @InterfaceC0554c
    public static final WriterJob decodeChunked(A a, ByteReadChannel byteReadChannel) {
        l.f("<this>", a);
        l.f("input", byteReadChannel);
        return decodeChunked(a, byteReadChannel, -1L);
    }

    public static final ReaderJob encodeChunked(ByteWriteChannel byteWriteChannel, h hVar) {
        l.f("output", byteWriteChannel);
        l.f("coroutineContext", hVar);
        return ByteReadChannelOperationsKt.reader((A) Y.f3831k, hVar, false, (n) new C12231(byteWriteChannel, null));
    }

    private static final void rethrowCloseCause(ByteReadChannel byteReadChannel) throws Throwable {
        Throwable closedCause = byteReadChannel instanceof ByteChannel ? ((ByteChannel) byteReadChannel).getClosedCause() : null;
        if (closedCause != null) {
            throw closedCause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e0, code lost:
    
        if (r12.flush(r5) != r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[PHI: r11 r12
      0x0055: PHI (r11v4 int) = (r11v3 int), (r11v10 int) binds: [B:32:0x00bf, B:20:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0055: PHI (r12v4 io.ktor.utils.io.ByteWriteChannel) = (r12v3 io.ktor.utils.io.ByteWriteChannel), (r12v16 io.ktor.utils.io.ByteWriteChannel) binds: [B:32:0x00bf, B:20:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object writeChunk(io.ktor.utils.io.ByteWriteChannel r11, byte[] r12, int r13, int r14, S3.c<? super java.lang.Integer> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.ChunkedTransferEncodingKt.writeChunk(io.ktor.utils.io.ByteWriteChannel, byte[], int, int, S3.c):java.lang.Object");
    }

    public static final WriterJob decodeChunked(A a, ByteReadChannel byteReadChannel, long j7) {
        l.f("<this>", a);
        l.f("input", byteReadChannel);
        return ByteWriteChannelOperationsKt.writer$default(a, a.getCoroutineContext(), false, (n) new AnonymousClass1(byteReadChannel, null), 2, (Object) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ac, code lost:
    
        if (r1.getReadBuffer().z() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
    
        r3.L$0 = r13;
        r3.L$1 = r1;
        r3.L$2 = r1;
        r3.L$3 = null;
        r3.L$4 = null;
        r3.L$5 = null;
        r3.label = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c0, code lost:
    
        if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r1, 0, r3, r9, null) != r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
    
        r11 = r1;
        r12 = r13;
        r1 = r3;
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
    
        r11 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0167, code lost:
    
        rethrowCloseCause(r1);
        r14 = io.ktor.http.cio.ChunkedTransferEncodingKt.LastChunkBytes;
        r3.L$0 = r13;
        r3.L$1 = r1;
        r3.L$2 = null;
        r3.L$3 = null;
        r3.L$4 = null;
        r3.L$5 = null;
        r3.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017a, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0187, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(r13, r14, 0, 0, r17, 6, null) != r2) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x018a, code lost:
    
        r4 = r13;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0197, code lost:
    
        if (r4.flush(r1) == r2) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x019e, code lost:
    
        r3 = r1;
        r4 = r13;
        r1 = r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0167 A[EDGE_INSN: B:121:0x0167->B:81:0x0167 BREAK  A[LOOP:0: B:105:0x0098->B:124:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db A[Catch: all -> 0x015a, TryCatch #4 {all -> 0x015a, blocks: (B:50:0x00d5, B:52:0x00db, B:54:0x00ee, B:56:0x00fb, B:58:0x0107, B:78:0x015c, B:79:0x0163), top: B:111:0x00d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0164  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00fb -> B:104:0x0128). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x011d -> B:62:0x0124). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0164 -> B:105:0x0098). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object encodeChunked(io.ktor.utils.io.ByteWriteChannel r20, io.ktor.utils.io.ByteReadChannel r21, S3.c<? super O3.C> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.ChunkedTransferEncodingKt.encodeChunked(io.ktor.utils.io.ByteWriteChannel, io.ktor.utils.io.ByteReadChannel, S3.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b8, code lost:
    
        if (r14.flushAndClose(r1) != r2) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6 A[Catch: all -> 0x0059, TryCatch #1 {all -> 0x0059, blocks: (B:15:0x004d, B:34:0x00ce, B:36:0x00d6, B:38:0x00dc, B:40:0x00e2, B:47:0x00f9, B:51:0x0110, B:54:0x0125, B:56:0x012e, B:44:0x00ef, B:74:0x019e, B:75:0x01a5, B:21:0x006c, B:24:0x0083, B:27:0x0099), top: B:91:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0163 A[Catch: all -> 0x017d, TryCatch #2 {all -> 0x017d, blocks: (B:60:0x015b, B:62:0x0163, B:30:0x00b0, B:68:0x0175, B:69:0x017c, B:72:0x0182, B:73:0x019d), top: B:93:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0182 A[Catch: all -> 0x017d, TryCatch #2 {all -> 0x017d, blocks: (B:60:0x015b, B:62:0x0163, B:30:0x00b0, B:68:0x0175, B:69:0x017c, B:72:0x0182, B:73:0x019d), top: B:93:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a6 A[PHI: r1 r3 r14
      0x01a6: PHI (r1v14 io.ktor.http.cio.ChunkedTransferEncodingKt$decodeChunked$2) = 
      (r1v11 io.ktor.http.cio.ChunkedTransferEncodingKt$decodeChunked$2)
      (r1v18 io.ktor.http.cio.ChunkedTransferEncodingKt$decodeChunked$2)
     binds: [B:35:0x00d4, B:66:0x016d] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r3v17 java.lang.StringBuilder) = (r3v23 java.lang.StringBuilder), (r3v20 java.lang.StringBuilder) binds: [B:35:0x00d4, B:66:0x016d] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r14v14 io.ktor.utils.io.ByteWriteChannel) = (r14v11 io.ktor.utils.io.ByteWriteChannel), (r14v17 io.ktor.utils.io.ByteWriteChannel) binds: [B:35:0x00d4, B:66:0x016d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.CharSequence, java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x014f -> B:17:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object decodeChunked(io.ktor.utils.io.ByteReadChannel r22, io.ktor.utils.io.ByteWriteChannel r23, S3.c<? super O3.C> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.ChunkedTransferEncodingKt.decodeChunked(io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel, S3.c):java.lang.Object");
    }
}
