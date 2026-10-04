package io.ktor.utils.io;

import H5.A;
import O3.C;
import S3.c;
import U3.e;
import U3.j;
import e4.n;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.utils.io.ByteWriteChannelOperationsKt$writer$job$1", f = "ByteWriteChannelOperations.kt", l = {179, 189, 190, 189, 190, 189, 190}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ByteWriteChannelOperationsKt$writer$job$1 extends j implements n {
    final /* synthetic */ n $block;
    final /* synthetic */ ByteChannel $channel;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteWriteChannelOperationsKt$writer$job$1(n nVar, ByteChannel byteChannel, c<? super ByteWriteChannelOperationsKt$writer$job$1> cVar) {
        super(2, cVar);
        this.$block = nVar;
        this.$channel = byteChannel;
    }

    @Override // U3.a
    public final c<C> create(Object obj, c<?> cVar) {
        ByteWriteChannelOperationsKt$writer$job$1 byteWriteChannelOperationsKt$writer$job$1 = new ByteWriteChannelOperationsKt$writer$job$1(this.$block, this.$channel, cVar);
        byteWriteChannelOperationsKt$writer$job$1.L$0 = obj;
        return byteWriteChannelOperationsKt$writer$job$1;
    }

    @Override // e4.n
    public final Object invoke(A a, c<? super C> cVar) {
        return ((ByteWriteChannelOperationsKt$writer$job$1) create(a, cVar)).invokeSuspend(C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        if (r9.flushAndClose(r8) != r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fd, code lost:
    
        if (r9.flushAndClose(r8) != r0) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1 A[Catch: all -> 0x00b3, TRY_LEAVE, TryCatch #1 {all -> 0x00b3, blocks: (B:30:0x0093, B:32:0x00a1), top: B:69:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [H5.f0] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteWriteChannelOperationsKt$writer$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
