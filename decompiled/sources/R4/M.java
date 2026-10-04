package R4;

import X4.AbstractC0608e;
import X4.AbstractC0613j;
import X4.AbstractC0618o;
import X4.C0607d;
import X4.C0609f;
import java.io.IOException;

/* loaded from: classes.dex */
public final class M extends AbstractC0618o {

    /* renamed from: r, reason: collision with root package name */
    public static final M f8235r;

    /* renamed from: s, reason: collision with root package name */
    public static final C0570a f8236s = new C0570a(15);

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0608e f8237k;

    /* renamed from: l, reason: collision with root package name */
    public int f8238l;

    /* renamed from: m, reason: collision with root package name */
    public int f8239m;

    /* renamed from: n, reason: collision with root package name */
    public int f8240n;

    /* renamed from: o, reason: collision with root package name */
    public L f8241o;

    /* renamed from: p, reason: collision with root package name */
    public byte f8242p;

    /* renamed from: q, reason: collision with root package name */
    public int f8243q;

    static {
        M m7 = new M();
        f8235r = m7;
        m7.f8239m = -1;
        m7.f8240n = 0;
        m7.f8241o = L.PACKAGE;
    }

    public M() {
        this.f8242p = (byte) -1;
        this.f8243q = -1;
        this.f8237k = AbstractC0608e.f9883k;
    }

    @Override // X4.w
    public final boolean a() {
        byte b4 = this.f8242p;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        if ((this.f8238l & 2) == 2) {
            this.f8242p = (byte) 1;
            return true;
        }
        this.f8242p = (byte) 0;
        return false;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8243q;
        if (i7 != -1) {
            return i7;
        }
        int iE = (this.f8238l & 1) == 1 ? B1.G.e(1, this.f8239m) : 0;
        if ((this.f8238l & 2) == 2) {
            iE += B1.G.e(2, this.f8240n);
        }
        if ((this.f8238l & 4) == 4) {
            iE += B1.G.d(3, this.f8241o.f8234k);
        }
        int size = this.f8237k.size() + iE;
        this.f8243q = size;
        return size;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        return K.g();
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        K kG = K.g();
        kG.h(this);
        return kG;
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        if ((this.f8238l & 1) == 1) {
            g4.B(1, this.f8239m);
        }
        if ((this.f8238l & 2) == 2) {
            g4.B(2, this.f8240n);
        }
        if ((this.f8238l & 4) == 4) {
            g4.A(3, this.f8241o.f8234k);
        }
        g4.G(this.f8237k);
    }

    public M(K k7) {
        this.f8242p = (byte) -1;
        this.f8243q = -1;
        this.f8237k = k7.f9896k;
    }

    public M(C0609f c0609f) {
        L l7;
        this.f8242p = (byte) -1;
        this.f8243q = -1;
        this.f8239m = -1;
        boolean z7 = false;
        this.f8240n = 0;
        L l8 = L.PACKAGE;
        this.f8241o = l8;
        C0607d c0607d = new C0607d();
        B1.G gS = B1.G.s(c0607d, 1);
        while (!z7) {
            try {
                try {
                    try {
                        int iN = c0609f.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f8238l |= 1;
                                this.f8239m = c0609f.k();
                            } else if (iN == 16) {
                                this.f8238l |= 2;
                                this.f8240n = c0609f.k();
                            } else if (iN != 24) {
                                if (!c0609f.q(iN, gS)) {
                                }
                            } else {
                                int iK = c0609f.k();
                                if (iK == 0) {
                                    l7 = L.CLASS;
                                } else if (iK != 1) {
                                    l7 = iK != 2 ? null : L.LOCAL;
                                } else {
                                    l7 = l8;
                                }
                                if (l7 == null) {
                                    gS.K(iN);
                                    gS.K(iK);
                                } else {
                                    this.f8238l |= 4;
                                    this.f8241o = l7;
                                }
                            }
                        }
                        z7 = true;
                    } catch (IOException e7) {
                        X4.r rVar = new X4.r(e7.getMessage());
                        rVar.f9907k = this;
                        throw rVar;
                    }
                } catch (X4.r e8) {
                    e8.f9907k = this;
                    throw e8;
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
            this.f8237k = c0607d.g();
        }
    }
}
