package R4;

import X4.AbstractC0605b;
import X4.AbstractC0608e;
import X4.AbstractC0613j;
import X4.AbstractC0618o;
import X4.C0607d;
import X4.C0609f;
import X4.C0611h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a0 extends AbstractC0618o {

    /* renamed from: q, reason: collision with root package name */
    public static final a0 f8362q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0570a f8363r = new C0570a(21);

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0608e f8364k;

    /* renamed from: l, reason: collision with root package name */
    public int f8365l;

    /* renamed from: m, reason: collision with root package name */
    public List f8366m;

    /* renamed from: n, reason: collision with root package name */
    public int f8367n;

    /* renamed from: o, reason: collision with root package name */
    public byte f8368o;

    /* renamed from: p, reason: collision with root package name */
    public int f8369p;

    static {
        a0 a0Var = new a0();
        f8362q = a0Var;
        a0Var.f8366m = Collections.EMPTY_LIST;
        a0Var.f8367n = -1;
    }

    public a0() {
        this.f8368o = (byte) -1;
        this.f8369p = -1;
        this.f8364k = AbstractC0608e.f9883k;
    }

    public static C0576g i(a0 a0Var) {
        C0576g c0576gH = C0576g.h();
        c0576gH.k(a0Var);
        return c0576gH;
    }

    @Override // X4.w
    public final boolean a() {
        byte b4 = this.f8368o;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        for (int i7 = 0; i7 < this.f8366m.size(); i7++) {
            if (!((U) this.f8366m.get(i7)).a()) {
                this.f8368o = (byte) 0;
                return false;
            }
        }
        this.f8368o = (byte) 1;
        return true;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8369p;
        if (i7 != -1) {
            return i7;
        }
        int iE = 0;
        for (int i8 = 0; i8 < this.f8366m.size(); i8++) {
            iE += B1.G.g(1, (AbstractC0605b) this.f8366m.get(i8));
        }
        if ((this.f8365l & 1) == 1) {
            iE += B1.G.e(2, this.f8367n);
        }
        int size = this.f8364k.size() + iE;
        this.f8369p = size;
        return size;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        return C0576g.h();
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        return i(this);
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        for (int i7 = 0; i7 < this.f8366m.size(); i7++) {
            g4.D(1, (AbstractC0605b) this.f8366m.get(i7));
        }
        if ((this.f8365l & 1) == 1) {
            g4.B(2, this.f8367n);
        }
        g4.G(this.f8364k);
    }

    public a0(C0576g c0576g) {
        this.f8368o = (byte) -1;
        this.f8369p = -1;
        this.f8364k = c0576g.f9896k;
    }

    public a0(C0609f c0609f, C0611h c0611h) {
        this.f8368o = (byte) -1;
        this.f8369p = -1;
        this.f8366m = Collections.EMPTY_LIST;
        this.f8367n = -1;
        C0607d c0607d = new C0607d();
        B1.G gS = B1.G.s(c0607d, 1);
        boolean z7 = false;
        boolean z8 = false;
        while (!z7) {
            try {
                try {
                    int iN = c0609f.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            if (!z8) {
                                this.f8366m = new ArrayList();
                                z8 = true;
                            }
                            this.f8366m.add(c0609f.g(U.f8291E, c0611h));
                        } else if (iN != 16) {
                            if (!c0609f.q(iN, gS)) {
                            }
                        } else {
                            this.f8365l |= 1;
                            this.f8367n = c0609f.k();
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
                if (z8) {
                    this.f8366m = Collections.unmodifiableList(this.f8366m);
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
        if (z8) {
            this.f8366m = Collections.unmodifiableList(this.f8366m);
        }
        try {
            gS.m();
        } catch (IOException unused2) {
        } finally {
            this.f8364k = c0607d.g();
        }
    }
}
