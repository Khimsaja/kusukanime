package io.ktor.utils.io.streams;

import D6.r;
import M.K;
import S5.a;
import S5.b;
import S5.c;
import S5.h;
import S5.j;
import S5.n;
import S5.o;
import S5.p;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import e4.k;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.SinkByteWriteChannelKt;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\n\u001a\u00020\t*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\n\u001a\u00020\t*\u00020\u00072\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0004\b\n\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0015\u001a\u00020\u0014*\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ljava/io/InputStream;", "LS5/n;", "Lio/ktor/utils/io/core/Input;", "asInput", "(Ljava/io/InputStream;)LS5/n;", "inputStream", "(LS5/n;)Ljava/io/InputStream;", "Ljava/io/OutputStream;", "packet", "LO3/C;", "writePacket", "(Ljava/io/OutputStream;LS5/n;)V", "Lkotlin/Function1;", "LS5/l;", "block", "(Ljava/io/OutputStream;Le4/k;)V", "", "min", "readPacketAtLeast", "(Ljava/io/InputStream;I)LS5/n;", "Lio/ktor/utils/io/ByteWriteChannel;", "asByteWriteChannel", "(Ljava/io/OutputStream;)Lio/ktor/utils/io/ByteWriteChannel;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StreamsKt {
    public static final ByteWriteChannel asByteWriteChannel(OutputStream outputStream) {
        l.f("<this>", outputStream);
        return SinkByteWriteChannelKt.asByteWriteChannel(new c(outputStream));
    }

    public static final n asInput(InputStream inputStream) {
        l.f("<this>", inputStream);
        return new h(new b(inputStream));
    }

    public static final InputStream inputStream(n nVar) {
        n nVar2;
        InterfaceC0821a aVar;
        l.f("<this>", nVar);
        if (nVar instanceof h) {
            nVar2 = nVar;
            aVar = new K(0, 1, h.class, nVar2, "closed", "getClosed()Z");
        } else {
            nVar2 = nVar;
            if (!(nVar2 instanceof a)) {
                throw new r();
            }
            aVar = new J3.a(4);
        }
        return new o(aVar, nVar2);
    }

    public static final n readPacketAtLeast(InputStream inputStream, int i7) throws IOException {
        l.f("<this>", inputStream);
        a aVar = new a();
        j jVarM = aVar.m(i7);
        int i8 = jVarM.f8802c;
        byte[] bArr = jVarM.a;
        int i9 = inputStream.read(bArr, i8, bArr.length - i8);
        if (i9 < 0) {
            i9 = 0;
        }
        if (i9 == i7) {
            jVarM.f8802c += i9;
            aVar.f8784m += i9;
            return aVar;
        }
        if (i9 < 0 || i9 > jVarM.a()) {
            StringBuilder sbP = AbstractC0703b.p(i9, "Invalid number of bytes written: ", ". Should be in 0..");
            sbP.append(jVarM.a());
            throw new IllegalStateException(sbP.toString().toString());
        }
        if (i9 != 0) {
            jVarM.f8802c += i9;
            aVar.f8784m += i9;
            return aVar;
        }
        if (p.f(jVarM)) {
            aVar.i();
        }
        return aVar;
    }

    public static /* synthetic */ n readPacketAtLeast$default(InputStream inputStream, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 1;
        }
        return readPacketAtLeast(inputStream, i7);
    }

    public static final void writePacket(OutputStream outputStream, k kVar) {
        l.f("<this>", outputStream);
        l.f("block", kVar);
        a aVar = new a();
        kVar.invoke(aVar);
        writePacket(outputStream, aVar);
    }

    public static final void writePacket(OutputStream outputStream, n nVar) {
        l.f("<this>", outputStream);
        l.f("packet", nVar);
        nVar.B(new c(outputStream));
    }
}
