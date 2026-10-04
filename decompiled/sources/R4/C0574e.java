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

/* renamed from: R4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0574e extends AbstractC0618o {

    /* renamed from: A, reason: collision with root package name */
    public static final C0570a f8431A = new C0570a(2);

    /* renamed from: z, reason: collision with root package name */
    public static final C0574e f8432z;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0608e f8433k;

    /* renamed from: l, reason: collision with root package name */
    public int f8434l;

    /* renamed from: m, reason: collision with root package name */
    public EnumC0573d f8435m;

    /* renamed from: n, reason: collision with root package name */
    public long f8436n;

    /* renamed from: o, reason: collision with root package name */
    public float f8437o;

    /* renamed from: p, reason: collision with root package name */
    public double f8438p;

    /* renamed from: q, reason: collision with root package name */
    public int f8439q;

    /* renamed from: r, reason: collision with root package name */
    public int f8440r;

    /* renamed from: s, reason: collision with root package name */
    public int f8441s;

    /* renamed from: t, reason: collision with root package name */
    public C0577h f8442t;

    /* renamed from: u, reason: collision with root package name */
    public List f8443u;

    /* renamed from: v, reason: collision with root package name */
    public int f8444v;

    /* renamed from: w, reason: collision with root package name */
    public int f8445w;

    /* renamed from: x, reason: collision with root package name */
    public byte f8446x;

    /* renamed from: y, reason: collision with root package name */
    public int f8447y;

    static {
        C0574e c0574e = new C0574e();
        f8432z = c0574e;
        c0574e.i();
    }

    public C0574e() {
        this.f8446x = (byte) -1;
        this.f8447y = -1;
        this.f8433k = AbstractC0608e.f9883k;
    }

    public static C0572c j(C0574e c0574e) {
        C0572c c0572cG = C0572c.g();
        c0572cG.h(c0574e);
        return c0572cG;
    }

    @Override // X4.w
    public final boolean a() {
        byte b4 = this.f8446x;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        if ((this.f8434l & 128) == 128 && !this.f8442t.a()) {
            this.f8446x = (byte) 0;
            return false;
        }
        for (int i7 = 0; i7 < this.f8443u.size(); i7++) {
            if (!((C0574e) this.f8443u.get(i7)).a()) {
                this.f8446x = (byte) 0;
                return false;
            }
        }
        this.f8446x = (byte) 1;
        return true;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8447y;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f8434l & 1) == 1 ? B1.G.d(1, this.f8435m.f8423k) : 0;
        if ((this.f8434l & 2) == 2) {
            long j7 = this.f8436n;
            iD += B1.G.j((j7 >> 63) ^ (j7 << 1)) + B1.G.k(2);
        }
        if ((this.f8434l & 4) == 4) {
            iD += B1.G.k(3) + 4;
        }
        if ((this.f8434l & 8) == 8) {
            iD += B1.G.k(4) + 8;
        }
        if ((this.f8434l & 16) == 16) {
            iD += B1.G.e(5, this.f8439q);
        }
        if ((this.f8434l & 32) == 32) {
            iD += B1.G.e(6, this.f8440r);
        }
        if ((this.f8434l & 64) == 64) {
            iD += B1.G.e(7, this.f8441s);
        }
        if ((this.f8434l & 128) == 128) {
            iD += B1.G.g(8, this.f8442t);
        }
        for (int i8 = 0; i8 < this.f8443u.size(); i8++) {
            iD += B1.G.g(9, (AbstractC0605b) this.f8443u.get(i8));
        }
        if ((this.f8434l & 512) == 512) {
            iD += B1.G.e(10, this.f8445w);
        }
        if ((this.f8434l & 256) == 256) {
            iD += B1.G.e(11, this.f8444v);
        }
        int size = this.f8433k.size() + iD;
        this.f8447y = size;
        return size;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        return C0572c.g();
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        return j(this);
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        if ((this.f8434l & 1) == 1) {
            g4.A(1, this.f8435m.f8423k);
        }
        if ((this.f8434l & 2) == 2) {
            long j7 = this.f8436n;
            g4.M(2, 0);
            g4.L((j7 >> 63) ^ (j7 << 1));
        }
        if ((this.f8434l & 4) == 4) {
            float f5 = this.f8437o;
            g4.M(3, 5);
            g4.I(Float.floatToRawIntBits(f5));
        }
        if ((this.f8434l & 8) == 8) {
            double d4 = this.f8438p;
            g4.M(4, 1);
            g4.J(Double.doubleToRawLongBits(d4));
        }
        if ((this.f8434l & 16) == 16) {
            g4.B(5, this.f8439q);
        }
        if ((this.f8434l & 32) == 32) {
            g4.B(6, this.f8440r);
        }
        if ((this.f8434l & 64) == 64) {
            g4.B(7, this.f8441s);
        }
        if ((this.f8434l & 128) == 128) {
            g4.D(8, this.f8442t);
        }
        for (int i7 = 0; i7 < this.f8443u.size(); i7++) {
            g4.D(9, (AbstractC0605b) this.f8443u.get(i7));
        }
        if ((this.f8434l & 512) == 512) {
            g4.B(10, this.f8445w);
        }
        if ((this.f8434l & 256) == 256) {
            g4.B(11, this.f8444v);
        }
        g4.G(this.f8433k);
    }

    public final void i() {
        this.f8435m = EnumC0573d.BYTE;
        this.f8436n = 0L;
        this.f8437o = 0.0f;
        this.f8438p = 0.0d;
        this.f8439q = 0;
        this.f8440r = 0;
        this.f8441s = 0;
        this.f8442t = C0577h.f8482q;
        this.f8443u = Collections.EMPTY_LIST;
        this.f8444v = 0;
        this.f8445w = 0;
    }

    public C0574e(C0572c c0572c) {
        this.f8446x = (byte) -1;
        this.f8447y = -1;
        this.f8433k = c0572c.f9896k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public C0574e(C0609f c0609f, C0611h c0611h) {
        C0576g c0576g;
        this.f8446x = (byte) -1;
        this.f8447y = -1;
        i();
        C0607d c0607d = new C0607d();
        B1.G gS = B1.G.s(c0607d, 1);
        boolean z7 = false;
        char c2 = 0;
        while (true) {
            ?? Q6 = 256;
            if (!z7) {
                try {
                    try {
                        int iN = c0609f.n();
                        switch (iN) {
                            case 0:
                                z7 = true;
                            case 8:
                                int iK = c0609f.k();
                                EnumC0573d enumC0573dB = EnumC0573d.b(iK);
                                if (enumC0573dB == null) {
                                    gS.K(iN);
                                    gS.K(iK);
                                } else {
                                    this.f8434l |= 1;
                                    this.f8435m = enumC0573dB;
                                }
                            case 16:
                                this.f8434l |= 2;
                                long jL = c0609f.l();
                                this.f8436n = (-(jL & 1)) ^ (jL >>> 1);
                            case 29:
                                this.f8434l |= 4;
                                this.f8437o = Float.intBitsToFloat(c0609f.i());
                            case 33:
                                this.f8434l |= 8;
                                this.f8438p = Double.longBitsToDouble(c0609f.j());
                            case 40:
                                this.f8434l |= 16;
                                this.f8439q = c0609f.k();
                            case 48:
                                this.f8434l |= 32;
                                this.f8440r = c0609f.k();
                            case 56:
                                this.f8434l |= 64;
                                this.f8441s = c0609f.k();
                            case 66:
                                if ((this.f8434l & 128) == 128) {
                                    C0577h c0577h = this.f8442t;
                                    c0577h.getClass();
                                    c0576g = new C0576g(0);
                                    c0576g.f8468n = Collections.EMPTY_LIST;
                                    c0576g.i(c0577h);
                                } else {
                                    c0576g = null;
                                }
                                C0577h c0577h2 = (C0577h) c0609f.g(C0577h.f8483r, c0611h);
                                this.f8442t = c0577h2;
                                if (c0576g != null) {
                                    c0576g.i(c0577h2);
                                    this.f8442t = c0576g.f();
                                }
                                this.f8434l |= 128;
                            case 74:
                                if ((c2 & 256) != 256) {
                                    this.f8443u = new ArrayList();
                                    c2 = 256;
                                }
                                this.f8443u.add(c0609f.g(f8431A, c0611h));
                            case 80:
                                this.f8434l |= 512;
                                this.f8445w = c0609f.k();
                            case 88:
                                this.f8434l |= 256;
                                this.f8444v = c0609f.k();
                            default:
                                Q6 = c0609f.q(iN, gS);
                                if (Q6 == 0) {
                                    z7 = true;
                                }
                        }
                    } catch (X4.r e7) {
                        e7.f9907k = this;
                        throw e7;
                    } catch (IOException e8) {
                        X4.r rVar = new X4.r(e8.getMessage());
                        rVar.f9907k = this;
                        throw rVar;
                    }
                } catch (Throwable th) {
                    if ((c2 & 256) == Q6) {
                        this.f8443u = Collections.unmodifiableList(this.f8443u);
                    }
                    try {
                        gS.m();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    throw th;
                }
            } else {
                if ((c2 & 256) == 256) {
                    this.f8443u = Collections.unmodifiableList(this.f8443u);
                }
                try {
                    gS.m();
                    return;
                } catch (IOException unused2) {
                    return;
                } finally {
                    this.f8433k = c0607d.g();
                }
            }
        }
    }
}
