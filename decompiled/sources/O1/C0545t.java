package O1;

import H1.m0;

/* renamed from: O1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0545t implements InterfaceC0551z, InterfaceC0550y {

    /* renamed from: k, reason: collision with root package name */
    public final B f7487k;

    /* renamed from: l, reason: collision with root package name */
    public final long f7488l;

    /* renamed from: m, reason: collision with root package name */
    public final R1.f f7489m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC0527a f7490n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0551z f7491o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC0550y f7492p;

    /* renamed from: q, reason: collision with root package name */
    public long f7493q = -9223372036854775807L;

    public C0545t(B b4, R1.f fVar, long j7) {
        this.f7487k = b4;
        this.f7489m = fVar;
        this.f7488l = j7;
    }

    @Override // O1.b0
    public final boolean a() {
        InterfaceC0551z interfaceC0551z = this.f7491o;
        return interfaceC0551z != null && interfaceC0551z.a();
    }

    @Override // O1.InterfaceC0550y
    public final void b(InterfaceC0551z interfaceC0551z) {
        InterfaceC0550y interfaceC0550y = this.f7492p;
        int i7 = B1.K.a;
        interfaceC0550y.b(this);
    }

    @Override // O1.InterfaceC0550y
    public final void c(b0 b0Var) {
        InterfaceC0550y interfaceC0550y = this.f7492p;
        int i7 = B1.K.a;
        interfaceC0550y.c(this);
    }

    @Override // O1.InterfaceC0551z
    public final long d(Q1.s[] sVarArr, boolean[] zArr, a0[] a0VarArr, boolean[] zArr2, long j7) {
        long j8 = this.f7493q;
        long j9 = (j8 == -9223372036854775807L || j7 != this.f7488l) ? j7 : j8;
        this.f7493q = -9223372036854775807L;
        InterfaceC0551z interfaceC0551z = this.f7491o;
        int i7 = B1.K.a;
        return interfaceC0551z.d(sVarArr, zArr, a0VarArr, zArr2, j9);
    }

    @Override // O1.b0
    public final boolean e(H1.O o7) {
        InterfaceC0551z interfaceC0551z = this.f7491o;
        return interfaceC0551z != null && interfaceC0551z.e(o7);
    }

    @Override // O1.b0
    public final long f() {
        InterfaceC0551z interfaceC0551z = this.f7491o;
        int i7 = B1.K.a;
        return interfaceC0551z.f();
    }

    @Override // O1.InterfaceC0551z
    public final long g() {
        InterfaceC0551z interfaceC0551z = this.f7491o;
        int i7 = B1.K.a;
        return interfaceC0551z.g();
    }

    public final void h(B b4) {
        long j7 = this.f7493q;
        if (j7 == -9223372036854775807L) {
            j7 = this.f7488l;
        }
        AbstractC0527a abstractC0527a = this.f7490n;
        abstractC0527a.getClass();
        InterfaceC0551z interfaceC0551zA = abstractC0527a.a(b4, this.f7489m, j7);
        this.f7491o = interfaceC0551zA;
        if (this.f7492p != null) {
            interfaceC0551zA.i(this, j7);
        }
    }

    @Override // O1.InterfaceC0551z
    public final void i(InterfaceC0550y interfaceC0550y, long j7) {
        this.f7492p = interfaceC0550y;
        InterfaceC0551z interfaceC0551z = this.f7491o;
        if (interfaceC0551z != null) {
            long j8 = this.f7493q;
            if (j8 == -9223372036854775807L) {
                j8 = this.f7488l;
            }
            interfaceC0551z.i(this, j8);
        }
    }

    @Override // O1.InterfaceC0551z
    public final g0 j() {
        InterfaceC0551z interfaceC0551z = this.f7491o;
        int i7 = B1.K.a;
        return interfaceC0551z.j();
    }

    @Override // O1.b0
    public final long n() {
        InterfaceC0551z interfaceC0551z = this.f7491o;
        int i7 = B1.K.a;
        return interfaceC0551z.n();
    }

    @Override // O1.InterfaceC0551z
    public final void o() {
        InterfaceC0551z interfaceC0551z = this.f7491o;
        if (interfaceC0551z != null) {
            interfaceC0551z.o();
            return;
        }
        AbstractC0527a abstractC0527a = this.f7490n;
        if (abstractC0527a != null) {
            abstractC0527a.i();
        }
    }

    @Override // O1.InterfaceC0551z
    public final long q(long j7) {
        InterfaceC0551z interfaceC0551z = this.f7491o;
        int i7 = B1.K.a;
        return interfaceC0551z.q(j7);
    }

    @Override // O1.InterfaceC0551z
    public final void r(long j7) {
        InterfaceC0551z interfaceC0551z = this.f7491o;
        int i7 = B1.K.a;
        interfaceC0551z.r(j7);
    }

    @Override // O1.InterfaceC0551z
    public final long s(long j7, m0 m0Var) {
        InterfaceC0551z interfaceC0551z = this.f7491o;
        int i7 = B1.K.a;
        return interfaceC0551z.s(j7, m0Var);
    }

    @Override // O1.b0
    public final void t(long j7) {
        InterfaceC0551z interfaceC0551z = this.f7491o;
        int i7 = B1.K.a;
        interfaceC0551z.t(j7);
    }
}
