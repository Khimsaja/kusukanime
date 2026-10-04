package r1;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: r1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1862a extends MediaDataSource {

    /* renamed from: k, reason: collision with root package name */
    public long f14807k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1867f f14808l;

    public C1862a(C1867f c1867f) {
        this.f14808l = c1867f;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j7, byte[] bArr, int i7, int i8) throws IOException {
        if (i8 == 0) {
            return 0;
        }
        if (j7 < 0) {
            return -1;
        }
        try {
            long j8 = this.f14807k;
            C1867f c1867f = this.f14808l;
            if (j8 != j7) {
                if (j8 >= 0 && j7 >= j8 + c1867f.f14809k.available()) {
                    return -1;
                }
                c1867f.e(j7);
                this.f14807k = j7;
            }
            if (i8 > c1867f.f14809k.available()) {
                i8 = c1867f.f14809k.available();
            }
            int i9 = c1867f.read(bArr, i7, i8);
            if (i9 >= 0) {
                this.f14807k += i9;
                return i9;
            }
        } catch (IOException unused) {
        }
        this.f14807k = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
