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

/* renamed from: R4.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589u extends AbstractC0618o {

    /* renamed from: t, reason: collision with root package name */
    public static final C0589u f8614t;

    /* renamed from: u, reason: collision with root package name */
    public static final C0570a f8615u = new C0570a(7);

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0608e f8616k;

    /* renamed from: l, reason: collision with root package name */
    public int f8617l;

    /* renamed from: m, reason: collision with root package name */
    public EnumC0587s f8618m;

    /* renamed from: n, reason: collision with root package name */
    public List f8619n;

    /* renamed from: o, reason: collision with root package name */
    public C0594z f8620o;

    /* renamed from: p, reason: collision with root package name */
    public EnumC0588t f8621p;

    /* renamed from: q, reason: collision with root package name */
    public r f8622q;

    /* renamed from: r, reason: collision with root package name */
    public byte f8623r;

    /* renamed from: s, reason: collision with root package name */
    public int f8624s;

    static {
        C0589u c0589u = new C0589u();
        f8614t = c0589u;
        c0589u.f8618m = EnumC0587s.RETURNS_CONSTANT;
        c0589u.f8619n = Collections.EMPTY_LIST;
        c0589u.f8620o = C0594z.f8649v;
        c0589u.f8621p = EnumC0588t.AT_MOST_ONCE;
        c0589u.f8622q = r.CONCLUSION_CONDITION;
    }

    public C0589u() {
        this.f8623r = (byte) -1;
        this.f8624s = -1;
        this.f8616k = AbstractC0608e.f9883k;
    }

    @Override // X4.w
    public final boolean a() {
        byte b4 = this.f8623r;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        for (int i7 = 0; i7 < this.f8619n.size(); i7++) {
            if (!((C0594z) this.f8619n.get(i7)).a()) {
                this.f8623r = (byte) 0;
                return false;
            }
        }
        if ((this.f8617l & 2) != 2 || this.f8620o.a()) {
            this.f8623r = (byte) 1;
            return true;
        }
        this.f8623r = (byte) 0;
        return false;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f8624s;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f8617l & 1) == 1 ? B1.G.d(1, this.f8618m.f8608k) : 0;
        for (int i8 = 0; i8 < this.f8619n.size(); i8++) {
            iD += B1.G.g(2, (AbstractC0605b) this.f8619n.get(i8));
        }
        if ((this.f8617l & 2) == 2) {
            iD += B1.G.g(3, this.f8620o);
        }
        if ((this.f8617l & 4) == 4) {
            iD += B1.G.d(4, this.f8621p.f8613k);
        }
        if ((this.f8617l & 8) == 8) {
            iD += B1.G.d(5, this.f8622q.f8603k);
        }
        int size = this.f8616k.size() + iD;
        this.f8624s = size;
        return size;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        return C0586q.h();
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        C0586q c0586qH = C0586q.h();
        c0586qH.k(this);
        return c0586qH;
    }

    @Override // X4.AbstractC0605b
    public final void f(B1.G g4) throws IOException {
        c();
        if ((this.f8617l & 1) == 1) {
            g4.A(1, this.f8618m.f8608k);
        }
        for (int i7 = 0; i7 < this.f8619n.size(); i7++) {
            g4.D(2, (AbstractC0605b) this.f8619n.get(i7));
        }
        if ((this.f8617l & 2) == 2) {
            g4.D(3, this.f8620o);
        }
        if ((this.f8617l & 4) == 4) {
            g4.A(4, this.f8621p.f8613k);
        }
        if ((this.f8617l & 8) == 8) {
            g4.A(5, this.f8622q.f8603k);
        }
        g4.G(this.f8616k);
    }

    public C0589u(C0586q c0586q) {
        this.f8623r = (byte) -1;
        this.f8624s = -1;
        this.f8616k = c0586q.f9896k;
    }

    public C0589u(C0609f c0609f, C0611h c0611h) {
        this.f8623r = (byte) -1;
        this.f8624s = -1;
        EnumC0587s enumC0587s = EnumC0587s.RETURNS_CONSTANT;
        this.f8618m = enumC0587s;
        this.f8619n = Collections.EMPTY_LIST;
        this.f8620o = C0594z.f8649v;
        EnumC0588t enumC0588t = EnumC0588t.AT_MOST_ONCE;
        this.f8621p = enumC0588t;
        r rVar = r.CONCLUSION_CONDITION;
        this.f8622q = rVar;
        C0607d c0607d = new C0607d();
        B1.G gS = B1.G.s(c0607d, 1);
        boolean z7 = false;
        char c2 = 0;
        while (!z7) {
            try {
                try {
                    int iN = c0609f.n();
                    if (iN != 0) {
                        r rVar2 = null;
                        EnumC0587s enumC0587s2 = null;
                        C0592x c0592xG = null;
                        EnumC0588t enumC0588t2 = null;
                        if (iN == 8) {
                            int iK = c0609f.k();
                            if (iK == 0) {
                                enumC0587s2 = enumC0587s;
                            } else if (iK == 1) {
                                enumC0587s2 = EnumC0587s.CALLS;
                            } else if (iK == 2) {
                                enumC0587s2 = EnumC0587s.RETURNS_NOT_NULL;
                            }
                            if (enumC0587s2 == null) {
                                gS.K(iN);
                                gS.K(iK);
                            } else {
                                this.f8617l |= 1;
                                this.f8618m = enumC0587s2;
                            }
                        } else if (iN == 18) {
                            int i7 = (c2 == true ? 1 : 0) & 2;
                            c2 = c2;
                            if (i7 != 2) {
                                this.f8619n = new ArrayList();
                                c2 = 2;
                            }
                            this.f8619n.add(c0609f.g(C0594z.f8650w, c0611h));
                        } else if (iN == 26) {
                            if ((this.f8617l & 2) == 2) {
                                C0594z c0594z = this.f8620o;
                                c0594z.getClass();
                                c0592xG = C0592x.g();
                                c0592xG.h(c0594z);
                            }
                            C0594z c0594z2 = (C0594z) c0609f.g(C0594z.f8650w, c0611h);
                            this.f8620o = c0594z2;
                            if (c0592xG != null) {
                                c0592xG.h(c0594z2);
                                this.f8620o = c0592xG.f();
                            }
                            this.f8617l |= 2;
                        } else if (iN == 32) {
                            int iK2 = c0609f.k();
                            if (iK2 == 0) {
                                enumC0588t2 = enumC0588t;
                            } else if (iK2 == 1) {
                                enumC0588t2 = EnumC0588t.EXACTLY_ONCE;
                            } else if (iK2 == 2) {
                                enumC0588t2 = EnumC0588t.AT_LEAST_ONCE;
                            }
                            if (enumC0588t2 == null) {
                                gS.K(iN);
                                gS.K(iK2);
                            } else {
                                this.f8617l |= 4;
                                this.f8621p = enumC0588t2;
                            }
                        } else if (iN != 40) {
                            if (!c0609f.q(iN, gS)) {
                            }
                        } else {
                            int iK3 = c0609f.k();
                            if (iK3 == 0) {
                                rVar2 = rVar;
                            } else if (iK3 == 1) {
                                rVar2 = r.RETURNS_CONDITION;
                            } else if (iK3 == 2) {
                                rVar2 = r.HOLDSIN_CONDITION;
                            }
                            if (rVar2 == null) {
                                gS.K(iN);
                                gS.K(iK3);
                            } else {
                                this.f8617l |= 8;
                                this.f8622q = rVar2;
                            }
                        }
                    }
                    z7 = true;
                } catch (X4.r e7) {
                    e7.f9907k = this;
                    throw e7;
                } catch (IOException e8) {
                    X4.r rVar3 = new X4.r(e8.getMessage());
                    rVar3.f9907k = this;
                    throw rVar3;
                }
            } catch (Throwable th) {
                if (((c2 == true ? 1 : 0) & 2) == 2) {
                    this.f8619n = Collections.unmodifiableList(this.f8619n);
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
        if (((c2 == true ? 1 : 0) & 2) == 2) {
            this.f8619n = Collections.unmodifiableList(this.f8619n);
        }
        try {
            gS.m();
        } catch (IOException unused2) {
        } finally {
            this.f8616k = c0607d.g();
        }
    }
}
