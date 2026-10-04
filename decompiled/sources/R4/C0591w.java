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

/* renamed from: R4.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0591w extends AbstractC0615l {

    /* renamed from: r, reason: collision with root package name */
    public static final C0591w f8628r;

    /* renamed from: s, reason: collision with root package name */
    public static final C0570a f8629s = new C0570a(8);

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC0608e f8630l;

    /* renamed from: m, reason: collision with root package name */
    public int f8631m;

    /* renamed from: n, reason: collision with root package name */
    public int f8632n;

    /* renamed from: o, reason: collision with root package name */
    public List f8633o;

    /* renamed from: p, reason: collision with root package name */
    public byte f8634p;

    /* renamed from: q, reason: collision with root package name */
    public int f8635q;

    static {
        C0591w c0591w = new C0591w();
        f8628r = c0591w;
        c0591w.f8632n = 0;
        c0591w.f8633o = Collections.EMPTY_LIST;
    }

    public C0591w(C0590v c0590v) {
        super(c0590v);
        this.f8634p = (byte) -1;
        this.f8635q = -1;
        this.f8630l = c0590v.f9896k;
    }

    @Override // X4.w
    public final boolean a() {
        byte b4 = this.f8634p;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        for (int i7 = 0; i7 < this.f8633o.size(); i7++) {
            if (!((C0577h) this.f8633o.get(i7)).a()) {
                this.f8634p = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.f8634p = (byte) 1;
            return true;
        }
        this.f8634p = (byte) 0;
        return false;
    }

    @Override // X4.w
    public final AbstractC0605b b() {
        return f8628r;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8635q;
        if (i7 != -1) {
            return i7;
        }
        int iE = (this.f8631m & 1) == 1 ? B1.G.e(1, this.f8632n) : 0;
        for (int i8 = 0; i8 < this.f8633o.size(); i8++) {
            iE += B1.G.g(2, (AbstractC0605b) this.f8633o.get(i8));
        }
        int size = this.f8630l.size() + j() + iE;
        this.f8635q = size;
        return size;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        C0590v c0590v = new C0590v();
        c0590v.f8627p = Collections.EMPTY_LIST;
        return c0590v;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        C0590v c0590v = new C0590v();
        c0590v.f8627p = Collections.EMPTY_LIST;
        c0590v.h(this);
        return c0590v;
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        L2.e eVar = new L2.e((AbstractC0615l) this);
        if ((this.f8631m & 1) == 1) {
            g4.B(1, this.f8632n);
        }
        for (int i7 = 0; i7 < this.f8633o.size(); i7++) {
            g4.D(2, (AbstractC0605b) this.f8633o.get(i7));
        }
        eVar.u1(200, g4);
        g4.G(this.f8630l);
    }

    public C0591w() {
        this.f8634p = (byte) -1;
        this.f8635q = -1;
        this.f8630l = AbstractC0608e.f9883k;
    }

    public C0591w(C0609f c0609f, C0611h c0611h) {
        this.f8634p = (byte) -1;
        this.f8635q = -1;
        boolean z7 = false;
        this.f8632n = 0;
        this.f8633o = Collections.EMPTY_LIST;
        C0607d c0607d = new C0607d();
        B1.G gS = B1.G.s(c0607d, 1);
        char c2 = 0;
        while (!z7) {
            try {
                try {
                    try {
                        int iN = c0609f.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f8631m |= 1;
                                this.f8632n = c0609f.k();
                            } else if (iN != 18) {
                                if (!n(c0609f, gS, c0611h, iN)) {
                                }
                            } else {
                                if ((c2 & 2) != 2) {
                                    this.f8633o = new ArrayList();
                                    c2 = 2;
                                }
                                this.f8633o.add(c0609f.g(C0577h.f8483r, c0611h));
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
                if ((c2 & 2) == 2) {
                    this.f8633o = Collections.unmodifiableList(this.f8633o);
                }
                try {
                    gS.m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f8630l = c0607d.g();
                    throw th2;
                }
                this.f8630l = c0607d.g();
                m();
                throw th;
            }
        }
        if ((c2 & 2) == 2) {
            this.f8633o = Collections.unmodifiableList(this.f8633o);
        }
        try {
            gS.m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8630l = c0607d.g();
            throw th3;
        }
        this.f8630l = c0607d.g();
        m();
    }
}
