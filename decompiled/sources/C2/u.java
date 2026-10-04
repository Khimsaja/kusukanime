package C2;

import B1.AbstractC0015b;
import V1.AbstractC0597b;
import V1.C0596a;
import java.util.Collections;
import y1.C2392n;
import y1.C2393o;

/* loaded from: classes.dex */
public final class u implements InterfaceC0037j {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f880b;

    /* renamed from: c, reason: collision with root package name */
    public final B1.B f881c;

    /* renamed from: d, reason: collision with root package name */
    public final B1.A f882d;

    /* renamed from: e, reason: collision with root package name */
    public V1.G f883e;

    /* renamed from: f, reason: collision with root package name */
    public String f884f;

    /* renamed from: g, reason: collision with root package name */
    public C2393o f885g;

    /* renamed from: h, reason: collision with root package name */
    public int f886h;

    /* renamed from: i, reason: collision with root package name */
    public int f887i;

    /* renamed from: j, reason: collision with root package name */
    public int f888j;

    /* renamed from: k, reason: collision with root package name */
    public int f889k;

    /* renamed from: l, reason: collision with root package name */
    public long f890l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f891m;

    /* renamed from: n, reason: collision with root package name */
    public int f892n;

    /* renamed from: o, reason: collision with root package name */
    public int f893o;

    /* renamed from: p, reason: collision with root package name */
    public int f894p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f895q;

    /* renamed from: r, reason: collision with root package name */
    public long f896r;

    /* renamed from: s, reason: collision with root package name */
    public int f897s;

    /* renamed from: t, reason: collision with root package name */
    public long f898t;

    /* renamed from: u, reason: collision with root package name */
    public int f899u;

    /* renamed from: v, reason: collision with root package name */
    public String f900v;

    public u(String str, int i7) {
        this.a = str;
        this.f880b = i7;
        B1.B b4 = new B1.B(1024);
        this.f881c = b4;
        byte[] bArr = b4.a;
        this.f882d = new B1.A(bArr, bArr.length);
        this.f890l = -9223372036854775807L;
    }

    @Override // C2.InterfaceC0037j
    public final void a() {
        this.f886h = 0;
        this.f890l = -9223372036854775807L;
        this.f891m = false;
    }

    @Override // C2.InterfaceC0037j
    public final void b(B1.B b4) throws y1.E {
        int i7;
        int i8;
        boolean zH;
        AbstractC0015b.i(this.f883e);
        while (b4.a() > 0) {
            int i9 = this.f886h;
            if (i9 != 0) {
                if (i9 != 1) {
                    B1.B b7 = this.f881c;
                    B1.A a = this.f882d;
                    if (i9 == 2) {
                        int iT = ((this.f889k & (-225)) << 8) | b4.t();
                        this.f888j = iT;
                        if (iT > b7.a.length) {
                            b7.C(iT);
                            byte[] bArr = b7.a;
                            a.getClass();
                            a.p(bArr, bArr.length);
                        }
                        this.f887i = 0;
                        this.f886h = 3;
                    } else {
                        if (i9 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(b4.a(), this.f888j - this.f887i);
                        b4.e(a.f281b, this.f887i, iMin);
                        int i10 = this.f887i + iMin;
                        this.f887i = i10;
                        if (i10 == this.f888j) {
                            a.q(0);
                            if (a.h()) {
                                if (this.f891m) {
                                }
                                this.f886h = 0;
                            } else {
                                this.f891m = true;
                                int i11 = a.i(1);
                                int i12 = i11 == 1 ? a.i(1) : 0;
                                this.f892n = i12;
                                if (i12 != 0) {
                                    throw y1.E.a(null, null);
                                }
                                if (i11 == 1) {
                                    a.i((a.i(2) + 1) * 8);
                                }
                                if (!a.h()) {
                                    throw y1.E.a(null, null);
                                }
                                this.f893o = a.i(6);
                                int i13 = a.i(4);
                                int i14 = a.i(3);
                                if (i13 != 0 || i14 != 0) {
                                    throw y1.E.a(null, null);
                                }
                                if (i11 == 0) {
                                    int iG = a.g();
                                    int iB = a.b();
                                    C0596a c0596aN = AbstractC0597b.n(a, true);
                                    this.f900v = c0596aN.a;
                                    this.f897s = c0596aN.f9328b;
                                    this.f899u = c0596aN.f9329c;
                                    int iB2 = iB - a.b();
                                    a.q(iG);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    a.j(bArr2, iB2);
                                    C2392n c2392n = new C2392n();
                                    c2392n.a = this.f884f;
                                    c2392n.f18073l = y1.D.m("video/mp2t");
                                    c2392n.f18074m = y1.D.m("audio/mp4a-latm");
                                    c2392n.f18071j = this.f900v;
                                    c2392n.f18055C = this.f899u;
                                    c2392n.f18056D = this.f897s;
                                    c2392n.f18077p = Collections.singletonList(bArr2);
                                    c2392n.f18065d = this.a;
                                    c2392n.f18067f = this.f880b;
                                    C2393o c2393o = new C2393o(c2392n);
                                    if (!c2393o.equals(this.f885g)) {
                                        this.f885g = c2393o;
                                        this.f898t = 1024000000 / c2393o.f18092E;
                                        this.f883e.a(c2393o);
                                    }
                                } else {
                                    int iB3 = a.b();
                                    C0596a c0596aN2 = AbstractC0597b.n(a, true);
                                    this.f900v = c0596aN2.a;
                                    this.f897s = c0596aN2.f9328b;
                                    this.f899u = c0596aN2.f9329c;
                                    a.t(a.i((a.i(2) + 1) * 8) - (iB3 - a.b()));
                                }
                                int i15 = a.i(3);
                                this.f894p = i15;
                                if (i15 == 0) {
                                    a.t(8);
                                } else if (i15 == 1) {
                                    a.t(9);
                                } else if (i15 == 3 || i15 == 4 || i15 == 5) {
                                    a.t(6);
                                } else {
                                    if (i15 != 6 && i15 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    a.t(1);
                                }
                                boolean zH2 = a.h();
                                this.f895q = zH2;
                                this.f896r = 0L;
                                if (zH2) {
                                    if (i11 == 1) {
                                        this.f896r = a.i((a.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zH = a.h();
                                            this.f896r = (this.f896r << 8) + a.i(8);
                                        } while (zH);
                                    }
                                }
                                if (a.h()) {
                                    a.t(8);
                                }
                            }
                            if (this.f892n != 0) {
                                throw y1.E.a(null, null);
                            }
                            if (this.f893o != 0) {
                                throw y1.E.a(null, null);
                            }
                            if (this.f894p != 0) {
                                throw y1.E.a(null, null);
                            }
                            int i16 = 0;
                            do {
                                i7 = a.i(8);
                                i16 += i7;
                            } while (i7 == 255);
                            int iG2 = a.g();
                            if ((iG2 & 7) == 0) {
                                b7.F(iG2 >> 3);
                                i8 = 0;
                            } else {
                                a.j(b7.a, i16 * 8);
                                i8 = 0;
                                b7.F(0);
                            }
                            this.f883e.c(b7, i16, i8);
                            AbstractC0015b.h(this.f890l != -9223372036854775807L);
                            this.f883e.b(this.f890l, 1, i16, 0, null);
                            this.f890l += this.f898t;
                            if (this.f895q) {
                                a.t((int) this.f896r);
                            }
                            this.f886h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iT2 = b4.t();
                    if ((iT2 & 224) == 224) {
                        this.f889k = iT2;
                        this.f886h = 2;
                    } else if (iT2 != 86) {
                        this.f886h = 0;
                    }
                }
            } else if (b4.t() == 86) {
                this.f886h = 1;
            }
        }
    }

    @Override // C2.InterfaceC0037j
    public final void d(int i7, long j7) {
        this.f890l = j7;
    }

    @Override // C2.InterfaceC0037j
    public final void e(V1.p pVar, K k7) {
        k7.a();
        k7.b();
        this.f883e = pVar.m(k7.f688d, 1);
        k7.b();
        this.f884f = k7.f689e;
    }

    @Override // C2.InterfaceC0037j
    public final void c(boolean z7) {
    }
}
