package R4;

import X4.AbstractC0608e;
import X4.AbstractC0613j;
import X4.AbstractC0618o;
import X4.C0607d;
import X4.C0609f;
import X4.C0621s;
import java.io.IOException;

/* loaded from: classes.dex */
public final class O extends AbstractC0618o {

    /* renamed from: o, reason: collision with root package name */
    public static final O f8250o;

    /* renamed from: p, reason: collision with root package name */
    public static final C0570a f8251p = new C0570a(16);

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0608e f8252k;

    /* renamed from: l, reason: collision with root package name */
    public X4.t f8253l;

    /* renamed from: m, reason: collision with root package name */
    public byte f8254m;

    /* renamed from: n, reason: collision with root package name */
    public int f8255n;

    static {
        O o7 = new O();
        f8250o = o7;
        o7.f8253l = C0621s.f9908l;
    }

    public O() {
        this.f8254m = (byte) -1;
        this.f8255n = -1;
        this.f8252k = AbstractC0608e.f9883k;
    }

    @Override // X4.w
    public final boolean a() {
        if (this.f8254m == 1) {
            return true;
        }
        this.f8254m = (byte) 1;
        return true;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8255n;
        if (i7 != -1) {
            return i7;
        }
        int size = 0;
        for (int i8 = 0; i8 < this.f8253l.size(); i8++) {
            AbstractC0608e abstractC0608eC = this.f8253l.c(i8);
            size += abstractC0608eC.size() + B1.G.i(abstractC0608eC.size());
        }
        int size2 = this.f8252k.size() + this.f8253l.size() + size;
        this.f8255n = size2;
        return size2;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        C0584o c0584o = new C0584o(3);
        c0584o.f8585n = C0621s.f9908l;
        return c0584o;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        C0584o c0584o = new C0584o(3);
        c0584o.f8585n = C0621s.f9908l;
        c0584o.n(this);
        return c0584o;
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        for (int i7 = 0; i7 < this.f8253l.size(); i7++) {
            AbstractC0608e abstractC0608eC = this.f8253l.c(i7);
            g4.M(1, 2);
            g4.K(abstractC0608eC.size());
            g4.G(abstractC0608eC);
        }
        g4.G(this.f8252k);
    }

    public O(C0584o c0584o) {
        this.f8254m = (byte) -1;
        this.f8255n = -1;
        this.f8252k = c0584o.f9896k;
    }

    public O(C0609f c0609f) {
        this.f8254m = (byte) -1;
        this.f8255n = -1;
        this.f8253l = C0621s.f9908l;
        C0607d c0607d = new C0607d();
        B1.G gS = B1.G.s(c0607d, 1);
        boolean z7 = false;
        boolean z8 = false;
        while (!z7) {
            try {
                try {
                    int iN = c0609f.n();
                    if (iN != 0) {
                        if (iN != 10) {
                            if (!c0609f.q(iN, gS)) {
                            }
                        } else {
                            X4.v vVarE = c0609f.e();
                            if (!z8) {
                                this.f8253l = new C0621s();
                                z8 = true;
                            }
                            this.f8253l.i(vVarE);
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
                    this.f8253l = this.f8253l.e();
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
            this.f8253l = this.f8253l.e();
        }
        try {
            gS.m();
        } catch (IOException unused2) {
        } finally {
            this.f8252k = c0607d.g();
        }
    }
}
