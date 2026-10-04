package R4;

import X4.AbstractC0605b;
import X4.AbstractC0608e;
import X4.AbstractC0613j;
import X4.AbstractC0615l;
import X4.C0607d;
import X4.C0609f;
import X4.C0611h;
import io.ktor.client.utils.CIOKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class Z extends AbstractC0615l {

    /* renamed from: w, reason: collision with root package name */
    public static final Z f8349w;

    /* renamed from: x, reason: collision with root package name */
    public static final C0570a f8350x = new C0570a(20);

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC0608e f8351l;

    /* renamed from: m, reason: collision with root package name */
    public int f8352m;

    /* renamed from: n, reason: collision with root package name */
    public int f8353n;

    /* renamed from: o, reason: collision with root package name */
    public int f8354o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8355p;

    /* renamed from: q, reason: collision with root package name */
    public Y f8356q;

    /* renamed from: r, reason: collision with root package name */
    public List f8357r;

    /* renamed from: s, reason: collision with root package name */
    public List f8358s;

    /* renamed from: t, reason: collision with root package name */
    public int f8359t;

    /* renamed from: u, reason: collision with root package name */
    public byte f8360u;

    /* renamed from: v, reason: collision with root package name */
    public int f8361v;

    static {
        Z z7 = new Z();
        f8349w = z7;
        z7.f8353n = 0;
        z7.f8354o = 0;
        z7.f8355p = false;
        z7.f8356q = Y.INV;
        List list = Collections.EMPTY_LIST;
        z7.f8357r = list;
        z7.f8358s = list;
    }

    public Z(X x7) {
        super(x7);
        this.f8359t = -1;
        this.f8360u = (byte) -1;
        this.f8361v = -1;
        this.f8351l = x7.f9896k;
    }

    @Override // X4.w
    public final boolean a() {
        byte b4 = this.f8360u;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        int i7 = this.f8352m;
        if ((i7 & 1) != 1) {
            this.f8360u = (byte) 0;
            return false;
        }
        if ((i7 & 2) != 2) {
            this.f8360u = (byte) 0;
            return false;
        }
        for (int i8 = 0; i8 < this.f8357r.size(); i8++) {
            if (!((U) this.f8357r.get(i8)).a()) {
                this.f8360u = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.f8360u = (byte) 1;
            return true;
        }
        this.f8360u = (byte) 0;
        return false;
    }

    @Override // X4.w
    public final AbstractC0605b b() {
        return f8349w;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8361v;
        if (i7 != -1) {
            return i7;
        }
        int iE = (this.f8352m & 1) == 1 ? B1.G.e(1, this.f8353n) : 0;
        if ((this.f8352m & 2) == 2) {
            iE += B1.G.e(2, this.f8354o);
        }
        if ((this.f8352m & 4) == 4) {
            iE += B1.G.k(3) + 1;
        }
        if ((this.f8352m & 8) == 8) {
            iE += B1.G.d(4, this.f8356q.f8348k);
        }
        for (int i8 = 0; i8 < this.f8357r.size(); i8++) {
            iE += B1.G.g(5, (AbstractC0605b) this.f8357r.get(i8));
        }
        int iF = 0;
        for (int i9 = 0; i9 < this.f8358s.size(); i9++) {
            iF += B1.G.f(((Integer) this.f8358s.get(i9)).intValue());
        }
        int iF2 = iE + iF;
        if (!this.f8358s.isEmpty()) {
            iF2 = iF2 + 1 + B1.G.f(iF);
        }
        this.f8359t = iF;
        int size = this.f8351l.size() + j() + iF2;
        this.f8361v = size;
        return size;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        return X.h();
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        X xH = X.h();
        xH.i(this);
        return xH;
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        L2.e eVar = new L2.e((AbstractC0615l) this);
        if ((this.f8352m & 1) == 1) {
            g4.B(1, this.f8353n);
        }
        if ((this.f8352m & 2) == 2) {
            g4.B(2, this.f8354o);
        }
        if ((this.f8352m & 4) == 4) {
            boolean z7 = this.f8355p;
            g4.M(3, 0);
            g4.F(z7 ? 1 : 0);
        }
        if ((this.f8352m & 8) == 8) {
            g4.A(4, this.f8356q.f8348k);
        }
        for (int i7 = 0; i7 < this.f8357r.size(); i7++) {
            g4.D(5, (AbstractC0605b) this.f8357r.get(i7));
        }
        if (this.f8358s.size() > 0) {
            g4.K(50);
            g4.K(this.f8359t);
        }
        for (int i8 = 0; i8 < this.f8358s.size(); i8++) {
            g4.C(((Integer) this.f8358s.get(i8)).intValue());
        }
        eVar.u1(CIOKt.DEFAULT_HTTP_POOL_SIZE, g4);
        g4.G(this.f8351l);
    }

    public Z() {
        this.f8359t = -1;
        this.f8360u = (byte) -1;
        this.f8361v = -1;
        this.f8351l = AbstractC0608e.f9883k;
    }

    public Z(C0609f c0609f, C0611h c0611h) {
        Y y7;
        this.f8359t = -1;
        this.f8360u = (byte) -1;
        this.f8361v = -1;
        this.f8353n = 0;
        this.f8354o = 0;
        this.f8355p = false;
        Y y8 = Y.INV;
        this.f8356q = y8;
        List list = Collections.EMPTY_LIST;
        this.f8357r = list;
        this.f8358s = list;
        C0607d c0607d = new C0607d();
        B1.G gS = B1.G.s(c0607d, 1);
        boolean z7 = false;
        int i7 = 0;
        while (!z7) {
            try {
                try {
                    int iN = c0609f.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f8352m |= 1;
                            this.f8353n = c0609f.k();
                        } else if (iN == 16) {
                            this.f8352m |= 2;
                            this.f8354o = c0609f.k();
                        } else if (iN == 24) {
                            this.f8352m |= 4;
                            this.f8355p = c0609f.l() != 0;
                        } else if (iN == 32) {
                            int iK = c0609f.k();
                            if (iK == 0) {
                                y7 = Y.IN;
                            } else if (iK != 1) {
                                y7 = iK != 2 ? null : y8;
                            } else {
                                y7 = Y.OUT;
                            }
                            if (y7 == null) {
                                gS.K(iN);
                                gS.K(iK);
                            } else {
                                this.f8352m |= 8;
                                this.f8356q = y7;
                            }
                        } else if (iN == 42) {
                            if ((i7 & 16) != 16) {
                                this.f8357r = new ArrayList();
                                i7 |= 16;
                            }
                            this.f8357r.add(c0609f.g(U.f8291E, c0611h));
                        } else if (iN == 48) {
                            if ((i7 & 32) != 32) {
                                this.f8358s = new ArrayList();
                                i7 |= 32;
                            }
                            this.f8358s.add(Integer.valueOf(c0609f.k()));
                        } else if (iN != 50) {
                            if (!n(c0609f, gS, c0611h, iN)) {
                            }
                        } else {
                            int iD = c0609f.d(c0609f.k());
                            if ((i7 & 32) != 32 && c0609f.b() > 0) {
                                this.f8358s = new ArrayList();
                                i7 |= 32;
                            }
                            while (c0609f.b() > 0) {
                                this.f8358s.add(Integer.valueOf(c0609f.k()));
                            }
                            c0609f.c(iD);
                        }
                    }
                    z7 = true;
                } catch (Throwable th) {
                    if ((i7 & 16) == 16) {
                        this.f8357r = Collections.unmodifiableList(this.f8357r);
                    }
                    if ((i7 & 32) == 32) {
                        this.f8358s = Collections.unmodifiableList(this.f8358s);
                    }
                    try {
                        gS.m();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f8351l = c0607d.g();
                        throw th2;
                    }
                    this.f8351l = c0607d.g();
                    m();
                    throw th;
                }
            } catch (X4.r e7) {
                e7.f9907k = this;
                throw e7;
            } catch (IOException e8) {
                X4.r rVar = new X4.r(e8.getMessage());
                rVar.f9907k = this;
                throw rVar;
            }
        }
        if ((i7 & 16) == 16) {
            this.f8357r = Collections.unmodifiableList(this.f8357r);
        }
        if ((i7 & 32) == 32) {
            this.f8358s = Collections.unmodifiableList(this.f8358s);
        }
        try {
            gS.m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8351l = c0607d.g();
            throw th3;
        }
        this.f8351l = c0607d.g();
        m();
    }
}
