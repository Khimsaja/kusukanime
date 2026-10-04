package s;

import s0.C1955C;
import s0.C1963h;
import s0.EnumC1964i;
import u.C2062a;
import u.C2063b;
import y0.AbstractC2367n;
import y0.InterfaceC2365l;

/* loaded from: classes.dex */
public abstract class P extends AbstractC2367n implements y0.j0, InterfaceC2365l {

    /* renamed from: A, reason: collision with root package name */
    public kotlin.jvm.internal.m f15192A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f15193B;

    /* renamed from: C, reason: collision with root package name */
    public u.k f15194C;

    /* renamed from: D, reason: collision with root package name */
    public J5.e f15195D;

    /* renamed from: E, reason: collision with root package name */
    public C2063b f15196E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f15197F;

    /* renamed from: G, reason: collision with root package name */
    public C1955C f15198G;

    /* renamed from: z, reason: collision with root package name */
    public EnumC1903a0 f15199z;

    /* JADX WARN: Multi-variable type inference failed */
    public P(e4.k kVar, boolean z7, u.k kVar2, EnumC1903a0 enumC1903a0) {
        this.f15199z = enumC1903a0;
        this.f15192A = (kotlin.jvm.internal.m) kVar;
        this.f15193B = z7;
        this.f15194C = kVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J0(s.P r5, U3.c r6) throws java.lang.Throwable {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof s.K
            if (r0 == 0) goto L16
            r0 = r6
            s.K r0 = (s.K) r0
            int r1 = r0.f15154n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f15154n = r1
            goto L1b
        L16:
            s.K r0 = new s.K
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f15152l
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f15154n
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            s.P r5 = r0.f15151k
            P3.r.Y(r6)
            goto L4f
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            P3.r.Y(r6)
            u.b r6 = r5.f15196E
            if (r6 == 0) goto L52
            u.k r2 = r5.f15194C
            if (r2 == 0) goto L4f
            u.a r4 = new u.a
            r4.<init>(r6)
            r0.f15151k = r5
            r0.f15154n = r3
            java.lang.Object r6 = r2.b(r4, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r6 = 0
            r5.f15196E = r6
        L52:
            r0 = 0
            r5.P0(r0)
            O3.C r5 = O3.C.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s.P.J0(s.P, U3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K0(s.P r6, s.C1941u r7, U3.c r8) throws java.lang.Throwable {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof s.L
            if (r0 == 0) goto L16
            r0 = r8
            s.L r0 = (s.L) r0
            int r1 = r0.f15161p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f15161p = r1
            goto L1b
        L16:
            s.L r0 = new s.L
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.f15159n
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f15161p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            u.b r6 = r0.f15158m
            s.u r7 = r0.f15157l
            s.P r0 = r0.f15156k
            P3.r.Y(r8)
            goto L7a
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            s.u r7 = r0.f15157l
            s.P r6 = r0.f15156k
            P3.r.Y(r8)
            goto L60
        L43:
            P3.r.Y(r8)
            u.b r8 = r6.f15196E
            if (r8 == 0) goto L60
            u.k r2 = r6.f15194C
            if (r2 == 0) goto L60
            u.a r5 = new u.a
            r5.<init>(r8)
            r0.f15156k = r6
            r0.f15157l = r7
            r0.f15161p = r4
            java.lang.Object r8 = r2.b(r5, r0)
            if (r8 != r1) goto L60
            goto L77
        L60:
            u.b r8 = new u.b
            r8.<init>()
            u.k r2 = r6.f15194C
            if (r2 == 0) goto L7c
            r0.f15156k = r6
            r0.f15157l = r7
            r0.f15158m = r8
            r0.f15161p = r3
            java.lang.Object r0 = r2.b(r8, r0)
            if (r0 != r1) goto L78
        L77:
            return r1
        L78:
            r0 = r6
            r6 = r8
        L7a:
            r8 = r6
            r6 = r0
        L7c:
            r6.f15196E = r8
            long r7 = r7.a
            r6.O0(r7)
            O3.C r6 = O3.C.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s.P.K0(s.P, s.u, U3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L0(s.P r5, s.C1943v r6, U3.c r7) throws java.lang.Throwable {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof s.M
            if (r0 == 0) goto L16
            r0 = r7
            s.M r0 = (s.M) r0
            int r1 = r0.f15172o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f15172o = r1
            goto L1b
        L16:
            s.M r0 = new s.M
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f15170m
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f15172o
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            s.v r6 = r0.f15169l
            s.P r5 = r0.f15168k
            P3.r.Y(r7)
            goto L53
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            P3.r.Y(r7)
            u.b r7 = r5.f15196E
            if (r7 == 0) goto L56
            u.k r2 = r5.f15194C
            if (r2 == 0) goto L53
            u.c r4 = new u.c
            r4.<init>(r7)
            r0.f15168k = r5
            r0.f15169l = r6
            r0.f15172o = r3
            java.lang.Object r7 = r2.b(r4, r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            r7 = 0
            r5.f15196E = r7
        L56:
            long r6 = r6.a
            r5.P0(r6)
            O3.C r5 = O3.C.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s.P.L0(s.P, s.v, U3.c):java.lang.Object");
    }

    public final void M0() {
        C2063b c2063b = this.f15196E;
        if (c2063b != null) {
            u.k kVar = this.f15194C;
            if (kVar != null) {
                kVar.c(new C2062a(c2063b));
            }
            this.f15196E = null;
        }
    }

    public abstract Object N0(N n7, O o7);

    public abstract void O0(long j7);

    public abstract void P0(long j7);

    public abstract boolean Q0();

    /* JADX WARN: Multi-variable type inference failed */
    public final void R0(e4.k kVar, boolean z7, u.k kVar2, EnumC1903a0 enumC1903a0, boolean z8) {
        C1955C c1955c;
        this.f15192A = (kotlin.jvm.internal.m) kVar;
        boolean z9 = true;
        if (this.f15193B != z7) {
            this.f15193B = z7;
            if (!z7) {
                M0();
                C1955C c1955c2 = this.f15198G;
                if (c1955c2 != null) {
                    H0(c1955c2);
                }
                this.f15198G = null;
            }
            z8 = true;
        }
        if (!kotlin.jvm.internal.l.a(this.f15194C, kVar2)) {
            M0();
            this.f15194C = kVar2;
        }
        if (this.f15199z != enumC1903a0) {
            this.f15199z = enumC1903a0;
        } else {
            z9 = z8;
        }
        if (!z9 || (c1955c = this.f15198G) == null) {
            return;
        }
        c1955c.I0();
    }

    @Override // y0.j0
    public void W(C1963h c1963h, EnumC1964i enumC1964i, long j7) {
        if (this.f15193B && this.f15198G == null) {
            J j8 = new J(this, null);
            C1963h c1963h2 = s0.w.a;
            C1955C c1955c = new C1955C(null, null, j8);
            G0(c1955c);
            this.f15198G = c1955c;
        }
        C1955C c1955c2 = this.f15198G;
        if (c1955c2 != null) {
            c1955c2.W(c1963h, enumC1964i, j7);
        }
    }

    @Override // y0.j0
    public final void f0() {
        C1955C c1955c = this.f15198G;
        if (c1955c != null) {
            c1955c.f0();
        }
    }

    @Override // a0.p
    public final void z0() {
        this.f15197F = false;
        M0();
    }
}
