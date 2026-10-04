package R4;

import X4.AbstractC0605b;
import X4.AbstractC0608e;
import X4.AbstractC0613j;
import X4.AbstractC0615l;
import X4.C0607d;
import X4.C0609f;
import X4.C0611h;
import X4.C0621s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class H extends AbstractC0615l {

    /* renamed from: t, reason: collision with root package name */
    public static final H f8168t;

    /* renamed from: u, reason: collision with root package name */
    public static final C0570a f8169u = new C0570a(12);

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC0608e f8170l;

    /* renamed from: m, reason: collision with root package name */
    public int f8171m;

    /* renamed from: n, reason: collision with root package name */
    public O f8172n;

    /* renamed from: o, reason: collision with root package name */
    public N f8173o;

    /* renamed from: p, reason: collision with root package name */
    public F f8174p;

    /* renamed from: q, reason: collision with root package name */
    public List f8175q;

    /* renamed from: r, reason: collision with root package name */
    public byte f8176r;

    /* renamed from: s, reason: collision with root package name */
    public int f8177s;

    static {
        H h7 = new H();
        f8168t = h7;
        h7.f8172n = O.f8250o;
        h7.f8173o = N.f8244o;
        h7.f8174p = F.f8152u;
        h7.f8175q = Collections.EMPTY_LIST;
    }

    public H(G g4) {
        super(g4);
        this.f8176r = (byte) -1;
        this.f8177s = -1;
        this.f8170l = g4.f9896k;
    }

    @Override // X4.w
    public final boolean a() {
        byte b4 = this.f8176r;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        if ((this.f8171m & 2) == 2 && !this.f8173o.a()) {
            this.f8176r = (byte) 0;
            return false;
        }
        if ((this.f8171m & 4) == 4 && !this.f8174p.a()) {
            this.f8176r = (byte) 0;
            return false;
        }
        for (int i7 = 0; i7 < this.f8175q.size(); i7++) {
            if (!((C0580k) this.f8175q.get(i7)).a()) {
                this.f8176r = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.f8176r = (byte) 1;
            return true;
        }
        this.f8176r = (byte) 0;
        return false;
    }

    @Override // X4.w
    public final AbstractC0605b b() {
        return f8168t;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8177s;
        if (i7 != -1) {
            return i7;
        }
        int iG = (this.f8171m & 1) == 1 ? B1.G.g(1, this.f8172n) : 0;
        if ((this.f8171m & 2) == 2) {
            iG += B1.G.g(2, this.f8173o);
        }
        if ((this.f8171m & 4) == 4) {
            iG += B1.G.g(3, this.f8174p);
        }
        for (int i8 = 0; i8 < this.f8175q.size(); i8++) {
            iG += B1.G.g(4, (AbstractC0605b) this.f8175q.get(i8));
        }
        int size = this.f8170l.size() + j() + iG;
        this.f8177s = size;
        return size;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        return G.h();
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        G gH = G.h();
        gH.i(this);
        return gH;
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        L2.e eVar = new L2.e((AbstractC0615l) this);
        if ((this.f8171m & 1) == 1) {
            g4.D(1, this.f8172n);
        }
        if ((this.f8171m & 2) == 2) {
            g4.D(2, this.f8173o);
        }
        if ((this.f8171m & 4) == 4) {
            g4.D(3, this.f8174p);
        }
        for (int i7 = 0; i7 < this.f8175q.size(); i7++) {
            g4.D(4, (AbstractC0605b) this.f8175q.get(i7));
        }
        eVar.u1(200, g4);
        g4.G(this.f8170l);
    }

    public H() {
        this.f8176r = (byte) -1;
        this.f8177s = -1;
        this.f8170l = AbstractC0608e.f9883k;
    }

    public H(C0609f c0609f, C0611h c0611h) {
        this.f8176r = (byte) -1;
        this.f8177s = -1;
        this.f8172n = O.f8250o;
        this.f8173o = N.f8244o;
        this.f8174p = F.f8152u;
        this.f8175q = Collections.EMPTY_LIST;
        C0607d c0607d = new C0607d();
        B1.G gS = B1.G.s(c0607d, 1);
        boolean z7 = false;
        char c2 = 0;
        while (!z7) {
            try {
                try {
                    int iN = c0609f.n();
                    if (iN != 0) {
                        E eH = null;
                        C0584o c0584o = null;
                        C0584o c0584o2 = null;
                        if (iN == 10) {
                            if ((this.f8171m & 1) == 1) {
                                O o7 = this.f8172n;
                                o7.getClass();
                                c0584o = new C0584o(3);
                                c0584o.f8585n = C0621s.f9908l;
                                c0584o.n(o7);
                            }
                            O o8 = (O) c0609f.g(O.f8251p, c0611h);
                            this.f8172n = o8;
                            if (c0584o != null) {
                                c0584o.n(o8);
                                this.f8172n = c0584o.h();
                            }
                            this.f8171m |= 1;
                        } else if (iN == 18) {
                            if ((this.f8171m & 2) == 2) {
                                N n7 = this.f8173o;
                                n7.getClass();
                                c0584o2 = new C0584o(1);
                                c0584o2.f8585n = Collections.EMPTY_LIST;
                                c0584o2.l(n7);
                            }
                            N n8 = (N) c0609f.g(N.f8245p, c0611h);
                            this.f8173o = n8;
                            if (c0584o2 != null) {
                                c0584o2.l(n8);
                                this.f8173o = c0584o2.g();
                            }
                            this.f8171m |= 2;
                        } else if (iN == 26) {
                            if ((this.f8171m & 4) == 4) {
                                F f5 = this.f8174p;
                                f5.getClass();
                                eH = E.h();
                                eH.i(f5);
                            }
                            F f7 = (F) c0609f.g(F.f8153v, c0611h);
                            this.f8174p = f7;
                            if (eH != null) {
                                eH.i(f7);
                                this.f8174p = eH.g();
                            }
                            this.f8171m |= 4;
                        } else if (iN != 34) {
                            if (!n(c0609f, gS, c0611h, iN)) {
                            }
                        } else {
                            int i7 = (c2 == true ? 1 : 0) & '\b';
                            c2 = c2;
                            if (i7 != 8) {
                                this.f8175q = new ArrayList();
                                c2 = '\b';
                            }
                            this.f8175q.add(c0609f.g(C0580k.f8528R, c0611h));
                        }
                    }
                    z7 = true;
                } catch (Throwable th) {
                    if (((c2 == true ? 1 : 0) & '\b') == 8) {
                        this.f8175q = Collections.unmodifiableList(this.f8175q);
                    }
                    try {
                        gS.m();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f8170l = c0607d.g();
                        throw th2;
                    }
                    this.f8170l = c0607d.g();
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
        if (((c2 == true ? 1 : 0) & '\b') == 8) {
            this.f8175q = Collections.unmodifiableList(this.f8175q);
        }
        try {
            gS.m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8170l = c0607d.g();
            throw th3;
        }
        this.f8170l = c0607d.g();
        m();
    }
}
