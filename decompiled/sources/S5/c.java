package S5;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: k, reason: collision with root package name */
    public final OutputStream f8786k;

    public c(OutputStream outputStream) {
        this.f8786k = outputStream;
    }

    @Override // S5.e
    public final void close() throws IOException {
        this.f8786k.close();
    }

    @Override // S5.e, java.io.Flushable
    public final void flush() throws IOException {
        this.f8786k.flush();
    }

    public final String toString() {
        return "RawSink(" + this.f8786k + ')';
    }

    @Override // S5.e
    public final void write(a aVar, long j7) throws IOException {
        kotlin.jvm.internal.l.f("source", aVar);
        p.b(aVar.f8784m, 0L, j7);
        while (j7 > 0) {
            if (aVar.z()) {
                throw new IllegalArgumentException("Buffer is empty");
            }
            j jVar = aVar.f8782k;
            kotlin.jvm.internal.l.c(jVar);
            int i7 = jVar.f8801b;
            int iMin = (int) Math.min(j7, jVar.f8802c - i7);
            this.f8786k.write(jVar.a, i7, iMin);
            long j8 = iMin;
            j7 -= j8;
            if (iMin != 0) {
                if (iMin < 0) {
                    throw new IllegalStateException("Returned negative read bytes count");
                }
                if (iMin > jVar.b()) {
                    throw new IllegalStateException("Returned too many bytes");
                }
                aVar.n(j8);
            }
        }
    }
}
