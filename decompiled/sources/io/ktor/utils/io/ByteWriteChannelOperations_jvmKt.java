package io.ktor.utils.io;

import O3.C;
import S3.c;
import S5.j;
import S5.p;
import b1.AbstractC0703b;
import e4.k;
import io.ktor.utils.io.core.OutputArraysJVMKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import v.c0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0006\u0010\u0005\u001a2\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\tH\u0086@¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\r\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "Ljava/nio/ByteBuffer;", "value", "LO3/C;", "writeByteBuffer", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/nio/ByteBuffer;LS3/c;)Ljava/lang/Object;", "writeFully", "", "min", "Lkotlin/Function1;", "block", "write", "(Lio/ktor/utils/io/ByteWriteChannel;ILe4/k;LS3/c;)Ljava/lang/Object;", "writeAvailable", "(Lio/ktor/utils/io/ByteWriteChannel;ILe4/k;)I", "buffer", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/nio/ByteBuffer;)V", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ByteWriteChannelOperations_jvmKt {
    public static final Object write(ByteWriteChannel byteWriteChannel, int i7, k kVar, c<? super C> cVar) {
        S5.a aVarA = byteWriteChannel.getWriteBuffer().a();
        j jVarM = aVarA.m(i7);
        int i8 = jVarM.f8802c;
        byte[] bArr = jVarM.a;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i8, bArr.length - i8);
        l.c(byteBufferWrap);
        kVar.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i8;
        if (iPosition == i7) {
            jVarM.f8802c += iPosition;
            aVarA.f8784m += iPosition;
        } else {
            if (iPosition < 0 || iPosition > jVarM.a()) {
                StringBuilder sbP = AbstractC0703b.p(iPosition, "Invalid number of bytes written: ", ". Should be in 0..");
                sbP.append(jVarM.a());
                throw new IllegalStateException(sbP.toString().toString());
            }
            if (iPosition != 0) {
                jVarM.f8802c += iPosition;
                aVarA.f8784m += iPosition;
            } else if (p.f(jVarM)) {
                aVarA.i();
            }
        }
        Object objFlush = byteWriteChannel.flush(cVar);
        return objFlush == T3.a.f9048k ? objFlush : C.a;
    }

    public static /* synthetic */ Object write$default(ByteWriteChannel byteWriteChannel, int i7, k kVar, c cVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 1;
        }
        return write(byteWriteChannel, i7, kVar, cVar);
    }

    public static final int writeAvailable(ByteWriteChannel byteWriteChannel, int i7, k kVar) {
        l.f("<this>", byteWriteChannel);
        l.f("block", kVar);
        if (i7 <= 0) {
            throw new IllegalArgumentException("min should be positive");
        }
        if (i7 > 1048576) {
            throw new IllegalArgumentException(c0.a(i7, "Min(", ") shouldn't be greater than 1048576").toString());
        }
        if (byteWriteChannel.isClosedForWrite()) {
            return -1;
        }
        S5.a aVarA = byteWriteChannel.getWriteBuffer().a();
        j jVarM = aVarA.m(i7);
        int i8 = jVarM.f8802c;
        byte[] bArr = jVarM.a;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i8, bArr.length - i8);
        l.c(byteBufferWrap);
        kVar.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i8;
        int iPosition2 = byteBufferWrap.position() - i8;
        if (iPosition2 == i7) {
            jVarM.f8802c += iPosition2;
            aVarA.f8784m += iPosition2;
            return iPosition;
        }
        if (iPosition2 < 0 || iPosition2 > jVarM.a()) {
            StringBuilder sbP = AbstractC0703b.p(iPosition2, "Invalid number of bytes written: ", ". Should be in 0..");
            sbP.append(jVarM.a());
            throw new IllegalStateException(sbP.toString().toString());
        }
        if (iPosition2 != 0) {
            jVarM.f8802c += iPosition2;
            aVarA.f8784m += iPosition2;
            return iPosition;
        }
        if (p.f(jVarM)) {
            aVarA.i();
        }
        return iPosition;
    }

    public static /* synthetic */ int writeAvailable$default(ByteWriteChannel byteWriteChannel, int i7, k kVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 1;
        }
        return writeAvailable(byteWriteChannel, i7, kVar);
    }

    public static final Object writeByteBuffer(ByteWriteChannel byteWriteChannel, ByteBuffer byteBuffer, c<? super C> cVar) {
        OutputArraysJVMKt.writeByteBuffer(byteWriteChannel.getWriteBuffer(), byteBuffer);
        Object objFlush = byteWriteChannel.flush(cVar);
        return objFlush == T3.a.f9048k ? objFlush : C.a;
    }

    public static final Object writeFully(ByteWriteChannel byteWriteChannel, ByteBuffer byteBuffer, c<? super C> cVar) {
        OutputArraysJVMKt.writeByteBuffer(byteWriteChannel.getWriteBuffer(), byteBuffer);
        Object objFlush = byteWriteChannel.flush(cVar);
        return objFlush == T3.a.f9048k ? objFlush : C.a;
    }

    public static final void writeAvailable(ByteWriteChannel byteWriteChannel, ByteBuffer byteBuffer) {
        l.f("<this>", byteWriteChannel);
        l.f("buffer", byteBuffer);
        p.n(byteWriteChannel.getWriteBuffer(), byteBuffer);
    }
}
