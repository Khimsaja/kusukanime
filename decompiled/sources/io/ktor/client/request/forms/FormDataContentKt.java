package io.ktor.client.request.forms;

import O3.C;
import S3.c;
import S5.n;
import f6.AbstractC0915m;
import i4.AbstractC1079e;
import io.ktor.sse.ServerSentEventKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.core.StringsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a \u0010\b\u001a\u00020\u0007*\u00060\u0003j\u0002`\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "generateBoundary", "()Ljava/lang/String;", "LS5/n;", "Lio/ktor/utils/io/core/Input;", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "LO3/C;", "copyTo", "(LS5/n;Lio/ktor/utils/io/ByteWriteChannel;LS3/c;)Ljava/lang/Object;", "", "RN_BYTES", "[B", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FormDataContentKt {
    private static final byte[] RN_BYTES = StringsKt.toByteArray$default(ServerSentEventKt.END_OF_LINE, null, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object copyTo(n nVar, ByteWriteChannel byteWriteChannel, c<? super C> cVar) throws Throwable {
        Object objWritePacket = ByteWriteChannelOperationsKt.writePacket(byteWriteChannel, nVar, cVar);
        return objWritePacket == T3.a.f9048k ? objWritePacket : C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String generateBoundary() {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < 32; i7++) {
            int iD = AbstractC1079e.f12024k.d();
            AbstractC0915m.k(16);
            String string = Integer.toString(iD, 16);
            l.e("toString(...)", string);
            sb.append(string);
        }
        return AbstractC2510o.I0(70, sb.toString());
    }
}
