package C2;

import B1.AbstractC0015b;

/* loaded from: classes.dex */
public final class z implements L {
    public final InterfaceC0037j a;

    /* renamed from: b, reason: collision with root package name */
    public final B1.A f941b = new B1.A(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    public int f942c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f943d;

    /* renamed from: e, reason: collision with root package name */
    public B1.H f944e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f945f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f946g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f947h;

    /* renamed from: i, reason: collision with root package name */
    public int f948i;

    /* renamed from: j, reason: collision with root package name */
    public int f949j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f950k;

    /* renamed from: l, reason: collision with root package name */
    public long f951l;

    public z(InterfaceC0037j interfaceC0037j) {
        this.a = interfaceC0037j;
    }

    @Override // C2.L
    public final void a() {
        this.f942c = 0;
        this.f943d = 0;
        this.f947h = false;
        this.a.a();
    }

    @Override // C2.L
    public final void b(int i7, B1.B b4) {
        int i8;
        int i9;
        AbstractC0015b.i(this.f944e);
        int i10 = i7 & 1;
        InterfaceC0037j interfaceC0037j = this.a;
        int i11 = -1;
        int i12 = 2;
        if (i10 != 0) {
            int i13 = this.f942c;
            if (i13 != 0 && i13 != 1) {
                if (i13 == 2) {
                    AbstractC0015b.v("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f949j != -1) {
                        AbstractC0015b.v("PesReader", "Unexpected start indicator: expected " + this.f949j + " more bytes");
                    }
                    interfaceC0037j.c(b4.f289c == 0);
                }
            }
            this.f942c = 1;
            this.f943d = 0;
        }
        int i14 = i7;
        while (b4.a() > 0) {
            int i15 = this.f942c;
            if (i15 != 0) {
                B1.A a = this.f941b;
                if (i15 != 1) {
                    if (i15 == i12) {
                        if (d(b4, a.f281b, Math.min(10, this.f948i)) && d(b4, null, this.f948i)) {
                            a.q(0);
                            this.f951l = -9223372036854775807L;
                            if (this.f945f) {
                                a.t(4);
                                a.t(1);
                                a.t(1);
                                long jI = (a.i(15) << 15) | (a.i(3) << 30) | a.i(15);
                                a.t(1);
                                if (!this.f947h && this.f946g) {
                                    a.t(4);
                                    a.t(1);
                                    a.t(1);
                                    a.t(1);
                                    this.f944e.b((a.i(3) << 30) | (a.i(15) << 15) | a.i(15));
                                    this.f947h = true;
                                }
                                this.f951l = this.f944e.b(jI);
                            }
                            i14 |= this.f950k ? 4 : 0;
                            interfaceC0037j.d(i14, this.f951l);
                            this.f942c = 3;
                            this.f943d = 0;
                            i11 = -1;
                            i12 = 2;
                        }
                    } else {
                        if (i15 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = b4.a();
                        int i16 = this.f949j;
                        int i17 = i16 == i11 ? 0 : iA - i16;
                        if (i17 > 0) {
                            iA -= i17;
                            b4.E(b4.f288b + iA);
                        }
                        interfaceC0037j.b(b4);
                        int i18 = this.f949j;
                        if (i18 != i11) {
                            int i19 = i18 - iA;
                            this.f949j = i19;
                            if (i19 == 0) {
                                interfaceC0037j.c(false);
                                this.f942c = 1;
                                this.f943d = 0;
                            }
                        }
                    }
                    i8 = i12;
                } else if (d(b4, a.f281b, 9)) {
                    a.q(0);
                    int i20 = a.i(24);
                    if (i20 != 1) {
                        A6.b.n(i20, "Unexpected start code prefix: ", "PesReader");
                        this.f949j = -1;
                        i9 = 0;
                        i11 = -1;
                        i8 = 2;
                    } else {
                        a.t(8);
                        int i21 = a.i(16);
                        a.t(5);
                        this.f950k = a.h();
                        i8 = 2;
                        a.t(2);
                        this.f945f = a.h();
                        this.f946g = a.h();
                        a.t(6);
                        int i22 = a.i(8);
                        this.f948i = i22;
                        if (i21 == 0) {
                            this.f949j = -1;
                            i11 = -1;
                        } else {
                            int i23 = (i21 - 3) - i22;
                            this.f949j = i23;
                            if (i23 < 0) {
                                AbstractC0015b.v("PesReader", "Found negative packet payload size: " + this.f949j);
                                i11 = -1;
                                this.f949j = -1;
                            } else {
                                i11 = -1;
                            }
                        }
                        i9 = 2;
                    }
                    this.f942c = i9;
                    this.f943d = 0;
                } else {
                    i11 = -1;
                    i8 = 2;
                }
            } else {
                i8 = i12;
                b4.G(b4.a());
            }
            i12 = i8;
        }
    }

    @Override // C2.L
    public final void c(B1.H h7, V1.p pVar, K k7) {
        this.f944e = h7;
        this.a.e(pVar, k7);
    }

    public final boolean d(B1.B b4, byte[] bArr, int i7) {
        int iMin = Math.min(b4.a(), i7 - this.f943d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            b4.G(iMin);
        } else {
            b4.e(bArr, this.f943d, iMin);
        }
        int i8 = this.f943d + iMin;
        this.f943d = i8;
        return i8 == i7;
    }
}
