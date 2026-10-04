package io.ktor.utils.io.core;

import O3.InterfaceC0554c;
import S5.a;
import S5.l;
import S5.n;
import io.ktor.http.ContentDisposition;
import io.ktor.http.ContentType;
import io.ktor.utils.io.DeprecationKt;
import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a-\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0012\u001a\u00020\b*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0015\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016\"\u001b\u0010\u001b\u001a\u00020\u0005*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018*>\b\u0007\u0010\u0001\"\u00020\u00002\u00020\u0000B0\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\"\b\u001f\u0012\u001e\b\u000bB\u001a\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\f\b#\u0012\b\b\fJ\u0004\b\b($¨\u0006%"}, d2 = {"LS5/l;", "BytePacketBuilder", "()LS5/l;", "", "value", "", "startIndex", "endIndex", "LO3/C;", "append", "(LS5/l;Ljava/lang/CharSequence;II)V", "LS5/n;", "build", "(LS5/l;)LS5/n;", "", "buffer", "offset", "length", "writeFully", "(LS5/l;[BII)V", "packet", "writePacket", "(LS5/l;LS5/n;)V", "getSize", "(LS5/l;)I", "getSize$annotations", "(LS5/l;)V", ContentDisposition.Parameters.Size, "LO3/c;", ContentType.Message.TYPE, DeprecationKt.IO_DEPRECATION_MESSAGE, "replaceWith", "LO3/m;", "expression", "Sink", "imports", "kotlinx.io.Sink", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BytePacketBuilderKt {
    public static final l BytePacketBuilder() {
        return new a();
    }

    @InterfaceC0554c
    public static /* synthetic */ void BytePacketBuilder$annotations() {
    }

    public static final void append(l lVar, CharSequence charSequence, int i7, int i8) {
        kotlin.jvm.internal.l.f("<this>", lVar);
        kotlin.jvm.internal.l.f("value", charSequence);
        StringsKt.writeText$default(lVar, charSequence, i7, i8, (Charset) null, 8, (Object) null);
    }

    public static /* synthetic */ void append$default(l lVar, CharSequence charSequence, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = charSequence.length();
        }
        append(lVar, charSequence, i7, i8);
    }

    public static final n build(l lVar) {
        kotlin.jvm.internal.l.f("<this>", lVar);
        return lVar.a();
    }

    public static final int getSize(l lVar) {
        kotlin.jvm.internal.l.f("<this>", lVar);
        return (int) lVar.a().f8784m;
    }

    public static final void writeFully(l lVar, byte[] bArr, int i7, int i8) {
        kotlin.jvm.internal.l.f("<this>", lVar);
        kotlin.jvm.internal.l.f("buffer", bArr);
        lVar.write(bArr, i7, i8 + i7);
    }

    public static /* synthetic */ void writeFully$default(l lVar, byte[] bArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = bArr.length - i7;
        }
        writeFully(lVar, bArr, i7, i8);
    }

    public static final void writePacket(l lVar, n nVar) {
        kotlin.jvm.internal.l.f("<this>", lVar);
        kotlin.jvm.internal.l.f("packet", nVar);
        lVar.M(nVar);
    }

    public static /* synthetic */ void getSize$annotations(l lVar) {
    }
}
