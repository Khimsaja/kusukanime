package io.ktor.utils.io.core;

import O3.InterfaceC0554c;
import S5.a;
import S5.h;
import S5.n;
import S5.p;
import com.kusukanime.BuildConfig;
import e4.k;
import io.ktor.http.ContentType;
import io.ktor.utils.io.pool.ObjectPool;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000^\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\r\u001a\u0019\u0010\u000f\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0014\u001a\u00020\u0013*\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0016*\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001e\u001a\u00020\u001d*\u00020\u00052\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001e\u0010\u001f\u001a-\u0010 \u001a\u00020\u001d*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b \u0010!\u001a+\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"*\u00020\u00052\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b$\u0010%\u001a+\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"*\u00020&2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b$\u0010'\u001a\u0013\u0010(\u001a\u00020\u001d*\u00020\u0005H\u0007¢\u0006\u0004\b(\u0010)\"\u0017\u0010*\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u001b\u00101\u001a\u00020\u0016*\u00020\u00058F¢\u0006\f\u0012\u0004\b0\u0010)\u001a\u0004\b.\u0010/*>\b\u0007\u0010\u0006\"\u00020\u00052\u00020\u0005B0\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\"\b5\u0012\u001e\b\u000bB\u001a\b6\u0012\b\b7\u0012\u0004\b\b(8\u0012\f\b9\u0012\b\b\fJ\u0004\b\b(:¨\u0006;"}, d2 = {"", "array", "", "offset", "length", "LS5/n;", "ByteReadPacket", "([BII)LS5/n;", "Lio/ktor/utils/io/pool/ObjectPool;", "pool", "LS5/a;", "Sink", "(Lio/ktor/utils/io/pool/ObjectPool;)LS5/a;", "()LS5/a;", "out", "readAvailable", "(LS5/n;LS5/a;)I", "copy", "(LS5/n;)LS5/n;", "", "readShortLittleEndian", "(LS5/n;)S", "", "count", "discard", "(LS5/n;J)J", "Lkotlin/Function1;", "", "block", "LO3/C;", "takeWhile", "(LS5/n;Le4/k;)V", "readFully", "(LS5/n;[BII)V", "T", "function", "preview", "(LS5/n;Le4/k;)Ljava/lang/Object;", "LS5/l;", "(LS5/l;Le4/k;)Ljava/lang/Object;", BuildConfig.BUILD_TYPE, "(LS5/n;)V", "ByteReadPacketEmpty", "LS5/n;", "getByteReadPacketEmpty", "()LS5/n;", "getRemaining", "(LS5/n;)J", "getRemaining$annotations", "remaining", "LO3/c;", ContentType.Message.TYPE, "Use Source instead", "replaceWith", "LO3/m;", "expression", "Source", "imports", "kotlinx.io.Source", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ByteReadPacketKt {
    private static final n ByteReadPacketEmpty = new a();

    public static final n ByteReadPacket(byte[] bArr, int i7, int i8) {
        l.f("array", bArr);
        a aVar = new a();
        aVar.write(bArr, i7, i8 + i7);
        return aVar;
    }

    @InterfaceC0554c
    public static /* synthetic */ void ByteReadPacket$annotations() {
    }

    public static /* synthetic */ n ByteReadPacket$default(byte[] bArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = bArr.length;
        }
        return ByteReadPacket(bArr, i7, i8);
    }

    @InterfaceC0554c
    public static final a Sink(ObjectPool<?> objectPool) {
        l.f("pool", objectPool);
        return new a();
    }

    @InterfaceC0554c
    public static final n copy(n nVar) {
        l.f("<this>", nVar);
        return nVar.N();
    }

    public static final long discard(n nVar, long j7) {
        l.f("<this>", nVar);
        nVar.c(j7);
        long jMin = Math.min(j7, getRemaining(nVar));
        nVar.a().n(jMin);
        return jMin;
    }

    public static /* synthetic */ long discard$default(n nVar, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = Long.MAX_VALUE;
        }
        return discard(nVar, j7);
    }

    public static final n getByteReadPacketEmpty() {
        return ByteReadPacketEmpty;
    }

    public static final long getRemaining(n nVar) {
        l.f("<this>", nVar);
        return nVar.a().f8784m;
    }

    public static final <T> T preview(n nVar, k kVar) throws Exception {
        l.f("<this>", nVar);
        l.f("function", kVar);
        h hVarN = nVar.a().N();
        try {
            T t7 = (T) kVar.invoke(hVarN);
            hVarN.close();
            return t7;
        } finally {
        }
    }

    public static final int readAvailable(n nVar, a aVar) {
        l.f("<this>", nVar);
        l.f("out", aVar);
        long j7 = nVar.a().f8784m;
        aVar.M(nVar);
        return (int) j7;
    }

    public static final void readFully(n nVar, byte[] bArr, int i7, int i8) {
        l.f("<this>", nVar);
        l.f("out", bArr);
        p.l(nVar, bArr, i7, i8 + i7);
    }

    public static /* synthetic */ void readFully$default(n nVar, byte[] bArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = bArr.length - i7;
        }
        readFully(nVar, bArr, i7, i8);
    }

    public static final short readShortLittleEndian(n nVar) {
        l.f("<this>", nVar);
        a aVarA = nVar.a();
        l.f("<this>", aVarA);
        return Short.reverseBytes(aVarA.readShort());
    }

    @InterfaceC0554c
    public static final void release(n nVar) throws Exception {
        l.f("<this>", nVar);
        nVar.close();
    }

    public static final void takeWhile(n nVar, k kVar) {
        l.f("<this>", nVar);
        l.f("block", kVar);
        while (!nVar.z() && ((Boolean) kVar.invoke(nVar.a())).booleanValue()) {
        }
    }

    @InterfaceC0554c
    public static final a Sink() {
        return new a();
    }

    public static final <T> T preview(S5.l lVar, k kVar) throws Exception {
        l.f("<this>", lVar);
        l.f("function", kVar);
        h hVarN = lVar.a().N();
        try {
            T t7 = (T) kVar.invoke(hVarN);
            hVarN.close();
            return t7;
        } finally {
        }
    }

    public static /* synthetic */ void getRemaining$annotations(n nVar) {
    }
}
