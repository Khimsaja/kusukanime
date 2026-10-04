package io.ktor.network.sockets;

import J5.t;
import O3.C;
import S3.c;
import U3.e;
import U3.j;
import e4.n;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJ5/t;", "Lio/ktor/network/sockets/Datagram;", "LO3/C;", "<anonymous>", "(LJ5/t;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.network.sockets.DatagramSocketImpl$receiver$1", f = "DatagramSocketImpl.kt", l = {52, 52}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DatagramSocketImpl$receiver$1 extends j implements n {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DatagramSocketImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatagramSocketImpl$receiver$1(DatagramSocketImpl datagramSocketImpl, c<? super DatagramSocketImpl$receiver$1> cVar) {
        super(2, cVar);
        this.this$0 = datagramSocketImpl;
    }

    @Override // U3.a
    public final c<C> create(Object obj, c<?> cVar) {
        DatagramSocketImpl$receiver$1 datagramSocketImpl$receiver$1 = new DatagramSocketImpl$receiver$1(this.this$0, cVar);
        datagramSocketImpl$receiver$1.L$0 = obj;
        return datagramSocketImpl$receiver$1;
    }

    @Override // e4.n
    public final Object invoke(t tVar, c<? super C> cVar) {
        return ((DatagramSocketImpl$receiver$1) create(tVar, cVar)).invokeSuspend(C.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0056 -> B:15:0x0030). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L29
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r7.L$0
            J5.t r1 = (J5.t) r1
            P3.r.Y(r8)     // Catch: java.lang.Throwable -> L58
            r8 = r1
            goto L30
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            java.lang.Object r1 = r7.L$1
            J5.v r1 = (J5.v) r1
            java.lang.Object r4 = r7.L$0
            J5.t r4 = (J5.t) r4
            P3.r.Y(r8)     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
            goto L48
        L29:
            P3.r.Y(r8)
            java.lang.Object r8 = r7.L$0
            J5.t r8 = (J5.t) r8
        L30:
            r1 = r8
            J5.s r1 = (J5.s) r1     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
            r1.getClass()     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
            io.ktor.network.sockets.DatagramSocketImpl r4 = r7.this$0     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
            r7.L$0 = r8     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
            r7.L$1 = r1     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
            r7.label = r3     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
            java.lang.Object r4 = io.ktor.network.sockets.DatagramSocketImpl.access$receiveImpl(r4, r7)     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
            if (r4 != r0) goto L45
            goto L55
        L45:
            r6 = r4
            r4 = r8
            r8 = r6
        L48:
            r7.L$0 = r4     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
            r5 = 0
            r7.L$1 = r5     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
            r7.label = r2     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
            java.lang.Object r8 = r1.send(r8, r7)     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
            if (r8 != r0) goto L56
        L55:
            return r0
        L56:
            r8 = r4
            goto L30
        L58:
            O3.C r8 = O3.C.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.DatagramSocketImpl$receiver$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
