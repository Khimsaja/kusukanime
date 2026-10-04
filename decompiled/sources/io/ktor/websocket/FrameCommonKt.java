package io.ktor.websocket;

import io.ktor.utils.io.charsets.EncodingKt;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import io.ktor.utils.io.core.StringsKt;
import io.ktor.websocket.Frame;
import java.nio.charset.CharsetDecoder;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.C2496a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/websocket/Frame$Text;", "", "readText", "(Lio/ktor/websocket/Frame$Text;)Ljava/lang/String;", "Lio/ktor/websocket/Frame;", "", "readBytes", "(Lio/ktor/websocket/Frame;)[B", "Lio/ktor/websocket/Frame$Close;", "Lio/ktor/websocket/CloseReason;", "readReason", "(Lio/ktor/websocket/Frame$Close;)Lio/ktor/websocket/CloseReason;", "ktor-websockets"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FrameCommonKt {
    public static final byte[] readBytes(Frame frame) {
        l.f("<this>", frame);
        byte[] data = frame.getData();
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        l.e("copyOf(...)", bArrCopyOf);
        return bArrCopyOf;
    }

    public static final CloseReason readReason(Frame.Close close) {
        l.f("<this>", close);
        if (close.getData().length < 2) {
            return null;
        }
        S5.a aVar = new S5.a();
        BytePacketBuilderKt.writeFully$default(aVar, close.getData(), 0, 0, 6, null);
        return new CloseReason(aVar.readShort(), StringsKt.readText$default(aVar, null, 0, 3, null));
    }

    public static final String readText(Frame.Text text) {
        l.f("<this>", text);
        if (!text.getFin()) {
            throw new IllegalArgumentException("Text could be only extracted from non-fragmented frame");
        }
        CharsetDecoder charsetDecoderNewDecoder = C2496a.f19036b.newDecoder();
        l.e("newDecoder(...)", charsetDecoderNewDecoder);
        S5.a aVar = new S5.a();
        BytePacketBuilderKt.writeFully$default(aVar, text.getData(), 0, 0, 6, null);
        return EncodingKt.decode$default(charsetDecoderNewDecoder, aVar, 0, 2, null);
    }
}
