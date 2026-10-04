package l6;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.l;
import w6.A;
import w6.AbstractC2217b;
import w6.C2224i;
import w6.D;
import w6.E;
import w6.G;
import w6.J;
import w6.r;

/* loaded from: classes.dex */
public final class e implements G {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12857k = 0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12858l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f12859m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f12860n;

    public e(C2224i c2224i, Deflater deflater) {
        this.f12859m = AbstractC2217b.b(c2224i);
        this.f12860n = deflater;
    }

    public void b(boolean z7) throws IOException {
        D dD0;
        int iDeflate;
        A a = (A) this.f12859m;
        C2224i c2224i = a.f17110l;
        while (true) {
            dD0 = c2224i.d0(1);
            Deflater deflater = (Deflater) this.f12860n;
            byte[] bArr = dD0.a;
            if (z7) {
                try {
                    int i7 = dD0.f17117c;
                    iDeflate = deflater.deflate(bArr, i7, 8192 - i7, 2);
                } catch (NullPointerException e7) {
                    throw new IOException("Deflater already closed", e7);
                }
            } else {
                int i8 = dD0.f17117c;
                iDeflate = deflater.deflate(bArr, i8, 8192 - i8);
            }
            if (iDeflate > 0) {
                dD0.f17117c += iDeflate;
                c2224i.f17156l += iDeflate;
                a.b();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (dD0.f17116b == dD0.f17117c) {
            c2224i.f17155k = dD0.a();
            E.a(dD0);
        }
    }

    @Override // w6.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        switch (this.f12857k) {
            case 0:
                if (this.f12858l) {
                    return;
                }
                this.f12858l = true;
                Q4.b bVar = (Q4.b) this.f12860n;
                bVar.getClass();
                r rVar = (r) this.f12859m;
                J j7 = rVar.f17174e;
                rVar.f17174e = J.f17126d;
                j7.a();
                j7.b();
                bVar.f8004b = 3;
                return;
            default:
                Deflater deflater = (Deflater) this.f12860n;
                if (this.f12858l) {
                    return;
                }
                try {
                    deflater.finish();
                    b(false);
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    deflater.end();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                try {
                    ((A) this.f12859m).close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    }
                }
                this.f12858l = true;
                if (th != null) {
                    throw th;
                }
                return;
        }
    }

    @Override // w6.G
    public final J d() {
        switch (this.f12857k) {
            case 0:
                return (r) this.f12859m;
            default:
                return ((A) this.f12859m).f17109k.d();
        }
    }

    @Override // w6.G
    public final void f(C2224i c2224i, long j7) throws IOException {
        Object obj = this.f12860n;
        switch (this.f12857k) {
            case 0:
                l.f("source", c2224i);
                if (this.f12858l) {
                    throw new IllegalStateException("closed");
                }
                long j8 = c2224i.f17156l;
                byte[] bArr = g6.b.a;
                if (j7 < 0 || 0 > j8 || j8 < j7) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                ((A) ((Q4.b) obj).f8008f).f(c2224i, j7);
                return;
            default:
                l.f("source", c2224i);
                AbstractC2217b.e(c2224i.f17156l, 0L, j7);
                while (true) {
                    Deflater deflater = (Deflater) obj;
                    if (j7 <= 0) {
                        deflater.setInput(x6.b.f17522b, 0, 0);
                        return;
                    }
                    D d4 = c2224i.f17155k;
                    l.c(d4);
                    int iMin = (int) Math.min(j7, d4.f17117c - d4.f17116b);
                    deflater.setInput(d4.a, d4.f17116b, iMin);
                    b(false);
                    long j9 = iMin;
                    c2224i.f17156l -= j9;
                    int i7 = d4.f17116b + iMin;
                    d4.f17116b = i7;
                    if (i7 == d4.f17117c) {
                        c2224i.f17155k = d4.a();
                        E.a(d4);
                    }
                    j7 -= j9;
                }
        }
    }

    @Override // w6.G, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f12857k) {
            case 0:
                if (!this.f12858l) {
                    ((A) ((Q4.b) this.f12860n).f8008f).flush();
                    break;
                }
                break;
            default:
                b(true);
                ((A) this.f12859m).flush();
                break;
        }
    }

    public String toString() {
        switch (this.f12857k) {
            case 1:
                return "DeflaterSink(" + ((A) this.f12859m) + ')';
            default:
                return super.toString();
        }
    }

    public e(Q4.b bVar) {
        this.f12860n = bVar;
        this.f12859m = new r(((A) bVar.f8008f).f17109k.d());
    }
}
