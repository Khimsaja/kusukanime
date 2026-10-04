package y0;

import h0.AbstractC0968M;
import h0.C0998u;
import h0.InterfaceC0995r;
import k0.C1375b;
import w0.C2196n;
import w0.InterfaceC2173H;
import z0.C2471u;

/* renamed from: y0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2372t extends Y {

    /* renamed from: V, reason: collision with root package name */
    public static final H1.e0 f17893V;

    /* renamed from: T, reason: collision with root package name */
    public final m0 f17894T;

    /* renamed from: U, reason: collision with root package name */
    public C2371s f17895U;

    static {
        H1.e0 e0VarG = AbstractC0968M.g();
        int i7 = C0998u.f11835h;
        e0VarG.f(C0998u.f11831d);
        e0VarG.l(1.0f);
        e0VarG.m(1);
        f17893V = e0VarG;
    }

    public C2372t(C2349D c2349d) {
        super(c2349d);
        m0 m0Var = new m0();
        m0Var.f10405n = 0;
        this.f17894T = m0Var;
        m0Var.f10409r = this;
        this.f17895U = c2349d.f17673m != null ? new C2371s(this) : null;
    }

    @Override // y0.Y
    public final void K0() {
        if (this.f17895U == null) {
            this.f17895U = new C2371s(this);
        }
    }

    @Override // y0.Y
    public final O N0() {
        return this.f17895U;
    }

    @Override // y0.Y
    public final a0.p P0() {
        return this.f17894T;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9 A[PHI: r9
      0x00b9: PHI (r9v3 y0.r) = (r9v2 y0.r), (r9v4 y0.r), (r9v4 y0.r), (r9v4 y0.r) binds: [B:37:0x006f, B:43:0x00a5, B:45:0x00ae, B:48:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be A[LOOP:0: B:36:0x0067->B:52:0x00be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c1 A[SYNTHETIC] */
    @Override // y0.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U0(y0.C2357d r17, long r18, y0.r r20, boolean r21, boolean r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r9 = r20
            r2 = 0
            r12 = 1
            y0.D r5 = r0.f17825v
            int r6 = r1.f17838k
            switch(r6) {
                case 1: goto L20;
                default: goto L11;
            }
        L11:
            F0.i r6 = r5.o()
            if (r6 == 0) goto L1d
            boolean r6 = r6.f2098m
            if (r6 != r12) goto L1d
            r6 = r12
            goto L1e
        L1d:
            r6 = r2
        L1e:
            r6 = r6 ^ r12
            goto L21
        L20:
            r6 = r12
        L21:
            if (r6 == 0) goto L55
            boolean r6 = e5.AbstractC0832b.w(r3)
            if (r6 != 0) goto L2a
            goto L39
        L2a:
            y0.d0 r6 = r0.f17824N
            if (r6 == 0) goto L52
            boolean r7 = r0.f17829z
            if (r7 == 0) goto L52
            boolean r6 = r6.k(r3)
            if (r6 == 0) goto L39
            goto L52
        L39:
            if (r21 == 0) goto L55
            long r6 = r0.O0()
            float r6 = r0.G0(r3, r6)
            boolean r7 = java.lang.Float.isInfinite(r6)
            if (r7 != 0) goto L55
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L55
            r11 = r2
        L50:
            r2 = r12
            goto L57
        L52:
            r11 = r22
            goto L50
        L55:
            r11 = r22
        L57:
            if (r2 == 0) goto Lc3
            int r13 = r9.f17890m
            Q.d r2 = r5.u()
            int r5 = r2.f7829m
            if (r5 <= 0) goto Lc1
            int r5 = r5 - r12
            java.lang.Object[] r14 = r2.f7827k
            r15 = r5
        L67:
            r2 = r14[r15]
            y0.D r2 = (y0.C2349D) r2
            boolean r5 = r2.F()
            if (r5 == 0) goto Lb9
            int r5 = r1.f17838k
            switch(r5) {
                case 1: goto L8e;
                default: goto L76;
            }
        L76:
            O.t r2 = r2.f17660G
            java.lang.Object r5 = r2.f7174d
            y0.Y r5 = (y0.Y) r5
            long r7 = r5.M0(r3)
            java.lang.Object r2 = r2.f7174d
            r5 = r2
            y0.Y r5 = (y0.Y) r5
            y0.d r6 = y0.Y.f17812S
            r10 = 1
            r5.T0(r6, r7, r9, r10, r11)
            r9 = r20
            goto L95
        L8e:
            r6 = r21
            r5 = r9
            r7 = r11
            r2.w(r3, r5, r6, r7)
        L95:
            long r2 = r9.a()
            r4 = 32
            long r4 = r2 >> r4
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto Lb9
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r2 = (int) r2
            if (r2 == 0) goto Lb9
            boolean r2 = r9.f17892o
            if (r2 == 0) goto Lc1
            int r2 = r9.f17891n
            int r2 = r2 - r12
            r9.f17890m = r2
        Lb9:
            int r15 = r15 + (-1)
            if (r15 >= 0) goto Lbe
            goto Lc1
        Lbe:
            r3 = r18
            goto L67
        Lc1:
            r9.f17890m = r13
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.C2372t.U0(y0.d, long, y0.r, boolean, boolean):void");
    }

    @Override // w0.InterfaceC2172G
    public final int W(int i7) {
        n5.P pR = this.f17825v.r();
        InterfaceC2173H interfaceC2173HL = pR.l();
        C2349D c2349d = (C2349D) pR.f13378l;
        return interfaceC2173HL.d((Y) c2349d.f17660G.f7174d, c2349d.m(), i7);
    }

    @Override // w0.InterfaceC2172G
    public final int Y(int i7) {
        n5.P pR = this.f17825v.r();
        InterfaceC2173H interfaceC2173HL = pR.l();
        C2349D c2349d = (C2349D) pR.f13378l;
        return interfaceC2173HL.c((Y) c2349d.f17660G.f7174d, c2349d.m(), i7);
    }

    @Override // w0.InterfaceC2172G
    public final w0.S b(long j7) {
        m0(j7);
        C2349D c2349d = this.f17825v;
        Q.d dVarV = c2349d.v();
        int i7 = dVarV.f7829m;
        if (i7 > 0) {
            Object[] objArr = dVarV.f7827k;
            int i8 = 0;
            do {
                ((C2349D) objArr[i8]).f17661H.f17761r.f17739u = 3;
                i8++;
            } while (i8 < i7);
        }
        e1(c2349d.f17686z.b(this, c2349d.m(), j7));
        Z0();
        return this;
    }

    @Override // w0.InterfaceC2172G
    public final int b0(int i7) {
        n5.P pR = this.f17825v.r();
        InterfaceC2173H interfaceC2173HL = pR.l();
        C2349D c2349d = (C2349D) pR.f13378l;
        return interfaceC2173HL.e((Y) c2349d.f17660G.f7174d, c2349d.m(), i7);
    }

    @Override // y0.Y
    public final void b1(InterfaceC0995r interfaceC0995r, C1375b c1375b) {
        C2349D c2349d = this.f17825v;
        e0 e0VarA = AbstractC2352G.a(c2349d);
        Q.d dVarU = c2349d.u();
        int i7 = dVarU.f7829m;
        if (i7 > 0) {
            Object[] objArr = dVarU.f7827k;
            int i8 = 0;
            do {
                C2349D c2349d2 = (C2349D) objArr[i8];
                if (c2349d2.F()) {
                    c2349d2.j(interfaceC0995r, c1375b);
                }
                i8++;
            } while (i8 < i7);
        }
        if (((C2471u) e0VarA).getShowLayoutBounds()) {
            I0(interfaceC0995r, f17893V);
        }
    }

    @Override // w0.InterfaceC2172G
    public final int c(int i7) {
        n5.P pR = this.f17825v.r();
        InterfaceC2173H interfaceC2173HL = pR.l();
        C2349D c2349d = (C2349D) pR.f13378l;
        return interfaceC2173HL.a((Y) c2349d.f17660G.f7174d, c2349d.m(), i7);
    }

    @Override // w0.S
    public final void j0(long j7, float f5, e4.k kVar) {
        c1(j7, f5, kVar);
        if (this.f17771q) {
            return;
        }
        a1();
        this.f17825v.f17661H.f17761r.x0();
    }

    @Override // y0.N
    public final int n0(C2196n c2196n) {
        C2371s c2371s = this.f17895U;
        if (c2371s != null) {
            return c2371s.n0(c2196n);
        }
        J j7 = this.f17825v.f17661H.f17761r;
        boolean z7 = j7.f17740v;
        C2350E c2350e = j7.f17723D;
        if (!z7) {
            K k7 = j7.f17733P;
            if (k7.f17746c == 1) {
                c2350e.f17691f = true;
                if (c2350e.f17687b) {
                    k7.f17748e = true;
                    k7.f17749f = true;
                }
            } else {
                c2350e.f17692g = true;
            }
        }
        j7.j().f17772r = true;
        j7.p();
        j7.j().f17772r = false;
        Integer num = (Integer) c2350e.f17694i.get(c2196n);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
