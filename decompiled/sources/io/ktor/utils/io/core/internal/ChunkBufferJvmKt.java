package io.ktor.utils.io.core.internal;

import S5.a;
import S5.j;
import S5.p;
import b1.AbstractC0703b;
import e4.k;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LS5/a;", "", "min", "Lkotlin/Function1;", "Ljava/nio/ByteBuffer;", "LO3/C;", "block", "writeDirect", "(LS5/a;ILe4/k;)V", "readDirect", "(LS5/a;Le4/k;)V", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChunkBufferJvmKt {
    public static final void readDirect(a aVar, k kVar) {
        l.f("<this>", aVar);
        l.f("block", kVar);
        if (aVar.z()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        j jVar = aVar.f8782k;
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
            aVar.n(iPosition);
        }
    }

    public static final void writeDirect(a aVar, int i7, k kVar) {
        l.f("<this>", aVar);
        l.f("block", kVar);
        j jVarM = aVar.m(i7);
        int i8 = jVarM.f8802c;
        byte[] bArr = jVarM.a;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i8, bArr.length - i8);
        l.c(byteBufferWrap);
        kVar.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i8;
        if (iPosition == i7) {
            jVarM.f8802c += iPosition;
            aVar.f8784m += iPosition;
            return;
        }
        if (iPosition < 0 || iPosition > jVarM.a()) {
            StringBuilder sbP = AbstractC0703b.p(iPosition, "Invalid number of bytes written: ", ". Should be in 0..");
            sbP.append(jVarM.a());
            throw new IllegalStateException(sbP.toString().toString());
        }
        if (iPosition != 0) {
            jVarM.f8802c += iPosition;
            aVar.f8784m += iPosition;
        } else if (p.f(jVarM)) {
            aVar.i();
        }
    }
}
