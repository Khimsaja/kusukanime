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
public final class F extends AbstractC0615l {

    /* renamed from: u, reason: collision with root package name */
    public static final F f8152u;

    /* renamed from: v, reason: collision with root package name */
    public static final C0570a f8153v = new C0570a(11);

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC0608e f8154l;

    /* renamed from: m, reason: collision with root package name */
    public int f8155m;

    /* renamed from: n, reason: collision with root package name */
    public List f8156n;

    /* renamed from: o, reason: collision with root package name */
    public List f8157o;

    /* renamed from: p, reason: collision with root package name */
    public List f8158p;

    /* renamed from: q, reason: collision with root package name */
    public a0 f8159q;

    /* renamed from: r, reason: collision with root package name */
    public h0 f8160r;

    /* renamed from: s, reason: collision with root package name */
    public byte f8161s;

    /* renamed from: t, reason: collision with root package name */
    public int f8162t;

    static {
        F f5 = new F();
        f8152u = f5;
        List list = Collections.EMPTY_LIST;
        f5.f8156n = list;
        f5.f8157o = list;
        f5.f8158p = list;
        f5.f8159q = a0.f8362q;
        f5.f8160r = h0.f8490o;
    }

    public F(E e7) {
        super(e7);
        this.f8161s = (byte) -1;
        this.f8162t = -1;
        this.f8154l = e7.f9896k;
    }

    @Override // X4.w
    public final boolean a() {
        byte b4 = this.f8161s;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        for (int i7 = 0; i7 < this.f8156n.size(); i7++) {
            if (!((B) this.f8156n.get(i7)).a()) {
                this.f8161s = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.f8157o.size(); i8++) {
            if (!((J) this.f8157o.get(i8)).a()) {
                this.f8161s = (byte) 0;
                return false;
            }
        }
        for (int i9 = 0; i9 < this.f8158p.size(); i9++) {
            if (!((W) this.f8158p.get(i9)).a()) {
                this.f8161s = (byte) 0;
                return false;
            }
        }
        if ((this.f8155m & 1) == 1 && !this.f8159q.a()) {
            this.f8161s = (byte) 0;
            return false;
        }
        if (i()) {
            this.f8161s = (byte) 1;
            return true;
        }
        this.f8161s = (byte) 0;
        return false;
    }

    @Override // X4.w
    public final AbstractC0605b b() {
        return f8152u;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8162t;
        if (i7 != -1) {
            return i7;
        }
        int iG = 0;
        for (int i8 = 0; i8 < this.f8156n.size(); i8++) {
            iG += B1.G.g(3, (AbstractC0605b) this.f8156n.get(i8));
        }
        for (int i9 = 0; i9 < this.f8157o.size(); i9++) {
            iG += B1.G.g(4, (AbstractC0605b) this.f8157o.get(i9));
        }
        for (int i10 = 0; i10 < this.f8158p.size(); i10++) {
            iG += B1.G.g(5, (AbstractC0605b) this.f8158p.get(i10));
        }
        if ((this.f8155m & 1) == 1) {
            iG += B1.G.g(30, this.f8159q);
        }
        if ((this.f8155m & 2) == 2) {
            iG += B1.G.g(32, this.f8160r);
        }
        int size = this.f8154l.size() + j() + iG;
        this.f8162t = size;
        return size;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        return E.h();
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        E eH = E.h();
        eH.i(this);
        return eH;
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        L2.e eVar = new L2.e((AbstractC0615l) this);
        for (int i7 = 0; i7 < this.f8156n.size(); i7++) {
            g4.D(3, (AbstractC0605b) this.f8156n.get(i7));
        }
        for (int i8 = 0; i8 < this.f8157o.size(); i8++) {
            g4.D(4, (AbstractC0605b) this.f8157o.get(i8));
        }
        for (int i9 = 0; i9 < this.f8158p.size(); i9++) {
            g4.D(5, (AbstractC0605b) this.f8158p.get(i9));
        }
        if ((this.f8155m & 1) == 1) {
            g4.D(30, this.f8159q);
        }
        if ((this.f8155m & 2) == 2) {
            g4.D(32, this.f8160r);
        }
        eVar.u1(200, g4);
        g4.G(this.f8154l);
    }

    public F() {
        this.f8161s = (byte) -1;
        this.f8162t = -1;
        this.f8154l = AbstractC0608e.f9883k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public F(C0609f c0609f, C0611h c0611h) {
        this.f8161s = (byte) -1;
        this.f8162t = -1;
        List list = Collections.EMPTY_LIST;
        this.f8156n = list;
        this.f8157o = list;
        this.f8158p = list;
        this.f8159q = a0.f8362q;
        this.f8160r = h0.f8490o;
        C0607d c0607d = new C0607d();
        B1.G gS = B1.G.s(c0607d, 1);
        boolean z7 = false;
        char c2 = 0;
        while (!z7) {
            try {
                try {
                    int iN = c0609f.n();
                    if (iN != 0) {
                        if (iN == 26) {
                            int i7 = (c2 == true ? 1 : 0) & 1;
                            c2 = c2;
                            if (i7 != 1) {
                                this.f8156n = new ArrayList();
                                c2 = (c2 == true ? 1 : 0) | 1;
                            }
                            this.f8156n.add(c0609f.g(B.J, c0611h));
                        } else if (iN == 34) {
                            int i8 = (c2 == true ? 1 : 0) & 2;
                            c2 = c2;
                            if (i8 != 2) {
                                this.f8157o = new ArrayList();
                                c2 = (c2 == true ? 1 : 0) | 2;
                            }
                            this.f8157o.add(c0609f.g(J.f8200N, c0611h));
                        } else if (iN != 42) {
                            C0584o c0584o = null;
                            C0576g c0576gI = null;
                            if (iN == 242) {
                                if ((this.f8155m & 1) == 1) {
                                    a0 a0Var = this.f8159q;
                                    a0Var.getClass();
                                    c0576gI = a0.i(a0Var);
                                }
                                a0 a0Var2 = (a0) c0609f.g(a0.f8363r, c0611h);
                                this.f8159q = a0Var2;
                                if (c0576gI != null) {
                                    c0576gI.k(a0Var2);
                                    this.f8159q = c0576gI.g();
                                }
                                this.f8155m |= 1;
                            } else if (iN != 258) {
                                if (!n(c0609f, gS, c0611h, iN)) {
                                }
                            } else {
                                if ((this.f8155m & 2) == 2) {
                                    h0 h0Var = this.f8160r;
                                    h0Var.getClass();
                                    c0584o = new C0584o(2);
                                    c0584o.f8585n = Collections.EMPTY_LIST;
                                    c0584o.o(h0Var);
                                }
                                h0 h0Var2 = (h0) c0609f.g(h0.f8491p, c0611h);
                                this.f8160r = h0Var2;
                                if (c0584o != null) {
                                    c0584o.o(h0Var2);
                                    this.f8160r = c0584o.i();
                                }
                                this.f8155m |= 2;
                            }
                        } else {
                            int i9 = (c2 == true ? 1 : 0) & 4;
                            c2 = c2;
                            if (i9 != 4) {
                                this.f8158p = new ArrayList();
                                c2 = (c2 == true ? 1 : 0) | 4;
                            }
                            this.f8158p.add(c0609f.g(W.f8321A, c0611h));
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
                if (((c2 == true ? 1 : 0) & 1) == 1) {
                    this.f8156n = Collections.unmodifiableList(this.f8156n);
                }
                if (((c2 == true ? 1 : 0) & 2) == 2) {
                    this.f8157o = Collections.unmodifiableList(this.f8157o);
                }
                if (((c2 == true ? 1 : 0) & 4) == 4) {
                    this.f8158p = Collections.unmodifiableList(this.f8158p);
                }
                try {
                    gS.m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f8154l = c0607d.g();
                    throw th2;
                }
                this.f8154l = c0607d.g();
                m();
                throw th;
            }
        }
        if (((c2 == true ? 1 : 0) & 1) == 1) {
            this.f8156n = Collections.unmodifiableList(this.f8156n);
        }
        if (((c2 == true ? 1 : 0) & 2) == 2) {
            this.f8157o = Collections.unmodifiableList(this.f8157o);
        }
        if (((c2 == true ? 1 : 0) & 4) == 4) {
            this.f8158p = Collections.unmodifiableList(this.f8158p);
        }
        try {
            gS.m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8154l = c0607d.g();
            throw th3;
        }
        this.f8154l = c0607d.g();
        m();
    }
}
