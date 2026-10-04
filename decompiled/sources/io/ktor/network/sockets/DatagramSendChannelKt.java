package io.ktor.network.sockets;

import O3.C;
import S5.n;
import e4.k;
import io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0004\u001a\u00020\u00022\u0016\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\"\"\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\"\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/Function1;", "", "LO3/C;", "handler", "failInvokeOnClose", "(Le4/k;)V", "LS5/n;", "Ljava/nio/ByteBuffer;", "buffer", "writeMessageTo", "(LS5/n;Ljava/nio/ByteBuffer;)V", "CLOSED", "Le4/k;", "CLOSED_INVOKED", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatagramSendChannelKt {
    private static final k CLOSED = new io.ktor.client.request.a(26);
    private static final k CLOSED_INVOKED = new io.ktor.client.request.a(27);

    /* JADX INFO: Access modifiers changed from: private */
    public static final C CLOSED$lambda$0(Throwable th) {
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C CLOSED_INVOKED$lambda$1(Throwable th) {
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void failInvokeOnClose(k kVar) {
        String str;
        if (kVar == CLOSED_INVOKED) {
            str = "Another handler was already registered and successfully invoked";
        } else {
            str = "Another handler was already registered: " + kVar;
        }
        throw new IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeMessageTo(n nVar, ByteBuffer byteBuffer) {
        ByteReadPacketExtensions_jvmKt.readFully(nVar, byteBuffer);
        byteBuffer.flip();
    }
}
