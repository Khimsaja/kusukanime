package U4;

import B1.G;
import R4.C0570a;
import X4.AbstractC0608e;
import X4.AbstractC0613j;
import X4.AbstractC0618o;
import X4.C0607d;
import X4.C0609f;
import X4.r;
import X4.v;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends AbstractC0618o {

    /* renamed from: w, reason: collision with root package name */
    public static final h f9276w;

    /* renamed from: x, reason: collision with root package name */
    public static final C0570a f9277x = new C0570a(29);

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0608e f9278k;

    /* renamed from: l, reason: collision with root package name */
    public int f9279l;

    /* renamed from: m, reason: collision with root package name */
    public int f9280m;

    /* renamed from: n, reason: collision with root package name */
    public int f9281n;

    /* renamed from: o, reason: collision with root package name */
    public Object f9282o;

    /* renamed from: p, reason: collision with root package name */
    public g f9283p;

    /* renamed from: q, reason: collision with root package name */
    public List f9284q;

    /* renamed from: r, reason: collision with root package name */
    public int f9285r;

    /* renamed from: s, reason: collision with root package name */
    public List f9286s;

    /* renamed from: t, reason: collision with root package name */
    public int f9287t;

    /* renamed from: u, reason: collision with root package name */
    public byte f9288u;

    /* renamed from: v, reason: collision with root package name */
    public int f9289v;

    static {
        h hVar = new h();
        f9276w = hVar;
        hVar.f9280m = 1;
        hVar.f9281n = 0;
        hVar.f9282o = "";
        hVar.f9283p = g.NONE;
        List list = Collections.EMPTY_LIST;
        hVar.f9284q = list;
        hVar.f9286s = list;
    }

    public h() {
        this.f9285r = -1;
        this.f9287t = -1;
        this.f9288u = (byte) -1;
        this.f9289v = -1;
        this.f9278k = AbstractC0608e.f9883k;
    }

    @Override // X4.w
    public final boolean a() {
        if (this.f9288u == 1) {
            return true;
        }
        this.f9288u = (byte) 1;
        return true;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        AbstractC0608e vVar;
        int i7 = this.f9289v;
        if (i7 != -1) {
            return i7;
        }
        int iE = (this.f9279l & 1) == 1 ? G.e(1, this.f9280m) : 0;
        if ((this.f9279l & 2) == 2) {
            iE += G.e(2, this.f9281n);
        }
        if ((this.f9279l & 8) == 8) {
            iE += G.d(3, this.f9283p.f9275k);
        }
        int iF = 0;
        for (int i8 = 0; i8 < this.f9284q.size(); i8++) {
            iF += G.f(((Integer) this.f9284q.get(i8)).intValue());
        }
        int iF2 = iE + iF;
        if (!this.f9284q.isEmpty()) {
            iF2 = iF2 + 1 + G.f(iF);
        }
        this.f9285r = iF;
        int iF3 = 0;
        for (int i9 = 0; i9 < this.f9286s.size(); i9++) {
            iF3 += G.f(((Integer) this.f9286s.get(i9)).intValue());
        }
        int size = iF2 + iF3;
        if (!this.f9286s.isEmpty()) {
            size = size + 1 + G.f(iF3);
        }
        this.f9287t = iF3;
        if ((this.f9279l & 4) == 4) {
            Object obj = this.f9282o;
            if (obj instanceof String) {
                try {
                    vVar = new v(((String) obj).getBytes("UTF-8"));
                    this.f9282o = vVar;
                } catch (UnsupportedEncodingException e7) {
                    throw new RuntimeException("UTF-8 not supported?", e7);
                }
            } else {
                vVar = (AbstractC0608e) obj;
            }
            size += vVar.size() + G.i(vVar.size()) + G.k(6);
        }
        int size2 = this.f9278k.size() + size;
        this.f9289v = size2;
        return size2;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        return f.g();
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        f fVarG = f.g();
        fVarG.h(this);
        return fVarG;
    }

    @Override // X4.AbstractC0605b
    public final void f(G g4) throws IOException {
        AbstractC0608e vVar;
        c();
        if ((this.f9279l & 1) == 1) {
            g4.B(1, this.f9280m);
        }
        if ((this.f9279l & 2) == 2) {
            g4.B(2, this.f9281n);
        }
        if ((this.f9279l & 8) == 8) {
            g4.A(3, this.f9283p.f9275k);
        }
        if (this.f9284q.size() > 0) {
            g4.K(34);
            g4.K(this.f9285r);
        }
        for (int i7 = 0; i7 < this.f9284q.size(); i7++) {
            g4.C(((Integer) this.f9284q.get(i7)).intValue());
        }
        if (this.f9286s.size() > 0) {
            g4.K(42);
            g4.K(this.f9287t);
        }
        for (int i8 = 0; i8 < this.f9286s.size(); i8++) {
            g4.C(((Integer) this.f9286s.get(i8)).intValue());
        }
        if ((this.f9279l & 4) == 4) {
            Object obj = this.f9282o;
            if (obj instanceof String) {
                try {
                    vVar = new v(((String) obj).getBytes("UTF-8"));
                    this.f9282o = vVar;
                } catch (UnsupportedEncodingException e7) {
                    throw new RuntimeException("UTF-8 not supported?", e7);
                }
            } else {
                vVar = (AbstractC0608e) obj;
            }
            g4.M(6, 2);
            g4.K(vVar.size());
            g4.G(vVar);
        }
        g4.G(this.f9278k);
    }

    public h(f fVar) {
        this.f9285r = -1;
        this.f9287t = -1;
        this.f9288u = (byte) -1;
        this.f9289v = -1;
        this.f9278k = fVar.f9896k;
    }

    public h(C0609f c0609f) {
        g gVar;
        this.f9285r = -1;
        this.f9287t = -1;
        this.f9288u = (byte) -1;
        this.f9289v = -1;
        this.f9280m = 1;
        boolean z7 = false;
        this.f9281n = 0;
        this.f9282o = "";
        g gVar2 = g.NONE;
        this.f9283p = gVar2;
        List list = Collections.EMPTY_LIST;
        this.f9284q = list;
        this.f9286s = list;
        C0607d c0607d = new C0607d();
        G gS = G.s(c0607d, 1);
        int i7 = 0;
        while (!z7) {
            try {
                try {
                    int iN = c0609f.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f9279l |= 1;
                            this.f9280m = c0609f.k();
                        } else if (iN == 16) {
                            this.f9279l |= 2;
                            this.f9281n = c0609f.k();
                        } else if (iN == 24) {
                            int iK = c0609f.k();
                            if (iK == 0) {
                                gVar = gVar2;
                            } else if (iK != 1) {
                                gVar = iK != 2 ? null : g.DESC_TO_CLASS_ID;
                            } else {
                                gVar = g.INTERNAL_TO_CLASS_ID;
                            }
                            if (gVar == null) {
                                gS.K(iN);
                                gS.K(iK);
                            } else {
                                this.f9279l |= 8;
                                this.f9283p = gVar;
                            }
                        } else if (iN == 32) {
                            if ((i7 & 16) != 16) {
                                this.f9284q = new ArrayList();
                                i7 |= 16;
                            }
                            this.f9284q.add(Integer.valueOf(c0609f.k()));
                        } else if (iN == 34) {
                            int iD = c0609f.d(c0609f.k());
                            if ((i7 & 16) != 16 && c0609f.b() > 0) {
                                this.f9284q = new ArrayList();
                                i7 |= 16;
                            }
                            while (c0609f.b() > 0) {
                                this.f9284q.add(Integer.valueOf(c0609f.k()));
                            }
                            c0609f.c(iD);
                        } else if (iN == 40) {
                            if ((i7 & 32) != 32) {
                                this.f9286s = new ArrayList();
                                i7 |= 32;
                            }
                            this.f9286s.add(Integer.valueOf(c0609f.k()));
                        } else if (iN == 42) {
                            int iD2 = c0609f.d(c0609f.k());
                            if ((i7 & 32) != 32 && c0609f.b() > 0) {
                                this.f9286s = new ArrayList();
                                i7 |= 32;
                            }
                            while (c0609f.b() > 0) {
                                this.f9286s.add(Integer.valueOf(c0609f.k()));
                            }
                            c0609f.c(iD2);
                        } else if (iN != 50) {
                            if (!c0609f.q(iN, gS)) {
                            }
                        } else {
                            v vVarE = c0609f.e();
                            this.f9279l |= 4;
                            this.f9282o = vVarE;
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
                if ((i7 & 16) == 16) {
                    this.f9284q = Collections.unmodifiableList(this.f9284q);
                }
                if ((i7 & 32) == 32) {
                    this.f9286s = Collections.unmodifiableList(this.f9286s);
                }
                try {
                    gS.m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    throw th2;
                }
                throw th;
            }
        }
        if ((i7 & 16) == 16) {
            this.f9284q = Collections.unmodifiableList(this.f9284q);
        }
        if ((i7 & 32) == 32) {
            this.f9286s = Collections.unmodifiableList(this.f9286s);
        }
        try {
            gS.m();
        } catch (IOException unused2) {
        } finally {
            this.f9278k = c0607d.g();
        }
    }
}
