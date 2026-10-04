package io.ktor.utils.io.core;

import O3.InterfaceC0554c;
import e4.k;
import io.ktor.http.ContentDisposition;
import io.ktor.http.ContentType;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f*8\b\u0007\u0010\u0015\"\u00020\u00042\u00020\u0004B*\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u001c\b\u0010\u0012\u0018\b\u000bB\u0014\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0006\b\u0014\u0012\u0002\b\f¨\u0006\u0016"}, d2 = {"T", "", ContentDisposition.Parameters.Size, "Lkotlin/Function1;", "", "block", "withMemory", "(ILe4/k;)Ljava/lang/Object;", "index", "value", "LO3/C;", "storeIntAt", "([BII)V", "LO3/c;", ContentType.Message.TYPE, "ByteArray instead", "replaceWith", "LO3/m;", "expression", "ByteArray", "imports", "Memory", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MemoryKt {
    @InterfaceC0554c
    public static /* synthetic */ void Memory$annotations() {
    }

    public static final void storeIntAt(byte[] bArr, int i7, int i8) {
        l.f("<this>", bArr);
        bArr[i7] = (byte) (i8 >> 24);
        bArr[i7 + 1] = (byte) (i8 >> 16);
        bArr[i7 + 2] = (byte) (i8 >> 8);
        bArr[i7 + 3] = (byte) i8;
    }

    public static final <T> T withMemory(int i7, k kVar) {
        l.f("block", kVar);
        return (T) kVar.invoke(new byte[i7]);
    }
}
