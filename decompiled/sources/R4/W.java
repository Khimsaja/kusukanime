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
public final class W extends AbstractC0615l {

    /* renamed from: A, reason: collision with root package name */
    public static final C0570a f8321A = new C0570a(19);

    /* renamed from: z, reason: collision with root package name */
    public static final W f8322z;

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC0608e f8323l;

    /* renamed from: m, reason: collision with root package name */
    public int f8324m;

    /* renamed from: n, reason: collision with root package name */
    public int f8325n;

    /* renamed from: o, reason: collision with root package name */
    public int f8326o;

    /* renamed from: p, reason: collision with root package name */
    public List f8327p;

    /* renamed from: q, reason: collision with root package name */
    public U f8328q;

    /* renamed from: r, reason: collision with root package name */
    public int f8329r;

    /* renamed from: s, reason: collision with root package name */
    public U f8330s;

    /* renamed from: t, reason: collision with root package name */
    public int f8331t;

    /* renamed from: u, reason: collision with root package name */
    public List f8332u;

    /* renamed from: v, reason: collision with root package name */
    public List f8333v;

    /* renamed from: w, reason: collision with root package name */
    public List f8334w;

    /* renamed from: x, reason: collision with root package name */
    public byte f8335x;

    /* renamed from: y, reason: collision with root package name */
    public int f8336y;

    static {
        W w7 = new W();
        f8322z = w7;
        w7.f8325n = 6;
        w7.f8326o = 0;
        List list = Collections.EMPTY_LIST;
        w7.f8327p = list;
        U u5 = U.f8290D;
        w7.f8328q = u5;
        w7.f8329r = 0;
        w7.f8330s = u5;
        w7.f8331t = 0;
        w7.f8332u = list;
        w7.f8333v = list;
        w7.f8334w = list;
    }

    public W(V v5) {
        super(v5);
        this.f8335x = (byte) -1;
        this.f8336y = -1;
        this.f8323l = v5.f9896k;
    }

    @Override // X4.w
    public final boolean a() {
        byte b4 = this.f8335x;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        if ((this.f8324m & 2) != 2) {
            this.f8335x = (byte) 0;
            return false;
        }
        for (int i7 = 0; i7 < this.f8327p.size(); i7++) {
            if (!((Z) this.f8327p.get(i7)).a()) {
                this.f8335x = (byte) 0;
                return false;
            }
        }
        if ((this.f8324m & 4) == 4 && !this.f8328q.a()) {
            this.f8335x = (byte) 0;
            return false;
        }
        if ((this.f8324m & 16) == 16 && !this.f8330s.a()) {
            this.f8335x = (byte) 0;
            return false;
        }
        for (int i8 = 0; i8 < this.f8332u.size(); i8++) {
            if (!((C0577h) this.f8332u.get(i8)).a()) {
                this.f8335x = (byte) 0;
                return false;
            }
        }
        for (int i9 = 0; i9 < this.f8334w.size(); i9++) {
            if (!((C0581l) this.f8334w.get(i9)).a()) {
                this.f8335x = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.f8335x = (byte) 1;
            return true;
        }
        this.f8335x = (byte) 0;
        return false;
    }

    @Override // X4.w
    public final AbstractC0605b b() {
        return f8322z;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8336y;
        if (i7 != -1) {
            return i7;
        }
        int iE = (this.f8324m & 1) == 1 ? B1.G.e(1, this.f8325n) : 0;
        if ((this.f8324m & 2) == 2) {
            iE += B1.G.e(2, this.f8326o);
        }
        for (int i8 = 0; i8 < this.f8327p.size(); i8++) {
            iE += B1.G.g(3, (AbstractC0605b) this.f8327p.get(i8));
        }
        if ((this.f8324m & 4) == 4) {
            iE += B1.G.g(4, this.f8328q);
        }
        if ((this.f8324m & 8) == 8) {
            iE += B1.G.e(5, this.f8329r);
        }
        if ((this.f8324m & 16) == 16) {
            iE += B1.G.g(6, this.f8330s);
        }
        if ((this.f8324m & 32) == 32) {
            iE += B1.G.e(7, this.f8331t);
        }
        for (int i9 = 0; i9 < this.f8332u.size(); i9++) {
            iE += B1.G.g(8, (AbstractC0605b) this.f8332u.get(i9));
        }
        int iF = 0;
        for (int i10 = 0; i10 < this.f8333v.size(); i10++) {
            iF += B1.G.f(((Integer) this.f8333v.get(i10)).intValue());
        }
        int size = (this.f8333v.size() * 2) + iE + iF;
        for (int i11 = 0; i11 < this.f8334w.size(); i11++) {
            size += B1.G.g(32, (AbstractC0605b) this.f8334w.get(i11));
        }
        int size2 = this.f8323l.size() + j() + size;
        this.f8336y = size2;
        return size2;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        return V.h();
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        V vH = V.h();
        vH.i(this);
        return vH;
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        L2.e eVar = new L2.e((AbstractC0615l) this);
        if ((this.f8324m & 1) == 1) {
            g4.B(1, this.f8325n);
        }
        if ((this.f8324m & 2) == 2) {
            g4.B(2, this.f8326o);
        }
        for (int i7 = 0; i7 < this.f8327p.size(); i7++) {
            g4.D(3, (AbstractC0605b) this.f8327p.get(i7));
        }
        if ((this.f8324m & 4) == 4) {
            g4.D(4, this.f8328q);
        }
        if ((this.f8324m & 8) == 8) {
            g4.B(5, this.f8329r);
        }
        if ((this.f8324m & 16) == 16) {
            g4.D(6, this.f8330s);
        }
        if ((this.f8324m & 32) == 32) {
            g4.B(7, this.f8331t);
        }
        for (int i8 = 0; i8 < this.f8332u.size(); i8++) {
            g4.D(8, (AbstractC0605b) this.f8332u.get(i8));
        }
        for (int i9 = 0; i9 < this.f8333v.size(); i9++) {
            g4.B(31, ((Integer) this.f8333v.get(i9)).intValue());
        }
        for (int i10 = 0; i10 < this.f8334w.size(); i10++) {
            g4.D(32, (AbstractC0605b) this.f8334w.get(i10));
        }
        eVar.u1(200, g4);
        g4.G(this.f8323l);
    }

    public W() {
        this.f8335x = (byte) -1;
        this.f8336y = -1;
        this.f8323l = AbstractC0608e.f9883k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public W(C0609f c0609f, C0611h c0611h) {
        this.f8335x = (byte) -1;
        this.f8336y = -1;
        this.f8325n = 6;
        boolean z7 = false;
        this.f8326o = 0;
        List list = Collections.EMPTY_LIST;
        this.f8327p = list;
        U u5 = U.f8290D;
        this.f8328q = u5;
        this.f8329r = 0;
        this.f8330s = u5;
        this.f8331t = 0;
        this.f8332u = list;
        this.f8333v = list;
        this.f8334w = list;
        C0607d c0607d = new C0607d();
        B1.G gS = B1.G.s(c0607d, 1);
        int i7 = 0;
        while (true) {
            ?? N3 = 512;
            if (!z7) {
                try {
                    try {
                        int iN = c0609f.n();
                        T tR = null;
                        switch (iN) {
                            case 0:
                                z7 = true;
                            case 8:
                                this.f8324m |= 1;
                                this.f8325n = c0609f.k();
                            case 16:
                                this.f8324m |= 2;
                                this.f8326o = c0609f.k();
                            case 26:
                                if ((i7 & 4) != 4) {
                                    this.f8327p = new ArrayList();
                                    i7 |= 4;
                                }
                                this.f8327p.add(c0609f.g(Z.f8350x, c0611h));
                            case 34:
                                if ((this.f8324m & 4) == 4) {
                                    U u7 = this.f8328q;
                                    u7.getClass();
                                    tR = U.r(u7);
                                }
                                U u8 = (U) c0609f.g(U.f8291E, c0611h);
                                this.f8328q = u8;
                                if (tR != null) {
                                    tR.i(u8);
                                    this.f8328q = tR.g();
                                }
                                this.f8324m |= 4;
                            case 40:
                                this.f8324m |= 8;
                                this.f8329r = c0609f.k();
                            case 50:
                                if ((this.f8324m & 16) == 16) {
                                    U u9 = this.f8330s;
                                    u9.getClass();
                                    tR = U.r(u9);
                                }
                                U u10 = (U) c0609f.g(U.f8291E, c0611h);
                                this.f8330s = u10;
                                if (tR != null) {
                                    tR.i(u10);
                                    this.f8330s = tR.g();
                                }
                                this.f8324m |= 16;
                            case 56:
                                this.f8324m |= 32;
                                this.f8331t = c0609f.k();
                            case 66:
                                if ((i7 & 128) != 128) {
                                    this.f8332u = new ArrayList();
                                    i7 |= 128;
                                }
                                this.f8332u.add(c0609f.g(C0577h.f8483r, c0611h));
                            case 248:
                                if ((i7 & 256) != 256) {
                                    this.f8333v = new ArrayList();
                                    i7 |= 256;
                                }
                                this.f8333v.add(Integer.valueOf(c0609f.k()));
                            case 250:
                                int iD = c0609f.d(c0609f.k());
                                if ((i7 & 256) != 256 && c0609f.b() > 0) {
                                    this.f8333v = new ArrayList();
                                    i7 |= 256;
                                }
                                while (c0609f.b() > 0) {
                                    this.f8333v.add(Integer.valueOf(c0609f.k()));
                                }
                                c0609f.c(iD);
                                break;
                            case 258:
                                if ((i7 & 512) != 512) {
                                    this.f8334w = new ArrayList();
                                    i7 |= 512;
                                }
                                this.f8334w.add(c0609f.g(C0581l.f8559r, c0611h));
                            default:
                                N3 = n(c0609f, gS, c0611h, iN);
                                if (N3 == 0) {
                                    z7 = true;
                                }
                        }
                    } catch (X4.r e7) {
                        e7.f9907k = this;
                        throw e7;
                    } catch (IOException e8) {
                        X4.r rVar = new X4.r(e8.getMessage());
                        rVar.f9907k = this;
                        throw rVar;
                    }
                } catch (Throwable th) {
                    if ((i7 & 4) == 4) {
                        this.f8327p = Collections.unmodifiableList(this.f8327p);
                    }
                    if ((i7 & 128) == 128) {
                        this.f8332u = Collections.unmodifiableList(this.f8332u);
                    }
                    if ((i7 & 256) == 256) {
                        this.f8333v = Collections.unmodifiableList(this.f8333v);
                    }
                    if ((i7 & 512) == N3) {
                        this.f8334w = Collections.unmodifiableList(this.f8334w);
                    }
                    try {
                        gS.m();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f8323l = c0607d.g();
                        throw th2;
                    }
                    this.f8323l = c0607d.g();
                    m();
                    throw th;
                }
            } else {
                if ((i7 & 4) == 4) {
                    this.f8327p = Collections.unmodifiableList(this.f8327p);
                }
                if ((i7 & 128) == 128) {
                    this.f8332u = Collections.unmodifiableList(this.f8332u);
                }
                if ((i7 & 256) == 256) {
                    this.f8333v = Collections.unmodifiableList(this.f8333v);
                }
                if ((i7 & 512) == 512) {
                    this.f8334w = Collections.unmodifiableList(this.f8334w);
                }
                try {
                    gS.m();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f8323l = c0607d.g();
                    throw th3;
                }
                this.f8323l = c0607d.g();
                m();
                return;
            }
        }
    }
}
