package io.ktor.utils.io;

import S5.n;
import U3.c;
import U3.e;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import z5.AbstractC2517v;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u0012H\u0080@¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010!R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lio/ktor/utils/io/ByteChannelScanner;", "", "Lio/ktor/utils/io/ByteReadChannel;", "channel", "LT5/a;", "matchString", "Lio/ktor/utils/io/ByteWriteChannel;", "writeChannel", "", "limit", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;LT5/a;Lio/ktor/utils/io/ByteWriteChannel;J)V", "", "buildPartialMatchTable", "()[I", "LO3/C;", "advanceToNextPotentialMatch", "(LS3/c;)Ljava/lang/Object;", "", "checkFullMatch", "extra", "checkBounds", "(J)V", "", "toSingleLineString", "(LT5/a;)Ljava/lang/String;", "ignoreMissing", "findNext$ktor_io", "(ZLS3/c;)Ljava/lang/Object;", "findNext", "Lio/ktor/utils/io/ByteReadChannel;", "LT5/a;", "Lio/ktor/utils/io/ByteWriteChannel;", "J", "LS5/n;", "input", "LS5/n;", "partialMatchTable", "[I", "LS5/a;", "partialMatchBuffer", "LS5/a;", "bytesRead", "", "matchIndex", "I", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ByteChannelScanner {
    private long bytesRead;
    private final ByteReadChannel channel;
    private final n input;
    private final long limit;
    private int matchIndex;
    private final T5.a matchString;
    private final S5.a partialMatchBuffer;
    private final int[] partialMatchTable;
    private final ByteWriteChannel writeChannel;

    @e(c = "io.ktor.utils.io.ByteChannelScanner", f = "ByteChannelScanner.kt", l = {99, 105, 110}, m = "advanceToNextPotentialMatch")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteChannelScanner$advanceToNextPotentialMatch$1, reason: invalid class name */
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
            return ByteChannelScanner.this.advanceToNextPotentialMatch(this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteChannelScanner", f = "ByteChannelScanner.kt", l = {124, 142}, m = "checkFullMatch")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteChannelScanner$checkFullMatch$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12501 extends c {
        int label;
        /* synthetic */ Object result;

        public C12501(S3.c<? super C12501> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelScanner.this.checkFullMatch(this);
        }
    }

    public ByteChannelScanner(ByteReadChannel byteReadChannel, T5.a aVar, ByteWriteChannel byteWriteChannel, long j7) {
        l.f("channel", byteReadChannel);
        l.f("matchString", aVar);
        l.f("writeChannel", byteWriteChannel);
        this.channel = byteReadChannel;
        this.matchString = aVar;
        this.writeChannel = byteWriteChannel;
        this.limit = j7;
        if (aVar.f9118k.length <= 0) {
            throw new IllegalArgumentException("Empty match string not permitted for scanning");
        }
        this.input = byteReadChannel.getReadBuffer();
        this.partialMatchTable = buildPartialMatchTable();
        this.partialMatchBuffer = new S5.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r1 == r3) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b0, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelKt.flushIfNeeded(r1, r2) == r3) goto L96;
     */
    /* JADX WARN: Path cross not found for [B:38:0x00b3, B:34:0x00aa], limit reached: 107 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016e A[LOOP:0: B:28:0x0075->B:84:0x016e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0182 A[EDGE_INSN: B:99:0x0182->B:88:0x0182 BREAK  A[LOOP:0: B:28:0x0075->B:84:0x016e], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x01b0 -> B:93:0x01b3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object advanceToNextPotentialMatch(S3.c<? super O3.C> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelScanner.advanceToNextPotentialMatch(S3.c):java.lang.Object");
    }

    private final int[] buildPartialMatchTable() {
        byte[] bArr = this.matchString.f9118k;
        int[] iArr = new int[bArr.length];
        int length = bArr.length;
        int i7 = 0;
        for (int i8 = 1; i8 < length; i8++) {
            while (i7 > 0 && this.matchString.a(i8) != this.matchString.a(i7)) {
                i7 = iArr[i7 - 1];
            }
            if (this.matchString.a(i8) == this.matchString.a(i7)) {
                i7++;
            }
            iArr[i8] = i7;
        }
        return iArr;
    }

    private final void checkBounds(long extra) throws IOException {
        if (this.bytesRead + extra <= this.limit) {
            return;
        }
        StringBuilder sb = new StringBuilder("Limit of ");
        sb.append(this.limit);
        sb.append(" bytes exceeded while searching for \"");
        throw new IOException(A6.b.j(sb, toSingleLineString(this.matchString), '\"'));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r12 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b9, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeByte(r11.writeChannel, r12, r0) != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0040 -> B:27:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004c -> B:22:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkFullMatch(S3.c<? super java.lang.Boolean> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelScanner.checkFullMatch(S3.c):java.lang.Object");
    }

    public static /* synthetic */ Object findNext$ktor_io$default(ByteChannelScanner byteChannelScanner, boolean z7, S3.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        return byteChannelScanner.findNext$ktor_io(z7, cVar);
    }

    private final String toSingleLineString(T5.a aVar) {
        l.f("<this>", aVar);
        return AbstractC2517v.R(AbstractC2517v.I(aVar.f9118k), "\n", "\\n");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        if (r10.flush(r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c5, code lost:
    
        if (r11 != r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2 A[PHI: r10
      0x00b2: PHI (r10v2 boolean) = (r10v3 boolean), (r10v8 boolean) binds: [B:27:0x0070, B:22:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c5 -> B:43:0x00c8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object findNext$ktor_io(boolean r10, S3.c<? super java.lang.Long> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelScanner.findNext$ktor_io(boolean, S3.c):java.lang.Object");
    }

    public /* synthetic */ ByteChannelScanner(ByteReadChannel byteReadChannel, T5.a aVar, ByteWriteChannel byteWriteChannel, long j7, int i7, f fVar) {
        this(byteReadChannel, aVar, byteWriteChannel, (i7 & 8) != 0 ? Long.MAX_VALUE : j7);
    }
}
