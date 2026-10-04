package io.ktor.util.cio;

import A3.d;
import H5.A;
import H5.C0284z;
import H5.D;
import H5.M;
import H5.Y;
import O3.C;
import O3.i;
import O3.q;
import P3.r;
import S3.c;
import S3.h;
import T3.a;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteReadChannelOperations_jvmKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.ReaderScope;
import io.ktor.utils.io.WriterJob;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a,\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, d2 = {"Ljava/io/File;", "", "start", "endInclusive", "LS3/h;", "coroutineContext", "Lio/ktor/utils/io/ByteReadChannel;", "readChannel", "(Ljava/io/File;JJLS3/h;)Lio/ktor/utils/io/ByteReadChannel;", "Ljava/nio/channels/SeekableByteChannel;", "Lio/ktor/utils/io/WriterScope;", "writerScope", "LO3/C;", "writeToScope", "(Ljava/nio/channels/SeekableByteChannel;Lio/ktor/utils/io/WriterScope;JJLS3/c;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteWriteChannel;", "writeChannel", "(Ljava/io/File;LS3/h;)Lio/ktor/utils/io/ByteWriteChannel;", "Ljava/io/RandomAccessFile;", "randomAccessFile", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FileChannelsKt {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/ReaderScope;", "LO3/C;", "<anonymous>", "(Lio/ktor/utils/io/ReaderScope;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.util.cio.FileChannelsKt$writeChannel$1", f = "FileChannels.kt", l = {106}, m = "invokeSuspend")
    /* renamed from: io.ktor.util.cio.FileChannelsKt$writeChannel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        final /* synthetic */ File $this_writeChannel;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(File file, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$this_writeChannel = file;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_writeChannel, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // e4.n
        public final Object invoke(ReaderScope readerScope, c<? super C> cVar) {
            return ((AnonymousClass1) create(readerScope, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            RandomAccessFile randomAccessFile;
            a aVar = a.f9048k;
            ?? r12 = this.label;
            try {
                if (r12 == 0) {
                    r.Y(obj);
                    ReaderScope readerScope = (ReaderScope) this.L$0;
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.$this_writeChannel, "rw");
                    ByteReadChannel channel = readerScope.getChannel();
                    FileChannel channel2 = randomAccessFile2.getChannel();
                    l.e("getChannel(...)", channel2);
                    this.L$0 = randomAccessFile2;
                    this.L$1 = randomAccessFile2;
                    this.label = 1;
                    obj = ByteReadChannelOperations_jvmKt.copyTo$default(channel, channel2, 0L, this, 2, null);
                    if (obj == aVar) {
                        return aVar;
                    }
                    randomAccessFile = randomAccessFile2;
                    r12 = randomAccessFile2;
                } else {
                    if (r12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    randomAccessFile = (RandomAccessFile) this.L$1;
                    Closeable closeable = (Closeable) this.L$0;
                    r.Y(obj);
                    r12 = closeable;
                }
                randomAccessFile.setLength(((Number) obj).longValue());
                r.o(r12, null);
                return C.a;
            } finally {
            }
        }
    }

    @e(c = "io.ktor.util.cio.FileChannelsKt", f = "FileChannels.kt", l = {144, 180}, m = "writeToScope")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.util.cio.FileChannelsKt$writeToScope$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12451 extends U3.c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C12451(c<? super C12451> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileChannelsKt.writeToScope(null, null, 0L, 0L, this);
        }
    }

    public static final ByteReadChannel readChannel(File file, long j7, long j8, h hVar) {
        l.f("<this>", file);
        l.f("coroutineContext", hVar);
        long length = file.length();
        q qVarC = z1.c.C(new B3.q(12, file));
        WriterJob writerJobWriter = ByteWriteChannelOperationsKt.writer((A) D.c(hVar), new C0284z("file-reader").plus(hVar), false, (n) new FileChannelsKt$readChannel$writer$1(j7, j8, length, qVarC, null));
        ByteWriteChannelOperationsKt.invokeOnCompletion(writerJobWriter, new d(22, qVarC));
        return writerJobWriter.getChannel();
    }

    public static ByteReadChannel readChannel$default(File file, long j7, long j8, h hVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = 0;
        }
        long j9 = j7;
        if ((i7 & 2) != 0) {
            j8 = -1;
        }
        long j10 = j8;
        if ((i7 & 4) != 0) {
            O5.e eVar = M.a;
            hVar = O5.d.f7623l;
        }
        return readChannel(file, j9, j10, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RandomAccessFile readChannel$lambda$0(File file) {
        return new RandomAccessFile(file, "r");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RandomAccessFile readChannel$lambda$1(i iVar) {
        return (RandomAccessFile) iVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C readChannel$lambda$2(i iVar, Throwable th) throws IOException {
        readChannel$lambda$1(iVar).close();
        return C.a;
    }

    public static final ByteWriteChannel writeChannel(File file, h hVar) {
        l.f("<this>", file);
        l.f("coroutineContext", hVar);
        return ByteReadChannelOperationsKt.reader((A) Y.f3831k, new C0284z("file-writer").plus(hVar), true, (n) new AnonymousClass1(file, null)).getChannel();
    }

    public static ByteWriteChannel writeChannel$default(File file, h hVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            O5.e eVar = M.a;
            hVar = O5.d.f7623l;
        }
        return writeChannel(file, hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
    
        if (r1.flush(r3) == r4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01eb, code lost:
    
        if (r9.flush(r3) == r4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ed, code lost:
    
        return r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f8 -> B:43:0x00fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01eb -> B:78:0x01ee). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object writeToScope(java.nio.channels.SeekableByteChannel r21, io.ktor.utils.io.WriterScope r22, long r23, long r25, S3.c<? super O3.C> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.cio.FileChannelsKt.writeToScope(java.nio.channels.SeekableByteChannel, io.ktor.utils.io.WriterScope, long, long, S3.c):java.lang.Object");
    }
}
