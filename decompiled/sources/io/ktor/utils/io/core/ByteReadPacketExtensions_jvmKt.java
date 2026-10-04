package io.ktor.utils.io.core;

import S5.a;
import S5.j;
import S5.n;
import S5.p;
import e4.k;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000e\u001a\u00020\t*\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ljava/nio/ByteBuffer;", "byteBuffer", "LS5/n;", "ByteReadPacket", "(Ljava/nio/ByteBuffer;)LS5/n;", "buffer", "", "readAvailable", "(LS5/n;Ljava/nio/ByteBuffer;)I", "LO3/C;", "readFully", "(LS5/n;Ljava/nio/ByteBuffer;)V", "Lkotlin/Function1;", "block", "read", "(LS5/n;Le4/k;)V", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ByteReadPacketExtensions_jvmKt {
    public static final n ByteReadPacket(ByteBuffer byteBuffer) {
        l.f("byteBuffer", byteBuffer);
        a aVar = new a();
        p.n(aVar, byteBuffer);
        return aVar;
    }

    public static final void read(n nVar, k kVar) {
        l.f("<this>", nVar);
        l.f("block", kVar);
        a aVarA = nVar.a();
        if (aVarA.z()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        j jVar = aVarA.f8782k;
        l.c(jVar);
        int i7 = jVar.f8801b;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(jVar.a, i7, jVar.f8802c - i7);
        l.c(byteBufferWrap);
        kVar.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i7;
        if (iPosition != 0) {
            if (iPosition < 0) {
                throw new IllegalStateException("Returned negative read bytes count");
            }
            if (iPosition > jVar.b()) {
                throw new IllegalStateException("Returned too many bytes");
            }
            aVarA.n(iPosition);
        }
    }

    public static final int readAvailable(n nVar, ByteBuffer byteBuffer) {
        l.f("<this>", nVar);
        l.f("buffer", byteBuffer);
        int iRemaining = byteBuffer.remaining();
        p.g(nVar, byteBuffer);
        return iRemaining - byteBuffer.remaining();
    }

    public static final void readFully(n nVar, ByteBuffer byteBuffer) {
        l.f("<this>", nVar);
        l.f("buffer", byteBuffer);
        while (!nVar.z() && byteBuffer.hasRemaining()) {
            p.g(nVar, byteBuffer);
        }
    }
}
