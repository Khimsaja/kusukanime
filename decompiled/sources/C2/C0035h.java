package C2;

import B1.AbstractC0015b;
import V1.AbstractC0597b;
import V1.C0596a;
import f1.AbstractC0871d;
import io.ktor.client.utils.CIOKt;
import io.ktor.network.sockets.DatagramKt;
import io.ktor.util.GzipHeaderFlags;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import y1.C2392n;
import y1.C2393o;

/* renamed from: C2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035h implements InterfaceC0037j {
    public final B1.B a;

    /* renamed from: c, reason: collision with root package name */
    public final String f743c;

    /* renamed from: d, reason: collision with root package name */
    public final int f744d;

    /* renamed from: f, reason: collision with root package name */
    public String f746f;

    /* renamed from: g, reason: collision with root package name */
    public V1.G f747g;

    /* renamed from: i, reason: collision with root package name */
    public int f749i;

    /* renamed from: j, reason: collision with root package name */
    public int f750j;

    /* renamed from: k, reason: collision with root package name */
    public long f751k;

    /* renamed from: l, reason: collision with root package name */
    public C2393o f752l;

    /* renamed from: m, reason: collision with root package name */
    public int f753m;

    /* renamed from: n, reason: collision with root package name */
    public int f754n;

    /* renamed from: h, reason: collision with root package name */
    public int f748h = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f757q = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f742b = new AtomicInteger();

    /* renamed from: o, reason: collision with root package name */
    public int f755o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f756p = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String f745e = "video/mp2t";

    public C0035h(String str, int i7, int i8) {
        this.a = new B1.B(new byte[i8]);
        this.f743c = str;
        this.f744d = i7;
    }

    @Override // C2.InterfaceC0037j
    public final void a() {
        this.f748h = 0;
        this.f749i = 0;
        this.f750j = 0;
        this.f757q = -9223372036854775807L;
        this.f742b.set(0);
    }

    @Override // C2.InterfaceC0037j
    public final void b(B1.B b4) throws y1.E {
        int i7;
        boolean z7;
        int i8;
        byte b7;
        int i9;
        byte b8;
        int i10;
        byte b9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long jL;
        int i17;
        int i18;
        long jL2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = 4;
        AbstractC0015b.i(this.f747g);
        while (b4.a() > 0) {
            int i24 = this.f748h;
            int i25 = 8;
            B1.B b10 = this.a;
            switch (i24) {
                case 0:
                    while (b4.a() > 0) {
                        int i26 = this.f750j << 8;
                        this.f750j = i26;
                        int iT = i26 | b4.t();
                        this.f750j = iT;
                        int i27 = (iT == 2147385345 || iT == -25230976 || iT == 536864768 || iT == -14745368) ? 1 : (iT == 1683496997 || iT == 622876772) ? 2 : (iT == 1078008818 || iT == -233094848) ? 3 : (iT == 1908687592 || iT == -398277519) ? 4 : 0;
                        this.f754n = i27;
                        if (i27 != 0) {
                            byte[] bArr = b10.a;
                            bArr[0] = (byte) ((iT >> 24) & 255);
                            bArr[1] = (byte) ((iT >> 16) & 255);
                            bArr[2] = (byte) ((iT >> 8) & 255);
                            bArr[3] = (byte) (iT & 255);
                            this.f749i = 4;
                            this.f750j = 0;
                            if (i27 == 3 || i27 == 4) {
                                this.f748h = 4;
                            } else if (i27 == 1) {
                                this.f748h = 1;
                            } else {
                                this.f748h = 2;
                            }
                            i23 = 4;
                        }
                    }
                    i23 = 4;
                    break;
                case 1:
                    if (f(b4, b10.a, 18)) {
                        byte[] bArr2 = b10.a;
                        if (this.f752l == null) {
                            String str = this.f746f;
                            B1.A aI = AbstractC0597b.i(bArr2);
                            aI.t(60);
                            int i28 = AbstractC0597b.f9338j[aI.i(6)];
                            int i29 = AbstractC0597b.f9339k[aI.i(4)];
                            int i30 = aI.i(5);
                            int i31 = i30 >= 29 ? -1 : (AbstractC0597b.f9340l[i30] * CIOKt.DEFAULT_HTTP_POOL_SIZE) / 2;
                            aI.t(10);
                            int i32 = i28 + (aI.i(2) > 0 ? 1 : 0);
                            C2392n c2392n = new C2392n();
                            c2392n.a = str;
                            c2392n.f18073l = y1.D.m(this.f745e);
                            c2392n.f18074m = y1.D.m("audio/vnd.dts");
                            c2392n.f18069h = i31;
                            c2392n.f18055C = i32;
                            c2392n.f18056D = i29;
                            c2392n.f18078q = null;
                            c2392n.f18065d = this.f743c;
                            c2392n.f18067f = this.f744d;
                            C2393o c2393o = new C2393o(c2392n);
                            this.f752l = c2393o;
                            this.f747g.a(c2393o);
                        }
                        byte b11 = bArr2[0];
                        if (b11 != -2) {
                            if (b11 == -1) {
                                i10 = ((bArr2[7] & 3) << 12) | ((bArr2[6] & 255) << 4);
                                b9 = bArr2[9];
                            } else if (b11 != 31) {
                                i7 = (((bArr2[5] & 3) << 12) | ((bArr2[6] & 255) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                                z7 = false;
                            } else {
                                i10 = ((bArr2[6] & 3) << 12) | ((bArr2[7] & 255) << 4);
                                b9 = bArr2[8];
                            }
                            i7 = (i10 | ((b9 & 60) >> 2)) + 1;
                            z7 = true;
                        } else {
                            i7 = (((bArr2[4] & 3) << 12) | ((bArr2[7] & 255) << 4) | ((bArr2[6] & 240) >> 4)) + 1;
                            z7 = false;
                        }
                        if (z7) {
                            i7 = (i7 * 16) / 14;
                        }
                        this.f753m = i7;
                        if (b11 != -2) {
                            if (b11 == -1) {
                                i8 = (bArr2[4] & 7) << 4;
                                b8 = bArr2[7];
                            } else if (b11 != 31) {
                                i8 = (bArr2[4] & 1) << 6;
                                b7 = bArr2[5];
                            } else {
                                i8 = (bArr2[5] & 7) << 4;
                                b8 = bArr2[6];
                            }
                            i9 = b8 & 60;
                            this.f751k = AbstractC0871d.I(B1.K.J(this.f752l.f18092E, (((i9 >> 2) | i8) + 1) * 32));
                            b10.F(0);
                            this.f747g.c(b10, 18, 0);
                            this.f748h = 6;
                        } else {
                            i8 = (bArr2[5] & 1) << 6;
                            b7 = bArr2[4];
                        }
                        i9 = b7 & 252;
                        this.f751k = AbstractC0871d.I(B1.K.J(this.f752l.f18092E, (((i9 >> 2) | i8) + 1) * 32));
                        b10.F(0);
                        this.f747g.c(b10, 18, 0);
                        this.f748h = 6;
                    }
                    i23 = 4;
                case 2:
                    if (f(b4, b10.a, 7)) {
                        B1.A aI2 = AbstractC0597b.i(b10.a);
                        aI2.t(42);
                        this.f755o = aI2.i(aI2.h() ? 12 : 8) + 1;
                        this.f748h = 3;
                    }
                    i23 = 4;
                case 3:
                    int i33 = i23;
                    if (f(b4, b10.a, this.f755o)) {
                        B1.A aI3 = AbstractC0597b.i(b10.a);
                        aI3.t(40);
                        int i34 = aI3.i(2);
                        if (aI3.h()) {
                            i11 = 20;
                            i12 = 12;
                        } else {
                            i11 = 16;
                            i12 = 8;
                        }
                        aI3.t(i12);
                        int i35 = aI3.i(i11) + 1;
                        boolean zH = aI3.h();
                        if (zH) {
                            i13 = aI3.i(2);
                            i14 = (aI3.i(3) + 1) * 512;
                            if (aI3.h()) {
                                aI3.t(36);
                            }
                            int i36 = aI3.i(3) + 1;
                            int i37 = aI3.i(3) + 1;
                            if (i36 != 1 || i37 != 1) {
                                throw y1.E.b("Multiple audio presentations or assets not supported");
                            }
                            int i38 = i34 + 1;
                            int i39 = aI3.i(i38);
                            int i40 = 0;
                            while (i40 < i38) {
                                if (((i39 >> i40) & 1) == 1) {
                                    aI3.t(i25);
                                }
                                i40++;
                                i25 = 8;
                            }
                            if (aI3.h()) {
                                aI3.t(2);
                                int i41 = (aI3.i(2) + 1) << 2;
                                int i42 = aI3.i(2) + 1;
                                for (int i43 = 0; i43 < i42; i43++) {
                                    aI3.t(i41);
                                }
                            }
                        } else {
                            i13 = -1;
                            i14 = 0;
                        }
                        aI3.t(i11);
                        aI3.t(12);
                        if (zH) {
                            if (aI3.h()) {
                                aI3.t(i33);
                            }
                            if (aI3.h()) {
                                aI3.t(24);
                            }
                            if (aI3.h()) {
                                aI3.u(aI3.i(10) + 1);
                            }
                            aI3.t(5);
                            int i44 = AbstractC0597b.f9341m[aI3.i(4)];
                            i15 = aI3.i(8) + 1;
                            i16 = i44;
                        } else {
                            i15 = -1;
                            i16 = -2147483647;
                        }
                        if (zH) {
                            if (i13 == 0) {
                                i17 = 32000;
                            } else if (i13 == 1) {
                                i17 = 44100;
                            } else {
                                if (i13 != 2) {
                                    throw y1.E.a(null, "Unsupported reference clock code in DTS HD header: " + i13);
                                }
                                i17 = 48000;
                            }
                            int i45 = B1.K.a;
                            jL = B1.K.L(i14, 1000000L, i17, RoundingMode.DOWN);
                        } else {
                            jL = -9223372036854775807L;
                        }
                        g(new C0596a("audio/vnd.dts.hd;profile=lbr", i15, i16, i35, jL));
                        this.f753m = i35;
                        this.f751k = jL == -9223372036854775807L ? 0L : jL;
                        b10.F(0);
                        this.f747g.c(b10, this.f755o, 0);
                        this.f748h = 6;
                    }
                    i23 = 4;
                    break;
                case GzipHeaderFlags.EXTRA /* 4 */:
                    i18 = i23;
                    if (f(b4, b10.a, 6)) {
                        B1.A aI4 = AbstractC0597b.i(b10.a);
                        aI4.t(32);
                        int iQ = AbstractC0597b.q(aI4, AbstractC0597b.f9346r) + 1;
                        this.f756p = iQ;
                        int i46 = this.f749i;
                        if (i46 > iQ) {
                            int i47 = i46 - iQ;
                            this.f749i = i46 - i47;
                            b4.F(b4.f288b - i47);
                        }
                        this.f748h = 5;
                    }
                    i23 = i18;
                case 5:
                    if (f(b4, b10.a, this.f756p)) {
                        byte[] bArr3 = b10.a;
                        AtomicInteger atomicInteger = this.f742b;
                        i18 = i23;
                        B1.A aI5 = AbstractC0597b.i(bArr3);
                        int i48 = aI5.i(32) == 1078008818 ? 1 : 0;
                        int iQ2 = AbstractC0597b.q(aI5, AbstractC0597b.f9342n);
                        int i49 = iQ2 + 1;
                        if (i48 == 0) {
                            jL2 = -9223372036854775807L;
                            i19 = -2147483647;
                        } else {
                            if (!aI5.h()) {
                                throw y1.E.b("Only supports full channel mask-based audio presentation");
                            }
                            int i50 = iQ2 - 1;
                            int i51 = ((bArr3[i50] << 8) & DatagramKt.MAX_DATAGRAM_SIZE) | (bArr3[iQ2] & 255);
                            int i52 = B1.K.a;
                            int i53 = 65535;
                            for (int i54 = 0; i54 < i50; i54++) {
                                byte b12 = bArr3[i54];
                                int i55 = (((b12 & 255) >> 4) ^ ((i53 >> 12) & 255)) & 255;
                                int i56 = (i53 << 4) & DatagramKt.MAX_DATAGRAM_SIZE;
                                int[] iArr = B1.K.f309j;
                                int i57 = (iArr[i55] ^ i56) & DatagramKt.MAX_DATAGRAM_SIZE;
                                i53 = (((i57 << 4) & DatagramKt.MAX_DATAGRAM_SIZE) ^ iArr[((b12 & 15) ^ ((i57 >> 12) & 255)) & 255]) & DatagramKt.MAX_DATAGRAM_SIZE;
                            }
                            if (i51 != i53) {
                                throw y1.E.a(null, "CRC check failed");
                            }
                            int i58 = aI5.i(2);
                            if (i58 != 0) {
                                if (i58 == 1) {
                                    i21 = 480;
                                } else {
                                    if (i58 != 2) {
                                        throw y1.E.a(null, "Unsupported base duration index in DTS UHD header: " + i58);
                                    }
                                    i21 = 384;
                                }
                                i20 = 3;
                            } else {
                                i20 = 3;
                                i21 = 512;
                            }
                            int i59 = (aI5.i(i20) + 1) * i21;
                            int i60 = aI5.i(2);
                            if (i60 == 0) {
                                i22 = 32000;
                            } else if (i60 == 1) {
                                i22 = 44100;
                            } else {
                                if (i60 != 2) {
                                    throw y1.E.a(null, "Unsupported clock rate index in DTS UHD header: " + i60);
                                }
                                i22 = 48000;
                            }
                            if (aI5.h()) {
                                aI5.t(36);
                            }
                            i19 = i22 * (1 << aI5.i(2));
                            jL2 = B1.K.L(i59, 1000000L, i22, RoundingMode.DOWN);
                        }
                        int iQ3 = 0;
                        for (int i61 = 0; i61 < i48; i61++) {
                            iQ3 += AbstractC0597b.q(aI5, AbstractC0597b.f9343o);
                        }
                        if (i48 != 0) {
                            atomicInteger.set(AbstractC0597b.q(aI5, AbstractC0597b.f9344p));
                        }
                        int iQ4 = iQ3 + (atomicInteger.get() != 0 ? AbstractC0597b.q(aI5, AbstractC0597b.f9345q) : 0) + i49;
                        C0596a c0596a = new C0596a("audio/vnd.dts.uhd;profile=p2", 2, i19, iQ4, jL2);
                        if (this.f754n == 3) {
                            g(c0596a);
                        }
                        this.f753m = iQ4;
                        this.f751k = jL2 == -9223372036854775807L ? 0L : jL2;
                        b10.F(0);
                        this.f747g.c(b10, this.f756p, 0);
                        this.f748h = 6;
                        i23 = i18;
                    } else {
                        continue;
                    }
                case 6:
                    int iMin = Math.min(b4.a(), this.f753m - this.f749i);
                    this.f747g.c(b4, iMin, 0);
                    int i62 = this.f749i + iMin;
                    this.f749i = i62;
                    if (i62 == this.f753m) {
                        AbstractC0015b.h(this.f757q != -9223372036854775807L);
                        this.f747g.b(this.f757q, this.f754n == i23 ? 0 : 1, this.f753m, 0, null);
                        this.f757q += this.f751k;
                        this.f748h = 0;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // C2.InterfaceC0037j
    public final void d(int i7, long j7) {
        this.f757q = j7;
    }

    @Override // C2.InterfaceC0037j
    public final void e(V1.p pVar, K k7) {
        k7.a();
        k7.b();
        this.f746f = k7.f689e;
        k7.b();
        this.f747g = pVar.m(k7.f688d, 1);
    }

    public final boolean f(B1.B b4, byte[] bArr, int i7) {
        int iMin = Math.min(b4.a(), i7 - this.f749i);
        b4.e(bArr, this.f749i, iMin);
        int i8 = this.f749i + iMin;
        this.f749i = i8;
        return i8 == i7;
    }

    public final void g(C0596a c0596a) {
        int i7;
        int i8 = c0596a.f9328b;
        if (i8 == -2147483647 || (i7 = c0596a.f9329c) == -1) {
            return;
        }
        C2393o c2393o = this.f752l;
        String str = c0596a.a;
        if (c2393o != null && i7 == c2393o.f18091D && i8 == c2393o.f18092E && str.equals(c2393o.f18112n)) {
            return;
        }
        C2393o c2393o2 = this.f752l;
        C2392n c2392n = c2393o2 == null ? new C2392n() : c2393o2.a();
        c2392n.a = this.f746f;
        c2392n.f18073l = y1.D.m(this.f745e);
        c2392n.f18074m = y1.D.m(str);
        c2392n.f18055C = i7;
        c2392n.f18056D = i8;
        c2392n.f18065d = this.f743c;
        c2392n.f18067f = this.f744d;
        C2393o c2393o3 = new C2393o(c2392n);
        this.f752l = c2393o3;
        this.f747g.a(c2393o3);
    }

    @Override // C2.InterfaceC0037j
    public final void c(boolean z7) {
    }
}
