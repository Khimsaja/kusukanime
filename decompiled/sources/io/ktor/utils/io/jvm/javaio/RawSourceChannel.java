package io.ktor.utils.io.jvm.javaio;

import H5.A;
import H5.C0263e0;
import H5.C0284z;
import H5.D;
import H5.InterfaceC0265f0;
import H5.h0;
import H5.r;
import O3.C;
import S3.h;
import S5.a;
import S5.f;
import U3.c;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.CloseToken;
import io.ktor.utils.io.InternalAPI;
import io.ktor.utils.io.core.ByteReadPacketKt;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010!R\u001a\u0010'\u001a\u00020\"8VX\u0097\u0004¢\u0006\f\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u0016\u0010*\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/RawSourceChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "LS5/f;", "source", "LS3/h;", "parent", "<init>", "(LS5/f;LS3/h;)V", "", "min", "", "awaitContent", "(ILS3/c;)Ljava/lang/Object;", "", "cause", "LO3/C;", "cancel", "(Ljava/lang/Throwable;)V", "LS5/f;", "LS3/h;", "Lio/ktor/utils/io/CloseToken;", "closedToken", "Lio/ktor/utils/io/CloseToken;", "LS5/a;", "buffer", "LS5/a;", "LH5/r;", "job", "LH5/r;", "getJob", "()LH5/r;", "coroutineContext", "getCoroutineContext", "()LS3/h;", "LS5/n;", "getReadBuffer", "()LS5/n;", "getReadBuffer$annotations", "()V", "readBuffer", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "isClosedForRead", "()Z", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RawSourceChannel implements ByteReadChannel {
    private final a buffer;
    private CloseToken closedToken;
    private final h coroutineContext;
    private final r job;
    private final h parent;
    private final f source;

    @e(c = "io.ktor.utils.io.jvm.javaio.RawSourceChannel", f = "Reading.kt", l = {69}, m = "awaitContent")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int I$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RawSourceChannel.this.awaitContent(0, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2", f = "Reading.kt", l = {}, m = "invokeSuspend")
    /* renamed from: io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements n {
        final /* synthetic */ int $min;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i7, S3.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$min = i7;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            return RawSourceChannel.this.new AnonymousClass2(this.$min, cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, S3.c<? super C> cVar) {
            return ((AnonymousClass2) create(a, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Exception {
            T3.a aVar = T3.a.f9048k;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
            long atMostTo = 0;
            while (ByteReadPacketKt.getRemaining(RawSourceChannel.this.buffer) < this.$min && atMostTo >= 0) {
                try {
                    atMostTo = RawSourceChannel.this.source.readAtMostTo(RawSourceChannel.this.buffer, Long.MAX_VALUE);
                } catch (EOFException unused) {
                    atMostTo = -1;
                }
            }
            if (atMostTo == -1) {
                RawSourceChannel.this.source.close();
                ((h0) RawSourceChannel.this.getJob()).Z();
                RawSourceChannel.this.closedToken = new CloseToken(null);
            }
            return C.a;
        }
    }

    public RawSourceChannel(f fVar, h hVar) {
        l.f("source", fVar);
        l.f("parent", hVar);
        this.source = fVar;
        this.parent = hVar;
        this.buffer = new a();
        h0 h0Var = new h0((InterfaceC0265f0) hVar.get(C0263e0.f3843k));
        this.job = h0Var;
        this.coroutineContext = hVar.plus(h0Var).plus(new C0284z("RawSourceChannel"));
    }

    @InternalAPI
    public static /* synthetic */ void getReadBuffer$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.ByteReadChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitContent(int r6, S3.c<? super java.lang.Boolean> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.jvm.javaio.RawSourceChannel.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1 r0 = (io.ktor.utils.io.jvm.javaio.RawSourceChannel.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1 r0 = new io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            int r6 = r0.I$0
            P3.r.Y(r7)
            goto L4e
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            P3.r.Y(r7)
            io.ktor.utils.io.CloseToken r7 = r5.closedToken
            if (r7 == 0) goto L3b
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L3b:
            S3.h r7 = r5.coroutineContext
            io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2 r2 = new io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2
            r4 = 0
            r2.<init>(r6, r4)
            r0.I$0 = r6
            r0.label = r3
            java.lang.Object r7 = H5.D.G(r7, r2, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            S5.a r7 = r5.buffer
            long r0 = io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(r7)
            long r6 = (long) r6
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L5a
            goto L5b
        L5a:
            r3 = 0
        L5b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.RawSourceChannel.awaitContent(int, S3.c):java.lang.Object");
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public void cancel(Throwable cause) throws Exception {
        String message;
        String message2;
        if (this.closedToken != null) {
            return;
        }
        r rVar = this.job;
        String str = "Channel was cancelled";
        if (cause == null || (message = cause.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        D.i(rVar, message, cause);
        this.source.close();
        if (cause != null && (message2 = cause.getMessage()) != null) {
            str = message2;
        }
        this.closedToken = new CloseToken(new IOException(str, cause));
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public Throwable getClosedCause() {
        CloseToken closeToken = this.closedToken;
        if (closeToken != null) {
            return CloseToken.wrapCause$default(closeToken, null, 1, null);
        }
        return null;
    }

    public final h getCoroutineContext() {
        return this.coroutineContext;
    }

    public final r getJob() {
        return this.job;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public S5.n getReadBuffer() {
        return this.buffer;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public boolean isClosedForRead() {
        return this.closedToken != null && this.buffer.z();
    }
}
