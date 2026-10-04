package w6;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: w6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2219d implements G {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17133k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f17134l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f17135m;

    public /* synthetic */ C2219d(int i7, Object obj, Object obj2) {
        this.f17133k = i7;
        this.f17134l = obj;
        this.f17135m = obj2;
    }

    @Override // w6.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f17133k) {
            case 0:
                C2219d c2219d = (C2219d) this.f17135m;
                x6.f fVar = (x6.f) this.f17134l;
                fVar.i();
                try {
                    c2219d.close();
                    if (fVar.j()) {
                        throw fVar.l(null);
                    }
                    return;
                } catch (IOException e7) {
                    if (!fVar.j()) {
                        throw e7;
                    }
                    throw fVar.l(e7);
                } finally {
                    fVar.j();
                }
            default:
                ((OutputStream) this.f17134l).close();
                return;
        }
    }

    @Override // w6.G
    public final J d() {
        switch (this.f17133k) {
            case 0:
                return (x6.f) this.f17134l;
            default:
                return (J) this.f17135m;
        }
    }

    @Override // w6.G
    public final void f(C2224i c2224i, long j7) throws IOException {
        switch (this.f17133k) {
            case 0:
                kotlin.jvm.internal.l.f("source", c2224i);
                AbstractC2217b.e(c2224i.f17156l, 0L, j7);
                long j8 = j7;
                while (true) {
                    long j9 = 0;
                    if (j8 <= 0) {
                        return;
                    }
                    D d4 = c2224i.f17155k;
                    kotlin.jvm.internal.l.c(d4);
                    while (true) {
                        if (j9 < 65536) {
                            j9 += d4.f17117c - d4.f17116b;
                            if (j9 >= j8) {
                                j9 = j8;
                            } else {
                                d4 = d4.f17120f;
                                kotlin.jvm.internal.l.c(d4);
                            }
                        }
                    }
                    C2219d c2219d = (C2219d) this.f17135m;
                    x6.f fVar = (x6.f) this.f17134l;
                    fVar.i();
                    try {
                        try {
                            c2219d.f(c2224i, j9);
                            if (fVar.j()) {
                                throw fVar.l(null);
                            }
                            j8 -= j9;
                        } catch (IOException e7) {
                            if (!fVar.j()) {
                                throw e7;
                            }
                            throw fVar.l(e7);
                        }
                    } catch (Throwable th) {
                        fVar.j();
                        throw th;
                    }
                }
            default:
                kotlin.jvm.internal.l.f("source", c2224i);
                AbstractC2217b.e(c2224i.f17156l, 0L, j7);
                while (j7 > 0) {
                    ((J) this.f17135m).f();
                    D d6 = c2224i.f17155k;
                    kotlin.jvm.internal.l.c(d6);
                    int iMin = (int) Math.min(j7, d6.f17117c - d6.f17116b);
                    ((OutputStream) this.f17134l).write(d6.a, d6.f17116b, iMin);
                    int i7 = d6.f17116b + iMin;
                    d6.f17116b = i7;
                    long j10 = iMin;
                    j7 -= j10;
                    c2224i.f17156l -= j10;
                    if (i7 == d6.f17117c) {
                        c2224i.f17155k = d6.a();
                        E.a(d6);
                    }
                }
                return;
        }
    }

    @Override // w6.G, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f17133k) {
            case 0:
                C2219d c2219d = (C2219d) this.f17135m;
                x6.f fVar = (x6.f) this.f17134l;
                fVar.i();
                try {
                    c2219d.flush();
                    if (fVar.j()) {
                        throw fVar.l(null);
                    }
                    return;
                } catch (IOException e7) {
                    if (!fVar.j()) {
                        throw e7;
                    }
                    throw fVar.l(e7);
                } finally {
                    fVar.j();
                }
            default:
                ((OutputStream) this.f17134l).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f17133k) {
            case 0:
                return "AsyncTimeout.sink(" + ((C2219d) this.f17135m) + ')';
            default:
                return "sink(" + ((OutputStream) this.f17134l) + ')';
        }
    }
}
