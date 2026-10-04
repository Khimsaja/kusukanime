package io.ktor.utils.io;

import O3.C;
import S5.j;
import U3.c;
import U3.e;
import b1.AbstractC0703b;
import e4.k;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.core.BytePacketBuilderExtensions_jvmKt;
import io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a&\u0010\u0010\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0014\u001a\u00020\u0013*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0014\u0010\b\u001a\u001c\u0010\u0014\u001a\u00020\u0013*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\u0013*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0016\u0010\b\u001a%\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0017¢\u0006\u0004\b\u0007\u0010\u0019\u001a4\u0010\u001c\u001a\u00020\u0013*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00062\u0014\b\b\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0017H\u0086H¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Ljava/nio/ByteBuffer;", "content", "Lio/ktor/utils/io/ByteReadChannel;", "ByteReadChannel", "(Ljava/nio/ByteBuffer;)Lio/ktor/utils/io/ByteReadChannel;", "buffer", "", "readAvailable", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/nio/ByteBuffer;LS3/c;)Ljava/lang/Object;", "LT5/a;", "ByteString", "(Ljava/nio/ByteBuffer;)LT5/a;", "Ljava/nio/channels/WritableByteChannel;", "channel", "", "limit", "copyTo", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/nio/channels/WritableByteChannel;JLS3/c;)Ljava/lang/Object;", "delimiter", "LO3/C;", "skipDelimiter", "(Lio/ktor/utils/io/ByteReadChannel;LT5/a;LS3/c;)Ljava/lang/Object;", "readFully", "Lkotlin/Function1;", "block", "(Lio/ktor/utils/io/ByteReadChannel;Le4/k;)I", "min", "consumer", "read", "(Lio/ktor/utils/io/ByteReadChannel;ILe4/k;LS3/c;)Ljava/lang/Object;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ByteReadChannelOperations_jvmKt {

    @e(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", l = {211, 215}, m = "copyTo")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperations_jvmKt$copyTo$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperations_jvmKt.copyTo(null, null, 0L, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", l = {198, 202}, m = "read")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperations_jvmKt$read$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12761 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12761(S3.c<? super C12761> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperations_jvmKt.read(null, 0, null, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", l = {40}, m = "readAvailable")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12771 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12771(S3.c<? super C12771> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperations_jvmKt.readAvailable(null, null, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", l = {130}, m = "readFully")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readFully$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12781 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12781(S3.c<? super C12781> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperations_jvmKt.readFully(null, null, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", l = {114}, m = "skipDelimiter")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperations_jvmKt$skipDelimiter$2, reason: invalid class name */
    public static final class AnonymousClass2 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(S3.c<? super AnonymousClass2> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperations_jvmKt.skipDelimiter((ByteReadChannel) null, (T5.a) null, this);
        }
    }

    public static final ByteReadChannel ByteReadChannel(ByteBuffer byteBuffer) {
        l.f("content", byteBuffer);
        S5.a aVar = new S5.a();
        BytePacketBuilderExtensions_jvmKt.writeFully(aVar, byteBuffer);
        return ByteChannelCtorKt.ByteReadChannel(aVar);
    }

    public static final T5.a ByteString(ByteBuffer byteBuffer) {
        l.f("buffer", byteBuffer);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.mark();
        byteBuffer.get(bArr);
        byteBuffer.reset();
        return new T5.a(bArr, 0, iRemaining);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ea -> B:45:0x00f1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object copyTo(io.ktor.utils.io.ByteReadChannel r9, final java.nio.channels.WritableByteChannel r10, final long r11, S3.c<? super java.lang.Long> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperations_jvmKt.copyTo(io.ktor.utils.io.ByteReadChannel, java.nio.channels.WritableByteChannel, long, S3.c):java.lang.Object");
    }

    public static /* synthetic */ Object copyTo$default(ByteReadChannel byteReadChannel, WritableByteChannel writableByteChannel, long j7, S3.c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            j7 = Long.MAX_VALUE;
        }
        return copyTo(byteReadChannel, writableByteChannel, j7, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C copyTo$lambda$3(long j7, w wVar, WritableByteChannel writableByteChannel, ByteBuffer byteBuffer) throws IOException {
        l.f("bb", byteBuffer);
        long j8 = j7 - wVar.f12719k;
        if (j8 < byteBuffer.remaining()) {
            int iLimit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + ((int) j8));
            while (byteBuffer.hasRemaining()) {
                writableByteChannel.write(byteBuffer);
            }
            byteBuffer.limit(iLimit);
            wVar.f12719k += j8;
        } else {
            long jWrite = 0;
            while (byteBuffer.hasRemaining()) {
                jWrite += writableByteChannel.write(byteBuffer);
            }
            wVar.f12719k += jWrite;
        }
        return C.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object read(io.ktor.utils.io.ByteReadChannel r5, int r6, e4.k r7, S3.c<? super O3.C> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.ByteReadChannelOperations_jvmKt.C12761
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.ByteReadChannelOperations_jvmKt$read$1 r0 = (io.ktor.utils.io.ByteReadChannelOperations_jvmKt.C12761) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperations_jvmKt$read$1 r0 = new io.ktor.utils.io.ByteReadChannelOperations_jvmKt$read$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.L$1
            r7 = r5
            e4.k r7 = (e4.k) r7
            java.lang.Object r5 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r5 = (io.ktor.utils.io.ByteReadChannel) r5
            P3.r.Y(r8)
            goto L9d
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            int r6 = r0.I$0
            java.lang.Object r5 = r0.L$1
            r7 = r5
            e4.k r7 = (e4.k) r7
            java.lang.Object r5 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r5 = (io.ktor.utils.io.ByteReadChannel) r5
            P3.r.Y(r8)
            goto L60
        L4a:
            P3.r.Y(r8)
            if (r6 < 0) goto Laf
            if (r6 <= 0) goto L8e
            r0.L$0 = r5
            r0.L$1 = r7
            r0.I$0 = r6
            r0.label = r4
            java.lang.Object r8 = r5.awaitContent(r6, r0)
            if (r8 != r1) goto L60
            goto L9c
        L60:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L70
            S5.n r5 = r5.getReadBuffer()
            io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt.read(r5, r7)
            goto Lac
        L70:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r8 = "Not enough bytes available: required "
            java.lang.String r0 = " but "
            java.lang.StringBuilder r6 = b1.AbstractC0703b.p(r6, r8, r0)
            int r5 = io.ktor.utils.io.ByteReadChannelOperationsKt.getAvailableForRead(r5)
            r6.append(r5)
            java.lang.String r5 = " available"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r7.<init>(r5)
            throw r7
        L8e:
            r0.L$0 = r5
            r0.L$1 = r7
            r0.label = r3
            r6 = 0
            r8 = 0
            java.lang.Object r8 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r5, r6, r0, r4, r8)
            if (r8 != r1) goto L9d
        L9c:
            return r1
        L9d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r6 = r8.booleanValue()
            if (r6 == 0) goto Lac
            S5.n r5 = r5.getReadBuffer()
            io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt.read(r5, r7)
        Lac:
            O3.C r5 = O3.C.a
            return r5
        Laf:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "min should be positive or zero"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperations_jvmKt.read(io.ktor.utils.io.ByteReadChannel, int, e4.k, S3.c):java.lang.Object");
    }

    private static final Object read$$forInline(ByteReadChannel byteReadChannel, int i7, k kVar, S3.c<? super C> cVar) throws EOFException {
        if (i7 < 0) {
            throw new IllegalArgumentException("min should be positive or zero");
        }
        if (i7 > 0) {
            if (!((Boolean) byteReadChannel.awaitContent(i7, cVar)).booleanValue()) {
                StringBuilder sbP = AbstractC0703b.p(i7, "Not enough bytes available: required ", " but ");
                sbP.append(ByteReadChannelOperationsKt.getAvailableForRead(byteReadChannel));
                sbP.append(" available");
                throw new EOFException(sbP.toString());
            }
            ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), kVar);
        } else if (((Boolean) ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, cVar, 1, null)).booleanValue()) {
            ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), kVar);
        }
        return C.a;
    }

    public static /* synthetic */ Object read$default(ByteReadChannel byteReadChannel, int i7, k kVar, S3.c cVar, int i8, Object obj) throws EOFException {
        if ((i8 & 1) != 0) {
            i7 = 1;
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("min should be positive or zero");
        }
        if (i7 > 0) {
            if (!((Boolean) byteReadChannel.awaitContent(i7, cVar)).booleanValue()) {
                StringBuilder sbP = AbstractC0703b.p(i7, "Not enough bytes available: required ", " but ");
                sbP.append(ByteReadChannelOperationsKt.getAvailableForRead(byteReadChannel));
                sbP.append(" available");
                throw new EOFException(sbP.toString());
            }
            ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), kVar);
        } else if (((Boolean) ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, cVar, 1, null)).booleanValue()) {
            ByteReadPacketExtensions_jvmKt.read(byteReadChannel.getReadBuffer(), kVar);
        }
        return C.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readAvailable(io.ktor.utils.io.ByteReadChannel r5, java.nio.ByteBuffer r6, S3.c<? super java.lang.Integer> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteReadChannelOperations_jvmKt.C12771
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1 r0 = (io.ktor.utils.io.ByteReadChannelOperations_jvmKt.C12771) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1 r0 = new io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readAvailable$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = -1
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r5 = r0.L$1
            r6 = r5
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            java.lang.Object r5 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r5 = (io.ktor.utils.io.ByteReadChannel) r5
            P3.r.Y(r7)
            goto L61
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            P3.r.Y(r7)
            boolean r7 = r5.isClosedForRead()
            if (r7 == 0) goto L48
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r3)
            return r5
        L48:
            S5.n r7 = r5.getReadBuffer()
            boolean r7 = r7.z()
            if (r7 == 0) goto L61
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            r7 = 0
            r2 = 0
            java.lang.Object r7 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r5, r7, r0, r4, r2)
            if (r7 != r1) goto L61
            return r1
        L61:
            boolean r7 = r5.isClosedForRead()
            if (r7 == 0) goto L6d
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r3)
            return r5
        L6d:
            S5.n r5 = r5.getReadBuffer()
            int r5 = S5.p.g(r5, r6)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperations_jvmKt.readAvailable(io.ktor.utils.io.ByteReadChannel, java.nio.ByteBuffer, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004f -> B:20:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readFully(io.ktor.utils.io.ByteReadChannel r5, java.nio.ByteBuffer r6, S3.c<? super O3.C> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteReadChannelOperations_jvmKt.C12781
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readFully$1 r0 = (io.ktor.utils.io.ByteReadChannelOperations_jvmKt.C12781) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readFully$1 r0 = new io.ktor.utils.io.ByteReadChannelOperations_jvmKt$readFully$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.L$1
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            java.lang.Object r6 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r6 = (io.ktor.utils.io.ByteReadChannel) r6
            P3.r.Y(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L52
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            P3.r.Y(r7)
        L3d:
            boolean r7 = r6.hasRemaining()
            if (r7 == 0) goto L7f
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            r7 = 0
            r2 = 0
            java.lang.Object r7 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r5, r7, r0, r3, r2)
            if (r7 != r1) goto L52
            return r1
        L52:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L62
            S5.n r7 = r5.getReadBuffer()
            S5.p.g(r7, r6)
            goto L3d
        L62:
            java.io.EOFException r5 = new java.io.EOFException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Not enough bytes available: expected "
            r7.<init>(r0)
            int r6 = r6.remaining()
            r7.append(r6)
            java.lang.String r6 = " more bytes"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L7f:
            O3.C r5 = O3.C.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperations_jvmKt.readFully(io.ktor.utils.io.ByteReadChannel, java.nio.ByteBuffer, S3.c):java.lang.Object");
    }

    public static final Object skipDelimiter(ByteReadChannel byteReadChannel, ByteBuffer byteBuffer, S3.c<? super C> cVar) throws Throwable {
        Object objSkipDelimiter = skipDelimiter(byteReadChannel, ByteString(byteBuffer), cVar);
        return objSkipDelimiter == T3.a.f9048k ? objSkipDelimiter : C.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object skipDelimiter(io.ktor.utils.io.ByteReadChannel r7, T5.a r8, S3.c<? super O3.C> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.ktor.utils.io.ByteReadChannelOperations_jvmKt.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.ByteReadChannelOperations_jvmKt$skipDelimiter$2 r0 = (io.ktor.utils.io.ByteReadChannelOperations_jvmKt.AnonymousClass2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperations_jvmKt$skipDelimiter$2 r0 = new io.ktor.utils.io.ByteReadChannelOperations_jvmKt$skipDelimiter$2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r7 = r0.I$1
            int r8 = r0.I$0
            java.lang.Object r2 = r0.L$1
            T5.a r2 = (T5.a) r2
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r4 = (io.ktor.utils.io.ByteReadChannel) r4
            P3.r.Y(r9)
            goto L5e
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            P3.r.Y(r9)
            byte[] r9 = r8.f9118k
            int r9 = r9.length
            r2 = 0
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L46:
            if (r2 >= r7) goto L78
            r0.L$0 = r8
            r0.L$1 = r9
            r0.I$0 = r2
            r0.I$1 = r7
            r0.label = r3
            java.lang.Object r4 = io.ktor.utils.io.ByteReadChannelOperationsKt.readByte(r8, r0)
            if (r4 != r1) goto L59
            return r1
        L59:
            r6 = r4
            r4 = r8
            r8 = r2
            r2 = r9
            r9 = r6
        L5e:
            java.lang.Number r9 = (java.lang.Number) r9
            byte r9 = r9.byteValue()
            byte r5 = r2.a(r8)
            if (r9 != r5) goto L70
            int r8 = r8 + 1
            r9 = r2
            r2 = r8
            r8 = r4
            goto L46
        L70:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Delimiter is not found"
            r7.<init>(r8)
            throw r7
        L78:
            O3.C r7 = O3.C.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperations_jvmKt.skipDelimiter(io.ktor.utils.io.ByteReadChannel, T5.a, S3.c):java.lang.Object");
    }

    public static final int readAvailable(ByteReadChannel byteReadChannel, k kVar) {
        l.f("<this>", byteReadChannel);
        l.f("block", kVar);
        if (byteReadChannel.isClosedForRead() || byteReadChannel.getReadBuffer().z()) {
            return -1;
        }
        S5.a aVarA = byteReadChannel.getReadBuffer().a();
        if (!aVarA.z()) {
            j jVar = aVarA.f8782k;
            l.c(jVar);
            int i7 = jVar.f8801b;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(jVar.a, i7, jVar.f8802c - i7);
            l.c(byteBufferWrap);
            int iIntValue = ((Number) kVar.invoke(byteBufferWrap)).intValue();
            if (iIntValue == 0) {
                return iIntValue;
            }
            if (iIntValue >= 0) {
                if (iIntValue <= jVar.b()) {
                    aVarA.n(iIntValue);
                    return iIntValue;
                }
                throw new IllegalStateException("Returned too many bytes");
            }
            throw new IllegalStateException("Returned negative read bytes count");
        }
        throw new IllegalArgumentException("Buffer is empty");
    }
}
