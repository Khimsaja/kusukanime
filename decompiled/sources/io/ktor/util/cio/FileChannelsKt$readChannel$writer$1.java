package io.ktor.util.cio;

import A6.b;
import O3.C;
import O3.i;
import P3.r;
import S3.c;
import T3.a;
import U3.e;
import U3.j;
import b1.AbstractC0703b;
import e4.n;
import io.ktor.utils.io.WriterScope;
import java.io.Closeable;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "LO3/C;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.util.cio.FileChannelsKt$readChannel$writer$1", f = "FileChannels.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FileChannelsKt$readChannel$writer$1 extends j implements n {
    final /* synthetic */ long $endInclusive;
    final /* synthetic */ long $fileLength;
    final /* synthetic */ i $randomAccessFile$delegate;
    final /* synthetic */ long $start;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileChannelsKt$readChannel$writer$1(long j7, long j8, long j9, i iVar, c<? super FileChannelsKt$readChannel$writer$1> cVar) {
        super(2, cVar);
        this.$start = j7;
        this.$endInclusive = j8;
        this.$fileLength = j9;
        this.$randomAccessFile$delegate = iVar;
    }

    @Override // U3.a
    public final c<C> create(Object obj, c<?> cVar) {
        FileChannelsKt$readChannel$writer$1 fileChannelsKt$readChannel$writer$1 = new FileChannelsKt$readChannel$writer$1(this.$start, this.$endInclusive, this.$fileLength, this.$randomAccessFile$delegate, cVar);
        fileChannelsKt$readChannel$writer$1.L$0 = obj;
        return fileChannelsKt$readChannel$writer$1;
    }

    @Override // e4.n
    public final Object invoke(WriterScope writerScope, c<? super C> cVar) {
        return ((FileChannelsKt$readChannel$writer$1) create(writerScope, cVar)).invokeSuspend(C.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f9048k;
        ?? r12 = this.label;
        try {
            if (r12 == 0) {
                r.Y(obj);
                WriterScope writerScope = (WriterScope) this.L$0;
                long j7 = this.$start;
                if (!(j7 >= 0)) {
                    throw new IllegalArgumentException(AbstractC0703b.h("start position shouldn't be negative but it is ", j7).toString());
                }
                long j8 = this.$endInclusive;
                long j9 = this.$fileLength;
                if (!(j8 <= j9 - 1)) {
                    StringBuilder sbK = b.k("endInclusive points to the position out of the file: file size = ", j9, ", endInclusive = ");
                    sbK.append(j8);
                    throw new IllegalArgumentException(sbK.toString().toString());
                }
                RandomAccessFile channel$lambda$1 = FileChannelsKt.readChannel$lambda$1(this.$randomAccessFile$delegate);
                long j10 = this.$start;
                long j11 = this.$endInclusive;
                FileChannel channel = channel$lambda$1.getChannel();
                l.e("getChannel(...)", channel);
                this.L$0 = channel$lambda$1;
                this.label = 1;
                r12 = channel$lambda$1;
                if (FileChannelsKt.writeToScope(channel, writerScope, j10, j11, this) == aVar) {
                    return aVar;
                }
            } else {
                if (r12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Closeable closeable = (Closeable) this.L$0;
                r.Y(obj);
                r12 = closeable;
            }
            r.o(r12, null);
            return C.a;
        } finally {
        }
    }
}
