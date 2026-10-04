package q;

import f0.C0866s;
import f0.EnumC0865r;
import f0.InterfaceC0850c;
import f0.InterfaceC0863p;
import l4.InterfaceC1443v;
import y.C2302B;
import y0.AbstractC2359f;
import y0.AbstractC2367n;
import y0.InterfaceC2369p;

/* loaded from: classes.dex */
public final class H extends AbstractC2367n implements InterfaceC0850c, y0.l0, InterfaceC2369p, InterfaceC0863p {

    /* renamed from: A, reason: collision with root package name */
    public final C1818F f14482A;

    /* renamed from: B, reason: collision with root package name */
    public final I f14483B;

    /* renamed from: C, reason: collision with root package name */
    public final J f14484C;

    /* renamed from: z, reason: collision with root package name */
    public EnumC0865r f14485z;

    public H(u.k kVar) {
        C1818F c1818f = new C1818F();
        c1818f.f14478x = kVar;
        G0(c1818f);
        this.f14482A = c1818f;
        I i7 = new I();
        G0(i7);
        this.f14483B = i7;
        J j7 = new J();
        G0(j7);
        this.f14484C = j7;
        G0(new C0866s());
    }

    @Override // f0.InterfaceC0850c
    public final void B(EnumC0865r enumC0865r) {
        K kG0;
        if (kotlin.jvm.internal.l.a(this.f14485z, enumC0865r)) {
            return;
        }
        boolean zA = enumC0865r.a();
        C2302B c2302b = null;
        if (zA) {
            H5.D.x(u0(), null, new G(this, null), 3);
        }
        if (this.f10414w) {
            AbstractC2359f.p(this);
        }
        C1818F c1818f = this.f14482A;
        u.k kVar = c1818f.f14478x;
        if (kVar != null) {
            if (zA) {
                u.d dVar = c1818f.f14479y;
                if (dVar != null) {
                    c1818f.G0(kVar, new u.e(dVar));
                    c1818f.f14479y = null;
                }
                u.d dVar2 = new u.d();
                c1818f.G0(kVar, dVar2);
                c1818f.f14479y = dVar2;
            } else {
                u.d dVar3 = c1818f.f14479y;
                if (dVar3 != null) {
                    c1818f.G0(kVar, new u.e(dVar3));
                    c1818f.f14479y = null;
                }
            }
        }
        J j7 = this.f14484C;
        if (zA != j7.f14489x) {
            if (zA) {
                y0.Y y7 = j7.f14490y;
                if (y7 != null && y7.P0().f10414w && (kG0 = j7.G0()) != null) {
                    kG0.G0(j7.f14490y);
                }
            } else {
                K kG02 = j7.G0();
                if (kG02 != null) {
                    kG02.G0(null);
                }
            }
            j7.f14489x = zA;
        }
        I i7 = this.f14483B;
        if (zA) {
            i7.getClass();
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            AbstractC2359f.s(i7, new A.m(11, xVar, i7));
            C2302B c2302b2 = (C2302B) xVar.f12720k;
            if (c2302b2 != null) {
                c2302b2.a();
                c2302b = c2302b2;
            }
            i7.f14486x = c2302b;
        } else {
            C2302B c2302b3 = i7.f14486x;
            if (c2302b3 != null) {
                c2302b3.b();
            }
            i7.f14486x = null;
        }
        i7.f14487y = zA;
        this.f14485z = enumC0865r;
    }

    @Override // y0.InterfaceC2369p
    public final void E(y0.Y y7) {
        this.f14484C.E(y7);
    }

    public final void J0(u.k kVar) {
        u.d dVar;
        C1818F c1818f = this.f14482A;
        if (kotlin.jvm.internal.l.a(c1818f.f14478x, kVar)) {
            return;
        }
        u.k kVar2 = c1818f.f14478x;
        if (kVar2 != null && (dVar = c1818f.f14479y) != null) {
            kVar2.c(new u.e(dVar));
        }
        c1818f.f14479y = null;
        c1818f.f14478x = kVar;
    }

    @Override // a0.p
    public final boolean v0() {
        return false;
    }

    @Override // y0.l0
    public final void y(F0.i iVar) {
        EnumC0865r enumC0865r = this.f14485z;
        boolean z7 = false;
        if (enumC0865r != null && enumC0865r.a()) {
            z7 = true;
        }
        InterfaceC1443v[] interfaceC1443vArr = F0.s.a;
        F0.t tVar = F0.q.f2138k;
        InterfaceC1443v interfaceC1443v = F0.s.a[4];
        tVar.a(iVar, Boolean.valueOf(z7));
        iVar.j(F0.h.f2090u, new F0.a(null, new B.e(29, this)));
    }
}
