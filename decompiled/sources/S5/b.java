package S5;

import java.io.IOException;
import java.io.InputStream;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: k, reason: collision with root package name */
    public final InputStream f8785k;

    public b(InputStream inputStream) {
        this.f8785k = inputStream;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f8785k.close();
    }

    @Override // S5.f
    public final long readAtMostTo(a aVar, long j7) throws IOException {
        kotlin.jvm.internal.l.f("sink", aVar);
        if (j7 == 0) {
            return 0L;
        }
        if (j7 < 0) {
            throw new IllegalArgumentException(("byteCount (" + j7 + ") < 0").toString());
        }
        boolean z7 = false;
        try {
            j jVarM = aVar.m(1);
            long j8 = this.f8785k.read(jVarM.a, jVarM.f8802c, (int) Math.min(j7, r4.length - r5));
            int i7 = j8 == -1 ? 0 : (int) j8;
            if (i7 == 1) {
                jVarM.f8802c += i7;
                aVar.f8784m += i7;
                return j8;
            }
            if (i7 < 0 || i7 > jVarM.a()) {
                throw new IllegalStateException(("Invalid number of bytes written: " + i7 + ". Should be in 0.." + jVarM.a()).toString());
            }
            if (i7 != 0) {
                jVarM.f8802c += i7;
                aVar.f8784m += i7;
                return j8;
            }
            if (!p.f(jVarM)) {
                return j8;
            }
            aVar.i();
            return j8;
        } catch (AssertionError e7) {
            if (e7.getCause() != null) {
                String message = e7.getMessage();
                if (message != null ? AbstractC2510o.W(message, "getsockname failed", false) : false) {
                    z7 = true;
                }
            }
            if (z7) {
                throw new IOException(e7);
            }
            throw e7;
        }
    }

    public final String toString() {
        return "RawSource(" + this.f8785k + ')';
    }
}
