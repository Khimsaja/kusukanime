package H1;

import B1.AbstractC0015b;
import y1.C2392n;
import y1.C2393o;

/* renamed from: H1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0225f implements g0 {

    /* renamed from: A, reason: collision with root package name */
    public Q1.q f3455A;

    /* renamed from: l, reason: collision with root package name */
    public final int f3457l;

    /* renamed from: n, reason: collision with root package name */
    public k0 f3459n;

    /* renamed from: o, reason: collision with root package name */
    public int f3460o;

    /* renamed from: p, reason: collision with root package name */
    public I1.l f3461p;

    /* renamed from: q, reason: collision with root package name */
    public B1.D f3462q;

    /* renamed from: r, reason: collision with root package name */
    public int f3463r;

    /* renamed from: s, reason: collision with root package name */
    public O1.a0 f3464s;

    /* renamed from: t, reason: collision with root package name */
    public C2393o[] f3465t;

    /* renamed from: u, reason: collision with root package name */
    public long f3466u;

    /* renamed from: v, reason: collision with root package name */
    public long f3467v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3469x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3470y;

    /* renamed from: k, reason: collision with root package name */
    public final Object f3456k = new Object();

    /* renamed from: m, reason: collision with root package name */
    public final F.w f3458m = new F.w(18, false);

    /* renamed from: w, reason: collision with root package name */
    public long f3468w = Long.MIN_VALUE;

    /* renamed from: z, reason: collision with root package name */
    public y1.P f3471z = y1.P.a;

    public AbstractC0225f(int i7) {
        this.f3457l = i7;
    }

    public static int f(int i7, int i8, int i9, int i10) {
        return i7 | i8 | i9 | 128 | i10;
    }

    public static boolean m(int i7, boolean z7) {
        int i8 = i7 & 7;
        if (i8 != 4) {
            return z7 && i8 == 3;
        }
        return true;
    }

    public abstract int A(C2393o c2393o);

    public int B() {
        return 0;
    }

    public final C0234o g(Exception exc, C2393o c2393o, boolean z7, int i7) {
        int iA;
        if (c2393o == null || this.f3470y) {
            iA = 4;
        } else {
            this.f3470y = true;
            try {
                iA = A(c2393o) & 7;
            } catch (C0234o unused) {
            } finally {
                this.f3470y = false;
            }
        }
        return new C0234o(1, exc, i7, j(), this.f3460o, c2393o, c2393o == null ? 4 : iA, z7);
    }

    public P i() {
        return null;
    }

    public abstract String j();

    public final boolean k() {
        return this.f3468w == Long.MIN_VALUE;
    }

    public abstract boolean l();

    public abstract boolean n();

    public abstract void o();

    public abstract void q(long j7, boolean z7);

    public final int w(F.w wVar, G1.f fVar, int i7) {
        O1.a0 a0Var = this.f3464s;
        a0Var.getClass();
        int iD = a0Var.d(wVar, fVar, i7);
        if (iD == -4) {
            if (fVar.c(4)) {
                this.f3468w = Long.MIN_VALUE;
                return this.f3469x ? -4 : -3;
            }
            long j7 = fVar.f2611q + this.f3466u;
            fVar.f2611q = j7;
            this.f3468w = Math.max(this.f3468w, j7);
            return iD;
        }
        if (iD == -5) {
            C2393o c2393o = (C2393o) wVar.f2038m;
            c2393o.getClass();
            long j8 = c2393o.f18117s;
            if (j8 != Long.MAX_VALUE) {
                C2392n c2392nA = c2393o.a();
                c2392nA.f18079r = j8 + this.f3466u;
                wVar.f2038m = new C2393o(c2392nA);
            }
        }
        return iD;
    }

    public abstract void x(long j7, long j8);

    public final void y(C2393o[] c2393oArr, O1.a0 a0Var, long j7, long j8, O1.B b4) {
        AbstractC0015b.h(!this.f3469x);
        this.f3464s = a0Var;
        if (this.f3468w == Long.MIN_VALUE) {
            this.f3468w = j7;
        }
        this.f3465t = c2393oArr;
        this.f3466u = j8;
        v(c2393oArr, j7, j8, b4);
    }

    public void h() {
    }

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u() {
    }

    @Override // H1.g0
    public void c(int i7, Object obj) {
    }

    public void p(boolean z7, boolean z8) {
    }

    public void z(float f5, float f7) {
    }

    public void v(C2393o[] c2393oArr, long j7, long j8, O1.B b4) {
    }
}
