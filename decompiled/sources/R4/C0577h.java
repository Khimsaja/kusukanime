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

/* renamed from: R4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0577h extends AbstractC0618o {

    /* renamed from: q, reason: collision with root package name */
    public static final C0577h f8482q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0570a f8483r = new C0570a(0);

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0608e f8484k;

    /* renamed from: l, reason: collision with root package name */
    public int f8485l;

    /* renamed from: m, reason: collision with root package name */
    public int f8486m;

    /* renamed from: n, reason: collision with root package name */
    public List f8487n;

    /* renamed from: o, reason: collision with root package name */
    public byte f8488o;

    /* renamed from: p, reason: collision with root package name */
    public int f8489p;

    static {
        C0577h c0577h = new C0577h();
        f8482q = c0577h;
        c0577h.f8486m = 0;
        c0577h.f8487n = Collections.EMPTY_LIST;
    }

    public C0577h() {
        this.f8488o = (byte) -1;
        this.f8489p = -1;
        this.f8484k = AbstractC0608e.f9883k;
    }

    @Override // X4.w
    public final boolean a() {
        byte b4 = this.f8488o;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        if ((this.f8485l & 1) != 1) {
            this.f8488o = (byte) 0;
            return false;
        }
        for (int i7 = 0; i7 < this.f8487n.size(); i7++) {
            if (!((C0575f) this.f8487n.get(i7)).a()) {
                this.f8488o = (byte) 0;
                return false;
            }
        }
        this.f8488o = (byte) 1;
        return true;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8489p;
        if (i7 != -1) {
            return i7;
        }
        int iE = (this.f8485l & 1) == 1 ? B1.G.e(1, this.f8486m) : 0;
        for (int i8 = 0; i8 < this.f8487n.size(); i8++) {
            iE += B1.G.g(2, (AbstractC0605b) this.f8487n.get(i8));
        }
        int size = this.f8484k.size() + iE;
        this.f8489p = size;
        return size;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        C0576g c0576g = new C0576g(0);
        c0576g.f8468n = Collections.EMPTY_LIST;
        return c0576g;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        C0576g c0576g = new C0576g(0);
        c0576g.f8468n = Collections.EMPTY_LIST;
        c0576g.i(this);
        return c0576g;
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        if ((this.f8485l & 1) == 1) {
            g4.B(1, this.f8486m);
        }
        for (int i7 = 0; i7 < this.f8487n.size(); i7++) {
            g4.D(2, (AbstractC0605b) this.f8487n.get(i7));
        }
        g4.G(this.f8484k);
    }

    public C0577h(C0576g c0576g) {
        this.f8488o = (byte) -1;
        this.f8489p = -1;
        this.f8484k = c0576g.f9896k;
    }

    public C0577h(C0609f c0609f, C0611h c0611h) {
        this.f8488o = (byte) -1;
        this.f8489p = -1;
        boolean z7 = false;
        this.f8486m = 0;
        this.f8487n = Collections.EMPTY_LIST;
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
                                this.f8485l |= 1;
                                this.f8486m = c0609f.k();
                            } else if (iN != 18) {
                                if (!c0609f.q(iN, gS)) {
                                }
                            } else {
                                if ((c2 & 2) != 2) {
                                    this.f8487n = new ArrayList();
                                    c2 = 2;
                                }
                                this.f8487n.add(c0609f.g(C0575f.f8454r, c0611h));
                            }
                        }
                        z7 = true;
                    } catch (X4.r e7) {
                        e7.f9907k = this;
                        throw e7;
                    }
                } catch (IOException e8) {
                    X4.r rVar = new X4.r(e8.getMessage());
                    rVar.f9907k = this;
                    throw rVar;
                }
            } catch (Throwable th) {
                if ((c2 & 2) == 2) {
                    this.f8487n = Collections.unmodifiableList(this.f8487n);
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
        if ((c2 & 2) == 2) {
            this.f8487n = Collections.unmodifiableList(this.f8487n);
        }
        try {
            gS.m();
        } catch (IOException unused2) {
        } finally {
            this.f8484k = c0607d.g();
        }
    }
}
