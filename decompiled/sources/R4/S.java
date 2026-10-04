package R4;

import X4.AbstractC0608e;
import X4.AbstractC0613j;
import X4.AbstractC0618o;
import X4.C0607d;
import X4.C0609f;
import X4.C0611h;
import java.io.IOException;

/* loaded from: classes.dex */
public final class S extends AbstractC0618o {

    /* renamed from: r, reason: collision with root package name */
    public static final S f8266r;

    /* renamed from: s, reason: collision with root package name */
    public static final C0570a f8267s = new C0570a(18);

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0608e f8268k;

    /* renamed from: l, reason: collision with root package name */
    public int f8269l;

    /* renamed from: m, reason: collision with root package name */
    public Q f8270m;

    /* renamed from: n, reason: collision with root package name */
    public U f8271n;

    /* renamed from: o, reason: collision with root package name */
    public int f8272o;

    /* renamed from: p, reason: collision with root package name */
    public byte f8273p;

    /* renamed from: q, reason: collision with root package name */
    public int f8274q;

    static {
        S s7 = new S();
        f8266r = s7;
        s7.f8270m = Q.INV;
        s7.f8271n = U.f8290D;
        s7.f8272o = 0;
    }

    public S() {
        this.f8273p = (byte) -1;
        this.f8274q = -1;
        this.f8268k = AbstractC0608e.f9883k;
    }

    @Override // X4.w
    public final boolean a() {
        byte b4 = this.f8273p;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        if ((this.f8269l & 2) != 2 || this.f8271n.a()) {
            this.f8273p = (byte) 1;
            return true;
        }
        this.f8273p = (byte) 0;
        return false;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8274q;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f8269l & 1) == 1 ? B1.G.d(1, this.f8270m.f8265k) : 0;
        if ((this.f8269l & 2) == 2) {
            iD += B1.G.g(2, this.f8271n);
        }
        if ((this.f8269l & 4) == 4) {
            iD += B1.G.e(3, this.f8272o);
        }
        int size = this.f8268k.size() + iD;
        this.f8274q = size;
        return size;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        return P.g();
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        P pG = P.g();
        pG.h(this);
        return pG;
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        if ((this.f8269l & 1) == 1) {
            g4.A(1, this.f8270m.f8265k);
        }
        if ((this.f8269l & 2) == 2) {
            g4.D(2, this.f8271n);
        }
        if ((this.f8269l & 4) == 4) {
            g4.B(3, this.f8272o);
        }
        g4.G(this.f8268k);
    }

    public S(P p7) {
        this.f8273p = (byte) -1;
        this.f8274q = -1;
        this.f8268k = p7.f9896k;
    }

    public S(C0609f c0609f, C0611h c0611h) {
        this.f8273p = (byte) -1;
        this.f8274q = -1;
        Q q6 = Q.INV;
        this.f8270m = q6;
        this.f8271n = U.f8290D;
        boolean z7 = false;
        this.f8272o = 0;
        C0607d c0607d = new C0607d();
        B1.G gS = B1.G.s(c0607d, 1);
        while (!z7) {
            try {
                try {
                    try {
                        int iN = c0609f.n();
                        if (iN != 0) {
                            T tR = null;
                            Q q7 = null;
                            if (iN == 8) {
                                int iK = c0609f.k();
                                if (iK == 0) {
                                    q7 = Q.IN;
                                } else if (iK == 1) {
                                    q7 = Q.OUT;
                                } else if (iK == 2) {
                                    q7 = q6;
                                } else if (iK == 3) {
                                    q7 = Q.STAR;
                                }
                                if (q7 == null) {
                                    gS.K(iN);
                                    gS.K(iK);
                                } else {
                                    this.f8269l |= 1;
                                    this.f8270m = q7;
                                }
                            } else if (iN == 18) {
                                if ((this.f8269l & 2) == 2) {
                                    U u5 = this.f8271n;
                                    u5.getClass();
                                    tR = U.r(u5);
                                }
                                U u7 = (U) c0609f.g(U.f8291E, c0611h);
                                this.f8271n = u7;
                                if (tR != null) {
                                    tR.i(u7);
                                    this.f8271n = tR.g();
                                }
                                this.f8269l |= 2;
                            } else if (iN != 24) {
                                if (!c0609f.q(iN, gS)) {
                                }
                            } else {
                                this.f8269l |= 4;
                                this.f8272o = c0609f.k();
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
            this.f8268k = c0607d.g();
        }
    }
}
