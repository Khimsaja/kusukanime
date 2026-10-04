package R4;

import X4.AbstractC0608e;
import X4.AbstractC0613j;
import X4.AbstractC0618o;
import X4.C0607d;
import X4.C0609f;
import java.io.IOException;

/* loaded from: classes.dex */
public final class g0 extends AbstractC0618o {

    /* renamed from: u, reason: collision with root package name */
    public static final g0 f8470u;

    /* renamed from: v, reason: collision with root package name */
    public static final C0570a f8471v = new C0570a(23);

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0608e f8472k;

    /* renamed from: l, reason: collision with root package name */
    public int f8473l;

    /* renamed from: m, reason: collision with root package name */
    public int f8474m;

    /* renamed from: n, reason: collision with root package name */
    public int f8475n;

    /* renamed from: o, reason: collision with root package name */
    public e0 f8476o;

    /* renamed from: p, reason: collision with root package name */
    public int f8477p;

    /* renamed from: q, reason: collision with root package name */
    public int f8478q;

    /* renamed from: r, reason: collision with root package name */
    public f0 f8479r;

    /* renamed from: s, reason: collision with root package name */
    public byte f8480s;

    /* renamed from: t, reason: collision with root package name */
    public int f8481t;

    static {
        g0 g0Var = new g0();
        f8470u = g0Var;
        g0Var.f8474m = 0;
        g0Var.f8475n = 0;
        g0Var.f8476o = e0.ERROR;
        g0Var.f8477p = 0;
        g0Var.f8478q = 0;
        g0Var.f8479r = f0.LANGUAGE_VERSION;
    }

    public g0() {
        this.f8480s = (byte) -1;
        this.f8481t = -1;
        this.f8472k = AbstractC0608e.f9883k;
    }

    @Override // X4.w
    public final boolean a() {
        if (this.f8480s == 1) {
            return true;
        }
        this.f8480s = (byte) 1;
        return true;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8481t;
        if (i7 != -1) {
            return i7;
        }
        int iE = (this.f8473l & 1) == 1 ? B1.G.e(1, this.f8474m) : 0;
        if ((this.f8473l & 2) == 2) {
            iE += B1.G.e(2, this.f8475n);
        }
        if ((this.f8473l & 4) == 4) {
            iE += B1.G.d(3, this.f8476o.f8452k);
        }
        if ((this.f8473l & 8) == 8) {
            iE += B1.G.e(4, this.f8477p);
        }
        if ((this.f8473l & 16) == 16) {
            iE += B1.G.e(5, this.f8478q);
        }
        if ((this.f8473l & 32) == 32) {
            iE += B1.G.d(6, this.f8479r.f8465k);
        }
        int size = this.f8472k.size() + iE;
        this.f8481t = size;
        return size;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        return d0.g();
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        d0 d0VarG = d0.g();
        d0VarG.h(this);
        return d0VarG;
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        if ((this.f8473l & 1) == 1) {
            g4.B(1, this.f8474m);
        }
        if ((this.f8473l & 2) == 2) {
            g4.B(2, this.f8475n);
        }
        if ((this.f8473l & 4) == 4) {
            g4.A(3, this.f8476o.f8452k);
        }
        if ((this.f8473l & 8) == 8) {
            g4.B(4, this.f8477p);
        }
        if ((this.f8473l & 16) == 16) {
            g4.B(5, this.f8478q);
        }
        if ((this.f8473l & 32) == 32) {
            g4.A(6, this.f8479r.f8465k);
        }
        g4.G(this.f8472k);
    }

    public g0(d0 d0Var) {
        this.f8480s = (byte) -1;
        this.f8481t = -1;
        this.f8472k = d0Var.f9896k;
    }

    public g0(C0609f c0609f) {
        this.f8480s = (byte) -1;
        this.f8481t = -1;
        boolean z7 = false;
        this.f8474m = 0;
        this.f8475n = 0;
        e0 e0Var = e0.ERROR;
        this.f8476o = e0Var;
        this.f8477p = 0;
        this.f8478q = 0;
        f0 f0Var = f0.LANGUAGE_VERSION;
        this.f8479r = f0Var;
        C0607d c0607d = new C0607d();
        B1.G gS = B1.G.s(c0607d, 1);
        while (!z7) {
            try {
                try {
                    try {
                        int iN = c0609f.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f8473l |= 1;
                                this.f8474m = c0609f.k();
                            } else if (iN != 16) {
                                f0 f0Var2 = null;
                                e0 e0Var2 = null;
                                if (iN == 24) {
                                    int iK = c0609f.k();
                                    if (iK == 0) {
                                        e0Var2 = e0.WARNING;
                                    } else if (iK == 1) {
                                        e0Var2 = e0Var;
                                    } else if (iK == 2) {
                                        e0Var2 = e0.HIDDEN;
                                    }
                                    if (e0Var2 == null) {
                                        gS.K(iN);
                                        gS.K(iK);
                                    } else {
                                        this.f8473l |= 4;
                                        this.f8476o = e0Var2;
                                    }
                                } else if (iN == 32) {
                                    this.f8473l |= 8;
                                    this.f8477p = c0609f.k();
                                } else if (iN == 40) {
                                    this.f8473l |= 16;
                                    this.f8478q = c0609f.k();
                                } else if (iN != 48) {
                                    if (!c0609f.q(iN, gS)) {
                                    }
                                } else {
                                    int iK2 = c0609f.k();
                                    if (iK2 == 0) {
                                        f0Var2 = f0Var;
                                    } else if (iK2 == 1) {
                                        f0Var2 = f0.COMPILER_VERSION;
                                    } else if (iK2 == 2) {
                                        f0Var2 = f0.API_VERSION;
                                    }
                                    if (f0Var2 == null) {
                                        gS.K(iN);
                                        gS.K(iK2);
                                    } else {
                                        this.f8473l |= 32;
                                        this.f8479r = f0Var2;
                                    }
                                }
                            } else {
                                this.f8473l |= 2;
                                this.f8475n = c0609f.k();
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
            this.f8472k = c0607d.g();
        }
    }
}
