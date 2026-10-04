package io.ktor.websocket;

import A3.d;
import H5.A;
import H5.C0263e0;
import H5.C0284z;
import H5.D;
import H5.InterfaceC0265f0;
import H5.h0;
import H5.n0;
import J5.i;
import J5.v;
import O3.C;
import P3.F;
import P3.r;
import S3.c;
import S3.f;
import U3.e;
import U3.j;
import e4.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a[\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"LH5/A;", "LJ5/v;", "Lio/ktor/websocket/Frame$Pong;", "outgoing", "Lio/ktor/websocket/Frame$Ping;", "ponger", "(LH5/A;LJ5/v;)LJ5/v;", "Lio/ktor/websocket/Frame;", "", "periodMillis", "timeoutMillis", "Lkotlin/Function2;", "Lio/ktor/websocket/CloseReason;", "LS3/c;", "LO3/C;", "", "onTimeout", "pinger", "(LH5/A;LJ5/v;JJLe4/n;)LJ5/v;", "LH5/z;", "PongerCoroutineName", "LH5/z;", "PingerCoroutineName", "ktor-websockets"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PingPongKt {
    private static final C0284z PongerCoroutineName = new C0284z("ws-ponger");
    private static final C0284z PingerCoroutineName = new C0284z("ws-pinger");

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.websocket.PingPongKt$pinger$1", f = "PingPong.kt", l = {66, 75, 97}, m = "invokeSuspend")
    /* renamed from: io.ktor.websocket.PingPongKt$pinger$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        final /* synthetic */ i $channel;
        final /* synthetic */ n $onTimeout;
        final /* synthetic */ v $outgoing;
        final /* synthetic */ long $periodMillis;
        final /* synthetic */ long $timeoutMillis;
        Object L$0;
        Object L$1;
        int label;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
        @e(c = "io.ktor.websocket.PingPongKt$pinger$1$1", f = "PingPong.kt", l = {68}, m = "invokeSuspend")
        /* renamed from: io.ktor.websocket.PingPongKt$pinger$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00051 extends j implements n {
            final /* synthetic */ i $channel;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00051(i iVar, c<? super C00051> cVar) {
                super(2, cVar);
                this.$channel = iVar;
            }

            @Override // U3.a
            public final c<C> create(Object obj, c<?> cVar) {
                return new C00051(this.$channel, cVar);
            }

            @Override // e4.n
            public final Object invoke(A a, c<? super C> cVar) {
                return ((C00051) create(a, cVar)).invokeSuspend(C.a);
            }

            @Override // U3.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                i iVar;
                T3.a aVar = T3.a.f9048k;
                int i7 = this.label;
                if (i7 != 0 && i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
                do {
                    iVar = this.$channel;
                    this.label = 1;
                } while (iVar.receive(this) != aVar);
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j7, long j8, n nVar, i iVar, v vVar, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$periodMillis = j7;
            this.$timeoutMillis = j8;
            this.$onTimeout = nVar;
            this.$channel = iVar;
            this.$outgoing = vVar;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.$periodMillis, this.$timeoutMillis, this.$onTimeout, this.$channel, this.$outgoing, cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, c<? super C> cVar) {
            return ((AnonymousClass1) create(a, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00fe, code lost:
        
            if (r13.invoke(r1, r12) == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00dc A[Catch: p | q | ClosedByteChannelException | CancellationException -> 0x0103, p | q | ClosedByteChannelException | CancellationException -> 0x0103, p | q | ClosedByteChannelException | CancellationException -> 0x0103, p | q | ClosedByteChannelException | CancellationException -> 0x0103, PHI: r1 r6 r13
          0x00dc: PHI (r1v10 byte[]) = (r1v8 byte[]), (r1v16 byte[]) binds: [B:28:0x00d9, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]
          0x00dc: PHI (r6v12 i4.f) = (r6v17 i4.f), (r6v18 i4.f) binds: [B:28:0x00d9, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]
          0x00dc: PHI (r13v9 java.lang.Object) = (r13v7 java.lang.Object), (r13v0 java.lang.Object) binds: [B:28:0x00d9, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {p | q | ClosedByteChannelException | CancellationException -> 0x0103, blocks: (B:7:0x0010, B:12:0x0025, B:12:0x0025, B:12:0x0025, B:12:0x0025, B:30:0x00dc, B:30:0x00dc, B:30:0x00dc, B:30:0x00dc, B:32:0x00e0, B:32:0x00e0, B:32:0x00e0, B:32:0x00e0, B:23:0x0090, B:23:0x0090, B:23:0x0090, B:23:0x0090, B:27:0x00a7, B:27:0x00a7, B:27:0x00a7, B:27:0x00a7, B:15:0x0032, B:15:0x0032, B:15:0x0032, B:15:0x0032), top: B:41:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00e0 A[Catch: p | q | ClosedByteChannelException | CancellationException -> 0x0103, p | q | ClosedByteChannelException | CancellationException -> 0x0103, p | q | ClosedByteChannelException | CancellationException -> 0x0103, p | q | ClosedByteChannelException | CancellationException -> 0x0103, TRY_LEAVE, TryCatch #0 {p | q | ClosedByteChannelException | CancellationException -> 0x0103, blocks: (B:7:0x0010, B:12:0x0025, B:12:0x0025, B:12:0x0025, B:12:0x0025, B:30:0x00dc, B:30:0x00dc, B:30:0x00dc, B:30:0x00dc, B:32:0x00e0, B:32:0x00e0, B:32:0x00e0, B:32:0x00e0, B:23:0x0090, B:23:0x0090, B:23:0x0090, B:23:0x0090, B:27:0x00a7, B:27:0x00a7, B:27:0x00a7, B:27:0x00a7, B:15:0x0032, B:15:0x0032, B:15:0x0032, B:15:0x0032), top: B:41:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
        /* JADX WARN: Type inference failed for: r6v14, types: [i4.e] */
        /* JADX WARN: Type inference failed for: r6v16, types: [i4.e] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d9 -> B:30:0x00dc). Please report as a decompilation issue!!! */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 270
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.PingPongKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.websocket.PingPongKt$ponger$1", f = "PingPong.kt", l = {119, 33}, m = "invokeSuspend")
    /* renamed from: io.ktor.websocket.PingPongKt$ponger$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12881 extends j implements n {
        final /* synthetic */ i $channel;
        final /* synthetic */ v $outgoing;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12881(i iVar, v vVar, c<? super C12881> cVar) {
            super(2, cVar);
            this.$channel = iVar;
            this.$outgoing = vVar;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            return new C12881(this.$channel, this.$outgoing, cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, c<? super C> cVar) {
            return ((C12881) create(a, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
        
            if (r5.send(r7, r10) == r0) goto L27;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #2 {all -> 0x001d, blocks: (B:7:0x0018, B:19:0x0042, B:23:0x0054, B:25:0x005d, B:14:0x0033, B:18:0x003e), top: B:39:0x0006, outer: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[Catch: q -> 0x008e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {q -> 0x008e, blocks: (B:28:0x0084, B:32:0x008a, B:33:0x008d, B:17:0x003a, B:30:0x0088, B:7:0x0018, B:19:0x0042, B:23:0x0054, B:25:0x005d, B:14:0x0033, B:18:0x003e), top: B:39:0x0006, inners: #0, #2 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0081 -> B:8:0x001b). Please report as a decompilation issue!!! */
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
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L37
                if (r1 == r2) goto L27
                if (r1 != r3) goto L1f
                java.lang.Object r1 = r10.L$2
                J5.d r1 = (J5.d) r1
                java.lang.Object r4 = r10.L$1
                J5.u r4 = (J5.u) r4
                java.lang.Object r5 = r10.L$0
                J5.v r5 = (J5.v) r5
                P3.r.Y(r11)     // Catch: java.lang.Throwable -> L1d
            L1b:
                r11 = r5
                goto L42
            L1d:
                r11 = move-exception
                goto L88
            L1f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L27:
                java.lang.Object r1 = r10.L$2
                J5.d r1 = (J5.d) r1
                java.lang.Object r4 = r10.L$1
                J5.u r4 = (J5.u) r4
                java.lang.Object r5 = r10.L$0
                J5.v r5 = (J5.v) r5
                P3.r.Y(r11)     // Catch: java.lang.Throwable -> L1d
                goto L54
            L37:
                P3.r.Y(r11)
                J5.i r4 = r10.$channel     // Catch: J5.q -> L8e
                J5.v r11 = r10.$outgoing     // Catch: J5.q -> L8e
                J5.d r1 = r4.iterator()     // Catch: java.lang.Throwable -> L1d
            L42:
                r10.L$0 = r11     // Catch: java.lang.Throwable -> L1d
                r10.L$1 = r4     // Catch: java.lang.Throwable -> L1d
                r10.L$2 = r1     // Catch: java.lang.Throwable -> L1d
                r10.label = r2     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r5 = r1.b(r10)     // Catch: java.lang.Throwable -> L1d
                if (r5 != r0) goto L51
                goto L83
            L51:
                r9 = r5
                r5 = r11
                r11 = r9
            L54:
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1d
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1d
                r6 = 0
                if (r11 == 0) goto L84
                java.lang.Object r11 = r1.c()     // Catch: java.lang.Throwable -> L1d
                io.ktor.websocket.Frame$Ping r11 = (io.ktor.websocket.Frame.Ping) r11     // Catch: java.lang.Throwable -> L1d
                z6.b r7 = io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER()     // Catch: java.lang.Throwable -> L1d
                java.lang.String r8 = "Received ping message, sending pong message"
                r7.e(r8)     // Catch: java.lang.Throwable -> L1d
                io.ktor.websocket.Frame$Pong r7 = new io.ktor.websocket.Frame$Pong     // Catch: java.lang.Throwable -> L1d
                byte[] r11 = r11.getData()     // Catch: java.lang.Throwable -> L1d
                r7.<init>(r11, r6, r3, r6)     // Catch: java.lang.Throwable -> L1d
                r10.L$0 = r5     // Catch: java.lang.Throwable -> L1d
                r10.L$1 = r4     // Catch: java.lang.Throwable -> L1d
                r10.L$2 = r1     // Catch: java.lang.Throwable -> L1d
                r10.label = r3     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r11 = r5.send(r7, r10)     // Catch: java.lang.Throwable -> L1d
                if (r11 != r0) goto L1b
            L83:
                return r0
            L84:
                r4.e(r6)     // Catch: J5.q -> L8e
                goto L8e
            L88:
                throw r11     // Catch: java.lang.Throwable -> L89
            L89:
                r0 = move-exception
                l4.AbstractC1420H.l(r4, r11)     // Catch: J5.q -> L8e
                throw r0     // Catch: J5.q -> L8e
            L8e:
                O3.C r11 = O3.C.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.PingPongKt.C12881.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final v pinger(A a, v vVar, long j7, long j8, n nVar) {
        l.f("<this>", a);
        l.f("outgoing", vVar);
        l.f("onTimeout", nVar);
        h0 h0VarD = D.d();
        J5.e eVarA = F.a(Integer.MAX_VALUE, 6, null);
        D.x(a, F.M(h0VarD, PingerCoroutineName), new AnonymousClass1(j7, j8, nVar, eVarA, vVar, null), 2);
        f fVar = a.getCoroutineContext().get(C0263e0.f3843k);
        l.c(fVar);
        ((InterfaceC0265f0) fVar).x(new d(23, h0VarD));
        return eVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C pinger$lambda$0(H5.r rVar, Throwable th) {
        ((n0) rVar).e(null);
        return C.a;
    }

    public static final v ponger(A a, v vVar) {
        l.f("<this>", a);
        l.f("outgoing", vVar);
        J5.e eVarA = F.a(5, 6, null);
        D.x(a, PongerCoroutineName, new C12881(eVarA, vVar, null), 2);
        return eVarA;
    }
}
