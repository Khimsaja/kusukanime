package io.ktor.websocket;

import H5.A;
import O3.C;
import S3.c;
import U3.e;
import U3.j;
import e4.n;
import io.github.jan.supabase.auth.PKCEConstants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.websocket.RawWebSocketCommon$writerJob$1", f = "RawWebSocketCommon.kt", l = {62, PKCEConstants.VERIFIER_LENGTH, 65, 84, 84, 84, 84}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class RawWebSocketCommon$writerJob$1 extends j implements n {
    Object L$0;
    int label;
    final /* synthetic */ RawWebSocketCommon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawWebSocketCommon$writerJob$1(RawWebSocketCommon rawWebSocketCommon, c<? super RawWebSocketCommon$writerJob$1> cVar) {
        super(2, cVar);
        this.this$0 = rawWebSocketCommon;
    }

    @Override // U3.a
    public final c<C> create(Object obj, c<?> cVar) {
        return new RawWebSocketCommon$writerJob$1(this.this$0, cVar);
    }

    @Override // e4.n
    public final Object invoke(A a, c<? super C> cVar) {
        return ((RawWebSocketCommon$writerJob$1) create(a, cVar)).invokeSuspend(C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
    
        if (r8.flushAndClose(r7) == r0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f3, code lost:
    
        if (r8.flushAndClose(r7) != r0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0123, code lost:
    
        if (r8.flushAndClose(r7) != r0) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[Catch: all -> 0x0026, ChannelWriteException -> 0x0029, TRY_ENTER, TryCatch #3 {ChannelWriteException -> 0x0029, all -> 0x0026, blocks: (B:9:0x0022, B:32:0x0080, B:20:0x0039, B:23:0x004c, B:25:0x0050, B:29:0x006d, B:38:0x00ad, B:40:0x00b1, B:41:0x00b7, B:42:0x00cd, B:34:0x0084, B:16:0x002e, B:17:0x0032), top: B:68:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c A[Catch: all -> 0x0026, ChannelWriteException -> 0x0029, PHI: r8
      0x004c: PHI (r8v24 java.lang.Object) = (r8v0 java.lang.Object), (r8v29 java.lang.Object) binds: [B:17:0x0032, B:21:0x0048] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {ChannelWriteException -> 0x0029, all -> 0x0026, blocks: (B:9:0x0022, B:32:0x0080, B:20:0x0039, B:23:0x004c, B:25:0x0050, B:29:0x006d, B:38:0x00ad, B:40:0x00b1, B:41:0x00b7, B:42:0x00cd, B:34:0x0084, B:16:0x002e, B:17:0x0032), top: B:68:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050 A[Catch: all -> 0x0026, ChannelWriteException -> 0x0029, TryCatch #3 {ChannelWriteException -> 0x0029, all -> 0x0026, blocks: (B:9:0x0022, B:32:0x0080, B:20:0x0039, B:23:0x004c, B:25:0x0050, B:29:0x006d, B:38:0x00ad, B:40:0x00b1, B:41:0x00b7, B:42:0x00cd, B:34:0x0084, B:16:0x002e, B:17:0x0032), top: B:68:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080 A[Catch: all -> 0x0026, ChannelWriteException -> 0x0029, PHI: r1
      0x0080: PHI (r1v24 java.lang.Object) = (r1v15 java.lang.Object), (r1v27 java.lang.Object) binds: [B:30:0x007c, B:9:0x0022] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {ChannelWriteException -> 0x0029, all -> 0x0026, blocks: (B:9:0x0022, B:32:0x0080, B:20:0x0039, B:23:0x004c, B:25:0x0050, B:29:0x006d, B:38:0x00ad, B:40:0x00b1, B:41:0x00b7, B:42:0x00cd, B:34:0x0084, B:16:0x002e, B:17:0x0032), top: B:68:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084 A[Catch: all -> 0x0026, ChannelWriteException -> 0x0029, TRY_LEAVE, TryCatch #3 {ChannelWriteException -> 0x0029, all -> 0x0026, blocks: (B:9:0x0022, B:32:0x0080, B:20:0x0039, B:23:0x004c, B:25:0x0050, B:29:0x006d, B:38:0x00ad, B:40:0x00b1, B:41:0x00b7, B:42:0x00cd, B:34:0x0084, B:16:0x002e, B:17:0x0032), top: B:68:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad A[Catch: all -> 0x0026, ChannelWriteException -> 0x0029, TRY_ENTER, TryCatch #3 {ChannelWriteException -> 0x0029, all -> 0x0026, blocks: (B:9:0x0022, B:32:0x0080, B:20:0x0039, B:23:0x004c, B:25:0x0050, B:29:0x006d, B:38:0x00ad, B:40:0x00b1, B:41:0x00b7, B:42:0x00cd, B:34:0x0084, B:16:0x002e, B:17:0x0032), top: B:68:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x007c -> B:32:0x0080). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00b1 -> B:20:0x0039). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0126 -> B:53:0x0126). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.RawWebSocketCommon$writerJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
