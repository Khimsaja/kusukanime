package X4;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* renamed from: X4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0604a extends FilterInputStream {

    /* renamed from: k, reason: collision with root package name */
    public int f9876k;

    public C0604a(ByteArrayInputStream byteArrayInputStream, int i7) {
        super(byteArrayInputStream);
        this.f9876k = i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f9876k);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f9876k <= 0) {
            return -1;
        }
        int i7 = super.read();
        if (i7 >= 0) {
            this.f9876k--;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j7) throws IOException {
        long jSkip = super.skip(Math.min(j7, this.f9876k));
        if (jSkip >= 0) {
            this.f9876k = (int) (this.f9876k - jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) throws IOException {
        int i9 = this.f9876k;
        if (i9 <= 0) {
            return -1;
        }
        int i10 = super.read(bArr, i7, Math.min(i8, i9));
        if (i10 >= 0) {
            this.f9876k -= i10;
        }
        return i10;
    }
}
