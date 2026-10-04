package io.ktor.websocket;

import io.ktor.util.GzipHeaderFlags;
import java.nio.ByteBuffer;
import kotlin.Metadata;

@Metadata(d1 = {"io/ktor/websocket/UtilsKt__UtilsJvmKt", "io/ktor/websocket/UtilsKt__UtilsKt"}, k = GzipHeaderFlags.EXTRA, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UtilsKt {
    public static final int flagAt(boolean z7, int i7) {
        return UtilsKt__UtilsKt.flagAt(z7, i7);
    }

    public static final int getOUTGOING_CHANNEL_CAPACITY() {
        return UtilsKt__UtilsJvmKt.getOUTGOING_CHANNEL_CAPACITY();
    }

    public static final byte xor(byte b4, byte b7) {
        return UtilsKt__UtilsKt.xor(b4, b7);
    }

    public static final void xor(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        UtilsKt__UtilsJvmKt.xor(byteBuffer, byteBuffer2);
    }
}
