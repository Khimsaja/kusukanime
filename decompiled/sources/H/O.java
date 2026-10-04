package H;

import D.AbstractC0047d0;
import D.N0;
import H0.C0214f;
import N0.C0476a;
import e5.AbstractC0832b;
import java.util.List;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final class O {
    public final C0214f a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2903b;

    /* renamed from: c, reason: collision with root package name */
    public final H0.F f2904c;

    /* renamed from: d, reason: collision with root package name */
    public final N0.q f2905d;

    /* renamed from: e, reason: collision with root package name */
    public final Z f2906e;

    /* renamed from: f, reason: collision with root package name */
    public long f2907f;

    /* renamed from: g, reason: collision with root package name */
    public final C0214f f2908g;

    /* renamed from: h, reason: collision with root package name */
    public final N0.w f2909h;

    /* renamed from: i, reason: collision with root package name */
    public final N0 f2910i;

    public O(N0.w wVar, N0.q qVar, N0 n02, Z z7) {
        C0214f c0214f = wVar.a;
        H0.F f5 = n02 != null ? n02.a : null;
        long j7 = wVar.f6896b;
        this.a = c0214f;
        this.f2903b = j7;
        this.f2904c = f5;
        this.f2905d = qVar;
        this.f2906e = z7;
        this.f2907f = j7;
        this.f2908g = c0214f;
        this.f2909h = wVar;
        this.f2910i = n02;
    }

    public final List a(e4.k kVar) {
        if (!H0.H.b(this.f2907f)) {
            return P3.r.I(new C0476a("", 0), new N0.v(H0.H.e(this.f2907f), H0.H.e(this.f2907f)));
        }
        N0.i iVar = (N0.i) kVar.invoke(this);
        if (iVar != null) {
            return P3.r.H(iVar);
        }
        return null;
    }

    public final Integer b() {
        H0.F f5 = this.f2904c;
        if (f5 == null) {
            return null;
        }
        int iD = H0.H.d(this.f2907f);
        N0.q qVar = this.f2905d;
        return Integer.valueOf(qVar.a(f5.d(f5.e(qVar.b(iD)), true)));
    }

    public final Integer c() {
        int length;
        H0.F f5 = this.f2904c;
        if (f5 == null) {
            return null;
        }
        int iP = p();
        while (true) {
            C0214f c0214f = this.a;
            if (iP < c0214f.a.length()) {
                int length2 = this.f2908g.a.length() - 1;
                if (iP <= length2) {
                    length2 = iP;
                }
                long jK = f5.k(length2);
                int i7 = H0.H.f3092c;
                int i8 = (int) (jK & 4294967295L);
                if (i8 > iP) {
                    length = this.f2905d.a(i8);
                    break;
                }
                iP++;
            } else {
                length = c0214f.a.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer d() {
        int iA;
        H0.F f5 = this.f2904c;
        if (f5 == null) {
            return null;
        }
        int iP = p();
        while (true) {
            if (iP <= 0) {
                iA = 0;
                break;
            }
            int length = this.f2908g.a.length() - 1;
            if (iP <= length) {
                length = iP;
            }
            long jK = f5.k(length);
            int i7 = H0.H.f3092c;
            int i8 = (int) (jK >> 32);
            if (i8 < iP) {
                iA = this.f2905d.a(i8);
                break;
            }
            iP--;
        }
        return Integer.valueOf(iA);
    }

    public final boolean e() {
        H0.F f5 = this.f2904c;
        return (f5 != null ? f5.i(p()) : null) != S0.h.f8713l;
    }

    public final int f(H0.F f5, int i7) {
        int iP = p();
        Z z7 = this.f2906e;
        if (z7.a == null) {
            z7.a = Float.valueOf(f5.c(iP).a);
        }
        int iE = f5.e(iP) + i7;
        if (iE < 0) {
            return 0;
        }
        H0.n nVar = f5.f3083b;
        if (iE >= nVar.f3132f) {
            return this.f2908g.a.length();
        }
        float fB = nVar.b(iE) - 1;
        Float f7 = z7.a;
        kotlin.jvm.internal.l.c(f7);
        float fFloatValue = f7.floatValue();
        if ((e() && fFloatValue >= f5.g(iE)) || (!e() && fFloatValue <= f5.f(iE))) {
            return f5.d(iE, true);
        }
        return this.f2905d.a(nVar.e(AbstractC0832b.e(f7.floatValue(), fB)));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(D.N0 r6, int r7) {
        /*
            r5 = this;
            w0.r r0 = r6.f1080b
            if (r0 == 0) goto L11
            w0.r r1 = r6.f1081c
            if (r1 == 0) goto Le
            r2 = 1
            g0.d r0 = r1.K(r0, r2)
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L13
        L11:
            g0.d r0 = g0.d.f11658e
        L13:
            N0.w r1 = r5.f2909h
            long r1 = r1.f6896b
            int r3 = H0.H.f3092c
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            N0.q r2 = r5.f2905d
            int r1 = r2.b(r1)
            H0.F r6 = r6.a
            g0.d r1 = r6.c(r1)
            float r3 = r0.c()
            float r0 = r0.b()
            long r3 = f1.AbstractC0870c.F(r3, r0)
            float r0 = g0.f.b(r3)
            float r7 = (float) r7
            float r0 = r0 * r7
            float r7 = r1.f11659b
            float r0 = r0 + r7
            float r7 = r1.a
            long r0 = e5.AbstractC0832b.e(r7, r0)
            H0.n r6 = r6.f3083b
            int r6 = r6.e(r0)
            int r6 = r2.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: H.O.g(D.N0, int):int");
    }

    public final void h() {
        C0214f c0214f = this.f2908g;
        Z z7 = this.f2906e;
        z7.a = null;
        if (c0214f.a.length() > 0) {
            if (e()) {
                z7.a = null;
                if (c0214f.a.length() > 0) {
                    String str = c0214f.a;
                    long j7 = this.f2907f;
                    int i7 = H0.H.f3092c;
                    int iP = AbstractC0047d0.p((int) (j7 & 4294967295L), str);
                    if (iP != -1) {
                        o(iP, iP);
                        return;
                    }
                    return;
                }
                return;
            }
            z7.a = null;
            if (c0214f.a.length() > 0) {
                String str2 = c0214f.a;
                long j8 = this.f2907f;
                int i8 = H0.H.f3092c;
                int iM = AbstractC0047d0.m((int) (j8 & 4294967295L), str2);
                if (iM != -1) {
                    o(iM, iM);
                }
            }
        }
    }

    public final void i() {
        this.f2906e.a = null;
        C0214f c0214f = this.f2908g;
        if (c0214f.a.length() > 0) {
            int iD = H0.H.d(this.f2907f);
            String str = c0214f.a;
            int iN = AbstractC0047d0.n(str, iD);
            if (iN == H0.H.d(this.f2907f) && iN != str.length()) {
                iN = AbstractC0047d0.n(str, iN + 1);
            }
            o(iN, iN);
        }
    }

    public final void j() {
        this.f2906e.a = null;
        C0214f c0214f = this.f2908g;
        if (c0214f.a.length() > 0) {
            int iE = H0.H.e(this.f2907f);
            String str = c0214f.a;
            int iO = AbstractC0047d0.o(str, iE);
            if (iO == H0.H.e(this.f2907f) && iO != 0) {
                iO = AbstractC0047d0.o(str, iO - 1);
            }
            o(iO, iO);
        }
    }

    public final void k() {
        C0214f c0214f = this.f2908g;
        Z z7 = this.f2906e;
        z7.a = null;
        if (c0214f.a.length() > 0) {
            if (e()) {
                z7.a = null;
                if (c0214f.a.length() > 0) {
                    String str = c0214f.a;
                    long j7 = this.f2907f;
                    int i7 = H0.H.f3092c;
                    int iM = AbstractC0047d0.m((int) (j7 & 4294967295L), str);
                    if (iM != -1) {
                        o(iM, iM);
                        return;
                    }
                    return;
                }
                return;
            }
            z7.a = null;
            if (c0214f.a.length() > 0) {
                String str2 = c0214f.a;
                long j8 = this.f2907f;
                int i8 = H0.H.f3092c;
                int iP = AbstractC0047d0.p((int) (j8 & 4294967295L), str2);
                if (iP != -1) {
                    o(iP, iP);
                }
            }
        }
    }

    public final void l() {
        Integer numB;
        this.f2906e.a = null;
        if (this.f2908g.a.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        o(iIntValue, iIntValue);
    }

    public final void m() {
        Integer numValueOf = null;
        this.f2906e.a = null;
        if (this.f2908g.a.length() > 0) {
            H0.F f5 = this.f2904c;
            if (f5 != null) {
                int iE = H0.H.e(this.f2907f);
                N0.q qVar = this.f2905d;
                numValueOf = Integer.valueOf(qVar.a(f5.h(f5.e(qVar.b(iE)))));
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                o(iIntValue, iIntValue);
            }
        }
    }

    public final void n() {
        if (this.f2908g.a.length() > 0) {
            int i7 = H0.H.f3092c;
            this.f2907f = AbstractC1420H.c((int) (this.f2903b >> 32), (int) (this.f2907f & 4294967295L));
        }
    }

    public final void o(int i7, int i8) {
        this.f2907f = AbstractC1420H.c(i7, i8);
    }

    public final int p() {
        long j7 = this.f2907f;
        int i7 = H0.H.f3092c;
        return this.f2905d.b((int) (j7 & 4294967295L));
    }
}
