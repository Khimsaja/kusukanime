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

/* renamed from: R4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0583n extends AbstractC0615l {

    /* renamed from: u, reason: collision with root package name */
    public static final C0583n f8572u;

    /* renamed from: v, reason: collision with root package name */
    public static final C0570a f8573v = new C0570a(5);

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC0608e f8574l;

    /* renamed from: m, reason: collision with root package name */
    public int f8575m;

    /* renamed from: n, reason: collision with root package name */
    public int f8576n;

    /* renamed from: o, reason: collision with root package name */
    public List f8577o;

    /* renamed from: p, reason: collision with root package name */
    public List f8578p;

    /* renamed from: q, reason: collision with root package name */
    public List f8579q;

    /* renamed from: r, reason: collision with root package name */
    public List f8580r;

    /* renamed from: s, reason: collision with root package name */
    public byte f8581s;

    /* renamed from: t, reason: collision with root package name */
    public int f8582t;

    static {
        C0583n c0583n = new C0583n();
        f8572u = c0583n;
        c0583n.f8576n = 6;
        List list = Collections.EMPTY_LIST;
        c0583n.f8577o = list;
        c0583n.f8578p = list;
        c0583n.f8579q = list;
        c0583n.f8580r = list;
    }

    public C0583n(C0582m c0582m) {
        super(c0582m);
        this.f8581s = (byte) -1;
        this.f8582t = -1;
        this.f8574l = c0582m.f9896k;
    }

    @Override // X4.w
    public final boolean a() {
        byte b4 = this.f8581s;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        for (int i7 = 0; i7 < this.f8577o.size(); i7++) {
            if (!((c0) this.f8577o.get(i7)).a()) {
                this.f8581s = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.f8579q.size(); i8++) {
            if (!((C0581l) this.f8579q.get(i8)).a()) {
                this.f8581s = (byte) 0;
                return false;
            }
        }
        for (int i9 = 0; i9 < this.f8580r.size(); i9++) {
            if (!((C0577h) this.f8580r.get(i9)).a()) {
                this.f8581s = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.f8581s = (byte) 1;
            return true;
        }
        this.f8581s = (byte) 0;
        return false;
    }

    @Override // X4.w
    public final AbstractC0605b b() {
        return f8572u;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8582t;
        if (i7 != -1) {
            return i7;
        }
        int iE = (this.f8575m & 1) == 1 ? B1.G.e(1, this.f8576n) : 0;
        for (int i8 = 0; i8 < this.f8577o.size(); i8++) {
            iE += B1.G.g(2, (AbstractC0605b) this.f8577o.get(i8));
        }
        for (int i9 = 0; i9 < this.f8580r.size(); i9++) {
            iE += B1.G.g(3, (AbstractC0605b) this.f8580r.get(i9));
        }
        int iF = 0;
        for (int i10 = 0; i10 < this.f8578p.size(); i10++) {
            iF += B1.G.f(((Integer) this.f8578p.get(i10)).intValue());
        }
        int size = (this.f8578p.size() * 2) + iE + iF;
        for (int i11 = 0; i11 < this.f8579q.size(); i11++) {
            size += B1.G.g(32, (AbstractC0605b) this.f8579q.get(i11));
        }
        int size2 = this.f8574l.size() + j() + size;
        this.f8582t = size2;
        return size2;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        return C0582m.h();
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        C0582m c0582mH = C0582m.h();
        c0582mH.i(this);
        return c0582mH;
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        L2.e eVar = new L2.e((AbstractC0615l) this);
        if ((this.f8575m & 1) == 1) {
            g4.B(1, this.f8576n);
        }
        for (int i7 = 0; i7 < this.f8577o.size(); i7++) {
            g4.D(2, (AbstractC0605b) this.f8577o.get(i7));
        }
        for (int i8 = 0; i8 < this.f8580r.size(); i8++) {
            g4.D(3, (AbstractC0605b) this.f8580r.get(i8));
        }
        for (int i9 = 0; i9 < this.f8578p.size(); i9++) {
            g4.B(31, ((Integer) this.f8578p.get(i9)).intValue());
        }
        for (int i10 = 0; i10 < this.f8579q.size(); i10++) {
            g4.D(32, (AbstractC0605b) this.f8579q.get(i10));
        }
        eVar.u1(19000, g4);
        g4.G(this.f8574l);
    }

    public C0583n() {
        this.f8581s = (byte) -1;
        this.f8582t = -1;
        this.f8574l = AbstractC0608e.f9883k;
    }

    public C0583n(C0609f c0609f, C0611h c0611h) {
        this.f8581s = (byte) -1;
        this.f8582t = -1;
        this.f8576n = 6;
        List list = Collections.EMPTY_LIST;
        this.f8577o = list;
        this.f8578p = list;
        this.f8579q = list;
        this.f8580r = list;
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
                            this.f8575m |= 1;
                            this.f8576n = c0609f.k();
                        } else if (iN == 18) {
                            if ((i7 & 2) != 2) {
                                this.f8577o = new ArrayList();
                                i7 |= 2;
                            }
                            this.f8577o.add(c0609f.g(c0.f8396y, c0611h));
                        } else if (iN == 26) {
                            if ((i7 & 16) != 16) {
                                this.f8580r = new ArrayList();
                                i7 |= 16;
                            }
                            this.f8580r.add(c0609f.g(C0577h.f8483r, c0611h));
                        } else if (iN == 248) {
                            if ((i7 & 4) != 4) {
                                this.f8578p = new ArrayList();
                                i7 |= 4;
                            }
                            this.f8578p.add(Integer.valueOf(c0609f.k()));
                        } else if (iN == 250) {
                            int iD = c0609f.d(c0609f.k());
                            if ((i7 & 4) != 4 && c0609f.b() > 0) {
                                this.f8578p = new ArrayList();
                                i7 |= 4;
                            }
                            while (c0609f.b() > 0) {
                                this.f8578p.add(Integer.valueOf(c0609f.k()));
                            }
                            c0609f.c(iD);
                        } else if (iN != 258) {
                            if (!n(c0609f, gS, c0611h, iN)) {
                            }
                        } else {
                            if ((i7 & 8) != 8) {
                                this.f8579q = new ArrayList();
                                i7 |= 8;
                            }
                            this.f8579q.add(c0609f.g(C0581l.f8559r, c0611h));
                        }
                    }
                    z7 = true;
                } catch (Throwable th) {
                    if ((i7 & 2) == 2) {
                        this.f8577o = Collections.unmodifiableList(this.f8577o);
                    }
                    if ((i7 & 16) == 16) {
                        this.f8580r = Collections.unmodifiableList(this.f8580r);
                    }
                    if ((i7 & 4) == 4) {
                        this.f8578p = Collections.unmodifiableList(this.f8578p);
                    }
                    if ((i7 & 8) == 8) {
                        this.f8579q = Collections.unmodifiableList(this.f8579q);
                    }
                    try {
                        gS.m();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f8574l = c0607d.g();
                        throw th2;
                    }
                    this.f8574l = c0607d.g();
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
        if ((i7 & 2) == 2) {
            this.f8577o = Collections.unmodifiableList(this.f8577o);
        }
        if ((i7 & 16) == 16) {
            this.f8580r = Collections.unmodifiableList(this.f8580r);
        }
        if ((i7 & 4) == 4) {
            this.f8578p = Collections.unmodifiableList(this.f8578p);
        }
        if ((i7 & 8) == 8) {
            this.f8579q = Collections.unmodifiableList(this.f8579q);
        }
        try {
            gS.m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8574l = c0607d.g();
            throw th3;
        }
        this.f8574l = c0607d.g();
        m();
    }
}
