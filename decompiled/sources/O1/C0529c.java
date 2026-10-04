package O1;

import H1.m0;
import y1.C2393o;

/* renamed from: O1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0529c implements InterfaceC0551z, InterfaceC0550y {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0551z f7413k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0550y f7414l;

    /* renamed from: m, reason: collision with root package name */
    public C0528b[] f7415m = new C0528b[0];

    /* renamed from: n, reason: collision with root package name */
    public long f7416n;

    /* renamed from: o, reason: collision with root package name */
    public long f7417o;

    /* renamed from: p, reason: collision with root package name */
    public long f7418p;

    /* renamed from: q, reason: collision with root package name */
    public C0532f f7419q;

    public C0529c(InterfaceC0551z interfaceC0551z, boolean z7, long j7, long j8) {
        this.f7413k = interfaceC0551z;
        this.f7416n = z7 ? j7 : -9223372036854775807L;
        this.f7417o = j7;
        this.f7418p = j8;
    }

    @Override // O1.b0
    public final boolean a() {
        return this.f7413k.a();
    }

    @Override // O1.InterfaceC0550y
    public final void b(InterfaceC0551z interfaceC0551z) {
        if (this.f7419q != null) {
            return;
        }
        InterfaceC0550y interfaceC0550y = this.f7414l;
        interfaceC0550y.getClass();
        interfaceC0550y.b(this);
    }

    @Override // O1.InterfaceC0550y
    public final void c(b0 b0Var) {
        InterfaceC0550y interfaceC0550y = this.f7414l;
        interfaceC0550y.getClass();
        interfaceC0550y.c(this);
    }

    @Override // O1.InterfaceC0551z
    public final long d(Q1.s[] sVarArr, boolean[] zArr, a0[] a0VarArr, boolean[] zArr2, long j7) {
        long j8;
        this.f7415m = new C0528b[a0VarArr.length];
        a0[] a0VarArr2 = new a0[a0VarArr.length];
        for (int i7 = 0; i7 < a0VarArr.length; i7++) {
            C0528b[] c0528bArr = this.f7415m;
            C0528b c0528b = (C0528b) a0VarArr[i7];
            c0528bArr[i7] = c0528b;
            a0VarArr2[i7] = c0528b != null ? c0528b.f7410k : null;
        }
        long jD = this.f7413k.d(sVarArr, zArr, a0VarArr2, zArr2, j7);
        long j9 = this.f7418p;
        long jMax = Math.max(jD, j7);
        if (j9 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j9);
        }
        if (h()) {
            if (jD >= j7) {
                if (jD != 0) {
                    for (Q1.s sVar : sVarArr) {
                        if (sVar != null) {
                            C2393o c2393oH = sVar.h();
                            if (!y1.D.a(c2393oH.f18112n, c2393oH.f18109k)) {
                            }
                        }
                    }
                }
                j8 = -9223372036854775807L;
            }
            j8 = jMax;
            break;
        } else {
            j8 = -9223372036854775807L;
        }
        this.f7416n = j8;
        for (int i8 = 0; i8 < a0VarArr.length; i8++) {
            a0 a0Var = a0VarArr2[i8];
            if (a0Var == null) {
                this.f7415m[i8] = null;
            } else {
                C0528b[] c0528bArr2 = this.f7415m;
                C0528b c0528b2 = c0528bArr2[i8];
                if (c0528b2 == null || c0528b2.f7410k != a0Var) {
                    c0528bArr2[i8] = new C0528b(this, a0Var);
                }
            }
            a0VarArr[i8] = this.f7415m[i8];
        }
        return jMax;
    }

    @Override // O1.b0
    public final boolean e(H1.O o7) {
        return this.f7413k.e(o7);
    }

    @Override // O1.b0
    public final long f() {
        long jF = this.f7413k.f();
        if (jF != Long.MIN_VALUE) {
            long j7 = this.f7418p;
            if (j7 == Long.MIN_VALUE || jF < j7) {
                return jF;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // O1.InterfaceC0551z
    public final long g() {
        if (h()) {
            long j7 = this.f7416n;
            this.f7416n = -9223372036854775807L;
            long jG = g();
            return jG != -9223372036854775807L ? jG : j7;
        }
        long jG2 = this.f7413k.g();
        if (jG2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j8 = this.f7417o;
        long j9 = this.f7418p;
        long jMax = Math.max(jG2, j8);
        return j9 != Long.MIN_VALUE ? Math.min(jMax, j9) : jMax;
    }

    public final boolean h() {
        return this.f7416n != -9223372036854775807L;
    }

    @Override // O1.InterfaceC0551z
    public final void i(InterfaceC0550y interfaceC0550y, long j7) {
        this.f7414l = interfaceC0550y;
        this.f7413k.i(this, j7);
    }

    @Override // O1.InterfaceC0551z
    public final g0 j() {
        return this.f7413k.j();
    }

    @Override // O1.b0
    public final long n() {
        long jN = this.f7413k.n();
        if (jN != Long.MIN_VALUE) {
            long j7 = this.f7418p;
            if (j7 == Long.MIN_VALUE || jN < j7) {
                return jN;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // O1.InterfaceC0551z
    public final void o() throws C0532f {
        C0532f c0532f = this.f7419q;
        if (c0532f != null) {
            throw c0532f;
        }
        this.f7413k.o();
    }

    @Override // O1.InterfaceC0551z
    public final long q(long j7) {
        this.f7416n = -9223372036854775807L;
        for (C0528b c0528b : this.f7415m) {
            if (c0528b != null) {
                c0528b.f7411l = false;
            }
        }
        long jQ = this.f7413k.q(j7);
        long j8 = this.f7417o;
        long j9 = this.f7418p;
        long jMax = Math.max(jQ, j8);
        return j9 != Long.MIN_VALUE ? Math.min(jMax, j9) : jMax;
    }

    @Override // O1.InterfaceC0551z
    public final void r(long j7) {
        this.f7413k.r(j7);
    }

    @Override // O1.InterfaceC0551z
    public final long s(long j7, m0 m0Var) {
        long j8 = this.f7417o;
        if (j7 == j8) {
            return j8;
        }
        long jI = B1.K.i(m0Var.a, 0L, j7 - j8);
        long j9 = this.f7418p;
        long jI2 = B1.K.i(m0Var.f3542b, 0L, j9 == Long.MIN_VALUE ? Long.MAX_VALUE : j9 - j7);
        if (jI != m0Var.a || jI2 != m0Var.f3542b) {
            m0Var = new m0(jI, jI2);
        }
        return this.f7413k.s(j7, m0Var);
    }

    @Override // O1.b0
    public final void t(long j7) {
        this.f7413k.t(j7);
    }
}
