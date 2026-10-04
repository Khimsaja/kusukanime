package O1;

import B1.AbstractC0015b;
import C2.C0034g;
import K2.RunnableC0306j;
import android.os.Looper;
import y1.C2393o;
import y1.C2398u;
import y1.C2401x;

/* loaded from: classes.dex */
public final class V extends AbstractC0527a {

    /* renamed from: h, reason: collision with root package name */
    public final E1.g f7354h;

    /* renamed from: i, reason: collision with root package name */
    public final C2.G f7355i;

    /* renamed from: j, reason: collision with root package name */
    public final K1.i f7356j;

    /* renamed from: k, reason: collision with root package name */
    public final R1.i f7357k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7358l;

    /* renamed from: m, reason: collision with root package name */
    public final C2393o f7359m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7360n = true;

    /* renamed from: o, reason: collision with root package name */
    public long f7361o = -9223372036854775807L;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7362p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7363q;

    /* renamed from: r, reason: collision with root package name */
    public E1.D f7364r;

    /* renamed from: s, reason: collision with root package name */
    public C2401x f7365s;

    public V(C2401x c2401x, E1.g gVar, C2.G g4, K1.i iVar, R1.i iVar2, int i7, C2393o c2393o) {
        this.f7365s = c2401x;
        this.f7354h = gVar;
        this.f7355i = g4;
        this.f7356j = iVar;
        this.f7357k = iVar2;
        this.f7358l = i7;
        this.f7359m = c2393o;
    }

    @Override // O1.AbstractC0527a
    public final InterfaceC0551z a(B b4, R1.f fVar, long j7) {
        E1.h hVarK = this.f7354h.k();
        E1.D d4 = this.f7364r;
        if (d4 != null) {
            hVarK.j(d4);
        }
        C2398u c2398u = g().f18138b;
        c2398u.getClass();
        AbstractC0015b.i(this.f7409g);
        B2.l lVar = new B2.l(16, (V1.q) this.f7355i.f664l);
        K1.e eVar = new K1.e(this.f7406d.f4460c, 0, b4);
        K1.e eVar2 = new K1.e(this.f7405c.f4460c, 0, b4);
        long jF = B1.K.F(c2398u.f18137e);
        return new S(c2398u.a, hVarK, lVar, this.f7356j, eVar, this.f7357k, eVar2, this, fVar, this.f7358l, this.f7359m, jF, null);
    }

    @Override // O1.AbstractC0527a
    public final synchronized C2401x g() {
        return this.f7365s;
    }

    @Override // O1.AbstractC0527a
    public final void k(E1.D d4) {
        this.f7364r = d4;
        Looper.myLooper().getClass();
        AbstractC0015b.i(this.f7409g);
        K1.i iVar = this.f7356j;
        iVar.getClass();
        iVar.getClass();
        s();
    }

    @Override // O1.AbstractC0527a
    public final void m(InterfaceC0551z interfaceC0551z) {
        S s7 = (S) interfaceC0551z;
        if (s7.f7317G) {
            for (Z z7 : s7.f7314D) {
                z7.f();
                C0034g c0034g = z7.f7385h;
                if (c0034g != null) {
                    c0034g.s(z7.f7382e);
                    z7.f7385h = null;
                    z7.f7384g = null;
                }
            }
        }
        R1.m mVar = s7.f7345v;
        R1.k kVar = mVar.f8076b;
        if (kVar != null) {
            kVar.a(true);
        }
        RunnableC0306j runnableC0306j = new RunnableC0306j(3, s7);
        S1.a aVar = mVar.a;
        aVar.execute(runnableC0306j);
        I1.e eVar = aVar.f8726l;
        aVar.f8725k.shutdown();
        s7.f7311A.removeCallbacksAndMessages(null);
        s7.f7312B = null;
        s7.f7333Y = true;
    }

    @Override // O1.AbstractC0527a
    public final void o() {
        this.f7356j.getClass();
    }

    @Override // O1.AbstractC0527a
    public final synchronized void r(C2401x c2401x) {
        this.f7365s = c2401x;
    }

    public final void s() {
        y1.P d0Var = new d0(this.f7361o, this.f7362p, this.f7363q, g());
        if (this.f7360n) {
            d0Var = new T(d0Var);
        }
        l(d0Var);
    }

    public final void t(long j7, V1.A a, boolean z7) {
        if (j7 == -9223372036854775807L) {
            j7 = this.f7361o;
        }
        boolean zG = a.g();
        if (!this.f7360n && this.f7361o == j7 && this.f7362p == zG && this.f7363q == z7) {
            return;
        }
        this.f7361o = j7;
        this.f7362p = zG;
        this.f7363q = z7;
        this.f7360n = false;
        s();
    }

    @Override // O1.AbstractC0527a
    public final void i() {
    }
}
