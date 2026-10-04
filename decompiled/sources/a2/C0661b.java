package a2;

import B1.B;
import B1.K;
import C2.A;
import O1.S;
import V1.AbstractC0597b;
import V1.C0599d;
import V1.C0600e;
import V1.G;
import V1.k;
import V1.n;
import V1.o;
import V1.p;
import V1.r;
import V1.s;
import V1.t;
import h2.C1004a;
import j2.h;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import y1.C;
import y1.C2392n;
import y1.C2393o;
import y1.D;
import y1.E;

/* renamed from: a2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0661b implements n {

    /* renamed from: e, reason: collision with root package name */
    public S f10428e;

    /* renamed from: f, reason: collision with root package name */
    public G f10429f;

    /* renamed from: h, reason: collision with root package name */
    public C f10431h;

    /* renamed from: i, reason: collision with root package name */
    public t f10432i;

    /* renamed from: j, reason: collision with root package name */
    public int f10433j;

    /* renamed from: k, reason: collision with root package name */
    public int f10434k;

    /* renamed from: l, reason: collision with root package name */
    public A f10435l;

    /* renamed from: m, reason: collision with root package name */
    public int f10436m;

    /* renamed from: n, reason: collision with root package name */
    public long f10437n;
    public final byte[] a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final B f10425b = new B(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10426c = false;

    /* renamed from: d, reason: collision with root package name */
    public final r f10427d = new r();

    /* renamed from: g, reason: collision with root package name */
    public int f10430g = 0;

    @Override // V1.n
    public final boolean b(o oVar) {
        k kVar = (k) oVar;
        C cA = new B2.a(1).a(kVar, h.f12250s);
        if (cA != null) {
            int length = cA.a.length;
        }
        B b4 = new B(4);
        kVar.h(b4.a, 0, 4, false);
        return b4.v() == 1716281667;
    }

    @Override // V1.n
    public final void d(p pVar) {
        S s7 = (S) pVar;
        this.f10428e = s7;
        this.f10429f = s7.m(0, 1);
        s7.b();
    }

    @Override // V1.n
    public final void e(long j7, long j8) {
        if (j7 == 0) {
            this.f10430g = 0;
        } else {
            A a = this.f10435l;
            if (a != null) {
                a.B(j8);
            }
        }
        this.f10437n = j8 != 0 ? -1L : 0L;
        this.f10436m = 0;
        this.f10425b.C(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean, int] */
    @Override // V1.n
    public final int i(o oVar, r rVar) throws E, EOFException, InterruptedIOException {
        t tVar;
        int i7;
        V1.A sVar;
        long j7;
        long j8;
        boolean z7;
        long j9;
        boolean zB;
        int i8 = 16;
        boolean z8 = true;
        int i9 = this.f10430g;
        C c2 = null;
        if (i9 == 0) {
            ((k) oVar).f9394p = 0;
            k kVar = (k) oVar;
            long jI = kVar.i();
            C cA = new B2.a(1).a(kVar, !this.f10426c ? null : h.f12250s);
            if (cA != null && cA.a.length != 0) {
                c2 = cA;
            }
            kVar.f((int) (kVar.i() - jI));
            this.f10431h = c2;
            this.f10430g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i9 == 1) {
            ((k) oVar).h(bArr, 0, bArr.length, false);
            ((k) oVar).f9394p = 0;
            this.f10430g = 2;
            return 0;
        }
        if (i9 == 2) {
            B b4 = new B(4);
            ((k) oVar).a(b4.a, 0, 4, false);
            if (b4.v() != 1716281667) {
                throw E.a(null, "Failed to read FLAC stream marker.");
            }
            this.f10430g = 3;
            return 0;
        }
        if (i9 == 3) {
            ?? r15 = 0;
            t tVar2 = this.f10432i;
            boolean z9 = false;
            while (!z9) {
                ((k) oVar).f9394p = r15;
                byte[] bArr2 = new byte[4];
                B1.A a = new B1.A(bArr2, 4);
                k kVar2 = (k) oVar;
                kVar2.h(bArr2, r15, 4, r15);
                boolean zH = a.h();
                int i10 = a.i(i);
                int i11 = a.i(24) + 4;
                if (i10 == 0) {
                    byte[] bArr3 = new byte[38];
                    kVar2.a(bArr3, r15, 38, r15);
                    tVar2 = new t(bArr3, 4);
                } else {
                    if (tVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (i10 == 3) {
                        B b7 = new B(i11);
                        kVar2.a(b7.a, 0, i11, false);
                        tVar = new t(tVar2.a, tVar2.f9406b, tVar2.f9407c, tVar2.f9408d, tVar2.f9409e, tVar2.f9411g, tVar2.f9412h, tVar2.f9414j, AbstractC0597b.t(b7), tVar2.f9416l);
                    } else {
                        C c4 = tVar2.f9416l;
                        if (i10 == 4) {
                            B b8 = new B(i11);
                            kVar2.a(b8.a, 0, i11, false);
                            b8.G(4);
                            C cR = AbstractC0597b.r(Arrays.asList((String[]) AbstractC0597b.u(b8, false, false).f741l));
                            if (c4 != null) {
                                cR = c4.b(cR);
                            }
                            tVar = new t(tVar2.a, tVar2.f9406b, tVar2.f9407c, tVar2.f9408d, tVar2.f9409e, tVar2.f9411g, tVar2.f9412h, tVar2.f9414j, tVar2.f9415k, cR);
                        } else if (i10 == 6) {
                            B b9 = new B(i11);
                            kVar2.a(b9.a, 0, i11, false);
                            b9.G(4);
                            C c6 = new C(j3.G.w(C1004a.d(b9)));
                            if (c4 != null) {
                                c6 = c4.b(c6);
                            }
                            tVar = new t(tVar2.a, tVar2.f9406b, tVar2.f9407c, tVar2.f9408d, tVar2.f9409e, tVar2.f9411g, tVar2.f9412h, tVar2.f9414j, tVar2.f9415k, c6);
                        } else {
                            kVar2.f(i11);
                        }
                    }
                    tVar2 = tVar;
                }
                int i12 = K.a;
                this.f10432i = tVar2;
                z9 = zH;
                i = 7;
                r15 = 0;
            }
            this.f10432i.getClass();
            this.f10433j = Math.max(this.f10432i.f9407c, 6);
            C2393o c2393oC = this.f10432i.c(bArr, this.f10431h);
            G g4 = this.f10429f;
            C2392n c2392nA = c2393oC.a();
            c2392nA.f18073l = D.m("audio/flac");
            A6.b.r(c2392nA, g4);
            G g7 = this.f10429f;
            this.f10432i.b();
            g7.getClass();
            this.f10430g = 4;
            return 0;
        }
        long j10 = 0;
        if (i9 == 4) {
            ((k) oVar).f9394p = 0;
            B b10 = new B(2);
            k kVar3 = (k) oVar;
            kVar3.h(b10.a, 0, 2, false);
            int iZ = b10.z();
            if ((iZ >> 2) != 16382) {
                kVar3.f9394p = 0;
                throw E.a(null, "First frame does not start with sync code.");
            }
            kVar3.f9394p = 0;
            this.f10434k = iZ;
            S s7 = this.f10428e;
            int i13 = K.a;
            long j11 = kVar3.f9392n;
            this.f10432i.getClass();
            t tVar3 = this.f10432i;
            if (tVar3.f9415k != null) {
                sVar = new s(0, j11, tVar3);
                i7 = 0;
            } else {
                long j12 = kVar3.f9391m;
                if (j12 == -1 || tVar3.f9414j <= 0) {
                    i7 = 0;
                    sVar = new s(tVar3.b());
                } else {
                    int i14 = this.f10434k;
                    C2.G g8 = new C2.G(i8, tVar3);
                    C0660a c0660a = new C0660a(tVar3, i14);
                    long jB = tVar3.b();
                    int i15 = tVar3.f9407c;
                    int i16 = tVar3.f9408d;
                    if (i16 > 0) {
                        i7 = 0;
                        j7 = j11;
                        j8 = ((i16 + i15) / 2) + 1;
                    } else {
                        i7 = 0;
                        j7 = j11;
                        int i17 = tVar3.f9406b;
                        int i18 = tVar3.a;
                        j8 = 64 + (((((i18 != i17 || i18 <= 0) ? 4096L : i18) * tVar3.f9411g) * tVar3.f9412h) / 8);
                    }
                    A a7 = new A(g8, c0660a, jB, tVar3.f9414j, j7, j12, j8, Math.max(6, i15));
                    this.f10435l = a7;
                    sVar = (C0599d) a7.f9381c;
                }
            }
            s7.k(sVar);
            this.f10430g = 5;
            return i7;
        }
        if (i9 != 5) {
            throw new IllegalStateException();
        }
        this.f10429f.getClass();
        this.f10432i.getClass();
        A a8 = this.f10435l;
        if (a8 != null && ((C0600e) a8.f9383e) != null) {
            return a8.u((k) oVar, rVar);
        }
        if (this.f10437n == -1) {
            t tVar4 = this.f10432i;
            ((k) oVar).f9394p = 0;
            k kVar4 = (k) oVar;
            kVar4.b(1, false);
            byte[] bArr4 = new byte[1];
            kVar4.h(bArr4, 0, 1, false);
            boolean z10 = (bArr4[0] & 1) == 1;
            kVar4.b(2, false);
            i = z10 ? 7 : 6;
            B b11 = new B(i);
            byte[] bArr5 = b11.a;
            int i19 = 0;
            while (i19 < i) {
                int iM = kVar4.m(bArr5, i19, i - i19);
                if (iM == -1) {
                    break;
                }
                i19 += iM;
            }
            b11.E(i19);
            kVar4.f9394p = 0;
            try {
                long jA = b11.A();
                if (!z10) {
                    jA *= tVar4.f9406b;
                }
                j10 = jA;
            } catch (NumberFormatException unused) {
                z8 = false;
            }
            if (!z8) {
                throw E.a(null, null);
            }
            this.f10437n = j10;
        } else {
            B b12 = this.f10425b;
            int i20 = b12.f289c;
            if (i20 < 32768) {
                int iO = ((k) oVar).o(b12.a, i20, 32768 - i20);
                z7 = iO == -1;
                if (!z7) {
                    b12.E(i20 + iO);
                } else if (b12.a() == 0) {
                    long j13 = this.f10437n * 1000000;
                    t tVar5 = this.f10432i;
                    int i21 = K.a;
                    this.f10429f.b(j13 / tVar5.f9409e, 1, this.f10436m, 0, null);
                    return -1;
                }
            } else {
                z7 = false;
            }
            int i22 = b12.f288b;
            int i23 = this.f10436m;
            int i24 = this.f10433j;
            if (i23 < i24) {
                b12.G(Math.min(i24 - i23, b12.a()));
            }
            this.f10432i.getClass();
            int i25 = b12.f288b;
            while (true) {
                int i26 = b12.f289c - 16;
                r rVar2 = this.f10427d;
                if (i25 <= i26) {
                    b12.F(i25);
                    if (AbstractC0597b.b(b12, this.f10432i, this.f10434k, rVar2)) {
                        b12.F(i25);
                        j9 = rVar2.a;
                        break;
                    }
                    i25++;
                } else {
                    if (z7) {
                        while (true) {
                            int i27 = b12.f289c;
                            if (i25 > i27 - this.f10433j) {
                                b12.F(i27);
                                break;
                            }
                            b12.F(i25);
                            try {
                                zB = AbstractC0597b.b(b12, this.f10432i, this.f10434k, rVar2);
                            } catch (IndexOutOfBoundsException unused2) {
                                zB = false;
                            }
                            if (b12.f288b > b12.f289c) {
                                zB = false;
                            }
                            if (zB) {
                                b12.F(i25);
                                j9 = rVar2.a;
                                break;
                            }
                            i25++;
                        }
                    } else {
                        b12.F(i25);
                    }
                    j9 = -1;
                }
            }
            int i28 = b12.f288b - i22;
            b12.F(i22);
            this.f10429f.c(b12, i28, 0);
            int i29 = this.f10436m + i28;
            this.f10436m = i29;
            if (j9 != -1) {
                long j14 = this.f10437n * 1000000;
                t tVar6 = this.f10432i;
                int i30 = K.a;
                this.f10429f.b(j14 / tVar6.f9409e, 1, i29, 0, null);
                this.f10436m = 0;
                this.f10437n = j9;
            }
            int length = b12.a.length - b12.f289c;
            if (b12.a() < 16 && length < 16) {
                int iA = b12.a();
                byte[] bArr6 = b12.a;
                System.arraycopy(bArr6, b12.f288b, bArr6, 0, iA);
                b12.F(0);
                b12.E(iA);
            }
        }
        return 0;
    }

    @Override // V1.n
    public final void a() {
    }
}
