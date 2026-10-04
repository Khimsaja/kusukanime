package R4;

import X4.AbstractC0605b;
import X4.AbstractC0608e;
import X4.AbstractC0613j;
import X4.AbstractC0615l;
import X4.C0607d;
import X4.C0609f;
import X4.C0611h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c0 extends AbstractC0615l {

    /* renamed from: x, reason: collision with root package name */
    public static final c0 f8395x;

    /* renamed from: y, reason: collision with root package name */
    public static final C0570a f8396y = new C0570a(22);

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC0608e f8397l;

    /* renamed from: m, reason: collision with root package name */
    public int f8398m;

    /* renamed from: n, reason: collision with root package name */
    public int f8399n;

    /* renamed from: o, reason: collision with root package name */
    public int f8400o;

    /* renamed from: p, reason: collision with root package name */
    public U f8401p;

    /* renamed from: q, reason: collision with root package name */
    public int f8402q;

    /* renamed from: r, reason: collision with root package name */
    public U f8403r;

    /* renamed from: s, reason: collision with root package name */
    public int f8404s;

    /* renamed from: t, reason: collision with root package name */
    public List f8405t;

    /* renamed from: u, reason: collision with root package name */
    public C0574e f8406u;

    /* renamed from: v, reason: collision with root package name */
    public byte f8407v;

    /* renamed from: w, reason: collision with root package name */
    public int f8408w;

    static {
        c0 c0Var = new c0();
        f8395x = c0Var;
        c0Var.f8399n = 0;
        c0Var.f8400o = 0;
        U u5 = U.f8290D;
        c0Var.f8401p = u5;
        c0Var.f8402q = 0;
        c0Var.f8403r = u5;
        c0Var.f8404s = 0;
        c0Var.f8405t = Collections.EMPTY_LIST;
        c0Var.f8406u = C0574e.f8432z;
    }

    public c0(b0 b0Var) {
        super(b0Var);
        this.f8407v = (byte) -1;
        this.f8408w = -1;
        this.f8397l = b0Var.f9896k;
    }

    @Override // X4.w
    public final boolean a() {
        byte b4 = this.f8407v;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        int i7 = this.f8398m;
        if ((i7 & 2) != 2) {
            this.f8407v = (byte) 0;
            return false;
        }
        if ((i7 & 4) == 4 && !this.f8401p.a()) {
            this.f8407v = (byte) 0;
            return false;
        }
        if ((this.f8398m & 16) == 16 && !this.f8403r.a()) {
            this.f8407v = (byte) 0;
            return false;
        }
        for (int i8 = 0; i8 < this.f8405t.size(); i8++) {
            if (!((C0577h) this.f8405t.get(i8)).a()) {
                this.f8407v = (byte) 0;
                return false;
            }
        }
        if ((this.f8398m & 64) == 64 && !this.f8406u.a()) {
            this.f8407v = (byte) 0;
            return false;
        }
        if (i()) {
            this.f8407v = (byte) 1;
            return true;
        }
        this.f8407v = (byte) 0;
        return false;
    }

    @Override // X4.w
    public final AbstractC0605b b() {
        return f8395x;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8408w;
        if (i7 != -1) {
            return i7;
        }
        int iE = (this.f8398m & 1) == 1 ? B1.G.e(1, this.f8399n) : 0;
        if ((this.f8398m & 2) == 2) {
            iE += B1.G.e(2, this.f8400o);
        }
        if ((this.f8398m & 4) == 4) {
            iE += B1.G.g(3, this.f8401p);
        }
        if ((this.f8398m & 16) == 16) {
            iE += B1.G.g(4, this.f8403r);
        }
        if ((this.f8398m & 8) == 8) {
            iE += B1.G.e(5, this.f8402q);
        }
        if ((this.f8398m & 32) == 32) {
            iE += B1.G.e(6, this.f8404s);
        }
        for (int i8 = 0; i8 < this.f8405t.size(); i8++) {
            iE += B1.G.g(7, (AbstractC0605b) this.f8405t.get(i8));
        }
        if ((this.f8398m & 64) == 64) {
            iE += B1.G.g(8, this.f8406u);
        }
        int size = this.f8397l.size() + j() + iE;
        this.f8408w = size;
        return size;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        return b0.h();
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        b0 b0VarH = b0.h();
        b0VarH.i(this);
        return b0VarH;
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        L2.e eVar = new L2.e((AbstractC0615l) this);
        if ((this.f8398m & 1) == 1) {
            g4.B(1, this.f8399n);
        }
        if ((this.f8398m & 2) == 2) {
            g4.B(2, this.f8400o);
        }
        if ((this.f8398m & 4) == 4) {
            g4.D(3, this.f8401p);
        }
        if ((this.f8398m & 16) == 16) {
            g4.D(4, this.f8403r);
        }
        if ((this.f8398m & 8) == 8) {
            g4.B(5, this.f8402q);
        }
        if ((this.f8398m & 32) == 32) {
            g4.B(6, this.f8404s);
        }
        for (int i7 = 0; i7 < this.f8405t.size(); i7++) {
            g4.D(7, (AbstractC0605b) this.f8405t.get(i7));
        }
        if ((this.f8398m & 64) == 64) {
            g4.D(8, this.f8406u);
        }
        eVar.u1(200, g4);
        g4.G(this.f8397l);
    }

    public final b0 p() {
        b0 b0VarH = b0.h();
        b0VarH.i(this);
        return b0VarH;
    }

    public c0() {
        this.f8407v = (byte) -1;
        this.f8408w = -1;
        this.f8397l = AbstractC0608e.f9883k;
    }

    public c0(C0609f c0609f, C0611h c0611h) {
        this.f8407v = (byte) -1;
        this.f8408w = -1;
        boolean z7 = false;
        this.f8399n = 0;
        this.f8400o = 0;
        U u5 = U.f8290D;
        this.f8401p = u5;
        this.f8402q = 0;
        this.f8403r = u5;
        this.f8404s = 0;
        this.f8405t = Collections.EMPTY_LIST;
        this.f8406u = C0574e.f8432z;
        C0607d c0607d = new C0607d();
        B1.G gS = B1.G.s(c0607d, 1);
        char c2 = 0;
        while (!z7) {
            try {
                try {
                    int iN = c0609f.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f8398m |= 1;
                            this.f8399n = c0609f.k();
                        } else if (iN != 16) {
                            C0572c c0572cJ = null;
                            T tR = null;
                            T tR2 = null;
                            if (iN == 26) {
                                if ((this.f8398m & 4) == 4) {
                                    U u7 = this.f8401p;
                                    u7.getClass();
                                    tR = U.r(u7);
                                }
                                U u8 = (U) c0609f.g(U.f8291E, c0611h);
                                this.f8401p = u8;
                                if (tR != null) {
                                    tR.i(u8);
                                    this.f8401p = tR.g();
                                }
                                this.f8398m |= 4;
                            } else if (iN == 34) {
                                if ((this.f8398m & 16) == 16) {
                                    U u9 = this.f8403r;
                                    u9.getClass();
                                    tR2 = U.r(u9);
                                }
                                U u10 = (U) c0609f.g(U.f8291E, c0611h);
                                this.f8403r = u10;
                                if (tR2 != null) {
                                    tR2.i(u10);
                                    this.f8403r = tR2.g();
                                }
                                this.f8398m |= 16;
                            } else if (iN == 40) {
                                this.f8398m |= 8;
                                this.f8402q = c0609f.k();
                            } else if (iN == 48) {
                                this.f8398m |= 32;
                                this.f8404s = c0609f.k();
                            } else if (iN == 58) {
                                int i7 = (c2 == true ? 1 : 0) & '@';
                                c2 = c2;
                                if (i7 != 64) {
                                    this.f8405t = new ArrayList();
                                    c2 = '@';
                                }
                                this.f8405t.add(c0609f.g(C0577h.f8483r, c0611h));
                            } else if (iN != 66) {
                                if (!n(c0609f, gS, c0611h, iN)) {
                                }
                            } else {
                                if ((this.f8398m & 64) == 64) {
                                    C0574e c0574e = this.f8406u;
                                    c0574e.getClass();
                                    c0572cJ = C0574e.j(c0574e);
                                }
                                C0574e c0574e2 = (C0574e) c0609f.g(C0574e.f8431A, c0611h);
                                this.f8406u = c0574e2;
                                if (c0572cJ != null) {
                                    c0572cJ.h(c0574e2);
                                    this.f8406u = c0572cJ.f();
                                }
                                this.f8398m |= 64;
                            }
                        } else {
                            this.f8398m |= 2;
                            this.f8400o = c0609f.k();
                        }
                    }
                    z7 = true;
                } catch (X4.r e7) {
                    e7.f9907k = this;
                    throw e7;
                } catch (IOException e8) {
                    X4.r rVar = new X4.r(e8.getMessage());
                    rVar.f9907k = this;
                    throw rVar;
                }
            } catch (Throwable th) {
                if (((c2 == true ? 1 : 0) & '@') == 64) {
                    this.f8405t = Collections.unmodifiableList(this.f8405t);
                }
                try {
                    gS.m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f8397l = c0607d.g();
                    throw th2;
                }
                this.f8397l = c0607d.g();
                m();
                throw th;
            }
        }
        if (((c2 == true ? 1 : 0) & '@') == 64) {
            this.f8405t = Collections.unmodifiableList(this.f8405t);
        }
        try {
            gS.m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8397l = c0607d.g();
            throw th3;
        }
        this.f8397l = c0607d.g();
        m();
    }
}
