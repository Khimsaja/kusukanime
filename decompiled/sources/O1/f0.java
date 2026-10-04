package O1;

import H1.m0;

/* loaded from: classes.dex */
public final class f0 implements InterfaceC0551z, InterfaceC0550y {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0551z f7437k;

    /* renamed from: l, reason: collision with root package name */
    public final long f7438l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC0550y f7439m;

    public f0(InterfaceC0551z interfaceC0551z, long j7) {
        this.f7437k = interfaceC0551z;
        this.f7438l = j7;
    }

    @Override // O1.b0
    public final boolean a() {
        return this.f7437k.a();
    }

    @Override // O1.InterfaceC0550y
    public final void b(InterfaceC0551z interfaceC0551z) {
        InterfaceC0550y interfaceC0550y = this.f7439m;
        interfaceC0550y.getClass();
        interfaceC0550y.b(this);
    }

    @Override // O1.InterfaceC0550y
    public final void c(b0 b0Var) {
        InterfaceC0550y interfaceC0550y = this.f7439m;
        interfaceC0550y.getClass();
        interfaceC0550y.c(this);
    }

    @Override // O1.InterfaceC0551z
    public final long d(Q1.s[] sVarArr, boolean[] zArr, a0[] a0VarArr, boolean[] zArr2, long j7) {
        a0[] a0VarArr2 = new a0[a0VarArr.length];
        int i7 = 0;
        while (true) {
            a0 a0Var = null;
            if (i7 >= a0VarArr.length) {
                break;
            }
            e0 e0Var = (e0) a0VarArr[i7];
            if (e0Var != null) {
                a0Var = e0Var.f7435k;
            }
            a0VarArr2[i7] = a0Var;
            i7++;
        }
        long j8 = this.f7438l;
        long jD = this.f7437k.d(sVarArr, zArr, a0VarArr2, zArr2, j7 - j8);
        for (int i8 = 0; i8 < a0VarArr.length; i8++) {
            a0 a0Var2 = a0VarArr2[i8];
            if (a0Var2 == null) {
                a0VarArr[i8] = null;
            } else {
                a0 a0Var3 = a0VarArr[i8];
                if (a0Var3 == null || ((e0) a0Var3).f7435k != a0Var2) {
                    a0VarArr[i8] = new e0(a0Var2, j8);
                }
            }
        }
        return jD + j8;
    }

    @Override // O1.b0
    public final boolean e(H1.O o7) {
        H1.N n7 = new H1.N();
        n7.f3339b = o7.f3341b;
        n7.f3340c = o7.f3342c;
        n7.a = o7.a - this.f7438l;
        return this.f7437k.e(new H1.O(n7));
    }

    @Override // O1.b0
    public final long f() {
        long jF = this.f7437k.f();
        if (jF == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jF + this.f7438l;
    }

    @Override // O1.InterfaceC0551z
    public final long g() {
        long jG = this.f7437k.g();
        if (jG == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jG + this.f7438l;
    }

    @Override // O1.InterfaceC0551z
    public final void i(InterfaceC0550y interfaceC0550y, long j7) {
        this.f7439m = interfaceC0550y;
        this.f7437k.i(this, j7 - this.f7438l);
    }

    @Override // O1.InterfaceC0551z
    public final g0 j() {
        return this.f7437k.j();
    }

    @Override // O1.b0
    public final long n() {
        long jN = this.f7437k.n();
        if (jN == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jN + this.f7438l;
    }

    @Override // O1.InterfaceC0551z
    public final void o() {
        this.f7437k.o();
    }

    @Override // O1.InterfaceC0551z
    public final long q(long j7) {
        long j8 = this.f7438l;
        return this.f7437k.q(j7 - j8) + j8;
    }

    @Override // O1.InterfaceC0551z
    public final void r(long j7) {
        this.f7437k.r(j7 - this.f7438l);
    }

    @Override // O1.InterfaceC0551z
    public final long s(long j7, m0 m0Var) {
        long j8 = this.f7438l;
        return this.f7437k.s(j7 - j8, m0Var) + j8;
    }

    @Override // O1.b0
    public final void t(long j7) {
        this.f7437k.t(j7 - this.f7438l);
    }
}
