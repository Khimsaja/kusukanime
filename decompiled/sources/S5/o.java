package S5;

import e4.InterfaceC0821a;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class o extends InputStream {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f8813k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f8814l;

    public o(InterfaceC0821a interfaceC0821a, n nVar) {
        this.f8813k = interfaceC0821a;
        this.f8814l = nVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (((Boolean) this.f8813k.invoke()).booleanValue()) {
            throw new IOException("Underlying source is closed.");
        }
        return (int) Math.min(this.f8814l.a().f8784m, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Exception {
        this.f8814l.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (((Boolean) this.f8813k.invoke()).booleanValue()) {
            throw new IOException("Underlying source is closed.");
        }
        n nVar = this.f8814l;
        if (nVar.z()) {
            return -1;
        }
        return nVar.readByte() & 255;
    }

    public final String toString() {
        return this.f8814l + ".asInputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) throws IOException {
        kotlin.jvm.internal.l.f("data", bArr);
        if (!((Boolean) this.f8813k.invoke()).booleanValue()) {
            p.b(bArr.length, i7, i8);
            return this.f8814l.C(bArr, i7, i8 + i7);
        }
        throw new IOException("Underlying source is closed.");
    }
}
