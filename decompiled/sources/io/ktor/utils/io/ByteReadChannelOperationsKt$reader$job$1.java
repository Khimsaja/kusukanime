package io.ktor.utils.io;

import H5.A;
import O3.C;
import S3.c;
import U3.e;
import U3.j;
import e4.n;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt$reader$job$1", f = "ByteReadChannelOperations.kt", l = {333, 343, 343, 343}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ByteReadChannelOperationsKt$reader$job$1 extends j implements n {
    final /* synthetic */ n $block;
    final /* synthetic */ ByteChannel $channel;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteReadChannelOperationsKt$reader$job$1(n nVar, ByteChannel byteChannel, c<? super ByteReadChannelOperationsKt$reader$job$1> cVar) {
        super(2, cVar);
        this.$block = nVar;
        this.$channel = byteChannel;
    }

    @Override // U3.a
    public final c<C> create(Object obj, c<?> cVar) {
        ByteReadChannelOperationsKt$reader$job$1 byteReadChannelOperationsKt$reader$job$1 = new ByteReadChannelOperationsKt$reader$job$1(this.$block, this.$channel, cVar);
        byteReadChannelOperationsKt$reader$job$1.L$0 = obj;
        return byteReadChannelOperationsKt$reader$job$1;
    }

    @Override // e4.n
    public final Object invoke(A a, c<? super C> cVar) {
        return ((ByteReadChannelOperationsKt$reader$job$1) create(a, cVar)).invokeSuspend(C.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:(1:(3:11|38|39)(1:(2:8|9)(2:10|54)))(3:12|52|13))(5:17|50|18|(1:21)|43)|22|48|23|(1:25)|29|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        r1 = r13;
        r13 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
    
        if (r13.m(r12) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bd, code lost:
    
        if (((H5.n0) r1).m(r12) != r0) goto L38;
     */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r12.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L38
            if (r1 == r5) goto L29
            if (r1 == r4) goto L24
            if (r1 == r3) goto L24
            if (r1 == r2) goto L1b
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1b:
            java.lang.Object r0 = r12.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            P3.r.Y(r13)
            goto Ld4
        L24:
            P3.r.Y(r13)
            goto Lc0
        L29:
            java.lang.Object r1 = r12.L$1
            H5.r r1 = (H5.r) r1
            java.lang.Object r5 = r12.L$0
            H5.A r5 = (H5.A) r5
            P3.r.Y(r13)     // Catch: java.lang.Throwable -> L35
            goto L6d
        L35:
            r13 = move-exception
            goto La7
        L38:
            P3.r.Y(r13)
            java.lang.Object r13 = r12.L$0
            H5.A r13 = (H5.A) r13
            S3.h r1 = r13.getCoroutineContext()
            H5.f0 r1 = H5.D.q(r1)
            H5.h0 r7 = new H5.h0
            r7.<init>(r1)
            e4.n r1 = r12.$block     // Catch: java.lang.Throwable -> La5
            io.ktor.utils.io.ReaderScope r8 = new io.ktor.utils.io.ReaderScope     // Catch: java.lang.Throwable -> La5
            io.ktor.utils.io.ByteChannel r9 = r12.$channel     // Catch: java.lang.Throwable -> La5
            S3.h r10 = r13.getCoroutineContext()     // Catch: java.lang.Throwable -> La5
            S3.h r10 = r10.plus(r7)     // Catch: java.lang.Throwable -> La5
            r8.<init>(r9, r10)     // Catch: java.lang.Throwable -> La5
            r12.L$0 = r13     // Catch: java.lang.Throwable -> La5
            r12.L$1 = r7     // Catch: java.lang.Throwable -> La5
            r12.label = r5     // Catch: java.lang.Throwable -> La5
            java.lang.Object r1 = r1.invoke(r8, r12)     // Catch: java.lang.Throwable -> La5
            if (r1 != r0) goto L6b
            goto Ld2
        L6b:
            r5 = r13
            r1 = r7
        L6d:
            r13 = r1
            H5.h0 r13 = (H5.h0) r13     // Catch: java.lang.Throwable -> L35
            r13.Z()     // Catch: java.lang.Throwable -> L35
            S3.h r1 = r5.getCoroutineContext()     // Catch: java.lang.Throwable -> L93
            H5.f0 r1 = H5.D.q(r1)     // Catch: java.lang.Throwable -> L93
            boolean r1 = r1.isCancelled()     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L98
            io.ktor.utils.io.ByteChannel r1 = r12.$channel     // Catch: java.lang.Throwable -> L93
            S3.h r5 = r5.getCoroutineContext()     // Catch: java.lang.Throwable -> L93
            H5.f0 r5 = H5.D.q(r5)     // Catch: java.lang.Throwable -> L93
            java.util.concurrent.CancellationException r5 = r5.H()     // Catch: java.lang.Throwable -> L93
            r1.cancel(r5)     // Catch: java.lang.Throwable -> L93
            goto L98
        L93:
            r1 = move-exception
            r11 = r1
            r1 = r13
            r13 = r11
            goto La7
        L98:
            r12.L$0 = r6
            r12.L$1 = r6
            r12.label = r4
            java.lang.Object r13 = r13.m(r12)
            if (r13 != r0) goto Lc0
            goto Ld2
        La5:
            r13 = move-exception
            r1 = r7
        La7:
            java.lang.String r4 = "Exception thrown while reading from channel"
            H5.D.i(r1, r4, r13)     // Catch: java.lang.Throwable -> Lc3
            io.ktor.utils.io.ByteChannel r4 = r12.$channel     // Catch: java.lang.Throwable -> Lc3
            io.ktor.utils.io.ByteWriteChannelOperationsKt.close(r4, r13)     // Catch: java.lang.Throwable -> Lc3
            r12.L$0 = r6
            r12.L$1 = r6
            r12.label = r3
            H5.n0 r1 = (H5.n0) r1
            java.lang.Object r13 = r1.m(r12)
            if (r13 != r0) goto Lc0
            goto Ld2
        Lc0:
            O3.C r13 = O3.C.a
            return r13
        Lc3:
            r13 = move-exception
            r12.L$0 = r13
            r12.L$1 = r6
            r12.label = r2
            H5.n0 r1 = (H5.n0) r1
            java.lang.Object r1 = r1.m(r12)
            if (r1 != r0) goto Ld3
        Ld2:
            return r0
        Ld3:
            r0 = r13
        Ld4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt$reader$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
