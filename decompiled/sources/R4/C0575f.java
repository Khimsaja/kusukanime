package R4;

import X4.AbstractC0608e;
import X4.AbstractC0613j;
import X4.AbstractC0618o;
import X4.C0607d;
import X4.C0609f;
import X4.C0611h;
import java.io.IOException;

/* renamed from: R4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0575f extends AbstractC0618o {

    /* renamed from: q, reason: collision with root package name */
    public static final C0575f f8453q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0570a f8454r = new C0570a(1);

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0608e f8455k;

    /* renamed from: l, reason: collision with root package name */
    public int f8456l;

    /* renamed from: m, reason: collision with root package name */
    public int f8457m;

    /* renamed from: n, reason: collision with root package name */
    public C0574e f8458n;

    /* renamed from: o, reason: collision with root package name */
    public byte f8459o;

    /* renamed from: p, reason: collision with root package name */
    public int f8460p;

    static {
        C0575f c0575f = new C0575f();
        f8453q = c0575f;
        c0575f.f8457m = 0;
        c0575f.f8458n = C0574e.f8432z;
    }

    public C0575f() {
        this.f8459o = (byte) -1;
        this.f8460p = -1;
        this.f8455k = AbstractC0608e.f9883k;
    }

    @Override // X4.w
    public final boolean a() {
        byte b4 = this.f8459o;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        int i7 = this.f8456l;
        if ((i7 & 1) != 1) {
            this.f8459o = (byte) 0;
            return false;
        }
        if ((i7 & 2) != 2) {
            this.f8459o = (byte) 0;
            return false;
        }
        if (this.f8458n.a()) {
            this.f8459o = (byte) 1;
            return true;
        }
        this.f8459o = (byte) 0;
        return false;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8460p;
        if (i7 != -1) {
            return i7;
        }
        int iE = (this.f8456l & 1) == 1 ? B1.G.e(1, this.f8457m) : 0;
        if ((this.f8456l & 2) == 2) {
            iE += B1.G.g(2, this.f8458n);
        }
        int size = this.f8455k.size() + iE;
        this.f8460p = size;
        return size;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        C0571b c0571b = new C0571b(0);
        c0571b.f8373o = C0574e.f8432z;
        return c0571b;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        C0571b c0571b = new C0571b(0);
        c0571b.f8373o = C0574e.f8432z;
        c0571b.h(this);
        return c0571b;
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        if ((this.f8456l & 1) == 1) {
            g4.B(1, this.f8457m);
        }
        if ((this.f8456l & 2) == 2) {
            g4.D(2, this.f8458n);
        }
        g4.G(this.f8455k);
    }

    public C0575f(C0571b c0571b) {
        this.f8459o = (byte) -1;
        this.f8460p = -1;
        this.f8455k = c0571b.f9896k;
    }

    public C0575f(C0609f c0609f, C0611h c0611h) {
        C0572c c0572cJ;
        this.f8459o = (byte) -1;
        this.f8460p = -1;
        boolean z7 = false;
        this.f8457m = 0;
        this.f8458n = C0574e.f8432z;
        C0607d c0607d = new C0607d();
        B1.G gS = B1.G.s(c0607d, 1);
        while (!z7) {
            try {
                try {
                    try {
                        int iN = c0609f.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f8456l |= 1;
                                this.f8457m = c0609f.k();
                            } else if (iN != 18) {
                                if (!c0609f.q(iN, gS)) {
                                }
                            } else {
                                if ((this.f8456l & 2) == 2) {
                                    C0574e c0574e = this.f8458n;
                                    c0574e.getClass();
                                    c0572cJ = C0574e.j(c0574e);
                                } else {
                                    c0572cJ = null;
                                }
                                C0574e c0574e2 = (C0574e) c0609f.g(C0574e.f8431A, c0611h);
                                this.f8458n = c0574e2;
                                if (c0572cJ != null) {
                                    c0572cJ.h(c0574e2);
                                    this.f8458n = c0572cJ.f();
                                }
                                this.f8456l |= 2;
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
            this.f8455k = c0607d.g();
        }
    }
}
