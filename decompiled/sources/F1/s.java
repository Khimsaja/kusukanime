package F1;

import B1.AbstractC0015b;
import B1.K;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class s extends BufferedOutputStream {

    /* renamed from: k, reason: collision with root package name */
    public boolean f2212k;

    public final void b(OutputStream outputStream) {
        AbstractC0015b.h(this.f2212k);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f2212k = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f2212k = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        int i7 = K.a;
        throw th;
    }
}
