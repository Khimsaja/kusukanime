package io.ktor.client.engine.okhttp;

import O3.C;
import S3.c;
import U3.e;
import U3.j;
import e4.n;
import f6.C0890D;
import io.github.jan.supabase.auth.PKCEConstants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJ5/b;", "Lio/ktor/websocket/Frame;", "LO3/C;", "<anonymous>", "(LJ5/b;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.client.engine.okhttp.OkHttpWebsocketSession$outgoing$1", f = "OkHttpWebsocketSession.kt", l = {PKCEConstants.VERIFIER_LENGTH, 68}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OkHttpWebsocketSession$outgoing$1 extends j implements n {
    final /* synthetic */ C0890D $engineRequest;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ OkHttpWebsocketSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttpWebsocketSession$outgoing$1(OkHttpWebsocketSession okHttpWebsocketSession, C0890D c0890d, c<? super OkHttpWebsocketSession$outgoing$1> cVar) {
        super(2, cVar);
        this.this$0 = okHttpWebsocketSession;
        this.$engineRequest = c0890d;
    }

    @Override // U3.a
    public final c<C> create(Object obj, c<?> cVar) {
        OkHttpWebsocketSession$outgoing$1 okHttpWebsocketSession$outgoing$1 = new OkHttpWebsocketSession$outgoing$1(this.this$0, this.$engineRequest, cVar);
        okHttpWebsocketSession$outgoing$1.L$0 = obj;
        return okHttpWebsocketSession$outgoing$1;
    }

    @Override // e4.n
    public final Object invoke(J5.b bVar, c<? super C> cVar) {
        return ((OkHttpWebsocketSession$outgoing$1) create(bVar, cVar)).invokeSuspend(C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (r14 == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x018b, code lost:
    
        if (r14 != r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018d, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x018b -> B:49:0x018e). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.okhttp.OkHttpWebsocketSession$outgoing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
