package I1;

import B1.AbstractC0015b;
import B1.D;
import B1.F;
import B1.K;
import B1.n;
import B1.q;
import C2.C0028a;
import H1.C;
import H1.C0234o;
import H1.C0238t;
import H1.G;
import O1.B;
import O1.C0544s;
import O1.C0549x;
import O1.H;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import io.ktor.client.utils.CIOKt;
import j3.c0;
import java.io.IOException;
import java.util.List;
import y1.A;
import y1.C2401x;
import y1.I;
import y1.J;
import y1.N;
import y1.O;
import y1.P;
import y1.V;
import y1.X;
import y1.b0;

/* loaded from: classes.dex */
public final class f implements J, H, K1.f {
    public final D a;

    /* renamed from: b, reason: collision with root package name */
    public final N f3953b;

    /* renamed from: c, reason: collision with root package name */
    public final O f3954c;

    /* renamed from: d, reason: collision with root package name */
    public final B0.b f3955d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f3956e;

    /* renamed from: f, reason: collision with root package name */
    public q f3957f;

    /* renamed from: g, reason: collision with root package name */
    public G f3958g;

    /* renamed from: h, reason: collision with root package name */
    public F f3959h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3960i;

    public f(D d4) {
        d4.getClass();
        this.a = d4;
        int i7 = K.a;
        Looper looperMyLooper = Looper.myLooper();
        this.f3957f = new q(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, d4, new C0028a(27));
        N n7 = new N();
        this.f3953b = n7;
        this.f3954c = new O();
        this.f3955d = new B0.b(n7);
        this.f3956e = new SparseArray();
    }

    @Override // y1.J
    public final void B(y1.F f5) {
        B b4;
        a aVarH = (!(f5 instanceof C0234o) || (b4 = ((C0234o) f5).f3553r) == null) ? H() : I(b4);
        M(aVarH, 10, new C2.G(aVarH, (Object) f5, 8));
    }

    @Override // O1.H
    public final void C(int i7, B b4, C0549x c0549x) {
        a aVarK = K(i7, b4);
        M(aVarK, 1004, new c(aVarK, c0549x));
    }

    @Override // y1.J
    public final void D(int i7, int i8) {
        M(L(), 24, new b(2));
    }

    @Override // y1.J
    public final void E(b0 b0Var) {
        a aVarL = L();
        M(aVarL, 25, new C(aVarL, b0Var));
    }

    @Override // y1.J
    public final void F(y1.G g4) {
        M(H(), 12, new C0028a(15));
    }

    @Override // y1.J
    public final void G(boolean z7) {
        M(H(), 7, new C0028a(18));
    }

    public final a H() {
        return I((B) this.f3955d.f278n);
    }

    public final a I(B b4) {
        this.f3958g.getClass();
        P p7 = b4 == null ? null : (P) ((c0) this.f3955d.f277m).get(b4);
        if (b4 != null && p7 != null) {
            return J(p7, p7.g(b4.a, this.f3953b).f17948c, b4);
        }
        int iR0 = this.f3958g.R0();
        P pU0 = this.f3958g.U0();
        if (iR0 >= pU0.o()) {
            pU0 = P.a;
        }
        return J(pU0, iR0, null);
    }

    public final a J(P p7, int i7, B b4) {
        B b7 = p7.p() ? null : b4;
        this.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z7 = p7.equals(this.f3958g.U0()) && i7 == this.f3958g.R0();
        long jP = 0;
        if (b7 == null || !b7.b()) {
            if (z7) {
                G g4 = this.f3958g;
                g4.u1();
                jP = g4.O0(g4.f3264q0);
            } else if (!p7.p()) {
                jP = K.P(p7.m(i7, this.f3954c, 0L).f17964k);
            }
        } else if (z7 && this.f3958g.P0() == b7.f7252b && this.f3958g.Q0() == b7.f7253c) {
            jP = this.f3958g.S0();
        }
        B b8 = (B) this.f3955d.f278n;
        P pU0 = this.f3958g.U0();
        int iR0 = this.f3958g.R0();
        long jS0 = this.f3958g.S0();
        G g7 = this.f3958g;
        g7.u1();
        return new a(jElapsedRealtime, p7, i7, b7, jP, pU0, iR0, b8, jS0, K.P(g7.f3264q0.f3442r));
    }

    public final a K(int i7, B b4) {
        this.f3958g.getClass();
        if (b4 != null) {
            return ((P) ((c0) this.f3955d.f277m).get(b4)) != null ? I(b4) : J(P.a, i7, b4);
        }
        P pU0 = this.f3958g.U0();
        if (i7 >= pU0.o()) {
            pU0 = P.a;
        }
        return J(pU0, i7, null);
    }

    public final a L() {
        return I((B) this.f3955d.f280p);
    }

    public final void M(a aVar, int i7, n nVar) {
        this.f3956e.put(i7, aVar);
        this.f3957f.e(i7, nVar);
    }

    public final void N(G g4, Looper looper) {
        AbstractC0015b.h(this.f3958g == null || ((j3.G) this.f3955d.f276l).isEmpty());
        g4.getClass();
        this.f3958g = g4;
        this.f3959h = this.a.a(looper, null);
        q qVar = this.f3957f;
        this.f3957f = new q(qVar.f351d, looper, qVar.a, new c(this, g4), qVar.f356i);
    }

    @Override // y1.J
    public final void a(int i7) {
        M(H(), 6, new C0028a(20));
    }

    @Override // y1.J
    public final void b(int i7, y1.K k7, y1.K k8) {
        if (i7 == 1) {
            this.f3960i = false;
        }
        G g4 = this.f3958g;
        g4.getClass();
        B0.b bVar = this.f3955d;
        bVar.f278n = B0.b.j(g4, (j3.G) bVar.f276l, (B) bVar.f279o, (N) bVar.f275k);
        a aVarH = H();
        M(aVarH, 11, new C0238t(aVarH, i7, k7, k8));
    }

    @Override // O1.H
    public final void c(int i7, B b4, C0544s c0544s, C0549x c0549x, IOException iOException, boolean z7) {
        a aVarK = K(i7, b4);
        M(aVarK, 1003, new b(aVarK, c0544s, c0549x, iOException, z7));
    }

    @Override // y1.J
    public final void d(int i7) {
        G g4 = this.f3958g;
        g4.getClass();
        B0.b bVar = this.f3955d;
        bVar.f278n = B0.b.j(g4, (j3.G) bVar.f276l, (B) bVar.f279o, (N) bVar.f275k);
        bVar.z(g4.U0());
        M(H(), 0, new e(1));
    }

    @Override // y1.J
    public final void e(y1.F f5) {
        B b4;
        M((!(f5 instanceof C0234o) || (b4 = ((C0234o) f5).f3553r) == null) ? H() : I(b4), 10, new C0028a(22));
    }

    @Override // y1.J
    public final void f(A1.c cVar) {
        M(H(), 27, new b(3));
    }

    @Override // y1.J
    public final void g(int i7) {
        M(H(), 8, new b(27));
    }

    @Override // y1.J
    public final void h(V v5) {
        M(H(), 19, new b(29));
    }

    @Override // O1.H
    public final void i(int i7, B b4, C0544s c0544s, C0549x c0549x, int i8) {
        M(K(i7, b4), CIOKt.DEFAULT_HTTP_POOL_SIZE, new b(4));
    }

    @Override // y1.J
    public final void j(C2401x c2401x, int i7) {
        M(H(), 1, new e(2));
    }

    @Override // y1.J
    public final void k(boolean z7) {
        M(H(), 3, new b(21));
    }

    @Override // y1.J
    public final void m(boolean z7) {
        M(L(), 23, new b(25));
    }

    @Override // y1.J
    public final void n(List list) {
        M(H(), 27, new C0028a(25));
    }

    @Override // y1.J
    public final void o(X x7) {
        M(H(), 2, new C0028a(26));
    }

    @Override // y1.J
    public final void p(int i7, boolean z7) {
        M(H(), -1, new C0028a(16));
    }

    @Override // y1.J
    public final void q(int i7, boolean z7) {
        M(H(), 5, new C0028a(23));
    }

    @Override // y1.J
    public final void r(y1.H h7) {
        M(H(), 13, new b(7));
    }

    @Override // y1.J
    public final void s(float f5) {
        M(L(), 22, new b(22));
    }

    @Override // y1.J
    public final void t(y1.C c2) {
        M(H(), 28, new C0028a(17));
    }

    @Override // y1.J
    public final void u(int i7) {
        M(L(), 21, new b(17));
    }

    @Override // y1.J
    public final void v(A a) {
        M(H(), 14, new b(13));
    }

    @Override // y1.J
    public final void w(int i7) {
        M(H(), 4, new C0028a(28));
    }

    @Override // O1.H
    public final void x(int i7, B b4, C0544s c0544s, C0549x c0549x) {
        M(K(i7, b4), 1002, new b(12));
    }

    @Override // y1.J
    public final void y(boolean z7) {
        M(H(), 9, new b(28));
    }

    @Override // O1.H
    public final void z(int i7, B b4, C0544s c0544s, C0549x c0549x) {
        M(K(i7, b4), 1001, new b(15));
    }

    @Override // y1.J
    public final void l() {
    }

    @Override // y1.J
    public final void A(I i7) {
    }
}
