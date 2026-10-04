package io.ktor.websocket;

import H5.A;
import J5.i;
import J5.v;
import O3.C;
import S3.c;
import U3.e;
import U3.j;
import e4.n;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.websocket.PingPongKt$pinger$1$rc$1", f = "PingPong.kt", l = {77, 81}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PingPongKt$pinger$1$rc$1 extends j implements n {
    final /* synthetic */ i $channel;
    final /* synthetic */ v $outgoing;
    final /* synthetic */ String $pingMessage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PingPongKt$pinger$1$rc$1(v vVar, String str, i iVar, c<? super PingPongKt$pinger$1$rc$1> cVar) {
        super(2, cVar);
        this.$outgoing = vVar;
        this.$pingMessage = str;
        this.$channel = iVar;
    }

    @Override // U3.a
    public final c<C> create(Object obj, c<?> cVar) {
        return new PingPongKt$pinger$1$rc$1(this.$outgoing, this.$pingMessage, this.$channel, cVar);
    }

    @Override // e4.n
    public final Object invoke(A a, c<? super C> cVar) {
        return ((PingPongKt$pinger$1$rc$1) create(a, cVar)).invokeSuspend(C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r7 == r0) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0048 -> B:16:0x004b). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            P3.r.Y(r7)
            goto L4b
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            P3.r.Y(r7)
            goto L40
        L1c:
            P3.r.Y(r7)
            z6.b r7 = io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER()
            java.lang.String r1 = "WebSocket Pinger: sending ping frame"
            r7.e(r1)
            J5.v r7 = r6.$outgoing
            io.ktor.websocket.Frame$Ping r1 = new io.ktor.websocket.Frame$Ping
            java.lang.String r4 = r6.$pingMessage
            java.nio.charset.Charset r5 = z5.C2496a.f19037c
            byte[] r4 = io.ktor.utils.io.core.StringsKt.toByteArray(r4, r5)
            r1.<init>(r4)
            r6.label = r3
            java.lang.Object r7 = r7.send(r1, r6)
            if (r7 != r0) goto L40
            goto L4a
        L40:
            J5.i r7 = r6.$channel
            r6.label = r2
            java.lang.Object r7 = r7.receive(r6)
            if (r7 != r0) goto L4b
        L4a:
            return r0
        L4b:
            io.ktor.websocket.Frame$Pong r7 = (io.ktor.websocket.Frame.Pong) r7
            byte[] r1 = r7.getData()
            byte[] r3 = r7.getData()
            int r3 = r3.length
            r4 = 0
            java.lang.String r1 = z5.AbstractC2517v.J(r1, r4, r3)
            java.lang.String r3 = r6.$pingMessage
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L7b
            z6.b r0 = io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "WebSocket Pinger: received valid pong frame "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.e(r7)
            O3.C r7 = O3.C.a
            return r7
        L7b:
            z6.b r1 = io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "WebSocket Pinger: received invalid pong frame "
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r7 = ", continue waiting"
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r1.e(r7)
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.PingPongKt$pinger$1$rc$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
