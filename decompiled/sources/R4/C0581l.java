package R4;

import X4.AbstractC0608e;
import X4.AbstractC0613j;
import X4.AbstractC0618o;
import X4.C0607d;
import X4.C0609f;
import java.io.IOException;

/* renamed from: R4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0581l extends AbstractC0618o {

    /* renamed from: q, reason: collision with root package name */
    public static final C0581l f8558q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0570a f8559r = new C0570a(4);

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0608e f8560k;

    /* renamed from: l, reason: collision with root package name */
    public int f8561l;

    /* renamed from: m, reason: collision with root package name */
    public int f8562m;

    /* renamed from: n, reason: collision with root package name */
    public X4.v f8563n;

    /* renamed from: o, reason: collision with root package name */
    public byte f8564o;

    /* renamed from: p, reason: collision with root package name */
    public int f8565p;

    static {
        C0581l c0581l = new C0581l();
        f8558q = c0581l;
        c0581l.f8562m = 0;
        c0581l.f8563n = AbstractC0608e.f9883k;
    }

    public C0581l() {
        this.f8564o = (byte) -1;
        this.f8565p = -1;
        this.f8560k = AbstractC0608e.f9883k;
    }

    @Override // X4.w
    public final boolean a() {
        byte b4 = this.f8564o;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        int i7 = this.f8561l;
        if ((i7 & 1) != 1) {
            this.f8564o = (byte) 0;
            return false;
        }
        if ((i7 & 2) == 2) {
            this.f8564o = (byte) 1;
            return true;
        }
        this.f8564o = (byte) 0;
        return false;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8565p;
        if (i7 != -1) {
            return i7;
        }
        int iE = (this.f8561l & 1) == 1 ? B1.G.e(1, this.f8562m) : 0;
        if ((this.f8561l & 2) == 2) {
            X4.v vVar = this.f8563n;
            iE += vVar.size() + B1.G.i(vVar.size()) + B1.G.k(2);
        }
        int size = this.f8560k.size() + iE;
        this.f8565p = size;
        return size;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        C0571b c0571b = new C0571b(1);
        c0571b.f8373o = AbstractC0608e.f9883k;
        return c0571b;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        C0571b c0571b = new C0571b(1);
        c0571b.f8373o = AbstractC0608e.f9883k;
        c0571b.i(this);
        return c0571b;
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        if ((this.f8561l & 1) == 1) {
            g4.B(1, this.f8562m);
        }
        if ((this.f8561l & 2) == 2) {
            X4.v vVar = this.f8563n;
            g4.M(2, 2);
            g4.K(vVar.size());
            g4.G(vVar);
        }
        g4.G(this.f8560k);
    }

    public C0581l(C0571b c0571b) {
        this.f8564o = (byte) -1;
        this.f8565p = -1;
        this.f8560k = c0571b.f9896k;
    }

    public C0581l(C0609f c0609f) {
        this.f8564o = (byte) -1;
        this.f8565p = -1;
        boolean z7 = false;
        this.f8562m = 0;
        this.f8563n = AbstractC0608e.f9883k;
        C0607d c0607d = new C0607d();
        B1.G gS = B1.G.s(c0607d, 1);
        while (!z7) {
            try {
                try {
                    int iN = c0609f.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f8561l |= 1;
                            this.f8562m = c0609f.k();
                        } else if (iN != 18) {
                            if (!c0609f.q(iN, gS)) {
                            }
                        } else {
                            this.f8561l |= 2;
                            this.f8563n = c0609f.e();
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
                try {
                    gS.m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    throw th2;
                }
                throw th;
            }
        }
        try {
            gS.m();
        } catch (IOException unused2) {
        } finally {
            this.f8560k = c0607d.g();
        }
    }
}
