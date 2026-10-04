package io.ktor.util;

import S5.n;
import io.ktor.utils.io.core.ByteReadPacketKt;
import io.ktor.utils.io.core.InputKt;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LS5/n;", "Lio/ktor/utils/io/core/Input;", "Ljava/io/InputStream;", "asStream", "(LS5/n;)Ljava/io/InputStream;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InputJvmKt {
    public static final InputStream asStream(final n nVar) {
        l.f("<this>", nVar);
        return new InputStream() { // from class: io.ktor.util.InputJvmKt.asStream.1
            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws Exception {
                nVar.close();
            }

            @Override // java.io.InputStream
            public int read() {
                if (InputKt.getEndOfInput(nVar)) {
                    return -1;
                }
                return nVar.readByte();
            }

            @Override // java.io.InputStream
            public long skip(long count) {
                return ByteReadPacketKt.discard(nVar, count);
            }

            @Override // java.io.InputStream
            public int read(byte[] buffer, int offset, int length) {
                l.f("buffer", buffer);
                if (InputKt.getEndOfInput(nVar)) {
                    return -1;
                }
                return InputKt.readAvailable(nVar, buffer, offset, length);
            }
        };
    }
}
