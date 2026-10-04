package o;

import D.C0056i;
import D.L0;
import e4.InterfaceC0821a;
import l4.AbstractC1420H;
import p.o0;
import p.p0;
import p.u0;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import w0.S;
import y0.InterfaceC2375w;

/* renamed from: o.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1592D extends a0.p implements InterfaceC2375w {

    /* renamed from: A, reason: collision with root package name */
    public C1593E f13470A;

    /* renamed from: B, reason: collision with root package name */
    public C1594F f13471B;

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC0821a f13472C;

    /* renamed from: D, reason: collision with root package name */
    public C1625w f13473D;

    /* renamed from: E, reason: collision with root package name */
    public long f13474E = AbstractC1621s.a;

    /* renamed from: F, reason: collision with root package name */
    public a0.d f13475F;

    /* renamed from: G, reason: collision with root package name */
    public final C1591C f13476G;

    /* renamed from: x, reason: collision with root package name */
    public u0 f13477x;

    /* renamed from: y, reason: collision with root package name */
    public p0 f13478y;

    /* renamed from: z, reason: collision with root package name */
    public p0 f13479z;

    public C1592D(u0 u0Var, p0 p0Var, p0 p0Var2, C1593E c1593e, C1594F c1594f, InterfaceC0821a interfaceC0821a, C1625w c1625w) {
        this.f13477x = u0Var;
        this.f13478y = p0Var;
        this.f13479z = p0Var2;
        this.f13470A = c1593e;
        this.f13471B = c1594f;
        this.f13472C = interfaceC0821a;
        this.f13473D = c1625w;
        q0.c.b(0, 0, 15);
        this.f13476G = new C1591C(this, 0);
        new C1591C(this, 1);
    }

    public final a0.d G0() {
        if (this.f13477x.f().b(EnumC1624v.f13538k, EnumC1624v.f13539l)) {
            C1602N c1602n = this.f13471B.a;
            return null;
        }
        C1602N c1602n2 = this.f13471B.a;
        return null;
    }

    @Override // y0.InterfaceC2375w
    public final int b(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return interfaceC2172G.W(i7);
    }

    @Override // y0.InterfaceC2375w
    public final int c(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return interfaceC2172G.c(i7);
    }

    @Override // y0.InterfaceC2375w
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        Object obj = null;
        if (this.f13477x.a.v0() == this.f13477x.f14136d.getValue()) {
            this.f13475F = null;
        } else if (this.f13475F == null) {
            a0.d dVarG0 = G0();
            if (dVarG0 == null) {
                dVarG0 = a0.b.f10381k;
            }
            this.f13475F = dVarG0;
        }
        boolean zS = interfaceC2175J.s();
        P3.z zVar = P3.z.f7780k;
        if (zS) {
            S sB = interfaceC2172G.b(j7);
            long jA = AbstractC1420H.a(sB.f16840k, sB.f16841l);
            this.f13474E = jA;
            return interfaceC2175J.T((int) (jA >> 32), (int) (4294967295L & jA), zVar, new L0(sB, 7));
        }
        if (!((Boolean) this.f13472C.invoke()).booleanValue()) {
            S sB2 = interfaceC2172G.b(j7);
            return interfaceC2175J.T(sB2.f16840k, sB2.f16841l, zVar, new L0(sB2, 8));
        }
        C1625w c1625w = this.f13473D;
        p0 p0Var = c1625w.a;
        C1593E c1593e = c1625w.f13544d;
        C1594F c1594f = c1625w.f13545e;
        o0 o0VarA = p0Var != null ? p0Var.a(new C1626x(c1593e, c1594f, 0), new C1626x(c1593e, c1594f, 1)) : null;
        p0 p0Var2 = c1625w.f13542b;
        o0 o0VarA2 = p0Var2 != null ? p0Var2.a(new C1626x(c1593e, c1594f, 2), new C1626x(c1593e, c1594f, 3)) : null;
        if (c1625w.f13543c.a.v0() == EnumC1624v.f13538k) {
            C1602N c1602n = c1594f.a;
        } else {
            C1602N c1602n2 = c1594f.a;
        }
        p0 p0Var3 = c1625w.f13546f;
        C0056i c0056i = new C0056i(o0VarA, o0VarA2, p0Var3 != null ? p0Var3.a(C1618p.f13530q, new C0056i(obj, c1593e, c1594f, 14)) : null, 13);
        S sB3 = interfaceC2172G.b(j7);
        long jA2 = AbstractC1420H.a(sB3.f16840k, sB3.f16841l);
        long j8 = !T0.j.a(this.f13474E, AbstractC1621s.a) ? this.f13474E : jA2;
        p0 p0Var4 = this.f13478y;
        o0 o0VarA3 = p0Var4 != null ? p0Var4.a(this.f13476G, new C1590B(this, j8, 0)) : null;
        if (o0VarA3 != null) {
            jA2 = ((T0.j) o0VarA3.getValue()).a;
        }
        long jS = q0.c.s(j7, jA2);
        p0 p0Var5 = this.f13479z;
        long j9 = p0Var5 != null ? ((T0.h) p0Var5.a(C1618p.f13531r, new C1590B(this, j8, 1)).getValue()).a : 0L;
        a0.d dVar = this.f13475F;
        return interfaceC2175J.T((int) (jS >> 32), (int) (jS & 4294967295L), zVar, new C1589A(sB3, T0.h.c(dVar != null ? dVar.a(j8, jS, T0.k.f8844k) : 0L, 0L), j9, c0056i, 0));
    }

    @Override // y0.InterfaceC2375w
    public final int g(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return interfaceC2172G.b0(i7);
    }

    @Override // y0.InterfaceC2375w
    public final int i(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return interfaceC2172G.Y(i7);
    }

    @Override // a0.p
    public final void y0() {
        this.f13474E = AbstractC1621s.a;
    }
}
