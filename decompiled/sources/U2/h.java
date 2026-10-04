package U2;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class h extends InputStream {

    /* renamed from: k, reason: collision with root package name */
    public final InputStream f9212k;

    /* renamed from: l, reason: collision with root package name */
    public int f9213l = 1073741824;

    public h(InputStream inputStream) {
        this.f9212k = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f9213l;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9212k.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i7 = this.f9212k.read();
        if (i7 == -1) {
            this.f9213l = 0;
        }
        return i7;
    }

    @Override // java.io.InputStream
    public final long skip(long j7) {
        return this.f9212k.skip(j7);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i7 = this.f9212k.read(bArr);
        if (i7 == -1) {
            this.f9213l = 0;
        }
        return i7;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) throws IOException {
        int i9 = this.f9212k.read(bArr, i7, i8);
        if (i9 == -1) {
            this.f9213l = 0;
        }
        return i9;
    }
}
