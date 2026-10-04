package io.ktor.http.content;

import O3.C;
import U3.j;
import e4.n;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.WriterScope;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "LO3/C;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 1, 0})
@U3.e(c = "io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1", f = "OutgoingContent.kt", l = {119, 121}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OutgoingContent$ReadChannelContent$readFrom$1 extends j implements n {
    final /* synthetic */ k4.j $range;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OutgoingContent.ReadChannelContent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutgoingContent$ReadChannelContent$readFrom$1(OutgoingContent.ReadChannelContent readChannelContent, k4.j jVar, S3.c<? super OutgoingContent$ReadChannelContent$readFrom$1> cVar) {
        super(2, cVar);
        this.this$0 = readChannelContent;
        this.$range = jVar;
    }

    @Override // U3.a
    public final S3.c<C> create(Object obj, S3.c<?> cVar) {
        OutgoingContent$ReadChannelContent$readFrom$1 outgoingContent$ReadChannelContent$readFrom$1 = new OutgoingContent$ReadChannelContent$readFrom$1(this.this$0, this.$range, cVar);
        outgoingContent$ReadChannelContent$readFrom$1.L$0 = obj;
        return outgoingContent$ReadChannelContent$readFrom$1;
    }

    @Override // e4.n
    public final Object invoke(WriterScope writerScope, S3.c<? super C> cVar) {
        return ((OutgoingContent$ReadChannelContent$readFrom$1) create(writerScope, cVar)).invokeSuspend(C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (io.ktor.utils.io.ByteReadChannelOperationsKt.copyTo(r1, r9, r4, r8) == r0) goto L16;
     */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            P3.r.Y(r9)
            goto L5f
        L10:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L18:
            java.lang.Object r1 = r8.L$1
            io.ktor.utils.io.ByteReadChannel r1 = (io.ktor.utils.io.ByteReadChannel) r1
            java.lang.Object r3 = r8.L$0
            io.ktor.utils.io.WriterScope r3 = (io.ktor.utils.io.WriterScope) r3
            P3.r.Y(r9)
            goto L43
        L24:
            P3.r.Y(r9)
            java.lang.Object r9 = r8.L$0
            io.ktor.utils.io.WriterScope r9 = (io.ktor.utils.io.WriterScope) r9
            io.ktor.http.content.OutgoingContent$ReadChannelContent r1 = r8.this$0
            io.ktor.utils.io.ByteReadChannel r1 = r1.readFrom()
            k4.j r4 = r8.$range
            long r4 = r4.f12680k
            r8.L$0 = r9
            r8.L$1 = r1
            r8.label = r3
            java.lang.Object r3 = io.ktor.utils.io.ByteReadChannelOperationsKt.discard(r1, r4, r8)
            if (r3 != r0) goto L42
            goto L5e
        L42:
            r3 = r9
        L43:
            k4.j r9 = r8.$range
            long r4 = r9.f12681l
            long r6 = r9.f12680k
            long r4 = r4 - r6
            r6 = 1
            long r4 = r4 + r6
            io.ktor.utils.io.ByteWriteChannel r9 = r3.getChannel()
            r3 = 0
            r8.L$0 = r3
            r8.L$1 = r3
            r8.label = r2
            java.lang.Object r9 = io.ktor.utils.io.ByteReadChannelOperationsKt.copyTo(r1, r9, r4, r8)
            if (r9 != r0) goto L5f
        L5e:
            return r0
        L5f:
            O3.C r9 = O3.C.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
