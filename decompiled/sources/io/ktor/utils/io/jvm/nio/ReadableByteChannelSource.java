package io.ktor.utils.io.jvm.nio;

import S5.a;
import S5.f;
import S5.j;
import S5.p;
import b1.AbstractC0703b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/ktor/utils/io/jvm/nio/ReadableByteChannelSource;", "LS5/f;", "Ljava/nio/channels/ReadableByteChannel;", "channel", "<init>", "(Ljava/nio/channels/ReadableByteChannel;)V", "LS5/a;", "sink", "", "byteCount", "readAtMostTo", "(LS5/a;J)J", "LO3/C;", "close", "()V", "", "toString", "()Ljava/lang/String;", "Ljava/nio/channels/ReadableByteChannel;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
class ReadableByteChannelSource implements f {
    private final ReadableByteChannel channel;

    public ReadableByteChannelSource(ReadableByteChannel readableByteChannel) {
        l.f("channel", readableByteChannel);
        this.channel = readableByteChannel;
    }

    @Override // java.lang.AutoCloseable
    public void close() throws IOException {
        this.channel.close();
    }

    @Override // S5.f
    public long readAtMostTo(a sink, long byteCount) throws IOException {
        l.f("sink", sink);
        if (byteCount <= 0) {
            return 0L;
        }
        int iMin = (int) Math.min(byteCount, 2147483647L);
        j jVarM = sink.m(1);
        int i7 = jVarM.f8802c;
        byte[] bArr = jVarM.a;
        int i8 = this.channel.read(ByteBuffer.wrap(bArr, i7, Math.min(iMin, bArr.length - i7)));
        int iMax = Math.max(i8, 0);
        if (iMax == 1) {
            jVarM.f8802c += iMax;
            sink.f8784m += iMax;
        } else {
            if (iMax < 0 || iMax > jVarM.a()) {
                StringBuilder sbP = AbstractC0703b.p(iMax, "Invalid number of bytes written: ", ". Should be in 0..");
                sbP.append(jVarM.a());
                throw new IllegalStateException(sbP.toString().toString());
            }
            if (iMax != 0) {
                jVarM.f8802c += iMax;
                sink.f8784m += iMax;
            } else if (p.f(jVarM)) {
                sink.i();
            }
        }
        return i8;
    }

    public String toString() {
        return "ReadableByteChannelSource(" + this.channel + ')';
    }
}
