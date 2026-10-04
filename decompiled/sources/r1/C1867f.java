package r1;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: r1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1867f extends C1863b {
    public C1867f(byte[] bArr) {
        super(bArr);
        this.f14809k.mark(Integer.MAX_VALUE);
    }

    public final void e(long j7) throws IOException {
        int i7 = this.f14810l;
        if (i7 > j7) {
            this.f14810l = 0;
            this.f14809k.reset();
        } else {
            j7 -= i7;
        }
        b((int) j7);
    }

    public C1867f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f14809k.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
