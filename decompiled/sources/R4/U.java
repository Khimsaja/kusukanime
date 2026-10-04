package R4;

import X4.AbstractC0605b;
import X4.AbstractC0608e;
import X4.AbstractC0613j;
import X4.AbstractC0615l;
import X4.C0607d;
import X4.C0609f;
import X4.C0611h;
import io.github.jan.supabase.auth.PKCEConstants;
import io.ktor.util.collections.ConcurrentMapKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class U extends AbstractC0615l {

    /* renamed from: D, reason: collision with root package name */
    public static final U f8290D;

    /* renamed from: E, reason: collision with root package name */
    public static final C0570a f8291E = new C0570a(17);

    /* renamed from: A, reason: collision with root package name */
    public int f8292A;

    /* renamed from: B, reason: collision with root package name */
    public byte f8293B;

    /* renamed from: C, reason: collision with root package name */
    public int f8294C;

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC0608e f8295l;

    /* renamed from: m, reason: collision with root package name */
    public int f8296m;

    /* renamed from: n, reason: collision with root package name */
    public List f8297n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8298o;

    /* renamed from: p, reason: collision with root package name */
    public int f8299p;

    /* renamed from: q, reason: collision with root package name */
    public U f8300q;

    /* renamed from: r, reason: collision with root package name */
    public int f8301r;

    /* renamed from: s, reason: collision with root package name */
    public int f8302s;

    /* renamed from: t, reason: collision with root package name */
    public int f8303t;

    /* renamed from: u, reason: collision with root package name */
    public int f8304u;

    /* renamed from: v, reason: collision with root package name */
    public int f8305v;

    /* renamed from: w, reason: collision with root package name */
    public U f8306w;

    /* renamed from: x, reason: collision with root package name */
    public int f8307x;

    /* renamed from: y, reason: collision with root package name */
    public U f8308y;

    /* renamed from: z, reason: collision with root package name */
    public int f8309z;

    static {
        U u5 = new U();
        f8290D = u5;
        u5.q();
    }

    public U(T t7) {
        super(t7);
        this.f8293B = (byte) -1;
        this.f8294C = -1;
        this.f8295l = t7.f9896k;
    }

    public static T r(U u5) {
        T tH = T.h();
        tH.i(u5);
        return tH;
    }

    @Override // X4.w
    public final boolean a() {
        byte b4 = this.f8293B;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        for (int i7 = 0; i7 < this.f8297n.size(); i7++) {
            if (!((S) this.f8297n.get(i7)).a()) {
                this.f8293B = (byte) 0;
                return false;
            }
        }
        if ((this.f8296m & 4) == 4 && !this.f8300q.a()) {
            this.f8293B = (byte) 0;
            return false;
        }
        if ((this.f8296m & 256) == 256 && !this.f8306w.a()) {
            this.f8293B = (byte) 0;
            return false;
        }
        if ((this.f8296m & 1024) == 1024 && !this.f8308y.a()) {
            this.f8293B = (byte) 0;
            return false;
        }
        if (i()) {
            this.f8293B = (byte) 1;
            return true;
        }
        this.f8293B = (byte) 0;
        return false;
    }

    @Override // X4.w
    public final AbstractC0605b b() {
        return f8290D;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8294C;
        if (i7 != -1) {
            return i7;
        }
        int iE = (this.f8296m & 4096) == 4096 ? B1.G.e(1, this.f8292A) : 0;
        for (int i8 = 0; i8 < this.f8297n.size(); i8++) {
            iE += B1.G.g(2, (AbstractC0605b) this.f8297n.get(i8));
        }
        if ((this.f8296m & 1) == 1) {
            iE += B1.G.k(3) + 1;
        }
        if ((this.f8296m & 2) == 2) {
            iE += B1.G.e(4, this.f8299p);
        }
        if ((this.f8296m & 4) == 4) {
            iE += B1.G.g(5, this.f8300q);
        }
        if ((this.f8296m & 16) == 16) {
            iE += B1.G.e(6, this.f8302s);
        }
        if ((this.f8296m & 32) == 32) {
            iE += B1.G.e(7, this.f8303t);
        }
        if ((this.f8296m & 8) == 8) {
            iE += B1.G.e(8, this.f8301r);
        }
        if ((this.f8296m & 64) == 64) {
            iE += B1.G.e(9, this.f8304u);
        }
        if ((this.f8296m & 256) == 256) {
            iE += B1.G.g(10, this.f8306w);
        }
        if ((this.f8296m & 512) == 512) {
            iE += B1.G.e(11, this.f8307x);
        }
        if ((this.f8296m & 128) == 128) {
            iE += B1.G.e(12, this.f8305v);
        }
        if ((this.f8296m & 1024) == 1024) {
            iE += B1.G.g(13, this.f8308y);
        }
        if ((this.f8296m & 2048) == 2048) {
            iE += B1.G.e(14, this.f8309z);
        }
        int size = this.f8295l.size() + j() + iE;
        this.f8294C = size;
        return size;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        return T.h();
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        L2.e eVar = new L2.e((AbstractC0615l) this);
        if ((this.f8296m & 4096) == 4096) {
            g4.B(1, this.f8292A);
        }
        for (int i7 = 0; i7 < this.f8297n.size(); i7++) {
            g4.D(2, (AbstractC0605b) this.f8297n.get(i7));
        }
        if ((this.f8296m & 1) == 1) {
            boolean z7 = this.f8298o;
            g4.M(3, 0);
            g4.F(z7 ? 1 : 0);
        }
        if ((this.f8296m & 2) == 2) {
            g4.B(4, this.f8299p);
        }
        if ((this.f8296m & 4) == 4) {
            g4.D(5, this.f8300q);
        }
        if ((this.f8296m & 16) == 16) {
            g4.B(6, this.f8302s);
        }
        if ((this.f8296m & 32) == 32) {
            g4.B(7, this.f8303t);
        }
        if ((this.f8296m & 8) == 8) {
            g4.B(8, this.f8301r);
        }
        if ((this.f8296m & 64) == 64) {
            g4.B(9, this.f8304u);
        }
        if ((this.f8296m & 256) == 256) {
            g4.D(10, this.f8306w);
        }
        if ((this.f8296m & 512) == 512) {
            g4.B(11, this.f8307x);
        }
        if ((this.f8296m & 128) == 128) {
            g4.B(12, this.f8305v);
        }
        if ((this.f8296m & 1024) == 1024) {
            g4.D(13, this.f8308y);
        }
        if ((this.f8296m & 2048) == 2048) {
            g4.B(14, this.f8309z);
        }
        eVar.u1(200, g4);
        g4.G(this.f8295l);
    }

    public final boolean p() {
        return (this.f8296m & 16) == 16;
    }

    public final void q() {
        this.f8297n = Collections.EMPTY_LIST;
        this.f8298o = false;
        this.f8299p = 0;
        U u5 = f8290D;
        this.f8300q = u5;
        this.f8301r = 0;
        this.f8302s = 0;
        this.f8303t = 0;
        this.f8304u = 0;
        this.f8305v = 0;
        this.f8306w = u5;
        this.f8307x = 0;
        this.f8308y = u5;
        this.f8309z = 0;
        this.f8292A = 0;
    }

    @Override // X4.AbstractC0605b
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final T e() {
        return r(this);
    }

    public U() {
        this.f8293B = (byte) -1;
        this.f8294C = -1;
        this.f8295l = AbstractC0608e.f9883k;
    }

    public U(C0609f c0609f, C0611h c0611h) {
        this.f8293B = (byte) -1;
        this.f8294C = -1;
        q();
        C0607d c0607d = new C0607d();
        B1.G gS = B1.G.s(c0607d, 1);
        boolean z7 = false;
        boolean z8 = false;
        while (!z7) {
            try {
                try {
                    int iN = c0609f.n();
                    C0570a c0570a = f8291E;
                    T tR = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.f8296m |= 4096;
                            this.f8292A = c0609f.k();
                            continue;
                        case 18:
                            if (!z8) {
                                this.f8297n = new ArrayList();
                                z8 = true;
                            }
                            this.f8297n.add(c0609f.g(S.f8267s, c0611h));
                            continue;
                        case 24:
                            this.f8296m |= 1;
                            this.f8298o = c0609f.l() != 0;
                            continue;
                        case ConcurrentMapKt.INITIAL_CAPACITY /* 32 */:
                            this.f8296m |= 2;
                            this.f8299p = c0609f.k();
                            continue;
                        case 42:
                            if ((this.f8296m & 4) == 4) {
                                U u5 = this.f8300q;
                                u5.getClass();
                                tR = r(u5);
                            }
                            U u7 = (U) c0609f.g(c0570a, c0611h);
                            this.f8300q = u7;
                            if (tR != null) {
                                tR.i(u7);
                                this.f8300q = tR.g();
                            }
                            this.f8296m |= 4;
                            continue;
                        case 48:
                            this.f8296m |= 16;
                            this.f8302s = c0609f.k();
                            continue;
                        case 56:
                            this.f8296m |= 32;
                            this.f8303t = c0609f.k();
                            continue;
                        case PKCEConstants.VERIFIER_LENGTH /* 64 */:
                            this.f8296m |= 8;
                            this.f8301r = c0609f.k();
                            continue;
                        case 72:
                            this.f8296m |= 64;
                            this.f8304u = c0609f.k();
                            continue;
                        case 82:
                            if ((this.f8296m & 256) == 256) {
                                U u8 = this.f8306w;
                                u8.getClass();
                                tR = r(u8);
                            }
                            U u9 = (U) c0609f.g(c0570a, c0611h);
                            this.f8306w = u9;
                            if (tR != null) {
                                tR.i(u9);
                                this.f8306w = tR.g();
                            }
                            this.f8296m |= 256;
                            continue;
                        case 88:
                            this.f8296m |= 512;
                            this.f8307x = c0609f.k();
                            continue;
                        case 96:
                            this.f8296m |= 128;
                            this.f8305v = c0609f.k();
                            continue;
                        case 106:
                            if ((this.f8296m & 1024) == 1024) {
                                U u10 = this.f8308y;
                                u10.getClass();
                                tR = r(u10);
                            }
                            U u11 = (U) c0609f.g(c0570a, c0611h);
                            this.f8308y = u11;
                            if (tR != null) {
                                tR.i(u11);
                                this.f8308y = tR.g();
                            }
                            this.f8296m |= 1024;
                            continue;
                        case 112:
                            this.f8296m |= 2048;
                            this.f8309z = c0609f.k();
                            continue;
                        default:
                            if (!n(c0609f, gS, c0611h, iN)) {
                                break;
                            }
                    }
                    z7 = true;
                } catch (Throwable th) {
                    if (z8) {
                        this.f8297n = Collections.unmodifiableList(this.f8297n);
                    }
                    try {
                        gS.m();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f8295l = c0607d.g();
                        throw th2;
                    }
                    this.f8295l = c0607d.g();
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
        if (z8) {
            this.f8297n = Collections.unmodifiableList(this.f8297n);
        }
        try {
            gS.m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8295l = c0607d.g();
            throw th3;
        }
        this.f8295l = c0607d.g();
        m();
    }
}
