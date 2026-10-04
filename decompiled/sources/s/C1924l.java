package s;

import e5.AbstractC0832b;
import l4.AbstractC1420H;
import y0.AbstractC2359f;
import y0.InterfaceC2365l;
import y0.InterfaceC2374v;

/* renamed from: s.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1924l extends a0.p implements InterfaceC2374v, InterfaceC2365l {

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC1910e f15328A;

    /* renamed from: C, reason: collision with root package name */
    public w0.r f15330C;

    /* renamed from: D, reason: collision with root package name */
    public g0.d f15331D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f15332E;

    /* renamed from: G, reason: collision with root package name */
    public boolean f15334G;

    /* renamed from: x, reason: collision with root package name */
    public EnumC1903a0 f15335x;

    /* renamed from: y, reason: collision with root package name */
    public final D0 f15336y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f15337z;

    /* renamed from: B, reason: collision with root package name */
    public final C1904b f15329B = new C1904b(0);

    /* renamed from: F, reason: collision with root package name */
    public long f15333F = 0;

    public C1924l(EnumC1903a0 enumC1903a0, D0 d02, boolean z7, InterfaceC1910e interfaceC1910e) {
        this.f15335x = enumC1903a0;
        this.f15336y = d02;
        this.f15337z = z7;
        this.f15328A = interfaceC1910e;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0071 A[EDGE_INSN: B:43:0x0071->B:25:0x0071 BREAK  A[LOOP:0: B:8:0x001a->B:45:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[LOOP:0: B:8:0x001a->B:45:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float G0(s.C1924l r11, s.InterfaceC1910e r12) {
        /*
            long r0 = r11.f15333F
            r2 = 0
            boolean r0 = T0.j.a(r0, r2)
            if (r0 == 0) goto Lc
            goto L7d
        Lc:
            s.b r0 = r11.f15329B
            Q.d r0 = r0.a
            int r1 = r0.f7829m
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L70
            int r1 = r1 - r2
            java.lang.Object[] r0 = r0.f7827k
            r4 = r3
        L1a:
            r5 = r0[r1]
            s.i r5 = (s.C1918i) r5
            A.f r5 = r5.a
            java.lang.Object r5 = r5.invoke()
            g0.d r5 = (g0.d) r5
            if (r5 == 0) goto L6b
            float r6 = r5.c()
            float r7 = r5.b()
            long r6 = f1.AbstractC0870c.F(r6, r7)
            long r8 = r11.f15333F
            long r8 = l4.AbstractC1420H.O(r8)
            s.a0 r10 = r11.f15335x
            int r10 = r10.ordinal()
            if (r10 == 0) goto L57
            if (r10 != r2) goto L51
            float r6 = g0.f.d(r6)
            float r7 = g0.f.d(r8)
            int r6 = java.lang.Float.compare(r6, r7)
            goto L63
        L51:
            D6.r r11 = new D6.r
            r11.<init>()
            throw r11
        L57:
            float r6 = g0.f.b(r6)
            float r7 = g0.f.b(r8)
            int r6 = java.lang.Float.compare(r6, r7)
        L63:
            if (r6 > 0) goto L67
            r4 = r5
            goto L6b
        L67:
            if (r4 != 0) goto L71
            r4 = r5
            goto L71
        L6b:
            int r1 = r1 + (-1)
            if (r1 >= 0) goto L1a
            goto L71
        L70:
            r4 = r3
        L71:
            if (r4 != 0) goto L80
            boolean r0 = r11.f15332E
            if (r0 == 0) goto L7b
            g0.d r3 = r11.H0()
        L7b:
            if (r3 != 0) goto L7f
        L7d:
            r11 = 0
            return r11
        L7f:
            r4 = r3
        L80:
            long r0 = r11.f15333F
            long r0 = l4.AbstractC1420H.O(r0)
            s.a0 r11 = r11.f15335x
            int r11 = r11.ordinal()
            if (r11 == 0) goto La4
            if (r11 != r2) goto L9e
            float r11 = r4.f11660c
            float r2 = r4.a
            float r11 = r11 - r2
            float r0 = g0.f.d(r0)
            float r11 = r12.a(r2, r11, r0)
            return r11
        L9e:
            D6.r r11 = new D6.r
            r11.<init>()
            throw r11
        La4:
            float r11 = r4.f11661d
            float r2 = r4.f11659b
            float r11 = r11 - r2
            float r0 = g0.f.b(r0)
            float r11 = r12.a(r2, r11, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C1924l.G0(s.l, s.e):float");
    }

    public final g0.d H0() {
        if (this.f10414w) {
            y0.Y yU = AbstractC2359f.u(this);
            w0.r rVar = this.f15330C;
            if (rVar != null) {
                if (!rVar.B()) {
                    rVar = null;
                }
                if (rVar != null) {
                    return yU.K(rVar, false);
                }
            }
        }
        return null;
    }

    public final boolean I0(g0.d dVar, long j7) {
        long jK0 = K0(dVar, j7);
        return Math.abs(g0.c.d(jK0)) <= 0.5f && Math.abs(g0.c.e(jK0)) <= 0.5f;
    }

    public final void J0() {
        InterfaceC1910e interfaceC1910e = this.f15328A;
        if (interfaceC1910e == null) {
            interfaceC1910e = (InterfaceC1910e) AbstractC2359f.i(this, AbstractC1916h.a);
        }
        if (this.f15334G) {
            throw new IllegalStateException("launchAnimation called when previous animation was running");
        }
        e1 e1Var = new e1(interfaceC1910e.b());
        H5.A aU0 = u0();
        H5.B b4 = H5.B.f3790k;
        H5.D.x(aU0, null, new C1922k(this, e1Var, interfaceC1910e, null), 1);
    }

    public final long K0(g0.d dVar, long j7) {
        long jO = AbstractC1420H.O(j7);
        int iOrdinal = this.f15335x.ordinal();
        if (iOrdinal == 0) {
            InterfaceC1910e interfaceC1910e = this.f15328A;
            if (interfaceC1910e == null) {
                interfaceC1910e = (InterfaceC1910e) AbstractC2359f.i(this, AbstractC1916h.a);
            }
            float f5 = dVar.f11661d;
            float f7 = dVar.f11659b;
            return AbstractC0832b.e(0.0f, interfaceC1910e.a(f7, f5 - f7, g0.f.b(jO)));
        }
        if (iOrdinal != 1) {
            throw new D6.r();
        }
        InterfaceC1910e interfaceC1910e2 = this.f15328A;
        if (interfaceC1910e2 == null) {
            interfaceC1910e2 = (InterfaceC1910e) AbstractC2359f.i(this, AbstractC1916h.a);
        }
        float f8 = dVar.f11660c;
        float f9 = dVar.a;
        return AbstractC0832b.e(interfaceC1910e2.a(f9, f8 - f9, g0.f.d(jO)), 0.0f);
    }

    @Override // y0.InterfaceC2374v
    public final void r(long j7) {
        int iG;
        g0.d dVarH0;
        long j8 = this.f15333F;
        this.f15333F = j7;
        int iOrdinal = this.f15335x.ordinal();
        if (iOrdinal == 0) {
            iG = kotlin.jvm.internal.l.g((int) (j7 & 4294967295L), (int) (4294967295L & j8));
        } else {
            if (iOrdinal != 1) {
                throw new D6.r();
            }
            iG = kotlin.jvm.internal.l.g((int) (j7 >> 32), (int) (j8 >> 32));
        }
        if (iG < 0 && (dVarH0 = H0()) != null) {
            g0.d dVar = this.f15331D;
            if (dVar == null) {
                dVar = dVarH0;
            }
            if (!this.f15334G && !this.f15332E && I0(dVar, j8) && !I0(dVarH0, j7)) {
                this.f15332E = true;
                J0();
            }
            this.f15331D = dVarH0;
        }
    }

    @Override // a0.p
    public final boolean v0() {
        return false;
    }
}
