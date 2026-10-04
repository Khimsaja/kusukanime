package B1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: B1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014a extends OutputStream {

    /* renamed from: k, reason: collision with root package name */
    public final FileOutputStream f311k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f312l = false;

    public C0014a(File file) {
        this.f311k = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f311k;
        if (this.f312l) {
            return;
        }
        this.f312l = true;
        flush();
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException e7) {
            AbstractC0015b.w("AtomicFile", "Failed to sync file descriptor:", e7);
        }
        fileOutputStream.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f311k.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i7) throws IOException {
        this.f311k.write(i7);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f311k.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i8) throws IOException {
        this.f311k.write(bArr, i7, i8);
    }
}
