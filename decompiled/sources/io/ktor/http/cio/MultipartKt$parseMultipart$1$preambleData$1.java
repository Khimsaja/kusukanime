package io.ktor.http.cio;

import O3.C;
import S3.c;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.utils.io.CountedByteReadChannel;
import io.ktor.utils.io.WriterScope;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "LO3/C;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.http.cio.MultipartKt$parseMultipart$1$preambleData$1", f = "Multipart.kt", l = {206, 207}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class MultipartKt$parseMultipart$1$preambleData$1 extends j implements n {
    final /* synthetic */ CountedByteReadChannel $countedInput;
    final /* synthetic */ T5.a $firstBoundary;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartKt$parseMultipart$1$preambleData$1(T5.a aVar, CountedByteReadChannel countedByteReadChannel, c<? super MultipartKt$parseMultipart$1$preambleData$1> cVar) {
        super(2, cVar);
        this.$firstBoundary = aVar;
        this.$countedInput = countedByteReadChannel;
    }

    @Override // U3.a
    public final c<C> create(Object obj, c<?> cVar) {
        MultipartKt$parseMultipart$1$preambleData$1 multipartKt$parseMultipart$1$preambleData$1 = new MultipartKt$parseMultipart$1$preambleData$1(this.$firstBoundary, this.$countedInput, cVar);
        multipartKt$parseMultipart$1$preambleData$1.L$0 = obj;
        return multipartKt$parseMultipart$1$preambleData$1;
    }

    @Override // e4.n
    public final Object invoke(WriterScope writerScope, c<? super C> cVar) {
        return ((MultipartKt$parseMultipart$1$preambleData$1) create(writerScope, cVar)).invokeSuspend(C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r11.flushAndClose(r10) == r0) goto L15;
     */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            P3.r.Y(r11)
            r9 = r10
            goto L50
        L11:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L19:
            java.lang.Object r1 = r10.L$0
            io.ktor.utils.io.WriterScope r1 = (io.ktor.utils.io.WriterScope) r1
            P3.r.Y(r11)
            r9 = r10
            goto L40
        L22:
            P3.r.Y(r11)
            java.lang.Object r11 = r10.L$0
            r1 = r11
            io.ktor.utils.io.WriterScope r1 = (io.ktor.utils.io.WriterScope) r1
            T5.a r4 = r10.$firstBoundary
            io.ktor.utils.io.CountedByteReadChannel r5 = r10.$countedInput
            io.ktor.utils.io.ByteWriteChannel r6 = r1.getChannel()
            r10.L$0 = r1
            r10.label = r3
            r7 = 8193(0x2001, double:4.048E-320)
            r9 = r10
            java.lang.Object r11 = io.ktor.http.cio.MultipartKt.access$parsePreambleImpl(r4, r5, r6, r7, r9)
            if (r11 != r0) goto L40
            goto L4f
        L40:
            io.ktor.utils.io.ByteWriteChannel r11 = r1.getChannel()
            r1 = 0
            r9.L$0 = r1
            r9.label = r2
            java.lang.Object r11 = r11.flushAndClose(r10)
            if (r11 != r0) goto L50
        L4f:
            return r0
        L50:
            O3.C r11 = O3.C.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.MultipartKt$parseMultipart$1$preambleData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
