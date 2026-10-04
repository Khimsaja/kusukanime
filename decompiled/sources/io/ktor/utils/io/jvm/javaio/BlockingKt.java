package io.ktor.utils.io.jvm.javaio;

import H5.D;
import H5.InterfaceC0265f0;
import S3.i;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelKt;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannel;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "LH5/f0;", "parent", "Ljava/io/InputStream;", "toInputStream", "(Lio/ktor/utils/io/ByteReadChannel;LH5/f0;)Ljava/io/InputStream;", "Lio/ktor/utils/io/ByteWriteChannel;", "Ljava/io/OutputStream;", "toOutputStream", "(Lio/ktor/utils/io/ByteWriteChannel;)Ljava/io/OutputStream;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlockingKt {
    public static final InputStream toInputStream(final ByteReadChannel byteReadChannel, InterfaceC0265f0 interfaceC0265f0) {
        l.f("<this>", byteReadChannel);
        return new InputStream() { // from class: io.ktor.utils.io.jvm.javaio.BlockingKt.toInputStream.1
            private final void blockingWait() throws Throwable {
                D.B(i.f8767k, new BlockingKt$toInputStream$1$blockingWait$1(byteReadChannel, null));
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                ByteReadChannelKt.cancel(byteReadChannel);
            }

            @Override // java.io.InputStream
            public int read() throws Throwable {
                if (byteReadChannel.isClosedForRead()) {
                    return -1;
                }
                if (byteReadChannel.getReadBuffer().z()) {
                    blockingWait();
                }
                if (byteReadChannel.isClosedForRead()) {
                    return -1;
                }
                return byteReadChannel.getReadBuffer().readByte() & 255;
            }

            @Override // java.io.InputStream
            public int read(byte[] b4, int off, int len) throws Throwable {
                l.f("b", b4);
                if (byteReadChannel.isClosedForRead()) {
                    return -1;
                }
                if (byteReadChannel.getReadBuffer().z()) {
                    blockingWait();
                }
                int iC = byteReadChannel.getReadBuffer().C(b4, off, Math.min(ByteReadChannelOperationsKt.getAvailableForRead(byteReadChannel), len) + off);
                return iC >= 0 ? iC : byteReadChannel.isClosedForRead() ? -1 : 0;
            }
        };
    }

    public static /* synthetic */ InputStream toInputStream$default(ByteReadChannel byteReadChannel, InterfaceC0265f0 interfaceC0265f0, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            interfaceC0265f0 = null;
        }
        return toInputStream(byteReadChannel, interfaceC0265f0);
    }

    public static final OutputStream toOutputStream(final ByteWriteChannel byteWriteChannel) {
        l.f("<this>", byteWriteChannel);
        return new OutputStream() { // from class: io.ktor.utils.io.jvm.javaio.BlockingKt.toOutputStream.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws Throwable {
                D.B(i.f8767k, new BlockingKt$toOutputStream$1$close$1(byteWriteChannel, null));
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws Throwable {
                D.B(i.f8767k, new BlockingKt$toOutputStream$1$flush$1(byteWriteChannel, null));
            }

            @Override // java.io.OutputStream
            public void write(int b4) throws Throwable {
                D.B(i.f8767k, new BlockingKt$toOutputStream$1$write$1(byteWriteChannel, b4, null));
            }

            @Override // java.io.OutputStream
            public void write(byte[] b4, int off, int len) throws Throwable {
                l.f("b", b4);
                D.B(i.f8767k, new BlockingKt$toOutputStream$1$write$2(byteWriteChannel, b4, off, len, null));
            }
        };
    }
}
