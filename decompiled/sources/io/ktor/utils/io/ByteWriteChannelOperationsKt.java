package io.ktor.utils.io;

import H5.A;
import H5.D;
import H5.N;
import H5.u0;
import O3.C;
import O3.InterfaceC0554c;
import P3.r;
import S3.c;
import S3.h;
import S3.i;
import S5.f;
import S5.m;
import S5.n;
import U3.e;
import e4.InterfaceC0821a;
import e4.k;
import e4.o;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;
import l4.AbstractC1420H;

@Metadata(d1 = {"\u0000Ó\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0007*\u0001X\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a\u001c\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0010\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0017\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u001b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001c\u0010\u001e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b\u001e\u0010\u001f\u001a0\u0010\"\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00152\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\tH\u0086@¢\u0006\u0004\b\"\u0010#\u001a\u001c\u0010%\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u001a\u001a\u00020$H\u0086@¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010'\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b'\u0010\u001f\u001a\u001c\u0010*\u001a\u00020\u0003*\u00020\u00002\u0006\u0010)\u001a\u00020(H\u0086@¢\u0006\u0004\b*\u0010+\u001a\u001c\u0010*\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b*\u0010\u001c\u001a\u001b\u0010.\u001a\u00020\u0003*\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/\u001a\u0014\u00101\u001a\u00020\u0003*\u000200H\u0086@¢\u0006\u0004\b1\u00102\u001a\u0015\u00105\u001a\u000603j\u0002`4*\u000200¢\u0006\u0004\b5\u00106\u001a'\u0010:\u001a\u000209*\u0002002\u0014\u00108\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020\u000307¢\u0006\u0004\b:\u0010;\u001a!\u0010:\u001a\u00020\u0003*\u0002002\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00030<H\u0007¢\u0006\u0004\b:\u0010=\u001a\u0011\u0010>\u001a\u00020\u0003*\u000200¢\u0006\u0004\b>\u0010?\u001aI\u0010J\u001a\u00020I*\u00020@2\b\b\u0002\u0010B\u001a\u00020A2\b\b\u0002\u0010D\u001a\u00020C2\"\u00108\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030G\u0012\u0006\u0012\u0004\u0018\u00010H0E¢\u0006\u0004\bJ\u0010K\u001aG\u0010J\u001a\u00020I*\u00020@2\b\b\u0002\u0010B\u001a\u00020A2\u0006\u0010M\u001a\u00020L2\"\u00108\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030G\u0012\u0006\u0012\u0004\u0018\u00010H0E¢\u0006\u0004\bJ\u0010N\u001a>\u0010Q\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010O\u001a\u00020\t2\u001e\u00108\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0PH\u0086@¢\u0006\u0004\bQ\u0010R\u001a\u0014\u0010S\u001a\u00020\u0003*\u00020\u0000H\u0086@¢\u0006\u0004\bS\u0010T\u001a/\u0010V\u001a\u00020\u0003\"\u0004\b\u0000\u0010U*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000G\u0012\u0006\u0012\u0004\u0018\u00010H07H\u0000¢\u0006\u0004\bV\u0010W\"\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z\"\u0015\u0010[\u001a\u00020C*\u0002008F¢\u0006\u0006\u001a\u0004\b[\u0010\\\"\u0015\u0010]\u001a\u00020C*\u0002008F¢\u0006\u0006\u001a\u0004\b]\u0010\\¨\u0006^"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "", "value", "LO3/C;", "writeByte", "(Lio/ktor/utils/io/ByteWriteChannel;BLS3/c;)Ljava/lang/Object;", "", "writeShort", "(Lio/ktor/utils/io/ByteWriteChannel;SLS3/c;)Ljava/lang/Object;", "", "writeInt", "(Lio/ktor/utils/io/ByteWriteChannel;ILS3/c;)Ljava/lang/Object;", "", "writeFloat", "(Lio/ktor/utils/io/ByteWriteChannel;FLS3/c;)Ljava/lang/Object;", "", "writeDouble", "(Lio/ktor/utils/io/ByteWriteChannel;DLS3/c;)Ljava/lang/Object;", "", "writeLong", "(Lio/ktor/utils/io/ByteWriteChannel;JLS3/c;)Ljava/lang/Object;", "", "array", "writeByteArray", "(Lio/ktor/utils/io/ByteWriteChannel;[BLS3/c;)Ljava/lang/Object;", "LS5/n;", "source", "writeSource", "(Lio/ktor/utils/io/ByteWriteChannel;LS5/n;LS3/c;)Ljava/lang/Object;", "", "writeString", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/lang/String;LS3/c;)Ljava/lang/Object;", "startIndex", "endIndex", "writeFully", "(Lio/ktor/utils/io/ByteWriteChannel;[BIILS3/c;)Ljava/lang/Object;", "LS5/f;", "writeBuffer", "(Lio/ktor/utils/io/ByteWriteChannel;LS5/f;LS3/c;)Ljava/lang/Object;", "writeStringUtf8", "LS5/a;", "copy", "writePacket", "(Lio/ktor/utils/io/ByteWriteChannel;LS5/a;LS3/c;)Ljava/lang/Object;", "", "cause", "close", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/lang/Throwable;)V", "Lio/ktor/utils/io/ChannelJob;", "join", "(Lio/ktor/utils/io/ChannelJob;LS3/c;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lio/ktor/utils/io/CancellationException;", "getCancellationException", "(Lio/ktor/utils/io/ChannelJob;)Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "block", "LH5/N;", "invokeOnCompletion", "(Lio/ktor/utils/io/ChannelJob;Le4/k;)LH5/N;", "Lkotlin/Function0;", "(Lio/ktor/utils/io/ChannelJob;Le4/a;)V", "cancel", "(Lio/ktor/utils/io/ChannelJob;)V", "LH5/A;", "LS3/h;", "coroutineContext", "", "autoFlush", "Lkotlin/Function2;", "Lio/ktor/utils/io/WriterScope;", "LS3/c;", "", "Lio/ktor/utils/io/WriterJob;", "writer", "(LH5/A;LS3/h;ZLe4/n;)Lio/ktor/utils/io/WriterJob;", "Lio/ktor/utils/io/ByteChannel;", "channel", "(LH5/A;LS3/h;Lio/ktor/utils/io/ByteChannel;Le4/n;)Lio/ktor/utils/io/WriterJob;", "desiredSpace", "Lkotlin/Function3;", "write", "(Lio/ktor/utils/io/ByteWriteChannel;ILe4/o;LS3/c;)Ljava/lang/Object;", "awaitFreeSpace", "(Lio/ktor/utils/io/ByteWriteChannel;LS3/c;)Ljava/lang/Object;", "R", "fireAndForget", "(Le4/k;)V", "io/ktor/utils/io/ByteWriteChannelOperationsKt$NO_CALLBACK$1", "NO_CALLBACK", "Lio/ktor/utils/io/ByteWriteChannelOperationsKt$NO_CALLBACK$1;", "isCompleted", "(Lio/ktor/utils/io/ChannelJob;)Z", "isCancelled", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ByteWriteChannelOperationsKt {
    private static final ByteWriteChannelOperationsKt$NO_CALLBACK$1 NO_CALLBACK = new c<Object>() { // from class: io.ktor.utils.io.ByteWriteChannelOperationsKt$NO_CALLBACK$1
        private final h context = i.f8767k;

        @Override // S3.c
        public h getContext() {
            return this.context;
        }

        @Override // S3.c
        public void resumeWith(Object result) {
        }
    };

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteWriteChannelOperationsKt$close$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends j implements k {
        public AnonymousClass1(Object obj) {
            super(1, 0, ByteWriteChannel.class, obj, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // e4.k
        public final Object invoke(c<? super C> cVar) {
            return ((ByteWriteChannel) this.receiver).flushAndClose(cVar);
        }
    }

    @e(c = "io.ktor.utils.io.ByteWriteChannelOperationsKt", f = "ByteWriteChannelOperations.kt", l = {224}, m = "write")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteWriteChannelOperationsKt$write$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12791 extends U3.c {
        int I$0;
        int label;
        /* synthetic */ Object result;

        public C12791(c<? super C12791> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteWriteChannelOperationsKt.write(null, 0, null, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteWriteChannelOperationsKt", f = "ByteWriteChannelOperations.kt", l = {116}, m = "writePacket")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteWriteChannelOperationsKt$writePacket$2, reason: invalid class name */
    public static final class AnonymousClass2 extends U3.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteWriteChannelOperationsKt.writePacket((ByteWriteChannel) null, (n) null, this);
        }
    }

    public static final Object awaitFreeSpace(ByteWriteChannel byteWriteChannel, c<? super C> cVar) {
        Object objFlush = byteWriteChannel.flush(cVar);
        return objFlush == T3.a.f9048k ? objFlush : C.a;
    }

    public static final void cancel(ChannelJob channelJob) {
        l.f("<this>", channelJob);
        channelJob.getJob().e(null);
    }

    public static final void close(ByteWriteChannel byteWriteChannel, Throwable th) throws Throwable {
        l.f("<this>", byteWriteChannel);
        if (th == null) {
            fireAndForget(new AnonymousClass1(byteWriteChannel));
        } else {
            byteWriteChannel.cancel(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <R> void fireAndForget(k kVar) throws Throwable {
        c<C> bVar;
        l.f("<this>", kVar);
        ByteWriteChannelOperationsKt$NO_CALLBACK$1 byteWriteChannelOperationsKt$NO_CALLBACK$1 = NO_CALLBACK;
        try {
            l.f("completion", byteWriteChannelOperationsKt$NO_CALLBACK$1);
            if (kVar instanceof U3.a) {
                bVar = ((U3.a) kVar).create(byteWriteChannelOperationsKt$NO_CALLBACK$1);
            } else {
                h context = byteWriteChannelOperationsKt$NO_CALLBACK$1.getContext();
                bVar = context == i.f8767k ? new T3.b(byteWriteChannelOperationsKt$NO_CALLBACK$1, kVar) : new T3.c(byteWriteChannelOperationsKt$NO_CALLBACK$1, context, kVar);
            }
            M5.a.h(r.E(bVar), C.a);
        } catch (Throwable th) {
            AbstractC1420H.y(th, byteWriteChannelOperationsKt$NO_CALLBACK$1);
            throw null;
        }
    }

    public static final CancellationException getCancellationException(ChannelJob channelJob) {
        l.f("<this>", channelJob);
        return channelJob.getJob().H();
    }

    public static final N invokeOnCompletion(ChannelJob channelJob, k kVar) {
        l.f("<this>", channelJob);
        l.f("block", kVar);
        return channelJob.getJob().x(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C invokeOnCompletion$lambda$0(InterfaceC0821a interfaceC0821a, Throwable th) {
        interfaceC0821a.invoke();
        return C.a;
    }

    public static final boolean isCancelled(ChannelJob channelJob) {
        l.f("<this>", channelJob);
        return channelJob.getJob().isCancelled();
    }

    public static final boolean isCompleted(ChannelJob channelJob) {
        l.f("<this>", channelJob);
        return channelJob.getJob().J();
    }

    public static final Object join(ChannelJob channelJob, c<? super C> cVar) {
        Object objM = channelJob.getJob().m(cVar);
        return objM == T3.a.f9048k ? objM : C.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object write(io.ktor.utils.io.ByteWriteChannel r9, int r10, e4.o r11, S3.c<? super java.lang.Integer> r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof io.ktor.utils.io.ByteWriteChannelOperationsKt.C12791
            if (r0 == 0) goto L13
            r0 = r12
            io.ktor.utils.io.ByteWriteChannelOperationsKt$write$1 r0 = (io.ktor.utils.io.ByteWriteChannelOperationsKt.C12791) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteWriteChannelOperationsKt$write$1 r0 = new io.ktor.utils.io.ByteWriteChannelOperationsKt$write$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            int r9 = r0.I$0
            P3.r.Y(r12)
            goto La4
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            P3.r.Y(r12)
            S5.l r12 = r9.getWriteBuffer()
            int r12 = io.ktor.utils.io.core.BytePacketBuilderKt.getSize(r12)
            S5.l r2 = r9.getWriteBuffer()
            S5.a r2 = r2.a()
            S5.j r4 = r2.m(r10)
            int r5 = r4.f8802c
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            byte[] r5 = r4.a
            int r7 = r5.length
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            java.lang.Object r11 = r11.invoke(r5, r6, r8)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            if (r11 != r10) goto L70
            int r10 = r4.f8802c
            int r10 = r10 + r11
            r4.f8802c = r10
            long r4 = r2.f8784m
            long r10 = (long) r11
            long r4 = r4 + r10
            r2.f8784m = r4
            goto L8f
        L70:
            if (r11 < 0) goto Laa
            int r10 = r4.a()
            if (r11 > r10) goto Laa
            if (r11 == 0) goto L86
            int r10 = r4.f8802c
            int r10 = r10 + r11
            r4.f8802c = r10
            long r4 = r2.f8784m
            long r10 = (long) r11
            long r4 = r4 + r10
            r2.f8784m = r4
            goto L8f
        L86:
            boolean r10 = S5.p.f(r4)
            if (r10 == 0) goto L8f
            r2.i()
        L8f:
            S5.l r10 = r9.getWriteBuffer()
            int r10 = io.ktor.utils.io.core.BytePacketBuilderKt.getSize(r10)
            int r10 = r10 - r12
            r0.I$0 = r10
            r0.label = r3
            java.lang.Object r9 = io.ktor.utils.io.ByteWriteChannelKt.flushIfNeeded(r9, r0)
            if (r9 != r1) goto La3
            return r1
        La3:
            r9 = r10
        La4:
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r9)
            return r10
        Laa:
            java.lang.String r9 = "Invalid number of bytes written: "
            java.lang.String r10 = ". Should be in 0.."
            java.lang.StringBuilder r9 = b1.AbstractC0703b.p(r11, r9, r10)
            int r10 = r4.a()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteWriteChannelOperationsKt.write(io.ktor.utils.io.ByteWriteChannel, int, e4.o, S3.c):java.lang.Object");
    }

    public static /* synthetic */ Object write$default(ByteWriteChannel byteWriteChannel, int i7, o oVar, c cVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 1;
        }
        return write(byteWriteChannel, i7, oVar, cVar);
    }

    public static final Object writeBuffer(ByteWriteChannel byteWriteChannel, f fVar, c<? super C> cVar) throws Throwable {
        l.f("<this>", fVar);
        Object objWritePacket = writePacket(byteWriteChannel, new S5.h(fVar), cVar);
        return objWritePacket == T3.a.f9048k ? objWritePacket : C.a;
    }

    public static final Object writeByte(ByteWriteChannel byteWriteChannel, byte b4, c<? super C> cVar) {
        byteWriteChannel.getWriteBuffer().D(b4);
        Object objFlushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, cVar);
        return objFlushIfNeeded == T3.a.f9048k ? objFlushIfNeeded : C.a;
    }

    public static final Object writeByteArray(ByteWriteChannel byteWriteChannel, byte[] bArr, c<? super C> cVar) {
        byteWriteChannel.getWriteBuffer().write(bArr, 0, bArr.length);
        Object objFlushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, cVar);
        return objFlushIfNeeded == T3.a.f9048k ? objFlushIfNeeded : C.a;
    }

    public static final Object writeDouble(ByteWriteChannel byteWriteChannel, double d4, c<? super C> cVar) {
        S5.l writeBuffer = byteWriteChannel.getWriteBuffer();
        int i7 = m.a;
        l.f("<this>", writeBuffer);
        writeBuffer.h(Double.doubleToLongBits(d4));
        Object objFlushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, cVar);
        return objFlushIfNeeded == T3.a.f9048k ? objFlushIfNeeded : C.a;
    }

    public static final Object writeFloat(ByteWriteChannel byteWriteChannel, float f5, c<? super C> cVar) {
        S5.l writeBuffer = byteWriteChannel.getWriteBuffer();
        int i7 = m.a;
        l.f("<this>", writeBuffer);
        writeBuffer.r(Float.floatToIntBits(f5));
        Object objFlushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, cVar);
        return objFlushIfNeeded == T3.a.f9048k ? objFlushIfNeeded : C.a;
    }

    public static final Object writeFully(ByteWriteChannel byteWriteChannel, byte[] bArr, int i7, int i8, c<? super C> cVar) {
        byteWriteChannel.getWriteBuffer().write(bArr, i7, i8);
        Object objFlushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, cVar);
        return objFlushIfNeeded == T3.a.f9048k ? objFlushIfNeeded : C.a;
    }

    public static /* synthetic */ Object writeFully$default(ByteWriteChannel byteWriteChannel, byte[] bArr, int i7, int i8, c cVar, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = bArr.length;
        }
        return writeFully(byteWriteChannel, bArr, i7, i8, cVar);
    }

    public static final Object writeInt(ByteWriteChannel byteWriteChannel, int i7, c<? super C> cVar) {
        byteWriteChannel.getWriteBuffer().r(i7);
        Object objFlushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, cVar);
        return objFlushIfNeeded == T3.a.f9048k ? objFlushIfNeeded : C.a;
    }

    public static final Object writeLong(ByteWriteChannel byteWriteChannel, long j7, c<? super C> cVar) {
        byteWriteChannel.getWriteBuffer().h(j7);
        Object objFlushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, cVar);
        return objFlushIfNeeded == T3.a.f9048k ? objFlushIfNeeded : C.a;
    }

    public static final Object writePacket(ByteWriteChannel byteWriteChannel, S5.a aVar, c<? super C> cVar) {
        byteWriteChannel.getWriteBuffer().M(aVar);
        Object objFlushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, cVar);
        return objFlushIfNeeded == T3.a.f9048k ? objFlushIfNeeded : C.a;
    }

    public static final Object writeShort(ByteWriteChannel byteWriteChannel, short s7, c<? super C> cVar) {
        byteWriteChannel.getWriteBuffer().o(s7);
        Object objFlushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, cVar);
        return objFlushIfNeeded == T3.a.f9048k ? objFlushIfNeeded : C.a;
    }

    public static final Object writeSource(ByteWriteChannel byteWriteChannel, n nVar, c<? super C> cVar) throws Throwable {
        Object objWritePacket = writePacket(byteWriteChannel, nVar, cVar);
        return objWritePacket == T3.a.f9048k ? objWritePacket : C.a;
    }

    public static final Object writeString(ByteWriteChannel byteWriteChannel, String str, c<? super C> cVar) {
        StringsKt.writeText$default(byteWriteChannel.getWriteBuffer(), str, 0, 0, (Charset) null, 14, (Object) null);
        Object objFlushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, cVar);
        return objFlushIfNeeded == T3.a.f9048k ? objFlushIfNeeded : C.a;
    }

    public static final Object writeStringUtf8(ByteWriteChannel byteWriteChannel, String str, c<? super C> cVar) {
        StringsKt.writeText$default(byteWriteChannel.getWriteBuffer(), str, 0, 0, (Charset) null, 14, (Object) null);
        Object objFlushIfNeeded = ByteWriteChannelKt.flushIfNeeded(byteWriteChannel, cVar);
        return objFlushIfNeeded == T3.a.f9048k ? objFlushIfNeeded : C.a;
    }

    public static final WriterJob writer(A a, h hVar, boolean z7, e4.n nVar) {
        l.f("<this>", a);
        l.f("coroutineContext", hVar);
        l.f("block", nVar);
        return writer(a, hVar, new ByteChannel(false, 1, null), nVar);
    }

    public static /* synthetic */ WriterJob writer$default(A a, h hVar, boolean z7, e4.n nVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            hVar = i.f8767k;
        }
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        return writer(a, hVar, z7, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C writer$lambda$2$lambda$1(ByteChannel byteChannel, Throwable th) {
        if (th != null && !byteChannel.isClosedForWrite()) {
            byteChannel.cancel(th);
        }
        return C.a;
    }

    @InterfaceC0554c
    public static final /* synthetic */ void invokeOnCompletion(ChannelJob channelJob, InterfaceC0821a interfaceC0821a) {
        l.f("<this>", channelJob);
        l.f("block", interfaceC0821a);
        channelJob.getJob().x(new io.ktor.util.collections.a(interfaceC0821a, 1));
    }

    public static final WriterJob writer(A a, h hVar, ByteChannel byteChannel, e4.n nVar) {
        l.f("<this>", a);
        l.f("coroutineContext", hVar);
        l.f("channel", byteChannel);
        l.f("block", nVar);
        u0 u0VarX = D.x(a, hVar, new ByteWriteChannelOperationsKt$writer$job$1(nVar, byteChannel, null), 2);
        u0VarX.x(new a(byteChannel, 2));
        return new WriterJob(byteChannel, u0VarX);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object writePacket(io.ktor.utils.io.ByteWriteChannel r7, S5.n r8, S3.c<? super O3.C> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.ktor.utils.io.ByteWriteChannelOperationsKt.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.ByteWriteChannelOperationsKt$writePacket$2 r0 = (io.ktor.utils.io.ByteWriteChannelOperationsKt.AnonymousClass2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteWriteChannelOperationsKt$writePacket$2 r0 = new io.ktor.utils.io.ByteWriteChannelOperationsKt$writePacket$2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.L$1
            S5.n r7 = (S5.n) r7
            java.lang.Object r8 = r0.L$0
            io.ktor.utils.io.ByteWriteChannel r8 = (io.ktor.utils.io.ByteWriteChannel) r8
            P3.r.Y(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L3d
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            P3.r.Y(r9)
        L3d:
            boolean r9 = r8.z()
            if (r9 != 0) goto L5b
            S5.l r9 = r7.getWriteBuffer()
            long r4 = io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(r8)
            r9.I(r8, r4)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r9 = io.ktor.utils.io.ByteWriteChannelKt.flushIfNeeded(r7, r0)
            if (r9 != r1) goto L3d
            return r1
        L5b:
            O3.C r7 = O3.C.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteWriteChannelOperationsKt.writePacket(io.ktor.utils.io.ByteWriteChannel, S5.n, S3.c):java.lang.Object");
    }

    public static /* synthetic */ WriterJob writer$default(A a, h hVar, ByteChannel byteChannel, e4.n nVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            hVar = i.f8767k;
        }
        return writer(a, hVar, byteChannel, nVar);
    }
}
