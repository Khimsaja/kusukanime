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
public final class h0 extends AbstractC0618o {

    /* renamed from: o, reason: collision with root package name */
    public static final h0 f8490o;

    /* renamed from: p, reason: collision with root package name */
    public static final C0570a f8491p = new C0570a(24);

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0608e f8492k;

    /* renamed from: l, reason: collision with root package name */
    public List f8493l;

    /* renamed from: m, reason: collision with root package name */
    public byte f8494m;

    /* renamed from: n, reason: collision with root package name */
    public int f8495n;

    static {
        h0 h0Var = new h0();
        f8490o = h0Var;
        h0Var.f8493l = Collections.EMPTY_LIST;
    }

    public h0() {
        this.f8494m = (byte) -1;
        this.f8495n = -1;
        this.f8492k = AbstractC0608e.f9883k;
    }

    @Override // X4.w
    public final boolean a() {
        if (this.f8494m == 1) {
            return true;
        }
        this.f8494m = (byte) 1;
        return true;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8495n;
        if (i7 != -1) {
            return i7;
        }
        int iG = 0;
        for (int i8 = 0; i8 < this.f8493l.size(); i8++) {
            iG += B1.G.g(1, (AbstractC0605b) this.f8493l.get(i8));
        }
        int size = this.f8492k.size() + iG;
        this.f8495n = size;
        return size;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        C0584o c0584o = new C0584o(2);
        c0584o.f8585n = Collections.EMPTY_LIST;
        return c0584o;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        C0584o c0584o = new C0584o(2);
        c0584o.f8585n = Collections.EMPTY_LIST;
        c0584o.o(this);
        return c0584o;
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        for (int i7 = 0; i7 < this.f8493l.size(); i7++) {
            g4.D(1, (AbstractC0605b) this.f8493l.get(i7));
        }
        g4.G(this.f8492k);
    }

    public final C0584o i() {
        C0584o c0584o = new C0584o(2);
        c0584o.f8585n = Collections.EMPTY_LIST;
        c0584o.o(this);
        return c0584o;
    }

    public h0(C0584o c0584o) {
        this.f8494m = (byte) -1;
        this.f8495n = -1;
        this.f8492k = c0584o.f9896k;
    }

    public h0(C0609f c0609f, C0611h c0611h) {
        this.f8494m = (byte) -1;
        this.f8495n = -1;
        this.f8493l = Collections.EMPTY_LIST;
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
                            if (!z8) {
                                this.f8493l = new ArrayList();
                                z8 = true;
                            }
                            this.f8493l.add(c0609f.g(g0.f8471v, c0611h));
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
                    this.f8493l = Collections.unmodifiableList(this.f8493l);
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
            this.f8493l = Collections.unmodifiableList(this.f8493l);
        }
        try {
            gS.m();
        } catch (IOException unused2) {
        } finally {
            this.f8492k = c0607d.g();
        }
    }
}
