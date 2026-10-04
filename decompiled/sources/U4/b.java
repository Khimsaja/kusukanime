package U4;

import B1.G;
import R4.C0570a;
import X4.AbstractC0608e;
import X4.AbstractC0613j;
import X4.AbstractC0618o;
import X4.C0607d;
import X4.C0609f;
import X4.r;
import java.io.IOException;

/* loaded from: classes.dex */
public final class b extends AbstractC0618o {

    /* renamed from: q, reason: collision with root package name */
    public static final b f9234q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0570a f9235r = new C0570a(25);

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0608e f9236k;

    /* renamed from: l, reason: collision with root package name */
    public int f9237l;

    /* renamed from: m, reason: collision with root package name */
    public int f9238m;

    /* renamed from: n, reason: collision with root package name */
    public int f9239n;

    /* renamed from: o, reason: collision with root package name */
    public byte f9240o;

    /* renamed from: p, reason: collision with root package name */
    public int f9241p;

    static {
        b bVar = new b();
        f9234q = bVar;
        bVar.f9238m = 0;
        bVar.f9239n = 0;
    }

    public b() {
        this.f9240o = (byte) -1;
        this.f9241p = -1;
        this.f9236k = AbstractC0608e.f9883k;
    }

    @Override // X4.w
    public final boolean a() {
        if (this.f9240o == 1) {
            return true;
        }
        this.f9240o = (byte) 1;
        return true;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f9241p;
        if (i7 != -1) {
            return i7;
        }
        int iE = (this.f9237l & 1) == 1 ? G.e(1, this.f9238m) : 0;
        if ((this.f9237l & 2) == 2) {
            iE += G.e(2, this.f9239n);
        }
        int size = this.f9236k.size() + iE;
        this.f9241p = size;
        return size;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        return new a(0);
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        a aVar = new a(0);
        aVar.h(this);
        return aVar;
    }

    @Override // X4.AbstractC0605b
    public final void f(G g4) throws IOException {
        c();
        if ((this.f9237l & 1) == 1) {
            g4.B(1, this.f9238m);
        }
        if ((this.f9237l & 2) == 2) {
            g4.B(2, this.f9239n);
        }
        g4.G(this.f9236k);
    }

    public b(a aVar) {
        this.f9240o = (byte) -1;
        this.f9241p = -1;
        this.f9236k = aVar.f9896k;
    }

    public b(C0609f c0609f) {
        this.f9240o = (byte) -1;
        this.f9241p = -1;
        boolean z7 = false;
        this.f9238m = 0;
        this.f9239n = 0;
        C0607d c0607d = new C0607d();
        G gS = G.s(c0607d, 1);
        while (!z7) {
            try {
                try {
                    int iN = c0609f.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f9237l |= 1;
                            this.f9238m = c0609f.k();
                        } else if (iN != 16) {
                            if (!c0609f.q(iN, gS)) {
                            }
                        } else {
                            this.f9237l |= 2;
                            this.f9239n = c0609f.k();
                        }
                    }
                    z7 = true;
                } catch (r e7) {
                    e7.f9907k = this;
                    throw e7;
                } catch (IOException e8) {
                    r rVar = new r(e8.getMessage());
                    rVar.f9907k = this;
                    throw rVar;
                }
            } catch (Throwable th) {
                try {
                    gS.m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    throw th2;
                }
                throw th;
            }
        }
        try {
            gS.m();
        } catch (IOException unused2) {
        } finally {
            this.f9236k = c0607d.g();
        }
    }
}
