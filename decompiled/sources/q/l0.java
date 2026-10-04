package q;

import l4.InterfaceC1443v;

/* loaded from: classes.dex */
public final class l0 extends a0.p implements y0.l0 {

    /* renamed from: x, reason: collision with root package name */
    public o0 f14576x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14577y;

    @Override // y0.l0
    public final void y(F0.i iVar) {
        F0.s.f(iVar);
        F0.g gVar = new F0.g(new k0(this, 0), new k0(this, 1));
        if (this.f14577y) {
            F0.t tVar = F0.q.f2143p;
            InterfaceC1443v interfaceC1443v = F0.s.a[11];
            tVar.a(iVar, gVar);
        } else {
            F0.t tVar2 = F0.q.f2142o;
            InterfaceC1443v interfaceC1443v2 = F0.s.a[10];
            tVar2.a(iVar, gVar);
        }
    }
}
