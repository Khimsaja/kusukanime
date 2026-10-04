package F1;

import B1.AbstractC0015b;
import B1.K;
import E1.C;
import E1.D;
import E1.y;
import android.net.Uri;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements E1.h {

    /* renamed from: A, reason: collision with root package name */
    public boolean f2169A;

    /* renamed from: B, reason: collision with root package name */
    public long f2170B;

    /* renamed from: k, reason: collision with root package name */
    public final u f2171k;

    /* renamed from: l, reason: collision with root package name */
    public final E1.h f2172l;

    /* renamed from: m, reason: collision with root package name */
    public final C f2173m;

    /* renamed from: n, reason: collision with root package name */
    public final E1.h f2174n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f2175o = false;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f2176p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f2177q;

    /* renamed from: r, reason: collision with root package name */
    public Uri f2178r;

    /* renamed from: s, reason: collision with root package name */
    public E1.k f2179s;

    /* renamed from: t, reason: collision with root package name */
    public E1.k f2180t;

    /* renamed from: u, reason: collision with root package name */
    public E1.h f2181u;

    /* renamed from: v, reason: collision with root package name */
    public long f2182v;

    /* renamed from: w, reason: collision with root package name */
    public long f2183w;

    /* renamed from: x, reason: collision with root package name */
    public long f2184x;

    /* renamed from: y, reason: collision with root package name */
    public v f2185y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2186z;

    public e(u uVar, E1.h hVar, E1.h hVar2, c cVar, int i7) {
        this.f2171k = uVar;
        this.f2172l = hVar2;
        this.f2176p = (i7 & 2) != 0;
        this.f2177q = (i7 & 4) != 0;
        if (hVar != null) {
            this.f2174n = hVar;
            this.f2173m = cVar != null ? new C(hVar, cVar) : null;
        } else {
            this.f2174n = y.f1928k;
            this.f2173m = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        u uVar = this.f2171k;
        E1.h hVar = this.f2181u;
        if (hVar == null) {
            return;
        }
        try {
            hVar.close();
        } finally {
            this.f2180t = null;
            this.f2181u = null;
            v vVar = this.f2185y;
            if (vVar != null) {
                uVar.j(vVar);
                this.f2185y = null;
            }
        }
    }

    @Override // E1.h
    public final void close() {
        this.f2179s = null;
        this.f2178r = null;
        this.f2183w = 0L;
        try {
            b();
        } catch (Throwable th) {
            if (this.f2181u == this.f2172l || (th instanceof a)) {
                this.f2186z = true;
            }
            throw th;
        }
    }

    @Override // E1.h
    public final Map d() {
        return !(this.f2181u == this.f2172l) ? this.f2174n.d() : Collections.EMPTY_MAP;
    }

    @Override // E1.h
    public final long g(E1.k kVar) {
        long j7;
        u uVar = this.f2171k;
        try {
            String string = kVar.f1888h;
            long j8 = kVar.f1886f;
            if (string == null) {
                string = kVar.a.toString();
            }
            E1.j jVarA = kVar.a();
            jVarA.f1879h = string;
            E1.k kVarA = jVarA.a();
            this.f2179s = kVarA;
            Uri uri = kVarA.a;
            byte[] bArr = (byte[]) uVar.g(string).f2210b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, StandardCharsets.UTF_8) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.f2178r = uri;
            this.f2183w = j8;
            boolean z7 = this.f2176p;
            long j9 = kVar.f1887g;
            boolean z8 = (z7 && this.f2186z) || (this.f2177q && j9 == -1);
            this.f2169A = z8;
            if (z8) {
                this.f2184x = -1L;
                j7 = -1;
            } else {
                j7 = -1;
                long jA = o.a(uVar.g(string));
                this.f2184x = jA;
                if (jA != -1) {
                    long j10 = jA - j8;
                    this.f2184x = j10;
                    if (j10 < 0) {
                        throw new E1.i(2008);
                    }
                }
            }
            if (j9 != j7) {
                long j11 = this.f2184x;
                this.f2184x = j11 == j7 ? j9 : Math.min(j11, j9);
            }
            long j12 = this.f2184x;
            if (j12 > 0 || j12 == j7) {
                k(kVarA, false);
            }
            return j9 != j7 ? j9 : this.f2184x;
        } catch (Throwable th) {
            if (this.f2181u == this.f2172l || (th instanceof a)) {
                this.f2186z = true;
            }
            throw th;
        }
    }

    @Override // E1.h
    public final Uri getUri() {
        return this.f2178r;
    }

    @Override // E1.h
    public final void j(D d4) {
        d4.getClass();
        this.f2172l.j(d4);
        this.f2174n.j(d4);
    }

    public final void k(E1.k kVar, boolean z7) throws InterruptedIOException {
        v vVarN;
        E1.k kVarA;
        E1.h hVar;
        String str = kVar.f1888h;
        int i7 = K.a;
        if (this.f2169A) {
            vVarN = null;
        } else if (this.f2175o) {
            try {
                u uVar = this.f2171k;
                long j7 = this.f2183w;
                long j8 = this.f2184x;
                synchronized (uVar) {
                    uVar.d();
                    while (true) {
                        vVarN = uVar.n(j7, j8, str);
                        if (vVarN != null) {
                            break;
                        } else {
                            uVar.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            vVarN = this.f2171k.n(this.f2183w, this.f2184x, str);
        }
        if (vVarN == null) {
            hVar = this.f2174n;
            E1.j jVarA = kVar.a();
            jVarA.f1877f = this.f2183w;
            jVarA.f1878g = this.f2184x;
            kVarA = jVarA.a();
        } else if (vVarN.f2193n) {
            Uri uriFromFile = Uri.fromFile(vVarN.f2194o);
            long j9 = vVarN.f2191l;
            long j10 = this.f2183w - j9;
            long jMin = vVarN.f2192m - j10;
            long j11 = this.f2184x;
            if (j11 != -1) {
                jMin = Math.min(jMin, j11);
            }
            E1.j jVarA2 = kVar.a();
            jVarA2.a = uriFromFile;
            jVarA2.f1873b = j9;
            jVarA2.f1877f = j10;
            jVarA2.f1878g = jMin;
            kVarA = jVarA2.a();
            hVar = this.f2172l;
        } else {
            long jMin2 = vVarN.f2192m;
            if (jMin2 == -1) {
                jMin2 = this.f2184x;
            } else {
                long j12 = this.f2184x;
                if (j12 != -1) {
                    jMin2 = Math.min(jMin2, j12);
                }
            }
            E1.j jVarA3 = kVar.a();
            jVarA3.f1877f = this.f2183w;
            jVarA3.f1878g = jMin2;
            kVarA = jVarA3.a();
            hVar = this.f2173m;
            if (hVar == null) {
                hVar = this.f2174n;
                this.f2171k.j(vVarN);
                vVarN = null;
            }
        }
        this.f2170B = (this.f2169A || hVar != this.f2174n) ? Long.MAX_VALUE : this.f2183w + 102400;
        if (z7) {
            AbstractC0015b.h(this.f2181u == this.f2174n);
            if (hVar == this.f2174n) {
                return;
            }
            try {
                b();
            } catch (Throwable th) {
                if (!vVarN.f2193n) {
                    this.f2171k.j(vVarN);
                }
                throw th;
            }
        }
        if (vVarN != null && !vVarN.f2193n) {
            this.f2185y = vVarN;
        }
        this.f2181u = hVar;
        this.f2180t = kVarA;
        this.f2182v = 0L;
        long jG = hVar.g(kVarA);
        g gVar = new g();
        if (kVarA.f1887g == -1 && jG != -1) {
            this.f2184x = jG;
            gVar.a("exo_len", Long.valueOf(this.f2183w + jG));
        }
        if (!(this.f2181u == this.f2172l)) {
            Uri uri = hVar.getUri();
            this.f2178r = uri;
            Uri uri2 = kVar.a.equals(uri) ? null : this.f2178r;
            if (uri2 == null) {
                ((ArrayList) gVar.f2189b).add("exo_redir");
                ((HashMap) gVar.a).remove("exo_redir");
            } else {
                gVar.a("exo_redir", uri2.toString());
            }
        }
        if (this.f2181u == this.f2173m) {
            this.f2171k.c(str, gVar);
        }
    }

    @Override // y1.InterfaceC2385g
    public final int o(byte[] bArr, int i7, int i8) {
        int i9;
        long j7;
        E1.h hVar = this.f2172l;
        if (i8 == 0) {
            return 0;
        }
        if (this.f2184x == 0) {
            return -1;
        }
        E1.k kVar = this.f2179s;
        kVar.getClass();
        E1.k kVar2 = this.f2180t;
        kVar2.getClass();
        try {
            if (this.f2183w >= this.f2170B) {
                k(kVar, true);
            }
            E1.h hVar2 = this.f2181u;
            hVar2.getClass();
            int iO = hVar2.o(bArr, i7, i8);
            if (iO != -1) {
                long j8 = iO;
                this.f2183w += j8;
                this.f2182v += j8;
                long j9 = this.f2184x;
                if (j9 == -1) {
                    return iO;
                }
                this.f2184x = j9 - j8;
                return iO;
            }
            E1.h hVar3 = this.f2181u;
            if (!(hVar3 == hVar)) {
                j7 = -1;
                long j10 = kVar2.f1887g;
                if (j10 != -1) {
                    i9 = iO;
                    if (this.f2182v < j10) {
                    }
                } else {
                    i9 = iO;
                }
                String str = kVar.f1888h;
                int i10 = K.a;
                this.f2184x = 0L;
                if (!(hVar3 == this.f2173m)) {
                    return i9;
                }
                g gVar = new g();
                gVar.a("exo_len", Long.valueOf(this.f2183w));
                this.f2171k.c(str, gVar);
                return i9;
            }
            i9 = iO;
            j7 = -1;
            long j11 = this.f2184x;
            if (j11 <= 0 && j11 != j7) {
                return i9;
            }
            b();
            k(kVar, false);
            return o(bArr, i7, i8);
        } catch (Throwable th) {
            if (this.f2181u == hVar || (th instanceof a)) {
                this.f2186z = true;
            }
            throw th;
        }
    }
}
