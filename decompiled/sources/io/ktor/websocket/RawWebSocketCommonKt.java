package io.ktor.websocket;

import K3.b;
import S5.n;
import U3.c;
import U3.e;
import io.ktor.utils.io.core.ByteReadPacketKt;
import io.ktor.utils.io.core.MemoryKt;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a$\u0010\u000b\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0087@¢\u0006\u0004\b\u000b\u0010\f\u001a$\u0010\u0011\u001a\u00020\u0006*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0001H\u0087@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LS5/n;", "", "maskKey", "mask", "(LS5/n;I)LS5/n;", "Lio/ktor/utils/io/ByteWriteChannel;", "Lio/ktor/websocket/Frame;", "frame", "", "masking", "LO3/C;", "writeFrame", "(Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/websocket/Frame;ZLS3/c;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "", "maxFrameSize", "lastOpcode", "readFrame", "(Lio/ktor/utils/io/ByteReadChannel;JILS3/c;)Ljava/lang/Object;", "ktor-websockets"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RawWebSocketCommonKt {

    @e(c = "io.ktor.websocket.RawWebSocketCommonKt", f = "RawWebSocketCommon.kt", l = {226, 227, 246, 247, 255, 263}, m = "readFrame")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.websocket.RawWebSocketCommonKt$readFrame$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        byte B$0;
        byte B$1;
        int I$0;
        int I$1;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RawWebSocketCommonKt.readFrame(null, 0L, 0, this);
        }
    }

    @e(c = "io.ktor.websocket.RawWebSocketCommonKt", f = "RawWebSocketCommon.kt", l = {183, 193, 196, 197, 205, 211}, m = "writeFrame")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.websocket.RawWebSocketCommonKt$writeFrame$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12891 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C12891(S3.c<? super C12891> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RawWebSocketCommonKt.writeFrame(null, null, false, this);
        }
    }

    private static final n mask(n nVar, int i7) {
        return (n) MemoryKt.withMemory(4, new b(i7, 2, nVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n mask$lambda$2(int i7, n nVar, byte[] bArr) {
        l.f("maskMemory", bArr);
        MemoryKt.storeIntAt(bArr, 0, i7);
        S5.a aVar = new S5.a();
        int remaining = (int) ByteReadPacketKt.getRemaining(nVar);
        for (int i8 = 0; i8 < remaining; i8++) {
            aVar.D((byte) (nVar.readByte() ^ bArr[i8 % 4]));
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fe  */
    @io.ktor.utils.io.InternalAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readFrame(io.ktor.utils.io.ByteReadChannel r18, long r19, int r21, S3.c<? super io.ktor.websocket.Frame> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.RawWebSocketCommonKt.readFrame(io.ktor.utils.io.ByteReadChannel, long, int, S3.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x010d, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeLong(r6, r13, r0) == r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0110, code lost:
    
        r12 = r14;
        r13 = r2;
        r14 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0125, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeShort(r6, (short) r13, r0) == r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015b, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writePacket(r6, r13, r0) == r1) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @io.ktor.utils.io.InternalAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object writeFrame(io.ktor.utils.io.ByteWriteChannel r12, io.ktor.websocket.Frame r13, boolean r14, S3.c<? super O3.C> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.RawWebSocketCommonKt.writeFrame(io.ktor.utils.io.ByteWriteChannel, io.ktor.websocket.Frame, boolean, S3.c):java.lang.Object");
    }
}
