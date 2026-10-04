package E1;

import B1.K;
import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* loaded from: classes.dex */
public final class C implements h {

    /* renamed from: k, reason: collision with root package name */
    public final h f1839k;

    /* renamed from: l, reason: collision with root package name */
    public final F1.c f1840l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1841m;

    /* renamed from: n, reason: collision with root package name */
    public long f1842n;

    public C(h hVar, F1.c cVar) {
        hVar.getClass();
        this.f1839k = hVar;
        cVar.getClass();
        this.f1840l = cVar;
    }

    @Override // E1.h
    public final void close() throws F1.b {
        F1.c cVar = this.f1840l;
        try {
            this.f1839k.close();
            if (this.f1841m) {
                this.f1841m = false;
                if (cVar.f2158d == null) {
                    return;
                }
                try {
                    cVar.a();
                } catch (IOException e7) {
                    throw new F1.b(e7);
                }
            }
        } catch (Throwable th) {
            if (this.f1841m) {
                this.f1841m = false;
                if (cVar.f2158d != null) {
                    try {
                        cVar.a();
                    } catch (IOException e8) {
                        throw new F1.b(e8);
                    }
                }
            }
            throw th;
        }
    }

    @Override // E1.h
    public final Map d() {
        return this.f1839k.d();
    }

    @Override // E1.h
    public final long g(k kVar) throws F1.b {
        k kVar2 = kVar;
        long jG = this.f1839k.g(kVar2);
        this.f1842n = jG;
        if (jG == 0) {
            return 0L;
        }
        long j7 = kVar2.f1887g;
        if (j7 == -1 && jG != -1 && j7 != jG) {
            kVar2 = new k(kVar2.a, kVar2.f1882b, kVar2.f1883c, kVar2.f1884d, kVar2.f1885e, kVar2.f1886f, jG, kVar2.f1888h, kVar2.f1889i);
        }
        this.f1841m = true;
        F1.c cVar = this.f1840l;
        cVar.getClass();
        kVar2.f1888h.getClass();
        long j8 = kVar2.f1887g;
        int i7 = kVar2.f1889i;
        if (j8 == -1 && (i7 & 2) == 2) {
            cVar.f2158d = null;
        } else {
            cVar.f2158d = kVar2;
            cVar.f2159e = (i7 & 4) == 4 ? cVar.f2156b : Long.MAX_VALUE;
            cVar.f2163i = 0L;
            try {
                cVar.b(kVar2);
            } catch (IOException e7) {
                throw new F1.b(e7);
            }
        }
        return this.f1842n;
    }

    @Override // E1.h
    public final Uri getUri() {
        return this.f1839k.getUri();
    }

    @Override // E1.h
    public final void j(D d4) {
        d4.getClass();
        this.f1839k.j(d4);
    }

    @Override // y1.InterfaceC2385g
    public final int o(byte[] bArr, int i7, int i8) throws IOException {
        if (this.f1842n == 0) {
            return -1;
        }
        int iO = this.f1839k.o(bArr, i7, i8);
        if (iO > 0) {
            F1.c cVar = this.f1840l;
            k kVar = cVar.f2158d;
            if (kVar != null) {
                int i9 = 0;
                while (i9 < iO) {
                    try {
                        if (cVar.f2162h == cVar.f2159e) {
                            cVar.a();
                            cVar.b(kVar);
                        }
                        int iMin = (int) Math.min(iO - i9, cVar.f2159e - cVar.f2162h);
                        OutputStream outputStream = cVar.f2161g;
                        int i10 = K.a;
                        outputStream.write(bArr, i7 + i9, iMin);
                        i9 += iMin;
                        long j7 = iMin;
                        cVar.f2162h += j7;
                        cVar.f2163i += j7;
                    } catch (IOException e7) {
                        throw new F1.b(e7);
                    }
                }
            }
            long j8 = this.f1842n;
            if (j8 != -1) {
                this.f1842n = j8 - iO;
            }
        }
        return iO;
    }
}
