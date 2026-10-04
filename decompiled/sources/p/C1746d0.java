package p;

import G2.C0174k;
import H5.C0270k;
import O.C0485c0;
import O.C0486d;
import O.C0493g0;
import m.C1502w;

/* renamed from: p.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1746d0 extends Q4.c {

    /* renamed from: B, reason: collision with root package name */
    public static final C1762n f13979B = new C1762n(0.0f);

    /* renamed from: C, reason: collision with root package name */
    public static final C1762n f13980C = new C1762n(1.0f);

    /* renamed from: A, reason: collision with root package name */
    public final C1732T f13981A;

    /* renamed from: l, reason: collision with root package name */
    public final C0493g0 f13982l;

    /* renamed from: m, reason: collision with root package name */
    public final C0493g0 f13983m;

    /* renamed from: n, reason: collision with root package name */
    public Object f13984n;

    /* renamed from: o, reason: collision with root package name */
    public u0 f13985o;

    /* renamed from: p, reason: collision with root package name */
    public long f13986p;

    /* renamed from: q, reason: collision with root package name */
    public final B.e f13987q;

    /* renamed from: r, reason: collision with root package name */
    public final C0485c0 f13988r;

    /* renamed from: s, reason: collision with root package name */
    public C0270k f13989s;

    /* renamed from: t, reason: collision with root package name */
    public final R5.c f13990t;

    /* renamed from: u, reason: collision with root package name */
    public final C1730Q f13991u;

    /* renamed from: v, reason: collision with root package name */
    public long f13992v;

    /* renamed from: w, reason: collision with root package name */
    public final C1502w f13993w;

    /* renamed from: x, reason: collision with root package name */
    public C1731S f13994x;

    /* renamed from: y, reason: collision with root package name */
    public final C1732T f13995y;

    /* renamed from: z, reason: collision with root package name */
    public float f13996z;

    public C1746d0(C0174k c0174k) {
        super(5);
        O.T t7 = O.T.f7049p;
        this.f13982l = C0486d.K(c0174k, t7);
        this.f13983m = C0486d.K(c0174k, t7);
        this.f13984n = c0174k;
        this.f13987q = new B.e(27, this);
        this.f13988r = C0486d.I(0.0f);
        this.f13990t = new R5.c();
        this.f13991u = new C1730Q();
        this.f13992v = Long.MIN_VALUE;
        this.f13993w = new C1502w();
        this.f13995y = new C1732T(this, 1);
        this.f13981A = new C1732T(this, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void L0(p.C1746d0 r10) {
        /*
            p.u0 r0 = r10.f13985o
            if (r0 != 0) goto L5
            return
        L5:
            p.S r1 = r10.f13994x
            r2 = 0
            if (r1 != 0) goto L5e
            long r3 = r10.f13986p
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L5d
            O.c0 r1 = r10.f13988r
            float r3 = r1.f()
            r4 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L1f
            goto L5d
        L1f:
            O.g0 r3 = r10.f13983m
            java.lang.Object r3 = r3.getValue()
            O.g0 r4 = r10.f13982l
            java.lang.Object r4 = r4.getValue()
            boolean r3 = kotlin.jvm.internal.l.a(r3, r4)
            if (r3 == 0) goto L32
            goto L5d
        L32:
            p.S r3 = new p.S
            r3.<init>()
            float r4 = r1.f()
            r3.f13903d = r4
            long r4 = r10.f13986p
            r3.f13906g = r4
            double r4 = (double) r4
            float r6 = r1.f()
            double r6 = (double) r6
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r8 = r8 - r6
            double r8 = r8 * r4
            long r4 = P3.F.X(r8)
            r3.f13907h = r4
            p.n r4 = r3.f13904e
            float r1 = r1.f()
            r5 = 0
            r4.e(r1, r5)
            r1 = r3
            goto L5e
        L5d:
            r1 = r2
        L5e:
            if (r1 == 0) goto L6c
            long r3 = r10.f13986p
            r1.f13906g = r3
            m.w r3 = r10.f13993w
            r3.a(r1)
            r0.n(r1)
        L6c:
            r10.f13994x = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1746d0.L0(p.d0):void");
    }

    public static final void M0(C1746d0 c1746d0, C1731S c1731s, long j7) {
        c1746d0.getClass();
        long j8 = c1731s.a + j7;
        c1731s.a = j8;
        long j9 = c1731s.f13907h;
        if (j8 >= j9) {
            c1731s.f13903d = 1.0f;
            return;
        }
        F0 f02 = c1731s.f13901b;
        if (f02 == null) {
            float fA = c1731s.f13904e.a(0);
            float f5 = j8 / j9;
            B0 b02 = C0.a;
            c1731s.f13903d = (1.0f * f5) + ((1 - f5) * fA);
            return;
        }
        C1762n c1762n = f13980C;
        C1762n c1762n2 = c1731s.f13905f;
        if (c1762n2 == null) {
            c1762n2 = f13979B;
        }
        c1731s.f13903d = e3.c.j(((C1762n) f02.i(j8, c1731s.f13904e, c1762n, c1762n2)).a(0), 0.0f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N0(p.C1746d0 r10, U3.c r11) throws java.lang.Throwable {
        /*
            r10.getClass()
            boolean r0 = r11 instanceof p.C1735W
            if (r0 == 0) goto L16
            r0 = r11
            p.W r0 = (p.C1735W) r0
            int r1 = r0.f13923n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f13923n = r1
            goto L1b
        L16:
            p.W r0 = new p.W
            r0.<init>(r10, r11)
        L1b:
            java.lang.Object r11 = r0.f13921l
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f13923n
            O3.C r3 = O3.C.a
            r4 = 2
            r5 = 1
            r6 = -9223372036854775808
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            goto L36
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            p.d0 r10 = r0.f13920k
            P3.r.Y(r11)
            goto L78
        L3c:
            P3.r.Y(r11)
            m.w r11 = r10.f13993w
            int r11 = r11.f12934b
            if (r11 != 0) goto L4a
            p.S r11 = r10.f13994x
            if (r11 != 0) goto L4a
            return r3
        L4a:
            S3.h r11 = r0.getContext()
            float r11 = p.AbstractC1745d.n(r11)
            r2 = 0
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 != 0) goto L5d
            r10.R0()
            r10.f13992v = r6
            return r3
        L5d:
            long r8 = r10.f13992v
            int r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r11 != 0) goto L78
            r0.f13920k = r10
            r0.f13923n = r5
            S3.h r11 = r0.getContext()
            O.U r11 = O.C0486d.F(r11)
            p.T r2 = r10.f13995y
            java.lang.Object r11 = r11.P(r2, r0)
            if (r11 != r1) goto L78
            goto L8d
        L78:
            m.w r11 = r10.f13993w
            int r11 = r11.f12934b
            if (r11 == 0) goto L7f
            goto L83
        L7f:
            p.S r11 = r10.f13994x
            if (r11 == 0) goto L8e
        L83:
            r0.f13920k = r10
            r0.f13923n = r4
            java.lang.Object r11 = r10.Q0(r0)
            if (r11 != r1) goto L78
        L8d:
            return r1
        L8e:
            r10.f13992v = r6
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1746d0.N0(p.d0, U3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O0(p.C1746d0 r6, U3.c r7) throws java.lang.Throwable {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof p.C1742b0
            if (r0 == 0) goto L16
            r0 = r7
            p.b0 r0 = (p.C1742b0) r0
            int r1 = r0.f13956o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f13956o = r1
            goto L1b
        L16:
            p.b0 r0 = new p.b0
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f13954m
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f13956o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f13953l
            p.d0 r0 = r0.f13952k
            P3.r.Y(r7)
            goto L80
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            java.lang.Object r6 = r0.f13953l
            p.d0 r2 = r0.f13952k
            P3.r.Y(r7)
            r7 = r6
            r6 = r2
            goto L5b
        L43:
            P3.r.Y(r7)
            O.g0 r7 = r6.f13982l
            java.lang.Object r7 = r7.getValue()
            r0.f13952k = r6
            r0.f13953l = r7
            r0.f13956o = r4
            R5.c r2 = r6.f13990t
            java.lang.Object r2 = r2.c(r0)
            if (r2 != r1) goto L5b
            goto L7b
        L5b:
            r0.f13952k = r6
            r0.f13953l = r7
            r0.f13956o = r3
            H5.k r2 = new H5.k
            S3.c r0 = P3.r.E(r0)
            r2.<init>(r4, r0)
            r2.r()
            r6.f13989s = r2
            r0 = 0
            R5.c r3 = r6.f13990t
            r3.e(r0)
            java.lang.Object r0 = r2.q()
            if (r0 != r1) goto L7c
        L7b:
            return r1
        L7c:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L80:
            boolean r6 = kotlin.jvm.internal.l.a(r7, r6)
            if (r6 == 0) goto L89
            O3.C r6 = O3.C.a
            return r6
        L89:
            r6 = -9223372036854775808
            r0.f13992v = r6
            java.util.concurrent.CancellationException r6 = new java.util.concurrent.CancellationException
            java.lang.String r7 = "targetState while waiting for composition"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1746d0.O0(p.d0, U3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P0(p.C1746d0 r7, U3.c r8) throws java.lang.Throwable {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof p.C1744c0
            if (r0 == 0) goto L16
            r0 = r8
            p.c0 r0 = (p.C1744c0) r0
            int r1 = r0.f13971o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f13971o = r1
            goto L1b
        L16:
            p.c0 r0 = new p.c0
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f13969m
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f13971o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.f13968l
            p.d0 r0 = r0.f13967k
            P3.r.Y(r8)
            goto L89
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.Object r7 = r0.f13968l
            p.d0 r2 = r0.f13967k
            P3.r.Y(r8)
            goto L5b
        L41:
            P3.r.Y(r8)
            O.g0 r8 = r7.f13982l
            java.lang.Object r8 = r8.getValue()
            r0.f13967k = r7
            r0.f13968l = r8
            r0.f13971o = r4
            R5.c r2 = r7.f13990t
            java.lang.Object r2 = r2.c(r0)
            if (r2 != r1) goto L59
            goto L87
        L59:
            r2 = r7
            r7 = r8
        L5b:
            java.lang.Object r8 = r2.f13984n
            boolean r8 = kotlin.jvm.internal.l.a(r7, r8)
            r5 = 0
            R5.c r6 = r2.f13990t
            if (r8 == 0) goto L6a
            r6.e(r5)
            goto L8f
        L6a:
            r0.f13967k = r2
            r0.f13968l = r7
            r0.f13971o = r3
            H5.k r8 = new H5.k
            S3.c r0 = P3.r.E(r0)
            r8.<init>(r4, r0)
            r8.r()
            r2.f13989s = r8
            r6.e(r5)
            java.lang.Object r8 = r8.q()
            if (r8 != r1) goto L88
        L87:
            return r1
        L88:
            r0 = r2
        L89:
            boolean r1 = kotlin.jvm.internal.l.a(r8, r7)
            if (r1 == 0) goto L92
        L8f:
            O3.C r7 = O3.C.a
            return r7
        L92:
            r1 = -9223372036854775808
            r0.f13992v = r1
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "snapTo() was canceled because state was changed to "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = " instead of "
            r1.append(r8)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1746d0.P0(p.d0, U3.c):java.lang.Object");
    }

    @Override // Q4.c
    public final void H0(Object obj) {
        this.f13983m.setValue(obj);
    }

    @Override // Q4.c
    public final void I0(u0 u0Var) {
        u0 u0Var2 = this.f13985o;
        if (u0Var2 == null || kotlin.jvm.internal.l.a(u0Var, u0Var2)) {
            this.f13985o = u0Var;
            return;
        }
        throw new IllegalStateException("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f13985o + ", new instance: " + u0Var);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O3.i, java.lang.Object] */
    @Override // Q4.c
    public final void J0() {
        this.f13985o = null;
        ((Y.u) z0.a.getValue()).c(this);
    }

    public final Object Q0(U3.c cVar) {
        float fN = AbstractC1745d.n(cVar.getContext());
        O3.C c2 = O3.C.a;
        if (fN <= 0.0f) {
            R0();
            return c2;
        }
        this.f13996z = fN;
        Object objP = C0486d.F(cVar.getContext()).P(this.f13981A, cVar);
        return objP == T3.a.f9048k ? objP : c2;
    }

    public final void R0() {
        u0 u0Var = this.f13985o;
        if (u0Var != null) {
            u0Var.c();
        }
        C1502w c1502w = this.f13993w;
        P3.m.c0(c1502w.a, 0, c1502w.f12934b);
        c1502w.f12934b = 0;
        if (this.f13994x != null) {
            this.f13994x = null;
            U0(1.0f);
            T0();
        }
    }

    public final Object S0(float f5, Object obj, U3.j jVar) {
        if (0.0f > f5 || f5 > 1.0f) {
            throw new IllegalArgumentException("Expecting fraction between 0 and 1. Got " + f5);
        }
        u0 u0Var = this.f13985o;
        O3.C c2 = O3.C.a;
        if (u0Var != null) {
            Object objA = C1730Q.a(this.f13991u, new C1738Z(obj, this.f13982l.getValue(), this, u0Var, f5, null), jVar);
            if (objA == T3.a.f9048k) {
                return objA;
            }
        }
        return c2;
    }

    public final void T0() {
        u0 u0Var = this.f13985o;
        if (u0Var == null) {
            return;
        }
        u0Var.m(P3.F.X(this.f13988r.f() * ((Number) u0Var.f14144l.getValue()).longValue()));
    }

    public final void U0(float f5) {
        this.f13988r.g(f5);
    }

    @Override // Q4.c
    public final Object v0() {
        return this.f13983m.getValue();
    }

    @Override // Q4.c
    public final Object w0() {
        return this.f13982l.getValue();
    }
}
