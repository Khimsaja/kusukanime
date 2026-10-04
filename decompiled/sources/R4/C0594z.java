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

/* renamed from: R4.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0594z extends AbstractC0618o {

    /* renamed from: v, reason: collision with root package name */
    public static final C0594z f8649v;

    /* renamed from: w, reason: collision with root package name */
    public static final C0570a f8650w = new C0570a(9);

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0608e f8651k;

    /* renamed from: l, reason: collision with root package name */
    public int f8652l;

    /* renamed from: m, reason: collision with root package name */
    public int f8653m;

    /* renamed from: n, reason: collision with root package name */
    public int f8654n;

    /* renamed from: o, reason: collision with root package name */
    public EnumC0593y f8655o;

    /* renamed from: p, reason: collision with root package name */
    public U f8656p;

    /* renamed from: q, reason: collision with root package name */
    public int f8657q;

    /* renamed from: r, reason: collision with root package name */
    public List f8658r;

    /* renamed from: s, reason: collision with root package name */
    public List f8659s;

    /* renamed from: t, reason: collision with root package name */
    public byte f8660t;

    /* renamed from: u, reason: collision with root package name */
    public int f8661u;

    static {
        C0594z c0594z = new C0594z();
        f8649v = c0594z;
        c0594z.f8653m = 0;
        c0594z.f8654n = 0;
        c0594z.f8655o = EnumC0593y.TRUE;
        c0594z.f8656p = U.f8290D;
        c0594z.f8657q = 0;
        List list = Collections.EMPTY_LIST;
        c0594z.f8658r = list;
        c0594z.f8659s = list;
    }

    public C0594z() {
        this.f8660t = (byte) -1;
        this.f8661u = -1;
        this.f8651k = AbstractC0608e.f9883k;
    }

    @Override // X4.w
    public final boolean a() {
        byte b4 = this.f8660t;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        if ((this.f8652l & 8) == 8 && !this.f8656p.a()) {
            this.f8660t = (byte) 0;
            return false;
        }
        for (int i7 = 0; i7 < this.f8658r.size(); i7++) {
            if (!((C0594z) this.f8658r.get(i7)).a()) {
                this.f8660t = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.f8659s.size(); i8++) {
            if (!((C0594z) this.f8659s.get(i8)).a()) {
                this.f8660t = (byte) 0;
                return false;
            }
        }
        this.f8660t = (byte) 1;
        return true;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8661u;
        if (i7 != -1) {
            return i7;
        }
        int iE = (this.f8652l & 1) == 1 ? B1.G.e(1, this.f8653m) : 0;
        if ((this.f8652l & 2) == 2) {
            iE += B1.G.e(2, this.f8654n);
        }
        if ((this.f8652l & 4) == 4) {
            iE += B1.G.d(3, this.f8655o.f8648k);
        }
        if ((this.f8652l & 8) == 8) {
            iE += B1.G.g(4, this.f8656p);
        }
        if ((this.f8652l & 16) == 16) {
            iE += B1.G.e(5, this.f8657q);
        }
        for (int i8 = 0; i8 < this.f8658r.size(); i8++) {
            iE += B1.G.g(6, (AbstractC0605b) this.f8658r.get(i8));
        }
        for (int i9 = 0; i9 < this.f8659s.size(); i9++) {
            iE += B1.G.g(7, (AbstractC0605b) this.f8659s.get(i9));
        }
        int size = this.f8651k.size() + iE;
        this.f8661u = size;
        return size;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        return C0592x.g();
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        C0592x c0592xG = C0592x.g();
        c0592xG.h(this);
        return c0592xG;
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        if ((this.f8652l & 1) == 1) {
            g4.B(1, this.f8653m);
        }
        if ((this.f8652l & 2) == 2) {
            g4.B(2, this.f8654n);
        }
        if ((this.f8652l & 4) == 4) {
            g4.A(3, this.f8655o.f8648k);
        }
        if ((this.f8652l & 8) == 8) {
            g4.D(4, this.f8656p);
        }
        if ((this.f8652l & 16) == 16) {
            g4.B(5, this.f8657q);
        }
        for (int i7 = 0; i7 < this.f8658r.size(); i7++) {
            g4.D(6, (AbstractC0605b) this.f8658r.get(i7));
        }
        for (int i8 = 0; i8 < this.f8659s.size(); i8++) {
            g4.D(7, (AbstractC0605b) this.f8659s.get(i8));
        }
        g4.G(this.f8651k);
    }

    public C0594z(C0592x c0592x) {
        this.f8660t = (byte) -1;
        this.f8661u = -1;
        this.f8651k = c0592x.f9896k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public C0594z(C0609f c0609f, C0611h c0611h) {
        EnumC0593y enumC0593y;
        this.f8660t = (byte) -1;
        this.f8661u = -1;
        boolean z7 = false;
        this.f8653m = 0;
        this.f8654n = 0;
        EnumC0593y enumC0593y2 = EnumC0593y.TRUE;
        this.f8655o = enumC0593y2;
        this.f8656p = U.f8290D;
        this.f8657q = 0;
        List list = Collections.EMPTY_LIST;
        this.f8658r = list;
        this.f8659s = list;
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
                                this.f8652l |= 1;
                                this.f8653m = c0609f.k();
                            } else if (iN != 16) {
                                T tR = null;
                                EnumC0593y enumC0593y3 = null;
                                if (iN == 24) {
                                    int iK = c0609f.k();
                                    if (iK != 0) {
                                        if (iK == 1) {
                                            enumC0593y3 = EnumC0593y.FALSE;
                                        } else if (iK == 2) {
                                            enumC0593y3 = EnumC0593y.NULL;
                                        }
                                        enumC0593y = enumC0593y3;
                                    } else {
                                        enumC0593y = enumC0593y2;
                                    }
                                    if (enumC0593y == null) {
                                        gS.K(iN);
                                        gS.K(iK);
                                    } else {
                                        this.f8652l |= 4;
                                        this.f8655o = enumC0593y;
                                    }
                                } else if (iN == 34) {
                                    if ((this.f8652l & 8) == 8) {
                                        U u5 = this.f8656p;
                                        u5.getClass();
                                        tR = U.r(u5);
                                    }
                                    T t7 = tR;
                                    U u7 = (U) c0609f.g(U.f8291E, c0611h);
                                    this.f8656p = u7;
                                    if (t7 != null) {
                                        t7.i(u7);
                                        this.f8656p = t7.g();
                                    }
                                    this.f8652l |= 8;
                                } else if (iN != 40) {
                                    C0570a c0570a = f8650w;
                                    if (iN == 50) {
                                        int i7 = (c2 == true ? 1 : 0) & 32;
                                        c2 = c2;
                                        if (i7 != 32) {
                                            this.f8658r = new ArrayList();
                                            c2 = (c2 == true ? 1 : 0) | ' ';
                                        }
                                        this.f8658r.add(c0609f.g(c0570a, c0611h));
                                    } else if (iN != 58) {
                                        if (!c0609f.q(iN, gS)) {
                                        }
                                    } else {
                                        int i8 = (c2 == true ? 1 : 0) & 64;
                                        c2 = c2;
                                        if (i8 != 64) {
                                            this.f8659s = new ArrayList();
                                            c2 = (c2 == true ? 1 : 0) | '@';
                                        }
                                        this.f8659s.add(c0609f.g(c0570a, c0611h));
                                    }
                                } else {
                                    this.f8652l |= 16;
                                    this.f8657q = c0609f.k();
                                }
                            } else {
                                this.f8652l |= 2;
                                this.f8654n = c0609f.k();
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
                if (((c2 == true ? 1 : 0) & 32) == 32) {
                    this.f8658r = Collections.unmodifiableList(this.f8658r);
                }
                if (((c2 == true ? 1 : 0) & 64) == 64) {
                    this.f8659s = Collections.unmodifiableList(this.f8659s);
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
        if (((c2 == true ? 1 : 0) & 32) == 32) {
            this.f8658r = Collections.unmodifiableList(this.f8658r);
        }
        if (((c2 == true ? 1 : 0) & 64) == 64) {
            this.f8659s = Collections.unmodifiableList(this.f8659s);
        }
        try {
            gS.m();
        } catch (IOException unused2) {
        } finally {
            this.f8651k = c0607d.g();
        }
    }
}
