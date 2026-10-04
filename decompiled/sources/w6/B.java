package w6;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class B extends InputStream {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C f17112k;

    public B(C c2) {
        this.f17112k = c2;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        C c2 = this.f17112k;
        if (c2.f17115m) {
            throw new IOException("closed");
        }
        return (int) Math.min(c2.f17114l.f17156l, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17112k.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        C c2 = this.f17112k;
        if (c2.f17115m) {
            throw new IOException("closed");
        }
        C2224i c2224i = c2.f17114l;
        if (c2224i.f17156l == 0 && c2.f17113k.F(c2224i, 8192L) == -1) {
            return -1;
        }
        return c2224i.readByte() & 255;
    }

    public final String toString() {
        return this.f17112k + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final long transferTo(OutputStream outputStream) throws IOException {
        kotlin.jvm.internal.l.f("out", outputStream);
        C c2 = this.f17112k;
        if (c2.f17115m) {
            throw new IOException("closed");
        }
        long j7 = 0;
        long j8 = 0;
        while (true) {
            C2224i c2224i = c2.f17114l;
            if (c2224i.f17156l == j7 && c2.f17113k.F(c2224i, 8192L) == -1) {
                return j8;
            }
            long j9 = c2224i.f17156l;
            j8 += j9;
            AbstractC2217b.e(j9, 0L, j9);
            D d4 = c2224i.f17155k;
            while (j9 > j7) {
                kotlin.jvm.internal.l.c(d4);
                int iMin = (int) Math.min(j9, d4.f17117c - d4.f17116b);
                outputStream.write(d4.a, d4.f17116b, iMin);
                int i7 = d4.f17116b + iMin;
                d4.f17116b = i7;
                long j10 = iMin;
                c2224i.f17156l -= j10;
                j9 -= j10;
                if (i7 == d4.f17117c) {
                    D dA = d4.a();
                    c2224i.f17155k = dA;
                    E.a(d4);
                    d4 = dA;
                }
                j7 = 0;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) throws IOException {
        kotlin.jvm.internal.l.f("data", bArr);
        C c2 = this.f17112k;
        if (!c2.f17115m) {
            AbstractC2217b.e(bArr.length, i7, i8);
            C2224i c2224i = c2.f17114l;
            if (c2224i.f17156l == 0 && c2.f17113k.F(c2224i, 8192L) == -1) {
                return -1;
            }
            return c2224i.L(bArr, i7, i8);
        }
        throw new IOException("closed");
    }
}
