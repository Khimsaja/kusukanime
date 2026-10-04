package io.ktor.util.cio;

import A6.b;
import H5.A;
import H5.C0284z;
import H5.D;
import H5.M;
import O3.C;
import O5.d;
import P3.r;
import S3.c;
import S3.h;
import T3.a;
import U3.e;
import U3.j;
import b1.AbstractC0703b;
import e4.n;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.WriterScope;
import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljava/nio/file/Path;", "", "start", "endInclusive", "LS3/h;", "coroutineContext", "Lio/ktor/utils/io/ByteReadChannel;", "readChannel", "(Ljava/nio/file/Path;JJLS3/h;)Lio/ktor/utils/io/ByteReadChannel;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FileChannelsAtNioPathKt {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "LO3/C;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.util.cio.FileChannelsAtNioPathKt$readChannel$1", f = "FileChannelsAtNioPath.kt", l = {36}, m = "invokeSuspend")
    /* renamed from: io.ktor.util.cio.FileChannelsAtNioPathKt$readChannel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        final /* synthetic */ long $endInclusive;
        final /* synthetic */ long $fileLength;
        final /* synthetic */ long $start;
        final /* synthetic */ Path $this_readChannel;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j7, long j8, long j9, Path path, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$start = j7;
            this.$endInclusive = j8;
            this.$fileLength = j9;
            this.$this_readChannel = path;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$start, this.$endInclusive, this.$fileLength, this.$this_readChannel, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // e4.n
        public final Object invoke(WriterScope writerScope, c<? super C> cVar) {
            return ((AnonymousClass1) create(writerScope, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            Closeable closeable;
            a aVar = a.f9048k;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) this.L$0;
                try {
                    r.Y(obj);
                    r.o(closeable, null);
                    return C.a;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        r.o(closeable, th);
                        throw th3;
                    }
                }
            }
            r.Y(obj);
            WriterScope writerScope = (WriterScope) this.L$0;
            long j7 = this.$start;
            if (j7 < 0) {
                throw new IllegalArgumentException(AbstractC0703b.h("start position shouldn't be negative but it is ", j7).toString());
            }
            long j8 = this.$endInclusive;
            long j9 = this.$fileLength;
            if (j8 > j9 - 1) {
                StringBuilder sbK = b.k("endInclusive points to the position out of the file: file size = ", j9, ", endInclusive = ");
                sbK.append(j8);
                throw new IllegalArgumentException(sbK.toString().toString());
            }
            SeekableByteChannel seekableByteChannelNewByteChannel = Files.newByteChannel(this.$this_readChannel, new OpenOption[0]);
            long j10 = this.$start;
            long j11 = this.$endInclusive;
            try {
                l.c(seekableByteChannelNewByteChannel);
                this.L$0 = seekableByteChannelNewByteChannel;
                this.label = 1;
                if (FileChannelsKt.writeToScope(seekableByteChannelNewByteChannel, writerScope, j10, j11, this) == aVar) {
                    return aVar;
                }
                closeable = seekableByteChannelNewByteChannel;
                r.o(closeable, null);
                return C.a;
            } catch (Throwable th4) {
                th = th4;
                closeable = seekableByteChannelNewByteChannel;
                throw th;
            }
        }
    }

    public static final ByteReadChannel readChannel(Path path, long j7, long j8, h hVar) throws IOException {
        l.f("<this>", path);
        l.f("coroutineContext", hVar);
        return ByteWriteChannelOperationsKt.writer((A) D.c(hVar), new C0284z("file-reader").plus(hVar), false, (n) new AnonymousClass1(j7, j8, Files.size(path), path, null)).getChannel();
    }

    public static ByteReadChannel readChannel$default(Path path, long j7, long j8, h hVar, int i7, Object obj) {
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
            hVar = d.f7623l;
        }
        return readChannel(path, j9, j10, hVar);
    }
}
