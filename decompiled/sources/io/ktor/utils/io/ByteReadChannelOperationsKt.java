package io.ktor.utils.io;

import H5.A;
import H5.D;
import H5.InterfaceC0265f0;
import H5.u0;
import O3.C;
import P3.r;
import S3.h;
import S3.i;
import U3.c;
import U3.e;
import U3.j;
import e4.k;
import e4.n;
import e4.p;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import v.c0;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u0000H\u0086@¢\u0006\u0004\b\t\u0010\u0003\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0014\u0010\r\u001a\u00020\f*\u00020\u0000H\u0086@¢\u0006\u0004\b\r\u0010\u0003\u001a\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000f\u0010\u0003\u001a\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0011\u0010\u0003\u001a\u001c\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0017\u0010\u0003\u001a\u001c\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u001c\u0010\u001b\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001b\u0010\u001c\u001a \u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u001e\u0010\u0015\u001a\u001c\u0010\u001f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001f\u0010\u001c\u001a$\u0010\u001f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u001f\u0010!\u001a\u001c\u0010#\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\"\u001a\u00020\nH\u0086@¢\u0006\u0004\b#\u0010\u0015\u001a\u0014\u0010%\u001a\u00020$*\u00020\u0000H\u0086@¢\u0006\u0004\b%\u0010\u0003\u001a\u001c\u0010%\u001a\u00020$*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b%\u0010&\u001a0\u0010*\u001a\u00020\n*\u00020\u00002\u0006\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\n2\b\b\u0002\u0010)\u001a\u00020\nH\u0086@¢\u0006\u0004\b*\u0010+\u001a-\u0010*\u001a\u00020\n*\u00020\u00002\u0006\u0010,\u001a\u00020\n2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0-¢\u0006\u0004\b*\u0010/\u001aI\u00109\u001a\u000208*\u0002002\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u00020\u00012\"\u0010.\u001a\u001e\b\u0001\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001306\u0012\u0006\u0012\u0004\u0018\u00010704¢\u0006\u0004\b9\u0010:\u001aE\u00109\u001a\u000208*\u0002002\u0006\u00102\u001a\u0002012\u0006\u0010\u001a\u001a\u00020;2\"\u0010.\u001a\u001e\b\u0001\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001306\u0012\u0006\u0012\u0004\u0018\u00010704¢\u0006\u0004\b9\u0010<\u001a\u001c\u0010>\u001a\u00020$*\u00020\u00002\u0006\u0010=\u001a\u00020\nH\u0086@¢\u0006\u0004\b>\u0010\u0015\u001a\u001c\u0010@\u001a\u00020\u0013*\u00020\u00002\u0006\u0010?\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b@\u0010&\u001a\u001e\u0010A\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u000eH\u0086@¢\u0006\u0004\bA\u0010&\u001a*\u0010E\u001a\u00020\u0001*\u00020\u00002\n\u0010D\u001a\u00060Bj\u0002`C2\b\b\u0002\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0004\bE\u0010F\u001a4\u0010E\u001a\u00020\u0001*\u00020\u00002\n\u0010D\u001a\u00060Bj\u0002`C2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010H\u001a\u00020GH\u0087@¢\u0006\u0004\bI\u0010J\u001aF\u0010L\u001a\u00020\n*\u00020\u000020\b\u0004\u0010.\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n06\u0012\u0006\u0012\u0004\u0018\u0001070KH\u0086H¢\u0006\u0004\bL\u0010M\u001a0\u0010P\u001a\u00020\u0013*\u00020\u00002\u0006\u0010D\u001a\u00020\u00042\b\b\u0002\u0010N\u001a\u00020\n2\b\b\u0002\u0010O\u001a\u00020\nH\u0086@¢\u0006\u0004\bP\u0010+\u001a\u0013\u0010Q\u001a\u00020\u0013*\u00020\u0000H\u0007¢\u0006\u0004\bQ\u0010R\u001a\u0013\u0010Q\u001a\u00020\u0013*\u00020\u0019H\u0007¢\u0006\u0004\bQ\u0010S\u001a\u0013\u0010Q\u001a\u00020\u0013*\u00020;H\u0007¢\u0006\u0004\bQ\u0010T\u001a8\u0010Y\u001a\u00020\u000e*\u00020\u00002\u0006\u0010V\u001a\u00020U2\u0006\u0010W\u001a\u00020\u00192\b\b\u0002\u0010 \u001a\u00020\u000e2\b\b\u0002\u0010X\u001a\u00020\u0001H\u0086@¢\u0006\u0004\bY\u0010Z\u001a\u001c\u0010\\\u001a\u00020\u0001*\u00020\u00002\u0006\u0010[\u001a\u00020UH\u0086@¢\u0006\u0004\b\\\u0010]\u001a\u001e\u0010^\u001a\u0004\u0018\u00010U*\u00020\u00002\u0006\u0010\"\u001a\u00020\nH\u0086@¢\u0006\u0004\b^\u0010\u0015\"\u0014\u0010_\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b_\u0010`\"\u0014\u0010a\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\ba\u0010`\"\u001b\u0010e\u001a\u00020\n*\u00020\u00198F¢\u0006\f\u0012\u0004\bd\u0010S\u001a\u0004\bb\u0010c\"\u001b\u0010i\u001a\u00020\n*\u00020\u00008F¢\u0006\f\u0012\u0004\bh\u0010R\u001a\u0004\bf\u0010g¨\u0006j"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "", "exhausted", "(Lio/ktor/utils/io/ByteReadChannel;LS3/c;)Ljava/lang/Object;", "", "toByteArray", "", "readByte", "", "readShort", "", "readInt", "", "readFloat", "", "readLong", "", "readDouble", "numberOfBytes", "LO3/C;", "awaitUntilReadable", "(Lio/ktor/utils/io/ByteReadChannel;ILS3/c;)Ljava/lang/Object;", "LS5/a;", "readBuffer", "max", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "copyAndClose", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;LS3/c;)Ljava/lang/Object;", "", "readUTF8Line", "copyTo", "limit", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JLS3/c;)Ljava/lang/Object;", "count", "readByteArray", "LS5/n;", "readRemaining", "(Lio/ktor/utils/io/ByteReadChannel;JLS3/c;)Ljava/lang/Object;", "buffer", "offset", "length", "readAvailable", "(Lio/ktor/utils/io/ByteReadChannel;[BIILS3/c;)Ljava/lang/Object;", "min", "Lkotlin/Function1;", "block", "(Lio/ktor/utils/io/ByteReadChannel;ILe4/k;)I", "LH5/A;", "LS3/h;", "coroutineContext", "autoFlush", "Lkotlin/Function2;", "Lio/ktor/utils/io/ReaderScope;", "LS3/c;", "", "Lio/ktor/utils/io/ReaderJob;", "reader", "(LH5/A;LS3/h;ZLe4/n;)Lio/ktor/utils/io/ReaderJob;", "Lio/ktor/utils/io/ByteChannel;", "(LH5/A;LS3/h;Lio/ktor/utils/io/ByteChannel;Le4/n;)Lio/ktor/utils/io/ReaderJob;", "packet", "readPacket", "value", "discardExact", "discard", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "out", "readUTF8LineTo", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/Appendable;ILS3/c;)Ljava/lang/Object;", "Lio/ktor/utils/io/LineEndingMode;", "lineEnding", "readUTF8LineTo-RRvyBJ8", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/Appendable;IILS3/c;)Ljava/lang/Object;", "Lkotlin/Function4;", "read", "(Lio/ktor/utils/io/ByteReadChannel;Le4/p;LS3/c;)Ljava/lang/Object;", "start", "end", "readFully", "rethrowCloseCauseIfNeeded", "(Lio/ktor/utils/io/ByteReadChannel;)V", "(Lio/ktor/utils/io/ByteWriteChannel;)V", "(Lio/ktor/utils/io/ByteChannel;)V", "LT5/a;", "matchString", "writeChannel", "ignoreMissing", "readUntil", "(Lio/ktor/utils/io/ByteReadChannel;LT5/a;Lio/ktor/utils/io/ByteWriteChannel;JZLS3/c;)Ljava/lang/Object;", "byteString", "skipIfFound", "(Lio/ktor/utils/io/ByteReadChannel;LT5/a;LS3/c;)Ljava/lang/Object;", "peek", "CR", "B", "LF", "getAvailableForWrite", "(Lio/ktor/utils/io/ByteWriteChannel;)I", "getAvailableForWrite$annotations", "availableForWrite", "getAvailableForRead", "(Lio/ktor/utils/io/ByteReadChannel;)I", "getAvailableForRead$annotations", "availableForRead", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ByteReadChannelOperationsKt {
    private static final byte CR = 13;
    private static final byte LF = 10;

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {92}, m = "awaitUntilReadable")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$awaitUntilReadable$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.awaitUntilReadable(null, 0, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {132, 133, 142, 142}, m = "copyAndClose")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$copyAndClose$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12511 extends c {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12511(S3.c<? super C12511> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.copyAndClose(null, null, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {171, 172, 179, 179}, m = "copyTo")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$copyTo$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12521 extends c {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12521(S3.c<? super C12521> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.copyTo(null, null, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {190, 194, 201, 201}, m = "copyTo")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$copyTo$2, reason: invalid class name */
    public static final class AnonymousClass2 extends c {
        long J$0;
        long J$1;
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
            return ByteReadChannelOperationsKt.copyTo(null, null, 0L, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {393}, m = "discard")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$discard$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12531 extends c {
        long J$0;
        long J$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12531(S3.c<? super C12531> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.discard(null, 0L, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {385}, m = "discardExact")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$discardExact$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12541 extends c {
        long J$0;
        int label;
        /* synthetic */ Object result;

        public C12541(S3.c<? super C12541> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.discardExact(null, 0L, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {34}, m = "exhausted")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$exhausted$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12551 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12551(S3.c<? super C12551> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.exhausted(null, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {618}, m = "peek")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$peek$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12561 extends c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12561(S3.c<? super C12561> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.peek(null, 0, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {499, 504}, m = "read")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$read$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12571 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C12571(S3.c<? super C12571> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.read(null, null, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {259}, m = "readAvailable")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readAvailable$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12581 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12581(S3.c<? super C12581> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readAvailable(null, null, 0, 0, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {102}, m = "readBuffer")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12591 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12591(S3.c<? super C12591> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readBuffer(null, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {116}, m = "readBuffer")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$3, reason: invalid class name */
    public static final class AnonymousClass3 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(S3.c<? super AnonymousClass3> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readBuffer(null, 0, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {45}, m = "readByte")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readByte$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12601 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12601(S3.c<? super C12601> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readByte(null, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {209}, m = "readByteArray")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readByteArray$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12611 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C12611(S3.c<? super C12611> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readByteArray(null, 0, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {87}, m = "readDouble")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readDouble$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12621 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12621(S3.c<? super C12621> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readDouble(null, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {70}, m = "readFloat")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readFloat$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12631 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12631(S3.c<? super C12631> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readFloat(null, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {533}, m = "readFully")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12641 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12641(S3.c<? super C12641> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readFully(null, null, 0, 0, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {59}, m = "readInt")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readInt$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12651 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12651(S3.c<? super C12651> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readInt(null, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {76}, m = "readLong")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readLong$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12661 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12661(S3.c<? super C12661> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readLong(null, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {368}, m = "readPacket")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12671 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12671(S3.c<? super C12671> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readPacket(null, 0, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {219}, m = "readRemaining")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12681 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12681(S3.c<? super C12681> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readRemaining(null, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {239}, m = "readRemaining")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$2, reason: invalid class name and case insensitive filesystem */
    public static final class C12692 extends c {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12692(S3.c<? super C12692> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readRemaining(null, 0L, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {53}, m = "readShort")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readShort$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12701 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12701(S3.c<? super C12701> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readShort(null, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {161}, m = "readUTF8Line")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8Line$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12711 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12711(S3.c<? super C12711> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.readUTF8Line(null, 0, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {446, 461, 485}, m = "readUTF8LineTo-RRvyBJ8")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8LineTo$2, reason: invalid class name and case insensitive filesystem */
    public static final class C12722 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C12722(S3.c<? super C12722> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.m195readUTF8LineToRRvyBJ8(null, null, 0, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LO3/C;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt$reader$1", f = "ByteReadChannelOperations.kt", l = {353}, m = "invokeSuspend")
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$reader$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12731 extends j implements k {
        final /* synthetic */ InterfaceC0265f0 $job;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12731(InterfaceC0265f0 interfaceC0265f0, S3.c<? super C12731> cVar) {
            super(1, cVar);
            this.$job = interfaceC0265f0;
        }

        @Override // U3.a
        public final S3.c<C> create(S3.c<?> cVar) {
            return new C12731(this.$job, cVar);
        }

        @Override // e4.k
        public final Object invoke(S3.c<? super C> cVar) {
            return ((C12731) create(cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                InterfaceC0265f0 interfaceC0265f0 = this.$job;
                this.label = 1;
                if (interfaceC0265f0.m(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
            return C.a;
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {598, 599}, m = "skipIfFound")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$skipIfFound$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12741 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12741(S3.c<? super C12741> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.skipIfFound(null, null, this);
        }
    }

    @e(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {39}, m = "toByteArray")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteReadChannelOperationsKt$toByteArray$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12751 extends c {
        int label;
        /* synthetic */ Object result;

        public C12751(S3.c<? super C12751> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelOperationsKt.toByteArray(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitUntilReadable(io.ktor.utils.io.ByteReadChannel r4, int r5, S3.c<? super O3.C> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ByteReadChannelOperationsKt$awaitUntilReadable$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$awaitUntilReadable$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$awaitUntilReadable$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            P3.r.Y(r6)
            r0.label = r3
            java.lang.Object r6 = r4.awaitContent(r5, r0)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 == 0) goto L46
            O3.C r4 = O3.C.a
            return r4
        L46:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.String r5 = "Not enough data available"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.awaitUntilReadable(io.ktor.utils.io.ByteReadChannel, int, S3.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
    
        if (r0 != r2) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #1 {all -> 0x00a7, blocks: (B:27:0x0071, B:29:0x0077, B:38:0x00ad, B:46:0x00c9), top: B:57:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad A[Catch: all -> 0x00a7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00a7, blocks: (B:27:0x0071, B:29:0x0077, B:38:0x00ad, B:46:0x00c9), top: B:57:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r14v0, types: [io.ktor.utils.io.ByteReadChannel] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [io.ktor.utils.io.ByteWriteChannel] */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.ByteReadChannel] */
    /* JADX WARN: Type inference failed for: r3v4, types: [io.ktor.utils.io.ByteReadChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a4 -> B:20:0x0054). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object copyAndClose(io.ktor.utils.io.ByteReadChannel r14, io.ktor.utils.io.ByteWriteChannel r15, S3.c<? super java.lang.Long> r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.copyAndClose(io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel, S3.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r11, 0, r1, 1, null) != r2) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b A[Catch: all -> 0x00ab, TRY_LEAVE, TryCatch #1 {all -> 0x00ab, blocks: (B:27:0x0075, B:29:0x007b), top: B:54:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.ByteWriteChannel] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a8 -> B:20:0x0054). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object copyTo(io.ktor.utils.io.ByteReadChannel r16, io.ktor.utils.io.ByteWriteChannel r17, S3.c<? super java.lang.Long> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.copyTo(io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004b -> B:26:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005e -> B:25:0x0061). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object discard(io.ktor.utils.io.ByteReadChannel r10, long r11, S3.c<? super java.lang.Long> r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C12531
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.ByteReadChannelOperationsKt$discard$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C12531) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$discard$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$discard$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            long r10 = r0.J$1
            long r4 = r0.J$0
            java.lang.Object r12 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r12 = (io.ktor.utils.io.ByteReadChannel) r12
            P3.r.Y(r13)
            goto L61
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            P3.r.Y(r13)
            r4 = r11
        L3b:
            r6 = 0
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 <= 0) goto L79
            boolean r13 = r10.isClosedForRead()
            if (r13 != 0) goto L79
            int r13 = getAvailableForRead(r10)
            if (r13 != 0) goto L64
            r0.L$0 = r10
            r0.J$0 = r4
            r0.J$1 = r11
            r0.label = r3
            r13 = 0
            r2 = 0
            java.lang.Object r13 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r10, r13, r0, r3, r2)
            if (r13 != r1) goto L5e
            return r1
        L5e:
            r8 = r11
            r12 = r10
            r10 = r8
        L61:
            r8 = r10
            r10 = r12
            r11 = r8
        L64:
            S5.n r13 = r10.getReadBuffer()
            long r6 = io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(r13)
            long r6 = java.lang.Math.min(r11, r6)
            S5.n r13 = r10.getReadBuffer()
            io.ktor.utils.io.core.ByteReadPacketKt.discard(r13, r6)
            long r11 = r11 - r6
            goto L3b
        L79:
            long r4 = r4 - r11
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.discard(io.ktor.utils.io.ByteReadChannel, long, S3.c):java.lang.Object");
    }

    public static /* synthetic */ Object discard$default(ByteReadChannel byteReadChannel, long j7, S3.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = Long.MAX_VALUE;
        }
        return discard(byteReadChannel, j7, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object discardExact(io.ktor.utils.io.ByteReadChannel r4, long r5, S3.c<? super O3.C> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C12541
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteReadChannelOperationsKt$discardExact$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C12541) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$discardExact$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$discardExact$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            long r5 = r0.J$0
            P3.r.Y(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            P3.r.Y(r7)
            r0.J$0 = r5
            r0.label = r3
            java.lang.Object r7 = discard(r4, r5, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            java.lang.Number r7 = (java.lang.Number) r7
            long r0 = r7.longValue()
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 < 0) goto L4c
            O3.C r4 = O3.C.a
            return r4
        L4c:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to discard "
            r7.<init>(r0)
            r7.append(r5)
            java.lang.String r5 = " bytes"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.discardExact(io.ktor.utils.io.ByteReadChannel, long, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object exhausted(io.ktor.utils.io.ByteReadChannel r4, S3.c<? super java.lang.Boolean> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C12551
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteReadChannelOperationsKt$exhausted$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C12551) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$exhausted$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$exhausted$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r4 = (io.ktor.utils.io.ByteReadChannel) r4
            P3.r.Y(r5)
            goto L4d
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            P3.r.Y(r5)
            S5.n r5 = r4.getReadBuffer()
            boolean r5 = r5.z()
            if (r5 == 0) goto L4d
            r0.L$0 = r4
            r0.label = r3
            r5 = 0
            r2 = 0
            java.lang.Object r5 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r4, r5, r0, r3, r2)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            S5.n r4 = r4.getReadBuffer()
            boolean r4 = r4.z()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.exhausted(io.ktor.utils.io.ByteReadChannel, S3.c):java.lang.Object");
    }

    public static final int getAvailableForRead(ByteReadChannel byteReadChannel) {
        l.f("<this>", byteReadChannel);
        return (int) byteReadChannel.getReadBuffer().a().f8784m;
    }

    public static /* synthetic */ void getAvailableForRead$annotations(ByteReadChannel byteReadChannel) {
    }

    public static final int getAvailableForWrite(ByteWriteChannel byteWriteChannel) {
        l.f("<this>", byteWriteChannel);
        return ByteChannelKt.CHANNEL_MAX_SIZE - BytePacketBuilderKt.getSize(byteWriteChannel.getWriteBuffer());
    }

    public static /* synthetic */ void getAvailableForWrite$annotations(ByteWriteChannel byteWriteChannel) {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object peek(io.ktor.utils.io.ByteReadChannel r4, int r5, S3.c<? super T5.a> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C12561
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ByteReadChannelOperationsKt$peek$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C12561) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$peek$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$peek$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r5 = r0.I$0
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r4 = (io.ktor.utils.io.ByteReadChannel) r4
            P3.r.Y(r6)
            goto L4c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            P3.r.Y(r6)
            boolean r6 = r4.isClosedForRead()
            if (r6 == 0) goto L3f
            goto L54
        L3f:
            r0.L$0 = r4
            r0.I$0 = r5
            r0.label = r3
            java.lang.Object r6 = r4.awaitContent(r5, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L56
        L54:
            r4 = 0
            return r4
        L56:
            S5.n r4 = r4.getReadBuffer()
            S5.h r4 = r4.N()
            byte[] r4 = S5.p.i(r4, r5)
            T5.a r5 = new T5.a
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.peek(io.ktor.utils.io.ByteReadChannel, int, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object read(io.ktor.utils.io.ByteReadChannel r7, e4.p r8, S3.c<? super java.lang.Integer> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.read(io.ktor.utils.io.ByteReadChannel, e4.p, S3.c):java.lang.Object");
    }

    private static final Object read$$forInline(ByteReadChannel byteReadChannel, p pVar, S3.c<? super Integer> cVar) {
        if (!byteReadChannel.isClosedForRead()) {
            if (byteReadChannel.getReadBuffer().z()) {
                ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, cVar, 1, null);
            }
            if (!byteReadChannel.isClosedForRead()) {
                S5.a aVarA = byteReadChannel.getReadBuffer().a();
                if (aVarA.z()) {
                    throw new IllegalArgumentException("Buffer is empty");
                }
                S5.j jVar = aVarA.f8782k;
                l.c(jVar);
                int iIntValue = ((Number) pVar.invoke(jVar.a, Integer.valueOf(jVar.f8801b), Integer.valueOf(jVar.f8802c), null)).intValue();
                if (iIntValue != 0) {
                    if (iIntValue < 0) {
                        throw new IllegalStateException("Returned negative read bytes count");
                    }
                    if (iIntValue > jVar.b()) {
                        throw new IllegalStateException("Returned too many bytes");
                    }
                    aVarA.n(iIntValue);
                }
                return Integer.valueOf(iIntValue);
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readAvailable(io.ktor.utils.io.ByteReadChannel r5, byte[] r6, int r7, int r8, S3.c<? super java.lang.Integer> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C12581
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.ByteReadChannelOperationsKt$readAvailable$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C12581) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readAvailable$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readAvailable$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = -1
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            int r8 = r0.I$1
            int r7 = r0.I$0
            java.lang.Object r5 = r0.L$1
            r6 = r5
            byte[] r6 = (byte[]) r6
            java.lang.Object r5 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r5 = (io.ktor.utils.io.ByteReadChannel) r5
            P3.r.Y(r9)
            goto L69
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            P3.r.Y(r9)
            boolean r9 = r5.isClosedForRead()
            if (r9 == 0) goto L4c
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r3)
            return r5
        L4c:
            S5.n r9 = r5.getReadBuffer()
            boolean r9 = r9.z()
            if (r9 == 0) goto L69
            r0.L$0 = r5
            r0.L$1 = r6
            r0.I$0 = r7
            r0.I$1 = r8
            r0.label = r4
            r9 = 0
            r2 = 0
            java.lang.Object r9 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r5, r9, r0, r4, r2)
            if (r9 != r1) goto L69
            return r1
        L69:
            boolean r9 = r5.isClosedForRead()
            if (r9 == 0) goto L75
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r3)
            return r5
        L75:
            S5.n r5 = r5.getReadBuffer()
            int r5 = io.ktor.utils.io.core.InputKt.readAvailable(r5, r6, r7, r8)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readAvailable(io.ktor.utils.io.ByteReadChannel, byte[], int, int, S3.c):java.lang.Object");
    }

    public static /* synthetic */ Object readAvailable$default(ByteReadChannel byteReadChannel, byte[] bArr, int i7, int i8, S3.c cVar, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = bArr.length - i7;
        }
        return readAvailable(byteReadChannel, bArr, i7, i8, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readBuffer(io.ktor.utils.io.ByteReadChannel r5, S3.c<? super S5.a> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C12591
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C12591) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            S5.a r5 = (S5.a) r5
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r2 = (io.ktor.utils.io.ByteReadChannel) r2
            P3.r.Y(r6)
            r6 = r5
            r5 = r2
            goto L41
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            P3.r.Y(r6)
            S5.a r6 = new S5.a
            r6.<init>()
        L41:
            boolean r2 = r5.isClosedForRead()
            if (r2 != 0) goto L5d
            S5.n r2 = r5.getReadBuffer()
            r6.M(r2)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            r2 = 0
            r4 = 0
            java.lang.Object r2 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r5, r2, r0, r3, r4)
            if (r2 != r1) goto L41
            return r1
        L5d:
            java.lang.Throwable r5 = r5.getClosedCause()
            if (r5 != 0) goto L64
            return r6
        L64:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readBuffer(io.ktor.utils.io.ByteReadChannel, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readByte(io.ktor.utils.io.ByteReadChannel r6, S3.c<? super java.lang.Byte> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C12601
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteReadChannelOperationsKt$readByte$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C12601) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readByte$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readByte$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.L$0
            S5.n r6 = (S5.n) r6
            P3.r.Y(r7)
            goto L50
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            P3.r.Y(r7)
            S5.n r7 = r6.getReadBuffer()
            boolean r2 = r7.z()
            if (r2 == 0) goto L62
            r0.L$0 = r7
            r0.label = r3
            r2 = 0
            r4 = 0
            java.lang.Object r6 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r6, r2, r0, r3, r4)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r5 = r7
            r7 = r6
            r6 = r5
        L50:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L5a
            r7 = r6
            goto L62
        L5a:
            java.io.EOFException r6 = new java.io.EOFException
            java.lang.String r7 = "Not enough data available"
            r6.<init>(r7)
            throw r6
        L62:
            byte r6 = r7.readByte()
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readByte(io.ktor.utils.io.ByteReadChannel, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006a -> B:12:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readByteArray(io.ktor.utils.io.ByteReadChannel r6, int r7, S3.c<? super byte[]> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C12611
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.ByteReadChannelOperationsKt$readByteArray$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C12611) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readByteArray$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readByteArray$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$2
            S5.l r7 = (S5.l) r7
            java.lang.Object r2 = r0.L$1
            S5.a r2 = (S5.a) r2
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r4 = (io.ktor.utils.io.ByteReadChannel) r4
            P3.r.Y(r8)
            r5 = r0
            r0 = r6
            r6 = r4
        L37:
            r4 = r2
            r2 = r5
            goto L6e
        L3a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L42:
            P3.r.Y(r8)
            S5.a r8 = new S5.a
            r8.<init>()
            r2 = r8
            r8 = r7
            r7 = r2
        L4d:
            int r4 = io.ktor.utils.io.core.BytePacketBuilderKt.getSize(r7)
            if (r4 >= r8) goto L77
            int r4 = io.ktor.utils.io.core.BytePacketBuilderKt.getSize(r7)
            int r4 = r8 - r4
            r0.L$0 = r6
            r0.L$1 = r2
            r0.L$2 = r7
            r0.I$0 = r8
            r0.label = r3
            java.lang.Object r4 = readPacket(r6, r4, r0)
            if (r4 != r1) goto L6a
            return r1
        L6a:
            r5 = r0
            r0 = r8
            r8 = r4
            goto L37
        L6e:
            S5.n r8 = (S5.n) r8
            io.ktor.utils.io.core.BytePacketBuilderKt.writePacket(r7, r8)
            r8 = r0
            r0 = r2
            r2 = r4
            goto L4d
        L77:
            byte[] r6 = S5.p.h(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readByteArray(io.ktor.utils.io.ByteReadChannel, int, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readDouble(io.ktor.utils.io.ByteReadChannel r4, S3.c<? super java.lang.Double> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C12621
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteReadChannelOperationsKt$readDouble$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C12621) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readDouble$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readDouble$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r4 = (io.ktor.utils.io.ByteReadChannel) r4
            P3.r.Y(r5)
            goto L43
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            P3.r.Y(r5)
            r0.L$0 = r4
            r0.label = r3
            r5 = 8
            java.lang.Object r5 = awaitUntilReadable(r4, r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            S5.n r4 = r4.getReadBuffer()
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.l.f(r5, r4)
            long r4 = r4.readLong()
            double r4 = java.lang.Double.longBitsToDouble(r4)
            java.lang.Double r0 = new java.lang.Double
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readDouble(io.ktor.utils.io.ByteReadChannel, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readFloat(io.ktor.utils.io.ByteReadChannel r4, S3.c<? super java.lang.Float> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C12631
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteReadChannelOperationsKt$readFloat$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C12631) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readFloat$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readFloat$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r4 = (io.ktor.utils.io.ByteReadChannel) r4
            P3.r.Y(r5)
            goto L42
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            P3.r.Y(r5)
            r0.L$0 = r4
            r0.label = r3
            r5 = 4
            java.lang.Object r5 = awaitUntilReadable(r4, r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            S5.n r4 = r4.getReadBuffer()
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.l.f(r5, r4)
            int r4 = r4.readInt()
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readFloat(io.ktor.utils.io.ByteReadChannel, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0059 -> B:29:0x0078). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006e -> B:28:0x0073). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readFully(io.ktor.utils.io.ByteReadChannel r8, byte[] r9, int r10, int r11, S3.c<? super O3.C> r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C12641
            if (r0 == 0) goto L13
            r0 = r12
            io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C12641) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readFully$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            java.lang.String r3 = "Channel is already closed"
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            int r8 = r0.I$1
            int r9 = r0.I$0
            java.lang.Object r10 = r0.L$1
            byte[] r10 = (byte[]) r10
            java.lang.Object r11 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r11 = (io.ktor.utils.io.ByteReadChannel) r11
            P3.r.Y(r12)
            goto L73
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            P3.r.Y(r12)
            if (r11 <= r10) goto L4f
            boolean r12 = r8.isClosedForRead()
            if (r12 != 0) goto L49
            goto L4f
        L49:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>(r3)
            throw r8
        L4f:
            if (r10 >= r11) goto L9d
            S5.n r12 = r8.getReadBuffer()
            boolean r12 = r12.z()
            if (r12 == 0) goto L78
            r0.L$0 = r8
            r0.L$1 = r9
            r0.I$0 = r11
            r0.I$1 = r10
            r0.label = r4
            r12 = 0
            r2 = 0
            java.lang.Object r12 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r8, r12, r0, r4, r2)
            if (r12 != r1) goto L6e
            return r1
        L6e:
            r7 = r11
            r11 = r8
            r8 = r10
            r10 = r9
            r9 = r7
        L73:
            r7 = r10
            r10 = r8
            r8 = r11
            r11 = r9
            r9 = r7
        L78:
            boolean r12 = r8.isClosedForRead()
            if (r12 != 0) goto L97
            int r12 = r11 - r10
            S5.n r2 = r8.getReadBuffer()
            long r5 = io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(r2)
            int r2 = (int) r5
            int r12 = java.lang.Math.min(r12, r2)
            S5.n r2 = r8.getReadBuffer()
            int r12 = r12 + r10
            S5.p.l(r2, r9, r10, r12)
            r10 = r12
            goto L4f
        L97:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>(r3)
            throw r8
        L9d:
            O3.C r8 = O3.C.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readFully(io.ktor.utils.io.ByteReadChannel, byte[], int, int, S3.c):java.lang.Object");
    }

    public static /* synthetic */ Object readFully$default(ByteReadChannel byteReadChannel, byte[] bArr, int i7, int i8, S3.c cVar, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = bArr.length;
        }
        return readFully(byteReadChannel, bArr, i7, i8, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readInt(io.ktor.utils.io.ByteReadChannel r4, S3.c<? super java.lang.Integer> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C12651
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteReadChannelOperationsKt$readInt$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C12651) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readInt$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readInt$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r4 = (io.ktor.utils.io.ByteReadChannel) r4
            P3.r.Y(r5)
            goto L42
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            P3.r.Y(r5)
            r0.L$0 = r4
            r0.label = r3
            r5 = 4
            java.lang.Object r5 = awaitUntilReadable(r4, r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            S5.n r4 = r4.getReadBuffer()
            int r4 = r4.readInt()
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readInt(io.ktor.utils.io.ByteReadChannel, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readLong(io.ktor.utils.io.ByteReadChannel r4, S3.c<? super java.lang.Long> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C12661
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteReadChannelOperationsKt$readLong$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C12661) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readLong$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readLong$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r4 = (io.ktor.utils.io.ByteReadChannel) r4
            P3.r.Y(r5)
            goto L43
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            P3.r.Y(r5)
            r0.L$0 = r4
            r0.label = r3
            r5 = 8
            java.lang.Object r5 = awaitUntilReadable(r4, r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            S5.n r4 = r4.getReadBuffer()
            long r4 = r4.readLong()
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readLong(io.ktor.utils.io.ByteReadChannel, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0053 -> B:24:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0066 -> B:23:0x0068). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readPacket(io.ktor.utils.io.ByteReadChannel r11, int r12, S3.c<? super S5.n> r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C12671
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C12671) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readPacket$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r11 = r0.I$0
            java.lang.Object r12 = r0.L$1
            S5.a r12 = (S5.a) r12
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r2 = (io.ktor.utils.io.ByteReadChannel) r2
            P3.r.Y(r13)
            goto L68
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            P3.r.Y(r13)
            S5.a r13 = new S5.a
            r13.<init>()
            r10 = r13
            r13 = r12
            r12 = r10
        L44:
            long r4 = r12.f8784m
            long r6 = (long) r13
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L9a
            S5.n r2 = r11.getReadBuffer()
            boolean r2 = r2.z()
            if (r2 == 0) goto L6a
            r0.L$0 = r11
            r0.L$1 = r12
            r0.I$0 = r13
            r0.label = r3
            r2 = 0
            r4 = 0
            java.lang.Object r2 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r11, r2, r0, r3, r4)
            if (r2 != r1) goto L66
            return r1
        L66:
            r2 = r11
            r11 = r13
        L68:
            r13 = r11
            r11 = r2
        L6a:
            boolean r2 = r11.isClosedForRead()
            if (r2 != 0) goto L9a
            S5.n r2 = r11.getReadBuffer()
            long r4 = io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(r2)
            long r6 = (long) r13
            long r8 = r12.f8784m
            long r8 = r6 - r8
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L8c
            S5.n r2 = r11.getReadBuffer()
            long r4 = r12.f8784m
            long r6 = r6 - r4
            r2.t(r12, r6)
            goto L44
        L8c:
            S5.n r2 = r11.getReadBuffer()
            long r4 = r2.B(r12)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            goto L44
        L9a:
            long r0 = r12.f8784m
            long r2 = (long) r13
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 < 0) goto La2
            return r12
        La2:
            java.io.EOFException r11 = new java.io.EOFException
            java.lang.String r0 = "Not enough data available, required "
            java.lang.String r1 = " bytes but only "
            java.lang.StringBuilder r13 = b1.AbstractC0703b.p(r13, r0, r1)
            long r0 = r12.f8784m
            java.lang.String r12 = " available"
            java.lang.String r12 = A6.b.f(r0, r12, r13)
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readPacket(io.ktor.utils.io.ByteReadChannel, int, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readRemaining(io.ktor.utils.io.ByteReadChannel r5, S3.c<? super S5.n> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C12681
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C12681) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            S5.l r5 = (S5.l) r5
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r2 = (io.ktor.utils.io.ByteReadChannel) r2
            P3.r.Y(r6)
            r6 = r5
            r5 = r2
            goto L40
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            P3.r.Y(r6)
            S5.l r6 = io.ktor.utils.io.core.BytePacketBuilderKt.BytePacketBuilder()
        L40:
            boolean r2 = r5.isClosedForRead()
            if (r2 != 0) goto L5c
            S5.n r2 = r5.getReadBuffer()
            r6.M(r2)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            r2 = 0
            r4 = 0
            java.lang.Object r2 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r5, r2, r0, r3, r4)
            if (r2 != r1) goto L40
            return r1
        L5c:
            rethrowCloseCauseIfNeeded(r5)
            S5.a r5 = r6.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(io.ktor.utils.io.ByteReadChannel, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readShort(io.ktor.utils.io.ByteReadChannel r4, S3.c<? super java.lang.Short> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C12701
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteReadChannelOperationsKt$readShort$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C12701) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readShort$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readShort$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r4 = (io.ktor.utils.io.ByteReadChannel) r4
            P3.r.Y(r5)
            goto L42
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            P3.r.Y(r5)
            r0.L$0 = r4
            r0.label = r3
            r5 = 2
            java.lang.Object r5 = awaitUntilReadable(r4, r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            S5.n r4 = r4.getReadBuffer()
            short r4 = r4.readShort()
            java.lang.Short r5 = new java.lang.Short
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readShort(io.ktor.utils.io.ByteReadChannel, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readUTF8Line(io.ktor.utils.io.ByteReadChannel r5, int r6, S3.c<? super java.lang.String> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C12711
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8Line$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C12711) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8Line$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8Line$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            java.lang.StringBuilder r5 = (java.lang.StringBuilder) r5
            P3.r.Y(r7)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            P3.r.Y(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r5 = readUTF8LineTo(r5, r7, r6, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            r4 = r7
            r7 = r5
            r5 = r4
        L49:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            if (r6 != 0) goto L53
            r5 = 0
            return r5
        L53:
            java.lang.String r5 = r5.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readUTF8Line(io.ktor.utils.io.ByteReadChannel, int, S3.c):java.lang.Object");
    }

    public static /* synthetic */ Object readUTF8Line$default(ByteReadChannel byteReadChannel, int i7, S3.c cVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        return readUTF8Line(byteReadChannel, i7, cVar);
    }

    public static final Object readUTF8LineTo(ByteReadChannel byteReadChannel, Appendable appendable, int i7, S3.c<? super Boolean> cVar) {
        return m195readUTF8LineToRRvyBJ8(byteReadChannel, appendable, i7, LineEndingMode.INSTANCE.m206getAnyf0jXZW8(), cVar);
    }

    public static /* synthetic */ Object readUTF8LineTo$default(ByteReadChannel byteReadChannel, Appendable appendable, int i7, S3.c cVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        return readUTF8LineTo(byteReadChannel, appendable, i7, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
    
        if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r0, 0, r2, 1, null) == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0172, code lost:
    
        if (r14.f8784m >= r4) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0174, code lost:
    
        r2.L$0 = r6;
        r2.L$1 = r9;
        r2.L$2 = r15;
        r2.L$3 = r14;
        r2.I$0 = r4;
        r2.I$1 = r0;
        r2.label = 3;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0188, code lost:
    
        if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r6, 0, r2, 1, null) != r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018a, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01aa, code lost:
    
        throw new io.ktor.utils.io.charsets.TooLongLineException("Line exceeds limit of " + r4 + " characters");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x01cc: INVOKE (r15 I:java.lang.AutoCloseable), (r1 I:java.lang.Throwable) STATIC call: q0.c.q(java.lang.AutoCloseable, java.lang.Throwable):void A[MD:(java.lang.AutoCloseable, java.lang.Throwable):void (m)] (LINE:461), block:B:81:0x01cc */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8 A[Catch: all -> 0x004c, LOOP:0: B:37:0x00c8->B:61:0x0168, LOOP_START, TryCatch #1 {all -> 0x004c, blocks: (B:14:0x0045, B:35:0x00c2, B:37:0x00c8, B:39:0x00d2, B:41:0x00de, B:43:0x00e8, B:48:0x0102, B:50:0x0114, B:52:0x0136, B:51:0x012d, B:57:0x014c, B:61:0x0168, B:62:0x016d, B:64:0x0174, B:68:0x018f, B:69:0x01aa, B:70:0x01ab, B:74:0x01b7, B:76:0x01bd, B:21:0x006b), top: B:85:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0114 A[Catch: all -> 0x004c, TryCatch #1 {all -> 0x004c, blocks: (B:14:0x0045, B:35:0x00c2, B:37:0x00c8, B:39:0x00d2, B:41:0x00de, B:43:0x00e8, B:48:0x0102, B:50:0x0114, B:52:0x0136, B:51:0x012d, B:57:0x014c, B:61:0x0168, B:62:0x016d, B:64:0x0174, B:68:0x018f, B:69:0x01aa, B:70:0x01ab, B:74:0x01b7, B:76:0x01bd, B:21:0x006b), top: B:85:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012d A[Catch: all -> 0x004c, TryCatch #1 {all -> 0x004c, blocks: (B:14:0x0045, B:35:0x00c2, B:37:0x00c8, B:39:0x00d2, B:41:0x00de, B:43:0x00e8, B:48:0x0102, B:50:0x0114, B:52:0x0136, B:51:0x012d, B:57:0x014c, B:61:0x0168, B:62:0x016d, B:64:0x0174, B:68:0x018f, B:69:0x01aa, B:70:0x01ab, B:74:0x01b7, B:76:0x01bd, B:21:0x006b), top: B:85:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ab A[Catch: all -> 0x004c, TryCatch #1 {all -> 0x004c, blocks: (B:14:0x0045, B:35:0x00c2, B:37:0x00c8, B:39:0x00d2, B:41:0x00de, B:43:0x00e8, B:48:0x0102, B:50:0x0114, B:52:0x0136, B:51:0x012d, B:57:0x014c, B:61:0x0168, B:62:0x016d, B:64:0x0174, B:68:0x018f, B:69:0x01aa, B:70:0x01ab, B:74:0x01b7, B:76:0x01bd, B:21:0x006b), top: B:85:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0188 -> B:67:0x018b). Please report as a decompilation issue!!! */
    @io.ktor.utils.io.InternalAPI
    /* renamed from: readUTF8LineTo-RRvyBJ8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m195readUTF8LineToRRvyBJ8(io.ktor.utils.io.ByteReadChannel r18, java.lang.Appendable r19, int r20, int r21, S3.c<? super java.lang.Boolean> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.m195readUTF8LineToRRvyBJ8(io.ktor.utils.io.ByteReadChannel, java.lang.Appendable, int, int, S3.c):java.lang.Object");
    }

    /* renamed from: readUTF8LineTo-RRvyBJ8$default, reason: not valid java name */
    public static /* synthetic */ Object m196readUTF8LineToRRvyBJ8$default(ByteReadChannel byteReadChannel, Appendable appendable, int i7, int i8, S3.c cVar, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        if ((i9 & 4) != 0) {
            i8 = LineEndingMode.INSTANCE.m206getAnyf0jXZW8();
        }
        return m195readUTF8LineToRRvyBJ8(byteReadChannel, appendable, i7, i8, cVar);
    }

    private static final void readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(int i7, int i8) throws IOException {
        if (LineEndingMode.m199containslTjpP64(i7, i8)) {
            return;
        }
        throw new IOException("Unexpected line ending " + ((Object) LineEndingMode.m204toStringimpl(i8)) + ", while expected " + ((Object) LineEndingMode.m204toStringimpl(i7)));
    }

    public static final Object readUntil(ByteReadChannel byteReadChannel, T5.a aVar, ByteWriteChannel byteWriteChannel, long j7, boolean z7, S3.c<? super Long> cVar) {
        return new ByteChannelScanner(byteReadChannel, aVar, byteWriteChannel, j7).findNext$ktor_io(z7, cVar);
    }

    public static /* synthetic */ Object readUntil$default(ByteReadChannel byteReadChannel, T5.a aVar, ByteWriteChannel byteWriteChannel, long j7, boolean z7, S3.c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            j7 = Long.MAX_VALUE;
        }
        long j8 = j7;
        if ((i7 & 8) != 0) {
            z7 = false;
        }
        return readUntil(byteReadChannel, aVar, byteWriteChannel, j8, z7, cVar);
    }

    public static final ReaderJob reader(A a, h hVar, boolean z7, n nVar) {
        l.f("<this>", a);
        l.f("coroutineContext", hVar);
        l.f("block", nVar);
        return reader(a, hVar, new ByteChannel(false, 1, null), nVar);
    }

    public static /* synthetic */ ReaderJob reader$default(A a, h hVar, boolean z7, n nVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            hVar = i.f8767k;
        }
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        return reader(a, hVar, z7, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C reader$lambda$6$lambda$5(ByteChannel byteChannel, Throwable th) {
        if (th != null && !byteChannel.isClosedForRead()) {
            byteChannel.cancel(th);
        }
        return C.a;
    }

    @InternalAPI
    public static final void rethrowCloseCauseIfNeeded(ByteReadChannel byteReadChannel) throws Throwable {
        l.f("<this>", byteReadChannel);
        Throwable closedCause = byteReadChannel.getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (discard(r5, r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object skipIfFound(io.ktor.utils.io.ByteReadChannel r5, T5.a r6, S3.c<? super java.lang.Boolean> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C12741
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteReadChannelOperationsKt$skipIfFound$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C12741) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$skipIfFound$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$skipIfFound$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            P3.r.Y(r7)
            goto L6a
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            T5.a r6 = (T5.a) r6
            java.lang.Object r5 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r5 = (io.ktor.utils.io.ByteReadChannel) r5
            P3.r.Y(r7)
            goto L52
        L3f:
            P3.r.Y(r7)
            byte[] r7 = r6.f9118k
            int r7 = r7.length
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = peek(r5, r7, r0)
            if (r7 != r1) goto L52
            goto L69
        L52:
            boolean r7 = kotlin.jvm.internal.l.a(r7, r6)
            if (r7 == 0) goto L6d
            byte[] r6 = r6.f9118k
            int r6 = r6.length
            long r6 = (long) r6
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r5 = discard(r5, r6, r0)
            if (r5 != r1) goto L6a
        L69:
            return r1
        L6a:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L6d:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(io.ktor.utils.io.ByteReadChannel, T5.a, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object toByteArray(io.ktor.utils.io.ByteReadChannel r4, S3.c<? super byte[]> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C12751
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ByteReadChannelOperationsKt$toByteArray$1 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C12751) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$toByteArray$1 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$toByteArray$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            P3.r.Y(r5)
            r0.label = r3
            java.lang.Object r5 = readBuffer(r4, r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            S5.a r5 = (S5.a) r5
            r4 = 0
            r0 = 0
            byte[] r4 = io.ktor.utils.io.core.BuffersKt.readBytes$default(r5, r4, r3, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.toByteArray(io.ktor.utils.io.ByteReadChannel, S3.c):java.lang.Object");
    }

    public static final ReaderJob reader(A a, h hVar, ByteChannel byteChannel, n nVar) {
        l.f("<this>", a);
        l.f("coroutineContext", hVar);
        l.f("channel", byteChannel);
        l.f("block", nVar);
        u0 u0VarX = D.x(a, hVar, new ByteReadChannelOperationsKt$reader$job$1(nVar, byteChannel, null), 2);
        u0VarX.x(new a(byteChannel, 1));
        return new ReaderJob(CloseHookByteWriteChannelKt.onClose(byteChannel, new C12731(u0VarX, null)), u0VarX);
    }

    @InternalAPI
    public static final void rethrowCloseCauseIfNeeded(ByteWriteChannel byteWriteChannel) throws Throwable {
        l.f("<this>", byteWriteChannel);
        Throwable closedCause = byteWriteChannel.getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    @InternalAPI
    public static final void rethrowCloseCauseIfNeeded(ByteChannel byteChannel) throws Throwable {
        l.f("<this>", byteChannel);
        Throwable closedCause = byteChannel.getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0051 -> B:25:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0064 -> B:24:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readBuffer(io.ktor.utils.io.ByteReadChannel r8, int r9, S3.c<? super S5.a> r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.AnonymousClass3
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$3 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.AnonymousClass3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$3 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readBuffer$3
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r8 = r0.I$0
            java.lang.Object r9 = r0.L$1
            S5.a r9 = (S5.a) r9
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r2 = (io.ktor.utils.io.ByteReadChannel) r2
            P3.r.Y(r10)
            goto L67
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            P3.r.Y(r10)
            S5.a r10 = new S5.a
            r10.<init>()
        L41:
            if (r9 <= 0) goto L81
            boolean r2 = r8.isClosedForRead()
            if (r2 != 0) goto L81
            S5.n r2 = r8.getReadBuffer()
            boolean r2 = r2.z()
            if (r2 == 0) goto L6a
            r0.L$0 = r8
            r0.L$1 = r10
            r0.I$0 = r9
            r0.label = r3
            r2 = 0
            r4 = 0
            java.lang.Object r2 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r8, r2, r0, r3, r4)
            if (r2 != r1) goto L64
            return r1
        L64:
            r2 = r8
            r8 = r9
            r9 = r10
        L67:
            r10 = r9
            r9 = r8
            r8 = r2
        L6a:
            long r4 = (long) r9
            S5.n r2 = r8.getReadBuffer()
            long r6 = io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(r2)
            long r4 = java.lang.Math.min(r4, r6)
            S5.n r2 = r8.getReadBuffer()
            r2.t(r10, r4)
            int r2 = (int) r4
            int r9 = r9 - r2
            goto L41
        L81:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readBuffer(io.ktor.utils.io.ByteReadChannel, int, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readRemaining(io.ktor.utils.io.ByteReadChannel r8, long r9, S3.c<? super S5.n> r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof io.ktor.utils.io.ByteReadChannelOperationsKt.C12692
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$2 r0 = (io.ktor.utils.io.ByteReadChannelOperationsKt.C12692) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$2 r0 = new io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$2
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            long r8 = r0.J$0
            java.lang.Object r10 = r0.L$1
            S5.l r10 = (S5.l) r10
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r2 = (io.ktor.utils.io.ByteReadChannel) r2
            P3.r.Y(r11)
            r11 = r10
            r9 = r8
            r8 = r2
            goto L43
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            P3.r.Y(r11)
            S5.l r11 = io.ktor.utils.io.core.BytePacketBuilderKt.BytePacketBuilder()
        L43:
            boolean r2 = r8.isClosedForRead()
            if (r2 != 0) goto L8d
            r4 = 0
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 <= 0) goto L8d
            S5.n r2 = r8.getReadBuffer()
            long r6 = io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(r2)
            int r2 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r2 < 0) goto L73
            S5.n r2 = r8.getReadBuffer()
            long r4 = io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(r2)
            long r4 = r9 - r4
            S5.n r9 = r8.getReadBuffer()
            long r9 = r9.B(r11)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r9)
            goto L7a
        L73:
            S5.n r2 = r8.getReadBuffer()
            r2.t(r11, r9)
        L7a:
            r0.L$0 = r8
            r0.L$1 = r11
            r0.J$0 = r4
            r0.label = r3
            r9 = 0
            r10 = 0
            java.lang.Object r9 = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r8, r9, r0, r3, r10)
            if (r9 != r1) goto L8b
            return r1
        L8b:
            r9 = r4
            goto L43
        L8d:
            S5.a r8 = r11.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(io.ktor.utils.io.ByteReadChannel, long, S3.c):java.lang.Object");
    }

    public static final int readAvailable(ByteReadChannel byteReadChannel, int i7, k kVar) {
        l.f("<this>", byteReadChannel);
        l.f("block", kVar);
        if (i7 <= 0) {
            throw new IllegalArgumentException("min should be positive");
        }
        if (i7 <= 1048576) {
            if (getAvailableForRead(byteReadChannel) < i7) {
                return -1;
            }
            return ((Number) kVar.invoke(byteReadChannel.getReadBuffer().a())).intValue();
        }
        throw new IllegalArgumentException(c0.a(i7, "Min(", ") shouldn't be greater than 1048576").toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
    
        if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r1, 0, r13, r7, null) == r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
    
        if (r0 != r2) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.ByteWriteChannel] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00d7 -> B:20:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object copyTo(io.ktor.utils.io.ByteReadChannel r17, io.ktor.utils.io.ByteWriteChannel r18, long r19, S3.c<? super java.lang.Long> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelOperationsKt.copyTo(io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel, long, S3.c):java.lang.Object");
    }
}
