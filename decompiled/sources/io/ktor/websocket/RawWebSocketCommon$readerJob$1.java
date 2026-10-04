package io.ktor.websocket;

import H5.A;
import O3.C;
import S3.c;
import U3.e;
import U3.j;
import e4.n;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.websocket.RawWebSocketCommon$readerJob$1", f = "RawWebSocketCommon.kt", l = {98, 102, 105, 109}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class RawWebSocketCommon$readerJob$1 extends j implements n {
    Object L$0;
    int label;
    final /* synthetic */ RawWebSocketCommon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawWebSocketCommon$readerJob$1(RawWebSocketCommon rawWebSocketCommon, c<? super RawWebSocketCommon$readerJob$1> cVar) {
        super(2, cVar);
        this.this$0 = rawWebSocketCommon;
    }

    @Override // U3.a
    public final c<C> create(Object obj, c<?> cVar) {
        return new RawWebSocketCommon$readerJob$1(this.this$0, cVar);
    }

    @Override // e4.n
    public final Object invoke(A a, c<? super C> cVar) {
        return ((RawWebSocketCommon$readerJob$1) create(a, cVar)).invokeSuspend(C.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061 A[Catch: all -> 0x0034, CancellationException -> 0x0036, ProtocolViolationException -> 0x0038, FrameTooBigException -> 0x003b, p | EOFException -> 0x009b, p | EOFException -> 0x009b, PHI: r10
      0x0061: PHI (r10v13 java.lang.Object) = (r10v18 java.lang.Object), (r10v0 java.lang.Object) binds: [B:31:0x005d, B:27:0x003e] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {p | EOFException -> 0x009b, blocks: (B:18:0x0030, B:30:0x0045, B:30:0x0045, B:33:0x0061, B:33:0x0061, B:35:0x006d, B:35:0x006d, B:39:0x007f, B:39:0x007f, B:38:0x0077, B:38:0x0077, B:40:0x0082, B:40:0x0082, B:27:0x003e), top: B:63:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d A[Catch: all -> 0x0034, CancellationException -> 0x0036, ProtocolViolationException -> 0x0038, FrameTooBigException -> 0x003b, p | EOFException -> 0x009b, p | EOFException -> 0x009b, TryCatch #1 {p | EOFException -> 0x009b, blocks: (B:18:0x0030, B:30:0x0045, B:30:0x0045, B:33:0x0061, B:33:0x0061, B:35:0x006d, B:35:0x006d, B:39:0x007f, B:39:0x007f, B:38:0x0077, B:38:0x0077, B:40:0x0082, B:40:0x0082, B:27:0x003e), top: B:63:0x0009 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x008e -> B:30:0x0045). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.RawWebSocketCommon$readerJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
